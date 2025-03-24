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
package com.tencentcloudapi.chc.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAvailableModelListRequest extends AbstractModel {

    /**
    * 机房ID
    */
    @SerializedName("IdcId")
    @Expose
    private Long IdcId;

    /**
    * server 服务器，netDevice 网络设备
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
     * Get 机房ID 
     * @return IdcId 机房ID
     */
    public Long getIdcId() {
        return this.IdcId;
    }

    /**
     * Set 机房ID
     * @param IdcId 机房ID
     */
    public void setIdcId(Long IdcId) {
        this.IdcId = IdcId;
    }

    /**
     * Get server 服务器，netDevice 网络设备 
     * @return DeviceType server 服务器，netDevice 网络设备
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set server 服务器，netDevice 网络设备
     * @param DeviceType server 服务器，netDevice 网络设备
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    public DescribeAvailableModelListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAvailableModelListRequest(DescribeAvailableModelListRequest source) {
        if (source.IdcId != null) {
            this.IdcId = new Long(source.IdcId);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IdcId", this.IdcId);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);

    }
}

