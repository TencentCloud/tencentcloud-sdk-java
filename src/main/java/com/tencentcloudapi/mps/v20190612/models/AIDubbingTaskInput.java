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

public class AIDubbingTaskInput extends AbstractModel {

    /**
    * <p>AI配音模板id。</p>
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * <p>AI配音自定义参数，当 Definition 填 0 时有效。 该参数用于高度定制场景，建议您优先使用 Definition 指定配音参数。</p>
    */
    @SerializedName("RawParameter")
    @Expose
    private RawAIDubbingParameter RawParameter;

    /**
    * <p>AI配音自定义参数，当 Definition 不填 0 时有效。 当填写了该结构中的部分配音参数时，将使用填写的参数覆盖AI配音模板中的参数。 该参数用于高度定制场景，建议您仅使用 Definition 指定配音参数。</p>
    */
    @SerializedName("OverrideParameter")
    @Expose
    private OverrideAIDubbingParameter OverrideParameter;

    /**
    * <p>文件的目标存储，不填则继承上层的 OutputStorage 值。</p>
    */
    @SerializedName("OutputStorage")
    @Expose
    private TaskOutputStorage OutputStorage;

    /**
    * <p>外部源字幕文件信息。</p>
    */
    @SerializedName("SrcSubtitleInfo")
    @Expose
    private MediaInputInfo SrcSubtitleInfo;

    /**
    * <p>外部字幕文件信息，译文字幕。</p>
    */
    @SerializedName("DstSubtitleInfos")
    @Expose
    private DstSubtitleInput [] DstSubtitleInfos;

    /**
    * <p>文件的输出路径，可以为相对路径或者绝对路径。<br>若需定义输出路径，路径需以<code>.{format}</code>结尾。变量名请参考 <a href="https://cloud.tencent.com/document/product/862/37039">文件名变量说明</a>。<br>相对路径示例：</p><li>文件名_{变量名}.{format}</li><li>文件名.{format}</li>绝对路径示例：<li>/自定义路径/文件名_{变量名}.{format}</li><p><strong>注意</strong>：目前不支持<code>BatchProcessMedia</code>接口。</p>
    */
    @SerializedName("OutputObjectPath")
    @Expose
    private String OutputObjectPath;

    /**
    * <p>AI配音扩展参数，序列化的 json 字符串。</p>
    */
    @SerializedName("ExtendedParameter")
    @Expose
    private String ExtendedParameter;

    /**
    * <p>关联剧集ID。<br>注意：配音模式为按角色智能配音时此值生效。</p>
    */
    @SerializedName("DramaId")
    @Expose
    private String DramaId;

    /**
     * Get <p>AI配音模板id。</p> 
     * @return Definition <p>AI配音模板id。</p>
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set <p>AI配音模板id。</p>
     * @param Definition <p>AI配音模板id。</p>
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get <p>AI配音自定义参数，当 Definition 填 0 时有效。 该参数用于高度定制场景，建议您优先使用 Definition 指定配音参数。</p> 
     * @return RawParameter <p>AI配音自定义参数，当 Definition 填 0 时有效。 该参数用于高度定制场景，建议您优先使用 Definition 指定配音参数。</p>
     */
    public RawAIDubbingParameter getRawParameter() {
        return this.RawParameter;
    }

    /**
     * Set <p>AI配音自定义参数，当 Definition 填 0 时有效。 该参数用于高度定制场景，建议您优先使用 Definition 指定配音参数。</p>
     * @param RawParameter <p>AI配音自定义参数，当 Definition 填 0 时有效。 该参数用于高度定制场景，建议您优先使用 Definition 指定配音参数。</p>
     */
    public void setRawParameter(RawAIDubbingParameter RawParameter) {
        this.RawParameter = RawParameter;
    }

    /**
     * Get <p>AI配音自定义参数，当 Definition 不填 0 时有效。 当填写了该结构中的部分配音参数时，将使用填写的参数覆盖AI配音模板中的参数。 该参数用于高度定制场景，建议您仅使用 Definition 指定配音参数。</p> 
     * @return OverrideParameter <p>AI配音自定义参数，当 Definition 不填 0 时有效。 当填写了该结构中的部分配音参数时，将使用填写的参数覆盖AI配音模板中的参数。 该参数用于高度定制场景，建议您仅使用 Definition 指定配音参数。</p>
     */
    public OverrideAIDubbingParameter getOverrideParameter() {
        return this.OverrideParameter;
    }

