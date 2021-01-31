package com.example.series;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<Series> seriesList;
    RecyclerView.LayoutManager LinearLayoutManager, gridLayoutManager;
    SeriesListAdapter seriesListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.RecyclerView);

        seriesList = new ArrayList<>();
        seriesList.add(new Series("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.imdb.com%2Ftitle%2Ftt5421602%2F&psig=AOvVaw00ykis4WFASgjcN6eL3BNp&ust=1612194397536000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCICUo6jCxu4CFQAAAAAdAAAAABAO", "Ann with E", "60 min | Comedy", "✰ 7,3"));
        seriesList.add(new Series("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTt5ccGjlnm4z8Mtdh397_i9l49KeiICCHiLlAYBuiDBGppQKyX", "Emily with Paris", "60 min | Comedy", "✰ 9,5"));
        seriesList.add(new Series("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.filmaffinity.com%2Fus%2Ffilm204759.html&psig=AOvVaw1GG2npV3YTznjBg6P6VeoS&ust=1612195378753000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCPjev4bGxu4CFQAAAAAdAAAAABAD", "Elite", "60 min | Comedy", "✰ 4,1"));
        seriesList.add(new Series("https://m.media-amazon.com/images/M/MV5BYTRiNDQwYzAtMzVlZS00NTI5LWJjYjUtMzkwNTUzMWMxZTllXkEyXkFqcGdeQXVyNDIzMzcwNjc@._V1_.jpg", "Game of thrones", "60 min | History", "✰ 8"));
        seriesList.add(new Series("https://www.google.com/url?sa=i&url=https%3A%2F%2Fmagazine99.com%2Flove-alarm-season-2-renewal-plot-release%2F&psig=AOvVaw0ec4n0wcwzWScsnK2_bSVU&ust=1612195569428000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCIi46tjGxu4CFQAAAAAdAAAAABAD", "Love alarm", "60 min | Drama", "✰ 5,8"));
        seriesList.add(new Series("https://www.google.com/url?sa=i&url=https%3A%2F%2Fen.wikipedia.org%2Fwiki%2FStart-Up_(South_Korean_TV_series)&psig=AOvVaw36j-iMWGlJQDP44_Pq6Lx0&ust=1612195627513000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCJCo2_HGxu4CFQAAAAAdAAAAABAD", "Start up", "60 min | Drama", "✰ 10"));

        LinearLayoutManager = new LinearLayoutManager(this);
        gridLayoutManager = new GridLayoutManager(this, 2);

        recyclerView.setLayoutManager(LinearLayoutManager);
        recyclerView.setHasFixedSize(true);

        seriesListAdapter = new SeriesListAdapter(this, seriesList);
        recyclerView.setAdapter(seriesListAdapter);

    }
}