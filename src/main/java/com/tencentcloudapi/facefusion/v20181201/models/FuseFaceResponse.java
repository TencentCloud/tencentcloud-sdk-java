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
package com.tencentcloudapi.facefusion.v20181201.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FuseFaceResponse extends AbstractModel {

    /**
    * RspImgType 为 url 时，返回结果的 url， RspImgType 为 base64 时返回 base64 数据。
    */
    @SerializedName("FusedImage")
    @Expose
    private String FusedImage;

    /**
    * 不适宜内容识别结果。该数组的顺序和请求中mergeinfo的顺序一致，一一对应
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReviewResultSet")
    @Expose
    private FuseFaceReviewResult [] ReviewResultSet;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get RspImgType 为 url 时，返回结果的 url， RspImgType 为 base64 时返回 base64 数据。 
     * @return FusedImage RspImgType 为 url 时，返回结果的 url， RspImgType 为 base64 时返回 base64 数据。
     */
    public String getFusedImage() {
        return this.FusedImage;
    }

    /**
     * Set RspImgType 为 url 时，返回结果的 url， RspImgType 为 base64 时返回 base64 数据。
     * @param FusedImage RspImgType 为 url 时，返回结果的 url， RspImgType 为 base64 时返回 base64 数据。
     */
    public void setFusedImage(String FusedImage) {
        this.FusedImage = FusedImage;
    }

    /**
     * Get 不适宜内容识别结果。该数组的顺序和请求中mergeinfo的顺序一致，一一对应
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReviewResultSet 不适宜内容识别结果。该数组的顺序和请求中mergeinfo的顺序一致，一一对应
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FuseFaceReviewResult [] getReviewResultSet() {
        return this.ReviewResultSet;
    }

    /**
     * Set 不适宜内容识别结果。该数组的顺序和请求中mergeinfo的顺序一致，一一对应
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReviewResultSet 不适宜内容识别结果。该数组的顺序和请求中mergeinfo的顺序一致，一一对应
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReviewResultSet(FuseFaceReviewResult [] ReviewResultSet) {
        this.ReviewResultSet = ReviewResultSet;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public FuseFaceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FuseFaceResponse(FuseFaceResponse source) {
        if (source.FusedImage != null) {
            this.FusedImage = new String(source.FusedImage);
        }
        if (source.ReviewResultSet != null) {
            this.ReviewResultSet = new FuseFaceReviewResult[source.ReviewResultSet.length];
            for (int i = 0; i < source.ReviewResultSet.length; i++) {
                this.ReviewResultSet[i] = new FuseFaceReviewResult(source.ReviewResultSet[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FusedImage", this.FusedImage);
        this.setParamArrayObj(map, prefix + "ReviewResultSet.", this.ReviewResultSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

