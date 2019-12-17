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
package com.tencentcloudapi.dts.v20180330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SwitchDrToMasterRequest extends AbstractModel{

    /**
    * 灾备实例的信息
    */
    @SerializedName("DstInfo")
    @Expose
    private SyncInstanceInfo DstInfo;

    /**
    * 数据库的类型  （如 mysql）
    */
    @SerializedName("DatabaseType")
    @Expose
    private String DatabaseType;

    /**
     * Get 灾备实例的信息 
     * @return DstInfo 灾备实例的信息
     */
    public SyncInstanceInfo getDstInfo() {
        return this.DstInfo;
    }

    /**
     * Set 灾备实例的信息
     * @param DstInfo 灾备实例的信息
     */
    public void setDstInfo(SyncInstanceInfo DstInfo) {
        this.DstInfo = DstInfo;
    }

    /**
     * Get 数据库的类型  （如 mysql） 
     * @return DatabaseType 数据库的类型  （如 mysql）
     */
    public String getDatabaseType() {
        return this.DatabaseType;
    }

    /**
     * Set 数据库的类型  （如 mysql）
     * @param DatabaseType 数据库的类型  （如 mysql）
     */
    public void setDatabaseType(String DatabaseType) {
        this.DatabaseType = DatabaseType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "DstInfo.", this.DstInfo);
        this.setParamSimple(map, prefix + "DatabaseType", this.DatabaseType);

    }
}

