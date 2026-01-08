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

public class ListQualityRuleGroupsRequest extends AbstractModel {

    /**
    * 项目Id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 分页序号，默认1
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 分页大小，默认10
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 过滤条件,每次请求的Filters的上限为10，Filter.Values的上限为5，可选过滤条件如下：

1. RuleGroupId
描述：规则组ID。
取值：整数

2. RuleGroupName
描述：规则组名称。
取值：字符串

3. TableId
描述：数据源表id
取值：字符串

4. TableName
描述：数据源表名称，支持模糊匹配。
取值：字符串

5. TableOwnerName
描述：表负责人名称，支持模糊匹配。
取值：字符串


6. DatasourceType
描述：数据源类型。
取值：1 - MYSQL；2 - HIVE；3 - DLC；4 - GBASE；5 - TCHouse-P/CDW；6 - ICEBERG；7 - DORIS；8 - TCHouse-D；9 - EMR_STARROCKS；10 - TBDS_STARROCKS；11 - TCHouse-X

7. DatasourceId
描述：数据源ID。
取值：字符串

8. DatabaseName
描述：数据库名称。
取值：字符串

9. SchemaName
描述：Schema名称。
取值：字符串

10. CatalogName
描述：数据目录名称。
取值：字符串


    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 通用排序，支持的排序字段：
CreateTime - 按创建时间排序
UpdateTime - 按更新时间排序（默认）
排序方向：
1 - 升序（ASC）
2 - 降序（DESC）
    */
    @SerializedName("OrderFields")
    @Expose
    private OrderField [] OrderFields;

