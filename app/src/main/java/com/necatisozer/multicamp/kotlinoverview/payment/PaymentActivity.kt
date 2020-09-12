package com.necatisozer.multicamp.kotlinoverview.payment

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.core.widget.doOnTextChanged
import com.necatisozer.multicamp.kotlinoverview.R
import kotlinx.android.synthetic.main.activity_payment.*
import kotlinx.android.synthetic.main.layout_payment_credit_card.view.*

class PaymentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)

        switchPayment.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                switchPayment.setText(R.string.credit_card_payment)
                layoutCreditCard.isVisible = true
            } else {
                switchPayment.setText(R.string.cash_payment)
                layoutCreditCard.isVisible = false
            }
        }

        layoutCreditCard.editTextCreditCardNumber.doOnTextChanged { text, start, before, count ->
            val creditCardNumber = text ?: ""

            val drawableRes = when {
                creditCardNumber.isEmpty() -> R.drawable.ic_credit_card
                creditCardNumber[0] == '4' -> R.drawable.ic_visa
                creditCardNumber[0] == '5' -> R.drawable.ic_mastercard
                else -> R.drawable.ic_credit_card
            }

            layoutCreditCard.textInputLayoutCreditCardNumber.setStartIconDrawable(drawableRes)

        }

        buttonPayment.setOnClickListener {
            if (layoutCreditCard.editTextName.text.isNullOrEmpty()) {
                layoutCreditCard.textInputLayoutName.error = getString(R.string.empty_field_error)
                return@setOnClickListener
            }

            val toastMessage = when {
                checkboxAgreement.isChecked -> R.string.payment_success_message
                else -> R.string.accept_terms_message
            }

            Toast.makeText(this, getString(toastMessage), Toast.LENGTH_LONG).show()
        }

    }
}