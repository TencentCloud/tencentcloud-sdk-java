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
package com.tencentcloudapi.ame.v20190916.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KTVMusicDefinitionInfo extends AbstractModel{

    /**
    * 规格，取值有：
<li>audio/mi：低规格；</li>
<li>audio/lo：中规格；</li>
<li>audio/hi：高规格。</li>
    */
    @SerializedName("Definition")
    @Expose
    private String Definition;

    /**
    * 码率，单位为 bps。
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
    * 文件大小，单位为字节。
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
     * Get 规格，取值有：
<li>audio/mi：低规格；</li>
<li>audio/lo：中规格；</li>
<li>audio/hi：高规格。</li> 
     * @return Definition 规格，取值有：
<li>audio/mi：低规格；</li>
<li>audio/lo：中规格；</li>
<li>audio/hi：高规格。</li>
     */
    public String getDefinition() {
        return this.Definition;
    }

    /**
     * Set 规格，取值有：
<li>audio/mi：低规格；</li>
<li>audio/lo：中规格；</li>
<li>audio/hi：高规格。</li>
     * @param Definition 规格，取值有：
<li>audio/mi：低规格；</li>
<li>audio/lo：中规格；</li>
<li>audio/hi：高规格。</li>
     */
    public void setDefinition(String Definition) {
        this.Definition = Definition;
    }

    /**
     * Get 码率，单位为 bps。 
     * @return Bitrate 码率，单位为 bps。
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set 码率，单位为 bps。
     * @param Bitrate 码率，单位为 bps。
     */
    public void setBitrate(Long Bitrate) {
        this.Bitrate = Bitrate;
    }

    /**
     * Get 文件大小，单位为字节。 
     * @return Size 文件大小，单位为字节。
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 文件大小，单位为字节。
     * @param Size 文件大小，单位为字节。
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    public KTVMusicDefinitionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KTVMusicDefinitionInfo(KTVMusicDefinitionInfo source) {
        if (source.Definition != null) {
            this.Definition = new String(source.Definition);
        }
        if (source.Bitrate != null) {
            this.Bitrate = new Long(source.Bitrate);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "Bitrate", this.Bitrate);
        this.setParamSimple(map, prefix + "Size", this.Size);

    }
}

