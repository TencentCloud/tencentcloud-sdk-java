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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BudgetRemindRecordList extends AbstractModel {

    /**
    * 自动优化 COUNT SQL 如果遇到 jSqlParser 无法解析情况，设置该参数为 false
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OptimizeCountSql")
    @Expose
    private Boolean OptimizeCountSql;

    /**
    * 分页
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Pages")
    @Expose
    private Long Pages;

    /**
    * 排序字段信息，允许前端传入的时候，注意 SQL 注入问题，可以使用 SqlInjectionUtils.check(...) 检查文本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Orders")
    @Expose
    private OrderDto [] Orders;

    /**
    * xml 自定义 count 查询的 statementId 也可以不用指定在分页 statementId 后面加上 _mpCount 例如分页 selectPageById 指定 count 的查询 statementId 设置为 selectPageById_mpCount 即可默认找到该 SQL 执行
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CountId")
    @Expose
    private String CountId;

    /**
    * 分页大小
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * 总量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 单页分页条数限制
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxLimit")
    @Expose
    private String MaxLimit;

    /**
    * 查询数据列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Records")
    @Expose
    private BudgetRemindRecords [] Records;

    /**
    * 当前页
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Current")
    @Expose
    private Long Current;

    /**
    * 是否进行 count 查询，如果只想查询到列表不要查询总记录数，设置该参数为 false
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SearchCount")
    @Expose
    private Boolean SearchCount;

    /**
     * Get 自动优化 COUNT SQL 如果遇到 jSqlParser 无法解析情况，设置该参数为 false
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OptimizeCountSql 自动优化 COUNT SQL 如果遇到 jSqlParser 无法解析情况，设置该参数为 false
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getOptimizeCountSql() {
        return this.OptimizeCountSql;
    }

    /**
     * Set 自动优化 COUNT SQL 如果遇到 jSqlParser 无法解析情况，设置该参数为 false
注意：此字段可能返回 null，表示取不到有效值。
     * @param OptimizeCountSql 自动优化 COUNT SQL 如果遇到 jSqlParser 无法解析情况，设置该参数为 false
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOptimizeCountSql(Boolean OptimizeCountSql) {
        this.OptimizeCountSql = OptimizeCountSql;
    }

    /**
     * Get 分页
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Pages 分页
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPages() {
        return this.Pages;
    }

    /**
     * Set 分页
注意：此字段可能返回 null，表示取不到有效值。
     * @param Pages 分页
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPages(Long Pages) {
        this.Pages = Pages;
    }

    /**
     * Get 排序字段信息，允许前端传入的时候，注意 SQL 注入问题，可以使用 SqlInjectionUtils.check(...) 检查文本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Orders 排序字段信息，允许前端传入的时候，注意 SQL 注入问题，可以使用 SqlInjectionUtils.check(...) 检查文本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OrderDto [] getOrders() {
        return this.Orders;
    }

    /**
     * Set 排序字段信息，允许前端传入的时候，注意 SQL 注入问题，可以使用 SqlInjectionUtils.check(...) 检查文本
注意：此字段可能返回 null，表示取不到有效值。
     * @param Orders 排序字段信息，允许前端传入的时候，注意 SQL 注入问题，可以使用 SqlInjectionUtils.check(...) 检查文本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrders(OrderDto [] Orders) {
        this.Orders = Orders;
    }

    /**
     * Get xml 自定义 count 查询的 statementId 也可以不用指定在分页 statementId 后面加上 _mpCount 例如分页 selectPageById 指定 count 的查询 statementId 设置为 selectPageById_mpCount 即可默认找到该 SQL 执行
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CountId xml 自定义 count 查询的 statementId 也可以不用指定在分页 statementId 后面加上 _mpCount 例如分页 selectPageById 指定 count 的查询 statementId 设置为 selectPageById_mpCount 即可默认找到该 SQL 执行
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCountId() {
        return this.CountId;
    }

    /**
     * Set xml 自定义 count 查询的 statementId 也可以不用指定在分页 statementId 后面加上 _mpCount 例如分页 selectPageById 指定 count 的查询 statementId 设置为 selectPageById_mpCount 即可默认找到该 SQL 执行
注意：此字段可能返回 null，表示取不到有效值。
     * @param CountId xml 自定义 count 查询的 statementId 也可以不用指定在分页 statementId 后面加上 _mpCount 例如分页 selectPageById 指定 count 的查询 statementId 设置为 selectPageById_mpCount 即可默认找到该 SQL 执行
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCountId(String CountId) {
        this.CountId = CountId;
    }

    /**
     * Get 分页大小
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Size 分页大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 分页大小
注意：此字段可能返回 null，表示取不到有效值。
     * @param Size 分页大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get 总量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Total 总量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 总量
注意：此字段可能返回 null，表示取不到有效值。
     * @param Total 总量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 单页分页条数限制
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxLimit 单页分页条数限制
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMaxLimit() {
        return this.MaxLimit;
    }

    /**
     * Set 单页分页条数限制
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxLimit 单页分页条数限制
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxLimit(String MaxLimit) {
        this.MaxLimit = MaxLimit;
    }

    /**
     * Get 查询数据列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Records 查询数据列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BudgetRemindRecords [] getRecords() {
        return this.Records;
    }

    /**
     * Set 查询数据列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Records 查询数据列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecords(BudgetRemindRecords [] Records) {
        this.Records = Records;
    }

    /**
     * Get 当前页
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Current 当前页
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCurrent() {
        return this.Current;
    }

    /**
     * Set 当前页
注意：此字段可能返回 null，表示取不到有效值。
     * @param Current 当前页
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCurrent(Long Current) {
        this.Current = Current;
    }

    /**
     * Get 是否进行 count 查询，如果只想查询到列表不要查询总记录数，设置该参数为 false
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SearchCount 是否进行 count 查询，如果只想查询到列表不要查询总记录数，设置该参数为 false
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getSearchCount() {
        return this.SearchCount;
    }

    /**
     * Set 是否进行 count 查询，如果只想查询到列表不要查询总记录数，设置该参数为 false
注意：此字段可能返回 null，表示取不到有效值。
     * @param SearchCount 是否进行 count 查询，如果只想查询到列表不要查询总记录数，设置该参数为 false
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSearchCount(Boolean SearchCount) {
        this.SearchCount = SearchCount;
    }

    public BudgetRemindRecordList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BudgetRemindRecordList(BudgetRemindRecordList source) {
        if (source.OptimizeCountSql != null) {
            this.OptimizeCountSql = new Boolean(source.OptimizeCountSql);
        }
        if (source.Pages != null) {
            this.Pages = new Long(source.Pages);
        }
        if (source.Orders != null) {
            this.Orders = new OrderDto[source.Orders.length];
            for (int i = 0; i < source.Orders.length; i++) {
                this.Orders[i] = new OrderDto(source.Orders[i]);
            }
        }
        if (source.CountId != null) {
            this.CountId = new String(source.CountId);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.MaxLimit != null) {
            this.MaxLimit = new String(source.MaxLimit);
        }
        if (source.Records != null) {
            this.Records = new BudgetRemindRecords[source.Records.length];
            for (int i = 0; i < source.Records.length; i++) {
                this.Records[i] = new BudgetRemindRecords(source.Records[i]);
            }
        }
        if (source.Current != null) {
            this.Current = new Long(source.Current);
        }
        if (source.SearchCount != null) {
            this.SearchCount = new Boolean(source.SearchCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OptimizeCountSql", this.OptimizeCountSql);
        this.setParamSimple(map, prefix + "Pages", this.Pages);
        this.setParamArrayObj(map, prefix + "Orders.", this.Orders);
        this.setParamSimple(map, prefix + "CountId", this.CountId);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "MaxLimit", this.MaxLimit);
        this.setParamArrayObj(map, prefix + "Records.", this.Records);
        this.setParamSimple(map, prefix + "Current", this.Current);
        this.setParamSimple(map, prefix + "SearchCount", this.SearchCount);

    }
}

