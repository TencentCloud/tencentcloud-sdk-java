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

public class ModifyAlarmReceiversRequest extends AbstractModel{

    /**
    * 需要修改接收人的策略组Id
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * 必填。固定为“monitor”
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 新接收人信息, 没有填写则删除所有接收人
    */
    @SerializedName("ReceiverInfos")
    @Expose
    private ReceiverInfo [] ReceiverInfos;

    /**
     * Get 需要修改接收人的策略组Id 
     * @return GroupId 需要修改接收人的策略组Id
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 需要修改接收人的策略组Id
     * @param GroupId 需要修改接收人的策略组Id
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 必填。固定为“monitor” 
     * @return Module 必填。固定为“monitor”
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set 必填。固定为“monitor”
     * @param Module 必填。固定为“monitor”
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get 新接收人信息, 没有填写则删除所有接收人 
     * @return ReceiverInfos 新接收人信息, 没有填写则删除所有接收人
     */
    public ReceiverInfo [] getReceiverInfos() {
        return this.ReceiverInfos;
    }

    /**
     * Set 新接收人信息, 没有填写则删除所有接收人
     * @param ReceiverInfos 新接收人信息, 没有填写则删除所有接收人
     */
    public void setReceiverInfos(ReceiverInfo [] ReceiverInfos) {
        this.ReceiverInfos = ReceiverInfos;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamArrayObj(map, prefix + "ReceiverInfos.", this.ReceiverInfos);

    }
}

