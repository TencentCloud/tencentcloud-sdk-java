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

public class DeviceCertificateItem extends AbstractModel {

    /**
    * 客户端id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClientId")
    @Expose
    private String ClientId;

    /**
    * 设备证书
    */
    @SerializedName("DeviceCertificate")
    @Expose
    private String DeviceCertificate;

    /**
    * 设备证书Sn
    */
    @SerializedName("DeviceCertificateSn")
    @Expose
    private String DeviceCertificateSn;

    /**
    * 设备证书Cn
    */
    @SerializedName("DeviceCertificateCn")
    @Expose
    private String DeviceCertificateCn;

    /**
    * 签发ca的序列号
    */
    @SerializedName("CaSn")
    @Expose
    private String CaSn;

    /**
    * 证书格式
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * 证书状态
    ACTIVE,//激活
    INACTIVE,//未激活
    REVOKED,//吊销
    PENDING_ACTIVATION,//注册待激活
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 上次激活时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastActivationTime")
    @Expose
    private Long LastActivationTime;

    /**
    * 上次取消激活时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastInactivationTime")
    @Expose
    private Long LastInactivationTime;

    /**
    * 创建时间
    */
    @SerializedName("CreatedTime")
    @Expose
    private Long CreatedTime;

    /**
    * 预销毁时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * 证书来源：
API, 手动注册   
JITP 自动注册
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CertificateSource")
    @Expose
    private String CertificateSource;

    /**
    * 证书失效日期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NotAfterTime")
    @Expose
    private Long NotAfterTime;

    /**
    * 证书生效开始日期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NotBeforeTime")
    @Expose
    private Long NotBeforeTime;

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
     * Get 设备证书 
     * @return DeviceCertificate 设备证书
     */
    public String getDeviceCertificate() {
        return this.DeviceCertificate;
    }

    /**
     * Set 设备证书
     * @param DeviceCertificate 设备证书
     */
    public void setDeviceCertificate(String DeviceCertificate) {
        this.DeviceCertificate = DeviceCertificate;
    }

    /**
     * Get 设备证书Sn 
     * @return DeviceCertificateSn 设备证书Sn
     */
    public String getDeviceCertificateSn() {
        return this.DeviceCertificateSn;
    }

    /**
     * Set 设备证书Sn
     * @param DeviceCertificateSn 设备证书Sn
     */
    public void setDeviceCertificateSn(String DeviceCertificateSn) {
        this.DeviceCertificateSn = DeviceCertificateSn;
    }

    /**
     * Get 设备证书Cn 
     * @return DeviceCertificateCn 设备证书Cn
     */
    public String getDeviceCertificateCn() {
        return this.DeviceCertificateCn;
    }

    /**
     * Set 设备证书Cn
     * @param DeviceCertificateCn 设备证书Cn
     */
    public void setDeviceCertificateCn(String DeviceCertificateCn) {
        this.DeviceCertificateCn = DeviceCertificateCn;
    }

    /**
     * Get 签发ca的序列号 
     * @return CaSn 签发ca的序列号
     */
    public String getCaSn() {
        return this.CaSn;
    }

