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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PlayStatInfo extends AbstractModel {

    /**
    * 数据时间点。
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * 带宽/流量/请求数/并发连接数/下载速度的值，若没数据返回时该值为0。
    */
    @SerializedName("Value")
    @Expose
    private Float Value;

    /**
     * Get 数据时间点。 
     * @return Time 数据时间点。
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set 数据时间点。
     * @param Time 数据时间点。
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get 带宽/流量/请求数/并发连接数/下载速度的值，若没数据返回时该值为0。 
     * @return Value 带宽/流量/请求数/并发连接数/下载速度的值，若没数据返回时该值为0。
     */
    public Float getValue() {
        return this.Value;
    }

    /**
     * Set 带宽/流量/请求数/并发连接数/下载速度的值，若没数据返回时该值为0。
     * @param Value 带宽/流量/请求数/并发连接数/下载速度的值，若没数据返回时该值为0。
     */
    public void setValue(Float Value) {
        this.Value = Value;
    }

    public PlayStatInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PlayStatInfo(PlayStatInfo source) {
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.Value != null) {
            this.Value = new Float(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

