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

public class DescribeSourceFieldListRequest extends AbstractModel {

    /**
    * 数据源Id
    */
    @SerializedName("DataSourceId")
    @Expose
    private Long DataSourceId;

    /**
    * 表名
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * sql内容
    */
    @SerializedName("Sql")
    @Expose
    private String Sql;

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 是否是异步
    */
    @SerializedName("AsyncRequest")
    @Expose
    private Boolean AsyncRequest;

    /**
    * 异步事务id
    */
    @SerializedName("TranId")
    @Expose
    private String TranId;

    /**
    * 11
    */
    @SerializedName("ParamList")
    @Expose
    private ParamCreateDTO [] ParamList;

    /**
    * DLC扩展参数
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
    * 数据表 Id
    */
    @SerializedName("TableId")
    @Expose
    private String TableId;

    /**
    * 后端提供字典：数据表类型，1、数据库建表，2、SQL建表，3、Excel上传，4、API接入，5、腾讯文档，6、云数据库，7、手工输入，8、关联查询
    */
    @SerializedName("TableType")
    @Expose
    private Long TableType;

    /**
     * Get 数据源Id 
     * @return DataSourceId 数据源Id
     */
    public Long getDataSourceId() {
        return this.DataSourceId;
    }

    /**
     * Set 数据源Id
     * @param DataSourceId 数据源Id
     */
    public void setDataSourceId(Long DataSourceId) {
        this.DataSourceId = DataSourceId;
    }

    /**
     * Get 表名 
     * @return TableName 表名
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set 表名
     * @param TableName 表名
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get sql内容 
     * @return Sql sql内容
     */
    public String getSql() {
        return this.Sql;
    }

    /**
     * Set sql内容
     * @param Sql sql内容
     */
    public void setSql(String Sql) {
        this.Sql = Sql;
    }

    /**
     * Get 项目id 
     * @return ProjectId 项目id
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id
     * @param ProjectId 项目id
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
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
     * Get 异步事务id 
     * @return TranId 异步事务id
     */
    public String getTranId() {
        return this.TranId;
    }

    /**
     * Set 异步事务id
     * @param TranId 异步事务id
     */
    public void setTranId(String TranId) {
        this.TranId = TranId;
    }

    /**
     * Get 11 
     * @return ParamList 11
     */
    public ParamCreateDTO [] getParamList() {
        return this.ParamList;
    }

    /**
     * Set 11
     * @param ParamList 11
     */
    public void setParamList(ParamCreateDTO [] ParamList) {
        this.ParamList = ParamList;
    }

    /**
     * Get DLC扩展参数 
     * @return DlcExtInfo DLC扩展参数
     */
    public String getDlcExtInfo() {
        return this.DlcExtInfo;
    }

    /**
     * Set DLC扩展参数
     * @param DlcExtInfo DLC扩展参数
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
     * Get 数据表 Id 
     * @return TableId 数据表 Id
     */
    public String getTableId() {
        return this.TableId;
    }

    /**
     * Set 数据表 Id
     * @param TableId 数据表 Id
     */
    public void setTableId(String TableId) {
        this.TableId = TableId;
    }

    /**
     * Get 后端提供字典：数据表类型，1、数据库建表，2、SQL建表，3、Excel上传，4、API接入，5、腾讯文档，6、云数据库，7、手工输入，8、关联查询 
     * @return TableType 后端提供字典：数据表类型，1、数据库建表，2、SQL建表，3、Excel上传，4、API接入，5、腾讯文档，6、云数据库，7、手工输入，8、关联查询
     */
    public Long getTableType() {
        return this.TableType;
    }

    /**
     * Set 后端提供字典：数据表类型，1、数据库建表，2、SQL建表，3、Excel上传，4、API接入，5、腾讯文档，6、云数据库，7、手工输入，8、关联查询
     * @param TableType 后端提供字典：数据表类型，1、数据库建表，2、SQL建表，3、Excel上传，4、API接入，5、腾讯文档，6、云数据库，7、手工输入，8、关联查询
     */
    public void setTableType(Long TableType) {
        this.TableType = TableType;
    }

    public DescribeSourceFieldListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSourceFieldListRequest(DescribeSourceFieldListRequest source) {
        if (source.DataSourceId != null) {
            this.DataSourceId = new Long(source.DataSourceId);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.Sql != null) {
            this.Sql = new String(source.Sql);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.AsyncRequest != null) {
            this.AsyncRequest = new Boolean(source.AsyncRequest);
        }
        if (source.TranId != null) {
            this.TranId = new String(source.TranId);
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
        if (source.TableId != null) {
            this.TableId = new String(source.TableId);
        }
        if (source.TableType != null) {
            this.TableType = new Long(source.TableType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataSourceId", this.DataSourceId);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "Sql", this.Sql);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "AsyncRequest", this.AsyncRequest);
        this.setParamSimple(map, prefix + "TranId", this.TranId);
        this.setParamArrayObj(map, prefix + "ParamList.", this.ParamList);
        this.setParamSimple(map, prefix + "DlcExtInfo", this.DlcExtInfo);
        this.setParamSimple(map, prefix + "QueryDbData", this.QueryDbData);
        this.setParamSimple(map, prefix + "TableId", this.TableId);
        this.setParamSimple(map, prefix + "TableType", this.TableType);

    }
}

