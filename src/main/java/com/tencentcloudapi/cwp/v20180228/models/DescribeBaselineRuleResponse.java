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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBaselineRuleResponse extends AbstractModel{

    /**
    * 分页查询记录总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 基线检测项列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BaselineRuleList")
    @Expose
    private BaselineRuleInfo [] BaselineRuleList;

    /**
    * 是否显示说明列：true-是，false-否
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShowRuleRemark")
    @Expose
    private Boolean ShowRuleRemark;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 分页查询记录总数 
     * @return TotalCount 分页查询记录总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 分页查询记录总数
     * @param TotalCount 分页查询记录总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 基线检测项列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BaselineRuleList 基线检测项列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BaselineRuleInfo [] getBaselineRuleList() {
        return this.BaselineRuleList;
    }

    /**
     * Set 基线检测项列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param BaselineRuleList 基线检测项列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBaselineRuleList(BaselineRuleInfo [] BaselineRuleList) {
        this.BaselineRuleList = BaselineRuleList;
    }

    /**
     * Get 是否显示说明列：true-是，false-否
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShowRuleRemark 是否显示说明列：true-是，false-否
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getShowRuleRemark() {
        return this.ShowRuleRemark;
    }

    /**
     * Set 是否显示说明列：true-是，false-否
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShowRuleRemark 是否显示说明列：true-是，false-否
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShowRuleRemark(Boolean ShowRuleRemark) {
        this.ShowRuleRemark = ShowRuleRemark;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeBaselineRuleResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBaselineRuleResponse(DescribeBaselineRuleResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.BaselineRuleList != null) {
            this.BaselineRuleList = new BaselineRuleInfo[source.BaselineRuleList.length];
            for (int i = 0; i < source.BaselineRuleList.length; i++) {
                this.BaselineRuleList[i] = new BaselineRuleInfo(source.BaselineRuleList[i]);
            }
        }
        if (source.ShowRuleRemark != null) {
            this.ShowRuleRemark = new Boolean(source.ShowRuleRemark);
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
        this.setParamArrayObj(map, prefix + "BaselineRuleList.", this.BaselineRuleList);
        this.setParamSimple(map, prefix + "ShowRuleRemark", this.ShowRuleRemark);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

