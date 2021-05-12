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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GatewayVo extends AbstractModel{

    /**
    * 网关部署组ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GatewayDeployGroupId")
    @Expose
    private String GatewayDeployGroupId;

    /**
    * 网关部署组名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GatewayDeployGroupName")
    @Expose
    private String GatewayDeployGroupName;

    /**
    * API 分组个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupNum")
    @Expose
    private Long GroupNum;

    /**
    * API 分组列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Groups")
    @Expose
    private GatewayApiGroupVo [] Groups;

    /**
     * Get 网关部署组ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GatewayDeployGroupId 网关部署组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGatewayDeployGroupId() {
        return this.GatewayDeployGroupId;
    }

    /**
     * Set 网关部署组ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param GatewayDeployGroupId 网关部署组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGatewayDeployGroupId(String GatewayDeployGroupId) {
        this.GatewayDeployGroupId = GatewayDeployGroupId;
    }

    /**
     * Get 网关部署组名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GatewayDeployGroupName 网关部署组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGatewayDeployGroupName() {
        return this.GatewayDeployGroupName;
    }

    /**
     * Set 网关部署组名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param GatewayDeployGroupName 网关部署组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGatewayDeployGroupName(String GatewayDeployGroupName) {
        this.GatewayDeployGroupName = GatewayDeployGroupName;
    }

    /**
     * Get API 分组个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupNum API 分组个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getGroupNum() {
        return this.GroupNum;
    }

    /**
     * Set API 分组个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupNum API 分组个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupNum(Long GroupNum) {
        this.GroupNum = GroupNum;
    }

    /**
     * Get API 分组列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Groups API 分组列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public GatewayApiGroupVo [] getGroups() {
        return this.Groups;
    }

    /**
     * Set API 分组列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Groups API 分组列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroups(GatewayApiGroupVo [] Groups) {
        this.Groups = Groups;
    }

    public GatewayVo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GatewayVo(GatewayVo source) {
        if (source.GatewayDeployGroupId != null) {
            this.GatewayDeployGroupId = new String(source.GatewayDeployGroupId);
        }
        if (source.GatewayDeployGroupName != null) {
            this.GatewayDeployGroupName = new String(source.GatewayDeployGroupName);
        }
        if (source.GroupNum != null) {
            this.GroupNum = new Long(source.GroupNum);
        }
        if (source.Groups != null) {
            this.Groups = new GatewayApiGroupVo[source.Groups.length];
            for (int i = 0; i < source.Groups.length; i++) {
                this.Groups[i] = new GatewayApiGroupVo(source.Groups[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayDeployGroupId", this.GatewayDeployGroupId);
        this.setParamSimple(map, prefix + "GatewayDeployGroupName", this.GatewayDeployGroupName);
        this.setParamSimple(map, prefix + "GroupNum", this.GroupNum);
        this.setParamArrayObj(map, prefix + "Groups.", this.Groups);

    }
}

