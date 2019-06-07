package design.akililab.wallet.ui.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import design.akililab.wallet.R
import kotlinx.android.extensions.LayoutContainer

class TransactionListAdapter: RecyclerView.Adapter<TransactionListAdapter.ViewHolder>()  {


    override fun getItemViewType(position: Int): Int {
        return R.layout.transaction_item
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(viewType, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 10
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // no need to bind anything
    }


    class ViewHolder(view: View) : RecyclerView.ViewHolder(view), LayoutContainer {

        override val containerView: View?
            get() = itemView

    }
}

