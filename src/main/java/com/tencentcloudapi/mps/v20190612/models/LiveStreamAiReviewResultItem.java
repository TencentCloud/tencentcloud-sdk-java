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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LiveStreamAiReviewResultItem extends AbstractModel{

    /**
    * 审核结果的类型，可以取的值有：
<li>ImagePorn：图片鉴黄</li>
<li>ImageTerrorism：图片涉敏</li>
<li>ImagePolitical：图片涉敏</li>
<li>PornVoice：声音鉴黄</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 图片鉴黄的结果，当 Type 为 ImagePorn 时有效。
    */
    @SerializedName("ImagePornResultSet")
    @Expose
    private LiveStreamAiReviewImagePornResult [] ImagePornResultSet;

    /**
    * 图片涉敏的结果，当 Type 为 ImageTerrorism 时有效。
    */
    @SerializedName("ImageTerrorismResultSet")
    @Expose
    private LiveStreamAiReviewImageTerrorismResult [] ImageTerrorismResultSet;

    /**
    * 图片涉敏的结果，当 Type 为 ImagePolitical 时有效。
    */
    @SerializedName("ImagePoliticalResultSet")
    @Expose
    private LiveStreamAiReviewImagePoliticalResult [] ImagePoliticalResultSet;

    /**
    * 声音鉴黄的结果，当 Type 为 PornVoice 时有效。
    */
    @SerializedName("VoicePornResultSet")
    @Expose
    private LiveStreamAiReviewVoicePornResult [] VoicePornResultSet;

    /**
     * Get 审核结果的类型，可以取的值有：
<li>ImagePorn：图片鉴黄</li>
<li>ImageTerrorism：图片涉敏</li>
<li>ImagePolitical：图片涉敏</li>
<li>PornVoice：声音鉴黄</li> 
     * @return Type 审核结果的类型，可以取的值有：
<li>ImagePorn：图片鉴黄</li>
<li>ImageTerrorism：图片涉敏</li>
<li>ImagePolitical：图片涉敏</li>
<li>PornVoice：声音鉴黄</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 审核结果的类型，可以取的值有：
<li>ImagePorn：图片鉴黄</li>
<li>ImageTerrorism：图片涉敏</li>
<li>ImagePolitical：图片涉敏</li>
<li>PornVoice：声音鉴黄</li>
     * @param Type 审核结果的类型，可以取的值有：
<li>ImagePorn：图片鉴黄</li>
<li>ImageTerrorism：图片涉敏</li>
<li>ImagePolitical：图片涉敏</li>
<li>PornVoice：声音鉴黄</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 图片鉴黄的结果，当 Type 为 ImagePorn 时有效。 
     * @return ImagePornResultSet 图片鉴黄的结果，当 Type 为 ImagePorn 时有效。
     */
    public LiveStreamAiReviewImagePornResult [] getImagePornResultSet() {
        return this.ImagePornResultSet;
    }

    /**
     * Set 图片鉴黄的结果，当 Type 为 ImagePorn 时有效。
     * @param ImagePornResultSet 图片鉴黄的结果，当 Type 为 ImagePorn 时有效。
     */
    public void setImagePornResultSet(LiveStreamAiReviewImagePornResult [] ImagePornResultSet) {
        this.ImagePornResultSet = ImagePornResultSet;
    }

    /**
     * Get 图片涉敏的结果，当 Type 为 ImageTerrorism 时有效。 
     * @return ImageTerrorismResultSet 图片涉敏的结果，当 Type 为 ImageTerrorism 时有效。
     */
    public LiveStreamAiReviewImageTerrorismResult [] getImageTerrorismResultSet() {
        return this.ImageTerrorismResultSet;
    }

    /**
     * Set 图片涉敏的结果，当 Type 为 ImageTerrorism 时有效。
     * @param ImageTerrorismResultSet 图片涉敏的结果，当 Type 为 ImageTerrorism 时有效。
     */
    public void setImageTerrorismResultSet(LiveStreamAiReviewImageTerrorismResult [] ImageTerrorismResultSet) {
        this.ImageTerrorismResultSet = ImageTerrorismResultSet;
    }

    /**
     * Get 图片涉敏的结果，当 Type 为 ImagePolitical 时有效。 
     * @return ImagePoliticalResultSet 图片涉敏的结果，当 Type 为 ImagePolitical 时有效。
     */
    public LiveStreamAiReviewImagePoliticalResult [] getImagePoliticalResultSet() {
        return this.ImagePoliticalResultSet;
    }

    /**
     * Set 图片涉敏的结果，当 Type 为 ImagePolitical 时有效。
     * @param ImagePoliticalResultSet 图片涉敏的结果，当 Type 为 ImagePolitical 时有效。
     */
    public void setImagePoliticalResultSet(LiveStreamAiReviewImagePoliticalResult [] ImagePoliticalResultSet) {
        this.ImagePoliticalResultSet = ImagePoliticalResultSet;
    }

    /**
     * Get 声音鉴黄的结果，当 Type 为 PornVoice 时有效。 
     * @return VoicePornResultSet 声音鉴黄的结果，当 Type 为 PornVoice 时有效。
     */
    public LiveStreamAiReviewVoicePornResult [] getVoicePornResultSet() {
        return this.VoicePornResultSet;
    }

    /**
     * Set 声音鉴黄的结果，当 Type 为 PornVoice 时有效。
     * @param VoicePornResultSet 声音鉴黄的结果，当 Type 为 PornVoice 时有效。
     */
    public void setVoicePornResultSet(LiveStreamAiReviewVoicePornResult [] VoicePornResultSet) {
        this.VoicePornResultSet = VoicePornResultSet;
    }

    public LiveStreamAiReviewResultItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LiveStreamAiReviewResultItem(LiveStreamAiReviewResultItem source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ImagePornResultSet != null) {
            this.ImagePornResultSet = new LiveStreamAiReviewImagePornResult[source.ImagePornResultSet.length];
            for (int i = 0; i < source.ImagePornResultSet.length; i++) {
                this.ImagePornResultSet[i] = new LiveStreamAiReviewImagePornResult(source.ImagePornResultSet[i]);
            }
        }
        if (source.ImageTerrorismResultSet != null) {
            this.ImageTerrorismResultSet = new LiveStreamAiReviewImageTerrorismResult[source.ImageTerrorismResultSet.length];
            for (int i = 0; i < source.ImageTerrorismResultSet.length; i++) {
                this.ImageTerrorismResultSet[i] = new LiveStreamAiReviewImageTerrorismResult(source.ImageTerrorismResultSet[i]);
            }
        }
        if (source.ImagePoliticalResultSet != null) {
            this.ImagePoliticalResultSet = new LiveStreamAiReviewImagePoliticalResult[source.ImagePoliticalResultSet.length];
            for (int i = 0; i < source.ImagePoliticalResultSet.length; i++) {
                this.ImagePoliticalResultSet[i] = new LiveStreamAiReviewImagePoliticalResult(source.ImagePoliticalResultSet[i]);
            }
        }
        if (source.VoicePornResultSet != null) {
            this.VoicePornResultSet = new LiveStreamAiReviewVoicePornResult[source.VoicePornResultSet.length];
            for (int i = 0; i < source.VoicePornResultSet.length; i++) {
                this.VoicePornResultSet[i] = new LiveStreamAiReviewVoicePornResult(source.VoicePornResultSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "ImagePornResultSet.", this.ImagePornResultSet);
        this.setParamArrayObj(map, prefix + "ImageTerrorismResultSet.", this.ImageTerrorismResultSet);
        this.setParamArrayObj(map, prefix + "ImagePoliticalResultSet.", this.ImagePoliticalResultSet);
        this.setParamArrayObj(map, prefix + "VoicePornResultSet.", this.VoicePornResultSet);

    }
}

