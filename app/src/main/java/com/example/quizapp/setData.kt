package com.example.quizapp

object setData {

    const val score:String="score"

   fun getQuestion():ArrayList<QuestionData>{
       var que:ArrayList<QuestionData> = arrayListOf()

       var question1 = QuestionData(
           1,
           "Первые Олимпийские игры продолжались пять дней",
           "Правда",
           "Ложь",
           1
       )

       var question2 = QuestionData(
           2,
           "Самая длинная река в России — Лена",
           "Правда",
           "Ложь",
           1
       )
       var question3 = QuestionData(
           3,
           "Эйнштейна отчислили из школы за неуспеваемость по математике",

           "Правда",
           "Ложь",
           2

       )
       var question4 = QuestionData(
           4,
           "Существует хоккей на роликовых коньках",

           "Правда",
           "Ложь",
           1
       )

       var question5 = QuestionData(
           5,
           "Самое распространенное инфекционное заболевание в мире — это зубной кариес.",

           "Правда",
           "Ложь",
           1
       )
       var question6 = QuestionData(
           6,
           "Баскетбол- это австралийская игра",
           "Правда",
           "Ложь",
           2
       )
       var question7 = QuestionData(
           7,
           "Столица Ирландии — Дублин.",
           "Правда",
           "Ложь",
           1
       )
       var question8 = QuestionData(
           8,
           "Томас Эдисон изобрел электрическую лампочку накаливания.",
           "Правда",
           "Ложь",
           2
       )
       var question9 = QuestionData(
           9,
           "Уолт Дисней придумал Микки Мауса",
           "Правда",
           "Ложь",
           2
       )
       var question10 = QuestionData(
           10,
           "Баскетбол- это австралийская игра",
           "Правда",
           "Ложь",
           2
       )

       var question11 = QuestionData(
           11,
           "Cуществуют 100- клеточные шахматы",
           "Правда",
           "Ложь",
           2
       )

       var question12 = QuestionData(
           12,
           "Полное имя футболиста – Криштиану Роналду душ Сантуш Авейру, а второе имя ему придумал отец, который восхищался 40-м президентом США",
           "Правда",
           "Ложь",
           2
       )



       que.add(question1)
       que.add(question2)
       que.add(question3)
       que.add(question4)
       que.add(question5)
       que.add(question6)
       que.add(question6)
       que.add(question7)
       que.add(question8)
       que.add(question9)
       que.add(question10)
       que.add(question11)
       que.add(question12)

       return que
   }
}