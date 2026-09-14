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

public class DocModifyFields extends AbstractModel {

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
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpirationPolicy")
    @Expose
    private ExpirationPolicy ExpirationPolicy;

    /**
    * <p>外部链接</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExternalLink")
    @Expose
    private DocExternalLink ExternalLink;

    /**
    * <p>标签列表</p>
    */
    @SerializedName("LabelRefList")
    @Expose
    private LabelRefIdentity [] LabelRefList;

    /**
    * <p>文档名</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>解析配置（分割规则、内容过滤等）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParseConfig")
    @Expose
    private DocParseConfig ParseConfig;

    /**
    * <p>开关配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Switch")
    @Expose
    private DocSwitch Switch;

    /**
    * <p>更新周期</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdatePeriod")
    @Expose
    private DocUpdatePeriod UpdatePeriod;

    /**
    * <p>用户访问配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserAccessConfig")
    @Expose
    private UserAccessConfig UserAccessConfig;

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
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpirationPolicy <p>过期策略（有效时间与超过有效时间后的行为）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ExpirationPolicy getExpirationPolicy() {
        return this.ExpirationPolicy;
    }

    /**
     * Set <p>过期策略（有效时间与超过有效时间后的行为）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpirationPolicy <p>过期策略（有效时间与超过有效时间后的行为）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpirationPolicy(ExpirationPolicy ExpirationPolicy) {
        this.ExpirationPolicy = ExpirationPolicy;
    }

    /**
     * Get <p>外部链接</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExternalLink <p>外部链接</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DocExternalLink getExternalLink() {
        return this.ExternalLink;
    }

    /**
     * Set <p>外部链接</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExternalLink <p>外部链接</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExternalLink(DocExternalLink ExternalLink) {
        this.ExternalLink = ExternalLink;
    }

    /**
     * Get <p>标签列表</p> 
     * @return LabelRefList <p>标签列表</p>
     */
    public LabelRefIdentity [] getLabelRefList() {
        return this.LabelRefList;
    }

    /**
     * Set <p>标签列表</p>
     * @param LabelRefList <p>标签列表</p>
     */
    public void setLabelRefList(LabelRefIdentity [] LabelRefList) {
        this.LabelRefList = LabelRefList;
    }

    /**
     * Get <p>文档名</p> 
     * @return Name <p>文档名</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>文档名</p>
     * @param Name <p>文档名</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>解析配置（分割规则、内容过滤等）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParseConfig <p>解析配置（分割规则、内容过滤等）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DocParseConfig getParseConfig() {
        return this.ParseConfig;
    }

    /**
     * Set <p>解析配置（分割规则、内容过滤等）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParseConfig <p>解析配置（分割规则、内容过滤等）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParseConfig(DocParseConfig ParseConfig) {
        this.ParseConfig = ParseConfig;
    }

    /**
     * Get <p>开关配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Switch <p>开关配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DocSwitch getSwitch() {
        return this.Switch;
    }

    /**
     * Set <p>开关配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Switch <p>开关配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSwitch(DocSwitch Switch) {
        this.Switch = Switch;
    }

    /**
     * Get <p>更新周期</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdatePeriod <p>更新周期</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DocUpdatePeriod getUpdatePeriod() {
        return this.UpdatePeriod;
    }

    /**
     * Set <p>更新周期</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdatePeriod <p>更新周期</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdatePeriod(DocUpdatePeriod UpdatePeriod) {
        this.UpdatePeriod = UpdatePeriod;
    }

    /**
     * Get <p>用户访问配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserAccessConfig <p>用户访问配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public UserAccessConfig getUserAccessConfig() {
        return this.UserAccessConfig;
    }

    /**
     * Set <p>用户访问配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserAccessConfig <p>用户访问配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserAccessConfig(UserAccessConfig UserAccessConfig) {
        this.UserAccessConfig = UserAccessConfig;
    }

    public DocModifyFields() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DocModifyFields(DocModifyFields source) {
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
            this.LabelRefList = new LabelRefIdentity[source.LabelRefList.length];
            for (int i = 0; i < source.LabelRefList.length; i++) {
                this.LabelRefList[i] = new LabelRefIdentity(source.LabelRefList[i]);
            }
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ParseConfig != null) {
            this.ParseConfig = new DocParseConfig(source.ParseConfig);
        }
        if (source.Switch != null) {
            this.Switch = new DocSwitch(source.Switch);
        }
        if (source.UpdatePeriod != null) {
            this.UpdatePeriod = new DocUpdatePeriod(source.UpdatePeriod);
        }
        if (source.UserAccessConfig != null) {
            this.UserAccessConfig = new UserAccessConfig(source.UserAccessConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CategoryId", this.CategoryId);
        this.setParamSimple(map, prefix + "EffectiveDomain", this.EffectiveDomain);
        this.setParamObj(map, prefix + "ExpirationPolicy.", this.ExpirationPolicy);
        this.setParamObj(map, prefix + "ExternalLink.", this.ExternalLink);
        this.setParamArrayObj(map, prefix + "LabelRefList.", this.LabelRefList);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "ParseConfig.", this.ParseConfig);
        this.setParamObj(map, prefix + "Switch.", this.Switch);
        this.setParamObj(map, prefix + "UpdatePeriod.", this.UpdatePeriod);
        this.setParamObj(map, prefix + "UserAccessConfig.", this.UserAccessConfig);

    }
}

