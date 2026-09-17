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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DailyUsageList extends AbstractModel {

    /**
    * <p>资源点用量</p>
    */
    @SerializedName("Credits")
    @Expose
    private Long Credits;

    /**
    * <p>资源点用量日期</p><p>参数格式：YYYY-MM-DD</p>
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * <p>原始资源用量</p>
    */
    @SerializedName("UsageValue")
    @Expose
    private Long UsageValue;

    /**
     * Get <p>资源点用量</p> 
     * @return Credits <p>资源点用量</p>
     */
    public Long getCredits() {
        return this.Credits;
    }

    /**
     * Set <p>资源点用量</p>
     * @param Credits <p>资源点用量</p>
     */
    public void setCredits(Long Credits) {
        this.Credits = Credits;
    }

    /**
     * Get <p>资源点用量日期</p><p>参数格式：YYYY-MM-DD</p> 
     * @return Date <p>资源点用量日期</p><p>参数格式：YYYY-MM-DD</p>
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set <p>资源点用量日期</p><p>参数格式：YYYY-MM-DD</p>
     * @param Date <p>资源点用量日期</p><p>参数格式：YYYY-MM-DD</p>
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get <p>原始资源用量</p> 
     * @return UsageValue <p>原始资源用量</p>
     */
    public Long getUsageValue() {
        return this.UsageValue;
    }

    /**
     * Set <p>原始资源用量</p>
     * @param UsageValue <p>原始资源用量</p>
     */
    public void setUsageValue(Long UsageValue) {
        this.UsageValue = UsageValue;
    }

    public DailyUsageList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DailyUsageList(DailyUsageList source) {
        if (source.Credits != null) {
            this.Credits = new Long(source.Credits);
        }
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.UsageValue != null) {
            this.UsageValue = new Long(source.UsageValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Credits", this.Credits);
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "UsageValue", this.UsageValue);

    }
}

