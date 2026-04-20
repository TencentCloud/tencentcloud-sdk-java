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
    * <p>任务ID</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>任务名称</p>
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * <p>任务类型，SOURCE数据接入，SINK数据流出</p>
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * <p>状态，-1创建失败，0创建中，1运行中，2删除中，3已删除，4删除失败，5暂停中，6已暂停，7暂停失败，8恢复中，9恢复失败</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>数据源</p>
    */
    @SerializedName("SourceResource")
    @Expose
    private DatahubResource SourceResource;

    /**
    * <p>数据目标</p>
    */
    @SerializedName("TargetResource")
    @Expose
    private DatahubResource TargetResource;

    /**
    * <p>Connection列表</p>
    */
    @SerializedName("Connections")
    @Expose
    private Connection [] Connections;

    /**
    * <p>任务创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>消息处理规则</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TransformParam")
    @Expose
    private TransformParam TransformParam;

    /**
    * <p>数据接入ID</p>
    */
    @SerializedName("DatahubId")
    @Expose
    private String DatahubId;

    /**
    * <p>绑定的SchemaId</p>
    */
    @SerializedName("SchemaId")
    @Expose
    private String SchemaId;

    /**
    * <p>绑定的Schema名称</p>
    */
    @SerializedName("SchemaName")
    @Expose
    private String SchemaName;

    /**
    * <p>数据处理规则</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TransformsParam")
    @Expose
    private TransformsParam TransformsParam;

    /**
    * <p>异常信息</p>
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
    * <p>任务标签列表</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>任务描述信息</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>1:正常 2:隔离中</p>
    */
    @SerializedName("IsolateStatus")
    @Expose
    private Long IsolateStatus;

    /**
    * <p>并发数</p><p>默认值：1</p>
    */
    @SerializedName("TaskMax")
    @Expose
    private Long TaskMax;

    /**
    * <p>并发流量预估参考上限，MB/s</p>
    */
    @SerializedName("SyncThrottleLimit")
    @Expose
    private Long SyncThrottleLimit;

    /**
    * <p>自动扩容 true:自动扩容 false:手动扩容</p><p>默认值：true</p>
    */
    @SerializedName("AutoExpandFlag")
    @Expose
    private Boolean AutoExpandFlag;

    /**
     * Get <p>任务ID</p> 
     * @return TaskId <p>任务ID</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>任务ID</p>
     * @param TaskId <p>任务ID</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
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
     * Get <p>任务类型，SOURCE数据接入，SINK数据流出</p> 
     * @return TaskType <p>任务类型，SOURCE数据接入，SINK数据流出</p>
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set <p>任务类型，SOURCE数据接入，SINK数据流出</p>
     * @param TaskType <p>任务类型，SOURCE数据接入，SINK数据流出</p>
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get <p>状态，-1创建失败，0创建中，1运行中，2删除中，3已删除，4删除失败，5暂停中，6已暂停，7暂停失败，8恢复中，9恢复失败</p> 
     * @return Status <p>状态，-1创建失败，0创建中，1运行中，2删除中，3已删除，4删除失败，5暂停中，6已暂停，7暂停失败，8恢复中，9恢复失败</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态，-1创建失败，0创建中，1运行中，2删除中，3已删除，4删除失败，5暂停中，6已暂停，7暂停失败，8恢复中，9恢复失败</p>
     * @param Status <p>状态，-1创建失败，0创建中，1运行中，2删除中，3已删除，4删除失败，5暂停中，6已暂停，7暂停失败，8恢复中，9恢复失败</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>数据源</p> 
     * @return SourceResource <p>数据源</p>
     */
    public DatahubResource getSourceResource() {
        return this.SourceResource;
    }

    /**
     * Set <p>数据源</p>
     * @param SourceResource <p>数据源</p>
     */
    public void setSourceResource(DatahubResource SourceResource) {
        this.SourceResource = SourceResource;
    }

    /**
     * Get <p>数据目标</p> 
     * @return TargetResource <p>数据目标</p>
     */
    public DatahubResource getTargetResource() {
        return this.TargetResource;
    }

    /**
     * Set <p>数据目标</p>
     * @param TargetResource <p>数据目标</p>
     */
    public void setTargetResource(DatahubResource TargetResource) {
        this.TargetResource = TargetResource;
    }

    /**
     * Get <p>Connection列表</p> 
     * @return Connections <p>Connection列表</p>
     */
    public Connection [] getConnections() {
        return this.Connections;
    }

    /**
     * Set <p>Connection列表</p>
     * @param Connections <p>Connection列表</p>
     */
    public void setConnections(Connection [] Connections) {
        this.Connections = Connections;
    }

    /**
     * Get <p>任务创建时间</p> 
     * @return CreateTime <p>任务创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>任务创建时间</p>
     * @param CreateTime <p>任务创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>消息处理规则</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TransformParam <p>消息处理规则</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TransformParam getTransformParam() {
        return this.TransformParam;
    }

    /**
     * Set <p>消息处理规则</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TransformParam <p>消息处理规则</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTransformParam(TransformParam TransformParam) {
        this.TransformParam = TransformParam;
    }

    /**
     * Get <p>数据接入ID</p> 
     * @return DatahubId <p>数据接入ID</p>
     */
    public String getDatahubId() {
        return this.DatahubId;
    }

    /**
     * Set <p>数据接入ID</p>
     * @param DatahubId <p>数据接入ID</p>
     */
    public void setDatahubId(String DatahubId) {
        this.DatahubId = DatahubId;
    }

    /**
     * Get <p>绑定的SchemaId</p> 
     * @return SchemaId <p>绑定的SchemaId</p>
     */
    public String getSchemaId() {
        return this.SchemaId;
    }

    /**
     * Set <p>绑定的SchemaId</p>
     * @param SchemaId <p>绑定的SchemaId</p>
     */
    public void setSchemaId(String SchemaId) {
        this.SchemaId = SchemaId;
    }

    /**
     * Get <p>绑定的Schema名称</p> 
     * @return SchemaName <p>绑定的Schema名称</p>
     */
    public String getSchemaName() {
        return this.SchemaName;
    }

    /**
     * Set <p>绑定的Schema名称</p>
     * @param SchemaName <p>绑定的Schema名称</p>
     */
    public void setSchemaName(String SchemaName) {
        this.SchemaName = SchemaName;
    }

    /**
     * Get <p>数据处理规则</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TransformsParam <p>数据处理规则</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TransformsParam getTransformsParam() {
        return this.TransformsParam;
    }

    /**
     * Set <p>数据处理规则</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TransformsParam <p>数据处理规则</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTransformsParam(TransformsParam TransformsParam) {
        this.TransformsParam = TransformsParam;
    }

    /**
     * Get <p>异常信息</p> 
     * @return ErrorMessage <p>异常信息</p>
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set <p>异常信息</p>
     * @param ErrorMessage <p>异常信息</p>
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    /**
     * Get <p>任务标签列表</p> 
     * @return Tags <p>任务标签列表</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>任务标签列表</p>
     * @param Tags <p>任务标签列表</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>任务描述信息</p> 
     * @return Description <p>任务描述信息</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>任务描述信息</p>
     * @param Description <p>任务描述信息</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>1:正常 2:隔离中</p> 
     * @return IsolateStatus <p>1:正常 2:隔离中</p>
     */
    public Long getIsolateStatus() {
        return this.IsolateStatus;
    }

    /**
     * Set <p>1:正常 2:隔离中</p>
     * @param IsolateStatus <p>1:正常 2:隔离中</p>
     */
    public void setIsolateStatus(Long IsolateStatus) {
        this.IsolateStatus = IsolateStatus;
    }

    /**
     * Get <p>并发数</p><p>默认值：1</p> 
     * @return TaskMax <p>并发数</p><p>默认值：1</p>
     */
    public Long getTaskMax() {
        return this.TaskMax;
    }

    /**
     * Set <p>并发数</p><p>默认值：1</p>
     * @param TaskMax <p>并发数</p><p>默认值：1</p>
     */
    public void setTaskMax(Long TaskMax) {
        this.TaskMax = TaskMax;
    }

    /**
     * Get <p>并发流量预估参考上限，MB/s</p> 
     * @return SyncThrottleLimit <p>并发流量预估参考上限，MB/s</p>
     */
    public Long getSyncThrottleLimit() {
        return this.SyncThrottleLimit;
    }

    /**
     * Set <p>并发流量预估参考上限，MB/s</p>
     * @param SyncThrottleLimit <p>并发流量预估参考上限，MB/s</p>
     */
    public void setSyncThrottleLimit(Long SyncThrottleLimit) {
        this.SyncThrottleLimit = SyncThrottleLimit;
    }

    /**
     * Get <p>自动扩容 true:自动扩容 false:手动扩容</p><p>默认值：true</p> 
     * @return AutoExpandFlag <p>自动扩容 true:自动扩容 false:手动扩容</p><p>默认值：true</p>
     */
    public Boolean getAutoExpandFlag() {
        return this.AutoExpandFlag;
    }

    /**
     * Set <p>自动扩容 true:自动扩容 false:手动扩容</p><p>默认值：true</p>
     * @param AutoExpandFlag <p>自动扩容 true:自动扩容 false:手动扩容</p><p>默认值：true</p>
     */
    public void setAutoExpandFlag(Boolean AutoExpandFlag) {
        this.AutoExpandFlag = AutoExpandFlag;
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
        if (source.TaskMax != null) {
            this.TaskMax = new Long(source.TaskMax);
        }
        if (source.SyncThrottleLimit != null) {
            this.SyncThrottleLimit = new Long(source.SyncThrottleLimit);
        }
        if (source.AutoExpandFlag != null) {
            this.AutoExpandFlag = new Boolean(source.AutoExpandFlag);
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
        this.setParamSimple(map, prefix + "TaskMax", this.TaskMax);
        this.setParamSimple(map, prefix + "SyncThrottleLimit", this.SyncThrottleLimit);
        this.setParamSimple(map, prefix + "AutoExpandFlag", this.AutoExpandFlag);

    }
}

