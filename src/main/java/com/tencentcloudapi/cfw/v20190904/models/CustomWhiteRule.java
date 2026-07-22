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

public class CustomWhiteRule extends AbstractModel {

    /**
    * 自定义规则的目的地址。SrcIP、DstIP 至少一项必须是具体 IP；本字段仅在 SrcIP 为具体 IP 时可省略或使用与 SrcIP 同版本的通配网段。两项均为具体 IP 时，源 IPv6、目的 IPv4 会被拒绝，源 IPv4、目的 IPv6 当前不受该版本检查限制。私网 IPv4 和任意 IPv6 直接通过资产判定，公网 IPv4 必须存在于当前账号 cfw_public_ip；是否要求通过资产判定由两侧地址与实际 FwType 联动决定。
    */
    @SerializedName("DstIP")
    @Expose
    private String DstIP;

    /**
    * 自定义规则关联的入侵防御规则 ID；必须是可转换为整数且在入侵防御规则模板中存在的 ID。
    */
    @SerializedName("IdsRuleId")
    @Expose
    private String IdsRuleId;

    /**
    * 自定义规则名称；处理器不对内容做额外校验。
    */
    @SerializedName("IdsRuleName")
    @Expose
    private String IdsRuleName;

    /**
    * 自定义规则的源地址。SrcIP、DstIP 至少一项必须是具体 IP；本字段仅在 DstIP 为具体 IP 时可省略或使用与 DstIP 同版本的通配网段。两项均为具体 IP 时，源 IPv6、目的 IPv4 会被拒绝，源 IPv4、目的 IPv6 当前不受该版本检查限制。私网 IPv4 和任意 IPv6 直接通过资产判定，公网 IPv4 必须存在于当前账号 cfw_public_ip；是否要求通过资产判定由两侧地址与实际 FwType 联动决定。
    */
    @SerializedName("SrcIP")
    @Expose
    private String SrcIP;

    /**
     * Get 自定义规则的目的地址。SrcIP、DstIP 至少一项必须是具体 IP；本字段仅在 SrcIP 为具体 IP 时可省略或使用与 SrcIP 同版本的通配网段。两项均为具体 IP 时，源 IPv6、目的 IPv4 会被拒绝，源 IPv4、目的 IPv6 当前不受该版本检查限制。私网 IPv4 和任意 IPv6 直接通过资产判定，公网 IPv4 必须存在于当前账号 cfw_public_ip；是否要求通过资产判定由两侧地址与实际 FwType 联动决定。 
     * @return DstIP 自定义规则的目的地址。SrcIP、DstIP 至少一项必须是具体 IP；本字段仅在 SrcIP 为具体 IP 时可省略或使用与 SrcIP 同版本的通配网段。两项均为具体 IP 时，源 IPv6、目的 IPv4 会被拒绝，源 IPv4、目的 IPv6 当前不受该版本检查限制。私网 IPv4 和任意 IPv6 直接通过资产判定，公网 IPv4 必须存在于当前账号 cfw_public_ip；是否要求通过资产判定由两侧地址与实际 FwType 联动决定。
     */
    public String getDstIP() {
        return this.DstIP;
    }

    /**
     * Set 自定义规则的目的地址。SrcIP、DstIP 至少一项必须是具体 IP；本字段仅在 SrcIP 为具体 IP 时可省略或使用与 SrcIP 同版本的通配网段。两项均为具体 IP 时，源 IPv6、目的 IPv4 会被拒绝，源 IPv4、目的 IPv6 当前不受该版本检查限制。私网 IPv4 和任意 IPv6 直接通过资产判定，公网 IPv4 必须存在于当前账号 cfw_public_ip；是否要求通过资产判定由两侧地址与实际 FwType 联动决定。
     * @param DstIP 自定义规则的目的地址。SrcIP、DstIP 至少一项必须是具体 IP；本字段仅在 SrcIP 为具体 IP 时可省略或使用与 SrcIP 同版本的通配网段。两项均为具体 IP 时，源 IPv6、目的 IPv4 会被拒绝，源 IPv4、目的 IPv6 当前不受该版本检查限制。私网 IPv4 和任意 IPv6 直接通过资产判定，公网 IPv4 必须存在于当前账号 cfw_public_ip；是否要求通过资产判定由两侧地址与实际 FwType 联动决定。
     */
    public void setDstIP(String DstIP) {
        this.DstIP = DstIP;
    }

