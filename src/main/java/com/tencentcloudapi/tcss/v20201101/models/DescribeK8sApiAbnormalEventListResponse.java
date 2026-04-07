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

public class DescribeK8sApiAbnormalEventListResponse extends AbstractModel {

    /**
    * <p>事件列表</p>
    */
    @SerializedName("List")
    @Expose
    private K8sApiAbnormalEventListItem [] List;

    /**
    * <p>总数量</p>
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * <p>k8s告警类型和对应中文翻译</p>
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
     * Get <p>事件列表</p> 
     * @return List <p>事件列表</p>
     */
    public K8sApiAbnormalEventListItem [] getList() {
        return this.List;
    }

    /**
     * Set <p>事件列表</p>
     * @param List <p>事件列表</p>
     */
    public void setList(K8sApiAbnormalEventListItem [] List) {
        this.List = List;
    }

    /**
     * Get <p>总数量</p> 
     * @return TotalCount <p>总数量</p>
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>总数量</p>
     * @param TotalCount <p>总数量</p>
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get <p>k8s告警类型和对应中文翻译</p> 
     * @return RuleTypeZhSet <p>k8s告警类型和对应中文翻译</p>
     */
    public K8SAPIRuleTypeZhItem [] getRuleTypeZhSet() {
        return this.RuleTypeZhSet;
    }

    /**
     * Set <p>k8s告警类型和对应中文翻译</p>
     * @param RuleTypeZhSet <p>k8s告警类型和对应中文翻译</p>
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

    public DescribeK8sApiAbnormalEventListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeK8sApiAbnormalEventListResponse(DescribeK8sApiAbnormalEventListResponse source) {
        if (source.List != null) {
            this.List = new K8sApiAbnormalEventListItem[source.List.length];
            for (int i = 0; i < source.List.length; i++) {
                this.List[i] = new K8sApiAbnormalEventListItem(source.List[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "RuleTypeZhSet.", this.RuleTypeZhSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

