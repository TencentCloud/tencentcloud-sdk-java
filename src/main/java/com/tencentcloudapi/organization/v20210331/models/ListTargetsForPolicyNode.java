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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListTargetsForPolicyNode extends AbstractModel {

    /**
    * <p>scp账号uin或节点Id</p>
    */
    @SerializedName("Uin")
    @Expose
    private Long Uin;

    /**
    * <p>关联类型 1-节点关联 2-用户关联</p>
    */
    @SerializedName("RelatedType")
    @Expose
    private Long RelatedType;

    /**
    * <p>账号或者节点名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>绑定时间</p>
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
    * <p>目标对象所属的组织层级名称路径</p>
    */
    @SerializedName("NodePath")
    @Expose
    private String [] NodePath;

    /**
    * <p>对应的组织层级 ID 路径</p>
    */
    @SerializedName("NodePathIds")
    @Expose
    private Long [] NodePathIds;

    /**
     * Get <p>scp账号uin或节点Id</p> 
     * @return Uin <p>scp账号uin或节点Id</p>
     */
    public Long getUin() {
        return this.Uin;
    }

    /**
     * Set <p>scp账号uin或节点Id</p>
     * @param Uin <p>scp账号uin或节点Id</p>
     */
    public void setUin(Long Uin) {
        this.Uin = Uin;
    }

    /**
     * Get <p>关联类型 1-节点关联 2-用户关联</p> 
     * @return RelatedType <p>关联类型 1-节点关联 2-用户关联</p>
     */
    public Long getRelatedType() {
        return this.RelatedType;
    }

    /**
     * Set <p>关联类型 1-节点关联 2-用户关联</p>
     * @param RelatedType <p>关联类型 1-节点关联 2-用户关联</p>
     */
    public void setRelatedType(Long RelatedType) {
        this.RelatedType = RelatedType;
    }

    /**
     * Get <p>账号或者节点名称</p> 
     * @return Name <p>账号或者节点名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>账号或者节点名称</p>
     * @param Name <p>账号或者节点名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>绑定时间</p> 
     * @return AddTime <p>绑定时间</p>
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * Set <p>绑定时间</p>
     * @param AddTime <p>绑定时间</p>
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    /**
     * Get <p>目标对象所属的组织层级名称路径</p> 
     * @return NodePath <p>目标对象所属的组织层级名称路径</p>
     */
    public String [] getNodePath() {
        return this.NodePath;
    }

    /**
     * Set <p>目标对象所属的组织层级名称路径</p>
     * @param NodePath <p>目标对象所属的组织层级名称路径</p>
     */
    public void setNodePath(String [] NodePath) {
        this.NodePath = NodePath;
    }

    /**
     * Get <p>对应的组织层级 ID 路径</p> 
     * @return NodePathIds <p>对应的组织层级 ID 路径</p>
     */
    public Long [] getNodePathIds() {
        return this.NodePathIds;
    }

    /**
     * Set <p>对应的组织层级 ID 路径</p>
     * @param NodePathIds <p>对应的组织层级 ID 路径</p>
     */
    public void setNodePathIds(Long [] NodePathIds) {
        this.NodePathIds = NodePathIds;
    }

    public ListTargetsForPolicyNode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListTargetsForPolicyNode(ListTargetsForPolicyNode source) {
        if (source.Uin != null) {
            this.Uin = new Long(source.Uin);
        }
        if (source.RelatedType != null) {
            this.RelatedType = new Long(source.RelatedType);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.AddTime != null) {
            this.AddTime = new String(source.AddTime);
        }
        if (source.NodePath != null) {
            this.NodePath = new String[source.NodePath.length];
            for (int i = 0; i < source.NodePath.length; i++) {
                this.NodePath[i] = new String(source.NodePath[i]);
            }
        }
        if (source.NodePathIds != null) {
            this.NodePathIds = new Long[source.NodePathIds.length];
            for (int i = 0; i < source.NodePathIds.length; i++) {
                this.NodePathIds[i] = new Long(source.NodePathIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "RelatedType", this.RelatedType);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "AddTime", this.AddTime);
        this.setParamArraySimple(map, prefix + "NodePath.", this.NodePath);
        this.setParamArraySimple(map, prefix + "NodePathIds.", this.NodePathIds);

    }
}

