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
    * <p>七层加速域名源站防护模式，取值有：<li>all：自动纳入防护模式，站点内所有七层加速域名已纳入源站防护列表，包含后续新增的七层加速域名；</li><li>specific：指定加入防护模式，仅防护已绑定的七层加速域名。</li></p>
    */
    @SerializedName("L7EnableMode")
    @Expose
    private String L7EnableMode;

    /**
    * <p>启用了特定回源 IP 网段回源的七层加速域名列表。源站防护未开启时为空。</p>
    */
    @SerializedName("L7Hosts")
    @Expose
    private String [] L7Hosts;

    /**
    * <p>四层代理实例源站防护模式，取值有：<li>all：自动纳入防护模式，站点内所有四层代理实例已纳入源站防护列表，包含后续新增的四层代理实例；</li><li>specific：指定加入防护模式，仅防护已绑定的四层代理实例。</li></p>
    */
    @SerializedName("L4EnableMode")
    @Expose
    private String L4EnableMode;

    /**
    * <p>启用了特定回源 IP 网段回源的四层代理实例列表。源站防护未开启时为空。</p>
    */
    @SerializedName("L4ProxyIds")
    @Expose
    private String [] L4ProxyIds;

    /**
    * <p>当前生效的回源 IP 网段。源站防护未开启时为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CurrentOriginACL")
    @Expose
    private CurrentOriginACL CurrentOriginACL;

    /**
    * <p>当回源 IP 网段发生更新时，该字段会返回下一个版本将要生效的回源 IP 网段，包含与当前回源 IP 网段的对比。无更新或者源站防护未开启时该字段为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NextOriginACL")
    @Expose
    private NextOriginACL NextOriginACL;

    /**
    * <p>源站防护状态，取值有：</p><li>online：已生效；</li><li>offline：已停用；</li><li>updating: 配置部署中。</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>源站防护回源ACL控制域。</p>
    */
    @SerializedName("OriginACLFamily")
    @Expose
    private String OriginACLFamily;

    /**
     * Get <p>七层加速域名源站防护模式，取值有：<li>all：自动纳入防护模式，站点内所有七层加速域名已纳入源站防护列表，包含后续新增的七层加速域名；</li><li>specific：指定加入防护模式，仅防护已绑定的七层加速域名。</li></p> 
     * @return L7EnableMode <p>七层加速域名源站防护模式，取值有：<li>all：自动纳入防护模式，站点内所有七层加速域名已纳入源站防护列表，包含后续新增的七层加速域名；</li><li>specific：指定加入防护模式，仅防护已绑定的七层加速域名。</li></p>
     */
    public String getL7EnableMode() {
        return this.L7EnableMode;
    }

    /**
     * Set <p>七层加速域名源站防护模式，取值有：<li>all：自动纳入防护模式，站点内所有七层加速域名已纳入源站防护列表，包含后续新增的七层加速域名；</li><li>specific：指定加入防护模式，仅防护已绑定的七层加速域名。</li></p>
     * @param L7EnableMode <p>七层加速域名源站防护模式，取值有：<li>all：自动纳入防护模式，站点内所有七层加速域名已纳入源站防护列表，包含后续新增的七层加速域名；</li><li>specific：指定加入防护模式，仅防护已绑定的七层加速域名。</li></p>
     */
    public void setL7EnableMode(String L7EnableMode) {
        this.L7EnableMode = L7EnableMode;
    }

    /**
     * Get <p>启用了特定回源 IP 网段回源的七层加速域名列表。源站防护未开启时为空。</p> 
     * @return L7Hosts <p>启用了特定回源 IP 网段回源的七层加速域名列表。源站防护未开启时为空。</p>
     */
    public String [] getL7Hosts() {
        return this.L7Hosts;
    }

    /**
     * Set <p>启用了特定回源 IP 网段回源的七层加速域名列表。源站防护未开启时为空。</p>
     * @param L7Hosts <p>启用了特定回源 IP 网段回源的七层加速域名列表。源站防护未开启时为空。</p>
     */
    public void setL7Hosts(String [] L7Hosts) {
        this.L7Hosts = L7Hosts;
    }

    /**
     * Get <p>四层代理实例源站防护模式，取值有：<li>all：自动纳入防护模式，站点内所有四层代理实例已纳入源站防护列表，包含后续新增的四层代理实例；</li><li>specific：指定加入防护模式，仅防护已绑定的四层代理实例。</li></p> 
     * @return L4EnableMode <p>四层代理实例源站防护模式，取值有：<li>all：自动纳入防护模式，站点内所有四层代理实例已纳入源站防护列表，包含后续新增的四层代理实例；</li><li>specific：指定加入防护模式，仅防护已绑定的四层代理实例。</li></p>
     */
    public String getL4EnableMode() {
        return this.L4EnableMode;
    }

    /**
     * Set <p>四层代理实例源站防护模式，取值有：<li>all：自动纳入防护模式，站点内所有四层代理实例已纳入源站防护列表，包含后续新增的四层代理实例；</li><li>specific：指定加入防护模式，仅防护已绑定的四层代理实例。</li></p>
     * @param L4EnableMode <p>四层代理实例源站防护模式，取值有：<li>all：自动纳入防护模式，站点内所有四层代理实例已纳入源站防护列表，包含后续新增的四层代理实例；</li><li>specific：指定加入防护模式，仅防护已绑定的四层代理实例。</li></p>
     */
    public void setL4EnableMode(String L4EnableMode) {
        this.L4EnableMode = L4EnableMode;
    }

    /**
     * Get <p>启用了特定回源 IP 网段回源的四层代理实例列表。源站防护未开启时为空。</p> 
     * @return L4ProxyIds <p>启用了特定回源 IP 网段回源的四层代理实例列表。源站防护未开启时为空。</p>
     */
    public String [] getL4ProxyIds() {
        return this.L4ProxyIds;
    }

    /**
     * Set <p>启用了特定回源 IP 网段回源的四层代理实例列表。源站防护未开启时为空。</p>
     * @param L4ProxyIds <p>启用了特定回源 IP 网段回源的四层代理实例列表。源站防护未开启时为空。</p>
     */
    public void setL4ProxyIds(String [] L4ProxyIds) {
        this.L4ProxyIds = L4ProxyIds;
    }

    /**
     * Get <p>当前生效的回源 IP 网段。源站防护未开启时为空。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CurrentOriginACL <p>当前生效的回源 IP 网段。源站防护未开启时为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CurrentOriginACL getCurrentOriginACL() {
        return this.CurrentOriginACL;
    }

    /**
     * Set <p>当前生效的回源 IP 网段。源站防护未开启时为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CurrentOriginACL <p>当前生效的回源 IP 网段。源站防护未开启时为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCurrentOriginACL(CurrentOriginACL CurrentOriginACL) {
        this.CurrentOriginACL = CurrentOriginACL;
    }

    /**
     * Get <p>当回源 IP 网段发生更新时，该字段会返回下一个版本将要生效的回源 IP 网段，包含与当前回源 IP 网段的对比。无更新或者源站防护未开启时该字段为空。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NextOriginACL <p>当回源 IP 网段发生更新时，该字段会返回下一个版本将要生效的回源 IP 网段，包含与当前回源 IP 网段的对比。无更新或者源站防护未开启时该字段为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NextOriginACL getNextOriginACL() {
        return this.NextOriginACL;
    }

    /**
     * Set <p>当回源 IP 网段发生更新时，该字段会返回下一个版本将要生效的回源 IP 网段，包含与当前回源 IP 网段的对比。无更新或者源站防护未开启时该字段为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param NextOriginACL <p>当回源 IP 网段发生更新时，该字段会返回下一个版本将要生效的回源 IP 网段，包含与当前回源 IP 网段的对比。无更新或者源站防护未开启时该字段为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNextOriginACL(NextOriginACL NextOriginACL) {
        this.NextOriginACL = NextOriginACL;
    }

    /**
     * Get <p>源站防护状态，取值有：</p><li>online：已生效；</li><li>offline：已停用；</li><li>updating: 配置部署中。</li> 
     * @return Status <p>源站防护状态，取值有：</p><li>online：已生效；</li><li>offline：已停用；</li><li>updating: 配置部署中。</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>源站防护状态，取值有：</p><li>online：已生效；</li><li>offline：已停用；</li><li>updating: 配置部署中。</li>
     * @param Status <p>源站防护状态，取值有：</p><li>online：已生效；</li><li>offline：已停用；</li><li>updating: 配置部署中。</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>源站防护回源ACL控制域。</p> 
     * @return OriginACLFamily <p>源站防护回源ACL控制域。</p>
     */
    public String getOriginACLFamily() {
        return this.OriginACLFamily;
    }

    /**
     * Set <p>源站防护回源ACL控制域。</p>
     * @param OriginACLFamily <p>源站防护回源ACL控制域。</p>
     */
    public void setOriginACLFamily(String OriginACLFamily) {
        this.OriginACLFamily = OriginACLFamily;
    }

    public OriginACLInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OriginACLInfo(OriginACLInfo source) {
        if (source.L7EnableMode != null) {
            this.L7EnableMode = new String(source.L7EnableMode);
        }
        if (source.L7Hosts != null) {
            this.L7Hosts = new String[source.L7Hosts.length];
            for (int i = 0; i < source.L7Hosts.length; i++) {
                this.L7Hosts[i] = new String(source.L7Hosts[i]);
            }
        }
        if (source.L4EnableMode != null) {
            this.L4EnableMode = new String(source.L4EnableMode);
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
        if (source.OriginACLFamily != null) {
            this.OriginACLFamily = new String(source.OriginACLFamily);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "L7EnableMode", this.L7EnableMode);
        this.setParamArraySimple(map, prefix + "L7Hosts.", this.L7Hosts);
        this.setParamSimple(map, prefix + "L4EnableMode", this.L4EnableMode);
        this.setParamArraySimple(map, prefix + "L4ProxyIds.", this.L4ProxyIds);
        this.setParamObj(map, prefix + "CurrentOriginACL.", this.CurrentOriginACL);
        this.setParamObj(map, prefix + "NextOriginACL.", this.NextOriginACL);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "OriginACLFamily", this.OriginACLFamily);

    }
}

