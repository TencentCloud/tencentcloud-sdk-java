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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExecutionPlanDetail extends AbstractModel {

    /**
    * <p>模板ID</p>
    */
    @SerializedName("TemplateID")
    @Expose
    private String TemplateID;

    /**
    * <p>数据库名</p>
    */
    @SerializedName("Db")
    @Expose
    private String Db;

    /**
    * <p>原始SQL样例</p>
    */
    @SerializedName("SQLSample")
    @Expose
    private String SQLSample;

    /**
    * <p>改写后SQL样例</p>
    */
    @SerializedName("SQLSampleRewritten")
    @Expose
    private String SQLSampleRewritten;

    /**
    * <p>优化前执行计划- 列表</p>
    */
    @SerializedName("TablePlanBefore")
    @Expose
    private ExplainRow [] TablePlanBefore;

    /**
    * <p>优化后执行计划 - 列表</p>
    */
    @SerializedName("TablePlanAfter")
    @Expose
    private ExplainRow [] TablePlanAfter;

    /**
    * <p>优化前树形执行计划</p>
    */
    @SerializedName("TreePlanBefore")
    @Expose
    private String TreePlanBefore;

    /**
    * <p>优化后树形执行计划</p>
    */
    @SerializedName("TreePlanAfter")
    @Expose
    private String TreePlanAfter;

    /**
    * <p>优化前查询时间</p>
    */
    @SerializedName("QueryTimeBefore")
    @Expose
    private Float QueryTimeBefore;

    /**
    * <p>优化后查询时间</p>
    */
    @SerializedName("QueryTimeAfter")
    @Expose
    private Float QueryTimeAfter;

    /**
    * <p>优化前扫描行数</p>
    */
    @SerializedName("SQLScanRowsBefore")
    @Expose
    private Long SQLScanRowsBefore;

    /**
    * <p>优化后扫描行数</p>
    */
    @SerializedName("SQLScanRowsAfter")
    @Expose
    private Long SQLScanRowsAfter;

    /**
     * Get <p>模板ID</p> 
     * @return TemplateID <p>模板ID</p>
     */
    public String getTemplateID() {
        return this.TemplateID;
    }

    /**
     * Set <p>模板ID</p>
     * @param TemplateID <p>模板ID</p>
     */
    public void setTemplateID(String TemplateID) {
        this.TemplateID = TemplateID;
    }

    /**
     * Get <p>数据库名</p> 
     * @return Db <p>数据库名</p>
     */
    public String getDb() {
        return this.Db;
    }

    /**
     * Set <p>数据库名</p>
     * @param Db <p>数据库名</p>
     */
    public void setDb(String Db) {
        this.Db = Db;
    }

    /**
     * Get <p>原始SQL样例</p> 
     * @return SQLSample <p>原始SQL样例</p>
     */
    public String getSQLSample() {
        return this.SQLSample;
    }

    /**
     * Set <p>原始SQL样例</p>
     * @param SQLSample <p>原始SQL样例</p>
     */
    public void setSQLSample(String SQLSample) {
        this.SQLSample = SQLSample;
    }

    /**
     * Get <p>改写后SQL样例</p> 
     * @return SQLSampleRewritten <p>改写后SQL样例</p>
     */
    public String getSQLSampleRewritten() {
        return this.SQLSampleRewritten;
    }

    /**
     * Set <p>改写后SQL样例</p>
     * @param SQLSampleRewritten <p>改写后SQL样例</p>
     */
    public void setSQLSampleRewritten(String SQLSampleRewritten) {
        this.SQLSampleRewritten = SQLSampleRewritten;
    }

    /**
     * Get <p>优化前执行计划- 列表</p> 
     * @return TablePlanBefore <p>优化前执行计划- 列表</p>
     */
    public ExplainRow [] getTablePlanBefore() {
        return this.TablePlanBefore;
    }

    /**
     * Set <p>优化前执行计划- 列表</p>
     * @param TablePlanBefore <p>优化前执行计划- 列表</p>
     */
    public void setTablePlanBefore(ExplainRow [] TablePlanBefore) {
        this.TablePlanBefore = TablePlanBefore;
    }

    /**
     * Get <p>优化后执行计划 - 列表</p> 
     * @return TablePlanAfter <p>优化后执行计划 - 列表</p>
     */
    public ExplainRow [] getTablePlanAfter() {
        return this.TablePlanAfter;
    }

    /**
     * Set <p>优化后执行计划 - 列表</p>
     * @param TablePlanAfter <p>优化后执行计划 - 列表</p>
     */
    public void setTablePlanAfter(ExplainRow [] TablePlanAfter) {
        this.TablePlanAfter = TablePlanAfter;
    }

    /**
     * Get <p>优化前树形执行计划</p> 
     * @return TreePlanBefore <p>优化前树形执行计划</p>
     */
    public String getTreePlanBefore() {
        return this.TreePlanBefore;
    }

    /**
     * Set <p>优化前树形执行计划</p>
     * @param TreePlanBefore <p>优化前树形执行计划</p>
     */
    public void setTreePlanBefore(String TreePlanBefore) {
        this.TreePlanBefore = TreePlanBefore;
    }

    /**
     * Get <p>优化后树形执行计划</p> 
     * @return TreePlanAfter <p>优化后树形执行计划</p>
     */
    public String getTreePlanAfter() {
        return this.TreePlanAfter;
    }

    /**
     * Set <p>优化后树形执行计划</p>
     * @param TreePlanAfter <p>优化后树形执行计划</p>
     */
    public void setTreePlanAfter(String TreePlanAfter) {
        this.TreePlanAfter = TreePlanAfter;
    }

    /**
     * Get <p>优化前查询时间</p> 
     * @return QueryTimeBefore <p>优化前查询时间</p>
     */
    public Float getQueryTimeBefore() {
        return this.QueryTimeBefore;
    }

    /**
     * Set <p>优化前查询时间</p>
     * @param QueryTimeBefore <p>优化前查询时间</p>
     */
    public void setQueryTimeBefore(Float QueryTimeBefore) {
        this.QueryTimeBefore = QueryTimeBefore;
    }

    /**
     * Get <p>优化后查询时间</p> 
     * @return QueryTimeAfter <p>优化后查询时间</p>
     */
    public Float getQueryTimeAfter() {
        return this.QueryTimeAfter;
    }

    /**
     * Set <p>优化后查询时间</p>
     * @param QueryTimeAfter <p>优化后查询时间</p>
     */
    public void setQueryTimeAfter(Float QueryTimeAfter) {
        this.QueryTimeAfter = QueryTimeAfter;
    }

    /**
     * Get <p>优化前扫描行数</p> 
     * @return SQLScanRowsBefore <p>优化前扫描行数</p>
     */
    public Long getSQLScanRowsBefore() {
        return this.SQLScanRowsBefore;
    }

    /**
     * Set <p>优化前扫描行数</p>
     * @param SQLScanRowsBefore <p>优化前扫描行数</p>
     */
    public void setSQLScanRowsBefore(Long SQLScanRowsBefore) {
        this.SQLScanRowsBefore = SQLScanRowsBefore;
    }

    /**
     * Get <p>优化后扫描行数</p> 
     * @return SQLScanRowsAfter <p>优化后扫描行数</p>
     */
    public Long getSQLScanRowsAfter() {
        return this.SQLScanRowsAfter;
    }

    /**
     * Set <p>优化后扫描行数</p>
     * @param SQLScanRowsAfter <p>优化后扫描行数</p>
     */
    public void setSQLScanRowsAfter(Long SQLScanRowsAfter) {
        this.SQLScanRowsAfter = SQLScanRowsAfter;
    }

    public ExecutionPlanDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExecutionPlanDetail(ExecutionPlanDetail source) {
        if (source.TemplateID != null) {
            this.TemplateID = new String(source.TemplateID);
        }
        if (source.Db != null) {
            this.Db = new String(source.Db);
        }
        if (source.SQLSample != null) {
            this.SQLSample = new String(source.SQLSample);
        }
        if (source.SQLSampleRewritten != null) {
            this.SQLSampleRewritten = new String(source.SQLSampleRewritten);
        }
        if (source.TablePlanBefore != null) {
            this.TablePlanBefore = new ExplainRow[source.TablePlanBefore.length];
            for (int i = 0; i < source.TablePlanBefore.length; i++) {
                this.TablePlanBefore[i] = new ExplainRow(source.TablePlanBefore[i]);
            }
        }
        if (source.TablePlanAfter != null) {
            this.TablePlanAfter = new ExplainRow[source.TablePlanAfter.length];
            for (int i = 0; i < source.TablePlanAfter.length; i++) {
                this.TablePlanAfter[i] = new ExplainRow(source.TablePlanAfter[i]);
            }
        }
        if (source.TreePlanBefore != null) {
            this.TreePlanBefore = new String(source.TreePlanBefore);
        }
        if (source.TreePlanAfter != null) {
            this.TreePlanAfter = new String(source.TreePlanAfter);
        }
        if (source.QueryTimeBefore != null) {
            this.QueryTimeBefore = new Float(source.QueryTimeBefore);
        }
        if (source.QueryTimeAfter != null) {
            this.QueryTimeAfter = new Float(source.QueryTimeAfter);
        }
        if (source.SQLScanRowsBefore != null) {
            this.SQLScanRowsBefore = new Long(source.SQLScanRowsBefore);
        }
        if (source.SQLScanRowsAfter != null) {
            this.SQLScanRowsAfter = new Long(source.SQLScanRowsAfter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateID", this.TemplateID);
        this.setParamSimple(map, prefix + "Db", this.Db);
        this.setParamSimple(map, prefix + "SQLSample", this.SQLSample);
        this.setParamSimple(map, prefix + "SQLSampleRewritten", this.SQLSampleRewritten);
        this.setParamArrayObj(map, prefix + "TablePlanBefore.", this.TablePlanBefore);
        this.setParamArrayObj(map, prefix + "TablePlanAfter.", this.TablePlanAfter);
        this.setParamSimple(map, prefix + "TreePlanBefore", this.TreePlanBefore);
        this.setParamSimple(map, prefix + "TreePlanAfter", this.TreePlanAfter);
        this.setParamSimple(map, prefix + "QueryTimeBefore", this.QueryTimeBefore);
        this.setParamSimple(map, prefix + "QueryTimeAfter", this.QueryTimeAfter);
        this.setParamSimple(map, prefix + "SQLScanRowsBefore", this.SQLScanRowsBefore);
        this.setParamSimple(map, prefix + "SQLScanRowsAfter", this.SQLScanRowsAfter);

    }
}

