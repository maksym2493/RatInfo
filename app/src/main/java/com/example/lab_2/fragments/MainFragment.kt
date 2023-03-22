package com.example.lab_2.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.lab_2.Adapter
import com.example.lab_2.R

open class MainFragment: Fragment() {
    private var data = listOf(
        listOf(
            "https://factosvit.com.ua/wp-content/uploads/2019/04/SHHur-abo-patsyuk.jpg",
            "Домашній щур",
            "Також відомий як звичайний щур, тому що він не зазнав жодної форми генетичної мутації.",
            "Цю породу впізнають завдяки вухам, які знаходяться відразу за очима, на маківці. Його тіло широке, струнке й округле, а вуса гладкі й дуже прямі.\n\nУ домашнього щура зазвичай біла, чорна або темно-коричнева шерсть, а хвіст дуже довгий і тонкий."
        ),
        listOf(
            "https://vetonline.pro/uploads/blog/domashnyaya-krysa.jpg",
            "Менкський щур",
            "Менкських щурів легко помітити, оскільки вони народжуються безхвостими або з дуже маленьким хвостом.",
            "Вони значно менші, ніж звичайні щури, і, в порівнянні, їхнє тіло коротше і кругліше.\n\nХвіст щура використовується для регулювання температури тіла та балансу, а відсутність хвоста у щура Менкса означає, що він більш схильний до різних захворювань."
        ),
        listOf(
            "https://geomedia.top/wp-content/uploads/2016/07/golayalyisaya-kryisa.jpg",
            "Лисі або безшерсті щури",
            "Як видно з назви, ця порода щурів повністю лиса.",
            "Однак по всьому тілу у нього може бути тонкий шар пуху, схожого на хутро. У них короткі хвилясті вуса, а відсутність шерсті означає, що вони дуже гладкі на дотик."
        ),
        listOf(
            "https://12obezyan.ru/upload/resize_cache/iblock/556/320_320_1/krisi_dambo.jpg",
            "Щур Дамбо",
            "Як можна собі уявити, цього щура назвали на честь Дамбо через його великі та широкі вуха, схожі на знаменитого слона.",
            "На відміну від звичайного домашнього щура, у щура Дамбо вуха нижче, а тіло набагато кремезніше.\n\nУ нього дуже коротке тонке хутро, його можна знайти в різних кольорах; найпоширенішими з них є білий, сірий, світло-сірий і світло-коричневий."
        ),
        listOf(
            "https://pesyk.kiev.ua/wp-content/uploads/Krysy-s-kudryavoj-sherstyu-8-1.jpg",
            "Щур Рекс",
            "Щур Рекс – один з найбільших домашніх щурів.",
            "У них багато волосся по всьому тілу, крім живота. Однак є ще один сорт, відомий як Double Rex, який практично лисий. Його вуса короткі і кучеряві.\n\nКрім цих типів, домашніх щурів також класифікують за типом шерсті, кольором і можливими ознаками. Маркування також мають певні назви, наприклад «Беркшир» або «Ірландський»"
        ),
    )

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_main, container, false)

        var recycleView = view.findViewById<RecyclerView>(R.id.recycleView)

        recycleView.adapter =  Adapter(this, data)
        recycleView.layoutManager = LinearLayoutManager(context)

        return view
    }

    fun navigate(data: List<String>){
        SecondFragment.data = data
        findNavController().navigate(MainFragmentDirections.actionMainFragmentToSecondFragment())
    }
}