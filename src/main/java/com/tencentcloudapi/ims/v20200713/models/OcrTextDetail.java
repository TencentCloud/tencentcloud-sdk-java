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
package com.tencentcloudapi.ims.v20200713.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OcrTextDetail extends AbstractModel{

    /**
    * OCR文本内容
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 恶意标签，Normal：正常，Porn：色情，Abuse：谩骂，Ad：广告，Custom：自定义词库。
以及令人反感、不安全或不适宜的内容类型。
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * 仅当Label为Custom自定义关键词时有效，表示自定义库id
    */
    @SerializedName("LibId")
    @Expose
    private String LibId;

    /**
    * 仅当Label为Custom自定义关键词时有效，表示自定义库名称
    */
    @SerializedName("LibName")
    @Expose
    private String LibName;

    /**
    * 该标签下命中的关键词
    */
    @SerializedName("Keywords")
    @Expose
    private String [] Keywords;

    /**
    * 该标签模型命中的分值
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
    * OCR位置
    */
    @SerializedName("Location")
    @Expose
    private Location Location;

    /**
    * OCR文本识别置信度
    */
    @SerializedName("Rate")
    @Expose
    private Long Rate;

    /**
     * Get OCR文本内容 
     * @return Text OCR文本内容
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set OCR文本内容
     * @param Text OCR文本内容
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get 恶意标签，Normal：正常，Porn：色情，Abuse：谩骂，Ad：广告，Custom：自定义词库。
以及令人反感、不安全或不适宜的内容类型。 
     * @return Label 恶意标签，Normal：正常，Porn：色情，Abuse：谩骂，Ad：广告，Custom：自定义词库。
以及令人反感、不安全或不适宜的内容类型。
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set 恶意标签，Normal：正常，Porn：色情，Abuse：谩骂，Ad：广告，Custom：自定义词库。
以及令人反感、不安全或不适宜的内容类型。
     * @param Label 恶意标签，Normal：正常，Porn：色情，Abuse：谩骂，Ad：广告，Custom：自定义词库。
以及令人反感、不安全或不适宜的内容类型。
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get 仅当Label为Custom自定义关键词时有效，表示自定义库id 
     * @return LibId 仅当Label为Custom自定义关键词时有效，表示自定义库id
     */
    public String getLibId() {
        return this.LibId;
    }

    /**
     * Set 仅当Label为Custom自定义关键词时有效，表示自定义库id
     * @param LibId 仅当Label为Custom自定义关键词时有效，表示自定义库id
     */
    public void setLibId(String LibId) {
        this.LibId = LibId;
    }

    /**
     * Get 仅当Label为Custom自定义关键词时有效，表示自定义库名称 
     * @return LibName 仅当Label为Custom自定义关键词时有效，表示自定义库名称
     */
    public String getLibName() {
        return this.LibName;
    }

    /**
     * Set 仅当Label为Custom自定义关键词时有效，表示自定义库名称
     * @param LibName 仅当Label为Custom自定义关键词时有效，表示自定义库名称
     */
    public void setLibName(String LibName) {
        this.LibName = LibName;
    }

    /**
     * Get 该标签下命中的关键词 
     * @return Keywords 该标签下命中的关键词
     */
    public String [] getKeywords() {
        return this.Keywords;
    }

    /**
     * Set 该标签下命中的关键词
     * @param Keywords 该标签下命中的关键词
     */
    public void setKeywords(String [] Keywords) {
        this.Keywords = Keywords;
    }

    /**
     * Get 该标签模型命中的分值 
     * @return Score 该标签模型命中的分值
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set 该标签模型命中的分值
     * @param Score 该标签模型命中的分值
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    /**
     * Get OCR位置 
     * @return Location OCR位置
     */
    public Location getLocation() {
        return this.Location;
    }

    /**
     * Set OCR位置
     * @param Location OCR位置
     */
    public void setLocation(Location Location) {
        this.Location = Location;
    }

    /**
     * Get OCR文本识别置信度 
     * @return Rate OCR文本识别置信度
     */
    public Long getRate() {
        return this.Rate;
    }

    /**
     * Set OCR文本识别置信度
     * @param Rate OCR文本识别置信度
     */
    public void setRate(Long Rate) {
        this.Rate = Rate;
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

    }
}

