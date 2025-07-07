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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LicensePlateOCRResponse extends AbstractModel {

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
    * 识别出的车牌颜色，目前支持颜色包括 “白”、“黑”、“蓝”、“绿“、“黄”、“黄绿”、“临牌”、“喷漆”、“其它”。
    */
    @SerializedName("Color")
    @Expose
    private String Color;

    /**
    * 全部车牌信息。
    */
    @SerializedName("LicensePlateInfos")
    @Expose
    private LicensePlateInfo [] LicensePlateInfos;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
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
     * Get 识别出的车牌颜色，目前支持颜色包括 “白”、“黑”、“蓝”、“绿“、“黄”、“黄绿”、“临牌”、“喷漆”、“其它”。 
     * @return Color 识别出的车牌颜色，目前支持颜色包括 “白”、“黑”、“蓝”、“绿“、“黄”、“黄绿”、“临牌”、“喷漆”、“其它”。
     */
    public String getColor() {
        return this.Color;
    }

    /**
     * Set 识别出的车牌颜色，目前支持颜色包括 “白”、“黑”、“蓝”、“绿“、“黄”、“黄绿”、“临牌”、“喷漆”、“其它”。
     * @param Color 识别出的车牌颜色，目前支持颜色包括 “白”、“黑”、“蓝”、“绿“、“黄”、“黄绿”、“临牌”、“喷漆”、“其它”。
     */
    public void setColor(String Color) {
        this.Color = Color;
    }

    /**
     * Get 全部车牌信息。 
     * @return LicensePlateInfos 全部车牌信息。
     */
    public LicensePlateInfo [] getLicensePlateInfos() {
        return this.LicensePlateInfos;
    }

    /**
     * Set 全部车牌信息。
     * @param LicensePlateInfos 全部车牌信息。
     */
    public void setLicensePlateInfos(LicensePlateInfo [] LicensePlateInfos) {
        this.LicensePlateInfos = LicensePlateInfos;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public LicensePlateOCRResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LicensePlateOCRResponse(LicensePlateOCRResponse source) {
        if (source.Number != null) {
            this.Number = new String(source.Number);
        }
        if (source.Confidence != null) {
            this.Confidence = new Long(source.Confidence);
        }
        if (source.Rect != null) {
            this.Rect = new Rect(source.Rect);
        }
        if (source.Color != null) {
            this.Color = new String(source.Color);
        }
        if (source.LicensePlateInfos != null) {
            this.LicensePlateInfos = new LicensePlateInfo[source.LicensePlateInfos.length];
            for (int i = 0; i < source.LicensePlateInfos.length; i++) {
                this.LicensePlateInfos[i] = new LicensePlateInfo(source.LicensePlateInfos[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Number", this.Number);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamObj(map, prefix + "Rect.", this.Rect);
        this.setParamSimple(map, prefix + "Color", this.Color);
        this.setParamArrayObj(map, prefix + "LicensePlateInfos.", this.LicensePlateInfos);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

