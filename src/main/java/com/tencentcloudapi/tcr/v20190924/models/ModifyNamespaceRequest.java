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

public class ModifyNamespaceRequest extends AbstractModel{

    /**
    * 实例Id
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * 命名空间名称
    */
    @SerializedName("NamespaceName")
    @Expose
    private String NamespaceName;

    /**
    * 访问级别，True为公开，False为私有
    */
    @SerializedName("IsPublic")
    @Expose
    private Boolean IsPublic;

    /**
    * 扫描级别，True为自动，False为手动
    */
    @SerializedName("IsAutoScan")
    @Expose
    private Boolean IsAutoScan;

    /**
    * 阻断开关，True为开放，False为关闭
    */
    @SerializedName("IsPreventVUL")
    @Expose
    private Boolean IsPreventVUL;

    /**
    * 阻断漏洞等级，目前仅支持 low、medium、high
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
     * Get 实例Id 
     * @return RegistryId 实例Id
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set 实例Id
     * @param RegistryId 实例Id
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get 命名空间名称 
     * @return NamespaceName 命名空间名称
     */
    public String getNamespaceName() {
        return this.NamespaceName;
    }

    /**
     * Set 命名空间名称
     * @param NamespaceName 命名空间名称
     */
    public void setNamespaceName(String NamespaceName) {
        this.NamespaceName = NamespaceName;
    }

    /**
     * Get 访问级别，True为公开，False为私有 
     * @return IsPublic 访问级别，True为公开，False为私有
     */
    public Boolean getIsPublic() {
        return this.IsPublic;
    }

    /**
     * Set 访问级别，True为公开，False为私有
     * @param IsPublic 访问级别，True为公开，False为私有
     */
    public void setIsPublic(Boolean IsPublic) {
        this.IsPublic = IsPublic;
    }

    /**
     * Get 扫描级别，True为自动，False为手动 
     * @return IsAutoScan 扫描级别，True为自动，False为手动
     */
    public Boolean getIsAutoScan() {
        return this.IsAutoScan;
    }

    /**
     * Set 扫描级别，True为自动，False为手动
     * @param IsAutoScan 扫描级别，True为自动，False为手动
     */
    public void setIsAutoScan(Boolean IsAutoScan) {
        this.IsAutoScan = IsAutoScan;
    }

    /**
     * Get 阻断开关，True为开放，False为关闭 
     * @return IsPreventVUL 阻断开关，True为开放，False为关闭
     */
    public Boolean getIsPreventVUL() {
        return this.IsPreventVUL;
    }

    /**
     * Set 阻断开关，True为开放，False为关闭
     * @param IsPreventVUL 阻断开关，True为开放，False为关闭
     */
    public void setIsPreventVUL(Boolean IsPreventVUL) {
        this.IsPreventVUL = IsPreventVUL;
    }

    /**
     * Get 阻断漏洞等级，目前仅支持 low、medium、high 
     * @return Severity 阻断漏洞等级，目前仅支持 low、medium、high
     */
    public String getSeverity() {
        return this.Severity;
    }

    /**
     * Set 阻断漏洞等级，目前仅支持 low、medium、high
     * @param Severity 阻断漏洞等级，目前仅支持 low、medium、high
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

    }
}

