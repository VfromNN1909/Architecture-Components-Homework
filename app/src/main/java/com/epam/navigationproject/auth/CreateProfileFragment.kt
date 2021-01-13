package com.epam.navigationproject.auth

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.epam.navigationproject.R
import com.epam.navigationproject.main.MainActivity
import kotlinx.android.synthetic.main.fragment_create_profile.*

class CreateProfileFragment : Fragment(R.layout.fragment_create_profile) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (requireActivity() as? AppCompatActivity)?.supportActionBar?.title = "Create profile"

        val args = SmsCodeConfirmationFragmentArgs.fromBundle(requireArguments())

        phoneNumber.setText(args.phoneNumber)

        button.setOnClickListener {
            val intent: Intent = Intent(this.context, MainActivity::class.java)
            intent.apply {
                putExtra("phone_number", args.phoneNumber)
                putExtra("first_name", firstName.editableText.toString())
                putExtra("last_name", lastName.editableText.toString())
            }
            startActivity(intent)
        }
    }

}