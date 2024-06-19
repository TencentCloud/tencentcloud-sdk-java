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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskInfoNew extends AbstractModel {

    /**
    * 任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 任务类型
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * 任务所关联的TcaplusDB内部事务ID
    */
    @SerializedName("TransId")
    @Expose
    private String TransId;

    /**
    * 任务所属集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 任务所属集群名称
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 任务进度
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * 任务创建时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 任务最后更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 操作者
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * 任务详情
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 表格组ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableGroupId")
    @Expose
    private String TableGroupId;

    /**
    * 表格组名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableGroupName")
    @Expose
    private String TableGroupName;

    /**
    * 表名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

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
     * Get 任务类型 
     * @return TaskType 任务类型
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 任务类型
     * @param TaskType 任务类型
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 任务所关联的TcaplusDB内部事务ID 
     * @return TransId 任务所关联的TcaplusDB内部事务ID
     */
    public String getTransId() {
        return this.TransId;
    }

    /**
     * Set 任务所关联的TcaplusDB内部事务ID
     * @param TransId 任务所关联的TcaplusDB内部事务ID
     */
    public void setTransId(String TransId) {
        this.TransId = TransId;
    }

    /**
     * Get 任务所属集群ID 
     * @return ClusterId 任务所属集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 任务所属集群ID
     * @param ClusterId 任务所属集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 任务所属集群名称 
     * @return ClusterName 任务所属集群名称
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 任务所属集群名称
     * @param ClusterName 任务所属集群名称
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get 任务进度 
     * @return Progress 任务进度
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set 任务进度
     * @param Progress 任务进度
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get 任务创建时间 
     * @return StartTime 任务创建时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 任务创建时间
     * @param StartTime 任务创建时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 任务最后更新时间 
     * @return UpdateTime 任务最后更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 任务最后更新时间
     * @param UpdateTime 任务最后更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 操作者 
     * @return Operator 操作者
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作者
     * @param Operator 操作者
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 任务详情 
     * @return Content 任务详情
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 任务详情
     * @param Content 任务详情
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 表格组ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableGroupId 表格组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableGroupId() {
        return this.TableGroupId;
    }

    /**
     * Set 表格组ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableGroupId 表格组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableGroupId(String TableGroupId) {
        this.TableGroupId = TableGroupId;
    }

    /**
     * Get 表格组名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableGroupName 表格组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableGroupName() {
        return this.TableGroupName;
    }

    /**
     * Set 表格组名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableGroupName 表格组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableGroupName(String TableGroupName) {
        this.TableGroupName = TableGroupName;
    }

    /**
     * Get 表名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableName 表名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set 表名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableName 表名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    public TaskInfoNew() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskInfoNew(TaskInfoNew source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.TransId != null) {
            this.TransId = new String(source.TransId);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.TableGroupId != null) {
            this.TableGroupId = new String(source.TableGroupId);
        }
        if (source.TableGroupName != null) {
            this.TableGroupName = new String(source.TableGroupName);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "TransId", this.TransId);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "TableGroupId", this.TableGroupId);
        this.setParamSimple(map, prefix + "TableGroupName", this.TableGroupName);
        this.setParamSimple(map, prefix + "TableName", this.TableName);

    }
}

