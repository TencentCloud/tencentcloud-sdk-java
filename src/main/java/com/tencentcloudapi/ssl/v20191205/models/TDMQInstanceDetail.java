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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TDMQInstanceDetail extends AbstractModel {

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 实例状态
    */
    @SerializedName("InstanceStatus")
    @Expose
    private String InstanceStatus;

    /**
    * 服务端证书ID
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
    * CA证书ID
    */
    @SerializedName("CaCertId")
    @Expose
    private String CaCertId;

    /**
    * 不匹配的域名列表
    */
    @SerializedName("NoMatchDomains")
    @Expose
    private String [] NoMatchDomains;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例名称 
     * @return InstanceName 实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称
     * @param InstanceName 实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 实例状态 
     * @return InstanceStatus 实例状态
     */
    public String getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set 实例状态
     * @param InstanceStatus 实例状态
     */
    public void setInstanceStatus(String InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get 服务端证书ID 
     * @return CertId 服务端证书ID
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set 服务端证书ID
     * @param CertId 服务端证书ID
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    /**
     * Get CA证书ID 
     * @return CaCertId CA证书ID
     */
    public String getCaCertId() {
        return this.CaCertId;
    }

    /**
     * Set CA证书ID
     * @param CaCertId CA证书ID
     */
    public void setCaCertId(String CaCertId) {
        this.CaCertId = CaCertId;
    }

    /**
     * Get 不匹配的域名列表 
     * @return NoMatchDomains 不匹配的域名列表
     */
    public String [] getNoMatchDomains() {
        return this.NoMatchDomains;
    }

    /**
     * Set 不匹配的域名列表
     * @param NoMatchDomains 不匹配的域名列表
     */
    public void setNoMatchDomains(String [] NoMatchDomains) {
        this.NoMatchDomains = NoMatchDomains;
    }

    public TDMQInstanceDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TDMQInstanceDetail(TDMQInstanceDetail source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceStatus != null) {
            this.InstanceStatus = new String(source.InstanceStatus);
        }
        if (source.CertId != null) {
            this.CertId = new String(source.CertId);
        }
        if (source.CaCertId != null) {
            this.CaCertId = new String(source.CaCertId);
        }
        if (source.NoMatchDomains != null) {
            this.NoMatchDomains = new String[source.NoMatchDomains.length];
            for (int i = 0; i < source.NoMatchDomains.length; i++) {
                this.NoMatchDomains[i] = new String(source.NoMatchDomains[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceStatus", this.InstanceStatus);
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamSimple(map, prefix + "CaCertId", this.CaCertId);
        this.setParamArraySimple(map, prefix + "NoMatchDomains.", this.NoMatchDomains);

    }
}

