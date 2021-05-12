/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.bda.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SegmentationOptions extends AbstractModel{

    /**
    * 分割选项-背景
    */
    @SerializedName("Background")
    @Expose
    private Boolean Background;

    /**
    * 分割选项-头发
    */
    @SerializedName("Hair")
    @Expose
    private Boolean Hair;

    /**
    * 分割选项-左眉
    */
    @SerializedName("LeftEyebrow")
    @Expose
    private Boolean LeftEyebrow;

    /**
    * 分割选项-右眉
    */
    @SerializedName("RightEyebrow")
    @Expose
    private Boolean RightEyebrow;

    /**
    * 分割选项-左眼
    */
    @SerializedName("LeftEye")
    @Expose
    private Boolean LeftEye;

    /**
    * 分割选项-右眼
    */
    @SerializedName("RightEye")
    @Expose
    private Boolean RightEye;

    /**
    * 分割选项-鼻子
    */
    @SerializedName("Nose")
    @Expose
    private Boolean Nose;

    /**
    * 分割选项-上唇
    */
    @SerializedName("UpperLip")
    @Expose
    private Boolean UpperLip;

    /**
    * 分割选项-下唇
    */
    @SerializedName("LowerLip")
    @Expose
    private Boolean LowerLip;

    /**
    * 分割选项-牙齿
    */
    @SerializedName("Tooth")
    @Expose
    private Boolean Tooth;

    /**
    * 分割选项-口腔（不包含牙齿）
    */
    @SerializedName("Mouth")
    @Expose
    private Boolean Mouth;

    /**
    * 分割选项-左耳
    */
    @SerializedName("LeftEar")
    @Expose
    private Boolean LeftEar;

    /**
    * 分割选项-右耳
    */
    @SerializedName("RightEar")
    @Expose
    private Boolean RightEar;

    /**
    * 分割选项-面部(不包含眼、耳、口、鼻等五官及头发。)
    */
    @SerializedName("Face")
    @Expose
    private Boolean Face;

    /**
    * 复合分割选项-头部(包含所有的头部元素，相关装饰除外)
    */
    @SerializedName("Head")
    @Expose
    private Boolean Head;

    /**
    * 分割选项-身体（包含脖子）
    */
    @SerializedName("Body")
    @Expose
    private Boolean Body;

    /**
    * 分割选项-帽子
    */
    @SerializedName("Hat")
    @Expose
    private Boolean Hat;

    /**
    * 分割选项-头饰
    */
    @SerializedName("Headdress")
    @Expose
    private Boolean Headdress;

    /**
    * 分割选项-耳环
    */
    @SerializedName("Earrings")
    @Expose
    private Boolean Earrings;

    /**
    * 分割选项-项链
    */
    @SerializedName("Necklace")
    @Expose
    private Boolean Necklace;

    /**
    * 分割选项-随身物品（ 例如伞、包、手机等。 ）
    */
    @SerializedName("Belongings")
    @Expose
    private Boolean Belongings;

    /**
     * Get 分割选项-背景 
     * @return Background 分割选项-背景
     */
    public Boolean getBackground() {
        return this.Background;
    }

    /**
     * Set 分割选项-背景
     * @param Background 分割选项-背景
     */
    public void setBackground(Boolean Background) {
        this.Background = Background;
    }

    /**
     * Get 分割选项-头发 
     * @return Hair 分割选项-头发
     */
    public Boolean getHair() {
        return this.Hair;
    }

    /**
     * Set 分割选项-头发
     * @param Hair 分割选项-头发
     */
    public void setHair(Boolean Hair) {
        this.Hair = Hair;
    }

    /**
     * Get 分割选项-左眉 
     * @return LeftEyebrow 分割选项-左眉
     */
    public Boolean getLeftEyebrow() {
        return this.LeftEyebrow;
    }

    /**
     * Set 分割选项-左眉
     * @param LeftEyebrow 分割选项-左眉
     */
    public void setLeftEyebrow(Boolean LeftEyebrow) {
        this.LeftEyebrow = LeftEyebrow;
    }

    /**
     * Get 分割选项-右眉 
     * @return RightEyebrow 分割选项-右眉
     */
    public Boolean getRightEyebrow() {
        return this.RightEyebrow;
    }

    /**
     * Set 分割选项-右眉
     * @param RightEyebrow 分割选项-右眉
     */
    public void setRightEyebrow(Boolean RightEyebrow) {
        this.RightEyebrow = RightEyebrow;
    }

    /**
     * Get 分割选项-左眼 
     * @return LeftEye 分割选项-左眼
     */
    public Boolean getLeftEye() {
        return this.LeftEye;
    }

    /**
     * Set 分割选项-左眼
     * @param LeftEye 分割选项-左眼
     */
    public void setLeftEye(Boolean LeftEye) {
        this.LeftEye = LeftEye;
    }

    /**
     * Get 分割选项-右眼 
     * @return RightEye 分割选项-右眼
     */
    public Boolean getRightEye() {
        return this.RightEye;
    }

    /**
     * Set 分割选项-右眼
     * @param RightEye 分割选项-右眼
     */
    public void setRightEye(Boolean RightEye) {
        this.RightEye = RightEye;
    }

    /**
     * Get 分割选项-鼻子 
     * @return Nose 分割选项-鼻子
     */
    public Boolean getNose() {
        return this.Nose;
    }

    /**
     * Set 分割选项-鼻子
     * @param Nose 分割选项-鼻子
     */
    public void setNose(Boolean Nose) {
        this.Nose = Nose;
    }

    /**
     * Get 分割选项-上唇 
     * @return UpperLip 分割选项-上唇
     */
    public Boolean getUpperLip() {
        return this.UpperLip;
    }

    /**
     * Set 分割选项-上唇
     * @param UpperLip 分割选项-上唇
     */
    public void setUpperLip(Boolean UpperLip) {
        this.UpperLip = UpperLip;
    }

    /**
     * Get 分割选项-下唇 
     * @return LowerLip 分割选项-下唇
     */
    public Boolean getLowerLip() {
        return this.LowerLip;
    }

    /**
     * Set 分割选项-下唇
     * @param LowerLip 分割选项-下唇
     */
    public void setLowerLip(Boolean LowerLip) {
        this.LowerLip = LowerLip;
    }

    /**
     * Get 分割选项-牙齿 
     * @return Tooth 分割选项-牙齿
     */
    public Boolean getTooth() {
        return this.Tooth;
    }

    /**
     * Set 分割选项-牙齿
     * @param Tooth 分割选项-牙齿
     */
    public void setTooth(Boolean Tooth) {
        this.Tooth = Tooth;
    }

    /**
     * Get 分割选项-口腔（不包含牙齿） 
     * @return Mouth 分割选项-口腔（不包含牙齿）
     */
    public Boolean getMouth() {
        return this.Mouth;
    }

    /**
     * Set 分割选项-口腔（不包含牙齿）
     * @param Mouth 分割选项-口腔（不包含牙齿）
     */
    public void setMouth(Boolean Mouth) {
        this.Mouth = Mouth;
    }

    /**
     * Get 分割选项-左耳 
     * @return LeftEar 分割选项-左耳
     */
    public Boolean getLeftEar() {
        return this.LeftEar;
    }

    /**
     * Set 分割选项-左耳
     * @param LeftEar 分割选项-左耳
     */
    public void setLeftEar(Boolean LeftEar) {
        this.LeftEar = LeftEar;
    }

    /**
     * Get 分割选项-右耳 
     * @return RightEar 分割选项-右耳
     */
    public Boolean getRightEar() {
        return this.RightEar;
    }

    /**
     * Set 分割选项-右耳
     * @param RightEar 分割选项-右耳
     */
    public void setRightEar(Boolean RightEar) {
        this.RightEar = RightEar;
    }

    /**
     * Get 分割选项-面部(不包含眼、耳、口、鼻等五官及头发。) 
     * @return Face 分割选项-面部(不包含眼、耳、口、鼻等五官及头发。)
     */
    public Boolean getFace() {
        return this.Face;
    }

    /**
     * Set 分割选项-面部(不包含眼、耳、口、鼻等五官及头发。)
     * @param Face 分割选项-面部(不包含眼、耳、口、鼻等五官及头发。)
     */
    public void setFace(Boolean Face) {
        this.Face = Face;
    }

    /**
     * Get 复合分割选项-头部(包含所有的头部元素，相关装饰除外) 
     * @return Head 复合分割选项-头部(包含所有的头部元素，相关装饰除外)
     */
    public Boolean getHead() {
        return this.Head;
    }

    /**
     * Set 复合分割选项-头部(包含所有的头部元素，相关装饰除外)
     * @param Head 复合分割选项-头部(包含所有的头部元素，相关装饰除外)
     */
    public void setHead(Boolean Head) {
        this.Head = Head;
    }

    /**
     * Get 分割选项-身体（包含脖子） 
     * @return Body 分割选项-身体（包含脖子）
     */
    public Boolean getBody() {
        return this.Body;
    }

    /**
     * Set 分割选项-身体（包含脖子）
     * @param Body 分割选项-身体（包含脖子）
     */
    public void setBody(Boolean Body) {
        this.Body = Body;
    }

    /**
     * Get 分割选项-帽子 
     * @return Hat 分割选项-帽子
     */
    public Boolean getHat() {
        return this.Hat;
    }

    /**
     * Set 分割选项-帽子
     * @param Hat 分割选项-帽子
     */
    public void setHat(Boolean Hat) {
        this.Hat = Hat;
    }

    /**
     * Get 分割选项-头饰 
     * @return Headdress 分割选项-头饰
     */
    public Boolean getHeaddress() {
        return this.Headdress;
    }

    /**
     * Set 分割选项-头饰
     * @param Headdress 分割选项-头饰
     */
    public void setHeaddress(Boolean Headdress) {
        this.Headdress = Headdress;
    }

    /**
     * Get 分割选项-耳环 
     * @return Earrings 分割选项-耳环
     */
    public Boolean getEarrings() {
        return this.Earrings;
    }

    /**
     * Set 分割选项-耳环
     * @param Earrings 分割选项-耳环
     */
    public void setEarrings(Boolean Earrings) {
        this.Earrings = Earrings;
    }

    /**
     * Get 分割选项-项链 
     * @return Necklace 分割选项-项链
     */
    public Boolean getNecklace() {
        return this.Necklace;
    }

    /**
     * Set 分割选项-项链
     * @param Necklace 分割选项-项链
     */
    public void setNecklace(Boolean Necklace) {
        this.Necklace = Necklace;
    }

    /**
     * Get 分割选项-随身物品（ 例如伞、包、手机等。 ） 
     * @return Belongings 分割选项-随身物品（ 例如伞、包、手机等。 ）
     */
    public Boolean getBelongings() {
        return this.Belongings;
    }

    /**
     * Set 分割选项-随身物品（ 例如伞、包、手机等。 ）
     * @param Belongings 分割选项-随身物品（ 例如伞、包、手机等。 ）
     */
    public void setBelongings(Boolean Belongings) {
        this.Belongings = Belongings;
    }

    public SegmentationOptions() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SegmentationOptions(SegmentationOptions source) {
        if (source.Background != null) {
            this.Background = new Boolean(source.Background);
        }
        if (source.Hair != null) {
            this.Hair = new Boolean(source.Hair);
        }
        if (source.LeftEyebrow != null) {
            this.LeftEyebrow = new Boolean(source.LeftEyebrow);
        }
        if (source.RightEyebrow != null) {
            this.RightEyebrow = new Boolean(source.RightEyebrow);
        }
        if (source.LeftEye != null) {
            this.LeftEye = new Boolean(source.LeftEye);
        }
        if (source.RightEye != null) {
            this.RightEye = new Boolean(source.RightEye);
        }
        if (source.Nose != null) {
            this.Nose = new Boolean(source.Nose);
        }
        if (source.UpperLip != null) {
            this.UpperLip = new Boolean(source.UpperLip);
        }
        if (source.LowerLip != null) {
            this.LowerLip = new Boolean(source.LowerLip);
        }
        if (source.Tooth != null) {
            this.Tooth = new Boolean(source.Tooth);
        }
        if (source.Mouth != null) {
            this.Mouth = new Boolean(source.Mouth);
        }
        if (source.LeftEar != null) {
            this.LeftEar = new Boolean(source.LeftEar);
        }
        if (source.RightEar != null) {
            this.RightEar = new Boolean(source.RightEar);
        }
        if (source.Face != null) {
            this.Face = new Boolean(source.Face);
        }
        if (source.Head != null) {
            this.Head = new Boolean(source.Head);
        }
        if (source.Body != null) {
            this.Body = new Boolean(source.Body);
        }
        if (source.Hat != null) {
            this.Hat = new Boolean(source.Hat);
        }
        if (source.Headdress != null) {
            this.Headdress = new Boolean(source.Headdress);
        }
        if (source.Earrings != null) {
            this.Earrings = new Boolean(source.Earrings);
        }
        if (source.Necklace != null) {
            this.Necklace = new Boolean(source.Necklace);
        }
        if (source.Belongings != null) {
            this.Belongings = new Boolean(source.Belongings);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Background", this.Background);
        this.setParamSimple(map, prefix + "Hair", this.Hair);
        this.setParamSimple(map, prefix + "LeftEyebrow", this.LeftEyebrow);
        this.setParamSimple(map, prefix + "RightEyebrow", this.RightEyebrow);
        this.setParamSimple(map, prefix + "LeftEye", this.LeftEye);
        this.setParamSimple(map, prefix + "RightEye", this.RightEye);
        this.setParamSimple(map, prefix + "Nose", this.Nose);
        this.setParamSimple(map, prefix + "UpperLip", this.UpperLip);
        this.setParamSimple(map, prefix + "LowerLip", this.LowerLip);
        this.setParamSimple(map, prefix + "Tooth", this.Tooth);
        this.setParamSimple(map, prefix + "Mouth", this.Mouth);
        this.setParamSimple(map, prefix + "LeftEar", this.LeftEar);
        this.setParamSimple(map, prefix + "RightEar", this.RightEar);
        this.setParamSimple(map, prefix + "Face", this.Face);
        this.setParamSimple(map, prefix + "Head", this.Head);
        this.setParamSimple(map, prefix + "Body", this.Body);
        this.setParamSimple(map, prefix + "Hat", this.Hat);
        this.setParamSimple(map, prefix + "Headdress", this.Headdress);
        this.setParamSimple(map, prefix + "Earrings", this.Earrings);
        this.setParamSimple(map, prefix + "Necklace", this.Necklace);
        this.setParamSimple(map, prefix + "Belongings", this.Belongings);

    }
}

