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
package com.tencentcloudapi.apis.v20240801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AgentAppServiceVO extends AbstractModel {

    /**
    * <p>ID</p>
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * <p>应用ID</p>
    */
    @SerializedName("AgentAppID")
    @Expose
    private String AgentAppID;

    /**
    * <p>服务ID</p>
    */
    @SerializedName("ServiceID")
    @Expose
    private String ServiceID;

    /**
    * <p>是否限流</p>
    */
    @SerializedName("InvokeLimitConfigStatus")
    @Expose
    private Boolean InvokeLimitConfigStatus;

    /**
    * <p>限流配置</p>
    */
    @SerializedName("InvokeLimitConfig")
    @Expose
    private InvokeLimitConfigDTO InvokeLimitConfig;

    /**
    * <p>服务详情</p>
    */
    @SerializedName("ServiceVO")
    @Expose
    private ServiceVO ServiceVO;

    /**
    * <p>关联时间</p>
    */
    @SerializedName("RelateTime")
    @Expose
    private String RelateTime;

    /**
    * <p>是否需要认证</p>
    */
    @SerializedName("NeedAuth")
    @Expose
    private Boolean NeedAuth;

    /**
    * <p>凭据ID</p>
    */
    @SerializedName("AgentCredentialID")
    @Expose
    private String AgentCredentialID;

    /**
    * <p>凭据详情</p>
    */
    @SerializedName("AgentCredentialVO")
    @Expose
    private DescribeAgentCredentialResp AgentCredentialVO;

    /**
     * Get <p>ID</p> 
     * @return ID <p>ID</p>
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set <p>ID</p>
     * @param ID <p>ID</p>
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get <p>应用ID</p> 
     * @return AgentAppID <p>应用ID</p>
     */
    public String getAgentAppID() {
        return this.AgentAppID;
    }

    /**
     * Set <p>应用ID</p>
     * @param AgentAppID <p>应用ID</p>
     */
    public void setAgentAppID(String AgentAppID) {
        this.AgentAppID = AgentAppID;
    }

    /**
     * Get <p>服务ID</p> 
     * @return ServiceID <p>服务ID</p>
     */
    public String getServiceID() {
        return this.ServiceID;
    }

    /**
     * Set <p>服务ID</p>
     * @param ServiceID <p>服务ID</p>
     */
    public void setServiceID(String ServiceID) {
        this.ServiceID = ServiceID;
    }

    /**
     * Get <p>是否限流</p> 
     * @return InvokeLimitConfigStatus <p>是否限流</p>
     */
    public Boolean getInvokeLimitConfigStatus() {
        return this.InvokeLimitConfigStatus;
    }

    /**
     * Set <p>是否限流</p>
     * @param InvokeLimitConfigStatus <p>是否限流</p>
     */
    public void setInvokeLimitConfigStatus(Boolean InvokeLimitConfigStatus) {
        this.InvokeLimitConfigStatus = InvokeLimitConfigStatus;
    }

    /**
     * Get <p>限流配置</p> 
     * @return InvokeLimitConfig <p>限流配置</p>
     */
    public InvokeLimitConfigDTO getInvokeLimitConfig() {
        return this.InvokeLimitConfig;
    }

    /**
     * Set <p>限流配置</p>
     * @param InvokeLimitConfig <p>限流配置</p>
     */
    public void setInvokeLimitConfig(InvokeLimitConfigDTO InvokeLimitConfig) {
        this.InvokeLimitConfig = InvokeLimitConfig;
    }

    /**
     * Get <p>服务详情</p> 
     * @return ServiceVO <p>服务详情</p>
     */
    public ServiceVO getServiceVO() {
        return this.ServiceVO;
    }

    /**
     * Set <p>服务详情</p>
     * @param ServiceVO <p>服务详情</p>
     */
    public void setServiceVO(ServiceVO ServiceVO) {
        this.ServiceVO = ServiceVO;
    }

    /**
     * Get <p>关联时间</p> 
     * @return RelateTime <p>关联时间</p>
     */
    public String getRelateTime() {
        return this.RelateTime;
    }

    /**
     * Set <p>关联时间</p>
     * @param RelateTime <p>关联时间</p>
     */
    public void setRelateTime(String RelateTime) {
        this.RelateTime = RelateTime;
    }

    /**
     * Get <p>是否需要认证</p> 
     * @return NeedAuth <p>是否需要认证</p>
     */
    public Boolean getNeedAuth() {
        return this.NeedAuth;
    }

    /**
     * Set <p>是否需要认证</p>
     * @param NeedAuth <p>是否需要认证</p>
     */
    public void setNeedAuth(Boolean NeedAuth) {
        this.NeedAuth = NeedAuth;
    }

    /**
     * Get <p>凭据ID</p> 
     * @return AgentCredentialID <p>凭据ID</p>
     */
    public String getAgentCredentialID() {
        return this.AgentCredentialID;
    }

    /**
     * Set <p>凭据ID</p>
     * @param AgentCredentialID <p>凭据ID</p>
     */
    public void setAgentCredentialID(String AgentCredentialID) {
        this.AgentCredentialID = AgentCredentialID;
    }

    /**
     * Get <p>凭据详情</p> 
     * @return AgentCredentialVO <p>凭据详情</p>
     */
    public DescribeAgentCredentialResp getAgentCredentialVO() {
        return this.AgentCredentialVO;
    }

    /**
     * Set <p>凭据详情</p>
     * @param AgentCredentialVO <p>凭据详情</p>
     */
    public void setAgentCredentialVO(DescribeAgentCredentialResp AgentCredentialVO) {
        this.AgentCredentialVO = AgentCredentialVO;
    }

    public AgentAppServiceVO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentAppServiceVO(AgentAppServiceVO source) {
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
        if (source.AgentAppID != null) {
            this.AgentAppID = new String(source.AgentAppID);
        }
        if (source.ServiceID != null) {
            this.ServiceID = new String(source.ServiceID);
        }
        if (source.InvokeLimitConfigStatus != null) {
            this.InvokeLimitConfigStatus = new Boolean(source.InvokeLimitConfigStatus);
        }
        if (source.InvokeLimitConfig != null) {
            this.InvokeLimitConfig = new InvokeLimitConfigDTO(source.InvokeLimitConfig);
        }
        if (source.ServiceVO != null) {
            this.ServiceVO = new ServiceVO(source.ServiceVO);
        }
        if (source.RelateTime != null) {
            this.RelateTime = new String(source.RelateTime);
        }
        if (source.NeedAuth != null) {
            this.NeedAuth = new Boolean(source.NeedAuth);
        }
        if (source.AgentCredentialID != null) {
            this.AgentCredentialID = new String(source.AgentCredentialID);
        }
        if (source.AgentCredentialVO != null) {
            this.AgentCredentialVO = new DescribeAgentCredentialResp(source.AgentCredentialVO);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "AgentAppID", this.AgentAppID);
        this.setParamSimple(map, prefix + "ServiceID", this.ServiceID);
        this.setParamSimple(map, prefix + "InvokeLimitConfigStatus", this.InvokeLimitConfigStatus);
        this.setParamObj(map, prefix + "InvokeLimitConfig.", this.InvokeLimitConfig);
        this.setParamObj(map, prefix + "ServiceVO.", this.ServiceVO);
        this.setParamSimple(map, prefix + "RelateTime", this.RelateTime);
        this.setParamSimple(map, prefix + "NeedAuth", this.NeedAuth);
        this.setParamSimple(map, prefix + "AgentCredentialID", this.AgentCredentialID);
        this.setParamObj(map, prefix + "AgentCredentialVO.", this.AgentCredentialVO);

    }
}

