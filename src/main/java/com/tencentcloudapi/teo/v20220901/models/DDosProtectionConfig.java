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

public class DDosProtectionConfig extends AbstractModel {

    /**
    * 中国大陆地区独立 DDoS 防护的规格。详情请参考 [独立 DDoS 防护相关费用](https://cloud.tencent.com/document/product/1552/94162)
<li>PLATFORM：平台默认防护，即不开启独立 DDoS 防护；</li>
<li>BASE30_MAX300：开启独立 DDoS 防护，提供 30 Gbps 保底防护带宽，可配置最高 300 Gpbs 弹性防护带宽；</li>
<li>BASE60_MAX600：开启独立 DDoS 防护，提供 60 Gbps 保底防护带宽，可配置最高 600 Gpbs 弹性防护带宽。</li>不填写参数时，取默认值 PLATFORM。
    */
    @SerializedName("LevelMainland")
    @Expose
    private String LevelMainland;

    /**
    * 中国大陆地区独立 DDoS 防护的弹性防护带宽配置。
仅当开启中国大陆区域独立 DDos 防护时有效（详见 LevelMainland 参数配置），且取值范围有如下限制：
<li>开启中国大陆地区独立 DDoS 防护，使用 30 Gbps 保底防护带宽规格时（ LevelMainland 参数值为 BASE30_MAX300 ）：有效取值范围为 30 至 300，单位为 Gbps；</li>
<li>开启中国大陆地区独立 DDoS 防护，使用 60 Gbps 保底防护带宽规格时（ LevelMainland 参数值为 BASE60_MAX600 ）：有效取值范围为 60 至 600，单位为 Gbps；</li>
<li>使用平台默认防护（ LevelMainland 参数值为 PLATFORM ）：不支持配置，本参数值无效。</li>
    */
    @SerializedName("MaxBandwidthMainland")
    @Expose
    private Long MaxBandwidthMainland;

    /**
    * 全球（除中国大陆以外）地区独立 DDoS 防护的规格。
<li>PLATFORM：平台默认防护，即不开启独立 DDoS 防护；</li>
<li>ANYCAST300：开启独立 DDoS 防护，提供合计最大 300 Gbps 防护带宽；</li>
<li>ANYCAST_ALLIN：开启独立 DDoS 防护，使用全部可用防护资源进行防护。</li>不填写参数时，取默认值 PLATFORM。
    */
    @SerializedName("LevelOverseas")
    @Expose
    private String LevelOverseas;

    /**
     * Get 中国大陆地区独立 DDoS 防护的规格。详情请参考 [独立 DDoS 防护相关费用](https://cloud.tencent.com/document/product/1552/94162)
<li>PLATFORM：平台默认防护，即不开启独立 DDoS 防护；</li>
<li>BASE30_MAX300：开启独立 DDoS 防护，提供 30 Gbps 保底防护带宽，可配置最高 300 Gpbs 弹性防护带宽；</li>
<li>BASE60_MAX600：开启独立 DDoS 防护，提供 60 Gbps 保底防护带宽，可配置最高 600 Gpbs 弹性防护带宽。</li>不填写参数时，取默认值 PLATFORM。 
     * @return LevelMainland 中国大陆地区独立 DDoS 防护的规格。详情请参考 [独立 DDoS 防护相关费用](https://cloud.tencent.com/document/product/1552/94162)
<li>PLATFORM：平台默认防护，即不开启独立 DDoS 防护；</li>
<li>BASE30_MAX300：开启独立 DDoS 防护，提供 30 Gbps 保底防护带宽，可配置最高 300 Gpbs 弹性防护带宽；</li>
<li>BASE60_MAX600：开启独立 DDoS 防护，提供 60 Gbps 保底防护带宽，可配置最高 600 Gpbs 弹性防护带宽。</li>不填写参数时，取默认值 PLATFORM。
     */
    public String getLevelMainland() {
        return this.LevelMainland;
    }

