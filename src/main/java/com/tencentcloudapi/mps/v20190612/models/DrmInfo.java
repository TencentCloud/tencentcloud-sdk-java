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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DrmInfo extends AbstractModel {

    /**
    * 加密类型：

- simpleaes
只能用于HLS，切片格式支持ts和mp4
只能使用切片模式，不能使用singlefile模式

- fairplay：
只能用于HLS，切片格式只能是mp4
可以使用切片模式或singlefile模式

- widevine：
可以用于HLS和DASH，切片格式只能是mp4
输出HLS：可以使用切片模式或singlefile模式
输出DASH：只能singlefile模式

- playready：
可以用于HLS和DASH，切片格式只能是mp4
输出HLS：可以使用切片模式或singlefile模式
输出DASH：只能singlefile模式

- widevine+fairplay，playready+fairplay，widevine+playready+fairplay:
 只能用于HLS，切片格式只能是mp4
 可以使用切片模式或singfile模式

- widevine+playready:
 可用于HLS、MPEG-DASH，切片格式只能是mp4
 HLS格式时，可以使用切片模式或singfile模式
 MPEG-DASH时，只能使用singlefile模式
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * SimpleAes 加密信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SimpleAesDrm")
    @Expose
    private SimpleAesDrm SimpleAesDrm;

    /**
    * FairPlay，WideVine，PlayReady 加密信息。
    */
    @SerializedName("SpekeDrm")
    @Expose
    private SpekeDrm SpekeDrm;

    /**
     * Get 加密类型：

- simpleaes
只能用于HLS，切片格式支持ts和mp4
只能使用切片模式，不能使用singlefile模式

- fairplay：
只能用于HLS，切片格式只能是mp4
可以使用切片模式或singlefile模式

- widevine：
可以用于HLS和DASH，切片格式只能是mp4
输出HLS：可以使用切片模式或singlefile模式
输出DASH：只能singlefile模式

- playready：
可以用于HLS和DASH，切片格式只能是mp4
输出HLS：可以使用切片模式或singlefile模式
输出DASH：只能singlefile模式

- widevine+fairplay，playready+fairplay，widevine+playready+fairplay:
 只能用于HLS，切片格式只能是mp4
 可以使用切片模式或singfile模式

- widevine+playready:
 可用于HLS、MPEG-DASH，切片格式只能是mp4
 HLS格式时，可以使用切片模式或singfile模式
 MPEG-DASH时，只能使用singlefile模式 
     * @return Type 加密类型：

- simpleaes
只能用于HLS，切片格式支持ts和mp4
只能使用切片模式，不能使用singlefile模式

- fairplay：
只能用于HLS，切片格式只能是mp4
可以使用切片模式或singlefile模式

- widevine：
可以用于HLS和DASH，切片格式只能是mp4
输出HLS：可以使用切片模式或singlefile模式
输出DASH：只能singlefile模式

- playready：
可以用于HLS和DASH，切片格式只能是mp4
输出HLS：可以使用切片模式或singlefile模式
输出DASH：只能singlefile模式

- widevine+fairplay，playready+fairplay，widevine+playready+fairplay:
 只能用于HLS，切片格式只能是mp4
 可以使用切片模式或singfile模式

- widevine+playready:
 可用于HLS、MPEG-DASH，切片格式只能是mp4
 HLS格式时，可以使用切片模式或singfile模式
 MPEG-DASH时，只能使用singlefile模式
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 加密类型：

- simpleaes
只能用于HLS，切片格式支持ts和mp4
只能使用切片模式，不能使用singlefile模式

- fairplay：
只能用于HLS，切片格式只能是mp4
可以使用切片模式或singlefile模式

- widevine：
可以用于HLS和DASH，切片格式只能是mp4
输出HLS：可以使用切片模式或singlefile模式
输出DASH：只能singlefile模式

- playready：
可以用于HLS和DASH，切片格式只能是mp4
输出HLS：可以使用切片模式或singlefile模式
输出DASH：只能singlefile模式

- widevine+fairplay，playready+fairplay，widevine+playready+fairplay:
 只能用于HLS，切片格式只能是mp4
 可以使用切片模式或singfile模式

- widevine+playready:
 可用于HLS、MPEG-DASH，切片格式只能是mp4
 HLS格式时，可以使用切片模式或singfile模式
 MPEG-DASH时，只能使用singlefile模式
     * @param Type 加密类型：

- simpleaes
只能用于HLS，切片格式支持ts和mp4
只能使用切片模式，不能使用singlefile模式

- fairplay：
只能用于HLS，切片格式只能是mp4
可以使用切片模式或singlefile模式

- widevine：
可以用于HLS和DASH，切片格式只能是mp4
输出HLS：可以使用切片模式或singlefile模式
输出DASH：只能singlefile模式

- playready：
可以用于HLS和DASH，切片格式只能是mp4
输出HLS：可以使用切片模式或singlefile模式
输出DASH：只能singlefile模式

- widevine+fairplay，playready+fairplay，widevine+playready+fairplay:
 只能用于HLS，切片格式只能是mp4
 可以使用切片模式或singfile模式

- widevine+playready:
 可用于HLS、MPEG-DASH，切片格式只能是mp4
 HLS格式时，可以使用切片模式或singfile模式
 MPEG-DASH时，只能使用singlefile模式
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get SimpleAes 加密信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SimpleAesDrm SimpleAes 加密信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SimpleAesDrm getSimpleAesDrm() {
        return this.SimpleAesDrm;
    }

    /**
     * Set SimpleAes 加密信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SimpleAesDrm SimpleAes 加密信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSimpleAesDrm(SimpleAesDrm SimpleAesDrm) {
        this.SimpleAesDrm = SimpleAesDrm;
    }

    /**
     * Get FairPlay，WideVine，PlayReady 加密信息。 
     * @return SpekeDrm FairPlay，WideVine，PlayReady 加密信息。
     */
    public SpekeDrm getSpekeDrm() {
        return this.SpekeDrm;
    }

    /**
     * Set FairPlay，WideVine，PlayReady 加密信息。
     * @param SpekeDrm FairPlay，WideVine，PlayReady 加密信息。
     */
    public void setSpekeDrm(SpekeDrm SpekeDrm) {
        this.SpekeDrm = SpekeDrm;
    }

    public DrmInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DrmInfo(DrmInfo source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.SimpleAesDrm != null) {
            this.SimpleAesDrm = new SimpleAesDrm(source.SimpleAesDrm);
        }
        if (source.SpekeDrm != null) {
            this.SpekeDrm = new SpekeDrm(source.SpekeDrm);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "SimpleAesDrm.", this.SimpleAesDrm);
        this.setParamObj(map, prefix + "SpekeDrm.", this.SpekeDrm);

    }
}

