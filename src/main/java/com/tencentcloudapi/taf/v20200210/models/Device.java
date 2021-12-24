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
package com.tencentcloudapi.taf.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Device extends AbstractModel{

    /**
    * 业务入参id
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * 业务入参类型
    */
    @SerializedName("DeviceType")
    @Expose
    private Long DeviceType;

    /**
     * Get 业务入参id 
     * @return DeviceId 业务入参id
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set 业务入参id
     * @param DeviceId 业务入参id
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get 业务入参类型 
     * @return DeviceType 业务入参类型
     */
    public Long getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set 业务入参类型
     * @param DeviceType 业务入参类型
     */
    public void setDeviceType(Long DeviceType) {
        this.DeviceType = DeviceType;
    }

    public Device() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Device(Device source) {
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new Long(source.DeviceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);

    }
}

