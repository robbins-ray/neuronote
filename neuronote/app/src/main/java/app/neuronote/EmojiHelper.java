package app.neuronote;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CursorAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class EmojiHelper extends BaseAdapter{

    private Context context;
    private String[] names;
    int[] emojis;

    public EmojiHelper(Context context, String[] names, int[] emojis) {
        this.context=context;
        this.names=names;
        this.emojis=emojis;
    }

    @Override
    public int getCount() {
        return names.length;
    }

    @Override
    public Object getItem(int pos) {
        return names[pos];
    }

    @Override
    public long getItemId(int pos) {
        return pos;
    }

    @Override
    public View getView(int pos, View convertView, ViewGroup parent) {
        if (convertView == null)
        {
            LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            convertView = inflater.inflate(R.layout.emoji_model, null);
        }

        TextView nameTV = (TextView) convertView.findViewById(R.id.m_emojitext);
        ImageView imageView= (ImageView) convertView.findViewById(R.id.m_emojiimage);

        nameTV.setText(names[pos]);
        imageView.setImageResource(emojis[pos]);
        return convertView;
    }
}
