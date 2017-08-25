package usuario.app.calculodesalario;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

import static android.support.v7.app.AlertDialog.*;

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
        double salary = Double.parseDouble(salaryEditText.getText().toString());
        int id = percentageRadioGroup.getCheckedRadioButtonId();
        double newSalary = 0;

        switch (id) {
            case R.id.fortyRadioButton:
                newSalary = multiplySalary(0.4, salary);
                break;
            case R.id.fortyFiveRadioButton:
                newSalary = multiplySalary(0.45, salary);
                break;
            case R.id.fiftyRadioButton:
                newSalary = multiplySalary(0.5, salary);
                break;
        }
        showSalaryDialog(newSalary);
    }

    private void showSalaryDialog(double salary) {
        Builder dialog = new Builder(SalarioActivity.this);
        dialog.setTitle("Novo Salário!");
        dialog.setMessage("Seu novo salário é: R$ " + salary);
        dialog.setNeutralButton("OK", null);
        dialog.show();
    }

    private double multiplySalary(double multiplier, double salary) { return salary + (salary * multiplier); }
}
