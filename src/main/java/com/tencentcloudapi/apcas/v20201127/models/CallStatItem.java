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
package com.tencentcloudapi.apcas.v20201127.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CallStatItem extends AbstractModel{

    /**
    * 当前统计量的时间段
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * 当前时间段的调用量
    */
    @SerializedName("Amount")
    @Expose
    private Long Amount;

    /**
     * Get 当前统计量的时间段 
     * @return Date 当前统计量的时间段
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set 当前统计量的时间段
     * @param Date 当前统计量的时间段
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get 当前时间段的调用量 
     * @return Amount 当前时间段的调用量
     */
    public Long getAmount() {
        return this.Amount;
    }

    /**
     * Set 当前时间段的调用量
     * @param Amount 当前时间段的调用量
     */
    public void setAmount(Long Amount) {
        this.Amount = Amount;
    }

    public CallStatItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CallStatItem(CallStatItem source) {
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.Amount != null) {
            this.Amount = new Long(source.Amount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "Amount", this.Amount);

    }
}

