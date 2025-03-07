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

public class AllocationOverviewNode extends AbstractModel {

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
    * 分账单元包含规则标志
0 - 不存在规则
1 - 同时存在归集规则和公摊规则
2 - 仅存在归集规则
3 - 仅存在公摊规则
    */
    @SerializedName("Symbol")
    @Expose
    private Long Symbol;

    /**
    * 子单元月概览详情
    */
    @SerializedName("Children")
    @Expose
    private AllocationOverviewNode [] Children;

    /**
    * 分账账单月概览金额明细
    */
    @SerializedName("Detail")
    @Expose
    private AllocationMonthOverviewDetail Detail;

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
     * Get 分账单元包含规则标志
0 - 不存在规则
1 - 同时存在归集规则和公摊规则
2 - 仅存在归集规则
3 - 仅存在公摊规则 
     * @return Symbol 分账单元包含规则标志
0 - 不存在规则
1 - 同时存在归集规则和公摊规则
2 - 仅存在归集规则
3 - 仅存在公摊规则
     */
    public Long getSymbol() {
        return this.Symbol;
    }

    /**
     * Set 分账单元包含规则标志
0 - 不存在规则
1 - 同时存在归集规则和公摊规则
2 - 仅存在归集规则
3 - 仅存在公摊规则
     * @param Symbol 分账单元包含规则标志
0 - 不存在规则
1 - 同时存在归集规则和公摊规则
2 - 仅存在归集规则
3 - 仅存在公摊规则
     */
    public void setSymbol(Long Symbol) {
        this.Symbol = Symbol;
    }

    /**
     * Get 子单元月概览详情 
     * @return Children 子单元月概览详情
     */
    public AllocationOverviewNode [] getChildren() {
        return this.Children;
    }

    /**
     * Set 子单元月概览详情
     * @param Children 子单元月概览详情
     */
    public void setChildren(AllocationOverviewNode [] Children) {
        this.Children = Children;
    }

    /**
     * Get 分账账单月概览金额明细 
     * @return Detail 分账账单月概览金额明细
     */
    public AllocationMonthOverviewDetail getDetail() {
        return this.Detail;
    }

    /**
     * Set 分账账单月概览金额明细
     * @param Detail 分账账单月概览金额明细
     */
    public void setDetail(AllocationMonthOverviewDetail Detail) {
        this.Detail = Detail;
    }

    public AllocationOverviewNode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AllocationOverviewNode(AllocationOverviewNode source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.TreeNodeUniqKey != null) {
            this.TreeNodeUniqKey = new String(source.TreeNodeUniqKey);
        }
        if (source.Symbol != null) {
            this.Symbol = new Long(source.Symbol);
        }
        if (source.Children != null) {
            this.Children = new AllocationOverviewNode[source.Children.length];
            for (int i = 0; i < source.Children.length; i++) {
                this.Children[i] = new AllocationOverviewNode(source.Children[i]);
            }
        }
        if (source.Detail != null) {
            this.Detail = new AllocationMonthOverviewDetail(source.Detail);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "TreeNodeUniqKey", this.TreeNodeUniqKey);
        this.setParamSimple(map, prefix + "Symbol", this.Symbol);
        this.setParamArrayObj(map, prefix + "Children.", this.Children);
        this.setParamObj(map, prefix + "Detail.", this.Detail);

    }
}

