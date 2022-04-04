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
package com.tencentcloudapi.ams.v20201229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TextResult extends AbstractModel{

    /**
    * 恶意标签，Normal：正常，Porn：色情，Abuse：谩骂，Ad：广告，Custom：自定义词库。
以及其他令人反感、不安全或不适宜的内容类型。

如音频中无复杂类型「TextResults」的返回则代表改音频中无相关违规内容；
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * 命中的关键词，为空则代表该违规内容出自于模型的判断；
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Keywords")
    @Expose
    private String [] Keywords;

    /**
    * 命中关键词库的库标识；
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LibId")
    @Expose
    private String LibId;

    /**
    * 命中关键词库的名字；
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LibName")
    @Expose
    private String LibName;

    /**
    * 机器判断当前分类的置信度，取值范围：0~100。分数越高，表示越有可能属于当前分类。
（如：Porn 99，则该样本属于色情的置信度非常高。）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
    * 建议您拿到判断结果后的执行操作。
建议值，Block：建议屏蔽，Review：建议复审，Pass：建议通过
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * 自定义词库的类型，自定义词库相关的信息可登录控制台中查看；

1：自定义黑白库；

2：自定义库；
    */
    @SerializedName("LibType")
    @Expose
    private Long LibType;

    /**
    * 该字段用于返回当前标签（Lable）下的二级标签。
注意：此字段可能返回null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubLabel")
    @Expose
    private String SubLabel;

    /**
     * Get 恶意标签，Normal：正常，Porn：色情，Abuse：谩骂，Ad：广告，Custom：自定义词库。
以及其他令人反感、不安全或不适宜的内容类型。

如音频中无复杂类型「TextResults」的返回则代表改音频中无相关违规内容；
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Label 恶意标签，Normal：正常，Porn：色情，Abuse：谩骂，Ad：广告，Custom：自定义词库。
以及其他令人反感、不安全或不适宜的内容类型。

如音频中无复杂类型「TextResults」的返回则代表改音频中无相关违规内容；
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set 恶意标签，Normal：正常，Porn：色情，Abuse：谩骂，Ad：广告，Custom：自定义词库。
以及其他令人反感、不安全或不适宜的内容类型。

如音频中无复杂类型「TextResults」的返回则代表改音频中无相关违规内容；
注意：此字段可能返回 null，表示取不到有效值。
     * @param Label 恶意标签，Normal：正常，Porn：色情，Abuse：谩骂，Ad：广告，Custom：自定义词库。
以及其他令人反感、不安全或不适宜的内容类型。

如音频中无复杂类型「TextResults」的返回则代表改音频中无相关违规内容；
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get 命中的关键词，为空则代表该违规内容出自于模型的判断；
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Keywords 命中的关键词，为空则代表该违规内容出自于模型的判断；
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getKeywords() {
        return this.Keywords;
    }

    /**
     * Set 命中的关键词，为空则代表该违规内容出自于模型的判断；
注意：此字段可能返回 null，表示取不到有效值。
     * @param Keywords 命中的关键词，为空则代表该违规内容出自于模型的判断；
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKeywords(String [] Keywords) {
        this.Keywords = Keywords;
    }

    /**
     * Get 命中关键词库的库标识；
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LibId 命中关键词库的库标识；
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLibId() {
        return this.LibId;
    }

    /**
     * Set 命中关键词库的库标识；
注意：此字段可能返回 null，表示取不到有效值。
     * @param LibId 命中关键词库的库标识；
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLibId(String LibId) {
        this.LibId = LibId;
    }

    /**
     * Get 命中关键词库的名字；
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LibName 命中关键词库的名字；
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLibName() {
        return this.LibName;
    }

    /**
     * Set 命中关键词库的名字；
注意：此字段可能返回 null，表示取不到有效值。
     * @param LibName 命中关键词库的名字；
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLibName(String LibName) {
        this.LibName = LibName;
    }

    /**
     * Get 机器判断当前分类的置信度，取值范围：0~100。分数越高，表示越有可能属于当前分类。
（如：Porn 99，则该样本属于色情的置信度非常高。）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Score 机器判断当前分类的置信度，取值范围：0~100。分数越高，表示越有可能属于当前分类。
（如：Porn 99，则该样本属于色情的置信度非常高。）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set 机器判断当前分类的置信度，取值范围：0~100。分数越高，表示越有可能属于当前分类。
（如：Porn 99，则该样本属于色情的置信度非常高。）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Score 机器判断当前分类的置信度，取值范围：0~100。分数越高，表示越有可能属于当前分类。
（如：Porn 99，则该样本属于色情的置信度非常高。）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    /**
     * Get 建议您拿到判断结果后的执行操作。
建议值，Block：建议屏蔽，Review：建议复审，Pass：建议通过
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Suggestion 建议您拿到判断结果后的执行操作。
建议值，Block：建议屏蔽，Review：建议复审，Pass：建议通过
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set 建议您拿到判断结果后的执行操作。
建议值，Block：建议屏蔽，Review：建议复审，Pass：建议通过
注意：此字段可能返回 null，表示取不到有效值。
     * @param Suggestion 建议您拿到判断结果后的执行操作。
建议值，Block：建议屏蔽，Review：建议复审，Pass：建议通过
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get 自定义词库的类型，自定义词库相关的信息可登录控制台中查看；

1：自定义黑白库；

2：自定义库； 
     * @return LibType 自定义词库的类型，自定义词库相关的信息可登录控制台中查看；

1：自定义黑白库；

2：自定义库；
     */
    public Long getLibType() {
        return this.LibType;
    }

    /**
     * Set 自定义词库的类型，自定义词库相关的信息可登录控制台中查看；

1：自定义黑白库；

2：自定义库；
     * @param LibType 自定义词库的类型，自定义词库相关的信息可登录控制台中查看；

1：自定义黑白库；

2：自定义库；
     */
    public void setLibType(Long LibType) {
        this.LibType = LibType;
    }

    /**
     * Get 该字段用于返回当前标签（Lable）下的二级标签。
注意：此字段可能返回null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubLabel 该字段用于返回当前标签（Lable）下的二级标签。
注意：此字段可能返回null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubLabel() {
        return this.SubLabel;
    }

    /**
     * Set 该字段用于返回当前标签（Lable）下的二级标签。
注意：此字段可能返回null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubLabel 该字段用于返回当前标签（Lable）下的二级标签。
注意：此字段可能返回null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubLabel(String SubLabel) {
        this.SubLabel = SubLabel;
    }

    public TextResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TextResult(TextResult source) {
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.Keywords != null) {
            this.Keywords = new String[source.Keywords.length];
            for (int i = 0; i < source.Keywords.length; i++) {
                this.Keywords[i] = new String(source.Keywords[i]);
            }
        }
        if (source.LibId != null) {
            this.LibId = new String(source.LibId);
        }
        if (source.LibName != null) {
            this.LibName = new String(source.LibName);
        }
        if (source.Score != null) {
            this.Score = new Long(source.Score);
        }
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
        }
        if (source.LibType != null) {
            this.LibType = new Long(source.LibType);
        }
        if (source.SubLabel != null) {
            this.SubLabel = new String(source.SubLabel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamArraySimple(map, prefix + "Keywords.", this.Keywords);
        this.setParamSimple(map, prefix + "LibId", this.LibId);
        this.setParamSimple(map, prefix + "LibName", this.LibName);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "LibType", this.LibType);
        this.setParamSimple(map, prefix + "SubLabel", this.SubLabel);

    }
}

