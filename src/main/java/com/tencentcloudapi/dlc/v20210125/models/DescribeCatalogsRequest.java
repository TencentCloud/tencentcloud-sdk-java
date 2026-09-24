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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCatalogsRequest extends AbstractModel {

    /**
    * <p>数据目录 ID</p>
    */
    @SerializedName("CatalogId")
    @Expose
    private String CatalogId;

    /**
    * <p>数据目录名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>操作人 uin</p>
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * <p>排序字段，支持 CreateTime / UpdateTime（默认 UpdateTime）</p>
    */
    @SerializedName("Sort")
    @Expose
    private String Sort;

    /**
    * <p>true:升序（默认）/ false:降序</p>
    */
    @SerializedName("Asc")
    @Expose
    private String Asc;

    /**
    * <p>分页大小</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>分页偏移</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>状态：0 注册中 / 1 待测试 / 2 连接成功 / 3 连接失败 / 4 删除中 / 5 已删除</p><p>枚举值：</p><ul><li>0： 注册中</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>数据目录类型</p><p>枚举值：</p><ul><li>LAKEHOUSE： lakehouse类型</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>在这个时间之后创建（时间戳）</p>
    */
    @SerializedName("CreatedAfter")
    @Expose
    private Long CreatedAfter;

    /**
    * <p>在这个时间之前创建（时间戳）</p>
    */
    @SerializedName("CreatedBefore")
    @Expose
    private Long CreatedBefore;

    /**
     * Get <p>数据目录 ID</p> 
     * @return CatalogId <p>数据目录 ID</p>
     */
    public String getCatalogId() {
        return this.CatalogId;
    }

    /**
     * Set <p>数据目录 ID</p>
     * @param CatalogId <p>数据目录 ID</p>
     */
    public void setCatalogId(String CatalogId) {
        this.CatalogId = CatalogId;
    }

    /**
     * Get <p>数据目录名称</p> 
     * @return Name <p>数据目录名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>数据目录名称</p>
     * @param Name <p>数据目录名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>操作人 uin</p> 
     * @return Operator <p>操作人 uin</p>
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set <p>操作人 uin</p>
     * @param Operator <p>操作人 uin</p>
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get <p>排序字段，支持 CreateTime / UpdateTime（默认 UpdateTime）</p> 
     * @return Sort <p>排序字段，支持 CreateTime / UpdateTime（默认 UpdateTime）</p>
     */
    public String getSort() {
        return this.Sort;
    }

    /**
     * Set <p>排序字段，支持 CreateTime / UpdateTime（默认 UpdateTime）</p>
     * @param Sort <p>排序字段，支持 CreateTime / UpdateTime（默认 UpdateTime）</p>
     */
    public void setSort(String Sort) {
        this.Sort = Sort;
    }

    /**
     * Get <p>true:升序（默认）/ false:降序</p> 
     * @return Asc <p>true:升序（默认）/ false:降序</p>
     */
    public String getAsc() {
        return this.Asc;
    }

    /**
     * Set <p>true:升序（默认）/ false:降序</p>
     * @param Asc <p>true:升序（默认）/ false:降序</p>
     */
    public void setAsc(String Asc) {
        this.Asc = Asc;
    }

    /**
     * Get <p>分页大小</p> 
     * @return Limit <p>分页大小</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>分页大小</p>
     * @param Limit <p>分页大小</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>分页偏移</p> 
     * @return Offset <p>分页偏移</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页偏移</p>
     * @param Offset <p>分页偏移</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>状态：0 注册中 / 1 待测试 / 2 连接成功 / 3 连接失败 / 4 删除中 / 5 已删除</p><p>枚举值：</p><ul><li>0： 注册中</li></ul> 
     * @return Status <p>状态：0 注册中 / 1 待测试 / 2 连接成功 / 3 连接失败 / 4 删除中 / 5 已删除</p><p>枚举值：</p><ul><li>0： 注册中</li></ul>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态：0 注册中 / 1 待测试 / 2 连接成功 / 3 连接失败 / 4 删除中 / 5 已删除</p><p>枚举值：</p><ul><li>0： 注册中</li></ul>
     * @param Status <p>状态：0 注册中 / 1 待测试 / 2 连接成功 / 3 连接失败 / 4 删除中 / 5 已删除</p><p>枚举值：</p><ul><li>0： 注册中</li></ul>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>数据目录类型</p><p>枚举值：</p><ul><li>LAKEHOUSE： lakehouse类型</li></ul> 
     * @return Type <p>数据目录类型</p><p>枚举值：</p><ul><li>LAKEHOUSE： lakehouse类型</li></ul>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>数据目录类型</p><p>枚举值：</p><ul><li>LAKEHOUSE： lakehouse类型</li></ul>
     * @param Type <p>数据目录类型</p><p>枚举值：</p><ul><li>LAKEHOUSE： lakehouse类型</li></ul>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>在这个时间之后创建（时间戳）</p> 
     * @return CreatedAfter <p>在这个时间之后创建（时间戳）</p>
     */
    public Long getCreatedAfter() {
        return this.CreatedAfter;
    }

    /**
     * Set <p>在这个时间之后创建（时间戳）</p>
     * @param CreatedAfter <p>在这个时间之后创建（时间戳）</p>
     */
    public void setCreatedAfter(Long CreatedAfter) {
        this.CreatedAfter = CreatedAfter;
    }

    /**
     * Get <p>在这个时间之前创建（时间戳）</p> 
     * @return CreatedBefore <p>在这个时间之前创建（时间戳）</p>
     */
    public Long getCreatedBefore() {
        return this.CreatedBefore;
    }

    /**
     * Set <p>在这个时间之前创建（时间戳）</p>
     * @param CreatedBefore <p>在这个时间之前创建（时间戳）</p>
     */
    public void setCreatedBefore(Long CreatedBefore) {
        this.CreatedBefore = CreatedBefore;
    }

    public DescribeCatalogsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCatalogsRequest(DescribeCatalogsRequest source) {
        if (source.CatalogId != null) {
            this.CatalogId = new String(source.CatalogId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.Sort != null) {
            this.Sort = new String(source.Sort);
        }
        if (source.Asc != null) {
            this.Asc = new String(source.Asc);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.CreatedAfter != null) {
            this.CreatedAfter = new Long(source.CreatedAfter);
        }
        if (source.CreatedBefore != null) {
            this.CreatedBefore = new Long(source.CreatedBefore);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CatalogId", this.CatalogId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "Sort", this.Sort);
        this.setParamSimple(map, prefix + "Asc", this.Asc);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "CreatedAfter", this.CreatedAfter);
        this.setParamSimple(map, prefix + "CreatedBefore", this.CreatedBefore);

    }
}

