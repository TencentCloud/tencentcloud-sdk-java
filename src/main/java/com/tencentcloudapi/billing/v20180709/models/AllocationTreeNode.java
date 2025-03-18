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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AllocationTreeNode extends AbstractModel {

    /**
    * 分账单元唯一标识
    */
    @SerializedName("TreeNodeUniqKey")
    @Expose
    private String TreeNodeUniqKey;

    /**
    * 分账单元名称
    */
    @SerializedName("TreeNodeUniqKeyName")
    @Expose
    private String TreeNodeUniqKeyName;

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
     * Get 分账单元名称 
     * @return TreeNodeUniqKeyName 分账单元名称
     */
    public String getTreeNodeUniqKeyName() {
        return this.TreeNodeUniqKeyName;
    }

    /**
     * Set 分账单元名称
     * @param TreeNodeUniqKeyName 分账单元名称
     */
    public void setTreeNodeUniqKeyName(String TreeNodeUniqKeyName) {
        this.TreeNodeUniqKeyName = TreeNodeUniqKeyName;
    }

    public AllocationTreeNode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AllocationTreeNode(AllocationTreeNode source) {
        if (source.TreeNodeUniqKey != null) {
            this.TreeNodeUniqKey = new String(source.TreeNodeUniqKey);
        }
        if (source.TreeNodeUniqKeyName != null) {
            this.TreeNodeUniqKeyName = new String(source.TreeNodeUniqKeyName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TreeNodeUniqKey", this.TreeNodeUniqKey);
        this.setParamSimple(map, prefix + "TreeNodeUniqKeyName", this.TreeNodeUniqKeyName);

    }
}

