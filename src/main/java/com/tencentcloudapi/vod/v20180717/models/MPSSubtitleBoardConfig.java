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

public class MPSSubtitleBoardConfig extends AbstractModel {

    /**
    * <p>字幕压制模块背景配置开关，0关闭，1开启，默认0</p>
    */
    @SerializedName("SubtitleBoardConfigSwitch")
    @Expose
    private Long SubtitleBoardConfigSwitch;

    /**
    * <p>字幕背景底板的x轴坐标位置；支持像素和百分比格式： - 像素：Npx，N范围：[-4096,4096]。 - 百分百：N%，N范围：[-100,100]；例如10%表示字幕背景底板x坐标=10%*源视频宽度。 默认值：0px。 注意：坐标轴原点位于源视频的中轴线底部，字幕底板的基准点在其中轴线底部，参考下图： <img src="https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png" alt="image"></p>
    */
    @SerializedName("BoardX")
    @Expose
    private Long BoardX;

    /**
    * <p>BoardX单位, 0 像素，1百分比，默认为0，像素</p>
    */
    @SerializedName("BoardXUnit")
    @Expose
    private Long BoardXUnit;

    /**
    * <p>字幕背景底板的y轴坐标位置；支持像素和百分比格式： - 像素：Npx，N范围：[0,4096]。 - 百分百：N%，N范围：[0,100]；例如10%表示字幕背景底板y坐标=10%*源视频高度。 不传表示不开启字幕背景底板。 注意：坐标轴原点位于源视频的中轴线底部，字幕背景底板的基准点在其中轴线底部，参考下图： <img src="https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png" alt="image"></p>
    */
    @SerializedName("BoardY")
    @Expose
    private Long BoardY;

    /**
    * <p>BoardY单位, 0 像素，1百分比，默认为0，像素</p>
    */
    @SerializedName("BoardYUnit")
    @Expose
    private Long BoardYUnit;

    /**
    * <p>底板的宽度，正整数。 - 代表像素时，取值范围：[0,4096]。 - 代表百分数时，[0, 100]。 开启底板且不填此值时，默认源视频宽像素的90%。</p>
    */
    @SerializedName("BoardWidth")
    @Expose
    private Long BoardWidth;

    /**
    * <p>底板的宽度单位，0 像素，1百分比，默认为0，像素</p>
    */
    @SerializedName("BoardWidthUnit")
    @Expose
    private Long BoardWidthUnit;

    /**
    * <p>底板的高度，正整数。 - 代表像素时，取值范围：[0,4096]。 - 代表百分数时，[0, 100]。 开启底板且不填此值时，默认为源视频高像素的15%。</p>
    */
    @SerializedName("BoardHeight")
    @Expose
    private Long BoardHeight;

    /**
    * <p>底板的高度单位，0 像素，1百分比，默认为0，像素</p>
    */
    @SerializedName("BoardHeightUnit")
    @Expose
    private Long BoardHeightUnit;

    /**
    * <p>底板颜色。格式：0xRRGGBB， 默认值：0x000000（黑色）。</p>
    */
    @SerializedName("BoardColor")
    @Expose
    private String BoardColor;

    /**
    * <p>字幕背景板透明度，取值范围：[0, 1] <li>0：完全透明</li> <li>1：完全不透明</li> 默认值：0.8。</p>
    */
    @SerializedName("BoardAlpha")
    @Expose
    private Float BoardAlpha;

    /**
     * Get <p>字幕压制模块背景配置开关，0关闭，1开启，默认0</p> 
     * @return SubtitleBoardConfigSwitch <p>字幕压制模块背景配置开关，0关闭，1开启，默认0</p>
     */
    public Long getSubtitleBoardConfigSwitch() {
        return this.SubtitleBoardConfigSwitch;
    }

    /**
     * Set <p>字幕压制模块背景配置开关，0关闭，1开启，默认0</p>
     * @param SubtitleBoardConfigSwitch <p>字幕压制模块背景配置开关，0关闭，1开启，默认0</p>
     */
    public void setSubtitleBoardConfigSwitch(Long SubtitleBoardConfigSwitch) {
        this.SubtitleBoardConfigSwitch = SubtitleBoardConfigSwitch;
    }

    /**
     * Get <p>字幕背景底板的x轴坐标位置；支持像素和百分比格式： - 像素：Npx，N范围：[-4096,4096]。 - 百分百：N%，N范围：[-100,100]；例如10%表示字幕背景底板x坐标=10%*源视频宽度。 默认值：0px。 注意：坐标轴原点位于源视频的中轴线底部，字幕底板的基准点在其中轴线底部，参考下图： <img src="https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png" alt="image"></p> 
     * @return BoardX <p>字幕背景底板的x轴坐标位置；支持像素和百分比格式： - 像素：Npx，N范围：[-4096,4096]。 - 百分百：N%，N范围：[-100,100]；例如10%表示字幕背景底板x坐标=10%*源视频宽度。 默认值：0px。 注意：坐标轴原点位于源视频的中轴线底部，字幕底板的基准点在其中轴线底部，参考下图： <img src="https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png" alt="image"></p>
     */
    public Long getBoardX() {
        return this.BoardX;
    }

