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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class McuWaterMarkText extends AbstractModel {

    /**
    * 文字水印内容。
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 水印在输出时的宽。单位为像素值。
    */
    @SerializedName("WaterMarkWidth")
    @Expose
    private Long WaterMarkWidth;

    /**
    * 水印在输出时的高。单位为像素值。
    */
    @SerializedName("WaterMarkHeight")
    @Expose
    private Long WaterMarkHeight;

    /**
    * 水印在输出时的X偏移。单位为像素值。
    */
    @SerializedName("LocationX")
    @Expose
    private Long LocationX;

    /**
    * 水印在输出时的Y偏移。单位为像素值。
    */
    @SerializedName("LocationY")
    @Expose
    private Long LocationY;

    /**
    * 字体大小
    */
    @SerializedName("FontSize")
    @Expose
    private Long FontSize;

    /**
    * 字体颜色，默认为白色。常用的颜色有： 红色：0xcc0033。 黄色：0xcc9900。 绿色：0xcccc33。 蓝色：0x99CCFF。 黑色：0x000000。 白色：0xFFFFFF。 灰色：0x999999。	
    */
    @SerializedName("FontColor")
    @Expose
    private String FontColor;

    /**
    * 字体背景色，不配置默认为透明。常用的颜色有： 红色：0xcc0033。 黄色：0xcc9900。 绿色：0xcccc33。 蓝色：0x99CCFF。 黑色：0x000000。 白色：0xFFFFFF。 灰色：0x999999。	
    */
    @SerializedName("BackGroundColor")
    @Expose
    private String BackGroundColor;

    /**
    * 动态水印类型，默认为0。0:关闭；1:随机位置，每秒变动一次；2:边界扫描反弹，每帧变动一次。
    */
    @SerializedName("DynamicPosType")
    @Expose
    private Long DynamicPosType;

    /**
    * 水印在输出时的层级，不填默认为0。
    */
    @SerializedName("ZOrder")
    @Expose
    private Long ZOrder;

    /**
    * 水印字体，不填默认为Tencent。支持设置以下值： Tencent （默认） SourceHanSans
    */
    @SerializedName("Font")
    @Expose
    private String Font;

    /**
     * Get 文字水印内容。 
     * @return Text 文字水印内容。
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 文字水印内容。
     * @param Text 文字水印内容。
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get 水印在输出时的宽。单位为像素值。 
     * @return WaterMarkWidth 水印在输出时的宽。单位为像素值。
     */
    public Long getWaterMarkWidth() {
        return this.WaterMarkWidth;
    }

    /**
     * Set 水印在输出时的宽。单位为像素值。
     * @param WaterMarkWidth 水印在输出时的宽。单位为像素值。
     */
    public void setWaterMarkWidth(Long WaterMarkWidth) {
        this.WaterMarkWidth = WaterMarkWidth;
    }

    /**
     * Get 水印在输出时的高。单位为像素值。 
     * @return WaterMarkHeight 水印在输出时的高。单位为像素值。
     */
    public Long getWaterMarkHeight() {
        return this.WaterMarkHeight;
    }

    /**
     * Set 水印在输出时的高。单位为像素值。
     * @param WaterMarkHeight 水印在输出时的高。单位为像素值。
     */
    public void setWaterMarkHeight(Long WaterMarkHeight) {
        this.WaterMarkHeight = WaterMarkHeight;
    }

    /**
     * Get 水印在输出时的X偏移。单位为像素值。 
     * @return LocationX 水印在输出时的X偏移。单位为像素值。
     */
    public Long getLocationX() {
        return this.LocationX;
    }

    /**
     * Set 水印在输出时的X偏移。单位为像素值。
     * @param LocationX 水印在输出时的X偏移。单位为像素值。
     */
    public void setLocationX(Long LocationX) {
        this.LocationX = LocationX;
    }

    /**
     * Get 水印在输出时的Y偏移。单位为像素值。 
     * @return LocationY 水印在输出时的Y偏移。单位为像素值。
     */
    public Long getLocationY() {
        return this.LocationY;
    }

    /**
     * Set 水印在输出时的Y偏移。单位为像素值。
     * @param LocationY 水印在输出时的Y偏移。单位为像素值。
     */
    public void setLocationY(Long LocationY) {
        this.LocationY = LocationY;
    }

    /**
     * Get 字体大小 
     * @return FontSize 字体大小
     */
    public Long getFontSize() {
        return this.FontSize;
    }

    /**
     * Set 字体大小
     * @param FontSize 字体大小
     */
    public void setFontSize(Long FontSize) {
        this.FontSize = FontSize;
    }

    /**
     * Get 字体颜色，默认为白色。常用的颜色有： 红色：0xcc0033。 黄色：0xcc9900。 绿色：0xcccc33。 蓝色：0x99CCFF。 黑色：0x000000。 白色：0xFFFFFF。 灰色：0x999999。	 
     * @return FontColor 字体颜色，默认为白色。常用的颜色有： 红色：0xcc0033。 黄色：0xcc9900。 绿色：0xcccc33。 蓝色：0x99CCFF。 黑色：0x000000。 白色：0xFFFFFF。 灰色：0x999999。	
     */
    public String getFontColor() {
        return this.FontColor;
    }

    /**
     * Set 字体颜色，默认为白色。常用的颜色有： 红色：0xcc0033。 黄色：0xcc9900。 绿色：0xcccc33。 蓝色：0x99CCFF。 黑色：0x000000。 白色：0xFFFFFF。 灰色：0x999999。	
     * @param FontColor 字体颜色，默认为白色。常用的颜色有： 红色：0xcc0033。 黄色：0xcc9900。 绿色：0xcccc33。 蓝色：0x99CCFF。 黑色：0x000000。 白色：0xFFFFFF。 灰色：0x999999。	
     */
    public void setFontColor(String FontColor) {
        this.FontColor = FontColor;
    }

    /**
     * Get 字体背景色，不配置默认为透明。常用的颜色有： 红色：0xcc0033。 黄色：0xcc9900。 绿色：0xcccc33。 蓝色：0x99CCFF。 黑色：0x000000。 白色：0xFFFFFF。 灰色：0x999999。	 
     * @return BackGroundColor 字体背景色，不配置默认为透明。常用的颜色有： 红色：0xcc0033。 黄色：0xcc9900。 绿色：0xcccc33。 蓝色：0x99CCFF。 黑色：0x000000。 白色：0xFFFFFF。 灰色：0x999999。	
     */
    public String getBackGroundColor() {
        return this.BackGroundColor;
    }

    /**
     * Set 字体背景色，不配置默认为透明。常用的颜色有： 红色：0xcc0033。 黄色：0xcc9900。 绿色：0xcccc33。 蓝色：0x99CCFF。 黑色：0x000000。 白色：0xFFFFFF。 灰色：0x999999。	
     * @param BackGroundColor 字体背景色，不配置默认为透明。常用的颜色有： 红色：0xcc0033。 黄色：0xcc9900。 绿色：0xcccc33。 蓝色：0x99CCFF。 黑色：0x000000。 白色：0xFFFFFF。 灰色：0x999999。	
     */
    public void setBackGroundColor(String BackGroundColor) {
        this.BackGroundColor = BackGroundColor;
    }

    /**
     * Get 动态水印类型，默认为0。0:关闭；1:随机位置，每秒变动一次；2:边界扫描反弹，每帧变动一次。 
     * @return DynamicPosType 动态水印类型，默认为0。0:关闭；1:随机位置，每秒变动一次；2:边界扫描反弹，每帧变动一次。
     */
    public Long getDynamicPosType() {
        return this.DynamicPosType;
    }

    /**
     * Set 动态水印类型，默认为0。0:关闭；1:随机位置，每秒变动一次；2:边界扫描反弹，每帧变动一次。
     * @param DynamicPosType 动态水印类型，默认为0。0:关闭；1:随机位置，每秒变动一次；2:边界扫描反弹，每帧变动一次。
     */
    public void setDynamicPosType(Long DynamicPosType) {
        this.DynamicPosType = DynamicPosType;
    }

    /**
     * Get 水印在输出时的层级，不填默认为0。 
     * @return ZOrder 水印在输出时的层级，不填默认为0。
     */
    public Long getZOrder() {
        return this.ZOrder;
    }

    /**
     * Set 水印在输出时的层级，不填默认为0。
     * @param ZOrder 水印在输出时的层级，不填默认为0。
     */
    public void setZOrder(Long ZOrder) {
        this.ZOrder = ZOrder;
    }

    /**
     * Get 水印字体，不填默认为Tencent。支持设置以下值： Tencent （默认） SourceHanSans 
     * @return Font 水印字体，不填默认为Tencent。支持设置以下值： Tencent （默认） SourceHanSans
     */
    public String getFont() {
        return this.Font;
    }

    /**
     * Set 水印字体，不填默认为Tencent。支持设置以下值： Tencent （默认） SourceHanSans
     * @param Font 水印字体，不填默认为Tencent。支持设置以下值： Tencent （默认） SourceHanSans
     */
    public void setFont(String Font) {
        this.Font = Font;
    }

    public McuWaterMarkText() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public McuWaterMarkText(McuWaterMarkText source) {
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.WaterMarkWidth != null) {
            this.WaterMarkWidth = new Long(source.WaterMarkWidth);
        }
        if (source.WaterMarkHeight != null) {
            this.WaterMarkHeight = new Long(source.WaterMarkHeight);
        }
        if (source.LocationX != null) {
            this.LocationX = new Long(source.LocationX);
        }
        if (source.LocationY != null) {
            this.LocationY = new Long(source.LocationY);
        }
        if (source.FontSize != null) {
            this.FontSize = new Long(source.FontSize);
        }
        if (source.FontColor != null) {
            this.FontColor = new String(source.FontColor);
        }
        if (source.BackGroundColor != null) {
            this.BackGroundColor = new String(source.BackGroundColor);
        }
        if (source.DynamicPosType != null) {
            this.DynamicPosType = new Long(source.DynamicPosType);
        }
        if (source.ZOrder != null) {
            this.ZOrder = new Long(source.ZOrder);
        }
        if (source.Font != null) {
            this.Font = new String(source.Font);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "WaterMarkWidth", this.WaterMarkWidth);
        this.setParamSimple(map, prefix + "WaterMarkHeight", this.WaterMarkHeight);
        this.setParamSimple(map, prefix + "LocationX", this.LocationX);
        this.setParamSimple(map, prefix + "LocationY", this.LocationY);
        this.setParamSimple(map, prefix + "FontSize", this.FontSize);
        this.setParamSimple(map, prefix + "FontColor", this.FontColor);
        this.setParamSimple(map, prefix + "BackGroundColor", this.BackGroundColor);
        this.setParamSimple(map, prefix + "DynamicPosType", this.DynamicPosType);
        this.setParamSimple(map, prefix + "ZOrder", this.ZOrder);
        this.setParamSimple(map, prefix + "Font", this.Font);

    }
}

