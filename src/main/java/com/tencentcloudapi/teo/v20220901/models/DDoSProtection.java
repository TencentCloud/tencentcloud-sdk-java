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

public class DDoSProtection extends AbstractModel {

    /**
    * 指定独立 DDoS 的防护范围。取值为：
<li> protect_all_domains：独立 DDoS 防护对站点内全部域名生效，新接入域名自动开启独立 DDoS 防护，入参为 protect_all_domains 时，入参 DomainDDoSProtections 不作处理；</li>
<li> protect_specified_domains：仅对指定域名生效，具体范围可通过 DomainDDoSProtection 参数指定。</li>
    */
    @SerializedName("ProtectionOption")
    @Expose
    private String ProtectionOption;

    /**
    * 域名的独立 DDoS 防护配置。在入参场景中：
<li> 当 ProtectionOption 保持为 protect_specified_domains 时：未填写的域名维持原有独立 DDoS 防护配置不变，显式指定的域名​按传入参数更新；</li>
<li> 当 ProtectionOption 由 protect_all_domains 切换为 protect_specified_domains 时：若 DomainDDoSProtections 传空，停用站点下全部域名的独立 DDoS 防护；若 DomainDDoSProtections 不为空，参数中指定的域名停用或保持独立 DDoS 防护，其余未列出的域名统一停用独立 DDoS 防护。</li>
    */
    @SerializedName("DomainDDoSProtections")
    @Expose
    private DomainDDoSProtection [] DomainDDoSProtections;

    /**
    * 共享 CNAME 的独立 DDoS 防护配置。仅作为出参使用。
    */
    @SerializedName("SharedCNAMEDDoSProtections")
    @Expose
    private DomainDDoSProtection [] SharedCNAMEDDoSProtections;

    /**
     * Get 指定独立 DDoS 的防护范围。取值为：
<li> protect_all_domains：独立 DDoS 防护对站点内全部域名生效，新接入域名自动开启独立 DDoS 防护，入参为 protect_all_domains 时，入参 DomainDDoSProtections 不作处理；</li>
<li> protect_specified_domains：仅对指定域名生效，具体范围可通过 DomainDDoSProtection 参数指定。</li> 
     * @return ProtectionOption 指定独立 DDoS 的防护范围。取值为：
<li> protect_all_domains：独立 DDoS 防护对站点内全部域名生效，新接入域名自动开启独立 DDoS 防护，入参为 protect_all_domains 时，入参 DomainDDoSProtections 不作处理；</li>
<li> protect_specified_domains：仅对指定域名生效，具体范围可通过 DomainDDoSProtection 参数指定。</li>
     */
    public String getProtectionOption() {
        return this.ProtectionOption;
    }

    /**
     * Set 指定独立 DDoS 的防护范围。取值为：
<li> protect_all_domains：独立 DDoS 防护对站点内全部域名生效，新接入域名自动开启独立 DDoS 防护，入参为 protect_all_domains 时，入参 DomainDDoSProtections 不作处理；</li>
<li> protect_specified_domains：仅对指定域名生效，具体范围可通过 DomainDDoSProtection 参数指定。</li>
     * @param ProtectionOption 指定独立 DDoS 的防护范围。取值为：
<li> protect_all_domains：独立 DDoS 防护对站点内全部域名生效，新接入域名自动开启独立 DDoS 防护，入参为 protect_all_domains 时，入参 DomainDDoSProtections 不作处理；</li>
<li> protect_specified_domains：仅对指定域名生效，具体范围可通过 DomainDDoSProtection 参数指定。</li>
     */
    public void setProtectionOption(String ProtectionOption) {
        this.ProtectionOption = ProtectionOption;
    }

