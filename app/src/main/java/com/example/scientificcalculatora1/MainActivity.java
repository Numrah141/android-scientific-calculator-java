package com.example.scientificcalculatora1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    Button btnlog, btndel, btnclear, btnpower, btndivide, btndot, btnplus, btnminus, btnequals, btnmultiply;
    Button btnsin, btncos, btntan, btnln, btnpi, btne, btnsqrt, btnfactorial, btnopenbracket, btnclosebracket, btnmod;

    ImageButton btnlandscape;
    TextView answerview;
    EditText inputview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        btnlandscape = findViewById(R.id.btnlandscape);
        btnlandscape.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Landscapescreen.class);
                startActivity(intent);
            }
        });

        // Initialize all views and set click listeners directly
        answerview = findViewById(R.id.answerview);
        inputview = findViewById(R.id.inputview);

        // Number buttons
        btn0 = findViewById(R.id.btn0);
        btn0.setOnClickListener(this);
        btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(this);
        btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(this);
        btn3 = findViewById(R.id.btn3);
        btn3.setOnClickListener(this);
        btn4 = findViewById(R.id.btn4);
        btn4.setOnClickListener(this);
        btn5 = findViewById(R.id.btn5);
        btn5.setOnClickListener(this);
        btn6 = findViewById(R.id.btn6);
        btn6.setOnClickListener(this);
        btn7 = findViewById(R.id.btn7);
        btn7.setOnClickListener(this);
        btn8 = findViewById(R.id.btn8);
        btn8.setOnClickListener(this);
        btn9 = findViewById(R.id.btn9);
        btn9.setOnClickListener(this);

        // Basic operations
        btnplus = findViewById(R.id.btnplus);
        btnplus.setOnClickListener(this);
        btnminus = findViewById(R.id.btnminus);
        btnminus.setOnClickListener(this);
        btnmultiply = findViewById(R.id.btnmultiply);
        btnmultiply.setOnClickListener(this);
        btndivide = findViewById(R.id.btndivide);
        btndivide.setOnClickListener(this);
        btnequals = findViewById(R.id.btnequals);
        btnequals.setOnClickListener(this);
        btndot = findViewById(R.id.btndot);
        btndot.setOnClickListener(this);
        btnpower = findViewById(R.id.btnpower);
        btnpower.setOnClickListener(this);
        btnmod = findViewById(R.id.btnmod);
        btnmod.setOnClickListener(this);

        // Scientific functions
        btnsin = findViewById(R.id.btnsin);
        btnsin.setOnClickListener(this);
        btncos = findViewById(R.id.btncos);
        btncos.setOnClickListener(this);
        btntan = findViewById(R.id.btntan);
        btntan.setOnClickListener(this);
        btnlog = findViewById(R.id.btnlog);
        btnlog.setOnClickListener(this);
        btnln = findViewById(R.id.btnln);
        btnln.setOnClickListener(this);
        btnsqrt = findViewById(R.id.btnsqrt);
        btnsqrt.setOnClickListener(this);
        btnfactorial = findViewById(R.id.btnfactorial);
        btnfactorial.setOnClickListener(this);

        // Constants and controls
        btnpi = findViewById(R.id.btnpi);
        btnpi.setOnClickListener(this);
        btne = findViewById(R.id.btne);
        btne.setOnClickListener(this);
        btndel = findViewById(R.id.btndel);
        btndel.setOnClickListener(this);
        btnclear = findViewById(R.id.btnclear);
        btnclear.setOnClickListener(this);
        btnopenbracket = findViewById(R.id.btnopenbracket);
        btnopenbracket.setOnClickListener(this);
        btnclosebracket = findViewById(R.id.btnclosebracket);
        btnclosebracket.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        if (id == R.id.btn0) {
            inputview.append("0");
        }
        else if (id == R.id.btn1) {
            inputview.append("1");
        }
        else if (id == R.id.btn2) {
            inputview.append("2");
        }
        else if (id == R.id.btn3) {
            inputview.append("3");
        }
        else if (id == R.id.btn4) {
            inputview.append("4");
        }
        else if (id == R.id.btn5) {
            inputview.append("5");
        }
        else if (id == R.id.btn6) {
            inputview.append("6");
        }
        else if (id == R.id.btn7) {
            inputview.append("7");
        }
        else if (id == R.id.btn8) {
            inputview.append("8");
        }
        else if (id == R.id.btn9) {
            inputview.append("9");
        }
        else if (id == R.id.btnplus) {
            inputview.append("+");
        }
        else if (id == R.id.btnminus) {
            inputview.append("-");
        }
        else if (id == R.id.btnmultiply) {
            inputview.append("×");
        }
        else if (id == R.id.btndivide) {
            inputview.append("÷");
        }
        else if (id == R.id.btnpower) {
            inputview.append("^");
        }
        else if (id == R.id.btndot) {
            inputview.append(".");
        }
        else if (id == R.id.btnmod) {
            inputview.append("%");
        }
        else if (id == R.id.btnopenbracket) {
            inputview.append("(");
        }
        else if (id == R.id.btnclosebracket) {
            inputview.append(")");
        }
        else if (id == R.id.btnsin) {
            inputview.append("sin(");
        }
        else if (id == R.id.btncos) {
            inputview.append("cos(");
        }
        else if (id == R.id.btntan) {
            inputview.append("tan(");
        }
        else if (id == R.id.btnlog) {
            inputview.append("log(");
        }
        else if (id == R.id.btnln) {
            inputview.append("ln(");
        }
        else if (id == R.id.btnsqrt) {
            inputview.append("√(");
        }
        else if (id == R.id.btnfactorial) {
            handleFactorial();
        }
        else if (id == R.id.btnpi) {
            inputview.append("π");
        }
        else if (id == R.id.btne) {
            inputview.append("e");
        }
        else if (id == R.id.btndel) {
            String text = inputview.getText().toString();
            if (text.length() > 0) {
                text = text.substring(0, text.length() - 1);
                inputview.setText(text);
            }
        }
        else if (id == R.id.btnclear) {
            inputview.setText("");
            answerview.setText("0");
        }
        else if (id == R.id.btnequals) {
            calculateResult();
        }

        // Calculate operations for all buttons except equals, clear, delete, and factorial
        if (id != R.id.btnequals && id != R.id.btnclear && id != R.id.btndel && id != R.id.btnfactorial) {
            try {
                calculateoperations();
            } catch (Exception e) {
                answerview.setText("Error");
            }
        }
    }

    private void handleFactorial() {
        String currentText = inputview.getText().toString();

        if (currentText.isEmpty()) return;

        char lastChar = currentText.charAt(currentText.length() - 1);

        if (Character.isDigit(lastChar) || lastChar == ')') {
            inputview.append("!");

            String str = inputview.getText().toString();
            int factIndex = str.indexOf("!");
            String numStr = "";

            for (int i = factIndex - 1; i >= 0; i--) {
                char ch = str.charAt(i);
                if (Character.isDigit(ch) || ch == '.') {
                    numStr = ch + numStr;
                } else {
                    break;
                }
            }

            if (numStr.isEmpty()) {
                answerview.setText("Error");
            } else {
                try {
                    int num = (int) Double.parseDouble(numStr);

                    if (num < 0) {
                        answerview.setText("Error");
                    } else if (num == 0 || num == 1) {
                        answerview.setText("1");
                    } else {
                        long fact = 1;
                        for (int i = 2; i <= num; i++) {
                            fact *= i;
                        }
                        answerview.setText(String.valueOf(fact));
                    }
                } catch (Exception e) {
                    answerview.setText("Error");
                }
            }
        }
    }


    private void calculateResult() {
        try {
            String result = evaluateExpression(inputview.getText().toString());
            if (!result.equals("0") && !result.isEmpty() && !result.contains("Error")) {
                if (result.endsWith(".0")) {
                    result = result.substring(0, result.length() - 2);
                }
                answerview.setText(result);
                inputview.setText(result);
            }
        } catch (Exception e) {
            e.printStackTrace();
            answerview.setText("Error");
        }
    }

    public void calculateoperations() {
        try {
            String str = inputview.getText().toString();
            if (str.isEmpty()) {
                answerview.setText("0");
                return;
            }

            if (str.contains("!")) {
                handleFactorial();
                return;
            }

            String result = evaluateExpression(str);
            if (!result.contains("Error")) {
                answerview.setText(result);
            }
        } catch (Exception e) {
            answerview.setText("Error");
        }
    }

    private String evaluateExpression(String expression) {
        try {
            expression = expression.replace("×", "*").replace("÷", "/")
                    .replace("π", "3.14159").replace("e", "2.71828")
                    .replace("√", "sqrt");

            double result = eval(expression);
            return formatNumber(result);
        } catch (Exception e) {
            return "Error";
        }
    }

    private double eval(final String str) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                pos = pos + 1;
                if (pos < str.length()) {
                    ch = str.charAt(pos);
                } else {
                    ch = -1;
                }
            }


            boolean match(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
                return x;
            }

            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if      (match('+')) x += parseTerm();
                    else if (match('-')) x -= parseTerm();
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if      (match('*')) x *= parseFactor();
                    else if (match('/')) x /= parseFactor();
                    else if (match('%')) x %= parseFactor();
                    else return x;
                }
            }

            double parseFactor() {
                if (match('+')) return parseFactor();
                if (match('-')) return -parseFactor();

                double x;
                int startPos = this.pos;

                if (match('(')) {
                    x = parseExpression();
                    match(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') {
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') {
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();

                    if (func.equals("sqrt")) {
                        if (x < 0) throw new RuntimeException("Negative sqrt");
                        x = Math.sqrt(x);
                    }else if (func.equals("sin")) {
                        x = Math.sin(x);
                    } else if (func.equals("cos")) {
                        x = Math.cos(x);
                    } else if (func.equals("tan")) {
                        x = Math.tan(x);
                    } else if (func.equals("log")) {
                        if (x <= 0) throw new RuntimeException("Log <= 0");
                        x = Math.log10(x);
                    } else if (func.equals("ln")) {
                        if (x <= 0) throw new RuntimeException("Ln <= 0");
                        x = Math.log(x);
                    } else {
                        throw new RuntimeException("Unknown function: " + func);
                    }
                } else {
                    throw new RuntimeException("Unexpected: " + (char)ch);
                }

                if (match('^')) x = Math.pow(x, parseFactor());

                return x;
            }
        }.parse();
    }

    private String formatNumber(double number) {
        if (number == (long) number) {
            return String.valueOf((long) number);
        } else {
            return String.valueOf(number);
        }
    }
}
