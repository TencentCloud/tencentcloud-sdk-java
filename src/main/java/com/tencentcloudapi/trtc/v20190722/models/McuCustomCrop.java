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

public class McuCustomCrop extends AbstractModel{

    /**
    * 自定义裁剪起始位置的X偏移，单位为像素值，大于等于0。
    */
    @SerializedName("LocationX")
    @Expose
    private Long LocationX;

    /**
    * 自定义裁剪起始位置的Y偏移，单位为像素值，大于等于0。
    */
    @SerializedName("LocationY")
    @Expose
    private Long LocationY;

    /**
    * 自定义裁剪画面的宽度，单位为像素值，大于0，且LocationX+Width不超过10000
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 自定义裁剪画面的高度，单位为像素值，大于0，且LocationY+Height不超过10000
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
     * Get 自定义裁剪起始位置的X偏移，单位为像素值，大于等于0。 
     * @return LocationX 自定义裁剪起始位置的X偏移，单位为像素值，大于等于0。
     */
    public Long getLocationX() {
        return this.LocationX;
    }

    /**
     * Set 自定义裁剪起始位置的X偏移，单位为像素值，大于等于0。
     * @param LocationX 自定义裁剪起始位置的X偏移，单位为像素值，大于等于0。
     */
    public void setLocationX(Long LocationX) {
        this.LocationX = LocationX;
    }

    /**
     * Get 自定义裁剪起始位置的Y偏移，单位为像素值，大于等于0。 
     * @return LocationY 自定义裁剪起始位置的Y偏移，单位为像素值，大于等于0。
     */
    public Long getLocationY() {
        return this.LocationY;
    }

    /**
     * Set 自定义裁剪起始位置的Y偏移，单位为像素值，大于等于0。
     * @param LocationY 自定义裁剪起始位置的Y偏移，单位为像素值，大于等于0。
     */
    public void setLocationY(Long LocationY) {
        this.LocationY = LocationY;
    }

    /**
     * Get 自定义裁剪画面的宽度，单位为像素值，大于0，且LocationX+Width不超过10000 
     * @return Width 自定义裁剪画面的宽度，单位为像素值，大于0，且LocationX+Width不超过10000
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 自定义裁剪画面的宽度，单位为像素值，大于0，且LocationX+Width不超过10000
     * @param Width 自定义裁剪画面的宽度，单位为像素值，大于0，且LocationX+Width不超过10000
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 自定义裁剪画面的高度，单位为像素值，大于0，且LocationY+Height不超过10000 
     * @return Height 自定义裁剪画面的高度，单位为像素值，大于0，且LocationY+Height不超过10000
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 自定义裁剪画面的高度，单位为像素值，大于0，且LocationY+Height不超过10000
     * @param Height 自定义裁剪画面的高度，单位为像素值，大于0，且LocationY+Height不超过10000
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    public McuCustomCrop() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public McuCustomCrop(McuCustomCrop source) {
        if (source.LocationX != null) {
            this.LocationX = new Long(source.LocationX);
        }
        if (source.LocationY != null) {
            this.LocationY = new Long(source.LocationY);
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
        this.setParamSimple(map, prefix + "LocationX", this.LocationX);
        this.setParamSimple(map, prefix + "LocationY", this.LocationY);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);

    }
}

