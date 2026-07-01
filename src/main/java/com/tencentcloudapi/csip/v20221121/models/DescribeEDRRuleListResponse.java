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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEDRRuleListResponse extends AbstractModel {

    /**
    * <p>总数</p>
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * <p>列表</p>
    */
    @SerializedName("List")
    @Expose
    private EDRRule [] List;

    /**
    * <p>攻击阶段对应的策略数量</p>
    */
    @SerializedName("AttackStageCounts")
    @Expose
    private AttackStageCount [] AttackStageCounts;

    /**
    * <p>检测方式对应的策略数量</p>
    */
    @SerializedName("DetectTypeCounts")
    @Expose
    private DetectTypeCount [] DetectTypeCounts;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>总数</p> 
     * @return TotalCount <p>总数</p>
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>总数</p>
     * @param TotalCount <p>总数</p>
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get <p>列表</p> 
     * @return List <p>列表</p>
     */
    public EDRRule [] getList() {
        return this.List;
    }

    /**
     * Set <p>列表</p>
     * @param List <p>列表</p>
     */
    public void setList(EDRRule [] List) {
        this.List = List;
    }

    /**
     * Get <p>攻击阶段对应的策略数量</p> 
     * @return AttackStageCounts <p>攻击阶段对应的策略数量</p>
     */
    public AttackStageCount [] getAttackStageCounts() {
        return this.AttackStageCounts;
    }

    /**
     * Set <p>攻击阶段对应的策略数量</p>
     * @param AttackStageCounts <p>攻击阶段对应的策略数量</p>
     */
    public void setAttackStageCounts(AttackStageCount [] AttackStageCounts) {
        this.AttackStageCounts = AttackStageCounts;
    }

    /**
     * Get <p>检测方式对应的策略数量</p> 
     * @return DetectTypeCounts <p>检测方式对应的策略数量</p>
     */
    public DetectTypeCount [] getDetectTypeCounts() {
        return this.DetectTypeCounts;
    }

    /**
     * Set <p>检测方式对应的策略数量</p>
     * @param DetectTypeCounts <p>检测方式对应的策略数量</p>
     */
    public void setDetectTypeCounts(DetectTypeCount [] DetectTypeCounts) {
        this.DetectTypeCounts = DetectTypeCounts;
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

    public DescribeEDRRuleListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEDRRuleListResponse(DescribeEDRRuleListResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.List != null) {
            this.List = new EDRRule[source.List.length];
            for (int i = 0; i < source.List.length; i++) {
                this.List[i] = new EDRRule(source.List[i]);
            }
        }
        if (source.AttackStageCounts != null) {
            this.AttackStageCounts = new AttackStageCount[source.AttackStageCounts.length];
            for (int i = 0; i < source.AttackStageCounts.length; i++) {
                this.AttackStageCounts[i] = new AttackStageCount(source.AttackStageCounts[i]);
            }
        }
        if (source.DetectTypeCounts != null) {
            this.DetectTypeCounts = new DetectTypeCount[source.DetectTypeCounts.length];
            for (int i = 0; i < source.DetectTypeCounts.length; i++) {
                this.DetectTypeCounts[i] = new DetectTypeCount(source.DetectTypeCounts[i]);
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "List.", this.List);
        this.setParamArrayObj(map, prefix + "AttackStageCounts.", this.AttackStageCounts);
        this.setParamArrayObj(map, prefix + "DetectTypeCounts.", this.DetectTypeCounts);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

