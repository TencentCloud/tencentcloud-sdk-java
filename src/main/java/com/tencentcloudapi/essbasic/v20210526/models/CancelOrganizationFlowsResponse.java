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

public class CancelOrganizationFlowsResponse extends AbstractModel {

    /**
    * <p>全量撤销企业合同任务编号，为32位字符串，可用于<a href="https://qian.tencent.com/developers/partnerApis/operateFlows/DescribeCancelFlowsTask">查询批量撤销合同结果</a> 或关联<a href="https://qian.tencent.com/developers/partner/callback_types_contracts_sign/#%E5%8D%81%E4%BA%8C-%E5%85%A8%E9%87%8F%E6%92%A4%E9%94%80%E7%BB%93%E6%9E%9C%E5%9B%9E%E8%B0%83">全量撤销任务结果回调</a></p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>全量撤销企业合同任务编号，为32位字符串，可用于<a href="https://qian.tencent.com/developers/partnerApis/operateFlows/DescribeCancelFlowsTask">查询批量撤销合同结果</a> 或关联<a href="https://qian.tencent.com/developers/partner/callback_types_contracts_sign/#%E5%8D%81%E4%BA%8C-%E5%85%A8%E9%87%8F%E6%92%A4%E9%94%80%E7%BB%93%E6%9E%9C%E5%9B%9E%E8%B0%83">全量撤销任务结果回调</a></p> 
     * @return TaskId <p>全量撤销企业合同任务编号，为32位字符串，可用于<a href="https://qian.tencent.com/developers/partnerApis/operateFlows/DescribeCancelFlowsTask">查询批量撤销合同结果</a> 或关联<a href="https://qian.tencent.com/developers/partner/callback_types_contracts_sign/#%E5%8D%81%E4%BA%8C-%E5%85%A8%E9%87%8F%E6%92%A4%E9%94%80%E7%BB%93%E6%9E%9C%E5%9B%9E%E8%B0%83">全量撤销任务结果回调</a></p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>全量撤销企业合同任务编号，为32位字符串，可用于<a href="https://qian.tencent.com/developers/partnerApis/operateFlows/DescribeCancelFlowsTask">查询批量撤销合同结果</a> 或关联<a href="https://qian.tencent.com/developers/partner/callback_types_contracts_sign/#%E5%8D%81%E4%BA%8C-%E5%85%A8%E9%87%8F%E6%92%A4%E9%94%80%E7%BB%93%E6%9E%9C%E5%9B%9E%E8%B0%83">全量撤销任务结果回调</a></p>
     * @param TaskId <p>全量撤销企业合同任务编号，为32位字符串，可用于<a href="https://qian.tencent.com/developers/partnerApis/operateFlows/DescribeCancelFlowsTask">查询批量撤销合同结果</a> 或关联<a href="https://qian.tencent.com/developers/partner/callback_types_contracts_sign/#%E5%8D%81%E4%BA%8C-%E5%85%A8%E9%87%8F%E6%92%A4%E9%94%80%E7%BB%93%E6%9E%9C%E5%9B%9E%E8%B0%83">全量撤销任务结果回调</a></p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
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

    public CancelOrganizationFlowsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CancelOrganizationFlowsResponse(CancelOrganizationFlowsResponse source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

