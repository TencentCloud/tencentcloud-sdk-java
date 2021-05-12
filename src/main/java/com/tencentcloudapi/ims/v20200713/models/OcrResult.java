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

public class OcrResult extends AbstractModel{

    /**
    * 场景识别结果
    */
    @SerializedName("Scene")
    @Expose
    private String Scene;

    /**
    * 建议您拿到判断结果后的执行操作。
建议值，Block：建议屏蔽，Review：建议复审，Pass：建议通过
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * 恶意标签，Normal：正常，Porn：色情，Abuse：谩骂，Ad：广告，Custom：自定义词库。
以及令人反感、不安全或不适宜的内容类型。
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * 子标签检测结果
    */
    @SerializedName("SubLabel")
    @Expose
    private String SubLabel;

    /**
    * 该标签模型命中的分值
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
    * ocr结果详情
    */
    @SerializedName("Details")
    @Expose
    private OcrTextDetail [] Details;

    /**
    * ocr识别出的文本结果
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
     * Get 场景识别结果 
     * @return Scene 场景识别结果
     */
    public String getScene() {
        return this.Scene;
    }

    /**
     * Set 场景识别结果
     * @param Scene 场景识别结果
     */
    public void setScene(String Scene) {
        this.Scene = Scene;
    }

    /**
     * Get 建议您拿到判断结果后的执行操作。
建议值，Block：建议屏蔽，Review：建议复审，Pass：建议通过 
     * @return Suggestion 建议您拿到判断结果后的执行操作。
建议值，Block：建议屏蔽，Review：建议复审，Pass：建议通过
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set 建议您拿到判断结果后的执行操作。
建议值，Block：建议屏蔽，Review：建议复审，Pass：建议通过
     * @param Suggestion 建议您拿到判断结果后的执行操作。
建议值，Block：建议屏蔽，Review：建议复审，Pass：建议通过
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
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
     * Get 子标签检测结果 
     * @return SubLabel 子标签检测结果
     */
    public String getSubLabel() {
        return this.SubLabel;
    }

    /**
     * Set 子标签检测结果
     * @param SubLabel 子标签检测结果
     */
    public void setSubLabel(String SubLabel) {
        this.SubLabel = SubLabel;
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
     * Get ocr结果详情 
     * @return Details ocr结果详情
     */
    public OcrTextDetail [] getDetails() {
        return this.Details;
    }

    /**
     * Set ocr结果详情
     * @param Details ocr结果详情
     */
    public void setDetails(OcrTextDetail [] Details) {
        this.Details = Details;
    }

    /**
     * Get ocr识别出的文本结果 
     * @return Text ocr识别出的文本结果
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set ocr识别出的文本结果
     * @param Text ocr识别出的文本结果
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    public OcrResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OcrResult(OcrResult source) {
        if (source.Scene != null) {
            this.Scene = new String(source.Scene);
        }
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.SubLabel != null) {
            this.SubLabel = new String(source.SubLabel);
        }
        if (source.Score != null) {
            this.Score = new Long(source.Score);
        }
        if (source.Details != null) {
            this.Details = new OcrTextDetail[source.Details.length];
            for (int i = 0; i < source.Details.length; i++) {
                this.Details[i] = new OcrTextDetail(source.Details[i]);
            }
        }
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Scene", this.Scene);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "SubLabel", this.SubLabel);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamArrayObj(map, prefix + "Details.", this.Details);
        this.setParamSimple(map, prefix + "Text", this.Text);

    }
}

