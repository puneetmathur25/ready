import edu.osumc.bmi.ready.domain.Note
import edu.osumc.bmi.ready.security.Role
import edu.osumc.bmi.ready.security.User
import edu.osumc.bmi.ready.security.UserRole

class BootStrap {

    def init = { servletContext ->
        environments {
            production {}
            development {
                createUsers()
                createData()
            }
        }
    }
    def destroy = {
    }

    private void createUsers() {
        def userRole = Role.findByAuthority('ROLE_USER') ?: new Role(
                authority: 'ROLE_USER'
        ).save(failOnError: true, flush: true)

        def client1 = User.findByUsername('client1') ?: new User(
                username: 'client1',
                password: 'client1',
                datasource: 'client1',
                enabled: true
        ).save(failOnError: true, flush: true)

        def client2 = User.findByUsername('client2') ?: new User(
                username: 'client2',
                password: 'client2',
                datasource: 'client2',
                enabled: true
        ).save(failOnError: true, flush: true)

        [client1, client2].each {
            if (!it.authorities.contains(userRole)) {
                UserRole.create it, userRole
            }
        }

    }

    private void createData() {
        def note1 = Note.client1.findByTitle('note1') ?: new Note(
                title: 'note1',
                description: 'description for note1'
        ).client1.save(failOnError: true, flush: true)
        def note2 = Note.client1.findByTitle('note2') ?: new Note(
                title: 'note2',
                description: 'description for note2'
        ).client1.save(failOnError: true, flush: true)
        def note3 = Note.client1.findByTitle('note3') ?: new Note(
                title: 'note3',
                description: 'description for note3'
        ).client1.save(failOnError: true, flush: true)
        def note4 = Note.client2.findByTitle('note4') ?: new Note(
                title: 'note4',
                description: 'description for note4'
        ).client2.save(failOnError: true, flush: true)
        def note5 = Note.client2.findByTitle('note5') ?: new Note(
                title: 'note5',
                description: 'description for note5'
        ).client2.save(failOnError: true, flush: true)
    }
}
