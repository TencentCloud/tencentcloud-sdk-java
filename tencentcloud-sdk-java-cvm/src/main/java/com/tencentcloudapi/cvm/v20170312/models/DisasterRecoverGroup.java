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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DisasterRecoverGroup extends AbstractModel{

    /**
    * 分散置放群组id。
    */
    @SerializedName("DisasterRecoverGroupId")
    @Expose
    private String DisasterRecoverGroupId;

    /**
    * 分散置放群组名称，长度1-60个字符。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 分散置放群组类型，取值范围：<br><li>HOST：物理机<br><li>SW：交换机<br><li>RACK：机架
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 分散置放群组内最大容纳云服务器数量。
    */
    @SerializedName("CvmQuotaTotal")
    @Expose
    private Long CvmQuotaTotal;

    /**
    * 分散置放群组内云服务器当前数量。
    */
    @SerializedName("CurrentNum")
    @Expose
    private Long CurrentNum;

    /**
    * 分散置放群组内，云服务器id列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 分散置放群组创建时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get 分散置放群组id。 
     * @return DisasterRecoverGroupId 分散置放群组id。
     */
    public String getDisasterRecoverGroupId() {
        return this.DisasterRecoverGroupId;
    }

    /**
     * Set 分散置放群组id。
     * @param DisasterRecoverGroupId 分散置放群组id。
     */
    public void setDisasterRecoverGroupId(String DisasterRecoverGroupId) {
        this.DisasterRecoverGroupId = DisasterRecoverGroupId;
    }

    /**
     * Get 分散置放群组名称，长度1-60个字符。 
     * @return Name 分散置放群组名称，长度1-60个字符。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 分散置放群组名称，长度1-60个字符。
     * @param Name 分散置放群组名称，长度1-60个字符。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 分散置放群组类型，取值范围：<br><li>HOST：物理机<br><li>SW：交换机<br><li>RACK：机架 
     * @return Type 分散置放群组类型，取值范围：<br><li>HOST：物理机<br><li>SW：交换机<br><li>RACK：机架
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 分散置放群组类型，取值范围：<br><li>HOST：物理机<br><li>SW：交换机<br><li>RACK：机架
     * @param Type 分散置放群组类型，取值范围：<br><li>HOST：物理机<br><li>SW：交换机<br><li>RACK：机架
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 分散置放群组内最大容纳云服务器数量。 
     * @return CvmQuotaTotal 分散置放群组内最大容纳云服务器数量。
     */
    public Long getCvmQuotaTotal() {
        return this.CvmQuotaTotal;
    }

    /**
     * Set 分散置放群组内最大容纳云服务器数量。
     * @param CvmQuotaTotal 分散置放群组内最大容纳云服务器数量。
     */
    public void setCvmQuotaTotal(Long CvmQuotaTotal) {
        this.CvmQuotaTotal = CvmQuotaTotal;
    }

    /**
     * Get 分散置放群组内云服务器当前数量。 
     * @return CurrentNum 分散置放群组内云服务器当前数量。
     */
    public Long getCurrentNum() {
        return this.CurrentNum;
    }

    /**
     * Set 分散置放群组内云服务器当前数量。
     * @param CurrentNum 分散置放群组内云服务器当前数量。
     */
    public void setCurrentNum(Long CurrentNum) {
        this.CurrentNum = CurrentNum;
    }

    /**
     * Get 分散置放群组内，云服务器id列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceIds 分散置放群组内，云服务器id列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 分散置放群组内，云服务器id列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceIds 分散置放群组内，云服务器id列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 分散置放群组创建时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 分散置放群组创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 分散置放群组创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 分散置放群组创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DisasterRecoverGroupId", this.DisasterRecoverGroupId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "CvmQuotaTotal", this.CvmQuotaTotal);
        this.setParamSimple(map, prefix + "CurrentNum", this.CurrentNum);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

