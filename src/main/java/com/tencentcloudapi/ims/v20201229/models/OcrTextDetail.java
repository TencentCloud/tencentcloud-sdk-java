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
package com.tencentcloudapi.ims.v20201229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OcrTextDetail extends AbstractModel{

    /**
    * 该字段用于返回OCR识别出的文本内容。<br>备注：OCR文本识别上限在**5000字节内**。
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 该字段用于返回检测结果所对应的恶意标签。<br>返回值：**Normal**：正常，**Porn**：色情，**Abuse**：谩骂，**Ad**：广告，**Custom**：自定义违规；以及其他令人反感、不安全或不适宜的内容类型。
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * 该字段**仅当Label为Custom自定义关键词时有效**，用于返回自定义库的ID，以方便自定义库管理和配置。
    */
    @SerializedName("LibId")
    @Expose
    private String LibId;

    /**
    * 该字段**仅当Label为Custom自定义关键词时有效**，用于返回自定义库的名称，以方便自定义库管理和配置。
    */
    @SerializedName("LibName")
    @Expose
    private String LibName;

    /**
    * 该参数用于返回在当前label下命中的关键词。
    */
    @SerializedName("Keywords")
    @Expose
    private String [] Keywords;

    /**
    * 该参数用于返回在当前恶意标签下模型命中的分值，取值为**0-100**；分数越高，代表当前场景越符合该恶意标签所对应的场景。
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
    * 该参数用于返回OCR检测框在图片中的位置（左上角xy坐标、长宽、旋转角度），以方便快速定位识别文字的相关信息。
    */
    @SerializedName("Location")
    @Expose
    private Location Location;

    /**
    * 该参数用于返回OCR文本识别结果的置信度，取值在**0**（**置信度最低**）-**100**（**置信度最高**），越高代表对应图像越有可能是识别出的文字；如：*你好 99*，则表明OCR识别框内的文字大概率是”你好“。
    */
    @SerializedName("Rate")
    @Expose
    private Long Rate;

    /**
    * 该字段用于返回检测结果所对应的恶意二级标签。
    */
    @SerializedName("SubLabel")
    @Expose
    private String SubLabel;

    /**
     * Get 该字段用于返回OCR识别出的文本内容。<br>备注：OCR文本识别上限在**5000字节内**。 
     * @return Text 该字段用于返回OCR识别出的文本内容。<br>备注：OCR文本识别上限在**5000字节内**。
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 该字段用于返回OCR识别出的文本内容。<br>备注：OCR文本识别上限在**5000字节内**。
     * @param Text 该字段用于返回OCR识别出的文本内容。<br>备注：OCR文本识别上限在**5000字节内**。
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get 该字段用于返回检测结果所对应的恶意标签。<br>返回值：**Normal**：正常，**Porn**：色情，**Abuse**：谩骂，**Ad**：广告，**Custom**：自定义违规；以及其他令人反感、不安全或不适宜的内容类型。 
     * @return Label 该字段用于返回检测结果所对应的恶意标签。<br>返回值：**Normal**：正常，**Porn**：色情，**Abuse**：谩骂，**Ad**：广告，**Custom**：自定义违规；以及其他令人反感、不安全或不适宜的内容类型。
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set 该字段用于返回检测结果所对应的恶意标签。<br>返回值：**Normal**：正常，**Porn**：色情，**Abuse**：谩骂，**Ad**：广告，**Custom**：自定义违规；以及其他令人反感、不安全或不适宜的内容类型。
     * @param Label 该字段用于返回检测结果所对应的恶意标签。<br>返回值：**Normal**：正常，**Porn**：色情，**Abuse**：谩骂，**Ad**：广告，**Custom**：自定义违规；以及其他令人反感、不安全或不适宜的内容类型。
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get 该字段**仅当Label为Custom自定义关键词时有效**，用于返回自定义库的ID，以方便自定义库管理和配置。 
     * @return LibId 该字段**仅当Label为Custom自定义关键词时有效**，用于返回自定义库的ID，以方便自定义库管理和配置。
     */
    public String getLibId() {
        return this.LibId;
    }

    /**
     * Set 该字段**仅当Label为Custom自定义关键词时有效**，用于返回自定义库的ID，以方便自定义库管理和配置。
     * @param LibId 该字段**仅当Label为Custom自定义关键词时有效**，用于返回自定义库的ID，以方便自定义库管理和配置。
     */
    public void setLibId(String LibId) {
        this.LibId = LibId;
    }

    /**
     * Get 该字段**仅当Label为Custom自定义关键词时有效**，用于返回自定义库的名称，以方便自定义库管理和配置。 
     * @return LibName 该字段**仅当Label为Custom自定义关键词时有效**，用于返回自定义库的名称，以方便自定义库管理和配置。
     */
    public String getLibName() {
        return this.LibName;
    }

    /**
     * Set 该字段**仅当Label为Custom自定义关键词时有效**，用于返回自定义库的名称，以方便自定义库管理和配置。
     * @param LibName 该字段**仅当Label为Custom自定义关键词时有效**，用于返回自定义库的名称，以方便自定义库管理和配置。
     */
    public void setLibName(String LibName) {
        this.LibName = LibName;
    }

    /**
     * Get 该参数用于返回在当前label下命中的关键词。 
     * @return Keywords 该参数用于返回在当前label下命中的关键词。
     */
    public String [] getKeywords() {
        return this.Keywords;
    }

    /**
     * Set 该参数用于返回在当前label下命中的关键词。
     * @param Keywords 该参数用于返回在当前label下命中的关键词。
     */
    public void setKeywords(String [] Keywords) {
        this.Keywords = Keywords;
    }

    /**
     * Get 该参数用于返回在当前恶意标签下模型命中的分值，取值为**0-100**；分数越高，代表当前场景越符合该恶意标签所对应的场景。 
     * @return Score 该参数用于返回在当前恶意标签下模型命中的分值，取值为**0-100**；分数越高，代表当前场景越符合该恶意标签所对应的场景。
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set 该参数用于返回在当前恶意标签下模型命中的分值，取值为**0-100**；分数越高，代表当前场景越符合该恶意标签所对应的场景。
     * @param Score 该参数用于返回在当前恶意标签下模型命中的分值，取值为**0-100**；分数越高，代表当前场景越符合该恶意标签所对应的场景。
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    /**
     * Get 该参数用于返回OCR检测框在图片中的位置（左上角xy坐标、长宽、旋转角度），以方便快速定位识别文字的相关信息。 
     * @return Location 该参数用于返回OCR检测框在图片中的位置（左上角xy坐标、长宽、旋转角度），以方便快速定位识别文字的相关信息。
     */
    public Location getLocation() {
        return this.Location;
    }

    /**
     * Set 该参数用于返回OCR检测框在图片中的位置（左上角xy坐标、长宽、旋转角度），以方便快速定位识别文字的相关信息。
     * @param Location 该参数用于返回OCR检测框在图片中的位置（左上角xy坐标、长宽、旋转角度），以方便快速定位识别文字的相关信息。
     */
    public void setLocation(Location Location) {
        this.Location = Location;
    }

    /**
     * Get 该参数用于返回OCR文本识别结果的置信度，取值在**0**（**置信度最低**）-**100**（**置信度最高**），越高代表对应图像越有可能是识别出的文字；如：*你好 99*，则表明OCR识别框内的文字大概率是”你好“。 
     * @return Rate 该参数用于返回OCR文本识别结果的置信度，取值在**0**（**置信度最低**）-**100**（**置信度最高**），越高代表对应图像越有可能是识别出的文字；如：*你好 99*，则表明OCR识别框内的文字大概率是”你好“。
     */
    public Long getRate() {
        return this.Rate;
    }

    /**
     * Set 该参数用于返回OCR文本识别结果的置信度，取值在**0**（**置信度最低**）-**100**（**置信度最高**），越高代表对应图像越有可能是识别出的文字；如：*你好 99*，则表明OCR识别框内的文字大概率是”你好“。
     * @param Rate 该参数用于返回OCR文本识别结果的置信度，取值在**0**（**置信度最低**）-**100**（**置信度最高**），越高代表对应图像越有可能是识别出的文字；如：*你好 99*，则表明OCR识别框内的文字大概率是”你好“。
     */
    public void setRate(Long Rate) {
        this.Rate = Rate;
    }

    /**
     * Get 该字段用于返回检测结果所对应的恶意二级标签。 
     * @return SubLabel 该字段用于返回检测结果所对应的恶意二级标签。
     */
    public String getSubLabel() {
        return this.SubLabel;
    }

    /**
     * Set 该字段用于返回检测结果所对应的恶意二级标签。
     * @param SubLabel 该字段用于返回检测结果所对应的恶意二级标签。
     */
    public void setSubLabel(String SubLabel) {
        this.SubLabel = SubLabel;
    }

    public OcrTextDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OcrTextDetail(OcrTextDetail source) {
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.LibId != null) {
            this.LibId = new String(source.LibId);
        }
        if (source.LibName != null) {
            this.LibName = new String(source.LibName);
        }
        if (source.Keywords != null) {
            this.Keywords = new String[source.Keywords.length];
            for (int i = 0; i < source.Keywords.length; i++) {
                this.Keywords[i] = new String(source.Keywords[i]);
            }
        }
        if (source.Score != null) {
            this.Score = new Long(source.Score);
        }
        if (source.Location != null) {
            this.Location = new Location(source.Location);
        }
        if (source.Rate != null) {
            this.Rate = new Long(source.Rate);
        }
        if (source.SubLabel != null) {
            this.SubLabel = new String(source.SubLabel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "LibId", this.LibId);
        this.setParamSimple(map, prefix + "LibName", this.LibName);
        this.setParamArraySimple(map, prefix + "Keywords.", this.Keywords);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamObj(map, prefix + "Location.", this.Location);
        this.setParamSimple(map, prefix + "Rate", this.Rate);
        this.setParamSimple(map, prefix + "SubLabel", this.SubLabel);

    }
}

