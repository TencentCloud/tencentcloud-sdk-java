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

public class QueryAgentStatementsRequest extends AbstractModel{

    /**
    * 结算单日期，月结算单填每月1日
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * 日结算单:daily
月结算单:monthly
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get 结算单日期，月结算单填每月1日 
     * @return Date 结算单日期，月结算单填每月1日
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set 结算单日期，月结算单填每月1日
     * @param Date 结算单日期，月结算单填每月1日
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get 日结算单:daily
月结算单:monthly 
     * @return Type 日结算单:daily
月结算单:monthly
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 日结算单:daily
月结算单:monthly
     * @param Type 日结算单:daily
月结算单:monthly
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public QueryAgentStatementsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryAgentStatementsRequest(QueryAgentStatementsRequest source) {
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

