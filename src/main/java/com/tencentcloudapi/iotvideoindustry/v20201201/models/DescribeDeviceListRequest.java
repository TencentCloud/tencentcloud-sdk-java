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
package com.tencentcloudapi.iotvideoindustry.v20201201.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDeviceListRequest extends AbstractModel{

    /**
    * 偏移量，默认0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 限制，默认200
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 设备名前缀
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * 设备类型，1：国标VMS设备(公有云不支持此类型)，2：国标IPC设备，3：国标NVR设备，9：智能告警设备(公有云不支持此类型)
    */
    @SerializedName("DeviceTypes")
    @Expose
    private Long [] DeviceTypes;

    /**
     * Get 偏移量，默认0 
     * @return Offset 偏移量，默认0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认0
     * @param Offset 偏移量，默认0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 限制，默认200 
     * @return Limit 限制，默认200
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 限制，默认200
     * @param Limit 限制，默认200
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 设备名前缀 
     * @return NickName 设备名前缀
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set 设备名前缀
     * @param NickName 设备名前缀
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    /**
     * Get 设备类型，1：国标VMS设备(公有云不支持此类型)，2：国标IPC设备，3：国标NVR设备，9：智能告警设备(公有云不支持此类型) 
     * @return DeviceTypes 设备类型，1：国标VMS设备(公有云不支持此类型)，2：国标IPC设备，3：国标NVR设备，9：智能告警设备(公有云不支持此类型)
     */
    public Long [] getDeviceTypes() {
        return this.DeviceTypes;
    }

    /**
     * Set 设备类型，1：国标VMS设备(公有云不支持此类型)，2：国标IPC设备，3：国标NVR设备，9：智能告警设备(公有云不支持此类型)
     * @param DeviceTypes 设备类型，1：国标VMS设备(公有云不支持此类型)，2：国标IPC设备，3：国标NVR设备，9：智能告警设备(公有云不支持此类型)
     */
    public void setDeviceTypes(Long [] DeviceTypes) {
        this.DeviceTypes = DeviceTypes;
    }

    public DescribeDeviceListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDeviceListRequest(DescribeDeviceListRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.NickName != null) {
            this.NickName = new String(source.NickName);
        }
        if (source.DeviceTypes != null) {
            this.DeviceTypes = new Long[source.DeviceTypes.length];
            for (int i = 0; i < source.DeviceTypes.length; i++) {
                this.DeviceTypes[i] = new Long(source.DeviceTypes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "NickName", this.NickName);
        this.setParamArraySimple(map, prefix + "DeviceTypes.", this.DeviceTypes);

    }
}

