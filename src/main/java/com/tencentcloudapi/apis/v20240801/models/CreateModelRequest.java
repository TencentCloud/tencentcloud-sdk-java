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
    * 实例
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * 模型名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 协议类型：http/https
    */
    @SerializedName("HttpProtocolType")
    @Expose
    private String HttpProtocolType;

    /**
    * 目标路径
    */
    @SerializedName("TargetPath")
    @Expose
    private String TargetPath;

    /**
    * 目标服务器
    */
    @SerializedName("TargetHosts")
    @Expose
    private TargetHostDTO [] TargetHosts;

    /**
    * 凭据ID
    */
    @SerializedName("CredentialID")
    @Expose
    private String CredentialID;

    /**
    * https时，是否检查证书合法
    */
    @SerializedName("CheckTargetCertsError")
    @Expose
    private Boolean CheckTargetCertsError;

    /**
    * http协议版本：1.1/2.0
    */
    @SerializedName("HttpProtocolVersion")
    @Expose
    private String HttpProtocolVersion;

    /**
     * Get 实例 
     * @return InstanceID 实例
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set 实例
     * @param InstanceID 实例
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get 模型名称 
     * @return Name 模型名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 模型名称
     * @param Name 模型名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 协议类型：http/https 
     * @return HttpProtocolType 协议类型：http/https
     */
    public String getHttpProtocolType() {
        return this.HttpProtocolType;
    }

    /**
     * Set 协议类型：http/https
     * @param HttpProtocolType 协议类型：http/https
     */
    public void setHttpProtocolType(String HttpProtocolType) {
        this.HttpProtocolType = HttpProtocolType;
    }

    /**
     * Get 目标路径 
     * @return TargetPath 目标路径
     */
    public String getTargetPath() {
        return this.TargetPath;
    }

    /**
     * Set 目标路径
     * @param TargetPath 目标路径
     */
    public void setTargetPath(String TargetPath) {
        this.TargetPath = TargetPath;
    }

    /**
     * Get 目标服务器 
     * @return TargetHosts 目标服务器
     */
    public TargetHostDTO [] getTargetHosts() {
        return this.TargetHosts;
    }

    /**
     * Set 目标服务器
     * @param TargetHosts 目标服务器
     */
    public void setTargetHosts(TargetHostDTO [] TargetHosts) {
        this.TargetHosts = TargetHosts;
    }

    /**
     * Get 凭据ID 
     * @return CredentialID 凭据ID
     */
    public String getCredentialID() {
        return this.CredentialID;
    }

    /**
     * Set 凭据ID
     * @param CredentialID 凭据ID
     */
    public void setCredentialID(String CredentialID) {
        this.CredentialID = CredentialID;
    }

    /**
     * Get https时，是否检查证书合法 
     * @return CheckTargetCertsError https时，是否检查证书合法
     */
    public Boolean getCheckTargetCertsError() {
        return this.CheckTargetCertsError;
    }

    /**
     * Set https时，是否检查证书合法
     * @param CheckTargetCertsError https时，是否检查证书合法
     */
    public void setCheckTargetCertsError(Boolean CheckTargetCertsError) {
        this.CheckTargetCertsError = CheckTargetCertsError;
    }

    /**
     * Get http协议版本：1.1/2.0 
     * @return HttpProtocolVersion http协议版本：1.1/2.0
     */
    public String getHttpProtocolVersion() {
        return this.HttpProtocolVersion;
    }

    /**
     * Set http协议版本：1.1/2.0
     * @param HttpProtocolVersion http协议版本：1.1/2.0
     */
    public void setHttpProtocolVersion(String HttpProtocolVersion) {
        this.HttpProtocolVersion = HttpProtocolVersion;
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

    }
}

