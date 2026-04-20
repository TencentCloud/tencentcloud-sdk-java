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

public class BackingIndexMetaField extends AbstractModel {

    /**
    * <p>后备索引名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndexName")
    @Expose
    private String IndexName;

    /**
    * <p>后备索引状态</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndexStatus")
    @Expose
    private String IndexStatus;

    /**
    * <p>后备索引存储大小</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndexStorage")
    @Expose
    private Long IndexStorage;

    /**
    * <p>后备索引当前生命周期</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndexPhrase")
    @Expose
    private String IndexPhrase;

    /**
    * <p>后备索引创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndexCreateTime")
    @Expose
    private String IndexCreateTime;

    /**
    * <p>索引Uuid</p>
    */
    @SerializedName("IndexUuid")
    @Expose
    private String IndexUuid;

    /**
     * Get <p>后备索引名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndexName <p>后备索引名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIndexName() {
        return this.IndexName;
    }

    /**
     * Set <p>后备索引名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndexName <p>后备索引名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndexName(String IndexName) {
        this.IndexName = IndexName;
    }

    /**
     * Get <p>后备索引状态</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndexStatus <p>后备索引状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIndexStatus() {
        return this.IndexStatus;
    }

    /**
     * Set <p>后备索引状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndexStatus <p>后备索引状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndexStatus(String IndexStatus) {
        this.IndexStatus = IndexStatus;
    }

    /**
     * Get <p>后备索引存储大小</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndexStorage <p>后备索引存储大小</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIndexStorage() {
        return this.IndexStorage;
    }

    /**
     * Set <p>后备索引存储大小</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndexStorage <p>后备索引存储大小</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndexStorage(Long IndexStorage) {
        this.IndexStorage = IndexStorage;
    }

    /**
     * Get <p>后备索引当前生命周期</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndexPhrase <p>后备索引当前生命周期</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIndexPhrase() {
        return this.IndexPhrase;
    }

    /**
     * Set <p>后备索引当前生命周期</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndexPhrase <p>后备索引当前生命周期</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndexPhrase(String IndexPhrase) {
        this.IndexPhrase = IndexPhrase;
    }

    /**
     * Get <p>后备索引创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndexCreateTime <p>后备索引创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIndexCreateTime() {
        return this.IndexCreateTime;
    }

    /**
     * Set <p>后备索引创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndexCreateTime <p>后备索引创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndexCreateTime(String IndexCreateTime) {
        this.IndexCreateTime = IndexCreateTime;
    }

    /**
     * Get <p>索引Uuid</p> 
     * @return IndexUuid <p>索引Uuid</p>
     */
    public String getIndexUuid() {
        return this.IndexUuid;
    }

    /**
     * Set <p>索引Uuid</p>
     * @param IndexUuid <p>索引Uuid</p>
     */
    public void setIndexUuid(String IndexUuid) {
        this.IndexUuid = IndexUuid;
    }

    public BackingIndexMetaField() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackingIndexMetaField(BackingIndexMetaField source) {
        if (source.IndexName != null) {
            this.IndexName = new String(source.IndexName);
        }
        if (source.IndexStatus != null) {
            this.IndexStatus = new String(source.IndexStatus);
        }
        if (source.IndexStorage != null) {
            this.IndexStorage = new Long(source.IndexStorage);
        }
        if (source.IndexPhrase != null) {
            this.IndexPhrase = new String(source.IndexPhrase);
        }
        if (source.IndexCreateTime != null) {
            this.IndexCreateTime = new String(source.IndexCreateTime);
        }
        if (source.IndexUuid != null) {
            this.IndexUuid = new String(source.IndexUuid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IndexName", this.IndexName);
        this.setParamSimple(map, prefix + "IndexStatus", this.IndexStatus);
        this.setParamSimple(map, prefix + "IndexStorage", this.IndexStorage);
        this.setParamSimple(map, prefix + "IndexPhrase", this.IndexPhrase);
        this.setParamSimple(map, prefix + "IndexCreateTime", this.IndexCreateTime);
        this.setParamSimple(map, prefix + "IndexUuid", this.IndexUuid);

    }
}

