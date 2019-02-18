package mad155.kmathes.mad155module5etchingcollection;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DisplayMovieList extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_display_movie_list);

        System.out.println("HELLO, I AM HERE IN DISPLAYMOVIELIST");

        Bundle b=this.getIntent().getExtras();

        //..array
        String[] movieArray = b.getStringArray("movieArray");

        //.. array list
        //ArrayList<String> movieArrayListDisplay = new ArrayList<String>();
        //movieArrayListDisplay = b.getStringArrayList("movieArrayList");

        //String[] kamArray = b.getStringArray("movieArrayList");

        //if (b.getStringArrayList("movieArrayList").isEmpty()) {
        //    System.out.println("YOU TOTALLY SUCK KAREN");
        //} else {
        //    System.out.println("NOT EMPTY");
        //    System.out.println("Element1: " + movieArrayListDisplay.get(0));
        //    System.out.println("Element2: " + movieArrayListDisplay.get(1));

        //}

        //String[] kamTest = {"this", "is", "so", "annoying"};

        //if(kamArray[0].isEmpty()) {
        //    System.out.println("KamArray[0] is empty");
        //}
        //if(kamArray[1].isEmpty()) {
        //    System.out.println("KamArray[1] is empty");
        //}

        if(movieArray!=null && movieArray.length>0){
            System.out.println(movieArray.length);
        } else {
            System.out.println("Array is not initialized or empty");
        }

        //System.out.println("kamArray[0]:" + kamArray[0] + " kamArray[1]:" + kamArray[1]);

        //List<String> displayList = new ArrayList<>(Arrays.asList(kamTest));

        //ArrayList<String> displayArrayList = b.getStringArrayList("MovieArrayList");

        //setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_display_movie_list, R.id.movies, kamArray));
        //setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_display_movie_list, R.id.movies, movieArray));
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_display_movie_list, R.id.movies, movieArray));

        System.out.println("HELLO, I AM HERE IN DISPLAYMOVIELIST");

    }
}
