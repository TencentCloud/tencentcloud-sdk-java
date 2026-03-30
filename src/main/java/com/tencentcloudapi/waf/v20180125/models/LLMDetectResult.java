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
    *  仅输出侧：涉敏信息
    */
    @SerializedName("SensitiveResult")
    @Expose
    private LLMSensitiveValueLevel [] SensitiveResult;

    /**
    *  输入输出均检测：关键词库命中信息
    */
    @SerializedName("KeyWordsResult")
    @Expose
    private KeyWordInfo [] KeyWordsResult;

    /**
    * 输入输出均检测：数据分类分级结果
    */
    @SerializedName("DataCategoryResult")
    @Expose
    private String [] DataCategoryResult;

    /**
    *  仅输入侧检出：prompt检测的结果
    */
    @SerializedName("PromptInjectionResult")
    @Expose
    private PromptDetectResult PromptInjectionResult;

    /**
    * 命中的规则ID
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * 命中的规则名称
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 规则动作
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 攻击payload
    */
    @SerializedName("Payload")
    @Expose
    private String Payload;

    /**
     * Get  仅输出侧：涉敏信息 
     * @return SensitiveResult  仅输出侧：涉敏信息
     */
    public LLMSensitiveValueLevel [] getSensitiveResult() {
        return this.SensitiveResult;
    }

    /**
     * Set  仅输出侧：涉敏信息
     * @param SensitiveResult  仅输出侧：涉敏信息
     */
    public void setSensitiveResult(LLMSensitiveValueLevel [] SensitiveResult) {
        this.SensitiveResult = SensitiveResult;
    }

    /**
     * Get  输入输出均检测：关键词库命中信息 
     * @return KeyWordsResult  输入输出均检测：关键词库命中信息
     */
    public KeyWordInfo [] getKeyWordsResult() {
        return this.KeyWordsResult;
    }

    /**
     * Set  输入输出均检测：关键词库命中信息
     * @param KeyWordsResult  输入输出均检测：关键词库命中信息
     */
    public void setKeyWordsResult(KeyWordInfo [] KeyWordsResult) {
        this.KeyWordsResult = KeyWordsResult;
    }

    /**
     * Get 输入输出均检测：数据分类分级结果 
     * @return DataCategoryResult 输入输出均检测：数据分类分级结果
     */
    public String [] getDataCategoryResult() {
        return this.DataCategoryResult;
    }

    /**
     * Set 输入输出均检测：数据分类分级结果
     * @param DataCategoryResult 输入输出均检测：数据分类分级结果
     */
    public void setDataCategoryResult(String [] DataCategoryResult) {
        this.DataCategoryResult = DataCategoryResult;
    }

    /**
     * Get  仅输入侧检出：prompt检测的结果 
     * @return PromptInjectionResult  仅输入侧检出：prompt检测的结果
     */
    public PromptDetectResult getPromptInjectionResult() {
        return this.PromptInjectionResult;
    }

    /**
     * Set  仅输入侧检出：prompt检测的结果
     * @param PromptInjectionResult  仅输入侧检出：prompt检测的结果
     */
    public void setPromptInjectionResult(PromptDetectResult PromptInjectionResult) {
        this.PromptInjectionResult = PromptInjectionResult;
    }

    /**
     * Get 命中的规则ID 
     * @return RuleId 命中的规则ID
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 命中的规则ID
     * @param RuleId 命中的规则ID
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 命中的规则名称 
     * @return RuleName 命中的规则名称
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 命中的规则名称
     * @param RuleName 命中的规则名称
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 规则动作 
     * @return Action 规则动作
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 规则动作
     * @param Action 规则动作
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get 攻击payload 
     * @return Payload 攻击payload
     */
    public String getPayload() {
        return this.Payload;
    }

    /**
     * Set 攻击payload
     * @param Payload 攻击payload
     */
    public void setPayload(String Payload) {
        this.Payload = Payload;
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

    }
}

