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

public class OperateRiskRequest extends AbstractModel {

    /**
    * <p>风险规则ID</p>
    */
    @SerializedName("RiskRuleId")
    @Expose
    private String RiskRuleId;

    /**
    * <p>风险ID集合</p>
    */
    @SerializedName("RiskIdList")
    @Expose
    private Long [] RiskIdList;

    /**
    * <p>操作类型</p>
    */
    @SerializedName("OperationType")
    @Expose
    private String OperationType;

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>风险忽略原因</p>
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
     * Get <p>风险规则ID</p> 
     * @return RiskRuleId <p>风险规则ID</p>
     */
    public String getRiskRuleId() {
        return this.RiskRuleId;
    }

    /**
     * Set <p>风险规则ID</p>
     * @param RiskRuleId <p>风险规则ID</p>
     */
    public void setRiskRuleId(String RiskRuleId) {
        this.RiskRuleId = RiskRuleId;
    }

    /**
     * Get <p>风险ID集合</p> 
     * @return RiskIdList <p>风险ID集合</p>
     */
    public Long [] getRiskIdList() {
        return this.RiskIdList;
    }

    /**
     * Set <p>风险ID集合</p>
     * @param RiskIdList <p>风险ID集合</p>
     */
    public void setRiskIdList(Long [] RiskIdList) {
        this.RiskIdList = RiskIdList;
    }

    /**
     * Get <p>操作类型</p> 
     * @return OperationType <p>操作类型</p>
     */
    public String getOperationType() {
        return this.OperationType;
    }

    /**
     * Set <p>操作类型</p>
     * @param OperationType <p>操作类型</p>
     */
    public void setOperationType(String OperationType) {
        this.OperationType = OperationType;
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
     * Get <p>风险忽略原因</p> 
     * @return Reason <p>风险忽略原因</p>
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set <p>风险忽略原因</p>
     * @param Reason <p>风险忽略原因</p>
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    public OperateRiskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OperateRiskRequest(OperateRiskRequest source) {
        if (source.RiskRuleId != null) {
            this.RiskRuleId = new String(source.RiskRuleId);
        }
        if (source.RiskIdList != null) {
            this.RiskIdList = new Long[source.RiskIdList.length];
            for (int i = 0; i < source.RiskIdList.length; i++) {
                this.RiskIdList[i] = new Long(source.RiskIdList[i]);
            }
        }
        if (source.OperationType != null) {
            this.OperationType = new String(source.OperationType);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RiskRuleId", this.RiskRuleId);
        this.setParamArraySimple(map, prefix + "RiskIdList.", this.RiskIdList);
        this.setParamSimple(map, prefix + "OperationType", this.OperationType);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "Reason", this.Reason);

    }
}

