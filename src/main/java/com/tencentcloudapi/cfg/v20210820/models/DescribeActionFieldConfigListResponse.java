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
package com.tencentcloudapi.cfg.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeActionFieldConfigListResponse extends AbstractModel {

    /**
    * 通用栏位配置列表
    */
    @SerializedName("Common")
    @Expose
    private ActionFieldConfigResult [] Common;

    /**
    * 动作栏位配置列表
    */
    @SerializedName("Results")
    @Expose
    private ActionFieldConfigResult [] Results;

    /**
    * 资源下线信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceOffline")
    @Expose
    private ResourceOffline [] ResourceOffline;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 通用栏位配置列表 
     * @return Common 通用栏位配置列表
     */
    public ActionFieldConfigResult [] getCommon() {
        return this.Common;
    }

    /**
     * Set 通用栏位配置列表
     * @param Common 通用栏位配置列表
     */
    public void setCommon(ActionFieldConfigResult [] Common) {
        this.Common = Common;
    }

    /**
     * Get 动作栏位配置列表 
     * @return Results 动作栏位配置列表
     */
    public ActionFieldConfigResult [] getResults() {
        return this.Results;
    }

    /**
     * Set 动作栏位配置列表
     * @param Results 动作栏位配置列表
     */
    public void setResults(ActionFieldConfigResult [] Results) {
        this.Results = Results;
    }

    /**
     * Get 资源下线信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceOffline 资源下线信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ResourceOffline [] getResourceOffline() {
        return this.ResourceOffline;
    }

    /**
     * Set 资源下线信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceOffline 资源下线信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceOffline(ResourceOffline [] ResourceOffline) {
        this.ResourceOffline = ResourceOffline;
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

    public DescribeActionFieldConfigListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeActionFieldConfigListResponse(DescribeActionFieldConfigListResponse source) {
        if (source.Common != null) {
            this.Common = new ActionFieldConfigResult[source.Common.length];
            for (int i = 0; i < source.Common.length; i++) {
                this.Common[i] = new ActionFieldConfigResult(source.Common[i]);
            }
        }
        if (source.Results != null) {
            this.Results = new ActionFieldConfigResult[source.Results.length];
            for (int i = 0; i < source.Results.length; i++) {
                this.Results[i] = new ActionFieldConfigResult(source.Results[i]);
            }
        }
        if (source.ResourceOffline != null) {
            this.ResourceOffline = new ResourceOffline[source.ResourceOffline.length];
            for (int i = 0; i < source.ResourceOffline.length; i++) {
                this.ResourceOffline[i] = new ResourceOffline(source.ResourceOffline[i]);
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
        this.setParamArrayObj(map, prefix + "Common.", this.Common);
        this.setParamArrayObj(map, prefix + "Results.", this.Results);
        this.setParamArrayObj(map, prefix + "ResourceOffline.", this.ResourceOffline);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

