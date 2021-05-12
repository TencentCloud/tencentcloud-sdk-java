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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MachineInfo extends AbstractModel{

    /**
    * 机器类型
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
    * 机器数量
    */
    @SerializedName("MachineNum")
    @Expose
    private Long MachineNum;

    /**
     * Get 机器类型 
     * @return MachineType 机器类型
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set 机器类型
     * @param MachineType 机器类型
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
    }

    /**
     * Get 机器数量 
     * @return MachineNum 机器数量
     */
    public Long getMachineNum() {
        return this.MachineNum;
    }

    /**
     * Set 机器数量
     * @param MachineNum 机器数量
     */
    public void setMachineNum(Long MachineNum) {
        this.MachineNum = MachineNum;
    }

    public MachineInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MachineInfo(MachineInfo source) {
        if (source.MachineType != null) {
            this.MachineType = new String(source.MachineType);
        }
        if (source.MachineNum != null) {
            this.MachineNum = new Long(source.MachineNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MachineType", this.MachineType);
        this.setParamSimple(map, prefix + "MachineNum", this.MachineNum);

    }
}

