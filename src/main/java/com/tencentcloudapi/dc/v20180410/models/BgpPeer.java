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
package com.tencentcloudapi.dc.v20180410.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BgpPeer extends AbstractModel {

    /**
    * 腾讯侧BGP ASN
    */
    @SerializedName("CloudAsn")
    @Expose
    private Long CloudAsn;

    /**
    * 用户侧BGP ASN
    */
    @SerializedName("Asn")
    @Expose
    private Long Asn;

    /**
    * 用户侧BGP密钥
    */
    @SerializedName("AuthKey")
    @Expose
    private String AuthKey;

    /**
     * Get 腾讯侧BGP ASN 
     * @return CloudAsn 腾讯侧BGP ASN
     */
    public Long getCloudAsn() {
        return this.CloudAsn;
    }

    /**
     * Set 腾讯侧BGP ASN
     * @param CloudAsn 腾讯侧BGP ASN
     */
    public void setCloudAsn(Long CloudAsn) {
        this.CloudAsn = CloudAsn;
    }

    /**
     * Get 用户侧BGP ASN 
     * @return Asn 用户侧BGP ASN
     */
    public Long getAsn() {
        return this.Asn;
    }

    /**
     * Set 用户侧BGP ASN
     * @param Asn 用户侧BGP ASN
     */
    public void setAsn(Long Asn) {
        this.Asn = Asn;
    }

    /**
     * Get 用户侧BGP密钥 
     * @return AuthKey 用户侧BGP密钥
     */
    public String getAuthKey() {
        return this.AuthKey;
    }

    /**
     * Set 用户侧BGP密钥
     * @param AuthKey 用户侧BGP密钥
     */
    public void setAuthKey(String AuthKey) {
        this.AuthKey = AuthKey;
    }

    public BgpPeer() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BgpPeer(BgpPeer source) {
        if (source.CloudAsn != null) {
            this.CloudAsn = new Long(source.CloudAsn);
        }
        if (source.Asn != null) {
            this.Asn = new Long(source.Asn);
        }
        if (source.AuthKey != null) {
            this.AuthKey = new String(source.AuthKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CloudAsn", this.CloudAsn);
        this.setParamSimple(map, prefix + "Asn", this.Asn);
        this.setParamSimple(map, prefix + "AuthKey", this.AuthKey);

    }
}

