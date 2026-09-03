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

public class ModifyRemoteWriteTaskRequest extends AbstractModel {

    /**
    * <p>任务id</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>日志主题id</p>
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * <p>任务状态<br>0 关闭 1 开启</p>
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * <p>RemoteWrite任务名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>1 内网 2外网</p>
    */
    @SerializedName("NetType")
    @Expose
    private Long NetType;

    /**
    * <p>私有网络id</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>目标服务名称</p>
    */
    @SerializedName("Target")
    @Expose
    private String Target;

    /**
    * <p>目标地址</p>
    */
    @SerializedName("RemoteWriteURL")
    @Expose
    private String RemoteWriteURL;

    /**
    * <p>0: 无鉴权 1: basic_auth 2: token</p>
    */
    @SerializedName("AuthType")
    @Expose
    private Long AuthType;

    /**
    * <p>鉴权信息</p>
    */
    @SerializedName("AuthInfo")
    @Expose
    private RemoteWriteAuthInfo AuthInfo;

    /**
    * <p>后端服务类型<br>-1 没有<br>0 CVM<br>1025 CLB</p>
    */
    @SerializedName("VirtualGatewayType")
    @Expose
    private Long VirtualGatewayType;

    /**
    * <p>云时序数据库实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>是否开启投递服务日志。1：关闭，2：开启。</p>
    */
    @SerializedName("HasServicesLog")
    @Expose
    private Long HasServicesLog;

    /**
     * Get <p>任务id</p> 
     * @return TaskId <p>任务id</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>任务id</p>
     * @param TaskId <p>任务id</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>日志主题id</p> 
     * @return TopicId <p>日志主题id</p>
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set <p>日志主题id</p>
     * @param TopicId <p>日志主题id</p>
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get <p>任务状态<br>0 关闭 1 开启</p> 
     * @return Enable <p>任务状态<br>0 关闭 1 开启</p>
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set <p>任务状态<br>0 关闭 1 开启</p>
     * @param Enable <p>任务状态<br>0 关闭 1 开启</p>
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get <p>RemoteWrite任务名称</p> 
     * @return Name <p>RemoteWrite任务名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>RemoteWrite任务名称</p>
     * @param Name <p>RemoteWrite任务名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>1 内网 2外网</p> 
     * @return NetType <p>1 内网 2外网</p>
     */
    public Long getNetType() {
        return this.NetType;
    }

    /**
     * Set <p>1 内网 2外网</p>
     * @param NetType <p>1 内网 2外网</p>
     */
    public void setNetType(Long NetType) {
        this.NetType = NetType;
    }

    /**
     * Get <p>私有网络id</p> 
     * @return VpcId <p>私有网络id</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>私有网络id</p>
     * @param VpcId <p>私有网络id</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>目标服务名称</p> 
     * @return Target <p>目标服务名称</p>
     */
    public String getTarget() {
        return this.Target;
    }

    /**
     * Set <p>目标服务名称</p>
     * @param Target <p>目标服务名称</p>
     */
    public void setTarget(String Target) {
        this.Target = Target;
    }

    /**
     * Get <p>目标地址</p> 
     * @return RemoteWriteURL <p>目标地址</p>
     */
    public String getRemoteWriteURL() {
        return this.RemoteWriteURL;
    }

    /**
     * Set <p>目标地址</p>
     * @param RemoteWriteURL <p>目标地址</p>
     */
    public void setRemoteWriteURL(String RemoteWriteURL) {
        this.RemoteWriteURL = RemoteWriteURL;
    }

    /**
     * Get <p>0: 无鉴权 1: basic_auth 2: token</p> 
     * @return AuthType <p>0: 无鉴权 1: basic_auth 2: token</p>
     */
    public Long getAuthType() {
        return this.AuthType;
    }

    /**
     * Set <p>0: 无鉴权 1: basic_auth 2: token</p>
     * @param AuthType <p>0: 无鉴权 1: basic_auth 2: token</p>
     */
    public void setAuthType(Long AuthType) {
        this.AuthType = AuthType;
    }

    /**
     * Get <p>鉴权信息</p> 
     * @return AuthInfo <p>鉴权信息</p>
     */
    public RemoteWriteAuthInfo getAuthInfo() {
        return this.AuthInfo;
    }

    /**
     * Set <p>鉴权信息</p>
     * @param AuthInfo <p>鉴权信息</p>
     */
    public void setAuthInfo(RemoteWriteAuthInfo AuthInfo) {
        this.AuthInfo = AuthInfo;
    }

    /**
     * Get <p>后端服务类型<br>-1 没有<br>0 CVM<br>1025 CLB</p> 
     * @return VirtualGatewayType <p>后端服务类型<br>-1 没有<br>0 CVM<br>1025 CLB</p>
     */
    public Long getVirtualGatewayType() {
        return this.VirtualGatewayType;
    }

    /**
     * Set <p>后端服务类型<br>-1 没有<br>0 CVM<br>1025 CLB</p>
     * @param VirtualGatewayType <p>后端服务类型<br>-1 没有<br>0 CVM<br>1025 CLB</p>
     */
    public void setVirtualGatewayType(Long VirtualGatewayType) {
        this.VirtualGatewayType = VirtualGatewayType;
    }

    /**
     * Get <p>云时序数据库实例ID</p> 
     * @return InstanceId <p>云时序数据库实例ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>云时序数据库实例ID</p>
     * @param InstanceId <p>云时序数据库实例ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>是否开启投递服务日志。1：关闭，2：开启。</p> 
     * @return HasServicesLog <p>是否开启投递服务日志。1：关闭，2：开启。</p>
     */
    public Long getHasServicesLog() {
        return this.HasServicesLog;
    }

    /**
     * Set <p>是否开启投递服务日志。1：关闭，2：开启。</p>
     * @param HasServicesLog <p>是否开启投递服务日志。1：关闭，2：开启。</p>
     */
    public void setHasServicesLog(Long HasServicesLog) {
        this.HasServicesLog = HasServicesLog;
    }

    public ModifyRemoteWriteTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRemoteWriteTaskRequest(ModifyRemoteWriteTaskRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.NetType != null) {
            this.NetType = new Long(source.NetType);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.Target != null) {
            this.Target = new String(source.Target);
        }
        if (source.RemoteWriteURL != null) {
            this.RemoteWriteURL = new String(source.RemoteWriteURL);
        }
        if (source.AuthType != null) {
            this.AuthType = new Long(source.AuthType);
        }
        if (source.AuthInfo != null) {
            this.AuthInfo = new RemoteWriteAuthInfo(source.AuthInfo);
        }
        if (source.VirtualGatewayType != null) {
            this.VirtualGatewayType = new Long(source.VirtualGatewayType);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.HasServicesLog != null) {
            this.HasServicesLog = new Long(source.HasServicesLog);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "NetType", this.NetType);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "Target", this.Target);
        this.setParamSimple(map, prefix + "RemoteWriteURL", this.RemoteWriteURL);
        this.setParamSimple(map, prefix + "AuthType", this.AuthType);
        this.setParamObj(map, prefix + "AuthInfo.", this.AuthInfo);
        this.setParamSimple(map, prefix + "VirtualGatewayType", this.VirtualGatewayType);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "HasServicesLog", this.HasServicesLog);

    }
}

