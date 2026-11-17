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
package com.tencentcloudapi.mqtt.v20240516.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegisterCaCertificateRequest extends AbstractModel {

    /**
    * <p>腾讯云MQTT实例ID，从 <a href="https://cloud.tencent.com/document/api/1778/111029">DescribeInstanceList</a>接口或控制台获得。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>CA证书内容</p>
    */
    @SerializedName("CaCertificate")
    @Expose
    private String CaCertificate;

    /**
    * <p>验证证书内容</p>
    */
    @SerializedName("VerificationCertificate")
    @Expose
    private String VerificationCertificate;

    /**
    * <p>证书格式，不传默认PEM格式，当前仅支持PEM格式</p>
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * <p>证书状态，不传默认ACTIVE状态<br>    ACTIVE：激活<br>    INACTIVE：未激活</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get <p>腾讯云MQTT实例ID，从 <a href="https://cloud.tencent.com/document/api/1778/111029">DescribeInstanceList</a>接口或控制台获得。</p> 
     * @return InstanceId <p>腾讯云MQTT实例ID，从 <a href="https://cloud.tencent.com/document/api/1778/111029">DescribeInstanceList</a>接口或控制台获得。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>腾讯云MQTT实例ID，从 <a href="https://cloud.tencent.com/document/api/1778/111029">DescribeInstanceList</a>接口或控制台获得。</p>
     * @param InstanceId <p>腾讯云MQTT实例ID，从 <a href="https://cloud.tencent.com/document/api/1778/111029">DescribeInstanceList</a>接口或控制台获得。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>CA证书内容</p> 
     * @return CaCertificate <p>CA证书内容</p>
     */
    public String getCaCertificate() {
        return this.CaCertificate;
    }

    /**
     * Set <p>CA证书内容</p>
     * @param CaCertificate <p>CA证书内容</p>
     */
    public void setCaCertificate(String CaCertificate) {
        this.CaCertificate = CaCertificate;
    }

    /**
     * Get <p>验证证书内容</p> 
     * @return VerificationCertificate <p>验证证书内容</p>
     */
    public String getVerificationCertificate() {
        return this.VerificationCertificate;
    }

    /**
     * Set <p>验证证书内容</p>
     * @param VerificationCertificate <p>验证证书内容</p>
     */
    public void setVerificationCertificate(String VerificationCertificate) {
        this.VerificationCertificate = VerificationCertificate;
    }

    /**
     * Get <p>证书格式，不传默认PEM格式，当前仅支持PEM格式</p> 
     * @return Format <p>证书格式，不传默认PEM格式，当前仅支持PEM格式</p>
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set <p>证书格式，不传默认PEM格式，当前仅支持PEM格式</p>
     * @param Format <p>证书格式，不传默认PEM格式，当前仅支持PEM格式</p>
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get <p>证书状态，不传默认ACTIVE状态<br>    ACTIVE：激活<br>    INACTIVE：未激活</p> 
     * @return Status <p>证书状态，不传默认ACTIVE状态<br>    ACTIVE：激活<br>    INACTIVE：未激活</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>证书状态，不传默认ACTIVE状态<br>    ACTIVE：激活<br>    INACTIVE：未激活</p>
     * @param Status <p>证书状态，不传默认ACTIVE状态<br>    ACTIVE：激活<br>    INACTIVE：未激活</p>
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

