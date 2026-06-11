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
    * <p>任务id</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>任务状态.<br>init：未执行<br>running：执行中，finished：已完成<br>,failed：失败<br>,stopping：停止中,stopped：已停止</p>
    */
    @SerializedName("TaskStatus")
    @Expose
    private String TaskStatus;

    /**
    * <p>任务创建时间</p>
    */
    @SerializedName("CreationTime")
    @Expose
    private String CreationTime;

    /**
    * <p>任务结束时间</p>
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

    /**
    * <p>文件总数</p>
    */
    @SerializedName("FileTotalCount")
    @Expose
    private Long FileTotalCount;

    /**
    * <p>处理成功文件数量</p>
    */
    @SerializedName("FileSuccessedCount")
    @Expose
    private Long FileSuccessedCount;

    /**
    * <p>当前已经失败的文件数</p>
    */
    @SerializedName("FileFailedCount")
    @Expose
    private Long FileFailedCount;

    /**
    * <p>文件容量，单位Byte</p>
    */
    @SerializedName("FileTotalSize")
    @Expose
    private Long FileTotalSize;

    /**
    * <p>已处理完成的文件容量，单位Byte</p>
    */
    @SerializedName("FileSuccessedSize")
    @Expose
    private Long FileSuccessedSize;

    /**
    * <p>已处理失败文件容量，单位Byte</p>
    */
    @SerializedName("FileFailedSize")
    @Expose
    private Long FileFailedSize;

    /**
    * <p>总文件列表</p>
    */
    @SerializedName("FileTotalList")
    @Expose
    private String FileTotalList;

    /**
    * <p>成功的文件列表</p>
    */
    @SerializedName("FileSuccessedList")
    @Expose
    private String FileSuccessedList;

    /**
    * <p>失败文件的列表</p>
    */
    @SerializedName("FileFailedList")
    @Expose
    private String FileFailedList;

    /**
    * <p>FileSystemId</p>
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * <p>任务名称</p>
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * <p>任务路径</p>
    */
    @SerializedName("TaskPath")
    @Expose
    private String TaskPath;

    /**
    * <p>任务类型,archive:表示沉降任务，restore：表示拉取任务</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>数据流动Id</p>
    */
    @SerializedName("DataFlowId")
    @Expose
    private String DataFlowId;

    /**
    * <p>当CFSTurbo内的文件和外置存储存在同名情况时，是否覆盖。</p><p>ture：覆盖</p><p>false：不覆盖（同时也不会释放热存数据）<br>为空时，默认为false</p>
    */
    @SerializedName("IsOverwrite")
    @Expose
    private Boolean IsOverwrite;

    /**
    * <p>【新增】数据清单文件路径，清单文件内每行一条待处理文件的完整路径。与 TaskPath 二选一。路径必须以 /cfs 开头，且必须为 CFS 文件系统内已存在的文件。示例值：/cfs/lists/archive_list.txt</p>
    */
    @SerializedName("ListPath")
    @Expose
    private String ListPath;

    /**
     * Get <p>任务id</p> 
     * @return TaskId <p>任务id</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>任务id</p>
     * @param TaskId <p>任务id</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>任务状态.<br>init：未执行<br>running：执行中，finished：已完成<br>,failed：失败<br>,stopping：停止中,stopped：已停止</p> 
     * @return TaskStatus <p>任务状态.<br>init：未执行<br>running：执行中，finished：已完成<br>,failed：失败<br>,stopping：停止中,stopped：已停止</p>
     */
    public String getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set <p>任务状态.<br>init：未执行<br>running：执行中，finished：已完成<br>,failed：失败<br>,stopping：停止中,stopped：已停止</p>
     * @param TaskStatus <p>任务状态.<br>init：未执行<br>running：执行中，finished：已完成<br>,failed：失败<br>,stopping：停止中,stopped：已停止</p>
     */
    public void setTaskStatus(String TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get <p>任务创建时间</p> 
     * @return CreationTime <p>任务创建时间</p>
     */
    public String getCreationTime() {
        return this.CreationTime;
    }

    /**
     * Set <p>任务创建时间</p>
     * @param CreationTime <p>任务创建时间</p>
     */
    public void setCreationTime(String CreationTime) {
        this.CreationTime = CreationTime;
    }

    /**
     * Get <p>任务结束时间</p> 
     * @return FinishTime <p>任务结束时间</p>
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set <p>任务结束时间</p>
     * @param FinishTime <p>任务结束时间</p>
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    /**
     * Get <p>文件总数</p> 
     * @return FileTotalCount <p>文件总数</p>
     */
    public Long getFileTotalCount() {
        return this.FileTotalCount;
    }

    /**
     * Set <p>文件总数</p>
     * @param FileTotalCount <p>文件总数</p>
     */
    public void setFileTotalCount(Long FileTotalCount) {
        this.FileTotalCount = FileTotalCount;
    }

    /**
     * Get <p>处理成功文件数量</p> 
     * @return FileSuccessedCount <p>处理成功文件数量</p>
     */
    public Long getFileSuccessedCount() {
        return this.FileSuccessedCount;
    }

    /**
     * Set <p>处理成功文件数量</p>
     * @param FileSuccessedCount <p>处理成功文件数量</p>
     */
    public void setFileSuccessedCount(Long FileSuccessedCount) {
        this.FileSuccessedCount = FileSuccessedCount;
    }

    /**
     * Get <p>当前已经失败的文件数</p> 
     * @return FileFailedCount <p>当前已经失败的文件数</p>
     */
    public Long getFileFailedCount() {
        return this.FileFailedCount;
    }

    /**
     * Set <p>当前已经失败的文件数</p>
     * @param FileFailedCount <p>当前已经失败的文件数</p>
     */
    public void setFileFailedCount(Long FileFailedCount) {
        this.FileFailedCount = FileFailedCount;
    }

    /**
     * Get <p>文件容量，单位Byte</p> 
     * @return FileTotalSize <p>文件容量，单位Byte</p>
     */
    public Long getFileTotalSize() {
        return this.FileTotalSize;
    }

    /**
     * Set <p>文件容量，单位Byte</p>
     * @param FileTotalSize <p>文件容量，单位Byte</p>
     */
    public void setFileTotalSize(Long FileTotalSize) {
        this.FileTotalSize = FileTotalSize;
    }

    /**
     * Get <p>已处理完成的文件容量，单位Byte</p> 
     * @return FileSuccessedSize <p>已处理完成的文件容量，单位Byte</p>
     */
    public Long getFileSuccessedSize() {
        return this.FileSuccessedSize;
    }

    /**
     * Set <p>已处理完成的文件容量，单位Byte</p>
     * @param FileSuccessedSize <p>已处理完成的文件容量，单位Byte</p>
     */
    public void setFileSuccessedSize(Long FileSuccessedSize) {
        this.FileSuccessedSize = FileSuccessedSize;
    }

    /**
     * Get <p>已处理失败文件容量，单位Byte</p> 
     * @return FileFailedSize <p>已处理失败文件容量，单位Byte</p>
     */
    public Long getFileFailedSize() {
        return this.FileFailedSize;
    }

    /**
     * Set <p>已处理失败文件容量，单位Byte</p>
     * @param FileFailedSize <p>已处理失败文件容量，单位Byte</p>
     */
    public void setFileFailedSize(Long FileFailedSize) {
        this.FileFailedSize = FileFailedSize;
    }

    /**
     * Get <p>总文件列表</p> 
     * @return FileTotalList <p>总文件列表</p>
     */
    public String getFileTotalList() {
        return this.FileTotalList;
    }

    /**
     * Set <p>总文件列表</p>
     * @param FileTotalList <p>总文件列表</p>
     */
    public void setFileTotalList(String FileTotalList) {
        this.FileTotalList = FileTotalList;
    }

    /**
     * Get <p>成功的文件列表</p> 
     * @return FileSuccessedList <p>成功的文件列表</p>
     */
    public String getFileSuccessedList() {
        return this.FileSuccessedList;
    }

    /**
     * Set <p>成功的文件列表</p>
     * @param FileSuccessedList <p>成功的文件列表</p>
     */
    public void setFileSuccessedList(String FileSuccessedList) {
        this.FileSuccessedList = FileSuccessedList;
    }

    /**
     * Get <p>失败文件的列表</p> 
     * @return FileFailedList <p>失败文件的列表</p>
     */
    public String getFileFailedList() {
        return this.FileFailedList;
    }

    /**
     * Set <p>失败文件的列表</p>
     * @param FileFailedList <p>失败文件的列表</p>
     */
    public void setFileFailedList(String FileFailedList) {
        this.FileFailedList = FileFailedList;
    }

    /**
     * Get <p>FileSystemId</p> 
     * @return FileSystemId <p>FileSystemId</p>
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set <p>FileSystemId</p>
     * @param FileSystemId <p>FileSystemId</p>
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Get <p>任务名称</p> 
     * @return TaskName <p>任务名称</p>
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set <p>任务名称</p>
     * @param TaskName <p>任务名称</p>
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get <p>任务路径</p> 
     * @return TaskPath <p>任务路径</p>
     */
    public String getTaskPath() {
        return this.TaskPath;
    }

    /**
     * Set <p>任务路径</p>
     * @param TaskPath <p>任务路径</p>
     */
    public void setTaskPath(String TaskPath) {
        this.TaskPath = TaskPath;
    }

    /**
     * Get <p>任务类型,archive:表示沉降任务，restore：表示拉取任务</p> 
     * @return Type <p>任务类型,archive:表示沉降任务，restore：表示拉取任务</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>任务类型,archive:表示沉降任务，restore：表示拉取任务</p>
     * @param Type <p>任务类型,archive:表示沉降任务，restore：表示拉取任务</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>数据流动Id</p> 
     * @return DataFlowId <p>数据流动Id</p>
     */
    public String getDataFlowId() {
        return this.DataFlowId;
    }

    /**
     * Set <p>数据流动Id</p>
     * @param DataFlowId <p>数据流动Id</p>
     */
    public void setDataFlowId(String DataFlowId) {
        this.DataFlowId = DataFlowId;
    }

    /**
     * Get <p>当CFSTurbo内的文件和外置存储存在同名情况时，是否覆盖。</p><p>ture：覆盖</p><p>false：不覆盖（同时也不会释放热存数据）<br>为空时，默认为false</p> 
     * @return IsOverwrite <p>当CFSTurbo内的文件和外置存储存在同名情况时，是否覆盖。</p><p>ture：覆盖</p><p>false：不覆盖（同时也不会释放热存数据）<br>为空时，默认为false</p>
     */
    public Boolean getIsOverwrite() {
        return this.IsOverwrite;
    }

    /**
     * Set <p>当CFSTurbo内的文件和外置存储存在同名情况时，是否覆盖。</p><p>ture：覆盖</p><p>false：不覆盖（同时也不会释放热存数据）<br>为空时，默认为false</p>
     * @param IsOverwrite <p>当CFSTurbo内的文件和外置存储存在同名情况时，是否覆盖。</p><p>ture：覆盖</p><p>false：不覆盖（同时也不会释放热存数据）<br>为空时，默认为false</p>
     */
    public void setIsOverwrite(Boolean IsOverwrite) {
        this.IsOverwrite = IsOverwrite;
    }

    /**
     * Get <p>【新增】数据清单文件路径，清单文件内每行一条待处理文件的完整路径。与 TaskPath 二选一。路径必须以 /cfs 开头，且必须为 CFS 文件系统内已存在的文件。示例值：/cfs/lists/archive_list.txt</p> 
     * @return ListPath <p>【新增】数据清单文件路径，清单文件内每行一条待处理文件的完整路径。与 TaskPath 二选一。路径必须以 /cfs 开头，且必须为 CFS 文件系统内已存在的文件。示例值：/cfs/lists/archive_list.txt</p>
     */
    public String getListPath() {
        return this.ListPath;
    }

    /**
     * Set <p>【新增】数据清单文件路径，清单文件内每行一条待处理文件的完整路径。与 TaskPath 二选一。路径必须以 /cfs 开头，且必须为 CFS 文件系统内已存在的文件。示例值：/cfs/lists/archive_list.txt</p>
     * @param ListPath <p>【新增】数据清单文件路径，清单文件内每行一条待处理文件的完整路径。与 TaskPath 二选一。路径必须以 /cfs 开头，且必须为 CFS 文件系统内已存在的文件。示例值：/cfs/lists/archive_list.txt</p>
     */
    public void setListPath(String ListPath) {
        this.ListPath = ListPath;
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
        if (source.ListPath != null) {
            this.ListPath = new String(source.ListPath);
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
        this.setParamSimple(map, prefix + "ListPath", this.ListPath);

    }
}

