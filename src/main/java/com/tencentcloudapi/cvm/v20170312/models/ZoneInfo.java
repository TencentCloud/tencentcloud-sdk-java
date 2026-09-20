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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ZoneInfo extends AbstractModel {

    /**
    * <p>可用区名称，例如，ap-guangzhou-3<br>全网可用区名称如下：</p><li> ap-chongqing-1 </li><li> ap-seoul-1 </li><li> ap-seoul-2 </li><li> ap-chengdu-1 </li><li> ap-chengdu-2 </li><li> ap-hongkong-1（售罄） </li><li> ap-hongkong-2 </li><li> ap-hongkong-3 </li><li> ap-shenzhen-fsi-1 </li><li> ap-shenzhen-fsi-2 </li><li> ap-shenzhen-fsi-3（售罄） </li><li> ap-guangzhou-1（售罄）</li><li> ap-guangzhou-2（售罄）</li><li> ap-guangzhou-3 </li><li> ap-guangzhou-4 </li><li> ap-guangzhou-6 </li><li> ap-guangzhou-7 </li><li> ap-tokyo-1 </li><li> ap-tokyo-2 </li><li> ap-singapore-1 </li><li> ap-singapore-2 </li><li> ap-singapore-3 </li><li>ap-singapore-4 </li><li> ap-shanghai-fsi-2 </li><li> ap-shanghai-fsi-3 </li><li> ap-shanghai-fsi-4 </li><li> ap-bangkok-1 </li><li> ap-bangkok-2 </li><li> ap-shanghai-2 </li><li> ap-shanghai-3 </li><li> ap-shanghai-4 </li><li> ap-shanghai-5 </li><li> ap-shanghai-8 </li><li> ap-mumbai-1 </li><li> ap-mumbai-2 </li><li> ap-beijing-1（售罄）</li><li> ap-beijing-3 </li><li> ap-beijing-4 </li><li> ap-beijing-5 </li><li> ap-beijing-6 </li><li> ap-beijing-7 </li><li> na-siliconvalley-1 </li><li> na-siliconvalley-2 </li><li> eu-frankfurt-1 </li><li> eu-frankfurt-2 </li><li> na-ashburn-1 </li><li> na-ashburn-2 </li><li> ap-nanjing-1 </li><li> ap-nanjing-2 </li><li> ap-nanjing-3 </li><li> sa-saopaulo-1</li><li> ap-jakarta-1 </li><li> ap-jakarta-2 </li>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>可用区描述，例如，广州三区</p>
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * <p>可用区ID</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>可用区状态，包含AVAILABLE和UNAVAILABLE。AVAILABLE代表可用，UNAVAILABLE代表不可用。</p>
    */
    @SerializedName("ZoneState")
    @Expose
    private String ZoneState;

    /**
     * Get <p>可用区名称，例如，ap-guangzhou-3<br>全网可用区名称如下：</p><li> ap-chongqing-1 </li><li> ap-seoul-1 </li><li> ap-seoul-2 </li><li> ap-chengdu-1 </li><li> ap-chengdu-2 </li><li> ap-hongkong-1（售罄） </li><li> ap-hongkong-2 </li><li> ap-hongkong-3 </li><li> ap-shenzhen-fsi-1 </li><li> ap-shenzhen-fsi-2 </li><li> ap-shenzhen-fsi-3（售罄） </li><li> ap-guangzhou-1（售罄）</li><li> ap-guangzhou-2（售罄）</li><li> ap-guangzhou-3 </li><li> ap-guangzhou-4 </li><li> ap-guangzhou-6 </li><li> ap-guangzhou-7 </li><li> ap-tokyo-1 </li><li> ap-tokyo-2 </li><li> ap-singapore-1 </li><li> ap-singapore-2 </li><li> ap-singapore-3 </li><li>ap-singapore-4 </li><li> ap-shanghai-fsi-2 </li><li> ap-shanghai-fsi-3 </li><li> ap-shanghai-fsi-4 </li><li> ap-bangkok-1 </li><li> ap-bangkok-2 </li><li> ap-shanghai-2 </li><li> ap-shanghai-3 </li><li> ap-shanghai-4 </li><li> ap-shanghai-5 </li><li> ap-shanghai-8 </li><li> ap-mumbai-1 </li><li> ap-mumbai-2 </li><li> ap-beijing-1（售罄）</li><li> ap-beijing-3 </li><li> ap-beijing-4 </li><li> ap-beijing-5 </li><li> ap-beijing-6 </li><li> ap-beijing-7 </li><li> na-siliconvalley-1 </li><li> na-siliconvalley-2 </li><li> eu-frankfurt-1 </li><li> eu-frankfurt-2 </li><li> na-ashburn-1 </li><li> na-ashburn-2 </li><li> ap-nanjing-1 </li><li> ap-nanjing-2 </li><li> ap-nanjing-3 </li><li> sa-saopaulo-1</li><li> ap-jakarta-1 </li><li> ap-jakarta-2 </li> 
     * @return Zone <p>可用区名称，例如，ap-guangzhou-3<br>全网可用区名称如下：</p><li> ap-chongqing-1 </li><li> ap-seoul-1 </li><li> ap-seoul-2 </li><li> ap-chengdu-1 </li><li> ap-chengdu-2 </li><li> ap-hongkong-1（售罄） </li><li> ap-hongkong-2 </li><li> ap-hongkong-3 </li><li> ap-shenzhen-fsi-1 </li><li> ap-shenzhen-fsi-2 </li><li> ap-shenzhen-fsi-3（售罄） </li><li> ap-guangzhou-1（售罄）</li><li> ap-guangzhou-2（售罄）</li><li> ap-guangzhou-3 </li><li> ap-guangzhou-4 </li><li> ap-guangzhou-6 </li><li> ap-guangzhou-7 </li><li> ap-tokyo-1 </li><li> ap-tokyo-2 </li><li> ap-singapore-1 </li><li> ap-singapore-2 </li><li> ap-singapore-3 </li><li>ap-singapore-4 </li><li> ap-shanghai-fsi-2 </li><li> ap-shanghai-fsi-3 </li><li> ap-shanghai-fsi-4 </li><li> ap-bangkok-1 </li><li> ap-bangkok-2 </li><li> ap-shanghai-2 </li><li> ap-shanghai-3 </li><li> ap-shanghai-4 </li><li> ap-shanghai-5 </li><li> ap-shanghai-8 </li><li> ap-mumbai-1 </li><li> ap-mumbai-2 </li><li> ap-beijing-1（售罄）</li><li> ap-beijing-3 </li><li> ap-beijing-4 </li><li> ap-beijing-5 </li><li> ap-beijing-6 </li><li> ap-beijing-7 </li><li> na-siliconvalley-1 </li><li> na-siliconvalley-2 </li><li> eu-frankfurt-1 </li><li> eu-frankfurt-2 </li><li> na-ashburn-1 </li><li> na-ashburn-2 </li><li> ap-nanjing-1 </li><li> ap-nanjing-2 </li><li> ap-nanjing-3 </li><li> sa-saopaulo-1</li><li> ap-jakarta-1 </li><li> ap-jakarta-2 </li>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>可用区名称，例如，ap-guangzhou-3<br>全网可用区名称如下：</p><li> ap-chongqing-1 </li><li> ap-seoul-1 </li><li> ap-seoul-2 </li><li> ap-chengdu-1 </li><li> ap-chengdu-2 </li><li> ap-hongkong-1（售罄） </li><li> ap-hongkong-2 </li><li> ap-hongkong-3 </li><li> ap-shenzhen-fsi-1 </li><li> ap-shenzhen-fsi-2 </li><li> ap-shenzhen-fsi-3（售罄） </li><li> ap-guangzhou-1（售罄）</li><li> ap-guangzhou-2（售罄）</li><li> ap-guangzhou-3 </li><li> ap-guangzhou-4 </li><li> ap-guangzhou-6 </li><li> ap-guangzhou-7 </li><li> ap-tokyo-1 </li><li> ap-tokyo-2 </li><li> ap-singapore-1 </li><li> ap-singapore-2 </li><li> ap-singapore-3 </li><li>ap-singapore-4 </li><li> ap-shanghai-fsi-2 </li><li> ap-shanghai-fsi-3 </li><li> ap-shanghai-fsi-4 </li><li> ap-bangkok-1 </li><li> ap-bangkok-2 </li><li> ap-shanghai-2 </li><li> ap-shanghai-3 </li><li> ap-shanghai-4 </li><li> ap-shanghai-5 </li><li> ap-shanghai-8 </li><li> ap-mumbai-1 </li><li> ap-mumbai-2 </li><li> ap-beijing-1（售罄）</li><li> ap-beijing-3 </li><li> ap-beijing-4 </li><li> ap-beijing-5 </li><li> ap-beijing-6 </li><li> ap-beijing-7 </li><li> na-siliconvalley-1 </li><li> na-siliconvalley-2 </li><li> eu-frankfurt-1 </li><li> eu-frankfurt-2 </li><li> na-ashburn-1 </li><li> na-ashburn-2 </li><li> ap-nanjing-1 </li><li> ap-nanjing-2 </li><li> ap-nanjing-3 </li><li> sa-saopaulo-1</li><li> ap-jakarta-1 </li><li> ap-jakarta-2 </li>
     * @param Zone <p>可用区名称，例如，ap-guangzhou-3<br>全网可用区名称如下：</p><li> ap-chongqing-1 </li><li> ap-seoul-1 </li><li> ap-seoul-2 </li><li> ap-chengdu-1 </li><li> ap-chengdu-2 </li><li> ap-hongkong-1（售罄） </li><li> ap-hongkong-2 </li><li> ap-hongkong-3 </li><li> ap-shenzhen-fsi-1 </li><li> ap-shenzhen-fsi-2 </li><li> ap-shenzhen-fsi-3（售罄） </li><li> ap-guangzhou-1（售罄）</li><li> ap-guangzhou-2（售罄）</li><li> ap-guangzhou-3 </li><li> ap-guangzhou-4 </li><li> ap-guangzhou-6 </li><li> ap-guangzhou-7 </li><li> ap-tokyo-1 </li><li> ap-tokyo-2 </li><li> ap-singapore-1 </li><li> ap-singapore-2 </li><li> ap-singapore-3 </li><li>ap-singapore-4 </li><li> ap-shanghai-fsi-2 </li><li> ap-shanghai-fsi-3 </li><li> ap-shanghai-fsi-4 </li><li> ap-bangkok-1 </li><li> ap-bangkok-2 </li><li> ap-shanghai-2 </li><li> ap-shanghai-3 </li><li> ap-shanghai-4 </li><li> ap-shanghai-5 </li><li> ap-shanghai-8 </li><li> ap-mumbai-1 </li><li> ap-mumbai-2 </li><li> ap-beijing-1（售罄）</li><li> ap-beijing-3 </li><li> ap-beijing-4 </li><li> ap-beijing-5 </li><li> ap-beijing-6 </li><li> ap-beijing-7 </li><li> na-siliconvalley-1 </li><li> na-siliconvalley-2 </li><li> eu-frankfurt-1 </li><li> eu-frankfurt-2 </li><li> na-ashburn-1 </li><li> na-ashburn-2 </li><li> ap-nanjing-1 </li><li> ap-nanjing-2 </li><li> ap-nanjing-3 </li><li> sa-saopaulo-1</li><li> ap-jakarta-1 </li><li> ap-jakarta-2 </li>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>可用区描述，例如，广州三区</p> 
     * @return ZoneName <p>可用区描述，例如，广州三区</p>
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set <p>可用区描述，例如，广州三区</p>
     * @param ZoneName <p>可用区描述，例如，广州三区</p>
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get <p>可用区ID</p> 
     * @return ZoneId <p>可用区ID</p>
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>可用区ID</p>
     * @param ZoneId <p>可用区ID</p>
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>可用区状态，包含AVAILABLE和UNAVAILABLE。AVAILABLE代表可用，UNAVAILABLE代表不可用。</p> 
     * @return ZoneState <p>可用区状态，包含AVAILABLE和UNAVAILABLE。AVAILABLE代表可用，UNAVAILABLE代表不可用。</p>
     */
    public String getZoneState() {
        return this.ZoneState;
    }

    /**
     * Set <p>可用区状态，包含AVAILABLE和UNAVAILABLE。AVAILABLE代表可用，UNAVAILABLE代表不可用。</p>
     * @param ZoneState <p>可用区状态，包含AVAILABLE和UNAVAILABLE。AVAILABLE代表可用，UNAVAILABLE代表不可用。</p>
     */
    public void setZoneState(String ZoneState) {
        this.ZoneState = ZoneState;
    }

    public ZoneInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ZoneInfo(ZoneInfo source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.ZoneState != null) {
            this.ZoneState = new String(source.ZoneState);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ZoneState", this.ZoneState);

    }
}

