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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDataEnginesRequest extends AbstractModel{

    /**
    * 偏移量，默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 过滤类型，支持如下的过滤类型，传参Name应为以下其中一个, data-engine-name - String（数据引擎名称）：engine-type - String（引擎类型：spark：spark 引擎，presto：presto引擎），state - String (数据引擎状态 -2已删除 -1失败 0初始化中 1挂起 2运行中 3准备删除 4删除中) ， mode - String（计费模式 0共享模式 1按量计费 2包年包月） ， create-time - String（创建时间，10位时间戳） message - String （描述信息），cluster-type - String (集群资源类型 spark_private/presto_private/presto_cu/spark_cu)，engine-id - String（数据引擎ID），key-word - String（数据引擎名称或集群资源类型或描述信息模糊搜索），engine-exec-type - String（引擎执行任务类型，SQL/BATCH）
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 排序字段，支持如下字段类型，create-time
    */
    @SerializedName("SortBy")
    @Expose
    private String SortBy;

    /**
    * 排序方式，desc表示正序，asc表示反序， 默认为asc。
    */
    @SerializedName("Sorting")
    @Expose
    private String Sorting;

    /**
    * 返回数量，默认为10，最大值为100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 已废弃，请使用DatasourceConnectionNameSet
    */
    @SerializedName("DatasourceConnectionName")
    @Expose
    private String DatasourceConnectionName;

    /**
    * 是否不返回共享引擎，true不返回共享引擎，false可以返回共享引擎
    */
    @SerializedName("ExcludePublicEngine")
    @Expose
    private Boolean ExcludePublicEngine;

    /**
    * 参数应该为引擎权限类型，有效类型："USE", "MODIFY", "OPERATE", "MONITOR", "DELETE"
    */
    @SerializedName("AccessTypes")
    @Expose
    private String [] AccessTypes;

    /**
    * 引擎执行任务类型，有效值：SQL/BATCH，默认为SQL
    */
    @SerializedName("EngineExecType")
    @Expose
    private String EngineExecType;

    /**
    * 引擎类型，有效值：spark/presto
    */
    @SerializedName("EngineType")
    @Expose
    private String EngineType;

    /**
    * 网络配置列表，若传入该参数，则返回网络配置关联的计算引擎
    */
    @SerializedName("DatasourceConnectionNameSet")
    @Expose
    private String [] DatasourceConnectionNameSet;

    /**
     * Get 偏移量，默认为0。 
     * @return Offset 偏移量，默认为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0。
     * @param Offset 偏移量，默认为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 过滤类型，支持如下的过滤类型，传参Name应为以下其中一个, data-engine-name - String（数据引擎名称）：engine-type - String（引擎类型：spark：spark 引擎，presto：presto引擎），state - String (数据引擎状态 -2已删除 -1失败 0初始化中 1挂起 2运行中 3准备删除 4删除中) ， mode - String（计费模式 0共享模式 1按量计费 2包年包月） ， create-time - String（创建时间，10位时间戳） message - String （描述信息），cluster-type - String (集群资源类型 spark_private/presto_private/presto_cu/spark_cu)，engine-id - String（数据引擎ID），key-word - String（数据引擎名称或集群资源类型或描述信息模糊搜索），engine-exec-type - String（引擎执行任务类型，SQL/BATCH） 
     * @return Filters 过滤类型，支持如下的过滤类型，传参Name应为以下其中一个, data-engine-name - String（数据引擎名称）：engine-type - String（引擎类型：spark：spark 引擎，presto：presto引擎），state - String (数据引擎状态 -2已删除 -1失败 0初始化中 1挂起 2运行中 3准备删除 4删除中) ， mode - String（计费模式 0共享模式 1按量计费 2包年包月） ， create-time - String（创建时间，10位时间戳） message - String （描述信息），cluster-type - String (集群资源类型 spark_private/presto_private/presto_cu/spark_cu)，engine-id - String（数据引擎ID），key-word - String（数据引擎名称或集群资源类型或描述信息模糊搜索），engine-exec-type - String（引擎执行任务类型，SQL/BATCH）
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤类型，支持如下的过滤类型，传参Name应为以下其中一个, data-engine-name - String（数据引擎名称）：engine-type - String（引擎类型：spark：spark 引擎，presto：presto引擎），state - String (数据引擎状态 -2已删除 -1失败 0初始化中 1挂起 2运行中 3准备删除 4删除中) ， mode - String（计费模式 0共享模式 1按量计费 2包年包月） ， create-time - String（创建时间，10位时间戳） message - String （描述信息），cluster-type - String (集群资源类型 spark_private/presto_private/presto_cu/spark_cu)，engine-id - String（数据引擎ID），key-word - String（数据引擎名称或集群资源类型或描述信息模糊搜索），engine-exec-type - String（引擎执行任务类型，SQL/BATCH）
     * @param Filters 过滤类型，支持如下的过滤类型，传参Name应为以下其中一个, data-engine-name - String（数据引擎名称）：engine-type - String（引擎类型：spark：spark 引擎，presto：presto引擎），state - String (数据引擎状态 -2已删除 -1失败 0初始化中 1挂起 2运行中 3准备删除 4删除中) ， mode - String（计费模式 0共享模式 1按量计费 2包年包月） ， create-time - String（创建时间，10位时间戳） message - String （描述信息），cluster-type - String (集群资源类型 spark_private/presto_private/presto_cu/spark_cu)，engine-id - String（数据引擎ID），key-word - String（数据引擎名称或集群资源类型或描述信息模糊搜索），engine-exec-type - String（引擎执行任务类型，SQL/BATCH）
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 排序字段，支持如下字段类型，create-time 
     * @return SortBy 排序字段，支持如下字段类型，create-time
     */
    public String getSortBy() {
        return this.SortBy;
    }

    /**
     * Set 排序字段，支持如下字段类型，create-time
     * @param SortBy 排序字段，支持如下字段类型，create-time
     */
    public void setSortBy(String SortBy) {
        this.SortBy = SortBy;
    }

    /**
     * Get 排序方式，desc表示正序，asc表示反序， 默认为asc。 
     * @return Sorting 排序方式，desc表示正序，asc表示反序， 默认为asc。
     */
    public String getSorting() {
        return this.Sorting;
    }

    /**
     * Set 排序方式，desc表示正序，asc表示反序， 默认为asc。
     * @param Sorting 排序方式，desc表示正序，asc表示反序， 默认为asc。
     */
    public void setSorting(String Sorting) {
        this.Sorting = Sorting;
    }

    /**
     * Get 返回数量，默认为10，最大值为100。 
     * @return Limit 返回数量，默认为10，最大值为100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为10，最大值为100。
     * @param Limit 返回数量，默认为10，最大值为100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 已废弃，请使用DatasourceConnectionNameSet 
     * @return DatasourceConnectionName 已废弃，请使用DatasourceConnectionNameSet
     */
    public String getDatasourceConnectionName() {
        return this.DatasourceConnectionName;
    }

    /**
     * Set 已废弃，请使用DatasourceConnectionNameSet
     * @param DatasourceConnectionName 已废弃，请使用DatasourceConnectionNameSet
     */
    public void setDatasourceConnectionName(String DatasourceConnectionName) {
        this.DatasourceConnectionName = DatasourceConnectionName;
    }

    /**
     * Get 是否不返回共享引擎，true不返回共享引擎，false可以返回共享引擎 
     * @return ExcludePublicEngine 是否不返回共享引擎，true不返回共享引擎，false可以返回共享引擎
     */
    public Boolean getExcludePublicEngine() {
        return this.ExcludePublicEngine;
    }

    /**
     * Set 是否不返回共享引擎，true不返回共享引擎，false可以返回共享引擎
     * @param ExcludePublicEngine 是否不返回共享引擎，true不返回共享引擎，false可以返回共享引擎
     */
    public void setExcludePublicEngine(Boolean ExcludePublicEngine) {
        this.ExcludePublicEngine = ExcludePublicEngine;
    }

    /**
     * Get 参数应该为引擎权限类型，有效类型："USE", "MODIFY", "OPERATE", "MONITOR", "DELETE" 
     * @return AccessTypes 参数应该为引擎权限类型，有效类型："USE", "MODIFY", "OPERATE", "MONITOR", "DELETE"
     */
    public String [] getAccessTypes() {
        return this.AccessTypes;
    }

    /**
     * Set 参数应该为引擎权限类型，有效类型："USE", "MODIFY", "OPERATE", "MONITOR", "DELETE"
     * @param AccessTypes 参数应该为引擎权限类型，有效类型："USE", "MODIFY", "OPERATE", "MONITOR", "DELETE"
     */
    public void setAccessTypes(String [] AccessTypes) {
        this.AccessTypes = AccessTypes;
    }

    /**
     * Get 引擎执行任务类型，有效值：SQL/BATCH，默认为SQL 
     * @return EngineExecType 引擎执行任务类型，有效值：SQL/BATCH，默认为SQL
     */
    public String getEngineExecType() {
        return this.EngineExecType;
    }

    /**
     * Set 引擎执行任务类型，有效值：SQL/BATCH，默认为SQL
     * @param EngineExecType 引擎执行任务类型，有效值：SQL/BATCH，默认为SQL
     */
    public void setEngineExecType(String EngineExecType) {
        this.EngineExecType = EngineExecType;
    }

    /**
     * Get 引擎类型，有效值：spark/presto 
     * @return EngineType 引擎类型，有效值：spark/presto
     */
    public String getEngineType() {
        return this.EngineType;
    }

    /**
     * Set 引擎类型，有效值：spark/presto
     * @param EngineType 引擎类型，有效值：spark/presto
     */
    public void setEngineType(String EngineType) {
        this.EngineType = EngineType;
    }

    /**
     * Get 网络配置列表，若传入该参数，则返回网络配置关联的计算引擎 
     * @return DatasourceConnectionNameSet 网络配置列表，若传入该参数，则返回网络配置关联的计算引擎
     */
    public String [] getDatasourceConnectionNameSet() {
        return this.DatasourceConnectionNameSet;
    }

    /**
     * Set 网络配置列表，若传入该参数，则返回网络配置关联的计算引擎
     * @param DatasourceConnectionNameSet 网络配置列表，若传入该参数，则返回网络配置关联的计算引擎
     */
    public void setDatasourceConnectionNameSet(String [] DatasourceConnectionNameSet) {
        this.DatasourceConnectionNameSet = DatasourceConnectionNameSet;
    }

    public DescribeDataEnginesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDataEnginesRequest(DescribeDataEnginesRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.SortBy != null) {
            this.SortBy = new String(source.SortBy);
        }
        if (source.Sorting != null) {
            this.Sorting = new String(source.Sorting);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.DatasourceConnectionName != null) {
            this.DatasourceConnectionName = new String(source.DatasourceConnectionName);
        }
        if (source.ExcludePublicEngine != null) {
            this.ExcludePublicEngine = new Boolean(source.ExcludePublicEngine);
        }
        if (source.AccessTypes != null) {
            this.AccessTypes = new String[source.AccessTypes.length];
            for (int i = 0; i < source.AccessTypes.length; i++) {
                this.AccessTypes[i] = new String(source.AccessTypes[i]);
            }
        }
        if (source.EngineExecType != null) {
            this.EngineExecType = new String(source.EngineExecType);
        }
        if (source.EngineType != null) {
            this.EngineType = new String(source.EngineType);
        }
        if (source.DatasourceConnectionNameSet != null) {
            this.DatasourceConnectionNameSet = new String[source.DatasourceConnectionNameSet.length];
            for (int i = 0; i < source.DatasourceConnectionNameSet.length; i++) {
                this.DatasourceConnectionNameSet[i] = new String(source.DatasourceConnectionNameSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "SortBy", this.SortBy);
        this.setParamSimple(map, prefix + "Sorting", this.Sorting);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "DatasourceConnectionName", this.DatasourceConnectionName);
        this.setParamSimple(map, prefix + "ExcludePublicEngine", this.ExcludePublicEngine);
        this.setParamArraySimple(map, prefix + "AccessTypes.", this.AccessTypes);
        this.setParamSimple(map, prefix + "EngineExecType", this.EngineExecType);
        this.setParamSimple(map, prefix + "EngineType", this.EngineType);
        this.setParamArraySimple(map, prefix + "DatasourceConnectionNameSet.", this.DatasourceConnectionNameSet);

    }
}

