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
package com.tencentcloudapi.acp.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeScanTaskListRequest extends AbstractModel{

    /**
    * 任务来源, -1:所有, 0:默认值(私域), 1:灵犀, 2:灵鲲;
    */
    @SerializedName("Source")
    @Expose
    private Long Source;

    /**
    * 应用平台, 0:android, 1:ios, 2:小程序
    */
    @SerializedName("Platform")
    @Expose
    private Long Platform;

    /**
    * 任务状态,可多值查询,例如:"1,2,3" 0:默认值(待检测/待咨询), 1.检测中, 2:待评估, 3:评估中, 4:任务完成/咨询完成, 5:任务失败, 6:咨询中;
    */
    @SerializedName("TaskStatuses")
    @Expose
    private String TaskStatuses;

    /**
    * 任务类型,可多值查询,采用逗号分隔,例如:"0,1" 0:基础版, 1:专家版, 2:本地化
    */
    @SerializedName("TaskTypes")
    @Expose
    private String TaskTypes;

    /**
    * 页码
    */
    @SerializedName("PageNo")
    @Expose
    private Long PageNo;

    /**
    * 页码大小
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 应用名称或小程序名称(可选参数)
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * 查询时间范围, 查询开始时间(2021-09-30 或 2021-09-30 10:57:34)
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 查询时间范围, 查询结束时间(2021-09-30 或 2021-09-30 10:57:34)
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get 任务来源, -1:所有, 0:默认值(私域), 1:灵犀, 2:灵鲲; 
     * @return Source 任务来源, -1:所有, 0:默认值(私域), 1:灵犀, 2:灵鲲;
     */
    public Long getSource() {
        return this.Source;
    }

    /**
     * Set 任务来源, -1:所有, 0:默认值(私域), 1:灵犀, 2:灵鲲;
     * @param Source 任务来源, -1:所有, 0:默认值(私域), 1:灵犀, 2:灵鲲;
     */
    public void setSource(Long Source) {
        this.Source = Source;
    }

    /**
     * Get 应用平台, 0:android, 1:ios, 2:小程序 
     * @return Platform 应用平台, 0:android, 1:ios, 2:小程序
     */
    public Long getPlatform() {
        return this.Platform;
    }

    /**
     * Set 应用平台, 0:android, 1:ios, 2:小程序
     * @param Platform 应用平台, 0:android, 1:ios, 2:小程序
     */
    public void setPlatform(Long Platform) {
        this.Platform = Platform;
    }

    /**
     * Get 任务状态,可多值查询,例如:"1,2,3" 0:默认值(待检测/待咨询), 1.检测中, 2:待评估, 3:评估中, 4:任务完成/咨询完成, 5:任务失败, 6:咨询中; 
     * @return TaskStatuses 任务状态,可多值查询,例如:"1,2,3" 0:默认值(待检测/待咨询), 1.检测中, 2:待评估, 3:评估中, 4:任务完成/咨询完成, 5:任务失败, 6:咨询中;
     */
    public String getTaskStatuses() {
        return this.TaskStatuses;
    }

    /**
     * Set 任务状态,可多值查询,例如:"1,2,3" 0:默认值(待检测/待咨询), 1.检测中, 2:待评估, 3:评估中, 4:任务完成/咨询完成, 5:任务失败, 6:咨询中;
     * @param TaskStatuses 任务状态,可多值查询,例如:"1,2,3" 0:默认值(待检测/待咨询), 1.检测中, 2:待评估, 3:评估中, 4:任务完成/咨询完成, 5:任务失败, 6:咨询中;
     */
    public void setTaskStatuses(String TaskStatuses) {
        this.TaskStatuses = TaskStatuses;
    }

    /**
     * Get 任务类型,可多值查询,采用逗号分隔,例如:"0,1" 0:基础版, 1:专家版, 2:本地化 
     * @return TaskTypes 任务类型,可多值查询,采用逗号分隔,例如:"0,1" 0:基础版, 1:专家版, 2:本地化
     */
    public String getTaskTypes() {
        return this.TaskTypes;
    }

    /**
     * Set 任务类型,可多值查询,采用逗号分隔,例如:"0,1" 0:基础版, 1:专家版, 2:本地化
     * @param TaskTypes 任务类型,可多值查询,采用逗号分隔,例如:"0,1" 0:基础版, 1:专家版, 2:本地化
     */
    public void setTaskTypes(String TaskTypes) {
        this.TaskTypes = TaskTypes;
    }

    /**
     * Get 页码 
     * @return PageNo 页码
     */
    public Long getPageNo() {
        return this.PageNo;
    }

    /**
     * Set 页码
     * @param PageNo 页码
     */
    public void setPageNo(Long PageNo) {
        this.PageNo = PageNo;
    }

    /**
     * Get 页码大小 
     * @return PageSize 页码大小
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 页码大小
     * @param PageSize 页码大小
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 应用名称或小程序名称(可选参数) 
     * @return AppName 应用名称或小程序名称(可选参数)
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set 应用名称或小程序名称(可选参数)
     * @param AppName 应用名称或小程序名称(可选参数)
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get 查询时间范围, 查询开始时间(2021-09-30 或 2021-09-30 10:57:34) 
     * @return StartTime 查询时间范围, 查询开始时间(2021-09-30 或 2021-09-30 10:57:34)
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 查询时间范围, 查询开始时间(2021-09-30 或 2021-09-30 10:57:34)
     * @param StartTime 查询时间范围, 查询开始时间(2021-09-30 或 2021-09-30 10:57:34)
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 查询时间范围, 查询结束时间(2021-09-30 或 2021-09-30 10:57:34) 
     * @return EndTime 查询时间范围, 查询结束时间(2021-09-30 或 2021-09-30 10:57:34)
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 查询时间范围, 查询结束时间(2021-09-30 或 2021-09-30 10:57:34)
     * @param EndTime 查询时间范围, 查询结束时间(2021-09-30 或 2021-09-30 10:57:34)
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public DescribeScanTaskListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeScanTaskListRequest(DescribeScanTaskListRequest source) {
        if (source.Source != null) {
            this.Source = new Long(source.Source);
        }
        if (source.Platform != null) {
            this.Platform = new Long(source.Platform);
        }
        if (source.TaskStatuses != null) {
            this.TaskStatuses = new String(source.TaskStatuses);
        }
        if (source.TaskTypes != null) {
            this.TaskTypes = new String(source.TaskTypes);
        }
        if (source.PageNo != null) {
            this.PageNo = new Long(source.PageNo);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "TaskStatuses", this.TaskStatuses);
        this.setParamSimple(map, prefix + "TaskTypes", this.TaskTypes);
        this.setParamSimple(map, prefix + "PageNo", this.PageNo);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

