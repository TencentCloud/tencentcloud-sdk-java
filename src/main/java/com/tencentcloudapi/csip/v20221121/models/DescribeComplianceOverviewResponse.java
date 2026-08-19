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

public class DescribeComplianceOverviewResponse extends AbstractModel {

    /**
    * <p>检查类型和检查项分布</p>
    */
    @SerializedName("AllCheckItems")
    @Expose
    private ComplianceCheckItemsOverview AllCheckItems;

    /**
    * <p>规范和检查项分布</p>
    */
    @SerializedName("Standards")
    @Expose
    private ComplianceStandardOverview [] Standards;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>检查类型和检查项分布</p> 
     * @return AllCheckItems <p>检查类型和检查项分布</p>
     */
    public ComplianceCheckItemsOverview getAllCheckItems() {
        return this.AllCheckItems;
    }

    /**
     * Set <p>检查类型和检查项分布</p>
     * @param AllCheckItems <p>检查类型和检查项分布</p>
     */
    public void setAllCheckItems(ComplianceCheckItemsOverview AllCheckItems) {
        this.AllCheckItems = AllCheckItems;
    }

    /**
     * Get <p>规范和检查项分布</p> 
     * @return Standards <p>规范和检查项分布</p>
     */
    public ComplianceStandardOverview [] getStandards() {
        return this.Standards;
    }

    /**
     * Set <p>规范和检查项分布</p>
     * @param Standards <p>规范和检查项分布</p>
     */
    public void setStandards(ComplianceStandardOverview [] Standards) {
        this.Standards = Standards;
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

    public DescribeComplianceOverviewResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeComplianceOverviewResponse(DescribeComplianceOverviewResponse source) {
        if (source.AllCheckItems != null) {
            this.AllCheckItems = new ComplianceCheckItemsOverview(source.AllCheckItems);
        }
        if (source.Standards != null) {
            this.Standards = new ComplianceStandardOverview[source.Standards.length];
            for (int i = 0; i < source.Standards.length; i++) {
                this.Standards[i] = new ComplianceStandardOverview(source.Standards[i]);
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
        this.setParamObj(map, prefix + "AllCheckItems.", this.AllCheckItems);
        this.setParamArrayObj(map, prefix + "Standards.", this.Standards);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

