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

public class ExplainRow extends AbstractModel {

    /**
    * <p>查询的序列号</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>查询的类型，常见值：SIMPLE（简单查询，不含子查询或 UNION）、PRIMARY（最外层查询）、SUBQUERY（子查询中的第一个 SELECT）、DERIVED（派生表/FROM 子句中的子查询）、UNION（UNION 中第二个及之后的 SELECT）、UNION RESULT（UNION 的结果集）。</p>
    */
    @SerializedName("SelectType")
    @Expose
    private String SelectType;

    /**
    * <p>数据表名</p>
    */
    @SerializedName("Table")
    @Expose
    private String Table;

    /**
    * <p>查询匹配的分区</p>
    */
    @SerializedName("Partitions")
    @Expose
    private String Partitions;

    /**
    * <p>访问类型（非常重要，衡量查询效率的关键指标），从优到差排列：system &gt; const &gt; eq_ref &gt; ref &gt; fulltext &gt; ref_or_null &gt; index_merge &gt; unique_subquery &gt; index_subquery &gt; range &gt; index &gt; ALL。常见值说明： • system：表只有一行记录（系统表） • const：通过主键或唯一索引匹配一行，常见于 WHERE pk = 1 • eq_ref：连接时使用主键或唯一索引，每个索引值只匹配一行 • ref：使用非唯一索引查找，可能匹配多行 • range：索引范围扫描，如 BETWEEN、&gt;、&lt;、IN • index：全索引扫描（遍历整棵索引树） • ALL：全表扫描（最差，需优化）</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>查询中可能使用到的索引。为 NULL 表示没有可用索引。</p>
    */
    @SerializedName("PossibleKeys")
    @Expose
    private String PossibleKeys;

    /**
    * <p>实际使用的索引。为 NULL 表示未使用任何索引。</p>
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * <p>实际使用的索引长度（字节数）。可用来判断联合索引中实际使用了哪几个列。值越短说明使用的索引列越少。</p>
    */
    @SerializedName("KeyLen")
    @Expose
    private String KeyLen;

    /**
    * <p>显示哪些列或常量与 key 列中的索引进行比较。常见值：const（常量）、某个列名、func（函数结果）。</p>
    */
    @SerializedName("Ref")
    @Expose
    private String Ref;

    /**
    * <p>预估要扫描的行数</p>
    */
    @SerializedName("Rows")
    @Expose
    private Long Rows;

    /**
    * <p>表示经过表条件过滤后，剩余行数占 rows 的百分比估算。100% 表示没有额外过滤，值越高越好。</p>
    */
    @SerializedName("Filtered")
    @Expose
    private Float Filtered;

    /**
    * <p>附加信息（非常重要），常见值： • Using index：覆盖索引，无需回表（好） • Using where：在存储引擎返回行后再用 WHERE 过滤 • Using temporary：使用了临时表（常见于 GROUP BY/ORDER BY，需优化） • Using filesort：使用了文件排序而非索引排序（需优化） • Using index condition：使用了索引下推（ICP）</p>
    */
    @SerializedName("Extra")
    @Expose
    private String Extra;

    /**
     * Get <p>查询的序列号</p> 
     * @return Id <p>查询的序列号</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>查询的序列号</p>
     * @param Id <p>查询的序列号</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>查询的类型，常见值：SIMPLE（简单查询，不含子查询或 UNION）、PRIMARY（最外层查询）、SUBQUERY（子查询中的第一个 SELECT）、DERIVED（派生表/FROM 子句中的子查询）、UNION（UNION 中第二个及之后的 SELECT）、UNION RESULT（UNION 的结果集）。</p> 
     * @return SelectType <p>查询的类型，常见值：SIMPLE（简单查询，不含子查询或 UNION）、PRIMARY（最外层查询）、SUBQUERY（子查询中的第一个 SELECT）、DERIVED（派生表/FROM 子句中的子查询）、UNION（UNION 中第二个及之后的 SELECT）、UNION RESULT（UNION 的结果集）。</p>
     */
    public String getSelectType() {
        return this.SelectType;
    }

