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

public class AiDramaInput extends AbstractModel {

    /**
    * <p>ai漫剧剧本</p><p>参数格式：无</p><p>入参限制：无</p>
    */
    @SerializedName("Script")
    @Expose
    private String Script;

    /**
    * <p>ai漫剧风格</p><p>枚举值：</p><ul><li>chinese_ink_wash： 国风水墨</li><li>fantasy_cyberpunk： 奇幻赛博朋克</li><li>japanese_anime_2d： 日漫二次元</li></ul><p>默认值：chinese_ink_wash</p><p>枚举值：</p><ul><li>realistic_live_action： 真人写实</li><li>chinese_ink_wash： 国风水墨</li><li>fantasy_cyberpunk： 奇幻赛博朋克</li><li>japanese_anime_2d： 日漫二次元</li></ul><p>默认值：chinese_ink_wash</p>
    */
    @SerializedName("Style")
    @Expose
    private String Style;

    /**
    * <p>宽高比</p><p>枚举值：</p><ul><li>16:9： 16:9</li><li>9:16： 9:16</li></ul><p>默认值：16:9</p>
    */
    @SerializedName("Ratio")
    @Expose
    private String Ratio;

    /**
    * <p>输出视频分辨率</p><p>枚举值：</p><ul><li>720p： 720p</li><li>1080p： 1080p</li></ul><p>默认值：720p</p>
    */
    @SerializedName("Resolution")
    @Expose
    private String Resolution;

    /**
     * Get <p>ai漫剧剧本</p><p>参数格式：无</p><p>入参限制：无</p> 
     * @return Script <p>ai漫剧剧本</p><p>参数格式：无</p><p>入参限制：无</p>
     */
    public String getScript() {
        return this.Script;
    }

    /**
     * Set <p>ai漫剧剧本</p><p>参数格式：无</p><p>入参限制：无</p>
     * @param Script <p>ai漫剧剧本</p><p>参数格式：无</p><p>入参限制：无</p>
     */
    public void setScript(String Script) {
        this.Script = Script;
    }

    /**
     * Get <p>ai漫剧风格</p><p>枚举值：</p><ul><li>chinese_ink_wash： 国风水墨</li><li>fantasy_cyberpunk： 奇幻赛博朋克</li><li>japanese_anime_2d： 日漫二次元</li></ul><p>默认值：chinese_ink_wash</p><p>枚举值：</p><ul><li>realistic_live_action： 真人写实</li><li>chinese_ink_wash： 国风水墨</li><li>fantasy_cyberpunk： 奇幻赛博朋克</li><li>japanese_anime_2d： 日漫二次元</li></ul><p>默认值：chinese_ink_wash</p> 
     * @return Style <p>ai漫剧风格</p><p>枚举值：</p><ul><li>chinese_ink_wash： 国风水墨</li><li>fantasy_cyberpunk： 奇幻赛博朋克</li><li>japanese_anime_2d： 日漫二次元</li></ul><p>默认值：chinese_ink_wash</p><p>枚举值：</p><ul><li>realistic_live_action： 真人写实</li><li>chinese_ink_wash： 国风水墨</li><li>fantasy_cyberpunk： 奇幻赛博朋克</li><li>japanese_anime_2d： 日漫二次元</li></ul><p>默认值：chinese_ink_wash</p>
     */
    public String getStyle() {
        return this.Style;
    }

    /**
     * Set <p>ai漫剧风格</p><p>枚举值：</p><ul><li>chinese_ink_wash： 国风水墨</li><li>fantasy_cyberpunk： 奇幻赛博朋克</li><li>japanese_anime_2d： 日漫二次元</li></ul><p>默认值：chinese_ink_wash</p><p>枚举值：</p><ul><li>realistic_live_action： 真人写实</li><li>chinese_ink_wash： 国风水墨</li><li>fantasy_cyberpunk： 奇幻赛博朋克</li><li>japanese_anime_2d： 日漫二次元</li></ul><p>默认值：chinese_ink_wash</p>
     * @param Style <p>ai漫剧风格</p><p>枚举值：</p><ul><li>chinese_ink_wash： 国风水墨</li><li>fantasy_cyberpunk： 奇幻赛博朋克</li><li>japanese_anime_2d： 日漫二次元</li></ul><p>默认值：chinese_ink_wash</p><p>枚举值：</p><ul><li>realistic_live_action： 真人写实</li><li>chinese_ink_wash： 国风水墨</li><li>fantasy_cyberpunk： 奇幻赛博朋克</li><li>japanese_anime_2d： 日漫二次元</li></ul><p>默认值：chinese_ink_wash</p>
     */
    public void setStyle(String Style) {
        this.Style = Style;
    }

    /**
     * Get <p>宽高比</p><p>枚举值：</p><ul><li>16:9： 16:9</li><li>9:16： 9:16</li></ul><p>默认值：16:9</p> 
     * @return Ratio <p>宽高比</p><p>枚举值：</p><ul><li>16:9： 16:9</li><li>9:16： 9:16</li></ul><p>默认值：16:9</p>
     */
    public String getRatio() {
        return this.Ratio;
    }

    /**
     * Set <p>宽高比</p><p>枚举值：</p><ul><li>16:9： 16:9</li><li>9:16： 9:16</li></ul><p>默认值：16:9</p>
     * @param Ratio <p>宽高比</p><p>枚举值：</p><ul><li>16:9： 16:9</li><li>9:16： 9:16</li></ul><p>默认值：16:9</p>
     */
    public void setRatio(String Ratio) {
        this.Ratio = Ratio;
    }

    /**
     * Get <p>输出视频分辨率</p><p>枚举值：</p><ul><li>720p： 720p</li><li>1080p： 1080p</li></ul><p>默认值：720p</p> 
     * @return Resolution <p>输出视频分辨率</p><p>枚举值：</p><ul><li>720p： 720p</li><li>1080p： 1080p</li></ul><p>默认值：720p</p>
     */
    public String getResolution() {
        return this.Resolution;
    }

    /**
     * Set <p>输出视频分辨率</p><p>枚举值：</p><ul><li>720p： 720p</li><li>1080p： 1080p</li></ul><p>默认值：720p</p>
     * @param Resolution <p>输出视频分辨率</p><p>枚举值：</p><ul><li>720p： 720p</li><li>1080p： 1080p</li></ul><p>默认值：720p</p>
     */
    public void setResolution(String Resolution) {
        this.Resolution = Resolution;
    }

    public AiDramaInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiDramaInput(AiDramaInput source) {
        if (source.Script != null) {
            this.Script = new String(source.Script);
        }
        if (source.Style != null) {
            this.Style = new String(source.Style);
        }
        if (source.Ratio != null) {
            this.Ratio = new String(source.Ratio);
        }
        if (source.Resolution != null) {
            this.Resolution = new String(source.Resolution);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Script", this.Script);
        this.setParamSimple(map, prefix + "Style", this.Style);
        this.setParamSimple(map, prefix + "Ratio", this.Ratio);
        this.setParamSimple(map, prefix + "Resolution", this.Resolution);

    }
}

