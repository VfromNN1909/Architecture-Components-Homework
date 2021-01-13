package com.epam.navigationproject.auth

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.epam.navigationproject.R
import kotlinx.android.synthetic.main.fragment_auth_by_phone.*

class AuthByPhoneFragment : Fragment(R.layout.fragment_auth_by_phone) {



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (requireActivity() as? AppCompatActivity)?.supportActionBar?.title = "Authorization"

        button.setOnClickListener {

            val args = SmsCodeConfirmationFragmentArgs(
                phoneNumber = number.editableText.toString()
            ).toBundle()

            findNavController().navigate(
                R.id.action_authByPhoneFragment_to_smsCodeConfirmationFragment,
                args
            )
        }

    }

}