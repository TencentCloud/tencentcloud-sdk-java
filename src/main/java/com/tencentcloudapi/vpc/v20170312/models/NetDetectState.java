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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NetDetectState extends AbstractModel {

    /**
    * 网络探测实例ID。形如：netd-12345678。
    */
    @SerializedName("NetDetectId")
    @Expose
    private String NetDetectId;

    /**
    * 网络探测目的IP验证结果对象数组。
    */
    @SerializedName("NetDetectIpStateSet")
    @Expose
    private NetDetectIpState [] NetDetectIpStateSet;

    /**
     * Get 网络探测实例ID。形如：netd-12345678。 
     * @return NetDetectId 网络探测实例ID。形如：netd-12345678。
     */
    public String getNetDetectId() {
        return this.NetDetectId;
    }

    /**
     * Set 网络探测实例ID。形如：netd-12345678。
     * @param NetDetectId 网络探测实例ID。形如：netd-12345678。
     */
    public void setNetDetectId(String NetDetectId) {
        this.NetDetectId = NetDetectId;
    }

    /**
     * Get 网络探测目的IP验证结果对象数组。 
     * @return NetDetectIpStateSet 网络探测目的IP验证结果对象数组。
     */
    public NetDetectIpState [] getNetDetectIpStateSet() {
        return this.NetDetectIpStateSet;
    }

    /**
     * Set 网络探测目的IP验证结果对象数组。
     * @param NetDetectIpStateSet 网络探测目的IP验证结果对象数组。
     */
    public void setNetDetectIpStateSet(NetDetectIpState [] NetDetectIpStateSet) {
        this.NetDetectIpStateSet = NetDetectIpStateSet;
    }

    public NetDetectState() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NetDetectState(NetDetectState source) {
        if (source.NetDetectId != null) {
            this.NetDetectId = new String(source.NetDetectId);
        }
        if (source.NetDetectIpStateSet != null) {
            this.NetDetectIpStateSet = new NetDetectIpState[source.NetDetectIpStateSet.length];
            for (int i = 0; i < source.NetDetectIpStateSet.length; i++) {
                this.NetDetectIpStateSet[i] = new NetDetectIpState(source.NetDetectIpStateSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NetDetectId", this.NetDetectId);
        this.setParamArrayObj(map, prefix + "NetDetectIpStateSet.", this.NetDetectIpStateSet);

    }
}

