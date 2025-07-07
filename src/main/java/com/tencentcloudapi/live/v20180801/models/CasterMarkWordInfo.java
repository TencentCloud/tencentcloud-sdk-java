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

public class CasterMarkWordInfo extends AbstractModel {

    /**
    * 文字水印Index。
    */
    @SerializedName("MarkWordIndex")
    @Expose
    private Long MarkWordIndex;

    /**
    * 文字水印内容。
    */
    @SerializedName("MarkWordText")
    @Expose
    private String MarkWordText;

    /**
    * 文字水印的字号。
范围[16, 60]
    */
    @SerializedName("MarkWordFontSize")
    @Expose
    private Long MarkWordFontSize;

    /**
    * 文字水印的颜色，值为HEX颜色代码
    */
    @SerializedName("MarkWordFontColor")
    @Expose
    private String MarkWordFontColor;

    /**
    * 文字水印的字体类型。
范围[1,2]。
1. 宋体
2. 黑体
    */
    @SerializedName("MarkWordFontType")
    @Expose
    private Long MarkWordFontType;

    /**
    * 文字水印的x坐标位置，单位百分比。
范围[0.0, 1.0]

    */
    @SerializedName("MarkWordLocationX")
    @Expose
    private Float MarkWordLocationX;

    /**
    * 文字水印的Y坐标位置，单位百分比。
范围[0.0, 1.0]

    */
    @SerializedName("MarkWordLocationY")
    @Expose
    private Float MarkWordLocationY;

    /**
    * 是否开启文字跑马灯功能。
默认为false。
    */
    @SerializedName("MarkWordRollEnable")
    @Expose
    private Boolean MarkWordRollEnable;

    /**
    * 跑马灯文字显示一遍的时间，单位为秒。
默认为5s。
范围[5, 600]。
    */
    @SerializedName("MarkWordRollOnceTime")
    @Expose
    private Long MarkWordRollOnceTime;

    /**
    * 跑马灯文字的方向。
默认值为0。
范围[0,1]。
0 从左到右
1 从右到左
    */
    @SerializedName("MarkWordRollDirection")
    @Expose
    private Long MarkWordRollDirection;

    /**
    * 跑马灯文字显示的起始x坐标，单位百分比。
范围[0.0, 1.0]
    */
    @SerializedName("MarkWordRollStartLocationX")
    @Expose
    private Float MarkWordRollStartLocationX;

    /**
    * 跑马灯文字显示的截止x坐标，单位百分比。
范围[0.0, 1.0]
    */
    @SerializedName("MarkWordRollEndLocationX")
    @Expose
    private Float MarkWordRollEndLocationX;

    /**
     * Get 文字水印Index。 
     * @return MarkWordIndex 文字水印Index。
     */
    public Long getMarkWordIndex() {
        return this.MarkWordIndex;
    }

    /**
     * Set 文字水印Index。
     * @param MarkWordIndex 文字水印Index。
     */
    public void setMarkWordIndex(Long MarkWordIndex) {
        this.MarkWordIndex = MarkWordIndex;
    }

    /**
     * Get 文字水印内容。 
     * @return MarkWordText 文字水印内容。
     */
    public String getMarkWordText() {
        return this.MarkWordText;
    }

    /**
     * Set 文字水印内容。
     * @param MarkWordText 文字水印内容。
     */
    public void setMarkWordText(String MarkWordText) {
        this.MarkWordText = MarkWordText;
    }

    /**
     * Get 文字水印的字号。
范围[16, 60] 
     * @return MarkWordFontSize 文字水印的字号。
范围[16, 60]
     */
    public Long getMarkWordFontSize() {
        return this.MarkWordFontSize;
    }

    /**
     * Set 文字水印的字号。
范围[16, 60]
     * @param MarkWordFontSize 文字水印的字号。
范围[16, 60]
     */
    public void setMarkWordFontSize(Long MarkWordFontSize) {
        this.MarkWordFontSize = MarkWordFontSize;
    }

    /**
     * Get 文字水印的颜色，值为HEX颜色代码 
     * @return MarkWordFontColor 文字水印的颜色，值为HEX颜色代码
     */
    public String getMarkWordFontColor() {
        return this.MarkWordFontColor;
    }

    /**
     * Set 文字水印的颜色，值为HEX颜色代码
     * @param MarkWordFontColor 文字水印的颜色，值为HEX颜色代码
     */
    public void setMarkWordFontColor(String MarkWordFontColor) {
        this.MarkWordFontColor = MarkWordFontColor;
    }

