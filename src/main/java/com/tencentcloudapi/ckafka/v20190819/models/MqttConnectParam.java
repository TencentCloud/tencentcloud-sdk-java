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

public class MqttConnectParam extends AbstractModel {

    /**
    * MQTT连接源的用户名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * MQTT连接源的密码
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * MQTT连接源的实例资源
    */
    @SerializedName("Resource")
    @Expose
    private String Resource;

    /**
    * MQTT Instance vpc-id
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * 是否为自建集群
    */
    @SerializedName("SelfBuilt")
    @Expose
    private Boolean SelfBuilt;

    /**
    * 是否更新到关联的Dip任务
    */
    @SerializedName("IsUpdate")
    @Expose
    private Boolean IsUpdate;

    /**
    * MQTT连接源的实例资源地域, 跨地域时必填
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
     * Get MQTT连接源的用户名 
     * @return UserName MQTT连接源的用户名
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set MQTT连接源的用户名
     * @param UserName MQTT连接源的用户名
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get MQTT连接源的密码 
     * @return Password MQTT连接源的密码
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set MQTT连接源的密码
     * @param Password MQTT连接源的密码
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get MQTT连接源的实例资源 
     * @return Resource MQTT连接源的实例资源
     */
    public String getResource() {
        return this.Resource;
    }

    /**
     * Set MQTT连接源的实例资源
     * @param Resource MQTT连接源的实例资源
     */
    public void setResource(String Resource) {
        this.Resource = Resource;
    }

    /**
     * Get MQTT Instance vpc-id 
     * @return UniqVpcId MQTT Instance vpc-id
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set MQTT Instance vpc-id
     * @param UniqVpcId MQTT Instance vpc-id
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get 是否为自建集群 
     * @return SelfBuilt 是否为自建集群
     */
    public Boolean getSelfBuilt() {
        return this.SelfBuilt;
    }

    /**
     * Set 是否为自建集群
     * @param SelfBuilt 是否为自建集群
     */
    public void setSelfBuilt(Boolean SelfBuilt) {
        this.SelfBuilt = SelfBuilt;
    }

    /**
     * Get 是否更新到关联的Dip任务 
     * @return IsUpdate 是否更新到关联的Dip任务
     */
    public Boolean getIsUpdate() {
        return this.IsUpdate;
    }

    /**
     * Set 是否更新到关联的Dip任务
     * @param IsUpdate 是否更新到关联的Dip任务
     */
    public void setIsUpdate(Boolean IsUpdate) {
        this.IsUpdate = IsUpdate;
    }

    /**
     * Get MQTT连接源的实例资源地域, 跨地域时必填 
     * @return Region MQTT连接源的实例资源地域, 跨地域时必填
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set MQTT连接源的实例资源地域, 跨地域时必填
     * @param Region MQTT连接源的实例资源地域, 跨地域时必填
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    public MqttConnectParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MqttConnectParam(MqttConnectParam source) {
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.Resource != null) {
            this.Resource = new String(source.Resource);
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.SelfBuilt != null) {
            this.SelfBuilt = new Boolean(source.SelfBuilt);
        }
        if (source.IsUpdate != null) {
            this.IsUpdate = new Boolean(source.IsUpdate);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "Resource", this.Resource);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "SelfBuilt", this.SelfBuilt);
        this.setParamSimple(map, prefix + "IsUpdate", this.IsUpdate);
        this.setParamSimple(map, prefix + "Region", this.Region);

    }
}

