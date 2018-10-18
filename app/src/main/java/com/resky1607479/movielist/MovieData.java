package com.resky1607479.movielist;

import java.util.ArrayList;

public class MovieData {

    public static ArrayList<Movie> getListData(){
        Movie movie = null;
        ArrayList<Movie> list = new ArrayList<>();

        movie = new Movie();
        movie.setName("Avengers: Infinity War");
        movie.setRelease("27 April 2018");
        movie.setRating("8.6");
        movie.setPhoto("https://m.media-amazon.com/images/M/MV5BMjMxNjY2MDU1OV5BMl5BanBnXkFtZTgwNzY1MTUwNTM@._V1_SY1000_CR0,0,674,1000_AL_.jpg");
        movie.setDetail("The Avengers dan sekutu mereka harus bersedia mengorbankan segalanya " +
                "dalam upaya untuk mengalahkan Thanos yang kuat sebelum ia berhasil menghancurkan alam semesta.");
        list.add(movie);

        movie = new Movie();
        movie.setName("Solo: A Star Wars Story");
        movie.setRelease("25 Mei 2018");
        movie.setRating("7.0");
        movie.setPhoto("https://m.media-amazon.com/images/M/MV5BOTM2NTI3NTc3Nl5BMl5BanBnXkFtZTgwNzM1OTQyNTM@._V1_SY1000_CR0,0,674,1000_AL_.jpg");
        movie.setDetail("Melalui serangkaian petualangan yang berani di dalam dunia kejahatan yang gelap dan berbahaya, " +
                "Han Solo bertemu dengan co-pilot masa depannya Chewbacca dan bertemu dengan seorang penjudi terkenal bernama Lando Calrissian, " +
                "dalam sebuah perjalanan yang akan membuatnya menjadi salah satu pahlawan perang dalam dunia Star Wars.");
        list.add(movie);

        movie = new Movie();
        movie.setName("Black Panther");
        movie.setRelease("16 Februari 2018");
        movie.setRating("7.4");
        movie.setPhoto("https://m.media-amazon.com/images/M/MV5BMTg1MTY2MjYzNV5BMl5BanBnXkFtZTgwMTc4NTMwNDI@._V1_SY1000_CR0,0,674,1000_AL_.jpg");
        movie.setDetail("Sebagai Raja baru dari Wakanda, T’Challa (Chadwick Boseman) masih bergumul mengenai perasaannya atas meninggalnya sang ayah, " +
                "T’Chaka (John Kani). Namun ia kemudian memutuskan untuk meneruskan perjuangan sang ayah. Ketika Wakanda berada dalam ancaman dua musuh " +
                "berbahaya yang dapat mengancam keselamatan negara, Black Panther berusaha membuktikan diri sebagai raja sejati Wakanda. " +
                "Ia harus menggunakan kostum barunya serta kekuatannya untuk membela Wakanda dan negara lainnya.");
        list.add(movie);

        movie = new Movie();
        movie.setName("Jurassic World: Fallen Kingdom");
        movie.setRelease("22 Juni 2018");
        movie.setRating("6.3");
        movie.setPhoto("https://m.media-amazon.com/images/M/MV5BNzIxMjYwNDEwN15BMl5BanBnXkFtZTgwMzk5MDI3NTM@._V1_.jpg");
        movie.setDetail("Setelah Isla Nublar porak-poranda akibat letusan gunung berapi, spesies dinosaurus yang tersisa dibawa ke perkebunan Lockwood " +
                "yang besar, di Amerika. Di tempat tersebut, Owen dan Claire menyadari bahwa spesies dinosaurus malah dilelang dan tidak dilestarikan. " +
                "Seekor dinosaurus hibrida yang sangat berbahaya dan dikenal dengan nama Indoraptor, kabur dan mulai meneror penduduk di sekitar perkebunan.");
        list.add(movie);

        movie = new Movie();
        movie.setName("Ant-Man and the Wasp");
        movie.setRelease("6 Juli 2018");
        movie.setRating("7.2");
        movie.setPhoto("https://m.media-amazon.com/images/M/MV5BYjcyYTk0N2YtMzc4ZC00Y2E0LWFkNDgtNjE1MzZmMGE1YjY1XkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_SY1000_CR0,0,675,1000_AL_.jpg");
        movie.setDetail("Pasca kejadian Civil War, Scott Lang (Paul Rudd) kembali bergulat dengan konsekuensi pilihannya sebagai superhero sekaligus sebagai seorang ayah. " +
                "Saat dia berusaha berjuang untuk menyeimbangkan kembali kehidupannya dirumah dengan tanggungjawabnya sebagai Ant-Man, dia berhadapan dengan Hope van Dyne " +
                "dan Dr.Hank Pym yang mendesaknya dengan misi baru. Scott kemudian harus belajar bekerjasama dengan Hope dan bertarung bersama dengan Wasp untuk mengungkap " +
                "sebuah rahasia besar dari masa lalu.");
        list.add(movie);

        movie = new Movie();
        movie.setName("Hotel Transylvania 3: Summer Vacation");
        movie.setRelease("13 Juli 2018");
        movie.setRating("6.3");
        movie.setPhoto("https://m.media-amazon.com/images/M/MV5BNjA1MzU5MTY3OF5BMl5BanBnXkFtZTgwNTU5MDA3NTM@._V1_SY1000_CR0,0,674,1000_AL_.jpg");
        movie.setDetail("Pada musim panas, Drac (Adam Sandler) bersama keluarga berlibur di sebuah kapal pesiar. Semua rencana berjalan mulus dan menyenangkan. " +
                "Hingga suatu ketika liburan indah mereka berubah menjadi mimpi buruk. Mavis (Selena Gomez) putri dari Drac menyadari bahwa ayahnya sedang jatuh " +
                "cinta kepada Erica, seorang kapten misterius kapal yang memiliki rencana jahat untuk menghancurkan semua monster.");
        list.add(movie);


        return list;
    }
}

