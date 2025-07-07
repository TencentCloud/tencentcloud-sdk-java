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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeWorkSpacesResponse extends AbstractModel {

    /**
    * 空间详情列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkSpaceSetItem")
    @Expose
    private WorkSpaceSetItem [] WorkSpaceSetItem;

    /**
    * 空间总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 空间详情列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkSpaceSetItem 空间详情列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WorkSpaceSetItem [] getWorkSpaceSetItem() {
        return this.WorkSpaceSetItem;
    }

    /**
     * Set 空间详情列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkSpaceSetItem 空间详情列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkSpaceSetItem(WorkSpaceSetItem [] WorkSpaceSetItem) {
        this.WorkSpaceSetItem = WorkSpaceSetItem;
    }

    /**
     * Get 空间总数 
     * @return TotalCount 空间总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 空间总数
     * @param TotalCount 空间总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
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

    public DescribeWorkSpacesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeWorkSpacesResponse(DescribeWorkSpacesResponse source) {
        if (source.WorkSpaceSetItem != null) {
            this.WorkSpaceSetItem = new WorkSpaceSetItem[source.WorkSpaceSetItem.length];
            for (int i = 0; i < source.WorkSpaceSetItem.length; i++) {
                this.WorkSpaceSetItem[i] = new WorkSpaceSetItem(source.WorkSpaceSetItem[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "WorkSpaceSetItem.", this.WorkSpaceSetItem);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

