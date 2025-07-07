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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLogIndexResponse extends AbstractModel {

    /**
    * 是否生效
    */
    @SerializedName("Status")
    @Expose
    private Boolean Status;

    /**
    * 索引规则
    */
    @SerializedName("Rule")
    @Expose
    private RuleInfo Rule;

    /**
    * 索引修改时间，初始值为索引创建时间
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 是否生效 
     * @return Status 是否生效
     */
    public Boolean getStatus() {
        return this.Status;
    }

    /**
     * Set 是否生效
     * @param Status 是否生效
     */
    public void setStatus(Boolean Status) {
        this.Status = Status;
    }

    /**
     * Get 索引规则 
     * @return Rule 索引规则
     */
    public RuleInfo getRule() {
        return this.Rule;
    }

    /**
     * Set 索引规则
     * @param Rule 索引规则
     */
    public void setRule(RuleInfo Rule) {
        this.Rule = Rule;
    }

    /**
     * Get 索引修改时间，初始值为索引创建时间 
     * @return ModifyTime 索引修改时间，初始值为索引创建时间
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 索引修改时间，初始值为索引创建时间
     * @param ModifyTime 索引修改时间，初始值为索引创建时间
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
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

    public DescribeLogIndexResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLogIndexResponse(DescribeLogIndexResponse source) {
        if (source.Status != null) {
            this.Status = new Boolean(source.Status);
        }
        if (source.Rule != null) {
            this.Rule = new RuleInfo(source.Rule);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamObj(map, prefix + "Rule.", this.Rule);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

