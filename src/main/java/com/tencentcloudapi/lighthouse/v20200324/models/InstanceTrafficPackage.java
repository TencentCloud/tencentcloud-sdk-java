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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceTrafficPackage extends AbstractModel {

    /**
    * 实例ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 流量包详情列表。
    */
    @SerializedName("TrafficPackageSet")
    @Expose
    private TrafficPackage [] TrafficPackageSet;

    /**
     * Get 实例ID。 
     * @return InstanceId 实例ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID。
     * @param InstanceId 实例ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 流量包详情列表。 
     * @return TrafficPackageSet 流量包详情列表。
     */
    public TrafficPackage [] getTrafficPackageSet() {
        return this.TrafficPackageSet;
    }

    /**
     * Set 流量包详情列表。
     * @param TrafficPackageSet 流量包详情列表。
     */
    public void setTrafficPackageSet(TrafficPackage [] TrafficPackageSet) {
        this.TrafficPackageSet = TrafficPackageSet;
    }

    public InstanceTrafficPackage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceTrafficPackage(InstanceTrafficPackage source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.TrafficPackageSet != null) {
            this.TrafficPackageSet = new TrafficPackage[source.TrafficPackageSet.length];
            for (int i = 0; i < source.TrafficPackageSet.length; i++) {
                this.TrafficPackageSet[i] = new TrafficPackage(source.TrafficPackageSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "TrafficPackageSet.", this.TrafficPackageSet);

    }
}

