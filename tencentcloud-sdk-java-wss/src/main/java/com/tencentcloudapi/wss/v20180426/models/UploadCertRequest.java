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

public class UploadCertRequest extends AbstractModel{

    /**
    * 证书内容。
    */
    @SerializedName("Cert")
    @Expose
    private String Cert;

    /**
    * 证书类型（目前支持：CA 为客户端证书，SVR 为服务器证书）。
    */
    @SerializedName("CertType")
    @Expose
    private String CertType;

    /**
    * 项目ID，详见用户指南的 [项目与标签](https://cloud.tencent.com/document/product/598/32738)。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 模块名称，应填 ssl。
    */
    @SerializedName("ModuleType")
    @Expose
    private String ModuleType;

    /**
    * 证书私钥，certType=SVR 时必填。
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 证书备注。
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
     * Get 证书内容。 
     * @return Cert 证书内容。
     */
    public String getCert() {
        return this.Cert;
    }

    /**
     * Set 证书内容。
     * @param Cert 证书内容。
     */
    public void setCert(String Cert) {
        this.Cert = Cert;
    }

    /**
     * Get 证书类型（目前支持：CA 为客户端证书，SVR 为服务器证书）。 
     * @return CertType 证书类型（目前支持：CA 为客户端证书，SVR 为服务器证书）。
     */
    public String getCertType() {
        return this.CertType;
    }

    /**
     * Set 证书类型（目前支持：CA 为客户端证书，SVR 为服务器证书）。
     * @param CertType 证书类型（目前支持：CA 为客户端证书，SVR 为服务器证书）。
     */
    public void setCertType(String CertType) {
        this.CertType = CertType;
    }

    /**
     * Get 项目ID，详见用户指南的 [项目与标签](https://cloud.tencent.com/document/product/598/32738)。 
     * @return ProjectId 项目ID，详见用户指南的 [项目与标签](https://cloud.tencent.com/document/product/598/32738)。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID，详见用户指南的 [项目与标签](https://cloud.tencent.com/document/product/598/32738)。
     * @param ProjectId 项目ID，详见用户指南的 [项目与标签](https://cloud.tencent.com/document/product/598/32738)。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 模块名称，应填 ssl。 
     * @return ModuleType 模块名称，应填 ssl。
     */
    public String getModuleType() {
        return this.ModuleType;
    }

    /**
     * Set 模块名称，应填 ssl。
     * @param ModuleType 模块名称，应填 ssl。
     */
    public void setModuleType(String ModuleType) {
        this.ModuleType = ModuleType;
    }

    /**
     * Get 证书私钥，certType=SVR 时必填。 
     * @return Key 证书私钥，certType=SVR 时必填。
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 证书私钥，certType=SVR 时必填。
     * @param Key 证书私钥，certType=SVR 时必填。
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 证书备注。 
     * @return Alias 证书备注。
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set 证书备注。
     * @param Alias 证书备注。
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Internal implementation, normal users should not use it.
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

