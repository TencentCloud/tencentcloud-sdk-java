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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OperateTWeSeeDirectUploadObjectResponse extends AbstractModel {

    /**
    * 对象列举结果
    */
    @SerializedName("ListingResponse")
    @Expose
    private SeeObjectListing ListingResponse;

    /**
    * 对象元数据
    */
    @SerializedName("ObjectResponse")
    @Expose
    private SeeObjectMetadata ObjectResponse;

    /**
    * 操作结果状态码
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 对象列举结果 
     * @return ListingResponse 对象列举结果
     */
    public SeeObjectListing getListingResponse() {
        return this.ListingResponse;
    }

    /**
     * Set 对象列举结果
     * @param ListingResponse 对象列举结果
     */
    public void setListingResponse(SeeObjectListing ListingResponse) {
        this.ListingResponse = ListingResponse;
    }

    /**
     * Get 对象元数据 
     * @return ObjectResponse 对象元数据
     */
    public SeeObjectMetadata getObjectResponse() {
        return this.ObjectResponse;
    }

    /**
     * Set 对象元数据
     * @param ObjectResponse 对象元数据
     */
    public void setObjectResponse(SeeObjectMetadata ObjectResponse) {
        this.ObjectResponse = ObjectResponse;
    }

    /**
     * Get 操作结果状态码 
     * @return Status 操作结果状态码
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 操作结果状态码
     * @param Status 操作结果状态码
     */
    public void setStatus(Long Status) {
        this.Status = Status;
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

    public OperateTWeSeeDirectUploadObjectResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OperateTWeSeeDirectUploadObjectResponse(OperateTWeSeeDirectUploadObjectResponse source) {
        if (source.ListingResponse != null) {
            this.ListingResponse = new SeeObjectListing(source.ListingResponse);
        }
        if (source.ObjectResponse != null) {
            this.ObjectResponse = new SeeObjectMetadata(source.ObjectResponse);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ListingResponse.", this.ListingResponse);
        this.setParamObj(map, prefix + "ObjectResponse.", this.ObjectResponse);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

