package loise.kbc.ui.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.Menu;
import android.view.View;

import br.liveo.Model.HelpLiveo;
import br.liveo.interfaces.OnItemClickListener;
import br.liveo.interfaces.OnPrepareOptionsMenuLiveo;
import br.liveo.navigationliveo.NavigationLiveo;
import loise.kbc.navigationviewpagerliveo.R;
import loise.kbc.ui.fragment.AdvertismentFragment;
import loise.kbc.ui.fragment.ContactsFragment;
import loise.kbc.ui.fragment.MainFragment;
import loise.kbc.ui.fragment.RadioFragment;
import loise.kbc.ui.fragment.TvFragment;
import loise.kbc.ui.fragment.ViewPagerFragment;

public class MainActivity extends NavigationLiveo implements OnItemClickListener {

    private HelpLiveo mHelpLiveo;

    @Override
    public void onInt(Bundle bundle) {

        // User Information
        this.userName.setText("KBC");
        this.userEmail.setText("Your Channel One TV");
        this.userPhoto.setImageResource(R.drawable.kbclogo);
        this.userBackground.setImageResource(R.drawable.ic_user_background);

        // Creating items navigation
        mHelpLiveo = new HelpLiveo();
        mHelpLiveo.add(getString(R.string.inbox), R.mipmap.tv);
        mHelpLiveo.add(getString(R.string.starred), R.mipmap.listen);
//        mHelpLiveo.addSubHeader(getString(R.string.categories)); //Item subHeader
        mHelpLiveo.add(getString(R.string.sent_mail), R.mipmap.news);
        mHelpLiveo.add(getString(R.string.drafts), R.mipmap.conta);
        mHelpLiveo.addSeparator(); // Item separator
        mHelpLiveo.add(getString(R.string.trash), R.mipmap.ad);
        mHelpLiveo.add(getString(R.string.spam), R.mipmap.ic_report_black_24dp);

        with(this).startingPosition(0) //Starting position in the list
                .addAllHelpItem(mHelpLiveo.getHelp())
                .colorNameSubHeader(R.color.nliveo_blue_colorPrimary)
                .colorItemSelected(R.color.nliveo_blue_colorPrimary)
                .footerItem(R.string.settings, R.mipmap.ic_settings_black_24dp)
                .setOnClickUser(onClickPhoto)
                .setOnPrepareOptionsMenu(onPrepare)
                .setOnClickFooter(onClickFooter)
                .build();

        int position = this.getCurrentPosition();
        this.setElevationToolBar(position != 2 ? 15 : 0);
    }

    @Override
    public void onItemClick(int position) {
        Fragment mFragment;
        FragmentManager mFragmentManager = getSupportFragmentManager();

        switch (position){
            case 0:
                mFragment = new TvFragment();
                break;
            case 1:
                mFragment = new RadioFragment();
                break;
            case 2:
                mFragment = new ViewPagerFragment();
                break;
            case 3:
                mFragment= new ContactsFragment();
                break;
            case 5:
                mFragment= new AdvertismentFragment();
                break;

            default:
                mFragment = MainFragment.newInstance(mHelpLiveo.get(position).getName());
                break;
        }

        if (mFragment != null){
            mFragmentManager.beginTransaction().replace(R.id.container, mFragment).commit();
        }

        setElevationToolBar(position != 2 ? 15 : 0);
    }

    private OnPrepareOptionsMenuLiveo onPrepare = new OnPrepareOptionsMenuLiveo() {
        @Override
        public void onPrepareOptionsMenu(Menu menu, int position, boolean visible) {
        }
    };

    private View.OnClickListener onClickPhoto = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            closeDrawer();
        }
    };

    private View.OnClickListener onClickFooter = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            closeDrawer();
        }
    };
}
