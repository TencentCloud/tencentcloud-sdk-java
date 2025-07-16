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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubtitleTemplate extends AbstractModel {

    /**
    * 要压制到视频中的字幕文件地址。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * 指定要压制到视频中的字幕轨道，Streamindex的取值从0开始，0表示使用源视频中的第一条字幕轨。如果指定了Path，则优先使用Path。Path 和 StreamIndex 至少指定一个。

- 注意：StreamIndex必须与源文件中的字幕轨索引一致。例如，源文件中的字幕轨为stream#0:3，则StreamIndex应为3，否则可能导致任务处理失败。


注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StreamIndex")
    @Expose
    private Long StreamIndex;

    /**
    * 字体类型，支持：
<li>hei.ttf：黑体</li>
<li>song.ttf：宋体</li>
<li>kai.ttf（推荐）或 simkai.ttf：楷体</li>
<li>msyh.ttf：微软雅黑</li>
<li>msyhbd.ttf：微软雅黑加粗</li>
<li>hkjgt.ttf：华康金刚体</li>
<li>dhttx.ttf：典黑体特细</li>
<li>xqgdzt.ttf：喜鹊古字典体</li>
<li>qpcyt.ttf：巧拼超圆体</li>
<li>arial.ttf：仅支持英文</li>
<li>dinalternate.ttf：DIN Alternate Bold</li>
<li>helveticalt.ttf：Helvetica</li>
<li>helveticains.ttf：Helvetica Inserat</li>
<li>trajanpro.ttf：TrajanPro-Bold</li>
<li>korean.ttf：韩语</li>
<li>japanese.ttf：日语</li>
<li>thai.ttf：泰语</li>
默认：hei.ttf 黑体。注意：楷体推荐使用kai.ttf
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FontType")
    @Expose
    private String FontType;

    /**
    * 字体大小，格式：Npx，N 为数值，不指定则以字幕文件中为准。
默认源视频高度的5%。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FontSize")
    @Expose
    private String FontSize;

    /**
    * 字体颜色，格式：0xRRGGBB，默认值：0xFFFFFF（白色）。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FontColor")
    @Expose
    private String FontColor;

    /**
    * 文字透明度，取值范围：(0, 1]
<li>0：完全透明</li>
<li>1：完全不透明</li>
默认值：1。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FontAlpha")
    @Expose
    private Float FontAlpha;

    /**
    * 字幕y轴坐标位置，指定此参数会忽略字幕文件自带坐标；支持像素和百分比格式：

- 像素：Npx，N范围：[0,4096]。
- 百分百：N%，N范围：[0,100]；例如10%表示字幕y坐标=10%*源视频高度。

默认值：源视频高度*4%。
注意：坐标轴原点在源视频中轴线底部，字幕基准点在字幕中轴线底部，参考下图：
![image](https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png)

注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("YPos")
    @Expose
    private String YPos;

    /**
    * 字幕背景底板的y轴坐标位置；支持像素和百分比格式：

- 像素：Npx，N范围：[0,4096]。
- 百分百：N%，N范围：[0,100]；例如10%表示字幕背景底板y坐标=10%*源视频高度。

不传表示不开启字幕背景底板。
注意：坐标轴原点位于源视频的中轴线底部，字幕背景底板的基准点在其中轴线底部，参考下图：
![image](https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png)

注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BoardY")
    @Expose
    private String BoardY;

    /**
    * 底板的宽度，单位为像素，取值范围：[0,4096]。
默认源视频宽像素的90%。

注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BoardWidth")
    @Expose
    private Long BoardWidth;

    /**
    * 底板的高度。单位为像素，取值范围：[0,4096]。
默认为源视频高像素的15%。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BoardHeight")
    @Expose
    private Long BoardHeight;

    /**
    * 底板颜色。格式：0xRRGGBB，
默认值：0x000000（黑色）。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BoardColor")
    @Expose
    private String BoardColor;

    /**
    * 字幕背景板透明度，取值范围：[0, 1]
<li>0：完全透明</li>
<li>1：完全不透明</li>
默认值：0.8。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BoardAlpha")
    @Expose
    private Float BoardAlpha;

    /**
     * Get 要压制到视频中的字幕文件地址。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Path 要压制到视频中的字幕文件地址。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set 要压制到视频中的字幕文件地址。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Path 要压制到视频中的字幕文件地址。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get 指定要压制到视频中的字幕轨道，Streamindex的取值从0开始，0表示使用源视频中的第一条字幕轨。如果指定了Path，则优先使用Path。Path 和 StreamIndex 至少指定一个。

- 注意：StreamIndex必须与源文件中的字幕轨索引一致。例如，源文件中的字幕轨为stream#0:3，则StreamIndex应为3，否则可能导致任务处理失败。


注意：此字段可能返回 null，表示取不到有效值。 
     * @return StreamIndex 指定要压制到视频中的字幕轨道，Streamindex的取值从0开始，0表示使用源视频中的第一条字幕轨。如果指定了Path，则优先使用Path。Path 和 StreamIndex 至少指定一个。

- 注意：StreamIndex必须与源文件中的字幕轨索引一致。例如，源文件中的字幕轨为stream#0:3，则StreamIndex应为3，否则可能导致任务处理失败。


注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStreamIndex() {
        return this.StreamIndex;
    }

    /**
     * Set 指定要压制到视频中的字幕轨道，Streamindex的取值从0开始，0表示使用源视频中的第一条字幕轨。如果指定了Path，则优先使用Path。Path 和 StreamIndex 至少指定一个。

- 注意：StreamIndex必须与源文件中的字幕轨索引一致。例如，源文件中的字幕轨为stream#0:3，则StreamIndex应为3，否则可能导致任务处理失败。


注意：此字段可能返回 null，表示取不到有效值。
     * @param StreamIndex 指定要压制到视频中的字幕轨道，Streamindex的取值从0开始，0表示使用源视频中的第一条字幕轨。如果指定了Path，则优先使用Path。Path 和 StreamIndex 至少指定一个。

- 注意：StreamIndex必须与源文件中的字幕轨索引一致。例如，源文件中的字幕轨为stream#0:3，则StreamIndex应为3，否则可能导致任务处理失败。


注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStreamIndex(Long StreamIndex) {
        this.StreamIndex = StreamIndex;
    }

    /**
     * Get 字体类型，支持：
<li>hei.ttf：黑体</li>
<li>song.ttf：宋体</li>
<li>kai.ttf（推荐）或 simkai.ttf：楷体</li>
<li>msyh.ttf：微软雅黑</li>
<li>msyhbd.ttf：微软雅黑加粗</li>
<li>hkjgt.ttf：华康金刚体</li>
<li>dhttx.ttf：典黑体特细</li>
<li>xqgdzt.ttf：喜鹊古字典体</li>
<li>qpcyt.ttf：巧拼超圆体</li>
<li>arial.ttf：仅支持英文</li>
<li>dinalternate.ttf：DIN Alternate Bold</li>
<li>helveticalt.ttf：Helvetica</li>
<li>helveticains.ttf：Helvetica Inserat</li>
<li>trajanpro.ttf：TrajanPro-Bold</li>
<li>korean.ttf：韩语</li>
<li>japanese.ttf：日语</li>
<li>thai.ttf：泰语</li>
默认：hei.ttf 黑体。注意：楷体推荐使用kai.ttf
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FontType 字体类型，支持：
<li>hei.ttf：黑体</li>
<li>song.ttf：宋体</li>
<li>kai.ttf（推荐）或 simkai.ttf：楷体</li>
<li>msyh.ttf：微软雅黑</li>
<li>msyhbd.ttf：微软雅黑加粗</li>
<li>hkjgt.ttf：华康金刚体</li>
<li>dhttx.ttf：典黑体特细</li>
<li>xqgdzt.ttf：喜鹊古字典体</li>
<li>qpcyt.ttf：巧拼超圆体</li>
<li>arial.ttf：仅支持英文</li>
<li>dinalternate.ttf：DIN Alternate Bold</li>
<li>helveticalt.ttf：Helvetica</li>
<li>helveticains.ttf：Helvetica Inserat</li>
<li>trajanpro.ttf：TrajanPro-Bold</li>
<li>korean.ttf：韩语</li>
<li>japanese.ttf：日语</li>
<li>thai.ttf：泰语</li>
默认：hei.ttf 黑体。注意：楷体推荐使用kai.ttf
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFontType() {
        return this.FontType;
    }

    /**
     * Set 字体类型，支持：
<li>hei.ttf：黑体</li>
<li>song.ttf：宋体</li>
<li>kai.ttf（推荐）或 simkai.ttf：楷体</li>
<li>msyh.ttf：微软雅黑</li>
<li>msyhbd.ttf：微软雅黑加粗</li>
<li>hkjgt.ttf：华康金刚体</li>
<li>dhttx.ttf：典黑体特细</li>
<li>xqgdzt.ttf：喜鹊古字典体</li>
<li>qpcyt.ttf：巧拼超圆体</li>
<li>arial.ttf：仅支持英文</li>
<li>dinalternate.ttf：DIN Alternate Bold</li>
<li>helveticalt.ttf：Helvetica</li>
<li>helveticains.ttf：Helvetica Inserat</li>
<li>trajanpro.ttf：TrajanPro-Bold</li>
<li>korean.ttf：韩语</li>
<li>japanese.ttf：日语</li>
<li>thai.ttf：泰语</li>
默认：hei.ttf 黑体。注意：楷体推荐使用kai.ttf
注意：此字段可能返回 null，表示取不到有效值。
     * @param FontType 字体类型，支持：
<li>hei.ttf：黑体</li>
<li>song.ttf：宋体</li>
<li>kai.ttf（推荐）或 simkai.ttf：楷体</li>
<li>msyh.ttf：微软雅黑</li>
<li>msyhbd.ttf：微软雅黑加粗</li>
<li>hkjgt.ttf：华康金刚体</li>
<li>dhttx.ttf：典黑体特细</li>
<li>xqgdzt.ttf：喜鹊古字典体</li>
<li>qpcyt.ttf：巧拼超圆体</li>
<li>arial.ttf：仅支持英文</li>
<li>dinalternate.ttf：DIN Alternate Bold</li>
<li>helveticalt.ttf：Helvetica</li>
<li>helveticains.ttf：Helvetica Inserat</li>
<li>trajanpro.ttf：TrajanPro-Bold</li>
<li>korean.ttf：韩语</li>
<li>japanese.ttf：日语</li>
<li>thai.ttf：泰语</li>
默认：hei.ttf 黑体。注意：楷体推荐使用kai.ttf
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFontType(String FontType) {
        this.FontType = FontType;
    }

    /**
     * Get 字体大小，格式：Npx，N 为数值，不指定则以字幕文件中为准。
默认源视频高度的5%。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FontSize 字体大小，格式：Npx，N 为数值，不指定则以字幕文件中为准。
默认源视频高度的5%。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFontSize() {
        return this.FontSize;
    }

    /**
     * Set 字体大小，格式：Npx，N 为数值，不指定则以字幕文件中为准。
默认源视频高度的5%。
注意：此字段可能返回 null，表示取不到有效值。
     * @param FontSize 字体大小，格式：Npx，N 为数值，不指定则以字幕文件中为准。
默认源视频高度的5%。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFontSize(String FontSize) {
        this.FontSize = FontSize;
    }

    /**
     * Get 字体颜色，格式：0xRRGGBB，默认值：0xFFFFFF（白色）。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FontColor 字体颜色，格式：0xRRGGBB，默认值：0xFFFFFF（白色）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFontColor() {
        return this.FontColor;
    }

    /**
     * Set 字体颜色，格式：0xRRGGBB，默认值：0xFFFFFF（白色）。
注意：此字段可能返回 null，表示取不到有效值。
     * @param FontColor 字体颜色，格式：0xRRGGBB，默认值：0xFFFFFF（白色）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFontColor(String FontColor) {
        this.FontColor = FontColor;
    }

    /**
     * Get 文字透明度，取值范围：(0, 1]
<li>0：完全透明</li>
<li>1：完全不透明</li>
默认值：1。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FontAlpha 文字透明度，取值范围：(0, 1]
<li>0：完全透明</li>
<li>1：完全不透明</li>
默认值：1。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getFontAlpha() {
        return this.FontAlpha;
    }

    /**
     * Set 文字透明度，取值范围：(0, 1]
<li>0：完全透明</li>
<li>1：完全不透明</li>
默认值：1。
注意：此字段可能返回 null，表示取不到有效值。
     * @param FontAlpha 文字透明度，取值范围：(0, 1]
<li>0：完全透明</li>
<li>1：完全不透明</li>
默认值：1。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFontAlpha(Float FontAlpha) {
        this.FontAlpha = FontAlpha;
    }

    /**
     * Get 字幕y轴坐标位置，指定此参数会忽略字幕文件自带坐标；支持像素和百分比格式：

- 像素：Npx，N范围：[0,4096]。
- 百分百：N%，N范围：[0,100]；例如10%表示字幕y坐标=10%*源视频高度。

默认值：源视频高度*4%。
注意：坐标轴原点在源视频中轴线底部，字幕基准点在字幕中轴线底部，参考下图：
![image](https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png)

注意：此字段可能返回 null，表示取不到有效值。 
     * @return YPos 字幕y轴坐标位置，指定此参数会忽略字幕文件自带坐标；支持像素和百分比格式：

- 像素：Npx，N范围：[0,4096]。
- 百分百：N%，N范围：[0,100]；例如10%表示字幕y坐标=10%*源视频高度。

默认值：源视频高度*4%。
注意：坐标轴原点在源视频中轴线底部，字幕基准点在字幕中轴线底部，参考下图：
![image](https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png)

注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getYPos() {
        return this.YPos;
    }

    /**
     * Set 字幕y轴坐标位置，指定此参数会忽略字幕文件自带坐标；支持像素和百分比格式：

- 像素：Npx，N范围：[0,4096]。
- 百分百：N%，N范围：[0,100]；例如10%表示字幕y坐标=10%*源视频高度。

默认值：源视频高度*4%。
注意：坐标轴原点在源视频中轴线底部，字幕基准点在字幕中轴线底部，参考下图：
![image](https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png)

注意：此字段可能返回 null，表示取不到有效值。
     * @param YPos 字幕y轴坐标位置，指定此参数会忽略字幕文件自带坐标；支持像素和百分比格式：

- 像素：Npx，N范围：[0,4096]。
- 百分百：N%，N范围：[0,100]；例如10%表示字幕y坐标=10%*源视频高度。

默认值：源视频高度*4%。
注意：坐标轴原点在源视频中轴线底部，字幕基准点在字幕中轴线底部，参考下图：
![image](https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png)

注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setYPos(String YPos) {
        this.YPos = YPos;
    }

    /**
     * Get 字幕背景底板的y轴坐标位置；支持像素和百分比格式：

- 像素：Npx，N范围：[0,4096]。
- 百分百：N%，N范围：[0,100]；例如10%表示字幕背景底板y坐标=10%*源视频高度。

不传表示不开启字幕背景底板。
注意：坐标轴原点位于源视频的中轴线底部，字幕背景底板的基准点在其中轴线底部，参考下图：
![image](https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png)

注意：此字段可能返回 null，表示取不到有效值。 
     * @return BoardY 字幕背景底板的y轴坐标位置；支持像素和百分比格式：

- 像素：Npx，N范围：[0,4096]。
- 百分百：N%，N范围：[0,100]；例如10%表示字幕背景底板y坐标=10%*源视频高度。

不传表示不开启字幕背景底板。
注意：坐标轴原点位于源视频的中轴线底部，字幕背景底板的基准点在其中轴线底部，参考下图：
![image](https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png)

注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBoardY() {
        return this.BoardY;
    }

    /**
     * Set 字幕背景底板的y轴坐标位置；支持像素和百分比格式：

- 像素：Npx，N范围：[0,4096]。
- 百分百：N%，N范围：[0,100]；例如10%表示字幕背景底板y坐标=10%*源视频高度。

不传表示不开启字幕背景底板。
注意：坐标轴原点位于源视频的中轴线底部，字幕背景底板的基准点在其中轴线底部，参考下图：
![image](https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png)

注意：此字段可能返回 null，表示取不到有效值。
     * @param BoardY 字幕背景底板的y轴坐标位置；支持像素和百分比格式：

- 像素：Npx，N范围：[0,4096]。
- 百分百：N%，N范围：[0,100]；例如10%表示字幕背景底板y坐标=10%*源视频高度。

不传表示不开启字幕背景底板。
注意：坐标轴原点位于源视频的中轴线底部，字幕背景底板的基准点在其中轴线底部，参考下图：
![image](https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png)

注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBoardY(String BoardY) {
        this.BoardY = BoardY;
    }

    /**
     * Get 底板的宽度，单位为像素，取值范围：[0,4096]。
默认源视频宽像素的90%。

注意：此字段可能返回 null，表示取不到有效值。 
     * @return BoardWidth 底板的宽度，单位为像素，取值范围：[0,4096]。
默认源视频宽像素的90%。

注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBoardWidth() {
        return this.BoardWidth;
    }

    /**
     * Set 底板的宽度，单位为像素，取值范围：[0,4096]。
默认源视频宽像素的90%。

注意：此字段可能返回 null，表示取不到有效值。
     * @param BoardWidth 底板的宽度，单位为像素，取值范围：[0,4096]。
默认源视频宽像素的90%。

注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBoardWidth(Long BoardWidth) {
        this.BoardWidth = BoardWidth;
    }

    /**
     * Get 底板的高度。单位为像素，取值范围：[0,4096]。
默认为源视频高像素的15%。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BoardHeight 底板的高度。单位为像素，取值范围：[0,4096]。
默认为源视频高像素的15%。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBoardHeight() {
        return this.BoardHeight;
    }

    /**
     * Set 底板的高度。单位为像素，取值范围：[0,4096]。
默认为源视频高像素的15%。
注意：此字段可能返回 null，表示取不到有效值。
     * @param BoardHeight 底板的高度。单位为像素，取值范围：[0,4096]。
默认为源视频高像素的15%。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBoardHeight(Long BoardHeight) {
        this.BoardHeight = BoardHeight;
    }

    /**
     * Get 底板颜色。格式：0xRRGGBB，
默认值：0x000000（黑色）。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BoardColor 底板颜色。格式：0xRRGGBB，
默认值：0x000000（黑色）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBoardColor() {
        return this.BoardColor;
    }

    /**
     * Set 底板颜色。格式：0xRRGGBB，
默认值：0x000000（黑色）。
注意：此字段可能返回 null，表示取不到有效值。
     * @param BoardColor 底板颜色。格式：0xRRGGBB，
默认值：0x000000（黑色）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBoardColor(String BoardColor) {
        this.BoardColor = BoardColor;
    }

    /**
     * Get 字幕背景板透明度，取值范围：[0, 1]
<li>0：完全透明</li>
<li>1：完全不透明</li>
默认值：0.8。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BoardAlpha 字幕背景板透明度，取值范围：[0, 1]
<li>0：完全透明</li>
<li>1：完全不透明</li>
默认值：0.8。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getBoardAlpha() {
        return this.BoardAlpha;
    }

    /**
     * Set 字幕背景板透明度，取值范围：[0, 1]
<li>0：完全透明</li>
<li>1：完全不透明</li>
默认值：0.8。
注意：此字段可能返回 null，表示取不到有效值。
     * @param BoardAlpha 字幕背景板透明度，取值范围：[0, 1]
<li>0：完全透明</li>
<li>1：完全不透明</li>
默认值：0.8。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBoardAlpha(Float BoardAlpha) {
        this.BoardAlpha = BoardAlpha;
    }

    public SubtitleTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubtitleTemplate(SubtitleTemplate source) {
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.StreamIndex != null) {
            this.StreamIndex = new Long(source.StreamIndex);
        }
        if (source.FontType != null) {
            this.FontType = new String(source.FontType);
        }
        if (source.FontSize != null) {
            this.FontSize = new String(source.FontSize);
        }
        if (source.FontColor != null) {
            this.FontColor = new String(source.FontColor);
        }
        if (source.FontAlpha != null) {
            this.FontAlpha = new Float(source.FontAlpha);
        }
        if (source.YPos != null) {
            this.YPos = new String(source.YPos);
        }
        if (source.BoardY != null) {
            this.BoardY = new String(source.BoardY);
        }
        if (source.BoardWidth != null) {
            this.BoardWidth = new Long(source.BoardWidth);
        }
        if (source.BoardHeight != null) {
            this.BoardHeight = new Long(source.BoardHeight);
        }
        if (source.BoardColor != null) {
            this.BoardColor = new String(source.BoardColor);
        }
        if (source.BoardAlpha != null) {
            this.BoardAlpha = new Float(source.BoardAlpha);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "StreamIndex", this.StreamIndex);
        this.setParamSimple(map, prefix + "FontType", this.FontType);
        this.setParamSimple(map, prefix + "FontSize", this.FontSize);
        this.setParamSimple(map, prefix + "FontColor", this.FontColor);
        this.setParamSimple(map, prefix + "FontAlpha", this.FontAlpha);
        this.setParamSimple(map, prefix + "YPos", this.YPos);
        this.setParamSimple(map, prefix + "BoardY", this.BoardY);
        this.setParamSimple(map, prefix + "BoardWidth", this.BoardWidth);
        this.setParamSimple(map, prefix + "BoardHeight", this.BoardHeight);
        this.setParamSimple(map, prefix + "BoardColor", this.BoardColor);
        this.setParamSimple(map, prefix + "BoardAlpha", this.BoardAlpha);

    }
}

