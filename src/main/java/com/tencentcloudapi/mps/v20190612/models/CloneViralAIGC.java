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

public class CloneViralAIGC extends AbstractModel {

    /**
    * <p>视频时长</p><p>取值范围：[4, 15]</p>
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * <p>宽高比。可选 16:9/4:3/1:1/3:4/9:16/21:9/adaptive</p>
    */
    @SerializedName("AspectRatio")
    @Expose
    private String AspectRatio;

    /**
    * <p>分辨率。支持720p（默认）/1080p/2k/4k</p>
    */
    @SerializedName("Resolution")
    @Expose
    private String Resolution;

    /**
    * <p>模型等级。flagship（默认）、standard</p>
    */
    @SerializedName("ModelTier")
    @Expose
    private String ModelTier;

    /**
     * Get <p>视频时长</p><p>取值范围：[4, 15]</p> 
     * @return Duration <p>视频时长</p><p>取值范围：[4, 15]</p>
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set <p>视频时长</p><p>取值范围：[4, 15]</p>
     * @param Duration <p>视频时长</p><p>取值范围：[4, 15]</p>
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get <p>宽高比。可选 16:9/4:3/1:1/3:4/9:16/21:9/adaptive</p> 
     * @return AspectRatio <p>宽高比。可选 16:9/4:3/1:1/3:4/9:16/21:9/adaptive</p>
     */
    public String getAspectRatio() {
        return this.AspectRatio;
    }

    /**
     * Set <p>宽高比。可选 16:9/4:3/1:1/3:4/9:16/21:9/adaptive</p>
     * @param AspectRatio <p>宽高比。可选 16:9/4:3/1:1/3:4/9:16/21:9/adaptive</p>
     */
    public void setAspectRatio(String AspectRatio) {
        this.AspectRatio = AspectRatio;
    }

    /**
     * Get <p>分辨率。支持720p（默认）/1080p/2k/4k</p> 
     * @return Resolution <p>分辨率。支持720p（默认）/1080p/2k/4k</p>
     */
    public String getResolution() {
        return this.Resolution;
    }

    /**
     * Set <p>分辨率。支持720p（默认）/1080p/2k/4k</p>
     * @param Resolution <p>分辨率。支持720p（默认）/1080p/2k/4k</p>
     */
    public void setResolution(String Resolution) {
        this.Resolution = Resolution;
    }

    /**
     * Get <p>模型等级。flagship（默认）、standard</p> 
     * @return ModelTier <p>模型等级。flagship（默认）、standard</p>
     */
    public String getModelTier() {
        return this.ModelTier;
    }

    /**
     * Set <p>模型等级。flagship（默认）、standard</p>
     * @param ModelTier <p>模型等级。flagship（默认）、standard</p>
     */
    public void setModelTier(String ModelTier) {
        this.ModelTier = ModelTier;
    }

    public CloneViralAIGC() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloneViralAIGC(CloneViralAIGC source) {
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.AspectRatio != null) {
            this.AspectRatio = new String(source.AspectRatio);
        }
        if (source.Resolution != null) {
            this.Resolution = new String(source.Resolution);
        }
        if (source.ModelTier != null) {
            this.ModelTier = new String(source.ModelTier);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "AspectRatio", this.AspectRatio);
        this.setParamSimple(map, prefix + "Resolution", this.Resolution);
        this.setParamSimple(map, prefix + "ModelTier", this.ModelTier);

    }
}

