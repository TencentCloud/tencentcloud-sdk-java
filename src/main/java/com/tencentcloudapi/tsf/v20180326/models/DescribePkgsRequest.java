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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePkgsRequest extends AbstractModel {

    /**
    * 应用ID，通过调用DescribeApplications接口[获取应用列表](https://cloud.tencent.com/document/api/649/36090)从而获取应用ID，或登录[控制台](https://console.cloud.tencent.com/tsf/app?rid=1)进行查看，调用CreateApplication接口[创建应用](https://cloud.tencent.com/document/product/649/36094)时的返回值
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 查询关键字（支持根据包ID，包名，包版本号搜索）
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
    * 排序关键字（默认值"UploadTime"），允许值："UploadTime"上传时间, "name"程序包名, "size"应用大小, "id"程序包ID
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 升序：0/降序：1（默认降序）
    */
    @SerializedName("OrderType")
    @Expose
    private Long OrderType;

    /**
    * 查询起始偏移，大于等于0，默认值为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量限制
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 程序包仓库类型，允许值："public-demo"TSF公共demo仓库, "private"自定义仓库, "default"TSF公共仓库
    */
    @SerializedName("RepositoryType")
    @Expose
    private String RepositoryType;

    /**
    * 仓库ID，可通过调用[仓库信息查询类](https://cloud.tencent.com/document/api/649/45925)接口时出参中的RepositoryId，或登录[控制台](https://console.cloud.tencent.com/tsf/product?rid=1)进行查看
    */
    @SerializedName("RepositoryId")
    @Expose
    private String RepositoryId;

    /**
    * 程序包类型数组支持（fatjar jar war tar.gz zip）
    */
    @SerializedName("PackageTypeList")
    @Expose
    private String [] PackageTypeList;

    /**
     * Get 应用ID，通过调用DescribeApplications接口[获取应用列表](https://cloud.tencent.com/document/api/649/36090)从而获取应用ID，或登录[控制台](https://console.cloud.tencent.com/tsf/app?rid=1)进行查看，调用CreateApplication接口[创建应用](https://cloud.tencent.com/document/product/649/36094)时的返回值 
     * @return ApplicationId 应用ID，通过调用DescribeApplications接口[获取应用列表](https://cloud.tencent.com/document/api/649/36090)从而获取应用ID，或登录[控制台](https://console.cloud.tencent.com/tsf/app?rid=1)进行查看，调用CreateApplication接口[创建应用](https://cloud.tencent.com/document/product/649/36094)时的返回值
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 应用ID，通过调用DescribeApplications接口[获取应用列表](https://cloud.tencent.com/document/api/649/36090)从而获取应用ID，或登录[控制台](https://console.cloud.tencent.com/tsf/app?rid=1)进行查看，调用CreateApplication接口[创建应用](https://cloud.tencent.com/document/product/649/36094)时的返回值
     * @param ApplicationId 应用ID，通过调用DescribeApplications接口[获取应用列表](https://cloud.tencent.com/document/api/649/36090)从而获取应用ID，或登录[控制台](https://console.cloud.tencent.com/tsf/app?rid=1)进行查看，调用CreateApplication接口[创建应用](https://cloud.tencent.com/document/product/649/36094)时的返回值
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get 查询关键字（支持根据包ID，包名，包版本号搜索） 
     * @return SearchWord 查询关键字（支持根据包ID，包名，包版本号搜索）
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set 查询关键字（支持根据包ID，包名，包版本号搜索）
     * @param SearchWord 查询关键字（支持根据包ID，包名，包版本号搜索）
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
    }

    /**
     * Get 排序关键字（默认值"UploadTime"），允许值："UploadTime"上传时间, "name"程序包名, "size"应用大小, "id"程序包ID 
     * @return OrderBy 排序关键字（默认值"UploadTime"），允许值："UploadTime"上传时间, "name"程序包名, "size"应用大小, "id"程序包ID
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 排序关键字（默认值"UploadTime"），允许值："UploadTime"上传时间, "name"程序包名, "size"应用大小, "id"程序包ID
     * @param OrderBy 排序关键字（默认值"UploadTime"），允许值："UploadTime"上传时间, "name"程序包名, "size"应用大小, "id"程序包ID
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 升序：0/降序：1（默认降序） 
     * @return OrderType 升序：0/降序：1（默认降序）
     */
    public Long getOrderType() {
        return this.OrderType;
    }

    /**
     * Set 升序：0/降序：1（默认降序）
     * @param OrderType 升序：0/降序：1（默认降序）
     */
    public void setOrderType(Long OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get 查询起始偏移，大于等于0，默认值为0 
     * @return Offset 查询起始偏移，大于等于0，默认值为0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 查询起始偏移，大于等于0，默认值为0
     * @param Offset 查询起始偏移，大于等于0，默认值为0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量限制 
     * @return Limit 返回数量限制
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量限制
     * @param Limit 返回数量限制
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 程序包仓库类型，允许值："public-demo"TSF公共demo仓库, "private"自定义仓库, "default"TSF公共仓库 
     * @return RepositoryType 程序包仓库类型，允许值："public-demo"TSF公共demo仓库, "private"自定义仓库, "default"TSF公共仓库
     */
    public String getRepositoryType() {
        return this.RepositoryType;
    }

    /**
     * Set 程序包仓库类型，允许值："public-demo"TSF公共demo仓库, "private"自定义仓库, "default"TSF公共仓库
     * @param RepositoryType 程序包仓库类型，允许值："public-demo"TSF公共demo仓库, "private"自定义仓库, "default"TSF公共仓库
     */
    public void setRepositoryType(String RepositoryType) {
        this.RepositoryType = RepositoryType;
    }

    /**
     * Get 仓库ID，可通过调用[仓库信息查询类](https://cloud.tencent.com/document/api/649/45925)接口时出参中的RepositoryId，或登录[控制台](https://console.cloud.tencent.com/tsf/product?rid=1)进行查看 
     * @return RepositoryId 仓库ID，可通过调用[仓库信息查询类](https://cloud.tencent.com/document/api/649/45925)接口时出参中的RepositoryId，或登录[控制台](https://console.cloud.tencent.com/tsf/product?rid=1)进行查看
     */
    public String getRepositoryId() {
        return this.RepositoryId;
    }

    /**
     * Set 仓库ID，可通过调用[仓库信息查询类](https://cloud.tencent.com/document/api/649/45925)接口时出参中的RepositoryId，或登录[控制台](https://console.cloud.tencent.com/tsf/product?rid=1)进行查看
     * @param RepositoryId 仓库ID，可通过调用[仓库信息查询类](https://cloud.tencent.com/document/api/649/45925)接口时出参中的RepositoryId，或登录[控制台](https://console.cloud.tencent.com/tsf/product?rid=1)进行查看
     */
    public void setRepositoryId(String RepositoryId) {
        this.RepositoryId = RepositoryId;
    }

    /**
     * Get 程序包类型数组支持（fatjar jar war tar.gz zip） 
     * @return PackageTypeList 程序包类型数组支持（fatjar jar war tar.gz zip）
     */
    public String [] getPackageTypeList() {
        return this.PackageTypeList;
    }

    /**
     * Set 程序包类型数组支持（fatjar jar war tar.gz zip）
     * @param PackageTypeList 程序包类型数组支持（fatjar jar war tar.gz zip）
     */
    public void setPackageTypeList(String [] PackageTypeList) {
        this.PackageTypeList = PackageTypeList;
    }

    public DescribePkgsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePkgsRequest(DescribePkgsRequest source) {
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.SearchWord != null) {
            this.SearchWord = new String(source.SearchWord);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.OrderType != null) {
            this.OrderType = new Long(source.OrderType);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.RepositoryType != null) {
            this.RepositoryType = new String(source.RepositoryType);
        }
        if (source.RepositoryId != null) {
            this.RepositoryId = new String(source.RepositoryId);
        }
        if (source.PackageTypeList != null) {
            this.PackageTypeList = new String[source.PackageTypeList.length];
            for (int i = 0; i < source.PackageTypeList.length; i++) {
                this.PackageTypeList[i] = new String(source.PackageTypeList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "SearchWord", this.SearchWord);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "RepositoryType", this.RepositoryType);
        this.setParamSimple(map, prefix + "RepositoryId", this.RepositoryId);
        this.setParamArraySimple(map, prefix + "PackageTypeList.", this.PackageTypeList);

    }
}

