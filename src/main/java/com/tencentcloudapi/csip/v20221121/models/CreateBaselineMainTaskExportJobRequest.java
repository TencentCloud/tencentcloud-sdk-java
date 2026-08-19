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

public class CreateBaselineMainTaskExportJobRequest extends AbstractModel {

    /**
    * <p>基线主任务 ID，精确导出该任务的检测项与子任务；不传时导出为空。</p>
    */
    @SerializedName("TaskID")
    @Expose
    private Long TaskID;

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
    * <p>通用过滤条件，支持的字段包括：TaskID（精确）、TaskType、Status、CheckAssetType 等。</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
     * Get <p>基线主任务 ID，精确导出该任务的检测项与子任务；不传时导出为空。</p> 
     * @return TaskID <p>基线主任务 ID，精确导出该任务的检测项与子任务；不传时导出为空。</p>
     */
    public Long getTaskID() {
        return this.TaskID;
    }

    /**
     * Set <p>基线主任务 ID，精确导出该任务的检测项与子任务；不传时导出为空。</p>
     * @param TaskID <p>基线主任务 ID，精确导出该任务的检测项与子任务；不传时导出为空。</p>
     */
    public void setTaskID(Long TaskID) {
        this.TaskID = TaskID;
    }

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
     * Get <p>通用过滤条件，支持的字段包括：TaskID（精确）、TaskType、Status、CheckAssetType 等。</p> 
     * @return Filters <p>通用过滤条件，支持的字段包括：TaskID（精确）、TaskType、Status、CheckAssetType 等。</p>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>通用过滤条件，支持的字段包括：TaskID（精确）、TaskType、Status、CheckAssetType 等。</p>
     * @param Filters <p>通用过滤条件，支持的字段包括：TaskID（精确）、TaskType、Status、CheckAssetType 等。</p>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    public CreateBaselineMainTaskExportJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBaselineMainTaskExportJobRequest(CreateBaselineMainTaskExportJobRequest source) {
        if (source.TaskID != null) {
            this.TaskID = new Long(source.TaskID);
        }
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
        this.setParamSimple(map, prefix + "TaskID", this.TaskID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

