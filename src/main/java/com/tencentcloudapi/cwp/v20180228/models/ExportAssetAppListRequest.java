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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExportAssetAppListRequest extends AbstractModel {

    /**
    * 查询指定Quuid主机的信息
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * 过滤条件。<li>AppName- string - 是否必填：否 - 应用名搜索</li><li>IP - String - 是否必填：否 - 主机ip</li><li>MachineName - String - 是否必填：否 - 主机名称</li><li>InstanceID - string - 是否必填：否 - 实例ID</li><li>Type - int - 是否必填：否 - 类型	: 仅linux0: 全部1: 运维2 : 数据库3 : 安全4 : 可疑应用5 : 系统架构6 : 系统应用7 : WEB服务99:其他</li><li>OsType - uint64 - 是否必填：否 - Windows/Linux</li>
    */
    @SerializedName("Filters")
    @Expose
    private AssetFilters [] Filters;

    /**
    * 排序方式，asc升序 或 desc降序
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 排序方式：[FirstTime|ProcessCount]
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get 查询指定Quuid主机的信息 
     * @return Quuid 查询指定Quuid主机的信息
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set 查询指定Quuid主机的信息
     * @param Quuid 查询指定Quuid主机的信息
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get 过滤条件。<li>AppName- string - 是否必填：否 - 应用名搜索</li><li>IP - String - 是否必填：否 - 主机ip</li><li>MachineName - String - 是否必填：否 - 主机名称</li><li>InstanceID - string - 是否必填：否 - 实例ID</li><li>Type - int - 是否必填：否 - 类型	: 仅linux0: 全部1: 运维2 : 数据库3 : 安全4 : 可疑应用5 : 系统架构6 : 系统应用7 : WEB服务99:其他</li><li>OsType - uint64 - 是否必填：否 - Windows/Linux</li> 
     * @return Filters 过滤条件。<li>AppName- string - 是否必填：否 - 应用名搜索</li><li>IP - String - 是否必填：否 - 主机ip</li><li>MachineName - String - 是否必填：否 - 主机名称</li><li>InstanceID - string - 是否必填：否 - 实例ID</li><li>Type - int - 是否必填：否 - 类型	: 仅linux0: 全部1: 运维2 : 数据库3 : 安全4 : 可疑应用5 : 系统架构6 : 系统应用7 : WEB服务99:其他</li><li>OsType - uint64 - 是否必填：否 - Windows/Linux</li>
     */
    public AssetFilters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件。<li>AppName- string - 是否必填：否 - 应用名搜索</li><li>IP - String - 是否必填：否 - 主机ip</li><li>MachineName - String - 是否必填：否 - 主机名称</li><li>InstanceID - string - 是否必填：否 - 实例ID</li><li>Type - int - 是否必填：否 - 类型	: 仅linux0: 全部1: 运维2 : 数据库3 : 安全4 : 可疑应用5 : 系统架构6 : 系统应用7 : WEB服务99:其他</li><li>OsType - uint64 - 是否必填：否 - Windows/Linux</li>
     * @param Filters 过滤条件。<li>AppName- string - 是否必填：否 - 应用名搜索</li><li>IP - String - 是否必填：否 - 主机ip</li><li>MachineName - String - 是否必填：否 - 主机名称</li><li>InstanceID - string - 是否必填：否 - 实例ID</li><li>Type - int - 是否必填：否 - 类型	: 仅linux0: 全部1: 运维2 : 数据库3 : 安全4 : 可疑应用5 : 系统架构6 : 系统应用7 : WEB服务99:其他</li><li>OsType - uint64 - 是否必填：否 - Windows/Linux</li>
     */
    public void setFilters(AssetFilters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 排序方式，asc升序 或 desc降序 
     * @return Order 排序方式，asc升序 或 desc降序
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 排序方式，asc升序 或 desc降序
     * @param Order 排序方式，asc升序 或 desc降序
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get 排序方式：[FirstTime|ProcessCount] 
     * @return By 排序方式：[FirstTime|ProcessCount]
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set 排序方式：[FirstTime|ProcessCount]
     * @param By 排序方式：[FirstTime|ProcessCount]
     */
    public void setBy(String By) {
        this.By = By;
    }

    public ExportAssetAppListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportAssetAppListRequest(ExportAssetAppListRequest source) {
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.Filters != null) {
            this.Filters = new AssetFilters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new AssetFilters(source.Filters[i]);
            }
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}

