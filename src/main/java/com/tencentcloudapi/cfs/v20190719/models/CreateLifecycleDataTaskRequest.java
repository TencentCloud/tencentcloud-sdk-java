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
    * 文件系统唯一 ID
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * 生命周期任务类型；archive：沉降；restore：预热；release：数据释放；metaload：元数据加载
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 需要沉降的路径或文件，仅支持传入1个路径，不允许为空。
    */
    @SerializedName("TaskPath")
    @Expose
    private String TaskPath;

    /**
    * 任务名称
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 数据流动 ID ，该接口可以通过 DescribeDataFlow 查询
    */
    @SerializedName("DataFlowId")
    @Expose
    private String DataFlowId;

    /**
     * Get 文件系统唯一 ID 
     * @return FileSystemId 文件系统唯一 ID
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set 文件系统唯一 ID
     * @param FileSystemId 文件系统唯一 ID
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Get 生命周期任务类型；archive：沉降；restore：预热；release：数据释放；metaload：元数据加载 
     * @return Type 生命周期任务类型；archive：沉降；restore：预热；release：数据释放；metaload：元数据加载
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 生命周期任务类型；archive：沉降；restore：预热；release：数据释放；metaload：元数据加载
     * @param Type 生命周期任务类型；archive：沉降；restore：预热；release：数据释放；metaload：元数据加载
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 需要沉降的路径或文件，仅支持传入1个路径，不允许为空。 
     * @return TaskPath 需要沉降的路径或文件，仅支持传入1个路径，不允许为空。
     */
    public String getTaskPath() {
        return this.TaskPath;
    }

    /**
     * Set 需要沉降的路径或文件，仅支持传入1个路径，不允许为空。
     * @param TaskPath 需要沉降的路径或文件，仅支持传入1个路径，不允许为空。
     */
    public void setTaskPath(String TaskPath) {
        this.TaskPath = TaskPath;
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
     * Get 数据流动 ID ，该接口可以通过 DescribeDataFlow 查询 
     * @return DataFlowId 数据流动 ID ，该接口可以通过 DescribeDataFlow 查询
     */
    public String getDataFlowId() {
        return this.DataFlowId;
    }

    /**
     * Set 数据流动 ID ，该接口可以通过 DescribeDataFlow 查询
     * @param DataFlowId 数据流动 ID ，该接口可以通过 DescribeDataFlow 查询
     */
    public void setDataFlowId(String DataFlowId) {
        this.DataFlowId = DataFlowId;
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
        if (source.TaskPath != null) {
            this.TaskPath = new String(source.TaskPath);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.DataFlowId != null) {
            this.DataFlowId = new String(source.DataFlowId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "TaskPath", this.TaskPath);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "DataFlowId", this.DataFlowId);

    }
}

