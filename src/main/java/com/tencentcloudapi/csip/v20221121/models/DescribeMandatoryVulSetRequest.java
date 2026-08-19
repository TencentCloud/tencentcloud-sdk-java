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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMandatoryVulSetRequest extends AbstractModel {

    /**
    * 漏洞披露所属年份
    */
    @SerializedName("Year")
    @Expose
    private Long Year;

    /**
    * 漏洞披露所属月份
    */
    @SerializedName("Month")
    @Expose
    private Long Month;

    /**
     * Get 漏洞披露所属年份 
     * @return Year 漏洞披露所属年份
     */
    public Long getYear() {
        return this.Year;
    }

    /**
     * Set 漏洞披露所属年份
     * @param Year 漏洞披露所属年份
     */
    public void setYear(Long Year) {
        this.Year = Year;
    }

    /**
     * Get 漏洞披露所属月份 
     * @return Month 漏洞披露所属月份
     */
    public Long getMonth() {
        return this.Month;
    }

    /**
     * Set 漏洞披露所属月份
     * @param Month 漏洞披露所属月份
     */
    public void setMonth(Long Month) {
        this.Month = Month;
    }

    public DescribeMandatoryVulSetRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMandatoryVulSetRequest(DescribeMandatoryVulSetRequest source) {
        if (source.Year != null) {
            this.Year = new Long(source.Year);
        }
        if (source.Month != null) {
            this.Month = new Long(source.Month);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Year", this.Year);
        this.setParamSimple(map, prefix + "Month", this.Month);

    }
}

