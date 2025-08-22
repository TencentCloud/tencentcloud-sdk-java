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

public class DescribeDeviceChildGroupsRequest extends AbstractModel {

    /**
    * 管理域实例ID，用于CAM管理域权限分配。若企业未进行管理域的划分，可直接传入根域"1"，此时表示针对当前企业的全部设备和账号进行接口CRUD，具体CRUD的影响范围限制于相应接口的入参。
    */
    @SerializedName("DomainInstanceId")
    @Expose
    private String DomainInstanceId;

    /**
    * 过滤条件参数（字段含义请参考接口返回值）
- Name, 类型String，支持操作：【like，ilike】，支持排序




分页参数
- PageNum 从1开始，小于等于0时使用默认参数
- PageSize 最大值5000，最好不超过100
    */
    @SerializedName("Condition")
    @Expose
    private Condition Condition;

    /**
    * 父分组id，默认0：表示获取全网终端分组
    */
    @SerializedName("ParentId")
    @Expose
    private Long ParentId;

    /**
    * 操作系统类型（0：win，1：linux，2：mac，4：android，5：ios；默认0：系统win）
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
     * Get 过滤条件参数（字段含义请参考接口返回值）
- Name, 类型String，支持操作：【like，ilike】，支持排序




分页参数
- PageNum 从1开始，小于等于0时使用默认参数
- PageSize 最大值5000，最好不超过100 
     * @return Condition 过滤条件参数（字段含义请参考接口返回值）
- Name, 类型String，支持操作：【like，ilike】，支持排序




分页参数
- PageNum 从1开始，小于等于0时使用默认参数
- PageSize 最大值5000，最好不超过100
     */
    public Condition getCondition() {
        return this.Condition;
    }

    /**
     * Set 过滤条件参数（字段含义请参考接口返回值）
- Name, 类型String，支持操作：【like，ilike】，支持排序




分页参数
- PageNum 从1开始，小于等于0时使用默认参数
- PageSize 最大值5000，最好不超过100
     * @param Condition 过滤条件参数（字段含义请参考接口返回值）
- Name, 类型String，支持操作：【like，ilike】，支持排序




分页参数
- PageNum 从1开始，小于等于0时使用默认参数
- PageSize 最大值5000，最好不超过100
     */
    public void setCondition(Condition Condition) {
        this.Condition = Condition;
    }

    /**
     * Get 父分组id，默认0：表示获取全网终端分组 
     * @return ParentId 父分组id，默认0：表示获取全网终端分组
     */
    public Long getParentId() {
        return this.ParentId;
    }

    /**
     * Set 父分组id，默认0：表示获取全网终端分组
     * @param ParentId 父分组id，默认0：表示获取全网终端分组
     */
    public void setParentId(Long ParentId) {
        this.ParentId = ParentId;
    }

    /**
     * Get 操作系统类型（0：win，1：linux，2：mac，4：android，5：ios；默认0：系统win） 
     * @return OsType 操作系统类型（0：win，1：linux，2：mac，4：android，5：ios；默认0：系统win）
     */
    public Long getOsType() {
        return this.OsType;
    }

    /**
     * Set 操作系统类型（0：win，1：linux，2：mac，4：android，5：ios；默认0：系统win）
     * @param OsType 操作系统类型（0：win，1：linux，2：mac，4：android，5：ios；默认0：系统win）
     */
    public void setOsType(Long OsType) {
        this.OsType = OsType;
    }

    public DescribeDeviceChildGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDeviceChildGroupsRequest(DescribeDeviceChildGroupsRequest source) {
        if (source.DomainInstanceId != null) {
            this.DomainInstanceId = new String(source.DomainInstanceId);
        }
        if (source.Condition != null) {
            this.Condition = new Condition(source.Condition);
        }
        if (source.ParentId != null) {
            this.ParentId = new Long(source.ParentId);
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
        this.setParamObj(map, prefix + "Condition.", this.Condition);
        this.setParamSimple(map, prefix + "ParentId", this.ParentId);
        this.setParamSimple(map, prefix + "OsType", this.OsType);

    }
}

