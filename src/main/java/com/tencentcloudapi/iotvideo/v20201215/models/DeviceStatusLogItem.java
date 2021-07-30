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
package com.tencentcloudapi.iotvideo.v20201215.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeviceStatusLogItem extends AbstractModel{

    /**
    * 时间
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * 状态类型： Online 上线，Offline 下线
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 日志信息
    */
    @SerializedName("Data")
    @Expose
    private String Data;

    /**
     * Get 时间 
     * @return Time 时间
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set 时间
     * @param Time 时间
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get 状态类型： Online 上线，Offline 下线 
     * @return Type 状态类型： Online 上线，Offline 下线
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 状态类型： Online 上线，Offline 下线
     * @param Type 状态类型： Online 上线，Offline 下线
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 日志信息 
     * @return Data 日志信息
     */
    public String getData() {
        return this.Data;
    }

    /**
     * Set 日志信息
     * @param Data 日志信息
     */
    public void setData(String Data) {
        this.Data = Data;
    }

    public DeviceStatusLogItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeviceStatusLogItem(DeviceStatusLogItem source) {
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Data != null) {
            this.Data = new String(source.Data);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Data", this.Data);

    }
}

