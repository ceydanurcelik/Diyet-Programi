import javax.swing.JOptionPane;
public class diyetprogram {
	 public static void main(String[] args) {
	 int kalori=0,secim;
	 int sec_kah=-1,sec_ogl=-1,sec_atis=-1,sec_aks=-1 ;
	 int ogle;
	 int aksam;
	 int atis;
	 int kah;
	 int miktar;
	 int basla;
	 int su=0;
	 int secimm=-1;
	 int kilo, kilo_hedef, kilo_gun, islem=1500;
	 
	 do {
	 //***********************************************************************************************************************************************************
	 basla=Integer.parseInt(JOptionPane.showInputDialog("1.Kalori Hesabı\n"
		 		+ "2.Su Tüketimi\n"
		 		+ "3.Günlük Alınan Kalori\n"
		 		+ "4.Kilo Kontrolü\n"
		 		+ "-1. Ç I K I Ş "));
	 //***********************************************************************************************************************************************************
	  
	 do {
		 if(basla==1) {
		  secim = Integer.parseInt(JOptionPane.showInputDialog("1.Kahvaltı\n"
	 		+ "2.Ogle Yemeği\n"
	 		+ "3.Akşam Yemeği\n"
	 		+ "4.Ara Öğün\n"
	 		+ "-1.ANA MENÜ "));
     //*********************************************************************************************              K   A   H  V   A  L  T  I            *********************************************
	 if(secim==1) {
		
			 
		do { 
		 sec_kah = Integer.parseInt(JOptionPane.showInputDialog("1.Yumurta\n"
		 		+ "2.Ekmek\n"
		 		+ "3.Peynir\n"
		 		+ "4.Zeytin\n"
		 		+ "5.Reçel\n"
		 		+ "6.Tereyağ\n"
		 		+ "7.Sucuk\n"
		 		+ "8.Sosis\n"
		 		+ "9.Salam\n"
		 		+ "10.İçecek\n"
		 		+ "-1.ANA MENÜ"));
		
		//**********************************************************************************************kahvaltı yumurta
		 if(sec_kah==1) {
			 
				 kah = Integer.parseInt(JOptionPane.showInputDialog("1.Sahanda Yumurta\n"
			 
			 		+ "2.Haşlanmış Yumurta\n"
			 		+ "3.Menemen\n"
			 		+ "4.Omlet\n"));
			 
			 if( kah ==1 ) {
			     miktar=Integer.parseInt(JOptionPane.showInputDialog("Kaç porsiyon tükettiniz?"));
			     kalori += miktar*160;
			     
		 }
			 if( kah ==2 ) {
			     miktar=Integer.parseInt(JOptionPane.showInputDialog("Kaç porsiyon tükettiniz?"));
			     kalori += miktar*78;
		 }
			 if( kah ==3 ) {
			     miktar=Integer.parseInt(JOptionPane.showInputDialog("Kaç porsiyon tükettiniz?"));
			     kalori += miktar*223;
		 }
			 if( kah ==4 ) {
			     miktar=Integer.parseInt(JOptionPane.showInputDialog("Kaç porsiyon tükettiniz?"));
			     kalori += miktar*169;
		 }
			 
		 }
		 
		 //*********************************************************************************************kahvaltı ekmek
		 if(sec_kah==2) {
			 kah = Integer.parseInt(JOptionPane.showInputDialog("1.Beyaz Ekmek\n"
			 		+ "2.Tam Tahıllı Ekmek\n"
			 		+ "3.Kepek Ekmeği\n"));
			 
			 
			 if(kah==1) {
			         miktar=Integer.parseInt(JOptionPane.showInputDialog("Kaç ince dilim ekmek tükettiniz?"));
			         kalori += miktar*64;
		                    }
			 if(kah==2) {
				 miktar=Integer.parseInt(JOptionPane.showInputDialog("Kaç ince dilim ekmek tükettiniz?"));
				 kalori += miktar*79;
		                    }
		     if(kah==3) {
		    	 miktar=Integer.parseInt(JOptionPane.showInputDialog("Kaç ince dilim ekmek tükettiniz?"));
		    	 kalori += miktar*56;
			                }
		 }
		 //*********************************************************************************************************kahvaltı peynir
		 if(sec_kah==3) {
			 kah = Integer.parseInt(JOptionPane.showInputDialog("1.Tam Yağlı Peynir\n"
			 		+ "2.Kaşar Peynir\n"
			 		+ "3.Krem Peynir\n"));
			 
			 if(kah==1) {
			         miktar=Integer.parseInt(JOptionPane.showInputDialog(" Kaç kibrit kutusu?"));
			         kalori += miktar*50;
		                    }
			 if(kah==2) {
				    miktar=Integer.parseInt(JOptionPane.showInputDialog(" Kaç kibrit kutusu?"));
				    kalori += miktar*64;
		                    }
			
		     if(kah==3) {
		    	    miktar=Integer.parseInt(JOptionPane.showInputDialog(" Kaç kibrit kutusu?"));
		    	    kalori += miktar*57;
			                }
		 }
		// **********************************************************************************************************kahvaltı zeytin
		 if(sec_kah==4) {
			 kah = Integer.parseInt(JOptionPane.showInputDialog("1.Siyah Zeytin\n"
			 		+ "2.Yeşil Zeytin"));
			 
			 if(kah==1) {
			         miktar=Integer.parseInt(JOptionPane.showInputDialog(" Kaç adet?"));
			         kalori += miktar*11;
		                    }
			 if(kah==2) {
				    miktar=Integer.parseInt(JOptionPane.showInputDialog(" Kaç adet?"));
				    kalori += miktar*5;
		                    }
		    }
		 //*********************************************************************************************************kahvaltı reçel
		 if(sec_kah==5) {
			 kah = Integer.parseInt(JOptionPane.showInputDialog("1.İncir Reçeli\n"
			 		+ "2.Çilek Reçeli\n"
			 		+ "3.Şeftali Reçeli\n"
			 		+ "4.Ayva Reçeli\n"
			 		+ "5.Erik Reçeli"));
			 
			 if(kah==1) {
			         miktar=Integer.parseInt(JOptionPane.showInputDialog(" Kaç tatlı kaşığı?"));
			         kalori += miktar*6;
		                    }
			 if(kah==2) {
				 miktar=Integer.parseInt(JOptionPane.showInputDialog(" Kaç tatlı kaşığı?"));
				 kalori += miktar*19;
		                    }
		     if(kah==3) {
		    	 miktar=Integer.parseInt(JOptionPane.showInputDialog(" Kaç tatlı kaşığı?"));
		    	 kalori += miktar*19;
			                }
		     
		     if(kah==4) {
		    	 miktar=Integer.parseInt(JOptionPane.showInputDialog(" Kaç tatlı kaşığı?"));
		    	 kalori += miktar*19;
		                    }
		     if(kah==5) {
		    	 miktar=Integer.parseInt(JOptionPane.showInputDialog(" Kaç tatlı kaşığı?"));
		    	 kalori += miktar*20;
		                    }
		     }
		 //*************************************************************************************************************kahvaltı tereyağ
		 
		 if(sec_kah==6) {
			      miktar=Integer.parseInt(JOptionPane.showInputDialog(" Kaç tatlı kaşığı?"));
			      kalori += miktar*38;
		 }
 //*************************************************************************************************************kahvaltı sucuk
		 
		 if(sec_kah==7) {
			      miktar=Integer.parseInt(JOptionPane.showInputDialog(" Kaç ince dilim?"));
			      kalori += miktar*25;
		 }
 //*************************************************************************************************************kahvaltı sosis
		 
		 if(sec_kah==8) {
			      miktar=Integer.parseInt(JOptionPane.showInputDialog(" Kaç adet (küçük boy)?"));
			      kalori += miktar*58;
		 }
 //*************************************************************************************************************kahvaltı salam
		 
		 if(sec_kah==9) {
			      miktar=Integer.parseInt(JOptionPane.showInputDialog(" Kaç ince dilim?"));
			      kalori += miktar*53;
		 }
 //*************************************************************************************************************kahvaltı tereyağ
		 
		 if(sec_kah==10) {
			 kah = Integer.parseInt(JOptionPane.showInputDialog("1.Çay\n"
				 		+ "2.Kahve\n"
				 		+ "3.Portakal Suyu"));
				 
				 if(kah==1) {
				         miktar=Integer.parseInt(JOptionPane.showInputDialog(" Kaç çay bardağı (ince belli olandan:) ) ?"));
				         kalori += miktar*1;
			                    }
				 if(kah==2) {
					 miktar=Integer.parseInt(JOptionPane.showInputDialog(" Kaç fincan?"));
					 kalori += miktar*57;
			                    }
			     if(kah==3) {
			    	 miktar=Integer.parseInt(JOptionPane.showInputDialog(" Kaç bardak?"));
			    	 kalori += miktar*90;
				                }
		 }
		 
		 
		}while(sec_kah != -1);
		 
	 }
//********************************************************************************************************************************          Ö Ğ L E   Y E M E Ğ İ        ***************************
	 if(secim==2) {
		 do {
		 sec_ogl = Integer.parseInt(JOptionPane.showInputDialog("1.Çorba\n"
		 		+ "2.Pilav / Makarna\n"
		 		+ "3.Ana Yemek\n"
		 		+ "4.Salata\n"
		 		+ "5.İçecek\n"
		 		+ "6.Ekmek\n"
		 		+ "-1.GERİ"));
		
		//**********************************************************************************************  öğle yemeği çorba
			 if(sec_ogl==1) {
				 ogle = Integer.parseInt(JOptionPane.showInputDialog("1.Mercimek Çorbası\n"
			 		+ "2.Domates Çorbası\n"
			 		+ "3.Tarhana Çorbası\n"
			 		+ "4.Ezogelin Çorbası\n"
			 		+ "5.Tavuk Suyu Çorba\n"));
			 if( ogle ==1 ) {
			     miktar=Integer.parseInt(JOptionPane.showInputDialog("Kaç kase?"));
			     kalori += miktar*105;
			            }
			 if(ogle==2) {
			     miktar=Integer.parseInt(JOptionPane.showInputDialog("Kaç kase?"));
			     kalori += miktar*148;
	                    }
		 if(ogle==3) {
		     miktar=Integer.parseInt(JOptionPane.showInputDialog("Kaç kase?"));
		     kalori += miktar*108;
	                    }
	     if(ogle==4) {
		     miktar=Integer.parseInt(JOptionPane.showInputDialog("Kaç kase?"));
		     kalori += miktar*181;
		                }
	     if(ogle==5) {
		     miktar=Integer.parseInt(JOptionPane.showInputDialog("Kaç kase?"));
		     kalori += miktar*151;
		                }
		 }
		 
		 //*********************************************************************************************        öğle yemeği pilav makarna
		 if(sec_ogl==2) {
			 ogle = Integer.parseInt(JOptionPane.showInputDialog("1.Pirinç Pilavı\n"
			 		+ "2.Bulgur Pilavı\n"
			 		+ "3.Sade Makarna\n"
			 		+ "4.Soslu Makarna"));
			 
			 
			 if(ogle==1) {
			         miktar=Integer.parseInt(JOptionPane.showInputDialog("Kaç yemek kaşığı?"));
			         kalori += miktar*33;
		                    }
			 if(ogle==2) {
		         miktar=Integer.parseInt(JOptionPane.showInputDialog("Kaç yemek kaşığı?"));
		         kalori += miktar*24;
	                    }
			 if(ogle==3) {
		         miktar=Integer.parseInt(JOptionPane.showInputDialog("Kaç yemek kaşığı?"));
		         kalori += miktar*25;
	                    }
			 
			 if(ogle==4) {
		         miktar=Integer.parseInt(JOptionPane.showInputDialog("Kaç yemek kaşığı?"));
		         kalori += miktar*31;
	                    }
		 }
		 //*********************************************************************************************************         öğle yemeği ana yemek
		 if(sec_ogl==3) {
			 ogle = Integer.parseInt(JOptionPane.showInputDialog("1.İzmir Köfte\n"
			 		+ "2.Pizza\n"
			 		+ "3.Burger\n"
			 		+ "4.Lahmacun\n"
			 		+ "5.Soslu (Köri, Mantar, Krema) Tavuk\n"
			 		+ "6.Sarma/Dolma\n"
			 		+ "7.Karnıyarık\n"
			 		+ "8.Patates Oturtma\n"
			 		+ "9.Etli Nohut Yemeği\n"));
			 
			 if(ogle==1) {
			         miktar=Integer.parseInt(JOptionPane.showInputDialog(" Kaç adet?"));
			         kalori += miktar*48;
		                    }
			 if(ogle==2) {
		         miktar=Integer.parseInt(JOptionPane.showInputDialog(" Kaç ince dilim?"));
		         kalori += miktar*122;
	                    }
			 if(ogle==3) {
		         miktar=Integer.parseInt(JOptionPane.showInputDialog(" Kaç adet?"));
		         kalori += miktar*264;
	                    }
			 if(ogle==4) {
		         miktar=Integer.parseInt(JOptionPane.showInputDialog(" Kaç adet?"));
		         kalori += miktar*450;
	                    }
			 if(ogle==5) {
		         miktar=Integer.parseInt(JOptionPane.showInputDialog(" Kaç tabak?"));
		         kalori += miktar*220;
	                    }
			 if(ogle==6) {
		         miktar=Integer.parseInt(JOptionPane.showInputDialog(" Kaç adet?"));
		         kalori += miktar*18;
	                    }
			 if(ogle==7) {
		         miktar=Integer.parseInt(JOptionPane.showInputDialog(" Kaç porsiyon?"));
		         kalori += miktar*242;
	                    }
			 if(ogle==8) {
		         miktar=Integer.parseInt(JOptionPane.showInputDialog(" Kaç yemek kaşığı?"));
		         kalori += miktar*31;
	                    }
			 if(ogle==9) {
		         miktar=Integer.parseInt(JOptionPane.showInputDialog(" Kaç yemek kaşığı?"));
		         kalori += miktar*29;
	                    }
		 }
		// **********************************************************************************************************   öğle yemeği     salata
		 if(sec_ogl==4) {
			 ogle = Integer.parseInt(JOptionPane.showInputDialog("1.Yeşil Salata\n"
			 		+ "2.Ege Salatası\n"
			 		+ "3.Rus Salatası\n"
			 		+ "4.Mevsim Salatası"));
			 
			 if(ogle==1) {
			         miktar=Integer.parseInt(JOptionPane.showInputDialog(" Kaç yemek kaşığı?"));
			         kalori += miktar*6;
		                    }
			 if(ogle==2) {
		         miktar=Integer.parseInt(JOptionPane.showInputDialog(" Kaç yemek kaşığı?"));
		         kalori += miktar*6;
	                    }
			 if(ogle==3) {
		         miktar=Integer.parseInt(JOptionPane.showInputDialog(" Kaç yemek kaşığı?"));
		         kalori += miktar*63;
	                    }
			 if(ogle==4) {
		         miktar=Integer.parseInt(JOptionPane.showInputDialog(" Kaç yemek kaşığı?"));
		         kalori += miktar*12;
	                    }
		    }
		 //************************************************************************************************************         öğle yemeği içecek       ************************************
		 if(sec_ogl==5) {
			 ogle = Integer.parseInt(JOptionPane.showInputDialog("1.Ayran\n"
				 		+ "2.Kola\n"
				 		+ "3.Meyve Suyu"));
				 
				 if(ogle==1) {
				         miktar=Integer.parseInt(JOptionPane.showInputDialog(" Kaç bardak?"));
				         kalori += miktar*72;
			                    }
				 if(ogle==2) {
					 miktar=Integer.parseInt(JOptionPane.showInputDialog(" Kaç bardak?"));
					 kalori += miktar*139;
			                    }
			     if(ogle==3) {
			    	 miktar=Integer.parseInt(JOptionPane.showInputDialog(" Kaç bardak?"));
			    	 kalori += miktar*126;
				                }
		}
		 //*********************************************************************************************************    öğle yemeği ekmek
		 if(sec_ogl==6) {
			 ogle = Integer.parseInt(JOptionPane.showInputDialog("1.Beyaz Ekmek\n"
			 		+ "2.Tam Tahıllı Ekmek\n"
			 		+ "3.Kepek Ekmeği\n"));
			 
			 
			 if(ogle==1) {
			         miktar=Integer.parseInt(JOptionPane.showInputDialog("Kaç ince dilim ekmek tükettiniz?"));
			         kalori += miktar*64;
		                    }
			 if(ogle==2) {
				 miktar=Integer.parseInt(JOptionPane.showInputDialog("Kaç ince dilim ekmek tükettiniz?"));
				 kalori += miktar*79;
		                    }
			 
		     if(ogle==3) {
		    	 miktar=Integer.parseInt(JOptionPane.showInputDialog("Kaç ince dilim ekmek tükettiniz?"));
		    	 kalori += miktar*56;
			                }
		 }
		 }while(sec_ogl !=-1);
		 }
	 //****************************************************************************************************************             A K Ş A M   Y E M E  Ğ İ        ************************
	 
	 if(secim==3) {
		do { sec_aks = Integer.parseInt(JOptionPane.showInputDialog("1.Çorba\n"
		 		+ "2.Pilav / Makarna\n"
		 		+ "3.Ana Yemek\n"
		 		+ "4.Salata\n"
		 		+ "5.İçecek\n"
		 		+ "6.Ekmek\n"
		 		+ "-1.GERİ"));
		
		//**********************************************************************************************  akşam yemeği çorba
			 if(sec_aks==1) {
				 aksam = Integer.parseInt(JOptionPane.showInputDialog("1.Mercimek Çorbası\n"
			 		+ "2.Domates Çorbası\n"
			 		+ "3.Tarhana Çorbası\n"
			 		+ "4.Ezogelin Çorbası\n"
			 		+ "5.Tavuk Suyu Çorba\n"));
			 if( aksam ==1 ) {
			     miktar=Integer.parseInt(JOptionPane.showInputDialog("Kaç kase?"));
			     kalori += miktar*105;
			            }
			 if(aksam==2) {
			     miktar=Integer.parseInt(JOptionPane.showInputDialog("Kaç kase?"));
			     kalori += miktar*148;
	                    }
		 if(aksam==3) {
		     miktar=Integer.parseInt(JOptionPane.showInputDialog("Kaç kase?"));
		     kalori += miktar*108;
	                    }
	     if(aksam==4) {
		     miktar=Integer.parseInt(JOptionPane.showInputDialog("Kaç kase?"));
		     kalori += miktar*181;
		                }
	     if(aksam==5) {
		     miktar=Integer.parseInt(JOptionPane.showInputDialog("Kaç kase?"));
		     kalori += miktar*151;
		                }
		 }
		 
		 //*********************************************************************************************      aksam yemeği pilav makarna
		 if(sec_aks==2) {
			 aksam = Integer.parseInt(JOptionPane.showInputDialog("1.Pirinç Pilavı\n"
			 		+ "2.Bulgur Pilavı\n"
			 		+ "3.Sade Makarna\n"
			 		+ "4.Soslu Makarna"));
			 
			 
			 if(aksam==1) {
			         miktar=Integer.parseInt(JOptionPane.showInputDialog("Kaç yemek kaşığı?"));
			         kalori += miktar*33;
		                    }
			 if(aksam==2) {
		         miktar=Integer.parseInt(JOptionPane.showInputDialog("Kaç yemek kaşığı?"));
		         kalori += miktar*24;
	                    }
			 if(aksam==3) {
		         miktar=Integer.parseInt(JOptionPane.showInputDialog("Kaç yemek kaşığı?"));
		         kalori += miktar*25;
	                    }
			 if(aksam==4) {
		         miktar=Integer.parseInt(JOptionPane.showInputDialog("Kaç yemek kaşığı?"));
		         kalori += miktar*31;
	                    }
		 }
		 //*********************************************************************************************************         aksam yemeği ana yemek
		 if(sec_aks==3) {
			 aksam = Integer.parseInt(JOptionPane.showInputDialog("1.Adana Kebap\n"
			 		+ "2.Tavuk Şinitzel\n"
			 		+ "3.Köfte Izgara\n"
			 		+ "4.İzmir Köfte\n"
			 		+ "5.Lahmacun\n"
			 		+ "6.Soslu (Köri, Mantar, Krema) Tavuk\n"
			 		+ "7.Sarma/Dolma\n"
			 		+ "8.Karnıyarık\n"
			 		+ "9.Patates Oturtma\n"
			 		+ "10.Etli Nohut Yemeği\n"
			 		+ "11.Pizza\n"
			 		+ "12.Burger"));
			 
			 if(aksam==1) {
			         miktar=Integer.parseInt(JOptionPane.showInputDialog(" Kaç porsiyon?"));
			         kalori += miktar*94;
		                    }
			 if(aksam==2) {
		         miktar=Integer.parseInt(JOptionPane.showInputDialog(" Kaç porsiyon?"));
		         kalori += miktar*494;
	                    }
			 if(aksam==3) {
		         miktar=Integer.parseInt(JOptionPane.showInputDialog(" Kaç köfte kadar?"));
		         kalori += miktar*82;
	                    }
			 if(aksam==4) {
		         miktar=Integer.parseInt(JOptionPane.showInputDialog(" Kaç adet?"));
		         kalori += miktar*48;
	                    }
			 if(aksam==5) {
		         miktar=Integer.parseInt(JOptionPane.showInputDialog(" Kaç adet?"));
		         kalori += miktar*450;
	                    }
			 if(aksam==6) {
		         miktar=Integer.parseInt(JOptionPane.showInputDialog(" Kaç tabak?"));
		         kalori += miktar*220;
	                    }
			 if(aksam==7) {
		         miktar=Integer.parseInt(JOptionPane.showInputDialog(" Kaç adet?"));
		         kalori += miktar*18;
	                    }
			 if(aksam==8) {
		         miktar=Integer.parseInt(JOptionPane.showInputDialog(" Kaç porsiyon?"));
		         kalori += miktar*242;
	                    }
			 if(aksam==9) {
		         miktar=Integer.parseInt(JOptionPane.showInputDialog(" Kaç yemek kaşığı?"));
		         kalori += miktar*31;
	                    }
			 if(aksam==10) {
		         miktar=Integer.parseInt(JOptionPane.showInputDialog(" Kaç yemek kaşığı?"));
		         kalori += miktar*29;
	                    }
			 if(aksam==11) {
		         miktar=Integer.parseInt(JOptionPane.showInputDialog(" Kaç ince dilim?"));
		         kalori += miktar*122;
	                    }
			 if(aksam==12) {
		         miktar=Integer.parseInt(JOptionPane.showInputDialog(" Kaç adet?"));
		         kalori += miktar*264;
	                    }
		 }
		// **********************************************************************************************************   akşam yemeği     salata
		 if(sec_aks==4) {
			 aksam = Integer.parseInt(JOptionPane.showInputDialog("1.Yeşil Salata\n"
			 		+ "2.Ege Salatası\n"
			 		+ "3.Rus Salatası\n"
			 		+ "4.Mevsim Salatası"));
			 
			 if(aksam==1) {
			         miktar=Integer.parseInt(JOptionPane.showInputDialog(" Kaç yemek kaşığı?"));
			         kalori += miktar*6;
		                    }
			 if(aksam==2) {
		         miktar=Integer.parseInt(JOptionPane.showInputDialog(" Kaç yemek kaşığı?"));
		         kalori += miktar*6;
	                    }
			 if(aksam==3) {
		         miktar=Integer.parseInt(JOptionPane.showInputDialog(" Kaç yemek kaşığı?"));
		         kalori += miktar*63;
	                    }
			 if(aksam==4) {
		         miktar=Integer.parseInt(JOptionPane.showInputDialog(" Kaç yemek kaşığı?"));
		         kalori += miktar*12;
	                    }
		    }
		// *************************************************************************************************************** aksam yemeği   içecek
		 if(sec_aks==5) {
			 aksam = Integer.parseInt(JOptionPane.showInputDialog("1.Ayran\n"
				 		+ "2.Kola\n"
				 		+ "3.Meyve Suyu"));
				 
				 if(aksam==1) {
				         miktar=Integer.parseInt(JOptionPane.showInputDialog(" Kaç bardak?"));
				         kalori += miktar*72;
			                    }
				 if(aksam==2) {
					 miktar=Integer.parseInt(JOptionPane.showInputDialog(" Kaç bardak?"));
					 kalori += miktar*139;
			                    }
			     if(aksam==3) {
			    	 miktar=Integer.parseInt(JOptionPane.showInputDialog(" Kaç bardak?"));
			    	 kalori += miktar*126;
				                }
		}
		 //*********************************************************************************************************    akşam yemeği ekmek
		 if(sec_aks==6) {
			 aksam = Integer.parseInt(JOptionPane.showInputDialog("1.Beyaz Ekmek\n"
			 		+ "2.Tam Tahıllı Ekmek\n"
			 		+ "3.Kepek Ekmeği\n"));
			 
			 
			 if(aksam==1) {
			         miktar=Integer.parseInt(JOptionPane.showInputDialog("Kaç ince dilim ekmek tükettiniz?"));
			         kalori += miktar*64;
		                    }
			 if(aksam==2) {
				 miktar=Integer.parseInt(JOptionPane.showInputDialog("Kaç ince dilim ekmek tükettiniz?"));
				 kalori += miktar*79;
		                    }
		     if(aksam==3) {
		    	 miktar=Integer.parseInt(JOptionPane.showInputDialog("Kaç ince dilim ekmek tükettiniz?"));
		    	 kalori += miktar*56;
			                }
		 }
			}while(sec_aks !=-1);
		 }
	 //*************************************************************************************************************************                    A R A   Ö Ğ Ü N              *****************
	 
	 if(secim==4) {
		do { 
	 
		 sec_atis = Integer.parseInt(JOptionPane.showInputDialog("1.Atıştırmalıklar\n"
		 		+ "2.İçecek\n"
		 		+ "-1.ÇIKIŞ"));
		
		//**********************************************************************************************  ara öğün Atıştırmalıklar
			 if(sec_atis==1) {
				 atis = Integer.parseInt(JOptionPane.showInputDialog("1.Tiramisu\n"
			 		+ "2.Kazandibi\n"
			 		+ "3.Profiterol\n"
			 		+ "4.Pasta\n"
			 		+ "5.Supangle\n"
			 		+ "6.Kurabiye\n"
			 		+ "-1.GERİ"));
			 if( atis ==1 ) {
			     miktar=Integer.parseInt(JOptionPane.showInputDialog("Kaç dilim?"));
			     kalori += miktar*441;
			            }
			 if(atis==2) {
			     miktar=Integer.parseInt(JOptionPane.showInputDialog("Kaç porsiyon?"));
			     kalori += miktar*283;
	                    }
		 if(atis==3) {
		     miktar=Integer.parseInt(JOptionPane.showInputDialog("Kaç adet?"));
		     kalori += miktar*46;
	                    }
	     if(atis==4) {
		     miktar=Integer.parseInt(JOptionPane.showInputDialog("Kaç dilim?"));
		     kalori += miktar*476;
		                }
	     if(atis==5) {
		     miktar=Integer.parseInt(JOptionPane.showInputDialog("Kaç kase?"));
		     kalori += miktar*261;
		                }
	     if(atis==6) {
		     miktar=Integer.parseInt(JOptionPane.showInputDialog("Kaç adet?"));
		     kalori += miktar*135;
		                }
		 }
		 
		 //*********************************************************************************************     ara ögün içecekler
		 if(sec_atis==2) {
			 atis = Integer.parseInt(JOptionPane.showInputDialog("1.Çay\n"
			 		+ "2.Kahve\n"
			 		+ "3.Diğer"));
			 int sec;
			 
			 if(atis==1) {
				 sec = Integer.parseInt(JOptionPane.showInputDialog("1.Siyah Çay\n"
					 		+ "2.Adaçayı\n"
					 		+ "3.Kış Çayı\n"
					 		+ "4.Kuşburnu"));
				 if(sec==1) {
					 miktar=Integer.parseInt(JOptionPane.showInputDialog("Kaç çay bardağı?"));
					 kalori += miktar*1;
				 }
				 if(sec==2) {
					 miktar=Integer.parseInt(JOptionPane.showInputDialog("Kaç fincan?"));
					 kalori += miktar*3;
				 }
				 if(sec==3) {
					 miktar=Integer.parseInt(JOptionPane.showInputDialog("Kaç fincan?"));
					 kalori += miktar*2;
				 }
				 if(sec==4) {
					 miktar=Integer.parseInt(JOptionPane.showInputDialog("Kaç fincan?"));
					 kalori += miktar*1;
				 }
			 }
			 
			         
		                    
			 if(atis==2) {
				 sec = Integer.parseInt(JOptionPane.showInputDialog("1.Türk Kahvesi\n"
					 		+ "2.Filtre Kahve\n"
					 		+ "3.Espresso\n"
					 		+ "4.Cappucino\n"
					 		+ "5.Latte"));
				 if(sec==1) {
					 miktar=Integer.parseInt(JOptionPane.showInputDialog("Kaç fincan?"));
					 kalori += miktar*1;
				 }
				 if(sec==2) {
					 miktar=Integer.parseInt(JOptionPane.showInputDialog("Kaç fincan?"));
					 kalori += miktar*1;
				 }
				 if(sec==3) {
					 miktar=Integer.parseInt(JOptionPane.showInputDialog("Kaç fincan?"));
					 kalori += miktar*11;
				 }
				 if(sec==4) {
					 miktar=Integer.parseInt(JOptionPane.showInputDialog("Kaç fincan?"));
					 kalori += miktar*123;
				 }
				 if(sec==4) {
					 miktar=Integer.parseInt(JOptionPane.showInputDialog("Kaç fincan?"));
					 kalori += miktar*161;
				 }
	                    }
			 //***************************************************************************************************     ara öğün diğer
			 if(atis==3) {
				 sec = Integer.parseInt(JOptionPane.showInputDialog("1.Sıcak Çikolata\n"
					 		+ "2.Salep\n"
					 		+ "3.Limonata\n"
					 		+ "4.Smoothie\n"
					 		+ "5.Milkshake\n"
					 		+ "6.Kola\n"
					 		+ "7.Soda\n"
					 		+ "8.Süt"));
				 if(sec==1) {
					 miktar=Integer.parseInt(JOptionPane.showInputDialog("Kaç fincan?"));
					 kalori += miktar*190;
				 }
				 if(sec==2) {
					 miktar=Integer.parseInt(JOptionPane.showInputDialog("Kaç fincan?"));
					 kalori += miktar*150;
				 }
				 
				 if(sec==3) {
					 miktar=Integer.parseInt(JOptionPane.showInputDialog("Kaç bardak?"));
					 kalori += miktar*90;
				 }
				 if(sec==4) {
					 miktar=Integer.parseInt(JOptionPane.showInputDialog("Kaç bardak?"));
					 kalori += miktar*261;
				 }
				 if(sec==5) {
					 miktar=Integer.parseInt(JOptionPane.showInputDialog("Kaç bardak?"));
					 kalori += miktar*509;
				 }
				 if(sec==6) {
					 miktar=Integer.parseInt(JOptionPane.showInputDialog("Kaç bardak?"));
					 kalori += miktar*139;
				 }
				 if(sec==7) {
					 miktar=Integer.parseInt(JOptionPane.showInputDialog("Kaç bardak?"));
					 kalori += miktar*0;
				 }
				 if(sec==8) {
					 miktar=Integer.parseInt(JOptionPane.showInputDialog("Kaç bardak?"));
					 kalori += miktar*70;
				 }
				 
	                    }
		} 
		}while(sec_atis !=-1);
		
			} 
	 //****************************************************************************************************************** BİTTİ *********************************
	 
	 }
	 }while(sec_kah !=-1 || sec_ogl!=-1 || sec_aks!=-1 || sec_atis!=-1);
			 //*********************************************************************************************************************************************************************
			 //*****************************************************************************************           B  E  S  İ  N  L  E  R    B  İ  T  T  İ        *****************
			 //*********************************************************************************************************************************************************************
		
		
	 //**************************************************************   kalori   göster ********************************************
	 if(basla==3) {
		 
		 if(islem-kalori>0) {
			 JOptionPane.showMessageDialog(null, "Bugün "+ kalori+  " kcal besin tükettiniz\n" + "Bugün "+(islem-kalori) +  " kcal daha besin tüketebilirsiniz\n");
			 
		 }
		 if(islem-kalori==0) {
			 JOptionPane.showMessageDialog(null, "Bugün "+ kalori+  " kcal besin tükettiniz\n"+"TEBRİKLER! Hedefinize Ulaştınız!!!\n");
			 
		 }
		 if(islem-kalori<0) {
			 JOptionPane.showMessageDialog(null, "Bugün "+ kalori+  " kcal besin tükettiniz\n"+"DİKKAT! Bugün "+(kalori-islem) +  " kcal fazladan tükettiniz!\n");
			 
		 }
		 }
		
	 if(basla==2) {
		 do {
			 
		 
		 
		 secimm=Integer.parseInt(JOptionPane.showInputDialog("1.Su tüketimi veri girişi\n"
		 		+ "2.Günlük içilen su miktarı\n"
		 		+ "-1.ANA MENÜ"));
		 if(secimm==1) {
			  su=Integer.parseInt(JOptionPane.showInputDialog("Kaç bardak su içtidiniz?"));
		 }
		if(secimm==2) {
			int x=su*200;
		 JOptionPane.showMessageDialog(null, "Bugün "+ x +  " ml su içtiniz" );
		}
		 
		 
	 
	 }while( secimm != -1);
	 }
	 
	 
	 
	 if(basla==4) {
		 
			 
		 kilo=Integer.parseInt(JOptionPane.showInputDialog("Kaç kg siniz?"));
			  kilo_hedef=Integer.parseInt(JOptionPane.showInputDialog("Kaç kg olmak istiyorsunuz? "));
			  kilo_gun=Integer.parseInt(JOptionPane.showInputDialog("Kaç ayda kilo vermek istiyorsunuz?"));
			  islem=1000+(kilo-kilo_hedef)*kilo_gun*30;
			JOptionPane.showMessageDialog(null, kilo_gun+ " ay boyunca günde "+ islem +  " kcal besin tüketmelisiniz" );
	 }
	 
	 }while(basla!=-1);
	 }
	 }

