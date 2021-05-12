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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDBInstanceReadOnlyGroupRequest extends AbstractModel{

    /**
    * 实例ID
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * 当前实例所在只读组ID
    */
    @SerializedName("ReadOnlyGroupId")
    @Expose
    private String ReadOnlyGroupId;

    /**
    * 实例修改的目标只读组ID
    */
    @SerializedName("NewReadOnlyGroupId")
    @Expose
    private String NewReadOnlyGroupId;

    /**
     * Get 实例ID 
     * @return DBInstanceId 实例ID
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set 实例ID
     * @param DBInstanceId 实例ID
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get 当前实例所在只读组ID 
     * @return ReadOnlyGroupId 当前实例所在只读组ID
     */
    public String getReadOnlyGroupId() {
        return this.ReadOnlyGroupId;
    }

    /**
     * Set 当前实例所在只读组ID
     * @param ReadOnlyGroupId 当前实例所在只读组ID
     */
    public void setReadOnlyGroupId(String ReadOnlyGroupId) {
        this.ReadOnlyGroupId = ReadOnlyGroupId;
    }

    /**
     * Get 实例修改的目标只读组ID 
     * @return NewReadOnlyGroupId 实例修改的目标只读组ID
     */
    public String getNewReadOnlyGroupId() {
        return this.NewReadOnlyGroupId;
    }

    /**
     * Set 实例修改的目标只读组ID
     * @param NewReadOnlyGroupId 实例修改的目标只读组ID
     */
    public void setNewReadOnlyGroupId(String NewReadOnlyGroupId) {
        this.NewReadOnlyGroupId = NewReadOnlyGroupId;
    }

    public ModifyDBInstanceReadOnlyGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDBInstanceReadOnlyGroupRequest(ModifyDBInstanceReadOnlyGroupRequest source) {
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.ReadOnlyGroupId != null) {
            this.ReadOnlyGroupId = new String(source.ReadOnlyGroupId);
        }
        if (source.NewReadOnlyGroupId != null) {
            this.NewReadOnlyGroupId = new String(source.NewReadOnlyGroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "ReadOnlyGroupId", this.ReadOnlyGroupId);
        this.setParamSimple(map, prefix + "NewReadOnlyGroupId", this.NewReadOnlyGroupId);

    }
}

