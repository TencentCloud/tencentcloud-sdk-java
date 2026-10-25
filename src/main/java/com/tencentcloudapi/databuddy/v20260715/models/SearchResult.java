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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchResult extends AbstractModel {

    /**
    * <p>资产全名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FullName")
    @Expose
    private String FullName;

    /**
    * <p>资产全局ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetGuid")
    @Expose
    private String AssetGuid;

    /**
    * <p>各资产类别下的唯一ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * <p>资产名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetName")
    @Expose
    private String AssetName;

    /**
    * <p>资产类型，参见ListEntityTypeMetas返回的EntityType</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * <p>用户活动</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserActivityInfo")
    @Expose
    private UserActivityInfo UserActivityInfo;

    /**
    * <p>热度，值范围：[1,2,3,4]</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Popularity")
    @Expose
    private String Popularity;

    /**
    * <p>资产标签</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
    * <p>责任人</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Owner")
    @Expose
    private Owner Owner;

    /**
    * <p>最近更新时间，毫秒时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModifiedTime")
    @Expose
    private String ModifiedTime;

    /**
    * <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * <p>工作空间ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * <p>工作空间文件夹路径（废弃）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkspaceFolderPath")
    @Expose
    private String WorkspaceFolderPath;

    /**
    * <p>高亮(废弃)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Highlighting")
    @Expose
    private Highlighting [] Highlighting;

    /**
    * <p>各类资产扩展信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Properties")
    @Expose
    private KVPair [] Properties;

    /**
    * <p>工作空间文件夹路径</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkspacePath")
    @Expose
    private String WorkspacePath;

    /**
    * <p>字段信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FieldInfo")
    @Expose
    private FieldInfo [] FieldInfo;

    /**
    * <p>废弃</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SignalLevel")
    @Expose
    private String SignalLevel;

    /**
    * <p>热度值</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PopularityQuantity")
    @Expose
    private String PopularityQuantity;

    /**
    * <p>高亮</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HighlightingInfo")
    @Expose
    private HighlightingInfo HighlightingInfo;

    /**
    * <p>字段标签列表，返回资产下所有字段上打的标签信息，用于展示字段级标签；每项包含 LabelId、LabelName、LabelType、FieldName、FieldType</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FieldTags")
    @Expose
    private FieldTagInfo [] FieldTags;

    /**
    * <p>资产别名列表。使用场景：仅指标、语义模型等业务资产支持多别名，其他资产类型返回空列表。前端可选择在资产名后面以【别名1、别名2】的形式展示</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Aliases")
    @Expose
    private String [] Aliases;

    /**
    * <p>资产元数据来源。取值：METALAKE（专业版tclake）/ CONNECTION（分析版Linked Catalog）/ SETATS（Setats元数据）。仅catalog类资产（CATALOG/SCHEMA/TABLE/VIEW/MODEL/VOLUME/FUNCTION/TABLE_COLUMN）返回该字段，非catalog类资产该字段为空字符串。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CatalogSource")
    @Expose
    private String CatalogSource;

    /**
     * Get <p>资产全名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FullName <p>资产全名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFullName() {
        return this.FullName;
    }

    /**
     * Set <p>资产全名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FullName <p>资产全名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    /**
     * Get <p>资产全局ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetGuid <p>资产全局ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAssetGuid() {
        return this.AssetGuid;
    }

    /**
     * Set <p>资产全局ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetGuid <p>资产全局ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetGuid(String AssetGuid) {
        this.AssetGuid = AssetGuid;
    }

    /**
     * Get <p>各资产类别下的唯一ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetId <p>各资产类别下的唯一ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set <p>各资产类别下的唯一ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetId <p>各资产类别下的唯一ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get <p>资产名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetName <p>资产名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAssetName() {
        return this.AssetName;
    }

    /**
     * Set <p>资产名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetName <p>资产名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetName(String AssetName) {
        this.AssetName = AssetName;
    }

    /**
     * Get <p>资产类型，参见ListEntityTypeMetas返回的EntityType</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetType <p>资产类型，参见ListEntityTypeMetas返回的EntityType</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set <p>资产类型，参见ListEntityTypeMetas返回的EntityType</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetType <p>资产类型，参见ListEntityTypeMetas返回的EntityType</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get <p>用户活动</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserActivityInfo <p>用户活动</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public UserActivityInfo getUserActivityInfo() {
        return this.UserActivityInfo;
    }

    /**
     * Set <p>用户活动</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserActivityInfo <p>用户活动</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserActivityInfo(UserActivityInfo UserActivityInfo) {
        this.UserActivityInfo = UserActivityInfo;
    }

    /**
     * Get <p>热度，值范围：[1,2,3,4]</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Popularity <p>热度，值范围：[1,2,3,4]</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPopularity() {
        return this.Popularity;
    }

    /**
     * Set <p>热度，值范围：[1,2,3,4]</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Popularity <p>热度，值范围：[1,2,3,4]</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPopularity(String Popularity) {
        this.Popularity = Popularity;
    }

    /**
     * Get <p>资产标签</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags <p>资产标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>资产标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags <p>资产标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>责任人</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Owner <p>责任人</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Owner getOwner() {
        return this.Owner;
    }

    /**
     * Set <p>责任人</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Owner <p>责任人</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwner(Owner Owner) {
        this.Owner = Owner;
    }

    /**
     * Get <p>最近更新时间，毫秒时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifiedTime <p>最近更新时间，毫秒时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModifiedTime() {
        return this.ModifiedTime;
    }

    /**
     * Set <p>最近更新时间，毫秒时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifiedTime <p>最近更新时间，毫秒时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifiedTime(String ModifiedTime) {
        this.ModifiedTime = ModifiedTime;
    }

    /**
     * Get <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Comment <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Comment <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get <p>工作空间ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkspaceId <p>工作空间ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set <p>工作空间ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkspaceId <p>工作空间ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkspaceId(String WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get <p>工作空间文件夹路径（废弃）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkspaceFolderPath <p>工作空间文件夹路径（废弃）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkspaceFolderPath() {
        return this.WorkspaceFolderPath;
    }

    /**
     * Set <p>工作空间文件夹路径（废弃）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkspaceFolderPath <p>工作空间文件夹路径（废弃）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkspaceFolderPath(String WorkspaceFolderPath) {
        this.WorkspaceFolderPath = WorkspaceFolderPath;
    }

    /**
     * Get <p>高亮(废弃)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Highlighting <p>高亮(废弃)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Highlighting [] getHighlighting() {
        return this.Highlighting;
    }

    /**
     * Set <p>高亮(废弃)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Highlighting <p>高亮(废弃)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHighlighting(Highlighting [] Highlighting) {
        this.Highlighting = Highlighting;
    }

    /**
     * Get <p>各类资产扩展信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Properties <p>各类资产扩展信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KVPair [] getProperties() {
        return this.Properties;
    }

    /**
     * Set <p>各类资产扩展信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Properties <p>各类资产扩展信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProperties(KVPair [] Properties) {
        this.Properties = Properties;
    }

    /**
     * Get <p>工作空间文件夹路径</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkspacePath <p>工作空间文件夹路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkspacePath() {
        return this.WorkspacePath;
    }

    /**
     * Set <p>工作空间文件夹路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkspacePath <p>工作空间文件夹路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkspacePath(String WorkspacePath) {
        this.WorkspacePath = WorkspacePath;
    }

    /**
     * Get <p>字段信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FieldInfo <p>字段信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FieldInfo [] getFieldInfo() {
        return this.FieldInfo;
    }

    /**
     * Set <p>字段信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FieldInfo <p>字段信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFieldInfo(FieldInfo [] FieldInfo) {
        this.FieldInfo = FieldInfo;
    }

    /**
     * Get <p>废弃</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SignalLevel <p>废弃</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSignalLevel() {
        return this.SignalLevel;
    }

    /**
     * Set <p>废弃</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SignalLevel <p>废弃</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSignalLevel(String SignalLevel) {
        this.SignalLevel = SignalLevel;
    }

    /**
     * Get <p>热度值</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PopularityQuantity <p>热度值</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPopularityQuantity() {
        return this.PopularityQuantity;
    }

    /**
     * Set <p>热度值</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PopularityQuantity <p>热度值</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPopularityQuantity(String PopularityQuantity) {
        this.PopularityQuantity = PopularityQuantity;
    }

    /**
     * Get <p>高亮</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HighlightingInfo <p>高亮</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HighlightingInfo getHighlightingInfo() {
        return this.HighlightingInfo;
    }

    /**
     * Set <p>高亮</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param HighlightingInfo <p>高亮</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHighlightingInfo(HighlightingInfo HighlightingInfo) {
        this.HighlightingInfo = HighlightingInfo;
    }

    /**
     * Get <p>字段标签列表，返回资产下所有字段上打的标签信息，用于展示字段级标签；每项包含 LabelId、LabelName、LabelType、FieldName、FieldType</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FieldTags <p>字段标签列表，返回资产下所有字段上打的标签信息，用于展示字段级标签；每项包含 LabelId、LabelName、LabelType、FieldName、FieldType</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FieldTagInfo [] getFieldTags() {
        return this.FieldTags;
    }

    /**
     * Set <p>字段标签列表，返回资产下所有字段上打的标签信息，用于展示字段级标签；每项包含 LabelId、LabelName、LabelType、FieldName、FieldType</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FieldTags <p>字段标签列表，返回资产下所有字段上打的标签信息，用于展示字段级标签；每项包含 LabelId、LabelName、LabelType、FieldName、FieldType</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFieldTags(FieldTagInfo [] FieldTags) {
        this.FieldTags = FieldTags;
    }

    /**
     * Get <p>资产别名列表。使用场景：仅指标、语义模型等业务资产支持多别名，其他资产类型返回空列表。前端可选择在资产名后面以【别名1、别名2】的形式展示</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Aliases <p>资产别名列表。使用场景：仅指标、语义模型等业务资产支持多别名，其他资产类型返回空列表。前端可选择在资产名后面以【别名1、别名2】的形式展示</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getAliases() {
        return this.Aliases;
    }

    /**
     * Set <p>资产别名列表。使用场景：仅指标、语义模型等业务资产支持多别名，其他资产类型返回空列表。前端可选择在资产名后面以【别名1、别名2】的形式展示</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Aliases <p>资产别名列表。使用场景：仅指标、语义模型等业务资产支持多别名，其他资产类型返回空列表。前端可选择在资产名后面以【别名1、别名2】的形式展示</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAliases(String [] Aliases) {
        this.Aliases = Aliases;
    }

    /**
     * Get <p>资产元数据来源。取值：METALAKE（专业版tclake）/ CONNECTION（分析版Linked Catalog）/ SETATS（Setats元数据）。仅catalog类资产（CATALOG/SCHEMA/TABLE/VIEW/MODEL/VOLUME/FUNCTION/TABLE_COLUMN）返回该字段，非catalog类资产该字段为空字符串。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CatalogSource <p>资产元数据来源。取值：METALAKE（专业版tclake）/ CONNECTION（分析版Linked Catalog）/ SETATS（Setats元数据）。仅catalog类资产（CATALOG/SCHEMA/TABLE/VIEW/MODEL/VOLUME/FUNCTION/TABLE_COLUMN）返回该字段，非catalog类资产该字段为空字符串。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCatalogSource() {
        return this.CatalogSource;
    }

    /**
     * Set <p>资产元数据来源。取值：METALAKE（专业版tclake）/ CONNECTION（分析版Linked Catalog）/ SETATS（Setats元数据）。仅catalog类资产（CATALOG/SCHEMA/TABLE/VIEW/MODEL/VOLUME/FUNCTION/TABLE_COLUMN）返回该字段，非catalog类资产该字段为空字符串。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CatalogSource <p>资产元数据来源。取值：METALAKE（专业版tclake）/ CONNECTION（分析版Linked Catalog）/ SETATS（Setats元数据）。仅catalog类资产（CATALOG/SCHEMA/TABLE/VIEW/MODEL/VOLUME/FUNCTION/TABLE_COLUMN）返回该字段，非catalog类资产该字段为空字符串。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCatalogSource(String CatalogSource) {
        this.CatalogSource = CatalogSource;
    }

    public SearchResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchResult(SearchResult source) {
        if (source.FullName != null) {
            this.FullName = new String(source.FullName);
        }
        if (source.AssetGuid != null) {
            this.AssetGuid = new String(source.AssetGuid);
        }
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
        }
        if (source.AssetName != null) {
            this.AssetName = new String(source.AssetName);
        }
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.UserActivityInfo != null) {
            this.UserActivityInfo = new UserActivityInfo(source.UserActivityInfo);
        }
        if (source.Popularity != null) {
            this.Popularity = new String(source.Popularity);
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
        if (source.Owner != null) {
            this.Owner = new Owner(source.Owner);
        }
        if (source.ModifiedTime != null) {
            this.ModifiedTime = new String(source.ModifiedTime);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
        if (source.WorkspaceFolderPath != null) {
            this.WorkspaceFolderPath = new String(source.WorkspaceFolderPath);
        }
        if (source.Highlighting != null) {
            this.Highlighting = new Highlighting[source.Highlighting.length];
            for (int i = 0; i < source.Highlighting.length; i++) {
                this.Highlighting[i] = new Highlighting(source.Highlighting[i]);
            }
        }
        if (source.Properties != null) {
            this.Properties = new KVPair[source.Properties.length];
            for (int i = 0; i < source.Properties.length; i++) {
                this.Properties[i] = new KVPair(source.Properties[i]);
            }
        }
        if (source.WorkspacePath != null) {
            this.WorkspacePath = new String(source.WorkspacePath);
        }
        if (source.FieldInfo != null) {
            this.FieldInfo = new FieldInfo[source.FieldInfo.length];
            for (int i = 0; i < source.FieldInfo.length; i++) {
                this.FieldInfo[i] = new FieldInfo(source.FieldInfo[i]);
            }
        }
        if (source.SignalLevel != null) {
            this.SignalLevel = new String(source.SignalLevel);
        }
        if (source.PopularityQuantity != null) {
            this.PopularityQuantity = new String(source.PopularityQuantity);
        }
        if (source.HighlightingInfo != null) {
            this.HighlightingInfo = new HighlightingInfo(source.HighlightingInfo);
        }
        if (source.FieldTags != null) {
            this.FieldTags = new FieldTagInfo[source.FieldTags.length];
            for (int i = 0; i < source.FieldTags.length; i++) {
                this.FieldTags[i] = new FieldTagInfo(source.FieldTags[i]);
            }
        }
        if (source.Aliases != null) {
            this.Aliases = new String[source.Aliases.length];
            for (int i = 0; i < source.Aliases.length; i++) {
                this.Aliases[i] = new String(source.Aliases[i]);
            }
        }
        if (source.CatalogSource != null) {
            this.CatalogSource = new String(source.CatalogSource);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FullName", this.FullName);
        this.setParamSimple(map, prefix + "AssetGuid", this.AssetGuid);
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "AssetName", this.AssetName);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamObj(map, prefix + "UserActivityInfo.", this.UserActivityInfo);
        this.setParamSimple(map, prefix + "Popularity", this.Popularity);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamObj(map, prefix + "Owner.", this.Owner);
        this.setParamSimple(map, prefix + "ModifiedTime", this.ModifiedTime);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "WorkspaceFolderPath", this.WorkspaceFolderPath);
        this.setParamArrayObj(map, prefix + "Highlighting.", this.Highlighting);
        this.setParamArrayObj(map, prefix + "Properties.", this.Properties);
        this.setParamSimple(map, prefix + "WorkspacePath", this.WorkspacePath);
        this.setParamArrayObj(map, prefix + "FieldInfo.", this.FieldInfo);
        this.setParamSimple(map, prefix + "SignalLevel", this.SignalLevel);
        this.setParamSimple(map, prefix + "PopularityQuantity", this.PopularityQuantity);
        this.setParamObj(map, prefix + "HighlightingInfo.", this.HighlightingInfo);
        this.setParamArrayObj(map, prefix + "FieldTags.", this.FieldTags);
        this.setParamArraySimple(map, prefix + "Aliases.", this.Aliases);
        this.setParamSimple(map, prefix + "CatalogSource", this.CatalogSource);

    }
}

