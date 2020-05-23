package verdugo.rene.Calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import verdugo.rene.myapplication.R

class MainActivity : AppCompatActivity() {
    var num1: Double = 0.0
    var num2: Double = 0.0
    var resultado: Double = 0.0
    var operacion: String = ""
    var tipoOP: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_suma.setOnClickListener {
            //realizarOP()
            Sumar()
        }
        btn_resta.setOnClickListener {
            //realizarOP()
            restar()
        }
        btn_mul.setOnClickListener {
            //realizarOP()
            multiplicar()
        }
        btn_div.setOnClickListener {
            if (num1 >= 1 && num2 >= 1) {
                division()
            } else {
                Toast.makeText(this, "ERROR: Division por cero", Toast.LENGTH_LONG).show()
            }
        }
        btn_num1.setOnClickListener {
            if (operacion.equals("")) {
                operacion = "1"
            } else {
                operacion = operacion + "1"
            }
            tv_valor.setText("$operacion")
        }
        btn_num.setOnClickListener {
            if (operacion.equals("")) {
                operacion = "2"
            } else {
                operacion = operacion + "2"
            }
            tv_valor.setText("$operacion")
        }
        btn_num2.setOnClickListener {
            if (operacion.equals("")) {
                operacion = "3"
            } else {
                operacion = operacion + "3"
            }
            tv_valor.setText("$operacion")
        }
        btn_num3.setOnClickListener {
            if (operacion == "") {
                operacion = "4"
            } else {
                operacion += "4"
            }
            tv_valor.text = "$operacion+"
        }
        btn_num4.setOnClickListener {
            if (operacion.equals("")) {
                operacion = "5"
            } else {
                operacion += "5"
            }
            tv_valor.text = "$operacion"
        }
        btn_num5.setOnClickListener {
            if (operacion == "") {
                operacion = "6"
            } else {
                operacion = operacion + "6"
            }
            tv_valor.setText("$operacion")
        }
        btn_num6.setOnClickListener {
            if (operacion.equals("")) {
                operacion = "7"
            } else {
                operacion = operacion + "7"
            }
            tv_valor.setText("$operacion")
        }
        btn_num7.setOnClickListener {
            if (operacion.equals("")) {
                operacion = "8"
            } else {
                operacion = operacion + "8"
            }
            tv_valor.setText("$operacion")
        }
        btn_num8.setOnClickListener {
            if (operacion.equals("")) {
                operacion = "9"
            } else {
                operacion = operacion + "9"
            }
            tv_valor.setText("$operacion")
        }
        btn_num9.setOnClickListener {
            if (operacion.equals("")) {
                operacion = "0"
            } else {
                operacion = operacion + "0"
            }
            tv_valor.setText("$operacion")
        }
        btn_borrar.setOnClickListener {
            if (operacion.equals("")) {
                Toast.makeText(this, "No hay mas numeros a borrar", Toast.LENGTH_LONG).show()
            } else {
                operacion = operacion.substring(0, operacion.length - 1)
                tv_valor.setText("$operacion")
            }
        }
        btn_resultado.setOnClickListener {
            realizarOP()
        }

    }

    fun Sumar() {
        num1 = operacion.toDouble()
        tipoOP = "+"
        if (resultado == 0.0) {
            tv_operaciones.text = "$operacion+"
        } else {
            tv_operaciones.text = "$operacion+"
        }
        operacion = ""
        tv_valor.text = "$operacion+"
    }

    fun restar() {
        num1 = operacion.toDouble()
        tipoOP = "-"
        if (resultado == 0.0) {
            tv_operaciones.text = "$operacion+"
        } else {
            tv_operaciones.text = "$operacion+"
        }
        operacion = ""
        tv_valor.setText("$operacion")
    }

    fun multiplicar() {
        num1 = operacion.toDouble()
        tipoOP = "*"
        if (resultado == 0.0) {
            tv_operaciones.text = "$operacion*"
        } else {
            tv_operaciones.text = "$resultado*"
        }
        operacion = ""
        tv_valor.text = "$operacion"
    }

    fun division() {
        num1 = operacion.toDouble()
        tipoOP = "/"
        if (resultado == 0.0) {
            tv_operaciones.text = "$operacion/"
        } else {
            tv_operaciones.text = "$resultado/"
        }
        operacion = ""
        tv_valor.text = "$operacion"
    }

    fun realizarOP() {
        if (tipoOP == "+") {
            if (resultado == 0.0) {
                num2 = operacion.toDouble()
                resultado = num1 + num2
                tv_operaciones.text = "$resultado"
            } else {
                num2 = operacion.toDouble()
                resultado += num2
                tv_operaciones.text = "$resultado"
            }
        }
        if (tipoOP == "-") {
            if (resultado == 0.0) {
                num2 = operacion.toDouble()
                resultado = num1 - num2
                tv_operaciones.text = "$operacion+"
            } else {
                num2 = operacion.toDouble()
                resultado -= num2
                tv_operaciones.text = "$operacion+"
            }
        }
        if (tipoOP.equals("*")) {
            if (resultado == 0.0) {
                num2 = operacion.toDouble()
                resultado = num1 * num2
                tv_operaciones.setText("$resultado")
            } else {
                resultado = resultado * num2
                tv_operaciones.setText("$resultado")
            }
        }
        if (tipoOP.equals("/")) {
            if (num1 >= 1 && num2 >= 1) {
                if (resultado == 0.0) {
                    num2 = operacion.toDouble()
                    resultado = num1 / num2
                    tv_operaciones.setText("$resultado")
                } else {
                    resultado = resultado / num2
                    tv_operaciones.setText("$resultado")
                }
            } else {
                Toast.makeText(this, "ERROR: Division por cero", Toast.LENGTH_LONG).show()
            }
        }
    }

}
