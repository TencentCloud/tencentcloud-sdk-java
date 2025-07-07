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

public class CachePrefreshParameters extends AbstractModel {

    /**
    * 缓存预刷新开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 预刷新时间设置为节点缓存时间的百分比数值，取值：1～99。<br>注意：当 Switch 为 on 时，此字段必填；当 Switch 为 off 时，无需填写此字段，若填写则不生效。
    */
    @SerializedName("CacheTimePercent")
    @Expose
    private Long CacheTimePercent;

    /**
     * Get 缓存预刷新开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li> 
     * @return Switch 缓存预刷新开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 缓存预刷新开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
     * @param Switch 缓存预刷新开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 预刷新时间设置为节点缓存时间的百分比数值，取值：1～99。<br>注意：当 Switch 为 on 时，此字段必填；当 Switch 为 off 时，无需填写此字段，若填写则不生效。 
     * @return CacheTimePercent 预刷新时间设置为节点缓存时间的百分比数值，取值：1～99。<br>注意：当 Switch 为 on 时，此字段必填；当 Switch 为 off 时，无需填写此字段，若填写则不生效。
     */
    public Long getCacheTimePercent() {
        return this.CacheTimePercent;
    }

    /**
     * Set 预刷新时间设置为节点缓存时间的百分比数值，取值：1～99。<br>注意：当 Switch 为 on 时，此字段必填；当 Switch 为 off 时，无需填写此字段，若填写则不生效。
     * @param CacheTimePercent 预刷新时间设置为节点缓存时间的百分比数值，取值：1～99。<br>注意：当 Switch 为 on 时，此字段必填；当 Switch 为 off 时，无需填写此字段，若填写则不生效。
     */
    public void setCacheTimePercent(Long CacheTimePercent) {
        this.CacheTimePercent = CacheTimePercent;
    }

    public CachePrefreshParameters() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CachePrefreshParameters(CachePrefreshParameters source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.CacheTimePercent != null) {
            this.CacheTimePercent = new Long(source.CacheTimePercent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "CacheTimePercent", this.CacheTimePercent);

    }
}

