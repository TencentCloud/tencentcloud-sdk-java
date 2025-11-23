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
package com.tencentcloudapi.ctem.v20231128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DisplaySeed extends AbstractModel {

    /**
    * 主键ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 企业ID
    */
    @SerializedName("CustomerId")
    @Expose
    private Long CustomerId;

    /**
    * 分类，包括：domain(主域名)、icon(图标)、ip(IP)、
keyword(关键词)、parent_company(母公司)、sub_domain(子域名)、title(标题)
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * 值
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * md5值
    */
    @SerializedName("Md5")
    @Expose
    private String Md5;

    /**
    * 来源
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 创建时间
    */
    @SerializedName("CreateAt")
    @Expose
    private String CreateAt;

    /**
    * 是否可信
    */
    @SerializedName("IsValid")
    @Expose
    private Boolean IsValid;

    /**
     * Get 主键ID 
     * @return Id 主键ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 主键ID
     * @param Id 主键ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 企业ID 
     * @return CustomerId 企业ID
     */
    public Long getCustomerId() {
        return this.CustomerId;
    }

    /**
     * Set 企业ID
     * @param CustomerId 企业ID
     */
    public void setCustomerId(Long CustomerId) {
        this.CustomerId = CustomerId;
    }

    /**
     * Get 分类，包括：domain(主域名)、icon(图标)、ip(IP)、
keyword(关键词)、parent_company(母公司)、sub_domain(子域名)、title(标题) 
     * @return Category 分类，包括：domain(主域名)、icon(图标)、ip(IP)、
keyword(关键词)、parent_company(母公司)、sub_domain(子域名)、title(标题)
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set 分类，包括：domain(主域名)、icon(图标)、ip(IP)、
keyword(关键词)、parent_company(母公司)、sub_domain(子域名)、title(标题)
     * @param Category 分类，包括：domain(主域名)、icon(图标)、ip(IP)、
keyword(关键词)、parent_company(母公司)、sub_domain(子域名)、title(标题)
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get 值 
     * @return Value 值
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 值
     * @param Value 值
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get md5值 
     * @return Md5 md5值
     */
    public String getMd5() {
        return this.Md5;
    }

    /**
     * Set md5值
     * @param Md5 md5值
     */
    public void setMd5(String Md5) {
        this.Md5 = Md5;
    }

    /**
     * Get 来源 
     * @return Source 来源
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 来源
     * @param Source 来源
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 创建时间 
     * @return CreateAt 创建时间
     */
    public String getCreateAt() {
        return this.CreateAt;
    }

    /**
     * Set 创建时间
     * @param CreateAt 创建时间
     */
    public void setCreateAt(String CreateAt) {
        this.CreateAt = CreateAt;
    }

    /**
     * Get 是否可信 
     * @return IsValid 是否可信
     */
    public Boolean getIsValid() {
        return this.IsValid;
    }

    /**
     * Set 是否可信
     * @param IsValid 是否可信
     */
    public void setIsValid(Boolean IsValid) {
        this.IsValid = IsValid;
    }

    public DisplaySeed() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DisplaySeed(DisplaySeed source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.CustomerId != null) {
            this.CustomerId = new Long(source.CustomerId);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Md5 != null) {
            this.Md5 = new String(source.Md5);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.CreateAt != null) {
            this.CreateAt = new String(source.CreateAt);
        }
        if (source.IsValid != null) {
            this.IsValid = new Boolean(source.IsValid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "CustomerId", this.CustomerId);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Md5", this.Md5);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "CreateAt", this.CreateAt);
        this.setParamSimple(map, prefix + "IsValid", this.IsValid);

    }
}

