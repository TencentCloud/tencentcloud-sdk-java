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
package com.tencentcloudapi.keewidb.v20220308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProjectSecurityGroupsRequest extends AbstractModel{

    /**
    * 数据库引擎名称。该产品固定为 keewidb。
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * 项目 ID。
登录 [账号中心](https://console.cloud.tencent.com/developer)，在<b>项目管理</b>中可获取项目 ID。
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 分页偏移量，取Limit整数倍。计算公式：offset=limit*(页码-1)。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 每页安全组的数量限制。默认为 20，最多输出100条。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 搜索关键词，支持根据安全组 ID 或者安全组名称搜索。
    */
    @SerializedName("SearchKey")
    @Expose
    private String SearchKey;

    /**
     * Get 数据库引擎名称。该产品固定为 keewidb。 
     * @return Product 数据库引擎名称。该产品固定为 keewidb。
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 数据库引擎名称。该产品固定为 keewidb。
     * @param Product 数据库引擎名称。该产品固定为 keewidb。
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get 项目 ID。
登录 [账号中心](https://console.cloud.tencent.com/developer)，在<b>项目管理</b>中可获取项目 ID。 
     * @return ProjectId 项目 ID。
登录 [账号中心](https://console.cloud.tencent.com/developer)，在<b>项目管理</b>中可获取项目 ID。
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目 ID。
登录 [账号中心](https://console.cloud.tencent.com/developer)，在<b>项目管理</b>中可获取项目 ID。
     * @param ProjectId 项目 ID。
登录 [账号中心](https://console.cloud.tencent.com/developer)，在<b>项目管理</b>中可获取项目 ID。
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 分页偏移量，取Limit整数倍。计算公式：offset=limit*(页码-1)。 
     * @return Offset 分页偏移量，取Limit整数倍。计算公式：offset=limit*(页码-1)。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移量，取Limit整数倍。计算公式：offset=limit*(页码-1)。
     * @param Offset 分页偏移量，取Limit整数倍。计算公式：offset=limit*(页码-1)。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 每页安全组的数量限制。默认为 20，最多输出100条。 
     * @return Limit 每页安全组的数量限制。默认为 20，最多输出100条。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页安全组的数量限制。默认为 20，最多输出100条。
     * @param Limit 每页安全组的数量限制。默认为 20，最多输出100条。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 搜索关键词，支持根据安全组 ID 或者安全组名称搜索。 
     * @return SearchKey 搜索关键词，支持根据安全组 ID 或者安全组名称搜索。
     */
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * Set 搜索关键词，支持根据安全组 ID 或者安全组名称搜索。
     * @param SearchKey 搜索关键词，支持根据安全组 ID 或者安全组名称搜索。
     */
    public void setSearchKey(String SearchKey) {
        this.SearchKey = SearchKey;
    }

    public DescribeProjectSecurityGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProjectSecurityGroupsRequest(DescribeProjectSecurityGroupsRequest source) {
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.SearchKey != null) {
            this.SearchKey = new String(source.SearchKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "SearchKey", this.SearchKey);

    }
}

