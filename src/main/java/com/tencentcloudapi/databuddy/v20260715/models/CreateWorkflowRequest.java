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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateWorkflowRequest extends AbstractModel {

    /**
    * <p>工作空间ID，可通过 ListWorkspaces 获取。必填</p>
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * <p>工作流基本信息。必填，其中 WorkflowName 必填且工作空间内唯一</p>
    */
    @SerializedName("BaseInfo")
    @Expose
    private WorkflowBaseInfo BaseInfo;

    /**
    * <p>工作流调度配置</p>
    */
    @SerializedName("Trigger")
    @Expose
    private WorkflowTriggerConfiguration [] Trigger;

    /**
    * <p>工作流参数列表</p>
    */
    @SerializedName("ParamList")
    @Expose
    private ParamInfo [] ParamList;

    /**
    * <p>标签列表</p>
    */
    @SerializedName("LabelList")
    @Expose
    private LabelBrief [] LabelList;

    /**
    * <p>工作流告警配置</p>
    */
    @SerializedName("Alarm")
    @Expose
    private AlarmBrief Alarm;

    /**
    * <p>监控指标配置。若告警条件中选择了监控告警，则本字段必填</p>
    */
    @SerializedName("MonitorMetric")
    @Expose
    private MonitorMetricBrief MonitorMetric;

    /**
    * <p>工作流高级设置</p>
    */
    @SerializedName("AdvanceConfig")
    @Expose
    private WorkflowAdvanceConfig AdvanceConfig;

    /**
    * <p>工作流任务列表</p>
    */
    @SerializedName("TaskList")
    @Expose
    private WorkflowTask [] TaskList;

    /**
    * <p>BundleId，可通过 Bundle 相关接口获取</p>
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
    * <p>Git配置ID，可通过 Git 配置相关接口获取</p>
    */
    @SerializedName("GitConfigId")
    @Expose
    private String GitConfigId;

    /**
    * <p>Git分支信息</p>
    */
    @SerializedName("GitBranch")
    @Expose
    private String GitBranch;

    /**
     * Get <p>工作空间ID，可通过 ListWorkspaces 获取。必填</p> 
     * @return WorkspaceId <p>工作空间ID，可通过 ListWorkspaces 获取。必填</p>
     */
    public String getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set <p>工作空间ID，可通过 ListWorkspaces 获取。必填</p>
     * @param WorkspaceId <p>工作空间ID，可通过 ListWorkspaces 获取。必填</p>
     */
    public void setWorkspaceId(String WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get <p>工作流基本信息。必填，其中 WorkflowName 必填且工作空间内唯一</p> 
     * @return BaseInfo <p>工作流基本信息。必填，其中 WorkflowName 必填且工作空间内唯一</p>
     */
    public WorkflowBaseInfo getBaseInfo() {
        return this.BaseInfo;
    }

    /**
     * Set <p>工作流基本信息。必填，其中 WorkflowName 必填且工作空间内唯一</p>
     * @param BaseInfo <p>工作流基本信息。必填，其中 WorkflowName 必填且工作空间内唯一</p>
     */
    public void setBaseInfo(WorkflowBaseInfo BaseInfo) {
        this.BaseInfo = BaseInfo;
    }

    /**
     * Get <p>工作流调度配置</p> 
     * @return Trigger <p>工作流调度配置</p>
     */
    public WorkflowTriggerConfiguration [] getTrigger() {
        return this.Trigger;
    }

    /**
     * Set <p>工作流调度配置</p>
     * @param Trigger <p>工作流调度配置</p>
     */
    public void setTrigger(WorkflowTriggerConfiguration [] Trigger) {
        this.Trigger = Trigger;
    }

    /**
     * Get <p>工作流参数列表</p> 
     * @return ParamList <p>工作流参数列表</p>
     */
    public ParamInfo [] getParamList() {
        return this.ParamList;
    }

    /**
     * Set <p>工作流参数列表</p>
     * @param ParamList <p>工作流参数列表</p>
     */
    public void setParamList(ParamInfo [] ParamList) {
        this.ParamList = ParamList;
    }

    /**
     * Get <p>标签列表</p> 
     * @return LabelList <p>标签列表</p>
     */
    public LabelBrief [] getLabelList() {
        return this.LabelList;
    }

    /**
     * Set <p>标签列表</p>
     * @param LabelList <p>标签列表</p>
     */
    public void setLabelList(LabelBrief [] LabelList) {
        this.LabelList = LabelList;
    }

    /**
     * Get <p>工作流告警配置</p> 
     * @return Alarm <p>工作流告警配置</p>
     */
    public AlarmBrief getAlarm() {
        return this.Alarm;
    }

    /**
     * Set <p>工作流告警配置</p>
     * @param Alarm <p>工作流告警配置</p>
     */
    public void setAlarm(AlarmBrief Alarm) {
        this.Alarm = Alarm;
    }

    /**
     * Get <p>监控指标配置。若告警条件中选择了监控告警，则本字段必填</p> 
     * @return MonitorMetric <p>监控指标配置。若告警条件中选择了监控告警，则本字段必填</p>
     */
    public MonitorMetricBrief getMonitorMetric() {
        return this.MonitorMetric;
    }

    /**
     * Set <p>监控指标配置。若告警条件中选择了监控告警，则本字段必填</p>
     * @param MonitorMetric <p>监控指标配置。若告警条件中选择了监控告警，则本字段必填</p>
     */
    public void setMonitorMetric(MonitorMetricBrief MonitorMetric) {
        this.MonitorMetric = MonitorMetric;
    }

    /**
     * Get <p>工作流高级设置</p> 
     * @return AdvanceConfig <p>工作流高级设置</p>
     */
    public WorkflowAdvanceConfig getAdvanceConfig() {
        return this.AdvanceConfig;
    }

    /**
     * Set <p>工作流高级设置</p>
     * @param AdvanceConfig <p>工作流高级设置</p>
     */
    public void setAdvanceConfig(WorkflowAdvanceConfig AdvanceConfig) {
        this.AdvanceConfig = AdvanceConfig;
    }

    /**
     * Get <p>工作流任务列表</p> 
     * @return TaskList <p>工作流任务列表</p>
     */
    public WorkflowTask [] getTaskList() {
        return this.TaskList;
    }

    /**
     * Set <p>工作流任务列表</p>
     * @param TaskList <p>工作流任务列表</p>
     */
    public void setTaskList(WorkflowTask [] TaskList) {
        this.TaskList = TaskList;
    }

    /**
     * Get <p>BundleId，可通过 Bundle 相关接口获取</p> 
     * @return BundleId <p>BundleId，可通过 Bundle 相关接口获取</p>
     */
    public String getBundleId() {
        return this.BundleId;
    }

    /**
     * Set <p>BundleId，可通过 Bundle 相关接口获取</p>
     * @param BundleId <p>BundleId，可通过 Bundle 相关接口获取</p>
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
     * Get <p>Git配置ID，可通过 Git 配置相关接口获取</p> 
     * @return GitConfigId <p>Git配置ID，可通过 Git 配置相关接口获取</p>
     */
    public String getGitConfigId() {
        return this.GitConfigId;
    }

    /**
     * Set <p>Git配置ID，可通过 Git 配置相关接口获取</p>
     * @param GitConfigId <p>Git配置ID，可通过 Git 配置相关接口获取</p>
     */
    public void setGitConfigId(String GitConfigId) {
        this.GitConfigId = GitConfigId;
    }

    /**
     * Get <p>Git分支信息</p> 
     * @return GitBranch <p>Git分支信息</p>
     */
    public String getGitBranch() {
        return this.GitBranch;
    }

    /**
     * Set <p>Git分支信息</p>
     * @param GitBranch <p>Git分支信息</p>
     */
    public void setGitBranch(String GitBranch) {
        this.GitBranch = GitBranch;
    }

    public CreateWorkflowRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateWorkflowRequest(CreateWorkflowRequest source) {
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
        if (source.BaseInfo != null) {
            this.BaseInfo = new WorkflowBaseInfo(source.BaseInfo);
        }
        if (source.Trigger != null) {
            this.Trigger = new WorkflowTriggerConfiguration[source.Trigger.length];
            for (int i = 0; i < source.Trigger.length; i++) {
                this.Trigger[i] = new WorkflowTriggerConfiguration(source.Trigger[i]);
            }
        }
        if (source.ParamList != null) {
            this.ParamList = new ParamInfo[source.ParamList.length];
            for (int i = 0; i < source.ParamList.length; i++) {
                this.ParamList[i] = new ParamInfo(source.ParamList[i]);
            }
        }
        if (source.LabelList != null) {
            this.LabelList = new LabelBrief[source.LabelList.length];
            for (int i = 0; i < source.LabelList.length; i++) {
                this.LabelList[i] = new LabelBrief(source.LabelList[i]);
            }
        }
        if (source.Alarm != null) {
            this.Alarm = new AlarmBrief(source.Alarm);
        }
        if (source.MonitorMetric != null) {
            this.MonitorMetric = new MonitorMetricBrief(source.MonitorMetric);
        }
        if (source.AdvanceConfig != null) {
            this.AdvanceConfig = new WorkflowAdvanceConfig(source.AdvanceConfig);
        }
        if (source.TaskList != null) {
            this.TaskList = new WorkflowTask[source.TaskList.length];
            for (int i = 0; i < source.TaskList.length; i++) {
                this.TaskList[i] = new WorkflowTask(source.TaskList[i]);
            }
        }
        if (source.BundleId != null) {
            this.BundleId = new String(source.BundleId);
        }
        if (source.BundleInfo != null) {
            this.BundleInfo = new String(source.BundleInfo);
        }
        if (source.GitConfigId != null) {
            this.GitConfigId = new String(source.GitConfigId);
        }
        if (source.GitBranch != null) {
            this.GitBranch = new String(source.GitBranch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamObj(map, prefix + "BaseInfo.", this.BaseInfo);
        this.setParamArrayObj(map, prefix + "Trigger.", this.Trigger);
        this.setParamArrayObj(map, prefix + "ParamList.", this.ParamList);
        this.setParamArrayObj(map, prefix + "LabelList.", this.LabelList);
        this.setParamObj(map, prefix + "Alarm.", this.Alarm);
        this.setParamObj(map, prefix + "MonitorMetric.", this.MonitorMetric);
        this.setParamObj(map, prefix + "AdvanceConfig.", this.AdvanceConfig);
        this.setParamArrayObj(map, prefix + "TaskList.", this.TaskList);
        this.setParamSimple(map, prefix + "BundleId", this.BundleId);
        this.setParamSimple(map, prefix + "BundleInfo", this.BundleInfo);
        this.setParamSimple(map, prefix + "GitConfigId", this.GitConfigId);
        this.setParamSimple(map, prefix + "GitBranch", this.GitBranch);

    }
}

