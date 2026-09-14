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

public class ModifyDocListRequest extends AbstractModel {

    /**
    * <p>待修改的文档 ID 列表（数量：1~20）</p>
    */
    @SerializedName("DocIdList")
    @Expose
    private String [] DocIdList;

    /**
    * <p>所属知识库 ID</p>
    */
    @SerializedName("KbId")
    @Expose
    private String KbId;

    /**
    * <p>归属分类 ID</p>
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
    * <p>外部链接</p>
    */
    @SerializedName("ExternalLink")
    @Expose
    private DocExternalLink ExternalLink;

    /**
    * <p>标签列表</p>
    */
    @SerializedName("LabelRefList")
    @Expose
    private LabelRefIdentityList LabelRefList;

    /**
    * <p>开关配置</p>
    */
    @SerializedName("Switch")
    @Expose
    private DocSwitch Switch;

    /**
     * Get <p>待修改的文档 ID 列表（数量：1~20）</p> 
     * @return DocIdList <p>待修改的文档 ID 列表（数量：1~20）</p>
     */
    public String [] getDocIdList() {
        return this.DocIdList;
    }

    /**
     * Set <p>待修改的文档 ID 列表（数量：1~20）</p>
     * @param DocIdList <p>待修改的文档 ID 列表（数量：1~20）</p>
     */
    public void setDocIdList(String [] DocIdList) {
        this.DocIdList = DocIdList;
    }

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
     * Get <p>归属分类 ID</p> 
     * @return CategoryId <p>归属分类 ID</p>
     */
    public String getCategoryId() {
        return this.CategoryId;
    }

    /**
     * Set <p>归属分类 ID</p>
     * @param CategoryId <p>归属分类 ID</p>
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
     * Get <p>外部链接</p> 
     * @return ExternalLink <p>外部链接</p>
     */
    public DocExternalLink getExternalLink() {
        return this.ExternalLink;
    }

    /**
     * Set <p>外部链接</p>
     * @param ExternalLink <p>外部链接</p>
     */
    public void setExternalLink(DocExternalLink ExternalLink) {
        this.ExternalLink = ExternalLink;
    }

    /**
     * Get <p>标签列表</p> 
     * @return LabelRefList <p>标签列表</p>
     */
    public LabelRefIdentityList getLabelRefList() {
        return this.LabelRefList;
    }

    /**
     * Set <p>标签列表</p>
     * @param LabelRefList <p>标签列表</p>
     */
    public void setLabelRefList(LabelRefIdentityList LabelRefList) {
        this.LabelRefList = LabelRefList;
    }

    /**
     * Get <p>开关配置</p> 
     * @return Switch <p>开关配置</p>
     */
    public DocSwitch getSwitch() {
        return this.Switch;
    }

    /**
     * Set <p>开关配置</p>
     * @param Switch <p>开关配置</p>
     */
    public void setSwitch(DocSwitch Switch) {
        this.Switch = Switch;
    }

    public ModifyDocListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDocListRequest(ModifyDocListRequest source) {
        if (source.DocIdList != null) {
            this.DocIdList = new String[source.DocIdList.length];
            for (int i = 0; i < source.DocIdList.length; i++) {
                this.DocIdList[i] = new String(source.DocIdList[i]);
            }
        }
        if (source.KbId != null) {
            this.KbId = new String(source.KbId);
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
        if (source.ExternalLink != null) {
            this.ExternalLink = new DocExternalLink(source.ExternalLink);
        }
        if (source.LabelRefList != null) {
            this.LabelRefList = new LabelRefIdentityList(source.LabelRefList);
        }
        if (source.Switch != null) {
            this.Switch = new DocSwitch(source.Switch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DocIdList.", this.DocIdList);
        this.setParamSimple(map, prefix + "KbId", this.KbId);
        this.setParamSimple(map, prefix + "CategoryId", this.CategoryId);
        this.setParamSimple(map, prefix + "EffectiveDomain", this.EffectiveDomain);
        this.setParamObj(map, prefix + "ExpirationPolicy.", this.ExpirationPolicy);
        this.setParamObj(map, prefix + "ExternalLink.", this.ExternalLink);
        this.setParamObj(map, prefix + "LabelRefList.", this.LabelRefList);
        this.setParamObj(map, prefix + "Switch.", this.Switch);

    }
}

