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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateContentIdentifierRequest extends AbstractModel {

    /**
    * 内容标识符的描述，长度限制不超过 20 个字符。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 待绑定的目标套餐 ID，仅限企业版可用。<li>当您账号下已存在套餐时，需要先前往 [套餐管理](https://console.cloud.tencent.com/edgeone/package) 获取套餐 ID，直接将内容标识符绑定至该套餐；</li><li>若您当前没有可绑定的套餐时，请先购买企业版套餐。</li>
    */
    @SerializedName("PlanId")
    @Expose
    private String PlanId;

    /**
    * 标签。该参数用于对内容标识符进行分权限管控。您需要先前往 [标签控制台](https://console.cloud.tencent.com/tag/taglist) 创建标签才可以在此处传入对应的标签键和标签值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get 内容标识符的描述，长度限制不超过 20 个字符。 
     * @return Description 内容标识符的描述，长度限制不超过 20 个字符。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 内容标识符的描述，长度限制不超过 20 个字符。
     * @param Description 内容标识符的描述，长度限制不超过 20 个字符。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 待绑定的目标套餐 ID，仅限企业版可用。<li>当您账号下已存在套餐时，需要先前往 [套餐管理](https://console.cloud.tencent.com/edgeone/package) 获取套餐 ID，直接将内容标识符绑定至该套餐；</li><li>若您当前没有可绑定的套餐时，请先购买企业版套餐。</li> 
     * @return PlanId 待绑定的目标套餐 ID，仅限企业版可用。<li>当您账号下已存在套餐时，需要先前往 [套餐管理](https://console.cloud.tencent.com/edgeone/package) 获取套餐 ID，直接将内容标识符绑定至该套餐；</li><li>若您当前没有可绑定的套餐时，请先购买企业版套餐。</li>
     */
    public String getPlanId() {
        return this.PlanId;
    }

    /**
     * Set 待绑定的目标套餐 ID，仅限企业版可用。<li>当您账号下已存在套餐时，需要先前往 [套餐管理](https://console.cloud.tencent.com/edgeone/package) 获取套餐 ID，直接将内容标识符绑定至该套餐；</li><li>若您当前没有可绑定的套餐时，请先购买企业版套餐。</li>
     * @param PlanId 待绑定的目标套餐 ID，仅限企业版可用。<li>当您账号下已存在套餐时，需要先前往 [套餐管理](https://console.cloud.tencent.com/edgeone/package) 获取套餐 ID，直接将内容标识符绑定至该套餐；</li><li>若您当前没有可绑定的套餐时，请先购买企业版套餐。</li>
     */
    public void setPlanId(String PlanId) {
        this.PlanId = PlanId;
    }

    /**
     * Get 标签。该参数用于对内容标识符进行分权限管控。您需要先前往 [标签控制台](https://console.cloud.tencent.com/tag/taglist) 创建标签才可以在此处传入对应的标签键和标签值。 
     * @return Tags 标签。该参数用于对内容标识符进行分权限管控。您需要先前往 [标签控制台](https://console.cloud.tencent.com/tag/taglist) 创建标签才可以在此处传入对应的标签键和标签值。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签。该参数用于对内容标识符进行分权限管控。您需要先前往 [标签控制台](https://console.cloud.tencent.com/tag/taglist) 创建标签才可以在此处传入对应的标签键和标签值。
     * @param Tags 标签。该参数用于对内容标识符进行分权限管控。您需要先前往 [标签控制台](https://console.cloud.tencent.com/tag/taglist) 创建标签才可以在此处传入对应的标签键和标签值。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public CreateContentIdentifierRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateContentIdentifierRequest(CreateContentIdentifierRequest source) {
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.PlanId != null) {
            this.PlanId = new String(source.PlanId);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "PlanId", this.PlanId);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

