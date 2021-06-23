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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeL7RulesBySSLCertIdResponse extends AbstractModel{

    /**
    * 证书规则集合
    */
    @SerializedName("CertSet")
    @Expose
    private CertIdInsL7Rules [] CertSet;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 证书规则集合 
     * @return CertSet 证书规则集合
     */
    public CertIdInsL7Rules [] getCertSet() {
        return this.CertSet;
    }

    /**
     * Set 证书规则集合
     * @param CertSet 证书规则集合
     */
    public void setCertSet(CertIdInsL7Rules [] CertSet) {
        this.CertSet = CertSet;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeL7RulesBySSLCertIdResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeL7RulesBySSLCertIdResponse(DescribeL7RulesBySSLCertIdResponse source) {
        if (source.CertSet != null) {
            this.CertSet = new CertIdInsL7Rules[source.CertSet.length];
            for (int i = 0; i < source.CertSet.length; i++) {
                this.CertSet[i] = new CertIdInsL7Rules(source.CertSet[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "CertSet.", this.CertSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

