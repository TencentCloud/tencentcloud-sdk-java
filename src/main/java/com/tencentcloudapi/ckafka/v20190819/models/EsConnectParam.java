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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EsConnectParam extends AbstractModel {

    /**
    * Es的连接port
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Es连接源的用户名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Es连接源的密码
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * Es连接源的实例资源
    */
    @SerializedName("Resource")
    @Expose
    private String Resource;

    /**
    * Es连接源是否为自建集群
    */
    @SerializedName("SelfBuilt")
    @Expose
    private Boolean SelfBuilt;

    /**
    * Es连接源的实例vip，当为腾讯云实例时，必填
    */
    @SerializedName("ServiceVip")
    @Expose
    private String ServiceVip;

    /**
    * Es连接源的vpcId，当为腾讯云实例时，必填
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * 是否更新到关联的Datahub任务
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsUpdate")
    @Expose
    private Boolean IsUpdate;

    /**
     * Get Es的连接port 
     * @return Port Es的连接port
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Es的连接port
     * @param Port Es的连接port
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Es连接源的用户名 
     * @return UserName Es连接源的用户名
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Es连接源的用户名
     * @param UserName Es连接源的用户名
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get Es连接源的密码 
     * @return Password Es连接源的密码
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Es连接源的密码
     * @param Password Es连接源的密码
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get Es连接源的实例资源 
     * @return Resource Es连接源的实例资源
     */
    public String getResource() {
        return this.Resource;
    }

    /**
     * Set Es连接源的实例资源
     * @param Resource Es连接源的实例资源
     */
    public void setResource(String Resource) {
        this.Resource = Resource;
    }

    /**
     * Get Es连接源是否为自建集群 
     * @return SelfBuilt Es连接源是否为自建集群
     */
    public Boolean getSelfBuilt() {
        return this.SelfBuilt;
    }

    /**
     * Set Es连接源是否为自建集群
     * @param SelfBuilt Es连接源是否为自建集群
     */
    public void setSelfBuilt(Boolean SelfBuilt) {
        this.SelfBuilt = SelfBuilt;
    }

    /**
     * Get Es连接源的实例vip，当为腾讯云实例时，必填 
     * @return ServiceVip Es连接源的实例vip，当为腾讯云实例时，必填
     */
    public String getServiceVip() {
        return this.ServiceVip;
    }

    /**
     * Set Es连接源的实例vip，当为腾讯云实例时，必填
     * @param ServiceVip Es连接源的实例vip，当为腾讯云实例时，必填
     */
    public void setServiceVip(String ServiceVip) {
        this.ServiceVip = ServiceVip;
    }

    /**
     * Get Es连接源的vpcId，当为腾讯云实例时，必填 
     * @return UniqVpcId Es连接源的vpcId，当为腾讯云实例时，必填
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set Es连接源的vpcId，当为腾讯云实例时，必填
     * @param UniqVpcId Es连接源的vpcId，当为腾讯云实例时，必填
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get 是否更新到关联的Datahub任务
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsUpdate 是否更新到关联的Datahub任务
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsUpdate() {
        return this.IsUpdate;
    }

    /**
     * Set 是否更新到关联的Datahub任务
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsUpdate 是否更新到关联的Datahub任务
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsUpdate(Boolean IsUpdate) {
        this.IsUpdate = IsUpdate;
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

    }
}

