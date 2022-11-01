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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MultiCertInfo extends AbstractModel{

    /**
    * 认证类型，UNIDIRECTIONAL：单向认证，MUTUAL：双向认证
    */
    @SerializedName("SSLMode")
    @Expose
    private String SSLMode;

    /**
    * 监听器或规则证书列表，单双向认证，多本服务端证书算法类型不能重复;若SSLMode为双向认证，证书列表必须包含一本ca证书。
    */
    @SerializedName("CertList")
    @Expose
    private CertInfo [] CertList;

    /**
     * Get 认证类型，UNIDIRECTIONAL：单向认证，MUTUAL：双向认证 
     * @return SSLMode 认证类型，UNIDIRECTIONAL：单向认证，MUTUAL：双向认证
     */
    public String getSSLMode() {
        return this.SSLMode;
    }

    /**
     * Set 认证类型，UNIDIRECTIONAL：单向认证，MUTUAL：双向认证
     * @param SSLMode 认证类型，UNIDIRECTIONAL：单向认证，MUTUAL：双向认证
     */
    public void setSSLMode(String SSLMode) {
        this.SSLMode = SSLMode;
    }

    /**
     * Get 监听器或规则证书列表，单双向认证，多本服务端证书算法类型不能重复;若SSLMode为双向认证，证书列表必须包含一本ca证书。 
     * @return CertList 监听器或规则证书列表，单双向认证，多本服务端证书算法类型不能重复;若SSLMode为双向认证，证书列表必须包含一本ca证书。
     */
    public CertInfo [] getCertList() {
        return this.CertList;
    }

    /**
     * Set 监听器或规则证书列表，单双向认证，多本服务端证书算法类型不能重复;若SSLMode为双向认证，证书列表必须包含一本ca证书。
     * @param CertList 监听器或规则证书列表，单双向认证，多本服务端证书算法类型不能重复;若SSLMode为双向认证，证书列表必须包含一本ca证书。
     */
    public void setCertList(CertInfo [] CertList) {
        this.CertList = CertList;
    }

    public MultiCertInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MultiCertInfo(MultiCertInfo source) {
        if (source.SSLMode != null) {
            this.SSLMode = new String(source.SSLMode);
        }
        if (source.CertList != null) {
            this.CertList = new CertInfo[source.CertList.length];
            for (int i = 0; i < source.CertList.length; i++) {
                this.CertList[i] = new CertInfo(source.CertList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SSLMode", this.SSLMode);
        this.setParamArrayObj(map, prefix + "CertList.", this.CertList);

    }
}

