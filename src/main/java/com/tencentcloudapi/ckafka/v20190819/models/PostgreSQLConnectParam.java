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

public class PostgreSQLConnectParam extends AbstractModel {

    /**
    * PostgreSQL的连接port
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * PostgreSQL连接源的用户名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * PostgreSQL连接源的密码
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * PostgreSQL连接源的实例资源
    */
    @SerializedName("Resource")
    @Expose
    private String Resource;

    /**
    * PostgreSQL连接源的实例vip，当为腾讯云实例时，必填
    */
    @SerializedName("ServiceVip")
    @Expose
    private String ServiceVip;

    /**
    * PostgreSQL连接源的vpcId，当为腾讯云实例时，必填
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * 当type为TDSQL_C_POSTGRESQL时，必填
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 是否更新到关联的Datahub任务
    */
    @SerializedName("IsUpdate")
    @Expose
    private Boolean IsUpdate;

    /**
    * PostgreSQL连接源是否为自建集群
    */
    @SerializedName("SelfBuilt")
    @Expose
    private Boolean SelfBuilt;

    /**
     * Get PostgreSQL的连接port 
     * @return Port PostgreSQL的连接port
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set PostgreSQL的连接port
     * @param Port PostgreSQL的连接port
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get PostgreSQL连接源的用户名 
     * @return UserName PostgreSQL连接源的用户名
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set PostgreSQL连接源的用户名
     * @param UserName PostgreSQL连接源的用户名
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get PostgreSQL连接源的密码 
     * @return Password PostgreSQL连接源的密码
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set PostgreSQL连接源的密码
     * @param Password PostgreSQL连接源的密码
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get PostgreSQL连接源的实例资源 
     * @return Resource PostgreSQL连接源的实例资源
     */
    public String getResource() {
        return this.Resource;
    }

    /**
     * Set PostgreSQL连接源的实例资源
     * @param Resource PostgreSQL连接源的实例资源
     */
    public void setResource(String Resource) {
        this.Resource = Resource;
    }

    /**
     * Get PostgreSQL连接源的实例vip，当为腾讯云实例时，必填 
     * @return ServiceVip PostgreSQL连接源的实例vip，当为腾讯云实例时，必填
     */
    public String getServiceVip() {
        return this.ServiceVip;
    }

    /**
     * Set PostgreSQL连接源的实例vip，当为腾讯云实例时，必填
     * @param ServiceVip PostgreSQL连接源的实例vip，当为腾讯云实例时，必填
     */
    public void setServiceVip(String ServiceVip) {
        this.ServiceVip = ServiceVip;
    }

    /**
     * Get PostgreSQL连接源的vpcId，当为腾讯云实例时，必填 
     * @return UniqVpcId PostgreSQL连接源的vpcId，当为腾讯云实例时，必填
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set PostgreSQL连接源的vpcId，当为腾讯云实例时，必填
     * @param UniqVpcId PostgreSQL连接源的vpcId，当为腾讯云实例时，必填
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get 当type为TDSQL_C_POSTGRESQL时，必填 
     * @return ClusterId 当type为TDSQL_C_POSTGRESQL时，必填
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 当type为TDSQL_C_POSTGRESQL时，必填
     * @param ClusterId 当type为TDSQL_C_POSTGRESQL时，必填
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
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
     * Get PostgreSQL连接源是否为自建集群 
     * @return SelfBuilt PostgreSQL连接源是否为自建集群
     */
    public Boolean getSelfBuilt() {
        return this.SelfBuilt;
    }

    /**
     * Set PostgreSQL连接源是否为自建集群
     * @param SelfBuilt PostgreSQL连接源是否为自建集群
     */
    public void setSelfBuilt(Boolean SelfBuilt) {
        this.SelfBuilt = SelfBuilt;
    }

    public PostgreSQLConnectParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PostgreSQLConnectParam(PostgreSQLConnectParam source) {
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
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.IsUpdate != null) {
            this.IsUpdate = new Boolean(source.IsUpdate);
        }
        if (source.SelfBuilt != null) {
            this.SelfBuilt = new Boolean(source.SelfBuilt);
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
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "IsUpdate", this.IsUpdate);
        this.setParamSimple(map, prefix + "SelfBuilt", this.SelfBuilt);

    }
}