    /**
     * Set <p>字幕背景底板的x轴坐标位置；支持像素和百分比格式： - 像素：Npx，N范围：[-4096,4096]。 - 百分百：N%，N范围：[-100,100]；例如10%表示字幕背景底板x坐标=10%*源视频宽度。 默认值：0px。 注意：坐标轴原点位于源视频的中轴线底部，字幕底板的基准点在其中轴线底部，参考下图： <img src="https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png" alt="image"></p>
     * @param BoardX <p>字幕背景底板的x轴坐标位置；支持像素和百分比格式： - 像素：Npx，N范围：[-4096,4096]。 - 百分百：N%，N范围：[-100,100]；例如10%表示字幕背景底板x坐标=10%*源视频宽度。 默认值：0px。 注意：坐标轴原点位于源视频的中轴线底部，字幕底板的基准点在其中轴线底部，参考下图： <img src="https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png" alt="image"></p>
     */
    public void setBoardX(Long BoardX) {
        this.BoardX = BoardX;
    }

    /**
     * Get <p>BoardX单位, 0 像素，1百分比，默认为0，像素</p> 
     * @return BoardXUnit <p>BoardX单位, 0 像素，1百分比，默认为0，像素</p>
     */
    public Long getBoardXUnit() {
        return this.BoardXUnit;
    }

    /**
     * Set <p>BoardX单位, 0 像素，1百分比，默认为0，像素</p>
     * @param BoardXUnit <p>BoardX单位, 0 像素，1百分比，默认为0，像素</p>
     */
    public void setBoardXUnit(Long BoardXUnit) {
        this.BoardXUnit = BoardXUnit;
    }

    /**
     * Get <p>字幕背景底板的y轴坐标位置；支持像素和百分比格式： - 像素：Npx，N范围：[0,4096]。 - 百分百：N%，N范围：[0,100]；例如10%表示字幕背景底板y坐标=10%*源视频高度。 不传表示不开启字幕背景底板。 注意：坐标轴原点位于源视频的中轴线底部，字幕背景底板的基准点在其中轴线底部，参考下图： <img src="https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png" alt="image"></p> 
     * @return BoardY <p>字幕背景底板的y轴坐标位置；支持像素和百分比格式： - 像素：Npx，N范围：[0,4096]。 - 百分百：N%，N范围：[0,100]；例如10%表示字幕背景底板y坐标=10%*源视频高度。 不传表示不开启字幕背景底板。 注意：坐标轴原点位于源视频的中轴线底部，字幕背景底板的基准点在其中轴线底部，参考下图： <img src="https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png" alt="image"></p>
     */
    public Long getBoardY() {
        return this.BoardY;
    }

    /**
     * Set <p>字幕背景底板的y轴坐标位置；支持像素和百分比格式： - 像素：Npx，N范围：[0,4096]。 - 百分百：N%，N范围：[0,100]；例如10%表示字幕背景底板y坐标=10%*源视频高度。 不传表示不开启字幕背景底板。 注意：坐标轴原点位于源视频的中轴线底部，字幕背景底板的基准点在其中轴线底部，参考下图： <img src="https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png" alt="image"></p>
     * @param BoardY <p>字幕背景底板的y轴坐标位置；支持像素和百分比格式： - 像素：Npx，N范围：[0,4096]。 - 百分百：N%，N范围：[0,100]；例如10%表示字幕背景底板y坐标=10%*源视频高度。 不传表示不开启字幕背景底板。 注意：坐标轴原点位于源视频的中轴线底部，字幕背景底板的基准点在其中轴线底部，参考下图： <img src="https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png" alt="image"></p>
     */
    public void setBoardY(Long BoardY) {
        this.BoardY = BoardY;
    }

    /**
     * Get <p>BoardY单位, 0 像素，1百分比，默认为0，像素</p> 
     * @return BoardYUnit <p>BoardY单位, 0 像素，1百分比，默认为0，像素</p>
     */
    public Long getBoardYUnit() {
        return this.BoardYUnit;
    }

    /**
     * Set <p>BoardY单位, 0 像素，1百分比，默认为0，像素</p>
     * @param BoardYUnit <p>BoardY单位, 0 像素，1百分比，默认为0，像素</p>
     */
    public void setBoardYUnit(Long BoardYUnit) {
        this.BoardYUnit = BoardYUnit;
    }

    /**
     * Get <p>底板的宽度，正整数。 - 代表像素时，取值范围：[0,4096]。 - 代表百分数时，[0, 100]。 开启底板且不填此值时，默认源视频宽像素的90%。</p> 
     * @return BoardWidth <p>底板的宽度，正整数。 - 代表像素时，取值范围：[0,4096]。 - 代表百分数时，[0, 100]。 开启底板且不填此值时，默认源视频宽像素的90%。</p>
     */
    public Long getBoardWidth() {
        return this.BoardWidth;
    }

