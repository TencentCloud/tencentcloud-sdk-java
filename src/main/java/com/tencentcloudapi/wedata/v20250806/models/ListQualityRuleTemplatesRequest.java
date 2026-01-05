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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListQualityRuleTemplatesRequest extends AbstractModel {

    /**
    * 工作空间ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 当前页，默认1
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 每页记录数，默认10
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 通用排序，
支持的排序字段：
CitationCount - 按引用数量排序
UpdateTime - 按更新时间排序
排序方向：
1 - 升序（ASC）
2 - 降序（DESC）
    */
    @SerializedName("OrderFields")
    @Expose
    private OrderField [] OrderFields;

    /**
    * 通用过滤条件
1. Id
描述：模板ID。
取值：模板的唯一标识

2. Keyword
描述：关键字搜索，支持模板名称模糊搜索。
取值：字符串

3. Type
描述：模板类型。
取值：1 - 系统模板；2 - 自定义模板；支持多个值（OR关系）

4. QualityDim
描述：质量检测维度。
取值：1 - 准确性；2 - 唯一性；3 - 完整性；4 - 一致性；5 - 及时性；6 - 有效性；支持多个值（OR关系）

5. SourceObjectType
描述：规则适用的源数据对象类型。
取值：1 - 常量；2 - 离线表级；3 - 离线字段级；4 - 库级；支持多个值（OR关系）

6. SourceEngineTypes
描述：模板适用的源数据引擎类型。
取值：1 - MySQL；2 - Hive；4 - Spark；8 - Livy；16 - DLC；32 - Gbase；64 - TCHouse-P；128 - Doris；256 - TCHouse-D；512 - EMR_StarRocks；1024 - TCHouse-X；支持多个值（OR关系）

    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get 工作空间ID 
     * @return ProjectId 工作空间ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 工作空间ID
     * @param ProjectId 工作空间ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 当前页，默认1 
     * @return PageNumber 当前页，默认1
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 当前页，默认1
     * @param PageNumber 当前页，默认1
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 每页记录数，默认10 
     * @return PageSize 每页记录数，默认10
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页记录数，默认10
     * @param PageSize 每页记录数，默认10
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 通用排序，
支持的排序字段：
CitationCount - 按引用数量排序
UpdateTime - 按更新时间排序
排序方向：
1 - 升序（ASC）
2 - 降序（DESC） 
     * @return OrderFields 通用排序，
支持的排序字段：
CitationCount - 按引用数量排序
UpdateTime - 按更新时间排序
排序方向：
1 - 升序（ASC）
2 - 降序（DESC）
     */
    public OrderField [] getOrderFields() {
        return this.OrderFields;
    }

    /**
     * Set 通用排序，
支持的排序字段：
CitationCount - 按引用数量排序
UpdateTime - 按更新时间排序
排序方向：
1 - 升序（ASC）
2 - 降序（DESC）
     * @param OrderFields 通用排序，
支持的排序字段：
CitationCount - 按引用数量排序
UpdateTime - 按更新时间排序
排序方向：
1 - 升序（ASC）
2 - 降序（DESC）
     */
    public void setOrderFields(OrderField [] OrderFields) {
        this.OrderFields = OrderFields;
    }

    /**
     * Get 通用过滤条件
1. Id
描述：模板ID。
取值：模板的唯一标识

2. Keyword
描述：关键字搜索，支持模板名称模糊搜索。
取值：字符串

3. Type
描述：模板类型。
取值：1 - 系统模板；2 - 自定义模板；支持多个值（OR关系）

4. QualityDim
描述：质量检测维度。
取值：1 - 准确性；2 - 唯一性；3 - 完整性；4 - 一致性；5 - 及时性；6 - 有效性；支持多个值（OR关系）

5. SourceObjectType
描述：规则适用的源数据对象类型。
取值：1 - 常量；2 - 离线表级；3 - 离线字段级；4 - 库级；支持多个值（OR关系）

6. SourceEngineTypes
描述：模板适用的源数据引擎类型。
取值：1 - MySQL；2 - Hive；4 - Spark；8 - Livy；16 - DLC；32 - Gbase；64 - TCHouse-P；128 - Doris；256 - TCHouse-D；512 - EMR_StarRocks；1024 - TCHouse-X；支持多个值（OR关系）
 
     * @return Filters 通用过滤条件
1. Id
描述：模板ID。
取值：模板的唯一标识

2. Keyword
描述：关键字搜索，支持模板名称模糊搜索。
取值：字符串

3. Type
描述：模板类型。
取值：1 - 系统模板；2 - 自定义模板；支持多个值（OR关系）

4. QualityDim
描述：质量检测维度。
取值：1 - 准确性；2 - 唯一性；3 - 完整性；4 - 一致性；5 - 及时性；6 - 有效性；支持多个值（OR关系）

5. SourceObjectType
描述：规则适用的源数据对象类型。
取值：1 - 常量；2 - 离线表级；3 - 离线字段级；4 - 库级；支持多个值（OR关系）

6. SourceEngineTypes
描述：模板适用的源数据引擎类型。
取值：1 - MySQL；2 - Hive；4 - Spark；8 - Livy；16 - DLC；32 - Gbase；64 - TCHouse-P；128 - Doris；256 - TCHouse-D；512 - EMR_StarRocks；1024 - TCHouse-X；支持多个值（OR关系）

     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 通用过滤条件
1. Id
描述：模板ID。
取值：模板的唯一标识

2. Keyword
描述：关键字搜索，支持模板名称模糊搜索。
取值：字符串

3. Type
描述：模板类型。
取值：1 - 系统模板；2 - 自定义模板；支持多个值（OR关系）

4. QualityDim
描述：质量检测维度。
取值：1 - 准确性；2 - 唯一性；3 - 完整性；4 - 一致性；5 - 及时性；6 - 有效性；支持多个值（OR关系）

5. SourceObjectType
描述：规则适用的源数据对象类型。
取值：1 - 常量；2 - 离线表级；3 - 离线字段级；4 - 库级；支持多个值（OR关系）

6. SourceEngineTypes
描述：模板适用的源数据引擎类型。
取值：1 - MySQL；2 - Hive；4 - Spark；8 - Livy；16 - DLC；32 - Gbase；64 - TCHouse-P；128 - Doris；256 - TCHouse-D；512 - EMR_StarRocks；1024 - TCHouse-X；支持多个值（OR关系）

     * @param Filters 通用过滤条件
1. Id
描述：模板ID。
取值：模板的唯一标识

2. Keyword
描述：关键字搜索，支持模板名称模糊搜索。
取值：字符串

3. Type
描述：模板类型。
取值：1 - 系统模板；2 - 自定义模板；支持多个值（OR关系）

4. QualityDim
描述：质量检测维度。
取值：1 - 准确性；2 - 唯一性；3 - 完整性；4 - 一致性；5 - 及时性；6 - 有效性；支持多个值（OR关系）

5. SourceObjectType
描述：规则适用的源数据对象类型。
取值：1 - 常量；2 - 离线表级；3 - 离线字段级；4 - 库级；支持多个值（OR关系）

6. SourceEngineTypes
描述：模板适用的源数据引擎类型。
取值：1 - MySQL；2 - Hive；4 - Spark；8 - Livy；16 - DLC；32 - Gbase；64 - TCHouse-P；128 - Doris；256 - TCHouse-D；512 - EMR_StarRocks；1024 - TCHouse-X；支持多个值（OR关系）

     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public ListQualityRuleTemplatesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListQualityRuleTemplatesRequest(ListQualityRuleTemplatesRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.OrderFields != null) {
            this.OrderFields = new OrderField[source.OrderFields.length];
            for (int i = 0; i < source.OrderFields.length; i++) {
                this.OrderFields[i] = new OrderField(source.OrderFields[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamArrayObj(map, prefix + "OrderFields.", this.OrderFields);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

