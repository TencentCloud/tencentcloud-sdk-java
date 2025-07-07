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

public class QueryFlexPlatformAccountBalanceRequest extends AbstractModel {

    /**
    * 收入类型
LABOR:劳务所得
OCCASION:偶然所得
    */
    @SerializedName("IncomeType")
    @Expose
    private String IncomeType;

    /**
    * 环境类型
__release__:生产环境
__sandbox__:沙箱环境
__test__:测试环境
缺省默认为生产环境
    */
    @SerializedName("Environment")
    @Expose
    private String Environment;

    /**
    * 快照日期。格式yyyy-MM-dd
    */
    @SerializedName("SnapshotDate")
    @Expose
    private String SnapshotDate;

    /**
     * Get 收入类型
LABOR:劳务所得
OCCASION:偶然所得 
     * @return IncomeType 收入类型
LABOR:劳务所得
OCCASION:偶然所得
     */
    public String getIncomeType() {
        return this.IncomeType;
    }

    /**
     * Set 收入类型
LABOR:劳务所得
OCCASION:偶然所得
     * @param IncomeType 收入类型
LABOR:劳务所得
OCCASION:偶然所得
     */
    public void setIncomeType(String IncomeType) {
        this.IncomeType = IncomeType;
    }

    /**
     * Get 环境类型
__release__:生产环境
__sandbox__:沙箱环境
__test__:测试环境
缺省默认为生产环境 
     * @return Environment 环境类型
__release__:生产环境
__sandbox__:沙箱环境
__test__:测试环境
缺省默认为生产环境
     */
    public String getEnvironment() {
        return this.Environment;
    }

    /**
     * Set 环境类型
__release__:生产环境
__sandbox__:沙箱环境
__test__:测试环境
缺省默认为生产环境
     * @param Environment 环境类型
__release__:生产环境
__sandbox__:沙箱环境
__test__:测试环境
缺省默认为生产环境
     */
    public void setEnvironment(String Environment) {
        this.Environment = Environment;
    }

    /**
     * Get 快照日期。格式yyyy-MM-dd 
     * @return SnapshotDate 快照日期。格式yyyy-MM-dd
     */
    public String getSnapshotDate() {
        return this.SnapshotDate;
    }

    /**
     * Set 快照日期。格式yyyy-MM-dd
     * @param SnapshotDate 快照日期。格式yyyy-MM-dd
     */
    public void setSnapshotDate(String SnapshotDate) {
        this.SnapshotDate = SnapshotDate;
    }

    public QueryFlexPlatformAccountBalanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryFlexPlatformAccountBalanceRequest(QueryFlexPlatformAccountBalanceRequest source) {
        if (source.IncomeType != null) {
            this.IncomeType = new String(source.IncomeType);
        }
        if (source.Environment != null) {
            this.Environment = new String(source.Environment);
        }
        if (source.SnapshotDate != null) {
            this.SnapshotDate = new String(source.SnapshotDate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IncomeType", this.IncomeType);
        this.setParamSimple(map, prefix + "Environment", this.Environment);
        this.setParamSimple(map, prefix + "SnapshotDate", this.SnapshotDate);

    }
}

