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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryExchangerateResult extends AbstractModel{

    /**
    * 错误码
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * 查询汇率数据数组
    */
    @SerializedName("Data")
    @Expose
    private QueryExchangerateData [] Data;

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

    /**
     * Get 查询汇率数据数组 
     * @return Data 查询汇率数据数组
     */
    public QueryExchangerateData [] getData() {
        return this.Data;
    }

    /**
     * Set 查询汇率数据数组
     * @param Data 查询汇率数据数组
     */
    public void setData(QueryExchangerateData [] Data) {
        this.Data = Data;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamArrayObj(map, prefix + "Data.", this.Data);

    }
}

