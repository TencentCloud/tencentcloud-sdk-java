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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyInstancesAttributeRequest extends AbstractModel{

    /**
    * 待修改的实例ID列表。在单次请求的过程中，请求实例数上限为100。
    */
    @SerializedName("InstanceIdSet")
    @Expose
    private String [] InstanceIdSet;

    /**
    * 修改成功后显示的实例名称，不得超过60个字符，不传则名称显示为空。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 指定实例的安全组Id列表，子机将重新关联指定列表的安全组，原本关联的安全组会被解绑。限制不超过5个。
    */
    @SerializedName("SecurityGroups")
    @Expose
    private String [] SecurityGroups;

    /**
     * Get 待修改的实例ID列表。在单次请求的过程中，请求实例数上限为100。 
     * @return InstanceIdSet 待修改的实例ID列表。在单次请求的过程中，请求实例数上限为100。
     */
    public String [] getInstanceIdSet() {
        return this.InstanceIdSet;
    }

    /**
     * Set 待修改的实例ID列表。在单次请求的过程中，请求实例数上限为100。
     * @param InstanceIdSet 待修改的实例ID列表。在单次请求的过程中，请求实例数上限为100。
     */
    public void setInstanceIdSet(String [] InstanceIdSet) {
        this.InstanceIdSet = InstanceIdSet;
    }

    /**
     * Get 修改成功后显示的实例名称，不得超过60个字符，不传则名称显示为空。 
     * @return InstanceName 修改成功后显示的实例名称，不得超过60个字符，不传则名称显示为空。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 修改成功后显示的实例名称，不得超过60个字符，不传则名称显示为空。
     * @param InstanceName 修改成功后显示的实例名称，不得超过60个字符，不传则名称显示为空。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 指定实例的安全组Id列表，子机将重新关联指定列表的安全组，原本关联的安全组会被解绑。限制不超过5个。 
     * @return SecurityGroups 指定实例的安全组Id列表，子机将重新关联指定列表的安全组，原本关联的安全组会被解绑。限制不超过5个。
     */
    public String [] getSecurityGroups() {
        return this.SecurityGroups;
    }

    /**
     * Set 指定实例的安全组Id列表，子机将重新关联指定列表的安全组，原本关联的安全组会被解绑。限制不超过5个。
     * @param SecurityGroups 指定实例的安全组Id列表，子机将重新关联指定列表的安全组，原本关联的安全组会被解绑。限制不超过5个。
     */
    public void setSecurityGroups(String [] SecurityGroups) {
        this.SecurityGroups = SecurityGroups;
    }

    public ModifyInstancesAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInstancesAttributeRequest(ModifyInstancesAttributeRequest source) {
        if (source.InstanceIdSet != null) {
            this.InstanceIdSet = new String[source.InstanceIdSet.length];
            for (int i = 0; i < source.InstanceIdSet.length; i++) {
                this.InstanceIdSet[i] = new String(source.InstanceIdSet[i]);
            }
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.SecurityGroups != null) {
            this.SecurityGroups = new String[source.SecurityGroups.length];
            for (int i = 0; i < source.SecurityGroups.length; i++) {
                this.SecurityGroups[i] = new String(source.SecurityGroups[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIdSet.", this.InstanceIdSet);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamArraySimple(map, prefix + "SecurityGroups.", this.SecurityGroups);

    }
}

