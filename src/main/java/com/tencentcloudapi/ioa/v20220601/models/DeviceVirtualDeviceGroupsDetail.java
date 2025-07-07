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
package com.tencentcloudapi.ioa.v20220601.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeviceVirtualDeviceGroupsDetail extends AbstractModel {

    /**
    * 终端自定义分组id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 自定义分组名称
    */
    @SerializedName("DeviceVirtualGroupName")
    @Expose
    private String DeviceVirtualGroupName;

    /**
    * 设备数
    */
    @SerializedName("DeviceCount")
    @Expose
    private Long DeviceCount;

    /**
    * 系统类型（0: win，1：linux，2: mac，4：android，5：ios  ）
    */
    @SerializedName("OsType")
    @Expose
    private Long OsType;

    /**
    * 创建时间
    */
    @SerializedName("Itime")
    @Expose
    private String Itime;

    /**
    * 更新时间
    */
    @SerializedName("Utime")
    @Expose
    private String Utime;

    /**
     * Get 终端自定义分组id 
     * @return Id 终端自定义分组id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 终端自定义分组id
     * @param Id 终端自定义分组id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 自定义分组名称 
     * @return DeviceVirtualGroupName 自定义分组名称
     */
    public String getDeviceVirtualGroupName() {
        return this.DeviceVirtualGroupName;
    }

    /**
     * Set 自定义分组名称
     * @param DeviceVirtualGroupName 自定义分组名称
     */
    public void setDeviceVirtualGroupName(String DeviceVirtualGroupName) {
        this.DeviceVirtualGroupName = DeviceVirtualGroupName;
    }

    /**
     * Get 设备数 
     * @return DeviceCount 设备数
     */
    public Long getDeviceCount() {
        return this.DeviceCount;
    }

    /**
     * Set 设备数
     * @param DeviceCount 设备数
     */
    public void setDeviceCount(Long DeviceCount) {
        this.DeviceCount = DeviceCount;
    }

    /**
     * Get 系统类型（0: win，1：linux，2: mac，4：android，5：ios  ） 
     * @return OsType 系统类型（0: win，1：linux，2: mac，4：android，5：ios  ）
     */
    public Long getOsType() {
        return this.OsType;
    }

    /**
     * Set 系统类型（0: win，1：linux，2: mac，4：android，5：ios  ）
     * @param OsType 系统类型（0: win，1：linux，2: mac，4：android，5：ios  ）
     */
    public void setOsType(Long OsType) {
        this.OsType = OsType;
    }

    /**
     * Get 创建时间 
     * @return Itime 创建时间
     */
    public String getItime() {
        return this.Itime;
    }

    /**
     * Set 创建时间
     * @param Itime 创建时间
     */
    public void setItime(String Itime) {
        this.Itime = Itime;
    }

    /**
     * Get 更新时间 
     * @return Utime 更新时间
     */
    public String getUtime() {
        return this.Utime;
    }

    /**
     * Set 更新时间
     * @param Utime 更新时间
     */
    public void setUtime(String Utime) {
        this.Utime = Utime;
    }

    public DeviceVirtualDeviceGroupsDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeviceVirtualDeviceGroupsDetail(DeviceVirtualDeviceGroupsDetail source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.DeviceVirtualGroupName != null) {
            this.DeviceVirtualGroupName = new String(source.DeviceVirtualGroupName);
        }
        if (source.DeviceCount != null) {
            this.DeviceCount = new Long(source.DeviceCount);
        }
        if (source.OsType != null) {
            this.OsType = new Long(source.OsType);
        }
        if (source.Itime != null) {
            this.Itime = new String(source.Itime);
        }
        if (source.Utime != null) {
            this.Utime = new String(source.Utime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "DeviceVirtualGroupName", this.DeviceVirtualGroupName);
        this.setParamSimple(map, prefix + "DeviceCount", this.DeviceCount);
        this.setParamSimple(map, prefix + "OsType", this.OsType);
        this.setParamSimple(map, prefix + "Itime", this.Itime);
        this.setParamSimple(map, prefix + "Utime", this.Utime);

    }
}

