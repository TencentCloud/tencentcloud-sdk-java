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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AnalyseTimeDetail extends AbstractModel {

    /**
    * 日期
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * 金额
    */
    @SerializedName("Money")
    @Expose
    private String Money;

    /**
     * Get 日期 
     * @return Time 日期
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set 日期
     * @param Time 日期
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get 金额 
     * @return Money 金额
     */
    public String getMoney() {
        return this.Money;
    }

    /**
     * Set 金额
     * @param Money 金额
     */
    public void setMoney(String Money) {
        this.Money = Money;
    }

    public AnalyseTimeDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AnalyseTimeDetail(AnalyseTimeDetail source) {
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.Money != null) {
            this.Money = new String(source.Money);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "Money", this.Money);

    }
}

