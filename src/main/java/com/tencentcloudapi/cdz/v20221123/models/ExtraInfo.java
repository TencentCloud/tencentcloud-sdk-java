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
package com.tencentcloudapi.cdz.v20221123.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExtraInfo extends AbstractModel {

    /**
    * 专属可用区当地时间本周一日期
    */
    @SerializedName("ThisMondayLocalDate")
    @Expose
    private String ThisMondayLocalDate;

    /**
    * 专属可用区当地时间上周一日期
    */
    @SerializedName("LastMondayLocalDate")
    @Expose
    private String LastMondayLocalDate;

    /**
     * Get 专属可用区当地时间本周一日期 
     * @return ThisMondayLocalDate 专属可用区当地时间本周一日期
     */
    public String getThisMondayLocalDate() {
        return this.ThisMondayLocalDate;
    }

    /**
     * Set 专属可用区当地时间本周一日期
     * @param ThisMondayLocalDate 专属可用区当地时间本周一日期
     */
    public void setThisMondayLocalDate(String ThisMondayLocalDate) {
        this.ThisMondayLocalDate = ThisMondayLocalDate;
    }

    /**
     * Get 专属可用区当地时间上周一日期 
     * @return LastMondayLocalDate 专属可用区当地时间上周一日期
     */
    public String getLastMondayLocalDate() {
        return this.LastMondayLocalDate;
    }

    /**
     * Set 专属可用区当地时间上周一日期
     * @param LastMondayLocalDate 专属可用区当地时间上周一日期
     */
    public void setLastMondayLocalDate(String LastMondayLocalDate) {
        this.LastMondayLocalDate = LastMondayLocalDate;
    }

    public ExtraInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExtraInfo(ExtraInfo source) {
        if (source.ThisMondayLocalDate != null) {
            this.ThisMondayLocalDate = new String(source.ThisMondayLocalDate);
        }
        if (source.LastMondayLocalDate != null) {
            this.LastMondayLocalDate = new String(source.LastMondayLocalDate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ThisMondayLocalDate", this.ThisMondayLocalDate);
        this.setParamSimple(map, prefix + "LastMondayLocalDate", this.LastMondayLocalDate);

    }
}

