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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDatahubTaskRes extends AbstractModel {

    /**
    * 任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 任务名称
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 任务类型，SOURCE数据接入，SINK数据流出
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * 状态，-1创建失败，0创建中，1运行中，2删除中，3已删除，4删除失败，5暂停中，6已暂停，7暂停失败，8恢复中，9恢复失败
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 数据源
    */
    @SerializedName("SourceResource")
    @Expose
    private DatahubResource SourceResource;

    /**
    * 数据目标
    */
    @SerializedName("TargetResource")
    @Expose
    private DatahubResource TargetResource;

    /**
    * Connection列表
    */
    @SerializedName("Connections")
    @Expose
    private Connection [] Connections;

    /**
    * 任务创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 消息处理规则
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TransformParam")
    @Expose
    private TransformParam TransformParam;

    /**
    * 数据接入ID
    */
    @SerializedName("DatahubId")
    @Expose
    private String DatahubId;

    /**
    * 绑定的SchemaId
    */
    @SerializedName("SchemaId")
    @Expose
    private String SchemaId;

    /**
    * 绑定的Schema名称
    */
    @SerializedName("SchemaName")
    @Expose
    private String SchemaName;

    /**
    * 数据处理规则
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TransformsParam")
    @Expose
    private TransformsParam TransformsParam;

    /**
    * 异常信息
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
    * 任务标签列表
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 任务描述信息	
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 1:正常 2:隔离中
    */
    @SerializedName("IsolateStatus")
    @Expose
    private Long IsolateStatus;

    /**
     * Get 任务ID 
     * @return TaskId 任务ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID
     * @param TaskId 任务ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
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
     * Get 任务类型，SOURCE数据接入，SINK数据流出 
     * @return TaskType 任务类型，SOURCE数据接入，SINK数据流出
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 任务类型，SOURCE数据接入，SINK数据流出
     * @param TaskType 任务类型，SOURCE数据接入，SINK数据流出
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 状态，-1创建失败，0创建中，1运行中，2删除中，3已删除，4删除失败，5暂停中，6已暂停，7暂停失败，8恢复中，9恢复失败 
     * @return Status 状态，-1创建失败，0创建中，1运行中，2删除中，3已删除，4删除失败，5暂停中，6已暂停，7暂停失败，8恢复中，9恢复失败
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态，-1创建失败，0创建中，1运行中，2删除中，3已删除，4删除失败，5暂停中，6已暂停，7暂停失败，8恢复中，9恢复失败
     * @param Status 状态，-1创建失败，0创建中，1运行中，2删除中，3已删除，4删除失败，5暂停中，6已暂停，7暂停失败，8恢复中，9恢复失败
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 数据源 
     * @return SourceResource 数据源
     */
    public DatahubResource getSourceResource() {
        return this.SourceResource;
    }

    /**
     * Set 数据源
     * @param SourceResource 数据源
     */
    public void setSourceResource(DatahubResource SourceResource) {
        this.SourceResource = SourceResource;
    }

    /**
     * Get 数据目标 
     * @return TargetResource 数据目标
     */
    public DatahubResource getTargetResource() {
        return this.TargetResource;
    }

    /**
     * Set 数据目标
     * @param TargetResource 数据目标
     */
    public void setTargetResource(DatahubResource TargetResource) {
        this.TargetResource = TargetResource;
    }

    /**
     * Get Connection列表 
     * @return Connections Connection列表
     */
    public Connection [] getConnections() {
        return this.Connections;
    }

    /**
     * Set Connection列表
     * @param Connections Connection列表
     */
    public void setConnections(Connection [] Connections) {
        this.Connections = Connections;
    }

    /**
     * Get 任务创建时间 
     * @return CreateTime 任务创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 任务创建时间
     * @param CreateTime 任务创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 消息处理规则
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TransformParam 消息处理规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TransformParam getTransformParam() {
        return this.TransformParam;
    }

    /**
     * Set 消息处理规则
注意：此字段可能返回 null，表示取不到有效值。
     * @param TransformParam 消息处理规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTransformParam(TransformParam TransformParam) {
        this.TransformParam = TransformParam;
    }

    /**
     * Get 数据接入ID 
     * @return DatahubId 数据接入ID
     */
    public String getDatahubId() {
        return this.DatahubId;
    }

    /**
     * Set 数据接入ID
     * @param DatahubId 数据接入ID
     */
    public void setDatahubId(String DatahubId) {
        this.DatahubId = DatahubId;
    }

    /**
     * Get 绑定的SchemaId 
     * @return SchemaId 绑定的SchemaId
     */
    public String getSchemaId() {
        return this.SchemaId;
    }

    /**
     * Set 绑定的SchemaId
     * @param SchemaId 绑定的SchemaId
     */
    public void setSchemaId(String SchemaId) {
        this.SchemaId = SchemaId;
    }

    /**
     * Get 绑定的Schema名称 
     * @return SchemaName 绑定的Schema名称
     */
    public String getSchemaName() {
        return this.SchemaName;
    }

    /**
     * Set 绑定的Schema名称
     * @param SchemaName 绑定的Schema名称
     */
    public void setSchemaName(String SchemaName) {
        this.SchemaName = SchemaName;
    }

    /**
     * Get 数据处理规则
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TransformsParam 数据处理规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TransformsParam getTransformsParam() {
        return this.TransformsParam;
    }

    /**
     * Set 数据处理规则
注意：此字段可能返回 null，表示取不到有效值。
     * @param TransformsParam 数据处理规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTransformsParam(TransformsParam TransformsParam) {
        this.TransformsParam = TransformsParam;
    }

    /**
     * Get 异常信息 
     * @return ErrorMessage 异常信息
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set 异常信息
     * @param ErrorMessage 异常信息
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    /**
     * Get 任务标签列表 
     * @return Tags 任务标签列表
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 任务标签列表
     * @param Tags 任务标签列表
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 任务描述信息	 
     * @return Description 任务描述信息	
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 任务描述信息	
     * @param Description 任务描述信息	
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 1:正常 2:隔离中 
     * @return IsolateStatus 1:正常 2:隔离中
     */
    public Long getIsolateStatus() {
        return this.IsolateStatus;
    }

    /**
     * Set 1:正常 2:隔离中
     * @param IsolateStatus 1:正常 2:隔离中
     */
    public void setIsolateStatus(Long IsolateStatus) {
        this.IsolateStatus = IsolateStatus;
    }

    public DescribeDatahubTaskRes() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDatahubTaskRes(DescribeDatahubTaskRes source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.SourceResource != null) {
            this.SourceResource = new DatahubResource(source.SourceResource);
        }
        if (source.TargetResource != null) {
            this.TargetResource = new DatahubResource(source.TargetResource);
        }
        if (source.Connections != null) {
            this.Connections = new Connection[source.Connections.length];
            for (int i = 0; i < source.Connections.length; i++) {
                this.Connections[i] = new Connection(source.Connections[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.TransformParam != null) {
            this.TransformParam = new TransformParam(source.TransformParam);
        }
        if (source.DatahubId != null) {
            this.DatahubId = new String(source.DatahubId);
        }
        if (source.SchemaId != null) {
            this.SchemaId = new String(source.SchemaId);
        }
        if (source.SchemaName != null) {
            this.SchemaName = new String(source.SchemaName);
        }
        if (source.TransformsParam != null) {
            this.TransformsParam = new TransformsParam(source.TransformsParam);
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.IsolateStatus != null) {
            this.IsolateStatus = new Long(source.IsolateStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamObj(map, prefix + "SourceResource.", this.SourceResource);
        this.setParamObj(map, prefix + "TargetResource.", this.TargetResource);
        this.setParamArrayObj(map, prefix + "Connections.", this.Connections);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamObj(map, prefix + "TransformParam.", this.TransformParam);
        this.setParamSimple(map, prefix + "DatahubId", this.DatahubId);
        this.setParamSimple(map, prefix + "SchemaId", this.SchemaId);
        this.setParamSimple(map, prefix + "SchemaName", this.SchemaName);
        this.setParamObj(map, prefix + "TransformsParam.", this.TransformsParam);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "IsolateStatus", this.IsolateStatus);

    }
}

