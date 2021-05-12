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
package com.tencentcloudapi.ssa.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataCheck extends AbstractModel{

    /**
    * 检查项唯一标识符uuid
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 检查项名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 检查项类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 最近一次检查时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastCheckTime")
    @Expose
    private String LastCheckTime;

    /**
    * 初始未检测状态0, 已通过为1，未通过为2
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 0-未忽略,1-已忽略
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsIgnored")
    @Expose
    private Long IsIgnored;

    /**
    * 有风险的资源总数，未通过数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskCount")
    @Expose
    private Long RiskCount;

    /**
    * 0-检测中,1-结束检测
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsChecked")
    @Expose
    private Long IsChecked;

    /**
    * 总资产数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetTotal")
    @Expose
    private Long AssetTotal;

    /**
    * 备注内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remarks")
    @Expose
    private String Remarks;

    /**
     * Get 检查项唯一标识符uuid 
     * @return Id 检查项唯一标识符uuid
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 检查项唯一标识符uuid
     * @param Id 检查项唯一标识符uuid
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 检查项名称 
     * @return Name 检查项名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 检查项名称
     * @param Name 检查项名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 检查项类型 
     * @return Type 检查项类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 检查项类型
     * @param Type 检查项类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 最近一次检查时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastCheckTime 最近一次检查时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastCheckTime() {
        return this.LastCheckTime;
    }

    /**
     * Set 最近一次检查时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastCheckTime 最近一次检查时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastCheckTime(String LastCheckTime) {
        this.LastCheckTime = LastCheckTime;
    }

    /**
     * Get 初始未检测状态0, 已通过为1，未通过为2
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 初始未检测状态0, 已通过为1，未通过为2
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 初始未检测状态0, 已通过为1，未通过为2
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 初始未检测状态0, 已通过为1，未通过为2
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 0-未忽略,1-已忽略
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsIgnored 0-未忽略,1-已忽略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsIgnored() {
        return this.IsIgnored;
    }

    /**
     * Set 0-未忽略,1-已忽略
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsIgnored 0-未忽略,1-已忽略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsIgnored(Long IsIgnored) {
        this.IsIgnored = IsIgnored;
    }

    /**
     * Get 有风险的资源总数，未通过数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiskCount 有风险的资源总数，未通过数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRiskCount() {
        return this.RiskCount;
    }

    /**
     * Set 有风险的资源总数，未通过数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiskCount 有风险的资源总数，未通过数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRiskCount(Long RiskCount) {
        this.RiskCount = RiskCount;
    }

    /**
     * Get 0-检测中,1-结束检测
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsChecked 0-检测中,1-结束检测
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsChecked() {
        return this.IsChecked;
    }

    /**
     * Set 0-检测中,1-结束检测
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsChecked 0-检测中,1-结束检测
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsChecked(Long IsChecked) {
        this.IsChecked = IsChecked;
    }

    /**
     * Get 总资产数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetTotal 总资产数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAssetTotal() {
        return this.AssetTotal;
    }

    /**
     * Set 总资产数
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetTotal 总资产数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetTotal(Long AssetTotal) {
        this.AssetTotal = AssetTotal;
    }

    /**
     * Get 备注内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remarks 备注内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemarks() {
        return this.Remarks;
    }

    /**
     * Set 备注内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remarks 备注内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemarks(String Remarks) {
        this.Remarks = Remarks;
    }

    public DataCheck() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataCheck(DataCheck source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.LastCheckTime != null) {
            this.LastCheckTime = new String(source.LastCheckTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.IsIgnored != null) {
            this.IsIgnored = new Long(source.IsIgnored);
        }
        if (source.RiskCount != null) {
            this.RiskCount = new Long(source.RiskCount);
        }
        if (source.IsChecked != null) {
            this.IsChecked = new Long(source.IsChecked);
        }
        if (source.AssetTotal != null) {
            this.AssetTotal = new Long(source.AssetTotal);
        }
        if (source.Remarks != null) {
            this.Remarks = new String(source.Remarks);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "LastCheckTime", this.LastCheckTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "IsIgnored", this.IsIgnored);
        this.setParamSimple(map, prefix + "RiskCount", this.RiskCount);
        this.setParamSimple(map, prefix + "IsChecked", this.IsChecked);
        this.setParamSimple(map, prefix + "AssetTotal", this.AssetTotal);
        this.setParamSimple(map, prefix + "Remarks", this.Remarks);

    }
}

