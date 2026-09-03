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

public class CreateRemoteWriteTaskRequest extends AbstractModel {

    /**
    * <p>日志主题 ID</p>
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * <p>任务名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

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
    * <p>鉴权类型<br>0: 无鉴权<br>1: basic_auth<br>2: token</p>
    */
    @SerializedName("AuthType")
    @Expose
    private Long AuthType;

    /**
    * <p>网络类型： 1 内网 2外网</p>
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
    * <p>鉴权信息</p>
    */
    @SerializedName("AuthInfo")
    @Expose
    private RemoteWriteAuthInfo AuthInfo;

    /**
    * <p>后端服务类型<br>0 CVM<br>1025 CLB</p>
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
    * <p>是否开启投递服务日志。1：关闭，2：开启。 默认值：2</p>
    */
    @SerializedName("HasServicesLog")
    @Expose
    private Long HasServicesLog;

    /**
     * Get <p>日志主题 ID</p> 
     * @return TopicId <p>日志主题 ID</p>
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set <p>日志主题 ID</p>
     * @param TopicId <p>日志主题 ID</p>
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get <p>任务名称</p> 
     * @return Name <p>任务名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>任务名称</p>
     * @param Name <p>任务名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
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
     * Get <p>鉴权类型<br>0: 无鉴权<br>1: basic_auth<br>2: token</p> 
     * @return AuthType <p>鉴权类型<br>0: 无鉴权<br>1: basic_auth<br>2: token</p>
     */
    public Long getAuthType() {
        return this.AuthType;
    }

    /**
     * Set <p>鉴权类型<br>0: 无鉴权<br>1: basic_auth<br>2: token</p>
     * @param AuthType <p>鉴权类型<br>0: 无鉴权<br>1: basic_auth<br>2: token</p>
     */
    public void setAuthType(Long AuthType) {
        this.AuthType = AuthType;
    }

    /**
     * Get <p>网络类型： 1 内网 2外网</p> 
     * @return NetType <p>网络类型： 1 内网 2外网</p>
     */
    public Long getNetType() {
        return this.NetType;
    }

    /**
     * Set <p>网络类型： 1 内网 2外网</p>
     * @param NetType <p>网络类型： 1 内网 2外网</p>
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
     * Get <p>后端服务类型<br>0 CVM<br>1025 CLB</p> 
     * @return VirtualGatewayType <p>后端服务类型<br>0 CVM<br>1025 CLB</p>
     */
    public Long getVirtualGatewayType() {
        return this.VirtualGatewayType;
    }

    /**
     * Set <p>后端服务类型<br>0 CVM<br>1025 CLB</p>
     * @param VirtualGatewayType <p>后端服务类型<br>0 CVM<br>1025 CLB</p>
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
     * Get <p>是否开启投递服务日志。1：关闭，2：开启。 默认值：2</p> 
     * @return HasServicesLog <p>是否开启投递服务日志。1：关闭，2：开启。 默认值：2</p>
     */
    public Long getHasServicesLog() {
        return this.HasServicesLog;
    }

    /**
     * Set <p>是否开启投递服务日志。1：关闭，2：开启。 默认值：2</p>
     * @param HasServicesLog <p>是否开启投递服务日志。1：关闭，2：开启。 默认值：2</p>
     */
    public void setHasServicesLog(Long HasServicesLog) {
        this.HasServicesLog = HasServicesLog;
    }

    public CreateRemoteWriteTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRemoteWriteTaskRequest(CreateRemoteWriteTaskRequest source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
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
        if (source.NetType != null) {
            this.NetType = new Long(source.NetType);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
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
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Target", this.Target);
        this.setParamSimple(map, prefix + "RemoteWriteURL", this.RemoteWriteURL);
        this.setParamSimple(map, prefix + "AuthType", this.AuthType);
        this.setParamSimple(map, prefix + "NetType", this.NetType);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamObj(map, prefix + "AuthInfo.", this.AuthInfo);
        this.setParamSimple(map, prefix + "VirtualGatewayType", this.VirtualGatewayType);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "HasServicesLog", this.HasServicesLog);

    }
}

