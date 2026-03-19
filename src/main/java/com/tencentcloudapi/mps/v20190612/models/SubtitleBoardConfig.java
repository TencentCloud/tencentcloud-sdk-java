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

public class SubtitleBoardConfig extends AbstractModel {

    /**
    * 字幕压制模块背景配置开关，0关闭，1开启，默认0
    */
    @SerializedName("SubtitleBoardConfigSwitch")
    @Expose
    private Long SubtitleBoardConfigSwitch;

    /**
    * 字幕背景底板的x轴坐标位置；支持像素和百分比格式：

- 像素：Npx，N范围：[-4096,4096]。
- 百分百：N%，N范围：[-100,100]；例如10%表示字幕背景底板x坐标=10%*源视频宽度。

默认值：0px。
注意：坐标轴原点位于源视频的中轴线底部，字幕底板的基准点在其中轴线底部，参考下图：
![image](https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png)

    */
    @SerializedName("BoardX")
    @Expose
    private Long BoardX;

    /**
    * BoardX单位, 0 像素，1百分比，默认为0，像素
    */
    @SerializedName("BoardXUnit")
    @Expose
    private Long BoardXUnit;

    /**
    * 字幕背景底板的y轴坐标位置；支持像素和百分比格式：

- 像素：Npx，N范围：[0,4096]。
- 百分百：N%，N范围：[0,100]；例如10%表示字幕背景底板y坐标=10%*源视频高度。

不传表示不开启字幕背景底板。
注意：坐标轴原点位于源视频的中轴线底部，字幕背景底板的基准点在其中轴线底部，参考下图：
![image](https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png)

    */
    @SerializedName("BoardY")
    @Expose
    private Long BoardY;

    /**
    * BoardY单位, 0 像素，1百分比，默认为0，像素
    */
    @SerializedName("BoardYUnit")
    @Expose
    private Long BoardYUnit;

    /**
    * 底板的宽度，正整数。
- 代表像素时，取值范围：[0,4096]。
- 代表百分数时，[0, 100]。
开启底板且不填此值时，默认源视频宽像素的90%。

    */
    @SerializedName("BoardWidth")
    @Expose
    private Long BoardWidth;

    /**
    * 底板的宽度单位，0 像素，1百分比，默认为0，像素

    */
    @SerializedName("BoardWidthUnit")
    @Expose
    private Long BoardWidthUnit;

    /**
    * 底板的高度，正整数。
- 代表像素时，取值范围：[0,4096]。
- 代表百分数时，[0, 100]。
开启底板且不填此值时，默认为源视频高像素的15%。

    */
    @SerializedName("BoardHeight")
    @Expose
    private Long BoardHeight;

    /**
    * 底板的高度单位，0 像素，1百分比，默认为0，像素

    */
    @SerializedName("BoardHeightUnit")
    @Expose
    private Long BoardHeightUnit;

    /**
    * 底板颜色。格式：0xRRGGBB，
默认值：0x000000（黑色）。
    */
    @SerializedName("BoardColor")
    @Expose
    private String BoardColor;

    /**
    * 字幕背景板透明度，取值范围：[0, 1]
<li>0：完全透明</li>
<li>1：完全不透明</li>
默认值：0.8。
    */
    @SerializedName("BoardAlpha")
    @Expose
    private Float BoardAlpha;

    /**
     * Get 字幕压制模块背景配置开关，0关闭，1开启，默认0 
     * @return SubtitleBoardConfigSwitch 字幕压制模块背景配置开关，0关闭，1开启，默认0
     */
    public Long getSubtitleBoardConfigSwitch() {
        return this.SubtitleBoardConfigSwitch;
    }

    /**
     * Set 字幕压制模块背景配置开关，0关闭，1开启，默认0
     * @param SubtitleBoardConfigSwitch 字幕压制模块背景配置开关，0关闭，1开启，默认0
     */
    public void setSubtitleBoardConfigSwitch(Long SubtitleBoardConfigSwitch) {
        this.SubtitleBoardConfigSwitch = SubtitleBoardConfigSwitch;
    }