    /**
     * Get 自定义规则关联的入侵防御规则 ID；必须是可转换为整数且在入侵防御规则模板中存在的 ID。 
     * @return IdsRuleId 自定义规则关联的入侵防御规则 ID；必须是可转换为整数且在入侵防御规则模板中存在的 ID。
     */
    public String getIdsRuleId() {
        return this.IdsRuleId;
    }

    /**
     * Set 自定义规则关联的入侵防御规则 ID；必须是可转换为整数且在入侵防御规则模板中存在的 ID。
     * @param IdsRuleId 自定义规则关联的入侵防御规则 ID；必须是可转换为整数且在入侵防御规则模板中存在的 ID。
     */
    public void setIdsRuleId(String IdsRuleId) {
        this.IdsRuleId = IdsRuleId;
    }

    /**
     * Get 自定义规则名称；处理器不对内容做额外校验。 
     * @return IdsRuleName 自定义规则名称；处理器不对内容做额外校验。
     */
    public String getIdsRuleName() {
        return this.IdsRuleName;
    }

    /**
     * Set 自定义规则名称；处理器不对内容做额外校验。
     * @param IdsRuleName 自定义规则名称；处理器不对内容做额外校验。
     */
    public void setIdsRuleName(String IdsRuleName) {
        this.IdsRuleName = IdsRuleName;
    }

    /**
     * Get 自定义规则的源地址。SrcIP、DstIP 至少一项必须是具体 IP；本字段仅在 DstIP 为具体 IP 时可省略或使用与 DstIP 同版本的通配网段。两项均为具体 IP 时，源 IPv6、目的 IPv4 会被拒绝，源 IPv4、目的 IPv6 当前不受该版本检查限制。私网 IPv4 和任意 IPv6 直接通过资产判定，公网 IPv4 必须存在于当前账号 cfw_public_ip；是否要求通过资产判定由两侧地址与实际 FwType 联动决定。 
     * @return SrcIP 自定义规则的源地址。SrcIP、DstIP 至少一项必须是具体 IP；本字段仅在 DstIP 为具体 IP 时可省略或使用与 DstIP 同版本的通配网段。两项均为具体 IP 时，源 IPv6、目的 IPv4 会被拒绝，源 IPv4、目的 IPv6 当前不受该版本检查限制。私网 IPv4 和任意 IPv6 直接通过资产判定，公网 IPv4 必须存在于当前账号 cfw_public_ip；是否要求通过资产判定由两侧地址与实际 FwType 联动决定。
     */
    public String getSrcIP() {
        return this.SrcIP;
    }

    /**
     * Set 自定义规则的源地址。SrcIP、DstIP 至少一项必须是具体 IP；本字段仅在 DstIP 为具体 IP 时可省略或使用与 DstIP 同版本的通配网段。两项均为具体 IP 时，源 IPv6、目的 IPv4 会被拒绝，源 IPv4、目的 IPv6 当前不受该版本检查限制。私网 IPv4 和任意 IPv6 直接通过资产判定，公网 IPv4 必须存在于当前账号 cfw_public_ip；是否要求通过资产判定由两侧地址与实际 FwType 联动决定。
     * @param SrcIP 自定义规则的源地址。SrcIP、DstIP 至少一项必须是具体 IP；本字段仅在 DstIP 为具体 IP 时可省略或使用与 DstIP 同版本的通配网段。两项均为具体 IP 时，源 IPv6、目的 IPv4 会被拒绝，源 IPv4、目的 IPv6 当前不受该版本检查限制。私网 IPv4 和任意 IPv6 直接通过资产判定，公网 IPv4 必须存在于当前账号 cfw_public_ip；是否要求通过资产判定由两侧地址与实际 FwType 联动决定。
     */
    public void setSrcIP(String SrcIP) {
        this.SrcIP = SrcIP;
    }

    public CustomWhiteRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomWhiteRule(CustomWhiteRule source) {
        if (source.DstIP != null) {
            this.DstIP = new String(source.DstIP);
        }
        if (source.IdsRuleId != null) {
            this.IdsRuleId = new String(source.IdsRuleId);
        }
        if (source.IdsRuleName != null) {
            this.IdsRuleName = new String(source.IdsRuleName);
        }
        if (source.SrcIP != null) {
            this.SrcIP = new String(source.SrcIP);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DstIP", this.DstIP);
        this.setParamSimple(map, prefix + "IdsRuleId", this.IdsRuleId);
        this.setParamSimple(map, prefix + "IdsRuleName", this.IdsRuleName);
        this.setParamSimple(map, prefix + "SrcIP", this.SrcIP);

    }
}

