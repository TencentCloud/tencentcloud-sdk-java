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
package com.tencentcloudapi.dc.v20180410.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BgpPeer extends AbstractModel{

    /**
    * 用户侧，BGP Asn
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
     * Get 用户侧，BGP Asn 
     * @return Asn 用户侧，BGP Asn
     */
    public Long getAsn() {
        return this.Asn;
    }

    /**
     * Set 用户侧，BGP Asn
     * @param Asn 用户侧，BGP Asn
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Asn", this.Asn);
        this.setParamSimple(map, prefix + "AuthKey", this.AuthKey);

    }
}

