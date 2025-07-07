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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OriginACLInfo extends AbstractModel {

    /**
    * 启用了特定回源 IP 网段回源的七层加速域名列表。源站防护未开启时为空。
    */
    @SerializedName("L7Hosts")
    @Expose
    private String [] L7Hosts;

    /**
    * 启用了特定回源 IP 网段回源的四层代理实例列表。源站防护未开启时为空。
    */
    @SerializedName("L4ProxyIds")
    @Expose
    private String [] L4ProxyIds;

    /**
    * 当前生效的回源 IP 网段。源站防护未开启时为空。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CurrentOriginACL")
    @Expose
    private CurrentOriginACL CurrentOriginACL;

    /**
    * 当回源 IP 网段发生更新时，该字段会返回下一个版本将要生效的回源 IP 网段，包含与当前回源 IP 网段的对比。无更新或者源站防护未开启时该字段为空。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NextOriginACL")
    @Expose
    private NextOriginACL NextOriginACL;

    /**
    * 源站防护状态，取值有：
<li>online：已生效；</li>
<li>offline：已停用；</li>
<li>updating: 配置部署中。</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get 启用了特定回源 IP 网段回源的七层加速域名列表。源站防护未开启时为空。 
     * @return L7Hosts 启用了特定回源 IP 网段回源的七层加速域名列表。源站防护未开启时为空。
     */
    public String [] getL7Hosts() {
        return this.L7Hosts;
    }

    /**
     * Set 启用了特定回源 IP 网段回源的七层加速域名列表。源站防护未开启时为空。
     * @param L7Hosts 启用了特定回源 IP 网段回源的七层加速域名列表。源站防护未开启时为空。
     */
    public void setL7Hosts(String [] L7Hosts) {
        this.L7Hosts = L7Hosts;
    }

    /**
     * Get 启用了特定回源 IP 网段回源的四层代理实例列表。源站防护未开启时为空。 
     * @return L4ProxyIds 启用了特定回源 IP 网段回源的四层代理实例列表。源站防护未开启时为空。
     */
    public String [] getL4ProxyIds() {
        return this.L4ProxyIds;
    }

    /**
     * Set 启用了特定回源 IP 网段回源的四层代理实例列表。源站防护未开启时为空。
     * @param L4ProxyIds 启用了特定回源 IP 网段回源的四层代理实例列表。源站防护未开启时为空。
     */
    public void setL4ProxyIds(String [] L4ProxyIds) {
        this.L4ProxyIds = L4ProxyIds;
    }

    /**
     * Get 当前生效的回源 IP 网段。源站防护未开启时为空。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CurrentOriginACL 当前生效的回源 IP 网段。源站防护未开启时为空。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CurrentOriginACL getCurrentOriginACL() {
        return this.CurrentOriginACL;
    }

    /**
     * Set 当前生效的回源 IP 网段。源站防护未开启时为空。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CurrentOriginACL 当前生效的回源 IP 网段。源站防护未开启时为空。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCurrentOriginACL(CurrentOriginACL CurrentOriginACL) {
        this.CurrentOriginACL = CurrentOriginACL;
    }

    /**
     * Get 当回源 IP 网段发生更新时，该字段会返回下一个版本将要生效的回源 IP 网段，包含与当前回源 IP 网段的对比。无更新或者源站防护未开启时该字段为空。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NextOriginACL 当回源 IP 网段发生更新时，该字段会返回下一个版本将要生效的回源 IP 网段，包含与当前回源 IP 网段的对比。无更新或者源站防护未开启时该字段为空。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NextOriginACL getNextOriginACL() {
        return this.NextOriginACL;
    }

    /**
     * Set 当回源 IP 网段发生更新时，该字段会返回下一个版本将要生效的回源 IP 网段，包含与当前回源 IP 网段的对比。无更新或者源站防护未开启时该字段为空。
注意：此字段可能返回 null，表示取不到有效值。
     * @param NextOriginACL 当回源 IP 网段发生更新时，该字段会返回下一个版本将要生效的回源 IP 网段，包含与当前回源 IP 网段的对比。无更新或者源站防护未开启时该字段为空。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNextOriginACL(NextOriginACL NextOriginACL) {
        this.NextOriginACL = NextOriginACL;
    }

    /**
     * Get 源站防护状态，取值有：
<li>online：已生效；</li>
<li>offline：已停用；</li>
<li>updating: 配置部署中。</li> 
     * @return Status 源站防护状态，取值有：
<li>online：已生效；</li>
<li>offline：已停用；</li>
<li>updating: 配置部署中。</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 源站防护状态，取值有：
<li>online：已生效；</li>
<li>offline：已停用；</li>
<li>updating: 配置部署中。</li>
     * @param Status 源站防护状态，取值有：
<li>online：已生效；</li>
<li>offline：已停用；</li>
<li>updating: 配置部署中。</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public OriginACLInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OriginACLInfo(OriginACLInfo source) {
        if (source.L7Hosts != null) {
            this.L7Hosts = new String[source.L7Hosts.length];
            for (int i = 0; i < source.L7Hosts.length; i++) {
                this.L7Hosts[i] = new String(source.L7Hosts[i]);
            }
        }
        if (source.L4ProxyIds != null) {
            this.L4ProxyIds = new String[source.L4ProxyIds.length];
            for (int i = 0; i < source.L4ProxyIds.length; i++) {
                this.L4ProxyIds[i] = new String(source.L4ProxyIds[i]);
            }
        }
        if (source.CurrentOriginACL != null) {
            this.CurrentOriginACL = new CurrentOriginACL(source.CurrentOriginACL);
        }
        if (source.NextOriginACL != null) {
            this.NextOriginACL = new NextOriginACL(source.NextOriginACL);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "L7Hosts.", this.L7Hosts);
        this.setParamArraySimple(map, prefix + "L4ProxyIds.", this.L4ProxyIds);
        this.setParamObj(map, prefix + "CurrentOriginACL.", this.CurrentOriginACL);
        this.setParamObj(map, prefix + "NextOriginACL.", this.NextOriginACL);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

