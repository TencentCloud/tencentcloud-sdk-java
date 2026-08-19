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

public class FissionTaskInfo extends AbstractModel {

    /**
    * <p>视频输出时长</p><p>取值范围：[4, 15]</p><p>单位：秒</p><p>默认值：15</p>
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * <p>模型档位</p><p>枚举值：</p><ul><li>standard： 标准版</li><li>flagship： 旗舰版</li></ul>
    */
    @SerializedName("ModelTier")
    @Expose
    private String ModelTier;

    /**
    * <p>视频画面比例</p><p>枚举值：</p><ul><li>9:16： 9:16</li><li>16:9： 16:9</li><li>1:1： 1:1</li><li>3:4： 3:4</li><li>4:3： 4:3</li></ul>
    */
    @SerializedName("Ratio")
    @Expose
    private String Ratio;

    /**
    * <p>输出分辨率</p><p>枚举值：</p><ul><li>720p： 720p</li><li>1080p： 1080p</li><li>2k： 2k</li><li>4k： 4k</li></ul>
    */
    @SerializedName("Resolution")
    @Expose
    private String Resolution;

    /**
    * <p>目标市场</p><p>枚举值：</p><ul><li>north_america： 北美</li><li>europe： 欧洲</li><li>china： 中国</li><li>japan： 日本</li><li>korea： 韩国</li><li>southeast_asia： 东南亚</li><li>brazil： 巴西</li><li>global： 全球</li><li>other： 其他</li></ul><p>影响默认出镜模特族裔与本地化风格；未指定 CustomModel 时按市场自动决定人种</p>
    */
    @SerializedName("Market")
    @Expose
    private String Market;

    /**
    * <p>口播/字幕语言</p><p>枚举值：</p><ul><li>english： 英文</li><li>chinese： 中文</li><li>japanese： 日语</li><li>korean： 韩语</li><li>spanish： 西班牙语</li><li>portuguese： 葡萄牙语</li><li>music_only： 纯音乐无口播</li></ul>
    */
    @SerializedName("Language")
    @Expose
    private String Language;

    /**
    * <p>视频类型</p><p>枚举值：</p><ul><li>ugc： UGC种草</li><li>talk： 产品口播</li><li>display： 产品展示（纯商品、无人声）</li><li>unboxing： 开箱分享</li><li>reaction： 反应展示</li></ul>
    */
    @SerializedName("VideoType")
    @Expose
    private String VideoType;

    /**
    * <p>裂变数量</p><p>取值范围：[0, 1]</p><p>单位：个</p>
    */
    @SerializedName("SplitCount")
    @Expose
    private Long SplitCount;

    /**
    * <p>定制出镜模特</p>
    */
    @SerializedName("CustomModel")
    @Expose
    private CustomModel CustomModel;

    /**
     * Get <p>视频输出时长</p><p>取值范围：[4, 15]</p><p>单位：秒</p><p>默认值：15</p> 
     * @return Duration <p>视频输出时长</p><p>取值范围：[4, 15]</p><p>单位：秒</p><p>默认值：15</p>
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set <p>视频输出时长</p><p>取值范围：[4, 15]</p><p>单位：秒</p><p>默认值：15</p>
     * @param Duration <p>视频输出时长</p><p>取值范围：[4, 15]</p><p>单位：秒</p><p>默认值：15</p>
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get <p>模型档位</p><p>枚举值：</p><ul><li>standard： 标准版</li><li>flagship： 旗舰版</li></ul> 
     * @return ModelTier <p>模型档位</p><p>枚举值：</p><ul><li>standard： 标准版</li><li>flagship： 旗舰版</li></ul>
     */
    public String getModelTier() {
        return this.ModelTier;
    }

    /**
     * Set <p>模型档位</p><p>枚举值：</p><ul><li>standard： 标准版</li><li>flagship： 旗舰版</li></ul>
     * @param ModelTier <p>模型档位</p><p>枚举值：</p><ul><li>standard： 标准版</li><li>flagship： 旗舰版</li></ul>
     */
    public void setModelTier(String ModelTier) {
        this.ModelTier = ModelTier;
    }

    /**
     * Get <p>视频画面比例</p><p>枚举值：</p><ul><li>9:16： 9:16</li><li>16:9： 16:9</li><li>1:1： 1:1</li><li>3:4： 3:4</li><li>4:3： 4:3</li></ul> 
     * @return Ratio <p>视频画面比例</p><p>枚举值：</p><ul><li>9:16： 9:16</li><li>16:9： 16:9</li><li>1:1： 1:1</li><li>3:4： 3:4</li><li>4:3： 4:3</li></ul>
     */
    public String getRatio() {
        return this.Ratio;
    }

