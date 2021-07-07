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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudBaseRunForGatewayConf extends AbstractModel{

    /**
    * 是否缩容到0
    */
    @SerializedName("IsZero")
    @Expose
    private Boolean IsZero;

    /**
    * 按百分比灰度的权重
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * 按请求/header参数的灰度Key
    */
    @SerializedName("GrayKey")
    @Expose
    private String GrayKey;

    /**
    * 按请求/header参数的灰度Value
    */
    @SerializedName("GrayValue")
    @Expose
    private String GrayValue;

    /**
    * 是否为默认版本(按请求/header参数)
    */
    @SerializedName("IsDefault")
    @Expose
    private Boolean IsDefault;

    /**
    * 访问权限，对应二进制分多段，vpc内网｜公网｜oa
    */
    @SerializedName("AccessType")
    @Expose
    private Long AccessType;

    /**
    * 访问的URL（域名＋路径）列表
    */
    @SerializedName("URLs")
    @Expose
    private String [] URLs;

    /**
    * 环境ID
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 服务名称
    */
    @SerializedName("ServerName")
    @Expose
    private String ServerName;

    /**
    * 版本名称
    */
    @SerializedName("VersionName")
    @Expose
    private String VersionName;

    /**
    * 灰度类型：FLOW(权重), URL_PARAMS/HEAD_PARAMS
    */
    @SerializedName("GrayType")
    @Expose
    private String GrayType;

    /**
    * CLB的IP:Port
    */
    @SerializedName("LbAddr")
    @Expose
    private String LbAddr;

    /**
    * 0:http访问服务配置信息, 1: 服务域名
    */
    @SerializedName("ConfigType")
    @Expose
    private Long ConfigType;

    /**
     * Get 是否缩容到0 
     * @return IsZero 是否缩容到0
     */
    public Boolean getIsZero() {
        return this.IsZero;
    }

    /**
     * Set 是否缩容到0
     * @param IsZero 是否缩容到0
     */
    public void setIsZero(Boolean IsZero) {
        this.IsZero = IsZero;
    }

    /**
     * Get 按百分比灰度的权重 
     * @return Weight 按百分比灰度的权重
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set 按百分比灰度的权重
     * @param Weight 按百分比灰度的权重
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get 按请求/header参数的灰度Key 
     * @return GrayKey 按请求/header参数的灰度Key
     */
    public String getGrayKey() {
        return this.GrayKey;
    }

    /**
     * Set 按请求/header参数的灰度Key
     * @param GrayKey 按请求/header参数的灰度Key
     */
    public void setGrayKey(String GrayKey) {
        this.GrayKey = GrayKey;
    }

    /**
     * Get 按请求/header参数的灰度Value 
     * @return GrayValue 按请求/header参数的灰度Value
     */
    public String getGrayValue() {
        return this.GrayValue;
    }

    /**
     * Set 按请求/header参数的灰度Value
     * @param GrayValue 按请求/header参数的灰度Value
     */
    public void setGrayValue(String GrayValue) {
        this.GrayValue = GrayValue;
    }

    /**
     * Get 是否为默认版本(按请求/header参数) 
     * @return IsDefault 是否为默认版本(按请求/header参数)
     */
    public Boolean getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set 是否为默认版本(按请求/header参数)
     * @param IsDefault 是否为默认版本(按请求/header参数)
     */
    public void setIsDefault(Boolean IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * Get 访问权限，对应二进制分多段，vpc内网｜公网｜oa 
     * @return AccessType 访问权限，对应二进制分多段，vpc内网｜公网｜oa
     */
    public Long getAccessType() {
        return this.AccessType;
    }

    /**
     * Set 访问权限，对应二进制分多段，vpc内网｜公网｜oa
     * @param AccessType 访问权限，对应二进制分多段，vpc内网｜公网｜oa
     */
    public void setAccessType(Long AccessType) {
        this.AccessType = AccessType;
    }

    /**
     * Get 访问的URL（域名＋路径）列表 
     * @return URLs 访问的URL（域名＋路径）列表
     */
    public String [] getURLs() {
        return this.URLs;
    }

    /**
     * Set 访问的URL（域名＋路径）列表
     * @param URLs 访问的URL（域名＋路径）列表
     */
    public void setURLs(String [] URLs) {
        this.URLs = URLs;
    }

    /**
     * Get 环境ID 
     * @return EnvId 环境ID
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 环境ID
     * @param EnvId 环境ID
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get 服务名称 
     * @return ServerName 服务名称
     */
    public String getServerName() {
        return this.ServerName;
    }

    /**
     * Set 服务名称
     * @param ServerName 服务名称
     */
    public void setServerName(String ServerName) {
        this.ServerName = ServerName;
    }

    /**
     * Get 版本名称 
     * @return VersionName 版本名称
     */
    public String getVersionName() {
        return this.VersionName;
    }

    /**
     * Set 版本名称
     * @param VersionName 版本名称
     */
    public void setVersionName(String VersionName) {
        this.VersionName = VersionName;
    }

    /**
     * Get 灰度类型：FLOW(权重), URL_PARAMS/HEAD_PARAMS 
     * @return GrayType 灰度类型：FLOW(权重), URL_PARAMS/HEAD_PARAMS
     */
    public String getGrayType() {
        return this.GrayType;
    }

    /**
     * Set 灰度类型：FLOW(权重), URL_PARAMS/HEAD_PARAMS
     * @param GrayType 灰度类型：FLOW(权重), URL_PARAMS/HEAD_PARAMS
     */
    public void setGrayType(String GrayType) {
        this.GrayType = GrayType;
    }

    /**
     * Get CLB的IP:Port 
     * @return LbAddr CLB的IP:Port
     */
    public String getLbAddr() {
        return this.LbAddr;
    }

    /**
     * Set CLB的IP:Port
     * @param LbAddr CLB的IP:Port
     */
    public void setLbAddr(String LbAddr) {
        this.LbAddr = LbAddr;
    }

    /**
     * Get 0:http访问服务配置信息, 1: 服务域名 
     * @return ConfigType 0:http访问服务配置信息, 1: 服务域名
     */
    public Long getConfigType() {
        return this.ConfigType;
    }

    /**
     * Set 0:http访问服务配置信息, 1: 服务域名
     * @param ConfigType 0:http访问服务配置信息, 1: 服务域名
     */
    public void setConfigType(Long ConfigType) {
        this.ConfigType = ConfigType;
    }

    public CloudBaseRunForGatewayConf() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudBaseRunForGatewayConf(CloudBaseRunForGatewayConf source) {
        if (source.IsZero != null) {
            this.IsZero = new Boolean(source.IsZero);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
        if (source.GrayKey != null) {
            this.GrayKey = new String(source.GrayKey);
        }
        if (source.GrayValue != null) {
            this.GrayValue = new String(source.GrayValue);
        }
        if (source.IsDefault != null) {
            this.IsDefault = new Boolean(source.IsDefault);
        }
        if (source.AccessType != null) {
            this.AccessType = new Long(source.AccessType);
        }
        if (source.URLs != null) {
            this.URLs = new String[source.URLs.length];
            for (int i = 0; i < source.URLs.length; i++) {
                this.URLs[i] = new String(source.URLs[i]);
            }
        }
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.ServerName != null) {
            this.ServerName = new String(source.ServerName);
        }
        if (source.VersionName != null) {
            this.VersionName = new String(source.VersionName);
        }
        if (source.GrayType != null) {
            this.GrayType = new String(source.GrayType);
        }
        if (source.LbAddr != null) {
            this.LbAddr = new String(source.LbAddr);
        }
        if (source.ConfigType != null) {
            this.ConfigType = new Long(source.ConfigType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsZero", this.IsZero);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "GrayKey", this.GrayKey);
        this.setParamSimple(map, prefix + "GrayValue", this.GrayValue);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);
        this.setParamSimple(map, prefix + "AccessType", this.AccessType);
        this.setParamArraySimple(map, prefix + "URLs.", this.URLs);
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "ServerName", this.ServerName);
        this.setParamSimple(map, prefix + "VersionName", this.VersionName);
        this.setParamSimple(map, prefix + "GrayType", this.GrayType);
        this.setParamSimple(map, prefix + "LbAddr", this.LbAddr);
        this.setParamSimple(map, prefix + "ConfigType", this.ConfigType);

    }
}

