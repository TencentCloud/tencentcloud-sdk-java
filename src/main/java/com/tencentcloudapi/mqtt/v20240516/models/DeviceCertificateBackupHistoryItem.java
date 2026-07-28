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

public class DeviceCertificateBackupHistoryItem extends AbstractModel {

    /**
    * <p>客户端id</p>
    */
    @SerializedName("ClientId")
    @Expose
    private String ClientId;

    /**
    * <p>设备证书</p>
    */
    @SerializedName("DeviceCertificate")
    @Expose
    private String DeviceCertificate;

    /**
    * <p>设备证书SN序列号，用于唯一标识一个设备证书</p>
    */
    @SerializedName("DeviceCertificateSn")
    @Expose
    private String DeviceCertificateSn;

    /**
    * <p>设备证书Cn</p>
    */
    @SerializedName("DeviceCertificateCn")
    @Expose
    private String DeviceCertificateCn;

    /**
    * <p>签发该证书的CA证书的序列号</p>
    */
    @SerializedName("CaSn")
    @Expose
    private String CaSn;

    /**
    * <p>证书格式，当前仅支持PEM</p>
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * <p>设备证书状态<br>    ACTIVE：激活<br>    INACTIVE：未激活<br>    REVOKED：吊销<br>    PENDING_ACTIVATION：注册待激活</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>组织单位</p>
    */
    @SerializedName("OrganizationalUnit")
    @Expose
    private String OrganizationalUnit;

    /**
    * <p>上次激活时间，毫秒级时间戳 。</p>
    */
    @SerializedName("LastActivationTime")
    @Expose
    private Long LastActivationTime;

    /**
    * <p>上次取消激活时间，毫秒级时间戳 。</p>
    */
    @SerializedName("LastInactivationTime")
    @Expose
    private Long LastInactivationTime;

    /**
    * <p>证书来源：<br>API, 手动注册<br>JITP 自动注册</p>
    */
    @SerializedName("CertificateSource")
    @Expose
    private String CertificateSource;

    /**
    * <p>证书失效日期，毫秒级时间戳 。</p>
    */
    @SerializedName("NotAfterTime")
    @Expose
    private Long NotAfterTime;

    /**
    * <p>证书生效开始日期，毫秒级时间戳 。</p>
    */
    @SerializedName("NotBeforeTime")
    @Expose
    private Long NotBeforeTime;

    /**
    * <p>数据来源</p>
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * <p>修改时间</p><p>单位：毫秒级时间戳</p>
    */
    @SerializedName("ModificationTime")
    @Expose
    private Long ModificationTime;

    /**
     * Get <p>客户端id</p> 
     * @return ClientId <p>客户端id</p>
     */
    public String getClientId() {
        return this.ClientId;
    }

    /**
     * Set <p>客户端id</p>
     * @param ClientId <p>客户端id</p>
     */
    public void setClientId(String ClientId) {
        this.ClientId = ClientId;
    }

    /**
     * Get <p>设备证书</p> 
     * @return DeviceCertificate <p>设备证书</p>
     */
    public String getDeviceCertificate() {
        return this.DeviceCertificate;
    }

    /**
     * Set <p>设备证书</p>
     * @param DeviceCertificate <p>设备证书</p>
     */
    public void setDeviceCertificate(String DeviceCertificate) {
        this.DeviceCertificate = DeviceCertificate;
    }

    /**
     * Get <p>设备证书SN序列号，用于唯一标识一个设备证书</p> 
     * @return DeviceCertificateSn <p>设备证书SN序列号，用于唯一标识一个设备证书</p>
     */
    public String getDeviceCertificateSn() {
        return this.DeviceCertificateSn;
    }

    /**
     * Set <p>设备证书SN序列号，用于唯一标识一个设备证书</p>
     * @param DeviceCertificateSn <p>设备证书SN序列号，用于唯一标识一个设备证书</p>
     */
    public void setDeviceCertificateSn(String DeviceCertificateSn) {
        this.DeviceCertificateSn = DeviceCertificateSn;
    }

    /**
     * Get <p>设备证书Cn</p> 
     * @return DeviceCertificateCn <p>设备证书Cn</p>
     */
    public String getDeviceCertificateCn() {
        return this.DeviceCertificateCn;
    }

    /**
     * Set <p>设备证书Cn</p>
     * @param DeviceCertificateCn <p>设备证书Cn</p>
     */
    public void setDeviceCertificateCn(String DeviceCertificateCn) {
        this.DeviceCertificateCn = DeviceCertificateCn;
    }

    /**
     * Get <p>签发该证书的CA证书的序列号</p> 
     * @return CaSn <p>签发该证书的CA证书的序列号</p>
     */
    public String getCaSn() {
        return this.CaSn;
    }

    /**
     * Set <p>签发该证书的CA证书的序列号</p>
     * @param CaSn <p>签发该证书的CA证书的序列号</p>
     */
    public void setCaSn(String CaSn) {
        this.CaSn = CaSn;
    }

    /**
     * Get <p>证书格式，当前仅支持PEM</p> 
     * @return Format <p>证书格式，当前仅支持PEM</p>
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set <p>证书格式，当前仅支持PEM</p>
     * @param Format <p>证书格式，当前仅支持PEM</p>
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get <p>设备证书状态<br>    ACTIVE：激活<br>    INACTIVE：未激活<br>    REVOKED：吊销<br>    PENDING_ACTIVATION：注册待激活</p> 
     * @return Status <p>设备证书状态<br>    ACTIVE：激活<br>    INACTIVE：未激活<br>    REVOKED：吊销<br>    PENDING_ACTIVATION：注册待激活</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>设备证书状态<br>    ACTIVE：激活<br>    INACTIVE：未激活<br>    REVOKED：吊销<br>    PENDING_ACTIVATION：注册待激活</p>
     * @param Status <p>设备证书状态<br>    ACTIVE：激活<br>    INACTIVE：未激活<br>    REVOKED：吊销<br>    PENDING_ACTIVATION：注册待激活</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>组织单位</p> 
     * @return OrganizationalUnit <p>组织单位</p>
     */
    public String getOrganizationalUnit() {
        return this.OrganizationalUnit;
    }

