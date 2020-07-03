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
package com.tencentcloudapi.facefusion.v20181201.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FaceFusionResponse extends AbstractModel{

    /**
    * RspImgType 为 url 时，返回结果的 url， RspImgType 为 base64 时返回 base64 数据。
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * 鉴政结果
    */
    @SerializedName("ReviewResultSet")
    @Expose
    private FuseFaceReviewResult [] ReviewResultSet;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get RspImgType 为 url 时，返回结果的 url， RspImgType 为 base64 时返回 base64 数据。 
     * @return Image RspImgType 为 url 时，返回结果的 url， RspImgType 为 base64 时返回 base64 数据。
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set RspImgType 为 url 时，返回结果的 url， RspImgType 为 base64 时返回 base64 数据。
     * @param Image RspImgType 为 url 时，返回结果的 url， RspImgType 为 base64 时返回 base64 数据。
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * Get 鉴政结果 
     * @return ReviewResultSet 鉴政结果
     */
    public FuseFaceReviewResult [] getReviewResultSet() {
        return this.ReviewResultSet;
    }

    /**
     * Set 鉴政结果
     * @param ReviewResultSet 鉴政结果
     */
    public void setReviewResultSet(FuseFaceReviewResult [] ReviewResultSet) {
        this.ReviewResultSet = ReviewResultSet;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Image", this.Image);
        this.setParamArrayObj(map, prefix + "ReviewResultSet.", this.ReviewResultSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

