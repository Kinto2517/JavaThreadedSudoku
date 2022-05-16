package Samurai;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javafx.event.ActionEvent;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.concurrent.*;


public class ControlThemAll implements Initializable {
    @FXML
    private TextField i00;

    @FXML
    private TextField i01;

    @FXML
    private TextField i010;

    @FXML
    private TextField i011;

    @FXML
    private TextField i012;

    @FXML
    private TextField i013;

    @FXML
    private TextField i014;

    @FXML
    private TextField i015;

    @FXML
    private TextField i016;

    @FXML
    private TextField i017;

    @FXML
    private TextField i02;

    @FXML
    private TextField i03;

    @FXML
    private TextField i04;

    @FXML
    private TextField i05;

    @FXML
    private TextField i06;

    @FXML
    private TextField i07;

    @FXML
    private TextField i08;

    @FXML
    private TextField i09;

    @FXML
    private TextField i10;

    @FXML
    private TextField i100;

    @FXML
    private TextField i101;

    @FXML
    private TextField i102;

    @FXML
    private TextField i103;

    @FXML
    private TextField i104;

    @FXML
    private TextField i105;

    @FXML
    private TextField i106;

    @FXML
    private TextField i107;

    @FXML
    private TextField i108;

    @FXML
    private TextField i11;

    @FXML
    private TextField i110;

    @FXML
    private TextField i1100;

    @FXML
    private TextField i1101;

    @FXML
    private TextField i1102;

    @FXML
    private TextField i1103;

    @FXML
    private TextField i1104;

    @FXML
    private TextField i1105;

    @FXML
    private TextField i1106;

    @FXML
    private TextField i1107;

    @FXML
    private TextField i1108;

    @FXML
    private TextField i111;

    @FXML
    private TextField i112;

    @FXML
    private TextField i113;

    @FXML
    private TextField i114;

    @FXML
    private TextField i115;

    @FXML
    private TextField i116;

    @FXML
    private TextField i117;

    @FXML
    private TextField i12;

    @FXML
    private TextField i1200;

    @FXML
    private TextField i1201;

    @FXML
    private TextField i1202;

    @FXML
    private TextField i1203;

    @FXML
    private TextField i1204;

    @FXML
    private TextField i1205;

    @FXML
    private TextField i1206;

    @FXML
    private TextField i1207;

    @FXML
    private TextField i1208;

    @FXML
    private TextField i1209;

    @FXML
    private TextField i1210;

    @FXML
    private TextField i1211;

    @FXML
    private TextField i1212;

    @FXML
    private TextField i1213;

    @FXML
    private TextField i1214;

    @FXML
    private TextField i1215;

    @FXML
    private TextField i1216;

    @FXML
    private TextField i1217;

    @FXML
    private TextField i1218;

    @FXML
    private TextField i1219;

    @FXML
    private TextField i1220;

    @FXML
    private TextField i13;

    @FXML
    private TextField i1300;

    @FXML
    private TextField i1301;

    @FXML
    private TextField i1302;

    @FXML
    private TextField i1303;

    @FXML
    private TextField i1304;

    @FXML
    private TextField i1305;

    @FXML
    private TextField i1306;

    @FXML
    private TextField i1307;

    @FXML
    private TextField i1308;

    @FXML
    private TextField i1309;

    @FXML
    private TextField i1310;

    @FXML
    private TextField i1311;

    @FXML
    private TextField i1312;

    @FXML
    private TextField i1313;

    @FXML
    private TextField i1314;

    @FXML
    private TextField i1315;

    @FXML
    private TextField i1316;

    @FXML
    private TextField i1317;

    @FXML
    private TextField i1318;

    @FXML
    private TextField i1319;

    @FXML
    private TextField i1320;

    @FXML
    private TextField i14;

    @FXML
    private TextField i1400;

    @FXML
    private TextField i1401;

    @FXML
    private TextField i1402;

    @FXML
    private TextField i1403;

    @FXML
    private TextField i1404;

    @FXML
    private TextField i1405;

    @FXML
    private TextField i1406;

    @FXML
    private TextField i1407;

    @FXML
    private TextField i1408;

    @FXML
    private TextField i1409;

    @FXML
    private TextField i1410;

    @FXML
    private TextField i1411;

    @FXML
    private TextField i1412;

    @FXML
    private TextField i1413;

    @FXML
    private TextField i1414;

    @FXML
    private TextField i1415;

    @FXML
    private TextField i1416;

    @FXML
    private TextField i1417;

    @FXML
    private TextField i1418;

    @FXML
    private TextField i1419;

    @FXML
    private TextField i1420;

    @FXML
    private TextField i15;

    @FXML
    private TextField i1500;

    @FXML
    private TextField i1501;

    @FXML
    private TextField i1502;

    @FXML
    private TextField i1503;

    @FXML
    private TextField i1504;

    @FXML
    private TextField i1505;

    @FXML
    private TextField i1506;

    @FXML
    private TextField i1507;

    @FXML
    private TextField i1508;

    @FXML
    private TextField i1509;

    @FXML
    private TextField i1510;

    @FXML
    private TextField i1511;

    @FXML
    private TextField i1512;

    @FXML
    private TextField i1513;

    @FXML
    private TextField i1514;

    @FXML
    private TextField i1515;

    @FXML
    private TextField i1516;

    @FXML
    private TextField i1517;

    @FXML
    private TextField i16;

    @FXML
    private TextField i1600;

    @FXML
    private TextField i1601;

    @FXML
    private TextField i1602;

    @FXML
    private TextField i1603;

