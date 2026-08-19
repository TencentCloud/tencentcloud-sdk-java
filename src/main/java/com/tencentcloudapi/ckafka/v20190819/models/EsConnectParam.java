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

public class EsConnectParam extends AbstractModel {

    /**
    * <p>Es的连接port</p>
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * <p>Es连接源的用户名</p>
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * <p>Es连接源的密码</p>
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * <p>Es连接源的实例资源</p>
    */
    @SerializedName("Resource")
    @Expose
    private String Resource;

    /**
    * <p>Es连接源是否为自建集群</p>
    */
    @SerializedName("SelfBuilt")
    @Expose
    private Boolean SelfBuilt;

    /**
    * <p>Es连接源的实例vip，当为腾讯云实例时，必填</p>
    */
    @SerializedName("ServiceVip")
    @Expose
    private String ServiceVip;

    /**
    * <p>Es连接源的vpcId，当为腾讯云实例时，必填</p>
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * <p>是否更新到关联的Datahub任务</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsUpdate")
    @Expose
    private Boolean IsUpdate;

    /**
    * <p>es类型</p><p>枚举值：</p><ul><li>CLUSTER： 普通集群es</li><li>SERVERLESS： serverless形态es</li></ul>
    */
    @SerializedName("EsType")
    @Expose
    private String EsType;

    /**
    * <p>es版本</p><p>默认值：7.14.2</p>
    */
    @SerializedName("EsVersion")
    @Expose
    private String EsVersion;

    /**
    * <p>endpointUrl，es的serverless版本的访问入口地址</p>
    */
    @SerializedName("EndpointUrl")
    @Expose
    private String EndpointUrl;

    /**
    * <p>集群版 ES 连接协议，默认http协议</p><p>枚举值：</p><ul><li>http： http协议</li><li>https： https协议</li></ul>
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
     * Get <p>Es的连接port</p> 
     * @return Port <p>Es的连接port</p>
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set <p>Es的连接port</p>
     * @param Port <p>Es的连接port</p>
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get <p>Es连接源的用户名</p> 
     * @return UserName <p>Es连接源的用户名</p>
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set <p>Es连接源的用户名</p>
     * @param UserName <p>Es连接源的用户名</p>
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get <p>Es连接源的密码</p> 
     * @return Password <p>Es连接源的密码</p>
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set <p>Es连接源的密码</p>
     * @param Password <p>Es连接源的密码</p>
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get <p>Es连接源的实例资源</p> 
     * @return Resource <p>Es连接源的实例资源</p>
     */
    public String getResource() {
        return this.Resource;
    }

    /**
     * Set <p>Es连接源的实例资源</p>
     * @param Resource <p>Es连接源的实例资源</p>
     */
    public void setResource(String Resource) {
        this.Resource = Resource;
    }

    /**
     * Get <p>Es连接源是否为自建集群</p> 
     * @return SelfBuilt <p>Es连接源是否为自建集群</p>
     */
    public Boolean getSelfBuilt() {
        return this.SelfBuilt;
    }

    /**
     * Set <p>Es连接源是否为自建集群</p>
     * @param SelfBuilt <p>Es连接源是否为自建集群</p>
     */
    public void setSelfBuilt(Boolean SelfBuilt) {
        this.SelfBuilt = SelfBuilt;
    }

    /**
     * Get <p>Es连接源的实例vip，当为腾讯云实例时，必填</p> 
     * @return ServiceVip <p>Es连接源的实例vip，当为腾讯云实例时，必填</p>
     */
    public String getServiceVip() {
        return this.ServiceVip;
    }

    /**
     * Set <p>Es连接源的实例vip，当为腾讯云实例时，必填</p>
     * @param ServiceVip <p>Es连接源的实例vip，当为腾讯云实例时，必填</p>
     */
    public void setServiceVip(String ServiceVip) {
        this.ServiceVip = ServiceVip;
    }

