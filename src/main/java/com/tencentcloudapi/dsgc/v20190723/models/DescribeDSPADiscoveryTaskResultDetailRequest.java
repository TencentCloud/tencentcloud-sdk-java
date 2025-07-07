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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDSPADiscoveryTaskResultDetailRequest extends AbstractModel {

    /**
    * DSPA实例ID
    */
    @SerializedName("DspaId")
    @Expose
    private String DspaId;

    /**
    * 任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * 扫描数据库结果ID
    */
    @SerializedName("DbResultId")
    @Expose
    private Long DbResultId;

    /**
    * 合规组ID
    */
    @SerializedName("ComplianceId")
    @Expose
    private Long ComplianceId;

    /**
    * 数据库名
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * 所属数据表名
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * 敏感数据分类ID
    */
    @SerializedName("CategoryId")
    @Expose
    private Long CategoryId;

    /**
    * 敏感数据分级ID
    */
    @SerializedName("LevelId")
    @Expose
    private Long LevelId;

    /**
    * 偏移量，默认为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量，默认值为20，最大值为100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 多级分类的分类ID集合
    */
    @SerializedName("CategoryIdList")
    @Expose
    private Long [] CategoryIdList;

    /**
    * 任务扫描id
    */
    @SerializedName("ScanResultId")
    @Expose
    private Long ScanResultId;

    /**
     * Get DSPA实例ID 
     * @return DspaId DSPA实例ID
     */
    public String getDspaId() {
        return this.DspaId;
    }

    /**
     * Set DSPA实例ID
     * @param DspaId DSPA实例ID
     */
    public void setDspaId(String DspaId) {
        this.DspaId = DspaId;
    }

    /**
     * Get 任务ID 
     * @return TaskId 任务ID
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID
     * @param TaskId 任务ID
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 扫描数据库结果ID 
     * @return DbResultId 扫描数据库结果ID
     */
    public Long getDbResultId() {
        return this.DbResultId;
    }

    /**
     * Set 扫描数据库结果ID
     * @param DbResultId 扫描数据库结果ID
     */
    public void setDbResultId(Long DbResultId) {
        this.DbResultId = DbResultId;
    }

    /**
     * Get 合规组ID 
     * @return ComplianceId 合规组ID
     */
    public Long getComplianceId() {
        return this.ComplianceId;
    }

    /**
     * Set 合规组ID
     * @param ComplianceId 合规组ID
     */
    public void setComplianceId(Long ComplianceId) {
        this.ComplianceId = ComplianceId;
    }

    /**
     * Get 数据库名 
     * @return DbName 数据库名
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set 数据库名
     * @param DbName 数据库名
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get 所属数据表名 
     * @return TableName 所属数据表名
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set 所属数据表名
     * @param TableName 所属数据表名
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get 敏感数据分类ID 
     * @return CategoryId 敏感数据分类ID
     */
    public Long getCategoryId() {
        return this.CategoryId;
    }

    /**
     * Set 敏感数据分类ID
     * @param CategoryId 敏感数据分类ID
     */
    public void setCategoryId(Long CategoryId) {
        this.CategoryId = CategoryId;
    }

    /**
     * Get 敏感数据分级ID 
     * @return LevelId 敏感数据分级ID
     */
    public Long getLevelId() {
        return this.LevelId;
    }

    /**
     * Set 敏感数据分级ID
     * @param LevelId 敏感数据分级ID
     */
    public void setLevelId(Long LevelId) {
        this.LevelId = LevelId;
    }

    /**
     * Get 偏移量，默认为0 
     * @return Offset 偏移量，默认为0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0
     * @param Offset 偏移量，默认为0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量，默认值为20，最大值为100 
     * @return Limit 返回数量，默认值为20，最大值为100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认值为20，最大值为100
     * @param Limit 返回数量，默认值为20，最大值为100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 多级分类的分类ID集合 
     * @return CategoryIdList 多级分类的分类ID集合
     */
    public Long [] getCategoryIdList() {
        return this.CategoryIdList;
    }

    /**
     * Set 多级分类的分类ID集合
     * @param CategoryIdList 多级分类的分类ID集合
     */
    public void setCategoryIdList(Long [] CategoryIdList) {
        this.CategoryIdList = CategoryIdList;
    }

    /**
     * Get 任务扫描id 
     * @return ScanResultId 任务扫描id
     */
    public Long getScanResultId() {
        return this.ScanResultId;
    }

    /**
     * Set 任务扫描id
     * @param ScanResultId 任务扫描id
     */
    public void setScanResultId(Long ScanResultId) {
        this.ScanResultId = ScanResultId;
    }

    public DescribeDSPADiscoveryTaskResultDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDSPADiscoveryTaskResultDetailRequest(DescribeDSPADiscoveryTaskResultDetailRequest source) {
        if (source.DspaId != null) {
            this.DspaId = new String(source.DspaId);
        }
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.DbResultId != null) {
            this.DbResultId = new Long(source.DbResultId);
        }
        if (source.ComplianceId != null) {
            this.ComplianceId = new Long(source.ComplianceId);
        }
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.CategoryId != null) {
            this.CategoryId = new Long(source.CategoryId);
        }
        if (source.LevelId != null) {
            this.LevelId = new Long(source.LevelId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.CategoryIdList != null) {
            this.CategoryIdList = new Long[source.CategoryIdList.length];
            for (int i = 0; i < source.CategoryIdList.length; i++) {
                this.CategoryIdList[i] = new Long(source.CategoryIdList[i]);
            }
        }
        if (source.ScanResultId != null) {
            this.ScanResultId = new Long(source.ScanResultId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DspaId", this.DspaId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "DbResultId", this.DbResultId);
        this.setParamSimple(map, prefix + "ComplianceId", this.ComplianceId);
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "CategoryId", this.CategoryId);
        this.setParamSimple(map, prefix + "LevelId", this.LevelId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "CategoryIdList.", this.CategoryIdList);
        this.setParamSimple(map, prefix + "ScanResultId", this.ScanResultId);

    }
}

