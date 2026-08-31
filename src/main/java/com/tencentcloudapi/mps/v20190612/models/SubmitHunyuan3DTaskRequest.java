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

public class SubmitHunyuan3DTaskRequest extends AbstractModel {

    /**
    * <p>文生 3D 的提示词</p><p>入参限制：最长 1024 utf-8 字符</p>
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * <p>图生 3D 的图片 URL（http/https）</p>
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * <p>多视角图生 3D，至少 2 张，且必须包含 front 视角</p>
    */
    @SerializedName("MultiViewImages")
    @Expose
    private ViewImage [] MultiViewImages;

    /**
    * <p>生成类型</p><p>枚举值：</p><ul><li>Normal： 生成完整 3D 资产（几何 + 纹理）</li><li>Geometry： 只生成几何体（无纹理，输出速度更快）</li><li>Texture： 只生成纹理（需要传 MeshUrl）</li></ul><p>默认值：Normal</p>
    */
    @SerializedName("GenerateType")
    @Expose
    private String GenerateType;

    /**
    * <p>已有 3D 模型的 URL（仅支持 .glb / .obj）。传了 MeshUrl → 强制 GenerateType=Texture（贴纹理场景）</p>
    */
    @SerializedName("MeshUrl")
    @Expose
    private String MeshUrl;

    /**
    * <p>是否输出 PBR 材质</p><p>默认值：false</p>
    */
    @SerializedName("EnablePBR")
    @Expose
    private Boolean EnablePBR;

    /**
    * <p>面片数，范围 [3000, 1500000]。仅 Normal / Geometry 分支生效</p><p>取值范围：[3000, 1500000]</p><p>默认值：500000</p>
    */
    @SerializedName("FaceCount")
    @Expose
    private Long FaceCount;

    /**
    * <p>是否保留 UV 展开</p><p>默认值：false</p>
    */
    @SerializedName("KeepUV")
    @Expose
    private Boolean KeepUV;

    /**
    * <p>除默认返回的 obj + glb 外，附加输出的一种格式。当前仅支持 FBX</p>
    */
    @SerializedName("ResultFormat")
    @Expose
    private String ResultFormat;

    /**
    * <p>随机种子，同一 Seed 输入下结果可复现</p>
    */
    @SerializedName("Seed")
    @Expose
    private Long Seed;

    /**
    * <p>风格控制词</p>
    */
    @SerializedName("Style")
    @Expose
    private String Style;

    /**
     * Get <p>文生 3D 的提示词</p><p>入参限制：最长 1024 utf-8 字符</p> 
     * @return Prompt <p>文生 3D 的提示词</p><p>入参限制：最长 1024 utf-8 字符</p>
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set <p>文生 3D 的提示词</p><p>入参限制：最长 1024 utf-8 字符</p>
     * @param Prompt <p>文生 3D 的提示词</p><p>入参限制：最长 1024 utf-8 字符</p>
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get <p>图生 3D 的图片 URL（http/https）</p> 
     * @return ImageUrl <p>图生 3D 的图片 URL（http/https）</p>
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set <p>图生 3D 的图片 URL（http/https）</p>
     * @param ImageUrl <p>图生 3D 的图片 URL（http/https）</p>
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get <p>多视角图生 3D，至少 2 张，且必须包含 front 视角</p> 
     * @return MultiViewImages <p>多视角图生 3D，至少 2 张，且必须包含 front 视角</p>
     */
    public ViewImage [] getMultiViewImages() {
        return this.MultiViewImages;
    }

    /**
     * Set <p>多视角图生 3D，至少 2 张，且必须包含 front 视角</p>
     * @param MultiViewImages <p>多视角图生 3D，至少 2 张，且必须包含 front 视角</p>
     */
    public void setMultiViewImages(ViewImage [] MultiViewImages) {
        this.MultiViewImages = MultiViewImages;
    }

