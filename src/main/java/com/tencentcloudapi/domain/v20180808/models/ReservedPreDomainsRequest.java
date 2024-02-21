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
package com.tencentcloudapi.domain.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReservedPreDomainsRequest extends AbstractModel {

    /**
    * 预约预释放域名列表
    */
    @SerializedName("DomainList")
    @Expose
    private String [] DomainList;

    /**
    * 模版ID
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
     * Get 预约预释放域名列表 
     * @return DomainList 预约预释放域名列表
     */
    public String [] getDomainList() {
        return this.DomainList;
    }

    /**
     * Set 预约预释放域名列表
     * @param DomainList 预约预释放域名列表
     */
    public void setDomainList(String [] DomainList) {
        this.DomainList = DomainList;
    }

    /**
     * Get 模版ID 
     * @return TemplateId 模版ID
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 模版ID
     * @param TemplateId 模版ID
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    public ReservedPreDomainsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReservedPreDomainsRequest(ReservedPreDomainsRequest source) {
        if (source.DomainList != null) {
            this.DomainList = new String[source.DomainList.length];
            for (int i = 0; i < source.DomainList.length; i++) {
                this.DomainList[i] = new String(source.DomainList[i]);
            }
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DomainList.", this.DomainList);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);

    }
}

