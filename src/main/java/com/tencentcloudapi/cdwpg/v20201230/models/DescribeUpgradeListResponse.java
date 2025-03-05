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
package com.tencentcloudapi.cdwpg.v20201230.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUpgradeListResponse extends AbstractModel {

    /**
    * 升级记录具体数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpgradeItems")
    @Expose
    private UpgradeItem [] UpgradeItems;

    /**
    * 升级记录总数
    */
    @SerializedName("TotalCount")
    @Expose
    private String TotalCount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 升级记录具体数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpgradeItems 升级记录具体数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public UpgradeItem [] getUpgradeItems() {
        return this.UpgradeItems;
    }

    /**
     * Set 升级记录具体数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpgradeItems 升级记录具体数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpgradeItems(UpgradeItem [] UpgradeItems) {
        this.UpgradeItems = UpgradeItems;
    }

    /**
     * Get 升级记录总数 
     * @return TotalCount 升级记录总数
     */
    public String getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 升级记录总数
     * @param TotalCount 升级记录总数
     */
    public void setTotalCount(String TotalCount) {
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

    public DescribeUpgradeListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUpgradeListResponse(DescribeUpgradeListResponse source) {
        if (source.UpgradeItems != null) {
            this.UpgradeItems = new UpgradeItem[source.UpgradeItems.length];
            for (int i = 0; i < source.UpgradeItems.length; i++) {
                this.UpgradeItems[i] = new UpgradeItem(source.UpgradeItems[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new String(source.TotalCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "UpgradeItems.", this.UpgradeItems);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

