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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HostsCertificate extends AbstractModel{

    /**
    * 域名。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * 服务端证书配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HostCertInfo")
    @Expose
    private HostCertInfo HostCertInfo;

    /**
     * Get 域名。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Host 域名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set 域名。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Host 域名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get 服务端证书配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HostCertInfo 服务端证书配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HostCertInfo getHostCertInfo() {
        return this.HostCertInfo;
    }

    /**
     * Set 服务端证书配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param HostCertInfo 服务端证书配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHostCertInfo(HostCertInfo HostCertInfo) {
        this.HostCertInfo = HostCertInfo;
    }

    public HostsCertificate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HostsCertificate(HostsCertificate source) {
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.HostCertInfo != null) {
            this.HostCertInfo = new HostCertInfo(source.HostCertInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamObj(map, prefix + "HostCertInfo.", this.HostCertInfo);

    }
}