    /**
     * Set <p>查询的类型，常见值：SIMPLE（简单查询，不含子查询或 UNION）、PRIMARY（最外层查询）、SUBQUERY（子查询中的第一个 SELECT）、DERIVED（派生表/FROM 子句中的子查询）、UNION（UNION 中第二个及之后的 SELECT）、UNION RESULT（UNION 的结果集）。</p>
     * @param SelectType <p>查询的类型，常见值：SIMPLE（简单查询，不含子查询或 UNION）、PRIMARY（最外层查询）、SUBQUERY（子查询中的第一个 SELECT）、DERIVED（派生表/FROM 子句中的子查询）、UNION（UNION 中第二个及之后的 SELECT）、UNION RESULT（UNION 的结果集）。</p>
     */
    public void setSelectType(String SelectType) {
        this.SelectType = SelectType;
    }

    /**
     * Get <p>数据表名</p> 
     * @return Table <p>数据表名</p>
     */
    public String getTable() {
        return this.Table;
    }

    /**
     * Set <p>数据表名</p>
     * @param Table <p>数据表名</p>
     */
    public void setTable(String Table) {
        this.Table = Table;
    }

    /**
     * Get <p>查询匹配的分区</p> 
     * @return Partitions <p>查询匹配的分区</p>
     */
    public String getPartitions() {
        return this.Partitions;
    }

    /**
     * Set <p>查询匹配的分区</p>
     * @param Partitions <p>查询匹配的分区</p>
     */
    public void setPartitions(String Partitions) {
        this.Partitions = Partitions;
    }

    /**
     * Get <p>访问类型（非常重要，衡量查询效率的关键指标），从优到差排列：system &gt; const &gt; eq_ref &gt; ref &gt; fulltext &gt; ref_or_null &gt; index_merge &gt; unique_subquery &gt; index_subquery &gt; range &gt; index &gt; ALL。常见值说明： • system：表只有一行记录（系统表） • const：通过主键或唯一索引匹配一行，常见于 WHERE pk = 1 • eq_ref：连接时使用主键或唯一索引，每个索引值只匹配一行 • ref：使用非唯一索引查找，可能匹配多行 • range：索引范围扫描，如 BETWEEN、&gt;、&lt;、IN • index：全索引扫描（遍历整棵索引树） • ALL：全表扫描（最差，需优化）</p> 
     * @return Type <p>访问类型（非常重要，衡量查询效率的关键指标），从优到差排列：system &gt; const &gt; eq_ref &gt; ref &gt; fulltext &gt; ref_or_null &gt; index_merge &gt; unique_subquery &gt; index_subquery &gt; range &gt; index &gt; ALL。常见值说明： • system：表只有一行记录（系统表） • const：通过主键或唯一索引匹配一行，常见于 WHERE pk = 1 • eq_ref：连接时使用主键或唯一索引，每个索引值只匹配一行 • ref：使用非唯一索引查找，可能匹配多行 • range：索引范围扫描，如 BETWEEN、&gt;、&lt;、IN • index：全索引扫描（遍历整棵索引树） • ALL：全表扫描（最差，需优化）</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>访问类型（非常重要，衡量查询效率的关键指标），从优到差排列：system &gt; const &gt; eq_ref &gt; ref &gt; fulltext &gt; ref_or_null &gt; index_merge &gt; unique_subquery &gt; index_subquery &gt; range &gt; index &gt; ALL。常见值说明： • system：表只有一行记录（系统表） • const：通过主键或唯一索引匹配一行，常见于 WHERE pk = 1 • eq_ref：连接时使用主键或唯一索引，每个索引值只匹配一行 • ref：使用非唯一索引查找，可能匹配多行 • range：索引范围扫描，如 BETWEEN、&gt;、&lt;、IN • index：全索引扫描（遍历整棵索引树） • ALL：全表扫描（最差，需优化）</p>
     * @param Type <p>访问类型（非常重要，衡量查询效率的关键指标），从优到差排列：system &gt; const &gt; eq_ref &gt; ref &gt; fulltext &gt; ref_or_null &gt; index_merge &gt; unique_subquery &gt; index_subquery &gt; range &gt; index &gt; ALL。常见值说明： • system：表只有一行记录（系统表） • const：通过主键或唯一索引匹配一行，常见于 WHERE pk = 1 • eq_ref：连接时使用主键或唯一索引，每个索引值只匹配一行 • ref：使用非唯一索引查找，可能匹配多行 • range：索引范围扫描，如 BETWEEN、&gt;、&lt;、IN • index：全索引扫描（遍历整棵索引树） • ALL：全表扫描（最差，需优化）</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>查询中可能使用到的索引。为 NULL 表示没有可用索引。</p> 
     * @return PossibleKeys <p>查询中可能使用到的索引。为 NULL 表示没有可用索引。</p>
     */
    public String getPossibleKeys() {
        return this.PossibleKeys;
    }

