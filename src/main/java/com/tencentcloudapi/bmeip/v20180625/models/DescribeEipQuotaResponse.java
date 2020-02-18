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
package com.tencentcloudapi.bmeip.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEipQuotaResponse extends AbstractModel{

    /**
    * 能拥有的EIP个数的总配额，默认是100个
    */
    @SerializedName("EipNumQuota")
    @Expose
    private Long EipNumQuota;

    /**
    * 当前已使用的EIP个数，包括创建中、绑定中、已绑定、解绑中、未绑定几种状态的EIP个数总和
    */
    @SerializedName("CurrentEipNum")
    @Expose
    private Long CurrentEipNum;

    /**
    * 当天申请EIP次数
    */
    @SerializedName("DailyApplyCount")
    @Expose
    private Long DailyApplyCount;

    /**
    * 每日申请EIP的次数限制
    */
    @SerializedName("DailyApplyQuota")
    @Expose
    private Long DailyApplyQuota;

    /**
    * BatchApplyMax
    */
    @SerializedName("BatchApplyMax")
    @Expose
    private Long BatchApplyMax;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 能拥有的EIP个数的总配额，默认是100个 
     * @return EipNumQuota 能拥有的EIP个数的总配额，默认是100个
     */
    public Long getEipNumQuota() {
        return this.EipNumQuota;
    }

    /**
     * Set 能拥有的EIP个数的总配额，默认是100个
     * @param EipNumQuota 能拥有的EIP个数的总配额，默认是100个
     */
    public void setEipNumQuota(Long EipNumQuota) {
        this.EipNumQuota = EipNumQuota;
    }

    /**
     * Get 当前已使用的EIP个数，包括创建中、绑定中、已绑定、解绑中、未绑定几种状态的EIP个数总和 
     * @return CurrentEipNum 当前已使用的EIP个数，包括创建中、绑定中、已绑定、解绑中、未绑定几种状态的EIP个数总和
     */
    public Long getCurrentEipNum() {
        return this.CurrentEipNum;
    }

    /**
     * Set 当前已使用的EIP个数，包括创建中、绑定中、已绑定、解绑中、未绑定几种状态的EIP个数总和
     * @param CurrentEipNum 当前已使用的EIP个数，包括创建中、绑定中、已绑定、解绑中、未绑定几种状态的EIP个数总和
     */
    public void setCurrentEipNum(Long CurrentEipNum) {
        this.CurrentEipNum = CurrentEipNum;
    }

    /**
     * Get 当天申请EIP次数 
     * @return DailyApplyCount 当天申请EIP次数
     */
    public Long getDailyApplyCount() {
        return this.DailyApplyCount;
    }

    /**
     * Set 当天申请EIP次数
     * @param DailyApplyCount 当天申请EIP次数
     */
    public void setDailyApplyCount(Long DailyApplyCount) {
        this.DailyApplyCount = DailyApplyCount;
    }

    /**
     * Get 每日申请EIP的次数限制 
     * @return DailyApplyQuota 每日申请EIP的次数限制
     */
    public Long getDailyApplyQuota() {
        return this.DailyApplyQuota;
    }

    /**
     * Set 每日申请EIP的次数限制
     * @param DailyApplyQuota 每日申请EIP的次数限制
     */
    public void setDailyApplyQuota(Long DailyApplyQuota) {
        this.DailyApplyQuota = DailyApplyQuota;
    }

    /**
     * Get BatchApplyMax 
     * @return BatchApplyMax BatchApplyMax
     */
    public Long getBatchApplyMax() {
        return this.BatchApplyMax;
    }

    /**
     * Set BatchApplyMax
     * @param BatchApplyMax BatchApplyMax
     */
    public void setBatchApplyMax(Long BatchApplyMax) {
        this.BatchApplyMax = BatchApplyMax;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EipNumQuota", this.EipNumQuota);
        this.setParamSimple(map, prefix + "CurrentEipNum", this.CurrentEipNum);
        this.setParamSimple(map, prefix + "DailyApplyCount", this.DailyApplyCount);
        this.setParamSimple(map, prefix + "DailyApplyQuota", this.DailyApplyQuota);
        this.setParamSimple(map, prefix + "BatchApplyMax", this.BatchApplyMax);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

