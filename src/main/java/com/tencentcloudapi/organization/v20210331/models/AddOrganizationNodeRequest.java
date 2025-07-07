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

public class AddOrganizationNodeRequest extends AbstractModel {

    /**
    * 父节点ID。可以通过[DescribeOrganizationNodes](https://cloud.tencent.com/document/product/850/82926)获取
    */
    @SerializedName("ParentNodeId")
    @Expose
    private Long ParentNodeId;

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
    * 部门标签列表。最大10个
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get 父节点ID。可以通过[DescribeOrganizationNodes](https://cloud.tencent.com/document/product/850/82926)获取 
     * @return ParentNodeId 父节点ID。可以通过[DescribeOrganizationNodes](https://cloud.tencent.com/document/product/850/82926)获取
     */
    public Long getParentNodeId() {
        return this.ParentNodeId;
    }

    /**
     * Set 父节点ID。可以通过[DescribeOrganizationNodes](https://cloud.tencent.com/document/product/850/82926)获取
     * @param ParentNodeId 父节点ID。可以通过[DescribeOrganizationNodes](https://cloud.tencent.com/document/product/850/82926)获取
     */
    public void setParentNodeId(Long ParentNodeId) {
        this.ParentNodeId = ParentNodeId;
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

    /**
     * Get 部门标签列表。最大10个 
     * @return Tags 部门标签列表。最大10个
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 部门标签列表。最大10个
     * @param Tags 部门标签列表。最大10个
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public AddOrganizationNodeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddOrganizationNodeRequest(AddOrganizationNodeRequest source) {
        if (source.ParentNodeId != null) {
            this.ParentNodeId = new Long(source.ParentNodeId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ParentNodeId", this.ParentNodeId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