    /**
     * Set <p>AI配音自定义参数，当 Definition 不填 0 时有效。 当填写了该结构中的部分配音参数时，将使用填写的参数覆盖AI配音模板中的参数。 该参数用于高度定制场景，建议您仅使用 Definition 指定配音参数。</p>
     * @param OverrideParameter <p>AI配音自定义参数，当 Definition 不填 0 时有效。 当填写了该结构中的部分配音参数时，将使用填写的参数覆盖AI配音模板中的参数。 该参数用于高度定制场景，建议您仅使用 Definition 指定配音参数。</p>
     */
    public void setOverrideParameter(OverrideAIDubbingParameter OverrideParameter) {
        this.OverrideParameter = OverrideParameter;
    }

    /**
     * Get <p>文件的目标存储，不填则继承上层的 OutputStorage 值。</p> 
     * @return OutputStorage <p>文件的目标存储，不填则继承上层的 OutputStorage 值。</p>
     */
    public TaskOutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * Set <p>文件的目标存储，不填则继承上层的 OutputStorage 值。</p>
     * @param OutputStorage <p>文件的目标存储，不填则继承上层的 OutputStorage 值。</p>
     */
    public void setOutputStorage(TaskOutputStorage OutputStorage) {
        this.OutputStorage = OutputStorage;
    }

    /**
     * Get <p>外部源字幕文件信息。</p> 
     * @return SrcSubtitleInfo <p>外部源字幕文件信息。</p>
     */
    public MediaInputInfo getSrcSubtitleInfo() {
        return this.SrcSubtitleInfo;
    }

    /**
     * Set <p>外部源字幕文件信息。</p>
     * @param SrcSubtitleInfo <p>外部源字幕文件信息。</p>
     */
    public void setSrcSubtitleInfo(MediaInputInfo SrcSubtitleInfo) {
        this.SrcSubtitleInfo = SrcSubtitleInfo;
    }

    /**
     * Get <p>外部字幕文件信息，译文字幕。</p> 
     * @return DstSubtitleInfos <p>外部字幕文件信息，译文字幕。</p>
     */
    public DstSubtitleInput [] getDstSubtitleInfos() {
        return this.DstSubtitleInfos;
    }

    /**
     * Set <p>外部字幕文件信息，译文字幕。</p>
     * @param DstSubtitleInfos <p>外部字幕文件信息，译文字幕。</p>
     */
    public void setDstSubtitleInfos(DstSubtitleInput [] DstSubtitleInfos) {
        this.DstSubtitleInfos = DstSubtitleInfos;
    }

    /**
     * Get <p>文件的输出路径，可以为相对路径或者绝对路径。<br>若需定义输出路径，路径需以<code>.{format}</code>结尾。变量名请参考 <a href="https://cloud.tencent.com/document/product/862/37039">文件名变量说明</a>。<br>相对路径示例：</p><li>文件名_{变量名}.{format}</li><li>文件名.{format}</li>绝对路径示例：<li>/自定义路径/文件名_{变量名}.{format}</li><p><strong>注意</strong>：目前不支持<code>BatchProcessMedia</code>接口。</p> 
     * @return OutputObjectPath <p>文件的输出路径，可以为相对路径或者绝对路径。<br>若需定义输出路径，路径需以<code>.{format}</code>结尾。变量名请参考 <a href="https://cloud.tencent.com/document/product/862/37039">文件名变量说明</a>。<br>相对路径示例：</p><li>文件名_{变量名}.{format}</li><li>文件名.{format}</li>绝对路径示例：<li>/自定义路径/文件名_{变量名}.{format}</li><p><strong>注意</strong>：目前不支持<code>BatchProcessMedia</code>接口。</p>
     */
    public String getOutputObjectPath() {
        return this.OutputObjectPath;
    }

