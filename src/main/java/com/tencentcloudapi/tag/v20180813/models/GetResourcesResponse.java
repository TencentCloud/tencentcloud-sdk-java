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
package com.tencentcloudapi.tag.v20180813.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetResourcesResponse extends AbstractModel{

    /**
    * 获取的下一页的Token值
    */
    @SerializedName("PaginationToken")
    @Expose
    private String PaginationToken;

    /**
    * 资源及关联的标签(键和值)列表
    */
    @SerializedName("ResourceTagMappingList")
    @Expose
    private ResourceTagMapping [] ResourceTagMappingList;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 获取的下一页的Token值 
     * @return PaginationToken 获取的下一页的Token值
     */
    public String getPaginationToken() {
        return this.PaginationToken;
    }

    /**
     * Set 获取的下一页的Token值
     * @param PaginationToken 获取的下一页的Token值
     */
    public void setPaginationToken(String PaginationToken) {
        this.PaginationToken = PaginationToken;
    }

    /**
     * Get 资源及关联的标签(键和值)列表 
     * @return ResourceTagMappingList 资源及关联的标签(键和值)列表
     */
    public ResourceTagMapping [] getResourceTagMappingList() {
        return this.ResourceTagMappingList;
    }

    /**
     * Set 资源及关联的标签(键和值)列表
     * @param ResourceTagMappingList 资源及关联的标签(键和值)列表
     */
    public void setResourceTagMappingList(ResourceTagMapping [] ResourceTagMappingList) {
        this.ResourceTagMappingList = ResourceTagMappingList;
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

    public GetResourcesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetResourcesResponse(GetResourcesResponse source) {
        if (source.PaginationToken != null) {
            this.PaginationToken = new String(source.PaginationToken);
        }
        if (source.ResourceTagMappingList != null) {
            this.ResourceTagMappingList = new ResourceTagMapping[source.ResourceTagMappingList.length];
            for (int i = 0; i < source.ResourceTagMappingList.length; i++) {
                this.ResourceTagMappingList[i] = new ResourceTagMapping(source.ResourceTagMappingList[i]);
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
        this.setParamSimple(map, prefix + "PaginationToken", this.PaginationToken);
        this.setParamArrayObj(map, prefix + "ResourceTagMappingList.", this.ResourceTagMappingList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

