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
package com.tencentcloudapi.dbdc.v20201029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstancesRequest extends AbstractModel{

    /**
    * 集群类型: 0 一主一备, 1 一主两备...N-1 一主N备
    */
    @SerializedName("InstanceTypes")
    @Expose
    private Long [] InstanceTypes;

    /**
    * 产品ID:  0 MYSQL，1 TDSQL
    */
    @SerializedName("ProductIds")
    @Expose
    private Long [] ProductIds;

    /**
    * 集群uuid: 如 dbdc-q810131s
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 是否按金融围笼标志搜索
    */
    @SerializedName("FenceFlag")
    @Expose
    private Boolean FenceFlag;

    /**
    * 按实例名字模糊匹配
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 每页数目, 整型
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 页码, 整型
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 排序字段，枚举：createtime,groupname
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 排序方式: asc升序, desc降序
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
    * 集群状态: -2 已删除, -1 已隔离, 0 创建中, 1 运行中, 2 扩容中, 3 删除中
    */
    @SerializedName("InstanceStatus")
    @Expose
    private Long InstanceStatus;

    /**
     * Get 集群类型: 0 一主一备, 1 一主两备...N-1 一主N备 
     * @return InstanceTypes 集群类型: 0 一主一备, 1 一主两备...N-1 一主N备
     */
    public Long [] getInstanceTypes() {
        return this.InstanceTypes;
    }

    /**
     * Set 集群类型: 0 一主一备, 1 一主两备...N-1 一主N备
     * @param InstanceTypes 集群类型: 0 一主一备, 1 一主两备...N-1 一主N备
     */
    public void setInstanceTypes(Long [] InstanceTypes) {
        this.InstanceTypes = InstanceTypes;
    }

    /**
     * Get 产品ID:  0 MYSQL，1 TDSQL 
     * @return ProductIds 产品ID:  0 MYSQL，1 TDSQL
     */
    public Long [] getProductIds() {
        return this.ProductIds;
    }

    /**
     * Set 产品ID:  0 MYSQL，1 TDSQL
     * @param ProductIds 产品ID:  0 MYSQL，1 TDSQL
     */
    public void setProductIds(Long [] ProductIds) {
        this.ProductIds = ProductIds;
    }

    /**
     * Get 集群uuid: 如 dbdc-q810131s 
     * @return InstanceIds 集群uuid: 如 dbdc-q810131s
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 集群uuid: 如 dbdc-q810131s
     * @param InstanceIds 集群uuid: 如 dbdc-q810131s
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 是否按金融围笼标志搜索 
     * @return FenceFlag 是否按金融围笼标志搜索
     */
    public Boolean getFenceFlag() {
        return this.FenceFlag;
    }

    /**
     * Set 是否按金融围笼标志搜索
     * @param FenceFlag 是否按金融围笼标志搜索
     */
    public void setFenceFlag(Boolean FenceFlag) {
        this.FenceFlag = FenceFlag;
    }

    /**
     * Get 按实例名字模糊匹配 
     * @return InstanceName 按实例名字模糊匹配
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 按实例名字模糊匹配
     * @param InstanceName 按实例名字模糊匹配
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 每页数目, 整型 
     * @return PageSize 每页数目, 整型
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页数目, 整型
     * @param PageSize 每页数目, 整型
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 页码, 整型 
     * @return PageNumber 页码, 整型
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 页码, 整型
     * @param PageNumber 页码, 整型
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 排序字段，枚举：createtime,groupname 
     * @return OrderBy 排序字段，枚举：createtime,groupname
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 排序字段，枚举：createtime,groupname
     * @param OrderBy 排序字段，枚举：createtime,groupname
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 排序方式: asc升序, desc降序 
     * @return OrderByType 排序方式: asc升序, desc降序
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set 排序方式: asc升序, desc降序
     * @param OrderByType 排序方式: asc升序, desc降序
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    /**
     * Get 集群状态: -2 已删除, -1 已隔离, 0 创建中, 1 运行中, 2 扩容中, 3 删除中 
     * @return InstanceStatus 集群状态: -2 已删除, -1 已隔离, 0 创建中, 1 运行中, 2 扩容中, 3 删除中
     */
    public Long getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set 集群状态: -2 已删除, -1 已隔离, 0 创建中, 1 运行中, 2 扩容中, 3 删除中
     * @param InstanceStatus 集群状态: -2 已删除, -1 已隔离, 0 创建中, 1 运行中, 2 扩容中, 3 删除中
     */
    public void setInstanceStatus(Long InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    public DescribeInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstancesRequest(DescribeInstancesRequest source) {
        if (source.InstanceTypes != null) {
            this.InstanceTypes = new Long[source.InstanceTypes.length];
            for (int i = 0; i < source.InstanceTypes.length; i++) {
                this.InstanceTypes[i] = new Long(source.InstanceTypes[i]);
            }
        }
        if (source.ProductIds != null) {
            this.ProductIds = new Long[source.ProductIds.length];
            for (int i = 0; i < source.ProductIds.length; i++) {
                this.ProductIds[i] = new Long(source.ProductIds[i]);
            }
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.FenceFlag != null) {
            this.FenceFlag = new Boolean(source.FenceFlag);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.OrderByType != null) {
            this.OrderByType = new String(source.OrderByType);
        }
        if (source.InstanceStatus != null) {
            this.InstanceStatus = new Long(source.InstanceStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceTypes.", this.InstanceTypes);
        this.setParamArraySimple(map, prefix + "ProductIds.", this.ProductIds);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "FenceFlag", this.FenceFlag);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);
        this.setParamSimple(map, prefix + "InstanceStatus", this.InstanceStatus);

    }
}

