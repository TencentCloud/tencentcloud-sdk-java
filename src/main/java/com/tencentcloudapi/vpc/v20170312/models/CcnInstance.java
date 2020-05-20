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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CcnInstance extends AbstractModel{

    /**
    * 关联实例ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 关联实例ID所属大区，例如：ap-guangzhou。
    */
    @SerializedName("InstanceRegion")
    @Expose
    private String InstanceRegion;

    /**
    * 关联实例类型，可选值：
<li>`VPC`：私有网络</li>
<li>`DIRECTCONNECT`：专线网关</li>
<li>`BMVPC`：黑石私有网络</li>
<li>`VPNGW`：VPNGW类型</li>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
     * Get 关联实例ID。 
     * @return InstanceId 关联实例ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 关联实例ID。
     * @param InstanceId 关联实例ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 关联实例ID所属大区，例如：ap-guangzhou。 
     * @return InstanceRegion 关联实例ID所属大区，例如：ap-guangzhou。
     */
    public String getInstanceRegion() {
        return this.InstanceRegion;
    }

    /**
     * Set 关联实例ID所属大区，例如：ap-guangzhou。
     * @param InstanceRegion 关联实例ID所属大区，例如：ap-guangzhou。
     */
    public void setInstanceRegion(String InstanceRegion) {
        this.InstanceRegion = InstanceRegion;
    }

    /**
     * Get 关联实例类型，可选值：
<li>`VPC`：私有网络</li>
<li>`DIRECTCONNECT`：专线网关</li>
<li>`BMVPC`：黑石私有网络</li>
<li>`VPNGW`：VPNGW类型</li> 
     * @return InstanceType 关联实例类型，可选值：
<li>`VPC`：私有网络</li>
<li>`DIRECTCONNECT`：专线网关</li>
<li>`BMVPC`：黑石私有网络</li>
<li>`VPNGW`：VPNGW类型</li>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 关联实例类型，可选值：
<li>`VPC`：私有网络</li>
<li>`DIRECTCONNECT`：专线网关</li>
<li>`BMVPC`：黑石私有网络</li>
<li>`VPNGW`：VPNGW类型</li>
     * @param InstanceType 关联实例类型，可选值：
<li>`VPC`：私有网络</li>
<li>`DIRECTCONNECT`：专线网关</li>
<li>`BMVPC`：黑石私有网络</li>
<li>`VPNGW`：VPNGW类型</li>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceRegion", this.InstanceRegion);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);

    }
}

