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

public class RollbackTableInfo extends AbstractModel{

    /**
    * 旧表名称
    */
    @SerializedName("OldTable")
    @Expose
    private String OldTable;

    /**
    * 新表名称
    */
    @SerializedName("NewTable")
    @Expose
    private String NewTable;

    /**
     * Get 旧表名称 
     * @return OldTable 旧表名称
     */
    public String getOldTable() {
        return this.OldTable;
    }

    /**
     * Set 旧表名称
     * @param OldTable 旧表名称
     */
    public void setOldTable(String OldTable) {
        this.OldTable = OldTable;
    }

    /**
     * Get 新表名称 
     * @return NewTable 新表名称
     */
    public String getNewTable() {
        return this.NewTable;
    }

    /**
     * Set 新表名称
     * @param NewTable 新表名称
     */
    public void setNewTable(String NewTable) {
        this.NewTable = NewTable;
    }

    public RollbackTableInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RollbackTableInfo(RollbackTableInfo source) {
        if (source.OldTable != null) {
            this.OldTable = new String(source.OldTable);
        }
        if (source.NewTable != null) {
            this.NewTable = new String(source.NewTable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OldTable", this.OldTable);
        this.setParamSimple(map, prefix + "NewTable", this.NewTable);

    }
}

