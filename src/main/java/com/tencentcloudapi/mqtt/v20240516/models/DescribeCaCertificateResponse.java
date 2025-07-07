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

public class DescribeCaCertificateResponse extends AbstractModel {

    /**
    * 创建时间，毫秒级时间戳 。
    */
    @SerializedName("CreatedTime")
    @Expose
    private Long CreatedTime;

    /**
    * 上次更新时间，毫秒级时间戳 。
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * 失效日期，毫秒级时间戳 。
    */
    @SerializedName("NotAfterTime")
    @Expose
    private Long NotAfterTime;

    /**
    * 上次激活时间，毫秒级时间戳 。
    */
    @SerializedName("LastActivationTime")
    @Expose
    private Long LastActivationTime;

    /**
    * 上次吊销时间，毫秒级时间戳 。
    */
    @SerializedName("LastInactivationTime")
    @Expose
    private Long LastInactivationTime;

    /**
    * CA证书状态
 ACTIVE：激活
INACTIVE：未激活

    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 证书序列号
    */
    @SerializedName("CaSn")
    @Expose
    private String CaSn;

    /**
    * 证书的CN（Common Name），证书中用于标识主体的名称，通常是域名或组织名称
    */
    @SerializedName("CaCn")
    @Expose
    private String CaCn;

    /**
    * 证书内容
    */
    @SerializedName("CaCertificate")
    @Expose
    private String CaCertificate;

    /**
    * 证书格式，当仅支持PEM格式
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * Ca证书颁发者CN
    */
    @SerializedName("CaIssuerCn")
    @Expose
    private String CaIssuerCn;

    /**
    * 生效开始时间，毫秒级时间戳 。
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
     * Get 创建时间，毫秒级时间戳 。 
     * @return CreatedTime 创建时间，毫秒级时间戳 。
     */
    public Long getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间，毫秒级时间戳 。
     * @param CreatedTime 创建时间，毫秒级时间戳 。
     */
    public void setCreatedTime(Long CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 上次更新时间，毫秒级时间戳 。 
     * @return UpdateTime 上次更新时间，毫秒级时间戳 。
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 上次更新时间，毫秒级时间戳 。
     * @param UpdateTime 上次更新时间，毫秒级时间戳 。
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 失效日期，毫秒级时间戳 。 
     * @return NotAfterTime 失效日期，毫秒级时间戳 。
     */
    public Long getNotAfterTime() {
        return this.NotAfterTime;
    }

    /**
     * Set 失效日期，毫秒级时间戳 。
     * @param NotAfterTime 失效日期，毫秒级时间戳 。
     */
    public void setNotAfterTime(Long NotAfterTime) {
        this.NotAfterTime = NotAfterTime;
    }

    /**
     * Get 上次激活时间，毫秒级时间戳 。 
     * @return LastActivationTime 上次激活时间，毫秒级时间戳 。
     */
    public Long getLastActivationTime() {
        return this.LastActivationTime;
    }

    /**
     * Set 上次激活时间，毫秒级时间戳 。
     * @param LastActivationTime 上次激活时间，毫秒级时间戳 。
     */
    public void setLastActivationTime(Long LastActivationTime) {
        this.LastActivationTime = LastActivationTime;
    }

    /**
     * Get 上次吊销时间，毫秒级时间戳 。 
     * @return LastInactivationTime 上次吊销时间，毫秒级时间戳 。
     */
    public Long getLastInactivationTime() {
        return this.LastInactivationTime;
    }

    /**
     * Set 上次吊销时间，毫秒级时间戳 。
     * @param LastInactivationTime 上次吊销时间，毫秒级时间戳 。
     */
    public void setLastInactivationTime(Long LastInactivationTime) {
        this.LastInactivationTime = LastInactivationTime;
    }

    /**
     * Get CA证书状态
 ACTIVE：激活
INACTIVE：未激活
 
     * @return Status CA证书状态
 ACTIVE：激活
INACTIVE：未激活

     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set CA证书状态
 ACTIVE：激活
INACTIVE：未激活

     * @param Status CA证书状态
 ACTIVE：激活
INACTIVE：未激活

     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 证书序列号 
     * @return CaSn 证书序列号
     */
    public String getCaSn() {
        return this.CaSn;
    }

    /**
     * Set 证书序列号
     * @param CaSn 证书序列号
     */
    public void setCaSn(String CaSn) {
        this.CaSn = CaSn;
    }

    /**
     * Get 证书的CN（Common Name），证书中用于标识主体的名称，通常是域名或组织名称 
     * @return CaCn 证书的CN（Common Name），证书中用于标识主体的名称，通常是域名或组织名称
     */
    public String getCaCn() {
        return this.CaCn;
    }

    /**
     * Set 证书的CN（Common Name），证书中用于标识主体的名称，通常是域名或组织名称
     * @param CaCn 证书的CN（Common Name），证书中用于标识主体的名称，通常是域名或组织名称
     */
    public void setCaCn(String CaCn) {
        this.CaCn = CaCn;
    }

    /**
     * Get 证书内容 
     * @return CaCertificate 证书内容
     */
    public String getCaCertificate() {
        return this.CaCertificate;
    }

    /**
     * Set 证书内容
     * @param CaCertificate 证书内容
     */
    public void setCaCertificate(String CaCertificate) {
        this.CaCertificate = CaCertificate;
    }

    /**
     * Get 证书格式，当仅支持PEM格式 
     * @return Format 证书格式，当仅支持PEM格式
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set 证书格式，当仅支持PEM格式
     * @param Format 证书格式，当仅支持PEM格式
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get Ca证书颁发者CN 
     * @return CaIssuerCn Ca证书颁发者CN
     */
    public String getCaIssuerCn() {
        return this.CaIssuerCn;
    }

    /**
     * Set Ca证书颁发者CN
     * @param CaIssuerCn Ca证书颁发者CN
     */
    public void setCaIssuerCn(String CaIssuerCn) {
        this.CaIssuerCn = CaIssuerCn;
    }

    /**
     * Get 生效开始时间，毫秒级时间戳 。 
     * @return NotBeforeTime 生效开始时间，毫秒级时间戳 。
     */
    public Long getNotBeforeTime() {
        return this.NotBeforeTime;
    }

    /**
     * Set 生效开始时间，毫秒级时间戳 。
     * @param NotBeforeTime 生效开始时间，毫秒级时间戳 。
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

    public DescribeCaCertificateResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCaCertificateResponse(DescribeCaCertificateResponse source) {
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
        if (source.CaCn != null) {
            this.CaCn = new String(source.CaCn);
        }
        if (source.CaCertificate != null) {
            this.CaCertificate = new String(source.CaCertificate);
        }
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
        if (source.CaIssuerCn != null) {
            this.CaIssuerCn = new String(source.CaIssuerCn);
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
        this.setParamSimple(map, prefix + "CaCn", this.CaCn);
        this.setParamSimple(map, prefix + "CaCertificate", this.CaCertificate);
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamSimple(map, prefix + "CaIssuerCn", this.CaIssuerCn);
        this.setParamSimple(map, prefix + "NotBeforeTime", this.NotBeforeTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

