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

public class MySQLModifyConnectParam extends AbstractModel {

    /**
    * MySQL连接源的实例资源【不支持修改】
    */
    @SerializedName("Resource")
    @Expose
    private String Resource;

    /**
    * MySQL的连接port【不支持修改】
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * MySQL连接源的实例vip【不支持修改】
    */
    @SerializedName("ServiceVip")
    @Expose
    private String ServiceVip;

    /**
    * MySQL连接源的vpcId【不支持修改】
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * MySQL连接源的用户名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * MySQL连接源的密码
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 是否更新到关联的Datahub任务
    */
    @SerializedName("IsUpdate")
    @Expose
    private Boolean IsUpdate;

    /**
    * 当type为TDSQL_C_MYSQL时
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 是否是自建的集群
    */
    @SerializedName("SelfBuilt")
    @Expose
    private Boolean SelfBuilt;

    /**
     * Get MySQL连接源的实例资源【不支持修改】 
     * @return Resource MySQL连接源的实例资源【不支持修改】
     */
    public String getResource() {
        return this.Resource;
    }

    /**
     * Set MySQL连接源的实例资源【不支持修改】
     * @param Resource MySQL连接源的实例资源【不支持修改】
     */
    public void setResource(String Resource) {
        this.Resource = Resource;
    }

    /**
     * Get MySQL的连接port【不支持修改】 
     * @return Port MySQL的连接port【不支持修改】
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set MySQL的连接port【不支持修改】
     * @param Port MySQL的连接port【不支持修改】
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get MySQL连接源的实例vip【不支持修改】 
     * @return ServiceVip MySQL连接源的实例vip【不支持修改】
     */
    public String getServiceVip() {
        return this.ServiceVip;
    }

    /**
     * Set MySQL连接源的实例vip【不支持修改】
     * @param ServiceVip MySQL连接源的实例vip【不支持修改】
     */
    public void setServiceVip(String ServiceVip) {
        this.ServiceVip = ServiceVip;
    }

    /**
     * Get MySQL连接源的vpcId【不支持修改】 
     * @return UniqVpcId MySQL连接源的vpcId【不支持修改】
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set MySQL连接源的vpcId【不支持修改】
     * @param UniqVpcId MySQL连接源的vpcId【不支持修改】
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get MySQL连接源的用户名 
     * @return UserName MySQL连接源的用户名
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set MySQL连接源的用户名
     * @param UserName MySQL连接源的用户名
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get MySQL连接源的密码 
     * @return Password MySQL连接源的密码
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set MySQL连接源的密码
     * @param Password MySQL连接源的密码
     */
    public void setPassword(String Password) {
        this.Password = Password;
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
     * Get 当type为TDSQL_C_MYSQL时 
     * @return ClusterId 当type为TDSQL_C_MYSQL时
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 当type为TDSQL_C_MYSQL时
     * @param ClusterId 当type为TDSQL_C_MYSQL时
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 是否是自建的集群 
     * @return SelfBuilt 是否是自建的集群
     */
    public Boolean getSelfBuilt() {
        return this.SelfBuilt;
    }

    /**
     * Set 是否是自建的集群
     * @param SelfBuilt 是否是自建的集群
     */
    public void setSelfBuilt(Boolean SelfBuilt) {
        this.SelfBuilt = SelfBuilt;
    }

    public MySQLModifyConnectParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MySQLModifyConnectParam(MySQLModifyConnectParam source) {
        if (source.Resource != null) {
            this.Resource = new String(source.Resource);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.ServiceVip != null) {
            this.ServiceVip = new String(source.ServiceVip);
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.IsUpdate != null) {
            this.IsUpdate = new Boolean(source.IsUpdate);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.SelfBuilt != null) {
            this.SelfBuilt = new Boolean(source.SelfBuilt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Resource", this.Resource);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "ServiceVip", this.ServiceVip);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "IsUpdate", this.IsUpdate);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "SelfBuilt", this.SelfBuilt);

    }
}

