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
    * <p>终端自定义分组id</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>自定义分组名称</p>
    */
    @SerializedName("DeviceVirtualGroupName")
    @Expose
    private String DeviceVirtualGroupName;

    /**
    * <p>设备数</p>
    */
    @SerializedName("DeviceCount")
    @Expose
    private Long DeviceCount;

    /**
    * <p>系统类型（0: win，1：linux，2: mac，4：android，5：ios  ）</p>
    */
    @SerializedName("OsType")
    @Expose
    private Long OsType;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("Itime")
    @Expose
    private String Itime;

    /**
    * <p>更新时间</p>
    */
    @SerializedName("Utime")
    @Expose
    private String Utime;

    /**
     * Get <p>终端自定义分组id</p> 
     * @return Id <p>终端自定义分组id</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>终端自定义分组id</p>
     * @param Id <p>终端自定义分组id</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>自定义分组名称</p> 
     * @return DeviceVirtualGroupName <p>自定义分组名称</p>
     */
    public String getDeviceVirtualGroupName() {
        return this.DeviceVirtualGroupName;
    }

    /**
     * Set <p>自定义分组名称</p>
     * @param DeviceVirtualGroupName <p>自定义分组名称</p>
     */
    public void setDeviceVirtualGroupName(String DeviceVirtualGroupName) {
        this.DeviceVirtualGroupName = DeviceVirtualGroupName;
    }

    /**
     * Get <p>设备数</p> 
     * @return DeviceCount <p>设备数</p>
     */
    public Long getDeviceCount() {
        return this.DeviceCount;
    }

    /**
     * Set <p>设备数</p>
     * @param DeviceCount <p>设备数</p>
     */
    public void setDeviceCount(Long DeviceCount) {
        this.DeviceCount = DeviceCount;
    }

    /**
     * Get <p>系统类型（0: win，1：linux，2: mac，4：android，5：ios  ）</p> 
     * @return OsType <p>系统类型（0: win，1：linux，2: mac，4：android，5：ios  ）</p>
     */
    public Long getOsType() {
        return this.OsType;
    }

    /**
     * Set <p>系统类型（0: win，1：linux，2: mac，4：android，5：ios  ）</p>
     * @param OsType <p>系统类型（0: win，1：linux，2: mac，4：android，5：ios  ）</p>
     */
    public void setOsType(Long OsType) {
        this.OsType = OsType;
    }

    /**
     * Get <p>创建时间</p> 
     * @return Itime <p>创建时间</p>
     */
    public String getItime() {
        return this.Itime;
    }

    /**
     * Set <p>创建时间</p>
     * @param Itime <p>创建时间</p>
     */
    public void setItime(String Itime) {
        this.Itime = Itime;
    }

    /**
     * Get <p>更新时间</p> 
     * @return Utime <p>更新时间</p>
     */
    public String getUtime() {
        return this.Utime;
    }

    /**
     * Set <p>更新时间</p>
     * @param Utime <p>更新时间</p>
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

