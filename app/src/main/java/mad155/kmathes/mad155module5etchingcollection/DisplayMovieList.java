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

        Bundle b=this.getIntent().getExtras();

        int i = 0;

        //..array
        String[] movieArray = b.getStringArray("movieArray");

        //String kamTestString1 = movieArray[0];
        //String kamTestString2;
        //kamTestString2 = kamTestString1.replaceAll("\\s", "+");
        //System.out.println("movieArray[0] = " + kamTestString1 + "kamTestString2 = " + kamTestString2);

        //String str = "a12.334tyz.78x";
        //str = str.replaceAll("[^\\d.]", "");

        //.. copy array into list to manipulate easier
        List<String> kamList = new ArrayList<>();

        for (i=0; i< movieArray.length; i++) {
            if (movieArray[i].isEmpty() || movieArray[i] == null || movieArray[i].equalsIgnoreCase(" ")) {
                // do nothing
            } else {
                kamList.add(movieArray[i]);
            }
        }
        //.. sort by names of movies
        Collections.sort(kamList);


        //if(movieArray!=null && movieArray.length>0){
        //    System.out.println(movieArray.length);
        //} else {
        //    System.out.println("Array is not initialized or empty");
        //}


        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_display_movie_list, R.id.movies, kamList));

        //System.out.println("HELLO, I AM HERE IN DISPLAYMOVIELIST");

    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        //.. get the movie that was selected
        String selectedValue = (String) getListAdapter().getItem(position);
        //.. System.out.printlns to test out parameter build
        //System.out.println("selected list value: " + selectedValue);
        //.. format movie name to use in Uri builder
        selectedValue = selectedValue.replaceAll("\\s", "+");
        //System.out.println("selected list value with plus signs: " + selectedValue);
        //String k1 = "pride+and+prejudice";

        //.. build Uri
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https")
                .authority("www.imdb.com")
                .appendPath("find")
                .appendQueryParameter("ref_","nv_sr_fn")
                .appendQueryParameter("q",selectedValue)
                .appendQueryParameter("s","all");

        String myUrl = builder.build().toString();

        //System.out.println("myUrl = " + myUrl);

        //.. example https://stackoverflow.com/questions/19167954/use-uri-builder-in-android-or-create-url-with-variables
        //https://www.myawesomesite.com/turtles/types?type=1&sort=relevance#section-name
        //Uri.Builder builder = new Uri.Builder();
        //builder.scheme("https")
        //        .authority("www.myawesomesite.com")
        //        .appendPath("turtles")
        //        .appendPath("types")
        //        .appendQueryParameter("type", "1")
        //        .appendQueryParameter("sort", "relevance")
        //        .fragment("section-name");
        //String myUrl = builder.build().toString();


        //startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.imdb.com")));
        //.. start external activity to to to IMDB page for movie selected
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(myUrl)));


    }
}
