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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryTradeResult extends AbstractModel {

    /**
    * 贸易材料明细查询数据
    */
    @SerializedName("Data")
    @Expose
    private QueryTradeData Data;

    /**
    * 错误码
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
     * Get 贸易材料明细查询数据 
     * @return Data 贸易材料明细查询数据
     */
    public QueryTradeData getData() {
        return this.Data;
    }

    /**
     * Set 贸易材料明细查询数据
     * @param Data 贸易材料明细查询数据
     */
    public void setData(QueryTradeData Data) {
        this.Data = Data;
    }

    /**
     * Get 错误码 
     * @return Code 错误码
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set 错误码
     * @param Code 错误码
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    public QueryTradeResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryTradeResult(QueryTradeResult source) {
        if (source.Data != null) {
            this.Data = new QueryTradeData(source.Data);
        }
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "Code", this.Code);

    }
}

