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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePostNodeResourcesResponse extends AbstractModel{

    /**
    * Pod详情
    */
    @SerializedName("PodSet")
    @Expose
    private SuperNodeResource [] PodSet;

    /**
    * 预留券详情
    */
    @SerializedName("ReservedInstanceSet")
    @Expose
    private SuperNodeResource [] ReservedInstanceSet;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Pod详情 
     * @return PodSet Pod详情
     */
    public SuperNodeResource [] getPodSet() {
        return this.PodSet;
    }

    /**
     * Set Pod详情
     * @param PodSet Pod详情
     */
    public void setPodSet(SuperNodeResource [] PodSet) {
        this.PodSet = PodSet;
    }

    /**
     * Get 预留券详情 
     * @return ReservedInstanceSet 预留券详情
     */
    public SuperNodeResource [] getReservedInstanceSet() {
        return this.ReservedInstanceSet;
    }

    /**
     * Set 预留券详情
     * @param ReservedInstanceSet 预留券详情
     */
    public void setReservedInstanceSet(SuperNodeResource [] ReservedInstanceSet) {
        this.ReservedInstanceSet = ReservedInstanceSet;
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

    public DescribePostNodeResourcesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePostNodeResourcesResponse(DescribePostNodeResourcesResponse source) {
        if (source.PodSet != null) {
            this.PodSet = new SuperNodeResource[source.PodSet.length];
            for (int i = 0; i < source.PodSet.length; i++) {
                this.PodSet[i] = new SuperNodeResource(source.PodSet[i]);
            }
        }
        if (source.ReservedInstanceSet != null) {
            this.ReservedInstanceSet = new SuperNodeResource[source.ReservedInstanceSet.length];
            for (int i = 0; i < source.ReservedInstanceSet.length; i++) {
                this.ReservedInstanceSet[i] = new SuperNodeResource(source.ReservedInstanceSet[i]);
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
        this.setParamArrayObj(map, prefix + "PodSet.", this.PodSet);
        this.setParamArrayObj(map, prefix + "ReservedInstanceSet.", this.ReservedInstanceSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

