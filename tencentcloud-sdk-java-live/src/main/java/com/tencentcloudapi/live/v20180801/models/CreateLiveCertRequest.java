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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateLiveCertRequest extends AbstractModel{

    /**
    * 证书类型。0-用户添加证书；1-腾讯云托管证书。
注意：当证书类型为0时，HttpsCrt和HttpsKey必选；
当证书类型为1时，优先使用CloudCertId对应证书，若CloudCertId为空则使用HttpsCrt和HttpsKey。
    */
    @SerializedName("CertType")
    @Expose
    private Long CertType;

    /**
    * 证书名称。
    */
    @SerializedName("CertName")
    @Expose
    private String CertName;

    /**
    * 证书内容，即公钥。
    */
    @SerializedName("HttpsCrt")
    @Expose
    private String HttpsCrt;

    /**
    * 私钥。
    */
    @SerializedName("HttpsKey")
    @Expose
    private String HttpsKey;

    /**
    * 描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 腾讯云证书托管ID。
    */
    @SerializedName("CloudCertId")
    @Expose
    private String CloudCertId;

    /**
     * Get 证书类型。0-用户添加证书；1-腾讯云托管证书。
注意：当证书类型为0时，HttpsCrt和HttpsKey必选；
当证书类型为1时，优先使用CloudCertId对应证书，若CloudCertId为空则使用HttpsCrt和HttpsKey。 
     * @return CertType 证书类型。0-用户添加证书；1-腾讯云托管证书。
注意：当证书类型为0时，HttpsCrt和HttpsKey必选；
当证书类型为1时，优先使用CloudCertId对应证书，若CloudCertId为空则使用HttpsCrt和HttpsKey。
     */
    public Long getCertType() {
        return this.CertType;
    }

    /**
     * Set 证书类型。0-用户添加证书；1-腾讯云托管证书。
注意：当证书类型为0时，HttpsCrt和HttpsKey必选；
当证书类型为1时，优先使用CloudCertId对应证书，若CloudCertId为空则使用HttpsCrt和HttpsKey。
     * @param CertType 证书类型。0-用户添加证书；1-腾讯云托管证书。
注意：当证书类型为0时，HttpsCrt和HttpsKey必选；
当证书类型为1时，优先使用CloudCertId对应证书，若CloudCertId为空则使用HttpsCrt和HttpsKey。
     */
    public void setCertType(Long CertType) {
        this.CertType = CertType;
    }

    /**
     * Get 证书名称。 
     * @return CertName 证书名称。
     */
    public String getCertName() {
        return this.CertName;
    }

    /**
     * Set 证书名称。
     * @param CertName 证书名称。
     */
    public void setCertName(String CertName) {
        this.CertName = CertName;
    }

    /**
     * Get 证书内容，即公钥。 
     * @return HttpsCrt 证书内容，即公钥。
     */
    public String getHttpsCrt() {
        return this.HttpsCrt;
    }

    /**
     * Set 证书内容，即公钥。
     * @param HttpsCrt 证书内容，即公钥。
     */
    public void setHttpsCrt(String HttpsCrt) {
        this.HttpsCrt = HttpsCrt;
    }

    /**
     * Get 私钥。 
     * @return HttpsKey 私钥。
     */
    public String getHttpsKey() {
        return this.HttpsKey;
    }

    /**
     * Set 私钥。
     * @param HttpsKey 私钥。
     */
    public void setHttpsKey(String HttpsKey) {
        this.HttpsKey = HttpsKey;
    }

    /**
     * Get 描述。 
     * @return Description 描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述。
     * @param Description 描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 腾讯云证书托管ID。 
     * @return CloudCertId 腾讯云证书托管ID。
     */
    public String getCloudCertId() {
        return this.CloudCertId;
    }

    /**
     * Set 腾讯云证书托管ID。
     * @param CloudCertId 腾讯云证书托管ID。
     */
    public void setCloudCertId(String CloudCertId) {
        this.CloudCertId = CloudCertId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CertType", this.CertType);
        this.setParamSimple(map, prefix + "CertName", this.CertName);
        this.setParamSimple(map, prefix + "HttpsCrt", this.HttpsCrt);
        this.setParamSimple(map, prefix + "HttpsKey", this.HttpsKey);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CloudCertId", this.CloudCertId);

    }
}

