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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IndexMetaField extends AbstractModel{

    /**
    * 索引类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndexType")
    @Expose
    private String IndexType;

    /**
    * 索引名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndexName")
    @Expose
    private String IndexName;

    /**
    * 索引状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndexStatus")
    @Expose
    private String IndexStatus;

    /**
    * 索引存储大小，单位Byte
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndexStorage")
    @Expose
    private Long IndexStorage;

    /**
    * 索引创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndexCreateTime")
    @Expose
    private String IndexCreateTime;

    /**
    * 后备索引
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BackingIndices")
    @Expose
    private BackingIndexMetaField [] BackingIndices;

    /**
    * 索引所属集群ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 索引所属集群名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 索引所属集群版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterVersion")
    @Expose
    private String ClusterVersion;

    /**
    * 索引生命周期字段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndexPolicyField")
    @Expose
    private IndexPolicyField IndexPolicyField;

    /**
    * 索引自治字段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndexOptionsField")
    @Expose
    private IndexOptionsField IndexOptionsField;

    /**
    * 索引配置字段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndexSettingsField")
    @Expose
    private IndexSettingsField IndexSettingsField;

    /**
    * 索引所属集群APP ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
     * Get 索引类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndexType 索引类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIndexType() {
        return this.IndexType;
    }

    /**
     * Set 索引类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndexType 索引类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndexType(String IndexType) {
        this.IndexType = IndexType;
    }

    /**
     * Get 索引名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndexName 索引名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIndexName() {
        return this.IndexName;
    }

    /**
     * Set 索引名
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndexName 索引名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndexName(String IndexName) {
        this.IndexName = IndexName;
    }

    /**
     * Get 索引状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndexStatus 索引状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIndexStatus() {
        return this.IndexStatus;
    }

    /**
     * Set 索引状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndexStatus 索引状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndexStatus(String IndexStatus) {
        this.IndexStatus = IndexStatus;
    }

    /**
     * Get 索引存储大小，单位Byte
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndexStorage 索引存储大小，单位Byte
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIndexStorage() {
        return this.IndexStorage;
    }

    /**
     * Set 索引存储大小，单位Byte
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndexStorage 索引存储大小，单位Byte
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndexStorage(Long IndexStorage) {
        this.IndexStorage = IndexStorage;
    }

    /**
     * Get 索引创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndexCreateTime 索引创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIndexCreateTime() {
        return this.IndexCreateTime;
    }

    /**
     * Set 索引创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndexCreateTime 索引创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndexCreateTime(String IndexCreateTime) {
        this.IndexCreateTime = IndexCreateTime;
    }

    /**
     * Get 后备索引
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BackingIndices 后备索引
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BackingIndexMetaField [] getBackingIndices() {
        return this.BackingIndices;
    }

    /**
     * Set 后备索引
注意：此字段可能返回 null，表示取不到有效值。
     * @param BackingIndices 后备索引
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBackingIndices(BackingIndexMetaField [] BackingIndices) {
        this.BackingIndices = BackingIndices;
    }

    /**
     * Get 索引所属集群ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterId 索引所属集群ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 索引所属集群ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterId 索引所属集群ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 索引所属集群名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterName 索引所属集群名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 索引所属集群名
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterName 索引所属集群名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get 索引所属集群版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterVersion 索引所属集群版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterVersion() {
        return this.ClusterVersion;
    }

    /**
     * Set 索引所属集群版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterVersion 索引所属集群版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterVersion(String ClusterVersion) {
        this.ClusterVersion = ClusterVersion;
    }

    /**
     * Get 索引生命周期字段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndexPolicyField 索引生命周期字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IndexPolicyField getIndexPolicyField() {
        return this.IndexPolicyField;
    }

    /**
     * Set 索引生命周期字段
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndexPolicyField 索引生命周期字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndexPolicyField(IndexPolicyField IndexPolicyField) {
        this.IndexPolicyField = IndexPolicyField;
    }

    /**
     * Get 索引自治字段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndexOptionsField 索引自治字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IndexOptionsField getIndexOptionsField() {
        return this.IndexOptionsField;
    }

    /**
     * Set 索引自治字段
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndexOptionsField 索引自治字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndexOptionsField(IndexOptionsField IndexOptionsField) {
        this.IndexOptionsField = IndexOptionsField;
    }

    /**
     * Get 索引配置字段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndexSettingsField 索引配置字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IndexSettingsField getIndexSettingsField() {
        return this.IndexSettingsField;
    }

    /**
     * Set 索引配置字段
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndexSettingsField 索引配置字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndexSettingsField(IndexSettingsField IndexSettingsField) {
        this.IndexSettingsField = IndexSettingsField;
    }

    /**
     * Get 索引所属集群APP ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppId 索引所属集群APP ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 索引所属集群APP ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppId 索引所属集群APP ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
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
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IndexType", this.IndexType);
        this.setParamSimple(map, prefix + "IndexName", this.IndexName);
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
        this.setParamSimple(map, prefix + "AppId", this.AppId);

    }
}

