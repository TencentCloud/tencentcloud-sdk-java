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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateZoneRequest extends AbstractModel{

    /**
    * 站点接入类型。该参数取值如下，不填写时默认为 partial：
<li>partial：CNAME 接入；</li>
<li> full：NS 接入；</li>
<li>noDomainAccess：无域名接入。</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 站点名称。CNAME/NS 接入的时，请传入二级域名（example.com）作为站点名称；无域名接入时，该值请保留为空。
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * Type 取值为 partial/full 时，七层域名的加速区域。以下为该参数取值，不填写时该值默认为 overseas。Type 取值为 noDomainAccess 时该值请保留为空：
<li> global: 全球可用区；</li>
<li> mainland: 中国大陆可用区；</li>
<li> overseas: 全球可用区（不含中国大陆）。</li>
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * 待绑定的目标套餐 ID。当您账号下已存在套餐时，可以填写此参数，直接将站点绑定至该套餐。若您当前没有可绑定的套餐时，请前往控制台购买套餐完成站点创建。
    */
    @SerializedName("PlanId")
    @Expose
    private String PlanId;

    /**
    * 同名站点标识。限制输入数字、英文、- 和 _ 组合，长度 20 个字符以内。详情参考 [同名站点标识]()，无此使用场景时，该字段保留为空即可。
    */
    @SerializedName("AliasZoneName")
    @Expose
    private String AliasZoneName;

    /**
    * 标签。该参数用于对站点进行分权限管控、分账。需要先前往 [标签控制台](https://console.cloud.tencent.com/tag/taglist) 创建对应的标签才可以在此处传入对应的标签键和标签值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 是否允许重复接入。
<li> true：允许重复接入；</li>
<li> false：不允许重复接入。</li>不填写使用默认值false。
    */
    @SerializedName("AllowDuplicates")
    @Expose
    private Boolean AllowDuplicates;

    /**
    * 是否跳过站点现有的DNS记录扫描。默认值：false。
    */
    @SerializedName("JumpStart")
    @Expose
    private Boolean JumpStart;

    /**
     * Get 站点接入类型。该参数取值如下，不填写时默认为 partial：
<li>partial：CNAME 接入；</li>
<li> full：NS 接入；</li>
<li>noDomainAccess：无域名接入。</li> 
     * @return Type 站点接入类型。该参数取值如下，不填写时默认为 partial：
<li>partial：CNAME 接入；</li>
<li> full：NS 接入；</li>
<li>noDomainAccess：无域名接入。</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 站点接入类型。该参数取值如下，不填写时默认为 partial：
<li>partial：CNAME 接入；</li>
<li> full：NS 接入；</li>
<li>noDomainAccess：无域名接入。</li>
     * @param Type 站点接入类型。该参数取值如下，不填写时默认为 partial：
<li>partial：CNAME 接入；</li>
<li> full：NS 接入；</li>
<li>noDomainAccess：无域名接入。</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 站点名称。CNAME/NS 接入的时，请传入二级域名（example.com）作为站点名称；无域名接入时，该值请保留为空。 
     * @return ZoneName 站点名称。CNAME/NS 接入的时，请传入二级域名（example.com）作为站点名称；无域名接入时，该值请保留为空。
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set 站点名称。CNAME/NS 接入的时，请传入二级域名（example.com）作为站点名称；无域名接入时，该值请保留为空。
     * @param ZoneName 站点名称。CNAME/NS 接入的时，请传入二级域名（example.com）作为站点名称；无域名接入时，该值请保留为空。
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get Type 取值为 partial/full 时，七层域名的加速区域。以下为该参数取值，不填写时该值默认为 overseas。Type 取值为 noDomainAccess 时该值请保留为空：
<li> global: 全球可用区；</li>
<li> mainland: 中国大陆可用区；</li>
<li> overseas: 全球可用区（不含中国大陆）。</li> 
     * @return Area Type 取值为 partial/full 时，七层域名的加速区域。以下为该参数取值，不填写时该值默认为 overseas。Type 取值为 noDomainAccess 时该值请保留为空：
<li> global: 全球可用区；</li>
<li> mainland: 中国大陆可用区；</li>
<li> overseas: 全球可用区（不含中国大陆）。</li>
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Type 取值为 partial/full 时，七层域名的加速区域。以下为该参数取值，不填写时该值默认为 overseas。Type 取值为 noDomainAccess 时该值请保留为空：
<li> global: 全球可用区；</li>
<li> mainland: 中国大陆可用区；</li>
<li> overseas: 全球可用区（不含中国大陆）。</li>
     * @param Area Type 取值为 partial/full 时，七层域名的加速区域。以下为该参数取值，不填写时该值默认为 overseas。Type 取值为 noDomainAccess 时该值请保留为空：
<li> global: 全球可用区；</li>
<li> mainland: 中国大陆可用区；</li>
<li> overseas: 全球可用区（不含中国大陆）。</li>
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get 待绑定的目标套餐 ID。当您账号下已存在套餐时，可以填写此参数，直接将站点绑定至该套餐。若您当前没有可绑定的套餐时，请前往控制台购买套餐完成站点创建。 
     * @return PlanId 待绑定的目标套餐 ID。当您账号下已存在套餐时，可以填写此参数，直接将站点绑定至该套餐。若您当前没有可绑定的套餐时，请前往控制台购买套餐完成站点创建。
     */
    public String getPlanId() {
        return this.PlanId;
    }

    /**
     * Set 待绑定的目标套餐 ID。当您账号下已存在套餐时，可以填写此参数，直接将站点绑定至该套餐。若您当前没有可绑定的套餐时，请前往控制台购买套餐完成站点创建。
     * @param PlanId 待绑定的目标套餐 ID。当您账号下已存在套餐时，可以填写此参数，直接将站点绑定至该套餐。若您当前没有可绑定的套餐时，请前往控制台购买套餐完成站点创建。
     */
    public void setPlanId(String PlanId) {
        this.PlanId = PlanId;
    }

    /**
     * Get 同名站点标识。限制输入数字、英文、- 和 _ 组合，长度 20 个字符以内。详情参考 [同名站点标识]()，无此使用场景时，该字段保留为空即可。 
     * @return AliasZoneName 同名站点标识。限制输入数字、英文、- 和 _ 组合，长度 20 个字符以内。详情参考 [同名站点标识]()，无此使用场景时，该字段保留为空即可。
     */
    public String getAliasZoneName() {
        return this.AliasZoneName;
    }

    /**
     * Set 同名站点标识。限制输入数字、英文、- 和 _ 组合，长度 20 个字符以内。详情参考 [同名站点标识]()，无此使用场景时，该字段保留为空即可。
     * @param AliasZoneName 同名站点标识。限制输入数字、英文、- 和 _ 组合，长度 20 个字符以内。详情参考 [同名站点标识]()，无此使用场景时，该字段保留为空即可。
     */
    public void setAliasZoneName(String AliasZoneName) {
        this.AliasZoneName = AliasZoneName;
    }

    /**
     * Get 标签。该参数用于对站点进行分权限管控、分账。需要先前往 [标签控制台](https://console.cloud.tencent.com/tag/taglist) 创建对应的标签才可以在此处传入对应的标签键和标签值。 
     * @return Tags 标签。该参数用于对站点进行分权限管控、分账。需要先前往 [标签控制台](https://console.cloud.tencent.com/tag/taglist) 创建对应的标签才可以在此处传入对应的标签键和标签值。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签。该参数用于对站点进行分权限管控、分账。需要先前往 [标签控制台](https://console.cloud.tencent.com/tag/taglist) 创建对应的标签才可以在此处传入对应的标签键和标签值。
     * @param Tags 标签。该参数用于对站点进行分权限管控、分账。需要先前往 [标签控制台](https://console.cloud.tencent.com/tag/taglist) 创建对应的标签才可以在此处传入对应的标签键和标签值。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 是否允许重复接入。
<li> true：允许重复接入；</li>
<li> false：不允许重复接入。</li>不填写使用默认值false。 
     * @return AllowDuplicates 是否允许重复接入。
<li> true：允许重复接入；</li>
<li> false：不允许重复接入。</li>不填写使用默认值false。
     * @deprecated
     */
    @Deprecated
    public Boolean getAllowDuplicates() {
        return this.AllowDuplicates;
    }

    /**
     * Set 是否允许重复接入。
<li> true：允许重复接入；</li>
<li> false：不允许重复接入。</li>不填写使用默认值false。
     * @param AllowDuplicates 是否允许重复接入。
<li> true：允许重复接入；</li>
<li> false：不允许重复接入。</li>不填写使用默认值false。
     * @deprecated
     */
    @Deprecated
    public void setAllowDuplicates(Boolean AllowDuplicates) {
        this.AllowDuplicates = AllowDuplicates;
    }

    /**
     * Get 是否跳过站点现有的DNS记录扫描。默认值：false。 
     * @return JumpStart 是否跳过站点现有的DNS记录扫描。默认值：false。
     * @deprecated
     */
    @Deprecated
    public Boolean getJumpStart() {
        return this.JumpStart;
    }

    /**
     * Set 是否跳过站点现有的DNS记录扫描。默认值：false。
     * @param JumpStart 是否跳过站点现有的DNS记录扫描。默认值：false。
     * @deprecated
     */
    @Deprecated
    public void setJumpStart(Boolean JumpStart) {
        this.JumpStart = JumpStart;
    }

    public CreateZoneRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateZoneRequest(CreateZoneRequest source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.PlanId != null) {
            this.PlanId = new String(source.PlanId);
        }
        if (source.AliasZoneName != null) {
            this.AliasZoneName = new String(source.AliasZoneName);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.AllowDuplicates != null) {
            this.AllowDuplicates = new Boolean(source.AllowDuplicates);
        }
        if (source.JumpStart != null) {
            this.JumpStart = new Boolean(source.JumpStart);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "PlanId", this.PlanId);
        this.setParamSimple(map, prefix + "AliasZoneName", this.AliasZoneName);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "AllowDuplicates", this.AllowDuplicates);
        this.setParamSimple(map, prefix + "JumpStart", this.JumpStart);

    }
}