    /**
     * Get 文字水印的字体类型。
范围[1,2]。
1. 宋体
2. 黑体 
     * @return MarkWordFontType 文字水印的字体类型。
范围[1,2]。
1. 宋体
2. 黑体
     */
    public Long getMarkWordFontType() {
        return this.MarkWordFontType;
    }

    /**
     * Set 文字水印的字体类型。
范围[1,2]。
1. 宋体
2. 黑体
     * @param MarkWordFontType 文字水印的字体类型。
范围[1,2]。
1. 宋体
2. 黑体
     */
    public void setMarkWordFontType(Long MarkWordFontType) {
        this.MarkWordFontType = MarkWordFontType;
    }

    /**
     * Get 文字水印的x坐标位置，单位百分比。
范围[0.0, 1.0]
 
     * @return MarkWordLocationX 文字水印的x坐标位置，单位百分比。
范围[0.0, 1.0]

     */
    public Float getMarkWordLocationX() {
        return this.MarkWordLocationX;
    }

    /**
     * Set 文字水印的x坐标位置，单位百分比。
范围[0.0, 1.0]

     * @param MarkWordLocationX 文字水印的x坐标位置，单位百分比。
范围[0.0, 1.0]

     */
    public void setMarkWordLocationX(Float MarkWordLocationX) {
        this.MarkWordLocationX = MarkWordLocationX;
    }

    /**
     * Get 文字水印的Y坐标位置，单位百分比。
范围[0.0, 1.0]
 
     * @return MarkWordLocationY 文字水印的Y坐标位置，单位百分比。
范围[0.0, 1.0]

     */
    public Float getMarkWordLocationY() {
        return this.MarkWordLocationY;
    }

    /**
     * Set 文字水印的Y坐标位置，单位百分比。
范围[0.0, 1.0]

     * @param MarkWordLocationY 文字水印的Y坐标位置，单位百分比。
范围[0.0, 1.0]

     */
    public void setMarkWordLocationY(Float MarkWordLocationY) {
        this.MarkWordLocationY = MarkWordLocationY;
    }

    /**
     * Get 是否开启文字跑马灯功能。
默认为false。 
     * @return MarkWordRollEnable 是否开启文字跑马灯功能。
默认为false。
     */
    public Boolean getMarkWordRollEnable() {
        return this.MarkWordRollEnable;
    }

    /**
     * Set 是否开启文字跑马灯功能。
默认为false。
     * @param MarkWordRollEnable 是否开启文字跑马灯功能。
默认为false。
     */
    public void setMarkWordRollEnable(Boolean MarkWordRollEnable) {
        this.MarkWordRollEnable = MarkWordRollEnable;
    }

    /**
     * Get 跑马灯文字显示一遍的时间，单位为秒。
默认为5s。
范围[5, 600]。 
     * @return MarkWordRollOnceTime 跑马灯文字显示一遍的时间，单位为秒。
默认为5s。
范围[5, 600]。
     */
    public Long getMarkWordRollOnceTime() {
        return this.MarkWordRollOnceTime;
    }

    /**
     * Set 跑马灯文字显示一遍的时间，单位为秒。
默认为5s。
范围[5, 600]。
     * @param MarkWordRollOnceTime 跑马灯文字显示一遍的时间，单位为秒。
默认为5s。
范围[5, 600]。
     */
    public void setMarkWordRollOnceTime(Long MarkWordRollOnceTime) {
        this.MarkWordRollOnceTime = MarkWordRollOnceTime;
    }

    /**
     * Get 跑马灯文字的方向。
默认值为0。
范围[0,1]。
0 从左到右
1 从右到左 
     * @return MarkWordRollDirection 跑马灯文字的方向。
默认值为0。
范围[0,1]。
0 从左到右
1 从右到左
     */
    public Long getMarkWordRollDirection() {
        return this.MarkWordRollDirection;
    }

    /**
     * Set 跑马灯文字的方向。
默认值为0。
范围[0,1]。
0 从左到右
1 从右到左
     * @param MarkWordRollDirection 跑马灯文字的方向。
默认值为0。
范围[0,1]。
0 从左到右
1 从右到左
     */
    public void setMarkWordRollDirection(Long MarkWordRollDirection) {
        this.MarkWordRollDirection = MarkWordRollDirection;
    }