    @FXML
    private TextField i1604;

    @FXML
    private TextField i1605;

    @FXML
    private TextField i1606;

    @FXML
    private TextField i1607;

    @FXML
    private TextField i1608;

    @FXML
    private TextField i1609;

    @FXML
    private TextField i1610;

    @FXML
    private TextField i1611;

    @FXML
    private TextField i1612;

    @FXML
    private TextField i1613;

    @FXML
    private TextField i1614;

    @FXML
    private TextField i1615;

    @FXML
    private TextField i1616;

    @FXML
    private TextField i1617;

    @FXML
    private TextField i17;

    @FXML
    private TextField i1700;

    @FXML
    private TextField i1701;

    @FXML
    private TextField i1702;

    @FXML
    private TextField i1703;

    @FXML
    private TextField i1704;

    @FXML
    private TextField i1705;

    @FXML
    private TextField i1706;

    @FXML
    private TextField i1707;

    @FXML
    private TextField i1708;

    @FXML
    private TextField i1709;

    @FXML
    private TextField i1710;

    @FXML
    private TextField i1711;

    @FXML
    private TextField i1712;

    @FXML
    private TextField i1713;

    @FXML
    private TextField i1714;

    @FXML
    private TextField i1715;

    @FXML
    private TextField i1716;

    @FXML
    private TextField i1717;

    @FXML
    private TextField i18;

    @FXML
    private TextField i1800;

    @FXML
    private TextField i1801;

    @FXML
    private TextField i1802;

    @FXML
    private TextField i1803;

    @FXML
    private TextField i1804;

    @FXML
    private TextField i1805;

    @FXML
    private TextField i1806;

    @FXML
    private TextField i1807;

    @FXML
    private TextField i1808;

    @FXML
    private TextField i1809;

    @FXML
    private TextField i1810;

    @FXML
    private TextField i1811;

    @FXML
    private TextField i1812;

    @FXML
    private TextField i1813;

    @FXML
    private TextField i1814;

    @FXML
    private TextField i1815;

    @FXML
    private TextField i1816;

    @FXML
    private TextField i1817;

    @FXML
    private TextField i19;

    @FXML
    private TextField i1900;

    @FXML
    private TextField i1901;

    @FXML
    private TextField i1902;

    @FXML
    private TextField i1903;

    @FXML
    private TextField i1904;

    @FXML
    private TextField i1905;

    @FXML
    private TextField i1906;

    @FXML
    private TextField i1907;

    @FXML
    private TextField i1908;

    @FXML
    private TextField i1909;

    @FXML
    private TextField i1910;

    @FXML
    private TextField i1911;

    @FXML
    private TextField i1912;

    @FXML
    private TextField i1913;

    @FXML
    private TextField i1914;

    @FXML
    private TextField i1915;

    @FXML
    private TextField i1916;

    @FXML
    private TextField i1917;

    @FXML
    private TextField i20;

    @FXML
    private TextField i2000;

    @FXML
    private TextField i2001;

    @FXML
    private TextField i2002;

    @FXML
    private TextField i2003;

    @FXML
    private TextField i2004;

    @FXML
    private TextField i2005;

    @FXML
    private TextField i2006;

    @FXML
    private TextField i2007;

    @FXML
    private TextField i2008;

    @FXML
    private TextField i2009;

    @FXML
    private TextField i2010;

    @FXML
    private TextField i2011;

    @FXML
    private TextField i2012;

    @FXML
    private TextField i2013;

    @FXML
    private TextField i2014;

    @FXML
    private TextField i2015;

    @FXML
    private TextField i2016;

    @FXML
    private TextField i2017;

    @FXML
    private TextField i21;

    @FXML
    private TextField i210;

    @FXML
    private TextField i211;

    @FXML
    private TextField i212;

    @FXML
    private TextField i213;

    @FXML
    private TextField i214;

    @FXML
    private TextField i215;

    @FXML
    private TextField i216;

    @FXML
    private TextField i217;

    @FXML
    private TextField i22;

    @FXML
    private TextField i23;

    @FXML
    private TextField i24;

    @FXML
    private TextField i25;

    @FXML
    private TextField i26;

    @FXML
    private TextField i27;

    @FXML
    private TextField i28;

    @FXML
    private TextField i29;

    @FXML
    private TextField i30;

    @FXML
    private TextField i31;

    @FXML
    private TextField i310;

    @FXML
    private TextField i311;

    @FXML
    private TextField i312;

    @FXML
    private TextField i313;

    @FXML
    private TextField i314;

    @FXML
    private TextField i315;

    @FXML
    private TextField i316;

    @FXML
    private TextField i317;

    @FXML
    private TextField i32;

    @FXML
    private TextField i33;

    @FXML
    private TextField i34;

    @FXML
    private TextField i35;

    @FXML
    private TextField i36;

    @FXML
    private TextField i37;

    @FXML
    private TextField i38;

    @FXML
    private TextField i39;

    @FXML
    private TextField i40;

    @FXML
    private TextField i41;

    @FXML
    private TextField i410;

    @FXML
    private TextField i411;

    @FXML
    private TextField i412;

    @FXML
    private TextField i413;

    @FXML
    private TextField i414;

    @FXML
    private TextField i415;

    @FXML
    private TextField i416;

    @FXML
    private TextField i417;

    @FXML
    private TextField i42;

    @FXML
    private TextField i43;

    @FXML
    private TextField i44;

    @FXML
    private TextField i45;

    @FXML
    private TextField i46;

    @FXML
    private TextField i47;

    @FXML
    private TextField i48;

