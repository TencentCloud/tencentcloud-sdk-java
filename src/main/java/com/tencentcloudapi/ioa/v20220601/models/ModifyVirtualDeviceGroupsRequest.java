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

public class ModifyVirtualDeviceGroupsRequest extends AbstractModel {

    /**
    * 必填，操作的设备列表数据
    */
    @SerializedName("DeviceList")
    @Expose
    private ModifyVirtualDeviceGroupsReqItem [] DeviceList;

    /**
    * 管理域实例ID，用于CAM管理域权限分配。若企业未进行管理域的划分，可直接传入根域"1"，此时表示针对当前企业的全部设备和账号进行接口CRUD，具体CRUD的影响范围限制于相应接口的入参。
    */
    @SerializedName("DomainInstanceId")
    @Expose
    private String DomainInstanceId;

    /**
    * 添加到的终端自定义分组id。和DeviceVirtualGroupIds互斥，必填其一，优先使用本参数
    */
    @SerializedName("DeviceVirtualGroupId")
    @Expose
    private Long DeviceVirtualGroupId;

    /**
    * 要添加的终端自定义分组id列表
    */
    @SerializedName("DeviceVirtualGroupIds")
    @Expose
    private Long [] DeviceVirtualGroupIds;

    /**
    * 系统类型（0: win，1：linux，2: mac，4：android，5：ios   默认值0）
    */
    @SerializedName("OsType")
    @Expose
    private Long OsType;

    /**
     * Get 必填，操作的设备列表数据 
     * @return DeviceList 必填，操作的设备列表数据
     */
    public ModifyVirtualDeviceGroupsReqItem [] getDeviceList() {
        return this.DeviceList;
    }

    /**
     * Set 必填，操作的设备列表数据
     * @param DeviceList 必填，操作的设备列表数据
     */
    public void setDeviceList(ModifyVirtualDeviceGroupsReqItem [] DeviceList) {
        this.DeviceList = DeviceList;
    }

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
     * Get 添加到的终端自定义分组id。和DeviceVirtualGroupIds互斥，必填其一，优先使用本参数 
     * @return DeviceVirtualGroupId 添加到的终端自定义分组id。和DeviceVirtualGroupIds互斥，必填其一，优先使用本参数
     */
    public Long getDeviceVirtualGroupId() {
        return this.DeviceVirtualGroupId;
    }

    /**
     * Set 添加到的终端自定义分组id。和DeviceVirtualGroupIds互斥，必填其一，优先使用本参数
     * @param DeviceVirtualGroupId 添加到的终端自定义分组id。和DeviceVirtualGroupIds互斥，必填其一，优先使用本参数
     */
    public void setDeviceVirtualGroupId(Long DeviceVirtualGroupId) {
        this.DeviceVirtualGroupId = DeviceVirtualGroupId;
    }

    /**
     * Get 要添加的终端自定义分组id列表 
     * @return DeviceVirtualGroupIds 要添加的终端自定义分组id列表
     */
    public Long [] getDeviceVirtualGroupIds() {
        return this.DeviceVirtualGroupIds;
    }

    /**
     * Set 要添加的终端自定义分组id列表
     * @param DeviceVirtualGroupIds 要添加的终端自定义分组id列表
     */
    public void setDeviceVirtualGroupIds(Long [] DeviceVirtualGroupIds) {
        this.DeviceVirtualGroupIds = DeviceVirtualGroupIds;
    }

    /**
     * Get 系统类型（0: win，1：linux，2: mac，4：android，5：ios   默认值0） 
     * @return OsType 系统类型（0: win，1：linux，2: mac，4：android，5：ios   默认值0）
     */
    public Long getOsType() {
        return this.OsType;
    }

    /**
     * Set 系统类型（0: win，1：linux，2: mac，4：android，5：ios   默认值0）
     * @param OsType 系统类型（0: win，1：linux，2: mac，4：android，5：ios   默认值0）
     */
    public void setOsType(Long OsType) {
        this.OsType = OsType;
    }

    public ModifyVirtualDeviceGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyVirtualDeviceGroupsRequest(ModifyVirtualDeviceGroupsRequest source) {
        if (source.DeviceList != null) {
            this.DeviceList = new ModifyVirtualDeviceGroupsReqItem[source.DeviceList.length];
            for (int i = 0; i < source.DeviceList.length; i++) {
                this.DeviceList[i] = new ModifyVirtualDeviceGroupsReqItem(source.DeviceList[i]);
            }
        }
        if (source.DomainInstanceId != null) {
            this.DomainInstanceId = new String(source.DomainInstanceId);
        }
        if (source.DeviceVirtualGroupId != null) {
            this.DeviceVirtualGroupId = new Long(source.DeviceVirtualGroupId);
        }
        if (source.DeviceVirtualGroupIds != null) {
            this.DeviceVirtualGroupIds = new Long[source.DeviceVirtualGroupIds.length];
            for (int i = 0; i < source.DeviceVirtualGroupIds.length; i++) {
                this.DeviceVirtualGroupIds[i] = new Long(source.DeviceVirtualGroupIds[i]);
            }
        }
        if (source.OsType != null) {
            this.OsType = new Long(source.OsType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "DeviceList.", this.DeviceList);
        this.setParamSimple(map, prefix + "DomainInstanceId", this.DomainInstanceId);
        this.setParamSimple(map, prefix + "DeviceVirtualGroupId", this.DeviceVirtualGroupId);
        this.setParamArraySimple(map, prefix + "DeviceVirtualGroupIds.", this.DeviceVirtualGroupIds);
        this.setParamSimple(map, prefix + "OsType", this.OsType);

    }
}

