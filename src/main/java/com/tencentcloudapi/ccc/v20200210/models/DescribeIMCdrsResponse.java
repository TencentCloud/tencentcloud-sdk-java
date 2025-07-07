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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIMCdrsResponse extends AbstractModel {

    /**
    * 总记录数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 服务记录列表
    */
    @SerializedName("IMCdrs")
    @Expose
    private IMCdrInfo [] IMCdrs;

    /**
    * 服务记录列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IMCdrList")
    @Expose
    private IMCdrInfo [] IMCdrList;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 总记录数 
     * @return TotalCount 总记录数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总记录数
     * @param TotalCount 总记录数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 服务记录列表 
     * @return IMCdrs 服务记录列表
     * @deprecated
     */
    @Deprecated
    public IMCdrInfo [] getIMCdrs() {
        return this.IMCdrs;
    }

    /**
     * Set 服务记录列表
     * @param IMCdrs 服务记录列表
     * @deprecated
     */
    @Deprecated
    public void setIMCdrs(IMCdrInfo [] IMCdrs) {
        this.IMCdrs = IMCdrs;
    }

    /**
     * Get 服务记录列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IMCdrList 服务记录列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IMCdrInfo [] getIMCdrList() {
        return this.IMCdrList;
    }

    /**
     * Set 服务记录列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param IMCdrList 服务记录列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIMCdrList(IMCdrInfo [] IMCdrList) {
        this.IMCdrList = IMCdrList;
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

    public DescribeIMCdrsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIMCdrsResponse(DescribeIMCdrsResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.IMCdrs != null) {
            this.IMCdrs = new IMCdrInfo[source.IMCdrs.length];
            for (int i = 0; i < source.IMCdrs.length; i++) {
                this.IMCdrs[i] = new IMCdrInfo(source.IMCdrs[i]);
            }
        }
        if (source.IMCdrList != null) {
            this.IMCdrList = new IMCdrInfo[source.IMCdrList.length];
            for (int i = 0; i < source.IMCdrList.length; i++) {
                this.IMCdrList[i] = new IMCdrInfo(source.IMCdrList[i]);
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
        this.setParamArrayObj(map, prefix + "IMCdrs.", this.IMCdrs);
        this.setParamArrayObj(map, prefix + "IMCdrList.", this.IMCdrList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

