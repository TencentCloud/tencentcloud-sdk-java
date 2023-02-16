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

public class HDRInfo extends AbstractModel{

    /**
    * 高动态范围类型控制开关，可选值：
<li>ON：开启高动态范围类型转换；</li>
<li>OFF：关闭高动态范围类型转换。</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 高动态范围类型，可选值：
<li>hdr10：表示 hdr10 标准；</li>
<li>hlg：表示 hlg 标准。</li>

注意：
<li> 仅当高动态范围类型控制开关为 ON 时有效；</li>
<li>当画质重生目标参数中指定视频输出参数的视频流编码格式 Codec 为 libx265 时有效。</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get 高动态范围类型控制开关，可选值：
<li>ON：开启高动态范围类型转换；</li>
<li>OFF：关闭高动态范围类型转换。</li> 
     * @return Switch 高动态范围类型控制开关，可选值：
<li>ON：开启高动态范围类型转换；</li>
<li>OFF：关闭高动态范围类型转换。</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 高动态范围类型控制开关，可选值：
<li>ON：开启高动态范围类型转换；</li>
<li>OFF：关闭高动态范围类型转换。</li>
     * @param Switch 高动态范围类型控制开关，可选值：
<li>ON：开启高动态范围类型转换；</li>
<li>OFF：关闭高动态范围类型转换。</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 高动态范围类型，可选值：
<li>hdr10：表示 hdr10 标准；</li>
<li>hlg：表示 hlg 标准。</li>

注意：
<li> 仅当高动态范围类型控制开关为 ON 时有效；</li>
<li>当画质重生目标参数中指定视频输出参数的视频流编码格式 Codec 为 libx265 时有效。</li> 
     * @return Type 高动态范围类型，可选值：
<li>hdr10：表示 hdr10 标准；</li>
<li>hlg：表示 hlg 标准。</li>

注意：
<li> 仅当高动态范围类型控制开关为 ON 时有效；</li>
<li>当画质重生目标参数中指定视频输出参数的视频流编码格式 Codec 为 libx265 时有效。</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 高动态范围类型，可选值：
<li>hdr10：表示 hdr10 标准；</li>
<li>hlg：表示 hlg 标准。</li>

注意：
<li> 仅当高动态范围类型控制开关为 ON 时有效；</li>
<li>当画质重生目标参数中指定视频输出参数的视频流编码格式 Codec 为 libx265 时有效。</li>
     * @param Type 高动态范围类型，可选值：
<li>hdr10：表示 hdr10 标准；</li>
<li>hlg：表示 hlg 标准。</li>

注意：
<li> 仅当高动态范围类型控制开关为 ON 时有效；</li>
<li>当画质重生目标参数中指定视频输出参数的视频流编码格式 Codec 为 libx265 时有效。</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public HDRInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HDRInfo(HDRInfo source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

