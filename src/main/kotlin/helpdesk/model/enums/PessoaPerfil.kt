package helpdesk.model.enums

enum class PessoaPerfil(val codigo: Int, val descricao: String) {
    ADMIN(1, "ROLE_ADMIN"),
    CLIENTE(2, "ROLE_CLIENTE"),
    TECNICO(3, "ROLE_TECNICO");
}
