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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeNotebookSessionsRequest extends AbstractModel{

    /**
    * DLC Spark作业引擎名称
    */
    @SerializedName("DataEngineName")
    @Expose
    private String DataEngineName;

    /**
    * Session状态，包含：not_started（未启动）、starting（已启动）、idle（等待输入）、busy(正在运行statement)、shutting_down（停止）、error（异常）、dead（已退出）、killed（被杀死）、success（正常停止）
    */
    @SerializedName("State")
    @Expose
    private String [] State;

    /**
    * 排序字段（默认按创建时间）
    */
    @SerializedName("SortFields")
    @Expose
    private String [] SortFields;

    /**
    * 排序字段：true：升序、false：降序（默认）
    */
    @SerializedName("Asc")
    @Expose
    private Boolean Asc;

    /**
    * 分页参数，默认10
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页参数，默认0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get DLC Spark作业引擎名称 
     * @return DataEngineName DLC Spark作业引擎名称
     */
    public String getDataEngineName() {
        return this.DataEngineName;
    }

    /**
     * Set DLC Spark作业引擎名称
     * @param DataEngineName DLC Spark作业引擎名称
     */
    public void setDataEngineName(String DataEngineName) {
        this.DataEngineName = DataEngineName;
    }

    /**
     * Get Session状态，包含：not_started（未启动）、starting（已启动）、idle（等待输入）、busy(正在运行statement)、shutting_down（停止）、error（异常）、dead（已退出）、killed（被杀死）、success（正常停止） 
     * @return State Session状态，包含：not_started（未启动）、starting（已启动）、idle（等待输入）、busy(正在运行statement)、shutting_down（停止）、error（异常）、dead（已退出）、killed（被杀死）、success（正常停止）
     */
    public String [] getState() {
        return this.State;
    }

    /**
     * Set Session状态，包含：not_started（未启动）、starting（已启动）、idle（等待输入）、busy(正在运行statement)、shutting_down（停止）、error（异常）、dead（已退出）、killed（被杀死）、success（正常停止）
     * @param State Session状态，包含：not_started（未启动）、starting（已启动）、idle（等待输入）、busy(正在运行statement)、shutting_down（停止）、error（异常）、dead（已退出）、killed（被杀死）、success（正常停止）
     */
    public void setState(String [] State) {
        this.State = State;
    }

    /**
     * Get 排序字段（默认按创建时间） 
     * @return SortFields 排序字段（默认按创建时间）
     */
    public String [] getSortFields() {
        return this.SortFields;
    }

    /**
     * Set 排序字段（默认按创建时间）
     * @param SortFields 排序字段（默认按创建时间）
     */
    public void setSortFields(String [] SortFields) {
        this.SortFields = SortFields;
    }

    /**
     * Get 排序字段：true：升序、false：降序（默认） 
     * @return Asc 排序字段：true：升序、false：降序（默认）
     */
    public Boolean getAsc() {
        return this.Asc;
    }

    /**
     * Set 排序字段：true：升序、false：降序（默认）
     * @param Asc 排序字段：true：升序、false：降序（默认）
     */
    public void setAsc(Boolean Asc) {
        this.Asc = Asc;
    }

    /**
     * Get 分页参数，默认10 
     * @return Limit 分页参数，默认10
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页参数，默认10
     * @param Limit 分页参数，默认10
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页参数，默认0 
     * @return Offset 分页参数，默认0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页参数，默认0
     * @param Offset 分页参数，默认0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeNotebookSessionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNotebookSessionsRequest(DescribeNotebookSessionsRequest source) {
        if (source.DataEngineName != null) {
            this.DataEngineName = new String(source.DataEngineName);
        }
        if (source.State != null) {
            this.State = new String[source.State.length];
            for (int i = 0; i < source.State.length; i++) {
                this.State[i] = new String(source.State[i]);
            }
        }
        if (source.SortFields != null) {
            this.SortFields = new String[source.SortFields.length];
            for (int i = 0; i < source.SortFields.length; i++) {
                this.SortFields[i] = new String(source.SortFields[i]);
            }
        }
        if (source.Asc != null) {
            this.Asc = new Boolean(source.Asc);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataEngineName", this.DataEngineName);
        this.setParamArraySimple(map, prefix + "State.", this.State);
        this.setParamArraySimple(map, prefix + "SortFields.", this.SortFields);
        this.setParamSimple(map, prefix + "Asc", this.Asc);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