    /**
     * Get 跑马灯文字显示的起始x坐标，单位百分比。
范围[0.0, 1.0] 
     * @return MarkWordRollStartLocationX 跑马灯文字显示的起始x坐标，单位百分比。
范围[0.0, 1.0]
     */
    public Float getMarkWordRollStartLocationX() {
        return this.MarkWordRollStartLocationX;
    }

    /**
     * Set 跑马灯文字显示的起始x坐标，单位百分比。
范围[0.0, 1.0]
     * @param MarkWordRollStartLocationX 跑马灯文字显示的起始x坐标，单位百分比。
范围[0.0, 1.0]
     */
    public void setMarkWordRollStartLocationX(Float MarkWordRollStartLocationX) {
        this.MarkWordRollStartLocationX = MarkWordRollStartLocationX;
    }

    /**
     * Get 跑马灯文字显示的截止x坐标，单位百分比。
范围[0.0, 1.0] 
     * @return MarkWordRollEndLocationX 跑马灯文字显示的截止x坐标，单位百分比。
范围[0.0, 1.0]
     */
    public Float getMarkWordRollEndLocationX() {
        return this.MarkWordRollEndLocationX;
    }

    /**
     * Set 跑马灯文字显示的截止x坐标，单位百分比。
范围[0.0, 1.0]
     * @param MarkWordRollEndLocationX 跑马灯文字显示的截止x坐标，单位百分比。
范围[0.0, 1.0]
     */
    public void setMarkWordRollEndLocationX(Float MarkWordRollEndLocationX) {
        this.MarkWordRollEndLocationX = MarkWordRollEndLocationX;
    }

    public CasterMarkWordInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CasterMarkWordInfo(CasterMarkWordInfo source) {
        if (source.MarkWordIndex != null) {
            this.MarkWordIndex = new Long(source.MarkWordIndex);
        }
        if (source.MarkWordText != null) {
            this.MarkWordText = new String(source.MarkWordText);
        }
        if (source.MarkWordFontSize != null) {
            this.MarkWordFontSize = new Long(source.MarkWordFontSize);
        }
        if (source.MarkWordFontColor != null) {
            this.MarkWordFontColor = new String(source.MarkWordFontColor);
        }
        if (source.MarkWordFontType != null) {
            this.MarkWordFontType = new Long(source.MarkWordFontType);
        }
        if (source.MarkWordLocationX != null) {
            this.MarkWordLocationX = new Float(source.MarkWordLocationX);
        }
        if (source.MarkWordLocationY != null) {
            this.MarkWordLocationY = new Float(source.MarkWordLocationY);
        }
        if (source.MarkWordRollEnable != null) {
            this.MarkWordRollEnable = new Boolean(source.MarkWordRollEnable);
        }
        if (source.MarkWordRollOnceTime != null) {
            this.MarkWordRollOnceTime = new Long(source.MarkWordRollOnceTime);
        }
        if (source.MarkWordRollDirection != null) {
            this.MarkWordRollDirection = new Long(source.MarkWordRollDirection);
        }
        if (source.MarkWordRollStartLocationX != null) {
            this.MarkWordRollStartLocationX = new Float(source.MarkWordRollStartLocationX);
        }
        if (source.MarkWordRollEndLocationX != null) {
            this.MarkWordRollEndLocationX = new Float(source.MarkWordRollEndLocationX);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MarkWordIndex", this.MarkWordIndex);
        this.setParamSimple(map, prefix + "MarkWordText", this.MarkWordText);
        this.setParamSimple(map, prefix + "MarkWordFontSize", this.MarkWordFontSize);
        this.setParamSimple(map, prefix + "MarkWordFontColor", this.MarkWordFontColor);
        this.setParamSimple(map, prefix + "MarkWordFontType", this.MarkWordFontType);
        this.setParamSimple(map, prefix + "MarkWordLocationX", this.MarkWordLocationX);
        this.setParamSimple(map, prefix + "MarkWordLocationY", this.MarkWordLocationY);
        this.setParamSimple(map, prefix + "MarkWordRollEnable", this.MarkWordRollEnable);
        this.setParamSimple(map, prefix + "MarkWordRollOnceTime", this.MarkWordRollOnceTime);
        this.setParamSimple(map, prefix + "MarkWordRollDirection", this.MarkWordRollDirection);
        this.setParamSimple(map, prefix + "MarkWordRollStartLocationX", this.MarkWordRollStartLocationX);
        this.setParamSimple(map, prefix + "MarkWordRollEndLocationX", this.MarkWordRollEndLocationX);

    }
}

