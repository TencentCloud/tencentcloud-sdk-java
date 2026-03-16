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
package com.tencentcloudapi.ai3d.v20250513.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubmitHunyuanTo3DProJobRequest extends AbstractModel {

    /**
    * <p>混元生3D生成模型版本，默认为3.0，可选项：3.0，3.1<br>选择3.1版本时，LowPoly参数不可用。</p>
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * <p>文生3D，3D内容的描述，中文正向提示词。<br>最多支持1024个 utf-8 字符。<br>ImageBase64、ImageUrl和 Prompt必填其一，且Prompt和ImageBase64/ImageUrl不能同时存在。</p>
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * <p>输入图 Base64 数据。<br>大小: 单边分辨率要求不小于128，不大于5000，大小≤6m (因base64编码后会大30%左右)<br>格式: jpg，png，jpeg，webp.<br>lmageBase64、lmageUr和 Prompt必填其一，且Prompt和lmageBase64/mageUr不能同时存在。</p>
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * <p>输入图Url<br>大小: 单边分辨率要求不小于128，不大于5000，大小≤8m<br>格式: jpg，png，jpeg，webp.<br>lmageBase64、lmageUr和 Prompt必填其一，且Prompt和lmageBase64/mageUr不能同时存在。</p>
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * <p>多视角的模型图片，视角参考值：<br>left：左视图；<br>right：右视图；<br>back：后视图；<br>top：顶视图（仅3.1版本支持）；<br>bottom：底视图（仅3.1版本支持）；<br>left_front：左前45°视图（仅3.1版本支持）；<br>right_front：右前45°视图（仅3.1版本支持）；</p><p>每个视角仅限制一张图片。<br>●图片大小限制：编码后所有图片大小总和不可超过8M。（base64编码下图片大小总和不超过6M，因base64编码后图片大小会大30%左右）<br>●图片分辨率限制：单边分辨率小于5000且大于128。<br>●支持图片格式：支持jpg或png</p>
    */
    @SerializedName("MultiViewImages")
    @Expose
    private ViewImage [] MultiViewImages;

    /**
    * <p>是否开启 PBR材质生成，默认 false。</p>
    */
    @SerializedName("EnablePBR")
    @Expose
    private Boolean EnablePBR;

    /**
    * <p>生成3D模型的面数，默认值为500000。可支持生成面数范围，参考值：3000-1500000。GenerateType中选择LowPoly时，此参数不生效。</p><p>取值范围：[3000, 1500000]</p>
    */
    @SerializedName("FaceCount")
    @Expose
    private Long FaceCount;

    /**
    * <p>生成任务类型，默认Normal</p><p>枚举值：</p><ul><li>Normal： 可生成带纹理的几何模型</li><li>LowPoly： 可生成智能拓扑后的模型，FaceCount参数不生效。</li><li>Geometry： 可生成不带纹理的几何模型（白模），EnablePBR参数不生效。</li><li>Sketch： 可输入草图或线稿图生成模型，此模式下prompt和ImageUrl/ImageBase64可一起输入。</li></ul>
    */
    @SerializedName("GenerateType")
    @Expose
    private String GenerateType;

    /**
    * <p>该参数仅在GenerateType中选择LowPoly模式可生效。</p><p>多边形类型，表示模型的表面由几边形网格构成，默认为triangle,参考值:<br>triangle: 三角形面。<br>quadrilateral: 四边形面与三角形面混合生成。</p>
    */
    @SerializedName("PolygonType")
    @Expose
    private String PolygonType;

    /**
    * <p>生成模型的格式，仅限制生成一种格式； 生成模型文件组默认返回obj、glb格式（开启时Geometry参数时，默认为glb格式）； 可选值：STL，USDZ，FBX；</p>
    */
    @SerializedName("ResultFormat")
    @Expose
    private String ResultFormat;

    /**
     * Get <p>混元生3D生成模型版本，默认为3.0，可选项：3.0，3.1<br>选择3.1版本时，LowPoly参数不可用。</p> 
     * @return Model <p>混元生3D生成模型版本，默认为3.0，可选项：3.0，3.1<br>选择3.1版本时，LowPoly参数不可用。</p>
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set <p>混元生3D生成模型版本，默认为3.0，可选项：3.0，3.1<br>选择3.1版本时，LowPoly参数不可用。</p>
     * @param Model <p>混元生3D生成模型版本，默认为3.0，可选项：3.0，3.1<br>选择3.1版本时，LowPoly参数不可用。</p>
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get <p>文生3D，3D内容的描述，中文正向提示词。<br>最多支持1024个 utf-8 字符。<br>ImageBase64、ImageUrl和 Prompt必填其一，且Prompt和ImageBase64/ImageUrl不能同时存在。</p> 
     * @return Prompt <p>文生3D，3D内容的描述，中文正向提示词。<br>最多支持1024个 utf-8 字符。<br>ImageBase64、ImageUrl和 Prompt必填其一，且Prompt和ImageBase64/ImageUrl不能同时存在。</p>
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set <p>文生3D，3D内容的描述，中文正向提示词。<br>最多支持1024个 utf-8 字符。<br>ImageBase64、ImageUrl和 Prompt必填其一，且Prompt和ImageBase64/ImageUrl不能同时存在。</p>
     * @param Prompt <p>文生3D，3D内容的描述，中文正向提示词。<br>最多支持1024个 utf-8 字符。<br>ImageBase64、ImageUrl和 Prompt必填其一，且Prompt和ImageBase64/ImageUrl不能同时存在。</p>
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get <p>输入图 Base64 数据。<br>大小: 单边分辨率要求不小于128，不大于5000，大小≤6m (因base64编码后会大30%左右)<br>格式: jpg，png，jpeg，webp.<br>lmageBase64、lmageUr和 Prompt必填其一，且Prompt和lmageBase64/mageUr不能同时存在。</p> 
     * @return ImageBase64 <p>输入图 Base64 数据。<br>大小: 单边分辨率要求不小于128，不大于5000，大小≤6m (因base64编码后会大30%左右)<br>格式: jpg，png，jpeg，webp.<br>lmageBase64、lmageUr和 Prompt必填其一，且Prompt和lmageBase64/mageUr不能同时存在。</p>
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set <p>输入图 Base64 数据。<br>大小: 单边分辨率要求不小于128，不大于5000，大小≤6m (因base64编码后会大30%左右)<br>格式: jpg，png，jpeg，webp.<br>lmageBase64、lmageUr和 Prompt必填其一，且Prompt和lmageBase64/mageUr不能同时存在。</p>
     * @param ImageBase64 <p>输入图 Base64 数据。<br>大小: 单边分辨率要求不小于128，不大于5000，大小≤6m (因base64编码后会大30%左右)<br>格式: jpg，png，jpeg，webp.<br>lmageBase64、lmageUr和 Prompt必填其一，且Prompt和lmageBase64/mageUr不能同时存在。</p>
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * Get <p>输入图Url<br>大小: 单边分辨率要求不小于128，不大于5000，大小≤8m<br>格式: jpg，png，jpeg，webp.<br>lmageBase64、lmageUr和 Prompt必填其一，且Prompt和lmageBase64/mageUr不能同时存在。</p> 
     * @return ImageUrl <p>输入图Url<br>大小: 单边分辨率要求不小于128，不大于5000，大小≤8m<br>格式: jpg，png，jpeg，webp.<br>lmageBase64、lmageUr和 Prompt必填其一，且Prompt和lmageBase64/mageUr不能同时存在。</p>
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set <p>输入图Url<br>大小: 单边分辨率要求不小于128，不大于5000，大小≤8m<br>格式: jpg，png，jpeg，webp.<br>lmageBase64、lmageUr和 Prompt必填其一，且Prompt和lmageBase64/mageUr不能同时存在。</p>
     * @param ImageUrl <p>输入图Url<br>大小: 单边分辨率要求不小于128，不大于5000，大小≤8m<br>格式: jpg，png，jpeg，webp.<br>lmageBase64、lmageUr和 Prompt必填其一，且Prompt和lmageBase64/mageUr不能同时存在。</p>
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get <p>多视角的模型图片，视角参考值：<br>left：左视图；<br>right：右视图；<br>back：后视图；<br>top：顶视图（仅3.1版本支持）；<br>bottom：底视图（仅3.1版本支持）；<br>left_front：左前45°视图（仅3.1版本支持）；<br>right_front：右前45°视图（仅3.1版本支持）；</p><p>每个视角仅限制一张图片。<br>●图片大小限制：编码后所有图片大小总和不可超过8M。（base64编码下图片大小总和不超过6M，因base64编码后图片大小会大30%左右）<br>●图片分辨率限制：单边分辨率小于5000且大于128。<br>●支持图片格式：支持jpg或png</p> 
     * @return MultiViewImages <p>多视角的模型图片，视角参考值：<br>left：左视图；<br>right：右视图；<br>back：后视图；<br>top：顶视图（仅3.1版本支持）；<br>bottom：底视图（仅3.1版本支持）；<br>left_front：左前45°视图（仅3.1版本支持）；<br>right_front：右前45°视图（仅3.1版本支持）；</p><p>每个视角仅限制一张图片。<br>●图片大小限制：编码后所有图片大小总和不可超过8M。（base64编码下图片大小总和不超过6M，因base64编码后图片大小会大30%左右）<br>●图片分辨率限制：单边分辨率小于5000且大于128。<br>●支持图片格式：支持jpg或png</p>
     */
    public ViewImage [] getMultiViewImages() {
        return this.MultiViewImages;
    }

    /**
     * Set <p>多视角的模型图片，视角参考值：<br>left：左视图；<br>right：右视图；<br>back：后视图；<br>top：顶视图（仅3.1版本支持）；<br>bottom：底视图（仅3.1版本支持）；<br>left_front：左前45°视图（仅3.1版本支持）；<br>right_front：右前45°视图（仅3.1版本支持）；</p><p>每个视角仅限制一张图片。<br>●图片大小限制：编码后所有图片大小总和不可超过8M。（base64编码下图片大小总和不超过6M，因base64编码后图片大小会大30%左右）<br>●图片分辨率限制：单边分辨率小于5000且大于128。<br>●支持图片格式：支持jpg或png</p>
     * @param MultiViewImages <p>多视角的模型图片，视角参考值：<br>left：左视图；<br>right：右视图；<br>back：后视图；<br>top：顶视图（仅3.1版本支持）；<br>bottom：底视图（仅3.1版本支持）；<br>left_front：左前45°视图（仅3.1版本支持）；<br>right_front：右前45°视图（仅3.1版本支持）；</p><p>每个视角仅限制一张图片。<br>●图片大小限制：编码后所有图片大小总和不可超过8M。（base64编码下图片大小总和不超过6M，因base64编码后图片大小会大30%左右）<br>●图片分辨率限制：单边分辨率小于5000且大于128。<br>●支持图片格式：支持jpg或png</p>
     */
    public void setMultiViewImages(ViewImage [] MultiViewImages) {
        this.MultiViewImages = MultiViewImages;
    }

    /**
     * Get <p>是否开启 PBR材质生成，默认 false。</p> 
     * @return EnablePBR <p>是否开启 PBR材质生成，默认 false。</p>
     */
    public Boolean getEnablePBR() {
        return this.EnablePBR;
    }

    /**
     * Set <p>是否开启 PBR材质生成，默认 false。</p>
     * @param EnablePBR <p>是否开启 PBR材质生成，默认 false。</p>
     */
    public void setEnablePBR(Boolean EnablePBR) {
        this.EnablePBR = EnablePBR;
    }

    /**
     * Get <p>生成3D模型的面数，默认值为500000。可支持生成面数范围，参考值：3000-1500000。GenerateType中选择LowPoly时，此参数不生效。</p><p>取值范围：[3000, 1500000]</p> 
     * @return FaceCount <p>生成3D模型的面数，默认值为500000。可支持生成面数范围，参考值：3000-1500000。GenerateType中选择LowPoly时，此参数不生效。</p><p>取值范围：[3000, 1500000]</p>
     */
    public Long getFaceCount() {
        return this.FaceCount;
    }

    /**
     * Set <p>生成3D模型的面数，默认值为500000。可支持生成面数范围，参考值：3000-1500000。GenerateType中选择LowPoly时，此参数不生效。</p><p>取值范围：[3000, 1500000]</p>
     * @param FaceCount <p>生成3D模型的面数，默认值为500000。可支持生成面数范围，参考值：3000-1500000。GenerateType中选择LowPoly时，此参数不生效。</p><p>取值范围：[3000, 1500000]</p>
     */
    public void setFaceCount(Long FaceCount) {
        this.FaceCount = FaceCount;
    }

    /**
     * Get <p>生成任务类型，默认Normal</p><p>枚举值：</p><ul><li>Normal： 可生成带纹理的几何模型</li><li>LowPoly： 可生成智能拓扑后的模型，FaceCount参数不生效。</li><li>Geometry： 可生成不带纹理的几何模型（白模），EnablePBR参数不生效。</li><li>Sketch： 可输入草图或线稿图生成模型，此模式下prompt和ImageUrl/ImageBase64可一起输入。</li></ul> 
     * @return GenerateType <p>生成任务类型，默认Normal</p><p>枚举值：</p><ul><li>Normal： 可生成带纹理的几何模型</li><li>LowPoly： 可生成智能拓扑后的模型，FaceCount参数不生效。</li><li>Geometry： 可生成不带纹理的几何模型（白模），EnablePBR参数不生效。</li><li>Sketch： 可输入草图或线稿图生成模型，此模式下prompt和ImageUrl/ImageBase64可一起输入。</li></ul>
     */
    public String getGenerateType() {
        return this.GenerateType;
    }

    /**
     * Set <p>生成任务类型，默认Normal</p><p>枚举值：</p><ul><li>Normal： 可生成带纹理的几何模型</li><li>LowPoly： 可生成智能拓扑后的模型，FaceCount参数不生效。</li><li>Geometry： 可生成不带纹理的几何模型（白模），EnablePBR参数不生效。</li><li>Sketch： 可输入草图或线稿图生成模型，此模式下prompt和ImageUrl/ImageBase64可一起输入。</li></ul>
     * @param GenerateType <p>生成任务类型，默认Normal</p><p>枚举值：</p><ul><li>Normal： 可生成带纹理的几何模型</li><li>LowPoly： 可生成智能拓扑后的模型，FaceCount参数不生效。</li><li>Geometry： 可生成不带纹理的几何模型（白模），EnablePBR参数不生效。</li><li>Sketch： 可输入草图或线稿图生成模型，此模式下prompt和ImageUrl/ImageBase64可一起输入。</li></ul>
     */
    public void setGenerateType(String GenerateType) {
        this.GenerateType = GenerateType;
    }

    /**
     * Get <p>该参数仅在GenerateType中选择LowPoly模式可生效。</p><p>多边形类型，表示模型的表面由几边形网格构成，默认为triangle,参考值:<br>triangle: 三角形面。<br>quadrilateral: 四边形面与三角形面混合生成。</p> 
     * @return PolygonType <p>该参数仅在GenerateType中选择LowPoly模式可生效。</p><p>多边形类型，表示模型的表面由几边形网格构成，默认为triangle,参考值:<br>triangle: 三角形面。<br>quadrilateral: 四边形面与三角形面混合生成。</p>
     */
    public String getPolygonType() {
        return this.PolygonType;
    }

    /**
     * Set <p>该参数仅在GenerateType中选择LowPoly模式可生效。</p><p>多边形类型，表示模型的表面由几边形网格构成，默认为triangle,参考值:<br>triangle: 三角形面。<br>quadrilateral: 四边形面与三角形面混合生成。</p>
     * @param PolygonType <p>该参数仅在GenerateType中选择LowPoly模式可生效。</p><p>多边形类型，表示模型的表面由几边形网格构成，默认为triangle,参考值:<br>triangle: 三角形面。<br>quadrilateral: 四边形面与三角形面混合生成。</p>
     */
    public void setPolygonType(String PolygonType) {
        this.PolygonType = PolygonType;
    }

    /**
     * Get <p>生成模型的格式，仅限制生成一种格式； 生成模型文件组默认返回obj、glb格式（开启时Geometry参数时，默认为glb格式）； 可选值：STL，USDZ，FBX；</p> 
     * @return ResultFormat <p>生成模型的格式，仅限制生成一种格式； 生成模型文件组默认返回obj、glb格式（开启时Geometry参数时，默认为glb格式）； 可选值：STL，USDZ，FBX；</p>
     */
    public String getResultFormat() {
        return this.ResultFormat;
    }

    /**
     * Set <p>生成模型的格式，仅限制生成一种格式； 生成模型文件组默认返回obj、glb格式（开启时Geometry参数时，默认为glb格式）； 可选值：STL，USDZ，FBX；</p>
     * @param ResultFormat <p>生成模型的格式，仅限制生成一种格式； 生成模型文件组默认返回obj、glb格式（开启时Geometry参数时，默认为glb格式）； 可选值：STL，USDZ，FBX；</p>
     */
    public void setResultFormat(String ResultFormat) {
        this.ResultFormat = ResultFormat;
    }

    public SubmitHunyuanTo3DProJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubmitHunyuanTo3DProJobRequest(SubmitHunyuanTo3DProJobRequest source) {
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.Prompt != null) {
            this.Prompt = new String(source.Prompt);
        }
        if (source.ImageBase64 != null) {
            this.ImageBase64 = new String(source.ImageBase64);
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
        if (source.EnablePBR != null) {
            this.EnablePBR = new Boolean(source.EnablePBR);
        }
        if (source.FaceCount != null) {
            this.FaceCount = new Long(source.FaceCount);
        }
        if (source.GenerateType != null) {
            this.GenerateType = new String(source.GenerateType);
        }
        if (source.PolygonType != null) {
            this.PolygonType = new String(source.PolygonType);
        }
        if (source.ResultFormat != null) {
            this.ResultFormat = new String(source.ResultFormat);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);
        this.setParamSimple(map, prefix + "ImageBase64", this.ImageBase64);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamArrayObj(map, prefix + "MultiViewImages.", this.MultiViewImages);
        this.setParamSimple(map, prefix + "EnablePBR", this.EnablePBR);
        this.setParamSimple(map, prefix + "FaceCount", this.FaceCount);
        this.setParamSimple(map, prefix + "GenerateType", this.GenerateType);
        this.setParamSimple(map, prefix + "PolygonType", this.PolygonType);
        this.setParamSimple(map, prefix + "ResultFormat", this.ResultFormat);

    }
}

