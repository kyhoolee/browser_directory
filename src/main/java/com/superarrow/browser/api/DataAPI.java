package com.superarrow.browser.api;

import java.util.ArrayList;
import java.util.List;

import com.superarrow.browser.model.Group;
import com.superarrow.browser.model.Site;
import com.superarrow.browser.model.Topic;

public class DataAPI {
	
	public static void main(String[] args) {
		groupList();
	}
	
	public static List<Group> groupList() {
		List<Group> result = new ArrayList<Group>();
		
		// News
		Group news = new Group(" Đọc báo", "");
		news.topicList = newsTopicList();
		result.add(news);
		// Music
		Group music = new Group("Nghe nhạc", "");
		music.topicList = musicTopicList();
		result.add(music);
		
		// Movie
		Group movie = new Group("Phim - Clip", "");	
		movie.topicList = videoTopicList();
		result.add(movie);
		// Sports
		Group sport = new Group("Thể thao", "");
		sport.topicList = sportTopicList();
		result.add(sport);
		// Showbiz
		Group showbiz = new Group("Showbiz", "");
		showbiz.topicList = showbizTopicList();
		result.add(showbiz);
		
		System.out.println(result.toString());
		
		return result;
	}
	
	public static List<Topic> newsTopicList() {
		List<Topic> result = new ArrayList<Topic>();
		
		Topic fast = new Topic("Tin nhanh");
		fast.siteList.add(new Site(
				"http://1.stc.laban.vn/largeicons/24h.com.vn-1381204839.png",
				"24h", 
				"http://www.24h.com.vn/"));
		fast.siteList.add(new Site("http://4.stc.laban.vn/largeicons/kenh14.vn-1354607660.png", "Kênh 14", "http://kenh14.vn/"));
		fast.siteList.add(new Site("http://4.stc.laban.vn/largeicons/vnexpress.net-1381205280.png", "VnExpress", "http://vnexpress.net/"));
		fast.siteList.add(new Site( "http://5.stc.laban.vn/largeicons/dantri.com.vn-1381205614.png", "Dân trí","http://dantri.com.vn/"));
		fast.siteList.add(new Site("http://3.stc.laban.vn/largeicons/vietnamnet.vn-1396429657.png", "Vietnamnet", "http://vietnamnet.vn/"));
		result.add(fast);
		
		Topic collect = new Topic("Tin tổng hợp");
		collect.siteList.add(new Site("http://4.stc.laban.vn/largeicons/baomoi.com-1441858497.jpg", "Báo mớ", "http://www.baomoi.com/"));
		collect.siteList.add(new Site("http://1.stc.laban.vn/largeicons/vietbao.vn-1354527062.png", "Việt báo", "http://vietbao.vn/"));
		collect.siteList.add(new Site("http://4.stc.laban.vn/largeicons/tin247.com-1354781034.png", "Tin247", "http://vnexpress.net/"));
		collect.siteList.add(new Site("http://1.stc.laban.vn/largeicons/baohay.vn-1357725650.png", "Baohay.vn", "http://baohay.vn/"));
		collect.siteList.add(new Site("http://2.stc.laban.vn/largeicons/docbao.vn-1354768076.png", "Đọcbáo.vn", "http://docbao.vn/"));
		result.add(collect);
		
		
		return result;
	}
	
