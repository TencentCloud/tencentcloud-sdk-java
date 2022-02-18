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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RollbackDatabase extends AbstractModel{

    /**
    * 旧数据库
    */
    @SerializedName("OldDatabase")
    @Expose
    private String OldDatabase;

    /**
    * 新数据库
    */
    @SerializedName("NewDatabase")
    @Expose
    private String NewDatabase;

    /**
     * Get 旧数据库 
     * @return OldDatabase 旧数据库
     */
    public String getOldDatabase() {
        return this.OldDatabase;
    }

    /**
     * Set 旧数据库
     * @param OldDatabase 旧数据库
     */
    public void setOldDatabase(String OldDatabase) {
        this.OldDatabase = OldDatabase;
    }

    /**
     * Get 新数据库 
     * @return NewDatabase 新数据库
     */
    public String getNewDatabase() {
        return this.NewDatabase;
    }

    /**
     * Set 新数据库
     * @param NewDatabase 新数据库
     */
    public void setNewDatabase(String NewDatabase) {
        this.NewDatabase = NewDatabase;
    }

    public RollbackDatabase() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RollbackDatabase(RollbackDatabase source) {
        if (source.OldDatabase != null) {
            this.OldDatabase = new String(source.OldDatabase);
        }
        if (source.NewDatabase != null) {
            this.NewDatabase = new String(source.NewDatabase);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OldDatabase", this.OldDatabase);
        this.setParamSimple(map, prefix + "NewDatabase", this.NewDatabase);

    }
}

