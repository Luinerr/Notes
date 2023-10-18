package app.notes;

import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;

public class NotesAdapter extends RecyclerView.Adapter<NotesAdapter.ViewHolder> {

    private final LayoutInflater inflater;
    private final List<Note> notes;

    NotesAdapter(Context context, List<Note> notes) {
        this.notes = notes;
        this.inflater = LayoutInflater.from(context);
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.note_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Note note = notes.get(position);
        holder.headView.setText((note.getHead()));
        holder.bodyView.setText(note.getBody());
        holder.dateView.setText(note.getDate());
    }

    @Override
    public int getItemCount() {
        return notes.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final TextView headView, bodyView, dateView;
        ViewHolder(View view) {
            super(view);
            headView = view.findViewById(R.id.h1);
            bodyView = view.findViewById(R.id.bodyText);
            dateView = view.findViewById(R.id.dateTime);
        }
    }
}
