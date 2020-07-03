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
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProcessStatistics extends AbstractModel{

    /**
    * 进程名。
    */
    @SerializedName("ProcessName")
    @Expose
    private String ProcessName;

    /**
    * 主机数量。
    */
    @SerializedName("MachineNum")
    @Expose
    private Long MachineNum;

    /**
     * Get 进程名。 
     * @return ProcessName 进程名。
     */
    public String getProcessName() {
        return this.ProcessName;
    }

    /**
     * Set 进程名。
     * @param ProcessName 进程名。
     */
    public void setProcessName(String ProcessName) {
        this.ProcessName = ProcessName;
    }

    /**
     * Get 主机数量。 
     * @return MachineNum 主机数量。
     */
    public Long getMachineNum() {
        return this.MachineNum;
    }

    /**
     * Set 主机数量。
     * @param MachineNum 主机数量。
     */
    public void setMachineNum(Long MachineNum) {
        this.MachineNum = MachineNum;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProcessName", this.ProcessName);
        this.setParamSimple(map, prefix + "MachineNum", this.MachineNum);

    }
}

