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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePendingRiskInfoResponse extends AbstractModel{

    /**
    * 是否为付费用户，true：付费用户， false：普通用户
    */
    @SerializedName("IsPaidUsr")
    @Expose
    private Boolean IsPaidUsr;

    /**
    * 攻击中的资源数量
    */
    @SerializedName("AttackingCount")
    @Expose
    private Long AttackingCount;

    /**
    * 封堵中的资源数量
    */
    @SerializedName("BlockingCount")
    @Expose
    private Long BlockingCount;

    /**
    * 已过期的资源数量
    */
    @SerializedName("ExpiredCount")
    @Expose
    private Long ExpiredCount;

    /**
    * 所有待处理风险事件总数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 是否为付费用户，true：付费用户， false：普通用户 
     * @return IsPaidUsr 是否为付费用户，true：付费用户， false：普通用户
     */
    public Boolean getIsPaidUsr() {
        return this.IsPaidUsr;
    }

    /**
     * Set 是否为付费用户，true：付费用户， false：普通用户
     * @param IsPaidUsr 是否为付费用户，true：付费用户， false：普通用户
     */
    public void setIsPaidUsr(Boolean IsPaidUsr) {
        this.IsPaidUsr = IsPaidUsr;
    }

    /**
     * Get 攻击中的资源数量 
     * @return AttackingCount 攻击中的资源数量
     */
    public Long getAttackingCount() {
        return this.AttackingCount;
    }

    /**
     * Set 攻击中的资源数量
     * @param AttackingCount 攻击中的资源数量
     */
    public void setAttackingCount(Long AttackingCount) {
        this.AttackingCount = AttackingCount;
    }

    /**
     * Get 封堵中的资源数量 
     * @return BlockingCount 封堵中的资源数量
     */
    public Long getBlockingCount() {
        return this.BlockingCount;
    }

    /**
     * Set 封堵中的资源数量
     * @param BlockingCount 封堵中的资源数量
     */
    public void setBlockingCount(Long BlockingCount) {
        this.BlockingCount = BlockingCount;
    }

    /**
     * Get 已过期的资源数量 
     * @return ExpiredCount 已过期的资源数量
     */
    public Long getExpiredCount() {
        return this.ExpiredCount;
    }

    /**
     * Set 已过期的资源数量
     * @param ExpiredCount 已过期的资源数量
     */
    public void setExpiredCount(Long ExpiredCount) {
        this.ExpiredCount = ExpiredCount;
    }

    /**
     * Get 所有待处理风险事件总数 
     * @return Total 所有待处理风险事件总数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 所有待处理风险事件总数
     * @param Total 所有待处理风险事件总数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
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

    public DescribePendingRiskInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePendingRiskInfoResponse(DescribePendingRiskInfoResponse source) {
        if (source.IsPaidUsr != null) {
            this.IsPaidUsr = new Boolean(source.IsPaidUsr);
        }
        if (source.AttackingCount != null) {
            this.AttackingCount = new Long(source.AttackingCount);
        }
        if (source.BlockingCount != null) {
            this.BlockingCount = new Long(source.BlockingCount);
        }
        if (source.ExpiredCount != null) {
            this.ExpiredCount = new Long(source.ExpiredCount);
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsPaidUsr", this.IsPaidUsr);
        this.setParamSimple(map, prefix + "AttackingCount", this.AttackingCount);
        this.setParamSimple(map, prefix + "BlockingCount", this.BlockingCount);
        this.setParamSimple(map, prefix + "ExpiredCount", this.ExpiredCount);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