    /**
     * Get 字幕背景底板的x轴坐标位置；支持像素和百分比格式：

- 像素：Npx，N范围：[-4096,4096]。
- 百分百：N%，N范围：[-100,100]；例如10%表示字幕背景底板x坐标=10%*源视频宽度。

默认值：0px。
注意：坐标轴原点位于源视频的中轴线底部，字幕底板的基准点在其中轴线底部，参考下图：
![image](https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png)
 
     * @return BoardX 字幕背景底板的x轴坐标位置；支持像素和百分比格式：

- 像素：Npx，N范围：[-4096,4096]。
- 百分百：N%，N范围：[-100,100]；例如10%表示字幕背景底板x坐标=10%*源视频宽度。

默认值：0px。
注意：坐标轴原点位于源视频的中轴线底部，字幕底板的基准点在其中轴线底部，参考下图：
![image](https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png)

     */
    public Long getBoardX() {
        return this.BoardX;
    }

    /**
     * Set 字幕背景底板的x轴坐标位置；支持像素和百分比格式：

- 像素：Npx，N范围：[-4096,4096]。
- 百分百：N%，N范围：[-100,100]；例如10%表示字幕背景底板x坐标=10%*源视频宽度。

默认值：0px。
注意：坐标轴原点位于源视频的中轴线底部，字幕底板的基准点在其中轴线底部，参考下图：
![image](https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png)

     * @param BoardX 字幕背景底板的x轴坐标位置；支持像素和百分比格式：

- 像素：Npx，N范围：[-4096,4096]。
- 百分百：N%，N范围：[-100,100]；例如10%表示字幕背景底板x坐标=10%*源视频宽度。

默认值：0px。
注意：坐标轴原点位于源视频的中轴线底部，字幕底板的基准点在其中轴线底部，参考下图：
![image](https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png)

     */
    public void setBoardX(Long BoardX) {
        this.BoardX = BoardX;
    }

    /**
     * Get BoardX单位, 0 像素，1百分比，默认为0，像素 
     * @return BoardXUnit BoardX单位, 0 像素，1百分比，默认为0，像素
     */
    public Long getBoardXUnit() {
        return this.BoardXUnit;
    }

    /**
     * Set BoardX单位, 0 像素，1百分比，默认为0，像素
     * @param BoardXUnit BoardX单位, 0 像素，1百分比，默认为0，像素
     */
    public void setBoardXUnit(Long BoardXUnit) {
        this.BoardXUnit = BoardXUnit;
    }

    /**
     * Get 字幕背景底板的y轴坐标位置；支持像素和百分比格式：

- 像素：Npx，N范围：[0,4096]。
- 百分百：N%，N范围：[0,100]；例如10%表示字幕背景底板y坐标=10%*源视频高度。

不传表示不开启字幕背景底板。
注意：坐标轴原点位于源视频的中轴线底部，字幕背景底板的基准点在其中轴线底部，参考下图：
![image](https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png)
 
     * @return BoardY 字幕背景底板的y轴坐标位置；支持像素和百分比格式：

- 像素：Npx，N范围：[0,4096]。
- 百分百：N%，N范围：[0,100]；例如10%表示字幕背景底板y坐标=10%*源视频高度。

不传表示不开启字幕背景底板。
注意：坐标轴原点位于源视频的中轴线底部，字幕背景底板的基准点在其中轴线底部，参考下图：
![image](https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png)

     */
    public Long getBoardY() {
        return this.BoardY;
    }

    /**
     * Set 字幕背景底板的y轴坐标位置；支持像素和百分比格式：

- 像素：Npx，N范围：[0,4096]。
- 百分百：N%，N范围：[0,100]；例如10%表示字幕背景底板y坐标=10%*源视频高度。

不传表示不开启字幕背景底板。
注意：坐标轴原点位于源视频的中轴线底部，字幕背景底板的基准点在其中轴线底部，参考下图：
![image](https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png)

     * @param BoardY 字幕背景底板的y轴坐标位置；支持像素和百分比格式：

- 像素：Npx，N范围：[0,4096]。
- 百分百：N%，N范围：[0,100]；例如10%表示字幕背景底板y坐标=10%*源视频高度。

不传表示不开启字幕背景底板。
注意：坐标轴原点位于源视频的中轴线底部，字幕背景底板的基准点在其中轴线底部，参考下图：
![image](https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png)

     */
    public void setBoardY(Long BoardY) {
        this.BoardY = BoardY;
    }

