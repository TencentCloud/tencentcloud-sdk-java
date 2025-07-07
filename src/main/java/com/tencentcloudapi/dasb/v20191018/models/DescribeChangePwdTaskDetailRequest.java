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
package com.tencentcloudapi.dasb.v20191018.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeChangePwdTaskDetailRequest extends AbstractModel {

    /**
    * 改密任务Id
    */
    @SerializedName("OperationId")
    @Expose
    private String OperationId;

    /**
    * 所属部门ID，如：“1.2.3”
    */
    @SerializedName("DepartmentId")
    @Expose
    private String DepartmentId;

    /**
    * 过滤数组，支持：InstanceId 资产ID，DeviceName 资产名称，Ip 内外IP，Account 资产账号，LastChangeStatus 上次改密状态。
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 分页偏移位置，默认0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 每页条目。默认20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 改密任务Id 
     * @return OperationId 改密任务Id
     */
    public String getOperationId() {
        return this.OperationId;
    }

    /**
     * Set 改密任务Id
     * @param OperationId 改密任务Id
     */
    public void setOperationId(String OperationId) {
        this.OperationId = OperationId;
    }

    /**
     * Get 所属部门ID，如：“1.2.3” 
     * @return DepartmentId 所属部门ID，如：“1.2.3”
     */
    public String getDepartmentId() {
        return this.DepartmentId;
    }

    /**
     * Set 所属部门ID，如：“1.2.3”
     * @param DepartmentId 所属部门ID，如：“1.2.3”
     */
    public void setDepartmentId(String DepartmentId) {
        this.DepartmentId = DepartmentId;
    }

    /**
     * Get 过滤数组，支持：InstanceId 资产ID，DeviceName 资产名称，Ip 内外IP，Account 资产账号，LastChangeStatus 上次改密状态。 
     * @return Filters 过滤数组，支持：InstanceId 资产ID，DeviceName 资产名称，Ip 内外IP，Account 资产账号，LastChangeStatus 上次改密状态。
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤数组，支持：InstanceId 资产ID，DeviceName 资产名称，Ip 内外IP，Account 资产账号，LastChangeStatus 上次改密状态。
     * @param Filters 过滤数组，支持：InstanceId 资产ID，DeviceName 资产名称，Ip 内外IP，Account 资产账号，LastChangeStatus 上次改密状态。
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 分页偏移位置，默认0 
     * @return Offset 分页偏移位置，默认0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移位置，默认0
     * @param Offset 分页偏移位置，默认0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 每页条目。默认20 
     * @return Limit 每页条目。默认20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页条目。默认20
     * @param Limit 每页条目。默认20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeChangePwdTaskDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeChangePwdTaskDetailRequest(DescribeChangePwdTaskDetailRequest source) {
        if (source.OperationId != null) {
            this.OperationId = new String(source.OperationId);
        }
        if (source.DepartmentId != null) {
            this.DepartmentId = new String(source.DepartmentId);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OperationId", this.OperationId);
        this.setParamSimple(map, prefix + "DepartmentId", this.DepartmentId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

