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

public class CreateAigcHunyuan3DTaskRequest extends AbstractModel {

    /**
    * <p><b>点播<a href="/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * <p>生成 3D 模型的参考图片信息。</p><p>入参限制：数组长度最大为1。</p><p>ImageInfos、MultiViewImageInfos、Prompt 三个入参各自互斥，有且只能填写一个。</p>
    */
    @SerializedName("ImageInfos")
    @Expose
    private AigcHunyuan3DReferenceImageInfo [] ImageInfos;

    /**
    * <p>用于生成 3D 模型的多视角图片信息。</p><p>入参限制：数组长度必须在2-8之间，且必须包含 front 视角。</p><p>ImageInfos、MultiViewImageInfos、Prompt 三个入参各自互斥，有且只能填写一个。</p>
    */
    @SerializedName("MultiViewImageInfos")
    @Expose
    private AigcHunyuan3DMultiViewImageInfo [] MultiViewImageInfos;

    /**
    * <p>生成 3D 模型的提示词。</p><p>入参限制：最长 1024 个 utf-8 字符。</p><p>ImageInfos、MultiViewImageInfos、Prompt 三个入参各自互斥，有且只能填写一个。</p>
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * <p>生成类型。</p><p>枚举值：</p><ul><li>Normal： 生成完整 3D 资产（几何 + 纹理）；</li><li>Geometry： 只生成几何体（无纹理，输出速度更快）；</li><li>Texture： 只生成纹理（需要填写 MeshInfos）</li></ul><p>默认值：Normal</p>
    */
    @SerializedName("GenerateType")
    @Expose
    private String GenerateType;

    /**
    * <p>用于生成 3D 模型的参考 3D 模型。</p><p>入参限制：当填写 MeshInfos 时，则 GenerateType 取值必须为 Texture（贴纹理场景）。</p>
    */
    @SerializedName("MeshInfos")
    @Expose
    private AigcHunyuan3DMeshInfo [] MeshInfos;

    /**
    * <p>是否开启输出 PBR 材质。</p><p>枚举值：</p><ul><li>Enabled： 开启；</li><li>Disabled： 关闭。</li></ul><p>默认值：Disabled</p>
    */
    @SerializedName("EnablePBR")
    @Expose
    private String EnablePBR;

    /**
    * <p>面片数。仅 GenerateType 取值为 Normal  和 Geometry 时生效。</p><p>取值范围：[3000, 1500000]</p><p>默认值：500000</p>
    */
    @SerializedName("FaceCount")
    @Expose
    private Long FaceCount;

    /**
    * <p>是否保留 UV 展开。</p><p>枚举值：</p><ul><li>Enabled： 保留；</li><li>Disabled： 不保留。</li></ul><p>默认值：Disabled</p>
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
    * <p>随机种子，同一 Seed 输入下结果可复现。</p><p>取值范围：[0, 2147483647]</p>
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
    * <p>用于去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。</p>
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * <p>来源上下文，用于透传用户请求信息，音画质重生完成回调将返回该字段值，最长 1000 个字符。</p>
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * <p>任务的优先级，数值越大优先级越高，取值范围是 -10 到 10，不填代表 0。</p>
    */
    @SerializedName("TasksPriority")
    @Expose
    private Long TasksPriority;

    /**
     * Get <p><b>点播<a href="/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p> 
     * @return SubAppId <p><b>点播<a href="/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <p><b>点播<a href="/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p>
     * @param SubAppId <p><b>点播<a href="/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get <p>生成 3D 模型的参考图片信息。</p><p>入参限制：数组长度最大为1。</p><p>ImageInfos、MultiViewImageInfos、Prompt 三个入参各自互斥，有且只能填写一个。</p> 
     * @return ImageInfos <p>生成 3D 模型的参考图片信息。</p><p>入参限制：数组长度最大为1。</p><p>ImageInfos、MultiViewImageInfos、Prompt 三个入参各自互斥，有且只能填写一个。</p>
     */
    public AigcHunyuan3DReferenceImageInfo [] getImageInfos() {
        return this.ImageInfos;
    }