    /**
     * Get BoardY单位, 0 像素，1百分比，默认为0，像素 
     * @return BoardYUnit BoardY单位, 0 像素，1百分比，默认为0，像素
     */
    public Long getBoardYUnit() {
        return this.BoardYUnit;
    }

    /**
     * Set BoardY单位, 0 像素，1百分比，默认为0，像素
     * @param BoardYUnit BoardY单位, 0 像素，1百分比，默认为0，像素
     */
    public void setBoardYUnit(Long BoardYUnit) {
        this.BoardYUnit = BoardYUnit;
    }

    /**
     * Get 底板的宽度，正整数。
- 代表像素时，取值范围：[0,4096]。
- 代表百分数时，[0, 100]。
开启底板且不填此值时，默认源视频宽像素的90%。
 
     * @return BoardWidth 底板的宽度，正整数。
- 代表像素时，取值范围：[0,4096]。
- 代表百分数时，[0, 100]。
开启底板且不填此值时，默认源视频宽像素的90%。

     */
    public Long getBoardWidth() {
        return this.BoardWidth;
    }

    /**
     * Set 底板的宽度，正整数。
- 代表像素时，取值范围：[0,4096]。
- 代表百分数时，[0, 100]。
开启底板且不填此值时，默认源视频宽像素的90%。

     * @param BoardWidth 底板的宽度，正整数。
- 代表像素时，取值范围：[0,4096]。
- 代表百分数时，[0, 100]。
开启底板且不填此值时，默认源视频宽像素的90%。

     */
    public void setBoardWidth(Long BoardWidth) {
        this.BoardWidth = BoardWidth;
    }

    /**
     * Get 底板的宽度单位，0 像素，1百分比，默认为0，像素
 
     * @return BoardWidthUnit 底板的宽度单位，0 像素，1百分比，默认为0，像素

     */
    public Long getBoardWidthUnit() {
        return this.BoardWidthUnit;
    }

    /**
     * Set 底板的宽度单位，0 像素，1百分比，默认为0，像素

     * @param BoardWidthUnit 底板的宽度单位，0 像素，1百分比，默认为0，像素

     */
    public void setBoardWidthUnit(Long BoardWidthUnit) {
        this.BoardWidthUnit = BoardWidthUnit;
    }

    /**
     * Get 底板的高度，正整数。
- 代表像素时，取值范围：[0,4096]。
- 代表百分数时，[0, 100]。
开启底板且不填此值时，默认为源视频高像素的15%。
 
     * @return BoardHeight 底板的高度，正整数。
- 代表像素时，取值范围：[0,4096]。
- 代表百分数时，[0, 100]。
开启底板且不填此值时，默认为源视频高像素的15%。

     */
    public Long getBoardHeight() {
        return this.BoardHeight;
    }

    /**
     * Set 底板的高度，正整数。
- 代表像素时，取值范围：[0,4096]。
- 代表百分数时，[0, 100]。
开启底板且不填此值时，默认为源视频高像素的15%。

     * @param BoardHeight 底板的高度，正整数。
- 代表像素时，取值范围：[0,4096]。
- 代表百分数时，[0, 100]。
开启底板且不填此值时，默认为源视频高像素的15%。

     */
    public void setBoardHeight(Long BoardHeight) {
        this.BoardHeight = BoardHeight;
    }

    /**
     * Get 底板的高度单位，0 像素，1百分比，默认为0，像素
 
     * @return BoardHeightUnit 底板的高度单位，0 像素，1百分比，默认为0，像素

     */
    public Long getBoardHeightUnit() {
        return this.BoardHeightUnit;
    }

