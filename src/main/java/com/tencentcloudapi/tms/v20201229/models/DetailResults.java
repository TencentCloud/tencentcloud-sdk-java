/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.tms.v20201229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DetailResults extends AbstractModel {

    /**
    * <p>该字段用于返回检测结果所对应的全部恶意标签。<br>返回值：<strong>Normal</strong>：正常，<strong>Porn</strong>：色情，<strong>Abuse</strong>：谩骂，<strong>Ad</strong>：广告；以及其他令人反感、不安全或不适宜的内容类型。</p>
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * <p>该字段用于返回对应当前标签的后续操作建议。当您获取到判定结果后，返回值表示系统推荐的后续操作；建议您按照业务所需，对不同违规类型与建议值进行处理。<br>返回值：<strong>Block</strong>：建议屏蔽，<strong>Review</strong> ：建议人工复审，<strong>Pass</strong>：建议通过</p>
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * <p>该字段用于返回检测文本命中的关键词信息，用于标注文本违规的具体原因（如：<em>加我微信</em>）。该参数可能会有多个返回值，代表命中的多个关键词；如返回值为空且Score不为空，则代表识别结果所对应的恶意标签（Label）是来自于语义模型判断的返回值。</p>
    */
    @SerializedName("Keywords")
    @Expose
    private String [] Keywords;

    /**
    * <p>该字段用于返回当前标签（Label）下的置信度，取值范围：0（<strong>置信度最低</strong>）-100（<strong>置信度最高</strong> ），越高代表文本越有可能属于当前返回的标签；如：<em>色情 99</em>，则表明该文本非常有可能属于色情内容；<em>色情 0</em>，则表明该文本不属于色情内容。</p>
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
    * <p>该字段用于返回自定义关键词对应的词库类型，取值为<strong>1</strong>（黑白库）和<strong>2</strong>（自定义关键词库），若未配置自定义关键词库,则默认值为1（黑白库匹配）。</p>
    */
    @SerializedName("LibType")
    @Expose
    private Long LibType;

    /**
    * <p>该字段用于返回自定义库的ID，以方便自定义库管理和配置。</p>
    */
    @SerializedName("LibId")
    @Expose
    private String LibId;

    /**
    * <p>该字段用于返回自定义库的名称,以方便自定义库管理和配置。</p>
    */
    @SerializedName("LibName")
    @Expose
    private String LibName;

    /**
    * <p>该字段用于返回当前标签（Label）下的二级标签。</p>
    */
    @SerializedName("SubLabel")
    @Expose
    private String SubLabel;

    /**
    * <p>该字段用于返回当前一级标签（Label）下的关键词、子标签及分数。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>该字段用于返回违规文本命中信息</p>
    */
    @SerializedName("HitInfos")
    @Expose
    private HitInfo [] HitInfos;

    /**
     * Get <p>该字段用于返回检测结果所对应的全部恶意标签。<br>返回值：<strong>Normal</strong>：正常，<strong>Porn</strong>：色情，<strong>Abuse</strong>：谩骂，<strong>Ad</strong>：广告；以及其他令人反感、不安全或不适宜的内容类型。</p> 
     * @return Label <p>该字段用于返回检测结果所对应的全部恶意标签。<br>返回值：<strong>Normal</strong>：正常，<strong>Porn</strong>：色情，<strong>Abuse</strong>：谩骂，<strong>Ad</strong>：广告；以及其他令人反感、不安全或不适宜的内容类型。</p>
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set <p>该字段用于返回检测结果所对应的全部恶意标签。<br>返回值：<strong>Normal</strong>：正常，<strong>Porn</strong>：色情，<strong>Abuse</strong>：谩骂，<strong>Ad</strong>：广告；以及其他令人反感、不安全或不适宜的内容类型。</p>
     * @param Label <p>该字段用于返回检测结果所对应的全部恶意标签。<br>返回值：<strong>Normal</strong>：正常，<strong>Porn</strong>：色情，<strong>Abuse</strong>：谩骂，<strong>Ad</strong>：广告；以及其他令人反感、不安全或不适宜的内容类型。</p>
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get <p>该字段用于返回对应当前标签的后续操作建议。当您获取到判定结果后，返回值表示系统推荐的后续操作；建议您按照业务所需，对不同违规类型与建议值进行处理。<br>返回值：<strong>Block</strong>：建议屏蔽，<strong>Review</strong> ：建议人工复审，<strong>Pass</strong>：建议通过</p> 
     * @return Suggestion <p>该字段用于返回对应当前标签的后续操作建议。当您获取到判定结果后，返回值表示系统推荐的后续操作；建议您按照业务所需，对不同违规类型与建议值进行处理。<br>返回值：<strong>Block</strong>：建议屏蔽，<strong>Review</strong> ：建议人工复审，<strong>Pass</strong>：建议通过</p>
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set <p>该字段用于返回对应当前标签的后续操作建议。当您获取到判定结果后，返回值表示系统推荐的后续操作；建议您按照业务所需，对不同违规类型与建议值进行处理。<br>返回值：<strong>Block</strong>：建议屏蔽，<strong>Review</strong> ：建议人工复审，<strong>Pass</strong>：建议通过</p>
     * @param Suggestion <p>该字段用于返回对应当前标签的后续操作建议。当您获取到判定结果后，返回值表示系统推荐的后续操作；建议您按照业务所需，对不同违规类型与建议值进行处理。<br>返回值：<strong>Block</strong>：建议屏蔽，<strong>Review</strong> ：建议人工复审，<strong>Pass</strong>：建议通过</p>
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get <p>该字段用于返回检测文本命中的关键词信息，用于标注文本违规的具体原因（如：<em>加我微信</em>）。该参数可能会有多个返回值，代表命中的多个关键词；如返回值为空且Score不为空，则代表识别结果所对应的恶意标签（Label）是来自于语义模型判断的返回值。</p> 
     * @return Keywords <p>该字段用于返回检测文本命中的关键词信息，用于标注文本违规的具体原因（如：<em>加我微信</em>）。该参数可能会有多个返回值，代表命中的多个关键词；如返回值为空且Score不为空，则代表识别结果所对应的恶意标签（Label）是来自于语义模型判断的返回值。</p>
     */
    public String [] getKeywords() {
        return this.Keywords;
    }

    /**
     * Set <p>该字段用于返回检测文本命中的关键词信息，用于标注文本违规的具体原因（如：<em>加我微信</em>）。该参数可能会有多个返回值，代表命中的多个关键词；如返回值为空且Score不为空，则代表识别结果所对应的恶意标签（Label）是来自于语义模型判断的返回值。</p>
     * @param Keywords <p>该字段用于返回检测文本命中的关键词信息，用于标注文本违规的具体原因（如：<em>加我微信</em>）。该参数可能会有多个返回值，代表命中的多个关键词；如返回值为空且Score不为空，则代表识别结果所对应的恶意标签（Label）是来自于语义模型判断的返回值。</p>
     */
    public void setKeywords(String [] Keywords) {
        this.Keywords = Keywords;
    }

    /**
     * Get <p>该字段用于返回当前标签（Label）下的置信度，取值范围：0（<strong>置信度最低</strong>）-100（<strong>置信度最高</strong> ），越高代表文本越有可能属于当前返回的标签；如：<em>色情 99</em>，则表明该文本非常有可能属于色情内容；<em>色情 0</em>，则表明该文本不属于色情内容。</p> 
     * @return Score <p>该字段用于返回当前标签（Label）下的置信度，取值范围：0（<strong>置信度最低</strong>）-100（<strong>置信度最高</strong> ），越高代表文本越有可能属于当前返回的标签；如：<em>色情 99</em>，则表明该文本非常有可能属于色情内容；<em>色情 0</em>，则表明该文本不属于色情内容。</p>
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set <p>该字段用于返回当前标签（Label）下的置信度，取值范围：0（<strong>置信度最低</strong>）-100（<strong>置信度最高</strong> ），越高代表文本越有可能属于当前返回的标签；如：<em>色情 99</em>，则表明该文本非常有可能属于色情内容；<em>色情 0</em>，则表明该文本不属于色情内容。</p>
     * @param Score <p>该字段用于返回当前标签（Label）下的置信度，取值范围：0（<strong>置信度最低</strong>）-100（<strong>置信度最高</strong> ），越高代表文本越有可能属于当前返回的标签；如：<em>色情 99</em>，则表明该文本非常有可能属于色情内容；<em>色情 0</em>，则表明该文本不属于色情内容。</p>
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    /**
     * Get <p>该字段用于返回自定义关键词对应的词库类型，取值为<strong>1</strong>（黑白库）和<strong>2</strong>（自定义关键词库），若未配置自定义关键词库,则默认值为1（黑白库匹配）。</p> 
     * @return LibType <p>该字段用于返回自定义关键词对应的词库类型，取值为<strong>1</strong>（黑白库）和<strong>2</strong>（自定义关键词库），若未配置自定义关键词库,则默认值为1（黑白库匹配）。</p>
     */
    public Long getLibType() {
        return this.LibType;
    }

    /**
     * Set <p>该字段用于返回自定义关键词对应的词库类型，取值为<strong>1</strong>（黑白库）和<strong>2</strong>（自定义关键词库），若未配置自定义关键词库,则默认值为1（黑白库匹配）。</p>
     * @param LibType <p>该字段用于返回自定义关键词对应的词库类型，取值为<strong>1</strong>（黑白库）和<strong>2</strong>（自定义关键词库），若未配置自定义关键词库,则默认值为1（黑白库匹配）。</p>
     */
    public void setLibType(Long LibType) {
        this.LibType = LibType;
    }

    /**
     * Get <p>该字段用于返回自定义库的ID，以方便自定义库管理和配置。</p> 
     * @return LibId <p>该字段用于返回自定义库的ID，以方便自定义库管理和配置。</p>
     */
    public String getLibId() {
        return this.LibId;
    }

    /**
     * Set <p>该字段用于返回自定义库的ID，以方便自定义库管理和配置。</p>
     * @param LibId <p>该字段用于返回自定义库的ID，以方便自定义库管理和配置。</p>
     */
    public void setLibId(String LibId) {
        this.LibId = LibId;
    }

    /**
     * Get <p>该字段用于返回自定义库的名称,以方便自定义库管理和配置。</p> 
     * @return LibName <p>该字段用于返回自定义库的名称,以方便自定义库管理和配置。</p>
     */
    public String getLibName() {
        return this.LibName;
    }

    /**
     * Set <p>该字段用于返回自定义库的名称,以方便自定义库管理和配置。</p>
     * @param LibName <p>该字段用于返回自定义库的名称,以方便自定义库管理和配置。</p>
     */
    public void setLibName(String LibName) {
        this.LibName = LibName;
    }

    /**
     * Get <p>该字段用于返回当前标签（Label）下的二级标签。</p> 
     * @return SubLabel <p>该字段用于返回当前标签（Label）下的二级标签。</p>
     */
    public String getSubLabel() {
        return this.SubLabel;
    }

    /**
     * Set <p>该字段用于返回当前标签（Label）下的二级标签。</p>
     * @param SubLabel <p>该字段用于返回当前标签（Label）下的二级标签。</p>
     */
    public void setSubLabel(String SubLabel) {
        this.SubLabel = SubLabel;
    }

    /**
     * Get <p>该字段用于返回当前一级标签（Label）下的关键词、子标签及分数。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags <p>该字段用于返回当前一级标签（Label）下的关键词、子标签及分数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>该字段用于返回当前一级标签（Label）下的关键词、子标签及分数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags <p>该字段用于返回当前一级标签（Label）下的关键词、子标签及分数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>该字段用于返回违规文本命中信息</p> 
     * @return HitInfos <p>该字段用于返回违规文本命中信息</p>
     */
    public HitInfo [] getHitInfos() {
        return this.HitInfos;
    }

    /**
     * Set <p>该字段用于返回违规文本命中信息</p>
     * @param HitInfos <p>该字段用于返回违规文本命中信息</p>
     */
    public void setHitInfos(HitInfo [] HitInfos) {
        this.HitInfos = HitInfos;
    }

    public DetailResults() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DetailResults(DetailResults source) {
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
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
        if (source.LibType != null) {
            this.LibType = new Long(source.LibType);
        }
        if (source.LibId != null) {
            this.LibId = new String(source.LibId);
        }
        if (source.LibName != null) {
            this.LibName = new String(source.LibName);
        }
        if (source.SubLabel != null) {
            this.SubLabel = new String(source.SubLabel);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.HitInfos != null) {
            this.HitInfos = new HitInfo[source.HitInfos.length];
            for (int i = 0; i < source.HitInfos.length; i++) {
                this.HitInfos[i] = new HitInfo(source.HitInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamArraySimple(map, prefix + "Keywords.", this.Keywords);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamSimple(map, prefix + "LibType", this.LibType);
        this.setParamSimple(map, prefix + "LibId", this.LibId);
        this.setParamSimple(map, prefix + "LibName", this.LibName);
        this.setParamSimple(map, prefix + "SubLabel", this.SubLabel);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamArrayObj(map, prefix + "HitInfos.", this.HitInfos);

    }
}

