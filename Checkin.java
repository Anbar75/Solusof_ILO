package mx.virta.antoniobarajas.siesmex;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.telephony.TelephonyManager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static mx.virta.antoniobarajas.siesmex.R.id.textView4;
import static mx.virta.antoniobarajas.siesmex.R.id.textView55;
import static mx.virta.antoniobarajas.siesmex.R.id.textView56;
import static mx.virta.antoniobarajas.siesmex.R.id.textView57;
import static mx.virta.antoniobarajas.siesmex.R.id.textView58;
import static mx.virta.antoniobarajas.siesmex.R.id.textView59;
import static mx.virta.antoniobarajas.siesmex.R.id.textView71;
import static mx.virta.antoniobarajas.siesmex.R.id.textView74;
import static mx.virta.antoniobarajas.siesmex.R.id.textView75;
import static mx.virta.antoniobarajas.siesmex.R.id.textView76;
import static mx.virta.antoniobarajas.siesmex.R.id.textView77;
import static mx.virta.antoniobarajas.siesmex.R.id.textView78;
import static mx.virta.antoniobarajas.siesmex.R.id.textView85;
import static mx.virta.antoniobarajas.siesmex.R.id.textView86;
import static mx.virta.antoniobarajas.siesmex.R.id.textView87;
import static mx.virta.antoniobarajas.siesmex.R.layout.actividad_dialogo;
import static mx.virta.antoniobarajas.siesmex.R.layout.actividad_ejecucion;
import static mx.virta.antoniobarajas.siesmex.R.layout.actividad_remision;


public class Checkin extends AppCompatActivity {

    Button btn, btn2;
    Button btnDet, btnDet1, btnDet2, btnDet3, btnDet4;
    Button btnDet5, btnDet6, btnDet7, btnDet8, btnDet9;
    Button btnEjec, btnEjec1,btnEjec2,btnEjec3, btnEjec4;
    Button btnEjec5, btnEjec6,btnEjec7,btnEjec9, btnEjec10;
    Button btnRemi;
    Button btnenEjec;



    TelephonyManager manager;
    private TextView txtmensaje;





    TextView IDSolicitud, TipoDeTarea, TipoDeOperacion, DepositoOrigen, DepositoDestino;
    TextView IDSolicitud1, TipoDeTarea1, TipoDeOperacion1, DepositoOrigen1, DepositoDestino1;
    TextView IDSolicitud2, TipoDeTarea2, TipoDeOperacion2, DepositoOrigen2, DepositoDestino2;
    TextView IDSolicitud3, TipoDeTarea3, TipoDeOperacion3, DepositoOrigen3, DepositoDestino3;
    TextView IDSolicitud4, TipoDeTarea4, TipoDeOperacion4, DepositoOrigen4, DepositoDestino4;
    TextView IDSolicitud5, TipoDeTarea5, TipoDeOperacion5, DepositoOrigen5, DepositoDestino5;
    TextView IDSolicitud6, TipoDeTarea6, TipoDeOperacion6, DepositoOrigen6, DepositoDestino6;
    TextView IDSolicitud7, TipoDeTarea7, TipoDeOperacion7, DepositoOrigen7, DepositoDestino7;
    TextView IDSolicitud8, TipoDeTarea8, TipoDeOperacion8, DepositoOrigen8, DepositoDestino8;
    TextView IDSolicitud9, TipoDeTarea9, TipoDeOperacion9, DepositoOrigen9, DepositoDestino9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkin);




        // Columna 1

        IDSolicitud = (TextView)findViewById(R.id.textView);
        IDSolicitud1 = (TextView)findViewById(R.id.textView9);
        IDSolicitud2 = (TextView)findViewById(R.id.textView14);
        IDSolicitud3 = (TextView)findViewById(R.id.textView20);
        IDSolicitud4 = (TextView)findViewById(R.id.textView26);
//        IDSolicitud5 = (TextView)findViewById(R.id.textView31);
//        IDSolicitud6 = (TextView)findViewById(R.id.textView36);
//        IDSolicitud7 = (TextView)findViewById(R.id.textView25);
//        IDSolicitud8 = (TextView)findViewById(R.id.textView45);
//        IDSolicitud9 = (TextView)findViewById(R.id.textView50);

        // Columna 2

        TipoDeTarea = (TextView)findViewById(R.id.textView2);
        TipoDeTarea1 = (TextView)findViewById(R.id.textView10);
        TipoDeTarea2 = (TextView)findViewById(R.id.textView15);
        TipoDeTarea3 = (TextView)findViewById(R.id.textView21);
        TipoDeTarea4 = (TextView)findViewById(R.id.textView27);
//        TipoDeTarea5 = (TextView)findViewById(R.id.textView32);
//        TipoDeTarea6 = (TextView)findViewById(R.id.textView37);
//        TipoDeTarea7 = (TextView)findViewById(R.id.textView41);
//        TipoDeTarea8 = (TextView)findViewById(R.id.textView46);
//        TipoDeTarea9 = (TextView)findViewById(R.id.textView51);

        // Columna 3

        TipoDeOperacion = (TextView)findViewById(R.id.textView5);
        TipoDeOperacion1 = (TextView)findViewById(R.id.textView11);
        TipoDeOperacion2 = (TextView)findViewById(R.id.textView16);
        TipoDeOperacion3 = (TextView)findViewById(R.id.textView22);
        TipoDeOperacion4 = (TextView)findViewById(R.id.textView28);
//        TipoDeOperacion5 = (TextView)findViewById(R.id.textView33);
//        TipoDeOperacion6 = (TextView)findViewById(R.id.textView38);
//        TipoDeOperacion7 = (TextView)findViewById(R.id.textView42);
//        TipoDeOperacion8 = (TextView)findViewById(R.id.textView47);
//        TipoDeOperacion9 = (TextView)findViewById(R.id.textView52);

        // Columna 4

        DepositoOrigen = (TextView)findViewById(R.id.textView6);
        DepositoOrigen1 = (TextView)findViewById(R.id.textView12);
        DepositoOrigen2 = (TextView)findViewById(R.id.textView17);
        DepositoOrigen3 = (TextView)findViewById(R.id.textView23);
        DepositoOrigen4 = (TextView)findViewById(R.id.textView29);
//        DepositoOrigen5 = (TextView)findViewById(R.id.textView34);
//        DepositoOrigen6 = (TextView)findViewById(R.id.textView39);
//        DepositoOrigen7 = (TextView)findViewById(R.id.textView43);
//        DepositoOrigen8 = (TextView)findViewById(R.id.textView48);
//        DepositoOrigen9 = (TextView)findViewById(R.id.textView53);

        // Columna 5

        DepositoDestino = (TextView)findViewById(R.id.textView8);
        DepositoDestino1 = (TextView)findViewById(R.id.textView13);
        DepositoDestino2 = (TextView)findViewById(R.id.textView18);
        DepositoDestino3 = (TextView)findViewById(R.id.textView24);
        DepositoDestino4 = (TextView)findViewById(R.id.textView30);
//        DepositoDestino5 = (TextView)findViewById(R.id.textView35);
//        DepositoDestino6 = (TextView)findViewById(R.id.textView40);
//        DepositoDestino7 = (TextView)findViewById(R.id.textView44);
//        DepositoDestino8 = (TextView)findViewById(R.id.textView49);
//        DepositoDestino9 = (TextView)findViewById(R.id.textView54);

        btn =   (Button) findViewById(R.id.button8);
//        btn2 =   (Button) findViewById(R.id.button2);
        btnDet = (Button) findViewById(R.id.button);
        btnEjec = (Button) findViewById(R.id.button13);
        btnRemi = (Button) findViewById(R.id.button6);
