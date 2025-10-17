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
package com.tencentcloudapi.privatedns.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ForwardRule extends AbstractModel {

    /**
    * 私有域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 转发规则名称
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 规则id
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * 转发规则类型：云上到云下DOWN、云下到云上DOWN
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * 创建时间
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * 更新时间
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * 终端节点名称
    */
    @SerializedName("EndPointName")
    @Expose
    private String EndPointName;

    /**
    * 终端节点ID
    */
    @SerializedName("EndPointId")
    @Expose
    private String EndPointId;

    /**
    * 转发地址
    */
    @SerializedName("ForwardAddress")
    @Expose
    private String [] ForwardAddress;

    /**
    * 私有域绑定的vpc列表
    */
    @SerializedName("VpcSet")
    @Expose
    private VpcInfo [] VpcSet;

    /**
    * 绑定的私有域ID
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 标签
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
     * Get 私有域名 
     * @return Domain 私有域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 私有域名
     * @param Domain 私有域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 转发规则名称 
     * @return RuleName 转发规则名称
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 转发规则名称
     * @param RuleName 转发规则名称
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 规则id 
     * @return RuleId 规则id
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则id
     * @param RuleId 规则id
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 转发规则类型：云上到云下DOWN、云下到云上DOWN 
     * @return RuleType 转发规则类型：云上到云下DOWN、云下到云上DOWN
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set 转发规则类型：云上到云下DOWN、云下到云上DOWN
     * @param RuleType 转发规则类型：云上到云下DOWN、云下到云上DOWN
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get 创建时间 
     * @return CreatedAt 创建时间
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 创建时间
     * @param CreatedAt 创建时间
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get 更新时间 
     * @return UpdatedAt 更新时间
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set 更新时间
     * @param UpdatedAt 更新时间
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get 终端节点名称 
     * @return EndPointName 终端节点名称
     */
    public String getEndPointName() {
        return this.EndPointName;
    }

    /**
     * Set 终端节点名称
     * @param EndPointName 终端节点名称
     */
    public void setEndPointName(String EndPointName) {
        this.EndPointName = EndPointName;
    }

    /**
     * Get 终端节点ID 
     * @return EndPointId 终端节点ID
     */
    public String getEndPointId() {
        return this.EndPointId;
    }

    /**
     * Set 终端节点ID
     * @param EndPointId 终端节点ID
     */
    public void setEndPointId(String EndPointId) {
        this.EndPointId = EndPointId;
    }

    /**
     * Get 转发地址 
     * @return ForwardAddress 转发地址
     */
    public String [] getForwardAddress() {
        return this.ForwardAddress;
    }

    /**
     * Set 转发地址
     * @param ForwardAddress 转发地址
     */
    public void setForwardAddress(String [] ForwardAddress) {
        this.ForwardAddress = ForwardAddress;
    }

    /**
     * Get 私有域绑定的vpc列表 
     * @return VpcSet 私有域绑定的vpc列表
     */
    public VpcInfo [] getVpcSet() {
        return this.VpcSet;
    }

    /**
     * Set 私有域绑定的vpc列表
     * @param VpcSet 私有域绑定的vpc列表
     */
    public void setVpcSet(VpcInfo [] VpcSet) {
        this.VpcSet = VpcSet;
    }

    /**
     * Get 绑定的私有域ID 
     * @return ZoneId 绑定的私有域ID
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 绑定的私有域ID
     * @param ZoneId 绑定的私有域ID
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 标签 
     * @return Tags 标签
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签
     * @param Tags 标签
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    public ForwardRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ForwardRule(ForwardRule source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
        if (source.EndPointName != null) {
            this.EndPointName = new String(source.EndPointName);
        }
        if (source.EndPointId != null) {
            this.EndPointId = new String(source.EndPointId);
        }
        if (source.ForwardAddress != null) {
            this.ForwardAddress = new String[source.ForwardAddress.length];
            for (int i = 0; i < source.ForwardAddress.length; i++) {
                this.ForwardAddress[i] = new String(source.ForwardAddress[i]);
            }
        }
        if (source.VpcSet != null) {
            this.VpcSet = new VpcInfo[source.VpcSet.length];
            for (int i = 0; i < source.VpcSet.length; i++) {
                this.VpcSet[i] = new VpcInfo(source.VpcSet[i]);
            }
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);
        this.setParamSimple(map, prefix + "EndPointName", this.EndPointName);
        this.setParamSimple(map, prefix + "EndPointId", this.EndPointId);
        this.setParamArraySimple(map, prefix + "ForwardAddress.", this.ForwardAddress);
        this.setParamArrayObj(map, prefix + "VpcSet.", this.VpcSet);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

