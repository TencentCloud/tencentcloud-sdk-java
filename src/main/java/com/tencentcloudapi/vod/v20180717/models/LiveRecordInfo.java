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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LiveRecordInfo extends AbstractModel {

    /**
    * 直播录制流 ID。
    */
    @SerializedName("StreamId")
    @Expose
    private String StreamId;

    /**
    * 录制起始时间，使用  [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
    */
    @SerializedName("RecordStartTime")
    @Expose
    private String RecordStartTime;

    /**
    * 录制结束时间，使用  [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
    */
    @SerializedName("RecordEndTime")
    @Expose
    private String RecordEndTime;

    /**
     * Get 直播录制流 ID。 
     * @return StreamId 直播录制流 ID。
     */
    public String getStreamId() {
        return this.StreamId;
    }

    /**
     * Set 直播录制流 ID。
     * @param StreamId 直播录制流 ID。
     */
    public void setStreamId(String StreamId) {
        this.StreamId = StreamId;
    }

    /**
     * Get 录制起始时间，使用  [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。 
     * @return RecordStartTime 录制起始时间，使用  [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public String getRecordStartTime() {
        return this.RecordStartTime;
    }

    /**
     * Set 录制起始时间，使用  [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     * @param RecordStartTime 录制起始时间，使用  [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public void setRecordStartTime(String RecordStartTime) {
        this.RecordStartTime = RecordStartTime;
    }

    /**
     * Get 录制结束时间，使用  [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。 
     * @return RecordEndTime 录制结束时间，使用  [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public String getRecordEndTime() {
        return this.RecordEndTime;
    }

    /**
     * Set 录制结束时间，使用  [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     * @param RecordEndTime 录制结束时间，使用  [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public void setRecordEndTime(String RecordEndTime) {
        this.RecordEndTime = RecordEndTime;
    }

    public LiveRecordInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LiveRecordInfo(LiveRecordInfo source) {
        if (source.StreamId != null) {
            this.StreamId = new String(source.StreamId);
        }
        if (source.RecordStartTime != null) {
            this.RecordStartTime = new String(source.RecordStartTime);
        }
        if (source.RecordEndTime != null) {
            this.RecordEndTime = new String(source.RecordEndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StreamId", this.StreamId);
        this.setParamSimple(map, prefix + "RecordStartTime", this.RecordStartTime);
        this.setParamSimple(map, prefix + "RecordEndTime", this.RecordEndTime);

    }
}

