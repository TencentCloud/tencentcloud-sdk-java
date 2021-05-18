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
package com.tencentcloudapi.privatedns.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DatePoint extends AbstractModel{

    /**
    * 时间
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * 值
    */
    @SerializedName("Value")
    @Expose
    private Long Value;

    /**
     * Get 时间 
     * @return Date 时间
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set 时间
     * @param Date 时间
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get 值 
     * @return Value 值
     */
    public Long getValue() {
        return this.Value;
    }

    /**
     * Set 值
     * @param Value 值
     */
    public void setValue(Long Value) {
        this.Value = Value;
    }

    public DatePoint() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DatePoint(DatePoint source) {
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.Value != null) {
            this.Value = new Long(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

