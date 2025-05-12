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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskFormParams extends AbstractModel {

    /**
    * 任务ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 参数值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MapParamList")
    @Expose
    private ParamMapDsDto [] MapParamList;

    /**
    * 工作流ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * 工作流名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

    /**
    * 负责人ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InChargeId")
    @Expose
    private String InChargeId;

    /**
    * 负责人名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InCharge")
    @Expose
    private String InCharge;

    /**
    * 任务名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 任务类型
普通任务：dev
子任务：dev_container
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * 如果最新保存版本和调度版本不一致，显示最新保存版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LatestSavedVersion")
    @Expose
    private String LatestSavedVersion;

    /**
    * 保存版本ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LatestSavedVersionId")
    @Expose
    private String LatestSavedVersionId;

    /**
     * Get 任务ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskId 任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskId 任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 参数值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MapParamList 参数值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ParamMapDsDto [] getMapParamList() {
        return this.MapParamList;
    }

    /**
     * Set 参数值
注意：此字段可能返回 null，表示取不到有效值。
     * @param MapParamList 参数值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMapParamList(ParamMapDsDto [] MapParamList) {
        this.MapParamList = MapParamList;
    }

    /**
     * Get 工作流ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowId 工作流ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set 工作流ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowId 工作流ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get 工作流名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowName 工作流名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowName() {
        return this.WorkflowName;
    }

    /**
     * Set 工作流名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowName 工作流名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowName(String WorkflowName) {
        this.WorkflowName = WorkflowName;
    }

    /**
     * Get 负责人ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InChargeId 负责人ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInChargeId() {
        return this.InChargeId;
    }

    /**
     * Set 负责人ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param InChargeId 负责人ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInChargeId(String InChargeId) {
        this.InChargeId = InChargeId;
    }

    /**
     * Get 负责人名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InCharge 负责人名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInCharge() {
        return this.InCharge;
    }

    /**
     * Set 负责人名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param InCharge 负责人名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInCharge(String InCharge) {
        this.InCharge = InCharge;
    }

    /**
     * Get 任务名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskName 任务名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 任务名
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskName 任务名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 任务类型
普通任务：dev
子任务：dev_container
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProductName 任务类型
普通任务：dev
子任务：dev_container
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set 任务类型
普通任务：dev
子任务：dev_container
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProductName 任务类型
普通任务：dev
子任务：dev_container
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get 如果最新保存版本和调度版本不一致，显示最新保存版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LatestSavedVersion 如果最新保存版本和调度版本不一致，显示最新保存版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLatestSavedVersion() {
        return this.LatestSavedVersion;
    }

    /**
     * Set 如果最新保存版本和调度版本不一致，显示最新保存版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param LatestSavedVersion 如果最新保存版本和调度版本不一致，显示最新保存版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLatestSavedVersion(String LatestSavedVersion) {
        this.LatestSavedVersion = LatestSavedVersion;
    }

    /**
     * Get 保存版本ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LatestSavedVersionId 保存版本ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLatestSavedVersionId() {
        return this.LatestSavedVersionId;
    }

    /**
     * Set 保存版本ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param LatestSavedVersionId 保存版本ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLatestSavedVersionId(String LatestSavedVersionId) {
        this.LatestSavedVersionId = LatestSavedVersionId;
    }

    public TaskFormParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskFormParams(TaskFormParams source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.MapParamList != null) {
            this.MapParamList = new ParamMapDsDto[source.MapParamList.length];
            for (int i = 0; i < source.MapParamList.length; i++) {
                this.MapParamList[i] = new ParamMapDsDto(source.MapParamList[i]);
            }
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.WorkflowName != null) {
            this.WorkflowName = new String(source.WorkflowName);
        }
        if (source.InChargeId != null) {
            this.InChargeId = new String(source.InChargeId);
        }
        if (source.InCharge != null) {
            this.InCharge = new String(source.InCharge);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.LatestSavedVersion != null) {
            this.LatestSavedVersion = new String(source.LatestSavedVersion);
        }
        if (source.LatestSavedVersionId != null) {
            this.LatestSavedVersionId = new String(source.LatestSavedVersionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamArrayObj(map, prefix + "MapParamList.", this.MapParamList);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "WorkflowName", this.WorkflowName);
        this.setParamSimple(map, prefix + "InChargeId", this.InChargeId);
        this.setParamSimple(map, prefix + "InCharge", this.InCharge);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "LatestSavedVersion", this.LatestSavedVersion);
        this.setParamSimple(map, prefix + "LatestSavedVersionId", this.LatestSavedVersionId);

    }
}

