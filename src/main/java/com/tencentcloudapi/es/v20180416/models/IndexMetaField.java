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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IndexMetaField extends AbstractModel {

    /**
    * <p>索引类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndexType")
    @Expose
    private String IndexType;

    /**
    * <p>索引名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndexName")
    @Expose
    private String IndexName;

    /**
    * <p>索引元数据JSON</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndexMetaJson")
    @Expose
    private String IndexMetaJson;

    /**
    * <p>索引状态</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndexStatus")
    @Expose
    private String IndexStatus;

    /**
    * <p>索引存储大小，单位Byte</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndexStorage")
    @Expose
    private Long IndexStorage;

    /**
    * <p>索引创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndexCreateTime")
    @Expose
    private String IndexCreateTime;

    /**
    * <p>后备索引</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BackingIndices")
    @Expose
    private BackingIndexMetaField [] BackingIndices;

    /**
    * <p>索引所属集群ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>索引所属集群名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * <p>索引所属集群版本</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterVersion")
    @Expose
    private String ClusterVersion;

    /**
    * <p>索引生命周期字段</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndexPolicyField")
    @Expose
    private IndexPolicyField IndexPolicyField;

    /**
    * <p>索引自治字段</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndexOptionsField")
    @Expose
    private IndexOptionsField IndexOptionsField;

    /**
    * <p>索引配置字段</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndexSettingsField")
    @Expose
    private IndexSettingsField IndexSettingsField;

    /**
    * <p>索引别名字段</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndexAliasesField")
    @Expose
    private String [] IndexAliasesField;

    /**
    * <p>索引所属集群APP ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>索引文档数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndexDocs")
    @Expose
    private Long IndexDocs;

    /**
    * <p>当前字段数</p>
    */
    @SerializedName("FieldCount")
    @Expose
    private Long FieldCount;

    /**
    * <p>当前上限</p>
    */
    @SerializedName("FieldLimit")
    @Expose
    private Long FieldLimit;

    /**
    * <p>使用率</p>
    */
    @SerializedName("FieldUsageRatio")
    @Expose
    private String FieldUsageRatio;

    /**
    * <p>占用分片数</p>
    */
    @SerializedName("OccupiedShards")
    @Expose
    private Long OccupiedShards;

    /**
    * <p>索引开启状态</p>
    */
    @SerializedName("IndexOpenStatus")
    @Expose
    private String IndexOpenStatus;

    /**
    * <p>索引字段数硬上限</p>
    */
    @SerializedName("FieldLimitHardCap")
    @Expose
    private Long FieldLimitHardCap;

    /**
    * <p>上限可调整最小值</p>
    */
    @SerializedName("FieldLimitMin")
    @Expose
    private Long FieldLimitMin;

    /**
    * <p>剩余调整次数</p>
    */
    @SerializedName("FieldAutoAdjustRemaining")
    @Expose
    private Long FieldAutoAdjustRemaining;

    /**
     * Get <p>索引类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndexType <p>索引类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIndexType() {
        return this.IndexType;
    }

    /**
     * Set <p>索引类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndexType <p>索引类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndexType(String IndexType) {
        this.IndexType = IndexType;
    }

    /**
     * Get <p>索引名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndexName <p>索引名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIndexName() {
        return this.IndexName;
    }

    /**
     * Set <p>索引名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndexName <p>索引名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndexName(String IndexName) {
        this.IndexName = IndexName;
    }

    /**
     * Get <p>索引元数据JSON</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndexMetaJson <p>索引元数据JSON</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIndexMetaJson() {
        return this.IndexMetaJson;
    }

    /**
     * Set <p>索引元数据JSON</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndexMetaJson <p>索引元数据JSON</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndexMetaJson(String IndexMetaJson) {
        this.IndexMetaJson = IndexMetaJson;
    }

    /**
     * Get <p>索引状态</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndexStatus <p>索引状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIndexStatus() {
        return this.IndexStatus;
    }

    /**
     * Set <p>索引状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndexStatus <p>索引状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndexStatus(String IndexStatus) {
        this.IndexStatus = IndexStatus;
    }

    /**
     * Get <p>索引存储大小，单位Byte</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndexStorage <p>索引存储大小，单位Byte</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIndexStorage() {
        return this.IndexStorage;
    }

    /**
     * Set <p>索引存储大小，单位Byte</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndexStorage <p>索引存储大小，单位Byte</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndexStorage(Long IndexStorage) {
        this.IndexStorage = IndexStorage;
    }

    /**
     * Get <p>索引创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndexCreateTime <p>索引创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIndexCreateTime() {
        return this.IndexCreateTime;
    }

    /**
     * Set <p>索引创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndexCreateTime <p>索引创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndexCreateTime(String IndexCreateTime) {
        this.IndexCreateTime = IndexCreateTime;
    }

    /**
     * Get <p>后备索引</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BackingIndices <p>后备索引</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BackingIndexMetaField [] getBackingIndices() {
        return this.BackingIndices;
    }

    /**
     * Set <p>后备索引</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BackingIndices <p>后备索引</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBackingIndices(BackingIndexMetaField [] BackingIndices) {
        this.BackingIndices = BackingIndices;
    }

    /**
     * Get <p>索引所属集群ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterId <p>索引所属集群ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>索引所属集群ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterId <p>索引所属集群ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>索引所属集群名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterName <p>索引所属集群名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set <p>索引所属集群名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterName <p>索引所属集群名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get <p>索引所属集群版本</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterVersion <p>索引所属集群版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterVersion() {
        return this.ClusterVersion;
    }

    /**
     * Set <p>索引所属集群版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterVersion <p>索引所属集群版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterVersion(String ClusterVersion) {
        this.ClusterVersion = ClusterVersion;
    }

    /**
     * Get <p>索引生命周期字段</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndexPolicyField <p>索引生命周期字段</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IndexPolicyField getIndexPolicyField() {
        return this.IndexPolicyField;
    }

    /**
     * Set <p>索引生命周期字段</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndexPolicyField <p>索引生命周期字段</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndexPolicyField(IndexPolicyField IndexPolicyField) {
        this.IndexPolicyField = IndexPolicyField;
    }

    /**
     * Get <p>索引自治字段</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndexOptionsField <p>索引自治字段</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IndexOptionsField getIndexOptionsField() {
        return this.IndexOptionsField;
    }

    /**
     * Set <p>索引自治字段</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndexOptionsField <p>索引自治字段</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndexOptionsField(IndexOptionsField IndexOptionsField) {
        this.IndexOptionsField = IndexOptionsField;
    }

    /**
     * Get <p>索引配置字段</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndexSettingsField <p>索引配置字段</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IndexSettingsField getIndexSettingsField() {
        return this.IndexSettingsField;
    }

    /**
     * Set <p>索引配置字段</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndexSettingsField <p>索引配置字段</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndexSettingsField(IndexSettingsField IndexSettingsField) {
        this.IndexSettingsField = IndexSettingsField;
    }

    /**
     * Get <p>索引别名字段</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndexAliasesField <p>索引别名字段</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getIndexAliasesField() {
        return this.IndexAliasesField;
    }

    /**
     * Set <p>索引别名字段</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndexAliasesField <p>索引别名字段</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndexAliasesField(String [] IndexAliasesField) {
        this.IndexAliasesField = IndexAliasesField;
    }

    /**
     * Get <p>索引所属集群APP ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppId <p>索引所属集群APP ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>索引所属集群APP ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppId <p>索引所属集群APP ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>索引文档数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndexDocs <p>索引文档数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIndexDocs() {
        return this.IndexDocs;
    }

    /**
     * Set <p>索引文档数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndexDocs <p>索引文档数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndexDocs(Long IndexDocs) {
        this.IndexDocs = IndexDocs;
    }

    /**
     * Get <p>当前字段数</p> 
     * @return FieldCount <p>当前字段数</p>
     */
    public Long getFieldCount() {
        return this.FieldCount;
    }

    /**
     * Set <p>当前字段数</p>
     * @param FieldCount <p>当前字段数</p>
     */
    public void setFieldCount(Long FieldCount) {
        this.FieldCount = FieldCount;
    }

    /**
     * Get <p>当前上限</p> 
     * @return FieldLimit <p>当前上限</p>
     */
    public Long getFieldLimit() {
        return this.FieldLimit;
    }

    /**
     * Set <p>当前上限</p>
     * @param FieldLimit <p>当前上限</p>
     */
    public void setFieldLimit(Long FieldLimit) {
        this.FieldLimit = FieldLimit;
    }

    /**
     * Get <p>使用率</p> 
     * @return FieldUsageRatio <p>使用率</p>
     */
    public String getFieldUsageRatio() {
        return this.FieldUsageRatio;
    }

    /**
     * Set <p>使用率</p>
     * @param FieldUsageRatio <p>使用率</p>
     */
    public void setFieldUsageRatio(String FieldUsageRatio) {
        this.FieldUsageRatio = FieldUsageRatio;
    }

    /**
     * Get <p>占用分片数</p> 
     * @return OccupiedShards <p>占用分片数</p>
     */
    public Long getOccupiedShards() {
        return this.OccupiedShards;
    }

    /**
     * Set <p>占用分片数</p>
     * @param OccupiedShards <p>占用分片数</p>
     */
    public void setOccupiedShards(Long OccupiedShards) {
        this.OccupiedShards = OccupiedShards;
    }

    /**
     * Get <p>索引开启状态</p> 
     * @return IndexOpenStatus <p>索引开启状态</p>
     */
    public String getIndexOpenStatus() {
        return this.IndexOpenStatus;
    }

    /**
     * Set <p>索引开启状态</p>
     * @param IndexOpenStatus <p>索引开启状态</p>
     */
    public void setIndexOpenStatus(String IndexOpenStatus) {
        this.IndexOpenStatus = IndexOpenStatus;
    }

    /**
     * Get <p>索引字段数硬上限</p> 
     * @return FieldLimitHardCap <p>索引字段数硬上限</p>
     */
    public Long getFieldLimitHardCap() {
        return this.FieldLimitHardCap;
    }

    /**
     * Set <p>索引字段数硬上限</p>
     * @param FieldLimitHardCap <p>索引字段数硬上限</p>
     */
    public void setFieldLimitHardCap(Long FieldLimitHardCap) {
        this.FieldLimitHardCap = FieldLimitHardCap;
    }

    /**
     * Get <p>上限可调整最小值</p> 
     * @return FieldLimitMin <p>上限可调整最小值</p>
     */
    public Long getFieldLimitMin() {
        return this.FieldLimitMin;
    }

    /**
     * Set <p>上限可调整最小值</p>
     * @param FieldLimitMin <p>上限可调整最小值</p>
     */
    public void setFieldLimitMin(Long FieldLimitMin) {
        this.FieldLimitMin = FieldLimitMin;
    }

    /**
     * Get <p>剩余调整次数</p> 
     * @return FieldAutoAdjustRemaining <p>剩余调整次数</p>
     */
    public Long getFieldAutoAdjustRemaining() {
        return this.FieldAutoAdjustRemaining;
    }

    /**
     * Set <p>剩余调整次数</p>
     * @param FieldAutoAdjustRemaining <p>剩余调整次数</p>
     */
    public void setFieldAutoAdjustRemaining(Long FieldAutoAdjustRemaining) {
        this.FieldAutoAdjustRemaining = FieldAutoAdjustRemaining;
    }

    public IndexMetaField() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IndexMetaField(IndexMetaField source) {
        if (source.IndexType != null) {
            this.IndexType = new String(source.IndexType);
        }
        if (source.IndexName != null) {
            this.IndexName = new String(source.IndexName);
        }
        if (source.IndexMetaJson != null) {
            this.IndexMetaJson = new String(source.IndexMetaJson);
        }
        if (source.IndexStatus != null) {
            this.IndexStatus = new String(source.IndexStatus);
        }
        if (source.IndexStorage != null) {
            this.IndexStorage = new Long(source.IndexStorage);
        }
        if (source.IndexCreateTime != null) {
            this.IndexCreateTime = new String(source.IndexCreateTime);
        }
        if (source.BackingIndices != null) {
            this.BackingIndices = new BackingIndexMetaField[source.BackingIndices.length];
            for (int i = 0; i < source.BackingIndices.length; i++) {
                this.BackingIndices[i] = new BackingIndexMetaField(source.BackingIndices[i]);
            }
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.ClusterVersion != null) {
            this.ClusterVersion = new String(source.ClusterVersion);
        }
        if (source.IndexPolicyField != null) {
            this.IndexPolicyField = new IndexPolicyField(source.IndexPolicyField);
        }
        if (source.IndexOptionsField != null) {
            this.IndexOptionsField = new IndexOptionsField(source.IndexOptionsField);
        }
        if (source.IndexSettingsField != null) {
            this.IndexSettingsField = new IndexSettingsField(source.IndexSettingsField);
        }
        if (source.IndexAliasesField != null) {
            this.IndexAliasesField = new String[source.IndexAliasesField.length];
            for (int i = 0; i < source.IndexAliasesField.length; i++) {
                this.IndexAliasesField[i] = new String(source.IndexAliasesField[i]);
            }
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.IndexDocs != null) {
            this.IndexDocs = new Long(source.IndexDocs);
        }
        if (source.FieldCount != null) {
            this.FieldCount = new Long(source.FieldCount);
        }
        if (source.FieldLimit != null) {
            this.FieldLimit = new Long(source.FieldLimit);
        }
        if (source.FieldUsageRatio != null) {
            this.FieldUsageRatio = new String(source.FieldUsageRatio);
        }
        if (source.OccupiedShards != null) {
            this.OccupiedShards = new Long(source.OccupiedShards);
        }
        if (source.IndexOpenStatus != null) {
            this.IndexOpenStatus = new String(source.IndexOpenStatus);
        }
        if (source.FieldLimitHardCap != null) {
            this.FieldLimitHardCap = new Long(source.FieldLimitHardCap);
        }
        if (source.FieldLimitMin != null) {
            this.FieldLimitMin = new Long(source.FieldLimitMin);
        }
        if (source.FieldAutoAdjustRemaining != null) {
            this.FieldAutoAdjustRemaining = new Long(source.FieldAutoAdjustRemaining);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IndexType", this.IndexType);
        this.setParamSimple(map, prefix + "IndexName", this.IndexName);
        this.setParamSimple(map, prefix + "IndexMetaJson", this.IndexMetaJson);
        this.setParamSimple(map, prefix + "IndexStatus", this.IndexStatus);
        this.setParamSimple(map, prefix + "IndexStorage", this.IndexStorage);
        this.setParamSimple(map, prefix + "IndexCreateTime", this.IndexCreateTime);
        this.setParamArrayObj(map, prefix + "BackingIndices.", this.BackingIndices);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "ClusterVersion", this.ClusterVersion);
        this.setParamObj(map, prefix + "IndexPolicyField.", this.IndexPolicyField);
        this.setParamObj(map, prefix + "IndexOptionsField.", this.IndexOptionsField);
        this.setParamObj(map, prefix + "IndexSettingsField.", this.IndexSettingsField);
        this.setParamArraySimple(map, prefix + "IndexAliasesField.", this.IndexAliasesField);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "IndexDocs", this.IndexDocs);
        this.setParamSimple(map, prefix + "FieldCount", this.FieldCount);
        this.setParamSimple(map, prefix + "FieldLimit", this.FieldLimit);
        this.setParamSimple(map, prefix + "FieldUsageRatio", this.FieldUsageRatio);
        this.setParamSimple(map, prefix + "OccupiedShards", this.OccupiedShards);
        this.setParamSimple(map, prefix + "IndexOpenStatus", this.IndexOpenStatus);
        this.setParamSimple(map, prefix + "FieldLimitHardCap", this.FieldLimitHardCap);
        this.setParamSimple(map, prefix + "FieldLimitMin", this.FieldLimitMin);
        this.setParamSimple(map, prefix + "FieldAutoAdjustRemaining", this.FieldAutoAdjustRemaining);

    }
}

