package infsolution.com.br.infin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import infsolution.com.br.infin.dao.DaoUser;
import infsolution.com.br.infin.model.User;

public class FinMainActivity extends AppCompatActivity {
    private TextView nameUser;
    private DaoUser du;
    private User user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fin_main);
        nameUser = (TextView)findViewById(R.id.user_name);
        du = new DaoUser(this);
        user = du.getUser();
        du.close();
        if(user!=null){
            nameUser.setText(user.getName().toString());
        }
    }
}
