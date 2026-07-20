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

public class DescribeCfwStatusMonitorResponse extends AbstractModel {

    /**
    * 查询结果。UTF-8 JSON object 字符串；调用方需解析 Response.Data。describe_scene 的 scene 返回 metric_options、perspective_options、default_metric、default_perspective、selection_required_by_metric、selection_kind_by_metric 和 time_preset_options；selection.available_options 返回可用于 SelectionId/SelectionName/SelectionInstanceId 的选项。fetch_scene 返回选中场景的 data 快照，可能包含 overview、table 或 detail。下方示例是字段结构节选，数组仅展示代表值。
    */
    @SerializedName("Data")
    @Expose
    private String Data;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 查询结果。UTF-8 JSON object 字符串；调用方需解析 Response.Data。describe_scene 的 scene 返回 metric_options、perspective_options、default_metric、default_perspective、selection_required_by_metric、selection_kind_by_metric 和 time_preset_options；selection.available_options 返回可用于 SelectionId/SelectionName/SelectionInstanceId 的选项。fetch_scene 返回选中场景的 data 快照，可能包含 overview、table 或 detail。下方示例是字段结构节选，数组仅展示代表值。 
     * @return Data 查询结果。UTF-8 JSON object 字符串；调用方需解析 Response.Data。describe_scene 的 scene 返回 metric_options、perspective_options、default_metric、default_perspective、selection_required_by_metric、selection_kind_by_metric 和 time_preset_options；selection.available_options 返回可用于 SelectionId/SelectionName/SelectionInstanceId 的选项。fetch_scene 返回选中场景的 data 快照，可能包含 overview、table 或 detail。下方示例是字段结构节选，数组仅展示代表值。
     */
    public String getData() {
        return this.Data;
    }

    /**
     * Set 查询结果。UTF-8 JSON object 字符串；调用方需解析 Response.Data。describe_scene 的 scene 返回 metric_options、perspective_options、default_metric、default_perspective、selection_required_by_metric、selection_kind_by_metric 和 time_preset_options；selection.available_options 返回可用于 SelectionId/SelectionName/SelectionInstanceId 的选项。fetch_scene 返回选中场景的 data 快照，可能包含 overview、table 或 detail。下方示例是字段结构节选，数组仅展示代表值。
     * @param Data 查询结果。UTF-8 JSON object 字符串；调用方需解析 Response.Data。describe_scene 的 scene 返回 metric_options、perspective_options、default_metric、default_perspective、selection_required_by_metric、selection_kind_by_metric 和 time_preset_options；selection.available_options 返回可用于 SelectionId/SelectionName/SelectionInstanceId 的选项。fetch_scene 返回选中场景的 data 快照，可能包含 overview、table 或 detail。下方示例是字段结构节选，数组仅展示代表值。
     */
    public void setData(String Data) {
        this.Data = Data;
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

    public DescribeCfwStatusMonitorResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCfwStatusMonitorResponse(DescribeCfwStatusMonitorResponse source) {
        if (source.Data != null) {
            this.Data = new String(source.Data);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Data", this.Data);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

