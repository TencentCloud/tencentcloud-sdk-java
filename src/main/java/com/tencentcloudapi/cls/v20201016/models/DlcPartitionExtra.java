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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DlcPartitionExtra extends AbstractModel {

    /**
    * 时间格式	eg: %Y-%m-%d %H:%M:%S.%f
    */
    @SerializedName("TimeFormat")
    @Expose
    private String TimeFormat;

    /**
    * 时间时区
    */
    @SerializedName("TimeZone")
    @Expose
    private String TimeZone;

    /**
     * Get 时间格式	eg: %Y-%m-%d %H:%M:%S.%f 
     * @return TimeFormat 时间格式	eg: %Y-%m-%d %H:%M:%S.%f
     */
    public String getTimeFormat() {
        return this.TimeFormat;
    }

    /**
     * Set 时间格式	eg: %Y-%m-%d %H:%M:%S.%f
     * @param TimeFormat 时间格式	eg: %Y-%m-%d %H:%M:%S.%f
     */
    public void setTimeFormat(String TimeFormat) {
        this.TimeFormat = TimeFormat;
    }

    /**
     * Get 时间时区 
     * @return TimeZone 时间时区
     */
    public String getTimeZone() {
        return this.TimeZone;
    }

    /**
     * Set 时间时区
     * @param TimeZone 时间时区
     */
    public void setTimeZone(String TimeZone) {
        this.TimeZone = TimeZone;
    }

    public DlcPartitionExtra() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DlcPartitionExtra(DlcPartitionExtra source) {
        if (source.TimeFormat != null) {
            this.TimeFormat = new String(source.TimeFormat);
        }
        if (source.TimeZone != null) {
            this.TimeZone = new String(source.TimeZone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimeFormat", this.TimeFormat);
        this.setParamSimple(map, prefix + "TimeZone", this.TimeZone);

    }
}

