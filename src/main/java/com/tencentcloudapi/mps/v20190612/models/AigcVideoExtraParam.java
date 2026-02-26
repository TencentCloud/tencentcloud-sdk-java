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
    * <p>生成视频的分辨率，分辨率与选择模型及设置的视频时长相关。 </p><p>不同模型支持的分辨率选项:</p><ol><li>Kling 720P(默认), 1080P。</li><li>Hailuo 768P(默认), 1080P。</li><li>Vidu 720P(默认)，1080P。</li><li>GV 720P(默认),1080P。</li><li>OS 720P, 图片仅支持1280x720、720x1280，暂不支持指定。</li></ol><p>注意：除模型可支持的分辨率外，还可以生成 2K、4K分辨率。</p>
    */
    @SerializedName("Resolution")
    @Expose
    private String Resolution;

    /**
    * <p>指定所生成视频的宽高比。 </p><p>不同模型对于此参数的支持：</p><ol><li>Kling 仅文生视频支持, 16:9(默认值)、9:16、 1:1。</li><li>Hailuo 暂不支持。</li><li>Vidu 仅文生和参考图生视频 支持[16:9、9:16、4:3、3:4、1:1]，其中仅q2支持4:3、3:4。</li><li>GV 16:9(默认值)、9:16。</li><li>OS 仅文生视频支持, 16:9(默认), 9:16。</li></ol><p>注：关于具体模型支持的宽高比例，可查看具体模型官网介绍获取更完整描述。</p>
    */
    @SerializedName("AspectRatio")
    @Expose
    private String AspectRatio;

    /**
    * <p>是否添加图标水印。</p><ol><li>Hailuo 支持此参数。</li><li>Kling 支持此参数。</li><li>Vidu 支持此参数。</li></ol>
    */
    @SerializedName("LogoAdd")
    @Expose
    private Long LogoAdd;

    /**
    * <p>为视频生成音频。接受的值包括 true 或 false。 </p><p>支持此参数的模型：</p><ol><li>GV，默认true。</li><li>OS，默认true。</li></ol>
    */
    @SerializedName("EnableAudio")
    @Expose
    private Boolean EnableAudio;

    /**
    * <p>错峰模型，目前仅支持Vidu模型。<br>错峰模式下提交的任务，会在48小时内生成，未能完成的任务会被自动取消。</p>
    */
    @SerializedName("OffPeak")
    @Expose
    private Boolean OffPeak;

    /**
    * <p>是否为生成的视频添加背景音乐。默认：false，可选值 true 、false。<br>注意：部分模型的版本支持。</p>
    */
    @SerializedName("EnableBgm")
    @Expose
    private Boolean EnableBgm;

    /**
     * Get <p>生成视频的分辨率，分辨率与选择模型及设置的视频时长相关。 </p><p>不同模型支持的分辨率选项:</p><ol><li>Kling 720P(默认), 1080P。</li><li>Hailuo 768P(默认), 1080P。</li><li>Vidu 720P(默认)，1080P。</li><li>GV 720P(默认),1080P。</li><li>OS 720P, 图片仅支持1280x720、720x1280，暂不支持指定。</li></ol><p>注意：除模型可支持的分辨率外，还可以生成 2K、4K分辨率。</p> 
     * @return Resolution <p>生成视频的分辨率，分辨率与选择模型及设置的视频时长相关。 </p><p>不同模型支持的分辨率选项:</p><ol><li>Kling 720P(默认), 1080P。</li><li>Hailuo 768P(默认), 1080P。</li><li>Vidu 720P(默认)，1080P。</li><li>GV 720P(默认),1080P。</li><li>OS 720P, 图片仅支持1280x720、720x1280，暂不支持指定。</li></ol><p>注意：除模型可支持的分辨率外，还可以生成 2K、4K分辨率。</p>
     */
    public String getResolution() {
        return this.Resolution;
    }

    /**
     * Set <p>生成视频的分辨率，分辨率与选择模型及设置的视频时长相关。 </p><p>不同模型支持的分辨率选项:</p><ol><li>Kling 720P(默认), 1080P。</li><li>Hailuo 768P(默认), 1080P。</li><li>Vidu 720P(默认)，1080P。</li><li>GV 720P(默认),1080P。</li><li>OS 720P, 图片仅支持1280x720、720x1280，暂不支持指定。</li></ol><p>注意：除模型可支持的分辨率外，还可以生成 2K、4K分辨率。</p>
     * @param Resolution <p>生成视频的分辨率，分辨率与选择模型及设置的视频时长相关。 </p><p>不同模型支持的分辨率选项:</p><ol><li>Kling 720P(默认), 1080P。</li><li>Hailuo 768P(默认), 1080P。</li><li>Vidu 720P(默认)，1080P。</li><li>GV 720P(默认),1080P。</li><li>OS 720P, 图片仅支持1280x720、720x1280，暂不支持指定。</li></ol><p>注意：除模型可支持的分辨率外，还可以生成 2K、4K分辨率。</p>
     */
    public void setResolution(String Resolution) {
        this.Resolution = Resolution;
    }

    /**
     * Get <p>指定所生成视频的宽高比。 </p><p>不同模型对于此参数的支持：</p><ol><li>Kling 仅文生视频支持, 16:9(默认值)、9:16、 1:1。</li><li>Hailuo 暂不支持。</li><li>Vidu 仅文生和参考图生视频 支持[16:9、9:16、4:3、3:4、1:1]，其中仅q2支持4:3、3:4。</li><li>GV 16:9(默认值)、9:16。</li><li>OS 仅文生视频支持, 16:9(默认), 9:16。</li></ol><p>注：关于具体模型支持的宽高比例，可查看具体模型官网介绍获取更完整描述。</p> 
     * @return AspectRatio <p>指定所生成视频的宽高比。 </p><p>不同模型对于此参数的支持：</p><ol><li>Kling 仅文生视频支持, 16:9(默认值)、9:16、 1:1。</li><li>Hailuo 暂不支持。</li><li>Vidu 仅文生和参考图生视频 支持[16:9、9:16、4:3、3:4、1:1]，其中仅q2支持4:3、3:4。</li><li>GV 16:9(默认值)、9:16。</li><li>OS 仅文生视频支持, 16:9(默认), 9:16。</li></ol><p>注：关于具体模型支持的宽高比例，可查看具体模型官网介绍获取更完整描述。</p>
     */
    public String getAspectRatio() {
        return this.AspectRatio;
    }

    /**
     * Set <p>指定所生成视频的宽高比。 </p><p>不同模型对于此参数的支持：</p><ol><li>Kling 仅文生视频支持, 16:9(默认值)、9:16、 1:1。</li><li>Hailuo 暂不支持。</li><li>Vidu 仅文生和参考图生视频 支持[16:9、9:16、4:3、3:4、1:1]，其中仅q2支持4:3、3:4。</li><li>GV 16:9(默认值)、9:16。</li><li>OS 仅文生视频支持, 16:9(默认), 9:16。</li></ol><p>注：关于具体模型支持的宽高比例，可查看具体模型官网介绍获取更完整描述。</p>
     * @param AspectRatio <p>指定所生成视频的宽高比。 </p><p>不同模型对于此参数的支持：</p><ol><li>Kling 仅文生视频支持, 16:9(默认值)、9:16、 1:1。</li><li>Hailuo 暂不支持。</li><li>Vidu 仅文生和参考图生视频 支持[16:9、9:16、4:3、3:4、1:1]，其中仅q2支持4:3、3:4。</li><li>GV 16:9(默认值)、9:16。</li><li>OS 仅文生视频支持, 16:9(默认), 9:16。</li></ol><p>注：关于具体模型支持的宽高比例，可查看具体模型官网介绍获取更完整描述。</p>
     */
    public void setAspectRatio(String AspectRatio) {
        this.AspectRatio = AspectRatio;
    }

    /**
     * Get <p>是否添加图标水印。</p><ol><li>Hailuo 支持此参数。</li><li>Kling 支持此参数。</li><li>Vidu 支持此参数。</li></ol> 
     * @return LogoAdd <p>是否添加图标水印。</p><ol><li>Hailuo 支持此参数。</li><li>Kling 支持此参数。</li><li>Vidu 支持此参数。</li></ol>
     */
    public Long getLogoAdd() {
        return this.LogoAdd;
    }

    /**
     * Set <p>是否添加图标水印。</p><ol><li>Hailuo 支持此参数。</li><li>Kling 支持此参数。</li><li>Vidu 支持此参数。</li></ol>
     * @param LogoAdd <p>是否添加图标水印。</p><ol><li>Hailuo 支持此参数。</li><li>Kling 支持此参数。</li><li>Vidu 支持此参数。</li></ol>
     */
    public void setLogoAdd(Long LogoAdd) {
        this.LogoAdd = LogoAdd;
    }

    /**
     * Get <p>为视频生成音频。接受的值包括 true 或 false。 </p><p>支持此参数的模型：</p><ol><li>GV，默认true。</li><li>OS，默认true。</li></ol> 
     * @return EnableAudio <p>为视频生成音频。接受的值包括 true 或 false。 </p><p>支持此参数的模型：</p><ol><li>GV，默认true。</li><li>OS，默认true。</li></ol>
     */
    public Boolean getEnableAudio() {
        return this.EnableAudio;
    }

    /**
     * Set <p>为视频生成音频。接受的值包括 true 或 false。 </p><p>支持此参数的模型：</p><ol><li>GV，默认true。</li><li>OS，默认true。</li></ol>
     * @param EnableAudio <p>为视频生成音频。接受的值包括 true 或 false。 </p><p>支持此参数的模型：</p><ol><li>GV，默认true。</li><li>OS，默认true。</li></ol>
     */
    public void setEnableAudio(Boolean EnableAudio) {
        this.EnableAudio = EnableAudio;
    }

    /**
     * Get <p>错峰模型，目前仅支持Vidu模型。<br>错峰模式下提交的任务，会在48小时内生成，未能完成的任务会被自动取消。</p> 
     * @return OffPeak <p>错峰模型，目前仅支持Vidu模型。<br>错峰模式下提交的任务，会在48小时内生成，未能完成的任务会被自动取消。</p>
     */
    public Boolean getOffPeak() {
        return this.OffPeak;
    }

    /**
     * Set <p>错峰模型，目前仅支持Vidu模型。<br>错峰模式下提交的任务，会在48小时内生成，未能完成的任务会被自动取消。</p>
     * @param OffPeak <p>错峰模型，目前仅支持Vidu模型。<br>错峰模式下提交的任务，会在48小时内生成，未能完成的任务会被自动取消。</p>
     */
    public void setOffPeak(Boolean OffPeak) {
        this.OffPeak = OffPeak;
    }

    /**
     * Get <p>是否为生成的视频添加背景音乐。默认：false，可选值 true 、false。<br>注意：部分模型的版本支持。</p> 
     * @return EnableBgm <p>是否为生成的视频添加背景音乐。默认：false，可选值 true 、false。<br>注意：部分模型的版本支持。</p>
     */
    public Boolean getEnableBgm() {
        return this.EnableBgm;
    }

    /**
     * Set <p>是否为生成的视频添加背景音乐。默认：false，可选值 true 、false。<br>注意：部分模型的版本支持。</p>
     * @param EnableBgm <p>是否为生成的视频添加背景音乐。默认：false，可选值 true 、false。<br>注意：部分模型的版本支持。</p>
     */
    public void setEnableBgm(Boolean EnableBgm) {
        this.EnableBgm = EnableBgm;
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
        if (source.LogoAdd != null) {
            this.LogoAdd = new Long(source.LogoAdd);
        }
        if (source.EnableAudio != null) {
            this.EnableAudio = new Boolean(source.EnableAudio);
        }
        if (source.OffPeak != null) {
            this.OffPeak = new Boolean(source.OffPeak);
        }
        if (source.EnableBgm != null) {
            this.EnableBgm = new Boolean(source.EnableBgm);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Resolution", this.Resolution);
        this.setParamSimple(map, prefix + "AspectRatio", this.AspectRatio);
        this.setParamSimple(map, prefix + "LogoAdd", this.LogoAdd);
        this.setParamSimple(map, prefix + "EnableAudio", this.EnableAudio);
        this.setParamSimple(map, prefix + "OffPeak", this.OffPeak);
        this.setParamSimple(map, prefix + "EnableBgm", this.EnableBgm);

    }
}

