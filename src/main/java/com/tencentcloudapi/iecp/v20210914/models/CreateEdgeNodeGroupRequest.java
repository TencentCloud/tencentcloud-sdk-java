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
package com.tencentcloudapi.iecp.v20210914.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateEdgeNodeGroupRequest extends AbstractModel {

    /**
    * IECP边缘单元ID
    */
    @SerializedName("EdgeUnitId")
    @Expose
    private Long EdgeUnitId;

    /**
    * NodeGroup名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 命名空间，不填默认为default
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
    * 模版ID数组
    */
    @SerializedName("NodeUnitTemplateIDs")
    @Expose
    private Long [] NodeUnitTemplateIDs;

    /**
     * Get IECP边缘单元ID 
     * @return EdgeUnitId IECP边缘单元ID
     */
    public Long getEdgeUnitId() {
        return this.EdgeUnitId;
    }

    /**
     * Set IECP边缘单元ID
     * @param EdgeUnitId IECP边缘单元ID
     */
    public void setEdgeUnitId(Long EdgeUnitId) {
        this.EdgeUnitId = EdgeUnitId;
    }

    /**
     * Get NodeGroup名称 
     * @return Name NodeGroup名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set NodeGroup名称
     * @param Name NodeGroup名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 命名空间，不填默认为default 
     * @return Namespace 命名空间，不填默认为default
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间，不填默认为default
     * @param Namespace 命名空间，不填默认为default
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
     * Get 模版ID数组 
     * @return NodeUnitTemplateIDs 模版ID数组
     */
    public Long [] getNodeUnitTemplateIDs() {
        return this.NodeUnitTemplateIDs;
    }

    /**
     * Set 模版ID数组
     * @param NodeUnitTemplateIDs 模版ID数组
     */
    public void setNodeUnitTemplateIDs(Long [] NodeUnitTemplateIDs) {
        this.NodeUnitTemplateIDs = NodeUnitTemplateIDs;
    }

    public CreateEdgeNodeGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateEdgeNodeGroupRequest(CreateEdgeNodeGroupRequest source) {
        if (source.EdgeUnitId != null) {
            this.EdgeUnitId = new Long(source.EdgeUnitId);
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
        if (source.NodeUnitTemplateIDs != null) {
            this.NodeUnitTemplateIDs = new Long[source.NodeUnitTemplateIDs.length];
            for (int i = 0; i < source.NodeUnitTemplateIDs.length; i++) {
                this.NodeUnitTemplateIDs[i] = new Long(source.NodeUnitTemplateIDs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EdgeUnitId", this.EdgeUnitId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArraySimple(map, prefix + "NodeUnitTemplateIDs.", this.NodeUnitTemplateIDs);

    }
}

