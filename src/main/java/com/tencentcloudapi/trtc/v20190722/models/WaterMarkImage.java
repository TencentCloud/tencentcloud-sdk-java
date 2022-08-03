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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WaterMarkImage extends AbstractModel{

    /**
    * 下载的url地址， 只支持jpg， png，大小限制不超过5M。
    */
    @SerializedName("WaterMarkUrl")
    @Expose
    private String WaterMarkUrl;

    /**
    * 画布上该画面左上角的 y 轴坐标，取值范围 [0, 2560]，不能超过画布的高。
    */
    @SerializedName("Top")
    @Expose
    private Long Top;

    /**
    * 画布上该画面左上角的 x 轴坐标，取值范围 [0, 2560]，不能超过画布的宽。
    */
    @SerializedName("Left")
    @Expose
    private Long Left;

    /**
    * 画布上该画面宽度的相对值，取值范围 [0, 2560]，与Left相加不应超过画布的宽。
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 画布上该画面高度的相对值，取值范围 [0, 2560]，与Top相加不应超过画布的高。
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
     * Get 下载的url地址， 只支持jpg， png，大小限制不超过5M。 
     * @return WaterMarkUrl 下载的url地址， 只支持jpg， png，大小限制不超过5M。
     */
    public String getWaterMarkUrl() {
        return this.WaterMarkUrl;
    }

    /**
     * Set 下载的url地址， 只支持jpg， png，大小限制不超过5M。
     * @param WaterMarkUrl 下载的url地址， 只支持jpg， png，大小限制不超过5M。
     */
    public void setWaterMarkUrl(String WaterMarkUrl) {
        this.WaterMarkUrl = WaterMarkUrl;
    }

    /**
     * Get 画布上该画面左上角的 y 轴坐标，取值范围 [0, 2560]，不能超过画布的高。 
     * @return Top 画布上该画面左上角的 y 轴坐标，取值范围 [0, 2560]，不能超过画布的高。
     */
    public Long getTop() {
        return this.Top;
    }

    /**
     * Set 画布上该画面左上角的 y 轴坐标，取值范围 [0, 2560]，不能超过画布的高。
     * @param Top 画布上该画面左上角的 y 轴坐标，取值范围 [0, 2560]，不能超过画布的高。
     */
    public void setTop(Long Top) {
        this.Top = Top;
    }

    /**
     * Get 画布上该画面左上角的 x 轴坐标，取值范围 [0, 2560]，不能超过画布的宽。 
     * @return Left 画布上该画面左上角的 x 轴坐标，取值范围 [0, 2560]，不能超过画布的宽。
     */
    public Long getLeft() {
        return this.Left;
    }

    /**
     * Set 画布上该画面左上角的 x 轴坐标，取值范围 [0, 2560]，不能超过画布的宽。
     * @param Left 画布上该画面左上角的 x 轴坐标，取值范围 [0, 2560]，不能超过画布的宽。
     */
    public void setLeft(Long Left) {
        this.Left = Left;
    }

    /**
     * Get 画布上该画面宽度的相对值，取值范围 [0, 2560]，与Left相加不应超过画布的宽。 
     * @return Width 画布上该画面宽度的相对值，取值范围 [0, 2560]，与Left相加不应超过画布的宽。
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 画布上该画面宽度的相对值，取值范围 [0, 2560]，与Left相加不应超过画布的宽。
     * @param Width 画布上该画面宽度的相对值，取值范围 [0, 2560]，与Left相加不应超过画布的宽。
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 画布上该画面高度的相对值，取值范围 [0, 2560]，与Top相加不应超过画布的高。 
     * @return Height 画布上该画面高度的相对值，取值范围 [0, 2560]，与Top相加不应超过画布的高。
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 画布上该画面高度的相对值，取值范围 [0, 2560]，与Top相加不应超过画布的高。
     * @param Height 画布上该画面高度的相对值，取值范围 [0, 2560]，与Top相加不应超过画布的高。
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    public WaterMarkImage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WaterMarkImage(WaterMarkImage source) {
        if (source.WaterMarkUrl != null) {
            this.WaterMarkUrl = new String(source.WaterMarkUrl);
        }
        if (source.Top != null) {
            this.Top = new Long(source.Top);
        }
        if (source.Left != null) {
            this.Left = new Long(source.Left);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WaterMarkUrl", this.WaterMarkUrl);
        this.setParamSimple(map, prefix + "Top", this.Top);
        this.setParamSimple(map, prefix + "Left", this.Left);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);

    }
}

