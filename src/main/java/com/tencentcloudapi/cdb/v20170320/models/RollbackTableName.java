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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RollbackTableName extends AbstractModel {

    /**
    * 回档前的原数据库表名
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * 回档后的新数据库表名
    */
    @SerializedName("NewTableName")
    @Expose
    private String NewTableName;

    /**
     * Get 回档前的原数据库表名 
     * @return TableName 回档前的原数据库表名
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set 回档前的原数据库表名
     * @param TableName 回档前的原数据库表名
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get 回档后的新数据库表名 
     * @return NewTableName 回档后的新数据库表名
     */
    public String getNewTableName() {
        return this.NewTableName;
    }

    /**
     * Set 回档后的新数据库表名
     * @param NewTableName 回档后的新数据库表名
     */
    public void setNewTableName(String NewTableName) {
        this.NewTableName = NewTableName;
    }

    public RollbackTableName() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RollbackTableName(RollbackTableName source) {
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.NewTableName != null) {
            this.NewTableName = new String(source.NewTableName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "NewTableName", this.NewTableName);

    }
}

