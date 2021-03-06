package com.beyondzero.loise.marathon;

import android.graphics.Color;
import android.graphics.Point;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.Projection;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;

public class RoutesActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;



   /* final LatLng target = new  LatLng (-1.304128, 36.824233);
    final long duration = 400;
    final Handler handler = new Handler();
    final long start = SystemClock.uptimeMillis();
    final Marker marker=mMap.addMarker(new MarkerOptions().position(new LatLng(-1.302810, 36.825408)));
    final Projection proj = mMap.getProjection();*/

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_routes);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);



        /*Point startPoint = proj.toScreenLocation(marker.getPosition());
        final LatLng startLatLng = proj.fromScreenLocation(startPoint);

        final Interpolator interpolator = new LinearInterpolator();
        handler.post(new Runnable() {
            @Override
            public void run() {
                long elapsed = SystemClock.uptimeMillis() - start;
                float t = interpolator.getInterpolation((float) elapsed / duration);
                double lng = t * target.longitude + (1 - t) * startLatLng.longitude;
                double lat = t * target.latitude + (1 - t) * startLatLng.latitude;
                marker.setPosition(new LatLng(-1.302810, 36.825408));
                if (t < 1.0) {
                    // Post again 10ms later.
                    handler.postDelayed(this, 10);
                } else {
                    // animation ended
                }
            }
        });*/
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in nyayostadium and move the camera
        LatLng nyayostadium = new LatLng(-1.302810, 36.825408);
       // LatLng nyayostadium = new LatLng(-18.142, 178.431);
        mMap.addMarker(new MarkerOptions().position(nyayostadium).title("STARTING POINT"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(nyayostadium, 15));
        mMap.animateCamera(CameraUpdateFactory.zoomTo(15), 2000, null);




        PolylineOptions shortrace= new PolylineOptions()
                .add(new LatLng(-1.302810, 36.825408),
                        new LatLng(-1.302665, 36.825349),
                        new LatLng(-1.302477, 36.825279),
                        new LatLng(-1.302338, 36.825215),
                        new LatLng(-1.302188, 36.825151),
                        new LatLng(-1.302032, 36.825076),
                        new LatLng(-1.301882, 36.824990),
                        new LatLng(-1.301726, 36.824920),
                        new LatLng(-1.301463, 36.824791),
                        new LatLng(-1.301265, 36.824705),
                        new LatLng(-1.301056, 36.824608),
                        new LatLng(-1.300895, 36.824538),
                        new LatLng(-1.300718, 36.824447),
                        new LatLng(-1.300321, 36.824265),
                        new LatLng(-1.300085, 36.824168),
                        new LatLng(-1.300031, 36.824147),
                        new LatLng(-1.300036, 36.824088),
                        new LatLng(-1.300015, 36.824018),
                        new LatLng(-1.299956, 36.823980),
                        new LatLng(-1.299870, 36.823953),
                        new LatLng(-1.299768, 36.824007),
                        new LatLng(-1.299682, 36.824039),
                        new LatLng(-1.299623, 36.824007),
                        new LatLng(-1.299382, 36.823969),
                        new LatLng(-1.299261, 36.823949),
                        new LatLng(-1.299111, 36.823919),
                        new LatLng(-1.298969, 36.823881),
                        new LatLng(-1.298846, 36.823860),
                        new LatLng(-1.298717, 36.823812),
                        new LatLng(-1.298615, 36.823782),
                        new LatLng(-1.298543, 36.823744),
                        new LatLng(-1.298452, 36.823709),
                        new LatLng(-1.298355, 36.823671),
                        new LatLng(-1.298285, 36.823636),
                        new LatLng(-1.298186, 36.823585),
                        new LatLng(-1.298073, 36.823507),
                        new LatLng(-1.297971, 36.823459),
                        //large gaps
                        new LatLng(-1.296917, 36.822815),
                        new LatLng(-1.296027, 36.822289),
                        new LatLng(-1.295721, 36.822101),
                        new LatLng(-1.295378, 36.821903),
                        new LatLng(-1.295126, 36.821764),
                        new LatLng(-1.294737, 36.821520),
                        new LatLng(-1.294461, 36.821346),
                        new LatLng(-1.294158, 36.821166),
                        new LatLng(-1.293820, 36.820954),
                        new LatLng(-1.293520, 36.820782),
                        new LatLng(-1.293281, 36.820632),
                        new LatLng(-1.293107, 36.820525),
                        new LatLng(-1.293005, 36.820463),
                        new LatLng(-1.292927, 36.820428),
                        //HAILE SELLASE ROUND ABOUT
                        new LatLng(-1.292908, 36.820358),
                        new LatLng(-1.292881, 36.820299),
                        new LatLng(-1.292830, 36.820240),
                        new LatLng(-1.292843, 36.820202),
                        new LatLng(-1.292846, 36.820143),
                        new LatLng(-1.292838, 36.820076),
                        new LatLng(-1.292846, 36.819961),
                        new LatLng(-1.292859, 36.819883),
                        new LatLng(-1.292872, 36.819781),
                        new LatLng(-1.292910, 36.819623),
                        //BIGG GAPS
                        new LatLng(-1.293033, 36.819006),
                        new LatLng(-1.293178, 36.818317),
                        new LatLng(-1.293393, 36.817177),
                        //cathdral corner
                        new LatLng(-1.293474, 36.816870),
                        new LatLng(-1.293503, 36.816757),
                        new LatLng(-1.293495, 36.816717),
                        new LatLng(-1.293441, 36.816687),
                        new LatLng(-1.293401, 36.816668),
                        new LatLng(-1.293294, 36.816647),
                        //cathedral left turn
                        new LatLng(-1.293203, 36.816620),
                        new LatLng(-1.293172, 36.816587),
                        new LatLng(-1.293164, 36.816536),
                        new LatLng(-1.293142, 36.816421),
                        //cathedral road
                        new LatLng(-1.293091, 36.816316),
                        new LatLng(-1.293059, 36.816295),
                        new LatLng(-1.293013, 36.816271),
                        new LatLng(-1.292892, 36.816223),
                        new LatLng(-1.292726, 36.816159),
                        new LatLng(-1.292605, 36.816105),
                        new LatLng(-1.292412, 36.815998),
                        new LatLng(-1.292305, 36.815939),
                        new LatLng(-1.292139, 36.815826),
                        new LatLng(-1.292046, 36.815761),
                        new LatLng(-1.291958, 36.815694),
                        new LatLng(-1.291851, 36.815622),
                        new LatLng(-1.291451, 36.815389),
                        new LatLng(-1.291116, 36.815209),
                        new LatLng(-1.290698, 36.815002),
                        new LatLng(-1.290572, 36.814922),
                        new LatLng(-1.290513, 36.814879),
                        new LatLng(-1.290457, 36.814815),
                        new LatLng(-1.290398, 36.814740),
                        new LatLng(-1.290342, 36.814617),
                        new LatLng(-1.290296, 36.814518),
                        new LatLng(-1.290258, 36.814435),
                        new LatLng(-1.290237, 36.814365),
                        new LatLng(-1.290245, 36.814250),
                        //cathedral-ngong road turn left
                        new LatLng(-1.290261, 36.814199),
                        new LatLng(-1.290285, 36.814186),
                        new LatLng(-1.290331, 36.814205),
                        new LatLng(-1.290387, 36.814251),
                        new LatLng(-1.290446, 36.814283),
                        new LatLng(-1.290497, 36.814315),
                        new LatLng(-1.290575, 36.814361),
                        new LatLng(-1.290658, 36.814388),
                        new LatLng(-1.290757, 36.814415),
                        new LatLng(-1.290848, 36.814426),
                        new LatLng(-1.290955, 36.814406),
                        new LatLng(-1.291062, 36.814374),
                        new LatLng(-1.291185, 36.814299),
                        new LatLng(-1.291241, 36.814256),
                        new LatLng(-1.291292, 36.814200),
                        new LatLng(-1.291330, 36.814146),
                        new LatLng(-1.291373, 36.814041),
                        new LatLng(-1.291416, 36.813936),
                        new LatLng(-1.291456, 36.813791),
                        new LatLng(-1.291475, 36.813702),
                        new LatLng(-1.291558, 36.813490),
                        new LatLng(-1.291641, 36.813340),
                        new LatLng(-1.291732, 36.813270),
                        new LatLng(-1.291823, 36.813195),
                        new LatLng(-1.291968, 36.813104),
                        new LatLng(-1.292121, 36.813007),
                        new LatLng(-1.292722, 36.812610),
                        new LatLng(-1.293269, 36.812232),
                        new LatLng(-1.293400, 36.812152),
                        new LatLng(-1.293467, 36.812104),
                        new LatLng(-1.293502, 36.812056),
                        new LatLng(-1.293545, 36.812013),
                        new LatLng(-1.293596, 36.811973),
                        new LatLng(-1.293666, 36.811925),
                        new LatLng(-1.293741, 36.811869),
                        new LatLng(-1.293864, 36.811756),
                        new LatLng(-1.294028, 36.811608),
                        new LatLng(-1.294342, 36.811241),
                        new LatLng(-1.294479, 36.811072),
                        new LatLng(-1.294594, 36.810927),
                        new LatLng(-1.294693, 36.810710),
                        new LatLng(-1.294816, 36.810541),
                        new LatLng(-1.294993, 36.810270),
                        new LatLng(-1.295140, 36.810031),
                        new LatLng(-1.295392, 36.809658),
                        new LatLng(-1.295456, 36.809572),
                        new LatLng(-1.295660, 36.809277),
                        new LatLng(-1.296003, 36.808781),
                        new LatLng(-1.296164, 36.808499),
                        new LatLng(-1.296373, 36.808182),
                        new LatLng(-1.296574, 36.807874),
                        new LatLng(-1.296754, 36.807557),
                        new LatLng(-1.296872, 36.807348),
                        new LatLng(-1.296893, 36.807292),
                        new LatLng(-1.296912, 36.807230),
                        new LatLng(-1.296952, 36.807128),
                        new LatLng(-1.296995, 36.806954),
                        new LatLng(-1.297006, 36.806868),
                        new LatLng(-1.297049, 36.806712),
                        new LatLng(-1.297111, 36.806471),
                        new LatLng(-1.297218, 36.805999),
                        new LatLng(-1.297293, 36.805715),
                        new LatLng(-1.297583, 36.804371),
                        new LatLng(-1.297617, 36.804271),
                        new LatLng(-1.297681, 36.804056),
                        new LatLng(-1.297761, 36.803898),
                        new LatLng(-1.297785, 36.803796),
                        new LatLng(-1.297814, 36.803673),
                        //mbagathi roundabout
                        new LatLng(-1.297896, 36.803462),
                        new LatLng(-1.297943, 36.803359),
                        new LatLng(-1.298050, 36.803281),
                        new LatLng(-1.298216, 36.803174),
                        new LatLng(-1.298329, 36.803088),
                        new LatLng(-1.298401, 36.803050),
                        //MBANGATHI ROAD
                        new LatLng(-1.298425, 36.803047),
                        new LatLng(-1.298776, 36.803068),
                        new LatLng(-1.299444, 36.803162),
                        new LatLng(-1.299538, 36.803166),
                        new LatLng(-1.299669, 36.803171),
                        new LatLng(-1.299857, 36.803158),
                        new LatLng(-1.300227, 36.803072),
                        new LatLng(-1.300291, 36.803053),
                        new LatLng(-1.300342, 36.803032),
                        new LatLng(-1.300436, 36.802978),
                        new LatLng(-1.300573, 36.802906),
                        new LatLng(-1.300892, 36.802699),
                        new LatLng(-1.300970, 36.802648),
                        new LatLng(-1.301050, 36.802610),
                        new LatLng(-1.301106, 36.802575),
                        new LatLng(-1.301205, 36.802521),
                        new LatLng(-1.301334, 36.802454),
                        new LatLng(-1.301401, 36.802427),
                        new LatLng(-1.301530, 36.802376),
                        new LatLng(-1.301616, 36.802360),
                        new LatLng(-1.301699, 36.802355),
                        new LatLng(-1.301785, 36.802360),
                        new LatLng(-1.301823, 36.802360),
                        new LatLng(-1.301866, 36.802360),
                        new LatLng(-1.301912, 36.802363),
                        new LatLng(-1.302014, 36.802384),
                        new LatLng(-1.302116, 36.802408),
                        new LatLng(-1.302465, 36.802494),
                        new LatLng(-1.302588, 36.802532),
                        new LatLng(-1.302947, 36.802629),
                        new LatLng(-1.303515, 36.802779),
                        new LatLng(-1.304105, 36.802913),
                        new LatLng(-1.304488, 36.802999),
                        new LatLng(-1.305140, 36.803136),
                        new LatLng(-1.305805, 36.803292),
                        new LatLng(-1.306052, 36.803379),
                        new LatLng(-1.306406, 36.803500),
                        new LatLng(-1.306481, 36.803535),
                        new LatLng(-1.306685, 36.803632),
                        new LatLng(-1.307060, 36.803782),
                        new LatLng(-1.307435, 36.803959),
                        new LatLng(-1.307617, 36.804042),
                        new LatLng(-1.308277, 36.804375),
                        new LatLng(-1.308856, 36.804681),
                        new LatLng(-1.309845, 36.805156),
                        new LatLng(-1.311113, 36.805798),
                        new LatLng(-1.311714, 36.806117),
                        new LatLng(-1.312728, 36.806659),
                        new LatLng(-1.313085, 36.806857),
                        new LatLng(-1.313300, 36.806996),
                        new LatLng(-1.313665, 36.807275),
                        new LatLng(-1.313909, 36.807490),
                        new LatLng(-1.314188, 36.807753),
                        new LatLng(-1.314475, 36.808161),
                        new LatLng(-1.314606, 36.808443),
                        new LatLng(-1.314657, 36.808612),
                        new LatLng(-1.314695, 36.808856),
                        new LatLng(-1.314722, 36.809242),
                        new LatLng(-1.314682, 36.809693),
                        new LatLng(-1.314620, 36.810095),
                        new LatLng(-1.314505, 36.810403),
                        new LatLng(-1.314309, 36.810945),
                        new LatLng(-1.313794, 36.812203),
                        new LatLng(-1.313231, 36.813716),
                        new LatLng(-1.312697, 36.815159),
                        new LatLng(-1.312544, 36.815585),
                        //T-MALL ROUNDABOUT
                        new LatLng(-1.312480, 36.815683),
                        new LatLng(-1.312459, 36.815707),
                        new LatLng(-1.312438, 36.815737),
                        new LatLng(-1.312417, 36.815838),
                        new LatLng(-1.312379, 36.815948),
                        new LatLng(-1.312341, 36.815995),
                        //langata road
                        new LatLng(-1.312279, 36.816070),
                        new LatLng(-1.312169, 36.816175),
                        new LatLng(-1.311576, 36.816674),
                        new LatLng(-1.310991, 36.817125),
                        new LatLng(-1.310452, 36.817573),
                        new LatLng(-1.309666, 36.818166),
                        new LatLng(-1.309068, 36.818606),
                        new LatLng(-1.308666, 36.818863),
                        new LatLng(-1.308403, 36.818989),
                        new LatLng(-1.307953, 36.819153),
                        new LatLng(-1.307575, 36.819306),
                        new LatLng(-1.307208, 36.819470),
                        // madaraka round bout
                        new LatLng(-1.307255, 36.819644),
                        new LatLng(-1.307258, 36.819728),
                        new LatLng(-1.307234, 36.819790),
                        new LatLng(-1.307178, 36.819841),
                        new LatLng(-1.307098, 36.819881),
                        //LANGATA ROAD
                        new LatLng(-1.306938, 36.819883),
                        new LatLng(-1.306871, 36.819947),
                        new LatLng(-1.306764, 36.820041),
                        new LatLng(-1.306689, 36.820142),
                        new LatLng(-1.306614, 36.820222),
                        new LatLng(-1.306560, 36.820308),
                        new LatLng(-1.306512, 36.820405),
                        new LatLng(-1.306458, 36.820534),
                        new LatLng(-1.306402, 36.820705),
                        new LatLng(-1.306362, 36.820826),
                        new LatLng(-1.306308, 36.821014),
                        new LatLng(-1.306252, 36.821186),
                        new LatLng(-1.306177, 36.821446),
                        new LatLng(-1.306056, 36.821878),
                        new LatLng(-1.305909, 36.822414),
                        new LatLng(-1.305869, 36.822594),
                        new LatLng(-1.305829, 36.822872),
                        new LatLng(-1.305722, 36.823626),
                        new LatLng(-1.305585, 36.824570),
                        new LatLng(-1.305491, 36.825096),
                        new LatLng(-1.305416, 36.825541),
                        new LatLng(-1.305277, 36.826018),
                        new LatLng(-1.305215, 36.826257),
                        new LatLng(-1.305194, 36.826325),
                        new LatLng(-1.305194, 36.826325),
                        new LatLng(-1.305250, 36.826465),
                        //LANGATA-LUSAKA-UHURUHIGHWAY-MBSA ROAD ROUND ABOUT
                        new LatLng(-1.305279, 36.826503),
                        //MOMBASA ROAD
                        new LatLng(-1.305456, 36.826594),
                        new LatLng(-1.307027, 36.827316),


                        new LatLng(-1.309132, 36.828284),
                        new LatLng(-1.310561, 36.829024),
                        new LatLng(-1.312098, 36.829713),
                        new LatLng(-1.313659, 36.830464),
                        new LatLng(-1.314010, 36.830638),
                        new LatLng(-1.314056, 36.830665),
                        new LatLng(-1.314123, 36.830703),
                        new LatLng(-1.314185, 36.830743),
                        new LatLng(-1.314472, 36.830941),
                        new LatLng(-1.314673, 36.831078),
                        new LatLng(-1.315110, 36.831424),
                        new LatLng(-1.315263, 36.831545),
                        new LatLng(-1.315510, 36.831784),
                        new LatLng(-1.315719, 36.831985),
                        new LatLng(-1.315934, 36.832218),
                        new LatLng(-1.316253, 36.832585),
                        new LatLng(-1.316382, 36.832738),
                        new LatLng(-1.316433, 36.832821),
                        new LatLng(-1.317549, 36.834634),
                        new LatLng(-1.318707, 36.836538),
                        new LatLng(-1.319380, 36.837702),
                        new LatLng(-1.319745, 36.838297),
                        new LatLng(-1.320646, 36.839743),
                        new LatLng(-1.320981, 36.840317),
                        new LatLng(-1.321539, 36.841234),
                        new LatLng(-1.322240, 36.842415),
                        new LatLng(-1.322693, 36.843150),
                        new LatLng(-1.323441, 36.844400),
                        new LatLng(-1.324066, 36.845462),
                        new LatLng(-1.324391, 36.846040),
                        new LatLng(-1.324858, 36.846893),
                        new LatLng(-1.325126, 36.847387),
                        new LatLng(-1.325284, 36.847653),
                        new LatLng(-1.325718, 36.848361),
                        new LatLng(-1.325871, 36.848616),
                        new LatLng(-1.326029, 36.848839),
                        new LatLng(-1.326077, 36.848914),
                        new LatLng(-1.326243, 36.849206),
                        new LatLng(-1.326436, 36.849549),
                        new LatLng(-1.326929, 36.850405),
                        new LatLng(-1.327881, 36.852004),
                        new LatLng(-1.328533, 36.853104),
                        new LatLng(-1.329111, 36.854079),
                        new LatLng(-1.329417, 36.854602),
                        new LatLng(-1.329814, 36.855281),
                        new LatLng(-1.330192, 36.855911),
                        new LatLng(-1.330191, 36.855889),
                        new LatLng(-1.330326, 36.856134),


                       // new LatLng(-1.328529, 36.853083),
                       // new LatLng(-1.329274, 36.854333),

                        new LatLng(-1.330347, 36.856173),
                        new LatLng(-1.330497, 36.856404),
                        new LatLng(-1.330717, 36.856844),
                        new LatLng(-1.330862, 36.857171),
                        new LatLng(-1.330921, 36.857316),
                        new LatLng(-1.331007, 36.857579),
                        new LatLng(-1.331130, 36.858019),
                        new LatLng(-1.331205, 36.858234),
                        new LatLng(-1.331269, 36.858481),
                        new LatLng(-1.331339, 36.858787),
                        new LatLng(-1.331398, 36.859232),
                        new LatLng(-1.331468, 36.859908),
                        new LatLng(-1.331468, 36.859954),
                        new LatLng(-1.331447, 36.860582),
                        new LatLng(-1.331409, 36.861365),
                        new LatLng(-1.331334, 36.862132),
                        new LatLng(-1.331103, 36.863666),
                        new LatLng(-1.330974, 36.864540),
                        new LatLng(-1.330867, 36.865473),
                        new LatLng(-1.330760, 36.866299),
                        new LatLng(-1.330669, 36.866970),
                        new LatLng(-1.330551, 36.867748),
                        new LatLng(-1.330503, 36.868166),
                        new LatLng(-1.330444, 36.868622),
                        //TURNING BACK
                        new LatLng(-1.330417, 36.868634),
                        new LatLng(-1.330379, 36.868647),
                        new LatLng(-1.330360, 36.868628),
                        new LatLng(-1.330368, 36.868564),
                        //route back
                        new LatLng(-1.330446, 36.868167),
                        new LatLng(-1.330489, 36.867818),
                        new LatLng(-1.330636, 36.866794),
                        new LatLng(-1.330727, 36.866043),
                        new LatLng(-1.330963, 36.864345),
                        new LatLng(-1.331113, 36.863275),
                        new LatLng(-1.331250, 36.862347),
                        new LatLng(-1.331320, 36.861762),
                        new LatLng(-1.331368, 36.861287),
                        new LatLng(-1.331411, 36.860595),
                        new LatLng(-1.331430, 36.860182),
                        new LatLng(-1.331417, 36.859892),
                        new LatLng(-1.331390, 36.859635),
                        new LatLng(-1.331369, 36.859410),
                        new LatLng(-1.331310, 36.858994),
                        new LatLng(-1.331205, 36.858525),
                        new LatLng(-1.331159, 36.858316),
                        new LatLng(-1.330990, 36.857704),
                        new LatLng(-1.330907, 36.857460),
                        new LatLng(-1.330800, 36.857194),
                        new LatLng(-1.330706, 36.856969),
                        new LatLng(-1.330599, 36.856746),
                        new LatLng(-1.330484, 36.856518),
                        new LatLng(-1.330259, 36.856124),
                        new LatLng(-1.330079, 36.855805),
                        new LatLng(-1.329867, 36.855464),
                        new LatLng(-1.329669, 36.855131),
                        new LatLng(-1.329449, 36.854777),
                        new LatLng(-1.328988, 36.853980),
                        new LatLng(-1.328621, 36.853352),
                        new LatLng(-1.328575, 36.853301),
                        new LatLng(-1.328594, 36.853323),
                        new LatLng(-1.328532, 36.853218),
                        new LatLng(-1.328511, 36.853199),
                        new LatLng(-1.328120, 36.852520),
                        new LatLng(-1.327686, 36.851798),
                        new LatLng(-1.327120, 36.850846),
                        new LatLng(-1.326497, 36.849753),
                        new LatLng(-1.326044, 36.848981),
                        new LatLng(-1.325918, 36.848791),
                        new LatLng(-1.325693, 36.848426),
                        new LatLng(-1.325575, 36.848246),
                        new LatLng(-1.325229, 36.847669),
                        new LatLng(-1.325001, 36.847251),
                        new LatLng(-1.324907, 36.847098),
                        new LatLng(-1.324794, 36.846913),
                        new LatLng(-1.324582, 36.846503),
                        new LatLng(-1.324445, 36.846251),
                        new LatLng(-1.324217, 36.845846),
                        new LatLng(-1.323895, 36.845296),
                        new LatLng(-1.323520, 36.844623),
                        new LatLng(-1.323209, 36.844124),
                        new LatLng(-1.322885, 36.843574),
                        new LatLng(-1.322609, 36.843142),
                        new LatLng(-1.322427, 36.842820),
                        new LatLng(-1.322164, 36.842388),
                        new LatLng(-1.321727, 36.841650),
                        new LatLng(-1.321437, 36.841167),
                        new LatLng(-1.321056, 36.840553),
                        new LatLng(-1.320898, 36.840271),
                        new LatLng(-1.320603, 36.839772),
                        new LatLng(-1.319967, 36.838774),
                        new LatLng(-1.319691, 36.838323),
                        new LatLng(-1.318889, 36.836963),
                        new LatLng(-1.318055, 36.835555),
                        new LatLng(-1.317098, 36.833991),
                        new LatLng(-1.316591, 36.833162),
                        new LatLng(-1.316355, 36.832800),
                        new LatLng(-1.316283, 36.832701),
                        new LatLng(-1.316227, 36.832639),
                        new LatLng(-1.315559, 36.831904),
                        new LatLng(-1.315417, 36.831778),
                        new LatLng(-1.315221, 36.831593),
                        new LatLng(-1.315055, 36.831462),
                        new LatLng(-1.314814, 36.831269),
                        new LatLng(-1.314406, 36.830966),
                        new LatLng(-1.314135, 36.830776),
                        new LatLng(-1.314033, 36.830706),
                        new LatLng(-1.313212, 36.830309),
                        new LatLng(-1.312311, 36.829883),
                        new LatLng(-1.311356, 36.829438),
                        new LatLng(-1.310380, 36.828979),
                        new LatLng(-1.309205, 36.828392),
                        new LatLng(-1.307843, 36.827756),
                        new LatLng(-1.306888, 36.827313),
                        new LatLng(-1.305636, 36.826752),
                        new LatLng(-1.305451, 36.826653),
                        new LatLng(-1.305274, 36.826540),
                        //LANGATA ROUNDABOUT
                        new LatLng(-1.305236, 36.826510),
                        new LatLng(-1.305225, 36.826454),
                        new LatLng(-1.305201, 36.826398),
                        new LatLng(-1.305145, 36.826304),
                        new LatLng(-1.305091, 36.826261),
                        new LatLng(-1.305005, 36.826215),
                        new LatLng(-1.304954, 36.826196),
                        new LatLng(-1.304933, 36.826177),
                        new LatLng(-1.304936, 36.826139),
                        new LatLng(-1.304976, 36.826085),
                        new LatLng(-1.305048, 36.825972),
                        new LatLng(-1.305120, 36.825841),
                        new LatLng(-1.305184, 36.825707),
                        new LatLng(-1.305222, 36.825527),
                        new LatLng(-1.305262, 36.825315),
                        new LatLng(-1.305291, 36.825060),
                        new LatLng(-1.305334, 36.824668),
                        new LatLng(-1.305436, 36.823887),
                        new LatLng(-1.305471, 36.823554),
                        new LatLng(-1.305610, 36.822824),
                        new LatLng(-1.305733, 36.822304),
                        new LatLng(-1.305913, 36.821743),
                        new LatLng(-1.305996, 36.821384),
                        new LatLng(-1.306076, 36.821030),
                        new LatLng(-1.306210, 36.820654),
                        new LatLng(-1.306202, 36.820627),
                        new LatLng(-1.306197, 36.820600),
                        new LatLng(-1.306173, 36.820613),
                        new LatLng(-1.306130, 36.820648),
                        new LatLng(-1.306101, 36.820675),

                        //aedrome road and entrancce to nyayostadium
                        new LatLng(-1.306037, 36.820749),
                        new LatLng(-1.305809, 36.821092),
                        new LatLng(-1.305594, 36.821441),
                        new LatLng(-1.305211, 36.822203),
                        new LatLng(-1.305053, 36.822463),
                        new LatLng(-1.304900, 36.822670),
                        new LatLng(-1.304777, 36.822812),
                        new LatLng(-1.305099, 36.823134),
                        new LatLng(-1.305002, 36.824137),
                        //nyayo stadium arena

                        new LatLng(-1.304846, 36.824378),
                        new LatLng(-1.304916, 36.824228),
                        new LatLng(-1.304849, 36.824317),
                        new LatLng(-1.304828, 36.824377),
                        new LatLng(-1.304868, 36.824417),
                        new LatLng(-1.304903, 36.824484),
                        new LatLng(-1.304924, 36.824548),
                        new LatLng(-1.304945, 36.824647),
                        new LatLng(-1.304883, 36.824872),
                        new LatLng(-1.304840, 36.824928),
                        new LatLng(-1.304794, 36.824963),
                        new LatLng(-1.304730, 36.825017),
                        new LatLng(-1.304636, 36.825055),
                        new LatLng(-1.304539, 36.825079),
                        new LatLng(-1.304418, 36.825079),
                        new LatLng(-1.303839, 36.825074),
                        new LatLng(-1.303708, 36.825074),
                        new LatLng(-1.303593, 36.825058),
                        new LatLng(-1.303550, 36.825037),
                        new LatLng(-1.303499, 36.825013),
                        new LatLng(-1.303443, 36.824981),
                        new LatLng(-1.303408, 36.824949),
                        new LatLng(-1.303373, 36.824917),
                        new LatLng(-1.303338, 36.824879),
                        new LatLng(-1.303335, 36.824801),
                        new LatLng(-1.303308, 36.824702),
                        new LatLng(-1.303321, 36.824616),
                        new LatLng(-1.303342, 36.824536),
                        new LatLng(-1.303390, 36.824472),
                        new LatLng(-1.303444, 36.824402),
                        new LatLng(-1.303484, 36.824364),
                        new LatLng(-1.303554, 36.824324),
                        new LatLng(-1.303616, 36.824316),
                        new LatLng(-1.303715, 36.824305),
                        new LatLng(-1.303715, 36.824305),
                        new LatLng(-1.304122, 36.824279),
                        new LatLng(-1.304128, 36.824233)


                )
                .color(Color.BLUE).width(6);

              //  Polyline halfmarathon=mMap.addPolyline(tenkms);

               Polyline shorterrace=mMap.addPolyline(shortrace);








    }
}
