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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateChannelOrganizationInfoChangeUrlRequest extends AbstractModel {

    /**
    * 关于渠道应用的相关信息，包括子客企业及应用编、号等详细内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 企业信息变更类型，可选类型如下：
<ul><li>**1**：企业超管变更</li><li>**2**：企业基础信息变更</li></ul>
    */
    @SerializedName("ChangeType")
    @Expose
    private Long ChangeType;

    /**
     * Get 关于渠道应用的相关信息，包括子客企业及应用编、号等详细内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。 
     * @return Agent 关于渠道应用的相关信息，包括子客企业及应用编、号等详细内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 关于渠道应用的相关信息，包括子客企业及应用编、号等详细内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。
     * @param Agent 关于渠道应用的相关信息，包括子客企业及应用编、号等详细内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get 企业信息变更类型，可选类型如下：
<ul><li>**1**：企业超管变更</li><li>**2**：企业基础信息变更</li></ul> 
     * @return ChangeType 企业信息变更类型，可选类型如下：
<ul><li>**1**：企业超管变更</li><li>**2**：企业基础信息变更</li></ul>
     */
    public Long getChangeType() {
        return this.ChangeType;
    }

    /**
     * Set 企业信息变更类型，可选类型如下：
<ul><li>**1**：企业超管变更</li><li>**2**：企业基础信息变更</li></ul>
     * @param ChangeType 企业信息变更类型，可选类型如下：
<ul><li>**1**：企业超管变更</li><li>**2**：企业基础信息变更</li></ul>
     */
    public void setChangeType(Long ChangeType) {
        this.ChangeType = ChangeType;
    }

    public CreateChannelOrganizationInfoChangeUrlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateChannelOrganizationInfoChangeUrlRequest(CreateChannelOrganizationInfoChangeUrlRequest source) {
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.ChangeType != null) {
            this.ChangeType = new Long(source.ChangeType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamSimple(map, prefix + "ChangeType", this.ChangeType);

    }
}

