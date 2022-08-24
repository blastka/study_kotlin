package com.example.myapplication.presentation.example2
import androidx.lifecycle.MutableLiveData

fun main(){
    var firebaseNodeList = MutableLiveData<ArrayList<String>>()
    var arrayList = firebaseNodeList.value
    if (arrayList != null) {
        arrayList.add("Sasa")
        arrayList.add("Act")
        arrayList.add("Byby")
        arrayList.add("Kika")
    }
    firebaseNodeList.postValue(arrayList)

    var moveDowRecyclerviewList = MoveDowRecyclerviewList<String>()
    moveDowRecyclerviewList.checkMoveDowRecyclerviewList(firebaseNodeList, "Act")
    println(firebaseNodeList)
}

class MoveDowRecyclerviewList<T>() {

    fun checkMutalbeList(){

    }

    fun checkMoveDowRecyclerviewList(list: MutableLiveData<ArrayList<T>>, element: T){
        var arrayList = list.value
        if (arrayList != null) {
            arrayList.remove(element)
            arrayList.add(element)
            list.postValue(arrayList)
        }
    }
}