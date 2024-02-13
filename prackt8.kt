fun main() {
    var product = DairyProducts( "", 0.0, 0.0, "", 0.0, 0, 0.0, 0.0)
    product.Input()
    product.Cost()
    product.TotalWeight()
    println()
    product.fatnessInfo()
    product.Output(product)
}
