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

public class CloudEffectTemplateInfo extends AbstractModel {

    /**
    * <p>特效模板ID。</p>
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * <p>特效模板名称。</p>
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * <p>模板预览URL。</p>
    */
    @SerializedName("VideoUrl")
    @Expose
    private String VideoUrl;

    /**
    * <p>模板封面图片URL。</p>
    */
    @SerializedName("CoverImageUrl")
    @Expose
    private String CoverImageUrl;

    /**
    * <p>模板视频宽高比。</p>
    */
    @SerializedName("VideoRatio")
    @Expose
    private String VideoRatio;

    /**
     * Get <p>特效模板ID。</p> 
     * @return TemplateId <p>特效模板ID。</p>
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set <p>特效模板ID。</p>
     * @param TemplateId <p>特效模板ID。</p>
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get <p>特效模板名称。</p> 
     * @return TemplateName <p>特效模板名称。</p>
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set <p>特效模板名称。</p>
     * @param TemplateName <p>特效模板名称。</p>
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get <p>模板预览URL。</p> 
     * @return VideoUrl <p>模板预览URL。</p>
     */
    public String getVideoUrl() {
        return this.VideoUrl;
    }

    /**
     * Set <p>模板预览URL。</p>
     * @param VideoUrl <p>模板预览URL。</p>
     */
    public void setVideoUrl(String VideoUrl) {
        this.VideoUrl = VideoUrl;
    }

    /**
     * Get <p>模板封面图片URL。</p> 
     * @return CoverImageUrl <p>模板封面图片URL。</p>
     */
    public String getCoverImageUrl() {
        return this.CoverImageUrl;
    }

    /**
     * Set <p>模板封面图片URL。</p>
     * @param CoverImageUrl <p>模板封面图片URL。</p>
     */
    public void setCoverImageUrl(String CoverImageUrl) {
        this.CoverImageUrl = CoverImageUrl;
    }

    /**
     * Get <p>模板视频宽高比。</p> 
     * @return VideoRatio <p>模板视频宽高比。</p>
     */
    public String getVideoRatio() {
        return this.VideoRatio;
    }

    /**
     * Set <p>模板视频宽高比。</p>
     * @param VideoRatio <p>模板视频宽高比。</p>
     */
    public void setVideoRatio(String VideoRatio) {
        this.VideoRatio = VideoRatio;
    }

    public CloudEffectTemplateInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudEffectTemplateInfo(CloudEffectTemplateInfo source) {
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.TemplateName != null) {
            this.TemplateName = new String(source.TemplateName);
        }
        if (source.VideoUrl != null) {
            this.VideoUrl = new String(source.VideoUrl);
        }
        if (source.CoverImageUrl != null) {
            this.CoverImageUrl = new String(source.CoverImageUrl);
        }
        if (source.VideoRatio != null) {
            this.VideoRatio = new String(source.VideoRatio);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamSimple(map, prefix + "VideoUrl", this.VideoUrl);
        this.setParamSimple(map, prefix + "CoverImageUrl", this.CoverImageUrl);
        this.setParamSimple(map, prefix + "VideoRatio", this.VideoRatio);

    }
}

