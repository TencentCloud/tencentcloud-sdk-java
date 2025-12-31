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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSwitchErrorRequest extends AbstractModel {

    /**
    * EDGE_FW : 互联网边界防火墙 , NDR: 流量分析，VPC_FW：VPC边界防火墙
    */
    @SerializedName("FwType")
    @Expose
    private String FwType;

    /**
     * Get EDGE_FW : 互联网边界防火墙 , NDR: 流量分析，VPC_FW：VPC边界防火墙 
     * @return FwType EDGE_FW : 互联网边界防火墙 , NDR: 流量分析，VPC_FW：VPC边界防火墙
     */
    public String getFwType() {
        return this.FwType;
    }

    /**
     * Set EDGE_FW : 互联网边界防火墙 , NDR: 流量分析，VPC_FW：VPC边界防火墙
     * @param FwType EDGE_FW : 互联网边界防火墙 , NDR: 流量分析，VPC_FW：VPC边界防火墙
     */
    public void setFwType(String FwType) {
        this.FwType = FwType;
    }

    public DescribeSwitchErrorRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSwitchErrorRequest(DescribeSwitchErrorRequest source) {
        if (source.FwType != null) {
            this.FwType = new String(source.FwType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FwType", this.FwType);

    }
}

