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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeImportableOfflineTaskRequest extends AbstractModel {

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 页码
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 页大小
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 任务名称
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 创建者列表
    */
    @SerializedName("CreaterList")
    @Expose
    private String [] CreaterList;

    /**
    * 责任人列表
    */
    @SerializedName("InChargeList")
    @Expose
    private String [] InChargeList;

    /**
    * 排序信息
最近修改时间：LastUpdate
    */
    @SerializedName("OrderFields")
    @Expose
    private OrderField [] OrderFields;

    /**
     * Get 项目id 
     * @return ProjectId 项目id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id
     * @param ProjectId 项目id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 页码 
     * @return PageNumber 页码
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 页码
     * @param PageNumber 页码
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 页大小 
     * @return PageSize 页大小
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 页大小
     * @param PageSize 页大小
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 任务名称 
     * @return TaskName 任务名称
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 任务名称
     * @param TaskName 任务名称
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 创建者列表 
     * @return CreaterList 创建者列表
     */
    public String [] getCreaterList() {
        return this.CreaterList;
    }

    /**
     * Set 创建者列表
     * @param CreaterList 创建者列表
     */
    public void setCreaterList(String [] CreaterList) {
        this.CreaterList = CreaterList;
    }

    /**
     * Get 责任人列表 
     * @return InChargeList 责任人列表
     */
    public String [] getInChargeList() {
        return this.InChargeList;
    }

    /**
     * Set 责任人列表
     * @param InChargeList 责任人列表
     */
    public void setInChargeList(String [] InChargeList) {
        this.InChargeList = InChargeList;
    }

    /**
     * Get 排序信息
最近修改时间：LastUpdate 
     * @return OrderFields 排序信息
最近修改时间：LastUpdate
     */
    public OrderField [] getOrderFields() {
        return this.OrderFields;
    }

    /**
     * Set 排序信息
最近修改时间：LastUpdate
     * @param OrderFields 排序信息
最近修改时间：LastUpdate
     */
    public void setOrderFields(OrderField [] OrderFields) {
        this.OrderFields = OrderFields;
    }

    public DescribeImportableOfflineTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeImportableOfflineTaskRequest(DescribeImportableOfflineTaskRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.CreaterList != null) {
            this.CreaterList = new String[source.CreaterList.length];
            for (int i = 0; i < source.CreaterList.length; i++) {
                this.CreaterList[i] = new String(source.CreaterList[i]);
            }
        }
        if (source.InChargeList != null) {
            this.InChargeList = new String[source.InChargeList.length];
            for (int i = 0; i < source.InChargeList.length; i++) {
                this.InChargeList[i] = new String(source.InChargeList[i]);
            }
        }
        if (source.OrderFields != null) {
            this.OrderFields = new OrderField[source.OrderFields.length];
            for (int i = 0; i < source.OrderFields.length; i++) {
                this.OrderFields[i] = new OrderField(source.OrderFields[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamArraySimple(map, prefix + "CreaterList.", this.CreaterList);
        this.setParamArraySimple(map, prefix + "InChargeList.", this.InChargeList);
        this.setParamArrayObj(map, prefix + "OrderFields.", this.OrderFields);

    }
}

