class Cliente(s: String, comum: TipoCliente, fl: Float, ing01: Ingresso, ass01: Assento) {
    val dinheiro: Any
        get() {
            TODO()
        }
    val assento: Any = TODO()
    val nome: Any?
    val ingresso: Any
        get() {
            TODO()
        }
    val tipoCliente: Any
        get() {
            TODO()
    val preco: Any
        }

    class Cliente(
        val nome:String,
        val tipoCliente:TipoCliente,
        var dinheiro:Float,
        val ingresso: Ingresso,
        val assento: Assento,
        val preco: Float.Companion = Float,
        )


}