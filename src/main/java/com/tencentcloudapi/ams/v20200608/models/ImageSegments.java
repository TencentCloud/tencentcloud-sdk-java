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
package com.tencentcloudapi.ams.v20200608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageSegments extends AbstractModel{

    /**
    * 画面截帧结果详情
    */
    @SerializedName("Result")
    @Expose
    private ImageResult Result;

    /**
    * 截帧时间。
点播文件：该值为相对于视频偏移时间，单位为秒，例如：0，5，10
直播流：该值为时间戳，例如：1594650717
    */
    @SerializedName("OffsetTime")
    @Expose
    private String OffsetTime;

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

    public ImageSegments() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageSegments(ImageSegments source) {
        if (source.Result != null) {
            this.Result = new ImageResult(source.Result);
        }
        if (source.OffsetTime != null) {
            this.OffsetTime = new String(source.OffsetTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Result.", this.Result);
        this.setParamSimple(map, prefix + "OffsetTime", this.OffsetTime);

    }
}