	public static List<Topic> videoTopicList() {
		List<Topic> result = new ArrayList<Topic>();
		
		Topic movie = new Topic("Xem phim");
		movie.siteList.add(new Site(
				"http://3.stc.laban.vn/largeicons/movies.hdviet.com-1410489013.png", 
				"HD Việt", 
				"http://movies.hdviet.com/?utm_source=laban"));
		movie.siteList.add(new Site(
				"http://3.stc.laban.vn/largeicons/www.ssphim.com-1355325795.png", 
				"SSPhim", 
				"http://www.ssphim.com/"));
		movie.siteList.add(new Site(
				"http://5.stc.laban.vn/largeicons/laban.vn-1416479865.png", 
				"Phim Hay", 
				"http://laban.vn/phim-le"));
		movie.siteList.add(new Site(
				"http://4.stc.laban.vn/largeicons/hdonline.vn-1411616946.png", 
				"HDonline.vn", 
				"http://hdonline.vn/"));
		movie.siteList.add(new Site(
				"http://4.stc.laban.vn/largeicons/phim3s.net-1411379640.png", 
				"Phim3s.net", 
				"http://phim3s.net/"));
		movie.siteList.add(new Site(
				"http://2.stc.laban.vn/largeicons/www.phimmoi.net-1396432684.png", 
				"Phimmoi.net", 
				"http://www.phimmoi.net/"));
		movie.siteList.add(new Site(
				"http://1.stc.laban.vn/largeicons/www.pub.vn-1354784078.png", 
				"PUBVN", 
				"http://pubvn.tv/phim/home.html"));
		movie.siteList.add(new Site(
				"http://3.stc.laban.vn/largeicons/www.hayhaytv.vn-1361503324.png", 
				"HayhayTV", 
				"http://www.hayhaytv.vn/"));
		movie.siteList.add(new Site(
				"http://5.stc.laban.vn/largeicons/vivo.go.vn-1358924245.png", 
				"Vivo.vn", 
				"http://vivo.vn/"));
		movie.siteList.add(new Site(
				"http://2.stc.laban.vn/largeicons/phimvang.com-1354621932.png", 
				"Phim7.com", 
				"http://phim7.com/"));
		
		movie.siteList.add(new Site(
				"http://5.stc.laban.vn/largeicons/laban.vn-1416480964.png", 
				"Phim Bộ", 
				"http://laban.vn/phim-bo"));
		movie.siteList.add(new Site(
				"http://1.stc.laban.vn/largeicons/fptplay.net-1433320202.jpg", 
				"FPT PLAY", 
				"http://fptplay.net/"));
		movie.siteList.add(new Site(
				"http://4.stc.laban.vn/largeicons/laban.vn-1437730786.jpg", 
				"Hài Châu Tinh Trì", 
				"http://laban.vn/tim-kiem-phim/Ch%C3%A2u+Tinh+Tr%C3%AC"));
		
		result.add(movie);
		
		Topic video = new Topic("Video - Clip");
		
		video.siteList.add(new Site(
				"http://3.stc.laban.vn/largeicons/youtube.com-1381205141.png", 
				"Youtube", 
				"https://www.youtube.com/"));
		video.siteList.add(new Site(
				"http://4.stc.laban.vn/largeicons/www.youtube.com-1397622990.png", 
				"Phở Team", 
				"http://www.youtube.com/playlist?list=PLB2998P97zLn02ADvTk6xw-XCmxp2Um41"));
		video.siteList.add(new Site(
				"http://3.stc.laban.vn/largeicons/tv.zing.vn-1381396723.png", 
				"Zing TV", 
				"http://tv.zing.vn/"));
		video.siteList.add(new Site(
				"http://3.stc.laban.vn/largeicons/www.youtube.com-1397709619.png", 
				"BB&BG", 
				"http://www.youtube.com/user/bbtran21211"));
		video.siteList.add(new Site(
				"http://2.stc.laban.vn/largeicons/www.youtube.com-1359371811.png", 
				"DAM tv", 
				"http://www.youtube.com/user/damtivi"));
		video.siteList.add(new Site(
				"http://3.stc.laban.vn/largeicons/clip.vn-1354180402.png", 
				"Clip.vn", 
				"http://clip.vn/"));
		video.siteList.add(new Site(
				"http://1.stc.laban.vn/largeicons/dailymotion.com-1354782986.png", 
				"Dailymotion", 
				"http://www.dailymotion.com/vn"));
		video.siteList.add(new Site(
				"http://1.stc.laban.vn/largeicons/vtc.com.vn-1354590257.png", 
				"VTC THTT", 
				"http://www1.tvnet.gov.vn/"));
		video.siteList.add(new Site(
				"http://5.stc.laban.vn/largeicons/www.youtube.com-1422590279.png", 
				"Quỳnh Anh Shyn", 
				"https://www.youtube.com/user/quynhanhh212"));
		video.siteList.add(new Site(
				"http://1.stc.laban.vn/largeicons/titoradio.net-1422590621.png", 
				"Tito Radio", 
				"http://titoradio.net/radio/"));
		video.siteList.add(new Site(
				"http://2.stc.laban.vn/largeicons/www.youtube.com-1422590962.png", 
				"Phượt Radio", 
				"https://www.youtube.com/channel/UCnhd74YZPBNWyLOQXT29pkg"));
		video.siteList.add(new Site(
				"http://2.stc.laban.vn/largeicons/www.youtube.com-1422591325.png", 
				"Trắng TV", 
				"https://www.youtube.com/user/trangdentv"));
		video.siteList.add(new Site(
				"http://5.stc.laban.vn/largeicons/www.youtube.com-1422592399.png", 
				"Vinh Vật Vờ", 
				"https://www.youtube.com/user/xuanvinh1612"));
		
		
		result.add(video);
		
		
		return result;
	}
	
	
	public static List<Topic> musicTopicList() {
		List<Topic> result = new ArrayList<Topic>();
		
		Topic music = new Topic("Xem phim");
		music.siteList.add(new Site(
				"http://4.stc.laban.vn/largeicons/mp3.zing.vn-1372407479.png", 
				"Zing Mp3", 
				"http://mp3.zing.vn/"));
		music.siteList.add(new Site(
				"http://1.stc.laban.vn/largeicons/nhaccuatui.com-1381205535.png", 
				"NhacCuaTui", 
				"http://nhaccuatui.com/"));
		music.siteList.add(new Site(
				"http://5.stc.laban.vn/largeicons/nhacso.net-1396842168.png", 
				"NhacSo.net", 
				"http://nhacso.net/"));
		music.siteList.add(new Site(
				"http://1.stc.laban.vn/largeicons/www.keeng.vn-1411978195.png", 
				"Keeng.vn", 
				"http://www.keeng.vn/"));
		music.siteList.add(new Site(
				"http://3.stc.laban.vn/largeicons/hcm.nhac.vui.vn-1381205248.png", 
				"Nhac.vui.vn", 
				"http://nhac.vui.vn/"));
		music.siteList.add(new Site(
				"http://4.stc.laban.vn/largeicons/dj.very.vn-1358855041.png", 
				"Nhạc sàn - DJ", 
				"http://dj.very.vn/"));
		music.siteList.add(new Site(
				"http://2.stc.laban.vn/largeicons/soundcloud.com-1396435186.png", 
				"SoundCloud", 
				"https://soundcloud.com/"));
		
		
		result.add(music);
		
		
		return result;
	}
	
	
	public static List<Topic> sportTopicList() {
		List<Topic> result = new ArrayList<Topic>();
		
		Topic live = new Topic("Xem bóng đá trực tuyến");
		live.siteList.add(new Site(
				"http://2.stc.laban.vn/largeicons/tructiepbongda.com-1363178659.png", 
				"Trực tiếp bóng đá", 
				"http://tructiepbongda.com/"));
		live.siteList.add(new Site(
				"http://5.stc.laban.vn/largeicons/bongdatv.net-1370421496.png", 
				"Bongdatv", 
				"http://bongdatv.net/"));
		live.siteList.add(new Site(
				"http://4.stc.laban.vn/largeicons/topbongda.com-1375172713.png", 
				"Top Bóng Đá", 
				"http://topbongda.com/"));
		live.siteList.add(new Site(
				"http://4.stc.laban.vn/largeicons/bongdatructuyen.info-1414574948.png", 
				"Bongdatructuyen.info", 
				"http://bongdatructuyen.info/"));
		live.siteList.add(new Site(
				"http://1.stc.laban.vn/largeicons/hn.24h.com.vn-1363195893.png", 
				"Clip bàn thắng", 
				"http://www.24h.com.vn/video-ban-thang-c297.html"));
		
		result.add(live);
		
		
		Topic news = new Topic("Tin bóng đá");
		news.siteList.add(new Site( 
				"http://3.stc.laban.vn/largeicons/bongdaplus.vn-1398227180.png", 
				"Bóng đá +",
				"http://bongdaplus.vn/"));
		news.siteList.add(new Site(
				"http://1.stc.laban.vn/largeicons/bongda24h.vn-1354416798.png",
				"Bóng đá 24h", 
				"http://bongda24h.vn/"));
		news.siteList.add(new Site(
				"http://5.stc.laban.vn/largeicons/www.bongda.com.vn-1354611194.png", 
				"Bóng đá", 
				"http://www.bongda365.com.vn/"));
		news.siteList.add(new Site(
				"http://1.stc.laban.vn/largeicons/livescore.com-1365656982.png", 
				"LiveScore", 
				"http://livescore.com/"));
		news.siteList.add(new Site(
				"http://5.stc.laban.vn/largeicons/ibongda.vn-1414574752.png", 
				"ibongda", 
				"http://ibongda.vn/"));
		
		result.add(news);
		
		
		return result;
	}
	
