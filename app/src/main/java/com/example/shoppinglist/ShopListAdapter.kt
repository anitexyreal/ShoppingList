package com.example.shoppinglist

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.row_list.view.*

class ShopListAdapter (val arrayList: ArrayList<Model>, val context: Context) :
    RecyclerView.Adapter<ShopListAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        fun bindItems(model: Model){

            itemView.titleTv.text = model.title
           itemView.descriptionTv.text = model.desc
            itemView.imageTv.setImageResource(model.image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_list, parent,false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       holder.bindItems(arrayList[position])

      holder.itemView.setOnClickListener {

          /*if (position == 0){

              Toast.makeText(
                  context,
                  "You clicked over bags",
                  Toast.LENGTH_LONG
              ).show()
          }
          if (position == 1){
              Toast.makeText(
                  context,
                  "You clicked over clothes",
                  Toast.LENGTH_LONG
              ).show()
          }
          if (position == 2){
              Toast.makeText(
                  context,
                  "You clicked over shoes",
                  Toast.LENGTH_LONG
              ).show()
          }

          if (position == 3){
              Toast.makeText(
                  context,
                  "You clicked over television",
                  Toast.LENGTH_LONG
              ).show()
          }

          if (position == 4){
              Toast.makeText(
                  context,
                  "You clicked over phones",
                  Toast.LENGTH_LONG
              ).show()
          }

          if (position == 5){
              Toast.makeText(
                  context,
                  "You clicked over watches",
                  Toast.LENGTH_LONG
              ).show()
          }*/
      }
        // getting position of selected item
        val model = arrayList.get(position)
        var gTitle : String = model.title
        var gDescription : String = model.desc
        var gImage :Int = model.image

        val intent = Intent(context, DetailsActivity::class.java)

        intent.putExtra("iTitle", gTitle)
        intent.putExtra("iDescription", gDescription)
        intent.putExtra("iImage", gImage)

        context.startActivity(intent)
    }
}