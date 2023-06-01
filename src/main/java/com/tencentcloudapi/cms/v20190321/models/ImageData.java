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
package com.tencentcloudapi.cms.v20190321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageData extends AbstractModel{

    /**
    * 恶意类型
100：正常 
20001：政治
20002：色情 
20006：涉毒违法
20007：谩骂 
20103：性感
24001：暴恐
    */
    @SerializedName("EvilType")
    @Expose
    private Long EvilType;

    /**
    * 图片性感详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HotDetect")
    @Expose
    private ImageHotDetect HotDetect;

    /**
    * 是否恶意 0：正常 1：可疑
    */
    @SerializedName("EvilFlag")
    @Expose
    private Long EvilFlag;

    /**
    * 图片二维码详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CodeDetect")
    @Expose
    private CodeDetect CodeDetect;

    /**
    * 图片涉政详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PolityDetect")
    @Expose
    private ImagePolityDetect PolityDetect;

    /**
    * 图片违法详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IllegalDetect")
    @Expose
    private ImageIllegalDetect IllegalDetect;

    /**
    * 图片涉黄详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PornDetect")
    @Expose
    private ImagePornDetect PornDetect;

    /**
    * 图片暴恐详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TerrorDetect")
    @Expose
    private ImageTerrorDetect TerrorDetect;

    /**
    * 图片OCR详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OCRDetect")
    @Expose
    private OCRDetect OCRDetect;

    /**
    * logo详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogoDetect")
    @Expose
    private LogoDetail LogoDetect;

    /**
    * 图片相似度详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Similar")
    @Expose
    private Similar Similar;

    /**
    * 手机检测详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PhoneDetect")
    @Expose
    private PhoneDetect PhoneDetect;

    /**
     * Get 恶意类型
100：正常 
20001：政治
20002：色情 
20006：涉毒违法
20007：谩骂 
20103：性感
24001：暴恐 
     * @return EvilType 恶意类型
100：正常 
20001：政治
20002：色情 
20006：涉毒违法
20007：谩骂 
20103：性感
24001：暴恐
     */
    public Long getEvilType() {
        return this.EvilType;
    }

    /**
     * Set 恶意类型
100：正常 
20001：政治
20002：色情 
20006：涉毒违法
20007：谩骂 
20103：性感
24001：暴恐
     * @param EvilType 恶意类型
100：正常 
20001：政治
20002：色情 
20006：涉毒违法
20007：谩骂 
20103：性感
24001：暴恐
     */
    public void setEvilType(Long EvilType) {
        this.EvilType = EvilType;
    }

    /**
     * Get 图片性感详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HotDetect 图片性感详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ImageHotDetect getHotDetect() {
        return this.HotDetect;
    }

    /**
     * Set 图片性感详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param HotDetect 图片性感详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHotDetect(ImageHotDetect HotDetect) {
        this.HotDetect = HotDetect;
    }

    /**
     * Get 是否恶意 0：正常 1：可疑 
     * @return EvilFlag 是否恶意 0：正常 1：可疑
     */
    public Long getEvilFlag() {
        return this.EvilFlag;
    }

    /**
     * Set 是否恶意 0：正常 1：可疑
     * @param EvilFlag 是否恶意 0：正常 1：可疑
     */
    public void setEvilFlag(Long EvilFlag) {
        this.EvilFlag = EvilFlag;
    }

    /**
     * Get 图片二维码详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CodeDetect 图片二维码详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CodeDetect getCodeDetect() {
        return this.CodeDetect;
    }

    /**
     * Set 图片二维码详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param CodeDetect 图片二维码详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCodeDetect(CodeDetect CodeDetect) {
        this.CodeDetect = CodeDetect;
    }

    /**
     * Get 图片涉政详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PolityDetect 图片涉政详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ImagePolityDetect getPolityDetect() {
        return this.PolityDetect;
    }

    /**
     * Set 图片涉政详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param PolityDetect 图片涉政详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPolityDetect(ImagePolityDetect PolityDetect) {
        this.PolityDetect = PolityDetect;
    }

    /**
     * Get 图片违法详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IllegalDetect 图片违法详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ImageIllegalDetect getIllegalDetect() {
        return this.IllegalDetect;
    }

    /**
     * Set 图片违法详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param IllegalDetect 图片违法详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIllegalDetect(ImageIllegalDetect IllegalDetect) {
        this.IllegalDetect = IllegalDetect;
    }

    /**
     * Get 图片涉黄详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PornDetect 图片涉黄详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ImagePornDetect getPornDetect() {
        return this.PornDetect;
    }

    /**
     * Set 图片涉黄详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param PornDetect 图片涉黄详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPornDetect(ImagePornDetect PornDetect) {
        this.PornDetect = PornDetect;
    }

    /**
     * Get 图片暴恐详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TerrorDetect 图片暴恐详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ImageTerrorDetect getTerrorDetect() {
        return this.TerrorDetect;
    }

    /**
     * Set 图片暴恐详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param TerrorDetect 图片暴恐详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTerrorDetect(ImageTerrorDetect TerrorDetect) {
        this.TerrorDetect = TerrorDetect;
    }

    /**
     * Get 图片OCR详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OCRDetect 图片OCR详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OCRDetect getOCRDetect() {
        return this.OCRDetect;
    }

    /**
     * Set 图片OCR详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param OCRDetect 图片OCR详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOCRDetect(OCRDetect OCRDetect) {
        this.OCRDetect = OCRDetect;
    }

    /**
     * Get logo详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogoDetect logo详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LogoDetail getLogoDetect() {
        return this.LogoDetect;
    }

    /**
     * Set logo详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogoDetect logo详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogoDetect(LogoDetail LogoDetect) {
        this.LogoDetect = LogoDetect;
    }

    /**
     * Get 图片相似度详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Similar 图片相似度详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Similar getSimilar() {
        return this.Similar;
    }

    /**
     * Set 图片相似度详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param Similar 图片相似度详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSimilar(Similar Similar) {
        this.Similar = Similar;
    }

    /**
     * Get 手机检测详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PhoneDetect 手机检测详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PhoneDetect getPhoneDetect() {
        return this.PhoneDetect;
    }

    /**
     * Set 手机检测详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param PhoneDetect 手机检测详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPhoneDetect(PhoneDetect PhoneDetect) {
        this.PhoneDetect = PhoneDetect;
    }

    public ImageData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageData(ImageData source) {
        if (source.EvilType != null) {
            this.EvilType = new Long(source.EvilType);
        }
        if (source.HotDetect != null) {
            this.HotDetect = new ImageHotDetect(source.HotDetect);
        }
        if (source.EvilFlag != null) {
            this.EvilFlag = new Long(source.EvilFlag);
        }
        if (source.CodeDetect != null) {
            this.CodeDetect = new CodeDetect(source.CodeDetect);
        }
        if (source.PolityDetect != null) {
            this.PolityDetect = new ImagePolityDetect(source.PolityDetect);
        }
        if (source.IllegalDetect != null) {
            this.IllegalDetect = new ImageIllegalDetect(source.IllegalDetect);
        }
        if (source.PornDetect != null) {
            this.PornDetect = new ImagePornDetect(source.PornDetect);
        }
        if (source.TerrorDetect != null) {
            this.TerrorDetect = new ImageTerrorDetect(source.TerrorDetect);
        }
        if (source.OCRDetect != null) {
            this.OCRDetect = new OCRDetect(source.OCRDetect);
        }
        if (source.LogoDetect != null) {
            this.LogoDetect = new LogoDetail(source.LogoDetect);
        }
        if (source.Similar != null) {
            this.Similar = new Similar(source.Similar);
        }
        if (source.PhoneDetect != null) {
            this.PhoneDetect = new PhoneDetect(source.PhoneDetect);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EvilType", this.EvilType);
        this.setParamObj(map, prefix + "HotDetect.", this.HotDetect);
        this.setParamSimple(map, prefix + "EvilFlag", this.EvilFlag);
        this.setParamObj(map, prefix + "CodeDetect.", this.CodeDetect);
        this.setParamObj(map, prefix + "PolityDetect.", this.PolityDetect);
        this.setParamObj(map, prefix + "IllegalDetect.", this.IllegalDetect);
        this.setParamObj(map, prefix + "PornDetect.", this.PornDetect);
        this.setParamObj(map, prefix + "TerrorDetect.", this.TerrorDetect);
        this.setParamObj(map, prefix + "OCRDetect.", this.OCRDetect);
        this.setParamObj(map, prefix + "LogoDetect.", this.LogoDetect);
        this.setParamObj(map, prefix + "Similar.", this.Similar);
        this.setParamObj(map, prefix + "PhoneDetect.", this.PhoneDetect);

    }
}

