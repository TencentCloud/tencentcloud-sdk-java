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

public class AigcVideoExtraParam extends AbstractModel {

    /**
    * 生成视频的分辨率，分辨率与选择模型及设置的视频时长相关。 

不同模型支持的分辨率选项:
1. Kling 720P(默认), 1080P。
2. Hailuo 768P(默认), 1080P。
3. Vidu 720P(默认)，1080P。
4. GV 720P(默认),1080P。
5. OS 720P, 图片仅支持1280x720、720x1280，暂不支持指定。

注意：除模型可支持的分辨率外，还可以生成 2K、4K分辨率。
    */
    @SerializedName("Resolution")
    @Expose
    private String Resolution;

    /**
    * 指定所生成视频的宽高比。 

不同模型对于此参数的支持：
1. Kling 仅文生视频支持, 16:9(默认值)、9:16、 1:1。
2. Hailuo 暂不支持。
3. Vidu 仅文生和参考图生视频 支持[16:9、9:16、4:3、3:4、1:1]，其中仅q2支持4:3、3:4。
4. GV 16:9(默认值)、9:16。
5. OS 仅文生视频支持, 16:9(默认), 9:16。

注：关于具体模型支持的宽高比例，可查看具体模型官网介绍获取更完整描述。
    */
    @SerializedName("AspectRatio")
    @Expose
    private String AspectRatio;

    /**
     * Get 生成视频的分辨率，分辨率与选择模型及设置的视频时长相关。 

不同模型支持的分辨率选项:
1. Kling 720P(默认), 1080P。
2. Hailuo 768P(默认), 1080P。
3. Vidu 720P(默认)，1080P。
4. GV 720P(默认),1080P。
5. OS 720P, 图片仅支持1280x720、720x1280，暂不支持指定。

注意：除模型可支持的分辨率外，还可以生成 2K、4K分辨率。 
     * @return Resolution 生成视频的分辨率，分辨率与选择模型及设置的视频时长相关。 

不同模型支持的分辨率选项:
1. Kling 720P(默认), 1080P。
2. Hailuo 768P(默认), 1080P。
3. Vidu 720P(默认)，1080P。
4. GV 720P(默认),1080P。
5. OS 720P, 图片仅支持1280x720、720x1280，暂不支持指定。

注意：除模型可支持的分辨率外，还可以生成 2K、4K分辨率。
     */
    public String getResolution() {
        return this.Resolution;
    }

    /**
     * Set 生成视频的分辨率，分辨率与选择模型及设置的视频时长相关。 

不同模型支持的分辨率选项:
1. Kling 720P(默认), 1080P。
2. Hailuo 768P(默认), 1080P。
3. Vidu 720P(默认)，1080P。
4. GV 720P(默认),1080P。
5. OS 720P, 图片仅支持1280x720、720x1280，暂不支持指定。

注意：除模型可支持的分辨率外，还可以生成 2K、4K分辨率。
     * @param Resolution 生成视频的分辨率，分辨率与选择模型及设置的视频时长相关。 

不同模型支持的分辨率选项:
1. Kling 720P(默认), 1080P。
2. Hailuo 768P(默认), 1080P。
3. Vidu 720P(默认)，1080P。
4. GV 720P(默认),1080P。
5. OS 720P, 图片仅支持1280x720、720x1280，暂不支持指定。

注意：除模型可支持的分辨率外，还可以生成 2K、4K分辨率。
     */
    public void setResolution(String Resolution) {
        this.Resolution = Resolution;
    }

    /**
     * Get 指定所生成视频的宽高比。 

不同模型对于此参数的支持：
1. Kling 仅文生视频支持, 16:9(默认值)、9:16、 1:1。
2. Hailuo 暂不支持。
3. Vidu 仅文生和参考图生视频 支持[16:9、9:16、4:3、3:4、1:1]，其中仅q2支持4:3、3:4。
4. GV 16:9(默认值)、9:16。
5. OS 仅文生视频支持, 16:9(默认), 9:16。

注：关于具体模型支持的宽高比例，可查看具体模型官网介绍获取更完整描述。 
     * @return AspectRatio 指定所生成视频的宽高比。 

不同模型对于此参数的支持：
1. Kling 仅文生视频支持, 16:9(默认值)、9:16、 1:1。
2. Hailuo 暂不支持。
3. Vidu 仅文生和参考图生视频 支持[16:9、9:16、4:3、3:4、1:1]，其中仅q2支持4:3、3:4。
4. GV 16:9(默认值)、9:16。
5. OS 仅文生视频支持, 16:9(默认), 9:16。

注：关于具体模型支持的宽高比例，可查看具体模型官网介绍获取更完整描述。
     */
    public String getAspectRatio() {
        return this.AspectRatio;
    }

    /**
     * Set 指定所生成视频的宽高比。 

不同模型对于此参数的支持：
1. Kling 仅文生视频支持, 16:9(默认值)、9:16、 1:1。
2. Hailuo 暂不支持。
3. Vidu 仅文生和参考图生视频 支持[16:9、9:16、4:3、3:4、1:1]，其中仅q2支持4:3、3:4。
4. GV 16:9(默认值)、9:16。
5. OS 仅文生视频支持, 16:9(默认), 9:16。

注：关于具体模型支持的宽高比例，可查看具体模型官网介绍获取更完整描述。
     * @param AspectRatio 指定所生成视频的宽高比。 

不同模型对于此参数的支持：
1. Kling 仅文生视频支持, 16:9(默认值)、9:16、 1:1。
2. Hailuo 暂不支持。
3. Vidu 仅文生和参考图生视频 支持[16:9、9:16、4:3、3:4、1:1]，其中仅q2支持4:3、3:4。
4. GV 16:9(默认值)、9:16。
5. OS 仅文生视频支持, 16:9(默认), 9:16。

注：关于具体模型支持的宽高比例，可查看具体模型官网介绍获取更完整描述。
     */
    public void setAspectRatio(String AspectRatio) {
        this.AspectRatio = AspectRatio;
    }

    public AigcVideoExtraParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AigcVideoExtraParam(AigcVideoExtraParam source) {
        if (source.Resolution != null) {
            this.Resolution = new String(source.Resolution);
        }
        if (source.AspectRatio != null) {
            this.AspectRatio = new String(source.AspectRatio);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Resolution", this.Resolution);
        this.setParamSimple(map, prefix + "AspectRatio", this.AspectRatio);

    }
}

