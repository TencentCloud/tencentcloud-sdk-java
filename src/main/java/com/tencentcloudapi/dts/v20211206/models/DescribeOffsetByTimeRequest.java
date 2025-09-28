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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeOffsetByTimeRequest extends AbstractModel {

    /**
    * 数据订阅实例的 ID，可通过[DescribeSubscribeJobs](https://cloud.tencent.com/document/product/571/102943)接口获取。
    */
    @SerializedName("SubscribeId")
    @Expose
    private String SubscribeId;

    /**
    * 时间点，格式为：Y-m-d h:m:s。如果输入时间比当前时间晚的多，相当于查询最新offset；如果输入时间比当前时间早的多，相当于查询最老offset；如果输入空，默认0时间，等价于查询最老offset。
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
     * Get 数据订阅实例的 ID，可通过[DescribeSubscribeJobs](https://cloud.tencent.com/document/product/571/102943)接口获取。 
     * @return SubscribeId 数据订阅实例的 ID，可通过[DescribeSubscribeJobs](https://cloud.tencent.com/document/product/571/102943)接口获取。
     */
    public String getSubscribeId() {
        return this.SubscribeId;
    }

    /**
     * Set 数据订阅实例的 ID，可通过[DescribeSubscribeJobs](https://cloud.tencent.com/document/product/571/102943)接口获取。
     * @param SubscribeId 数据订阅实例的 ID，可通过[DescribeSubscribeJobs](https://cloud.tencent.com/document/product/571/102943)接口获取。
     */
    public void setSubscribeId(String SubscribeId) {
        this.SubscribeId = SubscribeId;
    }

    /**
     * Get 时间点，格式为：Y-m-d h:m:s。如果输入时间比当前时间晚的多，相当于查询最新offset；如果输入时间比当前时间早的多，相当于查询最老offset；如果输入空，默认0时间，等价于查询最老offset。 
     * @return Time 时间点，格式为：Y-m-d h:m:s。如果输入时间比当前时间晚的多，相当于查询最新offset；如果输入时间比当前时间早的多，相当于查询最老offset；如果输入空，默认0时间，等价于查询最老offset。
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set 时间点，格式为：Y-m-d h:m:s。如果输入时间比当前时间晚的多，相当于查询最新offset；如果输入时间比当前时间早的多，相当于查询最老offset；如果输入空，默认0时间，等价于查询最老offset。
     * @param Time 时间点，格式为：Y-m-d h:m:s。如果输入时间比当前时间晚的多，相当于查询最新offset；如果输入时间比当前时间早的多，相当于查询最老offset；如果输入空，默认0时间，等价于查询最老offset。
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    public DescribeOffsetByTimeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOffsetByTimeRequest(DescribeOffsetByTimeRequest source) {
        if (source.SubscribeId != null) {
            this.SubscribeId = new String(source.SubscribeId);
        }
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubscribeId", this.SubscribeId);
        this.setParamSimple(map, prefix + "Time", this.Time);

    }
}

