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

public class EditMediaStreamInfo extends AbstractModel{

    /**
    * 录制的流 ID
    */
    @SerializedName("StreamId")
    @Expose
    private String StreamId;

    /**
    * 流剪辑的起始时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 流剪辑的结束时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get 录制的流 ID 
     * @return StreamId 录制的流 ID
     */
    public String getStreamId() {
        return this.StreamId;
    }

    /**
     * Set 录制的流 ID
     * @param StreamId 录制的流 ID
     */
    public void setStreamId(String StreamId) {
        this.StreamId = StreamId;
    }

    /**
     * Get 流剪辑的起始时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。 
     * @return StartTime 流剪辑的起始时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 流剪辑的起始时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     * @param StartTime 流剪辑的起始时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 流剪辑的结束时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。 
     * @return EndTime 流剪辑的结束时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 流剪辑的结束时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     * @param EndTime 流剪辑的结束时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StreamId", this.StreamId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

