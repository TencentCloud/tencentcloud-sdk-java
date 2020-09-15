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

public class DescribeLiveTranscodeRulesRequest extends AbstractModel{

    /**
    * 要筛选的模板ID数组。
    */
    @SerializedName("TemplateIds")
    @Expose
    private Long [] TemplateIds;

    /**
    * 要筛选的域名数组。
    */
    @SerializedName("DomainNames")
    @Expose
    private String [] DomainNames;

    /**
     * Get 要筛选的模板ID数组。 
     * @return TemplateIds 要筛选的模板ID数组。
     */
    public Long [] getTemplateIds() {
        return this.TemplateIds;
    }

    /**
     * Set 要筛选的模板ID数组。
     * @param TemplateIds 要筛选的模板ID数组。
     */
    public void setTemplateIds(Long [] TemplateIds) {
        this.TemplateIds = TemplateIds;
    }

    /**
     * Get 要筛选的域名数组。 
     * @return DomainNames 要筛选的域名数组。
     */
    public String [] getDomainNames() {
        return this.DomainNames;
    }

    /**
     * Set 要筛选的域名数组。
     * @param DomainNames 要筛选的域名数组。
     */
    public void setDomainNames(String [] DomainNames) {
        this.DomainNames = DomainNames;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "TemplateIds.", this.TemplateIds);
        this.setParamArraySimple(map, prefix + "DomainNames.", this.DomainNames);

    }
}

