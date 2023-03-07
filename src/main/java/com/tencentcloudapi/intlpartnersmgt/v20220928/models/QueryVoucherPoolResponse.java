/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.intlpartnersmgt.v20220928.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryVoucherPoolResponse extends AbstractModel{

    /**
    * 经销商姓名
    */
    @SerializedName("AgentName")
    @Expose
    private String AgentName;

    /**
    * 经销商角色类型：1:经销商 2:总经销商 3:二级经销商
    */
    @SerializedName("AccountType")
    @Expose
    private Long AccountType;

    /**
    * 总额度
    */
    @SerializedName("TotalQuota")
    @Expose
    private Float TotalQuota;

    /**
    * 剩余额度
    */
    @SerializedName("RemainingQuota")
    @Expose
    private Float RemainingQuota;

    /**
    * 已发放的代金券数量
    */
    @SerializedName("IssuedNum")
    @Expose
    private Long IssuedNum;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 经销商姓名 
     * @return AgentName 经销商姓名
     */
    public String getAgentName() {
        return this.AgentName;
    }

    /**
     * Set 经销商姓名
     * @param AgentName 经销商姓名
     */
    public void setAgentName(String AgentName) {
        this.AgentName = AgentName;
    }

    /**
     * Get 经销商角色类型：1:经销商 2:总经销商 3:二级经销商 
     * @return AccountType 经销商角色类型：1:经销商 2:总经销商 3:二级经销商
     */
    public Long getAccountType() {
        return this.AccountType;
    }

    /**
     * Set 经销商角色类型：1:经销商 2:总经销商 3:二级经销商
     * @param AccountType 经销商角色类型：1:经销商 2:总经销商 3:二级经销商
     */
    public void setAccountType(Long AccountType) {
        this.AccountType = AccountType;
    }

    /**
     * Get 总额度 
     * @return TotalQuota 总额度
     */
    public Float getTotalQuota() {
        return this.TotalQuota;
    }

    /**
     * Set 总额度
     * @param TotalQuota 总额度
     */
    public void setTotalQuota(Float TotalQuota) {
        this.TotalQuota = TotalQuota;
    }

    /**
     * Get 剩余额度 
     * @return RemainingQuota 剩余额度
     */
    public Float getRemainingQuota() {
        return this.RemainingQuota;
    }

    /**
     * Set 剩余额度
     * @param RemainingQuota 剩余额度
     */
    public void setRemainingQuota(Float RemainingQuota) {
        this.RemainingQuota = RemainingQuota;
    }

    /**
     * Get 已发放的代金券数量 
     * @return IssuedNum 已发放的代金券数量
     */
    public Long getIssuedNum() {
        return this.IssuedNum;
    }

    /**
     * Set 已发放的代金券数量
     * @param IssuedNum 已发放的代金券数量
     */
    public void setIssuedNum(Long IssuedNum) {
        this.IssuedNum = IssuedNum;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public QueryVoucherPoolResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryVoucherPoolResponse(QueryVoucherPoolResponse source) {
        if (source.AgentName != null) {
            this.AgentName = new String(source.AgentName);
        }
        if (source.AccountType != null) {
            this.AccountType = new Long(source.AccountType);
        }
        if (source.TotalQuota != null) {
            this.TotalQuota = new Float(source.TotalQuota);
        }
        if (source.RemainingQuota != null) {
            this.RemainingQuota = new Float(source.RemainingQuota);
        }
        if (source.IssuedNum != null) {
            this.IssuedNum = new Long(source.IssuedNum);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AgentName", this.AgentName);
        this.setParamSimple(map, prefix + "AccountType", this.AccountType);
        this.setParamSimple(map, prefix + "TotalQuota", this.TotalQuota);
        this.setParamSimple(map, prefix + "RemainingQuota", this.RemainingQuota);
        this.setParamSimple(map, prefix + "IssuedNum", this.IssuedNum);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