    /**
     * Set <p>查询中可能使用到的索引。为 NULL 表示没有可用索引。</p>
     * @param PossibleKeys <p>查询中可能使用到的索引。为 NULL 表示没有可用索引。</p>
     */
    public void setPossibleKeys(String PossibleKeys) {
        this.PossibleKeys = PossibleKeys;
    }

    /**
     * Get <p>实际使用的索引。为 NULL 表示未使用任何索引。</p> 
     * @return Key <p>实际使用的索引。为 NULL 表示未使用任何索引。</p>
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set <p>实际使用的索引。为 NULL 表示未使用任何索引。</p>
     * @param Key <p>实际使用的索引。为 NULL 表示未使用任何索引。</p>
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get <p>实际使用的索引长度（字节数）。可用来判断联合索引中实际使用了哪几个列。值越短说明使用的索引列越少。</p> 
     * @return KeyLen <p>实际使用的索引长度（字节数）。可用来判断联合索引中实际使用了哪几个列。值越短说明使用的索引列越少。</p>
     */
    public String getKeyLen() {
        return this.KeyLen;
    }

    /**
     * Set <p>实际使用的索引长度（字节数）。可用来判断联合索引中实际使用了哪几个列。值越短说明使用的索引列越少。</p>
     * @param KeyLen <p>实际使用的索引长度（字节数）。可用来判断联合索引中实际使用了哪几个列。值越短说明使用的索引列越少。</p>
     */
    public void setKeyLen(String KeyLen) {
        this.KeyLen = KeyLen;
    }

    /**
     * Get <p>显示哪些列或常量与 key 列中的索引进行比较。常见值：const（常量）、某个列名、func（函数结果）。</p> 
     * @return Ref <p>显示哪些列或常量与 key 列中的索引进行比较。常见值：const（常量）、某个列名、func（函数结果）。</p>
     */
    public String getRef() {
        return this.Ref;
    }

    /**
     * Set <p>显示哪些列或常量与 key 列中的索引进行比较。常见值：const（常量）、某个列名、func（函数结果）。</p>
     * @param Ref <p>显示哪些列或常量与 key 列中的索引进行比较。常见值：const（常量）、某个列名、func（函数结果）。</p>
     */
    public void setRef(String Ref) {
        this.Ref = Ref;
    }

    /**
     * Get <p>预估要扫描的行数</p> 
     * @return Rows <p>预估要扫描的行数</p>
     */
    public Long getRows() {
        return this.Rows;
    }

    /**
     * Set <p>预估要扫描的行数</p>
     * @param Rows <p>预估要扫描的行数</p>
     */
    public void setRows(Long Rows) {
        this.Rows = Rows;
    }

