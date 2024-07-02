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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SetTlsVersionRequest extends AbstractModel {

    /**
    * 监听器ID
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * TLS版本
    */
    @SerializedName("TLSSupportVersion")
    @Expose
    private String [] TLSSupportVersion;

    /**
    * 密码套件包
    */
    @SerializedName("TLSCiphers")
    @Expose
    private String TLSCiphers;

    /**
     * Get 监听器ID 
     * @return ListenerId 监听器ID
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set 监听器ID
     * @param ListenerId 监听器ID
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get TLS版本 
     * @return TLSSupportVersion TLS版本
     */
    public String [] getTLSSupportVersion() {
        return this.TLSSupportVersion;
    }

    /**
     * Set TLS版本
     * @param TLSSupportVersion TLS版本
     */
    public void setTLSSupportVersion(String [] TLSSupportVersion) {
        this.TLSSupportVersion = TLSSupportVersion;
    }

    /**
     * Get 密码套件包 
     * @return TLSCiphers 密码套件包
     */
    public String getTLSCiphers() {
        return this.TLSCiphers;
    }

    /**
     * Set 密码套件包
     * @param TLSCiphers 密码套件包
     */
    public void setTLSCiphers(String TLSCiphers) {
        this.TLSCiphers = TLSCiphers;
    }

    public SetTlsVersionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetTlsVersionRequest(SetTlsVersionRequest source) {
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.TLSSupportVersion != null) {
            this.TLSSupportVersion = new String[source.TLSSupportVersion.length];
            for (int i = 0; i < source.TLSSupportVersion.length; i++) {
                this.TLSSupportVersion[i] = new String(source.TLSSupportVersion[i]);
            }
        }
        if (source.TLSCiphers != null) {
            this.TLSCiphers = new String(source.TLSCiphers);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamArraySimple(map, prefix + "TLSSupportVersion.", this.TLSSupportVersion);
        this.setParamSimple(map, prefix + "TLSCiphers", this.TLSCiphers);

    }
}

