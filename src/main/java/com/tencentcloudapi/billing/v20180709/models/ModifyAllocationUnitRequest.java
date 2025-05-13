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

public class ModifyAllocationUnitRequest extends AbstractModel {

    /**
    * 所修改分账单元ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 修改后分账单元名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 修改后分账单元源组织名称
    */
    @SerializedName("SourceName")
    @Expose
    private String SourceName;

    /**
    * 修改后分账单元源组织ID
    */
    @SerializedName("SourceId")
    @Expose
    private String SourceId;

    /**
    * 分账单元备注说明
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 月份，不传默认当前月
    */
    @SerializedName("Month")
    @Expose
    private String Month;

    /**
     * Get 所修改分账单元ID 
     * @return Id 所修改分账单元ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 所修改分账单元ID
     * @param Id 所修改分账单元ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 修改后分账单元名称 
     * @return Name 修改后分账单元名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 修改后分账单元名称
     * @param Name 修改后分账单元名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 修改后分账单元源组织名称 
     * @return SourceName 修改后分账单元源组织名称
     */
    public String getSourceName() {
        return this.SourceName;
    }

    /**
     * Set 修改后分账单元源组织名称
     * @param SourceName 修改后分账单元源组织名称
     */
    public void setSourceName(String SourceName) {
        this.SourceName = SourceName;
    }

    /**
     * Get 修改后分账单元源组织ID 
     * @return SourceId 修改后分账单元源组织ID
     */
    public String getSourceId() {
        return this.SourceId;
    }

    /**
     * Set 修改后分账单元源组织ID
     * @param SourceId 修改后分账单元源组织ID
     */
    public void setSourceId(String SourceId) {
        this.SourceId = SourceId;
    }

    /**
     * Get 分账单元备注说明 
     * @return Remark 分账单元备注说明
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 分账单元备注说明
     * @param Remark 分账单元备注说明
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
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

