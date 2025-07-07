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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AllocationTree extends AbstractModel {

    /**
    * 分账单元ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 分账单元名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 分账单元唯一标识
    */
    @SerializedName("TreeNodeUniqKey")
    @Expose
    private String TreeNodeUniqKey;

    /**
    * 子树
    */
    @SerializedName("Children")
    @Expose
    private AllocationTree [] Children;

    /**
     * Get 分账单元ID 
     * @return Id 分账单元ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 分账单元ID
     * @param Id 分账单元ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 分账单元名称 
     * @return Name 分账单元名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 分账单元名称
     * @param Name 分账单元名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 分账单元唯一标识 
     * @return TreeNodeUniqKey 分账单元唯一标识
     */
    public String getTreeNodeUniqKey() {
        return this.TreeNodeUniqKey;
    }

    /**
     * Set 分账单元唯一标识
     * @param TreeNodeUniqKey 分账单元唯一标识
     */
    public void setTreeNodeUniqKey(String TreeNodeUniqKey) {
        this.TreeNodeUniqKey = TreeNodeUniqKey;
    }

    /**
     * Get 子树 
     * @return Children 子树
     */
    public AllocationTree [] getChildren() {
        return this.Children;
    }

    /**
     * Set 子树
     * @param Children 子树
     */
    public void setChildren(AllocationTree [] Children) {
        this.Children = Children;
    }

    public AllocationTree() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AllocationTree(AllocationTree source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.TreeNodeUniqKey != null) {
            this.TreeNodeUniqKey = new String(source.TreeNodeUniqKey);
        }
        if (source.Children != null) {
            this.Children = new AllocationTree[source.Children.length];
            for (int i = 0; i < source.Children.length; i++) {
                this.Children[i] = new AllocationTree(source.Children[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "TreeNodeUniqKey", this.TreeNodeUniqKey);
        this.setParamArrayObj(map, prefix + "Children.", this.Children);

    }
}