    /**
     * Set <p>视频画面比例</p><p>枚举值：</p><ul><li>9:16： 9:16</li><li>16:9： 16:9</li><li>1:1： 1:1</li><li>3:4： 3:4</li><li>4:3： 4:3</li></ul>
     * @param Ratio <p>视频画面比例</p><p>枚举值：</p><ul><li>9:16： 9:16</li><li>16:9： 16:9</li><li>1:1： 1:1</li><li>3:4： 3:4</li><li>4:3： 4:3</li></ul>
     */
    public void setRatio(String Ratio) {
        this.Ratio = Ratio;
    }

    /**
     * Get <p>输出分辨率</p><p>枚举值：</p><ul><li>720p： 720p</li><li>1080p： 1080p</li><li>2k： 2k</li><li>4k： 4k</li></ul> 
     * @return Resolution <p>输出分辨率</p><p>枚举值：</p><ul><li>720p： 720p</li><li>1080p： 1080p</li><li>2k： 2k</li><li>4k： 4k</li></ul>
     */
    public String getResolution() {
        return this.Resolution;
    }

    /**
     * Set <p>输出分辨率</p><p>枚举值：</p><ul><li>720p： 720p</li><li>1080p： 1080p</li><li>2k： 2k</li><li>4k： 4k</li></ul>
     * @param Resolution <p>输出分辨率</p><p>枚举值：</p><ul><li>720p： 720p</li><li>1080p： 1080p</li><li>2k： 2k</li><li>4k： 4k</li></ul>
     */
    public void setResolution(String Resolution) {
        this.Resolution = Resolution;
    }

    /**
     * Get <p>目标市场</p><p>枚举值：</p><ul><li>north_america： 北美</li><li>europe： 欧洲</li><li>china： 中国</li><li>japan： 日本</li><li>korea： 韩国</li><li>southeast_asia： 东南亚</li><li>brazil： 巴西</li><li>global： 全球</li><li>other： 其他</li></ul><p>影响默认出镜模特族裔与本地化风格；未指定 CustomModel 时按市场自动决定人种</p> 
     * @return Market <p>目标市场</p><p>枚举值：</p><ul><li>north_america： 北美</li><li>europe： 欧洲</li><li>china： 中国</li><li>japan： 日本</li><li>korea： 韩国</li><li>southeast_asia： 东南亚</li><li>brazil： 巴西</li><li>global： 全球</li><li>other： 其他</li></ul><p>影响默认出镜模特族裔与本地化风格；未指定 CustomModel 时按市场自动决定人种</p>
     */
    public String getMarket() {
        return this.Market;
    }

    /**
     * Set <p>目标市场</p><p>枚举值：</p><ul><li>north_america： 北美</li><li>europe： 欧洲</li><li>china： 中国</li><li>japan： 日本</li><li>korea： 韩国</li><li>southeast_asia： 东南亚</li><li>brazil： 巴西</li><li>global： 全球</li><li>other： 其他</li></ul><p>影响默认出镜模特族裔与本地化风格；未指定 CustomModel 时按市场自动决定人种</p>
     * @param Market <p>目标市场</p><p>枚举值：</p><ul><li>north_america： 北美</li><li>europe： 欧洲</li><li>china： 中国</li><li>japan： 日本</li><li>korea： 韩国</li><li>southeast_asia： 东南亚</li><li>brazil： 巴西</li><li>global： 全球</li><li>other： 其他</li></ul><p>影响默认出镜模特族裔与本地化风格；未指定 CustomModel 时按市场自动决定人种</p>
     */
    public void setMarket(String Market) {
        this.Market = Market;
    }

    /**
     * Get <p>口播/字幕语言</p><p>枚举值：</p><ul><li>english： 英文</li><li>chinese： 中文</li><li>japanese： 日语</li><li>korean： 韩语</li><li>spanish： 西班牙语</li><li>portuguese： 葡萄牙语</li><li>music_only： 纯音乐无口播</li></ul> 
     * @return Language <p>口播/字幕语言</p><p>枚举值：</p><ul><li>english： 英文</li><li>chinese： 中文</li><li>japanese： 日语</li><li>korean： 韩语</li><li>spanish： 西班牙语</li><li>portuguese： 葡萄牙语</li><li>music_only： 纯音乐无口播</li></ul>
     */
    public String getLanguage() {
        return this.Language;
    }

