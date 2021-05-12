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

public class CloneDBRequest extends AbstractModel{

    /**
    * 实例ID，形如mssql-j8kv137v
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 按照ReNameRestoreDatabase中的库进行克隆，并重命名，新库名称必须指定
    */
    @SerializedName("RenameRestore")
    @Expose
    private RenameRestoreDatabase [] RenameRestore;

    /**
     * Get 实例ID，形如mssql-j8kv137v 
     * @return InstanceId 实例ID，形如mssql-j8kv137v
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID，形如mssql-j8kv137v
     * @param InstanceId 实例ID，形如mssql-j8kv137v
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 按照ReNameRestoreDatabase中的库进行克隆，并重命名，新库名称必须指定 
     * @return RenameRestore 按照ReNameRestoreDatabase中的库进行克隆，并重命名，新库名称必须指定
     */
    public RenameRestoreDatabase [] getRenameRestore() {
        return this.RenameRestore;
    }

    /**
     * Set 按照ReNameRestoreDatabase中的库进行克隆，并重命名，新库名称必须指定
     * @param RenameRestore 按照ReNameRestoreDatabase中的库进行克隆，并重命名，新库名称必须指定
     */
    public void setRenameRestore(RenameRestoreDatabase [] RenameRestore) {
        this.RenameRestore = RenameRestore;
    }

    public CloneDBRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloneDBRequest(CloneDBRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.RenameRestore != null) {
            this.RenameRestore = new RenameRestoreDatabase[source.RenameRestore.length];
            for (int i = 0; i < source.RenameRestore.length; i++) {
                this.RenameRestore[i] = new RenameRestoreDatabase(source.RenameRestore[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "RenameRestore.", this.RenameRestore);

    }
}

