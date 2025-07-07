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

public class TcrNamespaceInfo extends AbstractModel {

    /**
    * 命名空间名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 创建时间
    */
    @SerializedName("CreationTime")
    @Expose
    private String CreationTime;

    /**
    * 访问级别
    */
    @SerializedName("Public")
    @Expose
    private Boolean Public;

    /**
    * 命名空间的Id
    */
    @SerializedName("NamespaceId")
    @Expose
    private Long NamespaceId;

    /**
    * 实例云标签
    */
    @SerializedName("TagSpecification")
    @Expose
    private TagSpecification TagSpecification;

    /**
    * 命名空间元数据
    */
    @SerializedName("Metadata")
    @Expose
    private KeyValueString [] Metadata;

    /**
    * 漏洞白名单列表
    */
    @SerializedName("CVEWhitelistItems")
    @Expose
    private CVEWhitelistItem [] CVEWhitelistItems;

    /**
    * 扫描级别，true为自动，false为手动
    */
    @SerializedName("AutoScan")
    @Expose
    private Boolean AutoScan;

    /**
    * 安全阻断级别，true为开启，false为关闭
    */
    @SerializedName("PreventVUL")
    @Expose
    private Boolean PreventVUL;

    /**
    * 阻断漏洞等级，目前仅支持low、medium、high, 为""时表示没有设置
    */
    @SerializedName("Severity")
    @Expose
    private String Severity;

    /**
     * Get 命名空间名称 
     * @return Name 命名空间名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 命名空间名称
     * @param Name 命名空间名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 创建时间 
     * @return CreationTime 创建时间
     */
    public String getCreationTime() {
        return this.CreationTime;
    }

    /**
     * Set 创建时间
     * @param CreationTime 创建时间
     */
    public void setCreationTime(String CreationTime) {
        this.CreationTime = CreationTime;
    }

    /**
     * Get 访问级别 
     * @return Public 访问级别
     */
    public Boolean getPublic() {
        return this.Public;
    }

    /**
     * Set 访问级别
     * @param Public 访问级别
     */
    public void setPublic(Boolean Public) {
        this.Public = Public;
    }

    /**
     * Get 命名空间的Id 
     * @return NamespaceId 命名空间的Id
     */
    public Long getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set 命名空间的Id
     * @param NamespaceId 命名空间的Id
     */
    public void setNamespaceId(Long NamespaceId) {
        this.NamespaceId = NamespaceId;
    }

    /**
     * Get 实例云标签 
     * @return TagSpecification 实例云标签
     */
    public TagSpecification getTagSpecification() {
        return this.TagSpecification;
    }

    /**
     * Set 实例云标签
     * @param TagSpecification 实例云标签
     */
    public void setTagSpecification(TagSpecification TagSpecification) {
        this.TagSpecification = TagSpecification;
    }

    /**
     * Get 命名空间元数据 
     * @return Metadata 命名空间元数据
     */
    public KeyValueString [] getMetadata() {
        return this.Metadata;
    }

    /**
     * Set 命名空间元数据
     * @param Metadata 命名空间元数据
     */
    public void setMetadata(KeyValueString [] Metadata) {
        this.Metadata = Metadata;
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

    /**
     * Get 扫描级别，true为自动，false为手动 
     * @return AutoScan 扫描级别，true为自动，false为手动
     */
    public Boolean getAutoScan() {
        return this.AutoScan;
    }

    /**
     * Set 扫描级别，true为自动，false为手动
     * @param AutoScan 扫描级别，true为自动，false为手动
     */
    public void setAutoScan(Boolean AutoScan) {
        this.AutoScan = AutoScan;
    }

    /**
     * Get 安全阻断级别，true为开启，false为关闭 
     * @return PreventVUL 安全阻断级别，true为开启，false为关闭
     */
    public Boolean getPreventVUL() {
        return this.PreventVUL;
    }

    /**
     * Set 安全阻断级别，true为开启，false为关闭
     * @param PreventVUL 安全阻断级别，true为开启，false为关闭
     */
    public void setPreventVUL(Boolean PreventVUL) {
        this.PreventVUL = PreventVUL;
    }

    /**
     * Get 阻断漏洞等级，目前仅支持low、medium、high, 为""时表示没有设置 
     * @return Severity 阻断漏洞等级，目前仅支持low、medium、high, 为""时表示没有设置
     */
    public String getSeverity() {
        return this.Severity;
    }

    /**
     * Set 阻断漏洞等级，目前仅支持low、medium、high, 为""时表示没有设置
     * @param Severity 阻断漏洞等级，目前仅支持low、medium、high, 为""时表示没有设置
     */
    public void setSeverity(String Severity) {
        this.Severity = Severity;
    }

    public TcrNamespaceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TcrNamespaceInfo(TcrNamespaceInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.CreationTime != null) {
            this.CreationTime = new String(source.CreationTime);
        }
        if (source.Public != null) {
            this.Public = new Boolean(source.Public);
        }
        if (source.NamespaceId != null) {
            this.NamespaceId = new Long(source.NamespaceId);
        }
        if (source.TagSpecification != null) {
            this.TagSpecification = new TagSpecification(source.TagSpecification);
        }
        if (source.Metadata != null) {
            this.Metadata = new KeyValueString[source.Metadata.length];
            for (int i = 0; i < source.Metadata.length; i++) {
                this.Metadata[i] = new KeyValueString(source.Metadata[i]);
            }
        }
        if (source.CVEWhitelistItems != null) {
            this.CVEWhitelistItems = new CVEWhitelistItem[source.CVEWhitelistItems.length];
            for (int i = 0; i < source.CVEWhitelistItems.length; i++) {
                this.CVEWhitelistItems[i] = new CVEWhitelistItem(source.CVEWhitelistItems[i]);
            }
        }
        if (source.AutoScan != null) {
            this.AutoScan = new Boolean(source.AutoScan);
        }
        if (source.PreventVUL != null) {
            this.PreventVUL = new Boolean(source.PreventVUL);
        }
        if (source.Severity != null) {
            this.Severity = new String(source.Severity);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "CreationTime", this.CreationTime);
        this.setParamSimple(map, prefix + "Public", this.Public);
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
        this.setParamObj(map, prefix + "TagSpecification.", this.TagSpecification);
        this.setParamArrayObj(map, prefix + "Metadata.", this.Metadata);
        this.setParamArrayObj(map, prefix + "CVEWhitelistItems.", this.CVEWhitelistItems);
        this.setParamSimple(map, prefix + "AutoScan", this.AutoScan);
        this.setParamSimple(map, prefix + "PreventVUL", this.PreventVUL);
        this.setParamSimple(map, prefix + "Severity", this.Severity);

    }
}

