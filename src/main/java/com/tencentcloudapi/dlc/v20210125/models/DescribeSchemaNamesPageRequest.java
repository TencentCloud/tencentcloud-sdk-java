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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSchemaNamesPageRequest extends AbstractModel {

    /**
    * <p>数据目录名称</p>
    */
    @SerializedName("CatalogName")
    @Expose
    private String CatalogName;

    /**
    * <p>分页大小</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>分页偏移</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>是否快照分页</p>
    */
    @SerializedName("SnapshotBased")
    @Expose
    private Boolean SnapshotBased;

    /**
    * <p>快照 ID</p>
    */
    @SerializedName("SnapshotId")
    @Expose
    private String SnapshotId;

    /**
    * <p>SQL查询格式匹配</p>
    */
    @SerializedName("SchemaNamePattern")
    @Expose
    private String SchemaNamePattern;

    /**
     * Get <p>数据目录名称</p> 
     * @return CatalogName <p>数据目录名称</p>
     */
    public String getCatalogName() {
        return this.CatalogName;
    }

    /**
     * Set <p>数据目录名称</p>
     * @param CatalogName <p>数据目录名称</p>
     */
    public void setCatalogName(String CatalogName) {
        this.CatalogName = CatalogName;
    }

    /**
     * Get <p>分页大小</p> 
     * @return Limit <p>分页大小</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>分页大小</p>
     * @param Limit <p>分页大小</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>分页偏移</p> 
     * @return Offset <p>分页偏移</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页偏移</p>
     * @param Offset <p>分页偏移</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>是否快照分页</p> 
     * @return SnapshotBased <p>是否快照分页</p>
     */
    public Boolean getSnapshotBased() {
        return this.SnapshotBased;
    }

    /**
     * Set <p>是否快照分页</p>
     * @param SnapshotBased <p>是否快照分页</p>
     */
    public void setSnapshotBased(Boolean SnapshotBased) {
        this.SnapshotBased = SnapshotBased;
    }

    /**
     * Get <p>快照 ID</p> 
     * @return SnapshotId <p>快照 ID</p>
     */
    public String getSnapshotId() {
        return this.SnapshotId;
    }

    /**
     * Set <p>快照 ID</p>
     * @param SnapshotId <p>快照 ID</p>
     */
    public void setSnapshotId(String SnapshotId) {
        this.SnapshotId = SnapshotId;
    }

    /**
     * Get <p>SQL查询格式匹配</p> 
     * @return SchemaNamePattern <p>SQL查询格式匹配</p>
     */
    public String getSchemaNamePattern() {
        return this.SchemaNamePattern;
    }

    /**
     * Set <p>SQL查询格式匹配</p>
     * @param SchemaNamePattern <p>SQL查询格式匹配</p>
     */
    public void setSchemaNamePattern(String SchemaNamePattern) {
        this.SchemaNamePattern = SchemaNamePattern;
    }

    public DescribeSchemaNamesPageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSchemaNamesPageRequest(DescribeSchemaNamesPageRequest source) {
        if (source.CatalogName != null) {
            this.CatalogName = new String(source.CatalogName);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.SnapshotBased != null) {
            this.SnapshotBased = new Boolean(source.SnapshotBased);
        }
        if (source.SnapshotId != null) {
            this.SnapshotId = new String(source.SnapshotId);
        }
        if (source.SchemaNamePattern != null) {
            this.SchemaNamePattern = new String(source.SchemaNamePattern);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CatalogName", this.CatalogName);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "SnapshotBased", this.SnapshotBased);
        this.setParamSimple(map, prefix + "SnapshotId", this.SnapshotId);
        this.setParamSimple(map, prefix + "SchemaNamePattern", this.SchemaNamePattern);

    }
}

