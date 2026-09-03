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

public class AigcVideoReferenceSubjectInfo extends AbstractModel {

    /**
    * <p>参考主体的 ID。</p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>主体名称。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>主体音色ID。</p>
    */
    @SerializedName("VoiceId")
    @Expose
    private String VoiceId;

    /**
    * <p>主体图片列表。</p>
    */
    @SerializedName("ImageUrls")
    @Expose
    private String [] ImageUrls;

    /**
    * <p>主体视频列表。</p>
    */
    @SerializedName("VideoUrls")
    @Expose
    private String [] VideoUrls;

    /**
     * Get <p>参考主体的 ID。</p> 
     * @return Id <p>参考主体的 ID。</p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>参考主体的 ID。</p>
     * @param Id <p>参考主体的 ID。</p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>主体名称。</p> 
     * @return Name <p>主体名称。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>主体名称。</p>
     * @param Name <p>主体名称。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>主体音色ID。</p> 
     * @return VoiceId <p>主体音色ID。</p>
     */
    public String getVoiceId() {
        return this.VoiceId;
    }

    /**
     * Set <p>主体音色ID。</p>
     * @param VoiceId <p>主体音色ID。</p>
     */
    public void setVoiceId(String VoiceId) {
        this.VoiceId = VoiceId;
    }

    /**
     * Get <p>主体图片列表。</p> 
     * @return ImageUrls <p>主体图片列表。</p>
     */
    public String [] getImageUrls() {
        return this.ImageUrls;
    }

    /**
     * Set <p>主体图片列表。</p>
     * @param ImageUrls <p>主体图片列表。</p>
     */
    public void setImageUrls(String [] ImageUrls) {
        this.ImageUrls = ImageUrls;
    }

    /**
     * Get <p>主体视频列表。</p> 
     * @return VideoUrls <p>主体视频列表。</p>
     */
    public String [] getVideoUrls() {
        return this.VideoUrls;
    }

    /**
     * Set <p>主体视频列表。</p>
     * @param VideoUrls <p>主体视频列表。</p>
     */
    public void setVideoUrls(String [] VideoUrls) {
        this.VideoUrls = VideoUrls;
    }

    public AigcVideoReferenceSubjectInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AigcVideoReferenceSubjectInfo(AigcVideoReferenceSubjectInfo source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.VoiceId != null) {
            this.VoiceId = new String(source.VoiceId);
        }
        if (source.ImageUrls != null) {
            this.ImageUrls = new String[source.ImageUrls.length];
            for (int i = 0; i < source.ImageUrls.length; i++) {
                this.ImageUrls[i] = new String(source.ImageUrls[i]);
            }
        }
        if (source.VideoUrls != null) {
            this.VideoUrls = new String[source.VideoUrls.length];
            for (int i = 0; i < source.VideoUrls.length; i++) {
                this.VideoUrls[i] = new String(source.VideoUrls[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "VoiceId", this.VoiceId);
        this.setParamArraySimple(map, prefix + "ImageUrls.", this.ImageUrls);
        this.setParamArraySimple(map, prefix + "VideoUrls.", this.VideoUrls);

    }
}

