package id.xaxxis.exploreplace;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PlaceData {
    public static String[][] data = new String[][] {
            {"Kepulauan Raja Ampat", "Papua barat", "https://upload.wikimedia.org/wikipedia/commons/a/a1/Raja_Ampat_Islands_-_journal.pbio.1001457.g001.png", "Kepulauan Raja Ampat merupakan rangkaian empat gugusan pulau yang berdekatan dan berlokasi di barat bagian Kepala Burung (Vogelkoop) Pulau Papua. Secara administrasi, gugusan ini berada di bawah Kabupaten Raja Ampat, Provinsi Papua Barat. Kepulauan ini sekarang menjadi tujuan para penyelam yang tertarik akan keindahan pemandangan bawah lautnya. Empat gugusan pulau yang menjadi anggotanya dinamakan menurut empat pulau terbesarnya, yaitu Pulau Waigeo, Pulau Misool, Pulau Salawati, dan Pulau Batanta.\n" +
                    "\n" +
                    "Asal mula nama Raja Ampat menurut mitos masyarakat setempat berasal dari seorang wanita yang menemukan tujuh telur. Empat butir di antaranya menetas menjadi empat orang pangeran yang berpisah dan masing-masing menjadi raja yang berkuasa di Waigeo, Salawati, Misool Timur dan Misool Barat. Sementara itu, tiga butir telur lainnya menjadi hantu, seorang wanita, dan sebuah batu.\n" +
                    "\n" +
                    "Dalam perjalanan sejarah, wilayah Raja Ampat telah lama dihuni oleh masyarakat bangsawan dan menerapkan sistem adat Maluku. Dalam sistem ini, masyarakat sekumpulan manusia. Tiap desa dipimpin oleh seorang raja. Semenjak berdirinya lima kesultanan muslim di Maluku, Raja Ampat menjadi bagian klaim dari Kesultanan Tidore. Setelah Kesultanan Tidore takluk dari Belanda, Kepulauan Raja Ampat menjadi bagian klaim Hindia Belanda.",
            "Wisata Alam Kepulauan", "0°47′13.7″S 130°33′43.0″E", "-"},
            {"Taman Nasional Wakatobi", "Sulawesi Tenggara", "https://wisatasulawesitenggara.files.wordpress.com/2017/11/wakatobi_20170119_095405.jpg?w=584", "Taman Nasional Wakatobi merupakan salah satu dari 50 taman nasional di Indonesia, yang terletak di kabupaten Wakatobi, Sulawesi Tenggara. Taman nasional ini ditetapkan pada tahun 2002, dengan total area 1,39 juta ha, menyangkut keanekaragaman hayati laut, skala dan kondisi karang; yang menempati salah satu posisi prioritas tertinggi dari konservasi laut di Indonesia. Kedalaman air di taman nasional ini bervariasi, bagian terdalam mencapai 1.044 meter di bawah permukaan air laut.\n" +
                    "\n" +
                    "Wakatobi juga merupakan nama kawasan taman nasional yang ditetapkan pada tahun 1996, dengan luas keseluruhan 1,39 juta hektare, menyangkut keanekaragaman hayati laut, skala dan kondisi karang yang menempati salah satu posisi prioritas tertinggi dari konservasi laut di Indonesia.\n" +
                    "\n" +
                    "Kabupaten Wakatobi berbentuk kepulauan dan terletak di tenggara Pulau Sulawesi. Secara astronomis, Kabupaten Wakatobi berada di selatan garis khatulistiwa, membujur dari 5,00º sampai 6,25º Lintang Selatan (sepanjang ± 160 km) dan melintang dari 123,34º sampai 124.64º Bujur Timur (sepanjang ± 120 km).",
            "Wisata Alam", "5.00°–6.25° LS dan 123.34°–124.64° BT", "-"},

            {"Taman Nasional Komodo", "Nusa Tenggara Timur", "https://upload.wikimedia.org/wikipedia/commons/thumb/0/00/Komodo-dragon-1.jpg/800px-Komodo-dragon-1.jpg", "Taman Nasional Komodo terletak di daerah administrasi Provinsi Nusa Tenggara Timur dan taman nasional ini juga sangat dekat dengan kepulauan Sumbawa provinsi Nusa Tenggara Barat.\n" +
                    "\n" +
                    "Taman nasional ini terdiri atas tiga pulau besar Pulau Komodo, Pulau Rinca, dan Pulau Padar serta beberapa pulau kecil. Wilayah darat taman nasional ini 603 km² dan wilayah total adalah 1817 km².\n" +
                    "\n" +
                    "Pada tahun 1980 taman nasional ini didirikan untuk melindungi komodo dan habitatnya. Di sana terdapat 277 spesies hewan yang merupakan perpaduan hewan yang berasal dari Asia dan Australia, yang terdiri dari 32 spesies mamalia, 128 spesies burung, dan 37 spesies reptilia. Bersama dengan komodo, setidaknya 25 spesies hewan darat dan burung termasuk hewan yang dilindungi, karena jumlahnya yang terbatas atau terbatasnya penyebaran mereka.\n" +
                    "\n" +
                    "Selain itu, di kawasan ini terdapat pula terumbu karang. Setidaknya terdapat 253 spesies karang pembentuk terumbu yang ditemukan di sana, dengan sekitar 1.000 spesies ikan. Keindahan terumbu ini menarik minat wisatawan asing untuk berenang atau menyelam di perairan ini.\n" +
                    "\n" +
                    "Pulau-pulau ini aslinya adalah pulau vulkanis. Jumlah penduduk di wilayah ini kurang lebih adalah 4.000 jiwa. Pada tahun 1991 taman nasional ini diterima sebagai Situs Warisan Dunia UNESCO.\n" +
                    "\n" +
                    "Pada tanggal 11 November 2011, New 7 Wonders telah mengumumkan pemenang sementara, dan Taman Nasional Komodo masuk kedalam jajaran pemenang tersebut bersama dengan, Hutan Amazon, Teluk Halong, Air Terjun Iguazu, Pulau Jeju, Sungai Bawah Tanah Puerto Princesa, dan Table Mountain[2]. Taman Nasional Komodo mendapatkan suara terbanyak",
                    "Wisata Alam", "8°32′36″S 119°29′22″E", "1980"},
            {"Borobudur", "Yogyakarta - Jawa Tengah", "https://upload.wikimedia.org/wikipedia/commons/7/77/Stupa_Borobudur.jpg", "Borobudur / Candhi Barabudhur) adalah sebuah candi Buddha yang terletak di Borobudur, Magelang, Jawa Tengah, Indonesia. Candi ini terletak kurang lebih 100 km di sebelah barat daya Semarang, 86 km di sebelah barat Surakarta, dan 40 km di sebelah barat laut Yogyakarta. Candi berbentuk stupa ini didirikan oleh para penganut agama Buddha Mahayana sekitar tahun 800-an Masehi pada masa pemerintahan wangsa Syailendra. Borobudur adalah candi atau kuil Buddha terbesar di dunia, sekaligus salah satu monumen Buddha terbesar di dunia.\n" +
                    "\n" +
                    "Monumen ini terdiri atas enam teras berbentuk bujur sangkar yang di atasnya terdapat tiga pelataran melingkar, pada dindingnya dihiasi dengan 2.672 panel relief dan aslinya terdapat 504 arca Buddha. Borobudur memiliki koleksi relief Buddha terlengkap dan terbanyak di dunia. Stupa utama terbesar teletak di tengah sekaligus memahkotai bangunan ini, dikelilingi oleh tiga barisan melingkar 72 stupa berlubang yang di dalamnya terdapat arca Buddha tengah duduk bersila dalam posisi teratai sempurna dengan mudra (sikap tangan) Dharmachakra mudra (memutar roda dharma).\n" +
                    "\n" +
                    "Monumen ini merupakan model alam semesta dan dibangun sebagai tempat suci untuk memuliakan Buddha sekaligus berfungsi sebagai tempat ziarah untuk menuntun umat manusia beralih dari alam nafsu duniawi menuju pencerahan dan kebijaksanaan sesuai ajaran Buddha. Para peziarah masuk melalui sisi timur dan memulai ritual di dasar candi dengan berjalan melingkari bangunan suci ini searah jarum jam, sambil terus naik ke undakan berikutnya melalui tiga tingkatan ranah dalam kosmologi Buddha. Ketiga tingkatan itu adalah Kāmadhātu (ranah hawa nafsu), Rupadhatu (ranah berwujud), dan Arupadhatu (ranah tak berwujud). Dalam perjalanannya para peziarah berjalan melalui serangkaian lorong dan tangga dengan menyaksikan tak kurang dari 1.460 panel relief indah yang terukir pada dinding dan pagar langkan.\n" +
                    "\n" +
                    "Menurut bukti-bukti sejarah, Borobudur ditinggalkan pada abad ke-14 seiring melemahnya pengaruh kerajaan Hindu dan Buddha di Jawa serta mulai masuknya pengaruh Islam. Dunia mulai menyadari keberadaan bangunan ini sejak ditemukan 1814 oleh Sir Thomas Stamford Raffles, yang saat itu menjabat sebagai Gubernur Jenderal Inggris atas Jawa. Sejak saat itu Borobudur telah mengalami serangkaian upaya penyelamatan dan pemugaran (perbaikan kembali). Proyek pemugaran terbesar digelar pada kurun waktu 1975 hingga 1982 atas upaya Pemerintah Republik Indonesia dan UNESCO, kemudian situs bersejarah ini masuk dalam daftar Situs Warisan Dunia.\n" +
                    "\n" +
                    "Borobudur kini masih digunakan sebagai tempat ziarah keagamaan; tiap tahun umat Buddha yang datang dari seluruh Indonesia dan mancanegara berkumpul di Borobudur untuk memperingati Trisuci Waisak. Dalam dunia pariwisata, Borobudur adalah objek wisata tunggal di Indonesia yang paling banyak dikunjungi wisatawan",
                    "Stupa dan Candi", "7.608°S 110.204°E", "770 Masehi"},
            {"Hutan Hujan Tropis Sumatra", "Sumatera", "https://cdn0-production-images-kly.akamaized.net/FH6cDtAhvHL4YWE4JgA5yGh6DQg=/1280x720/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/1612384/original/068058900_1496395037-076042400_1491271031-Cloudforest_iStock_bogdanhoria_www.jpg", "Warisan Hutan Hujan Tropis Sumatra adalah tempat pelestarian bagi Hutan Hujan Tropis di Sumatra dan habitat dari beberapa spesies yang hampir punah seperti, harimau sumatra, orangutan sumatra, gajah sumatra, dan badak sumatra yang merupakan spesies badak terkecil dan memiliki dua cula.\n" +
                    "\n" +
                    "Luas dari Hutan Hujan Tropis Sumatra seluruhnya adalah 2,5 juta hektare yang terdiri dari 3 Taman Nasional di Sumatra, yaitu Taman Nasional Gunung Leuser, Taman Nasional Kerinci Seblat, dan Taman Nasional Bukit Barisan Selatan. Tempat ini juga tempat berbagai jenis tumbuhan endemik seperti, kantong semar, bunga terbesar di dunia Rafflesia Arnoldi, dan bunga tertinggi Amorphophallus titanum. Selain memiliki keanekaragaman hayati yang tinggi, hutan hujan tropis Sumatra juga merupakan sumber mata pencarian bagi masyarakat yang tinggal di sana. Beberapa suku tinggal di hutan hujan tropis Sumatra, seperti suku Mentawai dan suku Anak Dalam.\n" +
                    "\n" +
                    "Hutan hujan tropis Sumatra harus senantiasa dijaga kelestariannya. Terutama dari ancaman penggundulan hutan, penambahan hutan untuk pertanian dan pembuatan jalan, serta perburuan. Apabila kawasan ini tidak dilindungi, maka keanekaragaman hayati yang hidup di sana terancam punah. Selain itu, hutan hujan tropis Sumatra berperan penting dalam stabilitas suplai air, ekologi, dan ekonomi, serta menekan pengaruh kekeringan dan kebakaran.\n" +
                    "\n" +
                    "Untuk itulah melalui sidang ke-28 World Heritage Commitee yang diselenggarakan di Suzhou, RRC pada bulan Juli 2004, Hutan Hujan Tropis Sumatra diterima sebagai Situs Warisan Dunia oleh UNESCO, karena merupakan kawasan Hutan Lindung dan rumah bagi sekitar 10.000 jenis tanaman , termasuk 17 genus endemis, lebih dari 200 spesies mamalia, dan 580 spesies burung dan 465 berdomisili dan 21 merupakan endemis. Di antara jenis mamalia, 22 adalah orang utan, yang tidak ditemukan di tempat lain di Indonesia dan 15 hanya terbatas ke wilayah Indonesia, termasuk Sumatra yaitu orang utan Sumatra. Hutan Hujan Tropis Sumatra ini juga memberikan bukti dari evolusi biogeografi pulau.\n" +
                    "\n" +
                    "Bagian yang menonjol dari Hutan Hujan Tropis Sumatra terdapat pada Pegunungan Bukit Barisan yang dijuluki sebagai Andesnya Sumatra Perpaduan Danau Gunung Tujuh yang sepektakuler yang merupakan Danau tertinggi di Asia Tenggara keindahan Gunung Kerinci, Gua, dan Air terjun membuat tempat ini semakin tepat untuk wilayah Konservasi maupun Pariwisata.\n" +
                    "\n" +
                    "Setidaknya 92 jenis endemis lokal telah diidentifikasi di Taman Nasional Gunung Leuser. Nominasi ini berisi populasi dari kedua bunga terbesar di dunia Rafflesia arnoldi dan bunga tertinggi Amorphophallus titanum , tempat ini sangat penting bagi konservasi vegetasi pegunungan khusus dari properti tersebut.",
                    "Wisata Alam", "3°30′N 97°30′E\uFEFF / \uFEFF3.500°N 97.50", "-"}
    };

    public static ArrayList<Place> getListPlace(){
        Place place = null;
        ArrayList<Place> list = new ArrayList<>();
        for (String[] dataPlace : data){
            place = new Place();
            place.setPlaceName(dataPlace[0]);
            place.setLocation(dataPlace[1]);
            place.setPhoto(dataPlace[2]);
            place.setGeneralDesc(dataPlace[3]);
            place.setType(dataPlace[4]);
            place.setLonglat(dataPlace[5]);
            place.setSince(dataPlace[6]);

            list.add(place);
        }
        return list;
    }

    public static Map<Integer, Place> getMapListPlace(){
        Place place = null;
        Map<Integer, Place> mp = new HashMap<>();
        return mp;
    }
}
