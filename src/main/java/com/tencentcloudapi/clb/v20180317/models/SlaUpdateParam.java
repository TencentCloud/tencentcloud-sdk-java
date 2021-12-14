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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SlaUpdateParam extends AbstractModel{

    /**
    * lb的字符串ID
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * 变更为性能容量型，固定为SLA
    */
    @SerializedName("SlaType")
    @Expose
    private String SlaType;

    /**
     * Get lb的字符串ID 
     * @return LoadBalancerId lb的字符串ID
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set lb的字符串ID
     * @param LoadBalancerId lb的字符串ID
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get 变更为性能容量型，固定为SLA 
     * @return SlaType 变更为性能容量型，固定为SLA
     */
    public String getSlaType() {
        return this.SlaType;
    }

    /**
     * Set 变更为性能容量型，固定为SLA
     * @param SlaType 变更为性能容量型，固定为SLA
     */
    public void setSlaType(String SlaType) {
        this.SlaType = SlaType;
    }

    public SlaUpdateParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SlaUpdateParam(SlaUpdateParam source) {
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.SlaType != null) {
            this.SlaType = new String(source.SlaType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "SlaType", this.SlaType);

    }
}

