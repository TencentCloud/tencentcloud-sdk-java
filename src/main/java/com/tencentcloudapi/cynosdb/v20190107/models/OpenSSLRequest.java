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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OpenSSLRequest extends AbstractModel {

    /**
    * <p>集群ID</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>证书类型</p><p>枚举值：</p><ul><li>platform： 云端证书</li><li>custom： 自定义证书</li></ul><p>默认值：platform</p>
    */
    @SerializedName("CertType")
    @Expose
    private String CertType;

    /**
    * <p>证书ID，CertType=custom 时必传</p>
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
     * Get <p>集群ID</p> 
     * @return ClusterId <p>集群ID</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群ID</p>
     * @param ClusterId <p>集群ID</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

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
     * Get <p>证书类型</p><p>枚举值：</p><ul><li>platform： 云端证书</li><li>custom： 自定义证书</li></ul><p>默认值：platform</p> 
     * @return CertType <p>证书类型</p><p>枚举值：</p><ul><li>platform： 云端证书</li><li>custom： 自定义证书</li></ul><p>默认值：platform</p>
     */
    public String getCertType() {
        return this.CertType;
    }

    /**
     * Set <p>证书类型</p><p>枚举值：</p><ul><li>platform： 云端证书</li><li>custom： 自定义证书</li></ul><p>默认值：platform</p>
     * @param CertType <p>证书类型</p><p>枚举值：</p><ul><li>platform： 云端证书</li><li>custom： 自定义证书</li></ul><p>默认值：platform</p>
     */
    public void setCertType(String CertType) {
        this.CertType = CertType;
    }

    /**
     * Get <p>证书ID，CertType=custom 时必传</p> 
     * @return CertId <p>证书ID，CertType=custom 时必传</p>
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set <p>证书ID，CertType=custom 时必传</p>
     * @param CertId <p>证书ID，CertType=custom 时必传</p>
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    public OpenSSLRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OpenSSLRequest(OpenSSLRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.CertType != null) {
            this.CertType = new String(source.CertType);
        }
        if (source.CertId != null) {
            this.CertId = new String(source.CertId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "CertType", this.CertType);
        this.setParamSimple(map, prefix + "CertId", this.CertId);

    }
}

