import android.app.ActionBar
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.wsr.Bank
import com.example.wsr.R

class RecyclerViewBank: RecyclerView.Adapter<ViewHolderBank>(){
        var list = Array<Bank>(12){Bank()}
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):ViewHolderBank {
        var view = LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_bank, parent,false)
        return ViewHolderBank(view)
    }
    override fun onBindViewHolder(holder: ViewHolderBank, position: Int) {
        holder.onBing(list[position])
    }
    override fun getItemCount(): Int {
        return list.size
    }
}
class ViewHolderBank(item: View): RecyclerView.ViewHolder(item){
    var address = item.findViewById<TextView>(R.id.address)
    var type = item.findViewById<TextView>(R.id.type)
    var work_time = item.findViewById<TextView>(R.id.work_time)
    var work = item.findViewById<TextView>(R.id.work)
    fun onBing(bank: Bank) {
        address.text = bank.address
        type.text = bank.type
        work_time.text = bank.work_time
        work.text = bank.work
        /*if (dog.age > 50){
            down.setBackgroundColor(Color.BLUE)
        }*/
    }
}