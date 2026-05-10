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

public class MPSUpdateSmartEraseWatermarkConfig extends AbstractModel {

    /**
    * <p>水印擦除方式。<br> <strong>自动擦除：</strong>通过A模型自动识别视频中的水印，擦除后生成新的视频。适用于动态水印。 当使用自动擦除时，若您不指定AutoAreas，将对视频全屏进行自动擦除；若指定AutoAreas，将改为对您指定的区域进行自动擦除。<br><strong>指定区域擦除：</strong>针对位置较固定的静态水印，建议您直接指定擦除区域。 当您选择指定区域擦除时，请至少传入一个指定区域。 - auto 自动擦除 - custom 指定区域擦除</p>
    */
    @SerializedName("WatermarkEraseMethod")
    @Expose
    private String WatermarkEraseMethod;

    /**
    * <p>水印擦除模型。 基础版：效果一般，性价比高，适合动画或背景较干净的视频。 高级版：效果更好，适合短剧等现实风格视频。 </p><ul><li>basic 基础版 </li><li>advanced 高级版</li></ul>
    */
    @SerializedName("WatermarkModel")
    @Expose
    private String WatermarkModel;

    /**
    * <p>自动擦除自定义区域。 对选定区域，利用AI模型自动检测其中存在的擦除目标并擦除。 注意，当擦除方式为custom时，此参数将不会生效。清除区域请传入[]，不传时将保持模板区域信息不变。</p>
    */
    @SerializedName("AutoAreas")
    @Expose
    private MPSEraseArea [] AutoAreas;

    /**
    * <p>指定擦除自定义区域。 对选定区域，在选定时间段内不进行检测识别直接进行擦除。 注意：清除区域请传入[]，不传时将保持模板区域信息不变。</p>
    */
    @SerializedName("CustomAreas")
    @Expose
    private MPSEraseTimeArea [] CustomAreas;

    /**
     * Get <p>水印擦除方式。<br> <strong>自动擦除：</strong>通过A模型自动识别视频中的水印，擦除后生成新的视频。适用于动态水印。 当使用自动擦除时，若您不指定AutoAreas，将对视频全屏进行自动擦除；若指定AutoAreas，将改为对您指定的区域进行自动擦除。<br><strong>指定区域擦除：</strong>针对位置较固定的静态水印，建议您直接指定擦除区域。 当您选择指定区域擦除时，请至少传入一个指定区域。 - auto 自动擦除 - custom 指定区域擦除</p> 
     * @return WatermarkEraseMethod <p>水印擦除方式。<br> <strong>自动擦除：</strong>通过A模型自动识别视频中的水印，擦除后生成新的视频。适用于动态水印。 当使用自动擦除时，若您不指定AutoAreas，将对视频全屏进行自动擦除；若指定AutoAreas，将改为对您指定的区域进行自动擦除。<br><strong>指定区域擦除：</strong>针对位置较固定的静态水印，建议您直接指定擦除区域。 当您选择指定区域擦除时，请至少传入一个指定区域。 - auto 自动擦除 - custom 指定区域擦除</p>
     */
    public String getWatermarkEraseMethod() {
        return this.WatermarkEraseMethod;
    }

    /**
     * Set <p>水印擦除方式。<br> <strong>自动擦除：</strong>通过A模型自动识别视频中的水印，擦除后生成新的视频。适用于动态水印。 当使用自动擦除时，若您不指定AutoAreas，将对视频全屏进行自动擦除；若指定AutoAreas，将改为对您指定的区域进行自动擦除。<br><strong>指定区域擦除：</strong>针对位置较固定的静态水印，建议您直接指定擦除区域。 当您选择指定区域擦除时，请至少传入一个指定区域。 - auto 自动擦除 - custom 指定区域擦除</p>
     * @param WatermarkEraseMethod <p>水印擦除方式。<br> <strong>自动擦除：</strong>通过A模型自动识别视频中的水印，擦除后生成新的视频。适用于动态水印。 当使用自动擦除时，若您不指定AutoAreas，将对视频全屏进行自动擦除；若指定AutoAreas，将改为对您指定的区域进行自动擦除。<br><strong>指定区域擦除：</strong>针对位置较固定的静态水印，建议您直接指定擦除区域。 当您选择指定区域擦除时，请至少传入一个指定区域。 - auto 自动擦除 - custom 指定区域擦除</p>
     */
    public void setWatermarkEraseMethod(String WatermarkEraseMethod) {
        this.WatermarkEraseMethod = WatermarkEraseMethod;
    }

