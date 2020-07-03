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

public class InstanceRenewInfo extends AbstractModel{

    /**
    * 实例ID，形如mssql-j8kv137v
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例续费标记。0：正常续费，1：自动续费，2：到期不续
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

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
     * Get 实例续费标记。0：正常续费，1：自动续费，2：到期不续 
     * @return RenewFlag 实例续费标记。0：正常续费，1：自动续费，2：到期不续
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set 实例续费标记。0：正常续费，1：自动续费，2：到期不续
     * @param RenewFlag 实例续费标记。0：正常续费，1：自动续费，2：到期不续
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);

    }
}

