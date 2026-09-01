package com.chamkartech.composereview

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface

/*
 * One switchboard for the whole review.
 *
 * Change the single line inside setContent to the exercise you are working
 * on. One line, one place — you never have to hunt for the right file.
 *
 *   Lesson 1  TogglePractice()        BrokenToggle()
 *   Lesson 2  ExpenseRowPractice()    ThreeAcrossPractice()
 *   Lesson 3  ExpenseListPractice()
 *   Lesson 4  ExpenseScreenPractice()
 *   Lesson 5  CounterPractice()
 *   Lesson 6  SignUpFormPractice()
 *   Lesson 7  ExpenseScreenWithViewModel()
 */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface {
                    // <<< change this one line per exercise >>>
                    // Exercise 1:
//                    com.chamkartech.composereview.lesson01.TogglePractice()
//                    com.chamkartech.composereview.lesson01.BrokenToggle()

                    // Exercise 2:
//                    com.chamkartech.composereview.lesson02.ExpenseRowPractice()
//                    com.chamkartech.composereview.lesson02.ThreeAcrossPractice()

                    // Exercise 3:
//                    com.chamkartech.composereview.lesson03.ExpenseListPractice()

                    // Exercise 4:
//                    com.chamkartech.composereview.lesson04.ExpenseScreenPractice()

                    // Exercise 5:
                    com.chamkartech.composereview.lesson05.CounterPractice()

                }
            }
        }
    }
}
