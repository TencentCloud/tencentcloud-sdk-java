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
package com.tencentcloudapi.bdrc.v20260330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyCopyPairAttributeRequest extends AbstractModel {

    /**
    * <p>要修改属性的复制对ID</p>
    */
    @SerializedName("CopyPairId")
    @Expose
    private String CopyPairId;

    /**
    * <p>要修改的复制对类型，可选值：INSTANCE。</p><p>枚举值：</p><ul><li>INSTANCE： CVM复制对</li></ul>
    */
    @SerializedName("CopyPairType")
    @Expose
    private String CopyPairType;

    /**
    * <p>修改复制对名称（长度最大支持 64 个字符）</p>
    */
    @SerializedName("CopyPairName")
    @Expose
    private String CopyPairName;

    /**
    * <p>容灾端实例类型（仅容灾端CVM未创建时可修改）</p>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * <p>容灾端实例VPC IP（仅容灾端CVM未创建时可修改）</p>
    */
    @SerializedName("PrivateIpAddress")
    @Expose
    private String PrivateIpAddress;

    /**
    * <p>是否使用默认IP，与PrivateIpAddress互斥，不能同时使用（仅容灾端CVM未创建时可修改）</p>
    */
    @SerializedName("UseDefaultPrivateIp")
    @Expose
    private Boolean UseDefaultPrivateIp;

    /**
    * <p>实例登录设置，需要修改的时候才传（仅容灾端CVM未创建时可修改）</p>
    */
    @SerializedName("LoginSettings")
    @Expose
    private LoginSettings LoginSettings;

    /**
    * <p>是否自动生成密码，与LoginSettings互斥，不能同时使用（仅容灾端CVM未创建时可修改）</p>
    */
    @SerializedName("UseDefaultPassword")
    @Expose
    private Boolean UseDefaultPassword;

    /**
     * Get <p>要修改属性的复制对ID</p> 
     * @return CopyPairId <p>要修改属性的复制对ID</p>
     */
    public String getCopyPairId() {
        return this.CopyPairId;
    }

    /**
     * Set <p>要修改属性的复制对ID</p>
     * @param CopyPairId <p>要修改属性的复制对ID</p>
     */
    public void setCopyPairId(String CopyPairId) {
        this.CopyPairId = CopyPairId;
    }

    /**
     * Get <p>要修改的复制对类型，可选值：INSTANCE。</p><p>枚举值：</p><ul><li>INSTANCE： CVM复制对</li></ul> 
     * @return CopyPairType <p>要修改的复制对类型，可选值：INSTANCE。</p><p>枚举值：</p><ul><li>INSTANCE： CVM复制对</li></ul>
     */
    public String getCopyPairType() {
        return this.CopyPairType;
    }

    /**
     * Set <p>要修改的复制对类型，可选值：INSTANCE。</p><p>枚举值：</p><ul><li>INSTANCE： CVM复制对</li></ul>
     * @param CopyPairType <p>要修改的复制对类型，可选值：INSTANCE。</p><p>枚举值：</p><ul><li>INSTANCE： CVM复制对</li></ul>
     */
    public void setCopyPairType(String CopyPairType) {
        this.CopyPairType = CopyPairType;
    }

    /**
     * Get <p>修改复制对名称（长度最大支持 64 个字符）</p> 
     * @return CopyPairName <p>修改复制对名称（长度最大支持 64 个字符）</p>
     */
    public String getCopyPairName() {
        return this.CopyPairName;
    }

    /**
     * Set <p>修改复制对名称（长度最大支持 64 个字符）</p>
     * @param CopyPairName <p>修改复制对名称（长度最大支持 64 个字符）</p>
     */
    public void setCopyPairName(String CopyPairName) {
        this.CopyPairName = CopyPairName;
    }

    /**
     * Get <p>容灾端实例类型（仅容灾端CVM未创建时可修改）</p> 
     * @return InstanceType <p>容灾端实例类型（仅容灾端CVM未创建时可修改）</p>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>容灾端实例类型（仅容灾端CVM未创建时可修改）</p>
     * @param InstanceType <p>容灾端实例类型（仅容灾端CVM未创建时可修改）</p>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>容灾端实例VPC IP（仅容灾端CVM未创建时可修改）</p> 
     * @return PrivateIpAddress <p>容灾端实例VPC IP（仅容灾端CVM未创建时可修改）</p>
     */
    public String getPrivateIpAddress() {
        return this.PrivateIpAddress;
    }

    /**
     * Set <p>容灾端实例VPC IP（仅容灾端CVM未创建时可修改）</p>
     * @param PrivateIpAddress <p>容灾端实例VPC IP（仅容灾端CVM未创建时可修改）</p>
     */
    public void setPrivateIpAddress(String PrivateIpAddress) {
        this.PrivateIpAddress = PrivateIpAddress;
    }

    /**
     * Get <p>是否使用默认IP，与PrivateIpAddress互斥，不能同时使用（仅容灾端CVM未创建时可修改）</p> 
     * @return UseDefaultPrivateIp <p>是否使用默认IP，与PrivateIpAddress互斥，不能同时使用（仅容灾端CVM未创建时可修改）</p>
     */
    public Boolean getUseDefaultPrivateIp() {
        return this.UseDefaultPrivateIp;
    }

    /**
     * Set <p>是否使用默认IP，与PrivateIpAddress互斥，不能同时使用（仅容灾端CVM未创建时可修改）</p>
     * @param UseDefaultPrivateIp <p>是否使用默认IP，与PrivateIpAddress互斥，不能同时使用（仅容灾端CVM未创建时可修改）</p>
     */
    public void setUseDefaultPrivateIp(Boolean UseDefaultPrivateIp) {
        this.UseDefaultPrivateIp = UseDefaultPrivateIp;
    }

    /**
     * Get <p>实例登录设置，需要修改的时候才传（仅容灾端CVM未创建时可修改）</p> 
     * @return LoginSettings <p>实例登录设置，需要修改的时候才传（仅容灾端CVM未创建时可修改）</p>
     */
    public LoginSettings getLoginSettings() {
        return this.LoginSettings;
    }

    /**
     * Set <p>实例登录设置，需要修改的时候才传（仅容灾端CVM未创建时可修改）</p>
     * @param LoginSettings <p>实例登录设置，需要修改的时候才传（仅容灾端CVM未创建时可修改）</p>
     */
    public void setLoginSettings(LoginSettings LoginSettings) {
        this.LoginSettings = LoginSettings;
    }

    /**
     * Get <p>是否自动生成密码，与LoginSettings互斥，不能同时使用（仅容灾端CVM未创建时可修改）</p> 
     * @return UseDefaultPassword <p>是否自动生成密码，与LoginSettings互斥，不能同时使用（仅容灾端CVM未创建时可修改）</p>
     */
    public Boolean getUseDefaultPassword() {
        return this.UseDefaultPassword;
    }

    /**
     * Set <p>是否自动生成密码，与LoginSettings互斥，不能同时使用（仅容灾端CVM未创建时可修改）</p>
     * @param UseDefaultPassword <p>是否自动生成密码，与LoginSettings互斥，不能同时使用（仅容灾端CVM未创建时可修改）</p>
     */
    public void setUseDefaultPassword(Boolean UseDefaultPassword) {
        this.UseDefaultPassword = UseDefaultPassword;
    }

    public ModifyCopyPairAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCopyPairAttributeRequest(ModifyCopyPairAttributeRequest source) {
        if (source.CopyPairId != null) {
            this.CopyPairId = new String(source.CopyPairId);
        }
        if (source.CopyPairType != null) {
            this.CopyPairType = new String(source.CopyPairType);
        }
        if (source.CopyPairName != null) {
            this.CopyPairName = new String(source.CopyPairName);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.PrivateIpAddress != null) {
            this.PrivateIpAddress = new String(source.PrivateIpAddress);
        }
        if (source.UseDefaultPrivateIp != null) {
            this.UseDefaultPrivateIp = new Boolean(source.UseDefaultPrivateIp);
        }
        if (source.LoginSettings != null) {
            this.LoginSettings = new LoginSettings(source.LoginSettings);
        }
        if (source.UseDefaultPassword != null) {
            this.UseDefaultPassword = new Boolean(source.UseDefaultPassword);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CopyPairId", this.CopyPairId);
        this.setParamSimple(map, prefix + "CopyPairType", this.CopyPairType);
        this.setParamSimple(map, prefix + "CopyPairName", this.CopyPairName);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "PrivateIpAddress", this.PrivateIpAddress);
        this.setParamSimple(map, prefix + "UseDefaultPrivateIp", this.UseDefaultPrivateIp);
        this.setParamObj(map, prefix + "LoginSettings.", this.LoginSettings);
        this.setParamSimple(map, prefix + "UseDefaultPassword", this.UseDefaultPassword);

    }
}

