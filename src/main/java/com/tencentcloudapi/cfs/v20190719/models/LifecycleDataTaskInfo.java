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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LifecycleDataTaskInfo extends AbstractModel {

    /**
    * 任务id
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 任务状态.
init：未执行
running：执行中，finished：已完成
,failed：失败
,stopping：停止中,stopped：已停止
    */
    @SerializedName("TaskStatus")
    @Expose
    private String TaskStatus;

    /**
    * 任务创建时间
    */
    @SerializedName("CreationTime")
    @Expose
    private String CreationTime;

    /**
    * 任务结束时间
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

    /**
    * 文件总数
    */
    @SerializedName("FileTotalCount")
    @Expose
    private Long FileTotalCount;

    /**
    * 处理成功文件数量
    */
    @SerializedName("FileSuccessedCount")
    @Expose
    private Long FileSuccessedCount;

    /**
    * 当前已经失败的文件数
    */
    @SerializedName("FileFailedCount")
    @Expose
    private Long FileFailedCount;

    /**
    * 文件容量，单位Byte


    */
    @SerializedName("FileTotalSize")
    @Expose
    private Long FileTotalSize;

    /**
    * 已处理完成的文件容量，单位Byte


    */
    @SerializedName("FileSuccessedSize")
    @Expose
    private Long FileSuccessedSize;

    /**
    * 已处理失败文件容量，单位Byte

    */
    @SerializedName("FileFailedSize")
    @Expose
    private Long FileFailedSize;

    /**
    * 总文件列表
    */
    @SerializedName("FileTotalList")
    @Expose
    private String FileTotalList;

    /**
    * 成功的文件列表
    */
    @SerializedName("FileSuccessedList")
    @Expose
    private String FileSuccessedList;

    /**
    * 失败文件的列表
    */
    @SerializedName("FileFailedList")
    @Expose
    private String FileFailedList;

    /**
    * FileSystemId
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * 任务名称
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 任务路径
    */
    @SerializedName("TaskPath")
    @Expose
    private String TaskPath;

    /**
    * 任务类型,archive:表示沉降任务，restore：表示拉取任务
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 数据流动Id
    */
    @SerializedName("DataFlowId")
    @Expose
    private String DataFlowId;

    /**
    * 当CFSTurbo内的文件和外置存储存在同名情况时，是否覆盖。

ture：覆盖

false：不覆盖（同时也不会释放热存数据）
为空时，默认为false
    */
    @SerializedName("IsOverwrite")
    @Expose
    private Boolean IsOverwrite;

    /**
     * Get 任务id 
     * @return TaskId 任务id
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务id
     * @param TaskId 任务id
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 任务状态.
init：未执行
running：执行中，finished：已完成
,failed：失败
,stopping：停止中,stopped：已停止 
     * @return TaskStatus 任务状态.
init：未执行
running：执行中，finished：已完成
,failed：失败
,stopping：停止中,stopped：已停止
     */
    public String getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set 任务状态.
init：未执行
running：执行中，finished：已完成
,failed：失败
,stopping：停止中,stopped：已停止
     * @param TaskStatus 任务状态.
init：未执行
running：执行中，finished：已完成
,failed：失败
,stopping：停止中,stopped：已停止
     */
    public void setTaskStatus(String TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get 任务创建时间 
     * @return CreationTime 任务创建时间
     */
    public String getCreationTime() {
        return this.CreationTime;
    }

    /**
     * Set 任务创建时间
     * @param CreationTime 任务创建时间
     */
    public void setCreationTime(String CreationTime) {
        this.CreationTime = CreationTime;
    }

    /**
     * Get 任务结束时间 
     * @return FinishTime 任务结束时间
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set 任务结束时间
     * @param FinishTime 任务结束时间
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    /**
     * Get 文件总数 
     * @return FileTotalCount 文件总数
     */
    public Long getFileTotalCount() {
        return this.FileTotalCount;
    }

    /**
     * Set 文件总数
     * @param FileTotalCount 文件总数
     */
    public void setFileTotalCount(Long FileTotalCount) {
        this.FileTotalCount = FileTotalCount;
    }

    /**
     * Get 处理成功文件数量 
     * @return FileSuccessedCount 处理成功文件数量
     */
    public Long getFileSuccessedCount() {
        return this.FileSuccessedCount;
    }

    /**
     * Set 处理成功文件数量
     * @param FileSuccessedCount 处理成功文件数量
     */
    public void setFileSuccessedCount(Long FileSuccessedCount) {
        this.FileSuccessedCount = FileSuccessedCount;
    }

    /**
     * Get 当前已经失败的文件数 
     * @return FileFailedCount 当前已经失败的文件数
     */
    public Long getFileFailedCount() {
        return this.FileFailedCount;
    }

    /**
     * Set 当前已经失败的文件数
     * @param FileFailedCount 当前已经失败的文件数
     */
    public void setFileFailedCount(Long FileFailedCount) {
        this.FileFailedCount = FileFailedCount;
    }

    /**
     * Get 文件容量，单位Byte

 
     * @return FileTotalSize 文件容量，单位Byte


     */
    public Long getFileTotalSize() {
        return this.FileTotalSize;
    }

    /**
     * Set 文件容量，单位Byte


     * @param FileTotalSize 文件容量，单位Byte


     */
    public void setFileTotalSize(Long FileTotalSize) {
        this.FileTotalSize = FileTotalSize;
    }

    /**
     * Get 已处理完成的文件容量，单位Byte

 
     * @return FileSuccessedSize 已处理完成的文件容量，单位Byte


     */
    public Long getFileSuccessedSize() {
        return this.FileSuccessedSize;
    }

    /**
     * Set 已处理完成的文件容量，单位Byte


     * @param FileSuccessedSize 已处理完成的文件容量，单位Byte


     */
    public void setFileSuccessedSize(Long FileSuccessedSize) {
        this.FileSuccessedSize = FileSuccessedSize;
    }

    /**
     * Get 已处理失败文件容量，单位Byte
 
     * @return FileFailedSize 已处理失败文件容量，单位Byte

     */
    public Long getFileFailedSize() {
        return this.FileFailedSize;
    }

    /**
     * Set 已处理失败文件容量，单位Byte

     * @param FileFailedSize 已处理失败文件容量，单位Byte

     */
    public void setFileFailedSize(Long FileFailedSize) {
        this.FileFailedSize = FileFailedSize;
    }

    /**
     * Get 总文件列表 
     * @return FileTotalList 总文件列表
     */
    public String getFileTotalList() {
        return this.FileTotalList;
    }

    /**
     * Set 总文件列表
     * @param FileTotalList 总文件列表
     */
    public void setFileTotalList(String FileTotalList) {
        this.FileTotalList = FileTotalList;
    }

    /**
     * Get 成功的文件列表 
     * @return FileSuccessedList 成功的文件列表
     */
    public String getFileSuccessedList() {
        return this.FileSuccessedList;
    }

    /**
     * Set 成功的文件列表
     * @param FileSuccessedList 成功的文件列表
     */
    public void setFileSuccessedList(String FileSuccessedList) {
        this.FileSuccessedList = FileSuccessedList;
    }

    /**
     * Get 失败文件的列表 
     * @return FileFailedList 失败文件的列表
     */
    public String getFileFailedList() {
        return this.FileFailedList;
    }

    /**
     * Set 失败文件的列表
     * @param FileFailedList 失败文件的列表
     */
    public void setFileFailedList(String FileFailedList) {
        this.FileFailedList = FileFailedList;
    }

    /**
     * Get FileSystemId 
     * @return FileSystemId FileSystemId
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set FileSystemId
     * @param FileSystemId FileSystemId
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
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
     * Get 任务路径 
     * @return TaskPath 任务路径
     */
    public String getTaskPath() {
        return this.TaskPath;
    }

    /**
     * Set 任务路径
     * @param TaskPath 任务路径
     */
    public void setTaskPath(String TaskPath) {
        this.TaskPath = TaskPath;
    }

    /**
     * Get 任务类型,archive:表示沉降任务，restore：表示拉取任务 
     * @return Type 任务类型,archive:表示沉降任务，restore：表示拉取任务
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 任务类型,archive:表示沉降任务，restore：表示拉取任务
     * @param Type 任务类型,archive:表示沉降任务，restore：表示拉取任务
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 数据流动Id 
     * @return DataFlowId 数据流动Id
     */
    public String getDataFlowId() {
        return this.DataFlowId;
    }

    /**
     * Set 数据流动Id
     * @param DataFlowId 数据流动Id
     */
    public void setDataFlowId(String DataFlowId) {
        this.DataFlowId = DataFlowId;
    }

    /**
     * Get 当CFSTurbo内的文件和外置存储存在同名情况时，是否覆盖。

ture：覆盖

false：不覆盖（同时也不会释放热存数据）
为空时，默认为false 
     * @return IsOverwrite 当CFSTurbo内的文件和外置存储存在同名情况时，是否覆盖。

ture：覆盖

false：不覆盖（同时也不会释放热存数据）
为空时，默认为false
     */
    public Boolean getIsOverwrite() {
        return this.IsOverwrite;
    }

    /**
     * Set 当CFSTurbo内的文件和外置存储存在同名情况时，是否覆盖。

ture：覆盖

false：不覆盖（同时也不会释放热存数据）
为空时，默认为false
     * @param IsOverwrite 当CFSTurbo内的文件和外置存储存在同名情况时，是否覆盖。

ture：覆盖

false：不覆盖（同时也不会释放热存数据）
为空时，默认为false
     */
    public void setIsOverwrite(Boolean IsOverwrite) {
        this.IsOverwrite = IsOverwrite;
    }

    public LifecycleDataTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LifecycleDataTaskInfo(LifecycleDataTaskInfo source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new String(source.TaskStatus);
        }
        if (source.CreationTime != null) {
            this.CreationTime = new String(source.CreationTime);
        }
        if (source.FinishTime != null) {
            this.FinishTime = new String(source.FinishTime);
        }
        if (source.FileTotalCount != null) {
            this.FileTotalCount = new Long(source.FileTotalCount);
        }
        if (source.FileSuccessedCount != null) {
            this.FileSuccessedCount = new Long(source.FileSuccessedCount);
        }
        if (source.FileFailedCount != null) {
            this.FileFailedCount = new Long(source.FileFailedCount);
        }
        if (source.FileTotalSize != null) {
            this.FileTotalSize = new Long(source.FileTotalSize);
        }
        if (source.FileSuccessedSize != null) {
            this.FileSuccessedSize = new Long(source.FileSuccessedSize);
        }
        if (source.FileFailedSize != null) {
            this.FileFailedSize = new Long(source.FileFailedSize);
        }
        if (source.FileTotalList != null) {
            this.FileTotalList = new String(source.FileTotalList);
        }
        if (source.FileSuccessedList != null) {
            this.FileSuccessedList = new String(source.FileSuccessedList);
        }
        if (source.FileFailedList != null) {
            this.FileFailedList = new String(source.FileFailedList);
        }
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.TaskPath != null) {
            this.TaskPath = new String(source.TaskPath);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.DataFlowId != null) {
            this.DataFlowId = new String(source.DataFlowId);
        }
        if (source.IsOverwrite != null) {
            this.IsOverwrite = new Boolean(source.IsOverwrite);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);
        this.setParamSimple(map, prefix + "CreationTime", this.CreationTime);
        this.setParamSimple(map, prefix + "FinishTime", this.FinishTime);
        this.setParamSimple(map, prefix + "FileTotalCount", this.FileTotalCount);
        this.setParamSimple(map, prefix + "FileSuccessedCount", this.FileSuccessedCount);
        this.setParamSimple(map, prefix + "FileFailedCount", this.FileFailedCount);
        this.setParamSimple(map, prefix + "FileTotalSize", this.FileTotalSize);
        this.setParamSimple(map, prefix + "FileSuccessedSize", this.FileSuccessedSize);
        this.setParamSimple(map, prefix + "FileFailedSize", this.FileFailedSize);
        this.setParamSimple(map, prefix + "FileTotalList", this.FileTotalList);
        this.setParamSimple(map, prefix + "FileSuccessedList", this.FileSuccessedList);
        this.setParamSimple(map, prefix + "FileFailedList", this.FileFailedList);
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "TaskPath", this.TaskPath);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "DataFlowId", this.DataFlowId);
        this.setParamSimple(map, prefix + "IsOverwrite", this.IsOverwrite);

    }
}

