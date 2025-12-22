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

public class MetricSubscribeInfo extends AbstractModel {

    /**
    * 订阅任务id。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 日志主题id。
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 订阅任务名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 云产品命名空间。
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 指标配置信息。
    */
    @SerializedName("Metrics")
    @Expose
    private MetricConfig [] Metrics;

    /**
    * 实例配置信息。
    */
    @SerializedName("InstanceInfo")
    @Expose
    private InstanceConfig InstanceInfo;

    /**
    * 订阅任务开关。1:暂停 2:启用
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * 订阅任务运行状态。0:创建中 1:暂停 2:运行中 3:异常
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 订阅任务运行异常时的错误信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrMsg")
    @Expose
    private String ErrMsg;

    /**
    * 创建时间（秒级时间戳）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 更新时间（秒级时间戳）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
     * Get 订阅任务id。 
     * @return TaskId 订阅任务id。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 订阅任务id。
     * @param TaskId 订阅任务id。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 日志主题id。 
     * @return TopicId 日志主题id。
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 日志主题id。
     * @param TopicId 日志主题id。
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get 订阅任务名称。 
     * @return Name 订阅任务名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 订阅任务名称。
     * @param Name 订阅任务名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 云产品命名空间。 
     * @return Namespace 云产品命名空间。
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 云产品命名空间。
     * @param Namespace 云产品命名空间。
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 指标配置信息。 
     * @return Metrics 指标配置信息。
     */
    public MetricConfig [] getMetrics() {
        return this.Metrics;
    }

    /**
     * Set 指标配置信息。
     * @param Metrics 指标配置信息。
     */
    public void setMetrics(MetricConfig [] Metrics) {
        this.Metrics = Metrics;
    }

    /**
     * Get 实例配置信息。 
     * @return InstanceInfo 实例配置信息。
     */
    public InstanceConfig getInstanceInfo() {
        return this.InstanceInfo;
    }

    /**
     * Set 实例配置信息。
     * @param InstanceInfo 实例配置信息。
     */
    public void setInstanceInfo(InstanceConfig InstanceInfo) {
        this.InstanceInfo = InstanceInfo;
    }

    /**
     * Get 订阅任务开关。1:暂停 2:启用 
     * @return Enable 订阅任务开关。1:暂停 2:启用
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set 订阅任务开关。1:暂停 2:启用
     * @param Enable 订阅任务开关。1:暂停 2:启用
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 订阅任务运行状态。0:创建中 1:暂停 2:运行中 3:异常 
     * @return Status 订阅任务运行状态。0:创建中 1:暂停 2:运行中 3:异常
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 订阅任务运行状态。0:创建中 1:暂停 2:运行中 3:异常
     * @param Status 订阅任务运行状态。0:创建中 1:暂停 2:运行中 3:异常
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 订阅任务运行异常时的错误信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrMsg 订阅任务运行异常时的错误信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrMsg() {
        return this.ErrMsg;
    }

    /**
     * Set 订阅任务运行异常时的错误信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrMsg 订阅任务运行异常时的错误信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrMsg(String ErrMsg) {
        this.ErrMsg = ErrMsg;
    }

    /**
     * Get 创建时间（秒级时间戳）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间（秒级时间戳）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间（秒级时间戳）
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间（秒级时间戳）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间（秒级时间戳）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新时间（秒级时间戳）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间（秒级时间戳）
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间（秒级时间戳）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public MetricSubscribeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MetricSubscribeInfo(MetricSubscribeInfo source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.Metrics != null) {
            this.Metrics = new MetricConfig[source.Metrics.length];
            for (int i = 0; i < source.Metrics.length; i++) {
                this.Metrics[i] = new MetricConfig(source.Metrics[i]);
            }
        }
        if (source.InstanceInfo != null) {
            this.InstanceInfo = new InstanceConfig(source.InstanceInfo);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ErrMsg != null) {
            this.ErrMsg = new String(source.ErrMsg);
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
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamArrayObj(map, prefix + "Metrics.", this.Metrics);
        this.setParamObj(map, prefix + "InstanceInfo.", this.InstanceInfo);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ErrMsg", this.ErrMsg);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

