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

public class SubmitHunyuanTo3DMotionJobRequest extends AbstractModel {

    /**
    * <p>输入文本prompt，限定最大字符为128。</p>
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * <p>模型名称：HY-Motion-1.0，默认HY-Motion-1.0。</p>
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * <p>需重定向的模型地址，只能支持混元生3D动画生成的模型（动画模板的接口）</p>
    */
    @SerializedName("RetargetFile")
    @Expose
    private InputFile3D RetargetFile;

    /**
    * <p>生成动画的时长，默认5，范围：1-12（单位s）</p>
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * <p>默认true，返回的fbx是否带蒙皮mesh</p>
    */
    @SerializedName("EnableMesh")
    @Expose
    private Boolean EnableMesh;

    /**
    * <p>是否开启prompt扩写，开启后将补充完善输入的prompt。<br>默认false。</p>
    */
    @SerializedName("EnableRewrite")
    @Expose
    private Boolean EnableRewrite;

    /**
    * <p>是否开启时长自动匹配，开启后将自动根据prompt匹配适合时长的动作数据<br>默认false。</p>
    */
    @SerializedName("EnableDurationEst")
    @Expose
    private Boolean EnableDurationEst;

    /**
     * Get <p>输入文本prompt，限定最大字符为128。</p> 
     * @return Prompt <p>输入文本prompt，限定最大字符为128。</p>
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set <p>输入文本prompt，限定最大字符为128。</p>
     * @param Prompt <p>输入文本prompt，限定最大字符为128。</p>
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get <p>模型名称：HY-Motion-1.0，默认HY-Motion-1.0。</p> 
     * @return Model <p>模型名称：HY-Motion-1.0，默认HY-Motion-1.0。</p>
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set <p>模型名称：HY-Motion-1.0，默认HY-Motion-1.0。</p>
     * @param Model <p>模型名称：HY-Motion-1.0，默认HY-Motion-1.0。</p>
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get <p>需重定向的模型地址，只能支持混元生3D动画生成的模型（动画模板的接口）</p> 
     * @return RetargetFile <p>需重定向的模型地址，只能支持混元生3D动画生成的模型（动画模板的接口）</p>
     */
    public InputFile3D getRetargetFile() {
        return this.RetargetFile;
    }

    /**
     * Set <p>需重定向的模型地址，只能支持混元生3D动画生成的模型（动画模板的接口）</p>
     * @param RetargetFile <p>需重定向的模型地址，只能支持混元生3D动画生成的模型（动画模板的接口）</p>
     */
    public void setRetargetFile(InputFile3D RetargetFile) {
        this.RetargetFile = RetargetFile;
    }

    /**
     * Get <p>生成动画的时长，默认5，范围：1-12（单位s）</p> 
     * @return Duration <p>生成动画的时长，默认5，范围：1-12（单位s）</p>
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set <p>生成动画的时长，默认5，范围：1-12（单位s）</p>
     * @param Duration <p>生成动画的时长，默认5，范围：1-12（单位s）</p>
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get <p>默认true，返回的fbx是否带蒙皮mesh</p> 
     * @return EnableMesh <p>默认true，返回的fbx是否带蒙皮mesh</p>
     */
    public Boolean getEnableMesh() {
        return this.EnableMesh;
    }

    /**
     * Set <p>默认true，返回的fbx是否带蒙皮mesh</p>
     * @param EnableMesh <p>默认true，返回的fbx是否带蒙皮mesh</p>
     */
    public void setEnableMesh(Boolean EnableMesh) {
        this.EnableMesh = EnableMesh;
    }

    /**
     * Get <p>是否开启prompt扩写，开启后将补充完善输入的prompt。<br>默认false。</p> 
     * @return EnableRewrite <p>是否开启prompt扩写，开启后将补充完善输入的prompt。<br>默认false。</p>
     */
    public Boolean getEnableRewrite() {
        return this.EnableRewrite;
    }

    /**
     * Set <p>是否开启prompt扩写，开启后将补充完善输入的prompt。<br>默认false。</p>
     * @param EnableRewrite <p>是否开启prompt扩写，开启后将补充完善输入的prompt。<br>默认false。</p>
     */
    public void setEnableRewrite(Boolean EnableRewrite) {
        this.EnableRewrite = EnableRewrite;
    }

    /**
     * Get <p>是否开启时长自动匹配，开启后将自动根据prompt匹配适合时长的动作数据<br>默认false。</p> 
     * @return EnableDurationEst <p>是否开启时长自动匹配，开启后将自动根据prompt匹配适合时长的动作数据<br>默认false。</p>
     */
    public Boolean getEnableDurationEst() {
        return this.EnableDurationEst;
    }

    /**
     * Set <p>是否开启时长自动匹配，开启后将自动根据prompt匹配适合时长的动作数据<br>默认false。</p>
     * @param EnableDurationEst <p>是否开启时长自动匹配，开启后将自动根据prompt匹配适合时长的动作数据<br>默认false。</p>
     */
    public void setEnableDurationEst(Boolean EnableDurationEst) {
        this.EnableDurationEst = EnableDurationEst;
    }

    public SubmitHunyuanTo3DMotionJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubmitHunyuanTo3DMotionJobRequest(SubmitHunyuanTo3DMotionJobRequest source) {
        if (source.Prompt != null) {
            this.Prompt = new String(source.Prompt);
        }
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.RetargetFile != null) {
            this.RetargetFile = new InputFile3D(source.RetargetFile);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.EnableMesh != null) {
            this.EnableMesh = new Boolean(source.EnableMesh);
        }
        if (source.EnableRewrite != null) {
            this.EnableRewrite = new Boolean(source.EnableRewrite);
        }
        if (source.EnableDurationEst != null) {
            this.EnableDurationEst = new Boolean(source.EnableDurationEst);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamObj(map, prefix + "RetargetFile.", this.RetargetFile);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "EnableMesh", this.EnableMesh);
        this.setParamSimple(map, prefix + "EnableRewrite", this.EnableRewrite);
        this.setParamSimple(map, prefix + "EnableDurationEst", this.EnableDurationEst);

    }
}

