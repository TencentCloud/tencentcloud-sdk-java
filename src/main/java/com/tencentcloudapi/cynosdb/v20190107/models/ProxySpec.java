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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProxySpec extends AbstractModel{

    /**
    * 数据库代理cpu核数
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 数据库代理内存
    */
    @SerializedName("Mem")
    @Expose
    private Long Mem;

    /**
     * Get 数据库代理cpu核数 
     * @return Cpu 数据库代理cpu核数
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set 数据库代理cpu核数
     * @param Cpu 数据库代理cpu核数
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 数据库代理内存 
     * @return Mem 数据库代理内存
     */
    public Long getMem() {
        return this.Mem;
    }

    /**
     * Set 数据库代理内存
     * @param Mem 数据库代理内存
     */
    public void setMem(Long Mem) {
        this.Mem = Mem;
    }

    public ProxySpec() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProxySpec(ProxySpec source) {
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Mem != null) {
            this.Mem = new Long(source.Mem);
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

