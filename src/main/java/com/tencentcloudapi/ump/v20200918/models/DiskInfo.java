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
package com.tencentcloudapi.ump.v20200918.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DiskInfo extends AbstractModel{

    /**
    * 硬盘名字
    */
    @SerializedName("DiskName")
    @Expose
    private String DiskName;

    /**
    * 硬盘使用率
    */
    @SerializedName("Usage")
    @Expose
    private Float Usage;

    /**
     * Get 硬盘名字 
     * @return DiskName 硬盘名字
     */
    public String getDiskName() {
        return this.DiskName;
    }

    /**
     * Set 硬盘名字
     * @param DiskName 硬盘名字
     */
    public void setDiskName(String DiskName) {
        this.DiskName = DiskName;
    }

    /**
     * Get 硬盘使用率 
     * @return Usage 硬盘使用率
     */
    public Float getUsage() {
        return this.Usage;
    }

    /**
     * Set 硬盘使用率
     * @param Usage 硬盘使用率
     */
    public void setUsage(Float Usage) {
        this.Usage = Usage;
    }

    public DiskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DiskInfo(DiskInfo source) {
        if (source.DiskName != null) {
            this.DiskName = new String(source.DiskName);
        }
        if (source.Usage != null) {
            this.Usage = new Float(source.Usage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiskName", this.DiskName);
        this.setParamSimple(map, prefix + "Usage", this.Usage);

    }
}

