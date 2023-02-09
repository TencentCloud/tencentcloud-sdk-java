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

public class DBRenameRes extends AbstractModel{

    /**
    * 新数据库名称
    */
    @SerializedName("NewName")
    @Expose
    private String NewName;

    /**
    * 老数据库名称
    */
    @SerializedName("OldName")
    @Expose
    private String OldName;

    /**
     * Get 新数据库名称 
     * @return NewName 新数据库名称
     */
    public String getNewName() {
        return this.NewName;
    }

    /**
     * Set 新数据库名称
     * @param NewName 新数据库名称
     */
    public void setNewName(String NewName) {
        this.NewName = NewName;
    }

    /**
     * Get 老数据库名称 
     * @return OldName 老数据库名称
     */
    public String getOldName() {
        return this.OldName;
    }

    /**
     * Set 老数据库名称
     * @param OldName 老数据库名称
     */
    public void setOldName(String OldName) {
        this.OldName = OldName;
    }

    public DBRenameRes() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DBRenameRes(DBRenameRes source) {
        if (source.NewName != null) {
            this.NewName = new String(source.NewName);
        }
        if (source.OldName != null) {
            this.OldName = new String(source.OldName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NewName", this.NewName);
        this.setParamSimple(map, prefix + "OldName", this.OldName);

    }
}

