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

public class DescribeDeviceCertificateResponse extends AbstractModel {

    /**
    * 创建时间
    */
    @SerializedName("CreatedTime")
    @Expose
    private Long CreatedTime;

    /**
    * 上次更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * 证书失效日期
    */
    @SerializedName("NotAfterTime")
    @Expose
    private Long NotAfterTime;

    /**
    * 上次激活时间
    */
    @SerializedName("LastActivationTime")
    @Expose
    private Long LastActivationTime;

    /**
    * 上次取消激活时间
    */
    @SerializedName("LastInactivationTime")
    @Expose
    private Long LastInactivationTime;

    /**
    * 证书状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Ca证书序列号
    */
    @SerializedName("CaSn")
    @Expose
    private String CaSn;

    /**
    * 设备证书序列号
    */
    @SerializedName("DeviceCertificateSn")
    @Expose
    private String DeviceCertificateSn;

    /**
    * 设备证书内容
    */
    @SerializedName("DeviceCertificate")
    @Expose
    private String DeviceCertificate;

    /**
    * 设备证书common name
    */
    @SerializedName("DeviceCertificateCn")
    @Expose
    private String DeviceCertificateCn;

    /**
    * 证书格式
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * 客户端id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClientId")
    @Expose
    private String ClientId;

    /**
    *     API, 手动注册   
    JITP 自动注册
    */
    @SerializedName("CertificateSource")
    @Expose
    private String CertificateSource;