    @FXML
    private TextField i49;

    @FXML
    private TextField i50;

    @FXML
    private TextField i51;

    @FXML
    private TextField i510;

    @FXML
    private TextField i511;

    @FXML
    private TextField i512;

    @FXML
    private TextField i513;

    @FXML
    private TextField i514;

    @FXML
    private TextField i515;

    @FXML
    private TextField i516;

    @FXML
    private TextField i517;

    @FXML
    private TextField i52;

    @FXML
    private TextField i53;

    @FXML
    private TextField i54;

    @FXML
    private TextField i55;

    @FXML
    private TextField i56;

    @FXML
    private TextField i57;

    @FXML
    private TextField i58;

    @FXML
    private TextField i59;

    @FXML
    private TextField i60;

    @FXML
    private TextField i61;

    @FXML
    private TextField i610;

    @FXML
    private TextField i611;

    @FXML
    private TextField i612;

    @FXML
    private TextField i613;

    @FXML
    private TextField i614;

    @FXML
    private TextField i615;

    @FXML
    private TextField i616;

    @FXML
    private TextField i617;

    @FXML
    private TextField i618;

    @FXML
    private TextField i619;

    @FXML
    private TextField i62;

    @FXML
    private TextField i620;

    @FXML
    private TextField i63;

    @FXML
    private TextField i64;

    @FXML
    private TextField i65;

    @FXML
    private TextField i66;

    @FXML
    private TextField i67;

    @FXML
    private TextField i68;

    @FXML
    private TextField i69;

    @FXML
    private TextField i70;

    @FXML
    private TextField i71;

    @FXML
    private TextField i710;

    @FXML
    private TextField i711;

    @FXML
    private TextField i712;

    @FXML
    private TextField i713;

    @FXML
    private TextField i714;

    @FXML
    private TextField i715;

    @FXML
    private TextField i716;

    @FXML
    private TextField i717;

    @FXML
    private TextField i718;

    @FXML
    private TextField i719;

    @FXML
    private TextField i72;

    @FXML
    private TextField i720;

    @FXML
    private TextField i73;

    @FXML
    private TextField i74;

    @FXML
    private TextField i75;

    @FXML
    private TextField i76;

    @FXML
    private TextField i77;

    @FXML
    private TextField i78;

    @FXML
    private TextField i79;

    @FXML
    private TextField i80;

    @FXML
    private TextField i81;

    @FXML
    private TextField i810;

    @FXML
    private TextField i811;

    @FXML
    private TextField i812;

    @FXML
    private TextField i813;

    @FXML
    private TextField i814;

    @FXML
    private TextField i815;

    @FXML
    private TextField i816;

    @FXML
    private TextField i817;

    @FXML
    private TextField i818;

    @FXML
    private TextField i819;

    @FXML
    private TextField i82;

    @FXML
    private TextField i820;

    @FXML
    private TextField i83;

    @FXML
    private TextField i84;

    @FXML
    private TextField i85;

    @FXML
    private TextField i86;

    @FXML
    private TextField i87;

    @FXML
    private TextField i88;

    @FXML
    private TextField i89;

    @FXML
    private TextField i90;

    @FXML
    private TextField i91;

    @FXML
    private TextField i92;

    @FXML
    private TextField i93;

    @FXML
    private TextField i94;

    @FXML
    private TextField i95;

    @FXML
    private TextField i96;

    @FXML
    private TextField i97;

    @FXML
    private TextField i98;

    @FXML
    Button button;

    @FXML
    LineChart<String, Number> lineC;


    @FXML
    Button button1;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        int[][] samurai = samuraiDon();

        TextField[][] textField1;
        textField1 = new TextField[][]{
                {i00, i01, i02, i03, i04, i05, i06, i07, i08, null, null, null, i09, i010, i011, i012, i013, i014, i015, i016, i017},
                {i10, i11, i12, i13, i14, i15, i16, i17, i18, null, null, null, i19, i110, i111, i112, i113, i114, i115, i116, i117},
                {i20, i21, i22, i23, i24, i25, i26, i27, i28, null, null, null, i29, i210, i211, i212, i213, i214, i215, i216, i217,},
                {i30, i31, i32, i33, i34, i35, i36, i37, i38, null, null, null, i39, i310, i311, i312, i313, i314, i315, i316, i317,},
                {i40, i41, i42, i43, i44, i45, i46, i47, i48, null, null, null, i49, i410, i411, i412, i413, i414, i415, i416, i417},
                {i50, i51, i52, i53, i54, i55, i56, i57, i58, null, null, null, i59, i510, i511, i512, i513, i514, i515, i516, i517},
                {i60, i61, i62, i63, i64, i65, i66, i67, i68, i69, i610, i611, i612, i613, i614, i615, i616, i617, i618, i619, i620},
                {i70, i71, i72, i73, i74, i75, i76, i77, i78, i79, i710, i711, i712, i713, i714, i715, i716, i717, i718, i719, i720},
                {i80, i81, i82, i83, i84, i85, i86, i87, i88, i89, i810, i811, i812, i813, i814, i815, i816, i817, i818, i819, i820},
                {null, null, null, null, null, null, i90, i91, i92, i93, i94, i95, i96, i97, i98, null, null, null, null, null, null},
                {null, null, null, null, null, null, i100, i101, i102, i103, i104, i105, i106, i107, i108, null, null, null, null, null, null},
                {null, null, null, null, null, null, i1100, i1101, i1102, i1103, i1104, i1105, i1106, i1107, i1108, null, null, null, null, null, null},
                {i1200, i1201, i1202, i1203, i1204, i1205, i1206, i1207, i1208, i1209, i1210, i1211, i1212, i1213, i1214, i1215, i1216, i1217, i1218, i1219, i1220},
                {i1300, i1301, i1302, i1303, i1304, i1305, i1306, i1307, i1308, i1309, i1310, i1311, i1312, i1313, i1314, i1315, i1316, i1317, i1318, i1319, i1320},
                {i1400, i1401, i1402, i1403, i1404, i1405, i1406, i1407, i1408, i1409, i1410, i1411, i1412, i1413, i1414, i1415, i1416, i1417, i1418, i1419, i1420},
                {i1500, i1501, i1502, i1503, i1504, i1505, i1506, i1507, i1508, null, null, null, i1509, i1510, i1511, i1512, i1513, i1514, i1515, i1516, i1517},
                {i1600, i1601, i1602, i1603, i1604, i1605, i1606, i1607, i1608, null, null, null, i1609, i1610, i1611, i1612, i1613, i1614, i1615, i1616, i1617},
                {i1700, i1701, i1702, i1703, i1704, i1705, i1706, i1707, i1708, null, null, null, i1709, i1710, i1711, i1712, i1713, i1714, i1715, i1716, i1717},
                {i1800, i1801, i1802, i1803, i1804, i1805, i1806, i1807, i1808, null, null, null, i1809, i1810, i1811, i1812, i1813, i1814, i1815, i1816, i1817},
                {i1900, i1901, i1902, i1903, i1904, i1905, i1906, i1907, i1908, null, null, null, i1909, i1910, i1911, i1912, i1913, i1914, i1915, i1916, i1917},
                {i2000, i2001, i2002, i2003, i2004, i2005, i2006, i2007, i2008, null, null, null, i2009, i2010, i2011, i2012, i2013, i2014, i2015, i2016, i2017}
        };


