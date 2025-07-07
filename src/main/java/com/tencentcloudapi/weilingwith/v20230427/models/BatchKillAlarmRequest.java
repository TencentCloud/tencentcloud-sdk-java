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

public class BatchKillAlarmRequest extends AbstractModel {

    /**
    * 告警开始时间，必填,时间戳秒
    */
    @SerializedName("BeginTime")
    @Expose
    private Long BeginTime;

    /**
    * 告警结束时间，必填，时间戳秒
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 告警状态: unprocessed processing

    */
    @SerializedName("StatusSet")
    @Expose
    private String [] StatusSet;

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
    * 当前告警处理人，填孪生中台用户id,多个用逗号分隔

    */
    @SerializedName("ProcessorId")
    @Expose
    private String ProcessorId;

    /**
    * 告警子类型(如果传告警子类型，则必传父类型)

    */
    @SerializedName("AlarmTypeSet")
    @Expose
    private AlarmTypeInfo [] AlarmTypeSet;

    /**
    * 告警级别,包括1~5
    */
    @SerializedName("LevelSet")
    @Expose
    private Long [] LevelSet;

    /**
    * 设备id
    */
    @SerializedName("WIDSet")
    @Expose
    private String [] WIDSet;

    /**
    * 告警id
    */
    @SerializedName("IdSet")
    @Expose
    private String [] IdSet;

    /**
    * 告警处理的说明
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
     * Get 告警开始时间，必填,时间戳秒 
     * @return BeginTime 告警开始时间，必填,时间戳秒
     */
    public Long getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set 告警开始时间，必填,时间戳秒
     * @param BeginTime 告警开始时间，必填,时间戳秒
     */
    public void setBeginTime(Long BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get 告警结束时间，必填，时间戳秒 
     * @return EndTime 告警结束时间，必填，时间戳秒
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 告警结束时间，必填，时间戳秒
     * @param EndTime 告警结束时间，必填，时间戳秒
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 告警状态: unprocessed processing
 
     * @return StatusSet 告警状态: unprocessed processing

     */
    public String [] getStatusSet() {
        return this.StatusSet;
    }

    /**
     * Set 告警状态: unprocessed processing

     * @param StatusSet 告警状态: unprocessed processing

     */
    public void setStatusSet(String [] StatusSet) {
        this.StatusSet = StatusSet;
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
     * Get 当前告警处理人，填孪生中台用户id,多个用逗号分隔
 
     * @return ProcessorId 当前告警处理人，填孪生中台用户id,多个用逗号分隔

     */
    public String getProcessorId() {
        return this.ProcessorId;
    }

    /**
     * Set 当前告警处理人，填孪生中台用户id,多个用逗号分隔

     * @param ProcessorId 当前告警处理人，填孪生中台用户id,多个用逗号分隔

     */
    public void setProcessorId(String ProcessorId) {
        this.ProcessorId = ProcessorId;
    }

    /**
     * Get 告警子类型(如果传告警子类型，则必传父类型)
 
     * @return AlarmTypeSet 告警子类型(如果传告警子类型，则必传父类型)

     */
    public AlarmTypeInfo [] getAlarmTypeSet() {
        return this.AlarmTypeSet;
    }

    /**
     * Set 告警子类型(如果传告警子类型，则必传父类型)

     * @param AlarmTypeSet 告警子类型(如果传告警子类型，则必传父类型)

     */
    public void setAlarmTypeSet(AlarmTypeInfo [] AlarmTypeSet) {
        this.AlarmTypeSet = AlarmTypeSet;
    }

    /**
     * Get 告警级别,包括1~5 
     * @return LevelSet 告警级别,包括1~5
     */
    public Long [] getLevelSet() {
        return this.LevelSet;
    }

    /**
     * Set 告警级别,包括1~5
     * @param LevelSet 告警级别,包括1~5
     */
    public void setLevelSet(Long [] LevelSet) {
        this.LevelSet = LevelSet;
    }

    /**
     * Get 设备id 
     * @return WIDSet 设备id
     */
    public String [] getWIDSet() {
        return this.WIDSet;
    }

    /**
     * Set 设备id
     * @param WIDSet 设备id
     */
    public void setWIDSet(String [] WIDSet) {
        this.WIDSet = WIDSet;
    }

    /**
     * Get 告警id 
     * @return IdSet 告警id
     */
    public String [] getIdSet() {
        return this.IdSet;
    }

    /**
     * Set 告警id
     * @param IdSet 告警id
     */
    public void setIdSet(String [] IdSet) {
        this.IdSet = IdSet;
    }

    /**
     * Get 告警处理的说明 
     * @return Desc 告警处理的说明
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set 告警处理的说明
     * @param Desc 告警处理的说明
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    public BatchKillAlarmRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchKillAlarmRequest(BatchKillAlarmRequest source) {
        if (source.BeginTime != null) {
            this.BeginTime = new Long(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.StatusSet != null) {
            this.StatusSet = new String[source.StatusSet.length];
            for (int i = 0; i < source.StatusSet.length; i++) {
                this.StatusSet[i] = new String(source.StatusSet[i]);
            }
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
        if (source.ProcessorId != null) {
            this.ProcessorId = new String(source.ProcessorId);
        }
        if (source.AlarmTypeSet != null) {
            this.AlarmTypeSet = new AlarmTypeInfo[source.AlarmTypeSet.length];
            for (int i = 0; i < source.AlarmTypeSet.length; i++) {
                this.AlarmTypeSet[i] = new AlarmTypeInfo(source.AlarmTypeSet[i]);
            }
        }
        if (source.LevelSet != null) {
            this.LevelSet = new Long[source.LevelSet.length];
            for (int i = 0; i < source.LevelSet.length; i++) {
                this.LevelSet[i] = new Long(source.LevelSet[i]);
            }
        }
        if (source.WIDSet != null) {
            this.WIDSet = new String[source.WIDSet.length];
            for (int i = 0; i < source.WIDSet.length; i++) {
                this.WIDSet[i] = new String(source.WIDSet[i]);
            }
        }
        if (source.IdSet != null) {
            this.IdSet = new String[source.IdSet.length];
            for (int i = 0; i < source.IdSet.length; i++) {
                this.IdSet[i] = new String(source.IdSet[i]);
            }
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "StatusSet.", this.StatusSet);
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "ApplicationToken", this.ApplicationToken);
        this.setParamSimple(map, prefix + "ProcessorId", this.ProcessorId);
        this.setParamArrayObj(map, prefix + "AlarmTypeSet.", this.AlarmTypeSet);
        this.setParamArraySimple(map, prefix + "LevelSet.", this.LevelSet);
        this.setParamArraySimple(map, prefix + "WIDSet.", this.WIDSet);
        this.setParamArraySimple(map, prefix + "IdSet.", this.IdSet);
        this.setParamSimple(map, prefix + "Desc", this.Desc);

    }
}

