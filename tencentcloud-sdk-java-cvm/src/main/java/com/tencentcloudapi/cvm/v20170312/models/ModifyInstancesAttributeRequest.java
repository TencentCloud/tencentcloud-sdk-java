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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyInstancesAttributeRequest extends AbstractModel{

    /**
    * 一个或多个待操作的实例ID。可通过[`DescribeInstances`](https://cloud.tencent.com/document/api/213/15728) API返回值中的`InstanceId`获取。每次请求允许操作的实例数量上限是100。
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 实例名称。可任意命名，但不得超过60个字符。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 指定实例的安全组Id列表，子机将重新关联指定列表的安全组，原本关联的安全组会被解绑。
    */
    @SerializedName("SecurityGroups")
    @Expose
    private String [] SecurityGroups;

    /**
     * Get 一个或多个待操作的实例ID。可通过[`DescribeInstances`](https://cloud.tencent.com/document/api/213/15728) API返回值中的`InstanceId`获取。每次请求允许操作的实例数量上限是100。 
     * @return InstanceIds 一个或多个待操作的实例ID。可通过[`DescribeInstances`](https://cloud.tencent.com/document/api/213/15728) API返回值中的`InstanceId`获取。每次请求允许操作的实例数量上限是100。
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 一个或多个待操作的实例ID。可通过[`DescribeInstances`](https://cloud.tencent.com/document/api/213/15728) API返回值中的`InstanceId`获取。每次请求允许操作的实例数量上限是100。
     * @param InstanceIds 一个或多个待操作的实例ID。可通过[`DescribeInstances`](https://cloud.tencent.com/document/api/213/15728) API返回值中的`InstanceId`获取。每次请求允许操作的实例数量上限是100。
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 实例名称。可任意命名，但不得超过60个字符。 
     * @return InstanceName 实例名称。可任意命名，但不得超过60个字符。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称。可任意命名，但不得超过60个字符。
     * @param InstanceName 实例名称。可任意命名，但不得超过60个字符。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 指定实例的安全组Id列表，子机将重新关联指定列表的安全组，原本关联的安全组会被解绑。 
     * @return SecurityGroups 指定实例的安全组Id列表，子机将重新关联指定列表的安全组，原本关联的安全组会被解绑。
     */
    public String [] getSecurityGroups() {
        return this.SecurityGroups;
    }

    /**
     * Set 指定实例的安全组Id列表，子机将重新关联指定列表的安全组，原本关联的安全组会被解绑。
     * @param SecurityGroups 指定实例的安全组Id列表，子机将重新关联指定列表的安全组，原本关联的安全组会被解绑。
     */
    public void setSecurityGroups(String [] SecurityGroups) {
        this.SecurityGroups = SecurityGroups;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamArraySimple(map, prefix + "SecurityGroups.", this.SecurityGroups);

    }
}

