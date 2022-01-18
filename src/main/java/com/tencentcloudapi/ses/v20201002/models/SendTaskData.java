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
package com.tencentcloudapi.ses.v20201002.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SendTaskData extends AbstractModel{

    /**
    * 任务id
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * 发信地址
    */
    @SerializedName("FromEmailAddress")
    @Expose
    private String FromEmailAddress;

    /**
    * 收件人列表Id
    */
    @SerializedName("ReceiverId")
    @Expose
    private Long ReceiverId;

    /**
    * 任务状态 1 待开始 5 发送中 6 今日暂停发送  7 发信异常 10 发送完成
    */
    @SerializedName("TaskStatus")
    @Expose
    private Long TaskStatus;

    /**
    * 任务类型 1 即时 2 定时 3 周期
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * 任务请求发信数量
    */
    @SerializedName("RequestCount")
    @Expose
    private Long RequestCount;

    /**
    * 已经发送数量
    */
    @SerializedName("SendCount")
    @Expose
    private Long SendCount;

    /**
    * 缓存数量
    */
    @SerializedName("CacheCount")
    @Expose
    private Long CacheCount;

    /**
    * 任务创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 任务更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 邮件主题
    */
    @SerializedName("Subject")
    @Expose
    private String Subject;

    /**
    * 模板和模板数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Template")
    @Expose
    private Template Template;

    /**
    * 周期任务参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CycleParam")
    @Expose
    private CycleEmailParam CycleParam;

    /**
    * 定时任务参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimedParam")
    @Expose
    private TimedEmailParam TimedParam;

    /**
    * 任务异常信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrMsg")
    @Expose
    private String ErrMsg;

    /**
    * 收件人列表名称
    */
    @SerializedName("ReceiversName")
    @Expose
    private String ReceiversName;

    /**
     * Get 任务id 
     * @return TaskId 任务id
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务id
     * @param TaskId 任务id
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 发信地址 
     * @return FromEmailAddress 发信地址
     */
    public String getFromEmailAddress() {
        return this.FromEmailAddress;
    }

    /**
     * Set 发信地址
     * @param FromEmailAddress 发信地址
     */
    public void setFromEmailAddress(String FromEmailAddress) {
        this.FromEmailAddress = FromEmailAddress;
    }

    /**
     * Get 收件人列表Id 
     * @return ReceiverId 收件人列表Id
     */
    public Long getReceiverId() {
        return this.ReceiverId;
    }

    /**
     * Set 收件人列表Id
     * @param ReceiverId 收件人列表Id
     */
    public void setReceiverId(Long ReceiverId) {
        this.ReceiverId = ReceiverId;
    }

    /**
     * Get 任务状态 1 待开始 5 发送中 6 今日暂停发送  7 发信异常 10 发送完成 
     * @return TaskStatus 任务状态 1 待开始 5 发送中 6 今日暂停发送  7 发信异常 10 发送完成
     */
    public Long getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set 任务状态 1 待开始 5 发送中 6 今日暂停发送  7 发信异常 10 发送完成
     * @param TaskStatus 任务状态 1 待开始 5 发送中 6 今日暂停发送  7 发信异常 10 发送完成
     */
    public void setTaskStatus(Long TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get 任务类型 1 即时 2 定时 3 周期 
     * @return TaskType 任务类型 1 即时 2 定时 3 周期
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 任务类型 1 即时 2 定时 3 周期
     * @param TaskType 任务类型 1 即时 2 定时 3 周期
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 任务请求发信数量 
     * @return RequestCount 任务请求发信数量
     */
    public Long getRequestCount() {
        return this.RequestCount;
    }

    /**
     * Set 任务请求发信数量
     * @param RequestCount 任务请求发信数量
     */
    public void setRequestCount(Long RequestCount) {
        this.RequestCount = RequestCount;
    }

    /**
     * Get 已经发送数量 
     * @return SendCount 已经发送数量
     */
    public Long getSendCount() {
        return this.SendCount;
    }

    /**
     * Set 已经发送数量
     * @param SendCount 已经发送数量
     */
    public void setSendCount(Long SendCount) {
        this.SendCount = SendCount;
    }

    /**
     * Get 缓存数量 
     * @return CacheCount 缓存数量
     */
    public Long getCacheCount() {
        return this.CacheCount;
    }

    /**
     * Set 缓存数量
     * @param CacheCount 缓存数量
     */
    public void setCacheCount(Long CacheCount) {
        this.CacheCount = CacheCount;
    }

    /**
     * Get 任务创建时间 
     * @return CreateTime 任务创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 任务创建时间
     * @param CreateTime 任务创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 任务更新时间 
     * @return UpdateTime 任务更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 任务更新时间
     * @param UpdateTime 任务更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 邮件主题 
     * @return Subject 邮件主题
     */
    public String getSubject() {
        return this.Subject;
    }

    /**
     * Set 邮件主题
     * @param Subject 邮件主题
     */
    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

    /**
     * Get 模板和模板数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Template 模板和模板数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Template getTemplate() {
        return this.Template;
    }

    /**
     * Set 模板和模板数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param Template 模板和模板数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTemplate(Template Template) {
        this.Template = Template;
    }

    /**
     * Get 周期任务参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CycleParam 周期任务参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CycleEmailParam getCycleParam() {
        return this.CycleParam;
    }

    /**
     * Set 周期任务参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param CycleParam 周期任务参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCycleParam(CycleEmailParam CycleParam) {
        this.CycleParam = CycleParam;
    }

    /**
     * Get 定时任务参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimedParam 定时任务参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TimedEmailParam getTimedParam() {
        return this.TimedParam;
    }

    /**
     * Set 定时任务参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimedParam 定时任务参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimedParam(TimedEmailParam TimedParam) {
        this.TimedParam = TimedParam;
    }

    /**
     * Get 任务异常信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrMsg 任务异常信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrMsg() {
        return this.ErrMsg;
    }

    /**
     * Set 任务异常信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrMsg 任务异常信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrMsg(String ErrMsg) {
        this.ErrMsg = ErrMsg;
    }

    /**
     * Get 收件人列表名称 
     * @return ReceiversName 收件人列表名称
     */
    public String getReceiversName() {
        return this.ReceiversName;
    }

    /**
     * Set 收件人列表名称
     * @param ReceiversName 收件人列表名称
     */
    public void setReceiversName(String ReceiversName) {
        this.ReceiversName = ReceiversName;
    }

    public SendTaskData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SendTaskData(SendTaskData source) {
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.FromEmailAddress != null) {
            this.FromEmailAddress = new String(source.FromEmailAddress);
        }
        if (source.ReceiverId != null) {
            this.ReceiverId = new Long(source.ReceiverId);
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new Long(source.TaskStatus);
        }
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
        if (source.RequestCount != null) {
            this.RequestCount = new Long(source.RequestCount);
        }
        if (source.SendCount != null) {
            this.SendCount = new Long(source.SendCount);
        }
        if (source.CacheCount != null) {
            this.CacheCount = new Long(source.CacheCount);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Subject != null) {
            this.Subject = new String(source.Subject);
        }
        if (source.Template != null) {
            this.Template = new Template(source.Template);
        }
        if (source.CycleParam != null) {
            this.CycleParam = new CycleEmailParam(source.CycleParam);
        }
        if (source.TimedParam != null) {
            this.TimedParam = new TimedEmailParam(source.TimedParam);
        }
        if (source.ErrMsg != null) {
            this.ErrMsg = new String(source.ErrMsg);
        }
        if (source.ReceiversName != null) {
            this.ReceiversName = new String(source.ReceiversName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "FromEmailAddress", this.FromEmailAddress);
        this.setParamSimple(map, prefix + "ReceiverId", this.ReceiverId);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "RequestCount", this.RequestCount);
        this.setParamSimple(map, prefix + "SendCount", this.SendCount);
        this.setParamSimple(map, prefix + "CacheCount", this.CacheCount);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Subject", this.Subject);
        this.setParamObj(map, prefix + "Template.", this.Template);
        this.setParamObj(map, prefix + "CycleParam.", this.CycleParam);
        this.setParamObj(map, prefix + "TimedParam.", this.TimedParam);
        this.setParamSimple(map, prefix + "ErrMsg", this.ErrMsg);
        this.setParamSimple(map, prefix + "ReceiversName", this.ReceiversName);

    }
}

