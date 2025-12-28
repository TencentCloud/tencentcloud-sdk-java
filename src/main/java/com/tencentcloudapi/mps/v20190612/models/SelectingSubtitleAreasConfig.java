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

public class SelectingSubtitleAreasConfig extends AbstractModel {

    /**
    * 自动选择自定义区域。
对选定区域，利用AI模型自动检测其中存在的选择目标并提取。
    */
    @SerializedName("AutoAreas")
    @Expose
    private EraseArea [] AutoAreas;

    /**
    * 示例视频或图片的宽，单位像素值
    */
    @SerializedName("SampleWidth")
    @Expose
    private Long SampleWidth;

    /**
    * 示例视频或图片的高，单位像素值
    */
    @SerializedName("SampleHeight")
    @Expose
    private Long SampleHeight;

    /**
     * Get 自动选择自定义区域。
对选定区域，利用AI模型自动检测其中存在的选择目标并提取。 
     * @return AutoAreas 自动选择自定义区域。
对选定区域，利用AI模型自动检测其中存在的选择目标并提取。
     */
    public EraseArea [] getAutoAreas() {
        return this.AutoAreas;
    }

    /**
     * Set 自动选择自定义区域。
对选定区域，利用AI模型自动检测其中存在的选择目标并提取。
     * @param AutoAreas 自动选择自定义区域。
对选定区域，利用AI模型自动检测其中存在的选择目标并提取。
     */
    public void setAutoAreas(EraseArea [] AutoAreas) {
        this.AutoAreas = AutoAreas;
    }

    /**
     * Get 示例视频或图片的宽，单位像素值 
     * @return SampleWidth 示例视频或图片的宽，单位像素值
     */
    public Long getSampleWidth() {
        return this.SampleWidth;
    }

    /**
     * Set 示例视频或图片的宽，单位像素值
     * @param SampleWidth 示例视频或图片的宽，单位像素值
     */
    public void setSampleWidth(Long SampleWidth) {
        this.SampleWidth = SampleWidth;
    }

    /**
     * Get 示例视频或图片的高，单位像素值 
     * @return SampleHeight 示例视频或图片的高，单位像素值
     */
    public Long getSampleHeight() {
        return this.SampleHeight;
    }

    /**
     * Set 示例视频或图片的高，单位像素值
     * @param SampleHeight 示例视频或图片的高，单位像素值
     */
    public void setSampleHeight(Long SampleHeight) {
        this.SampleHeight = SampleHeight;
    }

    public SelectingSubtitleAreasConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SelectingSubtitleAreasConfig(SelectingSubtitleAreasConfig source) {
        if (source.AutoAreas != null) {
            this.AutoAreas = new EraseArea[source.AutoAreas.length];
            for (int i = 0; i < source.AutoAreas.length; i++) {
                this.AutoAreas[i] = new EraseArea(source.AutoAreas[i]);
            }
        }
        if (source.SampleWidth != null) {
            this.SampleWidth = new Long(source.SampleWidth);
        }
        if (source.SampleHeight != null) {
            this.SampleHeight = new Long(source.SampleHeight);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "AutoAreas.", this.AutoAreas);
        this.setParamSimple(map, prefix + "SampleWidth", this.SampleWidth);
        this.setParamSimple(map, prefix + "SampleHeight", this.SampleHeight);

    }
}

