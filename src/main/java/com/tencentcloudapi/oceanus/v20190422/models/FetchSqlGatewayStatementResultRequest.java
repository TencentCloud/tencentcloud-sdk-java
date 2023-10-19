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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FetchSqlGatewayStatementResultRequest extends AbstractModel {

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Sql Gateway会话ID
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * sql的查询id
    */
    @SerializedName("OperationHandleId")
    @Expose
    private String OperationHandleId;

    /**
    * 下一条结果的获取url，首次获取执行结果时可以为空，当获取下一批查询结果时需要传递
    */
    @SerializedName("ResultUri")
    @Expose
    private String ResultUri;

    /**
     * Get 集群ID 
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Sql Gateway会话ID 
     * @return SessionId Sql Gateway会话ID
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set Sql Gateway会话ID
     * @param SessionId Sql Gateway会话ID
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get sql的查询id 
     * @return OperationHandleId sql的查询id
     */
    public String getOperationHandleId() {
        return this.OperationHandleId;
    }

    /**
     * Set sql的查询id
     * @param OperationHandleId sql的查询id
     */
    public void setOperationHandleId(String OperationHandleId) {
        this.OperationHandleId = OperationHandleId;
    }

    /**
     * Get 下一条结果的获取url，首次获取执行结果时可以为空，当获取下一批查询结果时需要传递 
     * @return ResultUri 下一条结果的获取url，首次获取执行结果时可以为空，当获取下一批查询结果时需要传递
     */
    public String getResultUri() {
        return this.ResultUri;
    }

    /**
     * Set 下一条结果的获取url，首次获取执行结果时可以为空，当获取下一批查询结果时需要传递
     * @param ResultUri 下一条结果的获取url，首次获取执行结果时可以为空，当获取下一批查询结果时需要传递
     */
    public void setResultUri(String ResultUri) {
        this.ResultUri = ResultUri;
    }

    public FetchSqlGatewayStatementResultRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FetchSqlGatewayStatementResultRequest(FetchSqlGatewayStatementResultRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.OperationHandleId != null) {
            this.OperationHandleId = new String(source.OperationHandleId);
        }
        if (source.ResultUri != null) {
            this.ResultUri = new String(source.ResultUri);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "OperationHandleId", this.OperationHandleId);
        this.setParamSimple(map, prefix + "ResultUri", this.ResultUri);

    }
}

