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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NotebookSessions extends AbstractModel {

    /**
    * 类型，当前支持：spark、pyspark、sparkr、sql
    */
    @SerializedName("Kind")
    @Expose
    private String Kind;

    /**
    * Session唯一标识
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * 代理用户，默认为root
    */
    @SerializedName("ProxyUser")
    @Expose
    private String ProxyUser;

    /**
    * Session状态，包含：not_started（未启动）、starting（已启动）、idle（等待输入）、busy(正在运行statement)、shutting_down（停止）、error（异常）、dead（已退出）、killed（被杀死）、success（正常停止）
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * Spark任务返回的AppId
    */
    @SerializedName("SparkAppId")
    @Expose
    private String SparkAppId;

    /**
    * Session名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Session创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 引擎名称
    */
    @SerializedName("DataEngineName")
    @Expose
    private String DataEngineName;

    /**
    * 最新的运行时间
    */
    @SerializedName("LastRunningTime")
    @Expose
    private String LastRunningTime;

    /**
    * 创建者
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * spark ui地址
    */
    @SerializedName("SparkUiUrl")
    @Expose
    private String SparkUiUrl;

    /**
    * session类型，group：资源组session independent：独立资源session，不依赖资源组
    */
    @SerializedName("SessionType")
    @Expose
    private String SessionType;

    /**
    * 引擎id
    */
    @SerializedName("DataEngineId")
    @Expose
    private String DataEngineId;

    /**
    * 资源组id
    */
    @SerializedName("ResourceGroupId")
    @Expose
    private String ResourceGroupId;

    /**
    * 资源组名字
    */
    @SerializedName("ResourceGroupName")
    @Expose
    private String ResourceGroupName;

    /**
     * Get 类型，当前支持：spark、pyspark、sparkr、sql 
     * @return Kind 类型，当前支持：spark、pyspark、sparkr、sql
     */
    public String getKind() {
        return this.Kind;
    }

    /**
     * Set 类型，当前支持：spark、pyspark、sparkr、sql
     * @param Kind 类型，当前支持：spark、pyspark、sparkr、sql
     */
    public void setKind(String Kind) {
        this.Kind = Kind;
    }

    /**
     * Get Session唯一标识 
     * @return SessionId Session唯一标识
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set Session唯一标识
     * @param SessionId Session唯一标识
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get 代理用户，默认为root 
     * @return ProxyUser 代理用户，默认为root
     */
    public String getProxyUser() {
        return this.ProxyUser;
    }

    /**
     * Set 代理用户，默认为root
     * @param ProxyUser 代理用户，默认为root
     */
    public void setProxyUser(String ProxyUser) {
        this.ProxyUser = ProxyUser;
    }

    /**
     * Get Session状态，包含：not_started（未启动）、starting（已启动）、idle（等待输入）、busy(正在运行statement)、shutting_down（停止）、error（异常）、dead（已退出）、killed（被杀死）、success（正常停止） 
     * @return State Session状态，包含：not_started（未启动）、starting（已启动）、idle（等待输入）、busy(正在运行statement)、shutting_down（停止）、error（异常）、dead（已退出）、killed（被杀死）、success（正常停止）
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set Session状态，包含：not_started（未启动）、starting（已启动）、idle（等待输入）、busy(正在运行statement)、shutting_down（停止）、error（异常）、dead（已退出）、killed（被杀死）、success（正常停止）
     * @param State Session状态，包含：not_started（未启动）、starting（已启动）、idle（等待输入）、busy(正在运行statement)、shutting_down（停止）、error（异常）、dead（已退出）、killed（被杀死）、success（正常停止）
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get Spark任务返回的AppId 
     * @return SparkAppId Spark任务返回的AppId
     */
    public String getSparkAppId() {
        return this.SparkAppId;
    }

    /**
     * Set Spark任务返回的AppId
     * @param SparkAppId Spark任务返回的AppId
     */
    public void setSparkAppId(String SparkAppId) {
        this.SparkAppId = SparkAppId;
    }

    /**
     * Get Session名称 
     * @return Name Session名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Session名称
     * @param Name Session名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Session创建时间 
     * @return CreateTime Session创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Session创建时间
     * @param CreateTime Session创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 引擎名称 
     * @return DataEngineName 引擎名称
     */
    public String getDataEngineName() {
        return this.DataEngineName;
    }

    /**
     * Set 引擎名称
     * @param DataEngineName 引擎名称
     */
    public void setDataEngineName(String DataEngineName) {
        this.DataEngineName = DataEngineName;
    }

    /**
     * Get 最新的运行时间 
     * @return LastRunningTime 最新的运行时间
     */
    public String getLastRunningTime() {
        return this.LastRunningTime;
    }

    /**
     * Set 最新的运行时间
     * @param LastRunningTime 最新的运行时间
     */
    public void setLastRunningTime(String LastRunningTime) {
        this.LastRunningTime = LastRunningTime;
    }

    /**
     * Get 创建者 
     * @return Creator 创建者
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set 创建者
     * @param Creator 创建者
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get spark ui地址 
     * @return SparkUiUrl spark ui地址
     */
    public String getSparkUiUrl() {
        return this.SparkUiUrl;
    }

    /**
     * Set spark ui地址
     * @param SparkUiUrl spark ui地址
     */
    public void setSparkUiUrl(String SparkUiUrl) {
        this.SparkUiUrl = SparkUiUrl;
    }

    /**
     * Get session类型，group：资源组session independent：独立资源session，不依赖资源组 
     * @return SessionType session类型，group：资源组session independent：独立资源session，不依赖资源组
     */
    public String getSessionType() {
        return this.SessionType;
    }

    /**
     * Set session类型，group：资源组session independent：独立资源session，不依赖资源组
     * @param SessionType session类型，group：资源组session independent：独立资源session，不依赖资源组
     */
    public void setSessionType(String SessionType) {
        this.SessionType = SessionType;
    }

    /**
     * Get 引擎id 
     * @return DataEngineId 引擎id
     */
    public String getDataEngineId() {
        return this.DataEngineId;
    }

    /**
     * Set 引擎id
     * @param DataEngineId 引擎id
     */
    public void setDataEngineId(String DataEngineId) {
        this.DataEngineId = DataEngineId;
    }

    /**
     * Get 资源组id 
     * @return ResourceGroupId 资源组id
     */
    public String getResourceGroupId() {
        return this.ResourceGroupId;
    }

    /**
     * Set 资源组id
     * @param ResourceGroupId 资源组id
     */
    public void setResourceGroupId(String ResourceGroupId) {
        this.ResourceGroupId = ResourceGroupId;
    }

    /**
     * Get 资源组名字 
     * @return ResourceGroupName 资源组名字
     */
    public String getResourceGroupName() {
        return this.ResourceGroupName;
    }

    /**
     * Set 资源组名字
     * @param ResourceGroupName 资源组名字
     */
    public void setResourceGroupName(String ResourceGroupName) {
        this.ResourceGroupName = ResourceGroupName;
    }

    public NotebookSessions() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NotebookSessions(NotebookSessions source) {
        if (source.Kind != null) {
            this.Kind = new String(source.Kind);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.ProxyUser != null) {
            this.ProxyUser = new String(source.ProxyUser);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.SparkAppId != null) {
            this.SparkAppId = new String(source.SparkAppId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.DataEngineName != null) {
            this.DataEngineName = new String(source.DataEngineName);
        }
        if (source.LastRunningTime != null) {
            this.LastRunningTime = new String(source.LastRunningTime);
        }
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
        if (source.SparkUiUrl != null) {
            this.SparkUiUrl = new String(source.SparkUiUrl);
        }
        if (source.SessionType != null) {
            this.SessionType = new String(source.SessionType);
        }
        if (source.DataEngineId != null) {
            this.DataEngineId = new String(source.DataEngineId);
        }
        if (source.ResourceGroupId != null) {
            this.ResourceGroupId = new String(source.ResourceGroupId);
        }
        if (source.ResourceGroupName != null) {
            this.ResourceGroupName = new String(source.ResourceGroupName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Kind", this.Kind);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "ProxyUser", this.ProxyUser);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "SparkAppId", this.SparkAppId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "DataEngineName", this.DataEngineName);
        this.setParamSimple(map, prefix + "LastRunningTime", this.LastRunningTime);
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamSimple(map, prefix + "SparkUiUrl", this.SparkUiUrl);
        this.setParamSimple(map, prefix + "SessionType", this.SessionType);
        this.setParamSimple(map, prefix + "DataEngineId", this.DataEngineId);
        this.setParamSimple(map, prefix + "ResourceGroupId", this.ResourceGroupId);
        this.setParamSimple(map, prefix + "ResourceGroupName", this.ResourceGroupName);

    }
}

