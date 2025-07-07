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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DorisConnectParam extends AbstractModel {

    /**
    * Doris jdbc 负载均衡连接 port，通常映射到 fe 的 9030 端口
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Doris 连接源的用户名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Doris 连接源的密码
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * Doris 连接源的实例资源
    */
    @SerializedName("Resource")
    @Expose
    private String Resource;

    /**
    * Doris 连接源的实例vip，当为腾讯云实例时，必填
    */
    @SerializedName("ServiceVip")
    @Expose
    private String ServiceVip;

    /**
    * Doris 连接源的vpcId，当为腾讯云实例时，必填
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * 是否更新到关联的Datahub任务
    */
    @SerializedName("IsUpdate")
    @Expose
    private Boolean IsUpdate;

    /**
    * Doris 连接源是否为自建集群
    */
    @SerializedName("SelfBuilt")
    @Expose
    private Boolean SelfBuilt;

    /**
    * Doris 的 http 负载均衡连接 port，通常映射到 be 的 8040 端口
    */
    @SerializedName("BePort")
    @Expose
    private Long BePort;

    /**
     * Get Doris jdbc 负载均衡连接 port，通常映射到 fe 的 9030 端口 
     * @return Port Doris jdbc 负载均衡连接 port，通常映射到 fe 的 9030 端口
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Doris jdbc 负载均衡连接 port，通常映射到 fe 的 9030 端口
     * @param Port Doris jdbc 负载均衡连接 port，通常映射到 fe 的 9030 端口
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Doris 连接源的用户名 
     * @return UserName Doris 连接源的用户名
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Doris 连接源的用户名
     * @param UserName Doris 连接源的用户名
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get Doris 连接源的密码 
     * @return Password Doris 连接源的密码
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Doris 连接源的密码
     * @param Password Doris 连接源的密码
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get Doris 连接源的实例资源 
     * @return Resource Doris 连接源的实例资源
     */
    public String getResource() {
        return this.Resource;
    }

    /**
     * Set Doris 连接源的实例资源
     * @param Resource Doris 连接源的实例资源
     */
    public void setResource(String Resource) {
        this.Resource = Resource;
    }

    /**
     * Get Doris 连接源的实例vip，当为腾讯云实例时，必填 
     * @return ServiceVip Doris 连接源的实例vip，当为腾讯云实例时，必填
     */
    public String getServiceVip() {
        return this.ServiceVip;
    }

    /**
     * Set Doris 连接源的实例vip，当为腾讯云实例时，必填
     * @param ServiceVip Doris 连接源的实例vip，当为腾讯云实例时，必填
     */
    public void setServiceVip(String ServiceVip) {
        this.ServiceVip = ServiceVip;
    }

    /**
     * Get Doris 连接源的vpcId，当为腾讯云实例时，必填 
     * @return UniqVpcId Doris 连接源的vpcId，当为腾讯云实例时，必填
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set Doris 连接源的vpcId，当为腾讯云实例时，必填
     * @param UniqVpcId Doris 连接源的vpcId，当为腾讯云实例时，必填
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get 是否更新到关联的Datahub任务 
     * @return IsUpdate 是否更新到关联的Datahub任务
     */
    public Boolean getIsUpdate() {
        return this.IsUpdate;
    }

    /**
     * Set 是否更新到关联的Datahub任务
     * @param IsUpdate 是否更新到关联的Datahub任务
     */
    public void setIsUpdate(Boolean IsUpdate) {
        this.IsUpdate = IsUpdate;
    }

    /**
     * Get Doris 连接源是否为自建集群 
     * @return SelfBuilt Doris 连接源是否为自建集群
     */
    public Boolean getSelfBuilt() {
        return this.SelfBuilt;
    }

    /**
     * Set Doris 连接源是否为自建集群
     * @param SelfBuilt Doris 连接源是否为自建集群
     */
    public void setSelfBuilt(Boolean SelfBuilt) {
        this.SelfBuilt = SelfBuilt;
    }

    /**
     * Get Doris 的 http 负载均衡连接 port，通常映射到 be 的 8040 端口 
     * @return BePort Doris 的 http 负载均衡连接 port，通常映射到 be 的 8040 端口
     */
    public Long getBePort() {
        return this.BePort;
    }

    /**
     * Set Doris 的 http 负载均衡连接 port，通常映射到 be 的 8040 端口
     * @param BePort Doris 的 http 负载均衡连接 port，通常映射到 be 的 8040 端口
     */
    public void setBePort(Long BePort) {
        this.BePort = BePort;
    }

    public DorisConnectParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DorisConnectParam(DorisConnectParam source) {
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.Resource != null) {
            this.Resource = new String(source.Resource);
        }
        if (source.ServiceVip != null) {
            this.ServiceVip = new String(source.ServiceVip);
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.IsUpdate != null) {
            this.IsUpdate = new Boolean(source.IsUpdate);
        }
        if (source.SelfBuilt != null) {
            this.SelfBuilt = new Boolean(source.SelfBuilt);
        }
        if (source.BePort != null) {
            this.BePort = new Long(source.BePort);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "Resource", this.Resource);
        this.setParamSimple(map, prefix + "ServiceVip", this.ServiceVip);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "IsUpdate", this.IsUpdate);
        this.setParamSimple(map, prefix + "SelfBuilt", this.SelfBuilt);
        this.setParamSimple(map, prefix + "BePort", this.BePort);

    }
}

