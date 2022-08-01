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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScriptOrigin extends AbstractModel{

    /**
    * 机器数量
    */
    @SerializedName("MachineNumber")
    @Expose
    private Long MachineNumber;

    /**
    * 机器规格
    */
    @SerializedName("MachineSpecification")
    @Expose
    private String MachineSpecification;

    /**
    * 压测时长
    */
    @SerializedName("DurationSeconds")
    @Expose
    private Long DurationSeconds;

    /**
     * Get 机器数量 
     * @return MachineNumber 机器数量
     */
    public Long getMachineNumber() {
        return this.MachineNumber;
    }

    /**
     * Set 机器数量
     * @param MachineNumber 机器数量
     */
    public void setMachineNumber(Long MachineNumber) {
        this.MachineNumber = MachineNumber;
    }

    /**
     * Get 机器规格 
     * @return MachineSpecification 机器规格
     */
    public String getMachineSpecification() {
        return this.MachineSpecification;
    }

    /**
     * Set 机器规格
     * @param MachineSpecification 机器规格
     */
    public void setMachineSpecification(String MachineSpecification) {
        this.MachineSpecification = MachineSpecification;
    }

    /**
     * Get 压测时长 
     * @return DurationSeconds 压测时长
     */
    public Long getDurationSeconds() {
        return this.DurationSeconds;
    }

    /**
     * Set 压测时长
     * @param DurationSeconds 压测时长
     */
    public void setDurationSeconds(Long DurationSeconds) {
        this.DurationSeconds = DurationSeconds;
    }

    public ScriptOrigin() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScriptOrigin(ScriptOrigin source) {
        if (source.MachineNumber != null) {
            this.MachineNumber = new Long(source.MachineNumber);
        }
        if (source.MachineSpecification != null) {
            this.MachineSpecification = new String(source.MachineSpecification);
        }
        if (source.DurationSeconds != null) {
            this.DurationSeconds = new Long(source.DurationSeconds);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MachineNumber", this.MachineNumber);
        this.setParamSimple(map, prefix + "MachineSpecification", this.MachineSpecification);
        this.setParamSimple(map, prefix + "DurationSeconds", this.DurationSeconds);

    }
}

