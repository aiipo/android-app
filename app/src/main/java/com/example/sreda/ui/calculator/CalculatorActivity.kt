package com.example.sreda.ui.calculator

import android.os.Bundle
import com.example.sreda.databinding.ActivityCalculatorBinding
import com.example.sreda.ui.base.BaseActivity
import java.text.DecimalFormat
import org.mariuszgromada.math.mxparser.Expression

class CalculatorActivity : BaseActivity<CalculatorViewModel>(CalculatorViewModel::class) {

    private var binding: ActivityCalculatorBinding? = null
    private var errorMessage = "Error"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityCalculatorBinding.inflate(layoutInflater)
        this.binding = binding
        setContentView(binding.root)

        binding.buttonZero.setOnClickListener {
            addToInputText("0")
        }

        binding.buttonOne.setOnClickListener {
            addToInputText("1")
        }

        binding.buttonTwo.setOnClickListener {
            addToInputText("2")
        }

        binding.buttonThree.setOnClickListener {
            addToInputText("3")
        }

        binding.buttonFour.setOnClickListener {
            addToInputText("4")
        }

        binding.buttonFive.setOnClickListener {
            addToInputText("5")
        }

        binding.buttonSix.setOnClickListener {
            addToInputText("6")
        }

        binding.buttonSeven.setOnClickListener {
            addToInputText("7")
        }

        binding.buttonEight.setOnClickListener {
            addToInputText("8")
        }

        binding.buttonNine.setOnClickListener {
            addToInputText("9")
        }

        binding.buttonDecimal.setOnClickListener {
            addToInputText(".")
        }

        binding.buttonPlus.setOnClickListener {
            addToInputText("+")
        }

        binding.buttonMinus.setOnClickListener {
            addToInputText("-")
        }

        binding.buttonMultiply.setOnClickListener {
            addToInputText("×")
        }

        binding.buttonDivide.setOnClickListener {
            addToInputText("÷")
        }

        binding.buttonEqual.setOnClickListener {
            showResult()
        }

        binding.buttonDelete.setOnClickListener {
            deleteSymbol()
        }
    }

    private fun addToInputText(value: String) {
        binding?.calculatorResult?.text = "${binding?.calculatorResult?.text}$value"
    }

    private fun getInputExpression(): String? {
        var expression = binding?.calculatorResult?.text?.replace(Regex("÷"), "/")
        expression = expression?.replace(Regex("×"), "*")
        return expression
    }

    private fun showResult() {
        try {
            val expression = getInputExpression()
            val result = Expression(expression).calculate()
            if (result.isNaN()) {
                binding?.calculatorResult?.text = errorMessage
            } else {
                binding?.calculatorResult?.text = DecimalFormat("0.######").format(result)
                    .toString()
            }
        } catch (e: Exception) {
            binding?.calculatorResult?.text = errorMessage
        }
    }

    private fun deleteSymbol() {
        val text = binding?.calculatorResult?.text;

        binding?.calculatorResult?.text = if (text?.contains(errorMessage) == true) ""
            else text?.dropLast(1)
    }
}
