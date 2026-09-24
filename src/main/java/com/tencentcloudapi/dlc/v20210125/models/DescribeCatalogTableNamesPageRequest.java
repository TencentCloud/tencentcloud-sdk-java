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

public class DescribeCatalogTableNamesPageRequest extends AbstractModel {

    /**
    * <p>catalog名称</p>
    */
    @SerializedName("CatalogName")
    @Expose
    private String CatalogName;

    /**
    * <p>Schema名称</p>
    */
    @SerializedName("SchemaName")
    @Expose
    private String SchemaName;

    /**
    * <p>每页大小</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>页数</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>是否基于快照</p>
    */
    @SerializedName("SnapshotBased")
    @Expose
    private Boolean SnapshotBased;

    /**
    * <p>快照id</p>
    */
    @SerializedName("SnapshotId")
    @Expose
    private String SnapshotId;

    /**
    * <p>table匹配规则</p>
    */
    @SerializedName("TableNamePattern")
    @Expose
    private String TableNamePattern;

    /**
     * Get <p>catalog名称</p> 
     * @return CatalogName <p>catalog名称</p>
     */
    public String getCatalogName() {
        return this.CatalogName;
    }

    /**
     * Set <p>catalog名称</p>
     * @param CatalogName <p>catalog名称</p>
     */
    public void setCatalogName(String CatalogName) {
        this.CatalogName = CatalogName;
    }

    /**
     * Get <p>Schema名称</p> 
     * @return SchemaName <p>Schema名称</p>
     */
    public String getSchemaName() {
        return this.SchemaName;
    }

    /**
     * Set <p>Schema名称</p>
     * @param SchemaName <p>Schema名称</p>
     */
    public void setSchemaName(String SchemaName) {
        this.SchemaName = SchemaName;
    }

    /**
     * Get <p>每页大小</p> 
     * @return Limit <p>每页大小</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>每页大小</p>
     * @param Limit <p>每页大小</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>页数</p> 
     * @return Offset <p>页数</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>页数</p>
     * @param Offset <p>页数</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>是否基于快照</p> 
     * @return SnapshotBased <p>是否基于快照</p>
     */
    public Boolean getSnapshotBased() {
        return this.SnapshotBased;
    }

    /**
     * Set <p>是否基于快照</p>
     * @param SnapshotBased <p>是否基于快照</p>
     */
    public void setSnapshotBased(Boolean SnapshotBased) {
        this.SnapshotBased = SnapshotBased;
    }

    /**
     * Get <p>快照id</p> 
     * @return SnapshotId <p>快照id</p>
     */
    public String getSnapshotId() {
        return this.SnapshotId;
    }

    /**
     * Set <p>快照id</p>
     * @param SnapshotId <p>快照id</p>
     */
    public void setSnapshotId(String SnapshotId) {
        this.SnapshotId = SnapshotId;
    }

    /**
     * Get <p>table匹配规则</p> 
     * @return TableNamePattern <p>table匹配规则</p>
     */
    public String getTableNamePattern() {
        return this.TableNamePattern;
    }

    /**
     * Set <p>table匹配规则</p>
     * @param TableNamePattern <p>table匹配规则</p>
     */
    public void setTableNamePattern(String TableNamePattern) {
        this.TableNamePattern = TableNamePattern;
    }

    public DescribeCatalogTableNamesPageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCatalogTableNamesPageRequest(DescribeCatalogTableNamesPageRequest source) {
        if (source.CatalogName != null) {
            this.CatalogName = new String(source.CatalogName);
        }
        if (source.SchemaName != null) {
            this.SchemaName = new String(source.SchemaName);
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
        if (source.TableNamePattern != null) {
            this.TableNamePattern = new String(source.TableNamePattern);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CatalogName", this.CatalogName);
        this.setParamSimple(map, prefix + "SchemaName", this.SchemaName);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "SnapshotBased", this.SnapshotBased);
        this.setParamSimple(map, prefix + "SnapshotId", this.SnapshotId);
        this.setParamSimple(map, prefix + "TableNamePattern", this.TableNamePattern);

    }
}

