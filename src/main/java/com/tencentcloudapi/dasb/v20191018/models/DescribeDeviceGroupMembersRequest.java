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
package com.tencentcloudapi.dasb.v20191018.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDeviceGroupMembersRequest extends AbstractModel{

    /**
    * 资产组ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * true - 查询已在该资产组的资产，false - 查询未在该资产组的资产
    */
    @SerializedName("Bound")
    @Expose
    private Boolean Bound;

    /**
    * 资产名或资产IP，模糊查询
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 分页偏移位置，默认值为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 每页条目数，默认20, 最大500
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 资产类型，1 - Linux，2 - Windows，3 - MySQL，4 - SQLServer
    */
    @SerializedName("Kind")
    @Expose
    private Long Kind;

    /**
    * 所属部门ID
    */
    @SerializedName("DepartmentId")
    @Expose
    private String DepartmentId;

    /**
    * 过滤条件，可按照标签键、标签进行过滤。如果同时指定标签键和标签过滤条件，它们之间为“AND”的关系
    */
    @SerializedName("TagFilters")
    @Expose
    private TagFilter [] TagFilters;

    /**
     * Get 资产组ID 
     * @return Id 资产组ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 资产组ID
     * @param Id 资产组ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get true - 查询已在该资产组的资产，false - 查询未在该资产组的资产 
     * @return Bound true - 查询已在该资产组的资产，false - 查询未在该资产组的资产
     */
    public Boolean getBound() {
        return this.Bound;
    }

    /**
     * Set true - 查询已在该资产组的资产，false - 查询未在该资产组的资产
     * @param Bound true - 查询已在该资产组的资产，false - 查询未在该资产组的资产
     */
    public void setBound(Boolean Bound) {
        this.Bound = Bound;
    }

    /**
     * Get 资产名或资产IP，模糊查询 
     * @return Name 资产名或资产IP，模糊查询
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 资产名或资产IP，模糊查询
     * @param Name 资产名或资产IP，模糊查询
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 分页偏移位置，默认值为0 
     * @return Offset 分页偏移位置，默认值为0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移位置，默认值为0
     * @param Offset 分页偏移位置，默认值为0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 每页条目数，默认20, 最大500 
     * @return Limit 每页条目数，默认20, 最大500
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页条目数，默认20, 最大500
     * @param Limit 每页条目数，默认20, 最大500
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 资产类型，1 - Linux，2 - Windows，3 - MySQL，4 - SQLServer 
     * @return Kind 资产类型，1 - Linux，2 - Windows，3 - MySQL，4 - SQLServer
     */
    public Long getKind() {
        return this.Kind;
    }

    /**
     * Set 资产类型，1 - Linux，2 - Windows，3 - MySQL，4 - SQLServer
     * @param Kind 资产类型，1 - Linux，2 - Windows，3 - MySQL，4 - SQLServer
     */
    public void setKind(Long Kind) {
        this.Kind = Kind;
    }

    /**
     * Get 所属部门ID 
     * @return DepartmentId 所属部门ID
     */
    public String getDepartmentId() {
        return this.DepartmentId;
    }

    /**
     * Set 所属部门ID
     * @param DepartmentId 所属部门ID
     */
    public void setDepartmentId(String DepartmentId) {
        this.DepartmentId = DepartmentId;
    }

    /**
     * Get 过滤条件，可按照标签键、标签进行过滤。如果同时指定标签键和标签过滤条件，它们之间为“AND”的关系 
     * @return TagFilters 过滤条件，可按照标签键、标签进行过滤。如果同时指定标签键和标签过滤条件，它们之间为“AND”的关系
     */
    public TagFilter [] getTagFilters() {
        return this.TagFilters;
    }

    /**
     * Set 过滤条件，可按照标签键、标签进行过滤。如果同时指定标签键和标签过滤条件，它们之间为“AND”的关系
     * @param TagFilters 过滤条件，可按照标签键、标签进行过滤。如果同时指定标签键和标签过滤条件，它们之间为“AND”的关系
     */
    public void setTagFilters(TagFilter [] TagFilters) {
        this.TagFilters = TagFilters;
    }

    public DescribeDeviceGroupMembersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDeviceGroupMembersRequest(DescribeDeviceGroupMembersRequest source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Bound != null) {
            this.Bound = new Boolean(source.Bound);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Kind != null) {
            this.Kind = new Long(source.Kind);
        }
        if (source.DepartmentId != null) {
            this.DepartmentId = new String(source.DepartmentId);
        }
        if (source.TagFilters != null) {
            this.TagFilters = new TagFilter[source.TagFilters.length];
            for (int i = 0; i < source.TagFilters.length; i++) {
                this.TagFilters[i] = new TagFilter(source.TagFilters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Bound", this.Bound);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Kind", this.Kind);
        this.setParamSimple(map, prefix + "DepartmentId", this.DepartmentId);
        this.setParamArrayObj(map, prefix + "TagFilters.", this.TagFilters);

    }
}

