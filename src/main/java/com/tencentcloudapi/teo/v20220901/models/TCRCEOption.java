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

public class TCRCEOption extends AbstractModel {

    /**
    * Channel 信息。
    */
    @SerializedName("Channel")
    @Expose
    private String Channel;

    /**
    * RCE Channel 的开通地域，目前可选的取值范围：<li>ap-beijing：华北地区（北京）；</li><li>ap-jakarta：亚太东南（雅加达）；</li><li>ap-singapore：亚太东南（新加坡）；</li><li>eu-frankfurt：欧洲地区（法兰克福）；</li><li>na-siliconvalley：美国西部（硅谷）。</li>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
     * Get Channel 信息。 
     * @return Channel Channel 信息。
     */
    public String getChannel() {
        return this.Channel;
    }

    /**
     * Set Channel 信息。
     * @param Channel Channel 信息。
     */
    public void setChannel(String Channel) {
        this.Channel = Channel;
    }

    /**
     * Get RCE Channel 的开通地域，目前可选的取值范围：<li>ap-beijing：华北地区（北京）；</li><li>ap-jakarta：亚太东南（雅加达）；</li><li>ap-singapore：亚太东南（新加坡）；</li><li>eu-frankfurt：欧洲地区（法兰克福）；</li><li>na-siliconvalley：美国西部（硅谷）。</li> 
     * @return Region RCE Channel 的开通地域，目前可选的取值范围：<li>ap-beijing：华北地区（北京）；</li><li>ap-jakarta：亚太东南（雅加达）；</li><li>ap-singapore：亚太东南（新加坡）；</li><li>eu-frankfurt：欧洲地区（法兰克福）；</li><li>na-siliconvalley：美国西部（硅谷）。</li>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set RCE Channel 的开通地域，目前可选的取值范围：<li>ap-beijing：华北地区（北京）；</li><li>ap-jakarta：亚太东南（雅加达）；</li><li>ap-singapore：亚太东南（新加坡）；</li><li>eu-frankfurt：欧洲地区（法兰克福）；</li><li>na-siliconvalley：美国西部（硅谷）。</li>
     * @param Region RCE Channel 的开通地域，目前可选的取值范围：<li>ap-beijing：华北地区（北京）；</li><li>ap-jakarta：亚太东南（雅加达）；</li><li>ap-singapore：亚太东南（新加坡）；</li><li>eu-frankfurt：欧洲地区（法兰克福）；</li><li>na-siliconvalley：美国西部（硅谷）。</li>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    public TCRCEOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TCRCEOption(TCRCEOption source) {
        if (source.Channel != null) {
            this.Channel = new String(source.Channel);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Channel", this.Channel);
        this.setParamSimple(map, prefix + "Region", this.Region);

    }
}

