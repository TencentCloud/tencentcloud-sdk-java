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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCloudBaseRunOneClickTaskExternalResponse extends AbstractModel{

    /**
    * 外部任务Id
    */
    @SerializedName("ExternalId")
    @Expose
    private String ExternalId;

    /**
    * 弃用
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 用户uin
    */
    @SerializedName("UserUin")
    @Expose
    private String UserUin;

    /**
    * 服务名
    */
    @SerializedName("ServerName")
    @Expose
    private String ServerName;

    /**
    * 版本名
    */
    @SerializedName("VersionName")
    @Expose
    private String VersionName;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 当前阶段
微信云托管环境创建阶段：envStage
存储资源创建阶段：storageStage
服务创建阶段：serverStage
    */
    @SerializedName("Stage")
    @Expose
    private String Stage;

    /**
    * 状态
running
stopped
failed
finished
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 失败原因
    */
    @SerializedName("FailReason")
    @Expose
    private String FailReason;

    /**
    * 用户envId
    */
    @SerializedName("UserEnvId")
    @Expose
    private String UserEnvId;

    /**
    * 创建时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 步骤信息
    */
    @SerializedName("Steps")
    @Expose
    private OneClickTaskStepInfo [] Steps;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 外部任务Id 
     * @return ExternalId 外部任务Id
     */
    public String getExternalId() {
        return this.ExternalId;
    }

    /**
     * Set 外部任务Id
     * @param ExternalId 外部任务Id
     */
    public void setExternalId(String ExternalId) {
        this.ExternalId = ExternalId;
    }

    /**
     * Get 弃用 
     * @return EnvId 弃用
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 弃用
     * @param EnvId 弃用
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get 用户uin 
     * @return UserUin 用户uin
     */
    public String getUserUin() {
        return this.UserUin;
    }

    /**
     * Set 用户uin
     * @param UserUin 用户uin
     */
    public void setUserUin(String UserUin) {
        this.UserUin = UserUin;
    }

    /**
     * Get 服务名 
     * @return ServerName 服务名
     */
    public String getServerName() {
        return this.ServerName;
    }

    /**
     * Set 服务名
     * @param ServerName 服务名
     */
    public void setServerName(String ServerName) {
        this.ServerName = ServerName;
    }

    /**
     * Get 版本名 
     * @return VersionName 版本名
     */
    public String getVersionName() {
        return this.VersionName;
    }

    /**
     * Set 版本名
     * @param VersionName 版本名
     */
    public void setVersionName(String VersionName) {
        this.VersionName = VersionName;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 当前阶段
微信云托管环境创建阶段：envStage
存储资源创建阶段：storageStage
服务创建阶段：serverStage 
     * @return Stage 当前阶段
微信云托管环境创建阶段：envStage
存储资源创建阶段：storageStage
服务创建阶段：serverStage
     */
    public String getStage() {
        return this.Stage;
    }

    /**
     * Set 当前阶段
微信云托管环境创建阶段：envStage
存储资源创建阶段：storageStage
服务创建阶段：serverStage
     * @param Stage 当前阶段
微信云托管环境创建阶段：envStage
存储资源创建阶段：storageStage
服务创建阶段：serverStage
     */
    public void setStage(String Stage) {
        this.Stage = Stage;
    }

    /**
     * Get 状态
running
stopped
failed
finished 
     * @return Status 状态
running
stopped
failed
finished
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
running
stopped
failed
finished
     * @param Status 状态
running
stopped
failed
finished
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 失败原因 
     * @return FailReason 失败原因
     */
    public String getFailReason() {
        return this.FailReason;
    }

    /**
     * Set 失败原因
     * @param FailReason 失败原因
     */
    public void setFailReason(String FailReason) {
        this.FailReason = FailReason;
    }

    /**
     * Get 用户envId 
     * @return UserEnvId 用户envId
     */
    public String getUserEnvId() {
        return this.UserEnvId;
    }

    /**
     * Set 用户envId
     * @param UserEnvId 用户envId
     */
    public void setUserEnvId(String UserEnvId) {
        this.UserEnvId = UserEnvId;
    }

    /**
     * Get 创建时间 
     * @return StartTime 创建时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 创建时间
     * @param StartTime 创建时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 步骤信息 
     * @return Steps 步骤信息
     */
    public OneClickTaskStepInfo [] getSteps() {
        return this.Steps;
    }

    /**
     * Set 步骤信息
     * @param Steps 步骤信息
     */
    public void setSteps(OneClickTaskStepInfo [] Steps) {
        this.Steps = Steps;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeCloudBaseRunOneClickTaskExternalResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCloudBaseRunOneClickTaskExternalResponse(DescribeCloudBaseRunOneClickTaskExternalResponse source) {
        if (source.ExternalId != null) {
            this.ExternalId = new String(source.ExternalId);
        }
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.UserUin != null) {
            this.UserUin = new String(source.UserUin);
        }
        if (source.ServerName != null) {
            this.ServerName = new String(source.ServerName);
        }
        if (source.VersionName != null) {
            this.VersionName = new String(source.VersionName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Stage != null) {
            this.Stage = new String(source.Stage);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.FailReason != null) {
            this.FailReason = new String(source.FailReason);
        }
        if (source.UserEnvId != null) {
            this.UserEnvId = new String(source.UserEnvId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.Steps != null) {
            this.Steps = new OneClickTaskStepInfo[source.Steps.length];
            for (int i = 0; i < source.Steps.length; i++) {
                this.Steps[i] = new OneClickTaskStepInfo(source.Steps[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExternalId", this.ExternalId);
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "UserUin", this.UserUin);
        this.setParamSimple(map, prefix + "ServerName", this.ServerName);
        this.setParamSimple(map, prefix + "VersionName", this.VersionName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Stage", this.Stage);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "FailReason", this.FailReason);
        this.setParamSimple(map, prefix + "UserEnvId", this.UserEnvId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamArrayObj(map, prefix + "Steps.", this.Steps);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