    /**
     * Set <p>生成 3D 模型的参考图片信息。</p><p>入参限制：数组长度最大为1。</p><p>ImageInfos、MultiViewImageInfos、Prompt 三个入参各自互斥，有且只能填写一个。</p>
     * @param ImageInfos <p>生成 3D 模型的参考图片信息。</p><p>入参限制：数组长度最大为1。</p><p>ImageInfos、MultiViewImageInfos、Prompt 三个入参各自互斥，有且只能填写一个。</p>
     */
    public void setImageInfos(AigcHunyuan3DReferenceImageInfo [] ImageInfos) {
        this.ImageInfos = ImageInfos;
    }

    /**
     * Get <p>用于生成 3D 模型的多视角图片信息。</p><p>入参限制：数组长度必须在2-8之间，且必须包含 front 视角。</p><p>ImageInfos、MultiViewImageInfos、Prompt 三个入参各自互斥，有且只能填写一个。</p> 
     * @return MultiViewImageInfos <p>用于生成 3D 模型的多视角图片信息。</p><p>入参限制：数组长度必须在2-8之间，且必须包含 front 视角。</p><p>ImageInfos、MultiViewImageInfos、Prompt 三个入参各自互斥，有且只能填写一个。</p>
     */
    public AigcHunyuan3DMultiViewImageInfo [] getMultiViewImageInfos() {
        return this.MultiViewImageInfos;
    }

    /**
     * Set <p>用于生成 3D 模型的多视角图片信息。</p><p>入参限制：数组长度必须在2-8之间，且必须包含 front 视角。</p><p>ImageInfos、MultiViewImageInfos、Prompt 三个入参各自互斥，有且只能填写一个。</p>
     * @param MultiViewImageInfos <p>用于生成 3D 模型的多视角图片信息。</p><p>入参限制：数组长度必须在2-8之间，且必须包含 front 视角。</p><p>ImageInfos、MultiViewImageInfos、Prompt 三个入参各自互斥，有且只能填写一个。</p>
     */
    public void setMultiViewImageInfos(AigcHunyuan3DMultiViewImageInfo [] MultiViewImageInfos) {
        this.MultiViewImageInfos = MultiViewImageInfos;
    }

    /**
     * Get <p>生成 3D 模型的提示词。</p><p>入参限制：最长 1024 个 utf-8 字符。</p><p>ImageInfos、MultiViewImageInfos、Prompt 三个入参各自互斥，有且只能填写一个。</p> 
     * @return Prompt <p>生成 3D 模型的提示词。</p><p>入参限制：最长 1024 个 utf-8 字符。</p><p>ImageInfos、MultiViewImageInfos、Prompt 三个入参各自互斥，有且只能填写一个。</p>
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set <p>生成 3D 模型的提示词。</p><p>入参限制：最长 1024 个 utf-8 字符。</p><p>ImageInfos、MultiViewImageInfos、Prompt 三个入参各自互斥，有且只能填写一个。</p>
     * @param Prompt <p>生成 3D 模型的提示词。</p><p>入参限制：最长 1024 个 utf-8 字符。</p><p>ImageInfos、MultiViewImageInfos、Prompt 三个入参各自互斥，有且只能填写一个。</p>
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get <p>生成类型。</p><p>枚举值：</p><ul><li>Normal： 生成完整 3D 资产（几何 + 纹理）；</li><li>Geometry： 只生成几何体（无纹理，输出速度更快）；</li><li>Texture： 只生成纹理（需要填写 MeshInfos）</li></ul><p>默认值：Normal</p> 
     * @return GenerateType <p>生成类型。</p><p>枚举值：</p><ul><li>Normal： 生成完整 3D 资产（几何 + 纹理）；</li><li>Geometry： 只生成几何体（无纹理，输出速度更快）；</li><li>Texture： 只生成纹理（需要填写 MeshInfos）</li></ul><p>默认值：Normal</p>
     */
    public String getGenerateType() {
        return this.GenerateType;
    }

