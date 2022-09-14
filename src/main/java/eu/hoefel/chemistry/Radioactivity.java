package eu.hoefel.chemistry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

public class Radioactivity {

    /**
     * List adopted from https://periodictable.com/Properties/A/StableIsotopes.html
     * and fixed/modified
     */
    private static final List<String> stableIsotopes = List.of(
            "1H", "2H",
            "3He", "4He",
            "6Li", "7Li",
            "9Be",
            "10B", "11B",
            "12C", "13C",
            "14N", "15N",
            "16O", "17O", "18O",
            "19F",
            "20Ne", "21Ne", "22Ne",
            "23Na",
            "24Mg", "25Mg", "26Mg",
            "27Al",
            "28Si", "29Si", "30Si",
            "31P",
            "32S", "33S", "34S", "36S",
            "35Cl", "37Cl",
            "36Ar", "38Ar", "40Ar",
            "39K", "41K",
            "40Ca", "42Ca", "43Ca", "44Ca", "46Ca",
            "45Sc",
            "46Ti", "47Ti", "48Ti", "49Ti", "50Ti",
            "51V",
            "50Cr", "52Cr", "53Cr", "54Cr",
            "55Mn",
            "54Fe", "56Fe", "57Fe", "58Fe",
            "59Co",
            "58Ni", "60Ni", "61Ni", "62Ni", "64Ni",
            "63Cu", "65Cu",
            "64Zn", "66Zn", "67Zn", "68Zn", "70Zn",
            "69Ga", "71Ga",
            "70Ge", "72Ge", "73Ge", "74Ge",
            "75As",
            "74Se", "76Se", "77Se", "78Se", "80Se",
            "79Br", "81Br",
            "78Kr", "80Kr", "82Kr", "83Kr", "84Kr", "86Kr",
            "85Rb",
            "84Sr", "86Sr", "87Sr", "88Sr",
            "89Y",
            "90Zr", "91Zr", "92Zr", "94Zr",
            "93Nb",
            "92Mo", "94Mo", "95Mo", "96Mo", "97Mo", "98Mo",
            "100Ru", "101Ru", "102Ru", "104Ru", "96Ru", "98Ru", "99Ru",
            "103Rh",
            "102Pd", "104Pd", "105Pd", "106Pd", "108Pd", "110Pd",
            "107Ag", "109Ag",
            "106Cd", "108Cd", "110Cd", "111Cd", "112Cd", "114Cd",
            "113In",
            "112Sn", "114Sn", "115Sn", "116Sn", "117Sn", "118Sn", "119Sn", "120Sn", "122Sn", "124Sn",
            "121Sb", "123Sb",
            "120Te", "122Te", "124Te", "125Te", "126Te",
            "127I",
            "124Xe", "126Xe", "128Xe", "129Xe", "130Xe", "131Xe", "132Xe", "134Xe", "136Xe",
            "133Cs",
            "130Ba", "132Ba", "134Ba", "135Ba", "136Ba", "137Ba", "138Ba",
            "139La",
            "136Ce", "138Ce", "140Ce", "142Ce",
            "141Pr",
            "142Nd", "143Nd", "145Nd", "146Nd", "148Nd",
            "144Sm", "149Sm", "150Sm", "152Sm", "154Sm",
            "151Eu", "153Eu",
            "154Gd", "155Gd", "156Gd", "157Gd", "158Gd", "160Gd",
            "159Tb",
            "156Dy", "158Dy", "160Dy", "161Dy", "162Dy", "163Dy", "164Dy",
            "165Ho",
            "162Er", "164Er", "166Er", "167Er", "168Er", "170Er",
            "169Tm",
            "168Yb", "170Yb", "171Yb", "172Yb", "173Yb", "174Yb", "176Yb",
            "175Lu",
            "176Hf", "177Hf", "178Hf", "179Hf", "180Hf",
            "181Ta",
            "180W", "182W", "183W", "184W", "186W",
            "185Re",
            "184Os", "187Os", "188Os", "189Os", "190Os", "192Os",
            "191Ir", "193Ir",
            "192Pt", "194Pt", "195Pt", "196Pt", "198Pt",
            "197Au",
            "196Hg", "198Hg", "199Hg", "200Hg", "201Hg", "202Hg", "204Hg",
            "203Tl", "205Tl",
            "204Pb", "206Pb", "207Pb", "208Pb");

