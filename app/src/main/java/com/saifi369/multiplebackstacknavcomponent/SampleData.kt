package com.saifi369.multiplebackstacknavcomponent

import androidx.lifecycle.MutableLiveData

class SampleData {
    companion object{
        var defaultAmount = MutableLiveData<Long>(100L)
    }
}