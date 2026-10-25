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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTDEMEventRankResponse extends AbstractModel {

    /**
    * <p>排行行</p>
    */
    @SerializedName("Items")
    @Expose
    private EventRankItem [] Items;

    /**
    * <p>仅 Kind=exception_dimension 返回。Rows 为完整维度行及固定分类向量；空数据返回 Rows=[]。父行 TotalCount 等于 IncludedInTotal=true 的主项 Count 之和，包含项仅展示且不重复计总。所有计数为0至9007199254740991的整数。旧 Kind 继续使用 Items。</p>
    */
    @SerializedName("ExceptionDistribution")
    @Expose
    private ExceptionDistribution ExceptionDistribution;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>排行行</p> 
     * @return Items <p>排行行</p>
     */
    public EventRankItem [] getItems() {
        return this.Items;
    }

    /**
     * Set <p>排行行</p>
     * @param Items <p>排行行</p>
     */
    public void setItems(EventRankItem [] Items) {
        this.Items = Items;
    }

    /**
     * Get <p>仅 Kind=exception_dimension 返回。Rows 为完整维度行及固定分类向量；空数据返回 Rows=[]。父行 TotalCount 等于 IncludedInTotal=true 的主项 Count 之和，包含项仅展示且不重复计总。所有计数为0至9007199254740991的整数。旧 Kind 继续使用 Items。</p> 
     * @return ExceptionDistribution <p>仅 Kind=exception_dimension 返回。Rows 为完整维度行及固定分类向量；空数据返回 Rows=[]。父行 TotalCount 等于 IncludedInTotal=true 的主项 Count 之和，包含项仅展示且不重复计总。所有计数为0至9007199254740991的整数。旧 Kind 继续使用 Items。</p>
     */
    public ExceptionDistribution getExceptionDistribution() {
        return this.ExceptionDistribution;
    }

    /**
     * Set <p>仅 Kind=exception_dimension 返回。Rows 为完整维度行及固定分类向量；空数据返回 Rows=[]。父行 TotalCount 等于 IncludedInTotal=true 的主项 Count 之和，包含项仅展示且不重复计总。所有计数为0至9007199254740991的整数。旧 Kind 继续使用 Items。</p>
     * @param ExceptionDistribution <p>仅 Kind=exception_dimension 返回。Rows 为完整维度行及固定分类向量；空数据返回 Rows=[]。父行 TotalCount 等于 IncludedInTotal=true 的主项 Count 之和，包含项仅展示且不重复计总。所有计数为0至9007199254740991的整数。旧 Kind 继续使用 Items。</p>
     */
    public void setExceptionDistribution(ExceptionDistribution ExceptionDistribution) {
        this.ExceptionDistribution = ExceptionDistribution;
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

    public DescribeTDEMEventRankResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTDEMEventRankResponse(DescribeTDEMEventRankResponse source) {
        if (source.Items != null) {
            this.Items = new EventRankItem[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new EventRankItem(source.Items[i]);
            }
        }
        if (source.ExceptionDistribution != null) {
            this.ExceptionDistribution = new ExceptionDistribution(source.ExceptionDistribution);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Items.", this.Items);
        this.setParamObj(map, prefix + "ExceptionDistribution.", this.ExceptionDistribution);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

