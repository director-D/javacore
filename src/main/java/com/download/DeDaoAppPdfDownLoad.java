package com.download;


import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

/**
 * @Author: vincent
 * @License: (C) Copyright 2005-2200, vincent Corporation Limited.
 * @Contact: lookvincent@163.com
 * @Date: 2022/11/12 19:38
 * @Version: 1.0
 * @Description:
 */
public class DeDaoAppPdfDownLoad {

    public static void main(String[] args) throws IOException {
        String s = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>\n<svg xmlns:svg=\"http://www.w3.org/2000/svg\" xmlns=\"http://www.w3.org/2000/svg\" version=\"1.0\" width=\"826\" height=\"905\">\n<style>\n@font-face { font-family: \"FZFangSong-Z02\";\nsrc:local(\"FZFangSong-Z02\"),\nurl(\"https://imgcdn.umiwi.com/ttf/fangzhengfangsong_gbk.ttf\"); }\n@font-face { font-family: \"FZKai-Z03\";\nsrc:local(\"FZKai-Z03\"),\nurl(\"https://imgcdn.umiwi.com/ttf/fangzhengkaiti_gbk.ttf\"); }\n@font-face { font-family: \"PingFang SC\";\nsrc:local(\"PingFang SC\"); }\n@font-face { font-family: \"Source Code Pro\";\nsrc:local(\"Source Code Pro\"),\nurl(\"https://imgcdn.umiwi.com/ttf/0315911806889993935644188722660020367983.ttf\"); }\n</style>\n<image x=\"31.000000\" y=\"61.000000\" width=\"764.000000\" height=\"658.000000\" offset=\"5816\" href=\"https://staticcdn1-5.umiwi.com/epms_ebook/93390d756bf3fe0abe863ab141d27a22.jpg\" />\n<text x=\"40.000000\" y=\"757.000000\" width=\"20.000000\" top=\"740.000000\" height=\"22.000000\" style=\"font-size:20px;font-weight: bold;font-family:'FZFangSong-Z02';\" offset=\"5874\" len=\"3\">图</text>\n<text x=\"60.000000\" y=\"757.000000\" width=\"8.984375\" top=\"740.000000\" height=\"22.000000\" style=\"font-size:20px;font-weight: bold;font-family:'FZFangSong-Z02';\" offset=\"5877\" len=\"1\"> </text>\n<text x=\"68.984375\" y=\"757.000000\" width=\"9.609375\" top=\"740.000000\" height=\"22.000000\" style=\"font-size:20px;font-weight: bold;font-family:'FZFangSong-Z02';\" offset=\"5878\" len=\"1\">1</text>\n<text x=\"78.593750\" y=\"757.000000\" width=\"12.890625\" top=\"740.000000\" height=\"22.000000\" style=\"font-size:20px;font-weight: bold;font-family:'FZFangSong-Z02';\" offset=\"5879\" len=\"1\">-</text>\n<text x=\"91.484375\" y=\"757.000000\" width=\"9.609375\" top=\"740.000000\" height=\"22.000000\" style=\"font-size:20px;font-weight: bold;font-family:'FZFangSong-Z02';\" offset=\"5880\" len=\"1\">1</text>\n<text x=\"101.093750\" y=\"757.000000\" width=\"10.078125\" top=\"740.000000\" height=\"22.000000\" style=\"font-size:20px;font-weight: bold;font-family:'FZFangSong-Z02';\" offset=\"5881\" len=\"1\">3</text>\n<text x=\"111.171875\" y=\"757.000000\" width=\"20.000000\" top=\"740.000000\" height=\"22.000000\" style=\"font-size:20px;font-weight: bold;font-family:'FZFangSong-Z02';\" offset=\"5882\" len=\"3\">　</text>\n<text x=\"131.171875\" y=\"757.000000\" width=\"20.000000\" top=\"740.000000\" height=\"22.000000\" style=\"font-size:20px;font-weight: bold;font-family:'FZFangSong-Z02';\" offset=\"5885\" len=\"3\">客</text>\n<text x=\"151.171875\" y=\"757.000000\" width=\"20.000000\" top=\"740.000000\" height=\"22.000000\" style=\"font-size:20px;font-weight: bold;font-family:'FZFangSong-Z02';\" offset=\"5888\" len=\"3\">户</text>\n<text x=\"171.171875\" y=\"757.000000\" width=\"20.000000\" top=\"740.000000\" height=\"22.000000\" style=\"font-size:20px;font-weight: bold;font-family:'FZFangSong-Z02';\" offset=\"5891\" len=\"3\">端</text>\n<text x=\"191.171875\" y=\"757.000000\" width=\"20.000000\" top=\"740.000000\" height=\"22.000000\" style=\"font-size:20px;font-weight: bold;font-family:'FZFangSong-Z02';\" offset=\"5894\" len=\"3\">通</text>\n<text x=\"211.171875\" y=\"757.000000\" width=\"20.000000\" top=\"740.000000\" height=\"22.000000\" style=\"font-size:20px;font-weight: bold;font-family:'FZFangSong-Z02';\" offset=\"5897\" len=\"3\">过</text>\n<text x=\"231.171875\" y=\"757.000000\" width=\"20.000000\" top=\"740.000000\" height=\"22.000000\" style=\"font-size:20px;font-weight: bold;font-family:'FZFangSong-Z02';\" offset=\"5900\" len=\"3\">发</text>\n<text x=\"251.171875\" y=\"757.000000\" width=\"20.000000\" top=\"740.000000\" height=\"22.000000\" style=\"font-size:20px;font-weight: bold;font-family:'FZFangSong-Z02';\" offset=\"5903\" len=\"3\">送</text>\n<text x=\"271.171875\" y=\"757.000000\" width=\"8.984375\" top=\"740.000000\" height=\"22.000000\" style=\"font-size:20px;font-weight: bold;font-family:'FZFangSong-Z02';\" offset=\"5906\" len=\"1\"> </text>\n<text x=\"280.156250\" y=\"757.000000\" width=\"10.468750\" top=\"740.000000\" height=\"22.000000\" style=\"font-size:20px;font-weight: bold;font-family:'FZFangSong-Z02';\" offset=\"5907\" len=\"1\">H</text>\n<text x=\"290.625000\" y=\"757.000000\" width=\"10.468750\" top=\"740.000000\" height=\"22.000000\" style=\"font-size:20px;font-weight: bold;font-family:'FZFangSong-Z02';\" offset=\"5908\" len=\"1\">T</text>\n<text x=\"301.093750\" y=\"757.000000\" width=\"10.468750\" top=\"740.000000\" height=\"22.000000\" style=\"font-size:20px;font-weight: bold;font-family:'FZFangSong-Z02';\" offset=\"5909\" len=\"1\">T</text>\n<text x=\"311.562500\" y=\"757.000000\" width=\"9.609375\" top=\"740.000000\" height=\"22.000000\" style=\"font-size:20px;font-weight: bold;font-family:'FZFangSong-Z02';\" offset=\"5910\" len=\"1\">P</text>\n<text x=\"321.171875\" y=\"757.000000\" width=\"8.984375\" top=\"740.000000\" height=\"22.000000\" style=\"font-size:20px;font-weight: bold;font-family:'FZFangSong-Z02';\" offset=\"5911\" len=\"1\"> </text>\n<text x=\"330.156250\" y=\"757.000000\" width=\"20.000000\" top=\"740.000000\" height=\"22.000000\" style=\"font-size:20px;font-weight: bold;font-family:'FZFangSong-Z02';\" offset=\"5912\" len=\"3\">请</text>\n<text x=\"350.156250\" y=\"757.000000\" width=\"20.000000\" top=\"740.000000\" height=\"22.000000\" style=\"font-size:20px;font-weight: bold;font-family:'FZFangSong-Z02';\" offset=\"5915\" len=\"3\">求</text>\n<text x=\"370.156250\" y=\"757.000000\" width=\"20.000000\" top=\"740.000000\" height=\"22.000000\" style=\"font-size:20px;font-weight: bold;font-family:'FZFangSong-Z02';\" offset=\"5918\" len=\"3\">缓</text>\n<text x=\"390.156250\" y=\"757.000000\" width=\"20.000000\" top=\"740.000000\" height=\"22.000000\" style=\"font-size:20px;font-weight: bold;font-family:'FZFangSong-Z02';\" offset=\"5921\" len=\"3\">存</text>\n<text x=\"410.156250\" y=\"757.000000\" width=\"20.000000\" top=\"740.000000\" height=\"22.000000\" style=\"font-size:20px;font-weight: bold;font-family:'FZFangSong-Z02';\" offset=\"5924\" len=\"3\">数</text>\n<text x=\"430.156250\" y=\"757.000000\" width=\"20.000000\" top=\"740.000000\" height=\"22.000000\" style=\"font-size:20px;font-weight: bold;font-family:'FZFangSong-Z02';\" offset=\"5927\" len=\"3\" newline=\"true\">据</text>\n<text x=\"70.000000\" y=\"814.000000\" width=\"20.019993\" top=\"793.000000\" height=\"28.000000\" style=\"font-size:20px;font-family:'PingFang SC';\" offset=\"5968\" len=\"3\">一</text>\n<text x=\"90.019989\" y=\"814.000000\" width=\"20.019993\" top=\"793.000000\" height=\"28.000000\" style=\"font-size:20px;font-family:'PingFang SC';\" offset=\"5971\" len=\"3\">般</text>\n<text x=\"110.039978\" y=\"814.000000\" width=\"20.019993\" top=\"793.000000\" height=\"28.000000\" style=\"font-size:20px;font-family:'PingFang SC';\" offset=\"5974\" len=\"3\">信</text>\n<text x=\"130.059967\" y=\"814.000000\" width=\"20.019993\" top=\"793.000000\" height=\"28.000000\" style=\"font-size:20px;font-family:'PingFang SC';\" offset=\"5977\" len=\"3\">息</text>\n<text x=\"150.079956\" y=\"814.000000\" width=\"20.019993\" top=\"793.000000\" height=\"28.000000\" style=\"font-size:20px;font-family:'PingFang SC';\" offset=\"5980\" len=\"3\">的</text>\n<text x=\"170.099945\" y=\"814.000000\" width=\"20.019993\" top=\"793.000000\" height=\"28.000000\" style=\"font-size:20px;font-family:'PingFang SC';\" offset=\"5983\" len=\"3\">传</text>\n<text x=\"190.119934\" y=\"814.000000\" width=\"20.019993\" top=\"793.000000\" height=\"28.000000\" style=\"font-size:20px;font-family:'PingFang SC';\" offset=\"5986\" len=\"3\">递</text>\n<text x=\"210.139923\" y=\"814.000000\" width=\"20.019993\" top=\"793.000000\" height=\"28.000000\" style=\"font-size:20px;font-family:'PingFang SC';\" offset=\"5989\" len=\"3\">通</text>\n<text x=\"230.159912\" y=\"814.000000\" width=\"20.019993\" top=\"793.000000\" height=\"28.000000\" style=\"font-size:20px;font-family:'PingFang SC';\" offset=\"5992\" len=\"3\">过</text>\n<text x=\"250.179901\" y=\"814.000000\" width=\"6.679997\" top=\"793.000000\" height=\"28.000000\" style=\"font-size:20px;font-family:'PingFang SC';\" offset=\"5995\" len=\"1\"> </text>\n<text x=\"256.859894\" y=\"814.000000\" width=\"14.399994\" top=\"793.000000\" height=\"28.000000\" style=\"font-size:20px;font-family:'PingFang SC';\" offset=\"5996\" len=\"1\">H</text>\n<text x=\"271.259888\" y=\"814.000000\" width=\"12.379990\" top=\"793.000000\" height=\"28.000000\" style=\"font-size:20px;font-family:'PingFang SC';\" offset=\"5997\" len=\"1\">T</text>\n<text x=\"283.639893\" y=\"814.000000\" width=\"12.379990\" top=\"793.000000\" height=\"28.000000\" style=\"font-size:20px;font-family:'PingFang SC';\" offset=\"5998\" len=\"1\">T</text>\n<text x=\"296.019897\" y=\"814.000000\" width=\"12.839981\" top=\"793.000000\" height=\"28.000000\" style=\"font-size:20px;font-family:'PingFang SC';\" offset=\"5999\" len=\"1\">P</text>\n<text x=\"308.859863\" y=\"814.000000\" width=\"6.679997\" top=\"793.000000\" height=\"28.000000\" style=\"font-size:20px;font-family:'PingFang SC';\" offset=\"6000\" len=\"1\"> </text>\n<text x=\"315.539856\" y=\"814.000000\" width=\"20.019993\" top=\"793.000000\" height=\"28.000000\" style=\"font-size:20px;font-family:'PingFang SC';\" offset=\"6001\" len=\"3\">请</text>\n<text x=\"335.559845\" y=\"814.000000\" width=\"20.019993\" top=\"793.000000\" height=\"28.000000\" style=\"font-size:20px;font-family:'PingFang SC';\" offset=\"6004\" len=\"3\">求</text>\n<text x=\"355.579834\" y=\"814.000000\" width=\"20.019993\" top=\"793.000000\" height=\"28.000000\" style=\"font-size:20px;font-family:'PingFang SC';\" offset=\"6007\" len=\"3\">头</text>\n<text x=\"375.599823\" y=\"814.000000\" width=\"20.019993\" top=\"793.000000\" height=\"28.000000\" style=\"font-size:20px;font-family:'PingFang SC';\" offset=\"6010\" len=\"3\">来</text>\n<text x=\"395.619812\" y=\"814.000000\" width=\"20.019993\" top=\"793.000000\" height=\"28.000000\" style=\"font-size:20px;font-family:'PingFang SC';\" offset=\"6013\" len=\"3\">完</text>\n<text x=\"415.639801\" y=\"814.000000\" width=\"20.019993\" top=\"793.000000\" height=\"28.000000\" style=\"font-size:20px;font-family:'PingFang SC';\" offset=\"6016\" len=\"3\">成</text>\n<text x=\"435.659790\" y=\"814.000000\" width=\"20.019993\" top=\"793.000000\" height=\"28.000000\" style=\"font-size:20px;font-family:'PingFang SC';\" offset=\"6019\" len=\"3\">。</text>\n<text x=\"455.679779\" y=\"814.000000\" width=\"20.019993\" top=\"793.000000\" height=\"28.000000\" style=\"font-size:20px;font-family:'PingFang SC';\" offset=\"6022\" len=\"3\">目</text>\n<text x=\"475.699768\" y=\"814.000000\" width=\"20.019993\" top=\"793.000000\" height=\"28.000000\" style=\"font-size:20px;font-family:'PingFang SC';\" offset=\"6025\" len=\"3\">前</text>\n<text x=\"495.719757\" y=\"814.000000\" width=\"20.019993\" top=\"793.000000\" height=\"28.000000\" style=\"font-size:20px;font-family:'PingFang SC';\" offset=\"6028\" len=\"3\">比</text>\n<text x=\"515.739746\" y=\"814.000000\" width=\"20.019993\" top=\"793.000000\" height=\"28.000000\" style=\"font-size:20px;font-family:'PingFang SC';\" offset=\"6031\" len=\"3\">较</text>\n<text x=\"535.759766\" y=\"814.000000\" width=\"20.019993\" top=\"793.000000\" height=\"28.000000\" style=\"font-size:20px;font-family:'PingFang SC';\" offset=\"6034\" len=\"3\">常</text>\n<text x=\"555.779785\" y=\"814.000000\" width=\"20.019993\" top=\"793.000000\" height=\"28.000000\" style=\"font-size:20px;font-family:'PingFang SC';\" offset=\"6037\" len=\"3\">见</text>\n<text x=\"575.799805\" y=\"814.000000\" width=\"20.019993\" top=\"793.000000\" height=\"28.000000\" style=\"font-size:20px;font-family:'PingFang SC';\" offset=\"6040\" len=\"3\">的</text>\n<text x=\"595.819824\" y=\"814.000000\" width=\"20.019993\" top=\"793.000000\" height=\"28.000000\" style=\"font-size:20px;font-family:'PingFang SC';\" offset=\"6043\" len=\"3\">缓</text>\n<text x=\"615.839844\" y=\"814.000000\" width=\"20.019993\" top=\"793.000000\" height=\"28.000000\" style=\"font-size:20px;font-family:'PingFang SC';\" offset=\"6046\" len=\"3\">存</text>\n<text x=\"635.859863\" y=\"814.000000\" width=\"20.019993\" top=\"793.000000\" height=\"28.000000\" style=\"font-size:20px;font-family:'PingFang SC';\" offset=\"6049\" len=\"3\">方</text>\n<text x=\"655.879883\" y=\"814.000000\" width=\"20.019993\" top=\"793.000000\" height=\"28.000000\" style=\"font-size:20px;font-family:'PingFang SC';\" offset=\"6052\" len=\"3\">式</text>\n<text x=\"675.899902\" y=\"814.000000\" width=\"20.019993\" top=\"793.000000\" height=\"28.000000\" style=\"font-size:20px;font-family:'PingFang SC';\" offset=\"6055\" len=\"3\">有</text>\n<text x=\"695.919922\" y=\"814.000000\" width=\"20.019993\" top=\"793.000000\" height=\"28.000000\" style=\"font-size:20px;font-family:'PingFang SC';\" offset=\"6058\" len=\"3\">两</text>\n<text x=\"715.939941\" y=\"814.000000\" width=\"20.019993\" top=\"793.000000\" height=\"28.000000\" style=\"font-size:20px;font-family:'PingFang SC';\" offset=\"6061\" len=\"3\">种</text>\n<text x=\"735.959961\" y=\"814.000000\" width=\"20.019993\" top=\"793.000000\" height=\"28.000000\" style=\"font-size:20px;font-family:'PingFang SC';\" offset=\"6064\" len=\"3\">，</text>\n<text x=\"755.979980\" y=\"814.000000\" width=\"20.019993\" top=\"793.000000\" height=\"28.000000\" style=\"font-size:20px;font-family:'PingFang SC';\" offset=\"6067\" len=\"3\">分</text>\n<text x=\"776.000000\" y=\"814.000000\" width=\"19.999985\" top=\"793.000000\" height=\"28.000000\" style=\"font-size:20px;font-family:'PingFang SC';\" offset=\"6070\" len=\"3\">别</text>\n\n</svg>";
        Files.write(new File("pdftext.svg").toPath(),s.getBytes(StandardCharsets.UTF_8));

//        System.out.println(s);
    }


    public static void doDownload(){

    }


}