    /**
     * Get 域名的独立 DDoS 防护配置。在入参场景中：
<li> 当 ProtectionOption 保持为 protect_specified_domains 时：未填写的域名维持原有独立 DDoS 防护配置不变，显式指定的域名​按传入参数更新；</li>
<li> 当 ProtectionOption 由 protect_all_domains 切换为 protect_specified_domains 时：若 DomainDDoSProtections 传空，停用站点下全部域名的独立 DDoS 防护；若 DomainDDoSProtections 不为空，参数中指定的域名停用或保持独立 DDoS 防护，其余未列出的域名统一停用独立 DDoS 防护。</li> 
     * @return DomainDDoSProtections 域名的独立 DDoS 防护配置。在入参场景中：
<li> 当 ProtectionOption 保持为 protect_specified_domains 时：未填写的域名维持原有独立 DDoS 防护配置不变，显式指定的域名​按传入参数更新；</li>
<li> 当 ProtectionOption 由 protect_all_domains 切换为 protect_specified_domains 时：若 DomainDDoSProtections 传空，停用站点下全部域名的独立 DDoS 防护；若 DomainDDoSProtections 不为空，参数中指定的域名停用或保持独立 DDoS 防护，其余未列出的域名统一停用独立 DDoS 防护。</li>
     */
    public DomainDDoSProtection [] getDomainDDoSProtections() {
        return this.DomainDDoSProtections;
    }

    /**
     * Set 域名的独立 DDoS 防护配置。在入参场景中：
<li> 当 ProtectionOption 保持为 protect_specified_domains 时：未填写的域名维持原有独立 DDoS 防护配置不变，显式指定的域名​按传入参数更新；</li>
<li> 当 ProtectionOption 由 protect_all_domains 切换为 protect_specified_domains 时：若 DomainDDoSProtections 传空，停用站点下全部域名的独立 DDoS 防护；若 DomainDDoSProtections 不为空，参数中指定的域名停用或保持独立 DDoS 防护，其余未列出的域名统一停用独立 DDoS 防护。</li>
     * @param DomainDDoSProtections 域名的独立 DDoS 防护配置。在入参场景中：
<li> 当 ProtectionOption 保持为 protect_specified_domains 时：未填写的域名维持原有独立 DDoS 防护配置不变，显式指定的域名​按传入参数更新；</li>
<li> 当 ProtectionOption 由 protect_all_domains 切换为 protect_specified_domains 时：若 DomainDDoSProtections 传空，停用站点下全部域名的独立 DDoS 防护；若 DomainDDoSProtections 不为空，参数中指定的域名停用或保持独立 DDoS 防护，其余未列出的域名统一停用独立 DDoS 防护。</li>
     */
    public void setDomainDDoSProtections(DomainDDoSProtection [] DomainDDoSProtections) {
        this.DomainDDoSProtections = DomainDDoSProtections;
    }

    /**
     * Get 共享 CNAME 的独立 DDoS 防护配置。仅作为出参使用。 
     * @return SharedCNAMEDDoSProtections 共享 CNAME 的独立 DDoS 防护配置。仅作为出参使用。
     */
    public DomainDDoSProtection [] getSharedCNAMEDDoSProtections() {
        return this.SharedCNAMEDDoSProtections;
    }

    /**
     * Set 共享 CNAME 的独立 DDoS 防护配置。仅作为出参使用。
     * @param SharedCNAMEDDoSProtections 共享 CNAME 的独立 DDoS 防护配置。仅作为出参使用。
     */
    public void setSharedCNAMEDDoSProtections(DomainDDoSProtection [] SharedCNAMEDDoSProtections) {
        this.SharedCNAMEDDoSProtections = SharedCNAMEDDoSProtections;
    }

    public DDoSProtection() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DDoSProtection(DDoSProtection source) {
        if (source.ProtectionOption != null) {
            this.ProtectionOption = new String(source.ProtectionOption);
        }
        if (source.DomainDDoSProtections != null) {
            this.DomainDDoSProtections = new DomainDDoSProtection[source.DomainDDoSProtections.length];
            for (int i = 0; i < source.DomainDDoSProtections.length; i++) {
                this.DomainDDoSProtections[i] = new DomainDDoSProtection(source.DomainDDoSProtections[i]);
            }
        }
        if (source.SharedCNAMEDDoSProtections != null) {
            this.SharedCNAMEDDoSProtections = new DomainDDoSProtection[source.SharedCNAMEDDoSProtections.length];
            for (int i = 0; i < source.SharedCNAMEDDoSProtections.length; i++) {
                this.SharedCNAMEDDoSProtections[i] = new DomainDDoSProtection(source.SharedCNAMEDDoSProtections[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProtectionOption", this.ProtectionOption);
        this.setParamArrayObj(map, prefix + "DomainDDoSProtections.", this.DomainDDoSProtections);
        this.setParamArrayObj(map, prefix + "SharedCNAMEDDoSProtections.", this.SharedCNAMEDDoSProtections);

    }
}