    /**
     * Get 项目Id 
     * @return ProjectId 项目Id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目Id
     * @param ProjectId 项目Id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 分页序号，默认1 
     * @return PageNumber 分页序号，默认1
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 分页序号，默认1
     * @param PageNumber 分页序号，默认1
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 分页大小，默认10 
     * @return PageSize 分页大小，默认10
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 分页大小，默认10
     * @param PageSize 分页大小，默认10
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 过滤条件,每次请求的Filters的上限为10，Filter.Values的上限为5，可选过滤条件如下：

1. RuleGroupId
描述：规则组ID。
取值：整数

2. RuleGroupName
描述：规则组名称。
取值：字符串

3. TableId
描述：数据源表id
取值：字符串

4. TableName
描述：数据源表名称，支持模糊匹配。
取值：字符串

5. TableOwnerName
描述：表负责人名称，支持模糊匹配。
取值：字符串


6. DatasourceType
描述：数据源类型。
取值：1 - MYSQL；2 - HIVE；3 - DLC；4 - GBASE；5 - TCHouse-P/CDW；6 - ICEBERG；7 - DORIS；8 - TCHouse-D；9 - EMR_STARROCKS；10 - TBDS_STARROCKS；11 - TCHouse-X

7. DatasourceId
描述：数据源ID。
取值：字符串

8. DatabaseName
描述：数据库名称。
取值：字符串

9. SchemaName
描述：Schema名称。
取值：字符串

10. CatalogName
描述：数据目录名称。
取值：字符串

 
     * @return Filters 过滤条件,每次请求的Filters的上限为10，Filter.Values的上限为5，可选过滤条件如下：

1. RuleGroupId
描述：规则组ID。
取值：整数

2. RuleGroupName
描述：规则组名称。
取值：字符串

3. TableId
描述：数据源表id
取值：字符串

4. TableName
描述：数据源表名称，支持模糊匹配。
取值：字符串

5. TableOwnerName
描述：表负责人名称，支持模糊匹配。
取值：字符串


6. DatasourceType
描述：数据源类型。
取值：1 - MYSQL；2 - HIVE；3 - DLC；4 - GBASE；5 - TCHouse-P/CDW；6 - ICEBERG；7 - DORIS；8 - TCHouse-D；9 - EMR_STARROCKS；10 - TBDS_STARROCKS；11 - TCHouse-X

7. DatasourceId
描述：数据源ID。
取值：字符串

8. DatabaseName
描述：数据库名称。
取值：字符串

9. SchemaName
描述：Schema名称。
取值：字符串

10. CatalogName
描述：数据目录名称。
取值：字符串


     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件,每次请求的Filters的上限为10，Filter.Values的上限为5，可选过滤条件如下：

1. RuleGroupId
描述：规则组ID。
取值：整数

2. RuleGroupName
描述：规则组名称。
取值：字符串

3. TableId
描述：数据源表id
取值：字符串

4. TableName
描述：数据源表名称，支持模糊匹配。
取值：字符串

5. TableOwnerName
描述：表负责人名称，支持模糊匹配。
取值：字符串


6. DatasourceType
描述：数据源类型。
取值：1 - MYSQL；2 - HIVE；3 - DLC；4 - GBASE；5 - TCHouse-P/CDW；6 - ICEBERG；7 - DORIS；8 - TCHouse-D；9 - EMR_STARROCKS；10 - TBDS_STARROCKS；11 - TCHouse-X

7. DatasourceId
描述：数据源ID。
取值：字符串

8. DatabaseName
描述：数据库名称。
取值：字符串

9. SchemaName
描述：Schema名称。
取值：字符串

10. CatalogName
描述：数据目录名称。
取值：字符串


     * @param Filters 过滤条件,每次请求的Filters的上限为10，Filter.Values的上限为5，可选过滤条件如下：

1. RuleGroupId
描述：规则组ID。
取值：整数

2. RuleGroupName
描述：规则组名称。
取值：字符串

3. TableId
描述：数据源表id
取值：字符串

4. TableName
描述：数据源表名称，支持模糊匹配。
取值：字符串

5. TableOwnerName
描述：表负责人名称，支持模糊匹配。
取值：字符串


6. DatasourceType
描述：数据源类型。
取值：1 - MYSQL；2 - HIVE；3 - DLC；4 - GBASE；5 - TCHouse-P/CDW；6 - ICEBERG；7 - DORIS；8 - TCHouse-D；9 - EMR_STARROCKS；10 - TBDS_STARROCKS；11 - TCHouse-X

7. DatasourceId
描述：数据源ID。
取值：字符串

8. DatabaseName
描述：数据库名称。
取值：字符串

9. SchemaName
描述：Schema名称。
取值：字符串

10. CatalogName
描述：数据目录名称。
取值：字符串


     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 通用排序，支持的排序字段：
CreateTime - 按创建时间排序
UpdateTime - 按更新时间排序（默认）
排序方向：
1 - 升序（ASC）
2 - 降序（DESC） 
     * @return OrderFields 通用排序，支持的排序字段：
CreateTime - 按创建时间排序
UpdateTime - 按更新时间排序（默认）
排序方向：
1 - 升序（ASC）
2 - 降序（DESC）
     */
    public OrderField [] getOrderFields() {
        return this.OrderFields;
    }

    /**
     * Set 通用排序，支持的排序字段：
CreateTime - 按创建时间排序
UpdateTime - 按更新时间排序（默认）
排序方向：
1 - 升序（ASC）
2 - 降序（DESC）
     * @param OrderFields 通用排序，支持的排序字段：
CreateTime - 按创建时间排序
UpdateTime - 按更新时间排序（默认）
排序方向：
1 - 升序（ASC）
2 - 降序（DESC）
     */
    public void setOrderFields(OrderField [] OrderFields) {
        this.OrderFields = OrderFields;
    }

    public ListQualityRuleGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListQualityRuleGroupsRequest(ListQualityRuleGroupsRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.OrderFields != null) {
            this.OrderFields = new OrderField[source.OrderFields.length];
            for (int i = 0; i < source.OrderFields.length; i++) {
                this.OrderFields[i] = new OrderField(source.OrderFields[i]);
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
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArrayObj(map, prefix + "OrderFields.", this.OrderFields);

    }
}

