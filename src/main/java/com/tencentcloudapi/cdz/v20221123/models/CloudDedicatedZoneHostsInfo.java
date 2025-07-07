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
package com.tencentcloudapi.cdz.v20221123.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudDedicatedZoneHostsInfo extends AbstractModel {

    /**
    * Host的唯一标识uuid
    */
    @SerializedName("HostUuid")
    @Expose
    private String HostUuid;

    /**
    * 实例名称数组
    */
    @SerializedName("InstancesInfo")
    @Expose
    private String [] InstancesInfo;

    /**
     * Get Host的唯一标识uuid 
     * @return HostUuid Host的唯一标识uuid
     */
    public String getHostUuid() {
        return this.HostUuid;
    }

    /**
     * Set Host的唯一标识uuid
     * @param HostUuid Host的唯一标识uuid
     */
    public void setHostUuid(String HostUuid) {
        this.HostUuid = HostUuid;
    }

    /**
     * Get 实例名称数组 
     * @return InstancesInfo 实例名称数组
     */
    public String [] getInstancesInfo() {
        return this.InstancesInfo;
    }

    /**
     * Set 实例名称数组
     * @param InstancesInfo 实例名称数组
     */
    public void setInstancesInfo(String [] InstancesInfo) {
        this.InstancesInfo = InstancesInfo;
    }

    public CloudDedicatedZoneHostsInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudDedicatedZoneHostsInfo(CloudDedicatedZoneHostsInfo source) {
        if (source.HostUuid != null) {
            this.HostUuid = new String(source.HostUuid);
        }
        if (source.InstancesInfo != null) {
            this.InstancesInfo = new String[source.InstancesInfo.length];
            for (int i = 0; i < source.InstancesInfo.length; i++) {
                this.InstancesInfo[i] = new String(source.InstancesInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HostUuid", this.HostUuid);
        this.setParamArraySimple(map, prefix + "InstancesInfo.", this.InstancesInfo);

    }
}

