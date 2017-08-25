package usuario.app.calculodesalario;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class SalarioActivity extends AppCompatActivity {
    RadioGroup percentageRadioGroup;
    EditText salaryEditText;
    Button calculateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salario);

        percentageRadioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        salaryEditText = (EditText) findViewById(R.id.salaryEditText);
        salaryEditText.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL);

        calculateButton = (Button) findViewById(R.id.calculateBtn);
    }

    public void calculateSalary(View view) {

    }
}
