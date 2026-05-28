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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MigrationInput extends AbstractModel {

    /**
    * <p>migration 版本号</p><p>参数格式：纯数字，14位时间格式</p>
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * <p>migration 版本名</p><p>入参限制：仅允许小写字母和下划线</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>migration 应用 sql 语句</p>
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * <p>migration 回滚 sql 语句</p>
    */
    @SerializedName("Rollback")
    @Expose
    private String Rollback;

    /**
     * Get <p>migration 版本号</p><p>参数格式：纯数字，14位时间格式</p> 
     * @return Version <p>migration 版本号</p><p>参数格式：纯数字，14位时间格式</p>
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set <p>migration 版本号</p><p>参数格式：纯数字，14位时间格式</p>
     * @param Version <p>migration 版本号</p><p>参数格式：纯数字，14位时间格式</p>
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get <p>migration 版本名</p><p>入参限制：仅允许小写字母和下划线</p> 
     * @return Name <p>migration 版本名</p><p>入参限制：仅允许小写字母和下划线</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>migration 版本名</p><p>入参限制：仅允许小写字母和下划线</p>
     * @param Name <p>migration 版本名</p><p>入参限制：仅允许小写字母和下划线</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>migration 应用 sql 语句</p> 
     * @return Query <p>migration 应用 sql 语句</p>
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set <p>migration 应用 sql 语句</p>
     * @param Query <p>migration 应用 sql 语句</p>
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get <p>migration 回滚 sql 语句</p> 
     * @return Rollback <p>migration 回滚 sql 语句</p>
     */
    public String getRollback() {
        return this.Rollback;
    }

    /**
     * Set <p>migration 回滚 sql 语句</p>
     * @param Rollback <p>migration 回滚 sql 语句</p>
     */
    public void setRollback(String Rollback) {
        this.Rollback = Rollback;
    }

    public MigrationInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MigrationInput(MigrationInput source) {
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.Rollback != null) {
            this.Rollback = new String(source.Rollback);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamSimple(map, prefix + "Rollback", this.Rollback);

    }
}

