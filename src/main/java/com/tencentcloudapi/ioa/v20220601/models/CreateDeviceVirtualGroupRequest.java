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

public class CreateDeviceVirtualGroupRequest extends AbstractModel {

    /**
    * 管理域实例ID，用于CAM管理域权限分配。若企业未进行管理域的划分，可直接传入根域"1"，此时表示针对当前企业的全部设备和账号进行接口CRUD，具体CRUD的影响范围限制于相应接口的入参。
    */
    @SerializedName("DomainInstanceId")
    @Expose
    private String DomainInstanceId;

    /**
    * 必填，终端自定义分组名
    */
    @SerializedName("DeviceVirtualGroupName")
    @Expose
    private String DeviceVirtualGroupName;

    /**
    * 详情
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 必填，系统类型（0: win，1：linux，2: mac，3: win_srv，4：android，5：ios ）(只支持32位)
    */
    @SerializedName("OsType")
    @Expose
    private Long OsType;

    /**
    * 必填，分组类型（0:手动分组；非0为自动划分分组；具体枚举值为：1:自动每小时划分分组、2:自动每天划分分组、3:自定义时间划分分组）(只支持32位)
    */
    @SerializedName("TimeType")
    @Expose
    private Long TimeType;

    /**
    * 选填，TimeType=3时的自动划分时间，其他情况为0（单位min）(只支持32位)
    */
    @SerializedName("AutoMinute")
    @Expose
    private Long AutoMinute;

    /**
    * 选填，手动分组不填，自动划分分组的划分规则数据
    */
    @SerializedName("AutoRules")
    @Expose
    private ComplexRule AutoRules;

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
     * Get 必填，终端自定义分组名 
     * @return DeviceVirtualGroupName 必填，终端自定义分组名
     */
    public String getDeviceVirtualGroupName() {
        return this.DeviceVirtualGroupName;
    }

    /**
     * Set 必填，终端自定义分组名
     * @param DeviceVirtualGroupName 必填，终端自定义分组名
     */
    public void setDeviceVirtualGroupName(String DeviceVirtualGroupName) {
        this.DeviceVirtualGroupName = DeviceVirtualGroupName;
    }

    /**
     * Get 详情 
     * @return Description 详情
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 详情
     * @param Description 详情
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 必填，系统类型（0: win，1：linux，2: mac，3: win_srv，4：android，5：ios ）(只支持32位) 
     * @return OsType 必填，系统类型（0: win，1：linux，2: mac，3: win_srv，4：android，5：ios ）(只支持32位)
     */
    public Long getOsType() {
        return this.OsType;
    }

    /**
     * Set 必填，系统类型（0: win，1：linux，2: mac，3: win_srv，4：android，5：ios ）(只支持32位)
     * @param OsType 必填，系统类型（0: win，1：linux，2: mac，3: win_srv，4：android，5：ios ）(只支持32位)
     */
    public void setOsType(Long OsType) {
        this.OsType = OsType;
    }

    /**
     * Get 必填，分组类型（0:手动分组；非0为自动划分分组；具体枚举值为：1:自动每小时划分分组、2:自动每天划分分组、3:自定义时间划分分组）(只支持32位) 
     * @return TimeType 必填，分组类型（0:手动分组；非0为自动划分分组；具体枚举值为：1:自动每小时划分分组、2:自动每天划分分组、3:自定义时间划分分组）(只支持32位)
     */
    public Long getTimeType() {
        return this.TimeType;
    }

    /**
     * Set 必填，分组类型（0:手动分组；非0为自动划分分组；具体枚举值为：1:自动每小时划分分组、2:自动每天划分分组、3:自定义时间划分分组）(只支持32位)
     * @param TimeType 必填，分组类型（0:手动分组；非0为自动划分分组；具体枚举值为：1:自动每小时划分分组、2:自动每天划分分组、3:自定义时间划分分组）(只支持32位)
     */
    public void setTimeType(Long TimeType) {
        this.TimeType = TimeType;
    }

    /**
     * Get 选填，TimeType=3时的自动划分时间，其他情况为0（单位min）(只支持32位) 
     * @return AutoMinute 选填，TimeType=3时的自动划分时间，其他情况为0（单位min）(只支持32位)
     */
    public Long getAutoMinute() {
        return this.AutoMinute;
    }

    /**
     * Set 选填，TimeType=3时的自动划分时间，其他情况为0（单位min）(只支持32位)
     * @param AutoMinute 选填，TimeType=3时的自动划分时间，其他情况为0（单位min）(只支持32位)
     */
    public void setAutoMinute(Long AutoMinute) {
        this.AutoMinute = AutoMinute;
    }

    /**
     * Get 选填，手动分组不填，自动划分分组的划分规则数据 
     * @return AutoRules 选填，手动分组不填，自动划分分组的划分规则数据
     */
    public ComplexRule getAutoRules() {
        return this.AutoRules;
    }

    /**
     * Set 选填，手动分组不填，自动划分分组的划分规则数据
     * @param AutoRules 选填，手动分组不填，自动划分分组的划分规则数据
     */
    public void setAutoRules(ComplexRule AutoRules) {
        this.AutoRules = AutoRules;
    }

    public CreateDeviceVirtualGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDeviceVirtualGroupRequest(CreateDeviceVirtualGroupRequest source) {
        if (source.DomainInstanceId != null) {
            this.DomainInstanceId = new String(source.DomainInstanceId);
        }
        if (source.DeviceVirtualGroupName != null) {
            this.DeviceVirtualGroupName = new String(source.DeviceVirtualGroupName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.OsType != null) {
            this.OsType = new Long(source.OsType);
        }
        if (source.TimeType != null) {
            this.TimeType = new Long(source.TimeType);
        }
        if (source.AutoMinute != null) {
            this.AutoMinute = new Long(source.AutoMinute);
        }
        if (source.AutoRules != null) {
            this.AutoRules = new ComplexRule(source.AutoRules);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainInstanceId", this.DomainInstanceId);
        this.setParamSimple(map, prefix + "DeviceVirtualGroupName", this.DeviceVirtualGroupName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "OsType", this.OsType);
        this.setParamSimple(map, prefix + "TimeType", this.TimeType);
        this.setParamSimple(map, prefix + "AutoMinute", this.AutoMinute);
        this.setParamObj(map, prefix + "AutoRules.", this.AutoRules);

    }
}

