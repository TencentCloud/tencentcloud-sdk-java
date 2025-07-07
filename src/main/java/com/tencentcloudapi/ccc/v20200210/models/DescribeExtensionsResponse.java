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

public class DescribeExtensionsResponse extends AbstractModel {

    /**
    * 查询总数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 话机信息列表
    */
    @SerializedName("ExtensionList")
    @Expose
    private ExtensionInfo [] ExtensionList;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 查询总数 
     * @return Total 查询总数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 查询总数
     * @param Total 查询总数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 话机信息列表 
     * @return ExtensionList 话机信息列表
     */
    public ExtensionInfo [] getExtensionList() {
        return this.ExtensionList;
    }

    /**
     * Set 话机信息列表
     * @param ExtensionList 话机信息列表
     */
    public void setExtensionList(ExtensionInfo [] ExtensionList) {
        this.ExtensionList = ExtensionList;
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

    public DescribeExtensionsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeExtensionsResponse(DescribeExtensionsResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.ExtensionList != null) {
            this.ExtensionList = new ExtensionInfo[source.ExtensionList.length];
            for (int i = 0; i < source.ExtensionList.length; i++) {
                this.ExtensionList[i] = new ExtensionInfo(source.ExtensionList[i]);
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
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "ExtensionList.", this.ExtensionList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

