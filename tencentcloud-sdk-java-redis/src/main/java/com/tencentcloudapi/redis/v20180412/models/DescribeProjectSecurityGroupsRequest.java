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
    * 数据库引擎名称：mariadb,cdb,cynosdb,dcdb,redis,mongodb
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * 项目Id。
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 偏移量。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 拉取数量限制。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 搜索条件，支持安全组id或者安全组名称。
    */
    @SerializedName("SearchKey")
    @Expose
    private String SearchKey;

    /**
     * Get 数据库引擎名称：mariadb,cdb,cynosdb,dcdb,redis,mongodb 
     * @return Product 数据库引擎名称：mariadb,cdb,cynosdb,dcdb,redis,mongodb
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 数据库引擎名称：mariadb,cdb,cynosdb,dcdb,redis,mongodb
     * @param Product 数据库引擎名称：mariadb,cdb,cynosdb,dcdb,redis,mongodb
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get 项目Id。 
     * @return ProjectId 项目Id。
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目Id。
     * @param ProjectId 项目Id。
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 偏移量。 
     * @return Offset 偏移量。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量。
     * @param Offset 偏移量。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 拉取数量限制。 
     * @return Limit 拉取数量限制。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 拉取数量限制。
     * @param Limit 拉取数量限制。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 搜索条件，支持安全组id或者安全组名称。 
     * @return SearchKey 搜索条件，支持安全组id或者安全组名称。
     */
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * Set 搜索条件，支持安全组id或者安全组名称。
     * @param SearchKey 搜索条件，支持安全组id或者安全组名称。
     */
    public void setSearchKey(String SearchKey) {
        this.SearchKey = SearchKey;
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

