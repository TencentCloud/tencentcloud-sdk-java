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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyLiveDomainCertBindingsResponse extends AbstractModel{

    /**
    * DomainNames 入参中，与证书不匹配的域名列表，将会跳过处理。
    */
    @SerializedName("MismatchedDomainNames")
    @Expose
    private String [] MismatchedDomainNames;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get DomainNames 入参中，与证书不匹配的域名列表，将会跳过处理。 
     * @return MismatchedDomainNames DomainNames 入参中，与证书不匹配的域名列表，将会跳过处理。
     */
    public String [] getMismatchedDomainNames() {
        return this.MismatchedDomainNames;
    }

    /**
     * Set DomainNames 入参中，与证书不匹配的域名列表，将会跳过处理。
     * @param MismatchedDomainNames DomainNames 入参中，与证书不匹配的域名列表，将会跳过处理。
     */
    public void setMismatchedDomainNames(String [] MismatchedDomainNames) {
        this.MismatchedDomainNames = MismatchedDomainNames;
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

    public ModifyLiveDomainCertBindingsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLiveDomainCertBindingsResponse(ModifyLiveDomainCertBindingsResponse source) {
        if (source.MismatchedDomainNames != null) {
            this.MismatchedDomainNames = new String[source.MismatchedDomainNames.length];
            for (int i = 0; i < source.MismatchedDomainNames.length; i++) {
                this.MismatchedDomainNames[i] = new String(source.MismatchedDomainNames[i]);
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
        this.setParamArraySimple(map, prefix + "MismatchedDomainNames.", this.MismatchedDomainNames);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

