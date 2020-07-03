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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeviceMemInfo extends AbstractModel{

    /**
    * 总内存大小。free命令中Mem:一行total的值,单位：KB
    */
    @SerializedName("Total")
    @Expose
    private Long [] Total;

    /**
    * 已使用内存。free命令中Mem:一行used的值,单位：KB
    */
    @SerializedName("Used")
    @Expose
    private Long [] Used;

    /**
     * Get 总内存大小。free命令中Mem:一行total的值,单位：KB 
     * @return Total 总内存大小。free命令中Mem:一行total的值,单位：KB
     */
    public Long [] getTotal() {
        return this.Total;
    }

    /**
     * Set 总内存大小。free命令中Mem:一行total的值,单位：KB
     * @param Total 总内存大小。free命令中Mem:一行total的值,单位：KB
     */
    public void setTotal(Long [] Total) {
        this.Total = Total;
    }

    /**
     * Get 已使用内存。free命令中Mem:一行used的值,单位：KB 
     * @return Used 已使用内存。free命令中Mem:一行used的值,单位：KB
     */
    public Long [] getUsed() {
        return this.Used;
    }

    /**
     * Set 已使用内存。free命令中Mem:一行used的值,单位：KB
     * @param Used 已使用内存。free命令中Mem:一行used的值,单位：KB
     */
    public void setUsed(Long [] Used) {
        this.Used = Used;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Total.", this.Total);
        this.setParamArraySimple(map, prefix + "Used.", this.Used);

    }
}

