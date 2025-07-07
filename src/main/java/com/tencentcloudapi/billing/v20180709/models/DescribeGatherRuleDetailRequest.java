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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeGatherRuleDetailRequest extends AbstractModel {

    /**
    * 所查询归集规则ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 月份，不传默认当前月
    */
    @SerializedName("Month")
    @Expose
    private String Month;

    /**
     * Get 所查询归集规则ID 
     * @return Id 所查询归集规则ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 所查询归集规则ID
     * @param Id 所查询归集规则ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 月份，不传默认当前月 
     * @return Month 月份，不传默认当前月
     */
    public String getMonth() {
        return this.Month;
    }

    /**
     * Set 月份，不传默认当前月
     * @param Month 月份，不传默认当前月
     */
    public void setMonth(String Month) {
        this.Month = Month;
    }

    public DescribeGatherRuleDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGatherRuleDetailRequest(DescribeGatherRuleDetailRequest source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Month != null) {
            this.Month = new String(source.Month);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Month", this.Month);

    }
}

