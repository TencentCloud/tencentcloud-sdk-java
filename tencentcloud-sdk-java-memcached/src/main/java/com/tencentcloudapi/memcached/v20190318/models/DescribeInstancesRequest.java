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
package com.tencentcloudapi.memcached.v20190318.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstancesRequest extends AbstractModel{

    /**
    * 实例ID组成的数组，数组下标从0开始
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 实例名称组成的数组，数组下标从0开始
    */
    @SerializedName("InstanceNames")
    @Expose
    private String [] InstanceNames;

    /**
    * 实例列表的大小，参数默认值100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量，取Limit整数倍
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 枚举范围： AddTimeStamp, InstanceName, ProjectId
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 0倒序，1正序，默认倒序
    */
    @SerializedName("OrderType")
    @Expose
    private Long OrderType;

    /**
    * 项目ID组成的数组，数组下标从0开始
    */
    @SerializedName("ProjectIds")
    @Expose
    private Long [] ProjectIds;

    /**
    * 搜索关键词：支持实例ID、实例名称、完整IP
    */
    @SerializedName("SearchKeys")
    @Expose
    private String [] SearchKeys;

    /**
    * 子网ID数组，数组下标从0开始，如：subnet-fdj24n34j2
    */
    @SerializedName("UniqSubnetIds")
    @Expose
    private String [] UniqSubnetIds;

    /**
    * 私有网络ID数组，数组下标从0开始，如果不传则默认选择基础网络，如：vpc-sad23jfdfk
    */
    @SerializedName("UniqVpcIds")
    @Expose
    private String [] UniqVpcIds;

    /**
    * 实例服务IP组成的数组，数组下标从0开始
    */
    @SerializedName("Vips")
    @Expose
    private String [] Vips;

    /**
     * Get 实例ID组成的数组，数组下标从0开始 
     * @return InstanceIds 实例ID组成的数组，数组下标从0开始
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 实例ID组成的数组，数组下标从0开始
     * @param InstanceIds 实例ID组成的数组，数组下标从0开始
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 实例名称组成的数组，数组下标从0开始 
     * @return InstanceNames 实例名称组成的数组，数组下标从0开始
     */
    public String [] getInstanceNames() {
        return this.InstanceNames;
    }

    /**
     * Set 实例名称组成的数组，数组下标从0开始
     * @param InstanceNames 实例名称组成的数组，数组下标从0开始
     */
    public void setInstanceNames(String [] InstanceNames) {
        this.InstanceNames = InstanceNames;
    }

    /**
     * Get 实例列表的大小，参数默认值100 
     * @return Limit 实例列表的大小，参数默认值100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 实例列表的大小，参数默认值100
     * @param Limit 实例列表的大小，参数默认值100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量，取Limit整数倍 
     * @return Offset 偏移量，取Limit整数倍
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，取Limit整数倍
     * @param Offset 偏移量，取Limit整数倍
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 枚举范围： AddTimeStamp, InstanceName, ProjectId 
     * @return OrderBy 枚举范围： AddTimeStamp, InstanceName, ProjectId
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 枚举范围： AddTimeStamp, InstanceName, ProjectId
     * @param OrderBy 枚举范围： AddTimeStamp, InstanceName, ProjectId
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 0倒序，1正序，默认倒序 
     * @return OrderType 0倒序，1正序，默认倒序
     */
    public Long getOrderType() {
        return this.OrderType;
    }

    /**
     * Set 0倒序，1正序，默认倒序
     * @param OrderType 0倒序，1正序，默认倒序
     */
    public void setOrderType(Long OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get 项目ID组成的数组，数组下标从0开始 
     * @return ProjectIds 项目ID组成的数组，数组下标从0开始
     */
    public Long [] getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set 项目ID组成的数组，数组下标从0开始
     * @param ProjectIds 项目ID组成的数组，数组下标从0开始
     */
    public void setProjectIds(Long [] ProjectIds) {
        this.ProjectIds = ProjectIds;
    }

    /**
     * Get 搜索关键词：支持实例ID、实例名称、完整IP 
     * @return SearchKeys 搜索关键词：支持实例ID、实例名称、完整IP
     */
    public String [] getSearchKeys() {
        return this.SearchKeys;
    }

    /**
     * Set 搜索关键词：支持实例ID、实例名称、完整IP
     * @param SearchKeys 搜索关键词：支持实例ID、实例名称、完整IP
     */
    public void setSearchKeys(String [] SearchKeys) {
        this.SearchKeys = SearchKeys;
    }

    /**
     * Get 子网ID数组，数组下标从0开始，如：subnet-fdj24n34j2 
     * @return UniqSubnetIds 子网ID数组，数组下标从0开始，如：subnet-fdj24n34j2
     */
    public String [] getUniqSubnetIds() {
        return this.UniqSubnetIds;
    }

    /**
     * Set 子网ID数组，数组下标从0开始，如：subnet-fdj24n34j2
     * @param UniqSubnetIds 子网ID数组，数组下标从0开始，如：subnet-fdj24n34j2
     */
    public void setUniqSubnetIds(String [] UniqSubnetIds) {
        this.UniqSubnetIds = UniqSubnetIds;
    }

    /**
     * Get 私有网络ID数组，数组下标从0开始，如果不传则默认选择基础网络，如：vpc-sad23jfdfk 
     * @return UniqVpcIds 私有网络ID数组，数组下标从0开始，如果不传则默认选择基础网络，如：vpc-sad23jfdfk
     */
    public String [] getUniqVpcIds() {
        return this.UniqVpcIds;
    }

    /**
     * Set 私有网络ID数组，数组下标从0开始，如果不传则默认选择基础网络，如：vpc-sad23jfdfk
     * @param UniqVpcIds 私有网络ID数组，数组下标从0开始，如果不传则默认选择基础网络，如：vpc-sad23jfdfk
     */
    public void setUniqVpcIds(String [] UniqVpcIds) {
        this.UniqVpcIds = UniqVpcIds;
    }

    /**
     * Get 实例服务IP组成的数组，数组下标从0开始 
     * @return Vips 实例服务IP组成的数组，数组下标从0开始
     */
    public String [] getVips() {
        return this.Vips;
    }

    /**
     * Set 实例服务IP组成的数组，数组下标从0开始
     * @param Vips 实例服务IP组成的数组，数组下标从0开始
     */
    public void setVips(String [] Vips) {
        this.Vips = Vips;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamArraySimple(map, prefix + "InstanceNames.", this.InstanceNames);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);
        this.setParamArraySimple(map, prefix + "ProjectIds.", this.ProjectIds);
        this.setParamArraySimple(map, prefix + "SearchKeys.", this.SearchKeys);
        this.setParamArraySimple(map, prefix + "UniqSubnetIds.", this.UniqSubnetIds);
        this.setParamArraySimple(map, prefix + "UniqVpcIds.", this.UniqVpcIds);
        this.setParamArraySimple(map, prefix + "Vips.", this.Vips);

    }
}

