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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaCastPlaySetting extends AbstractModel {

    /**
    * 循环播放次数。LoopCount 和 EndTime 同时只能有一个生效。默认循环播放次数为一次。如果同时设置了 LoopCount 和 EndTime 参数，优先使用 LoopCount 参数。
    */
    @SerializedName("LoopCount")
    @Expose
    private Long LoopCount;

    /**
    * 结束时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 自动启动时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
    */
    @SerializedName("AutoStartTime")
    @Expose
    private String AutoStartTime;

    /**
     * Get 循环播放次数。LoopCount 和 EndTime 同时只能有一个生效。默认循环播放次数为一次。如果同时设置了 LoopCount 和 EndTime 参数，优先使用 LoopCount 参数。 
     * @return LoopCount 循环播放次数。LoopCount 和 EndTime 同时只能有一个生效。默认循环播放次数为一次。如果同时设置了 LoopCount 和 EndTime 参数，优先使用 LoopCount 参数。
     */
    public Long getLoopCount() {
        return this.LoopCount;
    }

    /**
     * Set 循环播放次数。LoopCount 和 EndTime 同时只能有一个生效。默认循环播放次数为一次。如果同时设置了 LoopCount 和 EndTime 参数，优先使用 LoopCount 参数。
     * @param LoopCount 循环播放次数。LoopCount 和 EndTime 同时只能有一个生效。默认循环播放次数为一次。如果同时设置了 LoopCount 和 EndTime 参数，优先使用 LoopCount 参数。
     */
    public void setLoopCount(Long LoopCount) {
        this.LoopCount = LoopCount;
    }

    /**
     * Get 结束时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。 
     * @return EndTime 结束时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     * @param EndTime 结束时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 自动启动时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。 
     * @return AutoStartTime 自动启动时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public String getAutoStartTime() {
        return this.AutoStartTime;
    }

    /**
     * Set 自动启动时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     * @param AutoStartTime 自动启动时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public void setAutoStartTime(String AutoStartTime) {
        this.AutoStartTime = AutoStartTime;
    }

    public MediaCastPlaySetting() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaCastPlaySetting(MediaCastPlaySetting source) {
        if (source.LoopCount != null) {
            this.LoopCount = new Long(source.LoopCount);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.AutoStartTime != null) {
            this.AutoStartTime = new String(source.AutoStartTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoopCount", this.LoopCount);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "AutoStartTime", this.AutoStartTime);

    }
}

