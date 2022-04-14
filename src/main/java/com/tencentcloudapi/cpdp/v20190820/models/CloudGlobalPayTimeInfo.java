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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudGlobalPayTimeInfo extends AbstractModel{

    /**
    * 订单开始时间。
不指定时默认为当前时间。
    */
    @SerializedName("StartTimestamp")
    @Expose
    private Long StartTimestamp;

    /**
    * 订单结束时间。
逾期将会拒绝下单。不指定时默认为当前时间的7天后结束。
    */
    @SerializedName("ExpireTimestamp")
    @Expose
    private Long ExpireTimestamp;

    /**
    * 时区。
不指定时默认为28800，表示北京时间（东八区）。
    */
    @SerializedName("TimeOffset")
    @Expose
    private Long TimeOffset;

    /**
     * Get 订单开始时间。
不指定时默认为当前时间。 
     * @return StartTimestamp 订单开始时间。
不指定时默认为当前时间。
     */
    public Long getStartTimestamp() {
        return this.StartTimestamp;
    }

    /**
     * Set 订单开始时间。
不指定时默认为当前时间。
     * @param StartTimestamp 订单开始时间。
不指定时默认为当前时间。
     */
    public void setStartTimestamp(Long StartTimestamp) {
        this.StartTimestamp = StartTimestamp;
    }

    /**
     * Get 订单结束时间。
逾期将会拒绝下单。不指定时默认为当前时间的7天后结束。 
     * @return ExpireTimestamp 订单结束时间。
逾期将会拒绝下单。不指定时默认为当前时间的7天后结束。
     */
    public Long getExpireTimestamp() {
        return this.ExpireTimestamp;
    }

    /**
     * Set 订单结束时间。
逾期将会拒绝下单。不指定时默认为当前时间的7天后结束。
     * @param ExpireTimestamp 订单结束时间。
逾期将会拒绝下单。不指定时默认为当前时间的7天后结束。
     */
    public void setExpireTimestamp(Long ExpireTimestamp) {
        this.ExpireTimestamp = ExpireTimestamp;
    }

    /**
     * Get 时区。
不指定时默认为28800，表示北京时间（东八区）。 
     * @return TimeOffset 时区。
不指定时默认为28800，表示北京时间（东八区）。
     */
    public Long getTimeOffset() {
        return this.TimeOffset;
    }

    /**
     * Set 时区。
不指定时默认为28800，表示北京时间（东八区）。
     * @param TimeOffset 时区。
不指定时默认为28800，表示北京时间（东八区）。
     */
    public void setTimeOffset(Long TimeOffset) {
        this.TimeOffset = TimeOffset;
    }

    public CloudGlobalPayTimeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudGlobalPayTimeInfo(CloudGlobalPayTimeInfo source) {
        if (source.StartTimestamp != null) {
            this.StartTimestamp = new Long(source.StartTimestamp);
        }
        if (source.ExpireTimestamp != null) {
            this.ExpireTimestamp = new Long(source.ExpireTimestamp);
        }
        if (source.TimeOffset != null) {
            this.TimeOffset = new Long(source.TimeOffset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTimestamp", this.StartTimestamp);
        this.setParamSimple(map, prefix + "ExpireTimestamp", this.ExpireTimestamp);
        this.setParamSimple(map, prefix + "TimeOffset", this.TimeOffset);

    }
}

