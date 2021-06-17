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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VideoEditTemplateMaterial extends AbstractModel{

    /**
    * 视频编辑模板宽高比。
    */
    @SerializedName("AspectRatio")
    @Expose
    private String AspectRatio;

    /**
    * 卡槽信息。
    */
    @SerializedName("SlotSet")
    @Expose
    private SlotInfo [] SlotSet;

    /**
    * 模板预览视频 URL 地址 。
    */
    @SerializedName("PreviewVideoUrl")
    @Expose
    private String PreviewVideoUrl;

    /**
     * Get 视频编辑模板宽高比。 
     * @return AspectRatio 视频编辑模板宽高比。
     */
    public String getAspectRatio() {
        return this.AspectRatio;
    }

    /**
     * Set 视频编辑模板宽高比。
     * @param AspectRatio 视频编辑模板宽高比。
     */
    public void setAspectRatio(String AspectRatio) {
        this.AspectRatio = AspectRatio;
    }

    /**
     * Get 卡槽信息。 
     * @return SlotSet 卡槽信息。
     */
    public SlotInfo [] getSlotSet() {
        return this.SlotSet;
    }

    /**
     * Set 卡槽信息。
     * @param SlotSet 卡槽信息。
     */
    public void setSlotSet(SlotInfo [] SlotSet) {
        this.SlotSet = SlotSet;
    }

    /**
     * Get 模板预览视频 URL 地址 。 
     * @return PreviewVideoUrl 模板预览视频 URL 地址 。
     */
    public String getPreviewVideoUrl() {
        return this.PreviewVideoUrl;
    }

    /**
     * Set 模板预览视频 URL 地址 。
     * @param PreviewVideoUrl 模板预览视频 URL 地址 。
     */
    public void setPreviewVideoUrl(String PreviewVideoUrl) {
        this.PreviewVideoUrl = PreviewVideoUrl;
    }

    public VideoEditTemplateMaterial() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VideoEditTemplateMaterial(VideoEditTemplateMaterial source) {
        if (source.AspectRatio != null) {
            this.AspectRatio = new String(source.AspectRatio);
        }
        if (source.SlotSet != null) {
            this.SlotSet = new SlotInfo[source.SlotSet.length];
            for (int i = 0; i < source.SlotSet.length; i++) {
                this.SlotSet[i] = new SlotInfo(source.SlotSet[i]);
            }
        }
        if (source.PreviewVideoUrl != null) {
            this.PreviewVideoUrl = new String(source.PreviewVideoUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AspectRatio", this.AspectRatio);
        this.setParamArrayObj(map, prefix + "SlotSet.", this.SlotSet);
        this.setParamSimple(map, prefix + "PreviewVideoUrl", this.PreviewVideoUrl);

    }
}

