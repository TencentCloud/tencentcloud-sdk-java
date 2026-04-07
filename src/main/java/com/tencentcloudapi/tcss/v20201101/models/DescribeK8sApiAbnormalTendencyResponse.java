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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeK8sApiAbnormalTendencyResponse extends AbstractModel {

    /**
    * <p>趋势列表</p>
    */
    @SerializedName("List")
    @Expose
    private K8sApiAbnormalTendencyItem [] List;

    /**
    * <p>规则类型对应中文</p>
    */
    @SerializedName("RuleTypeZhSet")
    @Expose
    private K8SAPIRuleTypeZhItem [] RuleTypeZhSet;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>趋势列表</p> 
     * @return List <p>趋势列表</p>
     */
    public K8sApiAbnormalTendencyItem [] getList() {
        return this.List;
    }

    /**
     * Set <p>趋势列表</p>
     * @param List <p>趋势列表</p>
     */
    public void setList(K8sApiAbnormalTendencyItem [] List) {
        this.List = List;
    }

    /**
     * Get <p>规则类型对应中文</p> 
     * @return RuleTypeZhSet <p>规则类型对应中文</p>
     */
    public K8SAPIRuleTypeZhItem [] getRuleTypeZhSet() {
        return this.RuleTypeZhSet;
    }

    /**
     * Set <p>规则类型对应中文</p>
     * @param RuleTypeZhSet <p>规则类型对应中文</p>
     */
    public void setRuleTypeZhSet(K8SAPIRuleTypeZhItem [] RuleTypeZhSet) {
        this.RuleTypeZhSet = RuleTypeZhSet;
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

    public DescribeK8sApiAbnormalTendencyResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeK8sApiAbnormalTendencyResponse(DescribeK8sApiAbnormalTendencyResponse source) {
        if (source.List != null) {
            this.List = new K8sApiAbnormalTendencyItem[source.List.length];
            for (int i = 0; i < source.List.length; i++) {
                this.List[i] = new K8sApiAbnormalTendencyItem(source.List[i]);
            }
        }
        if (source.RuleTypeZhSet != null) {
            this.RuleTypeZhSet = new K8SAPIRuleTypeZhItem[source.RuleTypeZhSet.length];
            for (int i = 0; i < source.RuleTypeZhSet.length; i++) {
                this.RuleTypeZhSet[i] = new K8SAPIRuleTypeZhItem(source.RuleTypeZhSet[i]);
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
        this.setParamArrayObj(map, prefix + "List.", this.List);
        this.setParamArrayObj(map, prefix + "RuleTypeZhSet.", this.RuleTypeZhSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

