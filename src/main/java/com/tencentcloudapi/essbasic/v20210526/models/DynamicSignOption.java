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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DynamicSignOption extends AbstractModel {

    /**
    * 多份合同批量签署时，动态签署领取要求：<ul><li><b>0（默认值）</b>: 可以领取部分合同进入签署。</li><li><b>1 </b>: 必须全部领取进入签署，生成链接的所有合同必须相同经办人完成合同的领取签署。</li></ul>
    */
    @SerializedName("DynamicReceiveType")
    @Expose
    private Long DynamicReceiveType;

    /**
    * 动态签署方时，预设的企业OpenId，预设企业OpenId后，只允许对应的企业员工进行领取签署。
    */
    @SerializedName("OrganizationOpenId")
    @Expose
    private String OrganizationOpenId;

    /**
     * Get 多份合同批量签署时，动态签署领取要求：<ul><li><b>0（默认值）</b>: 可以领取部分合同进入签署。</li><li><b>1 </b>: 必须全部领取进入签署，生成链接的所有合同必须相同经办人完成合同的领取签署。</li></ul> 
     * @return DynamicReceiveType 多份合同批量签署时，动态签署领取要求：<ul><li><b>0（默认值）</b>: 可以领取部分合同进入签署。</li><li><b>1 </b>: 必须全部领取进入签署，生成链接的所有合同必须相同经办人完成合同的领取签署。</li></ul>
     */
    public Long getDynamicReceiveType() {
        return this.DynamicReceiveType;
    }

    /**
     * Set 多份合同批量签署时，动态签署领取要求：<ul><li><b>0（默认值）</b>: 可以领取部分合同进入签署。</li><li><b>1 </b>: 必须全部领取进入签署，生成链接的所有合同必须相同经办人完成合同的领取签署。</li></ul>
     * @param DynamicReceiveType 多份合同批量签署时，动态签署领取要求：<ul><li><b>0（默认值）</b>: 可以领取部分合同进入签署。</li><li><b>1 </b>: 必须全部领取进入签署，生成链接的所有合同必须相同经办人完成合同的领取签署。</li></ul>
     */
    public void setDynamicReceiveType(Long DynamicReceiveType) {
        this.DynamicReceiveType = DynamicReceiveType;
    }

    /**
     * Get 动态签署方时，预设的企业OpenId，预设企业OpenId后，只允许对应的企业员工进行领取签署。 
     * @return OrganizationOpenId 动态签署方时，预设的企业OpenId，预设企业OpenId后，只允许对应的企业员工进行领取签署。
     */
    public String getOrganizationOpenId() {
        return this.OrganizationOpenId;
    }

    /**
     * Set 动态签署方时，预设的企业OpenId，预设企业OpenId后，只允许对应的企业员工进行领取签署。
     * @param OrganizationOpenId 动态签署方时，预设的企业OpenId，预设企业OpenId后，只允许对应的企业员工进行领取签署。
     */
    public void setOrganizationOpenId(String OrganizationOpenId) {
        this.OrganizationOpenId = OrganizationOpenId;
    }

    public DynamicSignOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DynamicSignOption(DynamicSignOption source) {
        if (source.DynamicReceiveType != null) {
            this.DynamicReceiveType = new Long(source.DynamicReceiveType);
        }
        if (source.OrganizationOpenId != null) {
            this.OrganizationOpenId = new String(source.OrganizationOpenId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DynamicReceiveType", this.DynamicReceiveType);
        this.setParamSimple(map, prefix + "OrganizationOpenId", this.OrganizationOpenId);

    }
}

