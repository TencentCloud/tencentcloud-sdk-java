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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ViewBaseInfo extends AbstractModel{

    /**
    * 该视图所属数据库名字
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * 视图名称
    */
    @SerializedName("ViewName")
    @Expose
    private String ViewName;

    /**
     * Get 该视图所属数据库名字 
     * @return DatabaseName 该视图所属数据库名字
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set 该视图所属数据库名字
     * @param DatabaseName 该视图所属数据库名字
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get 视图名称 
     * @return ViewName 视图名称
     */
    public String getViewName() {
        return this.ViewName;
    }

    /**
     * Set 视图名称
     * @param ViewName 视图名称
     */
    public void setViewName(String ViewName) {
        this.ViewName = ViewName;
    }

    public ViewBaseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ViewBaseInfo(ViewBaseInfo source) {
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.ViewName != null) {
            this.ViewName = new String(source.ViewName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "ViewName", this.ViewName);

    }
}

