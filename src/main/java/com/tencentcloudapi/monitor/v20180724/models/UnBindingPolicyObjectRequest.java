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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UnBindingPolicyObjectRequest extends AbstractModel{

    /**
    * 固定值，为"monitor"
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 策略组id，如传入 PolicyId 则该字段被忽略可传入任意值如 0
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * 待删除对象实例的唯一id列表，UniqueId从调用[获取已绑定对象列表接口](https://cloud.tencent.com/document/api/248/40570)的出参的List中得到
    */
    @SerializedName("UniqueId")
    @Expose
    private String [] UniqueId;

    /**
    * 实例分组id，如果按实例分组删除的话UniqueId参数是无效的
    */
    @SerializedName("InstanceGroupId")
    @Expose
    private Long InstanceGroupId;

    /**
    * 告警策略ID，使用此字段时 GroupId 会被忽略
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

    /**
     * Get 固定值，为"monitor" 
     * @return Module 固定值，为"monitor"
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set 固定值，为"monitor"
     * @param Module 固定值，为"monitor"
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get 策略组id，如传入 PolicyId 则该字段被忽略可传入任意值如 0 
     * @return GroupId 策略组id，如传入 PolicyId 则该字段被忽略可传入任意值如 0
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 策略组id，如传入 PolicyId 则该字段被忽略可传入任意值如 0
     * @param GroupId 策略组id，如传入 PolicyId 则该字段被忽略可传入任意值如 0
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 待删除对象实例的唯一id列表，UniqueId从调用[获取已绑定对象列表接口](https://cloud.tencent.com/document/api/248/40570)的出参的List中得到 
     * @return UniqueId 待删除对象实例的唯一id列表，UniqueId从调用[获取已绑定对象列表接口](https://cloud.tencent.com/document/api/248/40570)的出参的List中得到
     */
    public String [] getUniqueId() {
        return this.UniqueId;
    }

    /**
     * Set 待删除对象实例的唯一id列表，UniqueId从调用[获取已绑定对象列表接口](https://cloud.tencent.com/document/api/248/40570)的出参的List中得到
     * @param UniqueId 待删除对象实例的唯一id列表，UniqueId从调用[获取已绑定对象列表接口](https://cloud.tencent.com/document/api/248/40570)的出参的List中得到
     */
    public void setUniqueId(String [] UniqueId) {
        this.UniqueId = UniqueId;
    }

    /**
     * Get 实例分组id，如果按实例分组删除的话UniqueId参数是无效的 
     * @return InstanceGroupId 实例分组id，如果按实例分组删除的话UniqueId参数是无效的
     */
    public Long getInstanceGroupId() {
        return this.InstanceGroupId;
    }

    /**
     * Set 实例分组id，如果按实例分组删除的话UniqueId参数是无效的
     * @param InstanceGroupId 实例分组id，如果按实例分组删除的话UniqueId参数是无效的
     */
    public void setInstanceGroupId(Long InstanceGroupId) {
        this.InstanceGroupId = InstanceGroupId;
    }

    /**
     * Get 告警策略ID，使用此字段时 GroupId 会被忽略 
     * @return PolicyId 告警策略ID，使用此字段时 GroupId 会被忽略
     */
    public String getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set 告警策略ID，使用此字段时 GroupId 会被忽略
     * @param PolicyId 告警策略ID，使用此字段时 GroupId 会被忽略
     */
    public void setPolicyId(String PolicyId) {
        this.PolicyId = PolicyId;
    }

    public UnBindingPolicyObjectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UnBindingPolicyObjectRequest(UnBindingPolicyObjectRequest source) {
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.UniqueId != null) {
            this.UniqueId = new String[source.UniqueId.length];
            for (int i = 0; i < source.UniqueId.length; i++) {
                this.UniqueId[i] = new String(source.UniqueId[i]);
            }
        }
        if (source.InstanceGroupId != null) {
            this.InstanceGroupId = new Long(source.InstanceGroupId);
        }
        if (source.PolicyId != null) {
            this.PolicyId = new String(source.PolicyId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamArraySimple(map, prefix + "UniqueId.", this.UniqueId);
        this.setParamSimple(map, prefix + "InstanceGroupId", this.InstanceGroupId);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);

    }
}

