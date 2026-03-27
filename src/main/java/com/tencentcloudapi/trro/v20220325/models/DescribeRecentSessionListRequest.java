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
package com.tencentcloudapi.trro.v20220325.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRecentSessionListRequest extends AbstractModel {

    /**
    * <p>项目ID</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * <p>页码，从1开始</p>
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * <p>每页个数</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>设备ID，支持过滤远端设备或现场设备</p>
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * <p>时间范围的起始时间。时间范围最大为最近两小时，若不传或超出范围，则起始时间按两小时前计算</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * <p>时间范围的结束时间。时间范围最大为最近两小时，若不传或超出范围，则结束时间按当前时间计算</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
     * Get <p>项目ID</p> 
     * @return ProjectId <p>项目ID</p>
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目ID</p>
     * @param ProjectId <p>项目ID</p>
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>页码，从1开始</p> 
     * @return PageNumber <p>页码，从1开始</p>
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set <p>页码，从1开始</p>
     * @param PageNumber <p>页码，从1开始</p>
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get <p>每页个数</p> 
     * @return PageSize <p>每页个数</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>每页个数</p>
     * @param PageSize <p>每页个数</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>设备ID，支持过滤远端设备或现场设备</p> 
     * @return DeviceId <p>设备ID，支持过滤远端设备或现场设备</p>
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set <p>设备ID，支持过滤远端设备或现场设备</p>
     * @param DeviceId <p>设备ID，支持过滤远端设备或现场设备</p>
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get <p>时间范围的起始时间。时间范围最大为最近两小时，若不传或超出范围，则起始时间按两小时前计算</p> 
     * @return StartTime <p>时间范围的起始时间。时间范围最大为最近两小时，若不传或超出范围，则起始时间按两小时前计算</p>
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>时间范围的起始时间。时间范围最大为最近两小时，若不传或超出范围，则起始时间按两小时前计算</p>
     * @param StartTime <p>时间范围的起始时间。时间范围最大为最近两小时，若不传或超出范围，则起始时间按两小时前计算</p>
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>时间范围的结束时间。时间范围最大为最近两小时，若不传或超出范围，则结束时间按当前时间计算</p> 
     * @return EndTime <p>时间范围的结束时间。时间范围最大为最近两小时，若不传或超出范围，则结束时间按当前时间计算</p>
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>时间范围的结束时间。时间范围最大为最近两小时，若不传或超出范围，则结束时间按当前时间计算</p>
     * @param EndTime <p>时间范围的结束时间。时间范围最大为最近两小时，若不传或超出范围，则结束时间按当前时间计算</p>
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    public DescribeRecentSessionListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRecentSessionListRequest(DescribeRecentSessionListRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

