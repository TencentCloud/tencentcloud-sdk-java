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
package com.tencentcloudapi.workbuddyenterprise.v20260709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSkillListResponse extends AbstractModel {

    /**
    * 符合条件的技能总数（按 ID 批量时为实际命中数）
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 技能列表（仅列表展示所需字段，完整信息走 DescribeSkill）
    */
    @SerializedName("SkillSet")
    @Expose
    private SkillItem [] SkillSet;

    /**
    * 全局计数（不受 keyword 影响）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Counts")
    @Expose
    private SkillCounts Counts;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 符合条件的技能总数（按 ID 批量时为实际命中数） 
     * @return TotalCount 符合条件的技能总数（按 ID 批量时为实际命中数）
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 符合条件的技能总数（按 ID 批量时为实际命中数）
     * @param TotalCount 符合条件的技能总数（按 ID 批量时为实际命中数）
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 技能列表（仅列表展示所需字段，完整信息走 DescribeSkill） 
     * @return SkillSet 技能列表（仅列表展示所需字段，完整信息走 DescribeSkill）
     */
    public SkillItem [] getSkillSet() {
        return this.SkillSet;
    }

    /**
     * Set 技能列表（仅列表展示所需字段，完整信息走 DescribeSkill）
     * @param SkillSet 技能列表（仅列表展示所需字段，完整信息走 DescribeSkill）
     */
    public void setSkillSet(SkillItem [] SkillSet) {
        this.SkillSet = SkillSet;
    }

    /**
     * Get 全局计数（不受 keyword 影响）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Counts 全局计数（不受 keyword 影响）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SkillCounts getCounts() {
        return this.Counts;
    }

    /**
     * Set 全局计数（不受 keyword 影响）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Counts 全局计数（不受 keyword 影响）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCounts(SkillCounts Counts) {
        this.Counts = Counts;
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

    public DescribeSkillListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSkillListResponse(DescribeSkillListResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.SkillSet != null) {
            this.SkillSet = new SkillItem[source.SkillSet.length];
            for (int i = 0; i < source.SkillSet.length; i++) {
                this.SkillSet[i] = new SkillItem(source.SkillSet[i]);
            }
        }
        if (source.Counts != null) {
            this.Counts = new SkillCounts(source.Counts);
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
        this.setParamArrayObj(map, prefix + "SkillSet.", this.SkillSet);
        this.setParamObj(map, prefix + "Counts.", this.Counts);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

