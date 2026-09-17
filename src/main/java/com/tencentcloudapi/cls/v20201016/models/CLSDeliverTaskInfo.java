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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CLSDeliverTaskInfo extends AbstractModel {

    /**
    * <p>任务id</p>
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
    * <p>主账号id</p>
    */
    @SerializedName("Uin")
    @Expose
    private Long Uin;

    /**
    * <p>源主题信息</p>
    */
    @SerializedName("SourceTopicConfig")
    @Expose
    private SourceTopicConfig SourceTopicConfig;

    /**
    * <p>目标主题信息</p>
    */
    @SerializedName("TargetTopicConfig")
    @Expose
    private TargetTopicConfig TargetTopicConfig;

    /**
    * <p>投递规则</p>
    */
    @SerializedName("DeliverRule")
    @Expose
    private DeliverRule DeliverRule;

    /**
    * <p>合规承诺</p>
    */
    @SerializedName("Compliance")
    @Expose
    private Long Compliance;

    /**
    * <p>任务状态。</p><p>枚举值：</p><ul><li>0： 运行中</li><li>1： 已暂停</li><li>2： 已完成</li><li>3： 异常</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>状态 </p><p>枚举值：</p><ul><li>0： 运行</li><li>1： 暂停</li></ul>
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * <p>任务进度百分比</p>
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * <p>是否开启投递服务日志。</p><p>枚举值：</p><ul><li>1： 关闭</li><li>2： 开启</li></ul>
    */
    @SerializedName("HasServicesLog")
    @Expose
    private Long HasServicesLog;

    /**
    * <p>创建时间。</p><p>单位：秒级时间戳</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * <p>更新时间</p><p>单位：秒级时间戳</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
     * Get <p>任务id</p> 
     * @return TaskId <p>任务id</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>任务id</p>
     * @param TaskId <p>任务id</p>
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
     * Get <p>主账号id</p> 
     * @return Uin <p>主账号id</p>
     */
    public Long getUin() {
        return this.Uin;
    }

    /**
     * Set <p>主账号id</p>
     * @param Uin <p>主账号id</p>
     */
    public void setUin(Long Uin) {
        this.Uin = Uin;
    }

    /**
     * Get <p>源主题信息</p> 
     * @return SourceTopicConfig <p>源主题信息</p>
     */
    public SourceTopicConfig getSourceTopicConfig() {
        return this.SourceTopicConfig;
    }

    /**
     * Set <p>源主题信息</p>
     * @param SourceTopicConfig <p>源主题信息</p>
     */
    public void setSourceTopicConfig(SourceTopicConfig SourceTopicConfig) {
        this.SourceTopicConfig = SourceTopicConfig;
    }

    /**
     * Get <p>目标主题信息</p> 
     * @return TargetTopicConfig <p>目标主题信息</p>
     */
    public TargetTopicConfig getTargetTopicConfig() {
        return this.TargetTopicConfig;
    }

    /**
     * Set <p>目标主题信息</p>
     * @param TargetTopicConfig <p>目标主题信息</p>
     */
    public void setTargetTopicConfig(TargetTopicConfig TargetTopicConfig) {
        this.TargetTopicConfig = TargetTopicConfig;
    }

    /**
     * Get <p>投递规则</p> 
     * @return DeliverRule <p>投递规则</p>
     */
    public DeliverRule getDeliverRule() {
        return this.DeliverRule;
    }

    /**
     * Set <p>投递规则</p>
     * @param DeliverRule <p>投递规则</p>
     */
    public void setDeliverRule(DeliverRule DeliverRule) {
        this.DeliverRule = DeliverRule;
    }

    /**
     * Get <p>合规承诺</p> 
     * @return Compliance <p>合规承诺</p>
     */
    public Long getCompliance() {
        return this.Compliance;
    }

    /**
     * Set <p>合规承诺</p>
     * @param Compliance <p>合规承诺</p>
     */
    public void setCompliance(Long Compliance) {
        this.Compliance = Compliance;
    }

    /**
     * Get <p>任务状态。</p><p>枚举值：</p><ul><li>0： 运行中</li><li>1： 已暂停</li><li>2： 已完成</li><li>3： 异常</li></ul> 
     * @return Status <p>任务状态。</p><p>枚举值：</p><ul><li>0： 运行中</li><li>1： 已暂停</li><li>2： 已完成</li><li>3： 异常</li></ul>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>任务状态。</p><p>枚举值：</p><ul><li>0： 运行中</li><li>1： 已暂停</li><li>2： 已完成</li><li>3： 异常</li></ul>
     * @param Status <p>任务状态。</p><p>枚举值：</p><ul><li>0： 运行中</li><li>1： 已暂停</li><li>2： 已完成</li><li>3： 异常</li></ul>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>状态 </p><p>枚举值：</p><ul><li>0： 运行</li><li>1： 暂停</li></ul> 
     * @return Enable <p>状态 </p><p>枚举值：</p><ul><li>0： 运行</li><li>1： 暂停</li></ul>
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set <p>状态 </p><p>枚举值：</p><ul><li>0： 运行</li><li>1： 暂停</li></ul>
     * @param Enable <p>状态 </p><p>枚举值：</p><ul><li>0： 运行</li><li>1： 暂停</li></ul>
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get <p>任务进度百分比</p> 
     * @return Progress <p>任务进度百分比</p>
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set <p>任务进度百分比</p>
     * @param Progress <p>任务进度百分比</p>
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get <p>是否开启投递服务日志。</p><p>枚举值：</p><ul><li>1： 关闭</li><li>2： 开启</li></ul> 
     * @return HasServicesLog <p>是否开启投递服务日志。</p><p>枚举值：</p><ul><li>1： 关闭</li><li>2： 开启</li></ul>
     */
    public Long getHasServicesLog() {
        return this.HasServicesLog;
    }

    /**
     * Set <p>是否开启投递服务日志。</p><p>枚举值：</p><ul><li>1： 关闭</li><li>2： 开启</li></ul>
     * @param HasServicesLog <p>是否开启投递服务日志。</p><p>枚举值：</p><ul><li>1： 关闭</li><li>2： 开启</li></ul>
     */
    public void setHasServicesLog(Long HasServicesLog) {
        this.HasServicesLog = HasServicesLog;
    }

    /**
     * Get <p>创建时间。</p><p>单位：秒级时间戳</p> 
     * @return CreateTime <p>创建时间。</p><p>单位：秒级时间戳</p>
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间。</p><p>单位：秒级时间戳</p>
     * @param CreateTime <p>创建时间。</p><p>单位：秒级时间戳</p>
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>更新时间</p><p>单位：秒级时间戳</p> 
     * @return UpdateTime <p>更新时间</p><p>单位：秒级时间戳</p>
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间</p><p>单位：秒级时间戳</p>
     * @param UpdateTime <p>更新时间</p><p>单位：秒级时间戳</p>
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public CLSDeliverTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CLSDeliverTaskInfo(CLSDeliverTaskInfo source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.Uin != null) {
            this.Uin = new Long(source.Uin);
        }
        if (source.SourceTopicConfig != null) {
            this.SourceTopicConfig = new SourceTopicConfig(source.SourceTopicConfig);
        }
        if (source.TargetTopicConfig != null) {
            this.TargetTopicConfig = new TargetTopicConfig(source.TargetTopicConfig);
        }
        if (source.DeliverRule != null) {
            this.DeliverRule = new DeliverRule(source.DeliverRule);
        }
        if (source.Compliance != null) {
            this.Compliance = new Long(source.Compliance);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
        if (source.HasServicesLog != null) {
            this.HasServicesLog = new Long(source.HasServicesLog);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamObj(map, prefix + "SourceTopicConfig.", this.SourceTopicConfig);
        this.setParamObj(map, prefix + "TargetTopicConfig.", this.TargetTopicConfig);
        this.setParamObj(map, prefix + "DeliverRule.", this.DeliverRule);
        this.setParamSimple(map, prefix + "Compliance", this.Compliance);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "HasServicesLog", this.HasServicesLog);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

