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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateNotebookSessionStatementSupportBatchSQLRequest extends AbstractModel{

    /**
    * Session唯一标识
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * 执行的代码
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * 类型，当前支持：sql
    */
    @SerializedName("Kind")
    @Expose
    private String Kind;

    /**
    * 是否保存运行结果
    */
    @SerializedName("SaveResult")
    @Expose
    private Boolean SaveResult;

    /**
     * Get Session唯一标识 
     * @return SessionId Session唯一标识
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set Session唯一标识
     * @param SessionId Session唯一标识
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get 执行的代码 
     * @return Code 执行的代码
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set 执行的代码
     * @param Code 执行的代码
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get 类型，当前支持：sql 
     * @return Kind 类型，当前支持：sql
     */
    public String getKind() {
        return this.Kind;
    }

    /**
     * Set 类型，当前支持：sql
     * @param Kind 类型，当前支持：sql
     */
    public void setKind(String Kind) {
        this.Kind = Kind;
    }

    /**
     * Get 是否保存运行结果 
     * @return SaveResult 是否保存运行结果
     */
    public Boolean getSaveResult() {
        return this.SaveResult;
    }

    /**
     * Set 是否保存运行结果
     * @param SaveResult 是否保存运行结果
     */
    public void setSaveResult(Boolean SaveResult) {
        this.SaveResult = SaveResult;
    }

    public CreateNotebookSessionStatementSupportBatchSQLRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateNotebookSessionStatementSupportBatchSQLRequest(CreateNotebookSessionStatementSupportBatchSQLRequest source) {
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
        if (source.Kind != null) {
            this.Kind = new String(source.Kind);
        }
        if (source.SaveResult != null) {
            this.SaveResult = new Boolean(source.SaveResult);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Kind", this.Kind);
        this.setParamSimple(map, prefix + "SaveResult", this.SaveResult);

    }
}

