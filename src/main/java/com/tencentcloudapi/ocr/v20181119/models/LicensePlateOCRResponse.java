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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LicensePlateOCRResponse extends AbstractModel{

    /**
    * 识别出的车牌号码。
    */
    @SerializedName("Number")
    @Expose
    private String Number;

    /**
    * 置信度，0 - 100 之间。
    */
    @SerializedName("Confidence")
    @Expose
    private Long Confidence;

    /**
    * 文本行在原图片中的像素坐标框。
    */
    @SerializedName("Rect")
    @Expose
    private Rect Rect;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 识别出的车牌号码。 
     * @return Number 识别出的车牌号码。
     */
    public String getNumber() {
        return this.Number;
    }

    /**
     * Set 识别出的车牌号码。
     * @param Number 识别出的车牌号码。
     */
    public void setNumber(String Number) {
        this.Number = Number;
    }

    /**
     * Get 置信度，0 - 100 之间。 
     * @return Confidence 置信度，0 - 100 之间。
     */
    public Long getConfidence() {
        return this.Confidence;
    }

    /**
     * Set 置信度，0 - 100 之间。
     * @param Confidence 置信度，0 - 100 之间。
     */
    public void setConfidence(Long Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get 文本行在原图片中的像素坐标框。 
     * @return Rect 文本行在原图片中的像素坐标框。
     */
    public Rect getRect() {
        return this.Rect;
    }

    /**
     * Set 文本行在原图片中的像素坐标框。
     * @param Rect 文本行在原图片中的像素坐标框。
     */
    public void setRect(Rect Rect) {
        this.Rect = Rect;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Number", this.Number);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamObj(map, prefix + "Rect.", this.Rect);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

