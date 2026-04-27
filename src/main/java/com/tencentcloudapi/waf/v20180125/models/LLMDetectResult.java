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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LLMDetectResult extends AbstractModel {

    /**
    * <p>仅输出侧：涉敏信息</p>
    */
    @SerializedName("SensitiveResult")
    @Expose
    private LLMSensitiveValueLevel [] SensitiveResult;

    /**
    * <p>输入输出均检测：关键词库命中信息</p>
    */
    @SerializedName("KeyWordsResult")
    @Expose
    private KeyWordInfo [] KeyWordsResult;

    /**
    * <p>输入输出均检测：数据分类分级结果</p>
    */
    @SerializedName("DataCategoryResult")
    @Expose
    private String [] DataCategoryResult;

    /**
    * <p>仅输入侧检出：prompt检测的结果</p>
    */
    @SerializedName("PromptInjectionResult")
    @Expose
    private PromptDetectResult PromptInjectionResult;

    /**
    * <p>命中的规则ID</p>
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * <p>命中的规则名称</p>
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * <p>规则动作</p>
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * <p>攻击payload</p>
    */
    @SerializedName("Payload")
    @Expose
    private String Payload;

    /**
    * <p>图片检测结果</p>
    */
    @SerializedName("ImageResult")
    @Expose
    private ImageResult [] ImageResult;

    /**
     * Get <p>仅输出侧：涉敏信息</p> 
     * @return SensitiveResult <p>仅输出侧：涉敏信息</p>
     */
    public LLMSensitiveValueLevel [] getSensitiveResult() {
        return this.SensitiveResult;
    }

    /**
     * Set <p>仅输出侧：涉敏信息</p>
     * @param SensitiveResult <p>仅输出侧：涉敏信息</p>
     */
    public void setSensitiveResult(LLMSensitiveValueLevel [] SensitiveResult) {
        this.SensitiveResult = SensitiveResult;
    }

    /**
     * Get <p>输入输出均检测：关键词库命中信息</p> 
     * @return KeyWordsResult <p>输入输出均检测：关键词库命中信息</p>
     */
    public KeyWordInfo [] getKeyWordsResult() {
        return this.KeyWordsResult;
    }

    /**
     * Set <p>输入输出均检测：关键词库命中信息</p>
     * @param KeyWordsResult <p>输入输出均检测：关键词库命中信息</p>
     */
    public void setKeyWordsResult(KeyWordInfo [] KeyWordsResult) {
        this.KeyWordsResult = KeyWordsResult;
    }

    /**
     * Get <p>输入输出均检测：数据分类分级结果</p> 
     * @return DataCategoryResult <p>输入输出均检测：数据分类分级结果</p>
     */
    public String [] getDataCategoryResult() {
        return this.DataCategoryResult;
    }

    /**
     * Set <p>输入输出均检测：数据分类分级结果</p>
     * @param DataCategoryResult <p>输入输出均检测：数据分类分级结果</p>
     */
    public void setDataCategoryResult(String [] DataCategoryResult) {
        this.DataCategoryResult = DataCategoryResult;
    }

    /**
     * Get <p>仅输入侧检出：prompt检测的结果</p> 
     * @return PromptInjectionResult <p>仅输入侧检出：prompt检测的结果</p>
     */
    public PromptDetectResult getPromptInjectionResult() {
        return this.PromptInjectionResult;
    }

    /**
     * Set <p>仅输入侧检出：prompt检测的结果</p>
     * @param PromptInjectionResult <p>仅输入侧检出：prompt检测的结果</p>
     */
    public void setPromptInjectionResult(PromptDetectResult PromptInjectionResult) {
        this.PromptInjectionResult = PromptInjectionResult;
    }

    /**
     * Get <p>命中的规则ID</p> 
     * @return RuleId <p>命中的规则ID</p>
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set <p>命中的规则ID</p>
     * @param RuleId <p>命中的规则ID</p>
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get <p>命中的规则名称</p> 
     * @return RuleName <p>命中的规则名称</p>
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set <p>命中的规则名称</p>
     * @param RuleName <p>命中的规则名称</p>
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get <p>规则动作</p> 
     * @return Action <p>规则动作</p>
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set <p>规则动作</p>
     * @param Action <p>规则动作</p>
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get <p>攻击payload</p> 
     * @return Payload <p>攻击payload</p>
     */
    public String getPayload() {
        return this.Payload;
    }

    /**
     * Set <p>攻击payload</p>
     * @param Payload <p>攻击payload</p>
     */
    public void setPayload(String Payload) {
        this.Payload = Payload;
    }

    /**
     * Get <p>图片检测结果</p> 
     * @return ImageResult <p>图片检测结果</p>
     */
    public ImageResult [] getImageResult() {
        return this.ImageResult;
    }

    /**
     * Set <p>图片检测结果</p>
     * @param ImageResult <p>图片检测结果</p>
     */
    public void setImageResult(ImageResult [] ImageResult) {
        this.ImageResult = ImageResult;
    }

    public LLMDetectResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LLMDetectResult(LLMDetectResult source) {
        if (source.SensitiveResult != null) {
            this.SensitiveResult = new LLMSensitiveValueLevel[source.SensitiveResult.length];
            for (int i = 0; i < source.SensitiveResult.length; i++) {
                this.SensitiveResult[i] = new LLMSensitiveValueLevel(source.SensitiveResult[i]);
            }
        }
        if (source.KeyWordsResult != null) {
            this.KeyWordsResult = new KeyWordInfo[source.KeyWordsResult.length];
            for (int i = 0; i < source.KeyWordsResult.length; i++) {
                this.KeyWordsResult[i] = new KeyWordInfo(source.KeyWordsResult[i]);
            }
        }
        if (source.DataCategoryResult != null) {
            this.DataCategoryResult = new String[source.DataCategoryResult.length];
            for (int i = 0; i < source.DataCategoryResult.length; i++) {
                this.DataCategoryResult[i] = new String(source.DataCategoryResult[i]);
            }
        }
        if (source.PromptInjectionResult != null) {
            this.PromptInjectionResult = new PromptDetectResult(source.PromptInjectionResult);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.Payload != null) {
            this.Payload = new String(source.Payload);
        }
        if (source.ImageResult != null) {
            this.ImageResult = new ImageResult[source.ImageResult.length];
            for (int i = 0; i < source.ImageResult.length; i++) {
                this.ImageResult[i] = new ImageResult(source.ImageResult[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "SensitiveResult.", this.SensitiveResult);
        this.setParamArrayObj(map, prefix + "KeyWordsResult.", this.KeyWordsResult);
        this.setParamArraySimple(map, prefix + "DataCategoryResult.", this.DataCategoryResult);
        this.setParamObj(map, prefix + "PromptInjectionResult.", this.PromptInjectionResult);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "Payload", this.Payload);
        this.setParamArrayObj(map, prefix + "ImageResult.", this.ImageResult);

    }
}

