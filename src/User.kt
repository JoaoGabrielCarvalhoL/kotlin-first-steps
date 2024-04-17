import java.util.UUID

/**
 * Primary Construct
 * */
class User(
    private val id: UUID, private val email: String,
    private val username: String, private val hashPassword: String
) {
    private var anotherAttr: String? = null
    private lateinit var someVariable: String
    /**
        Must be var
        It will only exist in memory when it is initialized.
     */

    /**
     * Second Constructor
     * */
    constructor(
        id: UUID, email: String,
        username: String, hashPassword: String,
        anotherAttr: String
    ) : this(id, email, username, hashPassword) {
        this.anotherAttr = anotherAttr
        if (!this::someVariable.isInitialized) {
            this.someVariable = String()
        }

    }

    init {
        println("Similar a initialization block in Java")
    }

    public fun getAnotherAttr(): String? {
        return this.anotherAttr
    }

    public fun credentials(): String {
        return "Id: ${this.id}\nEmail: ${this.email} - Username: ${this.username}"
    }

    public fun getHashPassword(): String {
        return this.hashPassword;
    }

    public fun getId(): UUID {
        return this.id
    }

    public fun getUsername(): String {
        return this.username
    }

    public fun getEmail(): String {
        return this.email
    }

}