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
package com.tencentcloudapi.bdrc.v20260330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDrillPairsDeniedActionsRequest extends AbstractModel {

    /**
    * 要查询演练对的类型，枚举值：DISK（云硬盘）、INSTANCE（云服务器）、CFS（文件存储）
    */
    @SerializedName("DrillPairType")
    @Expose
    private String DrillPairType;

    /**
    * 演练对ID列表
    */
    @SerializedName("DrillPairIds")
    @Expose
    private String [] DrillPairIds;

    /**
     * Get 要查询演练对的类型，枚举值：DISK（云硬盘）、INSTANCE（云服务器）、CFS（文件存储） 
     * @return DrillPairType 要查询演练对的类型，枚举值：DISK（云硬盘）、INSTANCE（云服务器）、CFS（文件存储）
     */
    public String getDrillPairType() {
        return this.DrillPairType;
    }

    /**
     * Set 要查询演练对的类型，枚举值：DISK（云硬盘）、INSTANCE（云服务器）、CFS（文件存储）
     * @param DrillPairType 要查询演练对的类型，枚举值：DISK（云硬盘）、INSTANCE（云服务器）、CFS（文件存储）
     */
    public void setDrillPairType(String DrillPairType) {
        this.DrillPairType = DrillPairType;
    }

    /**
     * Get 演练对ID列表 
     * @return DrillPairIds 演练对ID列表
     */
    public String [] getDrillPairIds() {
        return this.DrillPairIds;
    }

    /**
     * Set 演练对ID列表
     * @param DrillPairIds 演练对ID列表
     */
    public void setDrillPairIds(String [] DrillPairIds) {
        this.DrillPairIds = DrillPairIds;
    }

    public DescribeDrillPairsDeniedActionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDrillPairsDeniedActionsRequest(DescribeDrillPairsDeniedActionsRequest source) {
        if (source.DrillPairType != null) {
            this.DrillPairType = new String(source.DrillPairType);
        }
        if (source.DrillPairIds != null) {
            this.DrillPairIds = new String[source.DrillPairIds.length];
            for (int i = 0; i < source.DrillPairIds.length; i++) {
                this.DrillPairIds[i] = new String(source.DrillPairIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DrillPairType", this.DrillPairType);
        this.setParamArraySimple(map, prefix + "DrillPairIds.", this.DrillPairIds);

    }
}

