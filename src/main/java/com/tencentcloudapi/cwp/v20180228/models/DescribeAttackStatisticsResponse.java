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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAttackStatisticsResponse extends AbstractModel {

    /**
    * 总攻击次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PendingAttackCount")
    @Expose
    private Long PendingAttackCount;

    /**
    * 总尝试攻击次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PendingTryAttackCount")
    @Expose
    private Long PendingTryAttackCount;

    /**
    * 总攻击成功次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PendingSuccAttackCount")
    @Expose
    private Long PendingSuccAttackCount;

    /**
    * 今日新增攻击次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PendingNewAttackCount")
    @Expose
    private Long PendingNewAttackCount;

    /**
    * 总受攻击资产数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AttackedAssetCount")
    @Expose
    private Long AttackedAssetCount;

    /**
    * 今日新增受攻击资产数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NewAttackedAssetCount")
    @Expose
    private Long NewAttackedAssetCount;

    /**
    * 总受攻击端口数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AttackedPortCount")
    @Expose
    private Long AttackedPortCount;

    /**
    * 今日新增受攻击端口数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NewAttackedPortCount")
    @Expose
    private Long NewAttackedPortCount;

    /**
    * 总攻击来源ip数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AttackSrcIpCount")
    @Expose
    private Long AttackSrcIpCount;

    /**
    * 今日新增攻击来源ip数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NewAttackSrcIpCount")
    @Expose
    private Long NewAttackSrcIpCount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 总攻击次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PendingAttackCount 总攻击次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPendingAttackCount() {
        return this.PendingAttackCount;
    }

    /**
     * Set 总攻击次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param PendingAttackCount 总攻击次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPendingAttackCount(Long PendingAttackCount) {
        this.PendingAttackCount = PendingAttackCount;
    }

    /**
     * Get 总尝试攻击次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PendingTryAttackCount 总尝试攻击次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPendingTryAttackCount() {
        return this.PendingTryAttackCount;
    }

    /**
     * Set 总尝试攻击次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param PendingTryAttackCount 总尝试攻击次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPendingTryAttackCount(Long PendingTryAttackCount) {
        this.PendingTryAttackCount = PendingTryAttackCount;
    }

    /**
     * Get 总攻击成功次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PendingSuccAttackCount 总攻击成功次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPendingSuccAttackCount() {
        return this.PendingSuccAttackCount;
    }

    /**
     * Set 总攻击成功次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param PendingSuccAttackCount 总攻击成功次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPendingSuccAttackCount(Long PendingSuccAttackCount) {
        this.PendingSuccAttackCount = PendingSuccAttackCount;
    }

    /**
     * Get 今日新增攻击次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PendingNewAttackCount 今日新增攻击次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPendingNewAttackCount() {
        return this.PendingNewAttackCount;
    }

    /**
     * Set 今日新增攻击次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param PendingNewAttackCount 今日新增攻击次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPendingNewAttackCount(Long PendingNewAttackCount) {
        this.PendingNewAttackCount = PendingNewAttackCount;
    }

    /**
     * Get 总受攻击资产数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AttackedAssetCount 总受攻击资产数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAttackedAssetCount() {
        return this.AttackedAssetCount;
    }

    /**
     * Set 总受攻击资产数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param AttackedAssetCount 总受攻击资产数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAttackedAssetCount(Long AttackedAssetCount) {
        this.AttackedAssetCount = AttackedAssetCount;
    }

    /**
     * Get 今日新增受攻击资产数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NewAttackedAssetCount 今日新增受攻击资产数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNewAttackedAssetCount() {
        return this.NewAttackedAssetCount;
    }

    /**
     * Set 今日新增受攻击资产数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param NewAttackedAssetCount 今日新增受攻击资产数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNewAttackedAssetCount(Long NewAttackedAssetCount) {
        this.NewAttackedAssetCount = NewAttackedAssetCount;
    }

    /**
     * Get 总受攻击端口数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AttackedPortCount 总受攻击端口数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAttackedPortCount() {
        return this.AttackedPortCount;
    }

    /**
     * Set 总受攻击端口数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param AttackedPortCount 总受攻击端口数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAttackedPortCount(Long AttackedPortCount) {
        this.AttackedPortCount = AttackedPortCount;
    }

    /**
     * Get 今日新增受攻击端口数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NewAttackedPortCount 今日新增受攻击端口数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNewAttackedPortCount() {
        return this.NewAttackedPortCount;
    }

    /**
     * Set 今日新增受攻击端口数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param NewAttackedPortCount 今日新增受攻击端口数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNewAttackedPortCount(Long NewAttackedPortCount) {
        this.NewAttackedPortCount = NewAttackedPortCount;
    }

    /**
     * Get 总攻击来源ip数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AttackSrcIpCount 总攻击来源ip数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAttackSrcIpCount() {
        return this.AttackSrcIpCount;
    }

    /**
     * Set 总攻击来源ip数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param AttackSrcIpCount 总攻击来源ip数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAttackSrcIpCount(Long AttackSrcIpCount) {
        this.AttackSrcIpCount = AttackSrcIpCount;
    }

    /**
     * Get 今日新增攻击来源ip数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NewAttackSrcIpCount 今日新增攻击来源ip数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNewAttackSrcIpCount() {
        return this.NewAttackSrcIpCount;
    }

    /**
     * Set 今日新增攻击来源ip数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param NewAttackSrcIpCount 今日新增攻击来源ip数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNewAttackSrcIpCount(Long NewAttackSrcIpCount) {
        this.NewAttackSrcIpCount = NewAttackSrcIpCount;
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

    public DescribeAttackStatisticsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAttackStatisticsResponse(DescribeAttackStatisticsResponse source) {
        if (source.PendingAttackCount != null) {
            this.PendingAttackCount = new Long(source.PendingAttackCount);
        }
        if (source.PendingTryAttackCount != null) {
            this.PendingTryAttackCount = new Long(source.PendingTryAttackCount);
        }
        if (source.PendingSuccAttackCount != null) {
            this.PendingSuccAttackCount = new Long(source.PendingSuccAttackCount);
        }
        if (source.PendingNewAttackCount != null) {
            this.PendingNewAttackCount = new Long(source.PendingNewAttackCount);
        }
        if (source.AttackedAssetCount != null) {
            this.AttackedAssetCount = new Long(source.AttackedAssetCount);
        }
        if (source.NewAttackedAssetCount != null) {
            this.NewAttackedAssetCount = new Long(source.NewAttackedAssetCount);
        }
        if (source.AttackedPortCount != null) {
            this.AttackedPortCount = new Long(source.AttackedPortCount);
        }
        if (source.NewAttackedPortCount != null) {
            this.NewAttackedPortCount = new Long(source.NewAttackedPortCount);
        }
        if (source.AttackSrcIpCount != null) {
            this.AttackSrcIpCount = new Long(source.AttackSrcIpCount);
        }
        if (source.NewAttackSrcIpCount != null) {
            this.NewAttackSrcIpCount = new Long(source.NewAttackSrcIpCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PendingAttackCount", this.PendingAttackCount);
        this.setParamSimple(map, prefix + "PendingTryAttackCount", this.PendingTryAttackCount);
        this.setParamSimple(map, prefix + "PendingSuccAttackCount", this.PendingSuccAttackCount);
        this.setParamSimple(map, prefix + "PendingNewAttackCount", this.PendingNewAttackCount);
        this.setParamSimple(map, prefix + "AttackedAssetCount", this.AttackedAssetCount);
        this.setParamSimple(map, prefix + "NewAttackedAssetCount", this.NewAttackedAssetCount);
        this.setParamSimple(map, prefix + "AttackedPortCount", this.AttackedPortCount);
        this.setParamSimple(map, prefix + "NewAttackedPortCount", this.NewAttackedPortCount);
        this.setParamSimple(map, prefix + "AttackSrcIpCount", this.AttackSrcIpCount);
        this.setParamSimple(map, prefix + "NewAttackSrcIpCount", this.NewAttackSrcIpCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

