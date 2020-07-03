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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProductConfigRequest extends AbstractModel{

    /**
    * 可用区英文ID，形如ap-guangzhou-1
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
     * Get 可用区英文ID，形如ap-guangzhou-1 
     * @return Zone 可用区英文ID，形如ap-guangzhou-1
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区英文ID，形如ap-guangzhou-1
     * @param Zone 可用区英文ID，形如ap-guangzhou-1
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);

    }
}

