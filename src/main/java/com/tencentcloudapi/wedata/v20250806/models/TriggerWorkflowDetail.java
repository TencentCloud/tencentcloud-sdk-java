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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TriggerWorkflowDetail extends AbstractModel {

    /**
    * <p>工作流名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

    /**
    * <p>责任人ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * <p>创建人ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateUserUin")
    @Expose
    private String CreateUserUin;

    /**
    * <p>工作流参数数组</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowParams")
    @Expose
    private ParamInfo [] WorkflowParams;

    /**
    * <p>统一调度参数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TriggerWorkflowSchedulerConfigurations")
    @Expose
    private WorkflowTriggerConfig [] TriggerWorkflowSchedulerConfigurations;

    /**
    * <p>工作流描述</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowDesc")
    @Expose
    private String WorkflowDesc;

    /**
    * <p>工作流所属路径</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * <p>BundleId项</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BundleId")
    @Expose
    private String BundleId;

    /**
    * <p>BundleInfo项</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BundleInfo")
    @Expose
    private String BundleInfo;

    /**
    * <p>通用参数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GeneralTaskParams")
    @Expose
    private WorkflowGeneralTaskParam [] GeneralTaskParams;

    /**
    * <p>Trigger 状态 启动ACTIVE，暂停PAUSED</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SchedulerStatus")
    @Expose
    private String SchedulerStatus;

    /**
    * <p>工作流运行参数配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TriggerWorkflowRunConfiguration")
    @Expose
    private WorkflowRunConfig TriggerWorkflowRunConfiguration;

    /**
     * Get <p>工作流名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowName <p>工作流名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowName() {
        return this.WorkflowName;
    }

    /**
     * Set <p>工作流名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowName <p>工作流名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowName(String WorkflowName) {
        this.WorkflowName = WorkflowName;
    }

    /**
     * Get <p>责任人ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnerUin <p>责任人ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set <p>责任人ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnerUin <p>责任人ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get <p>创建人ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateUserUin <p>创建人ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateUserUin() {
        return this.CreateUserUin;
    }

    /**
     * Set <p>创建人ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateUserUin <p>创建人ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateUserUin(String CreateUserUin) {
        this.CreateUserUin = CreateUserUin;
    }

    /**
     * Get <p>工作流参数数组</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowParams <p>工作流参数数组</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ParamInfo [] getWorkflowParams() {
        return this.WorkflowParams;
    }

    /**
     * Set <p>工作流参数数组</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowParams <p>工作流参数数组</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowParams(ParamInfo [] WorkflowParams) {
        this.WorkflowParams = WorkflowParams;
    }

    /**
     * Get <p>统一调度参数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TriggerWorkflowSchedulerConfigurations <p>统一调度参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WorkflowTriggerConfig [] getTriggerWorkflowSchedulerConfigurations() {
        return this.TriggerWorkflowSchedulerConfigurations;
    }

    /**
     * Set <p>统一调度参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TriggerWorkflowSchedulerConfigurations <p>统一调度参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTriggerWorkflowSchedulerConfigurations(WorkflowTriggerConfig [] TriggerWorkflowSchedulerConfigurations) {
        this.TriggerWorkflowSchedulerConfigurations = TriggerWorkflowSchedulerConfigurations;
    }

    /**
     * Get <p>工作流描述</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowDesc <p>工作流描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowDesc() {
        return this.WorkflowDesc;
    }

    /**
     * Set <p>工作流描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowDesc <p>工作流描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowDesc(String WorkflowDesc) {
        this.WorkflowDesc = WorkflowDesc;
    }

    /**
     * Get <p>工作流所属路径</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Path <p>工作流所属路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set <p>工作流所属路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Path <p>工作流所属路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get <p>BundleId项</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BundleId <p>BundleId项</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBundleId() {
        return this.BundleId;
    }

    /**
     * Set <p>BundleId项</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BundleId <p>BundleId项</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBundleId(String BundleId) {
        this.BundleId = BundleId;
    }

    /**
     * Get <p>BundleInfo项</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BundleInfo <p>BundleInfo项</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBundleInfo() {
        return this.BundleInfo;
    }

    /**
     * Set <p>BundleInfo项</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BundleInfo <p>BundleInfo项</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBundleInfo(String BundleInfo) {
        this.BundleInfo = BundleInfo;
    }

    /**
     * Get <p>通用参数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GeneralTaskParams <p>通用参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WorkflowGeneralTaskParam [] getGeneralTaskParams() {
        return this.GeneralTaskParams;
    }

    /**
     * Set <p>通用参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param GeneralTaskParams <p>通用参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGeneralTaskParams(WorkflowGeneralTaskParam [] GeneralTaskParams) {
        this.GeneralTaskParams = GeneralTaskParams;
    }

    /**
     * Get <p>Trigger 状态 启动ACTIVE，暂停PAUSED</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SchedulerStatus <p>Trigger 状态 启动ACTIVE，暂停PAUSED</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSchedulerStatus() {
        return this.SchedulerStatus;
    }

    /**
     * Set <p>Trigger 状态 启动ACTIVE，暂停PAUSED</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SchedulerStatus <p>Trigger 状态 启动ACTIVE，暂停PAUSED</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSchedulerStatus(String SchedulerStatus) {
        this.SchedulerStatus = SchedulerStatus;
    }

    /**
     * Get <p>工作流运行参数配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TriggerWorkflowRunConfiguration <p>工作流运行参数配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WorkflowRunConfig getTriggerWorkflowRunConfiguration() {
        return this.TriggerWorkflowRunConfiguration;
    }

    /**
     * Set <p>工作流运行参数配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TriggerWorkflowRunConfiguration <p>工作流运行参数配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTriggerWorkflowRunConfiguration(WorkflowRunConfig TriggerWorkflowRunConfiguration) {
        this.TriggerWorkflowRunConfiguration = TriggerWorkflowRunConfiguration;
    }

    public TriggerWorkflowDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TriggerWorkflowDetail(TriggerWorkflowDetail source) {
        if (source.WorkflowName != null) {
            this.WorkflowName = new String(source.WorkflowName);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.CreateUserUin != null) {
            this.CreateUserUin = new String(source.CreateUserUin);
        }
        if (source.WorkflowParams != null) {
            this.WorkflowParams = new ParamInfo[source.WorkflowParams.length];
            for (int i = 0; i < source.WorkflowParams.length; i++) {
                this.WorkflowParams[i] = new ParamInfo(source.WorkflowParams[i]);
            }
        }
        if (source.TriggerWorkflowSchedulerConfigurations != null) {
            this.TriggerWorkflowSchedulerConfigurations = new WorkflowTriggerConfig[source.TriggerWorkflowSchedulerConfigurations.length];
            for (int i = 0; i < source.TriggerWorkflowSchedulerConfigurations.length; i++) {
                this.TriggerWorkflowSchedulerConfigurations[i] = new WorkflowTriggerConfig(source.TriggerWorkflowSchedulerConfigurations[i]);
            }
        }
        if (source.WorkflowDesc != null) {
            this.WorkflowDesc = new String(source.WorkflowDesc);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.BundleId != null) {
            this.BundleId = new String(source.BundleId);
        }
        if (source.BundleInfo != null) {
            this.BundleInfo = new String(source.BundleInfo);
        }
        if (source.GeneralTaskParams != null) {
            this.GeneralTaskParams = new WorkflowGeneralTaskParam[source.GeneralTaskParams.length];
            for (int i = 0; i < source.GeneralTaskParams.length; i++) {
                this.GeneralTaskParams[i] = new WorkflowGeneralTaskParam(source.GeneralTaskParams[i]);
            }
        }
        if (source.SchedulerStatus != null) {
            this.SchedulerStatus = new String(source.SchedulerStatus);
        }
        if (source.TriggerWorkflowRunConfiguration != null) {
            this.TriggerWorkflowRunConfiguration = new WorkflowRunConfig(source.TriggerWorkflowRunConfiguration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkflowName", this.WorkflowName);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "CreateUserUin", this.CreateUserUin);
        this.setParamArrayObj(map, prefix + "WorkflowParams.", this.WorkflowParams);
        this.setParamArrayObj(map, prefix + "TriggerWorkflowSchedulerConfigurations.", this.TriggerWorkflowSchedulerConfigurations);
        this.setParamSimple(map, prefix + "WorkflowDesc", this.WorkflowDesc);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "BundleId", this.BundleId);
        this.setParamSimple(map, prefix + "BundleInfo", this.BundleInfo);
        this.setParamArrayObj(map, prefix + "GeneralTaskParams.", this.GeneralTaskParams);
        this.setParamSimple(map, prefix + "SchedulerStatus", this.SchedulerStatus);
        this.setParamObj(map, prefix + "TriggerWorkflowRunConfiguration.", this.TriggerWorkflowRunConfiguration);

    }
}

