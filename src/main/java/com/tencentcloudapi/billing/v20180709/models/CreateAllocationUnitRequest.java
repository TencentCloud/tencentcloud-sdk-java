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

public class CreateAllocationUnitRequest extends AbstractModel {

    /**
    * 新增分账单元父节点ID
    */
    @SerializedName("ParentId")
    @Expose
    private Long ParentId;

    /**
    * 新增分账单元名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 月份，不传默认当前月
    */
    @SerializedName("Month")
    @Expose
    private String Month;

    /**
     * Get 新增分账单元父节点ID 
     * @return ParentId 新增分账单元父节点ID
     */
    public Long getParentId() {
        return this.ParentId;
    }

    /**
     * Set 新增分账单元父节点ID
     * @param ParentId 新增分账单元父节点ID
     */
    public void setParentId(Long ParentId) {
        this.ParentId = ParentId;
    }

    /**
     * Get 新增分账单元名称 
     * @return Name 新增分账单元名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 新增分账单元名称
     * @param Name 新增分账单元名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 月份，不传默认当前月 
     * @return Month 月份，不传默认当前月
     */
    public String getMonth() {
        return this.Month;
    }

    /**
     * Set 月份，不传默认当前月
     * @param Month 月份，不传默认当前月
     */
    public void setMonth(String Month) {
        this.Month = Month;
    }

    public CreateAllocationUnitRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAllocationUnitRequest(CreateAllocationUnitRequest source) {
        if (source.ParentId != null) {
            this.ParentId = new Long(source.ParentId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Month != null) {
            this.Month = new String(source.Month);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ParentId", this.ParentId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Month", this.Month);

    }
}