    /**
     * Get <p>生成类型</p><p>枚举值：</p><ul><li>Normal： 生成完整 3D 资产（几何 + 纹理）</li><li>Geometry： 只生成几何体（无纹理，输出速度更快）</li><li>Texture： 只生成纹理（需要传 MeshUrl）</li></ul><p>默认值：Normal</p> 
     * @return GenerateType <p>生成类型</p><p>枚举值：</p><ul><li>Normal： 生成完整 3D 资产（几何 + 纹理）</li><li>Geometry： 只生成几何体（无纹理，输出速度更快）</li><li>Texture： 只生成纹理（需要传 MeshUrl）</li></ul><p>默认值：Normal</p>
     */
    public String getGenerateType() {
        return this.GenerateType;
    }

    /**
     * Set <p>生成类型</p><p>枚举值：</p><ul><li>Normal： 生成完整 3D 资产（几何 + 纹理）</li><li>Geometry： 只生成几何体（无纹理，输出速度更快）</li><li>Texture： 只生成纹理（需要传 MeshUrl）</li></ul><p>默认值：Normal</p>
     * @param GenerateType <p>生成类型</p><p>枚举值：</p><ul><li>Normal： 生成完整 3D 资产（几何 + 纹理）</li><li>Geometry： 只生成几何体（无纹理，输出速度更快）</li><li>Texture： 只生成纹理（需要传 MeshUrl）</li></ul><p>默认值：Normal</p>
     */
    public void setGenerateType(String GenerateType) {
        this.GenerateType = GenerateType;
    }

    /**
     * Get <p>已有 3D 模型的 URL（仅支持 .glb / .obj）。传了 MeshUrl → 强制 GenerateType=Texture（贴纹理场景）</p> 
     * @return MeshUrl <p>已有 3D 模型的 URL（仅支持 .glb / .obj）。传了 MeshUrl → 强制 GenerateType=Texture（贴纹理场景）</p>
     */
    public String getMeshUrl() {
        return this.MeshUrl;
    }

    /**
     * Set <p>已有 3D 模型的 URL（仅支持 .glb / .obj）。传了 MeshUrl → 强制 GenerateType=Texture（贴纹理场景）</p>
     * @param MeshUrl <p>已有 3D 模型的 URL（仅支持 .glb / .obj）。传了 MeshUrl → 强制 GenerateType=Texture（贴纹理场景）</p>
     */
    public void setMeshUrl(String MeshUrl) {
        this.MeshUrl = MeshUrl;
    }

    /**
     * Get <p>是否输出 PBR 材质</p><p>默认值：false</p> 
     * @return EnablePBR <p>是否输出 PBR 材质</p><p>默认值：false</p>
     */
    public Boolean getEnablePBR() {
        return this.EnablePBR;
    }

    /**
     * Set <p>是否输出 PBR 材质</p><p>默认值：false</p>
     * @param EnablePBR <p>是否输出 PBR 材质</p><p>默认值：false</p>
     */
    public void setEnablePBR(Boolean EnablePBR) {
        this.EnablePBR = EnablePBR;
    }

    /**
     * Get <p>面片数，范围 [3000, 1500000]。仅 Normal / Geometry 分支生效</p><p>取值范围：[3000, 1500000]</p><p>默认值：500000</p> 
     * @return FaceCount <p>面片数，范围 [3000, 1500000]。仅 Normal / Geometry 分支生效</p><p>取值范围：[3000, 1500000]</p><p>默认值：500000</p>
     */
    public Long getFaceCount() {
        return this.FaceCount;
    }

    /**
     * Set <p>面片数，范围 [3000, 1500000]。仅 Normal / Geometry 分支生效</p><p>取值范围：[3000, 1500000]</p><p>默认值：500000</p>
     * @param FaceCount <p>面片数，范围 [3000, 1500000]。仅 Normal / Geometry 分支生效</p><p>取值范围：[3000, 1500000]</p><p>默认值：500000</p>
     */
    public void setFaceCount(Long FaceCount) {
        this.FaceCount = FaceCount;
    }

