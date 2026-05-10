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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MPSEraseArea extends AbstractModel {

    /**
    * <p>区域左上角X坐标。 如当Unit取1即使用百分比单位时，0.05表示区域左上角离整个画面左上角的横向距离为画面宽度的5%。</p>
    */
    @SerializedName("LeftTopX")
    @Expose
    private Float LeftTopX;

    /**
    * <p>区域左上角Y坐标。 如当Unit取1即使用百分比单位时，0.1表示区域左上角离整个画面左上角的纵向距离为画面高度的10%。</p>
    */
    @SerializedName("LeftTopY")
    @Expose
    private Float LeftTopY;

    /**
    * <p>区域右下角X坐标。 如当Unit取1即使用百分比单位时，0.75表示区域右下角离整个画面左上角的横向距离为画面宽度的75%。</p>
    */
    @SerializedName("RightBottomX")
    @Expose
    private Float RightBottomX;

    /**
    * <p>区域右下角Y坐标。 如当Unit取1即使用百分比单位时，0.9表示区域右下角离整个画面左上角的纵向距离为画面高度的90%。</p>
    */
    @SerializedName("RightBottomY")
    @Expose
    private Float RightBottomY;

    /**
    * <p>坐标单位 - 1 百分比 - 2 像素值</p>
    */
    @SerializedName("Unit")
    @Expose
    private Long Unit;

    /**
     * Get <p>区域左上角X坐标。 如当Unit取1即使用百分比单位时，0.05表示区域左上角离整个画面左上角的横向距离为画面宽度的5%。</p> 
     * @return LeftTopX <p>区域左上角X坐标。 如当Unit取1即使用百分比单位时，0.05表示区域左上角离整个画面左上角的横向距离为画面宽度的5%。</p>
     */
    public Float getLeftTopX() {
        return this.LeftTopX;
    }

    /**
     * Set <p>区域左上角X坐标。 如当Unit取1即使用百分比单位时，0.05表示区域左上角离整个画面左上角的横向距离为画面宽度的5%。</p>
     * @param LeftTopX <p>区域左上角X坐标。 如当Unit取1即使用百分比单位时，0.05表示区域左上角离整个画面左上角的横向距离为画面宽度的5%。</p>
     */
    public void setLeftTopX(Float LeftTopX) {
        this.LeftTopX = LeftTopX;
    }

    /**
     * Get <p>区域左上角Y坐标。 如当Unit取1即使用百分比单位时，0.1表示区域左上角离整个画面左上角的纵向距离为画面高度的10%。</p> 
     * @return LeftTopY <p>区域左上角Y坐标。 如当Unit取1即使用百分比单位时，0.1表示区域左上角离整个画面左上角的纵向距离为画面高度的10%。</p>
     */
    public Float getLeftTopY() {
        return this.LeftTopY;
    }

    /**
     * Set <p>区域左上角Y坐标。 如当Unit取1即使用百分比单位时，0.1表示区域左上角离整个画面左上角的纵向距离为画面高度的10%。</p>
     * @param LeftTopY <p>区域左上角Y坐标。 如当Unit取1即使用百分比单位时，0.1表示区域左上角离整个画面左上角的纵向距离为画面高度的10%。</p>
     */
    public void setLeftTopY(Float LeftTopY) {
        this.LeftTopY = LeftTopY;
    }

    /**
     * Get <p>区域右下角X坐标。 如当Unit取1即使用百分比单位时，0.75表示区域右下角离整个画面左上角的横向距离为画面宽度的75%。</p> 
     * @return RightBottomX <p>区域右下角X坐标。 如当Unit取1即使用百分比单位时，0.75表示区域右下角离整个画面左上角的横向距离为画面宽度的75%。</p>
     */
    public Float getRightBottomX() {
        return this.RightBottomX;
    }

    /**
     * Set <p>区域右下角X坐标。 如当Unit取1即使用百分比单位时，0.75表示区域右下角离整个画面左上角的横向距离为画面宽度的75%。</p>
     * @param RightBottomX <p>区域右下角X坐标。 如当Unit取1即使用百分比单位时，0.75表示区域右下角离整个画面左上角的横向距离为画面宽度的75%。</p>
     */
    public void setRightBottomX(Float RightBottomX) {
        this.RightBottomX = RightBottomX;
    }

    /**
     * Get <p>区域右下角Y坐标。 如当Unit取1即使用百分比单位时，0.9表示区域右下角离整个画面左上角的纵向距离为画面高度的90%。</p> 
     * @return RightBottomY <p>区域右下角Y坐标。 如当Unit取1即使用百分比单位时，0.9表示区域右下角离整个画面左上角的纵向距离为画面高度的90%。</p>
     */
    public Float getRightBottomY() {
        return this.RightBottomY;
    }

    /**
     * Set <p>区域右下角Y坐标。 如当Unit取1即使用百分比单位时，0.9表示区域右下角离整个画面左上角的纵向距离为画面高度的90%。</p>
     * @param RightBottomY <p>区域右下角Y坐标。 如当Unit取1即使用百分比单位时，0.9表示区域右下角离整个画面左上角的纵向距离为画面高度的90%。</p>
     */
    public void setRightBottomY(Float RightBottomY) {
        this.RightBottomY = RightBottomY;
    }

    /**
     * Get <p>坐标单位 - 1 百分比 - 2 像素值</p> 
     * @return Unit <p>坐标单位 - 1 百分比 - 2 像素值</p>
     */
    public Long getUnit() {
        return this.Unit;
    }

    /**
     * Set <p>坐标单位 - 1 百分比 - 2 像素值</p>
     * @param Unit <p>坐标单位 - 1 百分比 - 2 像素值</p>
     */
    public void setUnit(Long Unit) {
        this.Unit = Unit;
    }

    public MPSEraseArea() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MPSEraseArea(MPSEraseArea source) {
        if (source.LeftTopX != null) {
            this.LeftTopX = new Float(source.LeftTopX);
        }
        if (source.LeftTopY != null) {
            this.LeftTopY = new Float(source.LeftTopY);
        }
        if (source.RightBottomX != null) {
            this.RightBottomX = new Float(source.RightBottomX);
        }
        if (source.RightBottomY != null) {
            this.RightBottomY = new Float(source.RightBottomY);
        }
        if (source.Unit != null) {
            this.Unit = new Long(source.Unit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LeftTopX", this.LeftTopX);
        this.setParamSimple(map, prefix + "LeftTopY", this.LeftTopY);
        this.setParamSimple(map, prefix + "RightBottomX", this.RightBottomX);
        this.setParamSimple(map, prefix + "RightBottomY", this.RightBottomY);
        this.setParamSimple(map, prefix + "Unit", this.Unit);

    }
}

