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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserDomainInfo extends AbstractModel {

    /**
    * 用户id
    */
    @SerializedName("Appid")
    @Expose
    private Long Appid;

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 域名id
    */
    @SerializedName("DomainId")
    @Expose
    private String DomainId;

    /**
    * 实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例名
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * waf类型
    */
    @SerializedName("Edition")
    @Expose
    private String Edition;

    /**
    * 版本
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * 指定域名访问日志字段的开关
    */
    @SerializedName("WriteConfig")
    @Expose
    private String WriteConfig;

    /**
    * 指定域名是否写cls的开关 1:写 0:不写
    */
    @SerializedName("Cls")
    @Expose
    private Long Cls;

    /**
    * 标记是否是混合云接入。hybrid表示混合云接入域名
    */
    @SerializedName("CloudType")
    @Expose
    private String CloudType;

    /**
    * 标记clbwaf类型
    */
    @SerializedName("AlbType")
    @Expose
    private String AlbType;

    /**
    * BOT开关状态
    */
    @SerializedName("BotStatus")
    @Expose
    private Long BotStatus;

    /**
    * API开关状态
    */
    @SerializedName("ApiStatus")
    @Expose
    private Long ApiStatus;

    /**
     * Get 用户id 
     * @return Appid 用户id
     */
    public Long getAppid() {
        return this.Appid;
    }

    /**
     * Set 用户id
     * @param Appid 用户id
     */
    public void setAppid(Long Appid) {
        this.Appid = Appid;
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
     * Get 域名id 
     * @return DomainId 域名id
     */
    public String getDomainId() {
        return this.DomainId;
    }

    /**
     * Set 域名id
     * @param DomainId 域名id
     */
    public void setDomainId(String DomainId) {
        this.DomainId = DomainId;
    }

    /**
     * Get 实例id 
     * @return InstanceId 实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例id
     * @param InstanceId 实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例名 
     * @return InstanceName 实例名
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名
     * @param InstanceName 实例名
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get waf类型 
     * @return Edition waf类型
     */
    public String getEdition() {
        return this.Edition;
    }

    /**
     * Set waf类型
     * @param Edition waf类型
     */
    public void setEdition(String Edition) {
        this.Edition = Edition;
    }

    /**
     * Get 版本 
     * @return Level 版本
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set 版本
     * @param Level 版本
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get 指定域名访问日志字段的开关 
     * @return WriteConfig 指定域名访问日志字段的开关
     */
    public String getWriteConfig() {
        return this.WriteConfig;
    }

    /**
     * Set 指定域名访问日志字段的开关
     * @param WriteConfig 指定域名访问日志字段的开关
     */
    public void setWriteConfig(String WriteConfig) {
        this.WriteConfig = WriteConfig;
    }

    /**
     * Get 指定域名是否写cls的开关 1:写 0:不写 
     * @return Cls 指定域名是否写cls的开关 1:写 0:不写
     */
    public Long getCls() {
        return this.Cls;
    }

    /**
     * Set 指定域名是否写cls的开关 1:写 0:不写
     * @param Cls 指定域名是否写cls的开关 1:写 0:不写
     */
    public void setCls(Long Cls) {
        this.Cls = Cls;
    }

    /**
     * Get 标记是否是混合云接入。hybrid表示混合云接入域名 
     * @return CloudType 标记是否是混合云接入。hybrid表示混合云接入域名
     */
    public String getCloudType() {
        return this.CloudType;
    }

    /**
     * Set 标记是否是混合云接入。hybrid表示混合云接入域名
     * @param CloudType 标记是否是混合云接入。hybrid表示混合云接入域名
     */
    public void setCloudType(String CloudType) {
        this.CloudType = CloudType;
    }

    /**
     * Get 标记clbwaf类型 
     * @return AlbType 标记clbwaf类型
     */
    public String getAlbType() {
        return this.AlbType;
    }

    /**
     * Set 标记clbwaf类型
     * @param AlbType 标记clbwaf类型
     */
    public void setAlbType(String AlbType) {
        this.AlbType = AlbType;
    }

    /**
     * Get BOT开关状态 
     * @return BotStatus BOT开关状态
     */
    public Long getBotStatus() {
        return this.BotStatus;
    }

    /**
     * Set BOT开关状态
     * @param BotStatus BOT开关状态
     */
    public void setBotStatus(Long BotStatus) {
        this.BotStatus = BotStatus;
    }

    /**
     * Get API开关状态 
     * @return ApiStatus API开关状态
     */
    public Long getApiStatus() {
        return this.ApiStatus;
    }

    /**
     * Set API开关状态
     * @param ApiStatus API开关状态
     */
    public void setApiStatus(Long ApiStatus) {
        this.ApiStatus = ApiStatus;
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

    }
}

