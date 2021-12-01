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
package com.tencentcloudapi.ivld.v20210903.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VideoAppearInfo extends AbstractModel{

    /**
    * 视觉信息起始时间戳，从0开始
    */
    @SerializedName("StartTimeStamp")
    @Expose
    private Float StartTimeStamp;

    /**
    * 视觉信息终止时间戳，从0开始
关键词在视觉信息中的区间为[StartTimeStamp, EndTimeStamp)
    */
    @SerializedName("EndTimeStamp")
    @Expose
    private Float EndTimeStamp;

    /**
    * 关键词在视觉信息中的封面图片
    */
    @SerializedName("ImageURL")
    @Expose
    private String ImageURL;

    /**
     * Get 视觉信息起始时间戳，从0开始 
     * @return StartTimeStamp 视觉信息起始时间戳，从0开始
     */
    public Float getStartTimeStamp() {
        return this.StartTimeStamp;
    }

    /**
     * Set 视觉信息起始时间戳，从0开始
     * @param StartTimeStamp 视觉信息起始时间戳，从0开始
     */
    public void setStartTimeStamp(Float StartTimeStamp) {
        this.StartTimeStamp = StartTimeStamp;
    }

    /**
     * Get 视觉信息终止时间戳，从0开始
关键词在视觉信息中的区间为[StartTimeStamp, EndTimeStamp) 
     * @return EndTimeStamp 视觉信息终止时间戳，从0开始
关键词在视觉信息中的区间为[StartTimeStamp, EndTimeStamp)
     */
    public Float getEndTimeStamp() {
        return this.EndTimeStamp;
    }

    /**
     * Set 视觉信息终止时间戳，从0开始
关键词在视觉信息中的区间为[StartTimeStamp, EndTimeStamp)
     * @param EndTimeStamp 视觉信息终止时间戳，从0开始
关键词在视觉信息中的区间为[StartTimeStamp, EndTimeStamp)
     */
    public void setEndTimeStamp(Float EndTimeStamp) {
        this.EndTimeStamp = EndTimeStamp;
    }

    /**
     * Get 关键词在视觉信息中的封面图片 
     * @return ImageURL 关键词在视觉信息中的封面图片
     */
    public String getImageURL() {
        return this.ImageURL;
    }

    /**
     * Set 关键词在视觉信息中的封面图片
     * @param ImageURL 关键词在视觉信息中的封面图片
     */
    public void setImageURL(String ImageURL) {
        this.ImageURL = ImageURL;
    }

    public VideoAppearInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VideoAppearInfo(VideoAppearInfo source) {
        if (source.StartTimeStamp != null) {
            this.StartTimeStamp = new Float(source.StartTimeStamp);
        }
        if (source.EndTimeStamp != null) {
            this.EndTimeStamp = new Float(source.EndTimeStamp);
        }
        if (source.ImageURL != null) {
            this.ImageURL = new String(source.ImageURL);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTimeStamp", this.StartTimeStamp);
        this.setParamSimple(map, prefix + "EndTimeStamp", this.EndTimeStamp);
        this.setParamSimple(map, prefix + "ImageURL", this.ImageURL);

    }
}