    /**
     * Get <p>是否保留 UV 展开</p><p>默认值：false</p> 
     * @return KeepUV <p>是否保留 UV 展开</p><p>默认值：false</p>
     */
    public Boolean getKeepUV() {
        return this.KeepUV;
    }

    /**
     * Set <p>是否保留 UV 展开</p><p>默认值：false</p>
     * @param KeepUV <p>是否保留 UV 展开</p><p>默认值：false</p>
     */
    public void setKeepUV(Boolean KeepUV) {
        this.KeepUV = KeepUV;
    }

    /**
     * Get <p>除默认返回的 obj + glb 外，附加输出的一种格式。当前仅支持 FBX</p> 
     * @return ResultFormat <p>除默认返回的 obj + glb 外，附加输出的一种格式。当前仅支持 FBX</p>
     */
    public String getResultFormat() {
        return this.ResultFormat;
    }

    /**
     * Set <p>除默认返回的 obj + glb 外，附加输出的一种格式。当前仅支持 FBX</p>
     * @param ResultFormat <p>除默认返回的 obj + glb 外，附加输出的一种格式。当前仅支持 FBX</p>
     */
    public void setResultFormat(String ResultFormat) {
        this.ResultFormat = ResultFormat;
    }

    /**
     * Get <p>随机种子，同一 Seed 输入下结果可复现</p> 
     * @return Seed <p>随机种子，同一 Seed 输入下结果可复现</p>
     */
    public Long getSeed() {
        return this.Seed;
    }

    /**
     * Set <p>随机种子，同一 Seed 输入下结果可复现</p>
     * @param Seed <p>随机种子，同一 Seed 输入下结果可复现</p>
     */
    public void setSeed(Long Seed) {
        this.Seed = Seed;
    }

    /**
     * Get <p>风格控制词</p> 
     * @return Style <p>风格控制词</p>
     */
    public String getStyle() {
        return this.Style;
    }

    /**
     * Set <p>风格控制词</p>
     * @param Style <p>风格控制词</p>
     */
    public void setStyle(String Style) {
        this.Style = Style;
    }

    public SubmitHunyuan3DTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubmitHunyuan3DTaskRequest(SubmitHunyuan3DTaskRequest source) {
        if (source.Prompt != null) {
            this.Prompt = new String(source.Prompt);
        }
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.MultiViewImages != null) {
            this.MultiViewImages = new ViewImage[source.MultiViewImages.length];
            for (int i = 0; i < source.MultiViewImages.length; i++) {
                this.MultiViewImages[i] = new ViewImage(source.MultiViewImages[i]);
            }
        }
        if (source.GenerateType != null) {
            this.GenerateType = new String(source.GenerateType);
        }
        if (source.MeshUrl != null) {
            this.MeshUrl = new String(source.MeshUrl);
        }
        if (source.EnablePBR != null) {
            this.EnablePBR = new Boolean(source.EnablePBR);
        }
        if (source.FaceCount != null) {
            this.FaceCount = new Long(source.FaceCount);
        }
        if (source.KeepUV != null) {
            this.KeepUV = new Boolean(source.KeepUV);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamArrayObj(map, prefix + "MultiViewImages.", this.MultiViewImages);
        this.setParamSimple(map, prefix + "GenerateType", this.GenerateType);
        this.setParamSimple(map, prefix + "MeshUrl", this.MeshUrl);
        this.setParamSimple(map, prefix + "EnablePBR", this.EnablePBR);
        this.setParamSimple(map, prefix + "FaceCount", this.FaceCount);
        this.setParamSimple(map, prefix + "KeepUV", this.KeepUV);
        this.setParamSimple(map, prefix + "ResultFormat", this.ResultFormat);
        this.setParamSimple(map, prefix + "Seed", this.Seed);
        this.setParamSimple(map, prefix + "Style", this.Style);

    }
}

