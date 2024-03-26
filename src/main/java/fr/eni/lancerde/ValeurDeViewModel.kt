package fr.eni.lancerde

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ValeurDeViewModel : ViewModel() {

    val valeurDeLance = MutableLiveData(1)

    fun launchDice(maxValue : Int) {
        valeurDeLance.value = (1..maxValue).random()
    }
}
