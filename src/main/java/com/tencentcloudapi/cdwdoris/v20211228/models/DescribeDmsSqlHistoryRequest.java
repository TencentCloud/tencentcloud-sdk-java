/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDmsSqlHistoryRequest extends AbstractModel {

    /**
    * 查询节点ip
    */
    @SerializedName("QueryNode")
    @Expose
    private String [] QueryNode;

    /**
    * 运行状态
    */
    @SerializedName("QueryStatus")
    @Expose
    private String [] QueryStatus;

    /**
    * 模糊搜索sql
    */
    @SerializedName("QuerySql")
    @Expose
    private String QuerySql;

    /**
    * 根据报错原因搜索
    */
    @SerializedName("QueryErrMsg")
    @Expose
    private String QueryErrMsg;

    /**
     * Get 查询节点ip 
     * @return QueryNode 查询节点ip
     */
    public String [] getQueryNode() {
        return this.QueryNode;
    }

    /**
     * Set 查询节点ip
     * @param QueryNode 查询节点ip
     */
    public void setQueryNode(String [] QueryNode) {
        this.QueryNode = QueryNode;
    }

    /**
     * Get 运行状态 
     * @return QueryStatus 运行状态
     */
    public String [] getQueryStatus() {
        return this.QueryStatus;
    }

    /**
     * Set 运行状态
     * @param QueryStatus 运行状态
     */
    public void setQueryStatus(String [] QueryStatus) {
        this.QueryStatus = QueryStatus;
    }

    /**
     * Get 模糊搜索sql 
     * @return QuerySql 模糊搜索sql
     */
    public String getQuerySql() {
        return this.QuerySql;
    }

    /**
     * Set 模糊搜索sql
     * @param QuerySql 模糊搜索sql
     */
    public void setQuerySql(String QuerySql) {
        this.QuerySql = QuerySql;
    }

    /**
     * Get 根据报错原因搜索 
     * @return QueryErrMsg 根据报错原因搜索
     */
    public String getQueryErrMsg() {
        return this.QueryErrMsg;
    }

    /**
     * Set 根据报错原因搜索
     * @param QueryErrMsg 根据报错原因搜索
     */
    public void setQueryErrMsg(String QueryErrMsg) {
        this.QueryErrMsg = QueryErrMsg;
    }

    public DescribeDmsSqlHistoryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDmsSqlHistoryRequest(DescribeDmsSqlHistoryRequest source) {
        if (source.QueryNode != null) {
            this.QueryNode = new String[source.QueryNode.length];
            for (int i = 0; i < source.QueryNode.length; i++) {
                this.QueryNode[i] = new String(source.QueryNode[i]);
            }
        }
        if (source.QueryStatus != null) {
            this.QueryStatus = new String[source.QueryStatus.length];
            for (int i = 0; i < source.QueryStatus.length; i++) {
                this.QueryStatus[i] = new String(source.QueryStatus[i]);
            }
        }
        if (source.QuerySql != null) {
            this.QuerySql = new String(source.QuerySql);
        }
        if (source.QueryErrMsg != null) {
            this.QueryErrMsg = new String(source.QueryErrMsg);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "QueryNode.", this.QueryNode);
        this.setParamArraySimple(map, prefix + "QueryStatus.", this.QueryStatus);
        this.setParamSimple(map, prefix + "QuerySql", this.QuerySql);
        this.setParamSimple(map, prefix + "QueryErrMsg", this.QueryErrMsg);

    }
}

