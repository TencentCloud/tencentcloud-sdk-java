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
    * 任务id
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 日志主题id
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 任务状态
0 关闭 1 开启
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * RemoteWrite任务名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 1 内网 2外网
    */
    @SerializedName("NetType")
    @Expose
    private Long NetType;

    /**
    * 私有网络id
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 目标服务名称
    */
    @SerializedName("Target")
    @Expose
    private String Target;

    /**
    * 目标地址
    */
    @SerializedName("RemoteWriteURL")
    @Expose
    private String RemoteWriteURL;

    /**
    * 0: 无鉴权 1: basic_auth 2: token	
    */
    @SerializedName("AuthType")
    @Expose
    private Long AuthType;

    /**
    * 鉴权信息
    */
    @SerializedName("AuthInfo")
    @Expose
    private RemoteWriteAuthInfo AuthInfo;

    /**
    * 后端服务类型
-1 没有
0 CVM
1025 CLB
    */
    @SerializedName("VirtualGatewayType")
    @Expose
    private Long VirtualGatewayType;

    /**
     * Get 任务id 
     * @return TaskId 任务id
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务id
     * @param TaskId 任务id
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 日志主题id 
     * @return TopicId 日志主题id
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 日志主题id
     * @param TopicId 日志主题id
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get 任务状态
0 关闭 1 开启 
     * @return Enable 任务状态
0 关闭 1 开启
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set 任务状态
0 关闭 1 开启
     * @param Enable 任务状态
0 关闭 1 开启
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get RemoteWrite任务名称 
     * @return Name RemoteWrite任务名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set RemoteWrite任务名称
     * @param Name RemoteWrite任务名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 1 内网 2外网 
     * @return NetType 1 内网 2外网
     */
    public Long getNetType() {
        return this.NetType;
    }

    /**
     * Set 1 内网 2外网
     * @param NetType 1 内网 2外网
     */
    public void setNetType(Long NetType) {
        this.NetType = NetType;
    }

    /**
     * Get 私有网络id 
     * @return VpcId 私有网络id
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络id
     * @param VpcId 私有网络id
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 目标服务名称 
     * @return Target 目标服务名称
     */
    public String getTarget() {
        return this.Target;
    }

    /**
     * Set 目标服务名称
     * @param Target 目标服务名称
     */
    public void setTarget(String Target) {
        this.Target = Target;
    }

    /**
     * Get 目标地址 
     * @return RemoteWriteURL 目标地址
     */
    public String getRemoteWriteURL() {
        return this.RemoteWriteURL;
    }

    /**
     * Set 目标地址
     * @param RemoteWriteURL 目标地址
     */
    public void setRemoteWriteURL(String RemoteWriteURL) {
        this.RemoteWriteURL = RemoteWriteURL;
    }

    /**
     * Get 0: 无鉴权 1: basic_auth 2: token	 
     * @return AuthType 0: 无鉴权 1: basic_auth 2: token	
     */
    public Long getAuthType() {
        return this.AuthType;
    }

    /**
     * Set 0: 无鉴权 1: basic_auth 2: token	
     * @param AuthType 0: 无鉴权 1: basic_auth 2: token	
     */
    public void setAuthType(Long AuthType) {
        this.AuthType = AuthType;
    }

    /**
     * Get 鉴权信息 
     * @return AuthInfo 鉴权信息
     */
    public RemoteWriteAuthInfo getAuthInfo() {
        return this.AuthInfo;
    }

    /**
     * Set 鉴权信息
     * @param AuthInfo 鉴权信息
     */
    public void setAuthInfo(RemoteWriteAuthInfo AuthInfo) {
        this.AuthInfo = AuthInfo;
    }

    /**
     * Get 后端服务类型
-1 没有
0 CVM
1025 CLB 
     * @return VirtualGatewayType 后端服务类型
-1 没有
0 CVM
1025 CLB
     */
    public Long getVirtualGatewayType() {
        return this.VirtualGatewayType;
    }

    /**
     * Set 后端服务类型
-1 没有
0 CVM
1025 CLB
     * @param VirtualGatewayType 后端服务类型
-1 没有
0 CVM
1025 CLB
     */
    public void setVirtualGatewayType(Long VirtualGatewayType) {
        this.VirtualGatewayType = VirtualGatewayType;
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

    }
}

