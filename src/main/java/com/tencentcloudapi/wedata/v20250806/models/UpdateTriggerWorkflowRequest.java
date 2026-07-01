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

public class UpdateTriggerWorkflowRequest extends AbstractModel {

    /**
    * <p>项目ID</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * <p>工作流ID</p>
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * <p>工作流名称</p>
    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

    /**
    * <p>责任人ID</p>
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * <p>备注</p>
    */
    @SerializedName("WorkflowDesc")
    @Expose
    private String WorkflowDesc;

    /**
    * <p>工作流参数列表</p>
    */
    @SerializedName("WorkflowParams")
    @Expose
    private ParamInfo [] WorkflowParams;

    /**
    * <p>统一调度参数</p>
    */
    @SerializedName("TriggerWorkflowSchedulerConfigurations")
    @Expose
    private WorkflowTriggerConfig [] TriggerWorkflowSchedulerConfigurations;

    /**
    * <p>BundleId项</p>
    */
    @SerializedName("BundleId")
    @Expose
    private String BundleId;

    /**
    * <p>Bundle信息</p>
    */
    @SerializedName("BundleInfo")
    @Expose
    private String BundleInfo;

    /**
    * <p>通用参数配置</p>
    */
    @SerializedName("GeneralTaskParams")
    @Expose
    private WorkflowGeneralTaskParam [] GeneralTaskParams;

    /**
    * <p>调度运行配置</p>
    */
    @SerializedName("TriggerWorkflowRunConfiguration")
    @Expose
    private WorkflowRunConfig TriggerWorkflowRunConfiguration;

    /**
    * <p>Trigger 状态 启动ACTIVE，暂停PAUSED。配置完之后，内部的SchedulerStatus可不配置，如果配置，内容会被改值覆盖。</p><p>枚举值：</p><ul><li>ACTIVE： 启动</li><li>PAUSED： 暂停</li></ul>
    */
    @SerializedName("SchedulerStatus")
    @Expose
    private String SchedulerStatus;

    /**
    * <p>触发方式：定时触发：TIME_TRIGGER 。配置完之后，内部的TriggerMode状态可不配置，如果配置，内容会被该值覆盖。</p><p>枚举值：</p><ul><li>TIME_TRIGGER： 定时触发</li></ul>
    */
    @SerializedName("TriggerMode")
    @Expose
    private String TriggerMode;

    /**
     * Get <p>项目ID</p> 
     * @return ProjectId <p>项目ID</p>
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目ID</p>
     * @param ProjectId <p>项目ID</p>
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>工作流ID</p> 
     * @return WorkflowId <p>工作流ID</p>
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set <p>工作流ID</p>
     * @param WorkflowId <p>工作流ID</p>
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get <p>工作流名称</p> 
     * @return WorkflowName <p>工作流名称</p>
     */
    public String getWorkflowName() {
        return this.WorkflowName;
    }

    /**
     * Set <p>工作流名称</p>
     * @param WorkflowName <p>工作流名称</p>
     */
    public void setWorkflowName(String WorkflowName) {
        this.WorkflowName = WorkflowName;
    }

    /**
     * Get <p>责任人ID</p> 
     * @return OwnerUin <p>责任人ID</p>
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set <p>责任人ID</p>
     * @param OwnerUin <p>责任人ID</p>
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get <p>备注</p> 
     * @return WorkflowDesc <p>备注</p>
     */
    public String getWorkflowDesc() {
        return this.WorkflowDesc;
    }

    /**
     * Set <p>备注</p>
     * @param WorkflowDesc <p>备注</p>
     */
    public void setWorkflowDesc(String WorkflowDesc) {
        this.WorkflowDesc = WorkflowDesc;
    }

    /**
     * Get <p>工作流参数列表</p> 
     * @return WorkflowParams <p>工作流参数列表</p>
     */
    public ParamInfo [] getWorkflowParams() {
        return this.WorkflowParams;
    }

    /**
     * Set <p>工作流参数列表</p>
     * @param WorkflowParams <p>工作流参数列表</p>
     */
    public void setWorkflowParams(ParamInfo [] WorkflowParams) {
        this.WorkflowParams = WorkflowParams;
    }

    /**
     * Get <p>统一调度参数</p> 
     * @return TriggerWorkflowSchedulerConfigurations <p>统一调度参数</p>
     */
    public WorkflowTriggerConfig [] getTriggerWorkflowSchedulerConfigurations() {
        return this.TriggerWorkflowSchedulerConfigurations;
    }

    /**
     * Set <p>统一调度参数</p>
     * @param TriggerWorkflowSchedulerConfigurations <p>统一调度参数</p>
     */
    public void setTriggerWorkflowSchedulerConfigurations(WorkflowTriggerConfig [] TriggerWorkflowSchedulerConfigurations) {
        this.TriggerWorkflowSchedulerConfigurations = TriggerWorkflowSchedulerConfigurations;
    }

    /**
     * Get <p>BundleId项</p> 
     * @return BundleId <p>BundleId项</p>
     */
    public String getBundleId() {
        return this.BundleId;
    }

    /**
     * Set <p>BundleId项</p>
     * @param BundleId <p>BundleId项</p>
     */
    public void setBundleId(String BundleId) {
        this.BundleId = BundleId;
    }

    /**
     * Get <p>Bundle信息</p> 
     * @return BundleInfo <p>Bundle信息</p>
     */
    public String getBundleInfo() {
        return this.BundleInfo;
    }

    /**
     * Set <p>Bundle信息</p>
     * @param BundleInfo <p>Bundle信息</p>
     */
    public void setBundleInfo(String BundleInfo) {
        this.BundleInfo = BundleInfo;
    }

