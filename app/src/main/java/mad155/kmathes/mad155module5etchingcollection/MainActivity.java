package mad155.kmathes.mad155module5etchingcollection;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    int categoryNbr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //.. to get logo on action bar. Does not work if you set style to no action bar
        //..  app will blow up
        //getSupportActionBar().setDisplayShowHomeEnabled(true);
        //getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        //getSupportActionBar().setDisplayUseLogoEnabled(true);

        final Spinner spnCat = (Spinner) findViewById(R.id.spnCategories);
        Button btnDisplay = (Button) findViewById(R.id.btnDisplayMovies);

        final String[][] myMovies =  {{"Romance", "Pride and Prejudice"},
                                {"Romance", "Sense and Sensibility"},
                                {"Scifi", "Serenity"}
                               };

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                categoryNbr = spnCat.getSelectedItemPosition();
                int i = 0;

                String[] movieDisplayList = new String[7];
                Arrays.fill(movieDisplayList, " ");
                boolean categoryFlag = false;

                System.out.println("CATEGORY IS : " + categoryNbr);

                switch (categoryNbr) {
                    case 0: {
                        //ALL
                        //.. read through whole array but build the array for output to use with listview
                        for (int row = 0; row < myMovies.length; row++) {
                            for (int col = 0; col < myMovies[row].length; col++) {
                                System.out.println(myMovies[row][col]);
                                //.. col 0 is the category .. col 1 is the movie name
                                if (col == 0) {
                                    movieDisplayList[i] = myMovies[row][1];
                                    i++;
                                    categoryFlag = true;
                                }
                            }
                        }
                        if(categoryFlag == false) {
                            movieDisplayList[0] = "No movies for this category";
                        }
                        break;
                    }
                    case 1: {
                        //Romance
                        //.. read through whole array but build the array for output to use with listview
                        for (int row = 0; row < myMovies.length; row++) {
                            for (int col = 0; col < myMovies[row].length; col++) {
                                System.out.println(myMovies[row][col]);
                                //.. col 0 is the category .. col 1 is the movie name
                                if (col == 0 && myMovies[row][col].equalsIgnoreCase("romance")) {
                                    movieDisplayList[i] = myMovies[row][1];
                                    i++;
                                    categoryFlag = true;
                                }
                            }
                        }
                        if(categoryFlag == false) {
                            movieDisplayList[0] = "No movies for this category";
                        }
                        break;
                    }
                    case 2: {
                        //Action
                        //.. read through whole array but build the array for output to use with listview
                        for (int row = 0; row < myMovies.length; row++) {
                            for (int col = 0; col < myMovies[row].length; col++) {
                                System.out.println(myMovies[row][col]);
                                //.. col 0 is the category .. col 1 is the movie name
                                if (col == 0 && myMovies[row][col].equalsIgnoreCase("action")) {
                                    movieDisplayList[i] = myMovies[row][1];
                                    i++;
                                }
                            }
                        }
                        if(categoryFlag == false) {
                            movieDisplayList[0] = "No movies for this category";
                        }
                        break;
                    }
                    case 3: {
                        //Scifi
                        //.. read through whole array but build the array for output to use with listview
                        for (int row = 0; row < myMovies.length; row++) {
                            for (int col = 0; col < myMovies[row].length; col++) {
                                System.out.println(myMovies[row][col]);
                                //.. col 0 is the category .. col 1 is the movie name
                                if (col == 0 && myMovies[row][col].equalsIgnoreCase("scifi")) {
                                    movieDisplayList[i] = myMovies[row][1];
                                    i++;
                                }
                            }
                        }
                        if(categoryFlag == false) {
                            movieDisplayList[0] = "No movies for this category";
                        }
                        break;
                    }
                    case 4: {
                        //Comdedy
                        //.. read through whole array but build the array for output to use with listview
                        for (int row = 0; row < myMovies.length; row++) {
                            for (int col = 0; col < myMovies[row].length; col++) {
                                System.out.println(myMovies[row][col]);
                                //.. col 0 is the category .. col 1 is the movie name
                                if (col == 0 && myMovies[row][col].equalsIgnoreCase("comedy")) {
                                    movieDisplayList[i] = myMovies[row][1];
                                    i++;
                                }
                            }
                        }
                        if(categoryFlag == false) {
                            movieDisplayList[0] = "No movies for this category";
                        }
                        break;
                    }
                    case 5: {
                        //Drama
                        //.. read through whole array but build the array for output to use with listview
                        for (int row = 0; row < myMovies.length; row++) {
                            for (int col = 0; col < myMovies[row].length; col++) {
                                System.out.println(myMovies[row][col]);
                                //.. col 0 is the category .. col 1 is the movie name
                                if (col == 0 && myMovies[row][col].equalsIgnoreCase("drama")) {
                                    movieDisplayList[i] = myMovies[row][1];
                                    i++;
                                }
                            }
                        }
                        if(categoryFlag == false) {
                            movieDisplayList[0] = "No movies for this category";
                        }
                        break;
                    }
                    case 6: {
                        //Family
                        //.. read through whole array but build the array for output to use with listview
                        for (int row = 0; row < myMovies.length; row++) {
                            for (int col = 0; col < myMovies[row].length; col++) {
                                System.out.println(myMovies[row][col]);
                                //.. col 0 is the category .. col 1 is the movie name
                                if (col == 0 && myMovies[row][col].equalsIgnoreCase("family")) {
                                    movieDisplayList[i] = myMovies[row][1];
                                    i++;
                                }
                            }
                        }
                        if(categoryFlag == false) {
                            movieDisplayList[0] = "No movies for this category";
                        }
                        break;
                    }
                    case 7: {
                        //Horror
                        //.. read through whole array but build the array for output to use with listview
                        for (int row = 0; row < myMovies.length; row++) {
                            for (int col = 0; col < myMovies[row].length; col++) {
                                System.out.println(myMovies[row][col]);
                                //.. col 0 is the category .. col 1 is the movie name
                                if (col == 0 && myMovies[row][col].equalsIgnoreCase("horror")) {
                                    movieDisplayList[i] = myMovies[row][1];
                                    i++;
                                }
                            }
                        }
                        if(categoryFlag == false) {
                            movieDisplayList[0] = "No movies for this category";
                        }
                        break;
                    }
                    case 8: {
                        //Mystery/Suspense
                        //.. read through whole array but build the array for output to use with listview
                        for (int row = 0; row < myMovies.length; row++) {
                            for (int col = 0; col < myMovies[row].length; col++) {
                                System.out.println(myMovies[row][col]);
                                //.. col 0 is the category .. col 1 is the movie name
                                if (col == 0 && myMovies[row][col].equalsIgnoreCase("mystery/suspence")) {
                                    movieDisplayList[i] = myMovies[row][1];
                                    i++;
                                }
                            }
                        }
                        if(categoryFlag == false) {
                            movieDisplayList[0] = "No movies for this category";
                        }
                        break;
                    }
                    case 9: {
                        //Not Categorized
                        //.. read through whole array but build the array for output to use with listview
                        for (int row = 0; row < myMovies.length; row++) {
                            for (int col = 0; col < myMovies[row].length; col++) {
                                System.out.println(myMovies[row][col]);
                                //.. col 0 is the category .. col 1 is the movie name
                                if (col == 0 && myMovies[row][col].equalsIgnoreCase("not categorized")) {
                                    movieDisplayList[i] = myMovies[row][1];
                                    i++;
                                }
                            }
                        }
                        if(categoryFlag == false) {
                            movieDisplayList[0] = "No movies for this category";
                        }
                        break;
                    }
                    default:
                        break;
                }

                Bundle b = new Bundle();
                b.putStringArray("movieArray", movieDisplayList);
                //b.putExtra("movieList", kamList1);

                Intent intent1 = new Intent(MainActivity.this, DisplayMovieList.class);
                intent1.putExtras(b);
                startActivity(intent1);

            }
        });

    }
}