    /**
     * Set 中国大陆地区独立 DDoS 防护的规格。详情请参考 [独立 DDoS 防护相关费用](https://cloud.tencent.com/document/product/1552/94162)
<li>PLATFORM：平台默认防护，即不开启独立 DDoS 防护；</li>
<li>BASE30_MAX300：开启独立 DDoS 防护，提供 30 Gbps 保底防护带宽，可配置最高 300 Gpbs 弹性防护带宽；</li>
<li>BASE60_MAX600：开启独立 DDoS 防护，提供 60 Gbps 保底防护带宽，可配置最高 600 Gpbs 弹性防护带宽。</li>不填写参数时，取默认值 PLATFORM。
     * @param LevelMainland 中国大陆地区独立 DDoS 防护的规格。详情请参考 [独立 DDoS 防护相关费用](https://cloud.tencent.com/document/product/1552/94162)
<li>PLATFORM：平台默认防护，即不开启独立 DDoS 防护；</li>
<li>BASE30_MAX300：开启独立 DDoS 防护，提供 30 Gbps 保底防护带宽，可配置最高 300 Gpbs 弹性防护带宽；</li>
<li>BASE60_MAX600：开启独立 DDoS 防护，提供 60 Gbps 保底防护带宽，可配置最高 600 Gpbs 弹性防护带宽。</li>不填写参数时，取默认值 PLATFORM。
     */
    public void setLevelMainland(String LevelMainland) {
        this.LevelMainland = LevelMainland;
    }

    /**
     * Get 中国大陆地区独立 DDoS 防护的弹性防护带宽配置。
仅当开启中国大陆区域独立 DDos 防护时有效（详见 LevelMainland 参数配置），且取值范围有如下限制：
<li>开启中国大陆地区独立 DDoS 防护，使用 30 Gbps 保底防护带宽规格时（ LevelMainland 参数值为 BASE30_MAX300 ）：有效取值范围为 30 至 300，单位为 Gbps；</li>
<li>开启中国大陆地区独立 DDoS 防护，使用 60 Gbps 保底防护带宽规格时（ LevelMainland 参数值为 BASE60_MAX600 ）：有效取值范围为 60 至 600，单位为 Gbps；</li>
<li>使用平台默认防护（ LevelMainland 参数值为 PLATFORM ）：不支持配置，本参数值无效。</li> 
     * @return MaxBandwidthMainland 中国大陆地区独立 DDoS 防护的弹性防护带宽配置。
仅当开启中国大陆区域独立 DDos 防护时有效（详见 LevelMainland 参数配置），且取值范围有如下限制：
<li>开启中国大陆地区独立 DDoS 防护，使用 30 Gbps 保底防护带宽规格时（ LevelMainland 参数值为 BASE30_MAX300 ）：有效取值范围为 30 至 300，单位为 Gbps；</li>
<li>开启中国大陆地区独立 DDoS 防护，使用 60 Gbps 保底防护带宽规格时（ LevelMainland 参数值为 BASE60_MAX600 ）：有效取值范围为 60 至 600，单位为 Gbps；</li>
<li>使用平台默认防护（ LevelMainland 参数值为 PLATFORM ）：不支持配置，本参数值无效。</li>
     */
    public Long getMaxBandwidthMainland() {
        return this.MaxBandwidthMainland;
    }

