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
package com.tencentcloudapi.ctem.v20231128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteManagesRequest extends AbstractModel {

    /**
    * ID列表
    */
    @SerializedName("Ids")
    @Expose
    private Long [] Ids;

    /**
    * 企业ID列表，可多选
    */
    @SerializedName("CustomerIdList")
    @Expose
    private Long [] CustomerIdList;

    /**
    * 是否聚合数据
    */
    @SerializedName("IsAggregation")
    @Expose
    private Boolean IsAggregation;

    /**
     * Get ID列表 
     * @return Ids ID列表
     */
    public Long [] getIds() {
        return this.Ids;
    }

    /**
     * Set ID列表
     * @param Ids ID列表
     */
    public void setIds(Long [] Ids) {
        this.Ids = Ids;
    }

    /**
     * Get 企业ID列表，可多选 
     * @return CustomerIdList 企业ID列表，可多选
     */
    public Long [] getCustomerIdList() {
        return this.CustomerIdList;
    }

    /**
     * Set 企业ID列表，可多选
     * @param CustomerIdList 企业ID列表，可多选
     */
    public void setCustomerIdList(Long [] CustomerIdList) {
        this.CustomerIdList = CustomerIdList;
    }

    /**
     * Get 是否聚合数据 
     * @return IsAggregation 是否聚合数据
     */
    public Boolean getIsAggregation() {
        return this.IsAggregation;
    }

    /**
     * Set 是否聚合数据
     * @param IsAggregation 是否聚合数据
     */
    public void setIsAggregation(Boolean IsAggregation) {
        this.IsAggregation = IsAggregation;
    }

    public DeleteManagesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteManagesRequest(DeleteManagesRequest source) {
        if (source.Ids != null) {
            this.Ids = new Long[source.Ids.length];
            for (int i = 0; i < source.Ids.length; i++) {
                this.Ids[i] = new Long(source.Ids[i]);
            }
        }
        if (source.CustomerIdList != null) {
            this.CustomerIdList = new Long[source.CustomerIdList.length];
            for (int i = 0; i < source.CustomerIdList.length; i++) {
                this.CustomerIdList[i] = new Long(source.CustomerIdList[i]);
            }
        }
        if (source.IsAggregation != null) {
            this.IsAggregation = new Boolean(source.IsAggregation);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Ids.", this.Ids);
        this.setParamArraySimple(map, prefix + "CustomerIdList.", this.CustomerIdList);
        this.setParamSimple(map, prefix + "IsAggregation", this.IsAggregation);

    }
}

