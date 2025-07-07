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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBaselineItemInfoResponse extends AbstractModel {

    /**
    * 结果列表
    */
    @SerializedName("List")
    @Expose
    private BaselineItemInfo [] List;

    /**
    * 总条目数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 基线分类列表
    */
    @SerializedName("CategoryList")
    @Expose
    private BaselineItemsCategory [] CategoryList;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 结果列表 
     * @return List 结果列表
     */
    public BaselineItemInfo [] getList() {
        return this.List;
    }

    /**
     * Set 结果列表
     * @param List 结果列表
     */
    public void setList(BaselineItemInfo [] List) {
        this.List = List;
    }

    /**
     * Get 总条目数 
     * @return Total 总条目数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 总条目数
     * @param Total 总条目数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 基线分类列表 
     * @return CategoryList 基线分类列表
     */
    public BaselineItemsCategory [] getCategoryList() {
        return this.CategoryList;
    }

    /**
     * Set 基线分类列表
     * @param CategoryList 基线分类列表
     */
    public void setCategoryList(BaselineItemsCategory [] CategoryList) {
        this.CategoryList = CategoryList;
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

    public DescribeBaselineItemInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBaselineItemInfoResponse(DescribeBaselineItemInfoResponse source) {
        if (source.List != null) {
            this.List = new BaselineItemInfo[source.List.length];
            for (int i = 0; i < source.List.length; i++) {
                this.List[i] = new BaselineItemInfo(source.List[i]);
            }
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.CategoryList != null) {
            this.CategoryList = new BaselineItemsCategory[source.CategoryList.length];
            for (int i = 0; i < source.CategoryList.length; i++) {
                this.CategoryList[i] = new BaselineItemsCategory(source.CategoryList[i]);
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
        this.setParamArrayObj(map, prefix + "List.", this.List);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "CategoryList.", this.CategoryList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

