
class Exam( var name : String,
            var discipline: String,
            var data  : String,
            var evaluation : Int)
{
        fun Input ()
        {
            try
            {
                print("Введите имя студента: ")
                name = readLine()!!.toString()
                print("Введите предмет, по которому он сдавал экзамен: ")
                discipline = readLine()!!.toString()
                print("Введите дату экзамена в формате dd.mm.yy: ")
                data = readLine()!!.toString()
                var kk = data.toCharArray()
                var count = 0
                var k = 0
                while (k != kk.size)
                {
                    if (kk[k] == '.') count++
                    k++
                }
                if (count==2)
                {
                print("Введите оценку: ")
                evaluation = readLine()!!.toInt()
                if (evaluation>0 && evaluation<6)
                    else println("Система оценивания в России от 1 до 5! Вы ошиблись.")
                }
                else println("Вы неправильно ввели дату")
            }
            catch (e : Exception)
            {
                println ("Ошибка")
            }

        }
    fun Evaluation()
    {
       when
       {
           evaluation == 1 -> println("Не сдал(а). Это самый низкий балл")
           evaluation == 2 -> println("Не сдал(а). Пересдача")
           evaluation == 3 -> println("Удовлетворительно")
           evaluation == 4 -> println("Хорошо")
           else -> println("Отлично! Успех!")

       }
    }
    fun Data_Month()
    {
        var kk = discipline.toCharArray()
        var k = 0
        k = discipline.indexOf('.')
        when
        {
            kk[k+1] == '0' && kk[k+2] == '1' -> println("Сдача экзамена происходила в январе")
            kk[k+1] == '0' && kk[k+2] == '2' -> println("Сдача экзамена происходила в феврале")
            kk[k+1] == '0' && kk[k+2] == '3' -> println("Сдача экзамена происходила в март")
            kk[k+1] == '0' && kk[k+2] == '4' -> println("Сдача экзамена происходила в апрель")
            kk[k+1] == '0' && kk[k+2] == '5' -> println("Сдача экзамена происходила в май")
            kk[k+1] == '0' && kk[k+2] == '6' -> println("Сдача экзамена происходила в июнь")
            kk[k+1] == '0' && kk[k+2] == '7' -> println("Сдача экзамена происходила в июль")
            kk[k+1] == '0' && kk[k+2] == '8' -> println("Сдача экзамена происходила в август")
            kk[k+1] == '0' && kk[k+2] == '9' -> println("Сдача экзамена происходила в сентябрь")
            kk[k+1] == '1' && kk[k+2] == '0' -> println("Сдача экзамена происходила в октябре")
            kk[k+1] == '1' && kk[k+2] == '1' -> println("Сдача экзамена происходила в ноябре")
            else -> println("Сдача экзамена происходила в декабре")
        }
    }
        fun  Output (exam: Exam)
        {
            println ("Имя студента: ${exam.name}\nДисциплина: ${exam.discipline}\nДата экзамена: ${exam.data}\nОценка: ${exam.evaluation}")
        }
    }
