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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskAlarmInfo extends AbstractModel{

    /**
    * 任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 规则名称
    */
    @SerializedName("RegularName")
    @Expose
    private String RegularName;

    /**
    * 规则状态(0表示关闭，1表示打开)
    */
    @SerializedName("RegularStatus")
    @Expose
    private Long RegularStatus;

    /**
    * 告警级别(0表示普通，1表示重要，2表示紧急)
    */
    @SerializedName("AlarmLevel")
    @Expose
    private Long AlarmLevel;

    /**
    * 告警指标,0表示任务失败，1表示任务运行超时，2表示任务停止，3表示任务暂停
，4写入速度，5读取速度，6读取吞吐，7写入吞吐, 8脏数据字节数，9脏数据条数
    */
    @SerializedName("AlarmIndicator")
    @Expose
    private Long AlarmIndicator;

    /**
    * 告警方式,多个用逗号隔开（1:邮件，2:短信，3:微信，4:语音，5:代表企业微信，6:http）
    */
    @SerializedName("AlarmWay")
    @Expose
    private String AlarmWay;

    /**
    * 告警接收人ID，多个用逗号隔开
    */
    @SerializedName("AlarmRecipientId")
    @Expose
    private String AlarmRecipientId;

    /**
    * 任务类型(201表示实时，202表示离线)
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * 告警接收人昵称，多个用逗号隔开
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlarmRecipientName")
    @Expose
    private String AlarmRecipientName;

    /**
    * 主键ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 规则ID
    */
    @SerializedName("RegularId")
    @Expose
    private String RegularId;

    /**
    * 指标阈值(1表示离线任务第一次运行失败，2表示离线任务所有重试完成后失败)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TriggerType")
    @Expose
    private Long TriggerType;

    /**
    * 预计的超时时间(分钟级别)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EstimatedTime")
    @Expose
    private Long EstimatedTime;

    /**
    * 项目ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 创建人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Creater")
    @Expose
    private String Creater;

    /**
    * 告警指标描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlarmIndicatorDesc")
    @Expose
    private String AlarmIndicatorDesc;

    /**
    * 实时任务告警需要的参数，1是大于2是小于
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Operator")
    @Expose
    private Long Operator;

    /**
    * 节点id，多个逗号分隔
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
    * 节点名称，多个逗号分隔
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

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
     * Get 规则名称 
     * @return RegularName 规则名称
     */
    public String getRegularName() {
        return this.RegularName;
    }

    /**
     * Set 规则名称
     * @param RegularName 规则名称
     */
    public void setRegularName(String RegularName) {
        this.RegularName = RegularName;
    }

    /**
     * Get 规则状态(0表示关闭，1表示打开) 
     * @return RegularStatus 规则状态(0表示关闭，1表示打开)
     */
    public Long getRegularStatus() {
        return this.RegularStatus;
    }

    /**
     * Set 规则状态(0表示关闭，1表示打开)
     * @param RegularStatus 规则状态(0表示关闭，1表示打开)
     */
    public void setRegularStatus(Long RegularStatus) {
        this.RegularStatus = RegularStatus;
    }

    /**
     * Get 告警级别(0表示普通，1表示重要，2表示紧急) 
     * @return AlarmLevel 告警级别(0表示普通，1表示重要，2表示紧急)
     */
    public Long getAlarmLevel() {
        return this.AlarmLevel;
    }

    /**
     * Set 告警级别(0表示普通，1表示重要，2表示紧急)
     * @param AlarmLevel 告警级别(0表示普通，1表示重要，2表示紧急)
     */
    public void setAlarmLevel(Long AlarmLevel) {
        this.AlarmLevel = AlarmLevel;
    }

    /**
     * Get 告警指标,0表示任务失败，1表示任务运行超时，2表示任务停止，3表示任务暂停
，4写入速度，5读取速度，6读取吞吐，7写入吞吐, 8脏数据字节数，9脏数据条数 
     * @return AlarmIndicator 告警指标,0表示任务失败，1表示任务运行超时，2表示任务停止，3表示任务暂停
，4写入速度，5读取速度，6读取吞吐，7写入吞吐, 8脏数据字节数，9脏数据条数
     */
    public Long getAlarmIndicator() {
        return this.AlarmIndicator;
    }

    /**
     * Set 告警指标,0表示任务失败，1表示任务运行超时，2表示任务停止，3表示任务暂停
，4写入速度，5读取速度，6读取吞吐，7写入吞吐, 8脏数据字节数，9脏数据条数
     * @param AlarmIndicator 告警指标,0表示任务失败，1表示任务运行超时，2表示任务停止，3表示任务暂停
，4写入速度，5读取速度，6读取吞吐，7写入吞吐, 8脏数据字节数，9脏数据条数
     */
    public void setAlarmIndicator(Long AlarmIndicator) {
        this.AlarmIndicator = AlarmIndicator;
    }

    /**
     * Get 告警方式,多个用逗号隔开（1:邮件，2:短信，3:微信，4:语音，5:代表企业微信，6:http） 
     * @return AlarmWay 告警方式,多个用逗号隔开（1:邮件，2:短信，3:微信，4:语音，5:代表企业微信，6:http）
     */
    public String getAlarmWay() {
        return this.AlarmWay;
    }

    /**
     * Set 告警方式,多个用逗号隔开（1:邮件，2:短信，3:微信，4:语音，5:代表企业微信，6:http）
     * @param AlarmWay 告警方式,多个用逗号隔开（1:邮件，2:短信，3:微信，4:语音，5:代表企业微信，6:http）
     */
    public void setAlarmWay(String AlarmWay) {
        this.AlarmWay = AlarmWay;
    }

    /**
     * Get 告警接收人ID，多个用逗号隔开 
     * @return AlarmRecipientId 告警接收人ID，多个用逗号隔开
     */
    public String getAlarmRecipientId() {
        return this.AlarmRecipientId;
    }

    /**
     * Set 告警接收人ID，多个用逗号隔开
     * @param AlarmRecipientId 告警接收人ID，多个用逗号隔开
     */
    public void setAlarmRecipientId(String AlarmRecipientId) {
        this.AlarmRecipientId = AlarmRecipientId;
    }

    /**
     * Get 任务类型(201表示实时，202表示离线) 
     * @return TaskType 任务类型(201表示实时，202表示离线)
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 任务类型(201表示实时，202表示离线)
     * @param TaskType 任务类型(201表示实时，202表示离线)
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 告警接收人昵称，多个用逗号隔开
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlarmRecipientName 告警接收人昵称，多个用逗号隔开
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAlarmRecipientName() {
        return this.AlarmRecipientName;
    }

    /**
     * Set 告警接收人昵称，多个用逗号隔开
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlarmRecipientName 告警接收人昵称，多个用逗号隔开
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlarmRecipientName(String AlarmRecipientName) {
        this.AlarmRecipientName = AlarmRecipientName;
    }

    /**
     * Get 主键ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 主键ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 主键ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 主键ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 规则ID 
     * @return RegularId 规则ID
     */
    public String getRegularId() {
        return this.RegularId;
    }

    /**
     * Set 规则ID
     * @param RegularId 规则ID
     */
    public void setRegularId(String RegularId) {
        this.RegularId = RegularId;
    }

    /**
     * Get 指标阈值(1表示离线任务第一次运行失败，2表示离线任务所有重试完成后失败)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TriggerType 指标阈值(1表示离线任务第一次运行失败，2表示离线任务所有重试完成后失败)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTriggerType() {
        return this.TriggerType;
    }

    /**
     * Set 指标阈值(1表示离线任务第一次运行失败，2表示离线任务所有重试完成后失败)
注意：此字段可能返回 null，表示取不到有效值。
     * @param TriggerType 指标阈值(1表示离线任务第一次运行失败，2表示离线任务所有重试完成后失败)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTriggerType(Long TriggerType) {
        this.TriggerType = TriggerType;
    }

    /**
     * Get 预计的超时时间(分钟级别)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EstimatedTime 预计的超时时间(分钟级别)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEstimatedTime() {
        return this.EstimatedTime;
    }

    /**
     * Set 预计的超时时间(分钟级别)
注意：此字段可能返回 null，表示取不到有效值。
     * @param EstimatedTime 预计的超时时间(分钟级别)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEstimatedTime(Long EstimatedTime) {
        this.EstimatedTime = EstimatedTime;
    }

    /**
     * Get 项目ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId 项目ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId 项目ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 创建人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Creater 创建人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreater() {
        return this.Creater;
    }

    /**
     * Set 创建人
注意：此字段可能返回 null，表示取不到有效值。
     * @param Creater 创建人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreater(String Creater) {
        this.Creater = Creater;
    }

    /**
     * Get 告警指标描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlarmIndicatorDesc 告警指标描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAlarmIndicatorDesc() {
        return this.AlarmIndicatorDesc;
    }

    /**
     * Set 告警指标描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlarmIndicatorDesc 告警指标描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlarmIndicatorDesc(String AlarmIndicatorDesc) {
        this.AlarmIndicatorDesc = AlarmIndicatorDesc;
    }

    /**
     * Get 实时任务告警需要的参数，1是大于2是小于
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Operator 实时任务告警需要的参数，1是大于2是小于
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOperator() {
        return this.Operator;
    }

    /**
     * Set 实时任务告警需要的参数，1是大于2是小于
注意：此字段可能返回 null，表示取不到有效值。
     * @param Operator 实时任务告警需要的参数，1是大于2是小于
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperator(Long Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 节点id，多个逗号分隔
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeId 节点id，多个逗号分隔
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set 节点id，多个逗号分隔
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeId 节点id，多个逗号分隔
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeId(String NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get 节点名称，多个逗号分隔
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeName 节点名称，多个逗号分隔
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set 节点名称，多个逗号分隔
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeName 节点名称，多个逗号分隔
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    public TaskAlarmInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskAlarmInfo(TaskAlarmInfo source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.RegularName != null) {
            this.RegularName = new String(source.RegularName);
        }
        if (source.RegularStatus != null) {
            this.RegularStatus = new Long(source.RegularStatus);
        }
        if (source.AlarmLevel != null) {
            this.AlarmLevel = new Long(source.AlarmLevel);
        }
        if (source.AlarmIndicator != null) {
            this.AlarmIndicator = new Long(source.AlarmIndicator);
        }
        if (source.AlarmWay != null) {
            this.AlarmWay = new String(source.AlarmWay);
        }
        if (source.AlarmRecipientId != null) {
            this.AlarmRecipientId = new String(source.AlarmRecipientId);
        }
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
        if (source.AlarmRecipientName != null) {
            this.AlarmRecipientName = new String(source.AlarmRecipientName);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.RegularId != null) {
            this.RegularId = new String(source.RegularId);
        }
        if (source.TriggerType != null) {
            this.TriggerType = new Long(source.TriggerType);
        }
        if (source.EstimatedTime != null) {
            this.EstimatedTime = new Long(source.EstimatedTime);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Creater != null) {
            this.Creater = new String(source.Creater);
        }
        if (source.AlarmIndicatorDesc != null) {
            this.AlarmIndicatorDesc = new String(source.AlarmIndicatorDesc);
        }
        if (source.Operator != null) {
            this.Operator = new Long(source.Operator);
        }
        if (source.NodeId != null) {
            this.NodeId = new String(source.NodeId);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "RegularName", this.RegularName);
        this.setParamSimple(map, prefix + "RegularStatus", this.RegularStatus);
        this.setParamSimple(map, prefix + "AlarmLevel", this.AlarmLevel);
        this.setParamSimple(map, prefix + "AlarmIndicator", this.AlarmIndicator);
        this.setParamSimple(map, prefix + "AlarmWay", this.AlarmWay);
        this.setParamSimple(map, prefix + "AlarmRecipientId", this.AlarmRecipientId);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "AlarmRecipientName", this.AlarmRecipientName);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "RegularId", this.RegularId);
        this.setParamSimple(map, prefix + "TriggerType", this.TriggerType);
        this.setParamSimple(map, prefix + "EstimatedTime", this.EstimatedTime);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Creater", this.Creater);
        this.setParamSimple(map, prefix + "AlarmIndicatorDesc", this.AlarmIndicatorDesc);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);

    }
}

