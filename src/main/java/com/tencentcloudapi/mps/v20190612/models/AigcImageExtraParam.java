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
    * <p>指定所生成视频的宽高比。</p><p>不同模型支持的宽高比:</p><ol><li>GEM支持：1:1、3:2、2:3、3:4、4:3、4:5、5:4、9:16、16:9 和 21:9。</li></ol><p>注：具体模型的宽高比参数，可查看相应模型官网获取更完整描述。</p>
    */
    @SerializedName("AspectRatio")
    @Expose
    private String AspectRatio;

    /**
    * <p>指定图片输出分辨率。</p><p>支持该参数的模型：<br>支持选择: 720P, 1080P, 2K, 4K。</p>
    */
    @SerializedName("Resolution")
    @Expose
    private String Resolution;

    /**
    * <p>是否添加图标水印。默认不加。1-添加，0-不添加。</p><p>取值范围：[0, 1]</p><p>默认值：0</p>
    */
    @SerializedName("LogoAdd")
    @Expose
    private Long LogoAdd;

    /**
     * Get <p>指定所生成视频的宽高比。</p><p>不同模型支持的宽高比:</p><ol><li>GEM支持：1:1、3:2、2:3、3:4、4:3、4:5、5:4、9:16、16:9 和 21:9。</li></ol><p>注：具体模型的宽高比参数，可查看相应模型官网获取更完整描述。</p> 
     * @return AspectRatio <p>指定所生成视频的宽高比。</p><p>不同模型支持的宽高比:</p><ol><li>GEM支持：1:1、3:2、2:3、3:4、4:3、4:5、5:4、9:16、16:9 和 21:9。</li></ol><p>注：具体模型的宽高比参数，可查看相应模型官网获取更完整描述。</p>
     */
    public String getAspectRatio() {
        return this.AspectRatio;
    }

    /**
     * Set <p>指定所生成视频的宽高比。</p><p>不同模型支持的宽高比:</p><ol><li>GEM支持：1:1、3:2、2:3、3:4、4:3、4:5、5:4、9:16、16:9 和 21:9。</li></ol><p>注：具体模型的宽高比参数，可查看相应模型官网获取更完整描述。</p>
     * @param AspectRatio <p>指定所生成视频的宽高比。</p><p>不同模型支持的宽高比:</p><ol><li>GEM支持：1:1、3:2、2:3、3:4、4:3、4:5、5:4、9:16、16:9 和 21:9。</li></ol><p>注：具体模型的宽高比参数，可查看相应模型官网获取更完整描述。</p>
     */
    public void setAspectRatio(String AspectRatio) {
        this.AspectRatio = AspectRatio;
    }

    /**
     * Get <p>指定图片输出分辨率。</p><p>支持该参数的模型：<br>支持选择: 720P, 1080P, 2K, 4K。</p> 
     * @return Resolution <p>指定图片输出分辨率。</p><p>支持该参数的模型：<br>支持选择: 720P, 1080P, 2K, 4K。</p>
     */
    public String getResolution() {
        return this.Resolution;
    }

    /**
     * Set <p>指定图片输出分辨率。</p><p>支持该参数的模型：<br>支持选择: 720P, 1080P, 2K, 4K。</p>
     * @param Resolution <p>指定图片输出分辨率。</p><p>支持该参数的模型：<br>支持选择: 720P, 1080P, 2K, 4K。</p>
     */
    public void setResolution(String Resolution) {
        this.Resolution = Resolution;
    }

    /**
     * Get <p>是否添加图标水印。默认不加。1-添加，0-不添加。</p><p>取值范围：[0, 1]</p><p>默认值：0</p> 
     * @return LogoAdd <p>是否添加图标水印。默认不加。1-添加，0-不添加。</p><p>取值范围：[0, 1]</p><p>默认值：0</p>
     */
    public Long getLogoAdd() {
        return this.LogoAdd;
    }

    /**
     * Set <p>是否添加图标水印。默认不加。1-添加，0-不添加。</p><p>取值范围：[0, 1]</p><p>默认值：0</p>
     * @param LogoAdd <p>是否添加图标水印。默认不加。1-添加，0-不添加。</p><p>取值范围：[0, 1]</p><p>默认值：0</p>
     */
    public void setLogoAdd(Long LogoAdd) {
        this.LogoAdd = LogoAdd;
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
        if (source.LogoAdd != null) {
            this.LogoAdd = new Long(source.LogoAdd);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AspectRatio", this.AspectRatio);
        this.setParamSimple(map, prefix + "Resolution", this.Resolution);
        this.setParamSimple(map, prefix + "LogoAdd", this.LogoAdd);

    }
}

