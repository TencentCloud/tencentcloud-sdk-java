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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDataAssetsRequest extends AbstractModel {

    /**
    * 请求来源，WEB 前端；CLIENT 客户端
    */
    @SerializedName("RequestFromSource")
    @Expose
    private String RequestFromSource;

    /**
    * 过滤字段名称
Name 取值如下
      keyword 搜索关键字
      bizCatalogIds 表示目录分类取值
      DataAssetType 数据资产类型枚举取值：ALL-全部类型、TABLE-数据表
      DatasourceType 数据源类型
      datasourceIds 数据源ID列表
      DatabaseName 数据库名称
      InCharge 负责人
      ProjectId 项目ID
      Label 标签
      ProjectId 数据资产归属的项目ID
      AssetLevel 等级 取值：ALL-全部，40-核心，30-重要，20-一般，10-临时
      OwnerMe 我负责的
      PermissionMe 我有权限的
      MyFavorite 我收藏的
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 排序字段列表
取值：
     Name： Table-按表名，LikeCount-按热度
     Direction： ASC, DESC
    */
    @SerializedName("OrderFields")
    @Expose
    private OrderField [] OrderFields;

    /**
    * 页码，配合pageSize使用
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 每页数目，配合pageNumber使用
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get 请求来源，WEB 前端；CLIENT 客户端 
     * @return RequestFromSource 请求来源，WEB 前端；CLIENT 客户端
     */
    public String getRequestFromSource() {
        return this.RequestFromSource;
    }

    /**
     * Set 请求来源，WEB 前端；CLIENT 客户端
     * @param RequestFromSource 请求来源，WEB 前端；CLIENT 客户端
     */
    public void setRequestFromSource(String RequestFromSource) {
        this.RequestFromSource = RequestFromSource;
    }

    /**
     * Get 过滤字段名称
Name 取值如下
      keyword 搜索关键字
      bizCatalogIds 表示目录分类取值
      DataAssetType 数据资产类型枚举取值：ALL-全部类型、TABLE-数据表
      DatasourceType 数据源类型
      datasourceIds 数据源ID列表
      DatabaseName 数据库名称
      InCharge 负责人
      ProjectId 项目ID
      Label 标签
      ProjectId 数据资产归属的项目ID
      AssetLevel 等级 取值：ALL-全部，40-核心，30-重要，20-一般，10-临时
      OwnerMe 我负责的
      PermissionMe 我有权限的
      MyFavorite 我收藏的 
     * @return Filters 过滤字段名称
Name 取值如下
      keyword 搜索关键字
      bizCatalogIds 表示目录分类取值
      DataAssetType 数据资产类型枚举取值：ALL-全部类型、TABLE-数据表
      DatasourceType 数据源类型
      datasourceIds 数据源ID列表
      DatabaseName 数据库名称
      InCharge 负责人
      ProjectId 项目ID
      Label 标签
      ProjectId 数据资产归属的项目ID
      AssetLevel 等级 取值：ALL-全部，40-核心，30-重要，20-一般，10-临时
      OwnerMe 我负责的
      PermissionMe 我有权限的
      MyFavorite 我收藏的
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤字段名称
Name 取值如下
      keyword 搜索关键字
      bizCatalogIds 表示目录分类取值
      DataAssetType 数据资产类型枚举取值：ALL-全部类型、TABLE-数据表
      DatasourceType 数据源类型
      datasourceIds 数据源ID列表
      DatabaseName 数据库名称
      InCharge 负责人
      ProjectId 项目ID
      Label 标签
      ProjectId 数据资产归属的项目ID
      AssetLevel 等级 取值：ALL-全部，40-核心，30-重要，20-一般，10-临时
      OwnerMe 我负责的
      PermissionMe 我有权限的
      MyFavorite 我收藏的
     * @param Filters 过滤字段名称
Name 取值如下
      keyword 搜索关键字
      bizCatalogIds 表示目录分类取值
      DataAssetType 数据资产类型枚举取值：ALL-全部类型、TABLE-数据表
      DatasourceType 数据源类型
      datasourceIds 数据源ID列表
      DatabaseName 数据库名称
      InCharge 负责人
      ProjectId 项目ID
      Label 标签
      ProjectId 数据资产归属的项目ID
      AssetLevel 等级 取值：ALL-全部，40-核心，30-重要，20-一般，10-临时
      OwnerMe 我负责的
      PermissionMe 我有权限的
      MyFavorite 我收藏的
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 排序字段列表
取值：
     Name： Table-按表名，LikeCount-按热度
     Direction： ASC, DESC 
     * @return OrderFields 排序字段列表
取值：
     Name： Table-按表名，LikeCount-按热度
     Direction： ASC, DESC
     */
    public OrderField [] getOrderFields() {
        return this.OrderFields;
    }

    /**
     * Set 排序字段列表
取值：
     Name： Table-按表名，LikeCount-按热度
     Direction： ASC, DESC
     * @param OrderFields 排序字段列表
取值：
     Name： Table-按表名，LikeCount-按热度
     Direction： ASC, DESC
     */
    public void setOrderFields(OrderField [] OrderFields) {
        this.OrderFields = OrderFields;
    }

    /**
     * Get 页码，配合pageSize使用 
     * @return PageNumber 页码，配合pageSize使用
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 页码，配合pageSize使用
     * @param PageNumber 页码，配合pageSize使用
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 每页数目，配合pageNumber使用 
     * @return PageSize 每页数目，配合pageNumber使用
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页数目，配合pageNumber使用
     * @param PageSize 每页数目，配合pageNumber使用
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public DescribeDataAssetsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDataAssetsRequest(DescribeDataAssetsRequest source) {
        if (source.RequestFromSource != null) {
            this.RequestFromSource = new String(source.RequestFromSource);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.OrderFields != null) {
            this.OrderFields = new OrderField[source.OrderFields.length];
            for (int i = 0; i < source.OrderFields.length; i++) {
                this.OrderFields[i] = new OrderField(source.OrderFields[i]);
            }
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RequestFromSource", this.RequestFromSource);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArrayObj(map, prefix + "OrderFields.", this.OrderFields);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

