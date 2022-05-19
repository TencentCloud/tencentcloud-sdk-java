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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeApiGroupsRequest extends AbstractModel{

    /**
    * 搜索关键字
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
    * 偏移量，默认为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 每页条数，默认为20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分组类型。 ms： 微服务分组； external:外部Api分组
    */
    @SerializedName("GroupType")
    @Expose
    private String GroupType;

    /**
    * 鉴权类型。 secret： 密钥鉴权； none:无鉴权
    */
    @SerializedName("AuthType")
    @Expose
    private String AuthType;

    /**
    * 发布状态, drafted: 未发布。 released: 发布
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 排序字段："created_time"或"group_context"
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 排序类型：0(ASC)或1(DESC)
    */
    @SerializedName("OrderType")
    @Expose
    private Long OrderType;

    /**
    * 网关实体ID
    */
    @SerializedName("GatewayInstanceId")
    @Expose
    private String GatewayInstanceId;

    /**
     * Get 搜索关键字 
     * @return SearchWord 搜索关键字
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set 搜索关键字
     * @param SearchWord 搜索关键字
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
    }

    /**
     * Get 偏移量，默认为0 
     * @return Offset 偏移量，默认为0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0
     * @param Offset 偏移量，默认为0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 每页条数，默认为20 
     * @return Limit 每页条数，默认为20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页条数，默认为20
     * @param Limit 每页条数，默认为20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分组类型。 ms： 微服务分组； external:外部Api分组 
     * @return GroupType 分组类型。 ms： 微服务分组； external:外部Api分组
     */
    public String getGroupType() {
        return this.GroupType;
    }

    /**
     * Set 分组类型。 ms： 微服务分组； external:外部Api分组
     * @param GroupType 分组类型。 ms： 微服务分组； external:外部Api分组
     */
    public void setGroupType(String GroupType) {
        this.GroupType = GroupType;
    }

    /**
     * Get 鉴权类型。 secret： 密钥鉴权； none:无鉴权 
     * @return AuthType 鉴权类型。 secret： 密钥鉴权； none:无鉴权
     */
    public String getAuthType() {
        return this.AuthType;
    }

    /**
     * Set 鉴权类型。 secret： 密钥鉴权； none:无鉴权
     * @param AuthType 鉴权类型。 secret： 密钥鉴权； none:无鉴权
     */
    public void setAuthType(String AuthType) {
        this.AuthType = AuthType;
    }

    /**
     * Get 发布状态, drafted: 未发布。 released: 发布 
     * @return Status 发布状态, drafted: 未发布。 released: 发布
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 发布状态, drafted: 未发布。 released: 发布
     * @param Status 发布状态, drafted: 未发布。 released: 发布
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 排序字段："created_time"或"group_context" 
     * @return OrderBy 排序字段："created_time"或"group_context"
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 排序字段："created_time"或"group_context"
     * @param OrderBy 排序字段："created_time"或"group_context"
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 排序类型：0(ASC)或1(DESC) 
     * @return OrderType 排序类型：0(ASC)或1(DESC)
     */
    public Long getOrderType() {
        return this.OrderType;
    }

    /**
     * Set 排序类型：0(ASC)或1(DESC)
     * @param OrderType 排序类型：0(ASC)或1(DESC)
     */
    public void setOrderType(Long OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get 网关实体ID 
     * @return GatewayInstanceId 网关实体ID
     */
    public String getGatewayInstanceId() {
        return this.GatewayInstanceId;
    }

    /**
     * Set 网关实体ID
     * @param GatewayInstanceId 网关实体ID
     */
    public void setGatewayInstanceId(String GatewayInstanceId) {
        this.GatewayInstanceId = GatewayInstanceId;
    }

    public DescribeApiGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeApiGroupsRequest(DescribeApiGroupsRequest source) {
        if (source.SearchWord != null) {
            this.SearchWord = new String(source.SearchWord);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.GroupType != null) {
            this.GroupType = new String(source.GroupType);
        }
        if (source.AuthType != null) {
            this.AuthType = new String(source.AuthType);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.OrderType != null) {
            this.OrderType = new Long(source.OrderType);
        }
        if (source.GatewayInstanceId != null) {
            this.GatewayInstanceId = new String(source.GatewayInstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SearchWord", this.SearchWord);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "GroupType", this.GroupType);
        this.setParamSimple(map, prefix + "AuthType", this.AuthType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);
        this.setParamSimple(map, prefix + "GatewayInstanceId", this.GatewayInstanceId);

    }
}