    /**
     * Set <p>生成类型。</p><p>枚举值：</p><ul><li>Normal： 生成完整 3D 资产（几何 + 纹理）；</li><li>Geometry： 只生成几何体（无纹理，输出速度更快）；</li><li>Texture： 只生成纹理（需要填写 MeshInfos）</li></ul><p>默认值：Normal</p>
     * @param GenerateType <p>生成类型。</p><p>枚举值：</p><ul><li>Normal： 生成完整 3D 资产（几何 + 纹理）；</li><li>Geometry： 只生成几何体（无纹理，输出速度更快）；</li><li>Texture： 只生成纹理（需要填写 MeshInfos）</li></ul><p>默认值：Normal</p>
     */
    public void setGenerateType(String GenerateType) {
        this.GenerateType = GenerateType;
    }

    /**
     * Get <p>用于生成 3D 模型的参考 3D 模型。</p><p>入参限制：当填写 MeshInfos 时，则 GenerateType 取值必须为 Texture（贴纹理场景）。</p> 
     * @return MeshInfos <p>用于生成 3D 模型的参考 3D 模型。</p><p>入参限制：当填写 MeshInfos 时，则 GenerateType 取值必须为 Texture（贴纹理场景）。</p>
     */
    public AigcHunyuan3DMeshInfo [] getMeshInfos() {
        return this.MeshInfos;
    }

    /**
     * Set <p>用于生成 3D 模型的参考 3D 模型。</p><p>入参限制：当填写 MeshInfos 时，则 GenerateType 取值必须为 Texture（贴纹理场景）。</p>
     * @param MeshInfos <p>用于生成 3D 模型的参考 3D 模型。</p><p>入参限制：当填写 MeshInfos 时，则 GenerateType 取值必须为 Texture（贴纹理场景）。</p>
     */
    public void setMeshInfos(AigcHunyuan3DMeshInfo [] MeshInfos) {
        this.MeshInfos = MeshInfos;
    }

    /**
     * Get <p>是否开启输出 PBR 材质。</p><p>枚举值：</p><ul><li>Enabled： 开启；</li><li>Disabled： 关闭。</li></ul><p>默认值：Disabled</p> 
     * @return EnablePBR <p>是否开启输出 PBR 材质。</p><p>枚举值：</p><ul><li>Enabled： 开启；</li><li>Disabled： 关闭。</li></ul><p>默认值：Disabled</p>
     */
    public String getEnablePBR() {
        return this.EnablePBR;
    }

    /**
     * Set <p>是否开启输出 PBR 材质。</p><p>枚举值：</p><ul><li>Enabled： 开启；</li><li>Disabled： 关闭。</li></ul><p>默认值：Disabled</p>
     * @param EnablePBR <p>是否开启输出 PBR 材质。</p><p>枚举值：</p><ul><li>Enabled： 开启；</li><li>Disabled： 关闭。</li></ul><p>默认值：Disabled</p>
     */
    public void setEnablePBR(String EnablePBR) {
        this.EnablePBR = EnablePBR;
    }

    /**
     * Get <p>面片数。仅 GenerateType 取值为 Normal  和 Geometry 时生效。</p><p>取值范围：[3000, 1500000]</p><p>默认值：500000</p> 
     * @return FaceCount <p>面片数。仅 GenerateType 取值为 Normal  和 Geometry 时生效。</p><p>取值范围：[3000, 1500000]</p><p>默认值：500000</p>
     */
    public Long getFaceCount() {
        return this.FaceCount;
    }

