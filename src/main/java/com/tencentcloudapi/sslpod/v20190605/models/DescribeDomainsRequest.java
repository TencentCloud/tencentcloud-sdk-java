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
package com.tencentcloudapi.sslpod.v20190605.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDomainsRequest extends AbstractModel{

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 获取数量
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 搜索的类型 Enums(none,tags,grade,brand,code,hash,limit)
    */
    @SerializedName("SearchType")
    @Expose
    private String SearchType;

    /**
    * 标签
    */
    @SerializedName("Tag")
    @Expose
    private String Tag;

    /**
    * 等级
    */
    @SerializedName("Grade")
    @Expose
    private String Grade;

    /**
    * 品牌
    */
    @SerializedName("Brand")
    @Expose
    private String Brand;

    /**
    * 混合搜索
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * 证书指纹
    */
    @SerializedName("Hash")
    @Expose
    private String Hash;

    /**
    * 搜索图标类型
    */
    @SerializedName("Item")
    @Expose
    private String Item;

    /**
    * 搜索图标值
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get 偏移量 
     * @return Offset 偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量
     * @param Offset 偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 获取数量 
     * @return Limit 获取数量
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 获取数量
     * @param Limit 获取数量
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 搜索的类型 Enums(none,tags,grade,brand,code,hash,limit) 
     * @return SearchType 搜索的类型 Enums(none,tags,grade,brand,code,hash,limit)
     */
    public String getSearchType() {
        return this.SearchType;
    }

    /**
     * Set 搜索的类型 Enums(none,tags,grade,brand,code,hash,limit)
     * @param SearchType 搜索的类型 Enums(none,tags,grade,brand,code,hash,limit)
     */
    public void setSearchType(String SearchType) {
        this.SearchType = SearchType;
    }

    /**
     * Get 标签 
     * @return Tag 标签
     */
    public String getTag() {
        return this.Tag;
    }

    /**
     * Set 标签
     * @param Tag 标签
     */
    public void setTag(String Tag) {
        this.Tag = Tag;
    }

    /**
     * Get 等级 
     * @return Grade 等级
     */
    public String getGrade() {
        return this.Grade;
    }

    /**
     * Set 等级
     * @param Grade 等级
     */
    public void setGrade(String Grade) {
        this.Grade = Grade;
    }

    /**
     * Get 品牌 
     * @return Brand 品牌
     */
    public String getBrand() {
        return this.Brand;
    }

    /**
     * Set 品牌
     * @param Brand 品牌
     */
    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    /**
     * Get 混合搜索 
     * @return Code 混合搜索
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set 混合搜索
     * @param Code 混合搜索
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get 证书指纹 
     * @return Hash 证书指纹
     */
    public String getHash() {
        return this.Hash;
    }

    /**
     * Set 证书指纹
     * @param Hash 证书指纹
     */
    public void setHash(String Hash) {
        this.Hash = Hash;
    }

    /**
     * Get 搜索图标类型 
     * @return Item 搜索图标类型
     */
    public String getItem() {
        return this.Item;
    }

    /**
     * Set 搜索图标类型
     * @param Item 搜索图标类型
     */
    public void setItem(String Item) {
        this.Item = Item;
    }

    /**
     * Get 搜索图标值 
     * @return Status 搜索图标值
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 搜索图标值
     * @param Status 搜索图标值
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "SearchType", this.SearchType);
        this.setParamSimple(map, prefix + "Tag", this.Tag);
        this.setParamSimple(map, prefix + "Grade", this.Grade);
        this.setParamSimple(map, prefix + "Brand", this.Brand);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Hash", this.Hash);
        this.setParamSimple(map, prefix + "Item", this.Item);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

