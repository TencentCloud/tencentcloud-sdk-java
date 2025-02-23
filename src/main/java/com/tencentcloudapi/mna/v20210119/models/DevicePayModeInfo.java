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
package com.tencentcloudapi.mna.v20210119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DevicePayModeInfo extends AbstractModel {

    /**
    * 设备ID
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * 付费模式。
1：预付费流量包
0：按流量后付费
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * 付费模式描述
    */
    @SerializedName("PayModeDesc")
    @Expose
    private String PayModeDesc;

    /**
    * 流量包ID，仅当付费模式为流量包类型时才有。
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
     * Get 设备ID 
     * @return DeviceId 设备ID
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set 设备ID
     * @param DeviceId 设备ID
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get 付费模式。
1：预付费流量包
0：按流量后付费 
     * @return PayMode 付费模式。
1：预付费流量包
0：按流量后付费
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 付费模式。
1：预付费流量包
0：按流量后付费
     * @param PayMode 付费模式。
1：预付费流量包
0：按流量后付费
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 付费模式描述 
     * @return PayModeDesc 付费模式描述
     */
    public String getPayModeDesc() {
        return this.PayModeDesc;
    }

    /**
     * Set 付费模式描述
     * @param PayModeDesc 付费模式描述
     */
    public void setPayModeDesc(String PayModeDesc) {
        this.PayModeDesc = PayModeDesc;
    }

    /**
     * Get 流量包ID，仅当付费模式为流量包类型时才有。 
     * @return ResourceId 流量包ID，仅当付费模式为流量包类型时才有。
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 流量包ID，仅当付费模式为流量包类型时才有。
     * @param ResourceId 流量包ID，仅当付费模式为流量包类型时才有。
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    public DevicePayModeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DevicePayModeInfo(DevicePayModeInfo source) {
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.PayModeDesc != null) {
            this.PayModeDesc = new String(source.PayModeDesc);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "PayModeDesc", this.PayModeDesc);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);

    }
}

