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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateAssetImageRegistryRegistryDetailRequest extends AbstractModel {

    /**
    * 仓库名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 用户名
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * 密码
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 仓库url
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 仓库类型，列表：harbor
    */
    @SerializedName("RegistryType")
    @Expose
    private String RegistryType;

    /**
    * 网络类型，列表：public（公网）
    */
    @SerializedName("NetType")
    @Expose
    private String NetType;

    /**
    * 仓库版本
    */
    @SerializedName("RegistryVersion")
    @Expose
    private String RegistryVersion;

    /**
    * 区域，列表：default（默认）
    */
    @SerializedName("RegistryRegion")
    @Expose
    private String RegistryRegion;

    /**
    * 限速
    */
    @SerializedName("SpeedLimit")
    @Expose
    private Long SpeedLimit;

    /**
    * 安全模式（证书校验）：0（默认） 非安全模式（跳过证书校验）：1
    */
    @SerializedName("Insecure")
    @Expose
    private Long Insecure;

    /**
    * 联通性检测的配置
    */
    @SerializedName("ConnDetectConfig")
    @Expose
    private ConnDetectConfig [] ConnDetectConfig;

    /**
    * 仓库唯一id
    */
    @SerializedName("RegistryId")
    @Expose
    private Long RegistryId;

    /**
     * Get 仓库名 
     * @return Name 仓库名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 仓库名
     * @param Name 仓库名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 用户名 
     * @return Username 用户名
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set 用户名
     * @param Username 用户名
     */
    public void setUsername(String Username) {
        this.Username = Username;
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
     * Get 仓库url 
     * @return Url 仓库url
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 仓库url
     * @param Url 仓库url
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 仓库类型，列表：harbor 
     * @return RegistryType 仓库类型，列表：harbor
     */
    public String getRegistryType() {
        return this.RegistryType;
    }

    /**
     * Set 仓库类型，列表：harbor
     * @param RegistryType 仓库类型，列表：harbor
     */
    public void setRegistryType(String RegistryType) {
        this.RegistryType = RegistryType;
    }

    /**
     * Get 网络类型，列表：public（公网） 
     * @return NetType 网络类型，列表：public（公网）
     */
    public String getNetType() {
        return this.NetType;
    }

    /**
     * Set 网络类型，列表：public（公网）
     * @param NetType 网络类型，列表：public（公网）
     */
    public void setNetType(String NetType) {
        this.NetType = NetType;
    }

    /**
     * Get 仓库版本 
     * @return RegistryVersion 仓库版本
     */
    public String getRegistryVersion() {
        return this.RegistryVersion;
    }

    /**
     * Set 仓库版本
     * @param RegistryVersion 仓库版本
     */
    public void setRegistryVersion(String RegistryVersion) {
        this.RegistryVersion = RegistryVersion;
    }

    /**
     * Get 区域，列表：default（默认） 
     * @return RegistryRegion 区域，列表：default（默认）
     */
    public String getRegistryRegion() {
        return this.RegistryRegion;
    }

    /**
     * Set 区域，列表：default（默认）
     * @param RegistryRegion 区域，列表：default（默认）
     */
    public void setRegistryRegion(String RegistryRegion) {
        this.RegistryRegion = RegistryRegion;
    }

    /**
     * Get 限速 
     * @return SpeedLimit 限速
     */
    public Long getSpeedLimit() {
        return this.SpeedLimit;
    }

    /**
     * Set 限速
     * @param SpeedLimit 限速
     */
    public void setSpeedLimit(Long SpeedLimit) {
        this.SpeedLimit = SpeedLimit;
    }

    /**
     * Get 安全模式（证书校验）：0（默认） 非安全模式（跳过证书校验）：1 
     * @return Insecure 安全模式（证书校验）：0（默认） 非安全模式（跳过证书校验）：1
     */
    public Long getInsecure() {
        return this.Insecure;
    }

    /**
     * Set 安全模式（证书校验）：0（默认） 非安全模式（跳过证书校验）：1
     * @param Insecure 安全模式（证书校验）：0（默认） 非安全模式（跳过证书校验）：1
     */
    public void setInsecure(Long Insecure) {
        this.Insecure = Insecure;
    }

    /**
     * Get 联通性检测的配置 
     * @return ConnDetectConfig 联通性检测的配置
     */
    public ConnDetectConfig [] getConnDetectConfig() {
        return this.ConnDetectConfig;
    }

    /**
     * Set 联通性检测的配置
     * @param ConnDetectConfig 联通性检测的配置
     */
    public void setConnDetectConfig(ConnDetectConfig [] ConnDetectConfig) {
        this.ConnDetectConfig = ConnDetectConfig;
    }

    /**
     * Get 仓库唯一id 
     * @return RegistryId 仓库唯一id
     */
    public Long getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set 仓库唯一id
     * @param RegistryId 仓库唯一id
     */
    public void setRegistryId(Long RegistryId) {
        this.RegistryId = RegistryId;
    }

    public UpdateAssetImageRegistryRegistryDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateAssetImageRegistryRegistryDetailRequest(UpdateAssetImageRegistryRegistryDetailRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Username != null) {
            this.Username = new String(source.Username);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.RegistryType != null) {
            this.RegistryType = new String(source.RegistryType);
        }
        if (source.NetType != null) {
            this.NetType = new String(source.NetType);
        }
        if (source.RegistryVersion != null) {
            this.RegistryVersion = new String(source.RegistryVersion);
        }
        if (source.RegistryRegion != null) {
            this.RegistryRegion = new String(source.RegistryRegion);
        }
        if (source.SpeedLimit != null) {
            this.SpeedLimit = new Long(source.SpeedLimit);
        }
        if (source.Insecure != null) {
            this.Insecure = new Long(source.Insecure);
        }
        if (source.ConnDetectConfig != null) {
            this.ConnDetectConfig = new ConnDetectConfig[source.ConnDetectConfig.length];
            for (int i = 0; i < source.ConnDetectConfig.length; i++) {
                this.ConnDetectConfig[i] = new ConnDetectConfig(source.ConnDetectConfig[i]);
            }
        }
        if (source.RegistryId != null) {
            this.RegistryId = new Long(source.RegistryId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "RegistryType", this.RegistryType);
        this.setParamSimple(map, prefix + "NetType", this.NetType);
        this.setParamSimple(map, prefix + "RegistryVersion", this.RegistryVersion);
        this.setParamSimple(map, prefix + "RegistryRegion", this.RegistryRegion);
        this.setParamSimple(map, prefix + "SpeedLimit", this.SpeedLimit);
        this.setParamSimple(map, prefix + "Insecure", this.Insecure);
        this.setParamArrayObj(map, prefix + "ConnDetectConfig.", this.ConnDetectConfig);
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);

    }
}

