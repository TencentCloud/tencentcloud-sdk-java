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

public class ReviewImageResponse extends AbstractModel{

    /**
    * 图片审核任务结果。
<font color=red>注意：该字段已废弃，建议使用 MediaReviewResult。</font> 
    */
    @SerializedName("ReviewResultSet")
    @Expose
    private ContentReviewResult [] ReviewResultSet;

    /**
    * 图片审核任务结果。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MediaReviewResult")
    @Expose
    private ReviewImageResult MediaReviewResult;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 图片审核任务结果。
<font color=red>注意：该字段已废弃，建议使用 MediaReviewResult。</font>  
     * @return ReviewResultSet 图片审核任务结果。
<font color=red>注意：该字段已废弃，建议使用 MediaReviewResult。</font> 
     */
    public ContentReviewResult [] getReviewResultSet() {
        return this.ReviewResultSet;
    }

    /**
     * Set 图片审核任务结果。
<font color=red>注意：该字段已废弃，建议使用 MediaReviewResult。</font> 
     * @param ReviewResultSet 图片审核任务结果。
<font color=red>注意：该字段已废弃，建议使用 MediaReviewResult。</font> 
     */
    public void setReviewResultSet(ContentReviewResult [] ReviewResultSet) {
        this.ReviewResultSet = ReviewResultSet;
    }

    /**
     * Get 图片审核任务结果。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MediaReviewResult 图片审核任务结果。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ReviewImageResult getMediaReviewResult() {
        return this.MediaReviewResult;
    }

    /**
     * Set 图片审核任务结果。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MediaReviewResult 图片审核任务结果。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMediaReviewResult(ReviewImageResult MediaReviewResult) {
        this.MediaReviewResult = MediaReviewResult;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public ReviewImageResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReviewImageResponse(ReviewImageResponse source) {
        if (source.ReviewResultSet != null) {
            this.ReviewResultSet = new ContentReviewResult[source.ReviewResultSet.length];
            for (int i = 0; i < source.ReviewResultSet.length; i++) {
                this.ReviewResultSet[i] = new ContentReviewResult(source.ReviewResultSet[i]);
            }
        }
        if (source.MediaReviewResult != null) {
            this.MediaReviewResult = new ReviewImageResult(source.MediaReviewResult);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ReviewResultSet.", this.ReviewResultSet);
        this.setParamObj(map, prefix + "MediaReviewResult.", this.MediaReviewResult);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

