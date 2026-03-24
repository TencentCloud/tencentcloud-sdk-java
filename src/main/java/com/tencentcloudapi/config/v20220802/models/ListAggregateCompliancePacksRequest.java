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

public class ListAggregateCompliancePacksRequest extends AbstractModel {

    /**
    * 数量
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 账号组ID
    */
    @SerializedName("AccountGroupId")
    @Expose
    private String AccountGroupId;

    /**
    * 合规包名称
    */
    @SerializedName("CompliancePackName")
    @Expose
    private String CompliancePackName;

    /**
    * 风险等级
1：高风险。
2：中风险。
3：低风险。
    */
    @SerializedName("RiskLevel")
    @Expose
    private Long [] RiskLevel;

    /**
    * 合规包状态 ACTIVE、NO_ACTIVE
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 评估状态合规： 'COMPLIANT'
不合规： 'NON_COMPLIANT'
    */
    @SerializedName("ComplianceResult")
    @Expose
    private String [] ComplianceResult;

    /**
    * 排序类型, 倒序：desc，顺序：asc
    */
    @SerializedName("OrderType")
    @Expose
    private String OrderType;

    /**
     * Get 数量 
     * @return Limit 数量
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 数量
     * @param Limit 数量
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量 
     * @return Offset 偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量
     * @param Offset 偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 账号组ID 
     * @return AccountGroupId 账号组ID
     */
    public String getAccountGroupId() {
        return this.AccountGroupId;
    }

    /**
     * Set 账号组ID
     * @param AccountGroupId 账号组ID
     */
    public void setAccountGroupId(String AccountGroupId) {
        this.AccountGroupId = AccountGroupId;
    }

    /**
     * Get 合规包名称 
     * @return CompliancePackName 合规包名称
     */
    public String getCompliancePackName() {
        return this.CompliancePackName;
    }

    /**
     * Set 合规包名称
     * @param CompliancePackName 合规包名称
     */
    public void setCompliancePackName(String CompliancePackName) {
        this.CompliancePackName = CompliancePackName;
    }

    /**
     * Get 风险等级
1：高风险。
2：中风险。
3：低风险。 
     * @return RiskLevel 风险等级
1：高风险。
2：中风险。
3：低风险。
     */
    public Long [] getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set 风险等级
1：高风险。
2：中风险。
3：低风险。
     * @param RiskLevel 风险等级
1：高风险。
2：中风险。
3：低风险。
     */
    public void setRiskLevel(Long [] RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get 合规包状态 ACTIVE、NO_ACTIVE 
     * @return Status 合规包状态 ACTIVE、NO_ACTIVE
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 合规包状态 ACTIVE、NO_ACTIVE
     * @param Status 合规包状态 ACTIVE、NO_ACTIVE
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 评估状态合规： 'COMPLIANT'
不合规： 'NON_COMPLIANT' 
     * @return ComplianceResult 评估状态合规： 'COMPLIANT'
不合规： 'NON_COMPLIANT'
     */
    public String [] getComplianceResult() {
        return this.ComplianceResult;
    }

    /**
     * Set 评估状态合规： 'COMPLIANT'
不合规： 'NON_COMPLIANT'
     * @param ComplianceResult 评估状态合规： 'COMPLIANT'
不合规： 'NON_COMPLIANT'
     */
    public void setComplianceResult(String [] ComplianceResult) {
        this.ComplianceResult = ComplianceResult;
    }

    /**
     * Get 排序类型, 倒序：desc，顺序：asc 
     * @return OrderType 排序类型, 倒序：desc，顺序：asc
     */
    public String getOrderType() {
        return this.OrderType;
    }

    /**
     * Set 排序类型, 倒序：desc，顺序：asc
     * @param OrderType 排序类型, 倒序：desc，顺序：asc
     */
    public void setOrderType(String OrderType) {
        this.OrderType = OrderType;
    }

    public ListAggregateCompliancePacksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListAggregateCompliancePacksRequest(ListAggregateCompliancePacksRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.AccountGroupId != null) {
            this.AccountGroupId = new String(source.AccountGroupId);
        }
        if (source.CompliancePackName != null) {
            this.CompliancePackName = new String(source.CompliancePackName);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new Long[source.RiskLevel.length];
            for (int i = 0; i < source.RiskLevel.length; i++) {
                this.RiskLevel[i] = new Long(source.RiskLevel[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ComplianceResult != null) {
            this.ComplianceResult = new String[source.ComplianceResult.length];
            for (int i = 0; i < source.ComplianceResult.length; i++) {
                this.ComplianceResult[i] = new String(source.ComplianceResult[i]);
            }
        }
        if (source.OrderType != null) {
            this.OrderType = new String(source.OrderType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "AccountGroupId", this.AccountGroupId);
        this.setParamSimple(map, prefix + "CompliancePackName", this.CompliancePackName);
        this.setParamArraySimple(map, prefix + "RiskLevel.", this.RiskLevel);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "ComplianceResult.", this.ComplianceResult);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);

    }
}

