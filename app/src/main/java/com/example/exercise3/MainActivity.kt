package com.example.exercise3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calButton: Button = findViewById(R.id.buttonCalculate)

        calButton.setOnClickListener { calculate() }

        val resetButton: Button = findViewById(R.id.buttonReset)

        resetButton.setOnClickListener { reset() }
    }

    private fun calculate()
    {
        val gender = findViewById<RadioGroup>(R.id.radioGroupGender)
        val age = findViewById<Spinner>(R.id.spinnerAge)
        val smoker = findViewById<CheckBox>(R.id.checkBoxSmoker)
        val premium = findViewById<TextView>(R.id.textViewPremium)

        if(age.selectedItem.equals("Less than 17"))
        {
            if(gender.getCheckedRadioButtonId().equals("female"))
            {
                if(smoker.isChecked())
                {
                    premium.setText("RM 60")
                }
                else
                {
                    premium.setText("RM 60")
                }
            }
            else if(gender.getCheckedRadioButtonId().equals("male"))
            {
                if(smoker.isChecked())
                {
                    premium.setText("RM 60")
                }
                else
                {
                    premium.setText("RM 60")
                }
            }
        }
        else if(age.selectedItem.equals("17 to 25"))
        {
            if(gender.getCheckedRadioButtonId().equals("female"))
            {
                if(smoker.isChecked())
                {
                    premium.setText("RM 170")
                }
                else
                {
                    premium.setText("RM 70")
                }
            }
            else if(gender.getCheckedRadioButtonId().equals("male"))
            {
                if(smoker.isChecked())
                {
                    premium.setText("RM 230")
                }
                else
                {
                    premium.setText("RM 130")
                }
            }
        }
        else if(age.selectedItem.equals("26 to 30"))
        {
            if(gender.getCheckedRadioButtonId().equals("female"))
            {
                if(smoker.isChecked())
                {
                    premium.setText("RM 240")
                }
                else
                {
                    premium.setText("RM 90")
                }
            }
            else if(gender.getCheckedRadioButtonId().equals("male"))
            {
                if(smoker.isChecked())
                {
                    premium.setText("RM 340")
                }
                else
                {
                    premium.setText("RM 190")
                }
            }
        }
        else if(age.selectedItem.equals("31 to 40"))
        {
            if(gender.getCheckedRadioButtonId().equals("female"))
            {
                if(smoker.isChecked())
                {
                    premium.setText("RM 320")
                }
                else
                {
                    premium.setText("RM 120")
                }
            }
            else if(gender.getCheckedRadioButtonId().equals("male"))
            {
                if(smoker.isChecked())
                {
                    premium.setText("RM 470")
                }
                else
                {
                    premium.setText("RM 270")
                }
            }
        }
        else if(age.selectedItem.equals("41 to 55"))
        {
            if(gender.getCheckedRadioButtonId().equals("female"))
            {
                if(smoker.isChecked())
                {
                    premium.setText("RM 400")
                }
                else
                {
                    premium.setText("RM 150")
                }
            }
            else if(gender.getCheckedRadioButtonId().equals("male"))
            {
                if(smoker.isChecked())
                {
                    premium.setText("RM 600")
                }
                else
                {
                    premium.setText("RM 350")
                }
            }
        }
        else if(age.selectedItem.equals("More than 55"))
        {
            if(gender.getCheckedRadioButtonId().equals("female"))
            {
                if(smoker.isChecked())
                {
                    premium.setText("RM 450")
                }
                else
                {
                    premium.setText("RM 150")
                }
            }
            else if(gender.getCheckedRadioButtonId().equals("male"))
            {
                if(smoker.isChecked())
                {
                    premium.setText("RM 650")
                }
                else
                {
                    premium.setText("RM 350")
                }
            }
        }
    }

    private fun reset()
    {
        val gender = findViewById<RadioGroup>(R.id.radioGroupGender)
        val age = findViewById<Spinner>(R.id.spinnerAge)
        val smoker = findViewById<CheckBox>(R.id.checkBoxSmoker)
        val premium = findViewById<TextView>(R.id.textViewPremium)

        gender.clearCheck()
        age.setSelection(0)
        smoker.setChecked(false)
        premium.setText("")
    }
}
