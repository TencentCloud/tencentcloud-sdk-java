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

public class DescribeDeviceVirtualGroupsRequest extends AbstractModel {

    /**
    * 管理域实例ID，用于CAM管理域权限分配。若企业未进行管理域的划分，可直接传入根域"1"，此时表示针对当前企业的全部设备和账号进行接口CRUD，具体CRUD的影响范围限制于相应接口的入参。
    */
    @SerializedName("DomainInstanceId")
    @Expose
    private String DomainInstanceId;

    /**
    * 滤条件、分页参数 <li>Name - String - 是否必填：否 - 操作符: like  - 排序支持：否- 按终端自定义分组过滤。</li> <li>DeviceVirtualGroupName - String - 是否必填：否 - 操作符: like  - 排序支持：否- 按终端自定义分组过滤。</li>
    */
    @SerializedName("Condition")
    @Expose
    private Condition Condition;

    /**
    * 必填，系统类型（0: win，1：linux，2: mac，4：android，5：ios   默认值0）
    */
    @SerializedName("OsType")
    @Expose
    private Long OsType;

    /**
    * 非必填，自定义分组ids
    */
    @SerializedName("VirtualGroupIds")
    @Expose
    private Long [] VirtualGroupIds;

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
     * Get 滤条件、分页参数 <li>Name - String - 是否必填：否 - 操作符: like  - 排序支持：否- 按终端自定义分组过滤。</li> <li>DeviceVirtualGroupName - String - 是否必填：否 - 操作符: like  - 排序支持：否- 按终端自定义分组过滤。</li> 
     * @return Condition 滤条件、分页参数 <li>Name - String - 是否必填：否 - 操作符: like  - 排序支持：否- 按终端自定义分组过滤。</li> <li>DeviceVirtualGroupName - String - 是否必填：否 - 操作符: like  - 排序支持：否- 按终端自定义分组过滤。</li>
     */
    public Condition getCondition() {
        return this.Condition;
    }

    /**
     * Set 滤条件、分页参数 <li>Name - String - 是否必填：否 - 操作符: like  - 排序支持：否- 按终端自定义分组过滤。</li> <li>DeviceVirtualGroupName - String - 是否必填：否 - 操作符: like  - 排序支持：否- 按终端自定义分组过滤。</li>
     * @param Condition 滤条件、分页参数 <li>Name - String - 是否必填：否 - 操作符: like  - 排序支持：否- 按终端自定义分组过滤。</li> <li>DeviceVirtualGroupName - String - 是否必填：否 - 操作符: like  - 排序支持：否- 按终端自定义分组过滤。</li>
     */
    public void setCondition(Condition Condition) {
        this.Condition = Condition;
    }

    /**
     * Get 必填，系统类型（0: win，1：linux，2: mac，4：android，5：ios   默认值0） 
     * @return OsType 必填，系统类型（0: win，1：linux，2: mac，4：android，5：ios   默认值0）
     */
    public Long getOsType() {
        return this.OsType;
    }

    /**
     * Set 必填，系统类型（0: win，1：linux，2: mac，4：android，5：ios   默认值0）
     * @param OsType 必填，系统类型（0: win，1：linux，2: mac，4：android，5：ios   默认值0）
     */
    public void setOsType(Long OsType) {
        this.OsType = OsType;
    }

    /**
     * Get 非必填，自定义分组ids 
     * @return VirtualGroupIds 非必填，自定义分组ids
     */
    public Long [] getVirtualGroupIds() {
        return this.VirtualGroupIds;
    }

    /**
     * Set 非必填，自定义分组ids
     * @param VirtualGroupIds 非必填，自定义分组ids
     */
    public void setVirtualGroupIds(Long [] VirtualGroupIds) {
        this.VirtualGroupIds = VirtualGroupIds;
    }

    public DescribeDeviceVirtualGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDeviceVirtualGroupsRequest(DescribeDeviceVirtualGroupsRequest source) {
        if (source.DomainInstanceId != null) {
            this.DomainInstanceId = new String(source.DomainInstanceId);
        }
        if (source.Condition != null) {
            this.Condition = new Condition(source.Condition);
        }
        if (source.OsType != null) {
            this.OsType = new Long(source.OsType);
        }
        if (source.VirtualGroupIds != null) {
            this.VirtualGroupIds = new Long[source.VirtualGroupIds.length];
            for (int i = 0; i < source.VirtualGroupIds.length; i++) {
                this.VirtualGroupIds[i] = new Long(source.VirtualGroupIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainInstanceId", this.DomainInstanceId);
        this.setParamObj(map, prefix + "Condition.", this.Condition);
        this.setParamSimple(map, prefix + "OsType", this.OsType);
        this.setParamArraySimple(map, prefix + "VirtualGroupIds.", this.VirtualGroupIds);

    }
}

