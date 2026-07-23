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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckClusterNatFwPreAccessResponse extends AbstractModel {

    /**
    * <p>检查项清单，按执行顺序返回。前端据此渲染检查项骨架，描述文案已按请求的 Language 返回对应语言（中文/英文）。检查通过轮询 DescribeClusterNatCcnFwSwitchList 接口读取 CheckResult 获取每个阶段的通过/失败状态。</p>
    */
    @SerializedName("CheckItems")
    @Expose
    private ClusterFwPreAccessCheckItem [] CheckItems;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>检查项清单，按执行顺序返回。前端据此渲染检查项骨架，描述文案已按请求的 Language 返回对应语言（中文/英文）。检查通过轮询 DescribeClusterNatCcnFwSwitchList 接口读取 CheckResult 获取每个阶段的通过/失败状态。</p> 
     * @return CheckItems <p>检查项清单，按执行顺序返回。前端据此渲染检查项骨架，描述文案已按请求的 Language 返回对应语言（中文/英文）。检查通过轮询 DescribeClusterNatCcnFwSwitchList 接口读取 CheckResult 获取每个阶段的通过/失败状态。</p>
     */
    public ClusterFwPreAccessCheckItem [] getCheckItems() {
        return this.CheckItems;
    }

    /**
     * Set <p>检查项清单，按执行顺序返回。前端据此渲染检查项骨架，描述文案已按请求的 Language 返回对应语言（中文/英文）。检查通过轮询 DescribeClusterNatCcnFwSwitchList 接口读取 CheckResult 获取每个阶段的通过/失败状态。</p>
     * @param CheckItems <p>检查项清单，按执行顺序返回。前端据此渲染检查项骨架，描述文案已按请求的 Language 返回对应语言（中文/英文）。检查通过轮询 DescribeClusterNatCcnFwSwitchList 接口读取 CheckResult 获取每个阶段的通过/失败状态。</p>
     */
    public void setCheckItems(ClusterFwPreAccessCheckItem [] CheckItems) {
        this.CheckItems = CheckItems;
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

    public CheckClusterNatFwPreAccessResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckClusterNatFwPreAccessResponse(CheckClusterNatFwPreAccessResponse source) {
        if (source.CheckItems != null) {
            this.CheckItems = new ClusterFwPreAccessCheckItem[source.CheckItems.length];
            for (int i = 0; i < source.CheckItems.length; i++) {
                this.CheckItems[i] = new ClusterFwPreAccessCheckItem(source.CheckItems[i]);
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
        this.setParamArrayObj(map, prefix + "CheckItems.", this.CheckItems);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

