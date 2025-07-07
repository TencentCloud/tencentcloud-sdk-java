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

public class HttpStatusData extends AbstractModel {

    /**
    * 数据时间点，
使用UTC格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * 播放状态码详细信息。
    */
    @SerializedName("HttpStatusInfoList")
    @Expose
    private HttpStatusInfo [] HttpStatusInfoList;

    /**
     * Get 数据时间点，
使用UTC格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。 
     * @return Time 数据时间点，
使用UTC格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set 数据时间点，
使用UTC格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。
     * @param Time 数据时间点，
使用UTC格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get 播放状态码详细信息。 
     * @return HttpStatusInfoList 播放状态码详细信息。
     */
    public HttpStatusInfo [] getHttpStatusInfoList() {
        return this.HttpStatusInfoList;
    }

    /**
     * Set 播放状态码详细信息。
     * @param HttpStatusInfoList 播放状态码详细信息。
     */
    public void setHttpStatusInfoList(HttpStatusInfo [] HttpStatusInfoList) {
        this.HttpStatusInfoList = HttpStatusInfoList;
    }

    public HttpStatusData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HttpStatusData(HttpStatusData source) {
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.HttpStatusInfoList != null) {
            this.HttpStatusInfoList = new HttpStatusInfo[source.HttpStatusInfoList.length];
            for (int i = 0; i < source.HttpStatusInfoList.length; i++) {
                this.HttpStatusInfoList[i] = new HttpStatusInfo(source.HttpStatusInfoList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamArrayObj(map, prefix + "HttpStatusInfoList.", this.HttpStatusInfoList);

    }
}

