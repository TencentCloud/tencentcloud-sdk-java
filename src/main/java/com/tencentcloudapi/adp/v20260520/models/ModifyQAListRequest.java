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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyQAListRequest extends AbstractModel {

    /**
    * <p>所属知识库 ID</p>
    */
    @SerializedName("KbId")
    @Expose
    private String KbId;

    /**
    * <p>待修改的 QA ID 列表（数量：1~20）</p>
    */
    @SerializedName("QaIdList")
    @Expose
    private String [] QaIdList;

    /**
    * <p>分类 ID</p>
    */
    @SerializedName("CategoryId")
    @Expose
    private String CategoryId;

    /**
    * <p>生效作用域<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_UNKNOWN</td><td>0</td><td></td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_NONE</td><td>1</td><td>停用</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_DEV</td><td>2</td><td>仅开发域</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_RELEASE</td><td>3</td><td>仅发布域</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_ALL</td><td>4</td><td>全域</td></tr></tbody></table></p>
    */
    @SerializedName("EffectiveDomain")
    @Expose
    private Long EffectiveDomain;

    /**
    * <p>过期策略（有效时间与超过有效时间后的行为）</p>
    */
    @SerializedName("ExpirationPolicy")
    @Expose
    private ExpirationPolicy ExpirationPolicy;

    /**
    * <p>是否采纳（校验通过）</p>
    */
    @SerializedName("IsAccepted")
    @Expose
    private Boolean IsAccepted;

    /**
    * <p>适用范围（标签条件列表）</p>
    */
    @SerializedName("LabelRefList")
    @Expose
    private LabelRefIdentityList LabelRefList;

    /**
     * Get <p>所属知识库 ID</p> 
     * @return KbId <p>所属知识库 ID</p>
     */
    public String getKbId() {
        return this.KbId;
    }

    /**
     * Set <p>所属知识库 ID</p>
     * @param KbId <p>所属知识库 ID</p>
     */
    public void setKbId(String KbId) {
        this.KbId = KbId;
    }

    /**
     * Get <p>待修改的 QA ID 列表（数量：1~20）</p> 
     * @return QaIdList <p>待修改的 QA ID 列表（数量：1~20）</p>
     */
    public String [] getQaIdList() {
        return this.QaIdList;
    }

    /**
     * Set <p>待修改的 QA ID 列表（数量：1~20）</p>
     * @param QaIdList <p>待修改的 QA ID 列表（数量：1~20）</p>
     */
    public void setQaIdList(String [] QaIdList) {
        this.QaIdList = QaIdList;
    }

    /**
     * Get <p>分类 ID</p> 
     * @return CategoryId <p>分类 ID</p>
     */
    public String getCategoryId() {
        return this.CategoryId;
    }

    /**
     * Set <p>分类 ID</p>
     * @param CategoryId <p>分类 ID</p>
     */
    public void setCategoryId(String CategoryId) {
        this.CategoryId = CategoryId;
    }

    /**
     * Get <p>生效作用域<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_UNKNOWN</td><td>0</td><td></td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_NONE</td><td>1</td><td>停用</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_DEV</td><td>2</td><td>仅开发域</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_RELEASE</td><td>3</td><td>仅发布域</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_ALL</td><td>4</td><td>全域</td></tr></tbody></table></p> 
     * @return EffectiveDomain <p>生效作用域<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_UNKNOWN</td><td>0</td><td></td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_NONE</td><td>1</td><td>停用</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_DEV</td><td>2</td><td>仅开发域</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_RELEASE</td><td>3</td><td>仅发布域</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_ALL</td><td>4</td><td>全域</td></tr></tbody></table></p>
     */
    public Long getEffectiveDomain() {
        return this.EffectiveDomain;
    }

    /**
     * Set <p>生效作用域<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_UNKNOWN</td><td>0</td><td></td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_NONE</td><td>1</td><td>停用</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_DEV</td><td>2</td><td>仅开发域</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_RELEASE</td><td>3</td><td>仅发布域</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_ALL</td><td>4</td><td>全域</td></tr></tbody></table></p>
     * @param EffectiveDomain <p>生效作用域<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_UNKNOWN</td><td>0</td><td></td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_NONE</td><td>1</td><td>停用</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_DEV</td><td>2</td><td>仅开发域</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_RELEASE</td><td>3</td><td>仅发布域</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_ALL</td><td>4</td><td>全域</td></tr></tbody></table></p>
     */
    public void setEffectiveDomain(Long EffectiveDomain) {
        this.EffectiveDomain = EffectiveDomain;
    }

    /**
     * Get <p>过期策略（有效时间与超过有效时间后的行为）</p> 
     * @return ExpirationPolicy <p>过期策略（有效时间与超过有效时间后的行为）</p>
     */
    public ExpirationPolicy getExpirationPolicy() {
        return this.ExpirationPolicy;
    }

    /**
     * Set <p>过期策略（有效时间与超过有效时间后的行为）</p>
     * @param ExpirationPolicy <p>过期策略（有效时间与超过有效时间后的行为）</p>
     */
    public void setExpirationPolicy(ExpirationPolicy ExpirationPolicy) {
        this.ExpirationPolicy = ExpirationPolicy;
    }

    /**
     * Get <p>是否采纳（校验通过）</p> 
     * @return IsAccepted <p>是否采纳（校验通过）</p>
     */
    public Boolean getIsAccepted() {
        return this.IsAccepted;
    }

    /**
     * Set <p>是否采纳（校验通过）</p>
     * @param IsAccepted <p>是否采纳（校验通过）</p>
     */
    public void setIsAccepted(Boolean IsAccepted) {
        this.IsAccepted = IsAccepted;
    }

    /**
     * Get <p>适用范围（标签条件列表）</p> 
     * @return LabelRefList <p>适用范围（标签条件列表）</p>
     */
    public LabelRefIdentityList getLabelRefList() {
        return this.LabelRefList;
    }

    /**
     * Set <p>适用范围（标签条件列表）</p>
     * @param LabelRefList <p>适用范围（标签条件列表）</p>
     */
    public void setLabelRefList(LabelRefIdentityList LabelRefList) {
        this.LabelRefList = LabelRefList;
    }

    public ModifyQAListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyQAListRequest(ModifyQAListRequest source) {
        if (source.KbId != null) {
            this.KbId = new String(source.KbId);
        }
        if (source.QaIdList != null) {
            this.QaIdList = new String[source.QaIdList.length];
            for (int i = 0; i < source.QaIdList.length; i++) {
                this.QaIdList[i] = new String(source.QaIdList[i]);
            }
        }
        if (source.CategoryId != null) {
            this.CategoryId = new String(source.CategoryId);
        }
        if (source.EffectiveDomain != null) {
            this.EffectiveDomain = new Long(source.EffectiveDomain);
        }
        if (source.ExpirationPolicy != null) {
            this.ExpirationPolicy = new ExpirationPolicy(source.ExpirationPolicy);
        }
        if (source.IsAccepted != null) {
            this.IsAccepted = new Boolean(source.IsAccepted);
        }
        if (source.LabelRefList != null) {
            this.LabelRefList = new LabelRefIdentityList(source.LabelRefList);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KbId", this.KbId);
        this.setParamArraySimple(map, prefix + "QaIdList.", this.QaIdList);
        this.setParamSimple(map, prefix + "CategoryId", this.CategoryId);
        this.setParamSimple(map, prefix + "EffectiveDomain", this.EffectiveDomain);
        this.setParamObj(map, prefix + "ExpirationPolicy.", this.ExpirationPolicy);
        this.setParamSimple(map, prefix + "IsAccepted", this.IsAccepted);
        this.setParamObj(map, prefix + "LabelRefList.", this.LabelRefList);

    }
}

