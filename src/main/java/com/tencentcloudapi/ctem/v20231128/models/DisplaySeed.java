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
    * <p>主键ID</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>企业ID</p>
    */
    @SerializedName("CustomerId")
    @Expose
    private Long CustomerId;

    /**
    * <p>分类，包括：domain(主域名)、icon(图标)、ip(IP)、<br>keyword(关键词)、parent_company(母公司)、sub_domain(子域名)、title(标题)</p>
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * <p>值</p>
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * <p>md5值</p>
    */
    @SerializedName("Md5")
    @Expose
    private String Md5;

    /**
    * <p>来源</p>
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateAt")
    @Expose
    private String CreateAt;

    /**
    * <p>是否可信</p>
    */
    @SerializedName("IsValid")
    @Expose
    private Boolean IsValid;

    /**
    * <p>关键词用途，可多选：leakage_code代码泄露/leakage_data其他泄露/wechat_applet微信小程序/wechat_official_account微信公众号；不填=全部用途</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Purposes")
    @Expose
    private String [] Purposes;

    /**
     * Get <p>主键ID</p> 
     * @return Id <p>主键ID</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>主键ID</p>
     * @param Id <p>主键ID</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>企业ID</p> 
     * @return CustomerId <p>企业ID</p>
     */
    public Long getCustomerId() {
        return this.CustomerId;
    }

    /**
     * Set <p>企业ID</p>
     * @param CustomerId <p>企业ID</p>
     */
    public void setCustomerId(Long CustomerId) {
        this.CustomerId = CustomerId;
    }

    /**
     * Get <p>分类，包括：domain(主域名)、icon(图标)、ip(IP)、<br>keyword(关键词)、parent_company(母公司)、sub_domain(子域名)、title(标题)</p> 
     * @return Category <p>分类，包括：domain(主域名)、icon(图标)、ip(IP)、<br>keyword(关键词)、parent_company(母公司)、sub_domain(子域名)、title(标题)</p>
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set <p>分类，包括：domain(主域名)、icon(图标)、ip(IP)、<br>keyword(关键词)、parent_company(母公司)、sub_domain(子域名)、title(标题)</p>
     * @param Category <p>分类，包括：domain(主域名)、icon(图标)、ip(IP)、<br>keyword(关键词)、parent_company(母公司)、sub_domain(子域名)、title(标题)</p>
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get <p>值</p> 
     * @return Value <p>值</p>
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set <p>值</p>
     * @param Value <p>值</p>
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get <p>md5值</p> 
     * @return Md5 <p>md5值</p>
     */
    public String getMd5() {
        return this.Md5;
    }

    /**
     * Set <p>md5值</p>
     * @param Md5 <p>md5值</p>
     */
    public void setMd5(String Md5) {
        this.Md5 = Md5;
    }

    /**
     * Get <p>来源</p> 
     * @return Source <p>来源</p>
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set <p>来源</p>
     * @param Source <p>来源</p>
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreateAt <p>创建时间</p>
     */
    public String getCreateAt() {
        return this.CreateAt;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateAt <p>创建时间</p>
     */
    public void setCreateAt(String CreateAt) {
        this.CreateAt = CreateAt;
    }

    /**
     * Get <p>是否可信</p> 
     * @return IsValid <p>是否可信</p>
     */
    public Boolean getIsValid() {
        return this.IsValid;
    }

    /**
     * Set <p>是否可信</p>
     * @param IsValid <p>是否可信</p>
     */
    public void setIsValid(Boolean IsValid) {
        this.IsValid = IsValid;
    }

    /**
     * Get <p>关键词用途，可多选：leakage_code代码泄露/leakage_data其他泄露/wechat_applet微信小程序/wechat_official_account微信公众号；不填=全部用途</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Purposes <p>关键词用途，可多选：leakage_code代码泄露/leakage_data其他泄露/wechat_applet微信小程序/wechat_official_account微信公众号；不填=全部用途</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getPurposes() {
        return this.Purposes;
    }

    /**
     * Set <p>关键词用途，可多选：leakage_code代码泄露/leakage_data其他泄露/wechat_applet微信小程序/wechat_official_account微信公众号；不填=全部用途</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Purposes <p>关键词用途，可多选：leakage_code代码泄露/leakage_data其他泄露/wechat_applet微信小程序/wechat_official_account微信公众号；不填=全部用途</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPurposes(String [] Purposes) {
        this.Purposes = Purposes;
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
        if (source.Purposes != null) {
            this.Purposes = new String[source.Purposes.length];
            for (int i = 0; i < source.Purposes.length; i++) {
                this.Purposes[i] = new String(source.Purposes[i]);
            }
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
        this.setParamArraySimple(map, prefix + "Purposes.", this.Purposes);

    }
}

