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

public class DbRelationStatusItem extends AbstractModel {

    /**
    * DB名称。
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * DB绑定状态。
    */
    @SerializedName("BindStatus")
    @Expose
    private String BindStatus;

    /**
    * DB有效性状态。
    */
    @SerializedName("ValidStatus")
    @Expose
    private String ValidStatus;

    /**
     * Get DB名称。 
     * @return DbName DB名称。
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set DB名称。
     * @param DbName DB名称。
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get DB绑定状态。 
     * @return BindStatus DB绑定状态。
     */
    public String getBindStatus() {
        return this.BindStatus;
    }

    /**
     * Set DB绑定状态。
     * @param BindStatus DB绑定状态。
     */
    public void setBindStatus(String BindStatus) {
        this.BindStatus = BindStatus;
    }

    /**
     * Get DB有效性状态。 
     * @return ValidStatus DB有效性状态。
     */
    public String getValidStatus() {
        return this.ValidStatus;
    }

    /**
     * Set DB有效性状态。
     * @param ValidStatus DB有效性状态。
     */
    public void setValidStatus(String ValidStatus) {
        this.ValidStatus = ValidStatus;
    }

    public DbRelationStatusItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DbRelationStatusItem(DbRelationStatusItem source) {
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.BindStatus != null) {
            this.BindStatus = new String(source.BindStatus);
        }
        if (source.ValidStatus != null) {
            this.ValidStatus = new String(source.ValidStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "BindStatus", this.BindStatus);
        this.setParamSimple(map, prefix + "ValidStatus", this.ValidStatus);

    }
}