//        btnenEjec = (Button) findViewById(R.id.button20);




        leerDato();



        btnDet.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v)
            {

                final View view = LayoutInflater.from(Checkin.this).inflate(actividad_dialogo,null);
                final AlertDialog.Builder alertaSimple = new AlertDialog.Builder(Checkin.this);

                final TextView mensaje = (TextView) view.findViewById(textView4);
                final TextView mensaje1 = (TextView) view.findViewById(textView55);
                final TextView mensaje2 = (TextView) view.findViewById(textView56);
                final TextView mensaje3 = (TextView) view.findViewById(textView57);
                final TextView mensaje4 = (TextView) view.findViewById(textView58);
                final TextView mensaje5 = (TextView) view.findViewById(textView59);
                final TextView mensaje6 = (TextView) view.findViewById(textView71);


                String LLAVE_PREID_TASK, LLAVE_NOMBRE, LLAVE_VEHICLE_NUMBER, LLAVE_ID_TASK, TYPE_STOCK, FLAT_VEHICLE, REMISION, TONELADAS, METROS, PIEZAS;

                txtmensaje =(TextView) findViewById(R.id.textView3);
                manager = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
                StringBuilder builder = new StringBuilder();
                builder.append("").append(manager.getDeviceId());
                txtmensaje.setText(builder);


                try {

                    String imei = txtmensaje.getText().toString();

                    Statement statement = conexionBD().createStatement();

                    //Primer renglon de la tabla


                    ResultSet resultSet = statement.executeQuery("select * from usuarios where IMEI_TABLET= '" + imei.toString() + "' ");
                    resultSet.next();
                    LLAVE_VEHICLE_NUMBER = resultSet.getString("VEHICLE_NUMBER");

                    ResultSet resultSet61 = statement.executeQuery("select * from ACTIVITIES where VEHICLE_NUMBER= '" + LLAVE_VEHICLE_NUMBER.toString() + "'  ");
                    resultSet61.next();
                    LLAVE_PREID_TASK = resultSet61.getString("ID_TASK");

                    ResultSet resultSet62 = statement.executeQuery("select * from TASKS where ID_TASK= '" + LLAVE_PREID_TASK.toString() + "' and STATUS=0  ");
                    resultSet62.next();
                    LLAVE_ID_TASK = resultSet62.getString("ID_TASK");

                    ////////// Cambio para ligar el status

                    ResultSet resultSet1 = statement.executeQuery("select * from ACTIVITIES where ID_TASK= '" + LLAVE_ID_TASK.toString() + "' ");
                    resultSet1.next();
                    LLAVE_NOMBRE = resultSet1.getString("TASKTYPE_NAME");
                    mensaje.setText(LLAVE_NOMBRE);

                    ResultSet resultSet2 = statement.executeQuery("select * from TASKS where ID_TASK= '" + LLAVE_ID_TASK.toString() + "' and STATUS=0 ");
                    resultSet2.next();
                    REMISION = resultSet2.getString("REMISSION");
                    mensaje1.setText(REMISION);

                    ResultSet resultSet3 = statement.executeQuery("select * from DETAILS where ID_TASK= '" + LLAVE_ID_TASK.toString() + "' ");
                    resultSet3.next();
                    PIEZAS = resultSet3.getString("PIECES");
                    mensaje2.setText(PIEZAS);

                    ResultSet resultSet4 = statement.executeQuery("select * from DETAILS where ID_TASK= '" + LLAVE_ID_TASK.toString() + "' ");
                    resultSet4.next();
                    METROS = resultSet4.getString("METERS");
                    mensaje3.setText(METROS);

                    ResultSet resultSet5 = statement.executeQuery("select * from DETAILS where ID_TASK= '" + LLAVE_ID_TASK.toString() + "' ");
                    resultSet5.next();
                    TONELADAS = resultSet5.getString("TONS");
                    mensaje4.setText(TONELADAS);

                    ResultSet resultSet6 = statement.executeQuery("select * from TASKS where ID_TASK= '" + LLAVE_ID_TASK.toString() + "' and STATUS=0 ");
                    resultSet6.next();
                    FLAT_VEHICLE = resultSet6.getString("FLAT_VEHICLE");
                    mensaje5.setText(FLAT_VEHICLE);

                    ResultSet resultSet7 = statement.executeQuery("select * from TASKS where ID_TASK= '" + LLAVE_ID_TASK.toString() + "' and STATUS=0 ");
                    resultSet7.next();
                    TYPE_STOCK = resultSet7.getString("TYPE_STOCK");
                    mensaje6.setText(TYPE_STOCK);

                } catch (SQLException e){
                    e.printStackTrace();
                }

                alertaSimple.setView(view);

                alertaSimple.setTitle("ILO");
                alertaSimple.setIcon(R.drawable.iconoilo);



                alertaSimple.setNegativeButton("Salir", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {

                        leerDato();
                        dialog.cancel();
                    }
                });

                AlertDialog alert = alertaSimple.create();
                alertaSimple.show();

            }
        });



        btnEjec.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v)
            {

                final View view = LayoutInflater.from(Checkin.this).inflate(actividad_ejecucion,null);
                final AlertDialog.Builder alertaSimple = new AlertDialog.Builder(Checkin.this);

                final TextView mensaje = (TextView) view.findViewById(textView4);
                final TextView mensaje1 = (TextView) view.findViewById(textView55);
                final TextView mensaje2 = (TextView) view.findViewById(textView56);
                final TextView mensaje3 = (TextView) view.findViewById(textView57);
                final TextView mensaje4 = (TextView) view.findViewById(textView58);
                final TextView mensaje5 = (TextView) view.findViewById(textView59);
                final TextView mensaje6 = (TextView) view.findViewById(textView71);
                final TextView mensaje7 = (TextView) view.findViewById(textView74);
                final TextView mensaje8 = (TextView) view.findViewById(textView75);
                final TextView mensaje9 = (TextView) view.findViewById(textView76);
                final TextView mensaje10 = (TextView) view.findViewById(textView77);
                final TextView mensaje11 = (TextView) view.findViewById(textView78);

                 String LLAVE_VEHICLE_NUMBER, LLAVE_ID_TASK = null, TYPE_STOCK, FLAT_VEHICLE, REMISION, TONELADAS, METROS, PIEZAS;
                 String ID_SOLICITUD, TIPO_DE_OPERACION, DEPOSITO_ORIGEN, TASKTYPE;
                 String DEPOSITO_DESTINO=null;
                 String LLAVE_STATUS, LLAVE_PREID_TASK, LLAVE_NOMBRE;


                txtmensaje =(TextView) findViewById(R.id.textView3);
                manager = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
                StringBuilder builder = new StringBuilder();
                builder.append("").append(manager.getDeviceId());
                txtmensaje.setText(builder);


                try {

                    String imei = txtmensaje.getText().toString();

                    Statement statement = conexionBD().createStatement();

                    //Primer renglon de la tabla

                    ResultSet resultSet = statement.executeQuery("select * from usuarios where IMEI_TABLET= '" + imei.toString() + "' ");
                    resultSet.next();
                    LLAVE_VEHICLE_NUMBER = resultSet.getString("VEHICLE_NUMBER");

                    ResultSet resultSet61 = statement.executeQuery("select * from ACTIVITIES where VEHICLE_NUMBER= '" + LLAVE_VEHICLE_NUMBER.toString() + "'  ");
                    resultSet61.next();
                    LLAVE_PREID_TASK = resultSet61.getString("ID_TASK");

                    ResultSet resultSet62 = statement.executeQuery("select * from TASKS where ID_TASK= '" + LLAVE_PREID_TASK.toString() + "' and STATUS=0  ");
                    resultSet62.next();
                    LLAVE_ID_TASK = resultSet62.getString("ID_TASK");

                    ////////// Cambio para ligar el status

                    ResultSet resultSet1 = statement.executeQuery("select * from ACTIVITIES where ID_TASK= '" + LLAVE_ID_TASK.toString() + "' ");
                    resultSet1.next();
                    LLAVE_NOMBRE = resultSet1.getString("TASKTYPE_NAME");
                    mensaje.setText(LLAVE_NOMBRE);

                    ResultSet resultSet2 = statement.executeQuery("select * from TASKS where ID_TASK= '" + LLAVE_ID_TASK.toString() + "' and STATUS= 0 ");
                    resultSet2.next();
                    REMISION = resultSet2.getString("REMISSION");
                    mensaje1.setText(REMISION);

                    ResultSet resultSet3 = statement.executeQuery("select * from DETAILS where ID_TASK= '" + LLAVE_ID_TASK.toString() + "' ");
                    resultSet3.next();
                    PIEZAS = resultSet3.getString("PIECES");
                    mensaje2.setText(PIEZAS);

                    ResultSet resultSet4 = statement.executeQuery("select * from DETAILS where ID_TASK= '" + LLAVE_ID_TASK.toString() + "' ");
                    resultSet4.next();
                    METROS = resultSet4.getString("METERS");
                    mensaje3.setText(METROS);

                    ResultSet resultSet5 = statement.executeQuery("select * from DETAILS where ID_TASK= '" + LLAVE_ID_TASK.toString() + "' ");
                    resultSet5.next();
                    TONELADAS = resultSet5.getString("TONS");
                    mensaje4.setText(TONELADAS);

                    ResultSet resultSet6 = statement.executeQuery("select * from TASKS where ID_TASK= '" + LLAVE_ID_TASK.toString() + "' and STATUS= 0");
                    resultSet6.next();
                    FLAT_VEHICLE = resultSet6.getString("FLAT_VEHICLE");
                    mensaje5.setText(FLAT_VEHICLE);

                    ResultSet resultSet7 = statement.executeQuery("select * from TASKS where ID_TASK= '" + LLAVE_ID_TASK.toString() + "' and STATUS= 0 ");
                    resultSet7.next();
                    TYPE_STOCK = resultSet7.getString("TYPE_STOCK");
                    mensaje6.setText(TYPE_STOCK);

                    ResultSet resultSet8 = statement.executeQuery("select * from DETAILS where ID_TASK= '" + LLAVE_ID_TASK.toString() + "' ");
                    resultSet8.next();
                    TIPO_DE_OPERACION = resultSet8.getString("OP");
                    mensaje9.setText(TIPO_DE_OPERACION);

                    ResultSet resultSet9 = statement.executeQuery("select * from TASKS where ID_TASK= '" + LLAVE_ID_TASK.toString() + "' and STATUS= 0");
                    resultSet9.next();
                    DEPOSITO_ORIGEN = resultSet9.getString("ORIGIN_DEPOSIT");
                    mensaje10.setText(DEPOSITO_ORIGEN);

                    ResultSet resultSet10 = statement.executeQuery("select * from TASKS where ID_TASK= '" + LLAVE_ID_TASK.toString() + "' and STATUS= 0");
                    resultSet10.next();
                    DEPOSITO_DESTINO = resultSet10.getString("DESTINY_DEPOSIT");
                    mensaje11.setText(DEPOSITO_DESTINO);

                    ResultSet resultSet11 = statement.executeQuery("select * from ACTIVITIES where ID_TASK= '" + LLAVE_ID_TASK.toString() + "' ");
                    resultSet11.next();
                    ID_SOLICITUD = resultSet11.getString("ID_REQUEST");
                    mensaje7.setText(ID_SOLICITUD);

                    ResultSet resultSet12 = statement.executeQuery("select * from ACTIVITIES where ID_TASK= '" + LLAVE_ID_TASK.toString() + "' ");
                    resultSet12.next();
                    TASKTYPE = resultSet12.getString("TASKTYPE_NAME");
                    mensaje8.setText(TASKTYPE);


                } catch (SQLException e){
                    e.printStackTrace();
                }

                alertaSimple.setView(view);

                alertaSimple.setTitle("ILO");
                alertaSimple.setIcon(R.drawable.iconoilo);


                final String finalLLAVE_ID_TASK = LLAVE_ID_TASK;
                final String finalDEPOSITO_DESTINO = DEPOSITO_DESTINO;

                alertaSimple.setPositiveButton("Completar", new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialog, int id) {

                            try{

                                PreparedStatement pst = conexionBD().prepareStatement("update TASKS set STATUS=2 where ID_TASK = '" + finalLLAVE_ID_TASK + "' ");
//                                pst.setString(1,edtwrite.getText().toString());
                                pst.executeUpdate();
                                Toast.makeText(getApplicationContext(),"ORDEN REGISTRADA COMO TERMINADA",Toast.LENGTH_SHORT).show();


                            }catch (SQLException e){

                                Toast.makeText(getApplicationContext(),e.getMessage(),Toast.LENGTH_SHORT).show();

                            }

//                        }

                    }

                });

                alertaSimple.setNegativeButton("Salir", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {

                        dialog.cancel();
                    }
                });


                alertaSimple.setNeutralButton("Iniciar", new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialog, int id) {

                        final android.app.AlertDialog.Builder alertaSimple = new android.app.AlertDialog.Builder(Checkin.this);
                        alertaSimple.setTitle("Ubicación destino");
                        alertaSimple.setMessage("ID DE DEPOSITO:" + finalDEPOSITO_DESTINO);

                        alertaSimple.setPositiveButton("Salir", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });

                        alertaSimple.create();
                        alertaSimple.show();


