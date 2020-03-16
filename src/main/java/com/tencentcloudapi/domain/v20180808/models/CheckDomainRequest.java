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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckDomainRequest extends AbstractModel{

    /**
    * 所查询域名名称
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * 年限
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
     * Get 年限 
     * @return Period 年限
     */
    public String getPeriod() {
        return this.Period;
    }

    /**
     * Set 年限
     * @param Period 年限
     */
    public void setPeriod(String Period) {
        this.Period = Period;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "Period", this.Period);

    }
}

