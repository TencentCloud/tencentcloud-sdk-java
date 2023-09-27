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

public class AccelerationDomainCertificate extends AbstractModel{

    /**
    * 配置证书的模式，取值有： <li>disable：不配置证书；</li> <li>eofreecert：配置 EdgeOne 免费证书；</li> <li>sslcert：配置 SSL 证书。</li>
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * 证书列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("List")
    @Expose
    private CertificateInfo [] List;

    /**
     * Get 配置证书的模式，取值有： <li>disable：不配置证书；</li> <li>eofreecert：配置 EdgeOne 免费证书；</li> <li>sslcert：配置 SSL 证书。</li> 
     * @return Mode 配置证书的模式，取值有： <li>disable：不配置证书；</li> <li>eofreecert：配置 EdgeOne 免费证书；</li> <li>sslcert：配置 SSL 证书。</li>
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set 配置证书的模式，取值有： <li>disable：不配置证书；</li> <li>eofreecert：配置 EdgeOne 免费证书；</li> <li>sslcert：配置 SSL 证书。</li>
     * @param Mode 配置证书的模式，取值有： <li>disable：不配置证书；</li> <li>eofreecert：配置 EdgeOne 免费证书；</li> <li>sslcert：配置 SSL 证书。</li>
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 证书列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return List 证书列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CertificateInfo [] getList() {
        return this.List;
    }

    /**
     * Set 证书列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param List 证书列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setList(CertificateInfo [] List) {
        this.List = List;
    }

    public AccelerationDomainCertificate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccelerationDomainCertificate(AccelerationDomainCertificate source) {
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.List != null) {
            this.List = new CertificateInfo[source.List.length];
            for (int i = 0; i < source.List.length; i++) {
                this.List[i] = new CertificateInfo(source.List[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamArrayObj(map, prefix + "List.", this.List);

    }
}

