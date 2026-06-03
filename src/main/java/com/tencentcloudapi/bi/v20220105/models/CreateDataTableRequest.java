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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDataTableRequest extends AbstractModel {

    /**
    * 后端提供字典：数据表类型，1、数据库建表，2、SQL建表，3、Excel上传，4、API接入，5、腾讯文档，6、云数据库，7、手工输入，8、关联查询
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 数据表名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 无
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 所属文件夹
    */
    @SerializedName("FoldId")
    @Expose
    private Long FoldId;

    /**
    * 数据源Id
    */
    @SerializedName("DatasourceId")
    @Expose
    private String DatasourceId;

    /**
    * 物理表名
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * sql语句
    */
    @SerializedName("Sql")
    @Expose
    private String Sql;

    /**
    * excel地址
    */
    @SerializedName("ExcelUrl")
    @Expose
    private String ExcelUrl;

    /**
    * 字段配置
    */
    @SerializedName("Fields")
    @Expose
    private TableField [] Fields;

    /**
    * 多表关联使用: 1:数据源原表,2:本地表,3:Excel表,4:API表
    */
    @SerializedName("TableNodeType")
    @Expose
    private Long TableNodeType;

    /**
    * 多表关联的原始表信息
    */
    @SerializedName("Tables")
    @Expose
    private JoinSourceTable [] Tables;

    /**
    * 多表关联的关联信息
    */
    @SerializedName("Joins")
    @Expose
    private JoinRelation [] Joins;

    /**
    * 补充信息，如api数据源信息，腾讯文档接入信息等
    */
    @SerializedName("ExtInfo")
    @Expose
    private String ExtInfo;

    /**
    * 是否是异步
    */
    @SerializedName("AsyncRequest")
    @Expose
    private Boolean AsyncRequest;

    /**
    * 依赖的异步事务id
    */
    @SerializedName("ParentTranId")
    @Expose
    private String ParentTranId;

    /**
    * API数据源配置
    */
    @SerializedName("ApiDatasourceConfig")
    @Expose
    private ApiDatasourceConfig ApiDatasourceConfig;

    /**
    * 1
    */
    @SerializedName("ParamList")
    @Expose
    private ParamCreateDTO [] ParamList;

    /**
    * dlc高级参数
    */
    @SerializedName("DlcExtInfo")
    @Expose
    private String DlcExtInfo;

    /**
    * 是否查询数据库
    */
    @SerializedName("QueryDbData")
    @Expose
    private String QueryDbData;

    /**
    * 数据表备注
    */
    @SerializedName("TableComment")
    @Expose
    private String TableComment;

    /**
    * 是否查询字段备注
    */
    @SerializedName("QueryFieldRemark")
    @Expose
    private Long QueryFieldRemark;

    /**
    * 字段备注列表
    */
    @SerializedName("FieldRemarkList")
    @Expose
    private FieldRemarkDTO [] FieldRemarkList;

    /**
     * Get 后端提供字典：数据表类型，1、数据库建表，2、SQL建表，3、Excel上传，4、API接入，5、腾讯文档，6、云数据库，7、手工输入，8、关联查询 
     * @return Type 后端提供字典：数据表类型，1、数据库建表，2、SQL建表，3、Excel上传，4、API接入，5、腾讯文档，6、云数据库，7、手工输入，8、关联查询
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 后端提供字典：数据表类型，1、数据库建表，2、SQL建表，3、Excel上传，4、API接入，5、腾讯文档，6、云数据库，7、手工输入，8、关联查询
     * @param Type 后端提供字典：数据表类型，1、数据库建表，2、SQL建表，3、Excel上传，4、API接入，5、腾讯文档，6、云数据库，7、手工输入，8、关联查询
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 数据表名称 
     * @return Name 数据表名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 数据表名称
     * @param Name 数据表名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 无 
     * @return ProjectId 无
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 无
     * @param ProjectId 无
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 所属文件夹 
     * @return FoldId 所属文件夹
     */
    public Long getFoldId() {
        return this.FoldId;
    }

    /**
     * Set 所属文件夹
     * @param FoldId 所属文件夹
     */
    public void setFoldId(Long FoldId) {
        this.FoldId = FoldId;
    }

    /**
     * Get 数据源Id 
     * @return DatasourceId 数据源Id
     */
    public String getDatasourceId() {
        return this.DatasourceId;
    }

    /**
     * Set 数据源Id
     * @param DatasourceId 数据源Id
     */
    public void setDatasourceId(String DatasourceId) {
        this.DatasourceId = DatasourceId;
    }

    /**
     * Get 物理表名 
     * @return TableName 物理表名
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set 物理表名
     * @param TableName 物理表名
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get sql语句 
     * @return Sql sql语句
     */
    public String getSql() {
        return this.Sql;
    }

    /**
     * Set sql语句
     * @param Sql sql语句
     */
    public void setSql(String Sql) {
        this.Sql = Sql;
    }

    /**
     * Get excel地址 
     * @return ExcelUrl excel地址
     */
    public String getExcelUrl() {
        return this.ExcelUrl;
    }

    /**
     * Set excel地址
     * @param ExcelUrl excel地址
     */
    public void setExcelUrl(String ExcelUrl) {
        this.ExcelUrl = ExcelUrl;
    }

    /**
     * Get 字段配置 
     * @return Fields 字段配置
     */
    public TableField [] getFields() {
        return this.Fields;
    }

    /**
     * Set 字段配置
     * @param Fields 字段配置
     */
    public void setFields(TableField [] Fields) {
        this.Fields = Fields;
    }

    /**
     * Get 多表关联使用: 1:数据源原表,2:本地表,3:Excel表,4:API表 
     * @return TableNodeType 多表关联使用: 1:数据源原表,2:本地表,3:Excel表,4:API表
     */
    public Long getTableNodeType() {
        return this.TableNodeType;
    }

    /**
     * Set 多表关联使用: 1:数据源原表,2:本地表,3:Excel表,4:API表
     * @param TableNodeType 多表关联使用: 1:数据源原表,2:本地表,3:Excel表,4:API表
     */
    public void setTableNodeType(Long TableNodeType) {
        this.TableNodeType = TableNodeType;
    }

    /**
     * Get 多表关联的原始表信息 
     * @return Tables 多表关联的原始表信息
     */
    public JoinSourceTable [] getTables() {
        return this.Tables;
    }

    /**
     * Set 多表关联的原始表信息
     * @param Tables 多表关联的原始表信息
     */
    public void setTables(JoinSourceTable [] Tables) {
        this.Tables = Tables;
    }

    /**
     * Get 多表关联的关联信息 
     * @return Joins 多表关联的关联信息
     */
    public JoinRelation [] getJoins() {
        return this.Joins;
    }

    /**
     * Set 多表关联的关联信息
     * @param Joins 多表关联的关联信息
     */
    public void setJoins(JoinRelation [] Joins) {
        this.Joins = Joins;
    }

    /**
     * Get 补充信息，如api数据源信息，腾讯文档接入信息等 
     * @return ExtInfo 补充信息，如api数据源信息，腾讯文档接入信息等
     */
    public String getExtInfo() {
        return this.ExtInfo;
    }

    /**
     * Set 补充信息，如api数据源信息，腾讯文档接入信息等
     * @param ExtInfo 补充信息，如api数据源信息，腾讯文档接入信息等
     */
    public void setExtInfo(String ExtInfo) {
        this.ExtInfo = ExtInfo;
    }

    /**
     * Get 是否是异步 
     * @return AsyncRequest 是否是异步
     */
    public Boolean getAsyncRequest() {
        return this.AsyncRequest;
    }

    /**
     * Set 是否是异步
     * @param AsyncRequest 是否是异步
     */
    public void setAsyncRequest(Boolean AsyncRequest) {
        this.AsyncRequest = AsyncRequest;
    }

    /**
     * Get 依赖的异步事务id 
     * @return ParentTranId 依赖的异步事务id
     */
    public String getParentTranId() {
        return this.ParentTranId;
    }

    /**
     * Set 依赖的异步事务id
     * @param ParentTranId 依赖的异步事务id
     */
    public void setParentTranId(String ParentTranId) {
        this.ParentTranId = ParentTranId;
    }

    /**
     * Get API数据源配置 
     * @return ApiDatasourceConfig API数据源配置
     */
    public ApiDatasourceConfig getApiDatasourceConfig() {
        return this.ApiDatasourceConfig;
    }

    /**
     * Set API数据源配置
     * @param ApiDatasourceConfig API数据源配置
     */
    public void setApiDatasourceConfig(ApiDatasourceConfig ApiDatasourceConfig) {
        this.ApiDatasourceConfig = ApiDatasourceConfig;
    }

    /**
     * Get 1 
     * @return ParamList 1
     */
    public ParamCreateDTO [] getParamList() {
        return this.ParamList;
    }

    /**
     * Set 1
     * @param ParamList 1
     */
    public void setParamList(ParamCreateDTO [] ParamList) {
        this.ParamList = ParamList;
    }

    /**
     * Get dlc高级参数 
     * @return DlcExtInfo dlc高级参数
     */
    public String getDlcExtInfo() {
        return this.DlcExtInfo;
    }

    /**
     * Set dlc高级参数
     * @param DlcExtInfo dlc高级参数
     */
    public void setDlcExtInfo(String DlcExtInfo) {
        this.DlcExtInfo = DlcExtInfo;
    }

    /**
     * Get 是否查询数据库 
     * @return QueryDbData 是否查询数据库
     */
    public String getQueryDbData() {
        return this.QueryDbData;
    }

    /**
     * Set 是否查询数据库
     * @param QueryDbData 是否查询数据库
     */
    public void setQueryDbData(String QueryDbData) {
        this.QueryDbData = QueryDbData;
    }

    /**
     * Get 数据表备注 
     * @return TableComment 数据表备注
     */
    public String getTableComment() {
        return this.TableComment;
    }

    /**
     * Set 数据表备注
     * @param TableComment 数据表备注
     */
    public void setTableComment(String TableComment) {
        this.TableComment = TableComment;
    }

    /**
     * Get 是否查询字段备注 
     * @return QueryFieldRemark 是否查询字段备注
     */
    public Long getQueryFieldRemark() {
        return this.QueryFieldRemark;
    }

    /**
     * Set 是否查询字段备注
     * @param QueryFieldRemark 是否查询字段备注
     */
    public void setQueryFieldRemark(Long QueryFieldRemark) {
        this.QueryFieldRemark = QueryFieldRemark;
    }

    /**
     * Get 字段备注列表 
     * @return FieldRemarkList 字段备注列表
     */
    public FieldRemarkDTO [] getFieldRemarkList() {
        return this.FieldRemarkList;
    }

    /**
     * Set 字段备注列表
     * @param FieldRemarkList 字段备注列表
     */
    public void setFieldRemarkList(FieldRemarkDTO [] FieldRemarkList) {
        this.FieldRemarkList = FieldRemarkList;
    }

    public CreateDataTableRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDataTableRequest(CreateDataTableRequest source) {
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.FoldId != null) {
            this.FoldId = new Long(source.FoldId);
        }
        if (source.DatasourceId != null) {
            this.DatasourceId = new String(source.DatasourceId);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.Sql != null) {
            this.Sql = new String(source.Sql);
        }
        if (source.ExcelUrl != null) {
            this.ExcelUrl = new String(source.ExcelUrl);
        }
        if (source.Fields != null) {
            this.Fields = new TableField[source.Fields.length];
            for (int i = 0; i < source.Fields.length; i++) {
                this.Fields[i] = new TableField(source.Fields[i]);
            }
        }
        if (source.TableNodeType != null) {
            this.TableNodeType = new Long(source.TableNodeType);
        }
        if (source.Tables != null) {
            this.Tables = new JoinSourceTable[source.Tables.length];
            for (int i = 0; i < source.Tables.length; i++) {
                this.Tables[i] = new JoinSourceTable(source.Tables[i]);
            }
        }
        if (source.Joins != null) {
            this.Joins = new JoinRelation[source.Joins.length];
            for (int i = 0; i < source.Joins.length; i++) {
                this.Joins[i] = new JoinRelation(source.Joins[i]);
            }
        }
        if (source.ExtInfo != null) {
            this.ExtInfo = new String(source.ExtInfo);
        }
        if (source.AsyncRequest != null) {
            this.AsyncRequest = new Boolean(source.AsyncRequest);
        }
        if (source.ParentTranId != null) {
            this.ParentTranId = new String(source.ParentTranId);
        }
        if (source.ApiDatasourceConfig != null) {
            this.ApiDatasourceConfig = new ApiDatasourceConfig(source.ApiDatasourceConfig);
        }
        if (source.ParamList != null) {
            this.ParamList = new ParamCreateDTO[source.ParamList.length];
            for (int i = 0; i < source.ParamList.length; i++) {
                this.ParamList[i] = new ParamCreateDTO(source.ParamList[i]);
            }
        }
        if (source.DlcExtInfo != null) {
            this.DlcExtInfo = new String(source.DlcExtInfo);
        }
        if (source.QueryDbData != null) {
            this.QueryDbData = new String(source.QueryDbData);
        }
        if (source.TableComment != null) {
            this.TableComment = new String(source.TableComment);
        }
        if (source.QueryFieldRemark != null) {
            this.QueryFieldRemark = new Long(source.QueryFieldRemark);
        }
        if (source.FieldRemarkList != null) {
            this.FieldRemarkList = new FieldRemarkDTO[source.FieldRemarkList.length];
            for (int i = 0; i < source.FieldRemarkList.length; i++) {
                this.FieldRemarkList[i] = new FieldRemarkDTO(source.FieldRemarkList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "FoldId", this.FoldId);
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "Sql", this.Sql);
        this.setParamSimple(map, prefix + "ExcelUrl", this.ExcelUrl);
        this.setParamArrayObj(map, prefix + "Fields.", this.Fields);
        this.setParamSimple(map, prefix + "TableNodeType", this.TableNodeType);
        this.setParamArrayObj(map, prefix + "Tables.", this.Tables);
        this.setParamArrayObj(map, prefix + "Joins.", this.Joins);
        this.setParamSimple(map, prefix + "ExtInfo", this.ExtInfo);
        this.setParamSimple(map, prefix + "AsyncRequest", this.AsyncRequest);
        this.setParamSimple(map, prefix + "ParentTranId", this.ParentTranId);
        this.setParamObj(map, prefix + "ApiDatasourceConfig.", this.ApiDatasourceConfig);
        this.setParamArrayObj(map, prefix + "ParamList.", this.ParamList);
        this.setParamSimple(map, prefix + "DlcExtInfo", this.DlcExtInfo);
        this.setParamSimple(map, prefix + "QueryDbData", this.QueryDbData);
        this.setParamSimple(map, prefix + "TableComment", this.TableComment);
        this.setParamSimple(map, prefix + "QueryFieldRemark", this.QueryFieldRemark);
        this.setParamArrayObj(map, prefix + "FieldRemarkList.", this.FieldRemarkList);

    }
}

