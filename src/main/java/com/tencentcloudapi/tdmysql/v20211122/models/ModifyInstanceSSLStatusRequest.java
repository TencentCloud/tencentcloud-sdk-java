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
package com.tencentcloudapi.tdmysql.v20211122.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyInstanceSSLStatusRequest extends AbstractModel {

    /**
    * <p>实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>是否启用SSL</p>
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * <p>证书类型</p><p>枚举值：</p><ul><li>Cloud： 云端证书</li><li>Custom： 自定义证书</li></ul>
    */
    @SerializedName("CertificateType")
    @Expose
    private String CertificateType;

    /**
    * <p>腾讯云SSL证书服务的证书ID</p>
    */
    @SerializedName("CertificateId")
    @Expose
    private String CertificateId;

    /**
     * Get <p>实例ID</p> 
     * @return InstanceId <p>实例ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例ID</p>
     * @param InstanceId <p>实例ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>是否启用SSL</p> 
     * @return Enabled <p>是否启用SSL</p>
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set <p>是否启用SSL</p>
     * @param Enabled <p>是否启用SSL</p>
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get <p>证书类型</p><p>枚举值：</p><ul><li>Cloud： 云端证书</li><li>Custom： 自定义证书</li></ul> 
     * @return CertificateType <p>证书类型</p><p>枚举值：</p><ul><li>Cloud： 云端证书</li><li>Custom： 自定义证书</li></ul>
     */
    public String getCertificateType() {
        return this.CertificateType;
    }

    /**
     * Set <p>证书类型</p><p>枚举值：</p><ul><li>Cloud： 云端证书</li><li>Custom： 自定义证书</li></ul>
     * @param CertificateType <p>证书类型</p><p>枚举值：</p><ul><li>Cloud： 云端证书</li><li>Custom： 自定义证书</li></ul>
     */
    public void setCertificateType(String CertificateType) {
        this.CertificateType = CertificateType;
    }

    /**
     * Get <p>腾讯云SSL证书服务的证书ID</p> 
     * @return CertificateId <p>腾讯云SSL证书服务的证书ID</p>
     */
    public String getCertificateId() {
        return this.CertificateId;
    }

    /**
     * Set <p>腾讯云SSL证书服务的证书ID</p>
     * @param CertificateId <p>腾讯云SSL证书服务的证书ID</p>
     */
    public void setCertificateId(String CertificateId) {
        this.CertificateId = CertificateId;
    }

    public ModifyInstanceSSLStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInstanceSSLStatusRequest(ModifyInstanceSSLStatusRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.CertificateType != null) {
            this.CertificateType = new String(source.CertificateType);
        }
        if (source.CertificateId != null) {
            this.CertificateId = new String(source.CertificateId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "CertificateType", this.CertificateType);
        this.setParamSimple(map, prefix + "CertificateId", this.CertificateId);

    }
}

