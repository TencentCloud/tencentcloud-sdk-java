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

public class ListQualityRulesRequest extends AbstractModel {

    /**
    * 项目ID
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
    * 过滤条件，可选过滤条件如下：
1. GroupType
描述：规则组类型，标识规则组所属的分类。
取值：DEFAULT - 默认类型，DASHBOARD - 仪表盘类型，WORKFLOW_NODE - 编排空间工作流节点类型

2. Operator
描述：创建人ID。
取值：用户ID，支持多个值（OR关系）

3. Keyword
描述：关键字搜索，支持规则名称模糊搜索。
取值：字符串

4. RuleName
描述：规则名称。
取值：字符串

5. Type
描述：规则类型。
取值：1 - 系统模板，2 - 自定义SQL，3 - 自定义模板

6. SourceObjectValue
描述：数据对象，可以是字段名称或表名称。
取值：字符串，支持多个值（OR关系）

7. RuleGroupId
描述：规则所属的规则组ID。
取值：整数

8. RuleGroupName
描述：规则所属的规则组名称。
取值：字符串

9. TableId
描述：数据表ID。
取值：字符串，支持多个值（OR关系）

10. TableName
描述：数据表名称。
取值：字符串

11. SourceEngineType
描述：数据源引擎类型。
取值：整数，1 - MYSQL；2 - HIVE；4 - SPARK；8 - LIVY；16 - DLC；32 - GBASE；64 - TCHouse-P；128 - DORIS；256 - TCHouse-D；512 - EMR_STARROCKS；1024 - TCHouse-X；支持多个值（OR关系）

12. DatasourceId
描述：数据源ID。
取值：整数

13. DatasourceType
描述：数据源类型。
取值：1 - MYSQL；2 - HIVE；3 - DLC；4 - GBASE；5 - TCHouse-P/CDW；6 - ICEBERG；7 - DORIS；8 - TCHouse-D；9 - EMR_STARROCKS；10 - TBDS_STARROCKS；11 - TCHouse-X

14. DatabaseName
描述：数据库名称。
取值：字符串

15. SchemaName
描述：Schema名称。
取值：字符串

16. RuleIds
描述：规则ID集合。
取值：整数，支持多个值（OR关系）

17. RuleTemplateId
描述：规则模板ID。
取值：整数，支持多个值（OR关系）

18. ReceiverUserId / ReceiverUserIdStr
描述：订阅人用户ID。
取值：整数

19. StartTime
描述：查询开始时间。
取值：Unix时间戳（秒）

20. EndTime
描述：查询结束时间。
取值：Unix时间戳（秒）

21. ReceiverFlag
描述：是否为当前登录用户的订阅。
取值：
true - 是
false - 否

22. MonitorType
描述：规则的监控执行方式。
取值：1 - 未配置；2 - 关联生产调度；3 - 离线周期检测；支持多个值（OR关系）
支持多个值（OR关系）

23. MonitorStatus
描述：规则的监控状态。
取值：
true - 已启用
false - 已禁用

24. BizCatalogIds
描述：业务目录ID。
取值：整数，支持多个值（OR关系）

25. CatalogName
描述：数据目录名称。
取值：字符串

26. DeployStatus
描述：规则部署状态，主要用于WORKFLOW_NODE类型的规则组（监控）上
取值：PRODUCTION - 生产环境，DRAFT - 草稿态
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 通用排序，
支持的排序字段：
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
     * Get 项目ID 
     * @return ProjectId 项目ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
     * @param ProjectId 项目ID
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
     * Get 过滤条件，可选过滤条件如下：
1. GroupType
描述：规则组类型，标识规则组所属的分类。
取值：DEFAULT - 默认类型，DASHBOARD - 仪表盘类型，WORKFLOW_NODE - 编排空间工作流节点类型

2. Operator
描述：创建人ID。
取值：用户ID，支持多个值（OR关系）

3. Keyword
描述：关键字搜索，支持规则名称模糊搜索。
取值：字符串

4. RuleName
描述：规则名称。
取值：字符串

5. Type
描述：规则类型。
取值：1 - 系统模板，2 - 自定义SQL，3 - 自定义模板

6. SourceObjectValue
描述：数据对象，可以是字段名称或表名称。
取值：字符串，支持多个值（OR关系）

7. RuleGroupId
描述：规则所属的规则组ID。
取值：整数

8. RuleGroupName
描述：规则所属的规则组名称。
取值：字符串

9. TableId
描述：数据表ID。
取值：字符串，支持多个值（OR关系）

10. TableName
描述：数据表名称。
取值：字符串

11. SourceEngineType
描述：数据源引擎类型。
取值：整数，1 - MYSQL；2 - HIVE；4 - SPARK；8 - LIVY；16 - DLC；32 - GBASE；64 - TCHouse-P；128 - DORIS；256 - TCHouse-D；512 - EMR_STARROCKS；1024 - TCHouse-X；支持多个值（OR关系）

12. DatasourceId
描述：数据源ID。
取值：整数

13. DatasourceType
描述：数据源类型。
取值：1 - MYSQL；2 - HIVE；3 - DLC；4 - GBASE；5 - TCHouse-P/CDW；6 - ICEBERG；7 - DORIS；8 - TCHouse-D；9 - EMR_STARROCKS；10 - TBDS_STARROCKS；11 - TCHouse-X

14. DatabaseName
描述：数据库名称。
取值：字符串

15. SchemaName
描述：Schema名称。
取值：字符串

16. RuleIds
描述：规则ID集合。
取值：整数，支持多个值（OR关系）

17. RuleTemplateId
描述：规则模板ID。
取值：整数，支持多个值（OR关系）

18. ReceiverUserId / ReceiverUserIdStr
描述：订阅人用户ID。
取值：整数

19. StartTime
描述：查询开始时间。
取值：Unix时间戳（秒）

20. EndTime
描述：查询结束时间。
取值：Unix时间戳（秒）

21. ReceiverFlag
描述：是否为当前登录用户的订阅。
取值：
true - 是
false - 否

22. MonitorType
描述：规则的监控执行方式。
取值：1 - 未配置；2 - 关联生产调度；3 - 离线周期检测；支持多个值（OR关系）
支持多个值（OR关系）

23. MonitorStatus
描述：规则的监控状态。
取值：
true - 已启用
false - 已禁用

24. BizCatalogIds
描述：业务目录ID。
取值：整数，支持多个值（OR关系）

25. CatalogName
描述：数据目录名称。
取值：字符串

26. DeployStatus
描述：规则部署状态，主要用于WORKFLOW_NODE类型的规则组（监控）上
取值：PRODUCTION - 生产环境，DRAFT - 草稿态 
     * @return Filters 过滤条件，可选过滤条件如下：
1. GroupType
描述：规则组类型，标识规则组所属的分类。
取值：DEFAULT - 默认类型，DASHBOARD - 仪表盘类型，WORKFLOW_NODE - 编排空间工作流节点类型

2. Operator
描述：创建人ID。
取值：用户ID，支持多个值（OR关系）

3. Keyword
描述：关键字搜索，支持规则名称模糊搜索。
取值：字符串

4. RuleName
描述：规则名称。
取值：字符串

5. Type
描述：规则类型。
取值：1 - 系统模板，2 - 自定义SQL，3 - 自定义模板

6. SourceObjectValue
描述：数据对象，可以是字段名称或表名称。
取值：字符串，支持多个值（OR关系）

7. RuleGroupId
描述：规则所属的规则组ID。
取值：整数

8. RuleGroupName
描述：规则所属的规则组名称。
取值：字符串

9. TableId
描述：数据表ID。
取值：字符串，支持多个值（OR关系）

10. TableName
描述：数据表名称。
取值：字符串

11. SourceEngineType
描述：数据源引擎类型。
取值：整数，1 - MYSQL；2 - HIVE；4 - SPARK；8 - LIVY；16 - DLC；32 - GBASE；64 - TCHouse-P；128 - DORIS；256 - TCHouse-D；512 - EMR_STARROCKS；1024 - TCHouse-X；支持多个值（OR关系）

12. DatasourceId
描述：数据源ID。
取值：整数

13. DatasourceType
描述：数据源类型。
取值：1 - MYSQL；2 - HIVE；3 - DLC；4 - GBASE；5 - TCHouse-P/CDW；6 - ICEBERG；7 - DORIS；8 - TCHouse-D；9 - EMR_STARROCKS；10 - TBDS_STARROCKS；11 - TCHouse-X

14. DatabaseName
描述：数据库名称。
取值：字符串

15. SchemaName
描述：Schema名称。
取值：字符串

16. RuleIds
描述：规则ID集合。
取值：整数，支持多个值（OR关系）

17. RuleTemplateId
描述：规则模板ID。
取值：整数，支持多个值（OR关系）

18. ReceiverUserId / ReceiverUserIdStr
描述：订阅人用户ID。
取值：整数

19. StartTime
描述：查询开始时间。
取值：Unix时间戳（秒）

20. EndTime
描述：查询结束时间。
取值：Unix时间戳（秒）

21. ReceiverFlag
描述：是否为当前登录用户的订阅。
取值：
true - 是
false - 否

22. MonitorType
描述：规则的监控执行方式。
取值：1 - 未配置；2 - 关联生产调度；3 - 离线周期检测；支持多个值（OR关系）
支持多个值（OR关系）

23. MonitorStatus
描述：规则的监控状态。
取值：
true - 已启用
false - 已禁用

24. BizCatalogIds
描述：业务目录ID。
取值：整数，支持多个值（OR关系）

25. CatalogName
描述：数据目录名称。
取值：字符串

26. DeployStatus
描述：规则部署状态，主要用于WORKFLOW_NODE类型的规则组（监控）上
取值：PRODUCTION - 生产环境，DRAFT - 草稿态
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件，可选过滤条件如下：
1. GroupType
描述：规则组类型，标识规则组所属的分类。
取值：DEFAULT - 默认类型，DASHBOARD - 仪表盘类型，WORKFLOW_NODE - 编排空间工作流节点类型

2. Operator
描述：创建人ID。
取值：用户ID，支持多个值（OR关系）

3. Keyword
描述：关键字搜索，支持规则名称模糊搜索。
取值：字符串

4. RuleName
描述：规则名称。
取值：字符串

5. Type
描述：规则类型。
取值：1 - 系统模板，2 - 自定义SQL，3 - 自定义模板

6. SourceObjectValue
描述：数据对象，可以是字段名称或表名称。
取值：字符串，支持多个值（OR关系）

7. RuleGroupId
描述：规则所属的规则组ID。
取值：整数

8. RuleGroupName
描述：规则所属的规则组名称。
取值：字符串

9. TableId
描述：数据表ID。
取值：字符串，支持多个值（OR关系）

10. TableName
描述：数据表名称。
取值：字符串

11. SourceEngineType
描述：数据源引擎类型。
取值：整数，1 - MYSQL；2 - HIVE；4 - SPARK；8 - LIVY；16 - DLC；32 - GBASE；64 - TCHouse-P；128 - DORIS；256 - TCHouse-D；512 - EMR_STARROCKS；1024 - TCHouse-X；支持多个值（OR关系）

12. DatasourceId
描述：数据源ID。
取值：整数

13. DatasourceType
描述：数据源类型。
取值：1 - MYSQL；2 - HIVE；3 - DLC；4 - GBASE；5 - TCHouse-P/CDW；6 - ICEBERG；7 - DORIS；8 - TCHouse-D；9 - EMR_STARROCKS；10 - TBDS_STARROCKS；11 - TCHouse-X

14. DatabaseName
描述：数据库名称。
取值：字符串

15. SchemaName
描述：Schema名称。
取值：字符串

16. RuleIds
描述：规则ID集合。
取值：整数，支持多个值（OR关系）

17. RuleTemplateId
描述：规则模板ID。
取值：整数，支持多个值（OR关系）

18. ReceiverUserId / ReceiverUserIdStr
描述：订阅人用户ID。
取值：整数

19. StartTime
描述：查询开始时间。
取值：Unix时间戳（秒）

20. EndTime
描述：查询结束时间。
取值：Unix时间戳（秒）

21. ReceiverFlag
描述：是否为当前登录用户的订阅。
取值：
true - 是
false - 否

22. MonitorType
描述：规则的监控执行方式。
取值：1 - 未配置；2 - 关联生产调度；3 - 离线周期检测；支持多个值（OR关系）
支持多个值（OR关系）

23. MonitorStatus
描述：规则的监控状态。
取值：
true - 已启用
false - 已禁用

24. BizCatalogIds
描述：业务目录ID。
取值：整数，支持多个值（OR关系）

25. CatalogName
描述：数据目录名称。
取值：字符串

26. DeployStatus
描述：规则部署状态，主要用于WORKFLOW_NODE类型的规则组（监控）上
取值：PRODUCTION - 生产环境，DRAFT - 草稿态
     * @param Filters 过滤条件，可选过滤条件如下：
1. GroupType
描述：规则组类型，标识规则组所属的分类。
取值：DEFAULT - 默认类型，DASHBOARD - 仪表盘类型，WORKFLOW_NODE - 编排空间工作流节点类型

2. Operator
描述：创建人ID。
取值：用户ID，支持多个值（OR关系）

3. Keyword
描述：关键字搜索，支持规则名称模糊搜索。
取值：字符串

4. RuleName
描述：规则名称。
取值：字符串

5. Type
描述：规则类型。
取值：1 - 系统模板，2 - 自定义SQL，3 - 自定义模板

6. SourceObjectValue
描述：数据对象，可以是字段名称或表名称。
取值：字符串，支持多个值（OR关系）

7. RuleGroupId
描述：规则所属的规则组ID。
取值：整数

8. RuleGroupName
描述：规则所属的规则组名称。
取值：字符串

9. TableId
描述：数据表ID。
取值：字符串，支持多个值（OR关系）

10. TableName
描述：数据表名称。
取值：字符串

11. SourceEngineType
描述：数据源引擎类型。
取值：整数，1 - MYSQL；2 - HIVE；4 - SPARK；8 - LIVY；16 - DLC；32 - GBASE；64 - TCHouse-P；128 - DORIS；256 - TCHouse-D；512 - EMR_STARROCKS；1024 - TCHouse-X；支持多个值（OR关系）

12. DatasourceId
描述：数据源ID。
取值：整数

13. DatasourceType
描述：数据源类型。
取值：1 - MYSQL；2 - HIVE；3 - DLC；4 - GBASE；5 - TCHouse-P/CDW；6 - ICEBERG；7 - DORIS；8 - TCHouse-D；9 - EMR_STARROCKS；10 - TBDS_STARROCKS；11 - TCHouse-X

14. DatabaseName
描述：数据库名称。
取值：字符串

15. SchemaName
描述：Schema名称。
取值：字符串

16. RuleIds
描述：规则ID集合。
取值：整数，支持多个值（OR关系）

17. RuleTemplateId
描述：规则模板ID。
取值：整数，支持多个值（OR关系）

18. ReceiverUserId / ReceiverUserIdStr
描述：订阅人用户ID。
取值：整数

19. StartTime
描述：查询开始时间。
取值：Unix时间戳（秒）

20. EndTime
描述：查询结束时间。
取值：Unix时间戳（秒）

21. ReceiverFlag
描述：是否为当前登录用户的订阅。
取值：
true - 是
false - 否

22. MonitorType
描述：规则的监控执行方式。
取值：1 - 未配置；2 - 关联生产调度；3 - 离线周期检测；支持多个值（OR关系）
支持多个值（OR关系）

23. MonitorStatus
描述：规则的监控状态。
取值：
true - 已启用
false - 已禁用

24. BizCatalogIds
描述：业务目录ID。
取值：整数，支持多个值（OR关系）

25. CatalogName
描述：数据目录名称。
取值：字符串

26. DeployStatus
描述：规则部署状态，主要用于WORKFLOW_NODE类型的规则组（监控）上
取值：PRODUCTION - 生产环境，DRAFT - 草稿态
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 通用排序，
支持的排序字段：
CreateTime - 按创建时间排序
UpdateTime - 按更新时间排序（默认）
排序方向：
1 - 升序（ASC）
2 - 降序（DESC） 
     * @return OrderFields 通用排序，
支持的排序字段：
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
     * Set 通用排序，
支持的排序字段：
CreateTime - 按创建时间排序
UpdateTime - 按更新时间排序（默认）
排序方向：
1 - 升序（ASC）
2 - 降序（DESC）
     * @param OrderFields 通用排序，
支持的排序字段：
CreateTime - 按创建时间排序
UpdateTime - 按更新时间排序（默认）
排序方向：
1 - 升序（ASC）
2 - 降序（DESC）
     */
    public void setOrderFields(OrderField [] OrderFields) {
        this.OrderFields = OrderFields;
    }

    public ListQualityRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListQualityRulesRequest(ListQualityRulesRequest source) {
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