    /**
     * Get <p>水印擦除模型。 基础版：效果一般，性价比高，适合动画或背景较干净的视频。 高级版：效果更好，适合短剧等现实风格视频。 </p><ul><li>basic 基础版 </li><li>advanced 高级版</li></ul> 
     * @return WatermarkModel <p>水印擦除模型。 基础版：效果一般，性价比高，适合动画或背景较干净的视频。 高级版：效果更好，适合短剧等现实风格视频。 </p><ul><li>basic 基础版 </li><li>advanced 高级版</li></ul>
     */
    public String getWatermarkModel() {
        return this.WatermarkModel;
    }

    /**
     * Set <p>水印擦除模型。 基础版：效果一般，性价比高，适合动画或背景较干净的视频。 高级版：效果更好，适合短剧等现实风格视频。 </p><ul><li>basic 基础版 </li><li>advanced 高级版</li></ul>
     * @param WatermarkModel <p>水印擦除模型。 基础版：效果一般，性价比高，适合动画或背景较干净的视频。 高级版：效果更好，适合短剧等现实风格视频。 </p><ul><li>basic 基础版 </li><li>advanced 高级版</li></ul>
     */
    public void setWatermarkModel(String WatermarkModel) {
        this.WatermarkModel = WatermarkModel;
    }

    /**
     * Get <p>自动擦除自定义区域。 对选定区域，利用AI模型自动检测其中存在的擦除目标并擦除。 注意，当擦除方式为custom时，此参数将不会生效。清除区域请传入[]，不传时将保持模板区域信息不变。</p> 
     * @return AutoAreas <p>自动擦除自定义区域。 对选定区域，利用AI模型自动检测其中存在的擦除目标并擦除。 注意，当擦除方式为custom时，此参数将不会生效。清除区域请传入[]，不传时将保持模板区域信息不变。</p>
     */
    public MPSEraseArea [] getAutoAreas() {
        return this.AutoAreas;
    }

    /**
     * Set <p>自动擦除自定义区域。 对选定区域，利用AI模型自动检测其中存在的擦除目标并擦除。 注意，当擦除方式为custom时，此参数将不会生效。清除区域请传入[]，不传时将保持模板区域信息不变。</p>
     * @param AutoAreas <p>自动擦除自定义区域。 对选定区域，利用AI模型自动检测其中存在的擦除目标并擦除。 注意，当擦除方式为custom时，此参数将不会生效。清除区域请传入[]，不传时将保持模板区域信息不变。</p>
     */
    public void setAutoAreas(MPSEraseArea [] AutoAreas) {
        this.AutoAreas = AutoAreas;
    }

    /**
     * Get <p>指定擦除自定义区域。 对选定区域，在选定时间段内不进行检测识别直接进行擦除。 注意：清除区域请传入[]，不传时将保持模板区域信息不变。</p> 
     * @return CustomAreas <p>指定擦除自定义区域。 对选定区域，在选定时间段内不进行检测识别直接进行擦除。 注意：清除区域请传入[]，不传时将保持模板区域信息不变。</p>
     */
    public MPSEraseTimeArea [] getCustomAreas() {
        return this.CustomAreas;
    }

    /**
     * Set <p>指定擦除自定义区域。 对选定区域，在选定时间段内不进行检测识别直接进行擦除。 注意：清除区域请传入[]，不传时将保持模板区域信息不变。</p>
     * @param CustomAreas <p>指定擦除自定义区域。 对选定区域，在选定时间段内不进行检测识别直接进行擦除。 注意：清除区域请传入[]，不传时将保持模板区域信息不变。</p>
     */
    public void setCustomAreas(MPSEraseTimeArea [] CustomAreas) {
        this.CustomAreas = CustomAreas;
    }

    public MPSUpdateSmartEraseWatermarkConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MPSUpdateSmartEraseWatermarkConfig(MPSUpdateSmartEraseWatermarkConfig source) {
        if (source.WatermarkEraseMethod != null) {
            this.WatermarkEraseMethod = new String(source.WatermarkEraseMethod);
        }
        if (source.WatermarkModel != null) {
            this.WatermarkModel = new String(source.WatermarkModel);
        }
        if (source.AutoAreas != null) {
            this.AutoAreas = new MPSEraseArea[source.AutoAreas.length];
            for (int i = 0; i < source.AutoAreas.length; i++) {
                this.AutoAreas[i] = new MPSEraseArea(source.AutoAreas[i]);
            }
        }
        if (source.CustomAreas != null) {
            this.CustomAreas = new MPSEraseTimeArea[source.CustomAreas.length];
            for (int i = 0; i < source.CustomAreas.length; i++) {
                this.CustomAreas[i] = new MPSEraseTimeArea(source.CustomAreas[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WatermarkEraseMethod", this.WatermarkEraseMethod);
        this.setParamSimple(map, prefix + "WatermarkModel", this.WatermarkModel);
        this.setParamArrayObj(map, prefix + "AutoAreas.", this.AutoAreas);
        this.setParamArrayObj(map, prefix + "CustomAreas.", this.CustomAreas);

    }
}

