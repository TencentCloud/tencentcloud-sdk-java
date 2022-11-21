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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeActiveCarrierPrivilegeNumberResponse extends AbstractModel{

    /**
    * 总数量
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 生效列表
    */
    @SerializedName("ActiveCarrierPrivilegeNumbers")
    @Expose
    private ActiveCarrierPrivilegeNumber [] ActiveCarrierPrivilegeNumbers;

    /**
    * 待审核单号
    */
    @SerializedName("PendingApplicantIds")
    @Expose
    private Long [] PendingApplicantIds;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 总数量 
     * @return TotalCount 总数量
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总数量
     * @param TotalCount 总数量
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 生效列表 
     * @return ActiveCarrierPrivilegeNumbers 生效列表
     */
    public ActiveCarrierPrivilegeNumber [] getActiveCarrierPrivilegeNumbers() {
        return this.ActiveCarrierPrivilegeNumbers;
    }

    /**
     * Set 生效列表
     * @param ActiveCarrierPrivilegeNumbers 生效列表
     */
    public void setActiveCarrierPrivilegeNumbers(ActiveCarrierPrivilegeNumber [] ActiveCarrierPrivilegeNumbers) {
        this.ActiveCarrierPrivilegeNumbers = ActiveCarrierPrivilegeNumbers;
    }

    /**
     * Get 待审核单号 
     * @return PendingApplicantIds 待审核单号
     */
    public Long [] getPendingApplicantIds() {
        return this.PendingApplicantIds;
    }

    /**
     * Set 待审核单号
     * @param PendingApplicantIds 待审核单号
     */
    public void setPendingApplicantIds(Long [] PendingApplicantIds) {
        this.PendingApplicantIds = PendingApplicantIds;
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

    public DescribeActiveCarrierPrivilegeNumberResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeActiveCarrierPrivilegeNumberResponse(DescribeActiveCarrierPrivilegeNumberResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.ActiveCarrierPrivilegeNumbers != null) {
            this.ActiveCarrierPrivilegeNumbers = new ActiveCarrierPrivilegeNumber[source.ActiveCarrierPrivilegeNumbers.length];
            for (int i = 0; i < source.ActiveCarrierPrivilegeNumbers.length; i++) {
                this.ActiveCarrierPrivilegeNumbers[i] = new ActiveCarrierPrivilegeNumber(source.ActiveCarrierPrivilegeNumbers[i]);
            }
        }
        if (source.PendingApplicantIds != null) {
            this.PendingApplicantIds = new Long[source.PendingApplicantIds.length];
            for (int i = 0; i < source.PendingApplicantIds.length; i++) {
                this.PendingApplicantIds[i] = new Long(source.PendingApplicantIds[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "ActiveCarrierPrivilegeNumbers.", this.ActiveCarrierPrivilegeNumbers);
        this.setParamArraySimple(map, prefix + "PendingApplicantIds.", this.PendingApplicantIds);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

