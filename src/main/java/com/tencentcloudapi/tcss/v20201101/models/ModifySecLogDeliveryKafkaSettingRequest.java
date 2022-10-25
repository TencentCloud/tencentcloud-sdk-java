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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifySecLogDeliveryKafkaSettingRequest extends AbstractModel{

    /**
    * 实例ID
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * 实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 用户名
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * 密码
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 日志类型队列
    */
    @SerializedName("LogTypeList")
    @Expose
    private SecLogDeliveryKafkaSettingInfo [] LogTypeList;

    /**
    * 接入类型
    */
    @SerializedName("AccessType")
    @Expose
    private Long AccessType;

    /**
    * kafka版本号
    */
    @SerializedName("KafkaVersion")
    @Expose
    private String KafkaVersion;

    /**
    * 地域ID
    */
    @SerializedName("RegionID")
    @Expose
    private String RegionID;

    /**
     * Get 实例ID 
     * @return InstanceID 实例ID
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set 实例ID
     * @param InstanceID 实例ID
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get 实例名称 
     * @return InstanceName 实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称
     * @param InstanceName 实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 域名 
     * @return Domain 域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
     * @param Domain 域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 用户名 
     * @return User 用户名
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set 用户名
     * @param User 用户名
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get 密码 
     * @return Password 密码
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 密码
     * @param Password 密码
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 日志类型队列 
     * @return LogTypeList 日志类型队列
     */
    public SecLogDeliveryKafkaSettingInfo [] getLogTypeList() {
        return this.LogTypeList;
    }

    /**
     * Set 日志类型队列
     * @param LogTypeList 日志类型队列
     */
    public void setLogTypeList(SecLogDeliveryKafkaSettingInfo [] LogTypeList) {
        this.LogTypeList = LogTypeList;
    }

    /**
     * Get 接入类型 
     * @return AccessType 接入类型
     */
    public Long getAccessType() {
        return this.AccessType;
    }

    /**
     * Set 接入类型
     * @param AccessType 接入类型
     */
    public void setAccessType(Long AccessType) {
        this.AccessType = AccessType;
    }

    /**
     * Get kafka版本号 
     * @return KafkaVersion kafka版本号
     */
    public String getKafkaVersion() {
        return this.KafkaVersion;
    }

    /**
     * Set kafka版本号
     * @param KafkaVersion kafka版本号
     */
    public void setKafkaVersion(String KafkaVersion) {
        this.KafkaVersion = KafkaVersion;
    }

    /**
     * Get 地域ID 
     * @return RegionID 地域ID
     */
    public String getRegionID() {
        return this.RegionID;
    }

    /**
     * Set 地域ID
     * @param RegionID 地域ID
     */
    public void setRegionID(String RegionID) {
        this.RegionID = RegionID;
    }

    public ModifySecLogDeliveryKafkaSettingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySecLogDeliveryKafkaSettingRequest(ModifySecLogDeliveryKafkaSettingRequest source) {
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.LogTypeList != null) {
            this.LogTypeList = new SecLogDeliveryKafkaSettingInfo[source.LogTypeList.length];
            for (int i = 0; i < source.LogTypeList.length; i++) {
                this.LogTypeList[i] = new SecLogDeliveryKafkaSettingInfo(source.LogTypeList[i]);
            }
        }
        if (source.AccessType != null) {
            this.AccessType = new Long(source.AccessType);
        }
        if (source.KafkaVersion != null) {
            this.KafkaVersion = new String(source.KafkaVersion);
        }
        if (source.RegionID != null) {
            this.RegionID = new String(source.RegionID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamArrayObj(map, prefix + "LogTypeList.", this.LogTypeList);
        this.setParamSimple(map, prefix + "AccessType", this.AccessType);
        this.setParamSimple(map, prefix + "KafkaVersion", this.KafkaVersion);
        this.setParamSimple(map, prefix + "RegionID", this.RegionID);

    }
}

