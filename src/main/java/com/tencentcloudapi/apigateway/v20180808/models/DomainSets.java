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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DomainSets extends AbstractModel{

    /**
    * 服务下的自定义域名数量。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 自定义服务域名列表。
    */
    @SerializedName("DomainSet")
    @Expose
    private DomainSetList [] DomainSet;

    /**
     * Get 服务下的自定义域名数量。 
     * @return TotalCount 服务下的自定义域名数量。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 服务下的自定义域名数量。
     * @param TotalCount 服务下的自定义域名数量。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 自定义服务域名列表。 
     * @return DomainSet 自定义服务域名列表。
     */
    public DomainSetList [] getDomainSet() {
        return this.DomainSet;
    }

    /**
     * Set 自定义服务域名列表。
     * @param DomainSet 自定义服务域名列表。
     */
    public void setDomainSet(DomainSetList [] DomainSet) {
        this.DomainSet = DomainSet;
    }

    public DomainSets() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DomainSets(DomainSets source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.DomainSet != null) {
            this.DomainSet = new DomainSetList[source.DomainSet.length];
            for (int i = 0; i < source.DomainSet.length; i++) {
                this.DomainSet[i] = new DomainSetList(source.DomainSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "DomainSet.", this.DomainSet);

    }
}

