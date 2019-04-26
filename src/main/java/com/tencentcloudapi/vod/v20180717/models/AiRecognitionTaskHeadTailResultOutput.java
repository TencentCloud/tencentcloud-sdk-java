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

public class AiRecognitionTaskHeadTailResultOutput  extends AbstractModel{

    /**
    * 片头识别置信度。取值：0~100。
    */
    @SerializedName("HeadConfidence")
    @Expose
    private Float HeadConfidence;

    /**
    * 视频片头的结束时间点，单位：秒。
    */
    @SerializedName("HeadTimeOffset")
    @Expose
    private Float HeadTimeOffset;

    /**
    * 片尾识别置信度。取值：0~100。
    */
    @SerializedName("TailConfidence")
    @Expose
    private Float TailConfidence;

    /**
    * 视频片尾的开始时间点，单位：秒。
    */
    @SerializedName("TailTimeOffset")
    @Expose
    private Float TailTimeOffset;

    /**
     * 获取片头识别置信度。取值：0~100。
     * @return HeadConfidence 片头识别置信度。取值：0~100。
     */
    public Float getHeadConfidence() {
        return this.HeadConfidence;
    }

    /**
     * 设置片头识别置信度。取值：0~100。
     * @param HeadConfidence 片头识别置信度。取值：0~100。
     */
    public void setHeadConfidence(Float HeadConfidence) {
        this.HeadConfidence = HeadConfidence;
    }

    /**
     * 获取视频片头的结束时间点，单位：秒。
     * @return HeadTimeOffset 视频片头的结束时间点，单位：秒。
     */
    public Float getHeadTimeOffset() {
        return this.HeadTimeOffset;
    }

    /**
     * 设置视频片头的结束时间点，单位：秒。
     * @param HeadTimeOffset 视频片头的结束时间点，单位：秒。
     */
    public void setHeadTimeOffset(Float HeadTimeOffset) {
        this.HeadTimeOffset = HeadTimeOffset;
    }

    /**
     * 获取片尾识别置信度。取值：0~100。
     * @return TailConfidence 片尾识别置信度。取值：0~100。
     */
    public Float getTailConfidence() {
        return this.TailConfidence;
    }

    /**
     * 设置片尾识别置信度。取值：0~100。
     * @param TailConfidence 片尾识别置信度。取值：0~100。
     */
    public void setTailConfidence(Float TailConfidence) {
        this.TailConfidence = TailConfidence;
    }

    /**
     * 获取视频片尾的开始时间点，单位：秒。
     * @return TailTimeOffset 视频片尾的开始时间点，单位：秒。
     */
    public Float getTailTimeOffset() {
        return this.TailTimeOffset;
    }

    /**
     * 设置视频片尾的开始时间点，单位：秒。
     * @param TailTimeOffset 视频片尾的开始时间点，单位：秒。
     */
    public void setTailTimeOffset(Float TailTimeOffset) {
        this.TailTimeOffset = TailTimeOffset;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HeadConfidence", this.HeadConfidence);
        this.setParamSimple(map, prefix + "HeadTimeOffset", this.HeadTimeOffset);
        this.setParamSimple(map, prefix + "TailConfidence", this.TailConfidence);
        this.setParamSimple(map, prefix + "TailTimeOffset", this.TailTimeOffset);

    }
}

