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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeResourcePoolPacksResponse extends AbstractModel {

    /**
    * 符合条件的实例资源池列表。
    */
    @SerializedName("DedicatedResourcePackSet")
    @Expose
    private ResourcePoolPack [] DedicatedResourcePackSet;

    /**
    * 下一页数据的标记，用于分页查询。值为空时表示已到最后一页。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NextToken")
    @Expose
    private String NextToken;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 符合条件的实例资源池列表。 
     * @return DedicatedResourcePackSet 符合条件的实例资源池列表。
     */
    public ResourcePoolPack [] getDedicatedResourcePackSet() {
        return this.DedicatedResourcePackSet;
    }

    /**
     * Set 符合条件的实例资源池列表。
     * @param DedicatedResourcePackSet 符合条件的实例资源池列表。
     */
    public void setDedicatedResourcePackSet(ResourcePoolPack [] DedicatedResourcePackSet) {
        this.DedicatedResourcePackSet = DedicatedResourcePackSet;
    }

    /**
     * Get 下一页数据的标记，用于分页查询。值为空时表示已到最后一页。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NextToken 下一页数据的标记，用于分页查询。值为空时表示已到最后一页。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNextToken() {
        return this.NextToken;
    }

    /**
     * Set 下一页数据的标记，用于分页查询。值为空时表示已到最后一页。
注意：此字段可能返回 null，表示取不到有效值。
     * @param NextToken 下一页数据的标记，用于分页查询。值为空时表示已到最后一页。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNextToken(String NextToken) {
        this.NextToken = NextToken;
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

    public DescribeResourcePoolPacksResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeResourcePoolPacksResponse(DescribeResourcePoolPacksResponse source) {
        if (source.DedicatedResourcePackSet != null) {
            this.DedicatedResourcePackSet = new ResourcePoolPack[source.DedicatedResourcePackSet.length];
            for (int i = 0; i < source.DedicatedResourcePackSet.length; i++) {
                this.DedicatedResourcePackSet[i] = new ResourcePoolPack(source.DedicatedResourcePackSet[i]);
            }
        }
        if (source.NextToken != null) {
            this.NextToken = new String(source.NextToken);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "DedicatedResourcePackSet.", this.DedicatedResourcePackSet);
        this.setParamSimple(map, prefix + "NextToken", this.NextToken);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

