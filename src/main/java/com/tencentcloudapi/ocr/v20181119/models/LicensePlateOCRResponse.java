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
    * <p>识别出的车牌号码。</p>
    */
    @SerializedName("Number")
    @Expose
    private String Number;

    /**
    * <p>置信度，0 - 100 之间。</p>
    */
    @SerializedName("Confidence")
    @Expose
    private Long Confidence;

    /**
    * <p>文本行在原图片中的像素坐标框。</p>
    */
    @SerializedName("Rect")
    @Expose
    private Rect Rect;

    /**
    * <p>识别出的车牌颜色，目前支持颜色包括 “白”、“黑”、“蓝”、“绿”、“黄”、“黄绿”、“临牌”、“喷漆”、“其它”。</p>
    */
    @SerializedName("Color")
    @Expose
    private String Color;

    /**
    * <p>全部车牌信息。</p>
    */
    @SerializedName("LicensePlateInfos")
    @Expose
    private LicensePlateInfo [] LicensePlateInfos;

    /**
    * <p>车牌类别， 如： 标准实体车牌、非标准实体车牌、临牌，喷漆车牌  示例值：实体车牌</p>
    */
    @SerializedName("LicensePlateCategory")
    @Expose
    private String LicensePlateCategory;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>识别出的车牌号码。</p> 
     * @return Number <p>识别出的车牌号码。</p>
     */
    public String getNumber() {
        return this.Number;
    }

    /**
     * Set <p>识别出的车牌号码。</p>
     * @param Number <p>识别出的车牌号码。</p>
     */
    public void setNumber(String Number) {
        this.Number = Number;
    }

    /**
     * Get <p>置信度，0 - 100 之间。</p> 
     * @return Confidence <p>置信度，0 - 100 之间。</p>
     */
    public Long getConfidence() {
        return this.Confidence;
    }

    /**
     * Set <p>置信度，0 - 100 之间。</p>
     * @param Confidence <p>置信度，0 - 100 之间。</p>
     */
    public void setConfidence(Long Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get <p>文本行在原图片中的像素坐标框。</p> 
     * @return Rect <p>文本行在原图片中的像素坐标框。</p>
     */
    public Rect getRect() {
        return this.Rect;
    }

    /**
     * Set <p>文本行在原图片中的像素坐标框。</p>
     * @param Rect <p>文本行在原图片中的像素坐标框。</p>
     */
    public void setRect(Rect Rect) {
        this.Rect = Rect;
    }

    /**
     * Get <p>识别出的车牌颜色，目前支持颜色包括 “白”、“黑”、“蓝”、“绿”、“黄”、“黄绿”、“临牌”、“喷漆”、“其它”。</p> 
     * @return Color <p>识别出的车牌颜色，目前支持颜色包括 “白”、“黑”、“蓝”、“绿”、“黄”、“黄绿”、“临牌”、“喷漆”、“其它”。</p>
     */
    public String getColor() {
        return this.Color;
    }

    /**
     * Set <p>识别出的车牌颜色，目前支持颜色包括 “白”、“黑”、“蓝”、“绿”、“黄”、“黄绿”、“临牌”、“喷漆”、“其它”。</p>
     * @param Color <p>识别出的车牌颜色，目前支持颜色包括 “白”、“黑”、“蓝”、“绿”、“黄”、“黄绿”、“临牌”、“喷漆”、“其它”。</p>
     */
    public void setColor(String Color) {
        this.Color = Color;
    }

    /**
     * Get <p>全部车牌信息。</p> 
     * @return LicensePlateInfos <p>全部车牌信息。</p>
     */
    public LicensePlateInfo [] getLicensePlateInfos() {
        return this.LicensePlateInfos;
    }

    /**
     * Set <p>全部车牌信息。</p>
     * @param LicensePlateInfos <p>全部车牌信息。</p>
     */
    public void setLicensePlateInfos(LicensePlateInfo [] LicensePlateInfos) {
        this.LicensePlateInfos = LicensePlateInfos;
    }

    /**
     * Get <p>车牌类别， 如： 标准实体车牌、非标准实体车牌、临牌，喷漆车牌  示例值：实体车牌</p> 
     * @return LicensePlateCategory <p>车牌类别， 如： 标准实体车牌、非标准实体车牌、临牌，喷漆车牌  示例值：实体车牌</p>
     */
    public String getLicensePlateCategory() {
        return this.LicensePlateCategory;
    }

    /**
     * Set <p>车牌类别， 如： 标准实体车牌、非标准实体车牌、临牌，喷漆车牌  示例值：实体车牌</p>
     * @param LicensePlateCategory <p>车牌类别， 如： 标准实体车牌、非标准实体车牌、临牌，喷漆车牌  示例值：实体车牌</p>
     */
    public void setLicensePlateCategory(String LicensePlateCategory) {
        this.LicensePlateCategory = LicensePlateCategory;
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
        if (source.LicensePlateCategory != null) {
            this.LicensePlateCategory = new String(source.LicensePlateCategory);
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
        this.setParamSimple(map, prefix + "LicensePlateCategory", this.LicensePlateCategory);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

