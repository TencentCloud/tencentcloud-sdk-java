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

public class RegisterDeviceCertificateRequest extends AbstractModel {

    /**
    * 腾讯云MQTT实例ID，从 [DescribeInstanceList](https://cloud.tencent.com/document/api/1778/111029)接口或控制台获得。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 设备证书内容，可参考 [使用 CA 证书生成服务端/客户端证书](https://cloud.tencent.com/document/product/1778/114817#aab79cc8-a148-412e-beb8-9c9e158eb944) 生成
    */
    @SerializedName("DeviceCertificate")
    @Expose
    private String DeviceCertificate;

    /**
    * 关联的CA证书SN
    */
    @SerializedName("CaSn")
    @Expose
    private String CaSn;

    /**
    * 客户端ID，需要关联该证书的客户端ID。根据实际业务使用填写
    */
    @SerializedName("ClientId")
    @Expose
    private String ClientId;

    /**
    * 证书格式，默认为PEM，当前仅支持PEM格式
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    *  客户端证书状态，默认激活状态（ACTIVE）
ACTIVE：激活     
INACTIVE：未激活     
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get 腾讯云MQTT实例ID，从 [DescribeInstanceList](https://cloud.tencent.com/document/api/1778/111029)接口或控制台获得。 
     * @return InstanceId 腾讯云MQTT实例ID，从 [DescribeInstanceList](https://cloud.tencent.com/document/api/1778/111029)接口或控制台获得。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 腾讯云MQTT实例ID，从 [DescribeInstanceList](https://cloud.tencent.com/document/api/1778/111029)接口或控制台获得。
     * @param InstanceId 腾讯云MQTT实例ID，从 [DescribeInstanceList](https://cloud.tencent.com/document/api/1778/111029)接口或控制台获得。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 设备证书内容，可参考 [使用 CA 证书生成服务端/客户端证书](https://cloud.tencent.com/document/product/1778/114817#aab79cc8-a148-412e-beb8-9c9e158eb944) 生成 
     * @return DeviceCertificate 设备证书内容，可参考 [使用 CA 证书生成服务端/客户端证书](https://cloud.tencent.com/document/product/1778/114817#aab79cc8-a148-412e-beb8-9c9e158eb944) 生成
     */
    public String getDeviceCertificate() {
        return this.DeviceCertificate;
    }

    /**
     * Set 设备证书内容，可参考 [使用 CA 证书生成服务端/客户端证书](https://cloud.tencent.com/document/product/1778/114817#aab79cc8-a148-412e-beb8-9c9e158eb944) 生成
     * @param DeviceCertificate 设备证书内容，可参考 [使用 CA 证书生成服务端/客户端证书](https://cloud.tencent.com/document/product/1778/114817#aab79cc8-a148-412e-beb8-9c9e158eb944) 生成
     */
    public void setDeviceCertificate(String DeviceCertificate) {
        this.DeviceCertificate = DeviceCertificate;
    }

    /**
     * Get 关联的CA证书SN 
     * @return CaSn 关联的CA证书SN
     */
    public String getCaSn() {
        return this.CaSn;
    }

    /**
     * Set 关联的CA证书SN
     * @param CaSn 关联的CA证书SN
     */
    public void setCaSn(String CaSn) {
        this.CaSn = CaSn;
    }

    /**
     * Get 客户端ID，需要关联该证书的客户端ID。根据实际业务使用填写 
     * @return ClientId 客户端ID，需要关联该证书的客户端ID。根据实际业务使用填写
     */
    public String getClientId() {
        return this.ClientId;
    }

    /**
     * Set 客户端ID，需要关联该证书的客户端ID。根据实际业务使用填写
     * @param ClientId 客户端ID，需要关联该证书的客户端ID。根据实际业务使用填写
     */
    public void setClientId(String ClientId) {
        this.ClientId = ClientId;
    }

    /**
     * Get 证书格式，默认为PEM，当前仅支持PEM格式 
     * @return Format 证书格式，默认为PEM，当前仅支持PEM格式
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set 证书格式，默认为PEM，当前仅支持PEM格式
     * @param Format 证书格式，默认为PEM，当前仅支持PEM格式
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get  客户端证书状态，默认激活状态（ACTIVE）
ACTIVE：激活     
INACTIVE：未激活      
     * @return Status  客户端证书状态，默认激活状态（ACTIVE）
ACTIVE：激活     
INACTIVE：未激活     
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set  客户端证书状态，默认激活状态（ACTIVE）
ACTIVE：激活     
INACTIVE：未激活     
     * @param Status  客户端证书状态，默认激活状态（ACTIVE）
ACTIVE：激活     
INACTIVE：未激活     
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public RegisterDeviceCertificateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegisterDeviceCertificateRequest(RegisterDeviceCertificateRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.DeviceCertificate != null) {
            this.DeviceCertificate = new String(source.DeviceCertificate);
        }
        if (source.CaSn != null) {
            this.CaSn = new String(source.CaSn);
        }
        if (source.ClientId != null) {
            this.ClientId = new String(source.ClientId);
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
        this.setParamSimple(map, prefix + "DeviceCertificate", this.DeviceCertificate);
        this.setParamSimple(map, prefix + "CaSn", this.CaSn);
        this.setParamSimple(map, prefix + "ClientId", this.ClientId);
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