    /**
     * Set <p>组织单位</p>
     * @param OrganizationalUnit <p>组织单位</p>
     */
    public void setOrganizationalUnit(String OrganizationalUnit) {
        this.OrganizationalUnit = OrganizationalUnit;
    }

    /**
     * Get <p>上次激活时间，毫秒级时间戳 。</p> 
     * @return LastActivationTime <p>上次激活时间，毫秒级时间戳 。</p>
     */
    public Long getLastActivationTime() {
        return this.LastActivationTime;
    }

    /**
     * Set <p>上次激活时间，毫秒级时间戳 。</p>
     * @param LastActivationTime <p>上次激活时间，毫秒级时间戳 。</p>
     */
    public void setLastActivationTime(Long LastActivationTime) {
        this.LastActivationTime = LastActivationTime;
    }

    /**
     * Get <p>上次取消激活时间，毫秒级时间戳 。</p> 
     * @return LastInactivationTime <p>上次取消激活时间，毫秒级时间戳 。</p>
     */
    public Long getLastInactivationTime() {
        return this.LastInactivationTime;
    }

    /**
     * Set <p>上次取消激活时间，毫秒级时间戳 。</p>
     * @param LastInactivationTime <p>上次取消激活时间，毫秒级时间戳 。</p>
     */
    public void setLastInactivationTime(Long LastInactivationTime) {
        this.LastInactivationTime = LastInactivationTime;
    }

    /**
     * Get <p>证书来源：<br>API, 手动注册<br>JITP 自动注册</p> 
     * @return CertificateSource <p>证书来源：<br>API, 手动注册<br>JITP 自动注册</p>
     */
    public String getCertificateSource() {
        return this.CertificateSource;
    }

    /**
     * Set <p>证书来源：<br>API, 手动注册<br>JITP 自动注册</p>
     * @param CertificateSource <p>证书来源：<br>API, 手动注册<br>JITP 自动注册</p>
     */
    public void setCertificateSource(String CertificateSource) {
        this.CertificateSource = CertificateSource;
    }

    /**
     * Get <p>证书失效日期，毫秒级时间戳 。</p> 
     * @return NotAfterTime <p>证书失效日期，毫秒级时间戳 。</p>
     */
    public Long getNotAfterTime() {
        return this.NotAfterTime;
    }

    /**
     * Set <p>证书失效日期，毫秒级时间戳 。</p>
     * @param NotAfterTime <p>证书失效日期，毫秒级时间戳 。</p>
     */
    public void setNotAfterTime(Long NotAfterTime) {
        this.NotAfterTime = NotAfterTime;
    }

    /**
     * Get <p>证书生效开始日期，毫秒级时间戳 。</p> 
     * @return NotBeforeTime <p>证书生效开始日期，毫秒级时间戳 。</p>
     */
    public Long getNotBeforeTime() {
        return this.NotBeforeTime;
    }

    /**
     * Set <p>证书生效开始日期，毫秒级时间戳 。</p>
     * @param NotBeforeTime <p>证书生效开始日期，毫秒级时间戳 。</p>
     */
    public void setNotBeforeTime(Long NotBeforeTime) {
        this.NotBeforeTime = NotBeforeTime;
    }

    /**
     * Get <p>数据来源</p> 
     * @return Source <p>数据来源</p>
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set <p>数据来源</p>
     * @param Source <p>数据来源</p>
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get <p>修改时间</p><p>单位：毫秒级时间戳</p> 
     * @return ModificationTime <p>修改时间</p><p>单位：毫秒级时间戳</p>
     */
    public Long getModificationTime() {
        return this.ModificationTime;
    }

    /**
     * Set <p>修改时间</p><p>单位：毫秒级时间戳</p>
     * @param ModificationTime <p>修改时间</p><p>单位：毫秒级时间戳</p>
     */
    public void setModificationTime(Long ModificationTime) {
        this.ModificationTime = ModificationTime;
    }

    public DeviceCertificateBackupHistoryItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeviceCertificateBackupHistoryItem(DeviceCertificateBackupHistoryItem source) {
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
        if (source.OrganizationalUnit != null) {
            this.OrganizationalUnit = new String(source.OrganizationalUnit);
        }
        if (source.LastActivationTime != null) {
            this.LastActivationTime = new Long(source.LastActivationTime);
        }
        if (source.LastInactivationTime != null) {
            this.LastInactivationTime = new Long(source.LastInactivationTime);
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
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.ModificationTime != null) {
            this.ModificationTime = new Long(source.ModificationTime);
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
        this.setParamSimple(map, prefix + "OrganizationalUnit", this.OrganizationalUnit);
        this.setParamSimple(map, prefix + "LastActivationTime", this.LastActivationTime);
        this.setParamSimple(map, prefix + "LastInactivationTime", this.LastInactivationTime);
        this.setParamSimple(map, prefix + "CertificateSource", this.CertificateSource);
        this.setParamSimple(map, prefix + "NotAfterTime", this.NotAfterTime);
        this.setParamSimple(map, prefix + "NotBeforeTime", this.NotBeforeTime);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "ModificationTime", this.ModificationTime);

    }
}

