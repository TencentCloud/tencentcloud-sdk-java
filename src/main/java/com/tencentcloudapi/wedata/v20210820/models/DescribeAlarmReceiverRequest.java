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

public class DescribeAlarmReceiverRequest extends AbstractModel{

    /**
    * 告警ID
    */
    @SerializedName("AlarmId")
    @Expose
    private String AlarmId;

    /**
    * 当前页
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 每页记录数
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 消息ID
    */
    @SerializedName("MessageId")
    @Expose
    private String MessageId;

    /**
    * 类型
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * 告警接收人ID(逗号分隔)
    */
    @SerializedName("AlarmRecipient")
    @Expose
    private String AlarmRecipient;

    /**
    * 告警接收人姓名(逗号分隔)
    */
    @SerializedName("AlarmRecipientName")
    @Expose
    private String AlarmRecipientName;

    /**
    * 告警时间
    */
    @SerializedName("AlarmTime")
    @Expose
    private String AlarmTime;

    /**
     * Get 告警ID 
     * @return AlarmId 告警ID
     */
    public String getAlarmId() {
        return this.AlarmId;
    }

    /**
     * Set 告警ID
     * @param AlarmId 告警ID
     */
    public void setAlarmId(String AlarmId) {
        this.AlarmId = AlarmId;
    }

    /**
     * Get 当前页 
     * @return PageNumber 当前页
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 当前页
     * @param PageNumber 当前页
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 每页记录数 
     * @return PageSize 每页记录数
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页记录数
     * @param PageSize 每页记录数
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 项目ID 
     * @return ProjectId 项目ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 消息ID 
     * @return MessageId 消息ID
     */
    public String getMessageId() {
        return this.MessageId;
    }

    /**
     * Set 消息ID
     * @param MessageId 消息ID
     */
    public void setMessageId(String MessageId) {
        this.MessageId = MessageId;
    }

    /**
     * Get 类型 
     * @return TaskType 类型
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 类型
     * @param TaskType 类型
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 告警接收人ID(逗号分隔) 
     * @return AlarmRecipient 告警接收人ID(逗号分隔)
     */
    public String getAlarmRecipient() {
        return this.AlarmRecipient;
    }

    /**
     * Set 告警接收人ID(逗号分隔)
     * @param AlarmRecipient 告警接收人ID(逗号分隔)
     */
    public void setAlarmRecipient(String AlarmRecipient) {
        this.AlarmRecipient = AlarmRecipient;
    }

    /**
     * Get 告警接收人姓名(逗号分隔) 
     * @return AlarmRecipientName 告警接收人姓名(逗号分隔)
     */
    public String getAlarmRecipientName() {
        return this.AlarmRecipientName;
    }

    /**
     * Set 告警接收人姓名(逗号分隔)
     * @param AlarmRecipientName 告警接收人姓名(逗号分隔)
     */
    public void setAlarmRecipientName(String AlarmRecipientName) {
        this.AlarmRecipientName = AlarmRecipientName;
    }

    /**
     * Get 告警时间 
     * @return AlarmTime 告警时间
     */
    public String getAlarmTime() {
        return this.AlarmTime;
    }

    /**
     * Set 告警时间
     * @param AlarmTime 告警时间
     */
    public void setAlarmTime(String AlarmTime) {
        this.AlarmTime = AlarmTime;
    }

    public DescribeAlarmReceiverRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAlarmReceiverRequest(DescribeAlarmReceiverRequest source) {
        if (source.AlarmId != null) {
            this.AlarmId = new String(source.AlarmId);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.MessageId != null) {
            this.MessageId = new String(source.MessageId);
        }
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
        if (source.AlarmRecipient != null) {
            this.AlarmRecipient = new String(source.AlarmRecipient);
        }
        if (source.AlarmRecipientName != null) {
            this.AlarmRecipientName = new String(source.AlarmRecipientName);
        }
        if (source.AlarmTime != null) {
            this.AlarmTime = new String(source.AlarmTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AlarmId", this.AlarmId);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "MessageId", this.MessageId);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "AlarmRecipient", this.AlarmRecipient);
        this.setParamSimple(map, prefix + "AlarmRecipientName", this.AlarmRecipientName);
        this.setParamSimple(map, prefix + "AlarmTime", this.AlarmTime);

    }
}

