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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CertInfo extends AbstractModel{

    /**
    * 证书 ID，如果不填写此项则必须上传证书内容，包括CertName, CertContent，若为服务端证书必须包含CertKey。
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
    * 上传证书的名称，如果没有 CertId，则此项必传。
    */
    @SerializedName("CertName")
    @Expose
    private String CertName;

    /**
    * 上传证书的公钥，如果没有 CertId，则此项必传。
    */
    @SerializedName("CertContent")
    @Expose
    private String CertContent;

    /**
    * 上传服务端证书的私钥，如果没有 CertId，则此项必传。
    */
    @SerializedName("CertKey")
    @Expose
    private String CertKey;

    /**
     * Get 证书 ID，如果不填写此项则必须上传证书内容，包括CertName, CertContent，若为服务端证书必须包含CertKey。 
     * @return CertId 证书 ID，如果不填写此项则必须上传证书内容，包括CertName, CertContent，若为服务端证书必须包含CertKey。
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set 证书 ID，如果不填写此项则必须上传证书内容，包括CertName, CertContent，若为服务端证书必须包含CertKey。
     * @param CertId 证书 ID，如果不填写此项则必须上传证书内容，包括CertName, CertContent，若为服务端证书必须包含CertKey。
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    /**
     * Get 上传证书的名称，如果没有 CertId，则此项必传。 
     * @return CertName 上传证书的名称，如果没有 CertId，则此项必传。
     */
    public String getCertName() {
        return this.CertName;
    }

    /**
     * Set 上传证书的名称，如果没有 CertId，则此项必传。
     * @param CertName 上传证书的名称，如果没有 CertId，则此项必传。
     */
    public void setCertName(String CertName) {
        this.CertName = CertName;
    }

    /**
     * Get 上传证书的公钥，如果没有 CertId，则此项必传。 
     * @return CertContent 上传证书的公钥，如果没有 CertId，则此项必传。
     */
    public String getCertContent() {
        return this.CertContent;
    }

    /**
     * Set 上传证书的公钥，如果没有 CertId，则此项必传。
     * @param CertContent 上传证书的公钥，如果没有 CertId，则此项必传。
     */
    public void setCertContent(String CertContent) {
        this.CertContent = CertContent;
    }

    /**
     * Get 上传服务端证书的私钥，如果没有 CertId，则此项必传。 
     * @return CertKey 上传服务端证书的私钥，如果没有 CertId，则此项必传。
     */
    public String getCertKey() {
        return this.CertKey;
    }

    /**
     * Set 上传服务端证书的私钥，如果没有 CertId，则此项必传。
     * @param CertKey 上传服务端证书的私钥，如果没有 CertId，则此项必传。
     */
    public void setCertKey(String CertKey) {
        this.CertKey = CertKey;
    }

    public CertInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CertInfo(CertInfo source) {
        if (source.CertId != null) {
            this.CertId = new String(source.CertId);
        }
        if (source.CertName != null) {
            this.CertName = new String(source.CertName);
        }
        if (source.CertContent != null) {
            this.CertContent = new String(source.CertContent);
        }
        if (source.CertKey != null) {
            this.CertKey = new String(source.CertKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamSimple(map, prefix + "CertName", this.CertName);
        this.setParamSimple(map, prefix + "CertContent", this.CertContent);
        this.setParamSimple(map, prefix + "CertKey", this.CertKey);

    }
}

