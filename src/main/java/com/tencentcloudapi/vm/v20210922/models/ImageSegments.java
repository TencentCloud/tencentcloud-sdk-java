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
package com.tencentcloudapi.vm.v20210922.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageSegments extends AbstractModel {

    /**
    * 截帧时间。
点播文件：该值为相对于视频偏移时间，单位为秒，例如：0，5，10
直播流：该值为时间戳，例如：1594650717
    */
    @SerializedName("OffsetTime")
    @Expose
    private String OffsetTime;

    /**
    * 画面截帧结果详情
    */
    @SerializedName("Result")
    @Expose
    private ImageResult Result;

    /**
    * 时间
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * 截帧毫秒时间
    */
    @SerializedName("OffsetusTime")
    @Expose
    private String OffsetusTime;

    /**
     * Get 截帧时间。
点播文件：该值为相对于视频偏移时间，单位为秒，例如：0，5，10
直播流：该值为时间戳，例如：1594650717 
     * @return OffsetTime 截帧时间。
点播文件：该值为相对于视频偏移时间，单位为秒，例如：0，5，10
直播流：该值为时间戳，例如：1594650717
     */
    public String getOffsetTime() {
        return this.OffsetTime;
    }

    /**
     * Set 截帧时间。
点播文件：该值为相对于视频偏移时间，单位为秒，例如：0，5，10
直播流：该值为时间戳，例如：1594650717
     * @param OffsetTime 截帧时间。
点播文件：该值为相对于视频偏移时间，单位为秒，例如：0，5，10
直播流：该值为时间戳，例如：1594650717
     */
    public void setOffsetTime(String OffsetTime) {
        this.OffsetTime = OffsetTime;
    }

    /**
     * Get 画面截帧结果详情 
     * @return Result 画面截帧结果详情
     */
    public ImageResult getResult() {
        return this.Result;
    }

    /**
     * Set 画面截帧结果详情
     * @param Result 画面截帧结果详情
     */
    public void setResult(ImageResult Result) {
        this.Result = Result;
    }

    /**
     * Get 时间 
     * @return CreatedAt 时间
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 时间
     * @param CreatedAt 时间
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get 截帧毫秒时间 
     * @return OffsetusTime 截帧毫秒时间
     */
    public String getOffsetusTime() {
        return this.OffsetusTime;
    }

    /**
     * Set 截帧毫秒时间
     * @param OffsetusTime 截帧毫秒时间
     */
    public void setOffsetusTime(String OffsetusTime) {
        this.OffsetusTime = OffsetusTime;
    }

    public ImageSegments() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageSegments(ImageSegments source) {
        if (source.OffsetTime != null) {
            this.OffsetTime = new String(source.OffsetTime);
        }
        if (source.Result != null) {
            this.Result = new ImageResult(source.Result);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.OffsetusTime != null) {
            this.OffsetusTime = new String(source.OffsetusTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OffsetTime", this.OffsetTime);
        this.setParamObj(map, prefix + "Result.", this.Result);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "OffsetusTime", this.OffsetusTime);

    }
}

