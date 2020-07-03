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
package com.tencentcloudapi.tbm.v20180129.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DateCount extends AbstractModel{

    /**
    * 统计日期
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * 统计值
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
     * Get 统计日期 
     * @return Date 统计日期
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set 统计日期
     * @param Date 统计日期
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get 统计值 
     * @return Count 统计值
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 统计值
     * @param Count 统计值
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

