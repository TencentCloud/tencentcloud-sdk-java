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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBillingResourceGroupRequest extends AbstractModel {

    /**
    * <p>资源组id, 取值为创建资源组接口(CreateBillingResourceGroup)响应中的ResourceGroupId</p>
    */
    @SerializedName("ResourceGroupId")
    @Expose
    private String ResourceGroupId;

    /**
    * <p>TI工作空间ID</p><p>仅用于“工作空间”白名单功能。如需使用，请联系TI管理员开通白名单。</p>
    */
    @SerializedName("TiProjectId")
    @Expose
    private String TiProjectId;

    /**
    * <p>过滤条件<br>注意: </p><ol><li>Filter.Name 只支持以下枚举值:<br> InstanceId (资源组节点id)<br> InstanceStatus (资源组节点状态)</li><li>Filter.Values: 长度为1且Filter.Fuzzy=true时，支持模糊查询; 不为1时，精确查询</li><li>Filter.Negative: 是否取反，默认为false</li><li>Filter.Fuzzy: 是否模糊查询，默认为false</li><li>每次请求的Filters的上限为10，Filter.Values的上限为100</li></ol>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * <p>分页查询起始位置，如：Limit为10，第一页Offset为0，第二页Offset为10...即每页左边为闭区间; 默认0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>分页查询每页大小，默认20</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>排序方向; 枚举值: ASC | DESC；默认DESC</p>
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * <p>排序字段; 枚举值: CreateTime (创建时间) ｜ ExpireTime (到期时间)；默认CreateTime</p>
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
     * Get <p>资源组id, 取值为创建资源组接口(CreateBillingResourceGroup)响应中的ResourceGroupId</p> 
     * @return ResourceGroupId <p>资源组id, 取值为创建资源组接口(CreateBillingResourceGroup)响应中的ResourceGroupId</p>
     */
    public String getResourceGroupId() {
        return this.ResourceGroupId;
    }

    /**
     * Set <p>资源组id, 取值为创建资源组接口(CreateBillingResourceGroup)响应中的ResourceGroupId</p>
     * @param ResourceGroupId <p>资源组id, 取值为创建资源组接口(CreateBillingResourceGroup)响应中的ResourceGroupId</p>
     */
    public void setResourceGroupId(String ResourceGroupId) {
        this.ResourceGroupId = ResourceGroupId;
    }

    /**
     * Get <p>TI工作空间ID</p><p>仅用于“工作空间”白名单功能。如需使用，请联系TI管理员开通白名单。</p> 
     * @return TiProjectId <p>TI工作空间ID</p><p>仅用于“工作空间”白名单功能。如需使用，请联系TI管理员开通白名单。</p>
     */
    public String getTiProjectId() {
        return this.TiProjectId;
    }

    /**
     * Set <p>TI工作空间ID</p><p>仅用于“工作空间”白名单功能。如需使用，请联系TI管理员开通白名单。</p>
     * @param TiProjectId <p>TI工作空间ID</p><p>仅用于“工作空间”白名单功能。如需使用，请联系TI管理员开通白名单。</p>
     */
    public void setTiProjectId(String TiProjectId) {
        this.TiProjectId = TiProjectId;
    }

    /**
     * Get <p>过滤条件<br>注意: </p><ol><li>Filter.Name 只支持以下枚举值:<br> InstanceId (资源组节点id)<br> InstanceStatus (资源组节点状态)</li><li>Filter.Values: 长度为1且Filter.Fuzzy=true时，支持模糊查询; 不为1时，精确查询</li><li>Filter.Negative: 是否取反，默认为false</li><li>Filter.Fuzzy: 是否模糊查询，默认为false</li><li>每次请求的Filters的上限为10，Filter.Values的上限为100</li></ol> 
     * @return Filters <p>过滤条件<br>注意: </p><ol><li>Filter.Name 只支持以下枚举值:<br> InstanceId (资源组节点id)<br> InstanceStatus (资源组节点状态)</li><li>Filter.Values: 长度为1且Filter.Fuzzy=true时，支持模糊查询; 不为1时，精确查询</li><li>Filter.Negative: 是否取反，默认为false</li><li>Filter.Fuzzy: 是否模糊查询，默认为false</li><li>每次请求的Filters的上限为10，Filter.Values的上限为100</li></ol>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤条件<br>注意: </p><ol><li>Filter.Name 只支持以下枚举值:<br> InstanceId (资源组节点id)<br> InstanceStatus (资源组节点状态)</li><li>Filter.Values: 长度为1且Filter.Fuzzy=true时，支持模糊查询; 不为1时，精确查询</li><li>Filter.Negative: 是否取反，默认为false</li><li>Filter.Fuzzy: 是否模糊查询，默认为false</li><li>每次请求的Filters的上限为10，Filter.Values的上限为100</li></ol>
     * @param Filters <p>过滤条件<br>注意: </p><ol><li>Filter.Name 只支持以下枚举值:<br> InstanceId (资源组节点id)<br> InstanceStatus (资源组节点状态)</li><li>Filter.Values: 长度为1且Filter.Fuzzy=true时，支持模糊查询; 不为1时，精确查询</li><li>Filter.Negative: 是否取反，默认为false</li><li>Filter.Fuzzy: 是否模糊查询，默认为false</li><li>每次请求的Filters的上限为10，Filter.Values的上限为100</li></ol>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>分页查询起始位置，如：Limit为10，第一页Offset为0，第二页Offset为10...即每页左边为闭区间; 默认0</p> 
     * @return Offset <p>分页查询起始位置，如：Limit为10，第一页Offset为0，第二页Offset为10...即每页左边为闭区间; 默认0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页查询起始位置，如：Limit为10，第一页Offset为0，第二页Offset为10...即每页左边为闭区间; 默认0</p>
     * @param Offset <p>分页查询起始位置，如：Limit为10，第一页Offset为0，第二页Offset为10...即每页左边为闭区间; 默认0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>分页查询每页大小，默认20</p> 
     * @return Limit <p>分页查询每页大小，默认20</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>分页查询每页大小，默认20</p>
     * @param Limit <p>分页查询每页大小，默认20</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>排序方向; 枚举值: ASC | DESC；默认DESC</p> 
     * @return Order <p>排序方向; 枚举值: ASC | DESC；默认DESC</p>
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set <p>排序方向; 枚举值: ASC | DESC；默认DESC</p>
     * @param Order <p>排序方向; 枚举值: ASC | DESC；默认DESC</p>
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get <p>排序字段; 枚举值: CreateTime (创建时间) ｜ ExpireTime (到期时间)；默认CreateTime</p> 
     * @return OrderField <p>排序字段; 枚举值: CreateTime (创建时间) ｜ ExpireTime (到期时间)；默认CreateTime</p>
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set <p>排序字段; 枚举值: CreateTime (创建时间) ｜ ExpireTime (到期时间)；默认CreateTime</p>
     * @param OrderField <p>排序字段; 枚举值: CreateTime (创建时间) ｜ ExpireTime (到期时间)；默认CreateTime</p>
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    public DescribeBillingResourceGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBillingResourceGroupRequest(DescribeBillingResourceGroupRequest source) {
        if (source.ResourceGroupId != null) {
            this.ResourceGroupId = new String(source.ResourceGroupId);
        }
        if (source.TiProjectId != null) {
            this.TiProjectId = new String(source.TiProjectId);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceGroupId", this.ResourceGroupId);
        this.setParamSimple(map, prefix + "TiProjectId", this.TiProjectId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);

    }
}

