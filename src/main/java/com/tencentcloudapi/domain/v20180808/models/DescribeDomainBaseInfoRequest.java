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
package com.tencentcloudapi.domain.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDomainBaseInfoRequest extends AbstractModel {

    /**
    * 域名
可通过[DescribeDomainNameList](https://cloud.tencent.com/document/api/242/48941)接口获取
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
     * Get 域名
可通过[DescribeDomainNameList](https://cloud.tencent.com/document/api/242/48941)接口获取 
     * @return Domain 域名
可通过[DescribeDomainNameList](https://cloud.tencent.com/document/api/242/48941)接口获取
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
可通过[DescribeDomainNameList](https://cloud.tencent.com/document/api/242/48941)接口获取
     * @param Domain 域名
可通过[DescribeDomainNameList](https://cloud.tencent.com/document/api/242/48941)接口获取
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    public DescribeDomainBaseInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDomainBaseInfoRequest(DescribeDomainBaseInfoRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);

    }
}