    /**
     * Set 底板的高度单位，0 像素，1百分比，默认为0，像素

     * @param BoardHeightUnit 底板的高度单位，0 像素，1百分比，默认为0，像素

     */
    public void setBoardHeightUnit(Long BoardHeightUnit) {
        this.BoardHeightUnit = BoardHeightUnit;
    }

    /**
     * Get 底板颜色。格式：0xRRGGBB，
默认值：0x000000（黑色）。 
     * @return BoardColor 底板颜色。格式：0xRRGGBB，
默认值：0x000000（黑色）。
     */
    public String getBoardColor() {
        return this.BoardColor;
    }

    /**
     * Set 底板颜色。格式：0xRRGGBB，
默认值：0x000000（黑色）。
     * @param BoardColor 底板颜色。格式：0xRRGGBB，
默认值：0x000000（黑色）。
     */
    public void setBoardColor(String BoardColor) {
        this.BoardColor = BoardColor;
    }

    /**
     * Get 字幕背景板透明度，取值范围：[0, 1]
<li>0：完全透明</li>
<li>1：完全不透明</li>
默认值：0.8。 
     * @return BoardAlpha 字幕背景板透明度，取值范围：[0, 1]
<li>0：完全透明</li>
<li>1：完全不透明</li>
默认值：0.8。
     */
    public Float getBoardAlpha() {
        return this.BoardAlpha;
    }

    /**
     * Set 字幕背景板透明度，取值范围：[0, 1]
<li>0：完全透明</li>
<li>1：完全不透明</li>
默认值：0.8。
     * @param BoardAlpha 字幕背景板透明度，取值范围：[0, 1]
<li>0：完全透明</li>
<li>1：完全不透明</li>
默认值：0.8。
     */
    public void setBoardAlpha(Float BoardAlpha) {
        this.BoardAlpha = BoardAlpha;
    }

    public SubtitleBoardConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubtitleBoardConfig(SubtitleBoardConfig source) {
        if (source.SubtitleBoardConfigSwitch != null) {
            this.SubtitleBoardConfigSwitch = new Long(source.SubtitleBoardConfigSwitch);
        }
        if (source.BoardX != null) {
            this.BoardX = new Long(source.BoardX);
        }
        if (source.BoardXUnit != null) {
            this.BoardXUnit = new Long(source.BoardXUnit);
        }
        if (source.BoardY != null) {
            this.BoardY = new Long(source.BoardY);
        }
        if (source.BoardYUnit != null) {
            this.BoardYUnit = new Long(source.BoardYUnit);
        }
        if (source.BoardWidth != null) {
            this.BoardWidth = new Long(source.BoardWidth);
        }
        if (source.BoardWidthUnit != null) {
            this.BoardWidthUnit = new Long(source.BoardWidthUnit);
        }
        if (source.BoardHeight != null) {
            this.BoardHeight = new Long(source.BoardHeight);
        }
        if (source.BoardHeightUnit != null) {
            this.BoardHeightUnit = new Long(source.BoardHeightUnit);
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
        this.setParamSimple(map, prefix + "SubtitleBoardConfigSwitch", this.SubtitleBoardConfigSwitch);
        this.setParamSimple(map, prefix + "BoardX", this.BoardX);
        this.setParamSimple(map, prefix + "BoardXUnit", this.BoardXUnit);
        this.setParamSimple(map, prefix + "BoardY", this.BoardY);
        this.setParamSimple(map, prefix + "BoardYUnit", this.BoardYUnit);
        this.setParamSimple(map, prefix + "BoardWidth", this.BoardWidth);
        this.setParamSimple(map, prefix + "BoardWidthUnit", this.BoardWidthUnit);
        this.setParamSimple(map, prefix + "BoardHeight", this.BoardHeight);
        this.setParamSimple(map, prefix + "BoardHeightUnit", this.BoardHeightUnit);
        this.setParamSimple(map, prefix + "BoardColor", this.BoardColor);
        this.setParamSimple(map, prefix + "BoardAlpha", this.BoardAlpha);

    }
}

