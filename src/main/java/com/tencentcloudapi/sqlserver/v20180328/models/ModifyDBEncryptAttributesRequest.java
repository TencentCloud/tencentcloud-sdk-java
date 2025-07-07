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

public class ModifyDBEncryptAttributesRequest extends AbstractModel {

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 开启、关闭数据库TDE加密
    */
    @SerializedName("DBTDEEncrypt")
    @Expose
    private DBTDEEncrypt [] DBTDEEncrypt;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 开启、关闭数据库TDE加密 
     * @return DBTDEEncrypt 开启、关闭数据库TDE加密
     */
    public DBTDEEncrypt [] getDBTDEEncrypt() {
        return this.DBTDEEncrypt;
    }

    /**
     * Set 开启、关闭数据库TDE加密
     * @param DBTDEEncrypt 开启、关闭数据库TDE加密
     */
    public void setDBTDEEncrypt(DBTDEEncrypt [] DBTDEEncrypt) {
        this.DBTDEEncrypt = DBTDEEncrypt;
    }

    public ModifyDBEncryptAttributesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDBEncryptAttributesRequest(ModifyDBEncryptAttributesRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.DBTDEEncrypt != null) {
            this.DBTDEEncrypt = new DBTDEEncrypt[source.DBTDEEncrypt.length];
            for (int i = 0; i < source.DBTDEEncrypt.length; i++) {
                this.DBTDEEncrypt[i] = new DBTDEEncrypt(source.DBTDEEncrypt[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "DBTDEEncrypt.", this.DBTDEEncrypt);

    }
}

