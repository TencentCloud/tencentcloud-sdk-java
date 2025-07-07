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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteDomainWhiteRulesRequest extends AbstractModel {

    /**
    * 需要删除的规则域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 需要删除的白名单规则
    */
    @SerializedName("Ids")
    @Expose
    private Long [] Ids;

    /**
     * Get 需要删除的规则域名 
     * @return Domain 需要删除的规则域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 需要删除的规则域名
     * @param Domain 需要删除的规则域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 需要删除的白名单规则 
     * @return Ids 需要删除的白名单规则
     */
    public Long [] getIds() {
        return this.Ids;
    }

    /**
     * Set 需要删除的白名单规则
     * @param Ids 需要删除的白名单规则
     */
    public void setIds(Long [] Ids) {
        this.Ids = Ids;
    }

    public DeleteDomainWhiteRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteDomainWhiteRulesRequest(DeleteDomainWhiteRulesRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Ids != null) {
            this.Ids = new Long[source.Ids.length];
            for (int i = 0; i < source.Ids.length; i++) {
                this.Ids[i] = new Long(source.Ids[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamArraySimple(map, prefix + "Ids.", this.Ids);

    }
}

