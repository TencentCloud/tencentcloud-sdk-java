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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChangeAlarmStatusRequest extends AbstractModel {

    /**
    * 告警的id，返回的列表中的id
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 告警状态 processed unprocessed processing misreport shield
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 告警处理时间
    */
    @SerializedName("ProcessTime")
    @Expose
    private Long ProcessTime;

    /**
    * 处理类型
    */
    @SerializedName("ProcessType")
    @Expose
    private String ProcessType;

    /**
    * 工作空间id
    */
    @SerializedName("WorkspaceId")
    @Expose
    private Long WorkspaceId;

    /**
    * 当前操作用户id
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 当前操作用户名称
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 应用token
    */
    @SerializedName("ApplicationToken")
    @Expose
    private String ApplicationToken;

    /**
    * 平台告警处理人
    */
    @SerializedName("Processor")
    @Expose
    private String Processor;

    /**
    * 告警处理的描述信息
    */
    @SerializedName("ProcessDescription")
    @Expose
    private String ProcessDescription;

    /**
    * 告警处理的扩展信息，可以为JSON字符串
    */
    @SerializedName("ProcessExtend")
    @Expose
    private String ProcessExtend;

    /**
    * 扩展字段1，目前存的应用告警处理人
    */
    @SerializedName("ExtendOne")
    @Expose
    private String ExtendOne;

    /**
    * 应用id
    */
    @SerializedName("ApplicationId")
    @Expose
    private Long ApplicationId;

    /**
     * Get 告警的id，返回的列表中的id 
     * @return Id 告警的id，返回的列表中的id
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 告警的id，返回的列表中的id
     * @param Id 告警的id，返回的列表中的id
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 告警状态 processed unprocessed processing misreport shield 
     * @return Status 告警状态 processed unprocessed processing misreport shield
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 告警状态 processed unprocessed processing misreport shield
     * @param Status 告警状态 processed unprocessed processing misreport shield
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 告警处理时间 
     * @return ProcessTime 告警处理时间
     */
    public Long getProcessTime() {
        return this.ProcessTime;
    }

    /**
     * Set 告警处理时间
     * @param ProcessTime 告警处理时间
     */
    public void setProcessTime(Long ProcessTime) {
        this.ProcessTime = ProcessTime;
    }

    /**
     * Get 处理类型 
     * @return ProcessType 处理类型
     */
    public String getProcessType() {
        return this.ProcessType;
    }

    /**
     * Set 处理类型
     * @param ProcessType 处理类型
     */
    public void setProcessType(String ProcessType) {
        this.ProcessType = ProcessType;
    }

    /**
     * Get 工作空间id 
     * @return WorkspaceId 工作空间id
     */
    public Long getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set 工作空间id
     * @param WorkspaceId 工作空间id
     */
    public void setWorkspaceId(Long WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get 当前操作用户id 
     * @return UserId 当前操作用户id
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 当前操作用户id
     * @param UserId 当前操作用户id
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 当前操作用户名称 
     * @return UserName 当前操作用户名称
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 当前操作用户名称
     * @param UserName 当前操作用户名称
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 应用token 
     * @return ApplicationToken 应用token
     */
    public String getApplicationToken() {
        return this.ApplicationToken;
    }

    /**
     * Set 应用token
     * @param ApplicationToken 应用token
     */
    public void setApplicationToken(String ApplicationToken) {
        this.ApplicationToken = ApplicationToken;
    }

    /**
     * Get 平台告警处理人 
     * @return Processor 平台告警处理人
     */
    public String getProcessor() {
        return this.Processor;
    }

    /**
     * Set 平台告警处理人
     * @param Processor 平台告警处理人
     */
    public void setProcessor(String Processor) {
        this.Processor = Processor;
    }

    /**
     * Get 告警处理的描述信息 
     * @return ProcessDescription 告警处理的描述信息
     */
    public String getProcessDescription() {
        return this.ProcessDescription;
    }

    /**
     * Set 告警处理的描述信息
     * @param ProcessDescription 告警处理的描述信息
     */
    public void setProcessDescription(String ProcessDescription) {
        this.ProcessDescription = ProcessDescription;
    }

    /**
     * Get 告警处理的扩展信息，可以为JSON字符串 
     * @return ProcessExtend 告警处理的扩展信息，可以为JSON字符串
     */
    public String getProcessExtend() {
        return this.ProcessExtend;
    }

    /**
     * Set 告警处理的扩展信息，可以为JSON字符串
     * @param ProcessExtend 告警处理的扩展信息，可以为JSON字符串
     */
    public void setProcessExtend(String ProcessExtend) {
        this.ProcessExtend = ProcessExtend;
    }

    /**
     * Get 扩展字段1，目前存的应用告警处理人 
     * @return ExtendOne 扩展字段1，目前存的应用告警处理人
     */
    public String getExtendOne() {
        return this.ExtendOne;
    }

    /**
     * Set 扩展字段1，目前存的应用告警处理人
     * @param ExtendOne 扩展字段1，目前存的应用告警处理人
     */
    public void setExtendOne(String ExtendOne) {
        this.ExtendOne = ExtendOne;
    }

    /**
     * Get 应用id 
     * @return ApplicationId 应用id
     */
    public Long getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 应用id
     * @param ApplicationId 应用id
     */
    public void setApplicationId(Long ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    public ChangeAlarmStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChangeAlarmStatusRequest(ChangeAlarmStatusRequest source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ProcessTime != null) {
            this.ProcessTime = new Long(source.ProcessTime);
        }
        if (source.ProcessType != null) {
            this.ProcessType = new String(source.ProcessType);
        }
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new Long(source.WorkspaceId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.ApplicationToken != null) {
            this.ApplicationToken = new String(source.ApplicationToken);
        }
        if (source.Processor != null) {
            this.Processor = new String(source.Processor);
        }
        if (source.ProcessDescription != null) {
            this.ProcessDescription = new String(source.ProcessDescription);
        }
        if (source.ProcessExtend != null) {
            this.ProcessExtend = new String(source.ProcessExtend);
        }
        if (source.ExtendOne != null) {
            this.ExtendOne = new String(source.ExtendOne);
        }
        if (source.ApplicationId != null) {
            this.ApplicationId = new Long(source.ApplicationId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ProcessTime", this.ProcessTime);
        this.setParamSimple(map, prefix + "ProcessType", this.ProcessType);
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "ApplicationToken", this.ApplicationToken);
        this.setParamSimple(map, prefix + "Processor", this.Processor);
        this.setParamSimple(map, prefix + "ProcessDescription", this.ProcessDescription);
        this.setParamSimple(map, prefix + "ProcessExtend", this.ProcessExtend);
        this.setParamSimple(map, prefix + "ExtendOne", this.ExtendOne);
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);

    }
}

