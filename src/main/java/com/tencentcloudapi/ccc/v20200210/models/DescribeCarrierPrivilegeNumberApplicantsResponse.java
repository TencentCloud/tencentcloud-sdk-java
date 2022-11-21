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

public class DescribeCarrierPrivilegeNumberApplicantsResponse extends AbstractModel{

    /**
    * 筛选出的总申请单数量
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 申请单列表
    */
    @SerializedName("Applicants")
    @Expose
    private CarrierPrivilegeNumberApplicant [] Applicants;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 筛选出的总申请单数量 
     * @return TotalCount 筛选出的总申请单数量
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 筛选出的总申请单数量
     * @param TotalCount 筛选出的总申请单数量
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 申请单列表 
     * @return Applicants 申请单列表
     */
    public CarrierPrivilegeNumberApplicant [] getApplicants() {
        return this.Applicants;
    }

    /**
     * Set 申请单列表
     * @param Applicants 申请单列表
     */
    public void setApplicants(CarrierPrivilegeNumberApplicant [] Applicants) {
        this.Applicants = Applicants;
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

    public DescribeCarrierPrivilegeNumberApplicantsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCarrierPrivilegeNumberApplicantsResponse(DescribeCarrierPrivilegeNumberApplicantsResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Applicants != null) {
            this.Applicants = new CarrierPrivilegeNumberApplicant[source.Applicants.length];
            for (int i = 0; i < source.Applicants.length; i++) {
                this.Applicants[i] = new CarrierPrivilegeNumberApplicant(source.Applicants[i]);
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
        this.setParamArrayObj(map, prefix + "Applicants.", this.Applicants);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

