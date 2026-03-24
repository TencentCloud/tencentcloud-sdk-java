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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyNamespaceRequest extends AbstractModel {

    /**
    * <p>实例Id</p>
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * <p>命名空间名称</p>
    */
    @SerializedName("NamespaceName")
    @Expose
    private String NamespaceName;

    /**
    * <p>访问级别，True为公开，False为私有</p>
    */
    @SerializedName("IsPublic")
    @Expose
    private Boolean IsPublic;

    /**
    * <p>扫描级别，True为自动，False为手动</p>
    */
    @SerializedName("IsAutoScan")
    @Expose
    private Boolean IsAutoScan;

    /**
    * <p>阻断开关，True为开放，False为关闭</p>
    */
    @SerializedName("IsPreventVUL")
    @Expose
    private Boolean IsPreventVUL;

    /**
    * <p>阻断漏洞等级，目前仅支持 low、medium、high</p>
    */
    @SerializedName("Severity")
    @Expose
    private String Severity;

    /**
    * <p>漏洞白名单列表</p>
    */
    @SerializedName("CVEWhitelistItems")
    @Expose
    private CVEWhitelistItem [] CVEWhitelistItems;

    /**
    * <p>tag列表</p>
    */
    @SerializedName("TagSpecification")
    @Expose
    private TagSpecification TagSpecification;

    /**
     * Get <p>实例Id</p> 
     * @return RegistryId <p>实例Id</p>
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set <p>实例Id</p>
     * @param RegistryId <p>实例Id</p>
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get <p>命名空间名称</p> 
     * @return NamespaceName <p>命名空间名称</p>
     */
    public String getNamespaceName() {
        return this.NamespaceName;
    }

    /**
     * Set <p>命名空间名称</p>
     * @param NamespaceName <p>命名空间名称</p>
     */
    public void setNamespaceName(String NamespaceName) {
        this.NamespaceName = NamespaceName;
    }

    /**
     * Get <p>访问级别，True为公开，False为私有</p> 
     * @return IsPublic <p>访问级别，True为公开，False为私有</p>
     */
    public Boolean getIsPublic() {
        return this.IsPublic;
    }

    /**
     * Set <p>访问级别，True为公开，False为私有</p>
     * @param IsPublic <p>访问级别，True为公开，False为私有</p>
     */
    public void setIsPublic(Boolean IsPublic) {
        this.IsPublic = IsPublic;
    }

    /**
     * Get <p>扫描级别，True为自动，False为手动</p> 
     * @return IsAutoScan <p>扫描级别，True为自动，False为手动</p>
     */
    public Boolean getIsAutoScan() {
        return this.IsAutoScan;
    }

    /**
     * Set <p>扫描级别，True为自动，False为手动</p>
     * @param IsAutoScan <p>扫描级别，True为自动，False为手动</p>
     */
    public void setIsAutoScan(Boolean IsAutoScan) {
        this.IsAutoScan = IsAutoScan;
    }

    /**
     * Get <p>阻断开关，True为开放，False为关闭</p> 
     * @return IsPreventVUL <p>阻断开关，True为开放，False为关闭</p>
     */
    public Boolean getIsPreventVUL() {
        return this.IsPreventVUL;
    }

    /**
     * Set <p>阻断开关，True为开放，False为关闭</p>
     * @param IsPreventVUL <p>阻断开关，True为开放，False为关闭</p>
     */
    public void setIsPreventVUL(Boolean IsPreventVUL) {
        this.IsPreventVUL = IsPreventVUL;
    }

    /**
     * Get <p>阻断漏洞等级，目前仅支持 low、medium、high</p> 
     * @return Severity <p>阻断漏洞等级，目前仅支持 low、medium、high</p>
     */
    public String getSeverity() {
        return this.Severity;
    }

    /**
     * Set <p>阻断漏洞等级，目前仅支持 low、medium、high</p>
     * @param Severity <p>阻断漏洞等级，目前仅支持 low、medium、high</p>
     */
    public void setSeverity(String Severity) {
        this.Severity = Severity;
    }

    /**
     * Get <p>漏洞白名单列表</p> 
     * @return CVEWhitelistItems <p>漏洞白名单列表</p>
     */
    public CVEWhitelistItem [] getCVEWhitelistItems() {
        return this.CVEWhitelistItems;
    }

    /**
     * Set <p>漏洞白名单列表</p>
     * @param CVEWhitelistItems <p>漏洞白名单列表</p>
     */
    public void setCVEWhitelistItems(CVEWhitelistItem [] CVEWhitelistItems) {
        this.CVEWhitelistItems = CVEWhitelistItems;
    }

    /**
     * Get <p>tag列表</p> 
     * @return TagSpecification <p>tag列表</p>
     */
    public TagSpecification getTagSpecification() {
        return this.TagSpecification;
    }

    /**
     * Set <p>tag列表</p>
     * @param TagSpecification <p>tag列表</p>
     */
    public void setTagSpecification(TagSpecification TagSpecification) {
        this.TagSpecification = TagSpecification;
    }

    public ModifyNamespaceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyNamespaceRequest(ModifyNamespaceRequest source) {
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.NamespaceName != null) {
            this.NamespaceName = new String(source.NamespaceName);
        }
        if (source.IsPublic != null) {
            this.IsPublic = new Boolean(source.IsPublic);
        }
        if (source.IsAutoScan != null) {
            this.IsAutoScan = new Boolean(source.IsAutoScan);
        }
        if (source.IsPreventVUL != null) {
            this.IsPreventVUL = new Boolean(source.IsPreventVUL);
        }
        if (source.Severity != null) {
            this.Severity = new String(source.Severity);
        }
        if (source.CVEWhitelistItems != null) {
            this.CVEWhitelistItems = new CVEWhitelistItem[source.CVEWhitelistItems.length];
            for (int i = 0; i < source.CVEWhitelistItems.length; i++) {
                this.CVEWhitelistItems[i] = new CVEWhitelistItem(source.CVEWhitelistItems[i]);
            }
        }
        if (source.TagSpecification != null) {
            this.TagSpecification = new TagSpecification(source.TagSpecification);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "NamespaceName", this.NamespaceName);
        this.setParamSimple(map, prefix + "IsPublic", this.IsPublic);
        this.setParamSimple(map, prefix + "IsAutoScan", this.IsAutoScan);
        this.setParamSimple(map, prefix + "IsPreventVUL", this.IsPreventVUL);
        this.setParamSimple(map, prefix + "Severity", this.Severity);
        this.setParamArrayObj(map, prefix + "CVEWhitelistItems.", this.CVEWhitelistItems);
        this.setParamObj(map, prefix + "TagSpecification.", this.TagSpecification);

    }
}

