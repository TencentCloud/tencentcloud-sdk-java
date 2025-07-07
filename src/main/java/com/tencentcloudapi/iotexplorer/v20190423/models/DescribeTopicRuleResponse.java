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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTopicRuleResponse extends AbstractModel {

    /**
    * 规则描述。
    */
    @SerializedName("Rule")
    @Expose
    private TopicRule Rule;

    /**
    * 规则绑定的标签
    */
    @SerializedName("CamTag")
    @Expose
    private CamTag [] CamTag;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 规则描述。 
     * @return Rule 规则描述。
     */
    public TopicRule getRule() {
        return this.Rule;
    }

    /**
     * Set 规则描述。
     * @param Rule 规则描述。
     */
    public void setRule(TopicRule Rule) {
        this.Rule = Rule;
    }

    /**
     * Get 规则绑定的标签 
     * @return CamTag 规则绑定的标签
     */
    public CamTag [] getCamTag() {
        return this.CamTag;
    }

    /**
     * Set 规则绑定的标签
     * @param CamTag 规则绑定的标签
     */
    public void setCamTag(CamTag [] CamTag) {
        this.CamTag = CamTag;
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

    public DescribeTopicRuleResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTopicRuleResponse(DescribeTopicRuleResponse source) {
        if (source.Rule != null) {
            this.Rule = new TopicRule(source.Rule);
        }
        if (source.CamTag != null) {
            this.CamTag = new CamTag[source.CamTag.length];
            for (int i = 0; i < source.CamTag.length; i++) {
                this.CamTag[i] = new CamTag(source.CamTag[i]);
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
        this.setParamObj(map, prefix + "Rule.", this.Rule);
        this.setParamArrayObj(map, prefix + "CamTag.", this.CamTag);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

