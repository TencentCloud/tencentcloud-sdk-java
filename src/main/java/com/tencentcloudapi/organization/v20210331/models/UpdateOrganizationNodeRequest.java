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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateOrganizationNodeRequest extends AbstractModel{

    /**
    * 节点ID。
    */
    @SerializedName("NodeId")
    @Expose
    private Long NodeId;

    /**
    * 节点名称。最大长度为40个字符，支持英文字母、数字、汉字、符号+@、&._[]-
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 备注。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get 节点ID。 
     * @return NodeId 节点ID。
     */
    public Long getNodeId() {
        return this.NodeId;
    }

    /**
     * Set 节点ID。
     * @param NodeId 节点ID。
     */
    public void setNodeId(Long NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get 节点名称。最大长度为40个字符，支持英文字母、数字、汉字、符号+@、&._[]- 
     * @return Name 节点名称。最大长度为40个字符，支持英文字母、数字、汉字、符号+@、&._[]-
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 节点名称。最大长度为40个字符，支持英文字母、数字、汉字、符号+@、&._[]-
     * @param Name 节点名称。最大长度为40个字符，支持英文字母、数字、汉字、符号+@、&._[]-
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 备注。 
     * @return Remark 备注。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注。
     * @param Remark 备注。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public UpdateOrganizationNodeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateOrganizationNodeRequest(UpdateOrganizationNodeRequest source) {
        if (source.NodeId != null) {
            this.NodeId = new Long(source.NodeId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

