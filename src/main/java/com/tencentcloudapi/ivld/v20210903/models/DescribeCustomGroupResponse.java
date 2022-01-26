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
package com.tencentcloudapi.ivld.v20210903.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCustomGroupResponse extends AbstractModel{

    /**
    * 自定义人物库所包含的人物个数
    */
    @SerializedName("GroupSize")
    @Expose
    private Long GroupSize;

    /**
    * 自定义人物库图片后续所在的存储桶
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 自定义人物库所包含的人物个数 
     * @return GroupSize 自定义人物库所包含的人物个数
     */
    public Long getGroupSize() {
        return this.GroupSize;
    }

    /**
     * Set 自定义人物库所包含的人物个数
     * @param GroupSize 自定义人物库所包含的人物个数
     */
    public void setGroupSize(Long GroupSize) {
        this.GroupSize = GroupSize;
    }

    /**
     * Get 自定义人物库图片后续所在的存储桶 
     * @return Bucket 自定义人物库图片后续所在的存储桶
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set 自定义人物库图片后续所在的存储桶
     * @param Bucket 自定义人物库图片后续所在的存储桶
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
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

    public DescribeCustomGroupResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCustomGroupResponse(DescribeCustomGroupResponse source) {
        if (source.GroupSize != null) {
            this.GroupSize = new Long(source.GroupSize);
        }
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupSize", this.GroupSize);
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