    /**
     * Set <p>面片数。仅 GenerateType 取值为 Normal  和 Geometry 时生效。</p><p>取值范围：[3000, 1500000]</p><p>默认值：500000</p>
     * @param FaceCount <p>面片数。仅 GenerateType 取值为 Normal  和 Geometry 时生效。</p><p>取值范围：[3000, 1500000]</p><p>默认值：500000</p>
     */
    public void setFaceCount(Long FaceCount) {
        this.FaceCount = FaceCount;
    }

    /**
     * Get <p>是否保留 UV 展开。</p><p>枚举值：</p><ul><li>Enabled： 保留；</li><li>Disabled： 不保留。</li></ul><p>默认值：Disabled</p> 
     * @return KeepUV <p>是否保留 UV 展开。</p><p>枚举值：</p><ul><li>Enabled： 保留；</li><li>Disabled： 不保留。</li></ul><p>默认值：Disabled</p>
     */
    public String getKeepUV() {
        return this.KeepUV;
    }

    /**
     * Set <p>是否保留 UV 展开。</p><p>枚举值：</p><ul><li>Enabled： 保留；</li><li>Disabled： 不保留。</li></ul><p>默认值：Disabled</p>
     * @param KeepUV <p>是否保留 UV 展开。</p><p>枚举值：</p><ul><li>Enabled： 保留；</li><li>Disabled： 不保留。</li></ul><p>默认值：Disabled</p>
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
     * Get <p>随机种子，同一 Seed 输入下结果可复现。</p><p>取值范围：[0, 2147483647]</p> 
     * @return Seed <p>随机种子，同一 Seed 输入下结果可复现。</p><p>取值范围：[0, 2147483647]</p>
     */
    public Long getSeed() {
        return this.Seed;
    }

    /**
     * Set <p>随机种子，同一 Seed 输入下结果可复现。</p><p>取值范围：[0, 2147483647]</p>
     * @param Seed <p>随机种子，同一 Seed 输入下结果可复现。</p><p>取值范围：[0, 2147483647]</p>
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

    /**
     * Get <p>用于去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。</p> 
     * @return SessionId <p>用于去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。</p>
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>用于去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。</p>
     * @param SessionId <p>用于去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。</p>
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get <p>来源上下文，用于透传用户请求信息，音画质重生完成回调将返回该字段值，最长 1000 个字符。</p> 
     * @return SessionContext <p>来源上下文，用于透传用户请求信息，音画质重生完成回调将返回该字段值，最长 1000 个字符。</p>
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set <p>来源上下文，用于透传用户请求信息，音画质重生完成回调将返回该字段值，最长 1000 个字符。</p>
     * @param SessionContext <p>来源上下文，用于透传用户请求信息，音画质重生完成回调将返回该字段值，最长 1000 个字符。</p>
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    /**
     * Get <p>任务的优先级，数值越大优先级越高，取值范围是 -10 到 10，不填代表 0。</p> 
     * @return TasksPriority <p>任务的优先级，数值越大优先级越高，取值范围是 -10 到 10，不填代表 0。</p>
     */
    public Long getTasksPriority() {
        return this.TasksPriority;
    }

    /**
     * Set <p>任务的优先级，数值越大优先级越高，取值范围是 -10 到 10，不填代表 0。</p>
     * @param TasksPriority <p>任务的优先级，数值越大优先级越高，取值范围是 -10 到 10，不填代表 0。</p>
     */
    public void setTasksPriority(Long TasksPriority) {
        this.TasksPriority = TasksPriority;
    }

    public CreateAigcHunyuan3DTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAigcHunyuan3DTaskRequest(CreateAigcHunyuan3DTaskRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
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
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.SessionContext != null) {
            this.SessionContext = new String(source.SessionContext);
        }
        if (source.TasksPriority != null) {
            this.TasksPriority = new Long(source.TasksPriority);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
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
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "TasksPriority", this.TasksPriority);

    }
}

