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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBaselineSystemCategoryListResponse extends AbstractModel {

    /**
    * <p>系统父分类列表，含每个父分类下的子分类与检测项 ID 列表。</p>
    */
    @SerializedName("SystemCategoryList")
    @Expose
    private BaselineSystemCategory [] SystemCategoryList;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>系统父分类列表，含每个父分类下的子分类与检测项 ID 列表。</p> 
     * @return SystemCategoryList <p>系统父分类列表，含每个父分类下的子分类与检测项 ID 列表。</p>
     */
    public BaselineSystemCategory [] getSystemCategoryList() {
        return this.SystemCategoryList;
    }

    /**
     * Set <p>系统父分类列表，含每个父分类下的子分类与检测项 ID 列表。</p>
     * @param SystemCategoryList <p>系统父分类列表，含每个父分类下的子分类与检测项 ID 列表。</p>
     */
    public void setSystemCategoryList(BaselineSystemCategory [] SystemCategoryList) {
        this.SystemCategoryList = SystemCategoryList;
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

    public DescribeBaselineSystemCategoryListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBaselineSystemCategoryListResponse(DescribeBaselineSystemCategoryListResponse source) {
        if (source.SystemCategoryList != null) {
            this.SystemCategoryList = new BaselineSystemCategory[source.SystemCategoryList.length];
            for (int i = 0; i < source.SystemCategoryList.length; i++) {
                this.SystemCategoryList[i] = new BaselineSystemCategory(source.SystemCategoryList[i]);
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
        this.setParamArrayObj(map, prefix + "SystemCategoryList.", this.SystemCategoryList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