    /**
     * Set 签发ca的序列号
     * @param CaSn 签发ca的序列号
     */
    public void setCaSn(String CaSn) {
        this.CaSn = CaSn;
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
     * Get 证书状态
    ACTIVE,//激活
    INACTIVE,//未激活
    REVOKED,//吊销
    PENDING_ACTIVATION,//注册待激活 
     * @return Status 证书状态
    ACTIVE,//激活
    INACTIVE,//未激活
    REVOKED,//吊销
    PENDING_ACTIVATION,//注册待激活
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 证书状态
    ACTIVE,//激活
    INACTIVE,//未激活
    REVOKED,//吊销
    PENDING_ACTIVATION,//注册待激活
     * @param Status 证书状态
    ACTIVE,//激活
    INACTIVE,//未激活
    REVOKED,//吊销
    PENDING_ACTIVATION,//注册待激活
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 上次激活时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastActivationTime 上次激活时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLastActivationTime() {
        return this.LastActivationTime;
    }

    /**
     * Set 上次激活时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastActivationTime 上次激活时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastActivationTime(Long LastActivationTime) {
        this.LastActivationTime = LastActivationTime;
    }

    /**
     * Get 上次取消激活时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastInactivationTime 上次取消激活时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLastInactivationTime() {
        return this.LastInactivationTime;
    }

    /**
     * Set 上次取消激活时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastInactivationTime 上次取消激活时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastInactivationTime(Long LastInactivationTime) {
        this.LastInactivationTime = LastInactivationTime;
    }

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
     * Get 预销毁时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 预销毁时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 预销毁时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 预销毁时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 证书来源：
API, 手动注册   
JITP 自动注册
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CertificateSource 证书来源：
API, 手动注册   
JITP 自动注册
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCertificateSource() {
        return this.CertificateSource;
    }

    /**
     * Set 证书来源：
API, 手动注册   
JITP 自动注册
注意：此字段可能返回 null，表示取不到有效值。
     * @param CertificateSource 证书来源：
API, 手动注册   
JITP 自动注册
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCertificateSource(String CertificateSource) {
        this.CertificateSource = CertificateSource;
    }

    /**
     * Get 证书失效日期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NotAfterTime 证书失效日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNotAfterTime() {
        return this.NotAfterTime;
    }

    /**
     * Set 证书失效日期
注意：此字段可能返回 null，表示取不到有效值。
     * @param NotAfterTime 证书失效日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNotAfterTime(Long NotAfterTime) {
        this.NotAfterTime = NotAfterTime;
    }

    /**
     * Get 证书生效开始日期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NotBeforeTime 证书生效开始日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNotBeforeTime() {
        return this.NotBeforeTime;
    }

    /**
     * Set 证书生效开始日期
注意：此字段可能返回 null，表示取不到有效值。
     * @param NotBeforeTime 证书生效开始日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNotBeforeTime(Long NotBeforeTime) {
        this.NotBeforeTime = NotBeforeTime;
    }

    public DeviceCertificateItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeviceCertificateItem(DeviceCertificateItem source) {
        if (source.ClientId != null) {
            this.ClientId = new String(source.ClientId);
        }
        if (source.DeviceCertificate != null) {
            this.DeviceCertificate = new String(source.DeviceCertificate);
        }
        if (source.DeviceCertificateSn != null) {
            this.DeviceCertificateSn = new String(source.DeviceCertificateSn);
        }
        if (source.DeviceCertificateCn != null) {
            this.DeviceCertificateCn = new String(source.DeviceCertificateCn);
        }
        if (source.CaSn != null) {
            this.CaSn = new String(source.CaSn);
        }
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.LastActivationTime != null) {
            this.LastActivationTime = new Long(source.LastActivationTime);
        }
        if (source.LastInactivationTime != null) {
            this.LastInactivationTime = new Long(source.LastInactivationTime);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new Long(source.CreatedTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.CertificateSource != null) {
            this.CertificateSource = new String(source.CertificateSource);
        }
        if (source.NotAfterTime != null) {
            this.NotAfterTime = new Long(source.NotAfterTime);
        }
        if (source.NotBeforeTime != null) {
            this.NotBeforeTime = new Long(source.NotBeforeTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClientId", this.ClientId);
        this.setParamSimple(map, prefix + "DeviceCertificate", this.DeviceCertificate);
        this.setParamSimple(map, prefix + "DeviceCertificateSn", this.DeviceCertificateSn);
        this.setParamSimple(map, prefix + "DeviceCertificateCn", this.DeviceCertificateCn);
        this.setParamSimple(map, prefix + "CaSn", this.CaSn);
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "LastActivationTime", this.LastActivationTime);
        this.setParamSimple(map, prefix + "LastInactivationTime", this.LastInactivationTime);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "CertificateSource", this.CertificateSource);
        this.setParamSimple(map, prefix + "NotAfterTime", this.NotAfterTime);
        this.setParamSimple(map, prefix + "NotBeforeTime", this.NotBeforeTime);

    }
}