    /**
     * Get <p>表示经过表条件过滤后，剩余行数占 rows 的百分比估算。100% 表示没有额外过滤，值越高越好。</p> 
     * @return Filtered <p>表示经过表条件过滤后，剩余行数占 rows 的百分比估算。100% 表示没有额外过滤，值越高越好。</p>
     */
    public Float getFiltered() {
        return this.Filtered;
    }

    /**
     * Set <p>表示经过表条件过滤后，剩余行数占 rows 的百分比估算。100% 表示没有额外过滤，值越高越好。</p>
     * @param Filtered <p>表示经过表条件过滤后，剩余行数占 rows 的百分比估算。100% 表示没有额外过滤，值越高越好。</p>
     */
    public void setFiltered(Float Filtered) {
        this.Filtered = Filtered;
    }

    /**
     * Get <p>附加信息（非常重要），常见值： • Using index：覆盖索引，无需回表（好） • Using where：在存储引擎返回行后再用 WHERE 过滤 • Using temporary：使用了临时表（常见于 GROUP BY/ORDER BY，需优化） • Using filesort：使用了文件排序而非索引排序（需优化） • Using index condition：使用了索引下推（ICP）</p> 
     * @return Extra <p>附加信息（非常重要），常见值： • Using index：覆盖索引，无需回表（好） • Using where：在存储引擎返回行后再用 WHERE 过滤 • Using temporary：使用了临时表（常见于 GROUP BY/ORDER BY，需优化） • Using filesort：使用了文件排序而非索引排序（需优化） • Using index condition：使用了索引下推（ICP）</p>
     */
    public String getExtra() {
        return this.Extra;
    }

    /**
     * Set <p>附加信息（非常重要），常见值： • Using index：覆盖索引，无需回表（好） • Using where：在存储引擎返回行后再用 WHERE 过滤 • Using temporary：使用了临时表（常见于 GROUP BY/ORDER BY，需优化） • Using filesort：使用了文件排序而非索引排序（需优化） • Using index condition：使用了索引下推（ICP）</p>
     * @param Extra <p>附加信息（非常重要），常见值： • Using index：覆盖索引，无需回表（好） • Using where：在存储引擎返回行后再用 WHERE 过滤 • Using temporary：使用了临时表（常见于 GROUP BY/ORDER BY，需优化） • Using filesort：使用了文件排序而非索引排序（需优化） • Using index condition：使用了索引下推（ICP）</p>
     */
    public void setExtra(String Extra) {
        this.Extra = Extra;
    }

    public ExplainRow() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExplainRow(ExplainRow source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.SelectType != null) {
            this.SelectType = new String(source.SelectType);
        }
        if (source.Table != null) {
            this.Table = new String(source.Table);
        }
        if (source.Partitions != null) {
            this.Partitions = new String(source.Partitions);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.PossibleKeys != null) {
            this.PossibleKeys = new String(source.PossibleKeys);
        }
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.KeyLen != null) {
            this.KeyLen = new String(source.KeyLen);
        }
        if (source.Ref != null) {
            this.Ref = new String(source.Ref);
        }
        if (source.Rows != null) {
            this.Rows = new Long(source.Rows);
        }
        if (source.Filtered != null) {
            this.Filtered = new Float(source.Filtered);
        }
        if (source.Extra != null) {
            this.Extra = new String(source.Extra);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "SelectType", this.SelectType);
        this.setParamSimple(map, prefix + "Table", this.Table);
        this.setParamSimple(map, prefix + "Partitions", this.Partitions);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "PossibleKeys", this.PossibleKeys);
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "KeyLen", this.KeyLen);
        this.setParamSimple(map, prefix + "Ref", this.Ref);
        this.setParamSimple(map, prefix + "Rows", this.Rows);
        this.setParamSimple(map, prefix + "Filtered", this.Filtered);
        this.setParamSimple(map, prefix + "Extra", this.Extra);

    }
}

