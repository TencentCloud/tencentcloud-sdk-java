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

public class QueryDeclareResult extends AbstractModel {

    /**
    * 成功申报材料查询数据
    */
    @SerializedName("Data")
    @Expose
    private QueryDeclareData Data;

    /**
    * 错误码
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
     * Get 成功申报材料查询数据 
     * @return Data 成功申报材料查询数据
     */
    public QueryDeclareData getData() {
        return this.Data;
    }

    /**
     * Set 成功申报材料查询数据
     * @param Data 成功申报材料查询数据
     */
    public void setData(QueryDeclareData Data) {
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

    public QueryDeclareResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryDeclareResult(QueryDeclareResult source) {
        if (source.Data != null) {
            this.Data = new QueryDeclareData(source.Data);
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

