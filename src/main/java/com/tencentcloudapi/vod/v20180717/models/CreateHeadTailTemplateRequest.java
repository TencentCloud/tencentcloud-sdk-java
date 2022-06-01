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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateHeadTailTemplateRequest extends AbstractModel{

    /**
    * 模板名，长度限制 64 个字符。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <b>点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * 模板描述信息，长度限制 256 个字符。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 片头候选列表，填写视频的 FileId。转码时将自动选择与正片宽高比最接近的一个片头（相同宽高比时，靠前的候选项优先）。最多支持 5 个候选片头。
    */
    @SerializedName("HeadCandidateSet")
    @Expose
    private String [] HeadCandidateSet;

    /**
    * 片尾候选列表，填写视频的 FileId。转码时将自动选择与正片宽高比最接近的一个片尾（相同宽高比时，靠前的候选项优先）。最多支持 5 个候选片尾。
    */
    @SerializedName("TailCandidateSet")
    @Expose
    private String [] TailCandidateSet;

    /**
    * 填充方式，当视频流配置宽高参数与原始视频的宽高比不一致时，对转码的处理方式，即为“填充”。可选填充方式：
<li> stretch：拉伸，对每一帧进行拉伸，填满整个画面，可能导致转码后的视频被“压扁“或者“拉长“；</li>
<li> gauss：高斯模糊，保持视频宽高比不变，边缘剩余部分使用高斯模糊；</li>
<li> white：留白，保持视频宽高比不变，边缘剩余部分使用白色填充；</li>
<li> black：留黑，保持视频宽高比不变，边缘剩余部分使用黑色填充。</li>
默认值：stretch 。
    */
    @SerializedName("FillType")
    @Expose
    private String FillType;

    /**
     * Get 模板名，长度限制 64 个字符。 
     * @return Name 模板名，长度限制 64 个字符。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 模板名，长度限制 64 个字符。
     * @param Name 模板名，长度限制 64 个字符。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <b>点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。</b> 
     * @return SubAppId <b>点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。</b>
     * @param SubAppId <b>点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get 模板描述信息，长度限制 256 个字符。 
     * @return Comment 模板描述信息，长度限制 256 个字符。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 模板描述信息，长度限制 256 个字符。
     * @param Comment 模板描述信息，长度限制 256 个字符。
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get 片头候选列表，填写视频的 FileId。转码时将自动选择与正片宽高比最接近的一个片头（相同宽高比时，靠前的候选项优先）。最多支持 5 个候选片头。 
     * @return HeadCandidateSet 片头候选列表，填写视频的 FileId。转码时将自动选择与正片宽高比最接近的一个片头（相同宽高比时，靠前的候选项优先）。最多支持 5 个候选片头。
     */
    public String [] getHeadCandidateSet() {
        return this.HeadCandidateSet;
    }

    /**
     * Set 片头候选列表，填写视频的 FileId。转码时将自动选择与正片宽高比最接近的一个片头（相同宽高比时，靠前的候选项优先）。最多支持 5 个候选片头。
     * @param HeadCandidateSet 片头候选列表，填写视频的 FileId。转码时将自动选择与正片宽高比最接近的一个片头（相同宽高比时，靠前的候选项优先）。最多支持 5 个候选片头。
     */
    public void setHeadCandidateSet(String [] HeadCandidateSet) {
        this.HeadCandidateSet = HeadCandidateSet;
    }

    /**
     * Get 片尾候选列表，填写视频的 FileId。转码时将自动选择与正片宽高比最接近的一个片尾（相同宽高比时，靠前的候选项优先）。最多支持 5 个候选片尾。 
     * @return TailCandidateSet 片尾候选列表，填写视频的 FileId。转码时将自动选择与正片宽高比最接近的一个片尾（相同宽高比时，靠前的候选项优先）。最多支持 5 个候选片尾。
     */
    public String [] getTailCandidateSet() {
        return this.TailCandidateSet;
    }

    /**
     * Set 片尾候选列表，填写视频的 FileId。转码时将自动选择与正片宽高比最接近的一个片尾（相同宽高比时，靠前的候选项优先）。最多支持 5 个候选片尾。
     * @param TailCandidateSet 片尾候选列表，填写视频的 FileId。转码时将自动选择与正片宽高比最接近的一个片尾（相同宽高比时，靠前的候选项优先）。最多支持 5 个候选片尾。
     */
    public void setTailCandidateSet(String [] TailCandidateSet) {
        this.TailCandidateSet = TailCandidateSet;
    }

    /**
     * Get 填充方式，当视频流配置宽高参数与原始视频的宽高比不一致时，对转码的处理方式，即为“填充”。可选填充方式：
<li> stretch：拉伸，对每一帧进行拉伸，填满整个画面，可能导致转码后的视频被“压扁“或者“拉长“；</li>
<li> gauss：高斯模糊，保持视频宽高比不变，边缘剩余部分使用高斯模糊；</li>
<li> white：留白，保持视频宽高比不变，边缘剩余部分使用白色填充；</li>
<li> black：留黑，保持视频宽高比不变，边缘剩余部分使用黑色填充。</li>
默认值：stretch 。 
     * @return FillType 填充方式，当视频流配置宽高参数与原始视频的宽高比不一致时，对转码的处理方式，即为“填充”。可选填充方式：
<li> stretch：拉伸，对每一帧进行拉伸，填满整个画面，可能导致转码后的视频被“压扁“或者“拉长“；</li>
<li> gauss：高斯模糊，保持视频宽高比不变，边缘剩余部分使用高斯模糊；</li>
<li> white：留白，保持视频宽高比不变，边缘剩余部分使用白色填充；</li>
<li> black：留黑，保持视频宽高比不变，边缘剩余部分使用黑色填充。</li>
默认值：stretch 。
     */
    public String getFillType() {
        return this.FillType;
    }

    /**
     * Set 填充方式，当视频流配置宽高参数与原始视频的宽高比不一致时，对转码的处理方式，即为“填充”。可选填充方式：
<li> stretch：拉伸，对每一帧进行拉伸，填满整个画面，可能导致转码后的视频被“压扁“或者“拉长“；</li>
<li> gauss：高斯模糊，保持视频宽高比不变，边缘剩余部分使用高斯模糊；</li>
<li> white：留白，保持视频宽高比不变，边缘剩余部分使用白色填充；</li>
<li> black：留黑，保持视频宽高比不变，边缘剩余部分使用黑色填充。</li>
默认值：stretch 。
     * @param FillType 填充方式，当视频流配置宽高参数与原始视频的宽高比不一致时，对转码的处理方式，即为“填充”。可选填充方式：
<li> stretch：拉伸，对每一帧进行拉伸，填满整个画面，可能导致转码后的视频被“压扁“或者“拉长“；</li>
<li> gauss：高斯模糊，保持视频宽高比不变，边缘剩余部分使用高斯模糊；</li>
<li> white：留白，保持视频宽高比不变，边缘剩余部分使用白色填充；</li>
<li> black：留黑，保持视频宽高比不变，边缘剩余部分使用黑色填充。</li>
默认值：stretch 。
     */
    public void setFillType(String FillType) {
        this.FillType = FillType;
    }

    public CreateHeadTailTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateHeadTailTemplateRequest(CreateHeadTailTemplateRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.HeadCandidateSet != null) {
            this.HeadCandidateSet = new String[source.HeadCandidateSet.length];
            for (int i = 0; i < source.HeadCandidateSet.length; i++) {
                this.HeadCandidateSet[i] = new String(source.HeadCandidateSet[i]);
            }
        }
        if (source.TailCandidateSet != null) {
            this.TailCandidateSet = new String[source.TailCandidateSet.length];
            for (int i = 0; i < source.TailCandidateSet.length; i++) {
                this.TailCandidateSet[i] = new String(source.TailCandidateSet[i]);
            }
        }
        if (source.FillType != null) {
            this.FillType = new String(source.FillType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamArraySimple(map, prefix + "HeadCandidateSet.", this.HeadCandidateSet);
        this.setParamArraySimple(map, prefix + "TailCandidateSet.", this.TailCandidateSet);
        this.setParamSimple(map, prefix + "FillType", this.FillType);

    }
}

