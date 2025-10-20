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

public class ExportDeviceDownloadTaskRequest extends AbstractModel {

    /**
    * 系统类型（0: win，1：linux，2: mac，4：android，5：ios；默认值0）
    */
    @SerializedName("OsType")
    @Expose
    private Long OsType;

    /**
    * 管理域实例ID，用于CAM管理域权限分配。若企业未进行管理域的划分，可直接传入根域"1"，此时表示针对当前企业的全部设备和账号进行接口CRUD，具体CRUD的影响范围限制于相应接口的入参。
    */
    @SerializedName("DomainInstanceId")
    @Expose
    private String DomainInstanceId;

    /**
    * 分组id
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    *  在线状态 2 在线 0，1 离线
    */
    @SerializedName("OnlineStatus")
    @Expose
    private Long OnlineStatus;

    /**
    * 导出顺序，接口返回的数据字段
    */
    @SerializedName("ExportOrder")
    @Expose
    private String ExportOrder;

    /**
    *  导出类型， 0：终端树；7:硬件信息列表导出；
    */
    @SerializedName("ExportType")
    @Expose
    private Long ExportType;

    /**
    * 过滤条件。同DescribeDevices接口
    */
    @SerializedName("Condition")
    @Expose
    private Condition Condition;

    /**
     * Get 系统类型（0: win，1：linux，2: mac，4：android，5：ios；默认值0） 
     * @return OsType 系统类型（0: win，1：linux，2: mac，4：android，5：ios；默认值0）
     */
    public Long getOsType() {
        return this.OsType;
    }

    /**
     * Set 系统类型（0: win，1：linux，2: mac，4：android，5：ios；默认值0）
     * @param OsType 系统类型（0: win，1：linux，2: mac，4：android，5：ios；默认值0）
     */
    public void setOsType(Long OsType) {
        this.OsType = OsType;
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
     * Get 分组id 
     * @return GroupId 分组id
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 分组id
     * @param GroupId 分组id
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get  在线状态 2 在线 0，1 离线 
     * @return OnlineStatus  在线状态 2 在线 0，1 离线
     */
    public Long getOnlineStatus() {
        return this.OnlineStatus;
    }

    /**
     * Set  在线状态 2 在线 0，1 离线
     * @param OnlineStatus  在线状态 2 在线 0，1 离线
     */
    public void setOnlineStatus(Long OnlineStatus) {
        this.OnlineStatus = OnlineStatus;
    }

    /**
     * Get 导出顺序，接口返回的数据字段 
     * @return ExportOrder 导出顺序，接口返回的数据字段
     */
    public String getExportOrder() {
        return this.ExportOrder;
    }

    /**
     * Set 导出顺序，接口返回的数据字段
     * @param ExportOrder 导出顺序，接口返回的数据字段
     */
    public void setExportOrder(String ExportOrder) {
        this.ExportOrder = ExportOrder;
    }

    /**
     * Get  导出类型， 0：终端树；7:硬件信息列表导出； 
     * @return ExportType  导出类型， 0：终端树；7:硬件信息列表导出；
     */
    public Long getExportType() {
        return this.ExportType;
    }

    /**
     * Set  导出类型， 0：终端树；7:硬件信息列表导出；
     * @param ExportType  导出类型， 0：终端树；7:硬件信息列表导出；
     */
    public void setExportType(Long ExportType) {
        this.ExportType = ExportType;
    }

    /**
     * Get 过滤条件。同DescribeDevices接口 
     * @return Condition 过滤条件。同DescribeDevices接口
     */
    public Condition getCondition() {
        return this.Condition;
    }

    /**
     * Set 过滤条件。同DescribeDevices接口
     * @param Condition 过滤条件。同DescribeDevices接口
     */
    public void setCondition(Condition Condition) {
        this.Condition = Condition;
    }

    public ExportDeviceDownloadTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportDeviceDownloadTaskRequest(ExportDeviceDownloadTaskRequest source) {
        if (source.OsType != null) {
            this.OsType = new Long(source.OsType);
        }
        if (source.DomainInstanceId != null) {
            this.DomainInstanceId = new String(source.DomainInstanceId);
        }
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.OnlineStatus != null) {
            this.OnlineStatus = new Long(source.OnlineStatus);
        }
        if (source.ExportOrder != null) {
            this.ExportOrder = new String(source.ExportOrder);
        }
        if (source.ExportType != null) {
            this.ExportType = new Long(source.ExportType);
        }
        if (source.Condition != null) {
            this.Condition = new Condition(source.Condition);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OsType", this.OsType);
        this.setParamSimple(map, prefix + "DomainInstanceId", this.DomainInstanceId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "OnlineStatus", this.OnlineStatus);
        this.setParamSimple(map, prefix + "ExportOrder", this.ExportOrder);
        this.setParamSimple(map, prefix + "ExportType", this.ExportType);
        this.setParamObj(map, prefix + "Condition.", this.Condition);

    }
}

