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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubscribeObject extends AbstractModel {

    /**
    * 数据订阅对象的类型，0-数据库，1-数据库内的表
    */
    @SerializedName("ObjectsType")
    @Expose
    private Long ObjectsType;

    /**
    * 订阅数据库的名称
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * 订阅数据库中表名称数组
    */
    @SerializedName("TableNames")
    @Expose
    private String [] TableNames;

    /**
     * Get 数据订阅对象的类型，0-数据库，1-数据库内的表 
     * @return ObjectsType 数据订阅对象的类型，0-数据库，1-数据库内的表
     */
    public Long getObjectsType() {
        return this.ObjectsType;
    }

    /**
     * Set 数据订阅对象的类型，0-数据库，1-数据库内的表
     * @param ObjectsType 数据订阅对象的类型，0-数据库，1-数据库内的表
     */
    public void setObjectsType(Long ObjectsType) {
        this.ObjectsType = ObjectsType;
    }

    /**
     * Get 订阅数据库的名称 
     * @return DatabaseName 订阅数据库的名称
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set 订阅数据库的名称
     * @param DatabaseName 订阅数据库的名称
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get 订阅数据库中表名称数组 
     * @return TableNames 订阅数据库中表名称数组
     */
    public String [] getTableNames() {
        return this.TableNames;
    }

    /**
     * Set 订阅数据库中表名称数组
     * @param TableNames 订阅数据库中表名称数组
     */
    public void setTableNames(String [] TableNames) {
        this.TableNames = TableNames;
    }

    public SubscribeObject() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubscribeObject(SubscribeObject source) {
        if (source.ObjectsType != null) {
            this.ObjectsType = new Long(source.ObjectsType);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.TableNames != null) {
            this.TableNames = new String[source.TableNames.length];
            for (int i = 0; i < source.TableNames.length; i++) {
                this.TableNames[i] = new String(source.TableNames[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ObjectsType", this.ObjectsType);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamArraySimple(map, prefix + "TableNames.", this.TableNames);

    }
}

