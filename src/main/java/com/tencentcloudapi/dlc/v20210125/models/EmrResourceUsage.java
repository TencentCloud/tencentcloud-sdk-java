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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EmrResourceUsage extends AbstractModel {

    /**
    * <p>CPU 用量，例如 2core</p>
    */
    @SerializedName("Cpu")
    @Expose
    private String Cpu;

    /**
    * <p>内存用量，例如 4GB</p>
    */
    @SerializedName("Mem")
    @Expose
    private String Mem;

    /**
     * Get <p>CPU 用量，例如 2core</p> 
     * @return Cpu <p>CPU 用量，例如 2core</p>
     */
    public String getCpu() {
        return this.Cpu;
    }

    /**
     * Set <p>CPU 用量，例如 2core</p>
     * @param Cpu <p>CPU 用量，例如 2core</p>
     */
    public void setCpu(String Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get <p>内存用量，例如 4GB</p> 
     * @return Mem <p>内存用量，例如 4GB</p>
     */
    public String getMem() {
        return this.Mem;
    }

    /**
     * Set <p>内存用量，例如 4GB</p>
     * @param Mem <p>内存用量，例如 4GB</p>
     */
    public void setMem(String Mem) {
        this.Mem = Mem;
    }

    public EmrResourceUsage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EmrResourceUsage(EmrResourceUsage source) {
        if (source.Cpu != null) {
            this.Cpu = new String(source.Cpu);
        }
        if (source.Mem != null) {
            this.Mem = new String(source.Mem);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Mem", this.Mem);

    }
}

