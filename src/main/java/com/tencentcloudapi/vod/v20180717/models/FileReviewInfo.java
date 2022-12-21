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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FileReviewInfo extends AbstractModel{

    /**
    * 媒体审核信息\*。

\* 只展示通过 [音视频审核(ReviewAudioVideo)](https://cloud.tencent.com/document/api/266/80283) 或 [图片审核(ReviewImage)](https://cloud.tencent.com/document/api/266/73217) 发起的审核结果信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MediaReviewInfo")
    @Expose
    private ReviewInfo MediaReviewInfo;

    /**
    * 媒体封面审核信息\*。

\* 只展示通过 [音视频审核(ReviewAudioVideo)](https://cloud.tencent.com/document/api/266/80283) 或 [图片审核(ReviewImage)](https://cloud.tencent.com/document/api/266/73217) 发起的审核结果信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CoverReviewInfo")
    @Expose
    private ReviewInfo CoverReviewInfo;

    /**
     * Get 媒体审核信息\*。

\* 只展示通过 [音视频审核(ReviewAudioVideo)](https://cloud.tencent.com/document/api/266/80283) 或 [图片审核(ReviewImage)](https://cloud.tencent.com/document/api/266/73217) 发起的审核结果信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MediaReviewInfo 媒体审核信息\*。

\* 只展示通过 [音视频审核(ReviewAudioVideo)](https://cloud.tencent.com/document/api/266/80283) 或 [图片审核(ReviewImage)](https://cloud.tencent.com/document/api/266/73217) 发起的审核结果信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ReviewInfo getMediaReviewInfo() {
        return this.MediaReviewInfo;
    }

    /**
     * Set 媒体审核信息\*。

\* 只展示通过 [音视频审核(ReviewAudioVideo)](https://cloud.tencent.com/document/api/266/80283) 或 [图片审核(ReviewImage)](https://cloud.tencent.com/document/api/266/73217) 发起的审核结果信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MediaReviewInfo 媒体审核信息\*。

\* 只展示通过 [音视频审核(ReviewAudioVideo)](https://cloud.tencent.com/document/api/266/80283) 或 [图片审核(ReviewImage)](https://cloud.tencent.com/document/api/266/73217) 发起的审核结果信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMediaReviewInfo(ReviewInfo MediaReviewInfo) {
        this.MediaReviewInfo = MediaReviewInfo;
    }

    /**
     * Get 媒体封面审核信息\*。

\* 只展示通过 [音视频审核(ReviewAudioVideo)](https://cloud.tencent.com/document/api/266/80283) 或 [图片审核(ReviewImage)](https://cloud.tencent.com/document/api/266/73217) 发起的审核结果信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CoverReviewInfo 媒体封面审核信息\*。

\* 只展示通过 [音视频审核(ReviewAudioVideo)](https://cloud.tencent.com/document/api/266/80283) 或 [图片审核(ReviewImage)](https://cloud.tencent.com/document/api/266/73217) 发起的审核结果信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ReviewInfo getCoverReviewInfo() {
        return this.CoverReviewInfo;
    }

    /**
     * Set 媒体封面审核信息\*。

\* 只展示通过 [音视频审核(ReviewAudioVideo)](https://cloud.tencent.com/document/api/266/80283) 或 [图片审核(ReviewImage)](https://cloud.tencent.com/document/api/266/73217) 发起的审核结果信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CoverReviewInfo 媒体封面审核信息\*。

\* 只展示通过 [音视频审核(ReviewAudioVideo)](https://cloud.tencent.com/document/api/266/80283) 或 [图片审核(ReviewImage)](https://cloud.tencent.com/document/api/266/73217) 发起的审核结果信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCoverReviewInfo(ReviewInfo CoverReviewInfo) {
        this.CoverReviewInfo = CoverReviewInfo;
    }

    public FileReviewInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FileReviewInfo(FileReviewInfo source) {
        if (source.MediaReviewInfo != null) {
            this.MediaReviewInfo = new ReviewInfo(source.MediaReviewInfo);
        }
        if (source.CoverReviewInfo != null) {
            this.CoverReviewInfo = new ReviewInfo(source.CoverReviewInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "MediaReviewInfo.", this.MediaReviewInfo);
        this.setParamObj(map, prefix + "CoverReviewInfo.", this.CoverReviewInfo);

    }
}

