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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDeliverLogDownListRequest extends AbstractModel {

    /**
    * <p>开始时间。UTC 格式，例如：2022-02-09T12:36:42Z。<br>注意：</p><ol><li>北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式说明</a>。</li></ol>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>结束时间。UTC 格式，例如：2022-02-09T12:36:42Z。<br>注意：</p><ol><li>结束时间 - 开始时间 &lt;=7天。</li><li>北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式说明</a>。</li></ol>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>域名列表。</p>
    */
    @SerializedName("DeliverDomains")
    @Expose
    private String [] DeliverDomains;

    /**
     * Get <p>开始时间。UTC 格式，例如：2022-02-09T12:36:42Z。<br>注意：</p><ol><li>北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式说明</a>。</li></ol> 
     * @return StartTime <p>开始时间。UTC 格式，例如：2022-02-09T12:36:42Z。<br>注意：</p><ol><li>北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式说明</a>。</li></ol>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>开始时间。UTC 格式，例如：2022-02-09T12:36:42Z。<br>注意：</p><ol><li>北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式说明</a>。</li></ol>
     * @param StartTime <p>开始时间。UTC 格式，例如：2022-02-09T12:36:42Z。<br>注意：</p><ol><li>北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式说明</a>。</li></ol>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>结束时间。UTC 格式，例如：2022-02-09T12:36:42Z。<br>注意：</p><ol><li>结束时间 - 开始时间 &lt;=7天。</li><li>北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式说明</a>。</li></ol> 
     * @return EndTime <p>结束时间。UTC 格式，例如：2022-02-09T12:36:42Z。<br>注意：</p><ol><li>结束时间 - 开始时间 &lt;=7天。</li><li>北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式说明</a>。</li></ol>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间。UTC 格式，例如：2022-02-09T12:36:42Z。<br>注意：</p><ol><li>结束时间 - 开始时间 &lt;=7天。</li><li>北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式说明</a>。</li></ol>
     * @param EndTime <p>结束时间。UTC 格式，例如：2022-02-09T12:36:42Z。<br>注意：</p><ol><li>结束时间 - 开始时间 &lt;=7天。</li><li>北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式说明</a>。</li></ol>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>域名列表。</p> 
     * @return DeliverDomains <p>域名列表。</p>
     */
    public String [] getDeliverDomains() {
        return this.DeliverDomains;
    }

    /**
     * Set <p>域名列表。</p>
     * @param DeliverDomains <p>域名列表。</p>
     */
    public void setDeliverDomains(String [] DeliverDomains) {
        this.DeliverDomains = DeliverDomains;
    }

    public DescribeDeliverLogDownListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDeliverLogDownListRequest(DescribeDeliverLogDownListRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.DeliverDomains != null) {
            this.DeliverDomains = new String[source.DeliverDomains.length];
            for (int i = 0; i < source.DeliverDomains.length; i++) {
                this.DeliverDomains[i] = new String(source.DeliverDomains[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "DeliverDomains.", this.DeliverDomains);

    }
}

