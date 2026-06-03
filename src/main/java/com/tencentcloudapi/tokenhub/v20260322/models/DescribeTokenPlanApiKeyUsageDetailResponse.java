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
package com.tencentcloudapi.tokenhub.v20260322.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTokenPlanApiKeyUsageDetailResponse extends AbstractModel {

    /**
    * 翻页上下文，传入下一次请求的 Context 参数继续翻页。
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
    * 是否已到末尾，为 true 时无需继续翻页。
    */
    @SerializedName("ListOver")
    @Expose
    private Boolean ListOver;

    /**
    * 调用明细列表。
    */
    @SerializedName("List")
    @Expose
    private UsageDetailItem [] List;

    /**
    * 	 套餐类型。取值：enterprise（企业版专业套餐）、enterprise-auto（企业版轻享套餐）
    */
    @SerializedName("ProductType")
    @Expose
    private String ProductType;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 翻页上下文，传入下一次请求的 Context 参数继续翻页。 
     * @return Context 翻页上下文，传入下一次请求的 Context 参数继续翻页。
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set 翻页上下文，传入下一次请求的 Context 参数继续翻页。
     * @param Context 翻页上下文，传入下一次请求的 Context 参数继续翻页。
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    /**
     * Get 是否已到末尾，为 true 时无需继续翻页。 
     * @return ListOver 是否已到末尾，为 true 时无需继续翻页。
     */
    public Boolean getListOver() {
        return this.ListOver;
    }

    /**
     * Set 是否已到末尾，为 true 时无需继续翻页。
     * @param ListOver 是否已到末尾，为 true 时无需继续翻页。
     */
    public void setListOver(Boolean ListOver) {
        this.ListOver = ListOver;
    }

    /**
     * Get 调用明细列表。 
     * @return List 调用明细列表。
     */
    public UsageDetailItem [] getList() {
        return this.List;
    }

    /**
     * Set 调用明细列表。
     * @param List 调用明细列表。
     */
    public void setList(UsageDetailItem [] List) {
        this.List = List;
    }

    /**
     * Get 	 套餐类型。取值：enterprise（企业版专业套餐）、enterprise-auto（企业版轻享套餐） 
     * @return ProductType 	 套餐类型。取值：enterprise（企业版专业套餐）、enterprise-auto（企业版轻享套餐）
     */
    public String getProductType() {
        return this.ProductType;
    }

    /**
     * Set 	 套餐类型。取值：enterprise（企业版专业套餐）、enterprise-auto（企业版轻享套餐）
     * @param ProductType 	 套餐类型。取值：enterprise（企业版专业套餐）、enterprise-auto（企业版轻享套餐）
     */
    public void setProductType(String ProductType) {
        this.ProductType = ProductType;
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

    public DescribeTokenPlanApiKeyUsageDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTokenPlanApiKeyUsageDetailResponse(DescribeTokenPlanApiKeyUsageDetailResponse source) {
        if (source.Context != null) {
            this.Context = new String(source.Context);
        }
        if (source.ListOver != null) {
            this.ListOver = new Boolean(source.ListOver);
        }
        if (source.List != null) {
            this.List = new UsageDetailItem[source.List.length];
            for (int i = 0; i < source.List.length; i++) {
                this.List[i] = new UsageDetailItem(source.List[i]);
            }
        }
        if (source.ProductType != null) {
            this.ProductType = new String(source.ProductType);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Context", this.Context);
        this.setParamSimple(map, prefix + "ListOver", this.ListOver);
        this.setParamArrayObj(map, prefix + "List.", this.List);
        this.setParamSimple(map, prefix + "ProductType", this.ProductType);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

