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
package com.tencentcloudapi.tdid.v20210519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetPolicyListResponse extends AbstractModel{

    /**
    * 策略Policy管理列表
    */
    @SerializedName("PolicyDataList")
    @Expose
    private Policy [] PolicyDataList;

    /**
    * 总数
    */
    @SerializedName("AllCount")
    @Expose
    private Long AllCount;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 策略Policy管理列表 
     * @return PolicyDataList 策略Policy管理列表
     */
    public Policy [] getPolicyDataList() {
        return this.PolicyDataList;
    }

    /**
     * Set 策略Policy管理列表
     * @param PolicyDataList 策略Policy管理列表
     */
    public void setPolicyDataList(Policy [] PolicyDataList) {
        this.PolicyDataList = PolicyDataList;
    }

    /**
     * Get 总数 
     * @return AllCount 总数
     */
    public Long getAllCount() {
        return this.AllCount;
    }

    /**
     * Set 总数
     * @param AllCount 总数
     */
    public void setAllCount(Long AllCount) {
        this.AllCount = AllCount;
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

    public GetPolicyListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetPolicyListResponse(GetPolicyListResponse source) {
        if (source.PolicyDataList != null) {
            this.PolicyDataList = new Policy[source.PolicyDataList.length];
            for (int i = 0; i < source.PolicyDataList.length; i++) {
                this.PolicyDataList[i] = new Policy(source.PolicyDataList[i]);
            }
        }
        if (source.AllCount != null) {
            this.AllCount = new Long(source.AllCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "PolicyDataList.", this.PolicyDataList);
        this.setParamSimple(map, prefix + "AllCount", this.AllCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