    /**
     * Set <p>文件的输出路径，可以为相对路径或者绝对路径。<br>若需定义输出路径，路径需以<code>.{format}</code>结尾。变量名请参考 <a href="https://cloud.tencent.com/document/product/862/37039">文件名变量说明</a>。<br>相对路径示例：</p><li>文件名_{变量名}.{format}</li><li>文件名.{format}</li>绝对路径示例：<li>/自定义路径/文件名_{变量名}.{format}</li><p><strong>注意</strong>：目前不支持<code>BatchProcessMedia</code>接口。</p>
     * @param OutputObjectPath <p>文件的输出路径，可以为相对路径或者绝对路径。<br>若需定义输出路径，路径需以<code>.{format}</code>结尾。变量名请参考 <a href="https://cloud.tencent.com/document/product/862/37039">文件名变量说明</a>。<br>相对路径示例：</p><li>文件名_{变量名}.{format}</li><li>文件名.{format}</li>绝对路径示例：<li>/自定义路径/文件名_{变量名}.{format}</li><p><strong>注意</strong>：目前不支持<code>BatchProcessMedia</code>接口。</p>
     */
    public void setOutputObjectPath(String OutputObjectPath) {
        this.OutputObjectPath = OutputObjectPath;
    }

    /**
     * Get <p>AI配音扩展参数，序列化的 json 字符串。</p> 
     * @return ExtendedParameter <p>AI配音扩展参数，序列化的 json 字符串。</p>
     */
    public String getExtendedParameter() {
        return this.ExtendedParameter;
    }

    /**
     * Set <p>AI配音扩展参数，序列化的 json 字符串。</p>
     * @param ExtendedParameter <p>AI配音扩展参数，序列化的 json 字符串。</p>
     */
    public void setExtendedParameter(String ExtendedParameter) {
        this.ExtendedParameter = ExtendedParameter;
    }

    /**
     * Get <p>关联剧集ID。<br>注意：配音模式为按角色智能配音时此值生效。</p> 
     * @return DramaId <p>关联剧集ID。<br>注意：配音模式为按角色智能配音时此值生效。</p>
     */
    public String getDramaId() {
        return this.DramaId;
    }

    /**
     * Set <p>关联剧集ID。<br>注意：配音模式为按角色智能配音时此值生效。</p>
     * @param DramaId <p>关联剧集ID。<br>注意：配音模式为按角色智能配音时此值生效。</p>
     */
    public void setDramaId(String DramaId) {
        this.DramaId = DramaId;
    }

    public AIDubbingTaskInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIDubbingTaskInput(AIDubbingTaskInput source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.RawParameter != null) {
            this.RawParameter = new RawAIDubbingParameter(source.RawParameter);
        }
        if (source.OverrideParameter != null) {
            this.OverrideParameter = new OverrideAIDubbingParameter(source.OverrideParameter);
        }
        if (source.OutputStorage != null) {
            this.OutputStorage = new TaskOutputStorage(source.OutputStorage);
        }
        if (source.SrcSubtitleInfo != null) {
            this.SrcSubtitleInfo = new MediaInputInfo(source.SrcSubtitleInfo);
        }
        if (source.DstSubtitleInfos != null) {
            this.DstSubtitleInfos = new DstSubtitleInput[source.DstSubtitleInfos.length];
            for (int i = 0; i < source.DstSubtitleInfos.length; i++) {
                this.DstSubtitleInfos[i] = new DstSubtitleInput(source.DstSubtitleInfos[i]);
            }
        }
        if (source.OutputObjectPath != null) {
            this.OutputObjectPath = new String(source.OutputObjectPath);
        }
        if (source.ExtendedParameter != null) {
            this.ExtendedParameter = new String(source.ExtendedParameter);
        }
        if (source.DramaId != null) {
            this.DramaId = new String(source.DramaId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamObj(map, prefix + "RawParameter.", this.RawParameter);
        this.setParamObj(map, prefix + "OverrideParameter.", this.OverrideParameter);
        this.setParamObj(map, prefix + "OutputStorage.", this.OutputStorage);
        this.setParamObj(map, prefix + "SrcSubtitleInfo.", this.SrcSubtitleInfo);
        this.setParamArrayObj(map, prefix + "DstSubtitleInfos.", this.DstSubtitleInfos);
        this.setParamSimple(map, prefix + "OutputObjectPath", this.OutputObjectPath);
        this.setParamSimple(map, prefix + "ExtendedParameter", this.ExtendedParameter);
        this.setParamSimple(map, prefix + "DramaId", this.DramaId);

    }
}

