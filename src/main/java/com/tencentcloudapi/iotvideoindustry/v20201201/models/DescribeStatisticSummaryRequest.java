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
package com.tencentcloudapi.iotvideoindustry.v20201201.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeStatisticSummaryRequest extends AbstractModel{

    /**
    * 指定日期。格式【YYYY-MM-DD】
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
     * Get 指定日期。格式【YYYY-MM-DD】 
     * @return Date 指定日期。格式【YYYY-MM-DD】
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set 指定日期。格式【YYYY-MM-DD】
     * @param Date 指定日期。格式【YYYY-MM-DD】
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    public DescribeStatisticSummaryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeStatisticSummaryRequest(DescribeStatisticSummaryRequest source) {
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Date", this.Date);

    }
}

