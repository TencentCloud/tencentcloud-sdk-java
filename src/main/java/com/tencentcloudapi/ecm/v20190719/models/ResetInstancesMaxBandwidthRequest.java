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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResetInstancesMaxBandwidthRequest extends AbstractModel{

    /**
    * 待重置带宽上限的实例ID列表。在单次请求的过程中，单个region下的请求实例数上限为100。
    */
    @SerializedName("InstanceIdSet")
    @Expose
    private String [] InstanceIdSet;

    /**
    * 修改后的最大出带宽上限。
    */
    @SerializedName("MaxBandwidthOut")
    @Expose
    private Long MaxBandwidthOut;

    /**
    * 修改后的最大入带宽上限。
    */
    @SerializedName("MaxBandwidthIn")
    @Expose
    private Long MaxBandwidthIn;

    /**
     * Get 待重置带宽上限的实例ID列表。在单次请求的过程中，单个region下的请求实例数上限为100。 
     * @return InstanceIdSet 待重置带宽上限的实例ID列表。在单次请求的过程中，单个region下的请求实例数上限为100。
     */
    public String [] getInstanceIdSet() {
        return this.InstanceIdSet;
    }

    /**
     * Set 待重置带宽上限的实例ID列表。在单次请求的过程中，单个region下的请求实例数上限为100。
     * @param InstanceIdSet 待重置带宽上限的实例ID列表。在单次请求的过程中，单个region下的请求实例数上限为100。
     */
    public void setInstanceIdSet(String [] InstanceIdSet) {
        this.InstanceIdSet = InstanceIdSet;
    }

    /**
     * Get 修改后的最大出带宽上限。 
     * @return MaxBandwidthOut 修改后的最大出带宽上限。
     */
    public Long getMaxBandwidthOut() {
        return this.MaxBandwidthOut;
    }

    /**
     * Set 修改后的最大出带宽上限。
     * @param MaxBandwidthOut 修改后的最大出带宽上限。
     */
    public void setMaxBandwidthOut(Long MaxBandwidthOut) {
        this.MaxBandwidthOut = MaxBandwidthOut;
    }

    /**
     * Get 修改后的最大入带宽上限。 
     * @return MaxBandwidthIn 修改后的最大入带宽上限。
     */
    public Long getMaxBandwidthIn() {
        return this.MaxBandwidthIn;
    }

    /**
     * Set 修改后的最大入带宽上限。
     * @param MaxBandwidthIn 修改后的最大入带宽上限。
     */
    public void setMaxBandwidthIn(Long MaxBandwidthIn) {
        this.MaxBandwidthIn = MaxBandwidthIn;
    }

    public ResetInstancesMaxBandwidthRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResetInstancesMaxBandwidthRequest(ResetInstancesMaxBandwidthRequest source) {
        if (source.InstanceIdSet != null) {
            this.InstanceIdSet = new String[source.InstanceIdSet.length];
            for (int i = 0; i < source.InstanceIdSet.length; i++) {
                this.InstanceIdSet[i] = new String(source.InstanceIdSet[i]);
            }
        }
        if (source.MaxBandwidthOut != null) {
            this.MaxBandwidthOut = new Long(source.MaxBandwidthOut);
        }
        if (source.MaxBandwidthIn != null) {
            this.MaxBandwidthIn = new Long(source.MaxBandwidthIn);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIdSet.", this.InstanceIdSet);
        this.setParamSimple(map, prefix + "MaxBandwidthOut", this.MaxBandwidthOut);
        this.setParamSimple(map, prefix + "MaxBandwidthIn", this.MaxBandwidthIn);

    }
}

