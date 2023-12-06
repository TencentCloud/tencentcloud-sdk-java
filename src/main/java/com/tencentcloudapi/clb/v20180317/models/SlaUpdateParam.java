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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SlaUpdateParam extends AbstractModel {

    /**
    * lb的字符串ID
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * 性能容量型规格，取值范围：
<li> clb.c2.medium：标准型规格 </li>
<li> clb.c3.small：高阶型1规格 </li>
<li> clb.c3.medium：高阶型2规格 </li>
<li> clb.c4.small：超强型1规格 </li>
<li> clb.c4.medium：超强型2规格 </li>
<li> clb.c4.large：超强型3规格 </li>
<li> clb.c4.xlarge：超强型4规格 </li>如需了解规格详情，请参见[实例规格对比](https://cloud.tencent.com/document/product/214/84689)
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
     * Get 性能容量型规格，取值范围：
<li> clb.c2.medium：标准型规格 </li>
<li> clb.c3.small：高阶型1规格 </li>
<li> clb.c3.medium：高阶型2规格 </li>
<li> clb.c4.small：超强型1规格 </li>
<li> clb.c4.medium：超强型2规格 </li>
<li> clb.c4.large：超强型3规格 </li>
<li> clb.c4.xlarge：超强型4规格 </li>如需了解规格详情，请参见[实例规格对比](https://cloud.tencent.com/document/product/214/84689) 
     * @return SlaType 性能容量型规格，取值范围：
<li> clb.c2.medium：标准型规格 </li>
<li> clb.c3.small：高阶型1规格 </li>
<li> clb.c3.medium：高阶型2规格 </li>
<li> clb.c4.small：超强型1规格 </li>
<li> clb.c4.medium：超强型2规格 </li>
<li> clb.c4.large：超强型3规格 </li>
<li> clb.c4.xlarge：超强型4规格 </li>如需了解规格详情，请参见[实例规格对比](https://cloud.tencent.com/document/product/214/84689)
     */
    public String getSlaType() {
        return this.SlaType;
    }

    /**
     * Set 性能容量型规格，取值范围：
<li> clb.c2.medium：标准型规格 </li>
<li> clb.c3.small：高阶型1规格 </li>
<li> clb.c3.medium：高阶型2规格 </li>
<li> clb.c4.small：超强型1规格 </li>
<li> clb.c4.medium：超强型2规格 </li>
<li> clb.c4.large：超强型3规格 </li>
<li> clb.c4.xlarge：超强型4规格 </li>如需了解规格详情，请参见[实例规格对比](https://cloud.tencent.com/document/product/214/84689)
     * @param SlaType 性能容量型规格，取值范围：
<li> clb.c2.medium：标准型规格 </li>
<li> clb.c3.small：高阶型1规格 </li>
<li> clb.c3.medium：高阶型2规格 </li>
<li> clb.c4.small：超强型1规格 </li>
<li> clb.c4.medium：超强型2规格 </li>
<li> clb.c4.large：超强型3规格 </li>
<li> clb.c4.xlarge：超强型4规格 </li>如需了解规格详情，请参见[实例规格对比](https://cloud.tencent.com/document/product/214/84689)
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

