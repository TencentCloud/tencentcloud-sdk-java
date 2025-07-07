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

public class CheckDomainRequest extends AbstractModel {

    /**
    * 所查询域名名称
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * 年限。该参数为空时无法查询溢价词域名
    */
    @SerializedName("Period")
    @Expose
    private String Period;

    /**
     * Get 所查询域名名称 
     * @return DomainName 所查询域名名称
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set 所查询域名名称
     * @param DomainName 所查询域名名称
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get 年限。该参数为空时无法查询溢价词域名 
     * @return Period 年限。该参数为空时无法查询溢价词域名
     */
    public String getPeriod() {
        return this.Period;
    }

    /**
     * Set 年限。该参数为空时无法查询溢价词域名
     * @param Period 年限。该参数为空时无法查询溢价词域名
     */
    public void setPeriod(String Period) {
        this.Period = Period;
    }

    public CheckDomainRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckDomainRequest(CheckDomainRequest source) {
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.Period != null) {
            this.Period = new String(source.Period);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "Period", this.Period);

    }
}

