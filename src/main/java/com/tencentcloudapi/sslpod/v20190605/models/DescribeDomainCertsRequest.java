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
package com.tencentcloudapi.sslpod.v20190605.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDomainCertsRequest extends AbstractModel {

    /**
    * 域名ID，可通过搜索域名接口获得
    */
    @SerializedName("DomainId")
    @Expose
    private Long DomainId;

    /**
     * Get 域名ID，可通过搜索域名接口获得 
     * @return DomainId 域名ID，可通过搜索域名接口获得
     */
    public Long getDomainId() {
        return this.DomainId;
    }

    /**
     * Set 域名ID，可通过搜索域名接口获得
     * @param DomainId 域名ID，可通过搜索域名接口获得
     */
    public void setDomainId(Long DomainId) {
        this.DomainId = DomainId;
    }

    public DescribeDomainCertsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDomainCertsRequest(DescribeDomainCertsRequest source) {
        if (source.DomainId != null) {
            this.DomainId = new Long(source.DomainId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);

    }
}

