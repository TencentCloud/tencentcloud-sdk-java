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
package com.tencentcloudapi.ie.v20200304.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SpriteImageInfo extends AbstractModel{

    /**
    * 表示雪碧图行数，默认：10。
    */
    @SerializedName("RowCount")
    @Expose
    private Long RowCount;

    /**
    * 表示雪碧图列数，默认：10。
    */
    @SerializedName("ColumnCount")
    @Expose
    private Long ColumnCount;

    /**
    * 第一行元素与顶部像素距离，默认：0。
    */
    @SerializedName("MarginTop")
    @Expose
    private Long MarginTop;

    /**
    * 最后一行元素与底部像素距离，默认：0。
    */
    @SerializedName("MarginBottom")
    @Expose
    private Long MarginBottom;

    /**
    * 最左一行元素与左边像素距离，默认：0。
    */
    @SerializedName("MarginLeft")
    @Expose
    private Long MarginLeft;

    /**
    * 最右一行元素与右边像素距离，默认：0。
    */
    @SerializedName("MarginRight")
    @Expose
    private Long MarginRight;

    /**
    * 小图与元素顶部像素距离，默认：0。
    */
    @SerializedName("PaddingTop")
    @Expose
    private Long PaddingTop;

    /**
    * 小图与元素底部像素距离，默认：0。
    */
    @SerializedName("PaddingBottom")
    @Expose
    private Long PaddingBottom;

    /**
    * 小图与元素左边像素距离，默认：0。
    */
    @SerializedName("PaddingLeft")
    @Expose
    private Long PaddingLeft;

    /**
    * 小图与元素右边像素距离，默认：0。
    */
    @SerializedName("PaddingRight")
    @Expose
    private Long PaddingRight;

    /**
    * 背景颜色，格式：#RRGGBB，默认：#FFFFFF。
    */
    @SerializedName("BackgroundColor")
    @Expose
    private String BackgroundColor;

    /**
     * Get 表示雪碧图行数，默认：10。 
     * @return RowCount 表示雪碧图行数，默认：10。
     */
    public Long getRowCount() {
        return this.RowCount;
    }

    /**
     * Set 表示雪碧图行数，默认：10。
     * @param RowCount 表示雪碧图行数，默认：10。
     */
    public void setRowCount(Long RowCount) {
        this.RowCount = RowCount;
    }

    /**
     * Get 表示雪碧图列数，默认：10。 
     * @return ColumnCount 表示雪碧图列数，默认：10。
     */
    public Long getColumnCount() {
        return this.ColumnCount;
    }

    /**
     * Set 表示雪碧图列数，默认：10。
     * @param ColumnCount 表示雪碧图列数，默认：10。
     */
    public void setColumnCount(Long ColumnCount) {
        this.ColumnCount = ColumnCount;
    }

    /**
     * Get 第一行元素与顶部像素距离，默认：0。 
     * @return MarginTop 第一行元素与顶部像素距离，默认：0。
     */
    public Long getMarginTop() {
        return this.MarginTop;
    }

    /**
     * Set 第一行元素与顶部像素距离，默认：0。
     * @param MarginTop 第一行元素与顶部像素距离，默认：0。
     */
    public void setMarginTop(Long MarginTop) {
        this.MarginTop = MarginTop;
    }

    /**
     * Get 最后一行元素与底部像素距离，默认：0。 
     * @return MarginBottom 最后一行元素与底部像素距离，默认：0。
     */
    public Long getMarginBottom() {
        return this.MarginBottom;
    }

    /**
     * Set 最后一行元素与底部像素距离，默认：0。
     * @param MarginBottom 最后一行元素与底部像素距离，默认：0。
     */
    public void setMarginBottom(Long MarginBottom) {
        this.MarginBottom = MarginBottom;
    }

    /**
     * Get 最左一行元素与左边像素距离，默认：0。 
     * @return MarginLeft 最左一行元素与左边像素距离，默认：0。
     */
    public Long getMarginLeft() {
        return this.MarginLeft;
    }

    /**
     * Set 最左一行元素与左边像素距离，默认：0。
     * @param MarginLeft 最左一行元素与左边像素距离，默认：0。
     */
    public void setMarginLeft(Long MarginLeft) {
        this.MarginLeft = MarginLeft;
    }

    /**
     * Get 最右一行元素与右边像素距离，默认：0。 
     * @return MarginRight 最右一行元素与右边像素距离，默认：0。
     */
    public Long getMarginRight() {
        return this.MarginRight;
    }

    /**
     * Set 最右一行元素与右边像素距离，默认：0。
     * @param MarginRight 最右一行元素与右边像素距离，默认：0。
     */
    public void setMarginRight(Long MarginRight) {
        this.MarginRight = MarginRight;
    }

    /**
     * Get 小图与元素顶部像素距离，默认：0。 
     * @return PaddingTop 小图与元素顶部像素距离，默认：0。
     */
    public Long getPaddingTop() {
        return this.PaddingTop;
    }

    /**
     * Set 小图与元素顶部像素距离，默认：0。
     * @param PaddingTop 小图与元素顶部像素距离，默认：0。
     */
    public void setPaddingTop(Long PaddingTop) {
        this.PaddingTop = PaddingTop;
    }

    /**
     * Get 小图与元素底部像素距离，默认：0。 
     * @return PaddingBottom 小图与元素底部像素距离，默认：0。
     */
    public Long getPaddingBottom() {
        return this.PaddingBottom;
    }

    /**
     * Set 小图与元素底部像素距离，默认：0。
     * @param PaddingBottom 小图与元素底部像素距离，默认：0。
     */
    public void setPaddingBottom(Long PaddingBottom) {
        this.PaddingBottom = PaddingBottom;
    }

    /**
     * Get 小图与元素左边像素距离，默认：0。 
     * @return PaddingLeft 小图与元素左边像素距离，默认：0。
     */
    public Long getPaddingLeft() {
        return this.PaddingLeft;
    }

    /**
     * Set 小图与元素左边像素距离，默认：0。
     * @param PaddingLeft 小图与元素左边像素距离，默认：0。
     */
    public void setPaddingLeft(Long PaddingLeft) {
        this.PaddingLeft = PaddingLeft;
    }

    /**
     * Get 小图与元素右边像素距离，默认：0。 
     * @return PaddingRight 小图与元素右边像素距离，默认：0。
     */
    public Long getPaddingRight() {
        return this.PaddingRight;
    }

    /**
     * Set 小图与元素右边像素距离，默认：0。
     * @param PaddingRight 小图与元素右边像素距离，默认：0。
     */
    public void setPaddingRight(Long PaddingRight) {
        this.PaddingRight = PaddingRight;
    }

    /**
     * Get 背景颜色，格式：#RRGGBB，默认：#FFFFFF。 
     * @return BackgroundColor 背景颜色，格式：#RRGGBB，默认：#FFFFFF。
     */
    public String getBackgroundColor() {
        return this.BackgroundColor;
    }

    /**
     * Set 背景颜色，格式：#RRGGBB，默认：#FFFFFF。
     * @param BackgroundColor 背景颜色，格式：#RRGGBB，默认：#FFFFFF。
     */
    public void setBackgroundColor(String BackgroundColor) {
        this.BackgroundColor = BackgroundColor;
    }

    public SpriteImageInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SpriteImageInfo(SpriteImageInfo source) {
        if (source.RowCount != null) {
            this.RowCount = new Long(source.RowCount);
        }
        if (source.ColumnCount != null) {
            this.ColumnCount = new Long(source.ColumnCount);
        }
        if (source.MarginTop != null) {
            this.MarginTop = new Long(source.MarginTop);
        }
        if (source.MarginBottom != null) {
            this.MarginBottom = new Long(source.MarginBottom);
        }
        if (source.MarginLeft != null) {
            this.MarginLeft = new Long(source.MarginLeft);
        }
        if (source.MarginRight != null) {
            this.MarginRight = new Long(source.MarginRight);
        }
        if (source.PaddingTop != null) {
            this.PaddingTop = new Long(source.PaddingTop);
        }
        if (source.PaddingBottom != null) {
            this.PaddingBottom = new Long(source.PaddingBottom);
        }
        if (source.PaddingLeft != null) {
            this.PaddingLeft = new Long(source.PaddingLeft);
        }
        if (source.PaddingRight != null) {
            this.PaddingRight = new Long(source.PaddingRight);
        }
        if (source.BackgroundColor != null) {
            this.BackgroundColor = new String(source.BackgroundColor);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RowCount", this.RowCount);
        this.setParamSimple(map, prefix + "ColumnCount", this.ColumnCount);
        this.setParamSimple(map, prefix + "MarginTop", this.MarginTop);
        this.setParamSimple(map, prefix + "MarginBottom", this.MarginBottom);
        this.setParamSimple(map, prefix + "MarginLeft", this.MarginLeft);
        this.setParamSimple(map, prefix + "MarginRight", this.MarginRight);
        this.setParamSimple(map, prefix + "PaddingTop", this.PaddingTop);
        this.setParamSimple(map, prefix + "PaddingBottom", this.PaddingBottom);
        this.setParamSimple(map, prefix + "PaddingLeft", this.PaddingLeft);
        this.setParamSimple(map, prefix + "PaddingRight", this.PaddingRight);
        this.setParamSimple(map, prefix + "BackgroundColor", this.BackgroundColor);

    }
}

