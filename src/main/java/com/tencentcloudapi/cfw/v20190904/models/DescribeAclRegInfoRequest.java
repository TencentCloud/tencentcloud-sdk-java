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

public class DescribeAclRegInfoRequest extends AbstractModel {

    /**
    * 防火墙类型 SERIAL：串行、NAT：NAT防火墙，BYPASS：旁路防火墙
    */
    @SerializedName("FwType")
    @Expose
    private String [] FwType;

    /**
     * Get 防火墙类型 SERIAL：串行、NAT：NAT防火墙，BYPASS：旁路防火墙 
     * @return FwType 防火墙类型 SERIAL：串行、NAT：NAT防火墙，BYPASS：旁路防火墙
     */
    public String [] getFwType() {
        return this.FwType;
    }

    /**
     * Set 防火墙类型 SERIAL：串行、NAT：NAT防火墙，BYPASS：旁路防火墙
     * @param FwType 防火墙类型 SERIAL：串行、NAT：NAT防火墙，BYPASS：旁路防火墙
     */
    public void setFwType(String [] FwType) {
        this.FwType = FwType;
    }

    public DescribeAclRegInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAclRegInfoRequest(DescribeAclRegInfoRequest source) {
        if (source.FwType != null) {
            this.FwType = new String[source.FwType.length];
            for (int i = 0; i < source.FwType.length; i++) {
                this.FwType[i] = new String(source.FwType[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "FwType.", this.FwType);

    }
}

