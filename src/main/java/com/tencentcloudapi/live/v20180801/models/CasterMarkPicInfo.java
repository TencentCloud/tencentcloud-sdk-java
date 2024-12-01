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

public class CasterMarkPicInfo extends AbstractModel {

    /**
    * 水印图片Index。
    */
    @SerializedName("MarkPicIndex")
    @Expose
    private Long MarkPicIndex;

    /**
    * 注：该字段已废弃。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MarkPicId")
    @Expose
    private Long MarkPicId;

    /**
    * 水印图片在输出时的宽度。
当该值为大于1的整数值时，单位为像素，允许范围[1,1920]。 
当该值为小于1大于0的小数时，单位为百分比，表示水印在最终画面上所占的比例值。
    */
    @SerializedName("MarkPicWidth")
    @Expose
    private Float MarkPicWidth;

    /**
    * 水印图片在输出时的高度。
当该值为大于1的整数值时，单位为像素，允许范围[1,1080]。 
当该值为小于1大于0的小数时，单位为百分比，表示水印在输出上所占的比例值。
    */
    @SerializedName("MarkPicHeight")
    @Expose
    private Float MarkPicHeight;

    /**
    * 水印图片在输出时的X轴坐标。
当该值为大于1的整数值时，单位为像素，允许范围[1,1920]。 
当该值为小于1大于0的小数时，单位为百分比，表示水印在最终画面上x坐标所占的比例值。
    */
    @SerializedName("MarkPicLocationX")
    @Expose
    private Float MarkPicLocationX;

    /**
    * 水印图片在输出时的Y坐标。
当该值为大于1的整数值时，单位为像素，允许范围[1,1080]。 
当该值为小于1大于0的小数时，单位为百分比，表示水印在最终画面Y坐标上所占的比例值。
    */
    @SerializedName("MarkPicLocationY")
    @Expose
    private Float MarkPicLocationY;

    /**
    * 水印地址。
最大长度256字符，且url需以jpg、jpeg、png、bmp、gif后缀结尾。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MarkPicUrl")
    @Expose
    private String MarkPicUrl;

    /**
    * 水印描述。
最大允许长度为256。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 是否启用了等比例缩放。
注：该字段仅做状态保存，无实际效果。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsEqualProportion")
    @Expose
    private Boolean IsEqualProportion;

    /**
     * Get 水印图片Index。 
     * @return MarkPicIndex 水印图片Index。
     */
    public Long getMarkPicIndex() {
        return this.MarkPicIndex;
    }

    /**
     * Set 水印图片Index。
     * @param MarkPicIndex 水印图片Index。
     */
    public void setMarkPicIndex(Long MarkPicIndex) {
        this.MarkPicIndex = MarkPicIndex;
    }

    /**
     * Get 注：该字段已废弃。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MarkPicId 注：该字段已废弃。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMarkPicId() {
        return this.MarkPicId;
    }

    /**
     * Set 注：该字段已废弃。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MarkPicId 注：该字段已废弃。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMarkPicId(Long MarkPicId) {
        this.MarkPicId = MarkPicId;
    }

    /**
     * Get 水印图片在输出时的宽度。
当该值为大于1的整数值时，单位为像素，允许范围[1,1920]。 
当该值为小于1大于0的小数时，单位为百分比，表示水印在最终画面上所占的比例值。 
     * @return MarkPicWidth 水印图片在输出时的宽度。
当该值为大于1的整数值时，单位为像素，允许范围[1,1920]。 
当该值为小于1大于0的小数时，单位为百分比，表示水印在最终画面上所占的比例值。
     */
    public Float getMarkPicWidth() {
        return this.MarkPicWidth;
    }

    /**
     * Set 水印图片在输出时的宽度。
当该值为大于1的整数值时，单位为像素，允许范围[1,1920]。 
当该值为小于1大于0的小数时，单位为百分比，表示水印在最终画面上所占的比例值。
     * @param MarkPicWidth 水印图片在输出时的宽度。
当该值为大于1的整数值时，单位为像素，允许范围[1,1920]。 
当该值为小于1大于0的小数时，单位为百分比，表示水印在最终画面上所占的比例值。
     */
    public void setMarkPicWidth(Float MarkPicWidth) {
        this.MarkPicWidth = MarkPicWidth;
    }

    /**
     * Get 水印图片在输出时的高度。
当该值为大于1的整数值时，单位为像素，允许范围[1,1080]。 
当该值为小于1大于0的小数时，单位为百分比，表示水印在输出上所占的比例值。 
     * @return MarkPicHeight 水印图片在输出时的高度。
当该值为大于1的整数值时，单位为像素，允许范围[1,1080]。 
当该值为小于1大于0的小数时，单位为百分比，表示水印在输出上所占的比例值。
     */
    public Float getMarkPicHeight() {
        return this.MarkPicHeight;
    }

    /**
     * Set 水印图片在输出时的高度。
当该值为大于1的整数值时，单位为像素，允许范围[1,1080]。 
当该值为小于1大于0的小数时，单位为百分比，表示水印在输出上所占的比例值。
     * @param MarkPicHeight 水印图片在输出时的高度。
当该值为大于1的整数值时，单位为像素，允许范围[1,1080]。 
当该值为小于1大于0的小数时，单位为百分比，表示水印在输出上所占的比例值。
     */
    public void setMarkPicHeight(Float MarkPicHeight) {
        this.MarkPicHeight = MarkPicHeight;
    }

