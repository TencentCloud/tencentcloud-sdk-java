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

public class RevokePrivilegesRsp extends AbstractModel {

    /**
    * 结果
    */
    @SerializedName("OverallSuccess")
    @Expose
    private Boolean OverallSuccess;

    /**
    * 详情列表
    */
    @SerializedName("Results")
    @Expose
    private AuthorizeResult [] Results;

    /**
     * Get 结果 
     * @return OverallSuccess 结果
     */
    public Boolean getOverallSuccess() {
        return this.OverallSuccess;
    }

    /**
     * Set 结果
     * @param OverallSuccess 结果
     */
    public void setOverallSuccess(Boolean OverallSuccess) {
        this.OverallSuccess = OverallSuccess;
    }

    /**
     * Get 详情列表 
     * @return Results 详情列表
     */
    public AuthorizeResult [] getResults() {
        return this.Results;
    }

    /**
     * Set 详情列表
     * @param Results 详情列表
     */
    public void setResults(AuthorizeResult [] Results) {
        this.Results = Results;
    }

    public RevokePrivilegesRsp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RevokePrivilegesRsp(RevokePrivilegesRsp source) {
        if (source.OverallSuccess != null) {
            this.OverallSuccess = new Boolean(source.OverallSuccess);
        }
        if (source.Results != null) {
            this.Results = new AuthorizeResult[source.Results.length];
            for (int i = 0; i < source.Results.length; i++) {
                this.Results[i] = new AuthorizeResult(source.Results[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OverallSuccess", this.OverallSuccess);
        this.setParamArrayObj(map, prefix + "Results.", this.Results);

    }
}