    /**
     * Get <p>Es连接源的vpcId，当为腾讯云实例时，必填</p> 
     * @return UniqVpcId <p>Es连接源的vpcId，当为腾讯云实例时，必填</p>
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set <p>Es连接源的vpcId，当为腾讯云实例时，必填</p>
     * @param UniqVpcId <p>Es连接源的vpcId，当为腾讯云实例时，必填</p>
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get <p>是否更新到关联的Datahub任务</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsUpdate <p>是否更新到关联的Datahub任务</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsUpdate() {
        return this.IsUpdate;
    }

    /**
     * Set <p>是否更新到关联的Datahub任务</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsUpdate <p>是否更新到关联的Datahub任务</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsUpdate(Boolean IsUpdate) {
        this.IsUpdate = IsUpdate;
    }

    /**
     * Get <p>es类型</p><p>枚举值：</p><ul><li>CLUSTER： 普通集群es</li><li>SERVERLESS： serverless形态es</li></ul> 
     * @return EsType <p>es类型</p><p>枚举值：</p><ul><li>CLUSTER： 普通集群es</li><li>SERVERLESS： serverless形态es</li></ul>
     */
    public String getEsType() {
        return this.EsType;
    }

    /**
     * Set <p>es类型</p><p>枚举值：</p><ul><li>CLUSTER： 普通集群es</li><li>SERVERLESS： serverless形态es</li></ul>
     * @param EsType <p>es类型</p><p>枚举值：</p><ul><li>CLUSTER： 普通集群es</li><li>SERVERLESS： serverless形态es</li></ul>
     */
    public void setEsType(String EsType) {
        this.EsType = EsType;
    }

    /**
     * Get <p>es版本</p><p>默认值：7.14.2</p> 
     * @return EsVersion <p>es版本</p><p>默认值：7.14.2</p>
     */
    public String getEsVersion() {
        return this.EsVersion;
    }

    /**
     * Set <p>es版本</p><p>默认值：7.14.2</p>
     * @param EsVersion <p>es版本</p><p>默认值：7.14.2</p>
     */
    public void setEsVersion(String EsVersion) {
        this.EsVersion = EsVersion;
    }

    /**
     * Get <p>endpointUrl，es的serverless版本的访问入口地址</p> 
     * @return EndpointUrl <p>endpointUrl，es的serverless版本的访问入口地址</p>
     */
    public String getEndpointUrl() {
        return this.EndpointUrl;
    }

    /**
     * Set <p>endpointUrl，es的serverless版本的访问入口地址</p>
     * @param EndpointUrl <p>endpointUrl，es的serverless版本的访问入口地址</p>
     */
    public void setEndpointUrl(String EndpointUrl) {
        this.EndpointUrl = EndpointUrl;
    }

    /**
     * Get <p>集群版 ES 连接协议，默认http协议</p><p>枚举值：</p><ul><li>http： http协议</li><li>https： https协议</li></ul> 
     * @return Protocol <p>集群版 ES 连接协议，默认http协议</p><p>枚举值：</p><ul><li>http： http协议</li><li>https： https协议</li></ul>
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set <p>集群版 ES 连接协议，默认http协议</p><p>枚举值：</p><ul><li>http： http协议</li><li>https： https协议</li></ul>
     * @param Protocol <p>集群版 ES 连接协议，默认http协议</p><p>枚举值：</p><ul><li>http： http协议</li><li>https： https协议</li></ul>
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    public EsConnectParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EsConnectParam(EsConnectParam source) {
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
        if (source.SelfBuilt != null) {
            this.SelfBuilt = new Boolean(source.SelfBuilt);
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
        if (source.EsType != null) {
            this.EsType = new String(source.EsType);
        }
        if (source.EsVersion != null) {
            this.EsVersion = new String(source.EsVersion);
        }
        if (source.EndpointUrl != null) {
            this.EndpointUrl = new String(source.EndpointUrl);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
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
        this.setParamSimple(map, prefix + "SelfBuilt", this.SelfBuilt);
        this.setParamSimple(map, prefix + "ServiceVip", this.ServiceVip);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "IsUpdate", this.IsUpdate);
        this.setParamSimple(map, prefix + "EsType", this.EsType);
        this.setParamSimple(map, prefix + "EsVersion", this.EsVersion);
        this.setParamSimple(map, prefix + "EndpointUrl", this.EndpointUrl);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);

    }
}

