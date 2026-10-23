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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateUserKeyRequest extends AbstractModel {

    /**
    * <p>环境ID</p>
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * <p>用户密钥名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>用户密钥对标识，前半部分用户填写，后半部分平台按照一定规则生成</p>
    */
    @SerializedName("KeyID")
    @Expose
    private String KeyID;

    /**
    * <p>密钥对描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>授权类型code</p>
    */
    @SerializedName("AuthTypeCode")
    @Expose
    private String AuthTypeCode;

    /**
    * <p>根据授权类型的不同，ext会有不同的子结构</p>
    */
    @SerializedName("Ext")
    @Expose
    private String Ext;

    /**
    * <p>业务类型，integration：从集成中心来的，默认为空，表示是从授权管理中心来的</p>
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * <p>创建集成时创建对应的示例代码云函数需要的参数</p>
    */
    @SerializedName("RuntimeConfig")
    @Expose
    private AgentRuntimeConfig RuntimeConfig;

    /**
    * <p>创建集成时创建对应的示例代码云函数需要的函数名</p>
    */
    @SerializedName("DemoCodeFunctionName")
    @Expose
    private String DemoCodeFunctionName;

    /**
     * Get <p>环境ID</p> 
     * @return EnvId <p>环境ID</p>
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set <p>环境ID</p>
     * @param EnvId <p>环境ID</p>
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get <p>用户密钥名称</p> 
     * @return Name <p>用户密钥名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>用户密钥名称</p>
     * @param Name <p>用户密钥名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>用户密钥对标识，前半部分用户填写，后半部分平台按照一定规则生成</p> 
     * @return KeyID <p>用户密钥对标识，前半部分用户填写，后半部分平台按照一定规则生成</p>
     */
    public String getKeyID() {
        return this.KeyID;
    }

    /**
     * Set <p>用户密钥对标识，前半部分用户填写，后半部分平台按照一定规则生成</p>
     * @param KeyID <p>用户密钥对标识，前半部分用户填写，后半部分平台按照一定规则生成</p>
     */
    public void setKeyID(String KeyID) {
        this.KeyID = KeyID;
    }

    /**
     * Get <p>密钥对描述</p> 
     * @return Description <p>密钥对描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>密钥对描述</p>
     * @param Description <p>密钥对描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>授权类型code</p> 
     * @return AuthTypeCode <p>授权类型code</p>
     */
    public String getAuthTypeCode() {
        return this.AuthTypeCode;
    }

    /**
     * Set <p>授权类型code</p>
     * @param AuthTypeCode <p>授权类型code</p>
     */
    public void setAuthTypeCode(String AuthTypeCode) {
        this.AuthTypeCode = AuthTypeCode;
    }

    /**
     * Get <p>根据授权类型的不同，ext会有不同的子结构</p> 
     * @return Ext <p>根据授权类型的不同，ext会有不同的子结构</p>
     */
    public String getExt() {
        return this.Ext;
    }

    /**
     * Set <p>根据授权类型的不同，ext会有不同的子结构</p>
     * @param Ext <p>根据授权类型的不同，ext会有不同的子结构</p>
     */
    public void setExt(String Ext) {
        this.Ext = Ext;
    }

    /**
     * Get <p>业务类型，integration：从集成中心来的，默认为空，表示是从授权管理中心来的</p> 
     * @return Business <p>业务类型，integration：从集成中心来的，默认为空，表示是从授权管理中心来的</p>
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set <p>业务类型，integration：从集成中心来的，默认为空，表示是从授权管理中心来的</p>
     * @param Business <p>业务类型，integration：从集成中心来的，默认为空，表示是从授权管理中心来的</p>
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * Get <p>创建集成时创建对应的示例代码云函数需要的参数</p> 
     * @return RuntimeConfig <p>创建集成时创建对应的示例代码云函数需要的参数</p>
     */
    public AgentRuntimeConfig getRuntimeConfig() {
        return this.RuntimeConfig;
    }

    /**
     * Set <p>创建集成时创建对应的示例代码云函数需要的参数</p>
     * @param RuntimeConfig <p>创建集成时创建对应的示例代码云函数需要的参数</p>
     */
    public void setRuntimeConfig(AgentRuntimeConfig RuntimeConfig) {
        this.RuntimeConfig = RuntimeConfig;
    }

    /**
     * Get <p>创建集成时创建对应的示例代码云函数需要的函数名</p> 
     * @return DemoCodeFunctionName <p>创建集成时创建对应的示例代码云函数需要的函数名</p>
     */
    public String getDemoCodeFunctionName() {
        return this.DemoCodeFunctionName;
    }

    /**
     * Set <p>创建集成时创建对应的示例代码云函数需要的函数名</p>
     * @param DemoCodeFunctionName <p>创建集成时创建对应的示例代码云函数需要的函数名</p>
     */
    public void setDemoCodeFunctionName(String DemoCodeFunctionName) {
        this.DemoCodeFunctionName = DemoCodeFunctionName;
    }

    public UpdateUserKeyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateUserKeyRequest(UpdateUserKeyRequest source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.KeyID != null) {
            this.KeyID = new String(source.KeyID);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.AuthTypeCode != null) {
            this.AuthTypeCode = new String(source.AuthTypeCode);
        }
        if (source.Ext != null) {
            this.Ext = new String(source.Ext);
        }
        if (source.Business != null) {
            this.Business = new String(source.Business);
        }
        if (source.RuntimeConfig != null) {
            this.RuntimeConfig = new AgentRuntimeConfig(source.RuntimeConfig);
        }
        if (source.DemoCodeFunctionName != null) {
            this.DemoCodeFunctionName = new String(source.DemoCodeFunctionName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "KeyID", this.KeyID);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "AuthTypeCode", this.AuthTypeCode);
        this.setParamSimple(map, prefix + "Ext", this.Ext);
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamObj(map, prefix + "RuntimeConfig.", this.RuntimeConfig);
        this.setParamSimple(map, prefix + "DemoCodeFunctionName", this.DemoCodeFunctionName);

    }
}

