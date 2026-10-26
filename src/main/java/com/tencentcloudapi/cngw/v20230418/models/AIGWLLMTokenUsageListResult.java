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
package com.tencentcloudapi.cngw.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AIGWLLMTokenUsageListResult extends AbstractModel {

    /**
    * <p>网关版本不低于 3.9.8 且 Dimension=ConsumerGroup 时，未指定节点筛选则列出 Kong CP 当前目录的全部真实节点，包含同步、自定义、禁用及保留中的软删节点，排除合成展示节点。按当前名称、节点 UUID 升序，先分页节点再查询历史指标；无调用节点仍返回，Token 与请求数补零。节点指标包含历史下属，同一请求可计入多个组行，不能逐行相加作为网关总量。</p>
    */
    @SerializedName("DataList")
    @Expose
    private AIGWLLMTokenUsageItem [] DataList;

    /**
    * <p>筛选后的结果总数。新版 ConsumerGroup 查询为候选节点总数，包含无调用节点，不受 Limit / Offset 影响。</p>
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * <p>组织归属是否不完整。网关版本不低于 3.9.8，使用 ConsumerGroup 维度或 ConsumerGroupId / ConsumerGroupName 筛选时返回，其余请求省略。true 表示时间及业务筛选范围内存在组归属未知的日志；检查不受组筛选条件遮蔽，空结果也执行检查。组范围统计仅计入可归因日志。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrgAttributionIncomplete")
    @Expose
    private Boolean OrgAttributionIncomplete;

    /**
     * Get <p>网关版本不低于 3.9.8 且 Dimension=ConsumerGroup 时，未指定节点筛选则列出 Kong CP 当前目录的全部真实节点，包含同步、自定义、禁用及保留中的软删节点，排除合成展示节点。按当前名称、节点 UUID 升序，先分页节点再查询历史指标；无调用节点仍返回，Token 与请求数补零。节点指标包含历史下属，同一请求可计入多个组行，不能逐行相加作为网关总量。</p> 
     * @return DataList <p>网关版本不低于 3.9.8 且 Dimension=ConsumerGroup 时，未指定节点筛选则列出 Kong CP 当前目录的全部真实节点，包含同步、自定义、禁用及保留中的软删节点，排除合成展示节点。按当前名称、节点 UUID 升序，先分页节点再查询历史指标；无调用节点仍返回，Token 与请求数补零。节点指标包含历史下属，同一请求可计入多个组行，不能逐行相加作为网关总量。</p>
     */
    public AIGWLLMTokenUsageItem [] getDataList() {
        return this.DataList;
    }

    /**
     * Set <p>网关版本不低于 3.9.8 且 Dimension=ConsumerGroup 时，未指定节点筛选则列出 Kong CP 当前目录的全部真实节点，包含同步、自定义、禁用及保留中的软删节点，排除合成展示节点。按当前名称、节点 UUID 升序，先分页节点再查询历史指标；无调用节点仍返回，Token 与请求数补零。节点指标包含历史下属，同一请求可计入多个组行，不能逐行相加作为网关总量。</p>
     * @param DataList <p>网关版本不低于 3.9.8 且 Dimension=ConsumerGroup 时，未指定节点筛选则列出 Kong CP 当前目录的全部真实节点，包含同步、自定义、禁用及保留中的软删节点，排除合成展示节点。按当前名称、节点 UUID 升序，先分页节点再查询历史指标；无调用节点仍返回，Token 与请求数补零。节点指标包含历史下属，同一请求可计入多个组行，不能逐行相加作为网关总量。</p>
     */
    public void setDataList(AIGWLLMTokenUsageItem [] DataList) {
        this.DataList = DataList;
    }

    /**
     * Get <p>筛选后的结果总数。新版 ConsumerGroup 查询为候选节点总数，包含无调用节点，不受 Limit / Offset 影响。</p> 
     * @return TotalCount <p>筛选后的结果总数。新版 ConsumerGroup 查询为候选节点总数，包含无调用节点，不受 Limit / Offset 影响。</p>
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>筛选后的结果总数。新版 ConsumerGroup 查询为候选节点总数，包含无调用节点，不受 Limit / Offset 影响。</p>
     * @param TotalCount <p>筛选后的结果总数。新版 ConsumerGroup 查询为候选节点总数，包含无调用节点，不受 Limit / Offset 影响。</p>
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get <p>组织归属是否不完整。网关版本不低于 3.9.8，使用 ConsumerGroup 维度或 ConsumerGroupId / ConsumerGroupName 筛选时返回，其余请求省略。true 表示时间及业务筛选范围内存在组归属未知的日志；检查不受组筛选条件遮蔽，空结果也执行检查。组范围统计仅计入可归因日志。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrgAttributionIncomplete <p>组织归属是否不完整。网关版本不低于 3.9.8，使用 ConsumerGroup 维度或 ConsumerGroupId / ConsumerGroupName 筛选时返回，其余请求省略。true 表示时间及业务筛选范围内存在组归属未知的日志；检查不受组筛选条件遮蔽，空结果也执行检查。组范围统计仅计入可归因日志。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getOrgAttributionIncomplete() {
        return this.OrgAttributionIncomplete;
    }

    /**
     * Set <p>组织归属是否不完整。网关版本不低于 3.9.8，使用 ConsumerGroup 维度或 ConsumerGroupId / ConsumerGroupName 筛选时返回，其余请求省略。true 表示时间及业务筛选范围内存在组归属未知的日志；检查不受组筛选条件遮蔽，空结果也执行检查。组范围统计仅计入可归因日志。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrgAttributionIncomplete <p>组织归属是否不完整。网关版本不低于 3.9.8，使用 ConsumerGroup 维度或 ConsumerGroupId / ConsumerGroupName 筛选时返回，其余请求省略。true 表示时间及业务筛选范围内存在组归属未知的日志；检查不受组筛选条件遮蔽，空结果也执行检查。组范围统计仅计入可归因日志。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrgAttributionIncomplete(Boolean OrgAttributionIncomplete) {
        this.OrgAttributionIncomplete = OrgAttributionIncomplete;
    }

    public AIGWLLMTokenUsageListResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIGWLLMTokenUsageListResult(AIGWLLMTokenUsageListResult source) {
        if (source.DataList != null) {
            this.DataList = new AIGWLLMTokenUsageItem[source.DataList.length];
            for (int i = 0; i < source.DataList.length; i++) {
                this.DataList[i] = new AIGWLLMTokenUsageItem(source.DataList[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.OrgAttributionIncomplete != null) {
            this.OrgAttributionIncomplete = new Boolean(source.OrgAttributionIncomplete);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "DataList.", this.DataList);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "OrgAttributionIncomplete", this.OrgAttributionIncomplete);

    }
}

