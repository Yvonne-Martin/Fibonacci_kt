package com.example.fibonache

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import com.example.fibonache.databinding.ActivityMainBinding
import com.example.fibonache.databinding.FibonacheNumsBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding=ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val  numbers = fibonacheNums(100)
        binding.rvNums.layoutManager=GridLayoutManager(this,2)
        val allNums = FibonacheRecyclerViewAdapter(numbers)
        binding.rvNums.adapter = allNums

    }
    fun fibonacheNums(num:Int):List<Int>{
        val numbers = mutableListOf(0,1)
        while (numbers.size< num){
            numbers.add(numbers[numbers.lastIndex]+numbers[numbers.lastIndex-1])
        }
        return numbers
    }
}