    /**
     * Get 水印图片在输出时的X轴坐标。
当该值为大于1的整数值时，单位为像素，允许范围[1,1920]。 
当该值为小于1大于0的小数时，单位为百分比，表示水印在最终画面上x坐标所占的比例值。 
     * @return MarkPicLocationX 水印图片在输出时的X轴坐标。
当该值为大于1的整数值时，单位为像素，允许范围[1,1920]。 
当该值为小于1大于0的小数时，单位为百分比，表示水印在最终画面上x坐标所占的比例值。
     */
    public Float getMarkPicLocationX() {
        return this.MarkPicLocationX;
    }

    /**
     * Set 水印图片在输出时的X轴坐标。
当该值为大于1的整数值时，单位为像素，允许范围[1,1920]。 
当该值为小于1大于0的小数时，单位为百分比，表示水印在最终画面上x坐标所占的比例值。
     * @param MarkPicLocationX 水印图片在输出时的X轴坐标。
当该值为大于1的整数值时，单位为像素，允许范围[1,1920]。 
当该值为小于1大于0的小数时，单位为百分比，表示水印在最终画面上x坐标所占的比例值。
     */
    public void setMarkPicLocationX(Float MarkPicLocationX) {
        this.MarkPicLocationX = MarkPicLocationX;
    }

    /**
     * Get 水印图片在输出时的Y坐标。
当该值为大于1的整数值时，单位为像素，允许范围[1,1080]。 
当该值为小于1大于0的小数时，单位为百分比，表示水印在最终画面Y坐标上所占的比例值。 
     * @return MarkPicLocationY 水印图片在输出时的Y坐标。
当该值为大于1的整数值时，单位为像素，允许范围[1,1080]。 
当该值为小于1大于0的小数时，单位为百分比，表示水印在最终画面Y坐标上所占的比例值。
     */
    public Float getMarkPicLocationY() {
        return this.MarkPicLocationY;
    }

    /**
     * Set 水印图片在输出时的Y坐标。
当该值为大于1的整数值时，单位为像素，允许范围[1,1080]。 
当该值为小于1大于0的小数时，单位为百分比，表示水印在最终画面Y坐标上所占的比例值。
     * @param MarkPicLocationY 水印图片在输出时的Y坐标。
当该值为大于1的整数值时，单位为像素，允许范围[1,1080]。 
当该值为小于1大于0的小数时，单位为百分比，表示水印在最终画面Y坐标上所占的比例值。
     */
    public void setMarkPicLocationY(Float MarkPicLocationY) {
        this.MarkPicLocationY = MarkPicLocationY;
    }

    /**
     * Get 水印地址。
最大长度256字符，且url需以jpg、jpeg、png、bmp、gif后缀结尾。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MarkPicUrl 水印地址。
最大长度256字符，且url需以jpg、jpeg、png、bmp、gif后缀结尾。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMarkPicUrl() {
        return this.MarkPicUrl;
    }

    /**
     * Set 水印地址。
最大长度256字符，且url需以jpg、jpeg、png、bmp、gif后缀结尾。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MarkPicUrl 水印地址。
最大长度256字符，且url需以jpg、jpeg、png、bmp、gif后缀结尾。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMarkPicUrl(String MarkPicUrl) {
        this.MarkPicUrl = MarkPicUrl;
    }

    /**
     * Get 水印描述。
最大允许长度为256。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 水印描述。
最大允许长度为256。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 水印描述。
最大允许长度为256。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 水印描述。
最大允许长度为256。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 是否启用了等比例缩放。
注：该字段仅做状态保存，无实际效果。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsEqualProportion 是否启用了等比例缩放。
注：该字段仅做状态保存，无实际效果。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsEqualProportion() {
        return this.IsEqualProportion;
    }

    /**
     * Set 是否启用了等比例缩放。
注：该字段仅做状态保存，无实际效果。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsEqualProportion 是否启用了等比例缩放。
注：该字段仅做状态保存，无实际效果。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsEqualProportion(Boolean IsEqualProportion) {
        this.IsEqualProportion = IsEqualProportion;
    }

    public CasterMarkPicInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CasterMarkPicInfo(CasterMarkPicInfo source) {
        if (source.MarkPicIndex != null) {
            this.MarkPicIndex = new Long(source.MarkPicIndex);
        }
        if (source.MarkPicId != null) {
            this.MarkPicId = new Long(source.MarkPicId);
        }
        if (source.MarkPicWidth != null) {
            this.MarkPicWidth = new Float(source.MarkPicWidth);
        }
        if (source.MarkPicHeight != null) {
            this.MarkPicHeight = new Float(source.MarkPicHeight);
        }
        if (source.MarkPicLocationX != null) {
            this.MarkPicLocationX = new Float(source.MarkPicLocationX);
        }
        if (source.MarkPicLocationY != null) {
            this.MarkPicLocationY = new Float(source.MarkPicLocationY);
        }
        if (source.MarkPicUrl != null) {
            this.MarkPicUrl = new String(source.MarkPicUrl);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.IsEqualProportion != null) {
            this.IsEqualProportion = new Boolean(source.IsEqualProportion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MarkPicIndex", this.MarkPicIndex);
        this.setParamSimple(map, prefix + "MarkPicId", this.MarkPicId);
        this.setParamSimple(map, prefix + "MarkPicWidth", this.MarkPicWidth);
        this.setParamSimple(map, prefix + "MarkPicHeight", this.MarkPicHeight);
        this.setParamSimple(map, prefix + "MarkPicLocationX", this.MarkPicLocationX);
        this.setParamSimple(map, prefix + "MarkPicLocationY", this.MarkPicLocationY);
        this.setParamSimple(map, prefix + "MarkPicUrl", this.MarkPicUrl);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "IsEqualProportion", this.IsEqualProportion);

    }
}

