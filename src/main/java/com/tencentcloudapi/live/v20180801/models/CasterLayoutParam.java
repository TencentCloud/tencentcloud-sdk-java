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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CasterLayoutParam extends AbstractModel {

    /**
    * 布局层ID。
在画面最终渲染时，将按ID从小到大的顺序，由下至上渲染。
    */
    @SerializedName("LayerId")
    @Expose
    private Long LayerId;

    /**
    * 布局层宽度。
当该值为大于1的整数值时，单位为像素，允许范围[1,1920]。
当该值为小于1大于0的小数时，单位为百分比，表示该层在最终画面上所占的比例值。
    */
    @SerializedName("LayerWidth")
    @Expose
    private Float LayerWidth;

    /**
    * 布局层高度.
当该值为大于1的整数值时，单位为像素，允许范围[1,1920]。
当该值为小于1大于0的小数时，单位为百分比，表示该层在最终画面上所占的比例值。
    */
    @SerializedName("LayerHeight")
    @Expose
    private Float LayerHeight;

    /**
    * 布局层位置x坐标。
当该值为大于1的整数值时，单位为像素，允许范围[1,1920]。
当该值为小于1大于0的小数时，单位为百分比，表示该层在最终画面上x坐标所占的比例值。
    */
    @SerializedName("LayerLocationX")
    @Expose
    private Float LayerLocationX;

    /**
    * 布局层位置Y坐标。
当该值为大于1的整数值时，单位为像素，允许范围[1,1920]。
当该值为小于1大于0的小数时，单位为百分比，表示该层在最终画面Y坐标上所占的比例值。
    */
    @SerializedName("LayerLocationY")
    @Expose
    private Float LayerLocationY;

    /**
    * 是否启用抠图。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UsePortraitSegment")
    @Expose
    private Boolean UsePortraitSegment;

    /**
     * Get 布局层ID。
在画面最终渲染时，将按ID从小到大的顺序，由下至上渲染。 
     * @return LayerId 布局层ID。
在画面最终渲染时，将按ID从小到大的顺序，由下至上渲染。
     */
    public Long getLayerId() {
        return this.LayerId;
    }

    /**
     * Set 布局层ID。
在画面最终渲染时，将按ID从小到大的顺序，由下至上渲染。
     * @param LayerId 布局层ID。
在画面最终渲染时，将按ID从小到大的顺序，由下至上渲染。
     */
    public void setLayerId(Long LayerId) {
        this.LayerId = LayerId;
    }

    /**
     * Get 布局层宽度。
当该值为大于1的整数值时，单位为像素，允许范围[1,1920]。
当该值为小于1大于0的小数时，单位为百分比，表示该层在最终画面上所占的比例值。 
     * @return LayerWidth 布局层宽度。
当该值为大于1的整数值时，单位为像素，允许范围[1,1920]。
当该值为小于1大于0的小数时，单位为百分比，表示该层在最终画面上所占的比例值。
     */
    public Float getLayerWidth() {
        return this.LayerWidth;
    }

    /**
     * Set 布局层宽度。
当该值为大于1的整数值时，单位为像素，允许范围[1,1920]。
当该值为小于1大于0的小数时，单位为百分比，表示该层在最终画面上所占的比例值。
     * @param LayerWidth 布局层宽度。
当该值为大于1的整数值时，单位为像素，允许范围[1,1920]。
当该值为小于1大于0的小数时，单位为百分比，表示该层在最终画面上所占的比例值。
     */
    public void setLayerWidth(Float LayerWidth) {
        this.LayerWidth = LayerWidth;
    }

    /**
     * Get 布局层高度.
当该值为大于1的整数值时，单位为像素，允许范围[1,1920]。
当该值为小于1大于0的小数时，单位为百分比，表示该层在最终画面上所占的比例值。 
     * @return LayerHeight 布局层高度.
当该值为大于1的整数值时，单位为像素，允许范围[1,1920]。
当该值为小于1大于0的小数时，单位为百分比，表示该层在最终画面上所占的比例值。
     */
    public Float getLayerHeight() {
        return this.LayerHeight;
    }

    /**
     * Set 布局层高度.
当该值为大于1的整数值时，单位为像素，允许范围[1,1920]。
当该值为小于1大于0的小数时，单位为百分比，表示该层在最终画面上所占的比例值。
     * @param LayerHeight 布局层高度.
当该值为大于1的整数值时，单位为像素，允许范围[1,1920]。
当该值为小于1大于0的小数时，单位为百分比，表示该层在最终画面上所占的比例值。
     */
    public void setLayerHeight(Float LayerHeight) {
        this.LayerHeight = LayerHeight;
    }

    /**
     * Get 布局层位置x坐标。
当该值为大于1的整数值时，单位为像素，允许范围[1,1920]。
当该值为小于1大于0的小数时，单位为百分比，表示该层在最终画面上x坐标所占的比例值。 
     * @return LayerLocationX 布局层位置x坐标。
当该值为大于1的整数值时，单位为像素，允许范围[1,1920]。
当该值为小于1大于0的小数时，单位为百分比，表示该层在最终画面上x坐标所占的比例值。
     */
    public Float getLayerLocationX() {
        return this.LayerLocationX;
    }

    /**
     * Set 布局层位置x坐标。
当该值为大于1的整数值时，单位为像素，允许范围[1,1920]。
当该值为小于1大于0的小数时，单位为百分比，表示该层在最终画面上x坐标所占的比例值。
     * @param LayerLocationX 布局层位置x坐标。
当该值为大于1的整数值时，单位为像素，允许范围[1,1920]。
当该值为小于1大于0的小数时，单位为百分比，表示该层在最终画面上x坐标所占的比例值。
     */
    public void setLayerLocationX(Float LayerLocationX) {
        this.LayerLocationX = LayerLocationX;
    }

    /**
     * Get 布局层位置Y坐标。
当该值为大于1的整数值时，单位为像素，允许范围[1,1920]。
当该值为小于1大于0的小数时，单位为百分比，表示该层在最终画面Y坐标上所占的比例值。 
     * @return LayerLocationY 布局层位置Y坐标。
当该值为大于1的整数值时，单位为像素，允许范围[1,1920]。
当该值为小于1大于0的小数时，单位为百分比，表示该层在最终画面Y坐标上所占的比例值。
     */
    public Float getLayerLocationY() {
        return this.LayerLocationY;
    }

    /**
     * Set 布局层位置Y坐标。
当该值为大于1的整数值时，单位为像素，允许范围[1,1920]。
当该值为小于1大于0的小数时，单位为百分比，表示该层在最终画面Y坐标上所占的比例值。
     * @param LayerLocationY 布局层位置Y坐标。
当该值为大于1的整数值时，单位为像素，允许范围[1,1920]。
当该值为小于1大于0的小数时，单位为百分比，表示该层在最终画面Y坐标上所占的比例值。
     */
    public void setLayerLocationY(Float LayerLocationY) {
        this.LayerLocationY = LayerLocationY;
    }

    /**
     * Get 是否启用抠图。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UsePortraitSegment 是否启用抠图。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getUsePortraitSegment() {
        return this.UsePortraitSegment;
    }

    /**
     * Set 是否启用抠图。
注意：此字段可能返回 null，表示取不到有效值。
     * @param UsePortraitSegment 是否启用抠图。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUsePortraitSegment(Boolean UsePortraitSegment) {
        this.UsePortraitSegment = UsePortraitSegment;
    }

    public CasterLayoutParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CasterLayoutParam(CasterLayoutParam source) {
        if (source.LayerId != null) {
            this.LayerId = new Long(source.LayerId);
        }
        if (source.LayerWidth != null) {
            this.LayerWidth = new Float(source.LayerWidth);
        }
        if (source.LayerHeight != null) {
            this.LayerHeight = new Float(source.LayerHeight);
        }
        if (source.LayerLocationX != null) {
            this.LayerLocationX = new Float(source.LayerLocationX);
        }
        if (source.LayerLocationY != null) {
            this.LayerLocationY = new Float(source.LayerLocationY);
        }
        if (source.UsePortraitSegment != null) {
            this.UsePortraitSegment = new Boolean(source.UsePortraitSegment);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LayerId", this.LayerId);
        this.setParamSimple(map, prefix + "LayerWidth", this.LayerWidth);
        this.setParamSimple(map, prefix + "LayerHeight", this.LayerHeight);
        this.setParamSimple(map, prefix + "LayerLocationX", this.LayerLocationX);
        this.setParamSimple(map, prefix + "LayerLocationY", this.LayerLocationY);
        this.setParamSimple(map, prefix + "UsePortraitSegment", this.UsePortraitSegment);

    }
}

