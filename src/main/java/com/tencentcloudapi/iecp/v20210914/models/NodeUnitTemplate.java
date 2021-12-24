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

public class NodeUnitTemplate extends AbstractModel{

    /**
    * NodeUnit模版ID
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * NodeUnit模版名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 命名空间
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 包含节点列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeList")
    @Expose
    private NodeSimpleInfo [] NodeList;

    /**
    * NodeGroup列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeGroups")
    @Expose
    private String [] NodeGroups;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get NodeUnit模版ID 
     * @return ID NodeUnit模版ID
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set NodeUnit模版ID
     * @param ID NodeUnit模版ID
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get NodeUnit模版名称 
     * @return Name NodeUnit模版名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set NodeUnit模版名称
     * @param Name NodeUnit模版名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 命名空间 
     * @return Namespace 命名空间
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间
     * @param Namespace 命名空间
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

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
     * Get 包含节点列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeList 包含节点列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NodeSimpleInfo [] getNodeList() {
        return this.NodeList;
    }

    /**
     * Set 包含节点列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeList 包含节点列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeList(NodeSimpleInfo [] NodeList) {
        this.NodeList = NodeList;
    }

    /**
     * Get NodeGroup列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeGroups NodeGroup列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getNodeGroups() {
        return this.NodeGroups;
    }

    /**
     * Set NodeGroup列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeGroups NodeGroup列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeGroups(String [] NodeGroups) {
        this.NodeGroups = NodeGroups;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
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

    public NodeUnitTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NodeUnitTemplate(NodeUnitTemplate source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.NodeList != null) {
            this.NodeList = new NodeSimpleInfo[source.NodeList.length];
            for (int i = 0; i < source.NodeList.length; i++) {
                this.NodeList[i] = new NodeSimpleInfo(source.NodeList[i]);
            }
        }
        if (source.NodeGroups != null) {
            this.NodeGroups = new String[source.NodeGroups.length];
            for (int i = 0; i < source.NodeGroups.length; i++) {
                this.NodeGroups[i] = new String(source.NodeGroups[i]);
            }
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "NodeList.", this.NodeList);
        this.setParamArraySimple(map, prefix + "NodeGroups.", this.NodeGroups);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

