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
package com.tencentcloudapi.gs.v20191118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyWorkersRequest extends AbstractModel{

    /**
    * 批量机器ID，最多不超过100个
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 资源池编号，修改有效范围为[1,100]，在idle状态下才能修改成功
    */
    @SerializedName("SetNo")
    @Expose
    private Long SetNo;

    /**
     * Get 批量机器ID，最多不超过100个 
     * @return InstanceIds 批量机器ID，最多不超过100个
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 批量机器ID，最多不超过100个
     * @param InstanceIds 批量机器ID，最多不超过100个
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 资源池编号，修改有效范围为[1,100]，在idle状态下才能修改成功 
     * @return SetNo 资源池编号，修改有效范围为[1,100]，在idle状态下才能修改成功
     */
    public Long getSetNo() {
        return this.SetNo;
    }

    /**
     * Set 资源池编号，修改有效范围为[1,100]，在idle状态下才能修改成功
     * @param SetNo 资源池编号，修改有效范围为[1,100]，在idle状态下才能修改成功
     */
    public void setSetNo(Long SetNo) {
        this.SetNo = SetNo;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "SetNo", this.SetNo);

    }
}

