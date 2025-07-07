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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeShardSpecRequest extends AbstractModel {

    /**
    * Cpu类型，如：英特尔：Intel/AMD，海光：Hygon，默认Intel/AMD
    */
    @SerializedName("CpuType")
    @Expose
    private String CpuType;

    /**
     * Get Cpu类型，如：英特尔：Intel/AMD，海光：Hygon，默认Intel/AMD 
     * @return CpuType Cpu类型，如：英特尔：Intel/AMD，海光：Hygon，默认Intel/AMD
     */
    public String getCpuType() {
        return this.CpuType;
    }

    /**
     * Set Cpu类型，如：英特尔：Intel/AMD，海光：Hygon，默认Intel/AMD
     * @param CpuType Cpu类型，如：英特尔：Intel/AMD，海光：Hygon，默认Intel/AMD
     */
    public void setCpuType(String CpuType) {
        this.CpuType = CpuType;
    }

    public DescribeShardSpecRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeShardSpecRequest(DescribeShardSpecRequest source) {
        if (source.CpuType != null) {
            this.CpuType = new String(source.CpuType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CpuType", this.CpuType);

    }
}

