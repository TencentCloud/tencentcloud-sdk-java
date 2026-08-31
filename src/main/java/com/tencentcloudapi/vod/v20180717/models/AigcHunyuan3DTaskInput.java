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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AigcHunyuan3DTaskInput extends AbstractModel {

    /**
    * <p>生成 3D 的参考图片信息。</p>
    */
    @SerializedName("ImageInfos")
    @Expose
    private AigcHunyuan3DReferenceImageInfo [] ImageInfos;

    /**
    * <p>用于生成 3D 模型的多视角图片信息。</p><p>数组长度必须在2-8之间，且必须包含 front 视角。</p>
    */
    @SerializedName("MultiViewImageInfos")
    @Expose
    private AigcHunyuan3DMultiViewImageInfo [] MultiViewImageInfos;

    /**
    * <p>生成 3D 模型的提示词。</p>
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * <p>生成类型。</p><p>枚举值：</p><ul><li>Normal： 生成完整 3D 资产（几何 + 纹理）；</li><li>Geometry： 只生成几何体（无纹理，输出速度更快）；</li><li>Texture： 只生成纹理（需要填写 MeshInfos）</li></ul>
    */
    @SerializedName("GenerateType")
    @Expose
    private String GenerateType;

    /**
    * <p>用于生成 3D 模型的参考 3D 模型。</p>
    */
    @SerializedName("MeshInfos")
    @Expose
    private AigcHunyuan3DMeshInfo [] MeshInfos;

    /**
    * <p>是否开启输出 PBR 材质。</p><p>枚举值：</p><ul><li>Enabled： 开启；</li><li>Disabled： 关闭。</li></ul>
    */
    @SerializedName("EnablePBR")
    @Expose
    private String EnablePBR;

    /**
    * <p>面片数。仅 GenerateType 取值为 Normal  和 Geometry 时生效。</p>
    */
    @SerializedName("FaceCount")
    @Expose
    private Long FaceCount;

    /**
    * <p>是否保留 UV 展开。</p><p>枚举值：</p><ul><li>Enabled： 保留；</li><li>Disabled： 不保留。</li></ul>
    */
    @SerializedName("KeepUV")
    @Expose
    private String KeepUV;

    /**
    * <p>结果格式。除默认返回的 obj 和 glb 外，附加输出的一种格式。</p><p>枚举值：</p><ul><li>FBX： FBX 格式文件。</li></ul>
    */
    @SerializedName("ResultFormat")
    @Expose
    private String ResultFormat;

    /**
    * <p>随机种子，同一 Seed 输入下结果可复现。</p>
    */
    @SerializedName("Seed")
    @Expose
    private Long Seed;

    /**
    * <p>风格控制词。</p>
    */
    @SerializedName("Style")
    @Expose
    private String Style;

    /**
    * <p>任务的输出媒体文件配置。</p>
    */
    @SerializedName("OutputConfig")
    @Expose
    private AigcHunyuan3DOutputConfig OutputConfig;

    /**
     * Get <p>生成 3D 的参考图片信息。</p> 
     * @return ImageInfos <p>生成 3D 的参考图片信息。</p>
     */
    public AigcHunyuan3DReferenceImageInfo [] getImageInfos() {
        return this.ImageInfos;
    }

    /**
     * Set <p>生成 3D 的参考图片信息。</p>
     * @param ImageInfos <p>生成 3D 的参考图片信息。</p>
     */
    public void setImageInfos(AigcHunyuan3DReferenceImageInfo [] ImageInfos) {
        this.ImageInfos = ImageInfos;
    }

    /**
     * Get <p>用于生成 3D 模型的多视角图片信息。</p><p>数组长度必须在2-8之间，且必须包含 front 视角。</p> 
     * @return MultiViewImageInfos <p>用于生成 3D 模型的多视角图片信息。</p><p>数组长度必须在2-8之间，且必须包含 front 视角。</p>
     */
    public AigcHunyuan3DMultiViewImageInfo [] getMultiViewImageInfos() {
        return this.MultiViewImageInfos;
    }

    /**
     * Set <p>用于生成 3D 模型的多视角图片信息。</p><p>数组长度必须在2-8之间，且必须包含 front 视角。</p>
     * @param MultiViewImageInfos <p>用于生成 3D 模型的多视角图片信息。</p><p>数组长度必须在2-8之间，且必须包含 front 视角。</p>
     */
    public void setMultiViewImageInfos(AigcHunyuan3DMultiViewImageInfo [] MultiViewImageInfos) {
        this.MultiViewImageInfos = MultiViewImageInfos;
    }

    /**
     * Get <p>生成 3D 模型的提示词。</p> 
     * @return Prompt <p>生成 3D 模型的提示词。</p>
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set <p>生成 3D 模型的提示词。</p>
     * @param Prompt <p>生成 3D 模型的提示词。</p>
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get <p>生成类型。</p><p>枚举值：</p><ul><li>Normal： 生成完整 3D 资产（几何 + 纹理）；</li><li>Geometry： 只生成几何体（无纹理，输出速度更快）；</li><li>Texture： 只生成纹理（需要填写 MeshInfos）</li></ul> 
     * @return GenerateType <p>生成类型。</p><p>枚举值：</p><ul><li>Normal： 生成完整 3D 资产（几何 + 纹理）；</li><li>Geometry： 只生成几何体（无纹理，输出速度更快）；</li><li>Texture： 只生成纹理（需要填写 MeshInfos）</li></ul>
     */
    public String getGenerateType() {
        return this.GenerateType;
    }

    /**
     * Set <p>生成类型。</p><p>枚举值：</p><ul><li>Normal： 生成完整 3D 资产（几何 + 纹理）；</li><li>Geometry： 只生成几何体（无纹理，输出速度更快）；</li><li>Texture： 只生成纹理（需要填写 MeshInfos）</li></ul>
     * @param GenerateType <p>生成类型。</p><p>枚举值：</p><ul><li>Normal： 生成完整 3D 资产（几何 + 纹理）；</li><li>Geometry： 只生成几何体（无纹理，输出速度更快）；</li><li>Texture： 只生成纹理（需要填写 MeshInfos）</li></ul>
     */
    public void setGenerateType(String GenerateType) {
        this.GenerateType = GenerateType;
    }

    /**
     * Get <p>用于生成 3D 模型的参考 3D 模型。</p> 
     * @return MeshInfos <p>用于生成 3D 模型的参考 3D 模型。</p>
     */
    public AigcHunyuan3DMeshInfo [] getMeshInfos() {
        return this.MeshInfos;
    }

    /**
     * Set <p>用于生成 3D 模型的参考 3D 模型。</p>
     * @param MeshInfos <p>用于生成 3D 模型的参考 3D 模型。</p>
     */
    public void setMeshInfos(AigcHunyuan3DMeshInfo [] MeshInfos) {
        this.MeshInfos = MeshInfos;
    }

    /**
     * Get <p>是否开启输出 PBR 材质。</p><p>枚举值：</p><ul><li>Enabled： 开启；</li><li>Disabled： 关闭。</li></ul> 
     * @return EnablePBR <p>是否开启输出 PBR 材质。</p><p>枚举值：</p><ul><li>Enabled： 开启；</li><li>Disabled： 关闭。</li></ul>
     */
    public String getEnablePBR() {
        return this.EnablePBR;
    }

    /**
     * Set <p>是否开启输出 PBR 材质。</p><p>枚举值：</p><ul><li>Enabled： 开启；</li><li>Disabled： 关闭。</li></ul>
     * @param EnablePBR <p>是否开启输出 PBR 材质。</p><p>枚举值：</p><ul><li>Enabled： 开启；</li><li>Disabled： 关闭。</li></ul>
     */
    public void setEnablePBR(String EnablePBR) {
        this.EnablePBR = EnablePBR;
    }

    /**
     * Get <p>面片数。仅 GenerateType 取值为 Normal  和 Geometry 时生效。</p> 
     * @return FaceCount <p>面片数。仅 GenerateType 取值为 Normal  和 Geometry 时生效。</p>
     */
    public Long getFaceCount() {
        return this.FaceCount;
    }

    /**
     * Set <p>面片数。仅 GenerateType 取值为 Normal  和 Geometry 时生效。</p>
     * @param FaceCount <p>面片数。仅 GenerateType 取值为 Normal  和 Geometry 时生效。</p>
     */
    public void setFaceCount(Long FaceCount) {
        this.FaceCount = FaceCount;
    }

    /**
     * Get <p>是否保留 UV 展开。</p><p>枚举值：</p><ul><li>Enabled： 保留；</li><li>Disabled： 不保留。</li></ul> 
     * @return KeepUV <p>是否保留 UV 展开。</p><p>枚举值：</p><ul><li>Enabled： 保留；</li><li>Disabled： 不保留。</li></ul>
     */
    public String getKeepUV() {
        return this.KeepUV;
    }

    /**
     * Set <p>是否保留 UV 展开。</p><p>枚举值：</p><ul><li>Enabled： 保留；</li><li>Disabled： 不保留。</li></ul>
     * @param KeepUV <p>是否保留 UV 展开。</p><p>枚举值：</p><ul><li>Enabled： 保留；</li><li>Disabled： 不保留。</li></ul>
     */
    public void setKeepUV(String KeepUV) {
        this.KeepUV = KeepUV;
    }

    /**
     * Get <p>结果格式。除默认返回的 obj 和 glb 外，附加输出的一种格式。</p><p>枚举值：</p><ul><li>FBX： FBX 格式文件。</li></ul> 
     * @return ResultFormat <p>结果格式。除默认返回的 obj 和 glb 外，附加输出的一种格式。</p><p>枚举值：</p><ul><li>FBX： FBX 格式文件。</li></ul>
     */
    public String getResultFormat() {
        return this.ResultFormat;
    }

    /**
     * Set <p>结果格式。除默认返回的 obj 和 glb 外，附加输出的一种格式。</p><p>枚举值：</p><ul><li>FBX： FBX 格式文件。</li></ul>
     * @param ResultFormat <p>结果格式。除默认返回的 obj 和 glb 外，附加输出的一种格式。</p><p>枚举值：</p><ul><li>FBX： FBX 格式文件。</li></ul>
     */
    public void setResultFormat(String ResultFormat) {
        this.ResultFormat = ResultFormat;
    }

    /**
     * Get <p>随机种子，同一 Seed 输入下结果可复现。</p> 
     * @return Seed <p>随机种子，同一 Seed 输入下结果可复现。</p>
     */
    public Long getSeed() {
        return this.Seed;
    }

    /**
     * Set <p>随机种子，同一 Seed 输入下结果可复现。</p>
     * @param Seed <p>随机种子，同一 Seed 输入下结果可复现。</p>
     */
    public void setSeed(Long Seed) {
        this.Seed = Seed;
    }

    /**
     * Get <p>风格控制词。</p> 
     * @return Style <p>风格控制词。</p>
     */
    public String getStyle() {
        return this.Style;
    }

    /**
     * Set <p>风格控制词。</p>
     * @param Style <p>风格控制词。</p>
     */
    public void setStyle(String Style) {
        this.Style = Style;
    }

    /**
     * Get <p>任务的输出媒体文件配置。</p> 
     * @return OutputConfig <p>任务的输出媒体文件配置。</p>
     */
    public AigcHunyuan3DOutputConfig getOutputConfig() {
        return this.OutputConfig;
    }

    /**
     * Set <p>任务的输出媒体文件配置。</p>
     * @param OutputConfig <p>任务的输出媒体文件配置。</p>
     */
    public void setOutputConfig(AigcHunyuan3DOutputConfig OutputConfig) {
        this.OutputConfig = OutputConfig;
    }

    public AigcHunyuan3DTaskInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AigcHunyuan3DTaskInput(AigcHunyuan3DTaskInput source) {
        if (source.ImageInfos != null) {
            this.ImageInfos = new AigcHunyuan3DReferenceImageInfo[source.ImageInfos.length];
            for (int i = 0; i < source.ImageInfos.length; i++) {
                this.ImageInfos[i] = new AigcHunyuan3DReferenceImageInfo(source.ImageInfos[i]);
            }
        }
        if (source.MultiViewImageInfos != null) {
            this.MultiViewImageInfos = new AigcHunyuan3DMultiViewImageInfo[source.MultiViewImageInfos.length];
            for (int i = 0; i < source.MultiViewImageInfos.length; i++) {
                this.MultiViewImageInfos[i] = new AigcHunyuan3DMultiViewImageInfo(source.MultiViewImageInfos[i]);
            }
        }
        if (source.Prompt != null) {
            this.Prompt = new String(source.Prompt);
        }
        if (source.GenerateType != null) {
            this.GenerateType = new String(source.GenerateType);
        }
        if (source.MeshInfos != null) {
            this.MeshInfos = new AigcHunyuan3DMeshInfo[source.MeshInfos.length];
            for (int i = 0; i < source.MeshInfos.length; i++) {
                this.MeshInfos[i] = new AigcHunyuan3DMeshInfo(source.MeshInfos[i]);
            }
        }
        if (source.EnablePBR != null) {
            this.EnablePBR = new String(source.EnablePBR);
        }
        if (source.FaceCount != null) {
            this.FaceCount = new Long(source.FaceCount);
        }
        if (source.KeepUV != null) {
            this.KeepUV = new String(source.KeepUV);
        }
        if (source.ResultFormat != null) {
            this.ResultFormat = new String(source.ResultFormat);
        }
        if (source.Seed != null) {
            this.Seed = new Long(source.Seed);
        }
        if (source.Style != null) {
            this.Style = new String(source.Style);
        }
        if (source.OutputConfig != null) {
            this.OutputConfig = new AigcHunyuan3DOutputConfig(source.OutputConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ImageInfos.", this.ImageInfos);
        this.setParamArrayObj(map, prefix + "MultiViewImageInfos.", this.MultiViewImageInfos);
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);
        this.setParamSimple(map, prefix + "GenerateType", this.GenerateType);
        this.setParamArrayObj(map, prefix + "MeshInfos.", this.MeshInfos);
        this.setParamSimple(map, prefix + "EnablePBR", this.EnablePBR);
        this.setParamSimple(map, prefix + "FaceCount", this.FaceCount);
        this.setParamSimple(map, prefix + "KeepUV", this.KeepUV);
        this.setParamSimple(map, prefix + "ResultFormat", this.ResultFormat);
        this.setParamSimple(map, prefix + "Seed", this.Seed);
        this.setParamSimple(map, prefix + "Style", this.Style);
        this.setParamObj(map, prefix + "OutputConfig.", this.OutputConfig);

    }
}

