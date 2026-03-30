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
package com.tencentcloudapi.vm.v20210922.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VideoSegment extends AbstractModel {

    /**
    * <p>视频切片审核结果</p>
    */
    @SerializedName("Result")
    @Expose
    private VideoSegmentResult Result;

    /**
    * <p>视频切片的起始时间偏移</p>
    */
    @SerializedName("OffsetTime")
    @Expose
    private String OffsetTime;

    /**
    * <p>切片保存时间</p>
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
     * Get <p>视频切片审核结果</p> 
     * @return Result <p>视频切片审核结果</p>
     */
    public VideoSegmentResult getResult() {
        return this.Result;
    }

    /**
     * Set <p>视频切片审核结果</p>
     * @param Result <p>视频切片审核结果</p>
     */
    public void setResult(VideoSegmentResult Result) {
        this.Result = Result;
    }

    /**
     * Get <p>视频切片的起始时间偏移</p> 
     * @return OffsetTime <p>视频切片的起始时间偏移</p>
     */
    public String getOffsetTime() {
        return this.OffsetTime;
    }

    /**
     * Set <p>视频切片的起始时间偏移</p>
     * @param OffsetTime <p>视频切片的起始时间偏移</p>
     */
    public void setOffsetTime(String OffsetTime) {
        this.OffsetTime = OffsetTime;
    }

    /**
     * Get <p>切片保存时间</p> 
     * @return CreatedAt <p>切片保存时间</p>
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set <p>切片保存时间</p>
     * @param CreatedAt <p>切片保存时间</p>
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    public VideoSegment() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VideoSegment(VideoSegment source) {
        if (source.Result != null) {
            this.Result = new VideoSegmentResult(source.Result);
        }
        if (source.OffsetTime != null) {
            this.OffsetTime = new String(source.OffsetTime);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Result.", this.Result);
        this.setParamSimple(map, prefix + "OffsetTime", this.OffsetTime);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);

    }
}

