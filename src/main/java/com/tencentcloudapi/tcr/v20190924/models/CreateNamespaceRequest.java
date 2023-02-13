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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateNamespaceRequest extends AbstractModel{

    /**
    * 实例ID
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * 命名空间的名称（长度2-30个字符，只能包含小写字母、数字及分隔符("."、"_"、"-")，且不能以分隔符开头、结尾或连续）
    */
    @SerializedName("NamespaceName")
    @Expose
    private String NamespaceName;

    /**
    * 是否公开，true为公开，fale为私有
    */
    @SerializedName("IsPublic")
    @Expose
    private Boolean IsPublic;

    /**
    * 云标签描述
    */
    @SerializedName("TagSpecification")
    @Expose
    private TagSpecification TagSpecification;

    /**
    * 自动扫描级别，true为自动，false为手动
    */
    @SerializedName("IsAutoScan")
    @Expose
    private Boolean IsAutoScan;

    /**
    * 安全阻断级别，true为自动，false为手动
    */
    @SerializedName("IsPreventVUL")
    @Expose
    private Boolean IsPreventVUL;

    /**
    * 阻断漏洞等级，目前仅支持low、medium、high
    */
    @SerializedName("Severity")
    @Expose
    private String Severity;

    /**
    * 漏洞白名单列表
    */
    @SerializedName("CVEWhitelistItems")
    @Expose
    private CVEWhitelistItem [] CVEWhitelistItems;

    /**
     * Get 实例ID 
     * @return RegistryId 实例ID
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set 实例ID
     * @param RegistryId 实例ID
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get 命名空间的名称（长度2-30个字符，只能包含小写字母、数字及分隔符("."、"_"、"-")，且不能以分隔符开头、结尾或连续） 
     * @return NamespaceName 命名空间的名称（长度2-30个字符，只能包含小写字母、数字及分隔符("."、"_"、"-")，且不能以分隔符开头、结尾或连续）
     */
    public String getNamespaceName() {
        return this.NamespaceName;
    }

    /**
     * Set 命名空间的名称（长度2-30个字符，只能包含小写字母、数字及分隔符("."、"_"、"-")，且不能以分隔符开头、结尾或连续）
     * @param NamespaceName 命名空间的名称（长度2-30个字符，只能包含小写字母、数字及分隔符("."、"_"、"-")，且不能以分隔符开头、结尾或连续）
     */
    public void setNamespaceName(String NamespaceName) {
        this.NamespaceName = NamespaceName;
    }

    /**
     * Get 是否公开，true为公开，fale为私有 
     * @return IsPublic 是否公开，true为公开，fale为私有
     */
    public Boolean getIsPublic() {
        return this.IsPublic;
    }

    /**
     * Set 是否公开，true为公开，fale为私有
     * @param IsPublic 是否公开，true为公开，fale为私有
     */
    public void setIsPublic(Boolean IsPublic) {
        this.IsPublic = IsPublic;
    }

    /**
     * Get 云标签描述 
     * @return TagSpecification 云标签描述
     */
    public TagSpecification getTagSpecification() {
        return this.TagSpecification;
    }

    /**
     * Set 云标签描述
     * @param TagSpecification 云标签描述
     */
    public void setTagSpecification(TagSpecification TagSpecification) {
        this.TagSpecification = TagSpecification;
    }

    /**
     * Get 自动扫描级别，true为自动，false为手动 
     * @return IsAutoScan 自动扫描级别，true为自动，false为手动
     */
    public Boolean getIsAutoScan() {
        return this.IsAutoScan;
    }

    /**
     * Set 自动扫描级别，true为自动，false为手动
     * @param IsAutoScan 自动扫描级别，true为自动，false为手动
     */
    public void setIsAutoScan(Boolean IsAutoScan) {
        this.IsAutoScan = IsAutoScan;
    }

    /**
     * Get 安全阻断级别，true为自动，false为手动 
     * @return IsPreventVUL 安全阻断级别，true为自动，false为手动
     */
    public Boolean getIsPreventVUL() {
        return this.IsPreventVUL;
    }

    /**
     * Set 安全阻断级别，true为自动，false为手动
     * @param IsPreventVUL 安全阻断级别，true为自动，false为手动
     */
    public void setIsPreventVUL(Boolean IsPreventVUL) {
        this.IsPreventVUL = IsPreventVUL;
    }

    /**
     * Get 阻断漏洞等级，目前仅支持low、medium、high 
     * @return Severity 阻断漏洞等级，目前仅支持low、medium、high
     */
    public String getSeverity() {
        return this.Severity;
    }

    /**
     * Set 阻断漏洞等级，目前仅支持low、medium、high
     * @param Severity 阻断漏洞等级，目前仅支持low、medium、high
     */
    public void setSeverity(String Severity) {
        this.Severity = Severity;
    }

    /**
     * Get 漏洞白名单列表 
     * @return CVEWhitelistItems 漏洞白名单列表
     */
    public CVEWhitelistItem [] getCVEWhitelistItems() {
        return this.CVEWhitelistItems;
    }

    /**
     * Set 漏洞白名单列表
     * @param CVEWhitelistItems 漏洞白名单列表
     */
    public void setCVEWhitelistItems(CVEWhitelistItem [] CVEWhitelistItems) {
        this.CVEWhitelistItems = CVEWhitelistItems;
    }

    public CreateNamespaceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateNamespaceRequest(CreateNamespaceRequest source) {
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.NamespaceName != null) {
            this.NamespaceName = new String(source.NamespaceName);
        }
        if (source.IsPublic != null) {
            this.IsPublic = new Boolean(source.IsPublic);
        }
        if (source.TagSpecification != null) {
            this.TagSpecification = new TagSpecification(source.TagSpecification);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "NamespaceName", this.NamespaceName);
        this.setParamSimple(map, prefix + "IsPublic", this.IsPublic);
        this.setParamObj(map, prefix + "TagSpecification.", this.TagSpecification);
        this.setParamSimple(map, prefix + "IsAutoScan", this.IsAutoScan);
        this.setParamSimple(map, prefix + "IsPreventVUL", this.IsPreventVUL);
        this.setParamSimple(map, prefix + "Severity", this.Severity);
        this.setParamArrayObj(map, prefix + "CVEWhitelistItems.", this.CVEWhitelistItems);

    }
}

