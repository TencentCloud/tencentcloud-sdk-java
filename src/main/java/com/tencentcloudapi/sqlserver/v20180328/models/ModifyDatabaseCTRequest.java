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

public class ModifyDatabaseCTRequest extends AbstractModel{

    /**
    * 数据库名数组
    */
    @SerializedName("DBNames")
    @Expose
    private String [] DBNames;

    /**
    * 启用、禁用数据库CT功能 enable；启用，disable：禁用
    */
    @SerializedName("ModifyType")
    @Expose
    private String ModifyType;

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 启用CT时额外保留天数，默认保留3天，最小3天，最大30天
    */
    @SerializedName("ChangeRetentionDay")
    @Expose
    private Long ChangeRetentionDay;

    /**
     * Get 数据库名数组 
     * @return DBNames 数据库名数组
     */
    public String [] getDBNames() {
        return this.DBNames;
    }

    /**
     * Set 数据库名数组
     * @param DBNames 数据库名数组
     */
    public void setDBNames(String [] DBNames) {
        this.DBNames = DBNames;
    }

    /**
     * Get 启用、禁用数据库CT功能 enable；启用，disable：禁用 
     * @return ModifyType 启用、禁用数据库CT功能 enable；启用，disable：禁用
     */
    public String getModifyType() {
        return this.ModifyType;
    }

    /**
     * Set 启用、禁用数据库CT功能 enable；启用，disable：禁用
     * @param ModifyType 启用、禁用数据库CT功能 enable；启用，disable：禁用
     */
    public void setModifyType(String ModifyType) {
        this.ModifyType = ModifyType;
    }

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
     * Get 启用CT时额外保留天数，默认保留3天，最小3天，最大30天 
     * @return ChangeRetentionDay 启用CT时额外保留天数，默认保留3天，最小3天，最大30天
     */
    public Long getChangeRetentionDay() {
        return this.ChangeRetentionDay;
    }

    /**
     * Set 启用CT时额外保留天数，默认保留3天，最小3天，最大30天
     * @param ChangeRetentionDay 启用CT时额外保留天数，默认保留3天，最小3天，最大30天
     */
    public void setChangeRetentionDay(Long ChangeRetentionDay) {
        this.ChangeRetentionDay = ChangeRetentionDay;
    }

    public ModifyDatabaseCTRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDatabaseCTRequest(ModifyDatabaseCTRequest source) {
        if (source.DBNames != null) {
            this.DBNames = new String[source.DBNames.length];
            for (int i = 0; i < source.DBNames.length; i++) {
                this.DBNames[i] = new String(source.DBNames[i]);
            }
        }
        if (source.ModifyType != null) {
            this.ModifyType = new String(source.ModifyType);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ChangeRetentionDay != null) {
            this.ChangeRetentionDay = new Long(source.ChangeRetentionDay);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DBNames.", this.DBNames);
        this.setParamSimple(map, prefix + "ModifyType", this.ModifyType);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ChangeRetentionDay", this.ChangeRetentionDay);

    }
}