    /**
     * Set 中国大陆地区独立 DDoS 防护的弹性防护带宽配置。
仅当开启中国大陆区域独立 DDos 防护时有效（详见 LevelMainland 参数配置），且取值范围有如下限制：
<li>开启中国大陆地区独立 DDoS 防护，使用 30 Gbps 保底防护带宽规格时（ LevelMainland 参数值为 BASE30_MAX300 ）：有效取值范围为 30 至 300，单位为 Gbps；</li>
<li>开启中国大陆地区独立 DDoS 防护，使用 60 Gbps 保底防护带宽规格时（ LevelMainland 参数值为 BASE60_MAX600 ）：有效取值范围为 60 至 600，单位为 Gbps；</li>
<li>使用平台默认防护（ LevelMainland 参数值为 PLATFORM ）：不支持配置，本参数值无效。</li>
     * @param MaxBandwidthMainland 中国大陆地区独立 DDoS 防护的弹性防护带宽配置。
仅当开启中国大陆区域独立 DDos 防护时有效（详见 LevelMainland 参数配置），且取值范围有如下限制：
<li>开启中国大陆地区独立 DDoS 防护，使用 30 Gbps 保底防护带宽规格时（ LevelMainland 参数值为 BASE30_MAX300 ）：有效取值范围为 30 至 300，单位为 Gbps；</li>
<li>开启中国大陆地区独立 DDoS 防护，使用 60 Gbps 保底防护带宽规格时（ LevelMainland 参数值为 BASE60_MAX600 ）：有效取值范围为 60 至 600，单位为 Gbps；</li>
<li>使用平台默认防护（ LevelMainland 参数值为 PLATFORM ）：不支持配置，本参数值无效。</li>
     */
    public void setMaxBandwidthMainland(Long MaxBandwidthMainland) {
        this.MaxBandwidthMainland = MaxBandwidthMainland;
    }

    /**
     * Get 全球（除中国大陆以外）地区独立 DDoS 防护的规格。
<li>PLATFORM：平台默认防护，即不开启独立 DDoS 防护；</li>
<li>ANYCAST300：开启独立 DDoS 防护，提供合计最大 300 Gbps 防护带宽；</li>
<li>ANYCAST_ALLIN：开启独立 DDoS 防护，使用全部可用防护资源进行防护。</li>不填写参数时，取默认值 PLATFORM。 
     * @return LevelOverseas 全球（除中国大陆以外）地区独立 DDoS 防护的规格。
<li>PLATFORM：平台默认防护，即不开启独立 DDoS 防护；</li>
<li>ANYCAST300：开启独立 DDoS 防护，提供合计最大 300 Gbps 防护带宽；</li>
<li>ANYCAST_ALLIN：开启独立 DDoS 防护，使用全部可用防护资源进行防护。</li>不填写参数时，取默认值 PLATFORM。
     */
    public String getLevelOverseas() {
        return this.LevelOverseas;
    }

    /**
     * Set 全球（除中国大陆以外）地区独立 DDoS 防护的规格。
<li>PLATFORM：平台默认防护，即不开启独立 DDoS 防护；</li>
<li>ANYCAST300：开启独立 DDoS 防护，提供合计最大 300 Gbps 防护带宽；</li>
<li>ANYCAST_ALLIN：开启独立 DDoS 防护，使用全部可用防护资源进行防护。</li>不填写参数时，取默认值 PLATFORM。
     * @param LevelOverseas 全球（除中国大陆以外）地区独立 DDoS 防护的规格。
<li>PLATFORM：平台默认防护，即不开启独立 DDoS 防护；</li>
<li>ANYCAST300：开启独立 DDoS 防护，提供合计最大 300 Gbps 防护带宽；</li>
<li>ANYCAST_ALLIN：开启独立 DDoS 防护，使用全部可用防护资源进行防护。</li>不填写参数时，取默认值 PLATFORM。
     */
    public void setLevelOverseas(String LevelOverseas) {
        this.LevelOverseas = LevelOverseas;
    }

    public DDosProtectionConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DDosProtectionConfig(DDosProtectionConfig source) {
        if (source.LevelMainland != null) {
            this.LevelMainland = new String(source.LevelMainland);
        }
        if (source.MaxBandwidthMainland != null) {
            this.MaxBandwidthMainland = new Long(source.MaxBandwidthMainland);
        }
        if (source.LevelOverseas != null) {
            this.LevelOverseas = new String(source.LevelOverseas);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LevelMainland", this.LevelMainland);
        this.setParamSimple(map, prefix + "MaxBandwidthMainland", this.MaxBandwidthMainland);
        this.setParamSimple(map, prefix + "LevelOverseas", this.LevelOverseas);

    }
}

