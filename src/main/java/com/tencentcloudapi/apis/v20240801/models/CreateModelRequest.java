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
package com.tencentcloudapi.apis.v20240801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateModelRequest extends AbstractModel {

    /**
    * <p>实例</p>
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * <p>模型名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>协议类型：http/https</p>
    */
    @SerializedName("HttpProtocolType")
    @Expose
    private String HttpProtocolType;

    /**
    * <p>目标路径</p>
    */
    @SerializedName("TargetPath")
    @Expose
    private String TargetPath;

    /**
    * <p>目标服务器</p>
    */
    @SerializedName("TargetHosts")
    @Expose
    private TargetHostDTO [] TargetHosts;

    /**
    * <p>凭据ID</p>
    */
    @SerializedName("CredentialID")
    @Expose
    private String CredentialID;

    /**
    * <p>https时，是否检查证书合法</p>
    */
    @SerializedName("CheckTargetCertsError")
    @Expose
    private Boolean CheckTargetCertsError;

    /**
    * <p>http协议版本：1.1/2.0</p>
    */
    @SerializedName("HttpProtocolVersion")
    @Expose
    private String HttpProtocolVersion;

    /**
    * <p>model ID</p>
    */
    @SerializedName("ModelID")
    @Expose
    private String ModelID;

    /**
    * <p>描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get <p>实例</p> 
     * @return InstanceID <p>实例</p>
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set <p>实例</p>
     * @param InstanceID <p>实例</p>
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get <p>模型名称</p> 
     * @return Name <p>模型名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>模型名称</p>
     * @param Name <p>模型名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>协议类型：http/https</p> 
     * @return HttpProtocolType <p>协议类型：http/https</p>
     */
    public String getHttpProtocolType() {
        return this.HttpProtocolType;
    }

    /**
     * Set <p>协议类型：http/https</p>
     * @param HttpProtocolType <p>协议类型：http/https</p>
     */
    public void setHttpProtocolType(String HttpProtocolType) {
        this.HttpProtocolType = HttpProtocolType;
    }

    /**
     * Get <p>目标路径</p> 
     * @return TargetPath <p>目标路径</p>
     */
    public String getTargetPath() {
        return this.TargetPath;
    }

    /**
     * Set <p>目标路径</p>
     * @param TargetPath <p>目标路径</p>
     */
    public void setTargetPath(String TargetPath) {
        this.TargetPath = TargetPath;
    }

    /**
     * Get <p>目标服务器</p> 
     * @return TargetHosts <p>目标服务器</p>
     */
    public TargetHostDTO [] getTargetHosts() {
        return this.TargetHosts;
    }

    /**
     * Set <p>目标服务器</p>
     * @param TargetHosts <p>目标服务器</p>
     */
    public void setTargetHosts(TargetHostDTO [] TargetHosts) {
        this.TargetHosts = TargetHosts;
    }

    /**
     * Get <p>凭据ID</p> 
     * @return CredentialID <p>凭据ID</p>
     */
    public String getCredentialID() {
        return this.CredentialID;
    }

    /**
     * Set <p>凭据ID</p>
     * @param CredentialID <p>凭据ID</p>
     */
    public void setCredentialID(String CredentialID) {
        this.CredentialID = CredentialID;
    }

    /**
     * Get <p>https时，是否检查证书合法</p> 
     * @return CheckTargetCertsError <p>https时，是否检查证书合法</p>
     */
    public Boolean getCheckTargetCertsError() {
        return this.CheckTargetCertsError;
    }

    /**
     * Set <p>https时，是否检查证书合法</p>
     * @param CheckTargetCertsError <p>https时，是否检查证书合法</p>
     */
    public void setCheckTargetCertsError(Boolean CheckTargetCertsError) {
        this.CheckTargetCertsError = CheckTargetCertsError;
    }

    /**
     * Get <p>http协议版本：1.1/2.0</p> 
     * @return HttpProtocolVersion <p>http协议版本：1.1/2.0</p>
     */
    public String getHttpProtocolVersion() {
        return this.HttpProtocolVersion;
    }

    /**
     * Set <p>http协议版本：1.1/2.0</p>
     * @param HttpProtocolVersion <p>http协议版本：1.1/2.0</p>
     */
    public void setHttpProtocolVersion(String HttpProtocolVersion) {
        this.HttpProtocolVersion = HttpProtocolVersion;
    }

    /**
     * Get <p>model ID</p> 
     * @return ModelID <p>model ID</p>
     */
    public String getModelID() {
        return this.ModelID;
    }

    /**
     * Set <p>model ID</p>
     * @param ModelID <p>model ID</p>
     */
    public void setModelID(String ModelID) {
        this.ModelID = ModelID;
    }

    /**
     * Get <p>描述</p> 
     * @return Description <p>描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述</p>
     * @param Description <p>描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public CreateModelRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateModelRequest(CreateModelRequest source) {
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.HttpProtocolType != null) {
            this.HttpProtocolType = new String(source.HttpProtocolType);
        }
        if (source.TargetPath != null) {
            this.TargetPath = new String(source.TargetPath);
        }
        if (source.TargetHosts != null) {
            this.TargetHosts = new TargetHostDTO[source.TargetHosts.length];
            for (int i = 0; i < source.TargetHosts.length; i++) {
                this.TargetHosts[i] = new TargetHostDTO(source.TargetHosts[i]);
            }
        }
        if (source.CredentialID != null) {
            this.CredentialID = new String(source.CredentialID);
        }
        if (source.CheckTargetCertsError != null) {
            this.CheckTargetCertsError = new Boolean(source.CheckTargetCertsError);
        }
        if (source.HttpProtocolVersion != null) {
            this.HttpProtocolVersion = new String(source.HttpProtocolVersion);
        }
        if (source.ModelID != null) {
            this.ModelID = new String(source.ModelID);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "HttpProtocolType", this.HttpProtocolType);
        this.setParamSimple(map, prefix + "TargetPath", this.TargetPath);
        this.setParamArrayObj(map, prefix + "TargetHosts.", this.TargetHosts);
        this.setParamSimple(map, prefix + "CredentialID", this.CredentialID);
        this.setParamSimple(map, prefix + "CheckTargetCertsError", this.CheckTargetCertsError);
        this.setParamSimple(map, prefix + "HttpProtocolVersion", this.HttpProtocolVersion);
        this.setParamSimple(map, prefix + "ModelID", this.ModelID);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

