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

public class LLMImageTrendItem extends AbstractModel {

    /**
    * <p>YYYYMMDD 格式日期</p>
    */
    @SerializedName("DayTime")
    @Expose
    private String DayTime;

    /**
    * <p>当日图片送检量（单位：张）</p>
    */
    @SerializedName("ImageUsage")
    @Expose
    private Long ImageUsage;

    /**
     * Get <p>YYYYMMDD 格式日期</p> 
     * @return DayTime <p>YYYYMMDD 格式日期</p>
     */
    public String getDayTime() {
        return this.DayTime;
    }

    /**
     * Set <p>YYYYMMDD 格式日期</p>
     * @param DayTime <p>YYYYMMDD 格式日期</p>
     */
    public void setDayTime(String DayTime) {
        this.DayTime = DayTime;
    }

    /**
     * Get <p>当日图片送检量（单位：张）</p> 
     * @return ImageUsage <p>当日图片送检量（单位：张）</p>
     */
    public Long getImageUsage() {
        return this.ImageUsage;
    }

    /**
     * Set <p>当日图片送检量（单位：张）</p>
     * @param ImageUsage <p>当日图片送检量（单位：张）</p>
     */
    public void setImageUsage(Long ImageUsage) {
        this.ImageUsage = ImageUsage;
    }

    public LLMImageTrendItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LLMImageTrendItem(LLMImageTrendItem source) {
        if (source.DayTime != null) {
            this.DayTime = new String(source.DayTime);
        }
        if (source.ImageUsage != null) {
            this.ImageUsage = new Long(source.ImageUsage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DayTime", this.DayTime);
        this.setParamSimple(map, prefix + "ImageUsage", this.ImageUsage);

    }
}

