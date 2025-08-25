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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePendingSubmitTaskInfo extends AbstractModel {

    /**
    * 任务编号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 任务名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 修改类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModifyType")
    @Expose
    private String ModifyType;

    /**
    * 任务状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskStatus")
    @Expose
    private String TaskStatus;

    /**
    * 提交预检查（Y/N）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubmitPreCheck")
    @Expose
    private String SubmitPreCheck;

    /**
    * 提交预检查提交可能会失败的原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubmitPreCheckDetailList")
    @Expose
    private TaskSubmitPreCheckDetailInfo [] SubmitPreCheckDetailList;

    /**
    * 资源组编号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutorGroupId")
    @Expose
    private String ExecutorGroupId;

    /**
    * 资源组名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutorGroupName")
    @Expose
    private String ExecutorGroupName;

    /**
    * <p>任务类型id，取值范围：</p>
<ul>
<li>26 离线集成任务</li>
<li>30 Python任务</li>
<li>31 PySpark任务</li>
<li>34 HiveSQL任务</li>
<li>35 Shell任务</li>
<li>36 SparkSQL任务</li>
<li>21 JdbcSQL任务</li>
<li>23 TDSQL-PostgreSQL任务</li>
<li>32 DLCSQL任务</li>
<li>33 Impala任务</li>
<li>41 Kettle任务</li>
<li>42 Tchouse-X任务</li>
<li>43 TCHouse-X SQL任务</li>
<li>46 DLCSpark任务</li>
<li>50 DLC-PySpark任务</li>
<li>47 TiOne任务</li>
<li>48 Trino任务</li>
<li>39 Spark任务</li>
<li>92 MapReduce任务</li>
<li>38 Shell表单模式任务</li>
<li>130 BranchNode任务</li>
<li>131 MergeNode任务</li>
<li>132 Notebook任务</li>
<li>133 SSH任务</li>
<li>134 StarRocks任务</li>
<li>137 For-each任务</li>
</ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskTypeId")
    @Expose
    private Long TaskTypeId;

    /**
     * Get 任务编号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskId 任务编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务编号
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskId 任务编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 任务名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskName 任务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 任务名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskName 任务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 修改类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifyType 修改类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModifyType() {
        return this.ModifyType;
    }

    /**
     * Set 修改类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifyType 修改类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifyType(String ModifyType) {
        this.ModifyType = ModifyType;
    }

    /**
     * Get 任务状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskStatus 任务状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set 任务状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskStatus 任务状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskStatus(String TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get 提交预检查（Y/N）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubmitPreCheck 提交预检查（Y/N）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubmitPreCheck() {
        return this.SubmitPreCheck;
    }

    /**
     * Set 提交预检查（Y/N）
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubmitPreCheck 提交预检查（Y/N）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubmitPreCheck(String SubmitPreCheck) {
        this.SubmitPreCheck = SubmitPreCheck;
    }

    /**
     * Get 提交预检查提交可能会失败的原因
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubmitPreCheckDetailList 提交预检查提交可能会失败的原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskSubmitPreCheckDetailInfo [] getSubmitPreCheckDetailList() {
        return this.SubmitPreCheckDetailList;
    }

    /**
     * Set 提交预检查提交可能会失败的原因
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubmitPreCheckDetailList 提交预检查提交可能会失败的原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubmitPreCheckDetailList(TaskSubmitPreCheckDetailInfo [] SubmitPreCheckDetailList) {
        this.SubmitPreCheckDetailList = SubmitPreCheckDetailList;
    }

    /**
     * Get 资源组编号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutorGroupId 资源组编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutorGroupId() {
        return this.ExecutorGroupId;
    }

    /**
     * Set 资源组编号
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutorGroupId 资源组编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutorGroupId(String ExecutorGroupId) {
        this.ExecutorGroupId = ExecutorGroupId;
    }

    /**
     * Get 资源组名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutorGroupName 资源组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutorGroupName() {
        return this.ExecutorGroupName;
    }

    /**
     * Set 资源组名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutorGroupName 资源组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutorGroupName(String ExecutorGroupName) {
        this.ExecutorGroupName = ExecutorGroupName;
    }

    /**
     * Get <p>任务类型id，取值范围：</p>
<ul>
<li>26 离线集成任务</li>
<li>30 Python任务</li>
<li>31 PySpark任务</li>
<li>34 HiveSQL任务</li>
<li>35 Shell任务</li>
<li>36 SparkSQL任务</li>
<li>21 JdbcSQL任务</li>
<li>23 TDSQL-PostgreSQL任务</li>
<li>32 DLCSQL任务</li>
<li>33 Impala任务</li>
<li>41 Kettle任务</li>
<li>42 Tchouse-X任务</li>
<li>43 TCHouse-X SQL任务</li>
<li>46 DLCSpark任务</li>
<li>50 DLC-PySpark任务</li>
<li>47 TiOne任务</li>
<li>48 Trino任务</li>
<li>39 Spark任务</li>
<li>92 MapReduce任务</li>
<li>38 Shell表单模式任务</li>
<li>130 BranchNode任务</li>
<li>131 MergeNode任务</li>
<li>132 Notebook任务</li>
<li>133 SSH任务</li>
<li>134 StarRocks任务</li>
<li>137 For-each任务</li>
</ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskTypeId <p>任务类型id，取值范围：</p>
<ul>
<li>26 离线集成任务</li>
<li>30 Python任务</li>
<li>31 PySpark任务</li>
<li>34 HiveSQL任务</li>
<li>35 Shell任务</li>
<li>36 SparkSQL任务</li>
<li>21 JdbcSQL任务</li>
<li>23 TDSQL-PostgreSQL任务</li>
<li>32 DLCSQL任务</li>
<li>33 Impala任务</li>
<li>41 Kettle任务</li>
<li>42 Tchouse-X任务</li>
<li>43 TCHouse-X SQL任务</li>
<li>46 DLCSpark任务</li>
<li>50 DLC-PySpark任务</li>
<li>47 TiOne任务</li>
<li>48 Trino任务</li>
<li>39 Spark任务</li>
<li>92 MapReduce任务</li>
<li>38 Shell表单模式任务</li>
<li>130 BranchNode任务</li>
<li>131 MergeNode任务</li>
<li>132 Notebook任务</li>
<li>133 SSH任务</li>
<li>134 StarRocks任务</li>
<li>137 For-each任务</li>
</ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTaskTypeId() {
        return this.TaskTypeId;
    }

    /**
     * Set <p>任务类型id，取值范围：</p>
<ul>
<li>26 离线集成任务</li>
<li>30 Python任务</li>
<li>31 PySpark任务</li>
<li>34 HiveSQL任务</li>
<li>35 Shell任务</li>
<li>36 SparkSQL任务</li>
<li>21 JdbcSQL任务</li>
<li>23 TDSQL-PostgreSQL任务</li>
<li>32 DLCSQL任务</li>
<li>33 Impala任务</li>
<li>41 Kettle任务</li>
<li>42 Tchouse-X任务</li>
<li>43 TCHouse-X SQL任务</li>
<li>46 DLCSpark任务</li>
<li>50 DLC-PySpark任务</li>
<li>47 TiOne任务</li>
<li>48 Trino任务</li>
<li>39 Spark任务</li>
<li>92 MapReduce任务</li>
<li>38 Shell表单模式任务</li>
<li>130 BranchNode任务</li>
<li>131 MergeNode任务</li>
<li>132 Notebook任务</li>
<li>133 SSH任务</li>
<li>134 StarRocks任务</li>
<li>137 For-each任务</li>
</ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskTypeId <p>任务类型id，取值范围：</p>
<ul>
<li>26 离线集成任务</li>
<li>30 Python任务</li>
<li>31 PySpark任务</li>
<li>34 HiveSQL任务</li>
<li>35 Shell任务</li>
<li>36 SparkSQL任务</li>
<li>21 JdbcSQL任务</li>
<li>23 TDSQL-PostgreSQL任务</li>
<li>32 DLCSQL任务</li>
<li>33 Impala任务</li>
<li>41 Kettle任务</li>
<li>42 Tchouse-X任务</li>
<li>43 TCHouse-X SQL任务</li>
<li>46 DLCSpark任务</li>
<li>50 DLC-PySpark任务</li>
<li>47 TiOne任务</li>
<li>48 Trino任务</li>
<li>39 Spark任务</li>
<li>92 MapReduce任务</li>
<li>38 Shell表单模式任务</li>
<li>130 BranchNode任务</li>
<li>131 MergeNode任务</li>
<li>132 Notebook任务</li>
<li>133 SSH任务</li>
<li>134 StarRocks任务</li>
<li>137 For-each任务</li>
</ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskTypeId(Long TaskTypeId) {
        this.TaskTypeId = TaskTypeId;
    }

    public DescribePendingSubmitTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePendingSubmitTaskInfo(DescribePendingSubmitTaskInfo source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.ModifyType != null) {
            this.ModifyType = new String(source.ModifyType);
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new String(source.TaskStatus);
        }
        if (source.SubmitPreCheck != null) {
            this.SubmitPreCheck = new String(source.SubmitPreCheck);
        }
        if (source.SubmitPreCheckDetailList != null) {
            this.SubmitPreCheckDetailList = new TaskSubmitPreCheckDetailInfo[source.SubmitPreCheckDetailList.length];
            for (int i = 0; i < source.SubmitPreCheckDetailList.length; i++) {
                this.SubmitPreCheckDetailList[i] = new TaskSubmitPreCheckDetailInfo(source.SubmitPreCheckDetailList[i]);
            }
        }
        if (source.ExecutorGroupId != null) {
            this.ExecutorGroupId = new String(source.ExecutorGroupId);
        }
        if (source.ExecutorGroupName != null) {
            this.ExecutorGroupName = new String(source.ExecutorGroupName);
        }
        if (source.TaskTypeId != null) {
            this.TaskTypeId = new Long(source.TaskTypeId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "ModifyType", this.ModifyType);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);
        this.setParamSimple(map, prefix + "SubmitPreCheck", this.SubmitPreCheck);
        this.setParamArrayObj(map, prefix + "SubmitPreCheckDetailList.", this.SubmitPreCheckDetailList);
        this.setParamSimple(map, prefix + "ExecutorGroupId", this.ExecutorGroupId);
        this.setParamSimple(map, prefix + "ExecutorGroupName", this.ExecutorGroupName);
        this.setParamSimple(map, prefix + "TaskTypeId", this.TaskTypeId);

    }
}

