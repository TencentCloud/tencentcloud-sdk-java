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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SetWatermarkRequest extends AbstractModel{

    /**
    * 低代码互动课堂的SdkAppId。

    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 老师视频区域的水印参数地址，设置为空字符串表示删除
    */
    @SerializedName("TeacherUrl")
    @Expose
    private String TeacherUrl;

    /**
    * 白板视频区域的水印参数地址，设置为空字符串表示删除
    */
    @SerializedName("BoardUrl")
    @Expose
    private String BoardUrl;

    /**
    * 视频默认图片（在没有视频流的时候显示），设置为空字符串表示删除
    */
    @SerializedName("VideoUrl")
    @Expose
    private String VideoUrl;

    /**
    * 白板区域水印的宽度，取值:0-100，默认为0，表示区域X方向的百分比
    */
    @SerializedName("BoardW")
    @Expose
    private Float BoardW;

    /**
    * 白板区域水印的高度，取值:0-100，默认为0, 表示区域Y方向的百分比
    */
    @SerializedName("BoardH")
    @Expose
    private Float BoardH;

    /**
    * 白板区域水印X偏移, 取值:0-100, 表示区域X方向的百分比。比如50，则表示位于X轴中间
    */
    @SerializedName("BoardX")
    @Expose
    private Float BoardX;

    /**
    * 白板区域水印Y偏移, 取值:0-100, 表示区域X方向的百分比。比如50，则表示位于X轴中间
    */
    @SerializedName("BoardY")
    @Expose
    private Float BoardY;

    /**
    * 老师视频区域水印的宽度，取值:0-100，默认为0，表示区域X方向的百分比
    */
    @SerializedName("TeacherW")
    @Expose
    private Float TeacherW;

    /**
    * 老师视频区域水印的高度，取值:0-100，默认为0, 表示区域Y方向的百分比
    */
    @SerializedName("TeacherH")
    @Expose
    private Float TeacherH;

    /**
    * 老师视频区域水印X偏移, 取值:0-100, 表示区域X方向的百分比。比如50，则表示位于X轴中间
    */
    @SerializedName("TeacherX")
    @Expose
    private Float TeacherX;

    /**
    * 老师视频区域水印Y偏移, 取值:0-100, 表示区域X方向的百分比。比如50，则表示位于X轴中间
    */
    @SerializedName("TeacherY")
    @Expose
    private Float TeacherY;

    /**
    * 文字水印内容，设置为空字符串表示删除
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 文字水印颜色
    */
    @SerializedName("TextColor")
    @Expose
    private String TextColor;

    /**
     * Get 低代码互动课堂的SdkAppId。
 
     * @return SdkAppId 低代码互动课堂的SdkAppId。

     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set 低代码互动课堂的SdkAppId。

     * @param SdkAppId 低代码互动课堂的SdkAppId。

     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 老师视频区域的水印参数地址，设置为空字符串表示删除 
     * @return TeacherUrl 老师视频区域的水印参数地址，设置为空字符串表示删除
     */
    public String getTeacherUrl() {
        return this.TeacherUrl;
    }

    /**
     * Set 老师视频区域的水印参数地址，设置为空字符串表示删除
     * @param TeacherUrl 老师视频区域的水印参数地址，设置为空字符串表示删除
     */
    public void setTeacherUrl(String TeacherUrl) {
        this.TeacherUrl = TeacherUrl;
    }

    /**
     * Get 白板视频区域的水印参数地址，设置为空字符串表示删除 
     * @return BoardUrl 白板视频区域的水印参数地址，设置为空字符串表示删除
     */
    public String getBoardUrl() {
        return this.BoardUrl;
    }

    /**
     * Set 白板视频区域的水印参数地址，设置为空字符串表示删除
     * @param BoardUrl 白板视频区域的水印参数地址，设置为空字符串表示删除
     */
    public void setBoardUrl(String BoardUrl) {
        this.BoardUrl = BoardUrl;
    }

    /**
     * Get 视频默认图片（在没有视频流的时候显示），设置为空字符串表示删除 
     * @return VideoUrl 视频默认图片（在没有视频流的时候显示），设置为空字符串表示删除
     */
    public String getVideoUrl() {
        return this.VideoUrl;
    }

    /**
     * Set 视频默认图片（在没有视频流的时候显示），设置为空字符串表示删除
     * @param VideoUrl 视频默认图片（在没有视频流的时候显示），设置为空字符串表示删除
     */
    public void setVideoUrl(String VideoUrl) {
        this.VideoUrl = VideoUrl;
    }

    /**
     * Get 白板区域水印的宽度，取值:0-100，默认为0，表示区域X方向的百分比 
     * @return BoardW 白板区域水印的宽度，取值:0-100，默认为0，表示区域X方向的百分比
     */
    public Float getBoardW() {
        return this.BoardW;
    }

    /**
     * Set 白板区域水印的宽度，取值:0-100，默认为0，表示区域X方向的百分比
     * @param BoardW 白板区域水印的宽度，取值:0-100，默认为0，表示区域X方向的百分比
     */
    public void setBoardW(Float BoardW) {
        this.BoardW = BoardW;
    }

    /**
     * Get 白板区域水印的高度，取值:0-100，默认为0, 表示区域Y方向的百分比 
     * @return BoardH 白板区域水印的高度，取值:0-100，默认为0, 表示区域Y方向的百分比
     */
    public Float getBoardH() {
        return this.BoardH;
    }

    /**
     * Set 白板区域水印的高度，取值:0-100，默认为0, 表示区域Y方向的百分比
     * @param BoardH 白板区域水印的高度，取值:0-100，默认为0, 表示区域Y方向的百分比
     */
    public void setBoardH(Float BoardH) {
        this.BoardH = BoardH;
    }

    /**
     * Get 白板区域水印X偏移, 取值:0-100, 表示区域X方向的百分比。比如50，则表示位于X轴中间 
     * @return BoardX 白板区域水印X偏移, 取值:0-100, 表示区域X方向的百分比。比如50，则表示位于X轴中间
     */
    public Float getBoardX() {
        return this.BoardX;
    }

    /**
     * Set 白板区域水印X偏移, 取值:0-100, 表示区域X方向的百分比。比如50，则表示位于X轴中间
     * @param BoardX 白板区域水印X偏移, 取值:0-100, 表示区域X方向的百分比。比如50，则表示位于X轴中间
     */
    public void setBoardX(Float BoardX) {
        this.BoardX = BoardX;
    }

    /**
     * Get 白板区域水印Y偏移, 取值:0-100, 表示区域X方向的百分比。比如50，则表示位于X轴中间 
     * @return BoardY 白板区域水印Y偏移, 取值:0-100, 表示区域X方向的百分比。比如50，则表示位于X轴中间
     */
    public Float getBoardY() {
        return this.BoardY;
    }

    /**
     * Set 白板区域水印Y偏移, 取值:0-100, 表示区域X方向的百分比。比如50，则表示位于X轴中间
     * @param BoardY 白板区域水印Y偏移, 取值:0-100, 表示区域X方向的百分比。比如50，则表示位于X轴中间
     */
    public void setBoardY(Float BoardY) {
        this.BoardY = BoardY;
    }

    /**
     * Get 老师视频区域水印的宽度，取值:0-100，默认为0，表示区域X方向的百分比 
     * @return TeacherW 老师视频区域水印的宽度，取值:0-100，默认为0，表示区域X方向的百分比
     */
    public Float getTeacherW() {
        return this.TeacherW;
    }

    /**
     * Set 老师视频区域水印的宽度，取值:0-100，默认为0，表示区域X方向的百分比
     * @param TeacherW 老师视频区域水印的宽度，取值:0-100，默认为0，表示区域X方向的百分比
     */
    public void setTeacherW(Float TeacherW) {
        this.TeacherW = TeacherW;
    }

    /**
     * Get 老师视频区域水印的高度，取值:0-100，默认为0, 表示区域Y方向的百分比 
     * @return TeacherH 老师视频区域水印的高度，取值:0-100，默认为0, 表示区域Y方向的百分比
     */
    public Float getTeacherH() {
        return this.TeacherH;
    }

    /**
     * Set 老师视频区域水印的高度，取值:0-100，默认为0, 表示区域Y方向的百分比
     * @param TeacherH 老师视频区域水印的高度，取值:0-100，默认为0, 表示区域Y方向的百分比
     */
    public void setTeacherH(Float TeacherH) {
        this.TeacherH = TeacherH;
    }

    /**
     * Get 老师视频区域水印X偏移, 取值:0-100, 表示区域X方向的百分比。比如50，则表示位于X轴中间 
     * @return TeacherX 老师视频区域水印X偏移, 取值:0-100, 表示区域X方向的百分比。比如50，则表示位于X轴中间
     */
    public Float getTeacherX() {
        return this.TeacherX;
    }

    /**
     * Set 老师视频区域水印X偏移, 取值:0-100, 表示区域X方向的百分比。比如50，则表示位于X轴中间
     * @param TeacherX 老师视频区域水印X偏移, 取值:0-100, 表示区域X方向的百分比。比如50，则表示位于X轴中间
     */
    public void setTeacherX(Float TeacherX) {
        this.TeacherX = TeacherX;
    }

    /**
     * Get 老师视频区域水印Y偏移, 取值:0-100, 表示区域X方向的百分比。比如50，则表示位于X轴中间 
     * @return TeacherY 老师视频区域水印Y偏移, 取值:0-100, 表示区域X方向的百分比。比如50，则表示位于X轴中间
     */
    public Float getTeacherY() {
        return this.TeacherY;
    }

    /**
     * Set 老师视频区域水印Y偏移, 取值:0-100, 表示区域X方向的百分比。比如50，则表示位于X轴中间
     * @param TeacherY 老师视频区域水印Y偏移, 取值:0-100, 表示区域X方向的百分比。比如50，则表示位于X轴中间
     */
    public void setTeacherY(Float TeacherY) {
        this.TeacherY = TeacherY;
    }

    /**
     * Get 文字水印内容，设置为空字符串表示删除 
     * @return Text 文字水印内容，设置为空字符串表示删除
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 文字水印内容，设置为空字符串表示删除
     * @param Text 文字水印内容，设置为空字符串表示删除
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get 文字水印颜色 
     * @return TextColor 文字水印颜色
     */
    public String getTextColor() {
        return this.TextColor;
    }

    /**
     * Set 文字水印颜色
     * @param TextColor 文字水印颜色
     */
    public void setTextColor(String TextColor) {
        this.TextColor = TextColor;
    }

    public SetWatermarkRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetWatermarkRequest(SetWatermarkRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.TeacherUrl != null) {
            this.TeacherUrl = new String(source.TeacherUrl);
        }
        if (source.BoardUrl != null) {
            this.BoardUrl = new String(source.BoardUrl);
        }
        if (source.VideoUrl != null) {
            this.VideoUrl = new String(source.VideoUrl);
        }
        if (source.BoardW != null) {
            this.BoardW = new Float(source.BoardW);
        }
        if (source.BoardH != null) {
            this.BoardH = new Float(source.BoardH);
        }
        if (source.BoardX != null) {
            this.BoardX = new Float(source.BoardX);
        }
        if (source.BoardY != null) {
            this.BoardY = new Float(source.BoardY);
        }
        if (source.TeacherW != null) {
            this.TeacherW = new Float(source.TeacherW);
        }
        if (source.TeacherH != null) {
            this.TeacherH = new Float(source.TeacherH);
        }
        if (source.TeacherX != null) {
            this.TeacherX = new Float(source.TeacherX);
        }
        if (source.TeacherY != null) {
            this.TeacherY = new Float(source.TeacherY);
        }
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.TextColor != null) {
            this.TextColor = new String(source.TextColor);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "TeacherUrl", this.TeacherUrl);
        this.setParamSimple(map, prefix + "BoardUrl", this.BoardUrl);
        this.setParamSimple(map, prefix + "VideoUrl", this.VideoUrl);
        this.setParamSimple(map, prefix + "BoardW", this.BoardW);
        this.setParamSimple(map, prefix + "BoardH", this.BoardH);
        this.setParamSimple(map, prefix + "BoardX", this.BoardX);
        this.setParamSimple(map, prefix + "BoardY", this.BoardY);
        this.setParamSimple(map, prefix + "TeacherW", this.TeacherW);
        this.setParamSimple(map, prefix + "TeacherH", this.TeacherH);
        this.setParamSimple(map, prefix + "TeacherX", this.TeacherX);
        this.setParamSimple(map, prefix + "TeacherY", this.TeacherY);
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "TextColor", this.TextColor);

    }
}

