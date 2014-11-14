package edu.osumc.bmi.ready.domain



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class NoteController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def springSecurityService

    private def getDs() {
        springSecurityService.currentUser.datasource
    }

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)

        respond Note."${ds}".list(params), model:[noteInstanceCount: Note."${ds}".count()]
    }

    def show() {
        Note noteInstance = Note."${ds}".get(params.id)
        if (noteInstance == null) {
            notFound()
            return
        }
        respond noteInstance
    }

    def create() {
        respond new Note(params)
    }

    @Transactional
    def save(Note noteInstance) {
        if (noteInstance == null) {
            notFound()
            return
        }

        if (noteInstance.hasErrors()) {
            respond noteInstance.errors, view:'create'
            return
        }

        noteInstance."${ds}".save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'note.label', default: 'Note'), noteInstance.id])
                redirect noteInstance
            }
            '*' { respond noteInstance, [status: CREATED] }
        }
    }

    def edit() {
        Note noteInstance = Note."${ds}".get(params.id)
        if (noteInstance == null) {
            notFound()
            return
        }
        respond noteInstance
    }

    @Transactional
    def update() {
        Note noteInstance = Note."${ds}".get(params.id)
        noteInstance.properties = params
        if (noteInstance == null) {
            notFound()
            return
        }

        if (noteInstance.hasErrors()) {
            respond noteInstance.errors, view:'edit'
            return
        }

        noteInstance."${ds}".save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Note.label', default: 'Note'), noteInstance.id])
                redirect noteInstance
            }
            '*'{ respond noteInstance, [status: OK] }
        }
    }

    @Transactional
    def delete() {
        Note noteInstance = Note."${ds}".get(params.id)
        if (noteInstance == null) {
            notFound()
            return
        }

        noteInstance."${ds}".delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Note.label', default: 'Note'), noteInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'note.label', default: 'Note'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
