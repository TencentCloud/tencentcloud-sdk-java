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

public class DescribeEdrAlertCountForContainerResponse extends AbstractModel {

    /**
    * <p>全局模式返回（两个 ID 数组都为空时）；分组模式为 null</p>
    */
    @SerializedName("GlobalCount")
    @Expose
    private EdrContainerGlobalCount GlobalCount;

    /**
    * <p>分组模式返回（ContainerIds 或 ClusterIds 非空时）；空返回 []</p>
    */
    @SerializedName("Items")
    @Expose
    private EdrContainerAlertCountItem [] Items;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>全局模式返回（两个 ID 数组都为空时）；分组模式为 null</p> 
     * @return GlobalCount <p>全局模式返回（两个 ID 数组都为空时）；分组模式为 null</p>
     */
    public EdrContainerGlobalCount getGlobalCount() {
        return this.GlobalCount;
    }

    /**
     * Set <p>全局模式返回（两个 ID 数组都为空时）；分组模式为 null</p>
     * @param GlobalCount <p>全局模式返回（两个 ID 数组都为空时）；分组模式为 null</p>
     */
    public void setGlobalCount(EdrContainerGlobalCount GlobalCount) {
        this.GlobalCount = GlobalCount;
    }

    /**
     * Get <p>分组模式返回（ContainerIds 或 ClusterIds 非空时）；空返回 []</p> 
     * @return Items <p>分组模式返回（ContainerIds 或 ClusterIds 非空时）；空返回 []</p>
     */
    public EdrContainerAlertCountItem [] getItems() {
        return this.Items;
    }

    /**
     * Set <p>分组模式返回（ContainerIds 或 ClusterIds 非空时）；空返回 []</p>
     * @param Items <p>分组模式返回（ContainerIds 或 ClusterIds 非空时）；空返回 []</p>
     */
    public void setItems(EdrContainerAlertCountItem [] Items) {
        this.Items = Items;
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

    public DescribeEdrAlertCountForContainerResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEdrAlertCountForContainerResponse(DescribeEdrAlertCountForContainerResponse source) {
        if (source.GlobalCount != null) {
            this.GlobalCount = new EdrContainerGlobalCount(source.GlobalCount);
        }
        if (source.Items != null) {
            this.Items = new EdrContainerAlertCountItem[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new EdrContainerAlertCountItem(source.Items[i]);
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
        this.setParamObj(map, prefix + "GlobalCount.", this.GlobalCount);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

