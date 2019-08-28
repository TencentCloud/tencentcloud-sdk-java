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
package com.tencentcloudapi.wss.v20180426.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UploadCertRequest  extends AbstractModel{

    /**
    * 证书内容
    */
    @SerializedName("Cert")
    @Expose
    private String Cert;

    /**
    * 证书类型（目前支持：CA 为客户端证书，SVR 为服务器证书）
    */
    @SerializedName("CertType")
    @Expose
    private String CertType;

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 模块名称，应填ssl
    */
    @SerializedName("ModuleType")
    @Expose
    private String ModuleType;

    /**
    * 证书私钥，certType=SVR 时必填
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 证书备注
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
     * 获取证书内容
     * @return Cert 证书内容
     */
    public String getCert() {
        return this.Cert;
    }

    /**
     * 设置证书内容
     * @param Cert 证书内容
     */
    public void setCert(String Cert) {
        this.Cert = Cert;
    }

    /**
     * 获取证书类型（目前支持：CA 为客户端证书，SVR 为服务器证书）
     * @return CertType 证书类型（目前支持：CA 为客户端证书，SVR 为服务器证书）
     */
    public String getCertType() {
        return this.CertType;
    }

    /**
     * 设置证书类型（目前支持：CA 为客户端证书，SVR 为服务器证书）
     * @param CertType 证书类型（目前支持：CA 为客户端证书，SVR 为服务器证书）
     */
    public void setCertType(String CertType) {
        this.CertType = CertType;
    }

    /**
     * 获取项目ID
     * @return ProjectId 项目ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * 设置项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * 获取模块名称，应填ssl
     * @return ModuleType 模块名称，应填ssl
     */
    public String getModuleType() {
        return this.ModuleType;
    }

    /**
     * 设置模块名称，应填ssl
     * @param ModuleType 模块名称，应填ssl
     */
    public void setModuleType(String ModuleType) {
        this.ModuleType = ModuleType;
    }

    /**
     * 获取证书私钥，certType=SVR 时必填
     * @return Key 证书私钥，certType=SVR 时必填
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * 设置证书私钥，certType=SVR 时必填
     * @param Key 证书私钥，certType=SVR 时必填
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * 获取证书备注
     * @return Alias 证书备注
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * 设置证书备注
     * @param Alias 证书备注
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Cert", this.Cert);
        this.setParamSimple(map, prefix + "CertType", this.CertType);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ModuleType", this.ModuleType);
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Alias", this.Alias);

    }
}

