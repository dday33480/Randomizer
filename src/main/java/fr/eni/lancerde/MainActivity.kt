package fr.eni.lancerde

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModel
import fr.eni.lancerde.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val vm by viewModels<ValeurDeViewModel>()
    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.vm = vm
        binding.lifecycleOwner = this


        binding.textValeurDe.text = "${vm.valeurDeLance}"

        binding.button.setOnClickListener {
            vm.launchDice(6)
            binding.textValeurDe.text = "${vm.valeurDeLance.value.toString()}"
        }
        binding.button2.setOnClickListener {
            vm.launchDice(12)
            binding.textValeurDe.text = "${vm.valeurDeLance.value.toString()}"
        }
        binding.button3.setOnClickListener {
            vm.launchDice(20)
            binding.textValeurDe.text = "${vm.valeurDeLance.value.toString()}"
        }
        binding.button4.setOnClickListener {
            vm.launchDice(8)
            binding.textValeurDe.text = "${vm.valeurDeLance.value.toString()}"
        }
        binding.button5.setOnClickListener {
            vm.launchDice(16)
            binding.textValeurDe.text = "${vm.valeurDeLance.value.toString()}"
        }
        binding.button6.setOnClickListener {
            vm.launchDice(100)
            binding.textValeurDe.text = "${vm.valeurDeLance.value.toString()}"
        }

    }

}