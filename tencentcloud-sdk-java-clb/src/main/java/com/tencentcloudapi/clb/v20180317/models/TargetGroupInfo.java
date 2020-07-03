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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TargetGroupInfo extends AbstractModel{

    /**
    * 目标组ID
    */
    @SerializedName("TargetGroupId")
    @Expose
    private String TargetGroupId;

    /**
    * 目标组的vpcid
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 目标组的名字
    */
    @SerializedName("TargetGroupName")
    @Expose
    private String TargetGroupName;

    /**
    * 目标组的默认端口
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 目标组的创建时间
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 目标组的修改时间
    */
    @SerializedName("UpdatedTime")
    @Expose
    private String UpdatedTime;

    /**
    * 关联到的规则数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssociatedRule")
    @Expose
    private AssociationItem [] AssociatedRule;

    /**
     * Get 目标组ID 
     * @return TargetGroupId 目标组ID
     */
    public String getTargetGroupId() {
        return this.TargetGroupId;
    }

    /**
     * Set 目标组ID
     * @param TargetGroupId 目标组ID
     */
    public void setTargetGroupId(String TargetGroupId) {
        this.TargetGroupId = TargetGroupId;
    }

    /**
     * Get 目标组的vpcid 
     * @return VpcId 目标组的vpcid
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 目标组的vpcid
     * @param VpcId 目标组的vpcid
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 目标组的名字 
     * @return TargetGroupName 目标组的名字
     */
    public String getTargetGroupName() {
        return this.TargetGroupName;
    }

    /**
     * Set 目标组的名字
     * @param TargetGroupName 目标组的名字
     */
    public void setTargetGroupName(String TargetGroupName) {
        this.TargetGroupName = TargetGroupName;
    }

    /**
     * Get 目标组的默认端口
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Port 目标组的默认端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 目标组的默认端口
注意：此字段可能返回 null，表示取不到有效值。
     * @param Port 目标组的默认端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 目标组的创建时间 
     * @return CreatedTime 目标组的创建时间
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 目标组的创建时间
     * @param CreatedTime 目标组的创建时间
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 目标组的修改时间 
     * @return UpdatedTime 目标组的修改时间
     */
    public String getUpdatedTime() {
        return this.UpdatedTime;
    }

    /**
     * Set 目标组的修改时间
     * @param UpdatedTime 目标组的修改时间
     */
    public void setUpdatedTime(String UpdatedTime) {
        this.UpdatedTime = UpdatedTime;
    }

    /**
     * Get 关联到的规则数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssociatedRule 关联到的规则数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AssociationItem [] getAssociatedRule() {
        return this.AssociatedRule;
    }

    /**
     * Set 关联到的规则数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssociatedRule 关联到的规则数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssociatedRule(AssociationItem [] AssociatedRule) {
        this.AssociatedRule = AssociatedRule;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TargetGroupId", this.TargetGroupId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "TargetGroupName", this.TargetGroupName);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "UpdatedTime", this.UpdatedTime);
        this.setParamArrayObj(map, prefix + "AssociatedRule.", this.AssociatedRule);

    }
}

