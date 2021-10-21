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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClsLogIpData extends AbstractModel{

    /**
    * IP
    */
    @SerializedName("ClientIp")
    @Expose
    private String ClientIp;

    /**
    * 在给定的时间段中，1秒内的最大请求量
    */
    @SerializedName("Request")
    @Expose
    private Long Request;

    /**
    * 在获取的Top信息中，IP出现的次数
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 在给定的时间段中，1秒内的最大请求量对应的时间
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
     * Get IP 
     * @return ClientIp IP
     */
    public String getClientIp() {
        return this.ClientIp;
    }

    /**
     * Set IP
     * @param ClientIp IP
     */
    public void setClientIp(String ClientIp) {
        this.ClientIp = ClientIp;
    }

    /**
     * Get 在给定的时间段中，1秒内的最大请求量 
     * @return Request 在给定的时间段中，1秒内的最大请求量
     */
    public Long getRequest() {
        return this.Request;
    }

    /**
     * Set 在给定的时间段中，1秒内的最大请求量
     * @param Request 在给定的时间段中，1秒内的最大请求量
     */
    public void setRequest(Long Request) {
        this.Request = Request;
    }

    /**
     * Get 在获取的Top信息中，IP出现的次数 
     * @return Count 在获取的Top信息中，IP出现的次数
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 在获取的Top信息中，IP出现的次数
     * @param Count 在获取的Top信息中，IP出现的次数
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 在给定的时间段中，1秒内的最大请求量对应的时间 
     * @return Time 在给定的时间段中，1秒内的最大请求量对应的时间
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set 在给定的时间段中，1秒内的最大请求量对应的时间
     * @param Time 在给定的时间段中，1秒内的最大请求量对应的时间
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    public ClsLogIpData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClsLogIpData(ClsLogIpData source) {
        if (source.ClientIp != null) {
            this.ClientIp = new String(source.ClientIp);
        }
        if (source.Request != null) {
            this.Request = new Long(source.Request);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClientIp", this.ClientIp);
        this.setParamSimple(map, prefix + "Request", this.Request);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "Time", this.Time);

    }
}