    /**
     * Set <p>口播/字幕语言</p><p>枚举值：</p><ul><li>english： 英文</li><li>chinese： 中文</li><li>japanese： 日语</li><li>korean： 韩语</li><li>spanish： 西班牙语</li><li>portuguese： 葡萄牙语</li><li>music_only： 纯音乐无口播</li></ul>
     * @param Language <p>口播/字幕语言</p><p>枚举值：</p><ul><li>english： 英文</li><li>chinese： 中文</li><li>japanese： 日语</li><li>korean： 韩语</li><li>spanish： 西班牙语</li><li>portuguese： 葡萄牙语</li><li>music_only： 纯音乐无口播</li></ul>
     */
    public void setLanguage(String Language) {
        this.Language = Language;
    }

    /**
     * Get <p>视频类型</p><p>枚举值：</p><ul><li>ugc： UGC种草</li><li>talk： 产品口播</li><li>display： 产品展示（纯商品、无人声）</li><li>unboxing： 开箱分享</li><li>reaction： 反应展示</li></ul> 
     * @return VideoType <p>视频类型</p><p>枚举值：</p><ul><li>ugc： UGC种草</li><li>talk： 产品口播</li><li>display： 产品展示（纯商品、无人声）</li><li>unboxing： 开箱分享</li><li>reaction： 反应展示</li></ul>
     */
    public String getVideoType() {
        return this.VideoType;
    }

    /**
     * Set <p>视频类型</p><p>枚举值：</p><ul><li>ugc： UGC种草</li><li>talk： 产品口播</li><li>display： 产品展示（纯商品、无人声）</li><li>unboxing： 开箱分享</li><li>reaction： 反应展示</li></ul>
     * @param VideoType <p>视频类型</p><p>枚举值：</p><ul><li>ugc： UGC种草</li><li>talk： 产品口播</li><li>display： 产品展示（纯商品、无人声）</li><li>unboxing： 开箱分享</li><li>reaction： 反应展示</li></ul>
     */
    public void setVideoType(String VideoType) {
        this.VideoType = VideoType;
    }

    /**
     * Get <p>裂变数量</p><p>取值范围：[0, 1]</p><p>单位：个</p> 
     * @return SplitCount <p>裂变数量</p><p>取值范围：[0, 1]</p><p>单位：个</p>
     */
    public Long getSplitCount() {
        return this.SplitCount;
    }

    /**
     * Set <p>裂变数量</p><p>取值范围：[0, 1]</p><p>单位：个</p>
     * @param SplitCount <p>裂变数量</p><p>取值范围：[0, 1]</p><p>单位：个</p>
     */
    public void setSplitCount(Long SplitCount) {
        this.SplitCount = SplitCount;
    }

    /**
     * Get <p>定制出镜模特</p> 
     * @return CustomModel <p>定制出镜模特</p>
     */
    public CustomModel getCustomModel() {
        return this.CustomModel;
    }

    /**
     * Set <p>定制出镜模特</p>
     * @param CustomModel <p>定制出镜模特</p>
     */
    public void setCustomModel(CustomModel CustomModel) {
        this.CustomModel = CustomModel;
    }

    public FissionTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FissionTaskInfo(FissionTaskInfo source) {
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.ModelTier != null) {
            this.ModelTier = new String(source.ModelTier);
        }
        if (source.Ratio != null) {
            this.Ratio = new String(source.Ratio);
        }
        if (source.Resolution != null) {
            this.Resolution = new String(source.Resolution);
        }
        if (source.Market != null) {
            this.Market = new String(source.Market);
        }
        if (source.Language != null) {
            this.Language = new String(source.Language);
        }
        if (source.VideoType != null) {
            this.VideoType = new String(source.VideoType);
        }
        if (source.SplitCount != null) {
            this.SplitCount = new Long(source.SplitCount);
        }
        if (source.CustomModel != null) {
            this.CustomModel = new CustomModel(source.CustomModel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "ModelTier", this.ModelTier);
        this.setParamSimple(map, prefix + "Ratio", this.Ratio);
        this.setParamSimple(map, prefix + "Resolution", this.Resolution);
        this.setParamSimple(map, prefix + "Market", this.Market);
        this.setParamSimple(map, prefix + "Language", this.Language);
        this.setParamSimple(map, prefix + "VideoType", this.VideoType);
        this.setParamSimple(map, prefix + "SplitCount", this.SplitCount);
        this.setParamObj(map, prefix + "CustomModel.", this.CustomModel);

    }
}