    /**
    * 证书生效开始时间
    */
    @SerializedName("NotBeforeTime")
    @Expose
    private Long NotBeforeTime;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 创建时间 
     * @return CreatedTime 创建时间
     */
    public Long getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间
     * @param CreatedTime 创建时间
     */
    public void setCreatedTime(Long CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 上次更新时间 
     * @return UpdateTime 上次更新时间
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 上次更新时间
     * @param UpdateTime 上次更新时间
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 证书失效日期 
     * @return NotAfterTime 证书失效日期
     */
    public Long getNotAfterTime() {
        return this.NotAfterTime;
    }

    /**
     * Set 证书失效日期
     * @param NotAfterTime 证书失效日期
     */
    public void setNotAfterTime(Long NotAfterTime) {
        this.NotAfterTime = NotAfterTime;
    }

    /**
     * Get 上次激活时间 
     * @return LastActivationTime 上次激活时间
     */
    public Long getLastActivationTime() {
        return this.LastActivationTime;
    }

    /**
     * Set 上次激活时间
     * @param LastActivationTime 上次激活时间
     */
    public void setLastActivationTime(Long LastActivationTime) {
        this.LastActivationTime = LastActivationTime;
    }

    /**
     * Get 上次取消激活时间 
     * @return LastInactivationTime 上次取消激活时间
     */
    public Long getLastInactivationTime() {
        return this.LastInactivationTime;
    }

    /**
     * Set 上次取消激活时间
     * @param LastInactivationTime 上次取消激活时间
     */
    public void setLastInactivationTime(Long LastInactivationTime) {
        this.LastInactivationTime = LastInactivationTime;
    }

    /**
     * Get 证书状态 
     * @return Status 证书状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 证书状态
     * @param Status 证书状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Ca证书序列号 
     * @return CaSn Ca证书序列号
     */
    public String getCaSn() {
        return this.CaSn;
    }

    /**
     * Set Ca证书序列号
     * @param CaSn Ca证书序列号
     */
    public void setCaSn(String CaSn) {
        this.CaSn = CaSn;
    }

    /**
     * Get 设备证书序列号 
     * @return DeviceCertificateSn 设备证书序列号
     */
    public String getDeviceCertificateSn() {
        return this.DeviceCertificateSn;
    }

    /**
     * Set 设备证书序列号
     * @param DeviceCertificateSn 设备证书序列号
     */
    public void setDeviceCertificateSn(String DeviceCertificateSn) {
        this.DeviceCertificateSn = DeviceCertificateSn;
    }

    /**
     * Get 设备证书内容 
     * @return DeviceCertificate 设备证书内容
     */
    public String getDeviceCertificate() {
        return this.DeviceCertificate;
    }

    /**
     * Set 设备证书内容
     * @param DeviceCertificate 设备证书内容
     */
    public void setDeviceCertificate(String DeviceCertificate) {
        this.DeviceCertificate = DeviceCertificate;
    }

    /**
     * Get 设备证书common name 
     * @return DeviceCertificateCn 设备证书common name
     */
    public String getDeviceCertificateCn() {
        return this.DeviceCertificateCn;
    }

    /**
     * Set 设备证书common name
     * @param DeviceCertificateCn 设备证书common name
     */
    public void setDeviceCertificateCn(String DeviceCertificateCn) {
        this.DeviceCertificateCn = DeviceCertificateCn;
    }

    /**
     * Get 证书格式 
     * @return Format 证书格式
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set 证书格式
     * @param Format 证书格式
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get 客户端id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClientId 客户端id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClientId() {
        return this.ClientId;
    }

    /**
     * Set 客户端id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClientId 客户端id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClientId(String ClientId) {
        this.ClientId = ClientId;
    }

    /**
     * Get     API, 手动注册   
    JITP 自动注册 
     * @return CertificateSource     API, 手动注册   
    JITP 自动注册
     */
    public String getCertificateSource() {
        return this.CertificateSource;
    }

    /**
     * Set     API, 手动注册   
    JITP 自动注册
     * @param CertificateSource     API, 手动注册   
    JITP 自动注册
     */
    public void setCertificateSource(String CertificateSource) {
        this.CertificateSource = CertificateSource;
    }

    /**
     * Get 证书生效开始时间 
     * @return NotBeforeTime 证书生效开始时间
     */
    public Long getNotBeforeTime() {
        return this.NotBeforeTime;
    }

    /**
     * Set 证书生效开始时间
     * @param NotBeforeTime 证书生效开始时间
     */
    public void setNotBeforeTime(Long NotBeforeTime) {
        this.NotBeforeTime = NotBeforeTime;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeDeviceCertificateResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDeviceCertificateResponse(DescribeDeviceCertificateResponse source) {
        if (source.CreatedTime != null) {
            this.CreatedTime = new Long(source.CreatedTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.NotAfterTime != null) {
            this.NotAfterTime = new Long(source.NotAfterTime);
        }
        if (source.LastActivationTime != null) {
            this.LastActivationTime = new Long(source.LastActivationTime);
        }
        if (source.LastInactivationTime != null) {
            this.LastInactivationTime = new Long(source.LastInactivationTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CaSn != null) {
            this.CaSn = new String(source.CaSn);
        }
        if (source.DeviceCertificateSn != null) {
            this.DeviceCertificateSn = new String(source.DeviceCertificateSn);
        }
        if (source.DeviceCertificate != null) {
            this.DeviceCertificate = new String(source.DeviceCertificate);
        }
        if (source.DeviceCertificateCn != null) {
            this.DeviceCertificateCn = new String(source.DeviceCertificateCn);
        }
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
        if (source.ClientId != null) {
            this.ClientId = new String(source.ClientId);
        }
        if (source.CertificateSource != null) {
            this.CertificateSource = new String(source.CertificateSource);
        }
        if (source.NotBeforeTime != null) {
            this.NotBeforeTime = new Long(source.NotBeforeTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "NotAfterTime", this.NotAfterTime);
        this.setParamSimple(map, prefix + "LastActivationTime", this.LastActivationTime);
        this.setParamSimple(map, prefix + "LastInactivationTime", this.LastInactivationTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CaSn", this.CaSn);
        this.setParamSimple(map, prefix + "DeviceCertificateSn", this.DeviceCertificateSn);
        this.setParamSimple(map, prefix + "DeviceCertificate", this.DeviceCertificate);
        this.setParamSimple(map, prefix + "DeviceCertificateCn", this.DeviceCertificateCn);
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamSimple(map, prefix + "ClientId", this.ClientId);
        this.setParamSimple(map, prefix + "CertificateSource", this.CertificateSource);
        this.setParamSimple(map, prefix + "NotBeforeTime", this.NotBeforeTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

