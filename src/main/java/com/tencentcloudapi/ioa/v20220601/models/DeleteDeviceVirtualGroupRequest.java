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

public class DeleteDeviceVirtualGroupRequest extends AbstractModel {

    /**
    * 管理域实例ID，用于CAM管理域权限分配。若企业未进行管理域的划分，可直接传入根域"1"，此时表示针对当前企业的全部设备和账号进行接口CRUD，具体CRUD的影响范围限制于相应接口的入参。
    */
    @SerializedName("DomainInstanceId")
    @Expose
    private String DomainInstanceId;

    /**
    * 必填，终端自定义分组id
    */
    @SerializedName("DeviceVirtualGroupId")
    @Expose
    private Long DeviceVirtualGroupId;

    /**
    * 必填，系统类型（0: win，1：linux，2: mac，4：android，5：ios，-1：全系统（SaaS一体化版本） ； 不传默认为0）(只支持32位)
    */
    @SerializedName("OsType")
    @Expose
    private Long OsType;

    /**
     * Get 管理域实例ID，用于CAM管理域权限分配。若企业未进行管理域的划分，可直接传入根域"1"，此时表示针对当前企业的全部设备和账号进行接口CRUD，具体CRUD的影响范围限制于相应接口的入参。 
     * @return DomainInstanceId 管理域实例ID，用于CAM管理域权限分配。若企业未进行管理域的划分，可直接传入根域"1"，此时表示针对当前企业的全部设备和账号进行接口CRUD，具体CRUD的影响范围限制于相应接口的入参。
     */
    public String getDomainInstanceId() {
        return this.DomainInstanceId;
    }

    /**
     * Set 管理域实例ID，用于CAM管理域权限分配。若企业未进行管理域的划分，可直接传入根域"1"，此时表示针对当前企业的全部设备和账号进行接口CRUD，具体CRUD的影响范围限制于相应接口的入参。
     * @param DomainInstanceId 管理域实例ID，用于CAM管理域权限分配。若企业未进行管理域的划分，可直接传入根域"1"，此时表示针对当前企业的全部设备和账号进行接口CRUD，具体CRUD的影响范围限制于相应接口的入参。
     */
    public void setDomainInstanceId(String DomainInstanceId) {
        this.DomainInstanceId = DomainInstanceId;
    }

    /**
     * Get 必填，终端自定义分组id 
     * @return DeviceVirtualGroupId 必填，终端自定义分组id
     */
    public Long getDeviceVirtualGroupId() {
        return this.DeviceVirtualGroupId;
    }

    /**
     * Set 必填，终端自定义分组id
     * @param DeviceVirtualGroupId 必填，终端自定义分组id
     */
    public void setDeviceVirtualGroupId(Long DeviceVirtualGroupId) {
        this.DeviceVirtualGroupId = DeviceVirtualGroupId;
    }

    /**
     * Get 必填，系统类型（0: win，1：linux，2: mac，4：android，5：ios，-1：全系统（SaaS一体化版本） ； 不传默认为0）(只支持32位) 
     * @return OsType 必填，系统类型（0: win，1：linux，2: mac，4：android，5：ios，-1：全系统（SaaS一体化版本） ； 不传默认为0）(只支持32位)
     */
    public Long getOsType() {
        return this.OsType;
    }

    /**
     * Set 必填，系统类型（0: win，1：linux，2: mac，4：android，5：ios，-1：全系统（SaaS一体化版本） ； 不传默认为0）(只支持32位)
     * @param OsType 必填，系统类型（0: win，1：linux，2: mac，4：android，5：ios，-1：全系统（SaaS一体化版本） ； 不传默认为0）(只支持32位)
     */
    public void setOsType(Long OsType) {
        this.OsType = OsType;
    }

    public DeleteDeviceVirtualGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteDeviceVirtualGroupRequest(DeleteDeviceVirtualGroupRequest source) {
        if (source.DomainInstanceId != null) {
            this.DomainInstanceId = new String(source.DomainInstanceId);
        }
        if (source.DeviceVirtualGroupId != null) {
            this.DeviceVirtualGroupId = new Long(source.DeviceVirtualGroupId);
        }
        if (source.OsType != null) {
            this.OsType = new Long(source.OsType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainInstanceId", this.DomainInstanceId);
        this.setParamSimple(map, prefix + "DeviceVirtualGroupId", this.DeviceVirtualGroupId);
        this.setParamSimple(map, prefix + "OsType", this.OsType);

    }
}

