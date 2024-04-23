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
package com.tencentcloudapi.aiart.v20221229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Filter extends AbstractModel {

    /**
    * 过滤不满足分辨率下限的训练图像，默认开启过滤
开启后将过滤横边<512或竖边<720的图片，横、竖边上限均为2000，不支持调整

1：开启过滤
0：关闭过滤
    */
    @SerializedName("Resolution")
    @Expose
    private Long Resolution;

    /**
    * 过滤脸部区域过小的训练图像，默认开启过滤

1：开启过滤
0：关闭过滤
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * 过滤脸部存在明显遮挡、偏转角度过大等质量较差的训练图像，默认开启过滤

1：开启过滤
0：关闭过滤
    */
    @SerializedName("Occlusion")
    @Expose
    private Long Occlusion;

    /**
     * Get 过滤不满足分辨率下限的训练图像，默认开启过滤
开启后将过滤横边<512或竖边<720的图片，横、竖边上限均为2000，不支持调整

1：开启过滤
0：关闭过滤 
     * @return Resolution 过滤不满足分辨率下限的训练图像，默认开启过滤
开启后将过滤横边<512或竖边<720的图片，横、竖边上限均为2000，不支持调整

1：开启过滤
0：关闭过滤
     */
    public Long getResolution() {
        return this.Resolution;
    }

    /**
     * Set 过滤不满足分辨率下限的训练图像，默认开启过滤
开启后将过滤横边<512或竖边<720的图片，横、竖边上限均为2000，不支持调整

1：开启过滤
0：关闭过滤
     * @param Resolution 过滤不满足分辨率下限的训练图像，默认开启过滤
开启后将过滤横边<512或竖边<720的图片，横、竖边上限均为2000，不支持调整

1：开启过滤
0：关闭过滤
     */
    public void setResolution(Long Resolution) {
        this.Resolution = Resolution;
    }

    /**
     * Get 过滤脸部区域过小的训练图像，默认开启过滤

1：开启过滤
0：关闭过滤 
     * @return Size 过滤脸部区域过小的训练图像，默认开启过滤

1：开启过滤
0：关闭过滤
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 过滤脸部区域过小的训练图像，默认开启过滤

1：开启过滤
0：关闭过滤
     * @param Size 过滤脸部区域过小的训练图像，默认开启过滤

1：开启过滤
0：关闭过滤
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get 过滤脸部存在明显遮挡、偏转角度过大等质量较差的训练图像，默认开启过滤

1：开启过滤
0：关闭过滤 
     * @return Occlusion 过滤脸部存在明显遮挡、偏转角度过大等质量较差的训练图像，默认开启过滤

1：开启过滤
0：关闭过滤
     */
    public Long getOcclusion() {
        return this.Occlusion;
    }

    /**
     * Set 过滤脸部存在明显遮挡、偏转角度过大等质量较差的训练图像，默认开启过滤

1：开启过滤
0：关闭过滤
     * @param Occlusion 过滤脸部存在明显遮挡、偏转角度过大等质量较差的训练图像，默认开启过滤

1：开启过滤
0：关闭过滤
     */
    public void setOcclusion(Long Occlusion) {
        this.Occlusion = Occlusion;
    }

    public Filter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Filter(Filter source) {
        if (source.Resolution != null) {
            this.Resolution = new Long(source.Resolution);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.Occlusion != null) {
            this.Occlusion = new Long(source.Occlusion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Resolution", this.Resolution);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "Occlusion", this.Occlusion);

    }
}

