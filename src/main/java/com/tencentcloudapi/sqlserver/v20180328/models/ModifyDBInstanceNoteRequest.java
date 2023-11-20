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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDBInstanceNoteRequest extends AbstractModel {

    /**
    * 数据库实例ID，形如mssql-njj2mtpl
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例备注信息
    */
    @SerializedName("InstanceNote")
    @Expose
    private String InstanceNote;

    /**
     * Get 数据库实例ID，形如mssql-njj2mtpl 
     * @return InstanceId 数据库实例ID，形如mssql-njj2mtpl
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 数据库实例ID，形如mssql-njj2mtpl
     * @param InstanceId 数据库实例ID，形如mssql-njj2mtpl
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例备注信息 
     * @return InstanceNote 实例备注信息
     */
    public String getInstanceNote() {
        return this.InstanceNote;
    }

    /**
     * Set 实例备注信息
     * @param InstanceNote 实例备注信息
     */
    public void setInstanceNote(String InstanceNote) {
        this.InstanceNote = InstanceNote;
    }

    public ModifyDBInstanceNoteRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDBInstanceNoteRequest(ModifyDBInstanceNoteRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceNote != null) {
            this.InstanceNote = new String(source.InstanceNote);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceNote", this.InstanceNote);

    }
}

