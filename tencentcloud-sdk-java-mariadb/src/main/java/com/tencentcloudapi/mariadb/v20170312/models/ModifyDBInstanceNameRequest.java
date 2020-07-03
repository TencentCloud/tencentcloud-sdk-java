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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDBInstanceNameRequest extends AbstractModel{

    /**
    * 待修改的实例 ID。形如：tdsql-ow728lmc，可以通过 DescribeDBInstances 查询实例详情获得。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 新的实例名称。允许的字符为字母、数字、下划线、连字符和中文。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
     * Get 待修改的实例 ID。形如：tdsql-ow728lmc，可以通过 DescribeDBInstances 查询实例详情获得。 
     * @return InstanceId 待修改的实例 ID。形如：tdsql-ow728lmc，可以通过 DescribeDBInstances 查询实例详情获得。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 待修改的实例 ID。形如：tdsql-ow728lmc，可以通过 DescribeDBInstances 查询实例详情获得。
     * @param InstanceId 待修改的实例 ID。形如：tdsql-ow728lmc，可以通过 DescribeDBInstances 查询实例详情获得。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 新的实例名称。允许的字符为字母、数字、下划线、连字符和中文。 
     * @return InstanceName 新的实例名称。允许的字符为字母、数字、下划线、连字符和中文。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 新的实例名称。允许的字符为字母、数字、下划线、连字符和中文。
     * @param InstanceName 新的实例名称。允许的字符为字母、数字、下划线、连字符和中文。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);

    }
}

