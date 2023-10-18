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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FetchSqlGatewayStatementResultResponse extends AbstractModel{

    /**
    * 错误信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String [] ErrorMessage;

    /**
    * 返回类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResultType")
    @Expose
    private String ResultType;

    /**
    * 是否DQL结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsQueryResult")
    @Expose
    private Boolean IsQueryResult;

    /**
    * 结果类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResultKind")
    @Expose
    private String ResultKind;

    /**
    * 结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Results")
    @Expose
    private StatementResult Results;

    /**
    * 下一次请求的uri
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NextResultUri")
    @Expose
    private String NextResultUri;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 错误信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorMessage 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorMessage 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorMessage(String [] ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    /**
     * Get 返回类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResultType 返回类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResultType() {
        return this.ResultType;
    }

    /**
     * Set 返回类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResultType 返回类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResultType(String ResultType) {
        this.ResultType = ResultType;
    }

    /**
     * Get 是否DQL结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsQueryResult 是否DQL结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsQueryResult() {
        return this.IsQueryResult;
    }

    /**
     * Set 是否DQL结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsQueryResult 是否DQL结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsQueryResult(Boolean IsQueryResult) {
        this.IsQueryResult = IsQueryResult;
    }

    /**
     * Get 结果类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResultKind 结果类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResultKind() {
        return this.ResultKind;
    }

    /**
     * Set 结果类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResultKind 结果类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResultKind(String ResultKind) {
        this.ResultKind = ResultKind;
    }

    /**
     * Get 结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Results 结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StatementResult getResults() {
        return this.Results;
    }

    /**
     * Set 结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param Results 结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResults(StatementResult Results) {
        this.Results = Results;
    }

    /**
     * Get 下一次请求的uri
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NextResultUri 下一次请求的uri
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNextResultUri() {
        return this.NextResultUri;
    }

    /**
     * Set 下一次请求的uri
注意：此字段可能返回 null，表示取不到有效值。
     * @param NextResultUri 下一次请求的uri
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNextResultUri(String NextResultUri) {
        this.NextResultUri = NextResultUri;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public FetchSqlGatewayStatementResultResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FetchSqlGatewayStatementResultResponse(FetchSqlGatewayStatementResultResponse source) {
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String[source.ErrorMessage.length];
            for (int i = 0; i < source.ErrorMessage.length; i++) {
                this.ErrorMessage[i] = new String(source.ErrorMessage[i]);
            }
        }
        if (source.ResultType != null) {
            this.ResultType = new String(source.ResultType);
        }
        if (source.IsQueryResult != null) {
            this.IsQueryResult = new Boolean(source.IsQueryResult);
        }
        if (source.ResultKind != null) {
            this.ResultKind = new String(source.ResultKind);
        }
        if (source.Results != null) {
            this.Results = new StatementResult(source.Results);
        }
        if (source.NextResultUri != null) {
            this.NextResultUri = new String(source.NextResultUri);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ErrorMessage.", this.ErrorMessage);
        this.setParamSimple(map, prefix + "ResultType", this.ResultType);
        this.setParamSimple(map, prefix + "IsQueryResult", this.IsQueryResult);
        this.setParamSimple(map, prefix + "ResultKind", this.ResultKind);
        this.setParamObj(map, prefix + "Results.", this.Results);
        this.setParamSimple(map, prefix + "NextResultUri", this.NextResultUri);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

