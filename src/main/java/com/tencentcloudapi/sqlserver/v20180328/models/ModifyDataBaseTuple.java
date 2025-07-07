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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDataBaseTuple extends AbstractModel {

    /**
    * 要修改的订阅关系
    */
    @SerializedName("DatabaseTuple")
    @Expose
    private DatabaseTuple DatabaseTuple;

    /**
    * 修改后的订阅关系。DeleteDataBasesTuple为false时有效
    */
    @SerializedName("NewDatabaseTuple")
    @Expose
    private DatabaseTuple NewDatabaseTuple;

    /**
    * 是否删除订阅关系。此选项为true时，NewDatabaseTuple无效
    */
    @SerializedName("DeleteDataBasesTuple")
    @Expose
    private Boolean DeleteDataBasesTuple;

    /**
     * Get 要修改的订阅关系 
     * @return DatabaseTuple 要修改的订阅关系
     */
    public DatabaseTuple getDatabaseTuple() {
        return this.DatabaseTuple;
    }

    /**
     * Set 要修改的订阅关系
     * @param DatabaseTuple 要修改的订阅关系
     */
    public void setDatabaseTuple(DatabaseTuple DatabaseTuple) {
        this.DatabaseTuple = DatabaseTuple;
    }

    /**
     * Get 修改后的订阅关系。DeleteDataBasesTuple为false时有效 
     * @return NewDatabaseTuple 修改后的订阅关系。DeleteDataBasesTuple为false时有效
     */
    public DatabaseTuple getNewDatabaseTuple() {
        return this.NewDatabaseTuple;
    }

    /**
     * Set 修改后的订阅关系。DeleteDataBasesTuple为false时有效
     * @param NewDatabaseTuple 修改后的订阅关系。DeleteDataBasesTuple为false时有效
     */
    public void setNewDatabaseTuple(DatabaseTuple NewDatabaseTuple) {
        this.NewDatabaseTuple = NewDatabaseTuple;
    }

    /**
     * Get 是否删除订阅关系。此选项为true时，NewDatabaseTuple无效 
     * @return DeleteDataBasesTuple 是否删除订阅关系。此选项为true时，NewDatabaseTuple无效
     */
    public Boolean getDeleteDataBasesTuple() {
        return this.DeleteDataBasesTuple;
    }

    /**
     * Set 是否删除订阅关系。此选项为true时，NewDatabaseTuple无效
     * @param DeleteDataBasesTuple 是否删除订阅关系。此选项为true时，NewDatabaseTuple无效
     */
    public void setDeleteDataBasesTuple(Boolean DeleteDataBasesTuple) {
        this.DeleteDataBasesTuple = DeleteDataBasesTuple;
    }

    public ModifyDataBaseTuple() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDataBaseTuple(ModifyDataBaseTuple source) {
        if (source.DatabaseTuple != null) {
            this.DatabaseTuple = new DatabaseTuple(source.DatabaseTuple);
        }
        if (source.NewDatabaseTuple != null) {
            this.NewDatabaseTuple = new DatabaseTuple(source.NewDatabaseTuple);
        }
        if (source.DeleteDataBasesTuple != null) {
            this.DeleteDataBasesTuple = new Boolean(source.DeleteDataBasesTuple);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "DatabaseTuple.", this.DatabaseTuple);
        this.setParamObj(map, prefix + "NewDatabaseTuple.", this.NewDatabaseTuple);
        this.setParamSimple(map, prefix + "DeleteDataBasesTuple", this.DeleteDataBasesTuple);

    }
}

