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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StatDataItem extends AbstractModel{

    /**
    * 数据所在时间区间的开始时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。如：当时间粒度为天，2018-12-01T00:00:00+08:00，表示2018年12月1日（含）到2018年12月2日（不含）区间。
<li>表示小时级别数据时，2019-08-22T00:00:00+08:00表示2019-08-22日0点到1点的统计数据。</li>
<li>表示天级别数据时，2019-08-22T00:00:00+08:00表示2019-08-22日的统计数据。</li>
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * 数据大小。
<li>存储空间的数据，单位是字节。</li>
<li>转码时长的数据，单位是秒。</li>
<li>流量数据，单位是字节。</li>
<li>带宽数据，单位是比特每秒。</li>
    */
    @SerializedName("Value")
    @Expose
    private Long Value;

    /**
     * Get 数据所在时间区间的开始时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。如：当时间粒度为天，2018-12-01T00:00:00+08:00，表示2018年12月1日（含）到2018年12月2日（不含）区间。
<li>表示小时级别数据时，2019-08-22T00:00:00+08:00表示2019-08-22日0点到1点的统计数据。</li>
<li>表示天级别数据时，2019-08-22T00:00:00+08:00表示2019-08-22日的统计数据。</li> 
     * @return Time 数据所在时间区间的开始时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。如：当时间粒度为天，2018-12-01T00:00:00+08:00，表示2018年12月1日（含）到2018年12月2日（不含）区间。
<li>表示小时级别数据时，2019-08-22T00:00:00+08:00表示2019-08-22日0点到1点的统计数据。</li>
<li>表示天级别数据时，2019-08-22T00:00:00+08:00表示2019-08-22日的统计数据。</li>
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set 数据所在时间区间的开始时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。如：当时间粒度为天，2018-12-01T00:00:00+08:00，表示2018年12月1日（含）到2018年12月2日（不含）区间。
<li>表示小时级别数据时，2019-08-22T00:00:00+08:00表示2019-08-22日0点到1点的统计数据。</li>
<li>表示天级别数据时，2019-08-22T00:00:00+08:00表示2019-08-22日的统计数据。</li>
     * @param Time 数据所在时间区间的开始时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。如：当时间粒度为天，2018-12-01T00:00:00+08:00，表示2018年12月1日（含）到2018年12月2日（不含）区间。
<li>表示小时级别数据时，2019-08-22T00:00:00+08:00表示2019-08-22日0点到1点的统计数据。</li>
<li>表示天级别数据时，2019-08-22T00:00:00+08:00表示2019-08-22日的统计数据。</li>
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get 数据大小。
<li>存储空间的数据，单位是字节。</li>
<li>转码时长的数据，单位是秒。</li>
<li>流量数据，单位是字节。</li>
<li>带宽数据，单位是比特每秒。</li> 
     * @return Value 数据大小。
<li>存储空间的数据，单位是字节。</li>
<li>转码时长的数据，单位是秒。</li>
<li>流量数据，单位是字节。</li>
<li>带宽数据，单位是比特每秒。</li>
     */
    public Long getValue() {
        return this.Value;
    }

    /**
     * Set 数据大小。
<li>存储空间的数据，单位是字节。</li>
<li>转码时长的数据，单位是秒。</li>
<li>流量数据，单位是字节。</li>
<li>带宽数据，单位是比特每秒。</li>
     * @param Value 数据大小。
<li>存储空间的数据，单位是字节。</li>
<li>转码时长的数据，单位是秒。</li>
<li>流量数据，单位是字节。</li>
<li>带宽数据，单位是比特每秒。</li>
     */
    public void setValue(Long Value) {
        this.Value = Value;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

