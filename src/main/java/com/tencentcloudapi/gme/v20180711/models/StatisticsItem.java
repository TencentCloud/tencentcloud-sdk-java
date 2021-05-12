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
package com.tencentcloudapi.gme.v20180711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StatisticsItem extends AbstractModel{

    /**
    * 日期，格式为年-月-日，如2018-07-13
    */
    @SerializedName("StatDate")
    @Expose
    private String StatDate;

    /**
    * 统计值
    */
    @SerializedName("Data")
    @Expose
    private Long Data;

    /**
     * Get 日期，格式为年-月-日，如2018-07-13 
     * @return StatDate 日期，格式为年-月-日，如2018-07-13
     */
    public String getStatDate() {
        return this.StatDate;
    }

    /**
     * Set 日期，格式为年-月-日，如2018-07-13
     * @param StatDate 日期，格式为年-月-日，如2018-07-13
     */
    public void setStatDate(String StatDate) {
        this.StatDate = StatDate;
    }

    /**
     * Get 统计值 
     * @return Data 统计值
     */
    public Long getData() {
        return this.Data;
    }

    /**
     * Set 统计值
     * @param Data 统计值
     */
    public void setData(Long Data) {
        this.Data = Data;
    }

    public StatisticsItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StatisticsItem(StatisticsItem source) {
        if (source.StatDate != null) {
            this.StatDate = new String(source.StatDate);
        }
        if (source.Data != null) {
            this.Data = new Long(source.Data);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StatDate", this.StatDate);
        this.setParamSimple(map, prefix + "Data", this.Data);

    }
}

