package app.neuronote;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import app.neuronote.EmojiHelper;
import app.neuronote.R;

public class EmojiSelector extends DialogFragment {

    GridView gridView;

    String nameList[] ={
            "Adventurous", "Amused", "Angry", "Anguish", "Anxious", "Astonished", "Blessed",
            "Bored", "Caring", "Celebratory", "Cheerful", "Cold", "Concerned", "Confident",
            "Confounded", "Confused", "Crying", "Dazed", "Depressed", "Desirous", "Desperate",
            "Disappointed", "Disapproving", "Disbelief", "Dishonest", "Dissatisfied", "Dizzy",
            "Embarrassed", "Evil", "Excited", "Fearful", "Flattered", "Flirty", "Frustrated",
            "Furious", "Grateful", "Grumpy", "Guilty", "Happy", "Horror", "Hot", "Humorous",
            "Hungry", "Hurt", "Hysterical", "Ill", "Infatuated", "Intelligent", "Irritable",
            "Lonely", "Loving", "Mischievous", "Nauseous", "Nerdy", "Nervous", "Neutral",
            "Persevering", "Playful", "Pleasant", "Positive", "Proud", "Puzzled", "Quiet",
            "Rage", "Relieved", "Sad", "Secretive", "Shocked", "Sick", "Silly", "Skeptical",
            "Sleepy", "Sobbing", "Speechless", "Successful", "Surprised", "Tired", "Wacky",
            "Warm", "Weary", "Worried" };

    int emojiIcons[] = {
            R.drawable.adventurous_emoji, R.drawable.amused_emoji, R.drawable.angry_emoji,
            R.drawable.anguish_emoji, R.drawable.anxious_emoji, R.drawable.astonished_emoji,
            R.drawable.blessed_emoji, R.drawable.bored_emoji, R.drawable.caring_emoji,
            R.drawable.celebratory_emoji, R.drawable.cheerful_emoji, R.drawable.cold_emoji,
            R.drawable.concerned_emoji, R.drawable.confident_emoji, R.drawable.confounded_emoji,
            R.drawable.confused_emoji, R.drawable.crying_emoji, R.drawable.dazed_emoji,
            R.drawable.depressed_emoji, R.drawable.desirous_emoji, R.drawable.desperate_emoji,
            R.drawable.disappointed_emoji, R.drawable.disapproving_emoji, R.drawable.disbelief_emoji,
            R.drawable.dishonest_emoji, R.drawable.dissatisfied_emoji, R.drawable.dizzy_emoji,
            R.drawable.embarrassed_emoji, R.drawable.evil_emoji, R.drawable.excited_emoji,
            R.drawable.fearful_emoji, R.drawable.flattered_emoji,
            R.drawable.flirty_emoji, R.drawable.frustrated_emoji, R.drawable.furious_emoji,
            R.drawable.grateful_emoji, R.drawable.grumpy_emoji, R.drawable.guilty_emoji,
            R.drawable.happy_emoji, R.drawable.horror_emoji, R.drawable.hot_emoji,
            R.drawable.humorous_emoji, R.drawable.hungry_emoji, R.drawable.hurt_emoji,
            R.drawable.hysterical_emoji, R.drawable.ill_emoji, R.drawable.infatuated_emoji,
            R.drawable.intelligent_emoji, R.drawable.irritable_emoji, R.drawable.lonely_emoji,
            R.drawable.loving_emoji, R.drawable.mischievous_emoji, R.drawable.nauseous_emoji,
            R.drawable.nerdy_emoji, R.drawable.nervous_emoji, R.drawable.neutral_emoji,
            R.drawable.persevering_emoji, R.drawable.playful_emoji, R.drawable.pleasant_emoji,
            R.drawable.positive_emoji, R.drawable.proud_emoji, R.drawable.puzzled_emoji,
            R.drawable.quiet_emoji, R.drawable.rage_emoji, R.drawable.relieved_emoji,
            R.drawable.sad_emoji, R.drawable.secretive_emoji, R.drawable.shocked_emoji,
            R.drawable.sick_emoji, R.drawable.silly_emoji, R.drawable.skeptical_emoji,
            R.drawable.sleepy_emoji, R.drawable.sobbing_emoji, R.drawable.speechless_emoji,
            R.drawable.successful_emoji, R.drawable.surprised_emoji, R.drawable.tired_emoji,
            R.drawable.wacky_emoji, R.drawable.warm_emoji, R.drawable.weary_emoji,
            R.drawable.worried_emoji };

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.emoji_selector, null);
        gridView=rootView.findViewById(R.id.gridviewemoji);

        EmojiHelper adapter = new EmojiHelper(getActivity(), nameList, emojiIcons);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long id) {
                Toast.makeText(getActivity(), nameList[pos], Toast.LENGTH_SHORT).show();
                String selectedName =nameList[pos];
                int selectedImage = emojiIcons[pos];



            }
        });

        return rootView;
    }
}