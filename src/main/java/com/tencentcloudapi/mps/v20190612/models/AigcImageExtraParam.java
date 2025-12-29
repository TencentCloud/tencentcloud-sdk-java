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

public class AigcImageExtraParam extends AbstractModel {

    /**
    * 指定所生成视频的宽高比。

不同模型支持的宽高比:
1. GEM支持：1:1、3:2、2:3、3:4、4:3、4:5、5:4、9:16、16:9 和 21:9。
2. Jimeng：合用户prompt意图、参考图尺寸，由模型智能判断生图宽高比。

注：具体模型的宽高比参数，可查看相应模型官网获取更完整描述。
    */
    @SerializedName("AspectRatio")
    @Expose
    private String AspectRatio;

    /**
    * 指定图片输出分辨率。

支持该参数的模型：
支持选择: 720P, 1080P, 2K, 4K。

1. Jimeng推荐通过prompt指定图片分辨率和宽高比。
    2K
    2048x2048 （1:1）
    2304x1728（4:3）
    2496x1664 （3:2）
    2560x1440 （16:9）
    3024x1296 （21:9）
    4K
    4096x4096 （1:1）
    4694x3520（4:3）
    4992x3328 （3:2）
    5404x3040 （16:9）
    6198x2656 （21:9）
    */
    @SerializedName("Resolution")
    @Expose
    private String Resolution;

    /**
     * Get 指定所生成视频的宽高比。

不同模型支持的宽高比:
1. GEM支持：1:1、3:2、2:3、3:4、4:3、4:5、5:4、9:16、16:9 和 21:9。
2. Jimeng：合用户prompt意图、参考图尺寸，由模型智能判断生图宽高比。

注：具体模型的宽高比参数，可查看相应模型官网获取更完整描述。 
     * @return AspectRatio 指定所生成视频的宽高比。

不同模型支持的宽高比:
1. GEM支持：1:1、3:2、2:3、3:4、4:3、4:5、5:4、9:16、16:9 和 21:9。
2. Jimeng：合用户prompt意图、参考图尺寸，由模型智能判断生图宽高比。

注：具体模型的宽高比参数，可查看相应模型官网获取更完整描述。
     */
    public String getAspectRatio() {
        return this.AspectRatio;
    }

    /**
     * Set 指定所生成视频的宽高比。

不同模型支持的宽高比:
1. GEM支持：1:1、3:2、2:3、3:4、4:3、4:5、5:4、9:16、16:9 和 21:9。
2. Jimeng：合用户prompt意图、参考图尺寸，由模型智能判断生图宽高比。

注：具体模型的宽高比参数，可查看相应模型官网获取更完整描述。
     * @param AspectRatio 指定所生成视频的宽高比。

不同模型支持的宽高比:
1. GEM支持：1:1、3:2、2:3、3:4、4:3、4:5、5:4、9:16、16:9 和 21:9。
2. Jimeng：合用户prompt意图、参考图尺寸，由模型智能判断生图宽高比。

注：具体模型的宽高比参数，可查看相应模型官网获取更完整描述。
     */
    public void setAspectRatio(String AspectRatio) {
        this.AspectRatio = AspectRatio;
    }

    /**
     * Get 指定图片输出分辨率。

支持该参数的模型：
支持选择: 720P, 1080P, 2K, 4K。

1. Jimeng推荐通过prompt指定图片分辨率和宽高比。
    2K
    2048x2048 （1:1）
    2304x1728（4:3）
    2496x1664 （3:2）
    2560x1440 （16:9）
    3024x1296 （21:9）
    4K
    4096x4096 （1:1）
    4694x3520（4:3）
    4992x3328 （3:2）
    5404x3040 （16:9）
    6198x2656 （21:9） 
     * @return Resolution 指定图片输出分辨率。

支持该参数的模型：
支持选择: 720P, 1080P, 2K, 4K。

1. Jimeng推荐通过prompt指定图片分辨率和宽高比。
    2K
    2048x2048 （1:1）
    2304x1728（4:3）
    2496x1664 （3:2）
    2560x1440 （16:9）
    3024x1296 （21:9）
    4K
    4096x4096 （1:1）
    4694x3520（4:3）
    4992x3328 （3:2）
    5404x3040 （16:9）
    6198x2656 （21:9）
     */
    public String getResolution() {
        return this.Resolution;
    }

    /**
     * Set 指定图片输出分辨率。

支持该参数的模型：
支持选择: 720P, 1080P, 2K, 4K。

1. Jimeng推荐通过prompt指定图片分辨率和宽高比。
    2K
    2048x2048 （1:1）
    2304x1728（4:3）
    2496x1664 （3:2）
    2560x1440 （16:9）
    3024x1296 （21:9）
    4K
    4096x4096 （1:1）
    4694x3520（4:3）
    4992x3328 （3:2）
    5404x3040 （16:9）
    6198x2656 （21:9）
     * @param Resolution 指定图片输出分辨率。

支持该参数的模型：
支持选择: 720P, 1080P, 2K, 4K。

1. Jimeng推荐通过prompt指定图片分辨率和宽高比。
    2K
    2048x2048 （1:1）
    2304x1728（4:3）
    2496x1664 （3:2）
    2560x1440 （16:9）
    3024x1296 （21:9）
    4K
    4096x4096 （1:1）
    4694x3520（4:3）
    4992x3328 （3:2）
    5404x3040 （16:9）
    6198x2656 （21:9）
     */
    public void setResolution(String Resolution) {
        this.Resolution = Resolution;
    }

    public AigcImageExtraParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AigcImageExtraParam(AigcImageExtraParam source) {
        if (source.AspectRatio != null) {
            this.AspectRatio = new String(source.AspectRatio);
        }
        if (source.Resolution != null) {
            this.Resolution = new String(source.Resolution);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AspectRatio", this.AspectRatio);
        this.setParamSimple(map, prefix + "Resolution", this.Resolution);

    }
}