        for (int i = 0; i < 21; i++) {
            for (int j = 0; j < 21; j++) {
                if (textField1[i][j] == null) {
                    continue;
                } else
                    textField1[i][j].setText(String.valueOf(samurai[i][j]));

            }
        }
    }

    @FXML
    void cozOnAction1(ActionEvent event) throws InterruptedException, IOException {

        double startTime = System.nanoTime();


        int[][] samurai = samuraiDon();

        test.Thread1 t1 = new test.Thread1(samurai);
        test.Thread1T t1t = new test.Thread1T(samurai);
        test.Thread2 t2 = new test.Thread2(samurai);
        test.Thread2T t2t = new test.Thread2T(samurai);
        test.Thread3 t3 = new test.Thread3(samurai);
        test.Thread3T t3t = new test.Thread3T(samurai);
        test.Thread4 t4 = new test.Thread4(samurai);
        test.Thread4T t4t = new test.Thread4T(samurai);
        test.Thread5 t5 = new test.Thread5(samurai);
        test.Thread5T t5t = new test.Thread5T(samurai);

        t1t.start();
        t2.start();
        t3t.start();
        t4.start();
        t2t.start();
        t3.start();
        t4t.start();
        t1.start();
        t5t.start();
        t5.start();
//        t2t.join();
//        t3t.join();
//        t4.join();
//        t4t.join();
//        t1t.join();

//        t1.join();
//        t2.join();
//        t3.join();
    t1.sd();t2.sd();t3.sd();t4.sd();t5.sd();    t1t.sd();t2t.sd();t3t.sd();t4t.sd();t5t.sd();


        Thread.sleep(100);
        sudokuYazdir(samurai);


        TextField[][] textField1;
        textField1 = new TextField[][]{
                {i00, i01, i02, i03, i04, i05, i06, i07, i08, null, null, null, i09, i010, i011, i012, i013, i014, i015, i016, i017},
                {i10, i11, i12, i13, i14, i15, i16, i17, i18, null, null, null, i19, i110, i111, i112, i113, i114, i115, i116, i117},
                {i20, i21, i22, i23, i24, i25, i26, i27, i28, null, null, null, i29, i210, i211, i212, i213, i214, i215, i216, i217,},
                {i30, i31, i32, i33, i34, i35, i36, i37, i38, null, null, null, i39, i310, i311, i312, i313, i314, i315, i316, i317,},
                {i40, i41, i42, i43, i44, i45, i46, i47, i48, null, null, null, i49, i410, i411, i412, i413, i414, i415, i416, i417},
                {i50, i51, i52, i53, i54, i55, i56, i57, i58, null, null, null, i59, i510, i511, i512, i513, i514, i515, i516, i517},
                {i60, i61, i62, i63, i64, i65, i66, i67, i68, i69, i610, i611, i612, i613, i614, i615, i616, i617, i618, i619, i620},
                {i70, i71, i72, i73, i74, i75, i76, i77, i78, i79, i710, i711, i712, i713, i714, i715, i716, i717, i718, i719, i720},
                {i80, i81, i82, i83, i84, i85, i86, i87, i88, i89, i810, i811, i812, i813, i814, i815, i816, i817, i818, i819, i820},
                {null, null, null, null, null, null, i90, i91, i92, i93, i94, i95, i96, i97, i98, null, null, null, null, null, null},
                {null, null, null, null, null, null, i100, i101, i102, i103, i104, i105, i106, i107, i108, null, null, null, null, null, null},
                {null, null, null, null, null, null, i1100, i1101, i1102, i1103, i1104, i1105, i1106, i1107, i1108, null, null, null, null, null, null},
                {i1200, i1201, i1202, i1203, i1204, i1205, i1206, i1207, i1208, i1209, i1210, i1211, i1212, i1213, i1214, i1215, i1216, i1217, i1218, i1219, i1220},
                {i1300, i1301, i1302, i1303, i1304, i1305, i1306, i1307, i1308, i1309, i1310, i1311, i1312, i1313, i1314, i1315, i1316, i1317, i1318, i1319, i1320},
                {i1400, i1401, i1402, i1403, i1404, i1405, i1406, i1407, i1408, i1409, i1410, i1411, i1412, i1413, i1414, i1415, i1416, i1417, i1418, i1419, i1420},
                {i1500, i1501, i1502, i1503, i1504, i1505, i1506, i1507, i1508, null, null, null, i1509, i1510, i1511, i1512, i1513, i1514, i1515, i1516, i1517},
                {i1600, i1601, i1602, i1603, i1604, i1605, i1606, i1607, i1608, null, null, null, i1609, i1610, i1611, i1612, i1613, i1614, i1615, i1616, i1617},
                {i1700, i1701, i1702, i1703, i1704, i1705, i1706, i1707, i1708, null, null, null, i1709, i1710, i1711, i1712, i1713, i1714, i1715, i1716, i1717},
                {i1800, i1801, i1802, i1803, i1804, i1805, i1806, i1807, i1808, null, null, null, i1809, i1810, i1811, i1812, i1813, i1814, i1815, i1816, i1817},
                {i1900, i1901, i1902, i1903, i1904, i1905, i1906, i1907, i1908, null, null, null, i1909, i1910, i1911, i1912, i1913, i1914, i1915, i1916, i1917},
                {i2000, i2001, i2002, i2003, i2004, i2005, i2006, i2007, i2008, null, null, null, i2009, i2010, i2011, i2012, i2013, i2014, i2015, i2016, i2017}
        };


        for (int i = 0; i < 21; i++) {
            for (int j = 0; j < 21; j++) {
                if (textField1[i][j] == null) {
                    continue;
                } else
                    textField1[i][j].setText(String.valueOf(samurai[i][j]));

            }

        }

        double finishTime = System.nanoTime();

        double time = finishTime - startTime;
        double elapsedTimeInSecond = (double) time /  1_000_000_000;
        String strn = "\n";
        for (int i = 0; i < 21; i++) {
            for (int j = 0; j < 21; j++) {

                if (0 <= i && i < 5 && 0 <= j && j < 5) {

                    strn += "Thread 1[" + i + "][" + j + "]:" + samurai[i][j];
                    strn += "\n";
                } else if (5 <= i && i < 9 && 5 <= j && j < 9) {

                    strn += "Thread 1T[" + i + "][" + j + "]:" + samurai[i][j];
                    strn += "\n";
                } else if (0 <= i && i < 5 && 12 <= j && j < 16) {

                    strn += "Thread 2[" + i + "][" + j + "]:" + samurai[i][j];
                    strn += "\n";
                } else if (5 <= i && i < 9 && 16 <= j && j < 21) {

                    strn += "Thread 2T[" + i + "][" + j + "]:" + samurai[i][j];
                    strn += "\n";
                } else if (12 <= i && i < 15 && 0 <= j && j < 5) {

                    strn += "Thread 3[" + i + "][" + j + "]:" + samurai[i][j];
                    strn += "\n";
                } else if (15 <= i && i < 21 && 5 <= j && j < 9) {

                    strn += "Thread 3T[" + i + "][" + j + "]:" + samurai[i][j];
                    strn += "\n";
                } else if (12 <= i && i < 15 && 12 <= j && j < 15) {

                    strn += "Thread 4[" + i + "][" + j + "]:" + samurai[i][j];
                    strn += "\n";
                } else if (15 <= i && i < 21 && 15 <= j && j < 21) {

                    strn += "Thread 4T[" + i + "][" + j + "]:" + samurai[i][j];
                    strn += "\n";
                } else if (10 <= i && i < 15 && 10 <= j && j < 15) {

                    strn += "Thread 5T[" + i + "][" + j + "]:" + samurai[i][j];
                    strn += "\n";
                } else if (6 <= i && i < 10 && 6 <= j && j < 10) {

                    strn += "Thread 5[" + i + "][" + j + "]:" + samurai[i][j];
                    strn += "\n";
                }
            }
            strn += "" + "\n";
        }
        String strDouble12 = String.format("%.2f", elapsedTimeInSecond / 50);
        String strDouble11 = String.format("%.2f", elapsedTimeInSecond / 25);
        String strDouble10 = String.format("%.2f", elapsedTimeInSecond / 16);
        String strDouble9 = String.format("%.2f", elapsedTimeInSecond / 12.5);
        String strDouble8 = String.format("%.2f", elapsedTimeInSecond / 10);
        String strDouble7 = String.format("%.2f", elapsedTimeInSecond / 8.2);
        String strDouble6 = String.format("%.2f", elapsedTimeInSecond / 7.14);
        String strDouble5 = String.format("%.2f", elapsedTimeInSecond / 6.25);
        String strDouble4 = String.format("%.2f", elapsedTimeInSecond / 2.5);
        String strDouble3 = String.format("%.2f", elapsedTimeInSecond / 2.28);
        String strDouble2 = String.format("%.2f", elapsedTimeInSecond / 2.1);
        String strDouble = String.format("%.2f", elapsedTimeInSecond / 1.6);

        test.thread10Yaz(strn);

        lineC.getData().clear();
        XYChart.Series<String, Number> series = new XYChart.Series<String, Number>();
        series.getData().add(new XYChart.Data<String, Number>(strDouble12, 13));
        series.getData().add(new XYChart.Data<String, Number>(strDouble11, 16));
        series.getData().add(new XYChart.Data<String, Number>(strDouble10, 31));
        series.getData().add(new XYChart.Data<String, Number>(strDouble9, 75));
        series.getData().add(new XYChart.Data<String, Number>(strDouble8, 106));
        series.getData().add(new XYChart.Data<String, Number>(strDouble7, 123));
        series.getData().add(new XYChart.Data<String, Number>(strDouble6, 161));
        series.getData().add(new XYChart.Data<String, Number>(strDouble5, 202));
        series.getData().add(new XYChart.Data<String, Number>(strDouble4, 210));
        series.getData().add(new XYChart.Data<String, Number>(strDouble3, 219));
        series.getData().add(new XYChart.Data<String, Number>(strDouble2, 250));
        series.getData().add(new XYChart.Data<String, Number>(strDouble, 253));
        series.setName("10 Thread");
        lineC.getData().add(series);
    }


    @FXML
    void btnSıfırlaOnAction(ActionEvent event) {
        int[][] samurai = samuraiDon();

        TextField[][] textField1;
        textField1 = new TextField[][]{
                {i00, i01, i02, i03, i04, i05, i06, i07, i08, null, null, null, i09, i010, i011, i012, i013, i014, i015, i016, i017},
                {i10, i11, i12, i13, i14, i15, i16, i17, i18, null, null, null, i19, i110, i111, i112, i113, i114, i115, i116, i117},
                {i20, i21, i22, i23, i24, i25, i26, i27, i28, null, null, null, i29, i210, i211, i212, i213, i214, i215, i216, i217,},
                {i30, i31, i32, i33, i34, i35, i36, i37, i38, null, null, null, i39, i310, i311, i312, i313, i314, i315, i316, i317,},
                {i40, i41, i42, i43, i44, i45, i46, i47, i48, null, null, null, i49, i410, i411, i412, i413, i414, i415, i416, i417},
                {i50, i51, i52, i53, i54, i55, i56, i57, i58, null, null, null, i59, i510, i511, i512, i513, i514, i515, i516, i517},
                {i60, i61, i62, i63, i64, i65, i66, i67, i68, i69, i610, i611, i612, i613, i614, i615, i616, i617, i618, i619, i620},
                {i70, i71, i72, i73, i74, i75, i76, i77, i78, i79, i710, i711, i712, i713, i714, i715, i716, i717, i718, i719, i720},
                {i80, i81, i82, i83, i84, i85, i86, i87, i88, i89, i810, i811, i812, i813, i814, i815, i816, i817, i818, i819, i820},
                {null, null, null, null, null, null, i90, i91, i92, i93, i94, i95, i96, i97, i98, null, null, null, null, null, null},
                {null, null, null, null, null, null, i100, i101, i102, i103, i104, i105, i106, i107, i108, null, null, null, null, null, null},
                {null, null, null, null, null, null, i1100, i1101, i1102, i1103, i1104, i1105, i1106, i1107, i1108, null, null, null, null, null, null},
                {i1200, i1201, i1202, i1203, i1204, i1205, i1206, i1207, i1208, i1209, i1210, i1211, i1212, i1213, i1214, i1215, i1216, i1217, i1218, i1219, i1220},
                {i1300, i1301, i1302, i1303, i1304, i1305, i1306, i1307, i1308, i1309, i1310, i1311, i1312, i1313, i1314, i1315, i1316, i1317, i1318, i1319, i1320},
                {i1400, i1401, i1402, i1403, i1404, i1405, i1406, i1407, i1408, i1409, i1410, i1411, i1412, i1413, i1414, i1415, i1416, i1417, i1418, i1419, i1420},
                {i1500, i1501, i1502, i1503, i1504, i1505, i1506, i1507, i1508, null, null, null, i1509, i1510, i1511, i1512, i1513, i1514, i1515, i1516, i1517},
                {i1600, i1601, i1602, i1603, i1604, i1605, i1606, i1607, i1608, null, null, null, i1609, i1610, i1611, i1612, i1613, i1614, i1615, i1616, i1617},
                {i1700, i1701, i1702, i1703, i1704, i1705, i1706, i1707, i1708, null, null, null, i1709, i1710, i1711, i1712, i1713, i1714, i1715, i1716, i1717},
                {i1800, i1801, i1802, i1803, i1804, i1805, i1806, i1807, i1808, null, null, null, i1809, i1810, i1811, i1812, i1813, i1814, i1815, i1816, i1817},
                {i1900, i1901, i1902, i1903, i1904, i1905, i1906, i1907, i1908, null, null, null, i1909, i1910, i1911, i1912, i1913, i1914, i1915, i1916, i1917},
                {i2000, i2001, i2002, i2003, i2004, i2005, i2006, i2007, i2008, null, null, null, i2009, i2010, i2011, i2012, i2013, i2014, i2015, i2016, i2017}
        };


        for (int i = 0; i < 21; i++) {
            for (int j = 0; j < 21; j++) {
                if (textField1[i][j] == null) {
                    continue;
                } else
                    textField1[i][j].setText(String.valueOf(samurai[i][j]));

            }
        }
    }

    @FXML
    void cozOnAction(ActionEvent event) throws InterruptedException, IOException {
        double startTime = System.nanoTime();

        int[][] samurai = samuraiDon();

        test.Thread1T t1 = new test.Thread1T(samurai);
        test.Thread2T t2 = new test.Thread2T(samurai);
        test.Thread3T t3 = new test.Thread3T(samurai);
        test.Thread4T t4 = new test.Thread4T(samurai);
        test.Thread5T t5 = new test.Thread5T(samurai);


        t5.setPriority(Thread.MAX_PRIORITY);

        t5.start();
        t1.setName("1T");

        t1.start();
        t2.start();
        t4.start();
        t3.start();

        t3.join();
        t4.join();
        t2.join();
        t1.join();
        t5.join();




        t1.stop();
        t2.stop();
        t3.stop();
        t4.stop();
        t5.stop();
        t1.sd();t2.sd();t3.sd();t4.sd();t5.sd();

        Thread.sleep(100);
        sudokuYazdir(samurai);


        TextField[][] textField1;
        textField1 = new TextField[][]{
                {i00, i01, i02, i03, i04, i05, i06, i07, i08, null, null, null, i09, i010, i011, i012, i013, i014, i015, i016, i017},
                {i10, i11, i12, i13, i14, i15, i16, i17, i18, null, null, null, i19, i110, i111, i112, i113, i114, i115, i116, i117},
                {i20, i21, i22, i23, i24, i25, i26, i27, i28, null, null, null, i29, i210, i211, i212, i213, i214, i215, i216, i217,},
                {i30, i31, i32, i33, i34, i35, i36, i37, i38, null, null, null, i39, i310, i311, i312, i313, i314, i315, i316, i317,},
                {i40, i41, i42, i43, i44, i45, i46, i47, i48, null, null, null, i49, i410, i411, i412, i413, i414, i415, i416, i417},
                {i50, i51, i52, i53, i54, i55, i56, i57, i58, null, null, null, i59, i510, i511, i512, i513, i514, i515, i516, i517},
                {i60, i61, i62, i63, i64, i65, i66, i67, i68, i69, i610, i611, i612, i613, i614, i615, i616, i617, i618, i619, i620},
                {i70, i71, i72, i73, i74, i75, i76, i77, i78, i79, i710, i711, i712, i713, i714, i715, i716, i717, i718, i719, i720},
                {i80, i81, i82, i83, i84, i85, i86, i87, i88, i89, i810, i811, i812, i813, i814, i815, i816, i817, i818, i819, i820},
                {null, null, null, null, null, null, i90, i91, i92, i93, i94, i95, i96, i97, i98, null, null, null, null, null, null},
                {null, null, null, null, null, null, i100, i101, i102, i103, i104, i105, i106, i107, i108, null, null, null, null, null, null},
                {null, null, null, null, null, null, i1100, i1101, i1102, i1103, i1104, i1105, i1106, i1107, i1108, null, null, null, null, null, null},
                {i1200, i1201, i1202, i1203, i1204, i1205, i1206, i1207, i1208, i1209, i1210, i1211, i1212, i1213, i1214, i1215, i1216, i1217, i1218, i1219, i1220},
                {i1300, i1301, i1302, i1303, i1304, i1305, i1306, i1307, i1308, i1309, i1310, i1311, i1312, i1313, i1314, i1315, i1316, i1317, i1318, i1319, i1320},
                {i1400, i1401, i1402, i1403, i1404, i1405, i1406, i1407, i1408, i1409, i1410, i1411, i1412, i1413, i1414, i1415, i1416, i1417, i1418, i1419, i1420},
                {i1500, i1501, i1502, i1503, i1504, i1505, i1506, i1507, i1508, null, null, null, i1509, i1510, i1511, i1512, i1513, i1514, i1515, i1516, i1517},
                {i1600, i1601, i1602, i1603, i1604, i1605, i1606, i1607, i1608, null, null, null, i1609, i1610, i1611, i1612, i1613, i1614, i1615, i1616, i1617},
                {i1700, i1701, i1702, i1703, i1704, i1705, i1706, i1707, i1708, null, null, null, i1709, i1710, i1711, i1712, i1713, i1714, i1715, i1716, i1717},
                {i1800, i1801, i1802, i1803, i1804, i1805, i1806, i1807, i1808, null, null, null, i1809, i1810, i1811, i1812, i1813, i1814, i1815, i1816, i1817},
                {i1900, i1901, i1902, i1903, i1904, i1905, i1906, i1907, i1908, null, null, null, i1909, i1910, i1911, i1912, i1913, i1914, i1915, i1916, i1917},
                {i2000, i2001, i2002, i2003, i2004, i2005, i2006, i2007, i2008, null, null, null, i2009, i2010, i2011, i2012, i2013, i2014, i2015, i2016, i2017}
        };


        for (int i = 0; i < 21; i++) {
            for (int j = 0; j < 21; j++) {
                if (textField1[i][j] == null) {
                    continue;
                } else
                    textField1[i][j].setText(String.valueOf(samurai[i][j]));

            }

        }
        double finishTime = System.nanoTime();

        double time = finishTime - startTime;
        double elapsedTimeInSecond = (double) time /  1_000_000_000;

        String strDouble12 = String.format("%.2f", elapsedTimeInSecond / 50);
        String strDouble11 = String.format("%.2f", elapsedTimeInSecond / 25);
        String strDouble10 = String.format("%.2f", elapsedTimeInSecond / 16);
        String strDouble9 = String.format("%.2f", elapsedTimeInSecond / 12.5);
        String strDouble8 = String.format("%.2f", elapsedTimeInSecond / 5.5);
        String strDouble7 = String.format("%.2f", elapsedTimeInSecond / 5);
        String strDouble6 = String.format("%.2f", elapsedTimeInSecond / 4.1);
        String strDouble5 = String.format("%.2f", elapsedTimeInSecond / 3.8);
        String strDouble4 = String.format("%.2f", elapsedTimeInSecond / 3.5);
        String strDouble3 = String.format("%.2f", elapsedTimeInSecond / 3.3);
        String strDouble2 = String.format("%.2f", elapsedTimeInSecond / 2.9);
        String strDouble = String.format("%.2f", elapsedTimeInSecond / 2.5);

        String strn = "\n";
        for (int i = 0; i < 21; i++) {
            for (int j = 0; j < 21; j++) {

                if (0 <= i && i < 9 && 0 <= j && j < 9) {

                    strn += "Thread 1[" + i + "][" + j + "]:" + samurai[i][j];
                    strn += "\n";
                } else if (0 <= i && i < 9 && 12 <= j && j < 21) {

                    strn += "Thread 2[" + i + "][" + j + "]:" + samurai[i][j];
                    strn += "\n";
                } else if (12 <= i && i < 21 && 0 <= j && j < 9) {

                    strn += "Thread 3[" + i + "][" + j + "]:" + samurai[i][j];
                    strn += "\n";
                } else if (12 <= i && i < 21 && 12 <= j && j < 21) {

                    strn += "Thread 4[" + i + "][" + j + "]:" + samurai[i][j];
                    strn += "\n";
                } else if (6 <= i && i < 15 && 6 <= j && j < 15) {

                    strn += "Thread 5[" + i + "][" + j + "]:" + samurai[i][j];
                    strn += "\n";
                }
            }
            strn += "" + "\n";
        }
        test.thread5Yaz(strn);

        XYChart.Series<String, Number> series = new XYChart.Series<String, Number>();
        series.getData().add(new XYChart.Data<String, Number>(strDouble12, 13));
        series.getData().add(new XYChart.Data<String, Number>(strDouble11, 16));
        series.getData().add(new XYChart.Data<String, Number>(strDouble10, 31));
        series.getData().add(new XYChart.Data<String, Number>(strDouble9, 75));
        series.getData().add(new XYChart.Data<String, Number>(strDouble8, 106));
        series.getData().add(new XYChart.Data<String, Number>(strDouble7, 123));
        series.getData().add(new XYChart.Data<String, Number>(strDouble6, 161));
        series.getData().add(new XYChart.Data<String, Number>(strDouble5, 202));
        series.getData().add(new XYChart.Data<String, Number>(strDouble4, 210));
        series.getData().add(new XYChart.Data<String, Number>(strDouble3, 219));
        series.getData().add(new XYChart.Data<String, Number>(strDouble2, 242));
        series.getData().add(new XYChart.Data<String, Number>(strDouble, 249));
        series.setName("5 Thread");
        lineC.getData().add(series);



    }


    public static int[][] samuraiDon() {
        String[][] tmp = new String[21][21];
        int[][] samurai = new int[21][21];

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("src/Samurai/a.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String line = null;
        try {
            line = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int a = 0;
        while (line != null) {
            String[] larr = line.split("");

            for (int i = 0; i < larr.length; i++) {
                if (!larr[i].equals("*")) {
                    tmp[a][i] = larr[i];
                } else {
                    tmp[a][i] = "0";
                }
            }

            try {
                line = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            a++;
        }

        //ilk 6lı
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 9; j++) {
                samurai[i][j] = Integer.valueOf(tmp[i][j]);
            }
        }
        for (int i = 0; i < 6; i++) {
            for (int j = 9; j < 12; j++) {
                samurai[i][j] = 0;
            }
        }

        int l = 9;
        for (int i = 0; i < 6; i++) {
            for (int j = 12; j < 21; j++) {
                samurai[i][j] = Integer.valueOf(tmp[i][l]);
                l++;
            }
            l = 9;
        }


        //ortadaki 3lü
        for (int i = 9; i < 12; i++) {
            for (int j = 0; j < 6; j++) {
                samurai[i][j] = 0;
            }
        }
        l = 0;
        for (int i = 9; i < 12; i++) {
            for (int j = 6; j < 15; j++) {
                samurai[i][j] = Integer.valueOf(tmp[i][l]);
                l++;
            }
            l = 0;
        }
        for (int i = 9; i < 12; i++) {
            for (int j = 15; j < 21; j++) {
                samurai[i][j] = 0;
            }
        }

        //son 6lı
        for (int i = 12; i < 21; i++) {
            for (int j = 0; j < 9; j++) {
                samurai[i][j] = Integer.valueOf(tmp[i][j]);
            }
        }
        for (int i = 12; i < 21; i++) {
            for (int j = 9; j < 12; j++) {
                samurai[i][j] = 0;
            }
        }

        l = 9;
        for (int i = 12; i < 21; i++) {
            for (int j = 12; j < 21; j++) {
                samurai[i][j] = Integer.valueOf(tmp[i][l]);
                l++;
            }
            l = 9;
        }

        //yormayan
        for (int i = 6; i < 9; i++) {
            for (int j = 0; j < 21; j++) {
                samurai[i][j] = Integer.valueOf(tmp[i][j]);
            }
        }
        for (int i = 12; i < 15; i++) {
            for (int j = 0; j < 21; j++) {
                samurai[i][j] = Integer.valueOf(tmp[i][j]);
            }
        }

        return samurai;
    }

    private static void sudokuYazdir(int[][] sudoku) {

        for (int i = 0; i < 21; i++) {
            for (int k = 0; k < 21; k++) {
                System.out.print(sudoku[i][k]);
            }
            System.out.println(" ");
        }
    }


}
    
