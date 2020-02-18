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
package com.tencentcloudapi.tbm.v20180129.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBrandPosCommentsResponse extends AbstractModel{

    /**
    * 评论列表
    */
    @SerializedName("BrandCommentSet")
    @Expose
    private CommentInfo [] BrandCommentSet;

    /**
    * 总的好评个数
    */
    @SerializedName("TotalComments")
    @Expose
    private Long TotalComments;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 评论列表 
     * @return BrandCommentSet 评论列表
     */
    public CommentInfo [] getBrandCommentSet() {
        return this.BrandCommentSet;
    }

    /**
     * Set 评论列表
     * @param BrandCommentSet 评论列表
     */
    public void setBrandCommentSet(CommentInfo [] BrandCommentSet) {
        this.BrandCommentSet = BrandCommentSet;
    }

    /**
     * Get 总的好评个数 
     * @return TotalComments 总的好评个数
     */
    public Long getTotalComments() {
        return this.TotalComments;
    }

    /**
     * Set 总的好评个数
     * @param TotalComments 总的好评个数
     */
    public void setTotalComments(Long TotalComments) {
        this.TotalComments = TotalComments;
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
        this.setParamArrayObj(map, prefix + "BrandCommentSet.", this.BrandCommentSet);
        this.setParamSimple(map, prefix + "TotalComments", this.TotalComments);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

