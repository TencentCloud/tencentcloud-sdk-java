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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUserFlowTypeResponse extends AbstractModel {

    /**
    * 查询到的所有用户合同类型列表
    */
    @SerializedName("AllUserFlowTypes")
    @Expose
    private TemplateUserFlowType [] AllUserFlowTypes;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 查询到的所有用户合同类型列表 
     * @return AllUserFlowTypes 查询到的所有用户合同类型列表
     */
    public TemplateUserFlowType [] getAllUserFlowTypes() {
        return this.AllUserFlowTypes;
    }

    /**
     * Set 查询到的所有用户合同类型列表
     * @param AllUserFlowTypes 查询到的所有用户合同类型列表
     */
    public void setAllUserFlowTypes(TemplateUserFlowType [] AllUserFlowTypes) {
        this.AllUserFlowTypes = AllUserFlowTypes;
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

    public DescribeUserFlowTypeResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUserFlowTypeResponse(DescribeUserFlowTypeResponse source) {
        if (source.AllUserFlowTypes != null) {
            this.AllUserFlowTypes = new TemplateUserFlowType[source.AllUserFlowTypes.length];
            for (int i = 0; i < source.AllUserFlowTypes.length; i++) {
                this.AllUserFlowTypes[i] = new TemplateUserFlowType(source.AllUserFlowTypes[i]);
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
        this.setParamArrayObj(map, prefix + "AllUserFlowTypes.", this.AllUserFlowTypes);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

