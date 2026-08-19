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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateBaselineFixRecordExportJobRequest extends AbstractModel {

    /**
    * <p>导出任务名称。不传时自动生成。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>通用过滤条件，支持字段：检测项名称（模糊）、资产名称/ID、风险等级、修复时间区间等。</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
     * Get <p>导出任务名称。不传时自动生成。</p> 
     * @return Name <p>导出任务名称。不传时自动生成。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>导出任务名称。不传时自动生成。</p>
     * @param Name <p>导出任务名称。不传时自动生成。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>集团账号的成员id</p> 
     * @return MemberId <p>集团账号的成员id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>集团账号的成员id</p>
     * @param MemberId <p>集团账号的成员id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>通用过滤条件，支持字段：检测项名称（模糊）、资产名称/ID、风险等级、修复时间区间等。</p> 
     * @return Filters <p>通用过滤条件，支持字段：检测项名称（模糊）、资产名称/ID、风险等级、修复时间区间等。</p>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>通用过滤条件，支持字段：检测项名称（模糊）、资产名称/ID、风险等级、修复时间区间等。</p>
     * @param Filters <p>通用过滤条件，支持字段：检测项名称（模糊）、资产名称/ID、风险等级、修复时间区间等。</p>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    public CreateBaselineFixRecordExportJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBaselineFixRecordExportJobRequest(CreateBaselineFixRecordExportJobRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

