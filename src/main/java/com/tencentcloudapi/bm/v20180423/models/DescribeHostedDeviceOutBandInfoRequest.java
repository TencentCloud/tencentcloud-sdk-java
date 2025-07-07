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
package com.tencentcloudapi.bm.v20180423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeHostedDeviceOutBandInfoRequest extends AbstractModel {

    /**
    * 托管设备的唯一ID数组,数组个数不超过20
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 可用区ID
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
     * Get 托管设备的唯一ID数组,数组个数不超过20 
     * @return InstanceIds 托管设备的唯一ID数组,数组个数不超过20
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 托管设备的唯一ID数组,数组个数不超过20
     * @param InstanceIds 托管设备的唯一ID数组,数组个数不超过20
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 可用区ID 
     * @return Zone 可用区ID
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区ID
     * @param Zone 可用区ID
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    public DescribeHostedDeviceOutBandInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeHostedDeviceOutBandInfoRequest(DescribeHostedDeviceOutBandInfoRequest source) {
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "Zone", this.Zone);

    }
}

