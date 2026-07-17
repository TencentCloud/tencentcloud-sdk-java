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

public class DescribeCfwRulesRequest extends AbstractModel {

    /**
    * <p>规则域。必填。枚举：border 互联网边界；nat NAT 边界；vpc VPC 间；enterprise_sg 企业安全组；intrusion_prevention 入侵防御。RuleType=intrusion_prevention 时还必须传 ListType。</p>
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * <p>入侵防御列表类型。仅 RuleType=intrusion_prevention 时使用并必填。blocklist 表示封禁列表，whitelist 表示白名单策略，isolate 表示隔离列表。</p>
    */
    @SerializedName("ListType")
    @Expose
    private String ListType;

    /**
    * <p>访问方向过滤。可选。0 表示出站，1 表示入站；不传则不过滤。RuleType=intrusion_prevention 时不支持。</p>
    */
    @SerializedName("Direction")
    @Expose
    private Long Direction;

    /**
    * <p>规则动作过滤。可选。0 表示观察，1 表示阻断，2 表示放行；不传则不过滤。</p>
    */
    @SerializedName("RuleAction")
    @Expose
    private Long RuleAction;

    /**
    * <p>精确规则 ID 过滤。可选。用于按数值规则标识定位单条规则。</p>
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * <p>单页返回规则数。可选，默认 100，最大 1000。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>分页偏移。可选，默认 0。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get <p>规则域。必填。枚举：border 互联网边界；nat NAT 边界；vpc VPC 间；enterprise_sg 企业安全组；intrusion_prevention 入侵防御。RuleType=intrusion_prevention 时还必须传 ListType。</p> 
     * @return RuleType <p>规则域。必填。枚举：border 互联网边界；nat NAT 边界；vpc VPC 间；enterprise_sg 企业安全组；intrusion_prevention 入侵防御。RuleType=intrusion_prevention 时还必须传 ListType。</p>
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set <p>规则域。必填。枚举：border 互联网边界；nat NAT 边界；vpc VPC 间；enterprise_sg 企业安全组；intrusion_prevention 入侵防御。RuleType=intrusion_prevention 时还必须传 ListType。</p>
     * @param RuleType <p>规则域。必填。枚举：border 互联网边界；nat NAT 边界；vpc VPC 间；enterprise_sg 企业安全组；intrusion_prevention 入侵防御。RuleType=intrusion_prevention 时还必须传 ListType。</p>
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get <p>入侵防御列表类型。仅 RuleType=intrusion_prevention 时使用并必填。blocklist 表示封禁列表，whitelist 表示白名单策略，isolate 表示隔离列表。</p> 
     * @return ListType <p>入侵防御列表类型。仅 RuleType=intrusion_prevention 时使用并必填。blocklist 表示封禁列表，whitelist 表示白名单策略，isolate 表示隔离列表。</p>
     */
    public String getListType() {
        return this.ListType;
    }

    /**
     * Set <p>入侵防御列表类型。仅 RuleType=intrusion_prevention 时使用并必填。blocklist 表示封禁列表，whitelist 表示白名单策略，isolate 表示隔离列表。</p>
     * @param ListType <p>入侵防御列表类型。仅 RuleType=intrusion_prevention 时使用并必填。blocklist 表示封禁列表，whitelist 表示白名单策略，isolate 表示隔离列表。</p>
     */
    public void setListType(String ListType) {
        this.ListType = ListType;
    }

    /**
     * Get <p>访问方向过滤。可选。0 表示出站，1 表示入站；不传则不过滤。RuleType=intrusion_prevention 时不支持。</p> 
     * @return Direction <p>访问方向过滤。可选。0 表示出站，1 表示入站；不传则不过滤。RuleType=intrusion_prevention 时不支持。</p>
     */
    public Long getDirection() {
        return this.Direction;
    }

    /**
     * Set <p>访问方向过滤。可选。0 表示出站，1 表示入站；不传则不过滤。RuleType=intrusion_prevention 时不支持。</p>
     * @param Direction <p>访问方向过滤。可选。0 表示出站，1 表示入站；不传则不过滤。RuleType=intrusion_prevention 时不支持。</p>
     */
    public void setDirection(Long Direction) {
        this.Direction = Direction;
    }

    /**
     * Get <p>规则动作过滤。可选。0 表示观察，1 表示阻断，2 表示放行；不传则不过滤。</p> 
     * @return RuleAction <p>规则动作过滤。可选。0 表示观察，1 表示阻断，2 表示放行；不传则不过滤。</p>
     */
    public Long getRuleAction() {
        return this.RuleAction;
    }

    /**
     * Set <p>规则动作过滤。可选。0 表示观察，1 表示阻断，2 表示放行；不传则不过滤。</p>
     * @param RuleAction <p>规则动作过滤。可选。0 表示观察，1 表示阻断，2 表示放行；不传则不过滤。</p>
     */
    public void setRuleAction(Long RuleAction) {
        this.RuleAction = RuleAction;
    }

    /**
     * Get <p>精确规则 ID 过滤。可选。用于按数值规则标识定位单条规则。</p> 
     * @return RuleId <p>精确规则 ID 过滤。可选。用于按数值规则标识定位单条规则。</p>
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set <p>精确规则 ID 过滤。可选。用于按数值规则标识定位单条规则。</p>
     * @param RuleId <p>精确规则 ID 过滤。可选。用于按数值规则标识定位单条规则。</p>
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get <p>单页返回规则数。可选，默认 100，最大 1000。</p> 
     * @return Limit <p>单页返回规则数。可选，默认 100，最大 1000。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>单页返回规则数。可选，默认 100，最大 1000。</p>
     * @param Limit <p>单页返回规则数。可选，默认 100，最大 1000。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>分页偏移。可选，默认 0。</p> 
     * @return Offset <p>分页偏移。可选，默认 0。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页偏移。可选，默认 0。</p>
     * @param Offset <p>分页偏移。可选，默认 0。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeCfwRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCfwRulesRequest(DescribeCfwRulesRequest source) {
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.ListType != null) {
            this.ListType = new String(source.ListType);
        }
        if (source.Direction != null) {
            this.Direction = new Long(source.Direction);
        }
        if (source.RuleAction != null) {
            this.RuleAction = new Long(source.RuleAction);
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "ListType", this.ListType);
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamSimple(map, prefix + "RuleAction", this.RuleAction);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

