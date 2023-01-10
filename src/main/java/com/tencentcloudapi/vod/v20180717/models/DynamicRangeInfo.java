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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DynamicRangeInfo extends AbstractModel{

    /**
    * 画面动态范围信息。可取值：
<li>SDR：Standard Dynamic Range 标准动态范围；</li>
<li>HDR：High Dynamic Range 高动态范围。</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 高动态范围类型，当 Type 为 HDR 时有效。目前支持的可取值：
<li>hdr10：表示 hdr10 标准；</li>
<li>hlg：表示 hlg 标准。</li>
    */
    @SerializedName("HDRType")
    @Expose
    private String HDRType;

    /**
     * Get 画面动态范围信息。可取值：
<li>SDR：Standard Dynamic Range 标准动态范围；</li>
<li>HDR：High Dynamic Range 高动态范围。</li> 
     * @return Type 画面动态范围信息。可取值：
<li>SDR：Standard Dynamic Range 标准动态范围；</li>
<li>HDR：High Dynamic Range 高动态范围。</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 画面动态范围信息。可取值：
<li>SDR：Standard Dynamic Range 标准动态范围；</li>
<li>HDR：High Dynamic Range 高动态范围。</li>
     * @param Type 画面动态范围信息。可取值：
<li>SDR：Standard Dynamic Range 标准动态范围；</li>
<li>HDR：High Dynamic Range 高动态范围。</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 高动态范围类型，当 Type 为 HDR 时有效。目前支持的可取值：
<li>hdr10：表示 hdr10 标准；</li>
<li>hlg：表示 hlg 标准。</li> 
     * @return HDRType 高动态范围类型，当 Type 为 HDR 时有效。目前支持的可取值：
<li>hdr10：表示 hdr10 标准；</li>
<li>hlg：表示 hlg 标准。</li>
     */
    public String getHDRType() {
        return this.HDRType;
    }

    /**
     * Set 高动态范围类型，当 Type 为 HDR 时有效。目前支持的可取值：
<li>hdr10：表示 hdr10 标准；</li>
<li>hlg：表示 hlg 标准。</li>
     * @param HDRType 高动态范围类型，当 Type 为 HDR 时有效。目前支持的可取值：
<li>hdr10：表示 hdr10 标准；</li>
<li>hlg：表示 hlg 标准。</li>
     */
    public void setHDRType(String HDRType) {
        this.HDRType = HDRType;
    }

    public DynamicRangeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DynamicRangeInfo(DynamicRangeInfo source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.HDRType != null) {
            this.HDRType = new String(source.HDRType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "HDRType", this.HDRType);

    }
}

