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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DbInfo extends AbstractModel {

    /**
    * 数据库名称
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * 绑定的状态
    */
    @SerializedName("ValidStatus")
    @Expose
    private String ValidStatus;

    /**
    * 绑定的类型
    */
    @SerializedName("BindType")
    @Expose
    private String BindType;

    /**
     * Get 数据库名称 
     * @return DbName 数据库名称
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set 数据库名称
     * @param DbName 数据库名称
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get 绑定的状态 
     * @return ValidStatus 绑定的状态
     */
    public String getValidStatus() {
        return this.ValidStatus;
    }

    /**
     * Set 绑定的状态
     * @param ValidStatus 绑定的状态
     */
    public void setValidStatus(String ValidStatus) {
        this.ValidStatus = ValidStatus;
    }

    /**
     * Get 绑定的类型 
     * @return BindType 绑定的类型
     */
    public String getBindType() {
        return this.BindType;
    }

    /**
     * Set 绑定的类型
     * @param BindType 绑定的类型
     */
    public void setBindType(String BindType) {
        this.BindType = BindType;
    }

    public DbInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DbInfo(DbInfo source) {
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.ValidStatus != null) {
            this.ValidStatus = new String(source.ValidStatus);
        }
        if (source.BindType != null) {
            this.BindType = new String(source.BindType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "ValidStatus", this.ValidStatus);
        this.setParamSimple(map, prefix + "BindType", this.BindType);

    }
}

