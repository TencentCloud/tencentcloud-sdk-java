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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeOrganizationMembersRequest extends AbstractModel {

    /**
    * 偏移量。取值是limit的整数倍，默认值 : 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 限制数目。取值范围：1~50，默认值：10
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 国际站：en，国内站：zh
    */
    @SerializedName("Lang")
    @Expose
    private String Lang;

    /**
    * 成员名称或者成员ID搜索。
    */
    @SerializedName("SearchKey")
    @Expose
    private String SearchKey;

    /**
    * 主体名称搜索。
    */
    @SerializedName("AuthName")
    @Expose
    private String AuthName;

    /**
    * 可信服务产品简称。可信服务管理员查询时必须指定
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * 成员标签搜索列表，最大10个
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 组织单元ID
    */
    @SerializedName("NodeId")
    @Expose
    private Long NodeId;

    /**
    * 组织单元名称
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
     * Get 偏移量。取值是limit的整数倍，默认值 : 0 
     * @return Offset 偏移量。取值是limit的整数倍，默认值 : 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量。取值是limit的整数倍，默认值 : 0
     * @param Offset 偏移量。取值是limit的整数倍，默认值 : 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 限制数目。取值范围：1~50，默认值：10 
     * @return Limit 限制数目。取值范围：1~50，默认值：10
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 限制数目。取值范围：1~50，默认值：10
     * @param Limit 限制数目。取值范围：1~50，默认值：10
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 国际站：en，国内站：zh 
     * @return Lang 国际站：en，国内站：zh
     */
    public String getLang() {
        return this.Lang;
    }

    /**
     * Set 国际站：en，国内站：zh
     * @param Lang 国际站：en，国内站：zh
     */
    public void setLang(String Lang) {
        this.Lang = Lang;
    }

    /**
     * Get 成员名称或者成员ID搜索。 
     * @return SearchKey 成员名称或者成员ID搜索。
     */
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * Set 成员名称或者成员ID搜索。
     * @param SearchKey 成员名称或者成员ID搜索。
     */
    public void setSearchKey(String SearchKey) {
        this.SearchKey = SearchKey;
    }

    /**
     * Get 主体名称搜索。 
     * @return AuthName 主体名称搜索。
     */
    public String getAuthName() {
        return this.AuthName;
    }

    /**
     * Set 主体名称搜索。
     * @param AuthName 主体名称搜索。
     */
    public void setAuthName(String AuthName) {
        this.AuthName = AuthName;
    }

    /**
     * Get 可信服务产品简称。可信服务管理员查询时必须指定 
     * @return Product 可信服务产品简称。可信服务管理员查询时必须指定
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 可信服务产品简称。可信服务管理员查询时必须指定
     * @param Product 可信服务产品简称。可信服务管理员查询时必须指定
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get 成员标签搜索列表，最大10个 
     * @return Tags 成员标签搜索列表，最大10个
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 成员标签搜索列表，最大10个
     * @param Tags 成员标签搜索列表，最大10个
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 组织单元ID 
     * @return NodeId 组织单元ID
     */
    public Long getNodeId() {
        return this.NodeId;
    }

    /**
     * Set 组织单元ID
     * @param NodeId 组织单元ID
     */
    public void setNodeId(Long NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get 组织单元名称 
     * @return NodeName 组织单元名称
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set 组织单元名称
     * @param NodeName 组织单元名称
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    public DescribeOrganizationMembersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOrganizationMembersRequest(DescribeOrganizationMembersRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Lang != null) {
            this.Lang = new String(source.Lang);
        }
        if (source.SearchKey != null) {
            this.SearchKey = new String(source.SearchKey);
        }
        if (source.AuthName != null) {
            this.AuthName = new String(source.AuthName);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.NodeId != null) {
            this.NodeId = new Long(source.NodeId);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Lang", this.Lang);
        this.setParamSimple(map, prefix + "SearchKey", this.SearchKey);
        this.setParamSimple(map, prefix + "AuthName", this.AuthName);
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);

    }
}