    /**
     * Set <p>底板的宽度，正整数。 - 代表像素时，取值范围：[0,4096]。 - 代表百分数时，[0, 100]。 开启底板且不填此值时，默认源视频宽像素的90%。</p>
     * @param BoardWidth <p>底板的宽度，正整数。 - 代表像素时，取值范围：[0,4096]。 - 代表百分数时，[0, 100]。 开启底板且不填此值时，默认源视频宽像素的90%。</p>
     */
    public void setBoardWidth(Long BoardWidth) {
        this.BoardWidth = BoardWidth;
    }

    /**
     * Get <p>底板的宽度单位，0 像素，1百分比，默认为0，像素</p> 
     * @return BoardWidthUnit <p>底板的宽度单位，0 像素，1百分比，默认为0，像素</p>
     */
    public Long getBoardWidthUnit() {
        return this.BoardWidthUnit;
    }

    /**
     * Set <p>底板的宽度单位，0 像素，1百分比，默认为0，像素</p>
     * @param BoardWidthUnit <p>底板的宽度单位，0 像素，1百分比，默认为0，像素</p>
     */
    public void setBoardWidthUnit(Long BoardWidthUnit) {
        this.BoardWidthUnit = BoardWidthUnit;
    }

    /**
     * Get <p>底板的高度，正整数。 - 代表像素时，取值范围：[0,4096]。 - 代表百分数时，[0, 100]。 开启底板且不填此值时，默认为源视频高像素的15%。</p> 
     * @return BoardHeight <p>底板的高度，正整数。 - 代表像素时，取值范围：[0,4096]。 - 代表百分数时，[0, 100]。 开启底板且不填此值时，默认为源视频高像素的15%。</p>
     */
    public Long getBoardHeight() {
        return this.BoardHeight;
    }

    /**
     * Set <p>底板的高度，正整数。 - 代表像素时，取值范围：[0,4096]。 - 代表百分数时，[0, 100]。 开启底板且不填此值时，默认为源视频高像素的15%。</p>
     * @param BoardHeight <p>底板的高度，正整数。 - 代表像素时，取值范围：[0,4096]。 - 代表百分数时，[0, 100]。 开启底板且不填此值时，默认为源视频高像素的15%。</p>
     */
    public void setBoardHeight(Long BoardHeight) {
        this.BoardHeight = BoardHeight;
    }

    /**
     * Get <p>底板的高度单位，0 像素，1百分比，默认为0，像素</p> 
     * @return BoardHeightUnit <p>底板的高度单位，0 像素，1百分比，默认为0，像素</p>
     */
    public Long getBoardHeightUnit() {
        return this.BoardHeightUnit;
    }

    /**
     * Set <p>底板的高度单位，0 像素，1百分比，默认为0，像素</p>
     * @param BoardHeightUnit <p>底板的高度单位，0 像素，1百分比，默认为0，像素</p>
     */
    public void setBoardHeightUnit(Long BoardHeightUnit) {
        this.BoardHeightUnit = BoardHeightUnit;
    }

    /**
     * Get <p>底板颜色。格式：0xRRGGBB， 默认值：0x000000（黑色）。</p> 
     * @return BoardColor <p>底板颜色。格式：0xRRGGBB， 默认值：0x000000（黑色）。</p>
     */
    public String getBoardColor() {
        return this.BoardColor;
    }

    /**
     * Set <p>底板颜色。格式：0xRRGGBB， 默认值：0x000000（黑色）。</p>
     * @param BoardColor <p>底板颜色。格式：0xRRGGBB， 默认值：0x000000（黑色）。</p>
     */
    public void setBoardColor(String BoardColor) {
        this.BoardColor = BoardColor;
    }

    /**
     * Get <p>字幕背景板透明度，取值范围：[0, 1] <li>0：完全透明</li> <li>1：完全不透明</li> 默认值：0.8。</p> 
     * @return BoardAlpha <p>字幕背景板透明度，取值范围：[0, 1] <li>0：完全透明</li> <li>1：完全不透明</li> 默认值：0.8。</p>
     */
    public Float getBoardAlpha() {
        return this.BoardAlpha;
    }

    /**
     * Set <p>字幕背景板透明度，取值范围：[0, 1] <li>0：完全透明</li> <li>1：完全不透明</li> 默认值：0.8。</p>
     * @param BoardAlpha <p>字幕背景板透明度，取值范围：[0, 1] <li>0：完全透明</li> <li>1：完全不透明</li> 默认值：0.8。</p>
     */
    public void setBoardAlpha(Float BoardAlpha) {
        this.BoardAlpha = BoardAlpha;
    }

    public MPSSubtitleBoardConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MPSSubtitleBoardConfig(MPSSubtitleBoardConfig source) {
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

