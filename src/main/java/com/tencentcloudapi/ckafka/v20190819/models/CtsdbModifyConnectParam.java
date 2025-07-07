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

public class CtsdbModifyConnectParam extends AbstractModel {

    /**
    * Ctsdb的连接port
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Ctsdb连接源的实例vip
    */
    @SerializedName("ServiceVip")
    @Expose
    private String ServiceVip;

    /**
    * Ctsdb连接源的vpcId
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * Ctsdb连接源的用户名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Ctsdb连接源的密码
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * Ctsdb连接源的实例资源
    */
    @SerializedName("Resource")
    @Expose
    private String Resource;

    /**
     * Get Ctsdb的连接port 
     * @return Port Ctsdb的连接port
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Ctsdb的连接port
     * @param Port Ctsdb的连接port
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Ctsdb连接源的实例vip 
     * @return ServiceVip Ctsdb连接源的实例vip
     */
    public String getServiceVip() {
        return this.ServiceVip;
    }

    /**
     * Set Ctsdb连接源的实例vip
     * @param ServiceVip Ctsdb连接源的实例vip
     */
    public void setServiceVip(String ServiceVip) {
        this.ServiceVip = ServiceVip;
    }

    /**
     * Get Ctsdb连接源的vpcId 
     * @return UniqVpcId Ctsdb连接源的vpcId
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set Ctsdb连接源的vpcId
     * @param UniqVpcId Ctsdb连接源的vpcId
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get Ctsdb连接源的用户名 
     * @return UserName Ctsdb连接源的用户名
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Ctsdb连接源的用户名
     * @param UserName Ctsdb连接源的用户名
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get Ctsdb连接源的密码 
     * @return Password Ctsdb连接源的密码
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Ctsdb连接源的密码
     * @param Password Ctsdb连接源的密码
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get Ctsdb连接源的实例资源 
     * @return Resource Ctsdb连接源的实例资源
     */
    public String getResource() {
        return this.Resource;
    }

    /**
     * Set Ctsdb连接源的实例资源
     * @param Resource Ctsdb连接源的实例资源
     */
    public void setResource(String Resource) {
        this.Resource = Resource;
    }

    public CtsdbModifyConnectParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CtsdbModifyConnectParam(CtsdbModifyConnectParam source) {
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
        if (source.Resource != null) {
            this.Resource = new String(source.Resource);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "ServiceVip", this.ServiceVip);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "Resource", this.Resource);

    }
}

