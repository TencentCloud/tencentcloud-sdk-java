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
package com.tencentcloudapi.mqtt.v20240516.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegisterCaCertificateRequest extends AbstractModel {

    /**
    * 集群id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * CA证书
    */
    @SerializedName("CaCertificate")
    @Expose
    private String CaCertificate;

    /**
    * 验证证书
    */
    @SerializedName("VerificationCertificate")
    @Expose
    private String VerificationCertificate;

    /**
    * 证书格式，不传默认PEM格式
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * 证书状态，不传默认ACTIVE状态
    ACTIVE,//激活
    INACTIVE,//未激活
    REVOKED,//吊销
    PENDING_ACTIVATION,//注册待激活
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get 集群id 
     * @return InstanceId 集群id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 集群id
     * @param InstanceId 集群id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get CA证书 
     * @return CaCertificate CA证书
     */
    public String getCaCertificate() {
        return this.CaCertificate;
    }

    /**
     * Set CA证书
     * @param CaCertificate CA证书
     */
    public void setCaCertificate(String CaCertificate) {
        this.CaCertificate = CaCertificate;
    }

    /**
     * Get 验证证书 
     * @return VerificationCertificate 验证证书
     */
    public String getVerificationCertificate() {
        return this.VerificationCertificate;
    }

    /**
     * Set 验证证书
     * @param VerificationCertificate 验证证书
     */
    public void setVerificationCertificate(String VerificationCertificate) {
        this.VerificationCertificate = VerificationCertificate;
    }

    /**
     * Get 证书格式，不传默认PEM格式 
     * @return Format 证书格式，不传默认PEM格式
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set 证书格式，不传默认PEM格式
     * @param Format 证书格式，不传默认PEM格式
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get 证书状态，不传默认ACTIVE状态
    ACTIVE,//激活
    INACTIVE,//未激活
    REVOKED,//吊销
    PENDING_ACTIVATION,//注册待激活 
     * @return Status 证书状态，不传默认ACTIVE状态
    ACTIVE,//激活
    INACTIVE,//未激活
    REVOKED,//吊销
    PENDING_ACTIVATION,//注册待激活
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 证书状态，不传默认ACTIVE状态
    ACTIVE,//激活
    INACTIVE,//未激活
    REVOKED,//吊销
    PENDING_ACTIVATION,//注册待激活
     * @param Status 证书状态，不传默认ACTIVE状态
    ACTIVE,//激活
    INACTIVE,//未激活
    REVOKED,//吊销
    PENDING_ACTIVATION,//注册待激活
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public RegisterCaCertificateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegisterCaCertificateRequest(RegisterCaCertificateRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.CaCertificate != null) {
            this.CaCertificate = new String(source.CaCertificate);
        }
        if (source.VerificationCertificate != null) {
            this.VerificationCertificate = new String(source.VerificationCertificate);
        }
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "CaCertificate", this.CaCertificate);
        this.setParamSimple(map, prefix + "VerificationCertificate", this.VerificationCertificate);
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

