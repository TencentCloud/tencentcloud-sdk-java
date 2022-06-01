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

public class DescribeInstanceListRequest extends AbstractModel{

    /**
    * 分页返回数量
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 排序字段，createTime,instancename两者之一
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 排序规则，desc,asc两者之一
    */
    @SerializedName("SortBy")
    @Expose
    private String SortBy;

    /**
    * 按产品过滤，0:CDB, 1:TDSQL
    */
    @SerializedName("ProductId")
    @Expose
    private Long [] ProductId;

    /**
    * 按实例ID过滤
    */
    @SerializedName("InstanceId")
    @Expose
    private String [] InstanceId;

    /**
    * 按实例名称过滤
    */
    @SerializedName("InstanceName")
    @Expose
    private String [] InstanceName;

    /**
    * 按金融围笼ID过滤
    */
    @SerializedName("FenceId")
    @Expose
    private String [] FenceId;

    /**
    * 按实例状态过滤, -1:已隔离, 0:创建中, 1:运行中, 2:扩容中, 3:删除中
    */
    @SerializedName("Status")
    @Expose
    private Long [] Status;

    /**
     * Get 分页返回数量 
     * @return Limit 分页返回数量
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页返回数量
     * @param Limit 分页返回数量
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页偏移量 
     * @return Offset 分页偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移量
     * @param Offset 分页偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 排序字段，createTime,instancename两者之一 
     * @return OrderBy 排序字段，createTime,instancename两者之一
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 排序字段，createTime,instancename两者之一
     * @param OrderBy 排序字段，createTime,instancename两者之一
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 排序规则，desc,asc两者之一 
     * @return SortBy 排序规则，desc,asc两者之一
     */
    public String getSortBy() {
        return this.SortBy;
    }

    /**
     * Set 排序规则，desc,asc两者之一
     * @param SortBy 排序规则，desc,asc两者之一
     */
    public void setSortBy(String SortBy) {
        this.SortBy = SortBy;
    }

    /**
     * Get 按产品过滤，0:CDB, 1:TDSQL 
     * @return ProductId 按产品过滤，0:CDB, 1:TDSQL
     */
    public Long [] getProductId() {
        return this.ProductId;
    }

    /**
     * Set 按产品过滤，0:CDB, 1:TDSQL
     * @param ProductId 按产品过滤，0:CDB, 1:TDSQL
     */
    public void setProductId(Long [] ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 按实例ID过滤 
     * @return InstanceId 按实例ID过滤
     */
    public String [] getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 按实例ID过滤
     * @param InstanceId 按实例ID过滤
     */
    public void setInstanceId(String [] InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 按实例名称过滤 
     * @return InstanceName 按实例名称过滤
     */
    public String [] getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 按实例名称过滤
     * @param InstanceName 按实例名称过滤
     */
    public void setInstanceName(String [] InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 按金融围笼ID过滤 
     * @return FenceId 按金融围笼ID过滤
     */
    public String [] getFenceId() {
        return this.FenceId;
    }

    /**
     * Set 按金融围笼ID过滤
     * @param FenceId 按金融围笼ID过滤
     */
    public void setFenceId(String [] FenceId) {
        this.FenceId = FenceId;
    }

    /**
     * Get 按实例状态过滤, -1:已隔离, 0:创建中, 1:运行中, 2:扩容中, 3:删除中 
     * @return Status 按实例状态过滤, -1:已隔离, 0:创建中, 1:运行中, 2:扩容中, 3:删除中
     */
    public Long [] getStatus() {
        return this.Status;
    }

    /**
     * Set 按实例状态过滤, -1:已隔离, 0:创建中, 1:运行中, 2:扩容中, 3:删除中
     * @param Status 按实例状态过滤, -1:已隔离, 0:创建中, 1:运行中, 2:扩容中, 3:删除中
     */
    public void setStatus(Long [] Status) {
        this.Status = Status;
    }

    public DescribeInstanceListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceListRequest(DescribeInstanceListRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.SortBy != null) {
            this.SortBy = new String(source.SortBy);
        }
        if (source.ProductId != null) {
            this.ProductId = new Long[source.ProductId.length];
            for (int i = 0; i < source.ProductId.length; i++) {
                this.ProductId[i] = new Long(source.ProductId[i]);
            }
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String[source.InstanceId.length];
            for (int i = 0; i < source.InstanceId.length; i++) {
                this.InstanceId[i] = new String(source.InstanceId[i]);
            }
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String[source.InstanceName.length];
            for (int i = 0; i < source.InstanceName.length; i++) {
                this.InstanceName[i] = new String(source.InstanceName[i]);
            }
        }
        if (source.FenceId != null) {
            this.FenceId = new String[source.FenceId.length];
            for (int i = 0; i < source.FenceId.length; i++) {
                this.FenceId[i] = new String(source.FenceId[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long[source.Status.length];
            for (int i = 0; i < source.Status.length; i++) {
                this.Status[i] = new Long(source.Status[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "SortBy", this.SortBy);
        this.setParamArraySimple(map, prefix + "ProductId.", this.ProductId);
        this.setParamArraySimple(map, prefix + "InstanceId.", this.InstanceId);
        this.setParamArraySimple(map, prefix + "InstanceName.", this.InstanceName);
        this.setParamArraySimple(map, prefix + "FenceId.", this.FenceId);
        this.setParamArraySimple(map, prefix + "Status.", this.Status);

    }
}

