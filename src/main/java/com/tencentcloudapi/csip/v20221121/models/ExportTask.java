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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExportTask extends AbstractModel {

    /**
    * 任务Id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 用户AppId
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 进度百分比
    */
    @SerializedName("Percentage")
    @Expose
    private Long Percentage;

    /**
    * 任务状态：0.未开始 1.执行中 2.执行成功 3.执行超时 4.执行失败
    */
    @SerializedName("TaskStatus")
    @Expose
    private Long TaskStatus;

    /**
    * 任务创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 任务更新时间
    */
    @SerializedName("ModifyTime")
    @Expose
    private Long ModifyTime;

    /**
    * 文件名
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 文件大小  字节
    */
    @SerializedName("FileSize")
    @Expose
    private Long FileSize;

    /**
    * 剩余时间(单位：秒)
    */
    @SerializedName("RemainingTime")
    @Expose
    private Long RemainingTime;

    /**
     * Get 任务Id 
     * @return Id 任务Id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 任务Id
     * @param Id 任务Id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 用户AppId 
     * @return AppId 用户AppId
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 用户AppId
     * @param AppId 用户AppId
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 进度百分比 
     * @return Percentage 进度百分比
     */
    public Long getPercentage() {
        return this.Percentage;
    }

    /**
     * Set 进度百分比
     * @param Percentage 进度百分比
     */
    public void setPercentage(Long Percentage) {
        this.Percentage = Percentage;
    }

    /**
     * Get 任务状态：0.未开始 1.执行中 2.执行成功 3.执行超时 4.执行失败 
     * @return TaskStatus 任务状态：0.未开始 1.执行中 2.执行成功 3.执行超时 4.执行失败
     */
    public Long getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set 任务状态：0.未开始 1.执行中 2.执行成功 3.执行超时 4.执行失败
     * @param TaskStatus 任务状态：0.未开始 1.执行中 2.执行成功 3.执行超时 4.执行失败
     */
    public void setTaskStatus(Long TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get 任务创建时间 
     * @return CreateTime 任务创建时间
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 任务创建时间
     * @param CreateTime 任务创建时间
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 任务更新时间 
     * @return ModifyTime 任务更新时间
     */
    public Long getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 任务更新时间
     * @param ModifyTime 任务更新时间
     */
    public void setModifyTime(Long ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 文件名 
     * @return FileName 文件名
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 文件名
     * @param FileName 文件名
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 文件大小  字节 
     * @return FileSize 文件大小  字节
     */
    public Long getFileSize() {
        return this.FileSize;
    }

    /**
     * Set 文件大小  字节
     * @param FileSize 文件大小  字节
     */
    public void setFileSize(Long FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get 剩余时间(单位：秒) 
     * @return RemainingTime 剩余时间(单位：秒)
     */
    public Long getRemainingTime() {
        return this.RemainingTime;
    }

    /**
     * Set 剩余时间(单位：秒)
     * @param RemainingTime 剩余时间(单位：秒)
     */
    public void setRemainingTime(Long RemainingTime) {
        this.RemainingTime = RemainingTime;
    }

    public ExportTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportTask(ExportTask source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.Percentage != null) {
            this.Percentage = new Long(source.Percentage);
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new Long(source.TaskStatus);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new Long(source.ModifyTime);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileSize != null) {
            this.FileSize = new Long(source.FileSize);
        }
        if (source.RemainingTime != null) {
            this.RemainingTime = new Long(source.RemainingTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Percentage", this.Percentage);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "RemainingTime", this.RemainingTime);

    }
}

