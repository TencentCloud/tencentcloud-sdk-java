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

public class CreateLifecycleDataTaskRequest extends AbstractModel {

    /**
    * <p>文件系统唯一 ID</p>
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * <p>生命周期任务类型；archive：沉降；restore：预热；release：数据释放；metaload：元数据加载</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>任务名称</p>
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * <p>需要沉降的路径或文件，仅支持传入1个路径，不允许为空。</p>
    */
    @SerializedName("TaskPath")
    @Expose
    private String TaskPath;

    /**
    * <p>数据流动 ID ，该接口可以通过 DescribeDataFlow 查询</p>
    */
    @SerializedName("DataFlowId")
    @Expose
    private String DataFlowId;

    /**
    * <p>当CFSTurbo内的文件和外置存储存在同名情况时，是否覆盖。  ture：覆盖  false：不覆盖（同时也不会释放热存数据）  为空时，默认为false</p>
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
     * Get <p>文件系统唯一 ID</p> 
     * @return FileSystemId <p>文件系统唯一 ID</p>
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set <p>文件系统唯一 ID</p>
     * @param FileSystemId <p>文件系统唯一 ID</p>
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Get <p>生命周期任务类型；archive：沉降；restore：预热；release：数据释放；metaload：元数据加载</p> 
     * @return Type <p>生命周期任务类型；archive：沉降；restore：预热；release：数据释放；metaload：元数据加载</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>生命周期任务类型；archive：沉降；restore：预热；release：数据释放；metaload：元数据加载</p>
     * @param Type <p>生命周期任务类型；archive：沉降；restore：预热；release：数据释放；metaload：元数据加载</p>
     */
    public void setType(String Type) {
        this.Type = Type;
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
     * Get <p>需要沉降的路径或文件，仅支持传入1个路径，不允许为空。</p> 
     * @return TaskPath <p>需要沉降的路径或文件，仅支持传入1个路径，不允许为空。</p>
     */
    public String getTaskPath() {
        return this.TaskPath;
    }

    /**
     * Set <p>需要沉降的路径或文件，仅支持传入1个路径，不允许为空。</p>
     * @param TaskPath <p>需要沉降的路径或文件，仅支持传入1个路径，不允许为空。</p>
     */
    public void setTaskPath(String TaskPath) {
        this.TaskPath = TaskPath;
    }

    /**
     * Get <p>数据流动 ID ，该接口可以通过 DescribeDataFlow 查询</p> 
     * @return DataFlowId <p>数据流动 ID ，该接口可以通过 DescribeDataFlow 查询</p>
     */
    public String getDataFlowId() {
        return this.DataFlowId;
    }

    /**
     * Set <p>数据流动 ID ，该接口可以通过 DescribeDataFlow 查询</p>
     * @param DataFlowId <p>数据流动 ID ，该接口可以通过 DescribeDataFlow 查询</p>
     */
    public void setDataFlowId(String DataFlowId) {
        this.DataFlowId = DataFlowId;
    }

    /**
     * Get <p>当CFSTurbo内的文件和外置存储存在同名情况时，是否覆盖。  ture：覆盖  false：不覆盖（同时也不会释放热存数据）  为空时，默认为false</p> 
     * @return IsOverwrite <p>当CFSTurbo内的文件和外置存储存在同名情况时，是否覆盖。  ture：覆盖  false：不覆盖（同时也不会释放热存数据）  为空时，默认为false</p>
     */
    public Boolean getIsOverwrite() {
        return this.IsOverwrite;
    }

    /**
     * Set <p>当CFSTurbo内的文件和外置存储存在同名情况时，是否覆盖。  ture：覆盖  false：不覆盖（同时也不会释放热存数据）  为空时，默认为false</p>
     * @param IsOverwrite <p>当CFSTurbo内的文件和外置存储存在同名情况时，是否覆盖。  ture：覆盖  false：不覆盖（同时也不会释放热存数据）  为空时，默认为false</p>
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

    public CreateLifecycleDataTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLifecycleDataTaskRequest(CreateLifecycleDataTaskRequest source) {
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.TaskPath != null) {
            this.TaskPath = new String(source.TaskPath);
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
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "TaskPath", this.TaskPath);
        this.setParamSimple(map, prefix + "DataFlowId", this.DataFlowId);
        this.setParamSimple(map, prefix + "IsOverwrite", this.IsOverwrite);
        this.setParamSimple(map, prefix + "ListPath", this.ListPath);

    }
}

