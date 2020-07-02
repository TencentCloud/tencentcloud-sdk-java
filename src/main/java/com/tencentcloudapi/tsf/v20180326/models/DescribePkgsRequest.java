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

public class DescribePkgsRequest extends AbstractModel{

    /**
    * 应用ID（只传入应用ID，返回该应用下所有软件包信息）
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
    * 排序关键字（默认为"UploadTime"：上传时间）
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
    * 查询起始偏移
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
    * 程序包仓库类型
    */
    @SerializedName("RepositoryType")
    @Expose
    private String RepositoryType;

    /**
    * 程序包仓库id
    */
    @SerializedName("RepositoryId")
    @Expose
    private String RepositoryId;

    /**
     * Get 应用ID（只传入应用ID，返回该应用下所有软件包信息） 
     * @return ApplicationId 应用ID（只传入应用ID，返回该应用下所有软件包信息）
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 应用ID（只传入应用ID，返回该应用下所有软件包信息）
     * @param ApplicationId 应用ID（只传入应用ID，返回该应用下所有软件包信息）
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
     * Get 排序关键字（默认为"UploadTime"：上传时间） 
     * @return OrderBy 排序关键字（默认为"UploadTime"：上传时间）
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 排序关键字（默认为"UploadTime"：上传时间）
     * @param OrderBy 排序关键字（默认为"UploadTime"：上传时间）
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
     * Get 查询起始偏移 
     * @return Offset 查询起始偏移
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 查询起始偏移
     * @param Offset 查询起始偏移
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
     * Get 程序包仓库类型 
     * @return RepositoryType 程序包仓库类型
     */
    public String getRepositoryType() {
        return this.RepositoryType;
    }

    /**
     * Set 程序包仓库类型
     * @param RepositoryType 程序包仓库类型
     */
    public void setRepositoryType(String RepositoryType) {
        this.RepositoryType = RepositoryType;
    }

    /**
     * Get 程序包仓库id 
     * @return RepositoryId 程序包仓库id
     */
    public String getRepositoryId() {
        return this.RepositoryId;
    }

    /**
     * Set 程序包仓库id
     * @param RepositoryId 程序包仓库id
     */
    public void setRepositoryId(String RepositoryId) {
        this.RepositoryId = RepositoryId;
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

    }
}

