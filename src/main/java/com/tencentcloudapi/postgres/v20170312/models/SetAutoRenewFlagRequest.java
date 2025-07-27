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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SetAutoRenewFlagRequest extends AbstractModel {

    /**
    * 实例ID集合。可通过[DescribeDBInstances](https://cloud.tencent.com/document/api/409/16773)接口获取。仅支持预付费（包年包月）的实例。支持同时操作多个实例。
    */
    @SerializedName("DBInstanceIdSet")
    @Expose
    private String [] DBInstanceIdSet;

    /**
    * 续费标记。0-正常续费；1-自动续费；2-到期不续费
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
     * Get 实例ID集合。可通过[DescribeDBInstances](https://cloud.tencent.com/document/api/409/16773)接口获取。仅支持预付费（包年包月）的实例。支持同时操作多个实例。 
     * @return DBInstanceIdSet 实例ID集合。可通过[DescribeDBInstances](https://cloud.tencent.com/document/api/409/16773)接口获取。仅支持预付费（包年包月）的实例。支持同时操作多个实例。
     */
    public String [] getDBInstanceIdSet() {
        return this.DBInstanceIdSet;
    }

    /**
     * Set 实例ID集合。可通过[DescribeDBInstances](https://cloud.tencent.com/document/api/409/16773)接口获取。仅支持预付费（包年包月）的实例。支持同时操作多个实例。
     * @param DBInstanceIdSet 实例ID集合。可通过[DescribeDBInstances](https://cloud.tencent.com/document/api/409/16773)接口获取。仅支持预付费（包年包月）的实例。支持同时操作多个实例。
     */
    public void setDBInstanceIdSet(String [] DBInstanceIdSet) {
        this.DBInstanceIdSet = DBInstanceIdSet;
    }

    /**
     * Get 续费标记。0-正常续费；1-自动续费；2-到期不续费 
     * @return AutoRenewFlag 续费标记。0-正常续费；1-自动续费；2-到期不续费
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set 续费标记。0-正常续费；1-自动续费；2-到期不续费
     * @param AutoRenewFlag 续费标记。0-正常续费；1-自动续费；2-到期不续费
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    public SetAutoRenewFlagRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetAutoRenewFlagRequest(SetAutoRenewFlagRequest source) {
        if (source.DBInstanceIdSet != null) {
            this.DBInstanceIdSet = new String[source.DBInstanceIdSet.length];
            for (int i = 0; i < source.DBInstanceIdSet.length; i++) {
                this.DBInstanceIdSet[i] = new String(source.DBInstanceIdSet[i]);
            }
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DBInstanceIdSet.", this.DBInstanceIdSet);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);

    }
}

