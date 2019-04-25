package com.example.ratemysinging;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;

public class CommentAdapter extends RecyclerView.Adapter<CommentAdapter.MyViewHolder> {

    private List<Comments> commentList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView name, date, comment;

        public MyViewHolder(View view) {
            super(view);
            name= (TextView) view.findViewById(R.id.name);
            date = (TextView) view.findViewById(R.id.date);
            comment = (TextView) view.findViewById(R.id.content);
        }
    }


    public CommentAdapter(List<Comments> commentList) {
        this.commentList = commentList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_list, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Comments comment = commentList.get(position);
        Date date = new Date(comment.getTimeStamp());
        DateFormat dateFormat = DateFormat.getDateTimeInstance();
        holder.name.setText("Name : "+comment.getUserId());
        holder.date.setText("Published At : " +dateFormat.format(date));
        holder.comment.setText(comment.getCommentText());
    }

    @Override
    public int getItemCount() {
        return commentList.size();
    }
}
