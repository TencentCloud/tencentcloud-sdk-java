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
package com.tencentcloudapi.ie.v20200304.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OpeningEndingTaskResultItem extends AbstractModel{

    /**
    * 视频片头的结束时间点，单位：秒。
    */
    @SerializedName("OpeningTimeOffset")
    @Expose
    private Float OpeningTimeOffset;

    /**
    * 片头识别置信度，取值范围是 0 到 100。
    */
    @SerializedName("OpeningConfidence")
    @Expose
    private Float OpeningConfidence;

    /**
    * 视频片尾的开始时间点，单位：秒。
    */
    @SerializedName("EndingTimeOffset")
    @Expose
    private Float EndingTimeOffset;

    /**
    * 片尾识别置信度，取值范围是 0 到 100。
    */
    @SerializedName("EndingConfidence")
    @Expose
    private Float EndingConfidence;

    /**
     * Get 视频片头的结束时间点，单位：秒。 
     * @return OpeningTimeOffset 视频片头的结束时间点，单位：秒。
     */
    public Float getOpeningTimeOffset() {
        return this.OpeningTimeOffset;
    }

    /**
     * Set 视频片头的结束时间点，单位：秒。
     * @param OpeningTimeOffset 视频片头的结束时间点，单位：秒。
     */
    public void setOpeningTimeOffset(Float OpeningTimeOffset) {
        this.OpeningTimeOffset = OpeningTimeOffset;
    }

    /**
     * Get 片头识别置信度，取值范围是 0 到 100。 
     * @return OpeningConfidence 片头识别置信度，取值范围是 0 到 100。
     */
    public Float getOpeningConfidence() {
        return this.OpeningConfidence;
    }

    /**
     * Set 片头识别置信度，取值范围是 0 到 100。
     * @param OpeningConfidence 片头识别置信度，取值范围是 0 到 100。
     */
    public void setOpeningConfidence(Float OpeningConfidence) {
        this.OpeningConfidence = OpeningConfidence;
    }

    /**
     * Get 视频片尾的开始时间点，单位：秒。 
     * @return EndingTimeOffset 视频片尾的开始时间点，单位：秒。
     */
    public Float getEndingTimeOffset() {
        return this.EndingTimeOffset;
    }

    /**
     * Set 视频片尾的开始时间点，单位：秒。
     * @param EndingTimeOffset 视频片尾的开始时间点，单位：秒。
     */
    public void setEndingTimeOffset(Float EndingTimeOffset) {
        this.EndingTimeOffset = EndingTimeOffset;
    }

    /**
     * Get 片尾识别置信度，取值范围是 0 到 100。 
     * @return EndingConfidence 片尾识别置信度，取值范围是 0 到 100。
     */
    public Float getEndingConfidence() {
        return this.EndingConfidence;
    }

    /**
     * Set 片尾识别置信度，取值范围是 0 到 100。
     * @param EndingConfidence 片尾识别置信度，取值范围是 0 到 100。
     */
    public void setEndingConfidence(Float EndingConfidence) {
        this.EndingConfidence = EndingConfidence;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OpeningTimeOffset", this.OpeningTimeOffset);
        this.setParamSimple(map, prefix + "OpeningConfidence", this.OpeningConfidence);
        this.setParamSimple(map, prefix + "EndingTimeOffset", this.EndingTimeOffset);
        this.setParamSimple(map, prefix + "EndingConfidence", this.EndingConfidence);

    }
}

