package com.xworkz.runner;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

import com.xworkz.constants.Country;
import com.xworkz.dto.CountryDTO;

public class CountryRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountryDTO countryDTO = new CountryDTO("afghanistan", 688890, "Hibatullah Akhundzada", Country.AFGANISTAN);

		CountryDTO countryDTO1 = new CountryDTO("Albania", 88474484, "Hibatullah Akhundzada", Country.Albania);
		CountryDTO countryDTO2 = new CountryDTO("Angola", 948484, "Hibatullah Akhundzada", Country.Angola);
		CountryDTO countryDTO3 = new CountryDTO("Anguilla", 9887575, "Hibatullah Akhundzada", Country.Anguilla);
		CountryDTO countryDTO4 = new CountryDTO("Argentina", 848464, "Hibatullah Akhundzada", Country.Argentina);
		CountryDTO countryDTO5 = new CountryDTO("Armenia", 95857575, "Hibatullah Akhundzada", Country.Armenia);
		CountryDTO countryDTO6 = new CountryDTO("Ascension", 94848484, "Hibatullah Akhundzada", Country.Ascension);
		CountryDTO countryDTO7 = new CountryDTO("Bahamas", 9484844, "Hibatullah Akhundzada", Country.Bahamas);
		CountryDTO countryDTO8 = new CountryDTO("Ascension", 8655599, "Hibatullah Akhundzada", Country.Ascension);
		CountryDTO countryDTO9 = new CountryDTO("Bahamas", 86556777, "Hibatullah Akhundzada", Country.Bahamas);
		CountryDTO countryDTO10 = new CountryDTO("Australia", 847466464, "", Country.Australia);
		CountryDTO countryDTO11 = new CountryDTO("Anguilla", 0, null, Country.Anguilla);
		CountryDTO countryDTO12 = new CountryDTO("Azerbaijan", 0, null, Country.Azerbaijan);
		CountryDTO countryDTO13 = new CountryDTO("Barbados", 0, null, Country.Barbados);
		CountryDTO countryDTO14 = new CountryDTO("Barbados", 0, null, Country.Barbados);
		CountryDTO countryDTO15 = new CountryDTO("Barbuda", 0, null, Country.Barbuda);
		CountryDTO countryDTO16 = new CountryDTO("Barbuda", 0, null, Country.Barbuda);
		CountryDTO countryDTO17 = new CountryDTO("Bangladesh", 0, null, Country.Bangladesh);
		CountryDTO countryDTO18 = new CountryDTO("Belarus", 0, null, Country.Belarus);
		CountryDTO countryDTO19 = new CountryDTO("Belgium", 0, null, Country.Belgium);
		CountryDTO countryDTO20 = new CountryDTO("Benin", 0, null, Country.Benin);
		CountryDTO countryDTO21 = new CountryDTO("Bermuda", 0, null, Country.Bermuda);
		CountryDTO countryDTO22 = new CountryDTO("Bhutan", 0, null, Country.Bhutan);
		CountryDTO countryDTO23 = new CountryDTO("Bolivia)", 0, null, Country.Bolivia);
		CountryDTO countryDTO24 = new CountryDTO("Bonaire", 0, null, Country.Bonaire);
		CountryDTO countryDTO25 = new CountryDTO("Bosnia", 0, null, Country.Bosnia);
		CountryDTO countryDTO26 = new CountryDTO("Botswana", 0, null, Country.Botswana);
		CountryDTO countryDTO27 = new CountryDTO("Brazil", 0, null, Country.Brazil);
		CountryDTO countryDTO28 = new CountryDTO("BritishVirginIslands", 0, null, Country.BritishVirginIslands);
		CountryDTO countryDTO29 = new CountryDTO("Bulgaria", 0, null, Country.Bulgaria);
		CountryDTO countryDTO30 = new CountryDTO("BurkinaFaso", 0, null, Country.BurkinaFaso);
		CountryDTO countryDTO31 = new CountryDTO("BurkinaFaso", 0, null, Country.BurkinaFaso);
		CountryDTO countryDTO32 = new CountryDTO("Burundi", 0, null, Country.Burundi);
		CountryDTO countryDTO33 = new CountryDTO("Canada", 4101000, "Justin Pierre James Trudeau", Country.Canada);
		CountryDTO countryDTO34 = new CountryDTO("China", 1414329178, "Xi Jinping", Country.China);
		CountryDTO countryDTO35 = new CountryDTO("cameroon", 291123740, "Paul Biya", Country.Cameroon);
		CountryDTO countryDTO36 = new CountryDTO("Chad", 20299123, "Mahamat Idriss Deby", Country.Chad);
		CountryDTO countryDTO37 = new CountryDTO("chile", 19764751, "Gabriel Boric", Country.Chile);
		CountryDTO countryDTO38 = new CountryDTO("Cambodia", 17638801, "Hun Sen", Country.Cambodia);
		CountryDTO countryDTO39 = new CountryDTO("Cuba", 10979863, "Miguel Díaz-Canel", Country.Cuba);
		CountryDTO countryDTO40 = new CountryDTO("CentralAfricanRepublic", 5333960, "Faustin-Archange Touadéra",
				Country.CentralAfricanRepublic);
		CountryDTO countryDTO41 = new CountryDTO("CostaRicha", 5129450, "Rodrigo Chaves Robles", Country.CostaRica);
		CountryDTO countryDTO42 = new CountryDTO("CapeVerde", 0, "José Maria Neves", Country.CapeVerde);
		CountryDTO countryDTO43 = new CountryDTO("CaribbeanNetherlands", 0, "de jure ", Country.CaribbeanNetherlands);
		CountryDTO countryDTO44 = new CountryDTO("CaymanIslands", 0, "", Country.CaymanIslands);
		CountryDTO countryDTO45 = new CountryDTO("CentralAfricanRepublic", 5330690, "Faustin-Archange Touadera",
				Country.CentralAfricanRepublic);
		CountryDTO countryDTO46 = new CountryDTO("Comoros", 866628, "Azali Assoumani", Country.Comoros);
		CountryDTO countryDTO47 = new CountryDTO("CaymanIslands", 0, "Juliana O'Connor-Connolly",
				Country.CaymanIslands);
		CountryDTO countryDTO48 = new CountryDTO("Congo", 6332961, "Felix Tshiseked", Country.Congo);
		CountryDTO countryDTO49 = new CountryDTO("Cyprus", 1358282, "Nikos Christodoulides", Country.Cyprus);
		CountryDTO countryDTO50 = new CountryDTO("CzechRepublic", 10735859, "Petr Pavel", Country.CzechRepublic);
		CountryDTO countryDTO59 = new CountryDTO("CookIslands", 0, "Mark Brown", Country.CookIslands);
		CountryDTO countryDTO60 = new CountryDTO("Denmark", 5977412, "Queen – Margrethe", Country.Denmark);
		CountryDTO countryDTO61 = new CountryDTO("Djibouti", 1168722, "Ismaïl Omar Guelleh", Country.Djibouti);
		CountryDTO countryDTO62 = new CountryDTO("Dominica", 66205, "Charles Savarin", Country.Dominica);
		CountryDTO countryDTO63 = new CountryDTO("DominicanRepubli", 11427557, "Luis Abinader",
				Country.DominicanRepubli);
		CountryDTO countryDTO64 = new CountryDTO("EasterIsland", 0, "Laura Tarita Rapu Alarcón", Country.EasterIsland);
		CountryDTO countryDTO65 = new CountryDTO("Ecuador", 18135478, "Daniel Noboa", Country.Ecuador);
		CountryDTO countryDTO66 = new CountryDTO("Egypt", 116538258, "Abdel Fattah el-Sisi", Country.Egypt);
		CountryDTO countryDTO67 = new CountryDTO("EquatoriaGuinea", 1892516, "", Country.EquatoriaGuinea);
		CountryDTO countryDTO68 = new CountryDTO("Eritrea", 3535603, "", Country.Eritrea);
		CountryDTO countryDTO69 = new CountryDTO("Estonia", 1360546, "Alar Karis", Country.Estonia);
		CountryDTO countryDTO70 = new CountryDTO("Eswatini", 1242822, "", Country.Eswatini);
		CountryDTO countryDTO71 = new CountryDTO("Ethiopia", 132059767, "Sahle-Work Zewde", Country.Ethiopia);
		CountryDTO countryDTO72 = new CountryDTO("Fiji", 900300, "Wiliame Katonivere", Country.Fiji);
		CountryDTO countryDTO73 = new CountryDTO("Finland", 5625000, "Alexander Stubb", Country.Finland);
		CountryDTO countryDTO74 = new CountryDTO("France", 66147000, "Emmanuel Macron", Country.France);
		CountryDTO countryDTO75 = new CountryDTO("FrenchAntilles", 384239, "Emmanuel Macron", Country.FrenchAntilles);
		CountryDTO countryDTO76 = new CountryDTO("FrenchGuiana", 295039000, "Gabriel Serville", Country.FrenchGuiana);
		CountryDTO countryDTO77 = new CountryDTO("FrenchPolynesia", 306028000, "Moetai Brotherson",
				Country.FrenchPolynesia);
		CountryDTO countryDTO78 = new CountryDTO("Germany", 8454242, "Frank-walter Steinmaeir", Country.Germany);
		CountryDTO countryDTO79 = new CountryDTO("Ghana", 34247414, "akufo-addo", Country.Ghana);
		CountryDTO countryDTO80 = new CountryDTO("Greece", 10047768, "katerina sakellaropoulu", Country.Greece);
		CountryDTO countryDTO81 = new CountryDTO("Georgea", 3801670, "salome zourabichvii", Country.Georgea);
		CountryDTO countryDTO82 = new CountryDTO("Gambia", 2759988, "adama barrow", Country.Gambia);
		CountryDTO countryDTO83 = new CountryDTO("Gabon", 2538952, "brice oligui nguema", Country.Gabon);
		CountryDTO countryDTO84 = new CountryDTO("GuineaBissau", 2302512, "umaro sissoco embalo", Country.GuineaBissau);
		CountryDTO countryDTO85 = new CountryDTO("Guam", 167777, null, Country.Guam);
		CountryDTO countryDTO86 = new CountryDTO("Grenada", 117207, null, Country.Grenada);
		CountryDTO countryDTO87 = new CountryDTO("Greenland", 55840, null, Country.Greenland);
		CountryDTO countryDTO88 = new CountryDTO("Gribalatar", 39349, null, Country.Gribalatar);
		CountryDTO countryDTO89 = new CountryDTO("Haiti", 11580000, null, Country.Haiti);
		CountryDTO countryDTO90 = new CountryDTO("Honduras", 1087000, "Xiomara Castro", Country.Honduras);
		CountryDTO countryDTO91 = new CountryDTO("Hungary", 9600000, "tamas sulyok", Country.Hungary);
		CountryDTO countryDTO92 = new CountryDTO("Hong Kong", 7530000, "John Lee", Country.HongKong);
		CountryDTO countryDTO93 = new CountryDTO("Holy See", 526, "pope francis", Country.HolySee);
		CountryDTO countryDTO94 = new CountryDTO("India", 1450935791, "Draupadi murmu", Country.India);
		CountryDTO countryDTO95 = new CountryDTO("indonesia", 283487931, "joko widado", Country.indonesia);
		CountryDTO countryDTO96 = new CountryDTO("iran", 91567738, "Masoud pezeshkian", Country.iran);
		CountryDTO countryDTO97 = new CountryDTO("italy", 91567738, "sergio mattarella", Country.italy);
		CountryDTO countryDTO98 = new CountryDTO("iraq", 46042015, "Abdul latif", Country.iraq);
		CountryDTO countryDTO99 = new CountryDTO("isaeral", 9387021, "isaac herzog", Country.isaeral);
		CountryDTO countryDTO100 = new CountryDTO("Jamaica", 2753000, "Andrew Holness", Country.Jamaica);
		CountryDTO countryDTO101 = new CountryDTO("Japan", 123953000, "Fumio Kishida", Country.Japan);
		CountryDTO countryDTO102 = new CountryDTO("Jersey", 11680000, "Lyndon Farnham", Country.Jersey);
		CountryDTO countryDTO103 = new CountryDTO("Jordan", 11680000, "Sarah Mensah", Country.Jordan);
		CountryDTO countryDTO104 = new CountryDTO("Kazakhstan", 20485000, "Kassym-Jomart Tokayev", Country.Kazakhstan);
		CountryDTO countryDTO105 = new CountryDTO("Kenya", 51563000, "Willium Ruto", Country.Kenya);
		CountryDTO countryDTO106 = new CountryDTO("Kiribati", 126700, "Taneti Maamau", Country.Kiribati);
		CountryDTO countryDTO107 = new CountryDTO("Kosovo", 18000000, "Vjosa Osmani", Country.Kosovo);
		CountryDTO countryDTO108 = new CountryDTO("Kuwait", 5184000, "Mishal Al-Ahmad", Country.Kuwait);
		CountryDTO countryDTO109 = new CountryDTO("Kyrgyzstan", 7254000, "Sadyr Japarov", Country.Kyrgyzstan);
		CountryDTO countryDTO110 = new CountryDTO("Laos", 7658000, "Thongloun Sisoulith", Country.Laos);
		CountryDTO countryDTO111 = new CountryDTO("Latvia", 1875000, "Edgars Rinkēvičs", Country.Latvia);
		CountryDTO countryDTO112 = new CountryDTO("Lebanon", 7447000, "Aoun", Country.Lebanon);
		CountryDTO countryDTO113 = new CountryDTO("Lesotho", 2120000, "Ntsokoane Samuel Matekane", Country.Lesotho);
		CountryDTO countryDTO114 = new CountryDTO("Liberia", 5498000, "Joseph Boakai", Country.Liberia);
		CountryDTO countryDTO115 = new CountryDTO("NorthKoria", 26299000, "Kim Jong Un", Country.NorthKoria);
		CountryDTO countryDTO116 = new CountryDTO("Peru", 34096000, "Dina Boluarte", Country.Peru);
		CountryDTO countryDTO117 = new CountryDTO("Philippines", 116628000, "Bongbong Marcos", Country.Philippines);
		CountryDTO countryDTO118 = new CountryDTO("Poland", 37587000, "Andrzej duda", Country.Poland);
		CountryDTO countryDTO119 = new CountryDTO("Portugal", 10578000, null, Country.Portugal);
		CountryDTO countryDTO120 = new CountryDTO("Qatar", 2986000, "marcelo rebilo", Country.Qatar);
		CountryDTO countryDTO121 = new CountryDTO("Réunion", 8857000, "Huguette bello", Country.Réunion);
		CountryDTO countryDTO122 = new CountryDTO("Romania", 18673000, null, Country.Romania);
		CountryDTO countryDTO123 = new CountryDTO("Russia", 144820423, "Vladimir Putin", Country.Russia);
		CountryDTO countryDTO125 = new CountryDTO("Rwanda", 14256567, " Paul Kagame", Country.Rwanda);
		CountryDTO countryDTO126 = new CountryDTO("SaintBarthelemy", 9131, "", Country.SaintBarthelemy);
		CountryDTO countryDTO127 = new CountryDTO("SaintHelena", 5226, "", Country.SaintHelena);
		CountryDTO countryDTO128 = new CountryDTO("SaintKittsandNevis", 46843, "King – Charles ",
				Country.SaintKittsandNevis);
		CountryDTO countryDTO129 = new CountryDTO("SaintLucia", 179744, "King – Charles", Country.SaintLucia);
		CountryDTO countryDTO130 = new CountryDTO("SaintMartin", 42848, " Francesca Civerchia", Country.SaintMartin);
		CountryDTO countryDTO131 = new CountryDTO("SaintPierreandMiquelon", 100616, "FrancescaCiverchia",
				Country.SaintPierreandMiquelon);
		CountryDTO countryDTO132 = new CountryDTO("SaintVincentandtheGrenadines", 100616, "Charles",
				Country.SaintVincentandtheGrenadines);
		CountryDTO countryDTO133 = new CountryDTO("Samoa", 218019, "Afioga", Country.Samoa);
		CountryDTO countryDTO134 = new CountryDTO("SanMarino", 33581, "Francesca Civerchia", Country.SanMarino);
		CountryDTO countryDTO135 = new CountryDTO("SaoTomeandPrincipe", 235536, "", Country.SaoTomeandPrincipe);
		CountryDTO countryDTO136 = new CountryDTO("SaudiArabia", 33962757, "King – Salman", Country.SaudiArabia);
		CountryDTO countryDTO137 = new CountryDTO("Senegal", 18501984, "Bassirou Diomaye Faye", Country.Senegal);
		CountryDTO countryDTO138 = new CountryDTO("Seychelles", 130418, " Wavel Ramkalawan", Country.Seychelles);
		CountryDTO countryDTO139 = new CountryDTO("Seychelles", 130418, " Wavel Ramkalawan", Country.Seychelles);
		CountryDTO countryDTO140 = new CountryDTO("SierraLeone", 8642022, "Julius Maada Bio", Country.SierraLeone);
		CountryDTO countryDTO141 = new CountryDTO("Singapore", 5832387, "Tharman Shanmugaratnam", Country.Singapore);
		CountryDTO countryDTO142 = new CountryDTO("SintMaarten", 43492, "", Country.SintMaarten);
		CountryDTO countryDTO143 = new CountryDTO("SaintPierreandMiquelon", 5394, "", Country.SaintPierreandMiquelon);
		CountryDTO countryDTO144 = new CountryDTO("Slovakia", 5506760, " Peter Pellegrini", Country.Slovakia);
		CountryDTO countryDTO145 = new CountryDTO("Slovenia", 2118697, " Peter Pellegrini", Country.Slovenia);
		CountryDTO countryDTO146 = new CountryDTO("Somalia", 19009151, "Hassan Sheikh Mohamud", Country.Somalia);
		CountryDTO countryDTO147 = new CountryDTO("SouthAfrica", 64007187, " Cyril Ramaphosa", Country.SouthAfrica);
		CountryDTO countryDTO148 = new CountryDTO("SouthKorea", 51717590, "Yoon Suk-yeo", Country.SouthKorea);
		CountryDTO countryDTO149 = new CountryDTO("SouthSudan", 11943408, "Salva Kiir Mayardit", Country.SouthSudan);
		CountryDTO countryDTO150 = new CountryDTO("Spain", 47910526, "King – Felipe ", Country.Spain);
		CountryDTO countryDTO151 = new CountryDTO("SriLanka", 23103565, " Anura Kumara", Country.SriLanka);
		CountryDTO countryDTO152 = new CountryDTO("Sudan", 50448963, "Abdel Fattah al-Burhan", Country.Sudan);
		CountryDTO countryDTO153 = new CountryDTO("SvalbardandJanMayen", 2504, "", Country.SvalbardandJanMayen);
		CountryDTO countryDTO154 = new CountryDTO("SvalbardandJanMayen", 2504, "", Country.SvalbardandJanMayen);
		CountryDTO countryDTO155 = new CountryDTO("Swaziland", 1242822, "", Country.Swaziland);
		CountryDTO countryDTO156 = new CountryDTO("Sweden", 10606999, "King – Carl XVI Gustaf", Country.Sweden);
		CountryDTO countryDTO157 = new CountryDTO("Switzerland", 8921981, "Viola Amherd ", Country.Switzerland);
		CountryDTO countryDTO158 = new CountryDTO("Syria", 24672760, "Bashar al-Assad", Country.Syria);
		CountryDTO countryDTO159 = new CountryDTO("Taiwan", 23213962, "Lai Ching-te", Country.Taiwan);
		CountryDTO countryDTO160 = new CountryDTO("Tajikistan", 10641958, "Emomali Rahmon", Country.Tajikistan);
		CountryDTO countryDTO161 = new CountryDTO("Tanzania", 68560157, "Samia Suluhu Hassan", Country.Tanzania);
		CountryDTO countryDTO162 = new CountryDTO("Thailand", 71668011, "Maha Vajiralongkorn", Country.Thailand);
		CountryDTO countryDTO163 = new CountryDTO("Tonga", 104175, " Faure Gnassingbé", Country.Tonga);
		CountryDTO countryDTO164 = new CountryDTO("TrinidadandTobago", 1507782, "Christine Kangaloo",
				Country.TrinidadandTobago);
		CountryDTO countryDTO165 = new CountryDTO("Tunisia", 12277109, "Kaïs Saïed", Country.Tunisia);
		CountryDTO countryDTO166 = new CountryDTO("Turkey", 87473805, "Recep Tayyip Erdoğan", Country.Turkey);
		CountryDTO countryDTO167 = new CountryDTO("Turkmenistan", 7494498, "Gurbanguly Berdimuhamedow",
				Country.Turkmenistan);
		CountryDTO countryDTO168 = new CountryDTO("TurksandCaicosIslands", 568923, "", Country.TurksandCaicosIslands);
		CountryDTO countryDTO169 = new CountryDTO("Tuvalu", 9646, "	King – Charles ", Country.Tuvalu);
		CountryDTO countryDTO170 = new CountryDTO("Uganda", 50015092, " Yoweri Museveni", Country.Uganda);
		CountryDTO countryDTO171 = new CountryDTO("Uganda", 50015092, " Yoweri Museveni", Country.Uganda);
		CountryDTO countryDTO172 = new CountryDTO("Ukraine", 37860221, "Volodymyr Zelenskyy", Country.Ukraine);
		CountryDTO countryDTO173 = new CountryDTO("UnitedKingdom", 69138192, "King – Charles ", Country.UnitedKingdom);
		CountryDTO countryDTO174 = new CountryDTO("UnitedStates", 345426571, "Joe Biden", Country.UnitedStates);
		CountryDTO countryDTO175 = new CountryDTO("Uruguay", 3386588, "Luis Lacalle Pou", Country.Uruguay);
		CountryDTO countryDTO176 = new CountryDTO("Uzbekistan", 36361859, "Shavkat Mirziyoyev[", Country.Uzbekistan);
		CountryDTO countryDTO177 = new CountryDTO("Vanuatu", 327777, "Nikenike Vurobaravu", Country.Vanuatu);
		CountryDTO countryDTO178 = new CountryDTO("Vatican", 764, " Pope Francis", Country.Vatican);
		CountryDTO countryDTO179 = new CountryDTO("Venezuela", 28405543, " Nicolás Maduro", Country.Venezuela);
		CountryDTO countryDTO180 = new CountryDTO("Vietnam", 100987686, " Tô Lâm", Country.Vietnam);
		CountryDTO countryDTO181 = new CountryDTO("WallisandFutuna", 11255, "", Country.WallisandFutuna);
		CountryDTO countryDTO182 = new CountryDTO("Yemen", 40583164, "Rashad al-Alimi", Country.Yemen);
		CountryDTO countryDTO183 = new CountryDTO("Zambia", 21314956, "Hakainde Hichilema", Country.Zambia);
		CountryDTO countryDTO184 = new CountryDTO("Zimbabwe", 16634373, " Emmerson Mnangagwa", Country.Zimbabwe);
		CountryDTO countryDTO185 = new CountryDTO("Malaysia", 33964743, "Anwar Ibrahim", Country.Malaysia);
		CountryDTO countryDTO186 = new CountryDTO("Maldives", 522451, "Ibrahim Mohamed Solih", Country.Maldives);
		CountryDTO countryDTO187 = new CountryDTO("Mali", 22150000, "Assimi Goïta", Country.Mali);
		CountryDTO countryDTO188 = new CountryDTO("Malta", 514564, "George Vella", Country.Malta);
		CountryDTO countryDTO189 = new CountryDTO("Marshall Islands", 54000, "David Kabua", Country.MarshallIslands);
		CountryDTO countryDTO190 = new CountryDTO("Mauritania", 4649658, "Mohamed Ould Ghazouani", Country.Mauritania);
		CountryDTO countryDTO191 = new CountryDTO("Mauritius", 1265711, "Prithvirajsing Roopun", Country.Mauritius);
		CountryDTO countryDTO192 = new CountryDTO("Mayotte", 320090000, "abcd", Country.Mayotte);
		CountryDTO countryDTO193 = new CountryDTO("Mexico", 126705138, "Andrés Manuel López Obrador", Country.Mexico);
		CountryDTO countryDTO194 = new CountryDTO("Micronesia", 115021, "Wesley W. Simina", Country.Micronesia);
		CountryDTO countryDTO195 = new CountryDTO("Moldova", 2597100, "Maia Sandu", Country.Moldova);
		CountryDTO countryDTO196 = new CountryDTO("Monaco", 38682, "Albert II", Country.Monaco);

		Collection<CountryDTO> collection = new LinkedList<CountryDTO>();
		collection.add(countryDTO);
		collection.add(countryDTO1);
		collection.add(countryDTO2);
		collection.add(countryDTO3);
		collection.add(countryDTO4);
		collection.add(countryDTO5);
		collection.add(countryDTO6);
		collection.add(countryDTO7);
		collection.add(countryDTO8);
		collection.add(countryDTO9);
		collection.add(countryDTO10);
		collection.add(countryDTO11);
		collection.add(countryDTO12);
		collection.add(countryDTO13);
		collection.add(countryDTO14);
		collection.add(countryDTO15);
		collection.add(countryDTO16);
		collection.add(countryDTO17);
		collection.add(countryDTO18);
		collection.add(countryDTO19);
		collection.add(countryDTO20);
		collection.add(countryDTO21);
		collection.add(countryDTO22);
		collection.add(countryDTO23);
		collection.add(countryDTO25);
		collection.add(countryDTO26);
		collection.add(countryDTO27);
		collection.add(countryDTO28);
		collection.add(countryDTO29);
		collection.add(countryDTO30);
		collection.add(countryDTO31);
		collection.add(countryDTO32);
		collection.add(countryDTO33);
		collection.add(countryDTO34);
		collection.add(countryDTO35);
		collection.add(countryDTO36);
		collection.add(countryDTO37);
		collection.add(countryDTO38);
		collection.add(countryDTO39);
		collection.add(countryDTO40);
		collection.add(countryDTO41);
		collection.add(countryDTO42);
		collection.add(countryDTO43);
		collection.add(countryDTO44);
		collection.add(countryDTO45);
		collection.add(countryDTO46);
		collection.add(countryDTO47);
		collection.add(countryDTO48);
		collection.add(countryDTO49);
		collection.add(countryDTO50);
		collection.add(countryDTO50);
		collection.add(countryDTO59);
		collection.add(countryDTO60);
		collection.add(countryDTO61);
		collection.add(countryDTO62);
		collection.add(countryDTO63);
		collection.add(countryDTO64);
		collection.add(countryDTO65);
		collection.add(countryDTO66);
		collection.add(countryDTO67);
		collection.add(countryDTO68);
		collection.add(countryDTO69);
		collection.add(countryDTO70);
		collection.add(countryDTO71);
		collection.add(countryDTO72);
		collection.add(countryDTO73);
		collection.add(countryDTO74);
		collection.add(countryDTO75);
		collection.add(countryDTO76);
		collection.add(countryDTO77);
		collection.add(countryDTO78);
		collection.add(countryDTO79);
		collection.add(countryDTO80);
		collection.add(countryDTO81);
		collection.add(countryDTO82);
		collection.add(countryDTO83);
		collection.add(countryDTO84);
		collection.add(countryDTO85);
		collection.add(countryDTO86);
		collection.add(countryDTO87);
		collection.add(countryDTO88);
		collection.add(countryDTO89);
		collection.add(countryDTO90);
		collection.add(countryDTO91);
		collection.add(countryDTO92);
		collection.add(countryDTO93);
		collection.add(countryDTO94);
		collection.add(countryDTO95);
		collection.add(countryDTO96);
		collection.add(countryDTO97);
		collection.add(countryDTO98);
		collection.add(countryDTO99);
		collection.add(countryDTO100);
		collection.add(countryDTO101);
		collection.add(countryDTO102);
		collection.add(countryDTO103);
		collection.add(countryDTO104);
		collection.add(countryDTO105);
		collection.add(countryDTO106);
		collection.add(countryDTO107);
		collection.add(countryDTO108);
		collection.add(countryDTO109);
		collection.add(countryDTO110);
		collection.add(countryDTO111);
		collection.add(countryDTO112);
		collection.add(countryDTO113);
		collection.add(countryDTO114);
		collection.add(countryDTO115);
		collection.add(countryDTO116);
		collection.add(countryDTO117);
		collection.add(countryDTO118);
		collection.add(countryDTO119);
		collection.add(countryDTO120);
		collection.add(countryDTO121);
		collection.add(countryDTO122);
		collection.add(countryDTO123);
		collection.add(countryDTO125);
		collection.add(countryDTO126);
		collection.add(countryDTO127);
		collection.add(countryDTO128);
		collection.add(countryDTO129);
		collection.add(countryDTO130);
		collection.add(countryDTO131);
		collection.add(countryDTO132);
		collection.add(countryDTO133);
		collection.add(countryDTO134);
		collection.add(countryDTO135);
		collection.add(countryDTO136);
		collection.add(countryDTO137);
		collection.add(countryDTO138);
		collection.add(countryDTO139);
		collection.add(countryDTO140);
		collection.add(countryDTO141);
		collection.add(countryDTO142);
		collection.add(countryDTO143);
		collection.add(countryDTO144);
		collection.add(countryDTO145);
		collection.add(countryDTO146);
		collection.add(countryDTO147);
		collection.add(countryDTO148);
		collection.add(countryDTO149);
		collection.add(countryDTO150);
		collection.add(countryDTO151);
		collection.add(countryDTO152);
		collection.add(countryDTO153);
		collection.add(countryDTO154);
		collection.add(countryDTO155);
		collection.add(countryDTO156);
		collection.add(countryDTO157);
		collection.add(countryDTO158);
		collection.add(countryDTO159);
		collection.add(countryDTO160);
		collection.add(countryDTO161);
		collection.add(countryDTO162);
		collection.add(countryDTO163);
		collection.add(countryDTO164);
		collection.add(countryDTO165);
		collection.add(countryDTO166);
		collection.add(countryDTO167);
		collection.add(countryDTO168);
		collection.add(countryDTO169);
		collection.add(countryDTO170);
		collection.add(countryDTO181);
		collection.add(countryDTO182);
		collection.add(countryDTO183);
		collection.add(countryDTO184);
		collection.add(countryDTO185);
		collection.add(countryDTO186);
		collection.add(countryDTO187);
		collection.add(countryDTO188);
		collection.add(countryDTO189);
		collection.add(countryDTO190);
		collection.add(countryDTO191);
		collection.add(countryDTO192);
		collection.add(countryDTO193);
		collection.add(countryDTO194);
		collection.add(countryDTO195);
		collection.add(countryDTO196);

		System.out.println("Total Elements:" + collection.size());
		System.out.println("isEmpty:" + collection.isEmpty());
		System.out.println("After clear......");

		System.out.println("Total Elements:" + collection.size());
		System.out.println("isEmpty:" + collection.isEmpty());
		System.out.println("===============================================================");

		Iterator<CountryDTO> iterator = collection.iterator();

		while (iterator.hasNext()) {
			CountryDTO ref = iterator.next();
			System.out.println(ref);
		}
		System.out.println("===============================================================");

		System.out.println("country name where population is greater than 25 CR");

		for (CountryDTO country : collection) {

			if (country.getPopulation() > 250000000) { // Case-insensitive check
				System.out.println(country.getPopulation());
			}
		}
		System.out.println("========================");
		System.out.println("countries contains 'I' in the name");
		for (CountryDTO country : collection) {

			if (country.getName().contains("I")) { // Case-insensitive check
				System.out.println(country.getName());
			}
		}
		System.out.println("======================");

		System.out.println("the countries, where code is less than 50");
		for (CountryDTO country : collection) {

			if (country.getcode() < 50) {

				System.out.println(country.getName());

			}
		}
		System.out.println("===========================");
		System.out.println(" the countries where code is less than 50 and country name starts with 'A'");

		for (CountryDTO country : collection) {

			if (country.getcode() < 50 && country.getName().startsWith("A")) {
				System.out.println(country.getName());
			}
		}
		System.out.println("================================");
		System.out.println("all the presidentName by each country");
		for (CountryDTO country : collection) {
			System.out.println(country.getPresidentName());
			
			

		}
	}
}

