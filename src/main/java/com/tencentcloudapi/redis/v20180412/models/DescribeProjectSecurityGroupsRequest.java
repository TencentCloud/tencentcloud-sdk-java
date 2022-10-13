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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProjectSecurityGroupsRequest extends AbstractModel{

    /**
    * 数据库引擎名称，本接口取值：redis。
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * 项目 ID。
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 偏移量，取值为Limit的整数倍。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 拉取数量限制，默认 20。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 搜索条件，支持安全组 ID 或者安全组名称。
    */
    @SerializedName("SearchKey")
    @Expose
    private String SearchKey;

    /**
     * Get 数据库引擎名称，本接口取值：redis。 
     * @return Product 数据库引擎名称，本接口取值：redis。
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 数据库引擎名称，本接口取值：redis。
     * @param Product 数据库引擎名称，本接口取值：redis。
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get 项目 ID。 
     * @return ProjectId 项目 ID。
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目 ID。
     * @param ProjectId 项目 ID。
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 偏移量，取值为Limit的整数倍。 
     * @return Offset 偏移量，取值为Limit的整数倍。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，取值为Limit的整数倍。
     * @param Offset 偏移量，取值为Limit的整数倍。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 拉取数量限制，默认 20。 
     * @return Limit 拉取数量限制，默认 20。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 拉取数量限制，默认 20。
     * @param Limit 拉取数量限制，默认 20。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 搜索条件，支持安全组 ID 或者安全组名称。 
     * @return SearchKey 搜索条件，支持安全组 ID 或者安全组名称。
     */
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * Set 搜索条件，支持安全组 ID 或者安全组名称。
     * @param SearchKey 搜索条件，支持安全组 ID 或者安全组名称。
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

