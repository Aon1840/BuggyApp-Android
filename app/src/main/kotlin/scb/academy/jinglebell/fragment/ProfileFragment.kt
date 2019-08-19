package scb.academy.jinglebell.fragment


import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.KeyEvent
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_profile.*

import kotlinx.android.synthetic.main.fragment_profile.view.*
import android.view.inputmethod.EditorInfo
import android.widget.TextView
import android.widget.TextView.OnEditorActionListener
import scb.academy.jinglebell.activity.WelcomeActivity


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class ProfileFragment : Fragment() {
    lateinit var profileFragment: ProfileFragment
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val _view = inflater.inflate(scb.academy.jinglebell.R.layout.fragment_profile, container, false)


        _view.edtNickname.setOnEditorActionListener(OnEditorActionListener { v, actionId, event ->
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                Log.d("----test: ",_view.edtNickname.text.toString())

                val nickname = edtNickname.text.toString()
                val intent = Intent(getActivity(), WelcomeActivity::class.java)
                intent.putExtra("nickname",nickname)

                startActivity(intent)
            }
            false
        })


        return _view


    }


}
