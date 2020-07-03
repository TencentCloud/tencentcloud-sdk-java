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
package com.tencentcloudapi.ticm.v20181127.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VideoModerationRequest extends AbstractModel{

    /**
    * 需要审核的视频的URL地址
    */
    @SerializedName("VideoUrl")
    @Expose
    private String VideoUrl;

    /**
    * 开发者标识
    */
    @SerializedName("DeveloperId")
    @Expose
    private String DeveloperId;

    /**
    * 审核完成后回调地址
    */
    @SerializedName("CBUrl")
    @Expose
    private String CBUrl;

    /**
    * 透传字段，透传简单信息。
    */
    @SerializedName("Extra")
    @Expose
    private String Extra;

    /**
     * Get 需要审核的视频的URL地址 
     * @return VideoUrl 需要审核的视频的URL地址
     */
    public String getVideoUrl() {
        return this.VideoUrl;
    }

    /**
     * Set 需要审核的视频的URL地址
     * @param VideoUrl 需要审核的视频的URL地址
     */
    public void setVideoUrl(String VideoUrl) {
        this.VideoUrl = VideoUrl;
    }

    /**
     * Get 开发者标识 
     * @return DeveloperId 开发者标识
     */
    public String getDeveloperId() {
        return this.DeveloperId;
    }

    /**
     * Set 开发者标识
     * @param DeveloperId 开发者标识
     */
    public void setDeveloperId(String DeveloperId) {
        this.DeveloperId = DeveloperId;
    }

    /**
     * Get 审核完成后回调地址 
     * @return CBUrl 审核完成后回调地址
     */
    public String getCBUrl() {
        return this.CBUrl;
    }

    /**
     * Set 审核完成后回调地址
     * @param CBUrl 审核完成后回调地址
     */
    public void setCBUrl(String CBUrl) {
        this.CBUrl = CBUrl;
    }

    /**
     * Get 透传字段，透传简单信息。 
     * @return Extra 透传字段，透传简单信息。
     */
    public String getExtra() {
        return this.Extra;
    }

    /**
     * Set 透传字段，透传简单信息。
     * @param Extra 透传字段，透传简单信息。
     */
    public void setExtra(String Extra) {
        this.Extra = Extra;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VideoUrl", this.VideoUrl);
        this.setParamSimple(map, prefix + "DeveloperId", this.DeveloperId);
        this.setParamSimple(map, prefix + "CBUrl", this.CBUrl);
        this.setParamSimple(map, prefix + "Extra", this.Extra);

    }
}

