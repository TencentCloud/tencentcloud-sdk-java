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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CommonMixCropParams extends AbstractModel{

    /**
    * 裁剪的宽度。取值范围[0，2000]。
    */
    @SerializedName("CropWidth")
    @Expose
    private Float CropWidth;

    /**
    * 裁剪的高度。取值范围[0，2000]。
    */
    @SerializedName("CropHeight")
    @Expose
    private Float CropHeight;

    /**
    * 裁剪的起始X坐标。取值范围[0，2000]。
    */
    @SerializedName("CropStartLocationX")
    @Expose
    private Float CropStartLocationX;

    /**
    * 裁剪的起始Y坐标。取值范围[0，2000]。
    */
    @SerializedName("CropStartLocationY")
    @Expose
    private Float CropStartLocationY;

    /**
     * Get 裁剪的宽度。取值范围[0，2000]。 
     * @return CropWidth 裁剪的宽度。取值范围[0，2000]。
     */
    public Float getCropWidth() {
        return this.CropWidth;
    }

    /**
     * Set 裁剪的宽度。取值范围[0，2000]。
     * @param CropWidth 裁剪的宽度。取值范围[0，2000]。
     */
    public void setCropWidth(Float CropWidth) {
        this.CropWidth = CropWidth;
    }

    /**
     * Get 裁剪的高度。取值范围[0，2000]。 
     * @return CropHeight 裁剪的高度。取值范围[0，2000]。
     */
    public Float getCropHeight() {
        return this.CropHeight;
    }

    /**
     * Set 裁剪的高度。取值范围[0，2000]。
     * @param CropHeight 裁剪的高度。取值范围[0，2000]。
     */
    public void setCropHeight(Float CropHeight) {
        this.CropHeight = CropHeight;
    }

    /**
     * Get 裁剪的起始X坐标。取值范围[0，2000]。 
     * @return CropStartLocationX 裁剪的起始X坐标。取值范围[0，2000]。
     */
    public Float getCropStartLocationX() {
        return this.CropStartLocationX;
    }

    /**
     * Set 裁剪的起始X坐标。取值范围[0，2000]。
     * @param CropStartLocationX 裁剪的起始X坐标。取值范围[0，2000]。
     */
    public void setCropStartLocationX(Float CropStartLocationX) {
        this.CropStartLocationX = CropStartLocationX;
    }

    /**
     * Get 裁剪的起始Y坐标。取值范围[0，2000]。 
     * @return CropStartLocationY 裁剪的起始Y坐标。取值范围[0，2000]。
     */
    public Float getCropStartLocationY() {
        return this.CropStartLocationY;
    }

    /**
     * Set 裁剪的起始Y坐标。取值范围[0，2000]。
     * @param CropStartLocationY 裁剪的起始Y坐标。取值范围[0，2000]。
     */
    public void setCropStartLocationY(Float CropStartLocationY) {
        this.CropStartLocationY = CropStartLocationY;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CropWidth", this.CropWidth);
        this.setParamSimple(map, prefix + "CropHeight", this.CropHeight);
        this.setParamSimple(map, prefix + "CropStartLocationX", this.CropStartLocationX);
        this.setParamSimple(map, prefix + "CropStartLocationY", this.CropStartLocationY);

    }
}

