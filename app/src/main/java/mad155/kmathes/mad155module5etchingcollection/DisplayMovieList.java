package mad155.kmathes.mad155module5etchingcollection;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class DisplayMovieList extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_display_movie_list);

        System.out.println("HELLO, I AM HERE IN DISPLAYMOVIELIST");

        Bundle b=this.getIntent().getExtras();

        int i = 0;

        //..array
        String[] movieArray = b.getStringArray("movieArray");

        List<String> kamList = new ArrayList<>();
        //kamList.addAll(Arrays.asList(movieArray));

        for (i=0; i< movieArray.length; i++) {
            if (movieArray[i].isEmpty() || movieArray[i] == null || movieArray[i].equalsIgnoreCase(" ")) {
                // do nothing
            } else {
                kamList.add(movieArray[i]);
            }
        }

        Collections.sort(kamList);


        if(movieArray!=null && movieArray.length>0){
            System.out.println(movieArray.length);
        } else {
            System.out.println("Array is not initialized or empty");
        }


        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_display_movie_list, R.id.movies, kamList));

        System.out.println("HELLO, I AM HERE IN DISPLAYMOVIELIST");

    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

       startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.imdb.com")));
    }
}
