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
package com.tencentcloudapi.bdrc.v20260330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCopyPairsRequest extends AbstractModel {

    /**
    * <p>要查询复制对的类型，可选值：DISK、INSTANCE、CFS</p>
    */
    @SerializedName("CopyPairType")
    @Expose
    private String CopyPairType;

    /**
    * <p>要查询复制对ID列表</p>
    */
    @SerializedName("CopyPairIds")
    @Expose
    private String [] CopyPairIds;

    /**
    * <p>过滤条件，详见过滤条件表。支持的Name：disaster-recovery-site-pair-id、target-resource-id、source-resource-id、copy-pair-id、copy-pair-name</p>
    */
    @SerializedName("Filters")
    @Expose
    private FilterModel [] Filters;

    /**
    * <p>偏移量，默认为0。关于Offset的更进一步介绍请参考 API 简介中的相关小节</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>返回数量，默认为20，最大值为100。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>输出结果按升序还是降序，可选值：ASC、DESC</p>
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * <p>输出结果的排序字段，可选值：CREATE_TIME</p>
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
    * <p>是否要查询保护时间点列表，默认 false。当设置为 true 时，必须同时传入 CopyPairIds 参数。</p>
    */
    @SerializedName("QueryProtectionTime")
    @Expose
    private Boolean QueryProtectionTime;

    /**
    * <p>是否查询跨云+非跨云全部复制对，默认 false</p>
    */
    @SerializedName("GetAllCopyPair")
    @Expose
    private Boolean GetAllCopyPair;

    /**
    * <p>是否要查询 CVM 创建参数（仅对延迟创建模式且目标 CVM 未创建的复制对生效），默认为true。为 true 时，每条 deferred_create=1 AND target_cvm_created=0 的 CVM 复制对出参会附带 CvmCreateParams 字段</p>
    */
    @SerializedName("QueryCvmCreateParams")
    @Expose
    private Boolean QueryCvmCreateParams;

    /**
    * <p>复制对创建来源过滤。不传则查询所有；传 LOCAL 仅查本端创建的复制对，传 PEER 仅查对端创建的复制对。</p><p>枚举值：</p><ul><li>LOCAL： 仅查本端创建的复制对</li><li>PEER： 仅查对端创建的复制对</li></ul>
    */
    @SerializedName("CreateFrom")
    @Expose
    private String CreateFrom;

    /**
     * Get <p>要查询复制对的类型，可选值：DISK、INSTANCE、CFS</p> 
     * @return CopyPairType <p>要查询复制对的类型，可选值：DISK、INSTANCE、CFS</p>
     */
    public String getCopyPairType() {
        return this.CopyPairType;
    }

    /**
     * Set <p>要查询复制对的类型，可选值：DISK、INSTANCE、CFS</p>
     * @param CopyPairType <p>要查询复制对的类型，可选值：DISK、INSTANCE、CFS</p>
     */
    public void setCopyPairType(String CopyPairType) {
        this.CopyPairType = CopyPairType;
    }

    /**
     * Get <p>要查询复制对ID列表</p> 
     * @return CopyPairIds <p>要查询复制对ID列表</p>
     */
    public String [] getCopyPairIds() {
        return this.CopyPairIds;
    }

    /**
     * Set <p>要查询复制对ID列表</p>
     * @param CopyPairIds <p>要查询复制对ID列表</p>
     */
    public void setCopyPairIds(String [] CopyPairIds) {
        this.CopyPairIds = CopyPairIds;
    }

    /**
     * Get <p>过滤条件，详见过滤条件表。支持的Name：disaster-recovery-site-pair-id、target-resource-id、source-resource-id、copy-pair-id、copy-pair-name</p> 
     * @return Filters <p>过滤条件，详见过滤条件表。支持的Name：disaster-recovery-site-pair-id、target-resource-id、source-resource-id、copy-pair-id、copy-pair-name</p>
     */
    public FilterModel [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤条件，详见过滤条件表。支持的Name：disaster-recovery-site-pair-id、target-resource-id、source-resource-id、copy-pair-id、copy-pair-name</p>
     * @param Filters <p>过滤条件，详见过滤条件表。支持的Name：disaster-recovery-site-pair-id、target-resource-id、source-resource-id、copy-pair-id、copy-pair-name</p>
     */
    public void setFilters(FilterModel [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>偏移量，默认为0。关于Offset的更进一步介绍请参考 API 简介中的相关小节</p> 
     * @return Offset <p>偏移量，默认为0。关于Offset的更进一步介绍请参考 API 简介中的相关小节</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量，默认为0。关于Offset的更进一步介绍请参考 API 简介中的相关小节</p>
     * @param Offset <p>偏移量，默认为0。关于Offset的更进一步介绍请参考 API 简介中的相关小节</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>返回数量，默认为20，最大值为100。</p> 
     * @return Limit <p>返回数量，默认为20，最大值为100。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>返回数量，默认为20，最大值为100。</p>
     * @param Limit <p>返回数量，默认为20，最大值为100。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>输出结果按升序还是降序，可选值：ASC、DESC</p> 
     * @return Order <p>输出结果按升序还是降序，可选值：ASC、DESC</p>
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set <p>输出结果按升序还是降序，可选值：ASC、DESC</p>
     * @param Order <p>输出结果按升序还是降序，可选值：ASC、DESC</p>
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get <p>输出结果的排序字段，可选值：CREATE_TIME</p> 
     * @return OrderField <p>输出结果的排序字段，可选值：CREATE_TIME</p>
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set <p>输出结果的排序字段，可选值：CREATE_TIME</p>
     * @param OrderField <p>输出结果的排序字段，可选值：CREATE_TIME</p>
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    /**
     * Get <p>是否要查询保护时间点列表，默认 false。当设置为 true 时，必须同时传入 CopyPairIds 参数。</p> 
     * @return QueryProtectionTime <p>是否要查询保护时间点列表，默认 false。当设置为 true 时，必须同时传入 CopyPairIds 参数。</p>
     */
    public Boolean getQueryProtectionTime() {
        return this.QueryProtectionTime;
    }

    /**
     * Set <p>是否要查询保护时间点列表，默认 false。当设置为 true 时，必须同时传入 CopyPairIds 参数。</p>
     * @param QueryProtectionTime <p>是否要查询保护时间点列表，默认 false。当设置为 true 时，必须同时传入 CopyPairIds 参数。</p>
     */
    public void setQueryProtectionTime(Boolean QueryProtectionTime) {
        this.QueryProtectionTime = QueryProtectionTime;
    }

    /**
     * Get <p>是否查询跨云+非跨云全部复制对，默认 false</p> 
     * @return GetAllCopyPair <p>是否查询跨云+非跨云全部复制对，默认 false</p>
     */
    public Boolean getGetAllCopyPair() {
        return this.GetAllCopyPair;
    }

    /**
     * Set <p>是否查询跨云+非跨云全部复制对，默认 false</p>
     * @param GetAllCopyPair <p>是否查询跨云+非跨云全部复制对，默认 false</p>
     */
    public void setGetAllCopyPair(Boolean GetAllCopyPair) {
        this.GetAllCopyPair = GetAllCopyPair;
    }

    /**
     * Get <p>是否要查询 CVM 创建参数（仅对延迟创建模式且目标 CVM 未创建的复制对生效），默认为true。为 true 时，每条 deferred_create=1 AND target_cvm_created=0 的 CVM 复制对出参会附带 CvmCreateParams 字段</p> 
     * @return QueryCvmCreateParams <p>是否要查询 CVM 创建参数（仅对延迟创建模式且目标 CVM 未创建的复制对生效），默认为true。为 true 时，每条 deferred_create=1 AND target_cvm_created=0 的 CVM 复制对出参会附带 CvmCreateParams 字段</p>
     */
    public Boolean getQueryCvmCreateParams() {
        return this.QueryCvmCreateParams;
    }

    /**
     * Set <p>是否要查询 CVM 创建参数（仅对延迟创建模式且目标 CVM 未创建的复制对生效），默认为true。为 true 时，每条 deferred_create=1 AND target_cvm_created=0 的 CVM 复制对出参会附带 CvmCreateParams 字段</p>
     * @param QueryCvmCreateParams <p>是否要查询 CVM 创建参数（仅对延迟创建模式且目标 CVM 未创建的复制对生效），默认为true。为 true 时，每条 deferred_create=1 AND target_cvm_created=0 的 CVM 复制对出参会附带 CvmCreateParams 字段</p>
     */
    public void setQueryCvmCreateParams(Boolean QueryCvmCreateParams) {
        this.QueryCvmCreateParams = QueryCvmCreateParams;
    }

    /**
     * Get <p>复制对创建来源过滤。不传则查询所有；传 LOCAL 仅查本端创建的复制对，传 PEER 仅查对端创建的复制对。</p><p>枚举值：</p><ul><li>LOCAL： 仅查本端创建的复制对</li><li>PEER： 仅查对端创建的复制对</li></ul> 
     * @return CreateFrom <p>复制对创建来源过滤。不传则查询所有；传 LOCAL 仅查本端创建的复制对，传 PEER 仅查对端创建的复制对。</p><p>枚举值：</p><ul><li>LOCAL： 仅查本端创建的复制对</li><li>PEER： 仅查对端创建的复制对</li></ul>
     */
    public String getCreateFrom() {
        return this.CreateFrom;
    }

    /**
     * Set <p>复制对创建来源过滤。不传则查询所有；传 LOCAL 仅查本端创建的复制对，传 PEER 仅查对端创建的复制对。</p><p>枚举值：</p><ul><li>LOCAL： 仅查本端创建的复制对</li><li>PEER： 仅查对端创建的复制对</li></ul>
     * @param CreateFrom <p>复制对创建来源过滤。不传则查询所有；传 LOCAL 仅查本端创建的复制对，传 PEER 仅查对端创建的复制对。</p><p>枚举值：</p><ul><li>LOCAL： 仅查本端创建的复制对</li><li>PEER： 仅查对端创建的复制对</li></ul>
     */
    public void setCreateFrom(String CreateFrom) {
        this.CreateFrom = CreateFrom;
    }

    public DescribeCopyPairsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCopyPairsRequest(DescribeCopyPairsRequest source) {
        if (source.CopyPairType != null) {
            this.CopyPairType = new String(source.CopyPairType);
        }
        if (source.CopyPairIds != null) {
            this.CopyPairIds = new String[source.CopyPairIds.length];
            for (int i = 0; i < source.CopyPairIds.length; i++) {
                this.CopyPairIds[i] = new String(source.CopyPairIds[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new FilterModel[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new FilterModel(source.Filters[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.OrderField != null) {
            this.OrderField = new String(source.OrderField);
        }
        if (source.QueryProtectionTime != null) {
            this.QueryProtectionTime = new Boolean(source.QueryProtectionTime);
        }
        if (source.GetAllCopyPair != null) {
            this.GetAllCopyPair = new Boolean(source.GetAllCopyPair);
        }
        if (source.QueryCvmCreateParams != null) {
            this.QueryCvmCreateParams = new Boolean(source.QueryCvmCreateParams);
        }
        if (source.CreateFrom != null) {
            this.CreateFrom = new String(source.CreateFrom);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CopyPairType", this.CopyPairType);
        this.setParamArraySimple(map, prefix + "CopyPairIds.", this.CopyPairIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);
        this.setParamSimple(map, prefix + "QueryProtectionTime", this.QueryProtectionTime);
        this.setParamSimple(map, prefix + "GetAllCopyPair", this.GetAllCopyPair);
        this.setParamSimple(map, prefix + "QueryCvmCreateParams", this.QueryCvmCreateParams);
        this.setParamSimple(map, prefix + "CreateFrom", this.CreateFrom);

    }
}

