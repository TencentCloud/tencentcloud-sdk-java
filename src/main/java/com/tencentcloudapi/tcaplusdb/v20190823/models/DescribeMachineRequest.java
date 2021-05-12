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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMachineRequest extends AbstractModel{

    /**
    * 不为0，表示查询支持ipv6的机器
    */
    @SerializedName("Ipv6Enable")
    @Expose
    private Long Ipv6Enable;

    /**
     * Get 不为0，表示查询支持ipv6的机器 
     * @return Ipv6Enable 不为0，表示查询支持ipv6的机器
     */
    public Long getIpv6Enable() {
        return this.Ipv6Enable;
    }

    /**
     * Set 不为0，表示查询支持ipv6的机器
     * @param Ipv6Enable 不为0，表示查询支持ipv6的机器
     */
    public void setIpv6Enable(Long Ipv6Enable) {
        this.Ipv6Enable = Ipv6Enable;
    }

    public DescribeMachineRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMachineRequest(DescribeMachineRequest source) {
        if (source.Ipv6Enable != null) {
            this.Ipv6Enable = new Long(source.Ipv6Enable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ipv6Enable", this.Ipv6Enable);

    }
}