    private String name;

    private String symbol;

    private String fullquery;

    /**
     *
     * Gets properties and queries API for this nuclide
     *
     * @param nuclide       input nuclide
     */
    public Radioactivity(Nuclide nuclide){
        this.name = nuclide.element().name();
        this.symbol = (int) Math.round(nuclide.mass()) + name;
        if (isRadioactive())
            fullquery = getFullquery("fields=ground_states&nuclides=" + symbol);
        else
            fullquery = "";
    }

    /**
     *
     * Gets properties and queries API for this isotope
     *
     * @param isotope       input isotope
     */
    public Radioactivity(Isotope isotope){
        this.name = isotope.element().name();
        this.symbol = (int) Math.round(isotope.mass()) + name;
        if (isRadioactive())
            fullquery = getFullquery("fields=ground_states&nuclides=" + symbol);
        else
            fullquery = "";
    }

    /**
     *
     * Gets properties and queries API for this element
     * First checks any stable isotopes and uses that if found
     *
     * @param element       input element
     */
    public Radioactivity(Element element){
        this.name = element.name();
        for (String isotope : stableIsotopes){
            if (isotope.contains(name)) {
                symbol = isotope;
                break;
            }
            if (isotope.equals("208Pb")){
                symbol = (int) Math.round(element.mass()) + name;
            }
        }
        if (isRadioactive())
            fullquery = getFullquery("fields=ground_states&nuclides=" + symbol);
        else
            fullquery = "";
    }

    /**
     *
     * Gets properties and queries API for this isotope
     *
     * @param symbol        input isotope in format Atomic Mass + (short) name
     *                      for example 1H or 56Fe
     */
    public Radioactivity(String symbol){
        this.symbol = symbol;
        try {
            Integer.parseInt(symbol.substring(symbol.length()-2));
            name = symbol.substring(symbol.length()-1).toLowerCase();
        } catch (NumberFormatException e){
            String letters = symbol.substring(symbol.length()-2, symbol.length()-1);
            name = letters.substring(0, 1).toUpperCase() + letters.substring(1);
        }
        if (isRadioactive())
            fullquery = getFullquery("fields=ground_states&nuclides=" + symbol);
        else
            fullquery = "";
    }

    /**
     * @return         returns true if element/isotope is radioactive
     */
    public Boolean isRadioactive(){
        return !stableIsotopes.contains(symbol);
    }

    /**
     * @return halflife in seconds with decimals or 0.0 if element is stable
     */
    public Double halflifeSeconds(){
        if (!isRadioactive())
            return 0.0;
        return Double.parseDouble(fetch(17));
    }

    /**
     * @return halflife in regular units, e.g. years, months, seconds, nanoseconds etc. or "stable" if element is stable
     */
    public String halflifeRegular(){
        if (!isRadioactive())
            return "stable";
        return fetch(13) + fetch(16);
    }

    /**
     *
     * Taken from https://www-nds.iaea.org/relnsd/vcharthtml/api_v0_guide.html
     *
     * @param id        input number of field you want returned
     * @return          returns value of field or empty string
     */
    private String fetch(Integer id){
        if (fullquery.equals(""))
            return "";
        var queries = fullquery.split("Extraction_date")[1].split(",");
        String returnval = queries[id-1];
        if (returnval.equals("STABLE"))
            return "";
        return returnval;
    }

    private String getFullquery(String query){
        try {
            URL murl = new URL("https://www-nds.iaea.org/relnsd/v0/data?&" + query);
            URLConnection conn = murl.openConnection();
            conn.setRequestProperty("User-Agent", "Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:77.0) Gecko/20100101 Firefox/77.0");

            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));

            String inputLine;
            StringBuffer sb = new StringBuffer();
            while ((inputLine = br.readLine()) != null) {
                sb.append(inputLine);
            }
            br.close();
            String sbstring = sb.toString();

            if (List.of("0","1","2","3","4","5","6").contains(sbstring))
                return "";

            return sbstring;
        } catch (IOException e){
            return "";
        }
    }
}
