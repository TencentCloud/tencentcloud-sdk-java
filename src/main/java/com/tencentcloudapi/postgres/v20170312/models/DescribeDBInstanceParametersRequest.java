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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBInstanceParametersRequest extends AbstractModel{

    /**
    * 实例ID
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * 查询指定参数详情。ParamName为空或不传，默认返回全部参数列表
    */
    @SerializedName("ParamName")
    @Expose
    private String ParamName;

    /**
     * Get 实例ID 
     * @return DBInstanceId 实例ID
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set 实例ID
     * @param DBInstanceId 实例ID
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get 查询指定参数详情。ParamName为空或不传，默认返回全部参数列表 
     * @return ParamName 查询指定参数详情。ParamName为空或不传，默认返回全部参数列表
     */
    public String getParamName() {
        return this.ParamName;
    }

    /**
     * Set 查询指定参数详情。ParamName为空或不传，默认返回全部参数列表
     * @param ParamName 查询指定参数详情。ParamName为空或不传，默认返回全部参数列表
     */
    public void setParamName(String ParamName) {
        this.ParamName = ParamName;
    }

    public DescribeDBInstanceParametersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBInstanceParametersRequest(DescribeDBInstanceParametersRequest source) {
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.ParamName != null) {
            this.ParamName = new String(source.ParamName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "ParamName", this.ParamName);

    }
}

