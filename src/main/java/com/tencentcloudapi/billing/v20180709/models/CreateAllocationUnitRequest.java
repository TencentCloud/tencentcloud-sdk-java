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
    * <p>新增分账单元父节点ID</p>
    */
    @SerializedName("ParentId")
    @Expose
    private Long ParentId;

    /**
    * <p>新增分账单元名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>月份，不传默认当前月</p>
    */
    @SerializedName("Month")
    @Expose
    private String Month;

    /**
     * Get <p>新增分账单元父节点ID</p> 
     * @return ParentId <p>新增分账单元父节点ID</p>
     */
    public Long getParentId() {
        return this.ParentId;
    }

    /**
     * Set <p>新增分账单元父节点ID</p>
     * @param ParentId <p>新增分账单元父节点ID</p>
     */
    public void setParentId(Long ParentId) {
        this.ParentId = ParentId;
    }

    /**
     * Get <p>新增分账单元名称</p> 
     * @return Name <p>新增分账单元名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>新增分账单元名称</p>
     * @param Name <p>新增分账单元名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>月份，不传默认当前月</p> 
     * @return Month <p>月份，不传默认当前月</p>
     */
    public String getMonth() {
        return this.Month;
    }

    /**
     * Set <p>月份，不传默认当前月</p>
     * @param Month <p>月份，不传默认当前月</p>
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