//                        public void agregarDato(){

                        try{

                            PreparedStatement pst = conexionBD().prepareStatement("update TASKS set STATUS=1 where ID_TASK = '" + finalLLAVE_ID_TASK + "' ");
//                                pst.setString(1,edtwrite.getText().toString());
                            pst.executeUpdate();
//                            pst.equals("1");
                            Toast.makeText(getApplicationContext(),"ORDEN REGISTRADA COMO EN PROCESO",Toast.LENGTH_SHORT).show();


                        }catch (SQLException e){

                            Toast.makeText(getApplicationContext(),e.getMessage(),Toast.LENGTH_SHORT).show();

                        }

//                        }

                    }

                });



                AlertDialog alert = alertaSimple.create();
                alertaSimple.show();

            }
        });


    }

    public void Remision(View v)
    {


            final View view = LayoutInflater.from(Checkin.this).inflate(actividad_remision,null);
            final AlertDialog.Builder alertaSimple = new AlertDialog.Builder(Checkin.this);

            final TextView mensaje = (TextView) view.findViewById(textView4);
            final TextView mensaje1 = (TextView) view.findViewById(textView55);
            final TextView mensaje2 = (TextView) view.findViewById(textView56);
            final TextView mensaje3 = (TextView) view.findViewById(textView57);
            final TextView mensaje4 = (TextView) view.findViewById(textView58);
            final TextView mensaje5 = (TextView) view.findViewById(textView59);
            final TextView mensaje6 = (TextView) view.findViewById(textView71);
            final TextView mensaje7 = (TextView) view.findViewById(textView74);
            final TextView mensaje8 = (TextView) view.findViewById(textView75);
            final TextView mensaje9 = (TextView) view.findViewById(textView76);
            final TextView mensaje10 = (TextView) view.findViewById(textView77);
            final TextView mensaje11 = (TextView) view.findViewById(textView78);
            final TextView mensaje12 = (TextView) view.findViewById(textView87);
            final TextView mensaje13 = (TextView) view.findViewById(textView86);
            final TextView mensaje14 = (TextView) view.findViewById(textView85);

            String LLAVE_VEHICLE_NUMBER, LLAVE_ID_TASK = null, TYPE_STOCK, FLAT_VEHICLE, REMISION, TONELADAS, METROS, PIEZAS;
            String ID_SOLICITUD, TIPO_DE_OPERACION, DEPOSITO_ORIGEN, DEPOSITO_DESTINO, TASKTYPE;
            String LLAVE_PREID_TASK;
            String CVP, MERCADO, ATADO, GRADO_ACERO, LLAVE_NOMBRE;


            txtmensaje =(TextView) findViewById(R.id.textView3);
            manager = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
            StringBuilder builder = new StringBuilder();
            builder.append("").append(manager.getDeviceId());
            txtmensaje.setText(builder);


            try {

                String imei = txtmensaje.getText().toString();

                Statement statement = conexionBD().createStatement();

                //Primer renglon de la tabla

                ResultSet resultSet = statement.executeQuery("select * from usuarios where IMEI_TABLET= '" + imei.toString() + "' ");
                resultSet.next();
                LLAVE_VEHICLE_NUMBER = resultSet.getString("VEHICLE_NUMBER");

                ResultSet resultSet61 = statement.executeQuery("select * from ACTIVITIES where VEHICLE_NUMBER= '" + LLAVE_VEHICLE_NUMBER.toString() + "'  ");
                resultSet61.next();
                LLAVE_PREID_TASK = resultSet61.getString("ID_TASK");

                ResultSet resultSet62 = statement.executeQuery("select * from TASKS where ID_TASK= '" + LLAVE_PREID_TASK.toString() + "' and STATUS=0  ");
                resultSet62.next();
                LLAVE_ID_TASK = resultSet62.getString("ID_TASK");

                ////////// Cambio para ligar el status

                ResultSet resultSet1 = statement.executeQuery("select * from ACTIVITIES where ID_TASK= '" + LLAVE_ID_TASK.toString() + "' ");
                resultSet1.next();
                LLAVE_NOMBRE = resultSet1.getString("TASKTYPE_NAME");
                mensaje.setText(LLAVE_NOMBRE);

                ResultSet resultSet2 = statement.executeQuery("select * from TASKS where ID_TASK= '" + LLAVE_ID_TASK.toString() + "' and STATUS= 0 ");
                resultSet2.next();
                REMISION = resultSet2.getString("REMISSION");
                mensaje1.setText(REMISION);

                ResultSet resultSet3 = statement.executeQuery("select * from DETAILS where ID_TASK= '" + LLAVE_ID_TASK.toString() + "'  ");
                resultSet3.next();
                PIEZAS = resultSet3.getString("PIECES");
                mensaje2.setText(PIEZAS);

                ResultSet resultSet4 = statement.executeQuery("select * from DETAILS where ID_TASK= '" + LLAVE_ID_TASK.toString() + "'  ");
                resultSet4.next();
                METROS = resultSet4.getString("METERS");
                mensaje3.setText(METROS);

                ResultSet resultSet5 = statement.executeQuery("select * from DETAILS where ID_TASK= '" + LLAVE_ID_TASK.toString() + "'  ");
                resultSet5.next();
                TONELADAS = resultSet5.getString("TONS");
                mensaje4.setText(TONELADAS);

                ResultSet resultSet6 = statement.executeQuery("select * from TASKS where ID_TASK= '" + LLAVE_ID_TASK.toString() + "' and STATUS= 0 ");
                resultSet6.next();
                FLAT_VEHICLE = resultSet6.getString("FLAT_VEHICLE");
                mensaje5.setText(FLAT_VEHICLE);

                ResultSet resultSet7 = statement.executeQuery("select * from TASKS where ID_TASK= '" + LLAVE_ID_TASK.toString() + "' and STATUS= 0 ");
                resultSet7.next();
                TYPE_STOCK = resultSet7.getString("TYPE_STOCK");
                mensaje6.setText(TYPE_STOCK);

                ResultSet resultSet8 = statement.executeQuery("select * from DETAILS where ID_TASK= '" + LLAVE_ID_TASK.toString() + "'  ");
                resultSet8.next();
                TIPO_DE_OPERACION = resultSet8.getString("OP");
                mensaje9.setText(TIPO_DE_OPERACION);

                ResultSet resultSet9 = statement.executeQuery("select * from TASKS where ID_TASK= '" + LLAVE_ID_TASK.toString() + "' and STATUS= 0 ");
                resultSet9.next();
                DEPOSITO_ORIGEN = resultSet9.getString("ORIGIN_DEPOSIT");
                mensaje10.setText(DEPOSITO_ORIGEN);

                ResultSet resultSet10 = statement.executeQuery("select * from TASKS where ID_TASK= '" + LLAVE_ID_TASK.toString() + "' and STATUS= 0 ");
                resultSet10.next();
                DEPOSITO_DESTINO = resultSet10.getString("CVP");
                mensaje11.setText(DEPOSITO_DESTINO);

                ResultSet resultSet11 = statement.executeQuery("select * from ACTIVITIES where ID_TASK= '" + LLAVE_ID_TASK.toString() + "'  ");
                resultSet11.next();
                ID_SOLICITUD = resultSet11.getString("ID_REQUEST");
                mensaje7.setText(ID_SOLICITUD);

                ResultSet resultSet12 = statement.executeQuery("select * from ACTIVITIES where ID_TASK= '" + LLAVE_ID_TASK.toString() + "'  ");
                resultSet12.next();
                TASKTYPE = resultSet12.getString("TASKTYPE_NAME");
                mensaje8.setText(TASKTYPE);

////////////////  NUEVOS

                ResultSet resultSet13 = statement.executeQuery("select * from DETAILS where ID_TASK= '" + LLAVE_ID_TASK.toString() + "' ");
                resultSet13.next();
                MERCADO = resultSet13.getString("MARKET");
                mensaje12.setText(MERCADO);

                ResultSet resultSet14 = statement.executeQuery("select * from DETAILS where ID_TASK= '" + LLAVE_ID_TASK.toString() + "' ");
                resultSet14.next();
                ATADO = resultSet14.getString("LINGED");
                mensaje13.setText(ATADO);

                ResultSet resultSet15 = statement.executeQuery("select * from DETAILS where ID_TASK= '" + LLAVE_ID_TASK.toString() + "' ");
                resultSet15.next();
                GRADO_ACERO = resultSet15.getString("STEEL_GRADE");
                mensaje14.setText(GRADO_ACERO);


            } catch (SQLException e){
                e.printStackTrace();
            }

            alertaSimple.setView(view);

            alertaSimple.setTitle("ILO");
            alertaSimple.setIcon(R.drawable.iconoilo);


            alertaSimple.setNegativeButton("Salir", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int id) {

                    dialog.cancel();
                }
            });



            AlertDialog alert = alertaSimple.create();
            alertaSimple.show();

    }




    public void Start()

    {
        try{

            PreparedStatement pst = conexionBD().prepareStatement("insert into usuarios values(?)");
            pst.setString(1,txtmensaje.getText().toString());
            pst.executeUpdate();
            Toast.makeText(getApplicationContext(),"REGISTRO AGREGADO CORRECTAMENTE",Toast.LENGTH_SHORT).show();


        }catch (SQLException e){

            Toast.makeText(getApplicationContext(),e.getMessage(),Toast.LENGTH_SHORT).show();

        }
    }


    public java.sql.Connection conexionBD(){

        java.sql.Connection conexion=null;
        try{
            StrictMode.ThreadPolicy policy=new StrictMode.ThreadPolicy.Builder().permitAll().build();

            StrictMode.setThreadPolicy(policy);
            Class.forName("net.sourceforge.jtds.jdbc.Driver").newInstance();
            conexion= (java.sql.Connection) DriverManager.getConnection("jdbc:jtds:sqlserver://173.193.19.18:7881;dataBaseName=tamsa;user=apptenaris;password=apptenaris2017");


        }catch (Exception e){
            Toast.makeText(getApplicationContext(),e.getMessage(),Toast.LENGTH_SHORT).show();

        }

        return conexion;
    }


    public void leerDato(){

        String ID_SOLICITUD, TIPO_DE_OPERACION, DEPOSITO_ORIGEN, DEPOSITO_ORIGEN2, DEPOSITO_DESTINO, DEPOSITO_DESTINO2;
        String LLAVE_VEHICLE_NUMBER, LLAVE_ID_TASK, LLAVE_STATUS, LLAVE_PREID_TASK;

        txtmensaje =(TextView) findViewById(R.id.textView3);
        manager = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
        StringBuilder builder = new StringBuilder();
        builder.append("").append(manager.getDeviceId());
        txtmensaje.setText(builder);


        try {

            String imei = txtmensaje.getText().toString();

            Statement statement = conexionBD().createStatement();

            //Primer renglon de la tabla

            ResultSet resultSet = statement.executeQuery("select * from usuarios where IMEI_TABLET= '" + imei.toString() + "' ");
            resultSet.next();
            LLAVE_VEHICLE_NUMBER = resultSet.getString("VEHICLE_NUMBER");

            ResultSet resultSet61 = statement.executeQuery("select * from ACTIVITIES where VEHICLE_NUMBER= '" + LLAVE_VEHICLE_NUMBER.toString() + "' ");
            resultSet61.next();
            LLAVE_PREID_TASK = resultSet61.getString("TASKTYPE_NAME");
            TipoDeTarea.setText(LLAVE_PREID_TASK);

            ResultSet resultSet1 = statement.executeQuery("select * from ACTIVITIES where VEHICLE_NUMBER= '" + LLAVE_VEHICLE_NUMBER.toString() + "'  ");
            resultSet1.next();
            LLAVE_ID_TASK = resultSet1.getString("ID_TASK");

            ResultSet resultSet2 = statement.executeQuery("select * from TASKS where ID_TASK= '" + LLAVE_ID_TASK.toString() + "' and STATUS=0 ");
            resultSet2.next();
            TIPO_DE_OPERACION = resultSet2.getString("OPERATION_NAME");
            TipoDeOperacion.setText(TIPO_DE_OPERACION);

            ResultSet resultSet3 = statement.executeQuery("select * from TASKS where ID_TASK= '" + LLAVE_ID_TASK.toString() + "' and STATUS=0 ");
            resultSet3.next();
            DEPOSITO_ORIGEN = resultSet3.getString("ORIGIN_DEPOSIT");

            ResultSet resultSet62 = statement.executeQuery("select * from TASKS where ID_TASK= '" + LLAVE_ID_TASK.toString() + "' and STATUS=0 ");
            resultSet62.next();
            DEPOSITO_ORIGEN2 = resultSet62.getString("ORIGIN_NAME");
            DepositoOrigen.setText(DEPOSITO_ORIGEN + "/" + DEPOSITO_ORIGEN2);


            ResultSet resultSet4 = statement.executeQuery("select * from TASKS where ID_TASK= '" + LLAVE_ID_TASK.toString() + "' and STATUS=0 ");
            resultSet4.next();
            DEPOSITO_DESTINO = resultSet4.getString("DESTINY_DEPOSIT");

            ResultSet resultSet63 = statement.executeQuery("select * from TASKS where ID_TASK= '" + LLAVE_ID_TASK.toString() + "' and STATUS=0 ");
            resultSet63.next();
            DEPOSITO_DESTINO2 = resultSet63.getString("DESTINY_DEPOSIT");
            DepositoDestino.setText(DEPOSITO_DESTINO + "/" + DEPOSITO_DESTINO2);

            ResultSet resultSet5 = statement.executeQuery("select * from TASKS where ID_TASK= '" + LLAVE_ID_TASK.toString() + "' and STATUS=0");
            resultSet5.next();
            ID_SOLICITUD = resultSet5.getString("ID_REQUEST");
            IDSolicitud.setText(ID_SOLICITUD);


            //Segundo renglon de la tabla

            ResultSet resultSet6 = statement.executeQuery("select * from usuarios where IMEI_TABLET= '" + imei.toString() + "' ");
            resultSet6.next();
            resultSet6.next();
            LLAVE_VEHICLE_NUMBER = resultSet6.getString("VEHICLE_NUMBER");

            ResultSet resultSet64 = statement.executeQuery("select * from ACTIVITIES where VEHICLE_NUMBER= '" + LLAVE_VEHICLE_NUMBER.toString() + "' ");
            resultSet64.next();
            resultSet64.next();
            LLAVE_PREID_TASK = resultSet64.getString("TASKTYPE_NAME");
            TipoDeTarea.setText(LLAVE_PREID_TASK);

            ResultSet resultSet7 = statement.executeQuery("select * from ACTIVITIES where VEHICLE_NUMBER= '" + LLAVE_VEHICLE_NUMBER.toString() + "'  ");
            resultSet7.next();
            resultSet7.next();
            LLAVE_ID_TASK = resultSet7.getString("ID_TASK");

            ResultSet resultSet8 = statement.executeQuery("select * from TASKS where ID_TASK= '" + LLAVE_ID_TASK.toString() + "' and STATUS=0 ");
            resultSet8.next();
            resultSet8.next();
            TIPO_DE_OPERACION = resultSet8.getString("OPERATION_NAME");
            TipoDeOperacion.setText(TIPO_DE_OPERACION);

            ResultSet resultSet9 = statement.executeQuery("select * from TASKS where ID_TASK= '" + LLAVE_ID_TASK.toString() + "' and STATUS=0 ");
            resultSet9.next();
            resultSet9.next();
            DEPOSITO_ORIGEN = resultSet9.getString("ORIGIN_DEPOSIT");

            ResultSet resultSet65 = statement.executeQuery("select * from TASKS where ID_TASK= '" + LLAVE_ID_TASK.toString() + "' and STATUS=0 ");
            resultSet65.next();
            resultSet65.next();
            DEPOSITO_ORIGEN2 = resultSet65.getString("ORIGIN_NAME");
            DepositoOrigen.setText(DEPOSITO_ORIGEN + "/" + DEPOSITO_ORIGEN2);

            ResultSet resultSet10 = statement.executeQuery("select * from TASKS where ID_TASK= '" + LLAVE_ID_TASK.toString() + "' and STATUS=0 ");
            resultSet10.next();
            resultSet10.next();
            DEPOSITO_DESTINO = resultSet10.getString("DESTINY_DEPOSIT");

            ResultSet resultSet66 = statement.executeQuery("select * from TASKS where ID_TASK= '" + LLAVE_ID_TASK.toString() + "' and STATUS=0 ");
            resultSet66.next();
            resultSet66.next();
            DEPOSITO_DESTINO2 = resultSet66.getString("DESTINY_DEPOSIT");
            DepositoDestino.setText(DEPOSITO_DESTINO + "/" + DEPOSITO_DESTINO2);

            ResultSet resultSet11 = statement.executeQuery("select * from TASKS where ID_TASK= '" + LLAVE_ID_TASK.toString() + "' and STATUS=0");
            resultSet11.next();
            resultSet11.next();
            ID_SOLICITUD = resultSet11.getString("ID_REQUEST");
            IDSolicitud.setText(ID_SOLICITUD);

            // Tercer renglon de la tabla

            ResultSet resultSet12 = statement.executeQuery("select * from usuarios where IMEI_TABLET= '" + imei.toString() + "' ");
            resultSet12.next();
            resultSet12.next();
            resultSet12.next();
            LLAVE_VEHICLE_NUMBER = resultSet12.getString("VEHICLE_NUMBER");

            ResultSet resultSet67 = statement.executeQuery("select * from ACTIVITIES where VEHICLE_NUMBER= '" + LLAVE_VEHICLE_NUMBER.toString() + "' ");
            resultSet67.next();
            resultSet67.next();
            resultSet67.next();
            LLAVE_PREID_TASK = resultSet67.getString("TASKTYPE_NAME");
            TipoDeTarea.setText(LLAVE_PREID_TASK);

            ResultSet resultSet13 = statement.executeQuery("select * from ACTIVITIES where VEHICLE_NUMBER= '" + LLAVE_VEHICLE_NUMBER.toString() + "'  ");
            resultSet13.next();
            resultSet13.next();
            resultSet13.next();
            LLAVE_ID_TASK = resultSet13.getString("ID_TASK");

            ResultSet resultSet14 = statement.executeQuery("select * from TASKS where ID_TASK= '" + LLAVE_ID_TASK.toString() + "' and STATUS=0 ");
            resultSet14.next();
            resultSet14.next();
            resultSet14.next();
            TIPO_DE_OPERACION = resultSet14.getString("OPERATION_NAME");
            TipoDeOperacion.setText(TIPO_DE_OPERACION);

            ResultSet resultSet15 = statement.executeQuery("select * from TASKS where ID_TASK= '" + LLAVE_ID_TASK.toString() + "' and STATUS=0 ");
            resultSet15.next();
            resultSet15.next();
            resultSet15.next();
            DEPOSITO_ORIGEN = resultSet15.getString("ORIGIN_DEPOSIT");

            ResultSet resultSet68 = statement.executeQuery("select * from TASKS where ID_TASK= '" + LLAVE_ID_TASK.toString() + "' and STATUS=0 ");
            resultSet68.next();
            resultSet68.next();
            resultSet68.next();
            DEPOSITO_ORIGEN2 = resultSet68.getString("ORIGIN_NAME");
            DepositoOrigen.setText(DEPOSITO_ORIGEN + "/" + DEPOSITO_ORIGEN2);

            ResultSet resultSet16 = statement.executeQuery("select * from TASKS where ID_TASK= '" + LLAVE_ID_TASK.toString() + "' and STATUS=0 ");
            resultSet16.next();
            resultSet16.next();
            resultSet16.next();
            DEPOSITO_DESTINO = resultSet16.getString("DESTINY_DEPOSIT");

            ResultSet resultSet69 = statement.executeQuery("select * from TASKS where ID_TASK= '" + LLAVE_ID_TASK.toString() + "' and STATUS=0 ");
            resultSet69.next();
            resultSet69.next();
            resultSet69.next();
            DEPOSITO_DESTINO2 = resultSet69.getString("DESTINY_DEPOSIT");
            DepositoDestino.setText(DEPOSITO_DESTINO + "/" + DEPOSITO_DESTINO2);

            ResultSet resultSet17 = statement.executeQuery("select * from TASKS where ID_TASK= '" + LLAVE_ID_TASK.toString() + "' and STATUS=0");
            resultSet17.next();
            resultSet17.next();
            resultSet17.next();
            ID_SOLICITUD = resultSet17.getString("ID_REQUEST");
            IDSolicitud.setText(ID_SOLICITUD);

            // Cuarto renglon de la tabla

            ResultSet resultSet18 = statement.executeQuery("select * from usuarios where IMEI_TABLET= '" + imei.toString() + "' ");
            resultSet18.next();
            resultSet18.next();
            resultSet18.next();
            resultSet18.next();
            LLAVE_VEHICLE_NUMBER = resultSet18.getString("VEHICLE_NUMBER");

            ResultSet resultSet19 = statement.executeQuery("select * from ACTIVITIES where VEHICLE_NUMBER= '" + LLAVE_VEHICLE_NUMBER.toString() + "' ");
            resultSet19.next();
            resultSet19.next();
            resultSet19.next();
            resultSet19.next();
            LLAVE_ID_TASK = resultSet19.getString("ID_TASK");
            TipoDeTarea.setText(LLAVE_ID_TASK);

            ResultSet resultSet20 = statement.executeQuery("select * from DETAILS where ID_TASK= '" + LLAVE_ID_TASK.toString() + "' ");
            resultSet20.next();
            resultSet20.next();
            resultSet20.next();
            resultSet20.next();
            TIPO_DE_OPERACION = resultSet20.getString("OP");
            TipoDeOperacion.setText(TIPO_DE_OPERACION);

            ResultSet resultSet21 = statement.executeQuery("select * from TASKS where ID_TASK= '" + LLAVE_ID_TASK.toString() + "' ");
            resultSet21.next();
            resultSet21.next();
            resultSet21.next();
            resultSet21.next();
            DEPOSITO_ORIGEN = resultSet21.getString("ORIGIN_DEPOSIT");
            DepositoOrigen.setText(DEPOSITO_ORIGEN);

            ResultSet resultSet22 = statement.executeQuery("select * from TASKS where ID_TASK= '" + LLAVE_ID_TASK.toString() + "' ");
            resultSet22.next();
            resultSet22.next();
            resultSet22.next();
            resultSet22.next();
            DEPOSITO_DESTINO = resultSet22.getString("DESTINY_DEPOSIT");
            DepositoDestino.setText(DEPOSITO_DESTINO);

            ResultSet resultSet23 = statement.executeQuery("select * from ACTIVITIES where ID_TASK= '" + LLAVE_ID_TASK.toString() + "' ");
            resultSet23.next();
            resultSet23.next();
            resultSet23.next();
            resultSet23.next();
            ID_SOLICITUD = resultSet23.getString("ID_REQUEST");
            IDSolicitud.setText(ID_SOLICITUD);

            // Quinto renglon de la tabla

            ResultSet resultSet24 = statement.executeQuery("select * from usuarios where IMEI_TABLET= '" + imei.toString() + "' ");
            resultSet24.next();
            resultSet24.next();
            resultSet24.next();
            resultSet24.next();
            resultSet24.next();
            LLAVE_VEHICLE_NUMBER = resultSet24.getString("VEHICLE_NUMBER");

            ResultSet resultSet25 = statement.executeQuery("select * from ACTIVITIES where VEHICLE_NUMBER= '" + LLAVE_VEHICLE_NUMBER.toString() + "' ");
            resultSet25.next();
            resultSet25.next();
            resultSet25.next();
            resultSet25.next();
            resultSet25.next();
            LLAVE_ID_TASK = resultSet25.getString("ID_TASK");
            TipoDeTarea.setText(LLAVE_ID_TASK);

            ResultSet resultSet26 = statement.executeQuery("select * from DETAILS where ID_TASK= '" + LLAVE_ID_TASK.toString() + "' ");
            resultSet26.next();
            resultSet26.next();
            resultSet26.next();
            resultSet26.next();
            resultSet26.next();
            TIPO_DE_OPERACION = resultSet26.getString("OP");
            TipoDeOperacion.setText(TIPO_DE_OPERACION);

            ResultSet resultSet27 = statement.executeQuery("select * from TASKS where ID_TASK= '" + LLAVE_ID_TASK.toString() + "' ");
            resultSet27.next();
            resultSet27.next();
            resultSet27.next();
            resultSet27.next();
            resultSet27.next();
            DEPOSITO_ORIGEN = resultSet27.getString("ORIGIN_DEPOSIT");
            DepositoOrigen.setText(DEPOSITO_ORIGEN);

            ResultSet resultSet28 = statement.executeQuery("select * from TASKS where ID_TASK= '" + LLAVE_ID_TASK.toString() + "' ");
            resultSet28.next();
            resultSet28.next();
            resultSet28.next();
            resultSet28.next();
            resultSet28.next();
            DEPOSITO_DESTINO = resultSet28.getString("DESTINY_DEPOSIT");
            DepositoDestino.setText(DEPOSITO_DESTINO);

            ResultSet resultSet29 = statement.executeQuery("select * from ACTIVITIES where ID_TASK= '" + LLAVE_ID_TASK.toString() + "' ");
            resultSet29.next();
            resultSet29.next();
            resultSet29.next();
            resultSet29.next();
            resultSet29.next();
            ID_SOLICITUD = resultSet29.getString("ID_REQUEST");
            IDSolicitud.setText(ID_SOLICITUD);

            // Sexto renglon de la tabla

            ResultSet resultSet30 = statement.executeQuery("select * from usuarios where IMEI_TABLET= '" + imei.toString() + "' ");
            resultSet30.next();
            resultSet30.next();
            resultSet30.next();
            resultSet30.next();
            resultSet30.next();
            resultSet30.next();
            LLAVE_VEHICLE_NUMBER = resultSet30.getString("VEHICLE_NUMBER");

            ResultSet resultSet31 = statement.executeQuery("select * from ACTIVITIES where VEHICLE_NUMBER= '" + LLAVE_VEHICLE_NUMBER.toString() + "' ");
            resultSet31.next();
            resultSet31.next();
            resultSet31.next();
            resultSet31.next();
            resultSet31.next();
            resultSet31.next();
            LLAVE_ID_TASK = resultSet31.getString("ID_TASK");
            TipoDeTarea.setText(LLAVE_ID_TASK);

            ResultSet resultSet32 = statement.executeQuery("select * from DETAILS where ID_TASK= '" + LLAVE_ID_TASK.toString() + "' ");
            resultSet32.next();
            resultSet32.next();
            resultSet32.next();
            resultSet32.next();
            resultSet32.next();
            resultSet32.next();
            TIPO_DE_OPERACION = resultSet32.getString("OP");
            TipoDeOperacion.setText(TIPO_DE_OPERACION);

            ResultSet resultSet33 = statement.executeQuery("select * from TASKS where ID_TASK= '" + LLAVE_ID_TASK.toString() + "' ");
            resultSet33.next();
            resultSet33.next();
            resultSet33.next();
            resultSet33.next();
            resultSet33.next();
            resultSet33.next();
            DEPOSITO_ORIGEN = resultSet33.getString("ORIGIN_DEPOSIT");
            DepositoOrigen.setText(DEPOSITO_ORIGEN);

            ResultSet resultSet34 = statement.executeQuery("select * from TASKS where ID_TASK= '" + LLAVE_ID_TASK.toString() + "' ");
            resultSet34.next();
            resultSet34.next();
            resultSet34.next();
            resultSet34.next();
            resultSet34.next();
            resultSet34.next();
            DEPOSITO_DESTINO = resultSet34.getString("DESTINY_DEPOSIT");
            DepositoDestino.setText(DEPOSITO_DESTINO);

            ResultSet resultSet35 = statement.executeQuery("select * from ACTIVITIES where ID_TASK= '" + LLAVE_ID_TASK.toString() + "' ");
            resultSet35.next();
            resultSet35.next();
            resultSet35.next();
            resultSet35.next();
            resultSet35.next();
            resultSet35.next();
            ID_SOLICITUD = resultSet35.getString("ID_REQUEST");
            IDSolicitud.setText(ID_SOLICITUD);

            // Septimo renglon de la tabla

            ResultSet resultSet36 = statement.executeQuery("select * from usuarios where IMEI_TABLET= '" + imei.toString() + "' ");
            resultSet36.next();
            resultSet36.next();
            resultSet36.next();
            resultSet36.next();
            resultSet36.next();
            resultSet36.next();
            resultSet36.next();
            LLAVE_VEHICLE_NUMBER = resultSet36.getString("VEHICLE_NUMBER");

            ResultSet resultSet37 = statement.executeQuery("select * from ACTIVITIES where VEHICLE_NUMBER= '" + LLAVE_VEHICLE_NUMBER.toString() + "' ");
            resultSet37.next();
            resultSet37.next();
            resultSet37.next();
            resultSet37.next();
            resultSet37.next();
            resultSet37.next();
            resultSet37.next();
            LLAVE_ID_TASK = resultSet37.getString("ID_TASK");
            TipoDeTarea.setText(LLAVE_ID_TASK);

            ResultSet resultSet38 = statement.executeQuery("select * from DETAILS where ID_TASK= '" + LLAVE_ID_TASK.toString() + "' ");
            resultSet38.next();
            resultSet38.next();
            resultSet38.next();
            resultSet38.next();
            resultSet38.next();
            resultSet38.next();
            resultSet38.next();
            TIPO_DE_OPERACION = resultSet38.getString("OP");
            TipoDeOperacion.setText(TIPO_DE_OPERACION);

            ResultSet resultSet39 = statement.executeQuery("select * from TASKS where ID_TASK= '" + LLAVE_ID_TASK.toString() + "' ");
            resultSet39.next();
            resultSet39.next();
            resultSet39.next();
            resultSet39.next();
            resultSet39.next();
            resultSet39.next();
            resultSet39.next();
            DEPOSITO_ORIGEN = resultSet39.getString("ORIGIN_DEPOSIT");
            DepositoOrigen.setText(DEPOSITO_ORIGEN);

            ResultSet resultSet40 = statement.executeQuery("select * from TASKS where ID_TASK= '" + LLAVE_ID_TASK.toString() + "' ");
            resultSet40.next();
            resultSet40.next();
            resultSet40.next();
            resultSet40.next();
            resultSet40.next();
            resultSet40.next();
            resultSet40.next();
            DEPOSITO_DESTINO = resultSet40.getString("DESTINY_DEPOSIT");
            DepositoDestino.setText(DEPOSITO_DESTINO);

            ResultSet resultSet41 = statement.executeQuery("select * from ACTIVITIES where ID_TASK= '" + LLAVE_ID_TASK.toString() + "' ");
            resultSet41.next();
            resultSet41.next();
            resultSet41.next();
            resultSet41.next();
            resultSet41.next();
            resultSet41.next();
            resultSet41.next();
            ID_SOLICITUD = resultSet41.getString("ID_REQUEST");
            IDSolicitud.setText(ID_SOLICITUD);

            // Octavo renglon de la tabla

            ResultSet resultSet42 = statement.executeQuery("select * from usuarios where IMEI_TABLET= '" + imei.toString() + "' ");
            resultSet42.next();
            resultSet42.next();
            resultSet42.next();
            resultSet42.next();
            resultSet42.next();
            resultSet42.next();
            resultSet42.next();
            resultSet42.next();
            LLAVE_VEHICLE_NUMBER = resultSet42.getString("VEHICLE_NUMBER");

            ResultSet resultSet43 = statement.executeQuery("select * from ACTIVITIES where VEHICLE_NUMBER= '" + LLAVE_VEHICLE_NUMBER.toString() + "' ");
            resultSet43.next();
            resultSet43.next();
            resultSet43.next();
            resultSet43.next();
            resultSet43.next();
            resultSet43.next();
            resultSet43.next();
            resultSet43.next();
            LLAVE_ID_TASK = resultSet43.getString("ID_TASK");
            TipoDeTarea.setText(LLAVE_ID_TASK);

            ResultSet resultSet44 = statement.executeQuery("select * from DETAILS where ID_TASK= '" + LLAVE_ID_TASK.toString() + "' ");
            resultSet44.next();
            resultSet44.next();
            resultSet44.next();
            resultSet44.next();
            resultSet44.next();
            resultSet44.next();
            resultSet44.next();
            resultSet44.next();
            TIPO_DE_OPERACION = resultSet44.getString("OP");
            TipoDeOperacion.setText(TIPO_DE_OPERACION);

            ResultSet resultSet45 = statement.executeQuery("select * from TASKS where ID_TASK= '" + LLAVE_ID_TASK.toString() + "' ");
            resultSet45.next();
            resultSet45.next();
            resultSet45.next();
            resultSet45.next();
            resultSet45.next();
            resultSet45.next();
            resultSet45.next();
            resultSet45.next();
            DEPOSITO_ORIGEN = resultSet45.getString("ORIGIN_DEPOSIT");
            DepositoOrigen.setText(DEPOSITO_ORIGEN);

            ResultSet resultSet46 = statement.executeQuery("select * from TASKS where ID_TASK= '" + LLAVE_ID_TASK.toString() + "' ");
            resultSet46.next();
            resultSet46.next();
            resultSet46.next();
            resultSet46.next();
            resultSet46.next();
            resultSet46.next();
            resultSet46.next();
            resultSet46.next();
            DEPOSITO_DESTINO = resultSet46.getString("DESTINY_DEPOSIT");
            DepositoDestino.setText(DEPOSITO_DESTINO);

            ResultSet resultSet47 = statement.executeQuery("select * from ACTIVITIES where ID_TASK= '" + LLAVE_ID_TASK.toString() + "' ");
            resultSet47.next();
            resultSet47.next();
            resultSet47.next();
            resultSet47.next();
            resultSet47.next();
            resultSet47.next();
            resultSet47.next();
            resultSet47.next();
            ID_SOLICITUD = resultSet47.getString("ID_REQUEST");
            IDSolicitud.setText(ID_SOLICITUD);

            // Noveno renglon de la tabla

            ResultSet resultSet48 = statement.executeQuery("select * from usuarios where IMEI_TABLET= '" + imei.toString() + "' ");
            resultSet48.next();
            resultSet48.next();
            resultSet48.next();
            resultSet48.next();
            resultSet48.next();
            resultSet48.next();
            resultSet48.next();
            resultSet48.next();
            resultSet48.next();
            LLAVE_VEHICLE_NUMBER = resultSet48.getString("VEHICLE_NUMBER");

            ResultSet resultSet49 = statement.executeQuery("select * from ACTIVITIES where VEHICLE_NUMBER= '" + LLAVE_VEHICLE_NUMBER.toString() + "' ");
            resultSet49.next();
            resultSet49.next();
            resultSet49.next();
            resultSet49.next();
            resultSet49.next();
            resultSet49.next();
            resultSet49.next();
            resultSet49.next();
            resultSet49.next();
            LLAVE_ID_TASK = resultSet49.getString("ID_TASK");
            TipoDeTarea.setText(LLAVE_ID_TASK);

            ResultSet resultSet50 = statement.executeQuery("select * from DETAILS where ID_TASK= '" + LLAVE_ID_TASK.toString() + "' ");
            resultSet50.next();
            resultSet50.next();
            resultSet50.next();
            resultSet50.next();
            resultSet50.next();
            resultSet50.next();
            resultSet50.next();
            resultSet50.next();
            resultSet50.next();
            TIPO_DE_OPERACION = resultSet50.getString("OP");
            TipoDeOperacion.setText(TIPO_DE_OPERACION);

            ResultSet resultSet51 = statement.executeQuery("select * from TASKS where ID_TASK= '" + LLAVE_ID_TASK.toString() + "' ");
            resultSet51.next();
            resultSet51.next();
            resultSet51.next();
            resultSet51.next();
            resultSet51.next();
            resultSet51.next();
            resultSet51.next();
            resultSet51.next();
            resultSet51.next();
            DEPOSITO_ORIGEN = resultSet51.getString("ORIGIN_DEPOSIT");
            DepositoOrigen.setText(DEPOSITO_ORIGEN);

            ResultSet resultSet52 = statement.executeQuery("select * from TASKS where ID_TASK= '" + LLAVE_ID_TASK.toString() + "' ");
            resultSet52.next();
            resultSet52.next();
            resultSet52.next();
            resultSet52.next();
            resultSet52.next();
            resultSet52.next();
            resultSet52.next();
            resultSet52.next();
            resultSet52.next();
            DEPOSITO_DESTINO = resultSet52.getString("DESTINY_DEPOSIT");
            DepositoDestino.setText(DEPOSITO_DESTINO);

            ResultSet resultSet53 = statement.executeQuery("select * from ACTIVITIES where ID_TASK= '" + LLAVE_ID_TASK.toString() + "' ");
            resultSet53.next();
            resultSet53.next();
            resultSet53.next();
            resultSet53.next();
            resultSet53.next();
            resultSet53.next();
            resultSet53.next();
            resultSet53.next();
            resultSet53.next();
            ID_SOLICITUD = resultSet53.getString("ID_REQUEST");
            IDSolicitud.setText(ID_SOLICITUD);

            // Decimo renglon de la tabla

            ResultSet resultSet54 = statement.executeQuery("select * from usuarios where IMEI_TABLET= '" + imei.toString() + "' ");
            resultSet54.next();
            resultSet54.next();
            resultSet54.next();
            resultSet54.next();
            resultSet54.next();
            resultSet54.next();
            resultSet54.next();
            resultSet54.next();
            resultSet54.next();
            resultSet54.next();
            LLAVE_VEHICLE_NUMBER = resultSet54.getString("VEHICLE_NUMBER");

            ResultSet resultSet55 = statement.executeQuery("select * from ACTIVITIES where VEHICLE_NUMBER= '" + LLAVE_VEHICLE_NUMBER.toString() + "' ");
            resultSet55.next();
            resultSet55.next();
            resultSet55.next();
            resultSet55.next();
            resultSet55.next();
            resultSet55.next();
            resultSet55.next();
            resultSet55.next();
            resultSet55.next();
            resultSet55.next();
            LLAVE_ID_TASK = resultSet55.getString("ID_TASK");
            TipoDeTarea.setText(LLAVE_ID_TASK);

            ResultSet resultSet56 = statement.executeQuery("select * from DETAILS where ID_TASK= '" + LLAVE_ID_TASK.toString() + "' ");
            resultSet56.next();
            resultSet56.next();
            resultSet56.next();
            resultSet56.next();
            resultSet56.next();
            resultSet56.next();
            resultSet56.next();
            resultSet56.next();
            resultSet56.next();
            resultSet56.next();
            TIPO_DE_OPERACION = resultSet56.getString("OP");
            TipoDeOperacion.setText(TIPO_DE_OPERACION);

            ResultSet resultSet57 = statement.executeQuery("select * from TASKS where ID_TASK= '" + LLAVE_ID_TASK.toString() + "' ");
            resultSet57.next();
            resultSet57.next();
            resultSet57.next();
            resultSet57.next();
            resultSet57.next();
            resultSet57.next();
            resultSet57.next();
            resultSet57.next();
            resultSet57.next();
            resultSet57.next();
            DEPOSITO_ORIGEN = resultSet57.getString("ORIGIN_DEPOSIT");
            DepositoOrigen.setText(DEPOSITO_ORIGEN);

            ResultSet resultSet58 = statement.executeQuery("select * from TASKS where ID_TASK= '" + LLAVE_ID_TASK.toString() + "' ");
            resultSet58.next();
            resultSet58.next();
            resultSet58.next();
            resultSet58.next();
            resultSet58.next();
            resultSet58.next();
            resultSet58.next();
            resultSet58.next();
            resultSet58.next();
            resultSet58.next();
            DEPOSITO_DESTINO = resultSet58.getString("DESTINY_DEPOSIT");
            DepositoDestino.setText(DEPOSITO_DESTINO);

            ResultSet resultSet59 = statement.executeQuery("select * from ACTIVITIES where ID_TASK= '" + LLAVE_ID_TASK.toString() + "' ");
            resultSet59.next();
            resultSet59.next();
            resultSet59.next();
            resultSet59.next();
            resultSet59.next();
            resultSet59.next();
            resultSet59.next();
            resultSet59.next();
            resultSet59.next();
            resultSet59.next();
            ID_SOLICITUD = resultSet59.getString("ID_REQUEST");
            IDSolicitud.setText(ID_SOLICITUD);


        } catch (SQLException e){
            e.printStackTrace();
        }

    }

    public void Tab1(View v) {

//        Intent intent = new Intent(this, Checkin.class);
//        startActivity(intent);
        leerDato();
    }


    public void Tab2(View v) {

        Intent intent = new Intent(this, TEjecutadas.class);
        startActivity(intent);
    }

    public void Tab3(View v) {

        Intent intent = new Intent(this, TFinalizadas.class);
        startActivity(intent);

    }


    public void cierra(View v) {

        finish();
        System.exit(0);
    }


}

