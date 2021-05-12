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
package com.tencentcloudapi.apcas.v20201127.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetTaskListRequest extends AbstractModel{

    /**
    * 查询分页页码
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 查询分页大小
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 查询起始时间（13位数字的UNIX时间戳，单位毫秒 ）
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 查询结束时间（13位数字的UNIX时间戳，单位毫秒 ）
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 任务名称
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 查询任务状态 0:默认状态 1:任务正在运行 2:任务运行成功 3:任务运行失败
    */
    @SerializedName("TaskStatus")
    @Expose
    private Long TaskStatus;

    /**
     * Get 查询分页页码 
     * @return PageNumber 查询分页页码
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 查询分页页码
     * @param PageNumber 查询分页页码
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 查询分页大小 
     * @return PageSize 查询分页大小
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 查询分页大小
     * @param PageSize 查询分页大小
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 查询起始时间（13位数字的UNIX时间戳，单位毫秒 ） 
     * @return StartTime 查询起始时间（13位数字的UNIX时间戳，单位毫秒 ）
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 查询起始时间（13位数字的UNIX时间戳，单位毫秒 ）
     * @param StartTime 查询起始时间（13位数字的UNIX时间戳，单位毫秒 ）
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 查询结束时间（13位数字的UNIX时间戳，单位毫秒 ） 
     * @return EndTime 查询结束时间（13位数字的UNIX时间戳，单位毫秒 ）
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 查询结束时间（13位数字的UNIX时间戳，单位毫秒 ）
     * @param EndTime 查询结束时间（13位数字的UNIX时间戳，单位毫秒 ）
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 任务名称 
     * @return TaskName 任务名称
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 任务名称
     * @param TaskName 任务名称
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 查询任务状态 0:默认状态 1:任务正在运行 2:任务运行成功 3:任务运行失败 
     * @return TaskStatus 查询任务状态 0:默认状态 1:任务正在运行 2:任务运行成功 3:任务运行失败
     */
    public Long getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set 查询任务状态 0:默认状态 1:任务正在运行 2:任务运行成功 3:任务运行失败
     * @param TaskStatus 查询任务状态 0:默认状态 1:任务正在运行 2:任务运行成功 3:任务运行失败
     */
    public void setTaskStatus(Long TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    public GetTaskListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetTaskListRequest(GetTaskListRequest source) {
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new Long(source.TaskStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);

    }
}

