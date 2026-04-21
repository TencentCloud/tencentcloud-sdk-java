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

public class ModifyAllocationUnitRequest extends AbstractModel {

    /**
    * <p>所修改分账单元ID</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>修改后分账单元名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>修改后分账单元源组织名称</p>
    */
    @SerializedName("SourceName")
    @Expose
    private String SourceName;

    /**
    * <p>修改后分账单元源组织ID</p>
    */
    @SerializedName("SourceId")
    @Expose
    private String SourceId;

    /**
    * <p>分账单元备注说明</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>月份，不传默认当前月</p>
    */
    @SerializedName("Month")
    @Expose
    private String Month;

    /**
     * Get <p>所修改分账单元ID</p> 
     * @return Id <p>所修改分账单元ID</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>所修改分账单元ID</p>
     * @param Id <p>所修改分账单元ID</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>修改后分账单元名称</p> 
     * @return Name <p>修改后分账单元名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>修改后分账单元名称</p>
     * @param Name <p>修改后分账单元名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>修改后分账单元源组织名称</p> 
     * @return SourceName <p>修改后分账单元源组织名称</p>
     */
    public String getSourceName() {
        return this.SourceName;
    }

    /**
     * Set <p>修改后分账单元源组织名称</p>
     * @param SourceName <p>修改后分账单元源组织名称</p>
     */
    public void setSourceName(String SourceName) {
        this.SourceName = SourceName;
    }

    /**
     * Get <p>修改后分账单元源组织ID</p> 
     * @return SourceId <p>修改后分账单元源组织ID</p>
     */
    public String getSourceId() {
        return this.SourceId;
    }

    /**
     * Set <p>修改后分账单元源组织ID</p>
     * @param SourceId <p>修改后分账单元源组织ID</p>
     */
    public void setSourceId(String SourceId) {
        this.SourceId = SourceId;
    }

    /**
     * Get <p>分账单元备注说明</p> 
     * @return Remark <p>分账单元备注说明</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>分账单元备注说明</p>
     * @param Remark <p>分账单元备注说明</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
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

    public ModifyAllocationUnitRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAllocationUnitRequest(ModifyAllocationUnitRequest source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.SourceName != null) {
            this.SourceName = new String(source.SourceName);
        }
        if (source.SourceId != null) {
            this.SourceId = new String(source.SourceId);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Month != null) {
            this.Month = new String(source.Month);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "SourceName", this.SourceName);
        this.setParamSimple(map, prefix + "SourceId", this.SourceId);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Month", this.Month);

    }
}

