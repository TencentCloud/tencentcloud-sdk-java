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
package com.tencentcloudapi.tdmysql.v20211122.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDBInstanceResponse extends AbstractModel {

    /**
    * <p>异步任务ID，DryRun=false时返回。根据此ID可以调用查询任务接口获取任务状态</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FlowId")
    @Expose
    private Long FlowId;

    /**
    * <p>订单号，预付费场景下返回</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DealName")
    @Expose
    private String DealName;

    /**
    * <p>是否原地变配，DryRun=true时返回</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsInPlaceModification")
    @Expose
    private Boolean IsInPlaceModification;

    /**
    * <p>是否迁移变配，DryRun=true时返回</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsMigrateModification")
    @Expose
    private Boolean IsMigrateModification;

    /**
    * <p>变配计划描述，DryRun=true时返回，描述将执行的变配子流程编排</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModifyPlan")
    @Expose
    private String ModifyPlan;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>异步任务ID，DryRun=false时返回。根据此ID可以调用查询任务接口获取任务状态</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FlowId <p>异步任务ID，DryRun=false时返回。根据此ID可以调用查询任务接口获取任务状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFlowId() {
        return this.FlowId;
    }

    /**
     * Set <p>异步任务ID，DryRun=false时返回。根据此ID可以调用查询任务接口获取任务状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FlowId <p>异步任务ID，DryRun=false时返回。根据此ID可以调用查询任务接口获取任务状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFlowId(Long FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get <p>订单号，预付费场景下返回</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DealName <p>订单号，预付费场景下返回</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDealName() {
        return this.DealName;
    }

    /**
     * Set <p>订单号，预付费场景下返回</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DealName <p>订单号，预付费场景下返回</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDealName(String DealName) {
        this.DealName = DealName;
    }

    /**
     * Get <p>是否原地变配，DryRun=true时返回</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsInPlaceModification <p>是否原地变配，DryRun=true时返回</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsInPlaceModification() {
        return this.IsInPlaceModification;
    }

    /**
     * Set <p>是否原地变配，DryRun=true时返回</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsInPlaceModification <p>是否原地变配，DryRun=true时返回</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsInPlaceModification(Boolean IsInPlaceModification) {
        this.IsInPlaceModification = IsInPlaceModification;
    }

    /**
     * Get <p>是否迁移变配，DryRun=true时返回</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsMigrateModification <p>是否迁移变配，DryRun=true时返回</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsMigrateModification() {
        return this.IsMigrateModification;
    }

    /**
     * Set <p>是否迁移变配，DryRun=true时返回</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsMigrateModification <p>是否迁移变配，DryRun=true时返回</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsMigrateModification(Boolean IsMigrateModification) {
        this.IsMigrateModification = IsMigrateModification;
    }

    /**
     * Get <p>变配计划描述，DryRun=true时返回，描述将执行的变配子流程编排</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifyPlan <p>变配计划描述，DryRun=true时返回，描述将执行的变配子流程编排</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModifyPlan() {
        return this.ModifyPlan;
    }

    /**
     * Set <p>变配计划描述，DryRun=true时返回，描述将执行的变配子流程编排</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifyPlan <p>变配计划描述，DryRun=true时返回，描述将执行的变配子流程编排</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifyPlan(String ModifyPlan) {
        this.ModifyPlan = ModifyPlan;
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

    public ModifyDBInstanceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDBInstanceResponse(ModifyDBInstanceResponse source) {
        if (source.FlowId != null) {
            this.FlowId = new Long(source.FlowId);
        }
        if (source.DealName != null) {
            this.DealName = new String(source.DealName);
        }
        if (source.IsInPlaceModification != null) {
            this.IsInPlaceModification = new Boolean(source.IsInPlaceModification);
        }
        if (source.IsMigrateModification != null) {
            this.IsMigrateModification = new Boolean(source.IsMigrateModification);
        }
        if (source.ModifyPlan != null) {
            this.ModifyPlan = new String(source.ModifyPlan);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamSimple(map, prefix + "DealName", this.DealName);
        this.setParamSimple(map, prefix + "IsInPlaceModification", this.IsInPlaceModification);
        this.setParamSimple(map, prefix + "IsMigrateModification", this.IsMigrateModification);
        this.setParamSimple(map, prefix + "ModifyPlan", this.ModifyPlan);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

