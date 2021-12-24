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
package com.tencentcloudapi.iecp.v20210914.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NodeGroupInfo extends AbstractModel{

    /**
    * 描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * NodeGroup名称
    */
    @SerializedName("NodeGroupName")
    @Expose
    private String NodeGroupName;

    /**
    * DeploymentGrid数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeploymentGridList")
    @Expose
    private GridDetail [] DeploymentGridList;

    /**
    * StatefulSetGrid数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StatefulSetGridList")
    @Expose
    private GridDetail [] StatefulSetGridList;

    /**
    * 是否平台保护
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Protect")
    @Expose
    private Boolean Protect;

    /**
     * Get 描述 
     * @return Description 描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
     * @param Description 描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get NodeGroup名称 
     * @return NodeGroupName NodeGroup名称
     */
    public String getNodeGroupName() {
        return this.NodeGroupName;
    }

    /**
     * Set NodeGroup名称
     * @param NodeGroupName NodeGroup名称
     */
    public void setNodeGroupName(String NodeGroupName) {
        this.NodeGroupName = NodeGroupName;
    }

    /**
     * Get DeploymentGrid数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeploymentGridList DeploymentGrid数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public GridDetail [] getDeploymentGridList() {
        return this.DeploymentGridList;
    }

    /**
     * Set DeploymentGrid数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeploymentGridList DeploymentGrid数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeploymentGridList(GridDetail [] DeploymentGridList) {
        this.DeploymentGridList = DeploymentGridList;
    }

    /**
     * Get StatefulSetGrid数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StatefulSetGridList StatefulSetGrid数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public GridDetail [] getStatefulSetGridList() {
        return this.StatefulSetGridList;
    }

    /**
     * Set StatefulSetGrid数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param StatefulSetGridList StatefulSetGrid数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatefulSetGridList(GridDetail [] StatefulSetGridList) {
        this.StatefulSetGridList = StatefulSetGridList;
    }

    /**
     * Get 是否平台保护
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Protect 是否平台保护
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getProtect() {
        return this.Protect;
    }

    /**
     * Set 是否平台保护
注意：此字段可能返回 null，表示取不到有效值。
     * @param Protect 是否平台保护
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProtect(Boolean Protect) {
        this.Protect = Protect;
    }

    public NodeGroupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NodeGroupInfo(NodeGroupInfo source) {
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.NodeGroupName != null) {
            this.NodeGroupName = new String(source.NodeGroupName);
        }
        if (source.DeploymentGridList != null) {
            this.DeploymentGridList = new GridDetail[source.DeploymentGridList.length];
            for (int i = 0; i < source.DeploymentGridList.length; i++) {
                this.DeploymentGridList[i] = new GridDetail(source.DeploymentGridList[i]);
            }
        }
        if (source.StatefulSetGridList != null) {
            this.StatefulSetGridList = new GridDetail[source.StatefulSetGridList.length];
            for (int i = 0; i < source.StatefulSetGridList.length; i++) {
                this.StatefulSetGridList[i] = new GridDetail(source.StatefulSetGridList[i]);
            }
        }
        if (source.Protect != null) {
            this.Protect = new Boolean(source.Protect);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "NodeGroupName", this.NodeGroupName);
        this.setParamArrayObj(map, prefix + "DeploymentGridList.", this.DeploymentGridList);
        this.setParamArrayObj(map, prefix + "StatefulSetGridList.", this.StatefulSetGridList);
        this.setParamSimple(map, prefix + "Protect", this.Protect);

    }
}

