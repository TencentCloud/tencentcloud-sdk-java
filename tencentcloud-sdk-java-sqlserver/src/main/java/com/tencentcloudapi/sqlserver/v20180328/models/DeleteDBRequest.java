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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteDBRequest extends AbstractModel{

    /**
    * 实例ID，形如mssql-rljoi3bf
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 数据库名数组
    */
    @SerializedName("Names")
    @Expose
    private String [] Names;

    /**
     * Get 实例ID，形如mssql-rljoi3bf 
     * @return InstanceId 实例ID，形如mssql-rljoi3bf
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID，形如mssql-rljoi3bf
     * @param InstanceId 实例ID，形如mssql-rljoi3bf
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 数据库名数组 
     * @return Names 数据库名数组
     */
    public String [] getNames() {
        return this.Names;
    }

    /**
     * Set 数据库名数组
     * @param Names 数据库名数组
     */
    public void setNames(String [] Names) {
        this.Names = Names;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "Names.", this.Names);

    }
}

