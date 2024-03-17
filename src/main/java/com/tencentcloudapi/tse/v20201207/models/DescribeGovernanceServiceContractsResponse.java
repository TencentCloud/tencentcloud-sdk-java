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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeGovernanceServiceContractsResponse extends AbstractModel {

    /**
    * 总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 返回条数
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * 契约定义列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceContracts")
    @Expose
    private GovernanceServiceContract [] ServiceContracts;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 总数 
     * @return TotalCount 总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总数
     * @param TotalCount 总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 返回条数 
     * @return Size 返回条数
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 返回条数
     * @param Size 返回条数
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get 契约定义列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceContracts 契约定义列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public GovernanceServiceContract [] getServiceContracts() {
        return this.ServiceContracts;
    }

    /**
     * Set 契约定义列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceContracts 契约定义列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceContracts(GovernanceServiceContract [] ServiceContracts) {
        this.ServiceContracts = ServiceContracts;
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

    public DescribeGovernanceServiceContractsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGovernanceServiceContractsResponse(DescribeGovernanceServiceContractsResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.ServiceContracts != null) {
            this.ServiceContracts = new GovernanceServiceContract[source.ServiceContracts.length];
            for (int i = 0; i < source.ServiceContracts.length; i++) {
                this.ServiceContracts[i] = new GovernanceServiceContract(source.ServiceContracts[i]);
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamArrayObj(map, prefix + "ServiceContracts.", this.ServiceContracts);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

