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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchCustomRuleListData extends AbstractModel {

    /**
    * 规则列表
    */
    @SerializedName("List")
    @Expose
    private BatchCustomRuleListItem [] List;

    /**
    * 列表总数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
     * Get 规则列表 
     * @return List 规则列表
     */
    public BatchCustomRuleListItem [] getList() {
        return this.List;
    }

    /**
     * Set 规则列表
     * @param List 规则列表
     */
    public void setList(BatchCustomRuleListItem [] List) {
        this.List = List;
    }

    /**
     * Get 列表总数 
     * @return Total 列表总数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 列表总数
     * @param Total 列表总数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    public BatchCustomRuleListData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchCustomRuleListData(BatchCustomRuleListData source) {
        if (source.List != null) {
            this.List = new BatchCustomRuleListItem[source.List.length];
            for (int i = 0; i < source.List.length; i++) {
                this.List[i] = new BatchCustomRuleListItem(source.List[i]);
            }
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "List.", this.List);
        this.setParamSimple(map, prefix + "Total", this.Total);

    }
}

