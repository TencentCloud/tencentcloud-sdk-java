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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserTaskInfo extends AbstractModel{

    /**
    * 任务ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 用户账户ID
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 任务状态，0-任务初始化中；1-任务运行中；2-任务成功；3-任务失败
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 任务类型，0-实例回档；1-实例创建；2-实例扩容；3-实例迁移；4-实例删除；5-实例重启
    */
    @SerializedName("UserTaskType")
    @Expose
    private Long UserTaskType;

    /**
    * 任务创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 任务结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 任务错误信息
    */
    @SerializedName("ErrMsg")
    @Expose
    private String ErrMsg;

    /**
    * 客户端参数
    */
    @SerializedName("InputData")
    @Expose
    private String InputData;

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 地域ID
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
     * Get 任务ID 
     * @return Id 任务ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 任务ID
     * @param Id 任务ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 用户账户ID 
     * @return AppId 用户账户ID
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 用户账户ID
     * @param AppId 用户账户ID
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 任务状态，0-任务初始化中；1-任务运行中；2-任务成功；3-任务失败 
     * @return Status 任务状态，0-任务初始化中；1-任务运行中；2-任务成功；3-任务失败
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态，0-任务初始化中；1-任务运行中；2-任务成功；3-任务失败
     * @param Status 任务状态，0-任务初始化中；1-任务运行中；2-任务成功；3-任务失败
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 任务类型，0-实例回档；1-实例创建；2-实例扩容；3-实例迁移；4-实例删除；5-实例重启 
     * @return UserTaskType 任务类型，0-实例回档；1-实例创建；2-实例扩容；3-实例迁移；4-实例删除；5-实例重启
     */
    public Long getUserTaskType() {
        return this.UserTaskType;
    }

    /**
     * Set 任务类型，0-实例回档；1-实例创建；2-实例扩容；3-实例迁移；4-实例删除；5-实例重启
     * @param UserTaskType 任务类型，0-实例回档；1-实例创建；2-实例扩容；3-实例迁移；4-实例删除；5-实例重启
     */
    public void setUserTaskType(Long UserTaskType) {
        this.UserTaskType = UserTaskType;
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
     * Get 任务结束时间 
     * @return EndTime 任务结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 任务结束时间
     * @param EndTime 任务结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 任务错误信息 
     * @return ErrMsg 任务错误信息
     */
    public String getErrMsg() {
        return this.ErrMsg;
    }

    /**
     * Set 任务错误信息
     * @param ErrMsg 任务错误信息
     */
    public void setErrMsg(String ErrMsg) {
        this.ErrMsg = ErrMsg;
    }

    /**
     * Get 客户端参数 
     * @return InputData 客户端参数
     */
    public String getInputData() {
        return this.InputData;
    }

    /**
     * Set 客户端参数
     * @param InputData 客户端参数
     */
    public void setInputData(String InputData) {
        this.InputData = InputData;
    }

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例名称 
     * @return InstanceName 实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称
     * @param InstanceName 实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 地域ID 
     * @return RegionId 地域ID
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 地域ID
     * @param RegionId 地域ID
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    public UserTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserTaskInfo(UserTaskInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.UserTaskType != null) {
            this.UserTaskType = new Long(source.UserTaskType);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.ErrMsg != null) {
            this.ErrMsg = new String(source.ErrMsg);
        }
        if (source.InputData != null) {
            this.InputData = new String(source.InputData);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "UserTaskType", this.UserTaskType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ErrMsg", this.ErrMsg);
        this.setParamSimple(map, prefix + "InputData", this.InputData);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);

    }
}

