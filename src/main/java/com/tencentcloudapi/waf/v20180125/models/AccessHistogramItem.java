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

public class AccessHistogramItem extends AbstractModel {

    /**
    * 时间，单位ms
    */
    @SerializedName("BTime")
    @Expose
    private Long BTime;

    /**
    * 日志条数
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 时间，单位ms
    */
    @SerializedName("BeginTime")
    @Expose
    private Long BeginTime;

    /**
     * Get 时间，单位ms 
     * @return BTime 时间，单位ms
     * @deprecated
     */
    @Deprecated
    public Long getBTime() {
        return this.BTime;
    }

    /**
     * Set 时间，单位ms
     * @param BTime 时间，单位ms
     * @deprecated
     */
    @Deprecated
    public void setBTime(Long BTime) {
        this.BTime = BTime;
    }

    /**
     * Get 日志条数 
     * @return Count 日志条数
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 日志条数
     * @param Count 日志条数
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 时间，单位ms 
     * @return BeginTime 时间，单位ms
     */
    public Long getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set 时间，单位ms
     * @param BeginTime 时间，单位ms
     */
    public void setBeginTime(Long BeginTime) {
        this.BeginTime = BeginTime;
    }

    public AccessHistogramItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccessHistogramItem(AccessHistogramItem source) {
        if (source.BTime != null) {
            this.BTime = new Long(source.BTime);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new Long(source.BeginTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BTime", this.BTime);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);

    }
}

