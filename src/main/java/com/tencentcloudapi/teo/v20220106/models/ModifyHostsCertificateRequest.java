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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyHostsCertificateRequest extends AbstractModel{

    /**
    * Zone ID
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 本次变更的域名
    */
    @SerializedName("Hosts")
    @Expose
    private String [] Hosts;

    /**
    * 证书信息, 只需要传入 CertId 即可, 如果为空, 则使用默认证书
    */
    @SerializedName("CertInfo")
    @Expose
    private ServerCertInfo [] CertInfo;

    /**
     * Get Zone ID 
     * @return ZoneId Zone ID
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Zone ID
     * @param ZoneId Zone ID
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 本次变更的域名 
     * @return Hosts 本次变更的域名
     */
    public String [] getHosts() {
        return this.Hosts;
    }

    /**
     * Set 本次变更的域名
     * @param Hosts 本次变更的域名
     */
    public void setHosts(String [] Hosts) {
        this.Hosts = Hosts;
    }

    /**
     * Get 证书信息, 只需要传入 CertId 即可, 如果为空, 则使用默认证书 
     * @return CertInfo 证书信息, 只需要传入 CertId 即可, 如果为空, 则使用默认证书
     */
    public ServerCertInfo [] getCertInfo() {
        return this.CertInfo;
    }

    /**
     * Set 证书信息, 只需要传入 CertId 即可, 如果为空, 则使用默认证书
     * @param CertInfo 证书信息, 只需要传入 CertId 即可, 如果为空, 则使用默认证书
     */
    public void setCertInfo(ServerCertInfo [] CertInfo) {
        this.CertInfo = CertInfo;
    }

    public ModifyHostsCertificateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyHostsCertificateRequest(ModifyHostsCertificateRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Hosts != null) {
            this.Hosts = new String[source.Hosts.length];
            for (int i = 0; i < source.Hosts.length; i++) {
                this.Hosts[i] = new String(source.Hosts[i]);
            }
        }
        if (source.CertInfo != null) {
            this.CertInfo = new ServerCertInfo[source.CertInfo.length];
            for (int i = 0; i < source.CertInfo.length; i++) {
                this.CertInfo[i] = new ServerCertInfo(source.CertInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArraySimple(map, prefix + "Hosts.", this.Hosts);
        this.setParamArrayObj(map, prefix + "CertInfo.", this.CertInfo);

    }
}

