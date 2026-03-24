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
package com.tencentcloudapi.config.v20220802.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListAggregateConfigRuleEvaluationResultsRequest extends AbstractModel {

    /**
    * <p>规则ID</p>
    */
    @SerializedName("ConfigRuleId")
    @Expose
    private String ConfigRuleId;

    /**
    * <p>偏移量</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>当前页</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>账号组ID</p>
    */
    @SerializedName("AccountGroupId")
    @Expose
    private String AccountGroupId;

    /**
    * <p>类型</p>
    */
    @SerializedName("ResourceType")
    @Expose
    private String [] ResourceType;

    /**
    * <p>评估结果 COMPLIANT：合规   NON_COMPLIANT：不合规</p>
    */
    @SerializedName("ComplianceType")
    @Expose
    private String [] ComplianceType;

    /**
    * <p>资源所属用户ID</p>
    */
    @SerializedName("ResourceOwnerId")
    @Expose
    private Long ResourceOwnerId;

    /**
    * <p>筛选的资源拥有者uin集合</p>
    */
    @SerializedName("ResourceOwnerIds")
    @Expose
    private Long [] ResourceOwnerIds;

    /**
     * Get <p>规则ID</p> 
     * @return ConfigRuleId <p>规则ID</p>
     */
    public String getConfigRuleId() {
        return this.ConfigRuleId;
    }

    /**
     * Set <p>规则ID</p>
     * @param ConfigRuleId <p>规则ID</p>
     */
    public void setConfigRuleId(String ConfigRuleId) {
        this.ConfigRuleId = ConfigRuleId;
    }

    /**
     * Get <p>偏移量</p> 
     * @return Limit <p>偏移量</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>偏移量</p>
     * @param Limit <p>偏移量</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>当前页</p> 
     * @return Offset <p>当前页</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>当前页</p>
     * @param Offset <p>当前页</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>账号组ID</p> 
     * @return AccountGroupId <p>账号组ID</p>
     */
    public String getAccountGroupId() {
        return this.AccountGroupId;
    }

    /**
     * Set <p>账号组ID</p>
     * @param AccountGroupId <p>账号组ID</p>
     */
    public void setAccountGroupId(String AccountGroupId) {
        this.AccountGroupId = AccountGroupId;
    }

    /**
     * Get <p>类型</p> 
     * @return ResourceType <p>类型</p>
     */
    public String [] getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set <p>类型</p>
     * @param ResourceType <p>类型</p>
     */
    public void setResourceType(String [] ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get <p>评估结果 COMPLIANT：合规   NON_COMPLIANT：不合规</p> 
     * @return ComplianceType <p>评估结果 COMPLIANT：合规   NON_COMPLIANT：不合规</p>
     */
    public String [] getComplianceType() {
        return this.ComplianceType;
    }

    /**
     * Set <p>评估结果 COMPLIANT：合规   NON_COMPLIANT：不合规</p>
     * @param ComplianceType <p>评估结果 COMPLIANT：合规   NON_COMPLIANT：不合规</p>
     */
    public void setComplianceType(String [] ComplianceType) {
        this.ComplianceType = ComplianceType;
    }

    /**
     * Get <p>资源所属用户ID</p> 
     * @return ResourceOwnerId <p>资源所属用户ID</p>
     */
    public Long getResourceOwnerId() {
        return this.ResourceOwnerId;
    }

    /**
     * Set <p>资源所属用户ID</p>
     * @param ResourceOwnerId <p>资源所属用户ID</p>
     */
    public void setResourceOwnerId(Long ResourceOwnerId) {
        this.ResourceOwnerId = ResourceOwnerId;
    }

    /**
     * Get <p>筛选的资源拥有者uin集合</p> 
     * @return ResourceOwnerIds <p>筛选的资源拥有者uin集合</p>
     */
    public Long [] getResourceOwnerIds() {
        return this.ResourceOwnerIds;
    }

    /**
     * Set <p>筛选的资源拥有者uin集合</p>
     * @param ResourceOwnerIds <p>筛选的资源拥有者uin集合</p>
     */
    public void setResourceOwnerIds(Long [] ResourceOwnerIds) {
        this.ResourceOwnerIds = ResourceOwnerIds;
    }

    public ListAggregateConfigRuleEvaluationResultsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListAggregateConfigRuleEvaluationResultsRequest(ListAggregateConfigRuleEvaluationResultsRequest source) {
        if (source.ConfigRuleId != null) {
            this.ConfigRuleId = new String(source.ConfigRuleId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.AccountGroupId != null) {
            this.AccountGroupId = new String(source.AccountGroupId);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String[source.ResourceType.length];
            for (int i = 0; i < source.ResourceType.length; i++) {
                this.ResourceType[i] = new String(source.ResourceType[i]);
            }
        }
        if (source.ComplianceType != null) {
            this.ComplianceType = new String[source.ComplianceType.length];
            for (int i = 0; i < source.ComplianceType.length; i++) {
                this.ComplianceType[i] = new String(source.ComplianceType[i]);
            }
        }
        if (source.ResourceOwnerId != null) {
            this.ResourceOwnerId = new Long(source.ResourceOwnerId);
        }
        if (source.ResourceOwnerIds != null) {
            this.ResourceOwnerIds = new Long[source.ResourceOwnerIds.length];
            for (int i = 0; i < source.ResourceOwnerIds.length; i++) {
                this.ResourceOwnerIds[i] = new Long(source.ResourceOwnerIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConfigRuleId", this.ConfigRuleId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "AccountGroupId", this.AccountGroupId);
        this.setParamArraySimple(map, prefix + "ResourceType.", this.ResourceType);
        this.setParamArraySimple(map, prefix + "ComplianceType.", this.ComplianceType);
        this.setParamSimple(map, prefix + "ResourceOwnerId", this.ResourceOwnerId);
        this.setParamArraySimple(map, prefix + "ResourceOwnerIds.", this.ResourceOwnerIds);

    }
}

