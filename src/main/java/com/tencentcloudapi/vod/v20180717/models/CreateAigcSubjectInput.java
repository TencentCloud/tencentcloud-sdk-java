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

public class CreateAigcSubjectInput extends AbstractModel {

    /**
    * <p>主体名称。</p>
    */
    @SerializedName("SubjectName")
    @Expose
    private String SubjectName;

    /**
    * <p>主体图片。</p>
    */
    @SerializedName("SubjectImages")
    @Expose
    private String [] SubjectImages;

    /**
    * <p>主体视频。</p>
    */
    @SerializedName("SubjectVideos")
    @Expose
    private String [] SubjectVideos;

    /**
    * <p>主体音色ID。</p>
    */
    @SerializedName("VoiceId")
    @Expose
    private String VoiceId;

    /**
     * Get <p>主体名称。</p> 
     * @return SubjectName <p>主体名称。</p>
     */
    public String getSubjectName() {
        return this.SubjectName;
    }

    /**
     * Set <p>主体名称。</p>
     * @param SubjectName <p>主体名称。</p>
     */
    public void setSubjectName(String SubjectName) {
        this.SubjectName = SubjectName;
    }

    /**
     * Get <p>主体图片。</p> 
     * @return SubjectImages <p>主体图片。</p>
     */
    public String [] getSubjectImages() {
        return this.SubjectImages;
    }

    /**
     * Set <p>主体图片。</p>
     * @param SubjectImages <p>主体图片。</p>
     */
    public void setSubjectImages(String [] SubjectImages) {
        this.SubjectImages = SubjectImages;
    }

    /**
     * Get <p>主体视频。</p> 
     * @return SubjectVideos <p>主体视频。</p>
     */
    public String [] getSubjectVideos() {
        return this.SubjectVideos;
    }

    /**
     * Set <p>主体视频。</p>
     * @param SubjectVideos <p>主体视频。</p>
     */
    public void setSubjectVideos(String [] SubjectVideos) {
        this.SubjectVideos = SubjectVideos;
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

    public CreateAigcSubjectInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAigcSubjectInput(CreateAigcSubjectInput source) {
        if (source.SubjectName != null) {
            this.SubjectName = new String(source.SubjectName);
        }
        if (source.SubjectImages != null) {
            this.SubjectImages = new String[source.SubjectImages.length];
            for (int i = 0; i < source.SubjectImages.length; i++) {
                this.SubjectImages[i] = new String(source.SubjectImages[i]);
            }
        }
        if (source.SubjectVideos != null) {
            this.SubjectVideos = new String[source.SubjectVideos.length];
            for (int i = 0; i < source.SubjectVideos.length; i++) {
                this.SubjectVideos[i] = new String(source.SubjectVideos[i]);
            }
        }
        if (source.VoiceId != null) {
            this.VoiceId = new String(source.VoiceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubjectName", this.SubjectName);
        this.setParamArraySimple(map, prefix + "SubjectImages.", this.SubjectImages);
        this.setParamArraySimple(map, prefix + "SubjectVideos.", this.SubjectVideos);
        this.setParamSimple(map, prefix + "VoiceId", this.VoiceId);

    }
}

