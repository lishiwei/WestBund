package com.lishiwei.westbund.Fragment.FragmentGalleryPkg;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lishiwei.model.Gallery;
import com.lishiwei.westbund.Activity.ActivityGalleryDetail;
import com.lishiwei.westbund.Adapter.TalentRecyclerAdapter;
import com.lishiwei.westbund.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentTalent#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentTalent extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    RecyclerView recyclerView;
    TalentRecyclerAdapter talentRecyclerAdapter;
    List<Gallery> galleries = new ArrayList<>();

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentTalent.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentTalent newInstance(String param1, String param2) {
        FragmentTalent fragment = new FragmentTalent();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    public FragmentTalent() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_talent, container, false);
    }

    private boolean isZh() {
        Locale locale = getResources().getConfiguration().locale;
        String language = locale.getLanguage();
        if (language.endsWith("zh"))
            return true;
        else
            return false;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        recyclerView = (RecyclerView) getActivity().findViewById(R.id.ry_Talent);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        if (isZh()) {


//        galleries.add(new Gallery("","",""))
            Gallery gallery0 = new Gallery("1335 MABINI", "1335 MABINI", "马尼拉", R.drawable.mabini, "胡昀", "《无题(五年以来的遭遇——在苏里南与起义奴隶的抗争，1796年)，第二部分(04)》", "2017", "墨水、拷贝纸 ", "40 cm × 30 cm (带框)", "©胡昀", "www.1335mabini.com",
                    "1335 A. Mabini St. Ermita Manila 1000 Philippines \n" +
                    "Tel: +63 2 254 8498 info@1335mabini.com",
                    "Poklong Anading \n" +
                    "Buen Calubayan \n" +
                    "Kiri Dalena \n" +
                    "Tad Ermitaño \n" +
                    "Soun Hong \n" +
                    "Ian Jaucian \n" +
                    "Manny Montelibano \n" +
                    "Peter Moosgaard \n" +
                    "Indy Paredes \n" +
                    "Yoshinori Niwa \n" +
                    "Mark Salvatus");
            Gallery gallery1 = new Gallery("3812画廊", "3812Gallery", "香港", R.drawable.threegallery, "林荣成", "<<腾>>", "2016", "钢笔水墨、纸本 ", "98 cm × 66 cm", "©3812画廊", "www.3812gallery.com", "香港西营盘皇后大道西118号一层至三层 \n" +
                    "Tel: +86 852 2153 3812 Fax: +86 852 2520 5230",
                    "萧勤\n" +
                    "黄冠余\n" +
                    "何凤莲\n" +
                    "林国成\n" +
                    "刘国夫\n" +
                    "彭康隆\n" +
                    "曲磊磊\n" +
                    "王璜生\n" +
                    "王劼音 \n" +
                    "于洋");
            Gallery gallery2 = new Gallery("广州画廊", "Canton Gallery", "广州", R.drawable.guangzhou, "山河跳!", "《人间传说》", "2017", "录像装置 ", "尺寸可变", "©广州画廊", "www.cantongallery.com.cn", "广州市海珠区怡乐路51号金乐大厦写字楼\n" +
                    "Tel: +86 150 1759 0205 cantongallery@gmail.com", "陈丹笛子\n" +
                    "陈拍岸 \n" +
                    "黄河\n" +
                    "黄山\n" +
                    "黄永生  \n" +
                    "啾\n" +
                    "赖志杰\n" +
                    "MMI\n" +
                    "秦晋\n" +
                    "山河跳!\n" +
                    "孙文浩 \n" +
                    "伍思波 \n" +
                    "王镇海 ");


            Gallery gallery3 = new Gallery("胶囊上海", "Capsule Shanghai", "上海", R.drawable.jiaonang, "莎拉·福克斯", "Green and Deep", "2017", "布面油画 ", "203.2 cm × 152.4 cm", "©3812画廊", "www.capsuleshanghai.com", " 中国上海徐汇区安福路275弄16号1楼 – 200031\n" +
                    "Tel: +86 021 6417 0700 info@capsuleshanghai.com", "段英梅\n" +
                    "莎拉·福克斯\n" +
                    "冯晨\n" +
                    "高源\n" +
                    "黄海欣\n" +
                    "卡塔姿娜·科兹拉\n" +
                    "多伦·朗贝格\n" +
                    "王凝慧");


            Gallery gallery4 = new Gallery("HDM GALLERY", "HDM GALLERY", "北京", R.drawable.hdm, "Romain Bernini", "Grans bwa V", "2016", "布面油画  ", "9220 cm × 180 cm", "©艺术家", "www.capsuleshanghai.com", "中国上海徐汇区安福路275弄16号1楼 – 200031\n" +
                    "Tel: +86 021 6417 0700 info@capsuleshanghai.com", "Romain Bernini \n" +
                    "Jean-Charles Blais \n" +
                    "陈晗 \n" +
                    "Elias Crespin \n" +
                    "何岸\n" +
                    "郝世明\n" +
                    "李竞雄\n" +
                    "陆超\n" +
                    "Barthélémy Toguo \n" +
                    "赵赵\n" +
                    "朱日新");
            Gallery gallery5 = new Gallery("拾萬空间", "Hunsand Space", "北京", R.drawable.shiwan, "蒋竹韵", "《消失中的答案》", "2016", "声音装置,飞行记录仪、信标、水箱 ", "尺寸可变 ", "©蒋竹韵", "www.hunsand.com", "北京市朝阳区草场地艺术区211号院A8 \n" +
                    "Tel: 010 5331 7400 Fax: 010 5331 7400  hunsand@hunsand.com", "蒋竹韵\n" +
                    "仇世杰\n" +
                    "宋建树\n" +
                    "宋佳茵\n" +
                    "孙大量 \n" +
                    "郑平平\n" +
                    "朱荧荧");
            Gallery gallery6 = new Gallery("J: Gallery", "J: Gallery", "上海", R.drawable.jgallery, "蒲英玮", "《远东信使》", "2017", "木板油画 ", "140 cm × 80 cm", "©3812画廊", "", "上海市莫干山路50号17栋102-103室 \n" +
                    "Tel: +021 5239 9053 admin@j-gallery.site", "陈陈陈\n" +
                    "李亭葳\n" +
                    "蒲英玮\n" +
                    "谢 燚\n" +
                    "谢 侃\n" +
                    "沈 翰 \n" +
                    "郭 城\n" +
                    "史镇豪\n" +
                    "钟云舒 \n" +
                    "郑梦之");
            Gallery gallery7 = new Gallery("GALERIA JAVIER LOPEZ & FER FRANCES", "GALERIA JAVIER LOPEZ & FER FRANCES", "马德里", R.drawable.galeria, "曼纽尔·利昂", "《你若即若离》", "2017", "布面油画 ", "195 cm × 130 cm", "©曼纽尔·利昂", "www.3812gallery.com", "西班牙马德里Guecho 12B,邮编 28023 Guecho,\n" +
                    "Tel: +34 91 593 21 84 Fax: +34 91 591 26 48 info@javierlopezferfrances.com", "皮拉·阿尔巴拉辛\n" +
                    "荒木经惟\n" +
                    "约翰·阿穆雷德\n" +
                    "弗朗切斯科·克莱门特\n" +
                    "汉娜·柯林斯 \n" +
                    "马丁·克里德\n" +
                    "费尔·佛斯特\n" +
                    "利亚姆·吉利克\n" +
                    "彼得·哈雷\n" +
                    "安东·亨宁\n" +
                    "珍妮·霍尔泽\n" +
                    "罗伯特·印第安纳 \n" +
                    "陶德·詹姆斯\n" +
                    "亚历克斯·卡茨 \n" +
                    "KAWS \n" +
                    "曼纽尔·利昂\n" +
                    "杰森·马丁\n" +
                    "宫岛达男 \n" +
                    "莎拉·莫里斯\n" +
                    "埃里克·帕克\n" +
                    "吉列尔莫·佩雷斯\n" +
                    "大卫·萨利 \n" +
                    "爱德华多·萨拉比亚\n" +
                    "杉本博司 \n" +
                    "玛丽娜·瓦格斯\n" +
                    "里奥·维拉里尔\n" +
                    "何塞·玛丽亚·伊图拉尔德\n" +
                    "约翰·苏利尔");
            Gallery gallery8 = new Gallery("Galerie Mazzoli", "Galerie Mazzoli", "柏林", R.drawable.galerie, "onato Piccolo ", "《回弹》", "2016", "口香糖包装、磁铁系统、超 传导系统、彩虹纸 ", "尺寸不定", "©Galerie Mazzoli, courtesy SMart and Galerie Mazzoli", "www.3812gallery.com", "德国柏林波茨坦大街 132 号 D - 10783 \n" +
                    "Tel: +49 (0) 30 7545 9560 Fax: +49 (0) 30 7545 9560 info@galeriemazzoli.com \n" +
                    "意大利摩德纳 Nazario Sauro 大道 62号 41100 \n" +
                    "Tel: +39 059 243455 Fax: +39 059 243455 info@galleriamazzoli.it", "William Anastasi \n" +
                    "Carlo Benvenuto \n" +
                    "Ross Bleckner \n" +
                    "Céleste Boursier-Mougenot \n" +
                    "Sandro Chia \n" +
                    "Enzo Cucchi \n" +
                    "Mario Dellavedova \n" +
                    "Agostino Di Scipio \n" +
                    "Christian Fogarolli \n" +
                    "Stefano Graziani \n" +
                    "Peter Halley \n" +
                    "Douglas Henderson \n" +
                    "Shingo Inao \n" +
                    "Alex Katz \n" +
                    "Christina Kubisch\n" +
                    "Pe Lang \n" +
                    "Robert Longo \n" +
                    "Kristoffer Myskja\n" +
                    "Mimmo Paladino \n" +
                    "Donato Piccolo \n" +
                    "Roberto Pugliese \n" +
                    "David Salle \n" +
                    "Oscar Santillan \n" +
                    "Mario Schifano \n" +
                    "Michele Spanghero \n" +
                    "Franco Vaccari");
            Gallery gallery9 = new Gallery("就在艺术空间", "Project Fulfill Art Space", "台北", R.drawable.jiuzai, "张徐展", "《纸人展与新兴糊纸店系列“灵灵参”—自卑的蝙蝠》", "2015", "六频道动画录像、空间投影装置、彩色、有声 ", "循环播放", "©就在艺术空间 版权所有 ", "www.projectfulfill.com", "台湾10658 台北市大安区信义路三段147巷45弄2号一楼 \n" +
                    "Tel: +886 2 2707 6942 Fax: +886 2 2755 7679 info@projectfulfill.com", "陈建荣\n" +
                    "陈松志\n" +
                    "周育正\n" +
                    "许乔彦\n" +
                    "李吉祥\n" +
                    "王仲堃\n" +
                    "王福瑞\n" +
                    "王玺安\n" +
                    "吴长蓉 \n" +
                    "毛利悠子 \n" +
                    "张徐展 ");
            Gallery gallery10 = new Gallery("Tabula Rasa画廊", "Tabula Rasa Gallery", "北京", R.drawable.jiuzai, "马海蛟", "《远了，更远》", "2017", "单频影像  ", "9′23′", " ", "www.gallerytabularasa.com", "北京市朝阳区酒仙桥路2号798艺术区706北三街 \n" +
                    "Tel: +86 (0)10 57626353 info@gallerytabularasa.com", "王 烁(anusman) \n" +
                    "龙 荻 \n" +
                    "马海蛟\n" +
                    "汪 化\n" +
                    "王子月\n" +
                    "萧涵秋\n" +
                    "苑 瑗\n" +
                    "钟云舒 \n" +
                    "奶粉周  ");

            Gallery gallery11 = new Gallery("ROH Projects", "ROH Projects", "Indonesia ", R.drawable.roh, "Aditya Novali ", "《无题》", "2017", "墨水、颜料、有机玻璃  ", "29.7 cm × 21 cm ", "©ROH Projects", "www.rohprojects.net ", "Equity Tower Floor 40 Suite E, SCBD, Jakarta 12190, Indonesia \n" +
                    "Tel: +62 21 514 02116 info@rohprojects.net", "Aditya Novali \n" +
                    "Arin Dwihartanto \n" +
                    "Sunaryo \n" +
                    "Bagus Pandega \n" +
                    "Cinanti Astria \n" +
                    "Johansjah \n" +
                    "Faisal Habibi \n" +
                    "Syaiful Aulia Garibaldi \n" +
                    "Syagini Ratna Wulan");
            Gallery gallery12 = new Gallery("沪申画廊", "Shanghai Gallery of Art", "上海", R.drawable.hushen, "郑 路", "《无相二号》", "2017", "凸镜, 灯箱, 玻璃  ", "直径150 cm\n" +
                    "厚度7cm ", " ", "Shanghai Gallery of Art", "中国上海市中山东一路三号三楼 \n" +
                    "Tel: +86-21-63215757 sga@on-the-bund.com", "冯梦波\n" +
                    "冯良鸿\n" +
                    "封 岩 \n" +
                    "高伟刚\n" +
                    "胡项城\n" +
                    "金江波\n" +
                    "来金娜 \n" +
                    "刘雨佳\n" +
                    "倪 军 \n" +
                    "邱 节\n" +
                    "邵译农+慕辰\n" +
                    "吴 笛\n" +
                    "吴山专+英格·斯瓦拉·托斯朵蒂尔 \n" +
                    "颜 磊\n" +
                    "郑 路\n" +
                    "周云侠");
            Gallery gallery13 = new Gallery("ShugoArts", "ShugoArts", "东京", R.drawable.shugo, "Masaya Chiba", "《一起冒险去 #3》", "2017", "油画、画布", "181.8 cm × 259 cm ", "©Masaya CHIBA", "www.shugoarts.com ", "东京港区六本木6-5-24 complex665 二层106-0032 \n" +
                    "Tel: +81 (0)3 6447 2234 info@shugoarts.com", "Masaya CHIBA \n" +
                    "Yukio FUJIMOTO \n" +
                    "Carsten HÖLLER \n" +
                    "Leiko IKEMURA \n" +
                    "Ilya KAVAKOV \n" +
                    "Masato KOBAYASHI \n" +
                    "Aki KONDO\n" +
                    "LEE Kit \n" +
                    "Takeshi MAKISHIMA\n" +
                    "Naofumi MARUYAMA \n" +
                    "Boris MIKHAILOV \n" +
                    "Ritsue MISHIMA \n" +
                    "MORIMURA Yasumasa \n" +
                    "Takuma NAKAHIRA \n" +
                    "Rie NAKAJIMA \n" +
                    "TAGUCHI Kazuna \n" +
                    "Yoriko TAKABATAKE \n" +
                    "Shigeo TOYA \n" +
                    "Tomoko YONEDA");
            Gallery gallery14 = new Gallery("Yeo workshop", "Yeo workshop", "北京", R.drawable.yeo, "朱 婧", "《排演的艺术》", "2017", "三频道录像  ", "尺寸可变", "@艺术家 ", "www.yeoworkshop.com ", "新加坡吉门营房艺术区,洛克路1号, #01-01, 新加坡108932 \n" +
                    "Tel: +65 6734 5168 info@yeoworkshop.com", "斯蒂芬妮·简·伯特\n" +
                    "张翁如\n" +
                    "费尔鲁·达玛\n" +
                    "董 琼\n" +
                    "马尔钦·杜德克 \n" +
                    "陆鸿声\n" +
                    "马里昂托\n" +
                    "祖尔·玛穆德\n" +
                    "牟 雪\n" +
                    "玛丽琳·特列维森\n" +
                    "王郁媜\n" +
                    "桑蒂·王川 \n" +
                    "吉姆·艾伦·阿贝尔\n" +
                    "朱 婧 ");
            Gallery gallery15 = new Gallery("YveYANG", "YveYANG", "北京", R.drawable.yve, "蒂姆·安多芬", "《波莉安娜》", "2017", "《波莉安娜》  ", "110 cm × 84 cm ", "©YveYANG和艺术家 ", "www.yveyang.com ", "532 W 43rd St, New York, NY, 10036, USA \n" +
                    "Tel: +1 6178345356 Info@yveyang.com", "安巴·撒友本奈特\n" +
                    "比约恩·斯鲍尔曼\n" +
                    "敖乾枥\n" +
                    "康斯坦斯·坦维克\n" +
                    "廖 斐\n" +
                    "塞姆·甘托斯 \n" +
                    "蒂姆·安多芬  \n" +
                    "蓉准李");
            galleries.add(gallery0);
            galleries.add(gallery1);
            galleries.add(gallery2);
            galleries.add(gallery3);
            galleries.add(gallery4);
            galleries.add(gallery5);
            galleries.add(gallery6);
            galleries.add(gallery7);
            galleries.add(gallery8);
            galleries.add(gallery9);
            galleries.add(gallery10);
            galleries.add(gallery11);
            galleries.add(gallery12);
            galleries.add(gallery13);
            galleries.add(gallery14);
            galleries.add(gallery15);

        } else {
            {


//        galleries.add(new Gallery("","",""))
                Gallery gallery0 = new Gallery("1335 MABINI", "1335 MABINI", "Manila", R.drawable.mabini, "Hu Yun", "Untitled(from The Narrative of a Five Years Expedition against the Revolted Negroes of Surinam 1796) Part II (04)", "2017", "nk on drafting paper  ", "40 cm × 30 cm (with frame)", "Copyright owned by HU Yun", "www.1335mabini.com", "1335 A. Mabini St. Ermita Manila 1000 Philippines \n" +
                        "Tel: +63 2 254 8498 info@1335mabini.com", "Poklong Anading \n" +
                        "Buen Calubayan \n" +
                        "Kiri Dalena \n" +
                        "Tad Ermitaño \n" +
                        "Soun Hong \n" +
                        "Ian Jaucian \n" +
                        "Manny Montelibano \n" +
                        "Peter Moosgaard \n" +
                        "Indy Paredes \n" +
                        "Yoshinori Niwa \n" +
                        "Mark Salvatus");
                Gallery gallery1 = new Gallery("3812Gallery", "3812Gallery", "HongKong", R.drawable.threegallery, "Lin Guocheng", "Soar ", "2016", "Pen and Chinese ink on paper  ", "98 cm × 66 cm", "Copyright owned by 3812 Gallery", "www.3812gallery.com", "307 Rm.307, No.51 Yile Road, Haizhu district, Guangzhou \n" +
                        "Tel: +86 150 1759 0205 cantongallery@gmail.com ", "HSIAO Chin \n" +
                        "HUANG Guanyu \n" +
                        "Chloe HO \n" +
                        "LIN Guocheng \n" +
                        "LIU Guofu \n" +
                        "PENG Kanglong \n" +
                        "QU Leilei \n" +
                        "WANG Huangsheng \n" +
                        "WANG Jieyin \n" +
                        "YU Yang");
                Gallery gallery2 = new Gallery("Canton Gallery", "Canton Gallery", "guangzhou", R.drawable.guangzhou, "Mountain River Jump! ", "Legends In Human World  ", "2017", "Video installation ", "Dimensions variable ", "Copyright owned by Canton Gallery", "www.cantongallery.com.cn", "307 Rm.307, No.51 Yile Road, Haizhu district, Guangzhou \n" +
                        "Tel: +86 150 1759 0205 cantongallery@gmail.com", "Chen Dandizi \n" +
                        "Chen Paian \n" +
                        "Huang He \n" +
                        "Huang Shan \n" +
                        "Wong Wing Sang \n" +
                        "Jiu \n" +
                        "Lai Zhijie \n" +
                        "MMI \n" +
                        "Qin Jin \n" +
                        "Mountain River Jump! \n" +
                        "Sun Wenhao \n" +
                        "Wu Sibo\n" +
                        "Wong Chun Hoi");


                Gallery gallery3 = new Gallery("Capsule Shanghai", "Capsule Shanghai", "shanghai", R.drawable.jiaonang, "Sarah Faux ", "Green and Deep", "2017", "Oil on canvas ", "203.2 cm × 152.4 cm", "", "www.capsuleshanghai.com", " 1st Floor, Building 16, Anfu Lu 275 Long, Xuhui District, Shanghai, China – 200031 \n" +
                        "Tel: +86 021 6417 0700 info@capsuleshanghai.com", "Duan Yingmei \n" +
                        "Sarah Faux \n" +
                        "Feng Chen \n" +
                        "Gao Yuan \n" +
                        "Huang Hai-Hsin \n" +
                        "Katarzyna Kozyra \n" +
                        "Doron Langberg \n" +
                        "Alice Wang\n");


                Gallery gallery4 = new Gallery("HDM GALLERY", "HDM GALLERY", "beijing", R.drawable.hdm, "Romain Bernini", "Grans bwa V", "2016", "Oil on canvas  ", "9220 cm × 180 cm", "Copyright owned by the artist", "www.capsuleshanghai.com", "98 Art District, No 4 Jiuxianqiao Lu Chaoyang District Beijing 100015 China \n" +
                        "Tel: +010 5978 9320 infos@hdemontferrand.com", "Romain Bernini \n" +
                        "Jean-Charles Blais\n" +
                        "Chen Han \n" +
                        "Elias Crespin \n" +
                        "He An \n" +
                        "Hao Shiming \n" +
                        "Li Jingxiong \n" +
                        "Lu Chao \n" +
                        "Barthélémy Toguo \n" +
                        "Zhao Zhao \n" +
                        "Zhu Rixin");
                Gallery gallery5 = new Gallery("Hunsand Space", "Hunsand Space", "beijing", R.drawable.shiwan, "Jiang Zhuyun", "isappearing Answer", "2016", "Sound Installation, fright recorder, water container  ", "Dimension variable  ", "©Jiang Zhuyun", "www.hunsand.com", "A8, No.211 Cao Chang Di, Chao Yang District, Beijing \n" +
                        "Tel: 010 5331 7400 Fax: 010 5331 7400 hunsand@hunsand.com", "Jiang Zhuyun\n" +
                        "Qiu Shijie \n" +
                        "Song Jianshu \n" +
                        "Song Jiayin\n" +
                        "Sun Daliang \n" +
                        "Zheng Pingping \n" +
                        "Zhu Yingying");
                Gallery gallery6 = new Gallery("J: Gallery", "J: Gallery", "shanghai", R.drawable.jgallery, "Pu Yingwei ", "Messenger from the Far East", "2017", "Oil on wood panel  ", "140 cm × 80 cm", "", "", "102-103, Bd. 17, No. 50, Moganshan Rd, Shanghai\n" +
                        "Tel: +021 5239 9053 admin@j-gallery.site", "Chen Chenchen\n" +
                        "Li Tingwei \n" +
                        "Pu Yingwei \n" +
                        "Xie Yi \n" +
                        "Xie Kan\n" +
                        "Shen Han\n" +
                        "Guo Cheng \n" +
                        "Shi Zhenhao \n" +
                        "Tant Zhong Yunshu \n" +
                        "Zheng Mengzhi");
                Gallery gallery7 = new Gallery("GALERIA JAVIER LOPEZ & FER FRANCES", "GALERIA JAVIER LOPEZ & FER FRANCES", "MADRID", R.drawable.galeria, "Manuel Leon ", "Ni contigo ni sin ti", "2017", "Oil on canvas  ", "195 cm × 130 cm", "Copyright owned by Manuel Leon", "www.3812gallery.com", "Guecho, 12B – MADRID- SPAIN - 28023 \n" +
                        "Tel: +34 91 593 21 84 Fax: +34 91 591 26 48 info@javierlopezferfrances.com ", "Pilar Albarracín \n" +
                        "Araki Nobuyoshi \n" +
                        "John Armleder \n" +
                        "Francesco Clemente \n" +
                        "Hannah Collins \n" +
                        "Martin Creed \n" +
                        "Phil Frost \n" +
                        "Liam Gillik \n" +
                        "Peter Halley \n" +
                        "Anton Henning \n" +
                        "Jenny Holzer \n" +
                        "Robert Indiana\n" +
                        "Todd James \n" +
                        "Alex Katz\n" +
                        "KAWS \n" +
                        "Manuel Leon\n" +
                        "Jason Martin \n" +
                        "Tatsuo Miyajima \n" +
                        "Sarah Morris \n" +
                        "Erik Parker \n" +
                        "Guillermo Perez \n" +
                        "David Salle \n" +
                        "Eduardo Sarabia \n" +
                        "Hiroshi Sugimoto \n" +
                        "Marina Vargas \n" +
                        "Leo Villareal \n" +
                        "Jose Maria Yturralde \n" +
                        "John Zurier");
                Gallery gallery8 = new Gallery("Galerie Mazzoli", "Galerie Mazzoli", "BERLIN", R.drawable.galerie, "Donato Piccolo ", "Resilience", "2016", "Gum pack, magnet system, superconditivity system, rainbow paper  ", "Variable size", "©Galerie Mazzoli, courtesy SMart and Galerie Mazzoli", "www.3812gallery.com", "POTSDAMER STRASSE 132 D -10783 BERLIN, GERMANY\n" +
                        "Tel: +49 (0) 30 7545 9560 Fax: +49 (0) 30 7545 9560 info@galeriemazzoli.com \n" +
                        "Via Nazario Sauro 62, 41100 MODENA, ITALY \n" +
                        "Tel: +39 059 243455 Fax: +39 059 243455 info@galleriamazzoli.it", "William Anastasi \n" +
                        "Carlo Benvenuto \n" +
                        "Ross Bleckner \n" +
                        "Céleste Boursier-Mougenot \n" +
                        "Sandro Chia \n" +
                        "Enzo Cucchi \n" +
                        "Mario Dellavedova \n" +
                        "Agostino Di Scipio \n" +
                        "Christian Fogarolli \n" +
                        "Stefano Graziani \n" +
                        "Peter Halley \n" +
                        "Douglas Henderson \n" +
                        "Shingo Inao \n" +
                        "Alex Katz \n" +
                        "Christina Kubisch\n" +
                        "Pe Lang \n" +
                        "Robert Longo \n" +
                        "Kristoffer Myskja\n" +
                        "Mimmo Paladino \n" +
                        "Donato Piccolo \n" +
                        "Roberto Pugliese \n" +
                        "David Salle \n" +
                        "Oscar Santillan \n" +
                        "Mario Schifano \n" +
                        "Michele Spanghero \n" +
                        "Franco Vaccari");
                Gallery gallery9 = new Gallery("Project Fulfill Art Space", "Project Fulfill Art Space", "Taipei", R.drawable.jiuzai, "ZHANG XU Zhan ", "Hsin Hsin Paper Home Series 003 Inferiority Bat", "2015", "6 channels animated video installation, color  ", "sound 5′00′′ (Loop)", "Project Fulfill Art Space All rights reserved ", "www.projectfulfill.com", "www.projectfulfill.com \n" +
                        "1F, No.2, Alley 45, Lane 147, Sec.3, Sinyi Rd. Taipei 10658, Taiwan \n" +
                        "Tel: +886 2 2707 6942 Fax: +886 2 2755 7679 info@projectfulfill.com", "CHEN Chien-Jung \n" +
                        "CHEN Sung-Chih \n" +
                        "CHOU Yu-Cheng \n" +
                        "HSU Chiao-Yen \n" +
                        "LEE Chi-Hsiang\n" +
                        "WANG Chung-Kun \n" +
                        "WANG Fujui \n" +
                        "WANG Sean\n" +
                        "WU Chang-Jung \n" +
                        "MOHRI Yuko\n" +
                        "ZHANG XU Zhan");
                Gallery gallery10 = new Gallery("Tabula Rasa Gallery", "Tabula Rasa Gallery", "beijing", R.drawable.jiuzai, "Ma Haijiao", "Message to the Future", "2017", "Single channel video  ", "9′23′", " ", "www.gallerytabularasa.com", "706 North 3rd Street, 798 Art District, No.2 Jiu Xian Qiao Rd, Chao Yang District, Beijing \n" +
                        "Tel: +86 (0)10 57626353 info@gallerytabularasa.com", "anusman \n" +
                        "Long Di \n" +
                        "Ma Haijiao \n" +
                        "Wang Hua \n" +
                        "Wang Ziyue \n" +
                        "Xiao Hanqiu\n" +
                        "Yuan Yuan \n" +
                        "Tant Zhong \n" +
                        "Nathan Zhou");

                Gallery gallery11 = new Gallery("ROH Projects", "ROH Projects", "Indonesia ", R.drawable.roh, "Aditya Novali ", "Untitled", "2017", "Ink, paint, plexiglass  ", "29.7 cm × 21 cm ", "©ROH Projects", "www.rohprojects.net ", "Equity Tower Floor 40 Suite E, SCBD, Jakarta 12190, Indonesia \n" +
                        "Tel: +62 21 514 02116 info@rohprojects.net", "Aditya Novali \n" +
                        "Arin Dwihartanto \n" +
                        "Sunaryo \n" +
                        "Bagus Pandega \n" +
                        "Cinanti Astria \n" +
                        "Johansjah \n" +
                        "Faisal Habibi \n" +
                        "Syaiful Aulia Garibaldi \n" +
                        "Syagini Ratna Wulan");
                Gallery gallery12 = new Gallery("Shanghai Gallery of Art ", "Shanghai Gallery of Art", "shanghai", R.drawable.hushen, "Zheng Lu ", "Insubstaniality No.2", "2017", "Convex Lens, light Box, glass ", "150 cm (diameter)  7cm (thick)"
                        , " ", "www.shanghaigalleryofart.com", "中国上海市中山东一路三号三楼 \n" +
                        "Tel: +86-21-63215757 sga@on-the-bund.com", "Feng Mengbo \n" +
                        "Feng Lianghong\n" +
                        "Feng Yan \n" +
                        "Gao Weigang\n" +
                        "Hu Xiangcheng\n" +
                        "Jin Jiangbo \n" +
                        "Lai Jin′na \n" +
                        "Liu Yujia \n" +
                        "Ni Jun\n" +
                        "Qiu Jie \n" +
                        "Shao Yinong + Mu Chen \n" +
                        "Wu Di \n" +
                        "Wu Shanzhuan + Inga Svala Thorsdottir \n" +
                        "Yan Lei \n" +
                        "Zheng Lu \n" +
                        "Zhou Yunxia");
                Gallery gallery13 = new Gallery("ShugoArts", "ShugoArts", "Tokey", R.drawable.shugo, "Masaya Chiba", "Let′s have an adventure ", "2017", "Oil on canvas ", "181.8 cm × 259 cm ", "©Masaya CHIBA", "www.shugoarts.com ", "东京港区六本木6-5-24 complex665 二层106-0032 \n" +
                        "Tel: +81 (0)3 6447 2234 info@shugoarts.com", "Masaya CHIBA \n" +
                        "Yukio FUJIMOTO \n" +
                        "Carsten HÖLLER \n" +
                        "Leiko IKEMURA \n" +
                        "Ilya KAVAKOV \n" +
                        "Masato KOBAYASHI \n" +
                        "Aki KONDO\n" +
                        "LEE Kit \n" +
                        "Takeshi MAKISHIMA\n" +
                        "Naofumi MARUYAMA \n" +
                        "Boris MIKHAILOV \n" +
                        "Ritsue MISHIMA \n" +
                        "MORIMURA Yasumasa \n" +
                        "Takuma NAKAHIRA \n" +
                        "Rie NAKAJIMA \n" +
                        "TAGUCHI Kazuna \n" +
                        "Yoriko TAKABATAKE \n" +
                        "Shigeo TOYA \n" +
                        "Tomoko YONEDA");
                Gallery gallery14 = new Gallery("Yeo workshop", "Yeo workshop", "Singapore ", R.drawable.yeo, "Sarah Choo Jing", "Art of the Rehearsal", "2017", "Three-channel video installation   ", "Dimensions variable ", "© The artist ", "www.yeoworkshop.com ", "1 Lock Road, #01-01 Gillman Barracks, Singapore 108932\n" +
                        "Tel: +65 6734 5168 info@yeoworkshop.com", "Stephanie Jane Burt \n" +
                        "Mike Chang \n" +
                        "Fyerool Darma \n" +
                        "Quynh Dong \n" +
                        "Marcin Dudek \n" +
                        "Loke Hong Seng \n" +
                        "Maryanto \n" +
                        "Zul Mahmod \n" +
                        "Xue Mu \n" +
                        "Merryn Trevethan \n" +
                        "Yu-Chen Wang \n" +
                        "Santi Wangchuan\n" +
                        "Jim Allen Abel \n" +
                        "Sarah Choo Jing");
                Gallery gallery15 = new Gallery("YveYANG", "YveYANG", " New York", R.drawable.yve, "Tim Enthoven", "Pollyanna", "2017", "Pollyanna", "110 cm × 84 cm ", "Copyright owned by YveYANG and the artist ", "www.yveyang.com ", "532 W 43rd St, New York, NY, 10036, USA \n" +
                        "Tel: +1 6178345356 Info@yveyang.com", "Amba Sayal-Bennett \n" +
                        "Bjorn Sparrman \n" +
                        "Chando Ao \n" +
                        "Constance Tenvik \n" +
                        "Liao Fei\n" +
                        "Sam Ghantous \n" +
                        "Tim Enthoven \n" +
                        "Young Joo Lee");
                galleries.add(gallery0);
                galleries.add(gallery1);
                galleries.add(gallery2);
                galleries.add(gallery3);
                galleries.add(gallery4);
                galleries.add(gallery5);
                galleries.add(gallery6);
                galleries.add(gallery7);
                galleries.add(gallery8);
                galleries.add(gallery9);
                galleries.add(gallery10);
                galleries.add(gallery11);
                galleries.add(gallery12);
                galleries.add(gallery13);
                galleries.add(gallery14);
                galleries.add(gallery15);

            }
        }
        talentRecyclerAdapter =  new TalentRecyclerAdapter(galleries,this.getContext());
        recyclerView.setAdapter(talentRecyclerAdapter);
    }
}
