class DairyProducts ( var name : String,
                      var weight : Double,
                      var fatness : Double,
                      var manufacturer : String,
                      var price : Double,
                      var count  : Int,
                      var cost : Double,
                      var totalweight : Double)
{
    fun Input ()
    {
        try
        {
            print("Введите название молочного продукта: ")
            name = readLine()!!.toString()
            print("Введите вес продукта в граммах (больше 50 г): ")
            weight = readLine()!!.toDouble()
            if (weight>0) {
            if (weight>50) {
                print("Введите жирность продукта: ")
                fatness = readLine()!!.toDouble()
                if (fatness>0) {
                    print("Введите производителя: ")
                    manufacturer = readLine()!!.toString()
                    print("Введите цену на ${name}: ")
                    price = readLine()!!.toDouble()
                    if (price>0)
                        else println("Цена не может быть отрицательной!")
                    print("Введите сколько вы бы хотели приобрести: ")
                    count = readLine()!!.toInt()
                    if (count > 0 )
                    else println("Количество не может быть отрицательным!")
                }
                else println ("Жирность не может быть отрицательной!")
            }
            else println ("Вес не может быть таким маленьким!")
            }
            else println ("Вес не может быть отрицательным!")
        }
        catch (e : Exception)
        {
            println ("Ошибка")
        }

    }
    fun Cost ()
    {
        if (count > 5) {
            println("Для вас скидка 10%")
            cost = ((count * price)/100)*90
        }
        else cost = count * price
    }
    fun TotalWeight()
    {
       totalweight = weight * count
    }
    fun fatnessInfo()
    {
        if (fatness >= 3.2 ) println("Хороший выбор!")
        else println("Запомните!\nПолезнее всего для организма молоко жирности – 3,2%. Выбирая обезжиренный продукт, мы сами себя лишаем полезных веществ, которые содержатся в продукте , но не усваиваются при отсутствии молочных жиров.")
    }
    fun  Output (product: DairyProducts)
    {
        println ("Название мол.продукта: ${product.name}\nВес продукта (в граммах): ${product.weight}\nЖирность: ${product.fatness}\nПроизводитель: ${product.manufacturer}\nЦена: ${product.price} руб.шт.\nОбщая стоимость: ${product.cost}\nОбщий вес покупки: ${product.totalweight} грамм")
    }
}