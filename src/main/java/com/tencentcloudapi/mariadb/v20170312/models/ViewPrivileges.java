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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ViewPrivileges extends AbstractModel{

    /**
    * 数据库名
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * 数据库视图名
    */
    @SerializedName("View")
    @Expose
    private String View;

    /**
    * 权限信息
    */
    @SerializedName("Privileges")
    @Expose
    private String [] Privileges;

    /**
     * Get 数据库名 
     * @return Database 数据库名
     */
    public String getDatabase() {
        return this.Database;
    }

    /**
     * Set 数据库名
     * @param Database 数据库名
     */
    public void setDatabase(String Database) {
        this.Database = Database;
    }

    /**
     * Get 数据库视图名 
     * @return View 数据库视图名
     */
    public String getView() {
        return this.View;
    }

    /**
     * Set 数据库视图名
     * @param View 数据库视图名
     */
    public void setView(String View) {
        this.View = View;
    }

    /**
     * Get 权限信息 
     * @return Privileges 权限信息
     */
    public String [] getPrivileges() {
        return this.Privileges;
    }

    /**
     * Set 权限信息
     * @param Privileges 权限信息
     */
    public void setPrivileges(String [] Privileges) {
        this.Privileges = Privileges;
    }

    public ViewPrivileges() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ViewPrivileges(ViewPrivileges source) {
        if (source.Database != null) {
            this.Database = new String(source.Database);
        }
        if (source.View != null) {
            this.View = new String(source.View);
        }
        if (source.Privileges != null) {
            this.Privileges = new String[source.Privileges.length];
            for (int i = 0; i < source.Privileges.length; i++) {
                this.Privileges[i] = new String(source.Privileges[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Database", this.Database);
        this.setParamSimple(map, prefix + "View", this.View);
        this.setParamArraySimple(map, prefix + "Privileges.", this.Privileges);

    }
}

