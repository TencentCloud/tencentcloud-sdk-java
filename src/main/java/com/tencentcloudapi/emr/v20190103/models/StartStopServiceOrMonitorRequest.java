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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StartStopServiceOrMonitorRequest extends AbstractModel {

    /**
    * 集群ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 操作类型，当前支持
<li>StartService：启动服务</li>
<li>StopService：停止服务</li>
<li>StartMonitor：退出维护</li>
<li>StopMonitor：进入维护</li>
<li>RestartService：重启服务 如果操作类型选择重启服务 StrategyConfig操作策略则是必填项</li>
    */
    @SerializedName("OpType")
    @Expose
    private String OpType;

    /**
    * 操作范围
    */
    @SerializedName("OpScope")
    @Expose
    private OpScope OpScope;

    /**
    * 操作策略
    */
    @SerializedName("StrategyConfig")
    @Expose
    private StrategyConfig StrategyConfig;

    /**
    * 暂停服务时用的参数
    */
    @SerializedName("StopParams")
    @Expose
    private StopParams StopParams;

    /**
    * 当OpType为<li>StopMonitor</li>才有用，true表示进入维护模式但是仍然监控进程但是不拉起进程
    */
    @SerializedName("KeepMonitorButNotRecoverProcess")
    @Expose
    private Boolean KeepMonitorButNotRecoverProcess;

    /**
     * Get 集群ID 
     * @return InstanceId 集群ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 集群ID
     * @param InstanceId 集群ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 操作类型，当前支持
<li>StartService：启动服务</li>
<li>StopService：停止服务</li>
<li>StartMonitor：退出维护</li>
<li>StopMonitor：进入维护</li>
<li>RestartService：重启服务 如果操作类型选择重启服务 StrategyConfig操作策略则是必填项</li> 
     * @return OpType 操作类型，当前支持
<li>StartService：启动服务</li>
<li>StopService：停止服务</li>
<li>StartMonitor：退出维护</li>
<li>StopMonitor：进入维护</li>
<li>RestartService：重启服务 如果操作类型选择重启服务 StrategyConfig操作策略则是必填项</li>
     */
    public String getOpType() {
        return this.OpType;
    }

    /**
     * Set 操作类型，当前支持
<li>StartService：启动服务</li>
<li>StopService：停止服务</li>
<li>StartMonitor：退出维护</li>
<li>StopMonitor：进入维护</li>
<li>RestartService：重启服务 如果操作类型选择重启服务 StrategyConfig操作策略则是必填项</li>
     * @param OpType 操作类型，当前支持
<li>StartService：启动服务</li>
<li>StopService：停止服务</li>
<li>StartMonitor：退出维护</li>
<li>StopMonitor：进入维护</li>
<li>RestartService：重启服务 如果操作类型选择重启服务 StrategyConfig操作策略则是必填项</li>
     */
    public void setOpType(String OpType) {
        this.OpType = OpType;
    }

    /**
     * Get 操作范围 
     * @return OpScope 操作范围
     */
    public OpScope getOpScope() {
        return this.OpScope;
    }

    /**
     * Set 操作范围
     * @param OpScope 操作范围
     */
    public void setOpScope(OpScope OpScope) {
        this.OpScope = OpScope;
    }

    /**
     * Get 操作策略 
     * @return StrategyConfig 操作策略
     */
    public StrategyConfig getStrategyConfig() {
        return this.StrategyConfig;
    }

    /**
     * Set 操作策略
     * @param StrategyConfig 操作策略
     */
    public void setStrategyConfig(StrategyConfig StrategyConfig) {
        this.StrategyConfig = StrategyConfig;
    }

    /**
     * Get 暂停服务时用的参数 
     * @return StopParams 暂停服务时用的参数
     */
    public StopParams getStopParams() {
        return this.StopParams;
    }

    /**
     * Set 暂停服务时用的参数
     * @param StopParams 暂停服务时用的参数
     */
    public void setStopParams(StopParams StopParams) {
        this.StopParams = StopParams;
    }

    /**
     * Get 当OpType为<li>StopMonitor</li>才有用，true表示进入维护模式但是仍然监控进程但是不拉起进程 
     * @return KeepMonitorButNotRecoverProcess 当OpType为<li>StopMonitor</li>才有用，true表示进入维护模式但是仍然监控进程但是不拉起进程
     */
    public Boolean getKeepMonitorButNotRecoverProcess() {
        return this.KeepMonitorButNotRecoverProcess;
    }

    /**
     * Set 当OpType为<li>StopMonitor</li>才有用，true表示进入维护模式但是仍然监控进程但是不拉起进程
     * @param KeepMonitorButNotRecoverProcess 当OpType为<li>StopMonitor</li>才有用，true表示进入维护模式但是仍然监控进程但是不拉起进程
     */
    public void setKeepMonitorButNotRecoverProcess(Boolean KeepMonitorButNotRecoverProcess) {
        this.KeepMonitorButNotRecoverProcess = KeepMonitorButNotRecoverProcess;
    }

    public StartStopServiceOrMonitorRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StartStopServiceOrMonitorRequest(StartStopServiceOrMonitorRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.OpType != null) {
            this.OpType = new String(source.OpType);
        }
        if (source.OpScope != null) {
            this.OpScope = new OpScope(source.OpScope);
        }
        if (source.StrategyConfig != null) {
            this.StrategyConfig = new StrategyConfig(source.StrategyConfig);
        }
        if (source.StopParams != null) {
            this.StopParams = new StopParams(source.StopParams);
        }
        if (source.KeepMonitorButNotRecoverProcess != null) {
            this.KeepMonitorButNotRecoverProcess = new Boolean(source.KeepMonitorButNotRecoverProcess);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "OpType", this.OpType);
        this.setParamObj(map, prefix + "OpScope.", this.OpScope);
        this.setParamObj(map, prefix + "StrategyConfig.", this.StrategyConfig);
        this.setParamObj(map, prefix + "StopParams.", this.StopParams);
        this.setParamSimple(map, prefix + "KeepMonitorButNotRecoverProcess", this.KeepMonitorButNotRecoverProcess);

    }
}

