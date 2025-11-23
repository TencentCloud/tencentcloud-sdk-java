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

public class CreateSuspiciousAssetRequest extends AbstractModel {

    /**
    * 企业Id
    */
    @SerializedName("CustomerId")
    @Expose
    private Long CustomerId;

    /**
    * Url
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 子公司
    */
    @SerializedName("EnterpriseUid")
    @Expose
    private String EnterpriseUid;

    /**
    * 标题
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * 标签
    */
    @SerializedName("Tags")
    @Expose
    private String Tags;

    /**
    * 所属者
    */
    @SerializedName("Owner")
    @Expose
    private String Owner;

    /**
    * 来源类型
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * 来源值
    */
    @SerializedName("SourceValue")
    @Expose
    private String SourceValue;

    /**
    * 是否信任
    */
    @SerializedName("Trusted")
    @Expose
    private Boolean Trusted;

    /**
     * Get 企业Id 
     * @return CustomerId 企业Id
     */
    public Long getCustomerId() {
        return this.CustomerId;
    }

    /**
     * Set 企业Id
     * @param CustomerId 企业Id
     */
    public void setCustomerId(Long CustomerId) {
        this.CustomerId = CustomerId;
    }

    /**
     * Get Url 
     * @return Url Url
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Url
     * @param Url Url
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 子公司 
     * @return EnterpriseUid 子公司
     */
    public String getEnterpriseUid() {
        return this.EnterpriseUid;
    }

    /**
     * Set 子公司
     * @param EnterpriseUid 子公司
     */
    public void setEnterpriseUid(String EnterpriseUid) {
        this.EnterpriseUid = EnterpriseUid;
    }

    /**
     * Get 标题 
     * @return Title 标题
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set 标题
     * @param Title 标题
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get 标签 
     * @return Tags 标签
     */
    public String getTags() {
        return this.Tags;
    }

    /**
     * Set 标签
     * @param Tags 标签
     */
    public void setTags(String Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 所属者 
     * @return Owner 所属者
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * Set 所属者
     * @param Owner 所属者
     */
    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    /**
     * Get 来源类型 
     * @return SourceType 来源类型
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set 来源类型
     * @param SourceType 来源类型
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get 来源值 
     * @return SourceValue 来源值
     */
    public String getSourceValue() {
        return this.SourceValue;
    }

    /**
     * Set 来源值
     * @param SourceValue 来源值
     */
    public void setSourceValue(String SourceValue) {
        this.SourceValue = SourceValue;
    }

    /**
     * Get 是否信任 
     * @return Trusted 是否信任
     */
    public Boolean getTrusted() {
        return this.Trusted;
    }

    /**
     * Set 是否信任
     * @param Trusted 是否信任
     */
    public void setTrusted(Boolean Trusted) {
        this.Trusted = Trusted;
    }

    public CreateSuspiciousAssetRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSuspiciousAssetRequest(CreateSuspiciousAssetRequest source) {
        if (source.CustomerId != null) {
            this.CustomerId = new Long(source.CustomerId);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.EnterpriseUid != null) {
            this.EnterpriseUid = new String(source.EnterpriseUid);
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Tags != null) {
            this.Tags = new String(source.Tags);
        }
        if (source.Owner != null) {
            this.Owner = new String(source.Owner);
        }
        if (source.SourceType != null) {
            this.SourceType = new String(source.SourceType);
        }
        if (source.SourceValue != null) {
            this.SourceValue = new String(source.SourceValue);
        }
        if (source.Trusted != null) {
            this.Trusted = new Boolean(source.Trusted);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CustomerId", this.CustomerId);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "EnterpriseUid", this.EnterpriseUid);
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Tags", this.Tags);
        this.setParamSimple(map, prefix + "Owner", this.Owner);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "SourceValue", this.SourceValue);
        this.setParamSimple(map, prefix + "Trusted", this.Trusted);

    }
}