	public static List<Topic> showbizTopicList() {
		List<Topic> result = new ArrayList<Topic>();
		
		Topic news = new Topic("Báo điện tử");
		news.siteList.add(new Site(
				"http://4.stc.laban.vn/largeicons/ngoisao.net-1354607888.png", 
				"Ngôi sao", 
				"http://ngoisao.net/"));
		news.siteList.add(new Site(
				"http://3.stc.laban.vn/largeicons/kenh14.vn-1354607660.png", 
				"Kênh 14", 
				"http://kenh14.vn/"));
		news.siteList.add(new Site(
				"http://1.stc.laban.vn/largeicons/2sao.vn-1428897010.jpg", 
				"2Sao", 
				"http://2sao.vn/"));
		news.siteList.add(new Site(
				"http://1.stc.laban.vn/largeicons/www.yan.vn-1396429368.png", 
				"Yan.vn", 
				"http://www.yan.vn/"));
		news.siteList.add(new Site(
				"http://4.stc.laban.vn/largeicons/vietgiaitri.com-1354528006.png", 
				"VietGiaiTri.com", 
				"http://www.vietgiaitri.com/"));
		
		result.add(news);
		
		Topic event = new Topic("Sự kiện giải trí");
		event.siteList.add(new Site(
				"http://4.stc.laban.vn/largeicons/vntic.vn-1363176687.png", 
				"VnTic - Vé sự kiện", 
				"http://vntic.vn/"));
		event.siteList.add(new Site(
				"http://2.stc.laban.vn/largeicons/liveshowhay.com-1366621744.png", 
				"Liveshowhay.com", 
				"http://liveshowhay.com/"));
		event.siteList.add(new Site(
				"http://2.stc.laban.vn/largeicons/ticbox.vn-1368436302.png", 
				"Ticbox – Hộp vé", 
				"http://ticbox.vn/"));
		event.siteList.add(new Site(
				"http://1.stc.laban.vn/largeicons/sukienhay.com-1380272210.png", 
				"Sukienhay.com", 
				"http://sukienhay.com/"));
		event.siteList.add(new Site(
				"http://5.stc.laban.vn/largeicons/phimchieurap.vn-1366857275.png", 
				"Phim chiếu rạp", 
				"http://phimchieurap.vn/"));
		
		result.add(event);
		
		Topic show = new Topic("Game show đang HOT");
		show.siteList.add(new Site(
				"http://5.stc.laban.vn/largeicons/www.youtube.com-1445860361.jpg", 
				"Gương Mặt Thân Quen Nhí 2015", 
				"https://www.youtube.com/channel/UC2ZC2Kfy4zs6zbeKC2or2DQ"));
		show.siteList.add(new Site(
				"http://1.stc.laban.vn/largeicons/www.youtube.com-1446433966.jpg", 
				"Ơn giời cậu đây rồi 2015", 
				"https://www.youtube.com/user/ONGIOICAUDAYROIVTV3/featured"));
		show.siteList.add(new Site(
				"http://1.stc.laban.vn/largeicons/tv.zing.vn-1436432300.jpg", 
				"Game shows Sasuke Việt Nam", 
				"https://www.youtube.com/channel/UCCONQdW98HmR8hipzpbZQxQ"));
		show.siteList.add(new Site(
				"http://5.stc.laban.vn/largeicons/tv.zing.vn-1444204951.jpg", 
				"Bước Nhảy Ngàn Cân", 
				"https://www.youtube.com/channel/UCWbIyyRQoUEEwz-dswqWxww"));
		show.siteList.add(new Site(
				"http://3.stc.laban.vn/largeicons/www.youtube.com-1445849834.jpg", 
				"Hoán đổi", 
				"https://www.youtube.com/channel/UCUvXnUDkgCZE6SDvsGSEpVw"));
		show.siteList.add(new Site(
				"http://4.stc.laban.vn/largeicons/tv.zing.vn-1414739533.png", 
				"Bố Ơi, Mình Đi Đâu Thế ", 
				"https://www.youtube.com/channel/UC1Rkr2Nxq_MPAaP8JlEpWxg"));
		show.siteList.add(new Site(
				"http://1.stc.laban.vn/largeicons/tv.zing.vn-1437447614.jpg", 
				"Danh hài Đất Việt", 
				"http://tv.zing.vn/danh-hai-dat-viet"));
		show.siteList.add(new Site(
				"http://1.stc.laban.vn/largeicons/tv.zing.vn-1442389181.jpg", 
				"Masterchef Việt Nam 2015", 
				"http://tv.zing.vn/masterchef-viet-nam-2015"));
		show.siteList.add(new Site(
				"http://2.stc.laban.vn/icons/tv.zing.vn-1445934091.jpg", 
				"TV Show Ca Sĩ Giấu Mặt", 
				"http://tv.zing.vn/ca-si-giau-mat"));
		show.siteList.add(new Site(
				"http://3.stc.laban.vn/largeicons/www.youtube.com-1447237810.jpg", 
				"TV Show Thách Thức Danh Hài Mùa 2", 
				"https://www.youtube.com/channel/UCwmurIyZ6FHyVPtKppe_2_A"));
		show.siteList.add(new Site(
				"http://3.stc.laban.vn/largeicons/tv.zing.vn-1447819242.jpg", 
				"TW Show Cười Xuyên Việt", 
				"http://tv.zing.vn/cuoi-xuyen-viet-phien-ban-nghe-si"));
		show.siteList.add(new Site(
				"http://4.stc.laban.vn/largeicons/www.youtube.com-1447926645.jpg", 
				"Đàn ông phải thế", 
				"https://www.youtube.com/playlist?list=PLy_TpcUT2LZsQWK_kiY_toZ2kM-C_4nbs"));
		
		
		result.add(show);
		
		
		return result;
	}

}
