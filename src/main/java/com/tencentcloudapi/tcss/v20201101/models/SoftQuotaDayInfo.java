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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SoftQuotaDayInfo extends AbstractModel{

    /**
    * 扣费时间
    */
    @SerializedName("PayTime")
    @Expose
    private String PayTime;

    /**
    * 计费核数
    */
    @SerializedName("CoresCnt")
    @Expose
    private Long CoresCnt;

    /**
     * Get 扣费时间 
     * @return PayTime 扣费时间
     */
    public String getPayTime() {
        return this.PayTime;
    }

    /**
     * Set 扣费时间
     * @param PayTime 扣费时间
     */
    public void setPayTime(String PayTime) {
        this.PayTime = PayTime;
    }

    /**
     * Get 计费核数 
     * @return CoresCnt 计费核数
     */
    public Long getCoresCnt() {
        return this.CoresCnt;
    }

    /**
     * Set 计费核数
     * @param CoresCnt 计费核数
     */
    public void setCoresCnt(Long CoresCnt) {
        this.CoresCnt = CoresCnt;
    }

    public SoftQuotaDayInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SoftQuotaDayInfo(SoftQuotaDayInfo source) {
        if (source.PayTime != null) {
            this.PayTime = new String(source.PayTime);
        }
        if (source.CoresCnt != null) {
            this.CoresCnt = new Long(source.CoresCnt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PayTime", this.PayTime);
        this.setParamSimple(map, prefix + "CoresCnt", this.CoresCnt);

    }
}

