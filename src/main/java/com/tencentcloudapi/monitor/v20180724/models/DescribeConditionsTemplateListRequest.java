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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeConditionsTemplateListRequest extends AbstractModel{

    /**
    * 固定值，为"monitor"
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 视图名，由 [DescribeAllNamespaces](https://cloud.tencent.com/document/product/248/48683) 获得。对于云产品监控，取接口出参的 QceNamespacesNew.N.Id，例如 cvm_device
    */
    @SerializedName("ViewName")
    @Expose
    private String ViewName;

    /**
    * 根据触发条件模板名称过滤查询
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 根据触发条件模板ID过滤查询
    */
    @SerializedName("GroupID")
    @Expose
    private String GroupID;

    /**
    * 分页参数，每页返回的数量，取值1~100，默认20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页参数，页偏移量，从0开始计数，默认0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 指定按更新时间的排序方式，asc=升序, desc=降序
    */
    @SerializedName("UpdateTimeOrder")
    @Expose
    private String UpdateTimeOrder;

    /**
     * Get 固定值，为"monitor" 
     * @return Module 固定值，为"monitor"
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set 固定值，为"monitor"
     * @param Module 固定值，为"monitor"
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get 视图名，由 [DescribeAllNamespaces](https://cloud.tencent.com/document/product/248/48683) 获得。对于云产品监控，取接口出参的 QceNamespacesNew.N.Id，例如 cvm_device 
     * @return ViewName 视图名，由 [DescribeAllNamespaces](https://cloud.tencent.com/document/product/248/48683) 获得。对于云产品监控，取接口出参的 QceNamespacesNew.N.Id，例如 cvm_device
     */
    public String getViewName() {
        return this.ViewName;
    }

    /**
     * Set 视图名，由 [DescribeAllNamespaces](https://cloud.tencent.com/document/product/248/48683) 获得。对于云产品监控，取接口出参的 QceNamespacesNew.N.Id，例如 cvm_device
     * @param ViewName 视图名，由 [DescribeAllNamespaces](https://cloud.tencent.com/document/product/248/48683) 获得。对于云产品监控，取接口出参的 QceNamespacesNew.N.Id，例如 cvm_device
     */
    public void setViewName(String ViewName) {
        this.ViewName = ViewName;
    }

    /**
     * Get 根据触发条件模板名称过滤查询 
     * @return GroupName 根据触发条件模板名称过滤查询
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 根据触发条件模板名称过滤查询
     * @param GroupName 根据触发条件模板名称过滤查询
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 根据触发条件模板ID过滤查询 
     * @return GroupID 根据触发条件模板ID过滤查询
     */
    public String getGroupID() {
        return this.GroupID;
    }

    /**
     * Set 根据触发条件模板ID过滤查询
     * @param GroupID 根据触发条件模板ID过滤查询
     */
    public void setGroupID(String GroupID) {
        this.GroupID = GroupID;
    }

    /**
     * Get 分页参数，每页返回的数量，取值1~100，默认20 
     * @return Limit 分页参数，每页返回的数量，取值1~100，默认20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页参数，每页返回的数量，取值1~100，默认20
     * @param Limit 分页参数，每页返回的数量，取值1~100，默认20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页参数，页偏移量，从0开始计数，默认0 
     * @return Offset 分页参数，页偏移量，从0开始计数，默认0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页参数，页偏移量，从0开始计数，默认0
     * @param Offset 分页参数，页偏移量，从0开始计数，默认0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 指定按更新时间的排序方式，asc=升序, desc=降序 
     * @return UpdateTimeOrder 指定按更新时间的排序方式，asc=升序, desc=降序
     */
    public String getUpdateTimeOrder() {
        return this.UpdateTimeOrder;
    }

    /**
     * Set 指定按更新时间的排序方式，asc=升序, desc=降序
     * @param UpdateTimeOrder 指定按更新时间的排序方式，asc=升序, desc=降序
     */
    public void setUpdateTimeOrder(String UpdateTimeOrder) {
        this.UpdateTimeOrder = UpdateTimeOrder;
    }

    public DescribeConditionsTemplateListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeConditionsTemplateListRequest(DescribeConditionsTemplateListRequest source) {
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.ViewName != null) {
            this.ViewName = new String(source.ViewName);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.GroupID != null) {
            this.GroupID = new String(source.GroupID);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.UpdateTimeOrder != null) {
            this.UpdateTimeOrder = new String(source.UpdateTimeOrder);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "ViewName", this.ViewName);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "GroupID", this.GroupID);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "UpdateTimeOrder", this.UpdateTimeOrder);

    }
}