    /**
     * Get <p>通用参数配置</p> 
     * @return GeneralTaskParams <p>通用参数配置</p>
     */
    public WorkflowGeneralTaskParam [] getGeneralTaskParams() {
        return this.GeneralTaskParams;
    }

    /**
     * Set <p>通用参数配置</p>
     * @param GeneralTaskParams <p>通用参数配置</p>
     */
    public void setGeneralTaskParams(WorkflowGeneralTaskParam [] GeneralTaskParams) {
        this.GeneralTaskParams = GeneralTaskParams;
    }

    /**
     * Get <p>调度运行配置</p> 
     * @return TriggerWorkflowRunConfiguration <p>调度运行配置</p>
     */
    public WorkflowRunConfig getTriggerWorkflowRunConfiguration() {
        return this.TriggerWorkflowRunConfiguration;
    }

    /**
     * Set <p>调度运行配置</p>
     * @param TriggerWorkflowRunConfiguration <p>调度运行配置</p>
     */
    public void setTriggerWorkflowRunConfiguration(WorkflowRunConfig TriggerWorkflowRunConfiguration) {
        this.TriggerWorkflowRunConfiguration = TriggerWorkflowRunConfiguration;
    }

    /**
     * Get <p>Trigger 状态 启动ACTIVE，暂停PAUSED。配置完之后，内部的SchedulerStatus可不配置，如果配置，内容会被改值覆盖。</p><p>枚举值：</p><ul><li>ACTIVE： 启动</li><li>PAUSED： 暂停</li></ul> 
     * @return SchedulerStatus <p>Trigger 状态 启动ACTIVE，暂停PAUSED。配置完之后，内部的SchedulerStatus可不配置，如果配置，内容会被改值覆盖。</p><p>枚举值：</p><ul><li>ACTIVE： 启动</li><li>PAUSED： 暂停</li></ul>
     */
    public String getSchedulerStatus() {
        return this.SchedulerStatus;
    }

    /**
     * Set <p>Trigger 状态 启动ACTIVE，暂停PAUSED。配置完之后，内部的SchedulerStatus可不配置，如果配置，内容会被改值覆盖。</p><p>枚举值：</p><ul><li>ACTIVE： 启动</li><li>PAUSED： 暂停</li></ul>
     * @param SchedulerStatus <p>Trigger 状态 启动ACTIVE，暂停PAUSED。配置完之后，内部的SchedulerStatus可不配置，如果配置，内容会被改值覆盖。</p><p>枚举值：</p><ul><li>ACTIVE： 启动</li><li>PAUSED： 暂停</li></ul>
     */
    public void setSchedulerStatus(String SchedulerStatus) {
        this.SchedulerStatus = SchedulerStatus;
    }

    /**
     * Get <p>触发方式：定时触发：TIME_TRIGGER 。配置完之后，内部的TriggerMode状态可不配置，如果配置，内容会被该值覆盖。</p><p>枚举值：</p><ul><li>TIME_TRIGGER： 定时触发</li></ul> 
     * @return TriggerMode <p>触发方式：定时触发：TIME_TRIGGER 。配置完之后，内部的TriggerMode状态可不配置，如果配置，内容会被该值覆盖。</p><p>枚举值：</p><ul><li>TIME_TRIGGER： 定时触发</li></ul>
     */
    public String getTriggerMode() {
        return this.TriggerMode;
    }

    /**
     * Set <p>触发方式：定时触发：TIME_TRIGGER 。配置完之后，内部的TriggerMode状态可不配置，如果配置，内容会被该值覆盖。</p><p>枚举值：</p><ul><li>TIME_TRIGGER： 定时触发</li></ul>
     * @param TriggerMode <p>触发方式：定时触发：TIME_TRIGGER 。配置完之后，内部的TriggerMode状态可不配置，如果配置，内容会被该值覆盖。</p><p>枚举值：</p><ul><li>TIME_TRIGGER： 定时触发</li></ul>
     */
    public void setTriggerMode(String TriggerMode) {
        this.TriggerMode = TriggerMode;
    }

    public UpdateTriggerWorkflowRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateTriggerWorkflowRequest(UpdateTriggerWorkflowRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.WorkflowName != null) {
            this.WorkflowName = new String(source.WorkflowName);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.WorkflowDesc != null) {
            this.WorkflowDesc = new String(source.WorkflowDesc);
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
        if (source.TriggerWorkflowRunConfiguration != null) {
            this.TriggerWorkflowRunConfiguration = new WorkflowRunConfig(source.TriggerWorkflowRunConfiguration);
        }
        if (source.SchedulerStatus != null) {
            this.SchedulerStatus = new String(source.SchedulerStatus);
        }
        if (source.TriggerMode != null) {
            this.TriggerMode = new String(source.TriggerMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "WorkflowName", this.WorkflowName);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "WorkflowDesc", this.WorkflowDesc);
        this.setParamArrayObj(map, prefix + "WorkflowParams.", this.WorkflowParams);
        this.setParamArrayObj(map, prefix + "TriggerWorkflowSchedulerConfigurations.", this.TriggerWorkflowSchedulerConfigurations);
        this.setParamSimple(map, prefix + "BundleId", this.BundleId);
        this.setParamSimple(map, prefix + "BundleInfo", this.BundleInfo);
        this.setParamArrayObj(map, prefix + "GeneralTaskParams.", this.GeneralTaskParams);
        this.setParamObj(map, prefix + "TriggerWorkflowRunConfiguration.", this.TriggerWorkflowRunConfiguration);
        this.setParamSimple(map, prefix + "SchedulerStatus", this.SchedulerStatus);
        this.setParamSimple(map, prefix + "TriggerMode", this.TriggerMode);

    }
}

