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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AISearchInfo extends AbstractModel {

    /**
    * 基于搜索结果的总结
    */
    @SerializedName("Summary")
    @Expose
    private String Summary;

    /**
    * 视频结果集
    */
    @SerializedName("Targets")
    @Expose
    private TargetInfo [] Targets;

    /**
    * 视频回放URL
    */
    @SerializedName("VideoURL")
    @Expose
    private String VideoURL;

    /**
     * Get 基于搜索结果的总结 
     * @return Summary 基于搜索结果的总结
     */
    public String getSummary() {
        return this.Summary;
    }

    /**
     * Set 基于搜索结果的总结
     * @param Summary 基于搜索结果的总结
     */
    public void setSummary(String Summary) {
        this.Summary = Summary;
    }

    /**
     * Get 视频结果集 
     * @return Targets 视频结果集
     */
    public TargetInfo [] getTargets() {
        return this.Targets;
    }

    /**
     * Set 视频结果集
     * @param Targets 视频结果集
     */
    public void setTargets(TargetInfo [] Targets) {
        this.Targets = Targets;
    }

    /**
     * Get 视频回放URL 
     * @return VideoURL 视频回放URL
     */
    public String getVideoURL() {
        return this.VideoURL;
    }

    /**
     * Set 视频回放URL
     * @param VideoURL 视频回放URL
     */
    public void setVideoURL(String VideoURL) {
        this.VideoURL = VideoURL;
    }

    public AISearchInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AISearchInfo(AISearchInfo source) {
        if (source.Summary != null) {
            this.Summary = new String(source.Summary);
        }
        if (source.Targets != null) {
            this.Targets = new TargetInfo[source.Targets.length];
            for (int i = 0; i < source.Targets.length; i++) {
                this.Targets[i] = new TargetInfo(source.Targets[i]);
            }
        }
        if (source.VideoURL != null) {
            this.VideoURL = new String(source.VideoURL);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Summary", this.Summary);
        this.setParamArrayObj(map, prefix + "Targets.", this.Targets);
        this.setParamSimple(map, prefix + "VideoURL", this.VideoURL);

    }
}

