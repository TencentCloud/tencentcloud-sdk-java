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
    * <p>数据订阅实例的 ID，可通过<a href="https://cloud.tencent.com/document/product/571/102943">DescribeSubscribeJobs</a>接口获取。</p>
    */
    @SerializedName("SubscribeId")
    @Expose
    private String SubscribeId;

    /**
    * <p>时间。当 <code>DateTimeISOFormat=true</code> 时按 RFC 3339 传入（如 <code>2026-04-23T20:21:35+08:00</code>），否则按 <code>Y-m-d h:m:s</code>（北京时间）传入。如果输入时间比当前时间晚的多，相当于查询最新 offset；如果输入时间比当前时间早的多，相当于查询最老 offset；如果输入空，默认 0 时间，等价于查询最老 offset。</p><p>参数格式：2026-04-23T20:21:35+08:00</p>
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
     * Get <p>数据订阅实例的 ID，可通过<a href="https://cloud.tencent.com/document/product/571/102943">DescribeSubscribeJobs</a>接口获取。</p> 
     * @return SubscribeId <p>数据订阅实例的 ID，可通过<a href="https://cloud.tencent.com/document/product/571/102943">DescribeSubscribeJobs</a>接口获取。</p>
     */
    public String getSubscribeId() {
        return this.SubscribeId;
    }

    /**
     * Set <p>数据订阅实例的 ID，可通过<a href="https://cloud.tencent.com/document/product/571/102943">DescribeSubscribeJobs</a>接口获取。</p>
     * @param SubscribeId <p>数据订阅实例的 ID，可通过<a href="https://cloud.tencent.com/document/product/571/102943">DescribeSubscribeJobs</a>接口获取。</p>
     */
    public void setSubscribeId(String SubscribeId) {
        this.SubscribeId = SubscribeId;
    }

    /**
     * Get <p>时间。当 <code>DateTimeISOFormat=true</code> 时按 RFC 3339 传入（如 <code>2026-04-23T20:21:35+08:00</code>），否则按 <code>Y-m-d h:m:s</code>（北京时间）传入。如果输入时间比当前时间晚的多，相当于查询最新 offset；如果输入时间比当前时间早的多，相当于查询最老 offset；如果输入空，默认 0 时间，等价于查询最老 offset。</p><p>参数格式：2026-04-23T20:21:35+08:00</p> 
     * @return Time <p>时间。当 <code>DateTimeISOFormat=true</code> 时按 RFC 3339 传入（如 <code>2026-04-23T20:21:35+08:00</code>），否则按 <code>Y-m-d h:m:s</code>（北京时间）传入。如果输入时间比当前时间晚的多，相当于查询最新 offset；如果输入时间比当前时间早的多，相当于查询最老 offset；如果输入空，默认 0 时间，等价于查询最老 offset。</p><p>参数格式：2026-04-23T20:21:35+08:00</p>
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set <p>时间。当 <code>DateTimeISOFormat=true</code> 时按 RFC 3339 传入（如 <code>2026-04-23T20:21:35+08:00</code>），否则按 <code>Y-m-d h:m:s</code>（北京时间）传入。如果输入时间比当前时间晚的多，相当于查询最新 offset；如果输入时间比当前时间早的多，相当于查询最老 offset；如果输入空，默认 0 时间，等价于查询最老 offset。</p><p>参数格式：2026-04-23T20:21:35+08:00</p>
     * @param Time <p>时间。当 <code>DateTimeISOFormat=true</code> 时按 RFC 3339 传入（如 <code>2026-04-23T20:21:35+08:00</code>），否则按 <code>Y-m-d h:m:s</code>（北京时间）传入。如果输入时间比当前时间晚的多，相当于查询最新 offset；如果输入时间比当前时间早的多，相当于查询最老 offset；如果输入空，默认 0 时间，等价于查询最老 offset。</p><p>参数格式：2026-04-23T20:21:35+08:00</p>
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

