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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeConditionsTemplateListRequest extends AbstractModel {

    /**
    * <p>固定值，为&quot;monitor&quot;</p>
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * <p>视图名，由 <a href="https://cloud.tencent.com/document/product/248/48683">DescribeAllNamespaces</a> 获得。对于云产品监控，取接口出参的 QceNamespacesNew.N.Id，例如 cvm_device</p>
    */
    @SerializedName("ViewName")
    @Expose
    private String ViewName;

    /**
    * <p>根据触发条件模板名称过滤查询</p>
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * <p>根据触发条件模板ID过滤查询</p>
    */
    @SerializedName("GroupID")
    @Expose
    private String GroupID;

    /**
    * <p>分页参数，每页返回的数量，取值1~100，默认20</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>分页参数，页偏移量，从0开始计数，默认0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>指定按更新时间的排序方式，asc=升序, desc=降序</p>
    */
    @SerializedName("UpdateTimeOrder")
    @Expose
    private String UpdateTimeOrder;

    /**
    * <p>指定按绑定策略数目的排序方式，asc=升序, desc=降序</p>
    */
    @SerializedName("PolicyCountOrder")
    @Expose
    private String PolicyCountOrder;

    /**
     * Get <p>固定值，为&quot;monitor&quot;</p> 
     * @return Module <p>固定值，为&quot;monitor&quot;</p>
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set <p>固定值，为&quot;monitor&quot;</p>
     * @param Module <p>固定值，为&quot;monitor&quot;</p>
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get <p>视图名，由 <a href="https://cloud.tencent.com/document/product/248/48683">DescribeAllNamespaces</a> 获得。对于云产品监控，取接口出参的 QceNamespacesNew.N.Id，例如 cvm_device</p> 
     * @return ViewName <p>视图名，由 <a href="https://cloud.tencent.com/document/product/248/48683">DescribeAllNamespaces</a> 获得。对于云产品监控，取接口出参的 QceNamespacesNew.N.Id，例如 cvm_device</p>
     */
    public String getViewName() {
        return this.ViewName;
    }

    /**
     * Set <p>视图名，由 <a href="https://cloud.tencent.com/document/product/248/48683">DescribeAllNamespaces</a> 获得。对于云产品监控，取接口出参的 QceNamespacesNew.N.Id，例如 cvm_device</p>
     * @param ViewName <p>视图名，由 <a href="https://cloud.tencent.com/document/product/248/48683">DescribeAllNamespaces</a> 获得。对于云产品监控，取接口出参的 QceNamespacesNew.N.Id，例如 cvm_device</p>
     */
    public void setViewName(String ViewName) {
        this.ViewName = ViewName;
    }

    /**
     * Get <p>根据触发条件模板名称过滤查询</p> 
     * @return GroupName <p>根据触发条件模板名称过滤查询</p>
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set <p>根据触发条件模板名称过滤查询</p>
     * @param GroupName <p>根据触发条件模板名称过滤查询</p>
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get <p>根据触发条件模板ID过滤查询</p> 
     * @return GroupID <p>根据触发条件模板ID过滤查询</p>
     */
    public String getGroupID() {
        return this.GroupID;
    }

    /**
     * Set <p>根据触发条件模板ID过滤查询</p>
     * @param GroupID <p>根据触发条件模板ID过滤查询</p>
     */
    public void setGroupID(String GroupID) {
        this.GroupID = GroupID;
    }

    /**
     * Get <p>分页参数，每页返回的数量，取值1~100，默认20</p> 
     * @return Limit <p>分页参数，每页返回的数量，取值1~100，默认20</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>分页参数，每页返回的数量，取值1~100，默认20</p>
     * @param Limit <p>分页参数，每页返回的数量，取值1~100，默认20</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>分页参数，页偏移量，从0开始计数，默认0</p> 
     * @return Offset <p>分页参数，页偏移量，从0开始计数，默认0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页参数，页偏移量，从0开始计数，默认0</p>
     * @param Offset <p>分页参数，页偏移量，从0开始计数，默认0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>指定按更新时间的排序方式，asc=升序, desc=降序</p> 
     * @return UpdateTimeOrder <p>指定按更新时间的排序方式，asc=升序, desc=降序</p>
     */
    public String getUpdateTimeOrder() {
        return this.UpdateTimeOrder;
    }

    /**
     * Set <p>指定按更新时间的排序方式，asc=升序, desc=降序</p>
     * @param UpdateTimeOrder <p>指定按更新时间的排序方式，asc=升序, desc=降序</p>
     */
    public void setUpdateTimeOrder(String UpdateTimeOrder) {
        this.UpdateTimeOrder = UpdateTimeOrder;
    }

    /**
     * Get <p>指定按绑定策略数目的排序方式，asc=升序, desc=降序</p> 
     * @return PolicyCountOrder <p>指定按绑定策略数目的排序方式，asc=升序, desc=降序</p>
     */
    public String getPolicyCountOrder() {
        return this.PolicyCountOrder;
    }

    /**
     * Set <p>指定按绑定策略数目的排序方式，asc=升序, desc=降序</p>
     * @param PolicyCountOrder <p>指定按绑定策略数目的排序方式，asc=升序, desc=降序</p>
     */
    public void setPolicyCountOrder(String PolicyCountOrder) {
        this.PolicyCountOrder = PolicyCountOrder;
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
        if (source.PolicyCountOrder != null) {
            this.PolicyCountOrder = new String(source.PolicyCountOrder);
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
        this.setParamSimple(map, prefix + "PolicyCountOrder", this.PolicyCountOrder);

    }
}

