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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserDomainInfo extends AbstractModel {

    /**
    * <p>用户id</p>
    */
    @SerializedName("Appid")
    @Expose
    private Long Appid;

    /**
    * <p>域名</p>
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <p>域名id</p>
    */
    @SerializedName("DomainId")
    @Expose
    private String DomainId;

    /**
    * <p>实例id</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>实例名</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>waf类型</p>
    */
    @SerializedName("Edition")
    @Expose
    private String Edition;

    /**
    * <p>版本</p>
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * <p>指定域名访问日志字段的开关</p>
    */
    @SerializedName("WriteConfig")
    @Expose
    private String WriteConfig;

    /**
    * <p>指定域名是否写cls的开关 1:写 0:不写</p>
    */
    @SerializedName("Cls")
    @Expose
    private Long Cls;

    /**
    * <p>标记是否是混合云接入。hybrid表示混合云接入域名</p>
    */
    @SerializedName("CloudType")
    @Expose
    private String CloudType;

    /**
    * <p>标记clbwaf类型</p>
    */
    @SerializedName("AlbType")
    @Expose
    private String AlbType;

    /**
    * <p>BOT开关状态</p>
    */
    @SerializedName("BotStatus")
    @Expose
    private Long BotStatus;

    /**
    * <p>API开关状态</p>
    */
    @SerializedName("ApiStatus")
    @Expose
    private Long ApiStatus;

    /**
    * <p>是否是四层clbwaf域名</p>
    */
    @SerializedName("IsREIP")
    @Expose
    private Long IsREIP;

    /**
     * Get <p>用户id</p> 
     * @return Appid <p>用户id</p>
     */
    public Long getAppid() {
        return this.Appid;
    }

    /**
     * Set <p>用户id</p>
     * @param Appid <p>用户id</p>
     */
    public void setAppid(Long Appid) {
        this.Appid = Appid;
    }

    /**
     * Get <p>域名</p> 
     * @return Domain <p>域名</p>
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>域名</p>
     * @param Domain <p>域名</p>
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>域名id</p> 
     * @return DomainId <p>域名id</p>
     */
    public String getDomainId() {
        return this.DomainId;
    }

    /**
     * Set <p>域名id</p>
     * @param DomainId <p>域名id</p>
     */
    public void setDomainId(String DomainId) {
        this.DomainId = DomainId;
    }

    /**
     * Get <p>实例id</p> 
     * @return InstanceId <p>实例id</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例id</p>
     * @param InstanceId <p>实例id</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>实例名</p> 
     * @return InstanceName <p>实例名</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>实例名</p>
     * @param InstanceName <p>实例名</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>waf类型</p> 
     * @return Edition <p>waf类型</p>
     */
    public String getEdition() {
        return this.Edition;
    }

    /**
     * Set <p>waf类型</p>
     * @param Edition <p>waf类型</p>
     */
    public void setEdition(String Edition) {
        this.Edition = Edition;
    }

    /**
     * Get <p>版本</p> 
     * @return Level <p>版本</p>
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set <p>版本</p>
     * @param Level <p>版本</p>
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get <p>指定域名访问日志字段的开关</p> 
     * @return WriteConfig <p>指定域名访问日志字段的开关</p>
     */
    public String getWriteConfig() {
        return this.WriteConfig;
    }

    /**
     * Set <p>指定域名访问日志字段的开关</p>
     * @param WriteConfig <p>指定域名访问日志字段的开关</p>
     */
    public void setWriteConfig(String WriteConfig) {
        this.WriteConfig = WriteConfig;
    }

    /**
     * Get <p>指定域名是否写cls的开关 1:写 0:不写</p> 
     * @return Cls <p>指定域名是否写cls的开关 1:写 0:不写</p>
     */
    public Long getCls() {
        return this.Cls;
    }

    /**
     * Set <p>指定域名是否写cls的开关 1:写 0:不写</p>
     * @param Cls <p>指定域名是否写cls的开关 1:写 0:不写</p>
     */
    public void setCls(Long Cls) {
        this.Cls = Cls;
    }

    /**
     * Get <p>标记是否是混合云接入。hybrid表示混合云接入域名</p> 
     * @return CloudType <p>标记是否是混合云接入。hybrid表示混合云接入域名</p>
     */
    public String getCloudType() {
        return this.CloudType;
    }

    /**
     * Set <p>标记是否是混合云接入。hybrid表示混合云接入域名</p>
     * @param CloudType <p>标记是否是混合云接入。hybrid表示混合云接入域名</p>
     */
    public void setCloudType(String CloudType) {
        this.CloudType = CloudType;
    }

    /**
     * Get <p>标记clbwaf类型</p> 
     * @return AlbType <p>标记clbwaf类型</p>
     */
    public String getAlbType() {
        return this.AlbType;
    }

    /**
     * Set <p>标记clbwaf类型</p>
     * @param AlbType <p>标记clbwaf类型</p>
     */
    public void setAlbType(String AlbType) {
        this.AlbType = AlbType;
    }

    /**
     * Get <p>BOT开关状态</p> 
     * @return BotStatus <p>BOT开关状态</p>
     */
    public Long getBotStatus() {
        return this.BotStatus;
    }

    /**
     * Set <p>BOT开关状态</p>
     * @param BotStatus <p>BOT开关状态</p>
     */
    public void setBotStatus(Long BotStatus) {
        this.BotStatus = BotStatus;
    }

    /**
     * Get <p>API开关状态</p> 
     * @return ApiStatus <p>API开关状态</p>
     */
    public Long getApiStatus() {
        return this.ApiStatus;
    }

    /**
     * Set <p>API开关状态</p>
     * @param ApiStatus <p>API开关状态</p>
     */
    public void setApiStatus(Long ApiStatus) {
        this.ApiStatus = ApiStatus;
    }

    /**
     * Get <p>是否是四层clbwaf域名</p> 
     * @return IsREIP <p>是否是四层clbwaf域名</p>
     */
    public Long getIsREIP() {
        return this.IsREIP;
    }

    /**
     * Set <p>是否是四层clbwaf域名</p>
     * @param IsREIP <p>是否是四层clbwaf域名</p>
     */
    public void setIsREIP(Long IsREIP) {
        this.IsREIP = IsREIP;
    }

    public UserDomainInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserDomainInfo(UserDomainInfo source) {
        if (source.Appid != null) {
            this.Appid = new Long(source.Appid);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.DomainId != null) {
            this.DomainId = new String(source.DomainId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Edition != null) {
            this.Edition = new String(source.Edition);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.WriteConfig != null) {
            this.WriteConfig = new String(source.WriteConfig);
        }
        if (source.Cls != null) {
            this.Cls = new Long(source.Cls);
        }
        if (source.CloudType != null) {
            this.CloudType = new String(source.CloudType);
        }
        if (source.AlbType != null) {
            this.AlbType = new String(source.AlbType);
        }
        if (source.BotStatus != null) {
            this.BotStatus = new Long(source.BotStatus);
        }
        if (source.ApiStatus != null) {
            this.ApiStatus = new Long(source.ApiStatus);
        }
        if (source.IsREIP != null) {
            this.IsREIP = new Long(source.IsREIP);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Appid", this.Appid);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Edition", this.Edition);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "WriteConfig", this.WriteConfig);
        this.setParamSimple(map, prefix + "Cls", this.Cls);
        this.setParamSimple(map, prefix + "CloudType", this.CloudType);
        this.setParamSimple(map, prefix + "AlbType", this.AlbType);
        this.setParamSimple(map, prefix + "BotStatus", this.BotStatus);
        this.setParamSimple(map, prefix + "ApiStatus", this.ApiStatus);
        this.setParamSimple(map, prefix + "IsREIP", this.IsREIP);

    }
}

