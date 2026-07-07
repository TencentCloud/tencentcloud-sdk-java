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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDspmIdentifyRuleTestResultRequest extends AbstractModel {

    /**
    * <p>规则类型</p><p>枚举值：</p><ul><li>structured： 结构化规则</li><li>unstructrued： 非结构化规则</li></ul>
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * <p>规则内容</p>
    */
    @SerializedName("RuleContent")
    @Expose
    private String RuleContent;

    /**
    * <p>数据项id</p>
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>结构化测试内容</p>
    */
    @SerializedName("StructuredTestContent")
    @Expose
    private DspmIdentifyRuleStructuredTestItem [] StructuredTestContent;

    /**
    * <p>非结构化测试内容</p>
    */
    @SerializedName("UnStructuredTestContent")
    @Expose
    private String UnStructuredTestContent;

    /**
     * Get <p>规则类型</p><p>枚举值：</p><ul><li>structured： 结构化规则</li><li>unstructrued： 非结构化规则</li></ul> 
     * @return RuleType <p>规则类型</p><p>枚举值：</p><ul><li>structured： 结构化规则</li><li>unstructrued： 非结构化规则</li></ul>
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set <p>规则类型</p><p>枚举值：</p><ul><li>structured： 结构化规则</li><li>unstructrued： 非结构化规则</li></ul>
     * @param RuleType <p>规则类型</p><p>枚举值：</p><ul><li>structured： 结构化规则</li><li>unstructrued： 非结构化规则</li></ul>
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get <p>规则内容</p> 
     * @return RuleContent <p>规则内容</p>
     */
    public String getRuleContent() {
        return this.RuleContent;
    }

    /**
     * Set <p>规则内容</p>
     * @param RuleContent <p>规则内容</p>
     */
    public void setRuleContent(String RuleContent) {
        this.RuleContent = RuleContent;
    }

    /**
     * Get <p>数据项id</p> 
     * @return RuleId <p>数据项id</p>
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set <p>数据项id</p>
     * @param RuleId <p>数据项id</p>
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get <p>集团账号的成员id</p> 
     * @return MemberId <p>集团账号的成员id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>集团账号的成员id</p>
     * @param MemberId <p>集团账号的成员id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>结构化测试内容</p> 
     * @return StructuredTestContent <p>结构化测试内容</p>
     */
    public DspmIdentifyRuleStructuredTestItem [] getStructuredTestContent() {
        return this.StructuredTestContent;
    }

    /**
     * Set <p>结构化测试内容</p>
     * @param StructuredTestContent <p>结构化测试内容</p>
     */
    public void setStructuredTestContent(DspmIdentifyRuleStructuredTestItem [] StructuredTestContent) {
        this.StructuredTestContent = StructuredTestContent;
    }

    /**
     * Get <p>非结构化测试内容</p> 
     * @return UnStructuredTestContent <p>非结构化测试内容</p>
     */
    public String getUnStructuredTestContent() {
        return this.UnStructuredTestContent;
    }

    /**
     * Set <p>非结构化测试内容</p>
     * @param UnStructuredTestContent <p>非结构化测试内容</p>
     */
    public void setUnStructuredTestContent(String UnStructuredTestContent) {
        this.UnStructuredTestContent = UnStructuredTestContent;
    }

    public DescribeDspmIdentifyRuleTestResultRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDspmIdentifyRuleTestResultRequest(DescribeDspmIdentifyRuleTestResultRequest source) {
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.RuleContent != null) {
            this.RuleContent = new String(source.RuleContent);
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.StructuredTestContent != null) {
            this.StructuredTestContent = new DspmIdentifyRuleStructuredTestItem[source.StructuredTestContent.length];
            for (int i = 0; i < source.StructuredTestContent.length; i++) {
                this.StructuredTestContent[i] = new DspmIdentifyRuleStructuredTestItem(source.StructuredTestContent[i]);
            }
        }
        if (source.UnStructuredTestContent != null) {
            this.UnStructuredTestContent = new String(source.UnStructuredTestContent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "RuleContent", this.RuleContent);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArrayObj(map, prefix + "StructuredTestContent.", this.StructuredTestContent);
        this.setParamSimple(map, prefix + "UnStructuredTestContent", this.UnStructuredTestContent);

    }
}

