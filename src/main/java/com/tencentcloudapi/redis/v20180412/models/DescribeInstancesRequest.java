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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstancesRequest  extends AbstractModel{

    /**
    * 实例列表的大小，参数默认值20
    */
    @SerializedName("Limit")
    @Expose
    private Integer Limit;

    /**
    * 偏移量，取Limit整数倍
    */
    @SerializedName("Offset")
    @Expose
    private Integer Offset;

    /**
    * 实例Id，如：crs-6ubhgouj
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 枚举范围： projectId,createtime,instancename,type,curDeadline
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 1倒序，0顺序，默认倒序
    */
    @SerializedName("OrderType")
    @Expose
    private Integer OrderType;

    /**
    * 私有网络ID数组，数组下标从0开始，如果不传则默认选择基础网络，如：47525
    */
    @SerializedName("VpcIds")
    @Expose
    private String [] VpcIds;

    /**
    * 子网ID数组，数组下标从0开始，如：56854
    */
    @SerializedName("SubnetIds")
    @Expose
    private String [] SubnetIds;

    /**
    * 项目ID 组成的数组，数组下标从0开始
    */
    @SerializedName("ProjectIds")
    @Expose
    private Integer [] ProjectIds;

    /**
    * 查找实例的ID。
    */
    @SerializedName("SearchKey")
    @Expose
    private String SearchKey;

    /**
    * 实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 私有网络ID数组，数组下标从0开始，如果不传则默认选择基础网络，如：vpc-sad23jfdfk
    */
    @SerializedName("UniqVpcIds")
    @Expose
    private String [] UniqVpcIds;

    /**
    * 子网ID数组，数组下标从0开始，如：subnet-fdj24n34j2
    */
    @SerializedName("UniqSubnetIds")
    @Expose
    private String [] UniqSubnetIds;

    /**
    * 地域ID，已经弃用，可通过公共参数Region查询对应地域
    */
    @SerializedName("RegionIds")
    @Expose
    private Integer [] RegionIds;

    /**
     * 获取实例列表的大小，参数默认值20
     * @return Limit 实例列表的大小，参数默认值20
     */
    public Integer getLimit() {
        return this.Limit;
    }

    /**
     * 设置实例列表的大小，参数默认值20
     * @param Limit 实例列表的大小，参数默认值20
     */
    public void setLimit(Integer Limit) {
        this.Limit = Limit;
    }

    /**
     * 获取偏移量，取Limit整数倍
     * @return Offset 偏移量，取Limit整数倍
     */
    public Integer getOffset() {
        return this.Offset;
    }

    /**
     * 设置偏移量，取Limit整数倍
     * @param Offset 偏移量，取Limit整数倍
     */
    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取实例Id，如：crs-6ubhgouj
     * @return InstanceId 实例Id，如：crs-6ubhgouj
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置实例Id，如：crs-6ubhgouj
     * @param InstanceId 实例Id，如：crs-6ubhgouj
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取枚举范围： projectId,createtime,instancename,type,curDeadline
     * @return OrderBy 枚举范围： projectId,createtime,instancename,type,curDeadline
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * 设置枚举范围： projectId,createtime,instancename,type,curDeadline
     * @param OrderBy 枚举范围： projectId,createtime,instancename,type,curDeadline
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * 获取1倒序，0顺序，默认倒序
     * @return OrderType 1倒序，0顺序，默认倒序
     */
    public Integer getOrderType() {
        return this.OrderType;
    }

    /**
     * 设置1倒序，0顺序，默认倒序
     * @param OrderType 1倒序，0顺序，默认倒序
     */
    public void setOrderType(Integer OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * 获取私有网络ID数组，数组下标从0开始，如果不传则默认选择基础网络，如：47525
     * @return VpcIds 私有网络ID数组，数组下标从0开始，如果不传则默认选择基础网络，如：47525
     */
    public String [] getVpcIds() {
        return this.VpcIds;
    }

    /**
     * 设置私有网络ID数组，数组下标从0开始，如果不传则默认选择基础网络，如：47525
     * @param VpcIds 私有网络ID数组，数组下标从0开始，如果不传则默认选择基础网络，如：47525
     */
    public void setVpcIds(String [] VpcIds) {
        this.VpcIds = VpcIds;
    }

    /**
     * 获取子网ID数组，数组下标从0开始，如：56854
     * @return SubnetIds 子网ID数组，数组下标从0开始，如：56854
     */
    public String [] getSubnetIds() {
        return this.SubnetIds;
    }

    /**
     * 设置子网ID数组，数组下标从0开始，如：56854
     * @param SubnetIds 子网ID数组，数组下标从0开始，如：56854
     */
    public void setSubnetIds(String [] SubnetIds) {
        this.SubnetIds = SubnetIds;
    }

    /**
     * 获取项目ID 组成的数组，数组下标从0开始
     * @return ProjectIds 项目ID 组成的数组，数组下标从0开始
     */
    public Integer [] getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * 设置项目ID 组成的数组，数组下标从0开始
     * @param ProjectIds 项目ID 组成的数组，数组下标从0开始
     */
    public void setProjectIds(Integer [] ProjectIds) {
        this.ProjectIds = ProjectIds;
    }

    /**
     * 获取查找实例的ID。
     * @return SearchKey 查找实例的ID。
     */
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * 设置查找实例的ID。
     * @param SearchKey 查找实例的ID。
     */
    public void setSearchKey(String SearchKey) {
        this.SearchKey = SearchKey;
    }

    /**
     * 获取实例名称
     * @return InstanceName 实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * 设置实例名称
     * @param InstanceName 实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * 获取私有网络ID数组，数组下标从0开始，如果不传则默认选择基础网络，如：vpc-sad23jfdfk
     * @return UniqVpcIds 私有网络ID数组，数组下标从0开始，如果不传则默认选择基础网络，如：vpc-sad23jfdfk
     */
    public String [] getUniqVpcIds() {
        return this.UniqVpcIds;
    }

    /**
     * 设置私有网络ID数组，数组下标从0开始，如果不传则默认选择基础网络，如：vpc-sad23jfdfk
     * @param UniqVpcIds 私有网络ID数组，数组下标从0开始，如果不传则默认选择基础网络，如：vpc-sad23jfdfk
     */
    public void setUniqVpcIds(String [] UniqVpcIds) {
        this.UniqVpcIds = UniqVpcIds;
    }

    /**
     * 获取子网ID数组，数组下标从0开始，如：subnet-fdj24n34j2
     * @return UniqSubnetIds 子网ID数组，数组下标从0开始，如：subnet-fdj24n34j2
     */
    public String [] getUniqSubnetIds() {
        return this.UniqSubnetIds;
    }

    /**
     * 设置子网ID数组，数组下标从0开始，如：subnet-fdj24n34j2
     * @param UniqSubnetIds 子网ID数组，数组下标从0开始，如：subnet-fdj24n34j2
     */
    public void setUniqSubnetIds(String [] UniqSubnetIds) {
        this.UniqSubnetIds = UniqSubnetIds;
    }

    /**
     * 获取地域ID，已经弃用，可通过公共参数Region查询对应地域
     * @return RegionIds 地域ID，已经弃用，可通过公共参数Region查询对应地域
     */
    public Integer [] getRegionIds() {
        return this.RegionIds;
    }

    /**
     * 设置地域ID，已经弃用，可通过公共参数Region查询对应地域
     * @param RegionIds 地域ID，已经弃用，可通过公共参数Region查询对应地域
     */
    public void setRegionIds(Integer [] RegionIds) {
        this.RegionIds = RegionIds;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);
        this.setParamArraySimple(map, prefix + "VpcIds.", this.VpcIds);
        this.setParamArraySimple(map, prefix + "SubnetIds.", this.SubnetIds);
        this.setParamArraySimple(map, prefix + "ProjectIds.", this.ProjectIds);
        this.setParamSimple(map, prefix + "SearchKey", this.SearchKey);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamArraySimple(map, prefix + "UniqVpcIds.", this.UniqVpcIds);
        this.setParamArraySimple(map, prefix + "UniqSubnetIds.", this.UniqSubnetIds);
        this.setParamArraySimple(map, prefix + "RegionIds.", this.RegionIds);

    }
}

