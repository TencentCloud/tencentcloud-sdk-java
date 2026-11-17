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

public class DescribeLLMHourBillDetailRequest extends AbstractModel {

    /**
    * 实例ID
参数格式：形如 waf_xxxxxxxx
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 查询日期，仅支持单日
参数格式：YYYY-MM-DD 或 YYYYMMDD
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
     * Get 实例ID
参数格式：形如 waf_xxxxxxxx 
     * @return InstanceId 实例ID
参数格式：形如 waf_xxxxxxxx
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
参数格式：形如 waf_xxxxxxxx
     * @param InstanceId 实例ID
参数格式：形如 waf_xxxxxxxx
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 查询日期，仅支持单日
参数格式：YYYY-MM-DD 或 YYYYMMDD 
     * @return Date 查询日期，仅支持单日
参数格式：YYYY-MM-DD 或 YYYYMMDD
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set 查询日期，仅支持单日
参数格式：YYYY-MM-DD 或 YYYYMMDD
     * @param Date 查询日期，仅支持单日
参数格式：YYYY-MM-DD 或 YYYYMMDD
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    public DescribeLLMHourBillDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLLMHourBillDetailRequest(DescribeLLMHourBillDetailRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Date", this.Date);

    }
}

