package br.com.disapps.viewmodelexample

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by lazy {
        ViewModelProviders.of(this).get(MainViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener { viewModel.addvalue1() }
        button2.setOnClickListener { viewModel.addValue2() }
        button3.setOnClickListener { viewModel.reset() }

        viewModel.value1.observe(this, Observer {
            textView1.text = it!!.toString()
        })

        viewModel.value2.observe(this, Observer {
            textView2.text = it!!.toString()
        })

    }
}
