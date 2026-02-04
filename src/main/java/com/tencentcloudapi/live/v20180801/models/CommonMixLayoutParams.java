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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CommonMixLayoutParams extends AbstractModel {

    /**
    * <p>输入图层。取值范围[1，16]。<br>1)背景流（即大主播画面或画布）的 image_layer 填1。<br>2)纯音频混流，该参数也需填。<br>注意：不同输入，该值不可重复</p>
    */
    @SerializedName("ImageLayer")
    @Expose
    private Long ImageLayer;

    /**
    * <p>输入类型。取值范围[0，5]。<br>不填默认为0。<br>0表示输入流为音视频。<br>2表示输入流为图片。<br>3表示输入流为画布。<br>4表示输入流为音频。<br>5表示输入流为纯视频。</p>
    */
    @SerializedName("InputType")
    @Expose
    private Long InputType;

    /**
    * <p>输入画面在输出时的高度。取值范围：<br>像素：[0，2000]<br>百分比：[0.01，0.99]<br>不填默认为输入流的高度。<br>使用百分比时，期望输出为（百分比 * 背景高）。</p>
    */
    @SerializedName("ImageHeight")
    @Expose
    private Float ImageHeight;

    /**
    * <p>输入画面在输出时的宽度。取值范围：<br>像素：[0，2000]<br>百分比：[0.01，0.99]<br>不填默认为输入流的宽度。<br>使用百分比时，期望输出为（百分比 * 背景宽）。</p>
    */
    @SerializedName("ImageWidth")
    @Expose
    private Float ImageWidth;

    /**
    * <p>输入在输出画面的X偏移。取值范围：<br>像素：[0，2000]<br>百分比：[0.01，0.99]<br>不填默认为0。<br>相对于大主播背景画面左上角的横向偏移。<br>使用百分比时，期望输出为（百分比 * 背景宽）。</p>
    */
    @SerializedName("LocationX")
    @Expose
    private Float LocationX;

    /**
    * <p>输入在输出画面的Y偏移。取值范围：<br>像素：[0，2000]<br>百分比：[0.01，0.99]<br>不填默认为0。<br>相对于大主播背景画面左上角的纵向偏移。<br>使用百分比时，期望输出为（百分比 * 背景宽）</p>
    */
    @SerializedName("LocationY")
    @Expose
    private Float LocationY;

    /**
    * <p>当InputType为3(画布)时，该值表示画布的颜色。<br>常用的颜色有：<br>红色：0xCC0033。<br>黄色：0xCC9900。<br>绿色：0xCCCC33。<br>蓝色：0x99CCFF。<br>黑色：0x000000。<br>白色：0xFFFFFF。<br>灰色：0x999999。</p>
    */
    @SerializedName("Color")
    @Expose
    private String Color;

    /**
    * <p>当InputType为2(图片)时，该值是水印ID。</p>
    */
    @SerializedName("WatermarkId")
    @Expose
    private Long WatermarkId;

    /**
    * <p>当InputType为8时，该值是动效贴片的URL</p>
    */
    @SerializedName("WebPageUrl")
    @Expose
    private String WebPageUrl;

    /**
     * Get <p>输入图层。取值范围[1，16]。<br>1)背景流（即大主播画面或画布）的 image_layer 填1。<br>2)纯音频混流，该参数也需填。<br>注意：不同输入，该值不可重复</p> 
     * @return ImageLayer <p>输入图层。取值范围[1，16]。<br>1)背景流（即大主播画面或画布）的 image_layer 填1。<br>2)纯音频混流，该参数也需填。<br>注意：不同输入，该值不可重复</p>
     */
    public Long getImageLayer() {
        return this.ImageLayer;
    }

    /**
     * Set <p>输入图层。取值范围[1，16]。<br>1)背景流（即大主播画面或画布）的 image_layer 填1。<br>2)纯音频混流，该参数也需填。<br>注意：不同输入，该值不可重复</p>
     * @param ImageLayer <p>输入图层。取值范围[1，16]。<br>1)背景流（即大主播画面或画布）的 image_layer 填1。<br>2)纯音频混流，该参数也需填。<br>注意：不同输入，该值不可重复</p>
     */
    public void setImageLayer(Long ImageLayer) {
        this.ImageLayer = ImageLayer;
    }

    /**
     * Get <p>输入类型。取值范围[0，5]。<br>不填默认为0。<br>0表示输入流为音视频。<br>2表示输入流为图片。<br>3表示输入流为画布。<br>4表示输入流为音频。<br>5表示输入流为纯视频。</p> 
     * @return InputType <p>输入类型。取值范围[0，5]。<br>不填默认为0。<br>0表示输入流为音视频。<br>2表示输入流为图片。<br>3表示输入流为画布。<br>4表示输入流为音频。<br>5表示输入流为纯视频。</p>
     */
    public Long getInputType() {
        return this.InputType;
    }

    /**
     * Set <p>输入类型。取值范围[0，5]。<br>不填默认为0。<br>0表示输入流为音视频。<br>2表示输入流为图片。<br>3表示输入流为画布。<br>4表示输入流为音频。<br>5表示输入流为纯视频。</p>
     * @param InputType <p>输入类型。取值范围[0，5]。<br>不填默认为0。<br>0表示输入流为音视频。<br>2表示输入流为图片。<br>3表示输入流为画布。<br>4表示输入流为音频。<br>5表示输入流为纯视频。</p>
     */
    public void setInputType(Long InputType) {
        this.InputType = InputType;
    }

    /**
     * Get <p>输入画面在输出时的高度。取值范围：<br>像素：[0，2000]<br>百分比：[0.01，0.99]<br>不填默认为输入流的高度。<br>使用百分比时，期望输出为（百分比 * 背景高）。</p> 
     * @return ImageHeight <p>输入画面在输出时的高度。取值范围：<br>像素：[0，2000]<br>百分比：[0.01，0.99]<br>不填默认为输入流的高度。<br>使用百分比时，期望输出为（百分比 * 背景高）。</p>
     */
    public Float getImageHeight() {
        return this.ImageHeight;
    }

    /**
     * Set <p>输入画面在输出时的高度。取值范围：<br>像素：[0，2000]<br>百分比：[0.01，0.99]<br>不填默认为输入流的高度。<br>使用百分比时，期望输出为（百分比 * 背景高）。</p>
     * @param ImageHeight <p>输入画面在输出时的高度。取值范围：<br>像素：[0，2000]<br>百分比：[0.01，0.99]<br>不填默认为输入流的高度。<br>使用百分比时，期望输出为（百分比 * 背景高）。</p>
     */
    public void setImageHeight(Float ImageHeight) {
        this.ImageHeight = ImageHeight;
    }

    /**
     * Get <p>输入画面在输出时的宽度。取值范围：<br>像素：[0，2000]<br>百分比：[0.01，0.99]<br>不填默认为输入流的宽度。<br>使用百分比时，期望输出为（百分比 * 背景宽）。</p> 
     * @return ImageWidth <p>输入画面在输出时的宽度。取值范围：<br>像素：[0，2000]<br>百分比：[0.01，0.99]<br>不填默认为输入流的宽度。<br>使用百分比时，期望输出为（百分比 * 背景宽）。</p>
     */
    public Float getImageWidth() {
        return this.ImageWidth;
    }

    /**
     * Set <p>输入画面在输出时的宽度。取值范围：<br>像素：[0，2000]<br>百分比：[0.01，0.99]<br>不填默认为输入流的宽度。<br>使用百分比时，期望输出为（百分比 * 背景宽）。</p>
     * @param ImageWidth <p>输入画面在输出时的宽度。取值范围：<br>像素：[0，2000]<br>百分比：[0.01，0.99]<br>不填默认为输入流的宽度。<br>使用百分比时，期望输出为（百分比 * 背景宽）。</p>
     */
    public void setImageWidth(Float ImageWidth) {
        this.ImageWidth = ImageWidth;
    }

    /**
     * Get <p>输入在输出画面的X偏移。取值范围：<br>像素：[0，2000]<br>百分比：[0.01，0.99]<br>不填默认为0。<br>相对于大主播背景画面左上角的横向偏移。<br>使用百分比时，期望输出为（百分比 * 背景宽）。</p> 
     * @return LocationX <p>输入在输出画面的X偏移。取值范围：<br>像素：[0，2000]<br>百分比：[0.01，0.99]<br>不填默认为0。<br>相对于大主播背景画面左上角的横向偏移。<br>使用百分比时，期望输出为（百分比 * 背景宽）。</p>
     */
    public Float getLocationX() {
        return this.LocationX;
    }

    /**
     * Set <p>输入在输出画面的X偏移。取值范围：<br>像素：[0，2000]<br>百分比：[0.01，0.99]<br>不填默认为0。<br>相对于大主播背景画面左上角的横向偏移。<br>使用百分比时，期望输出为（百分比 * 背景宽）。</p>
     * @param LocationX <p>输入在输出画面的X偏移。取值范围：<br>像素：[0，2000]<br>百分比：[0.01，0.99]<br>不填默认为0。<br>相对于大主播背景画面左上角的横向偏移。<br>使用百分比时，期望输出为（百分比 * 背景宽）。</p>
     */
    public void setLocationX(Float LocationX) {
        this.LocationX = LocationX;
    }

    /**
     * Get <p>输入在输出画面的Y偏移。取值范围：<br>像素：[0，2000]<br>百分比：[0.01，0.99]<br>不填默认为0。<br>相对于大主播背景画面左上角的纵向偏移。<br>使用百分比时，期望输出为（百分比 * 背景宽）</p> 
     * @return LocationY <p>输入在输出画面的Y偏移。取值范围：<br>像素：[0，2000]<br>百分比：[0.01，0.99]<br>不填默认为0。<br>相对于大主播背景画面左上角的纵向偏移。<br>使用百分比时，期望输出为（百分比 * 背景宽）</p>
     */
    public Float getLocationY() {
        return this.LocationY;
    }

    /**
     * Set <p>输入在输出画面的Y偏移。取值范围：<br>像素：[0，2000]<br>百分比：[0.01，0.99]<br>不填默认为0。<br>相对于大主播背景画面左上角的纵向偏移。<br>使用百分比时，期望输出为（百分比 * 背景宽）</p>
     * @param LocationY <p>输入在输出画面的Y偏移。取值范围：<br>像素：[0，2000]<br>百分比：[0.01，0.99]<br>不填默认为0。<br>相对于大主播背景画面左上角的纵向偏移。<br>使用百分比时，期望输出为（百分比 * 背景宽）</p>
     */
    public void setLocationY(Float LocationY) {
        this.LocationY = LocationY;
    }

    /**
     * Get <p>当InputType为3(画布)时，该值表示画布的颜色。<br>常用的颜色有：<br>红色：0xCC0033。<br>黄色：0xCC9900。<br>绿色：0xCCCC33。<br>蓝色：0x99CCFF。<br>黑色：0x000000。<br>白色：0xFFFFFF。<br>灰色：0x999999。</p> 
     * @return Color <p>当InputType为3(画布)时，该值表示画布的颜色。<br>常用的颜色有：<br>红色：0xCC0033。<br>黄色：0xCC9900。<br>绿色：0xCCCC33。<br>蓝色：0x99CCFF。<br>黑色：0x000000。<br>白色：0xFFFFFF。<br>灰色：0x999999。</p>
     */
    public String getColor() {
        return this.Color;
    }

    /**
     * Set <p>当InputType为3(画布)时，该值表示画布的颜色。<br>常用的颜色有：<br>红色：0xCC0033。<br>黄色：0xCC9900。<br>绿色：0xCCCC33。<br>蓝色：0x99CCFF。<br>黑色：0x000000。<br>白色：0xFFFFFF。<br>灰色：0x999999。</p>
     * @param Color <p>当InputType为3(画布)时，该值表示画布的颜色。<br>常用的颜色有：<br>红色：0xCC0033。<br>黄色：0xCC9900。<br>绿色：0xCCCC33。<br>蓝色：0x99CCFF。<br>黑色：0x000000。<br>白色：0xFFFFFF。<br>灰色：0x999999。</p>
     */
    public void setColor(String Color) {
        this.Color = Color;
    }

    /**
     * Get <p>当InputType为2(图片)时，该值是水印ID。</p> 
     * @return WatermarkId <p>当InputType为2(图片)时，该值是水印ID。</p>
     */
    public Long getWatermarkId() {
        return this.WatermarkId;
    }

    /**
     * Set <p>当InputType为2(图片)时，该值是水印ID。</p>
     * @param WatermarkId <p>当InputType为2(图片)时，该值是水印ID。</p>
     */
    public void setWatermarkId(Long WatermarkId) {
        this.WatermarkId = WatermarkId;
    }

    /**
     * Get <p>当InputType为8时，该值是动效贴片的URL</p> 
     * @return WebPageUrl <p>当InputType为8时，该值是动效贴片的URL</p>
     */
    public String getWebPageUrl() {
        return this.WebPageUrl;
    }

    /**
     * Set <p>当InputType为8时，该值是动效贴片的URL</p>
     * @param WebPageUrl <p>当InputType为8时，该值是动效贴片的URL</p>
     */
    public void setWebPageUrl(String WebPageUrl) {
        this.WebPageUrl = WebPageUrl;
    }

    public CommonMixLayoutParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CommonMixLayoutParams(CommonMixLayoutParams source) {
        if (source.ImageLayer != null) {
            this.ImageLayer = new Long(source.ImageLayer);
        }
        if (source.InputType != null) {
            this.InputType = new Long(source.InputType);
        }
        if (source.ImageHeight != null) {
            this.ImageHeight = new Float(source.ImageHeight);
        }
        if (source.ImageWidth != null) {
            this.ImageWidth = new Float(source.ImageWidth);
        }
        if (source.LocationX != null) {
            this.LocationX = new Float(source.LocationX);
        }
        if (source.LocationY != null) {
            this.LocationY = new Float(source.LocationY);
        }
        if (source.Color != null) {
            this.Color = new String(source.Color);
        }
        if (source.WatermarkId != null) {
            this.WatermarkId = new Long(source.WatermarkId);
        }
        if (source.WebPageUrl != null) {
            this.WebPageUrl = new String(source.WebPageUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageLayer", this.ImageLayer);
        this.setParamSimple(map, prefix + "InputType", this.InputType);
        this.setParamSimple(map, prefix + "ImageHeight", this.ImageHeight);
        this.setParamSimple(map, prefix + "ImageWidth", this.ImageWidth);
        this.setParamSimple(map, prefix + "LocationX", this.LocationX);
        this.setParamSimple(map, prefix + "LocationY", this.LocationY);
        this.setParamSimple(map, prefix + "Color", this.Color);
        this.setParamSimple(map, prefix + "WatermarkId", this.WatermarkId);
        this.setParamSimple(map, prefix + "WebPageUrl", this.WebPageUrl);

    }
}

