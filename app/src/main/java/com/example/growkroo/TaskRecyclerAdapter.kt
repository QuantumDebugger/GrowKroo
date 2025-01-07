package com.example.growkroo

import android.content.Context
import android.provider.ContactsContract.CommonDataKinds.Im
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.growkroo.TaskRecyclerAdapter.ViewHolder
import com.google.android.material.card.MaterialCardView

class TaskRecyclerAdapter(context: Context, var taskList : ArrayList<TaskDataClass>) : RecyclerView.Adapter<ViewHolder>(){

    class ViewHolder(var view : View) : RecyclerView.ViewHolder(view){

        var tasks : TextView = view.findViewById(R.id.tvTasksHeading)
        var description : TextView = view.findViewById(R.id.tvDescription)
        var category : TextView = view.findViewById(R.id.tvCategory)
        var date : TextView = view.findViewById(R.id.tvDate)
        var startDate : TextView = view.findViewById(R.id.tvStartDate)
        var endDate : TextView = view.findViewById(R.id.tvEndDate)
        var edit : ImageView = view.findViewById(R.id.ivEdit)
        var delete : ImageView = view.findViewById(R.id.ivDelete)
        var taskView : MaterialCardView = view.findViewById(R.id.cvTaskItems)
        var complete : CheckBox = view.findViewById(R.id.cbCheckBox)








    }
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.tasks_items, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return taskList.size
    }

}
