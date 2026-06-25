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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServiceEndPoints extends AbstractModel {

    /**
    * <p>证书ID</p>
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
    * <p>监听端口</p>
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * <p>网络协议</p>
    */
    @SerializedName("Schema")
    @Expose
    private String Schema;

    /**
     * Get <p>证书ID</p> 
     * @return CertId <p>证书ID</p>
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set <p>证书ID</p>
     * @param CertId <p>证书ID</p>
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    /**
     * Get <p>监听端口</p> 
     * @return Port <p>监听端口</p>
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set <p>监听端口</p>
     * @param Port <p>监听端口</p>
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get <p>网络协议</p> 
     * @return Schema <p>网络协议</p>
     */
    public String getSchema() {
        return this.Schema;
    }

    /**
     * Set <p>网络协议</p>
     * @param Schema <p>网络协议</p>
     */
    public void setSchema(String Schema) {
        this.Schema = Schema;
    }

    public ServiceEndPoints() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServiceEndPoints(ServiceEndPoints source) {
        if (source.CertId != null) {
            this.CertId = new String(source.CertId);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.Schema != null) {
            this.Schema = new String(source.Schema);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Schema", this.Schema);

    }
}

