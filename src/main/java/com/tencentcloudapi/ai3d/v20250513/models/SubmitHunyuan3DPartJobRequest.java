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

public class SubmitHunyuan3DPartJobRequest extends AbstractModel {

    /**
    * <p>需进行组件生成的3D模型文件，仅支持FBX格式。</p>
    */
    @SerializedName("File")
    @Expose
    private InputFile3D File;

    /**
    * <p>组件生成模型版本，默认为1.5</p><p>枚举值：</p><ul><li>1.5： 1.5模型</li></ul><p>默认值：1.5</p>
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * <p>是否分步骤进行组件生成；<br>开启后，输入原始模型后，可生成带分割信息的模型以及分割数据，可对此信息编辑后再传入带有分割信息的模型和分割数据进行编辑后的组件生成；<br>此参数默认关闭。</p>
    */
    @SerializedName("PartSegmentationInfo")
    @Expose
    private String PartSegmentationInfo;

    /**
    * <p>是否开启后处理，开启后将只输出一个模型链接，默认关闭。 （开启此接口后，需额外增加20积分）</p>
    */
    @SerializedName("EnableStagedGeneration")
    @Expose
    private Boolean EnableStagedGeneration;

    /**
     * Get <p>需进行组件生成的3D模型文件，仅支持FBX格式。</p> 
     * @return File <p>需进行组件生成的3D模型文件，仅支持FBX格式。</p>
     */
    public InputFile3D getFile() {
        return this.File;
    }

    /**
     * Set <p>需进行组件生成的3D模型文件，仅支持FBX格式。</p>
     * @param File <p>需进行组件生成的3D模型文件，仅支持FBX格式。</p>
     */
    public void setFile(InputFile3D File) {
        this.File = File;
    }

    /**
     * Get <p>组件生成模型版本，默认为1.5</p><p>枚举值：</p><ul><li>1.5： 1.5模型</li></ul><p>默认值：1.5</p> 
     * @return Model <p>组件生成模型版本，默认为1.5</p><p>枚举值：</p><ul><li>1.5： 1.5模型</li></ul><p>默认值：1.5</p>
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set <p>组件生成模型版本，默认为1.5</p><p>枚举值：</p><ul><li>1.5： 1.5模型</li></ul><p>默认值：1.5</p>
     * @param Model <p>组件生成模型版本，默认为1.5</p><p>枚举值：</p><ul><li>1.5： 1.5模型</li></ul><p>默认值：1.5</p>
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get <p>是否分步骤进行组件生成；<br>开启后，输入原始模型后，可生成带分割信息的模型以及分割数据，可对此信息编辑后再传入带有分割信息的模型和分割数据进行编辑后的组件生成；<br>此参数默认关闭。</p> 
     * @return PartSegmentationInfo <p>是否分步骤进行组件生成；<br>开启后，输入原始模型后，可生成带分割信息的模型以及分割数据，可对此信息编辑后再传入带有分割信息的模型和分割数据进行编辑后的组件生成；<br>此参数默认关闭。</p>
     */
    public String getPartSegmentationInfo() {
        return this.PartSegmentationInfo;
    }

    /**
     * Set <p>是否分步骤进行组件生成；<br>开启后，输入原始模型后，可生成带分割信息的模型以及分割数据，可对此信息编辑后再传入带有分割信息的模型和分割数据进行编辑后的组件生成；<br>此参数默认关闭。</p>
     * @param PartSegmentationInfo <p>是否分步骤进行组件生成；<br>开启后，输入原始模型后，可生成带分割信息的模型以及分割数据，可对此信息编辑后再传入带有分割信息的模型和分割数据进行编辑后的组件生成；<br>此参数默认关闭。</p>
     */
    public void setPartSegmentationInfo(String PartSegmentationInfo) {
        this.PartSegmentationInfo = PartSegmentationInfo;
    }

    /**
     * Get <p>是否开启后处理，开启后将只输出一个模型链接，默认关闭。 （开启此接口后，需额外增加20积分）</p> 
     * @return EnableStagedGeneration <p>是否开启后处理，开启后将只输出一个模型链接，默认关闭。 （开启此接口后，需额外增加20积分）</p>
     */
    public Boolean getEnableStagedGeneration() {
        return this.EnableStagedGeneration;
    }

    /**
     * Set <p>是否开启后处理，开启后将只输出一个模型链接，默认关闭。 （开启此接口后，需额外增加20积分）</p>
     * @param EnableStagedGeneration <p>是否开启后处理，开启后将只输出一个模型链接，默认关闭。 （开启此接口后，需额外增加20积分）</p>
     */
    public void setEnableStagedGeneration(Boolean EnableStagedGeneration) {
        this.EnableStagedGeneration = EnableStagedGeneration;
    }

    public SubmitHunyuan3DPartJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubmitHunyuan3DPartJobRequest(SubmitHunyuan3DPartJobRequest source) {
        if (source.File != null) {
            this.File = new InputFile3D(source.File);
        }
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.PartSegmentationInfo != null) {
            this.PartSegmentationInfo = new String(source.PartSegmentationInfo);
        }
        if (source.EnableStagedGeneration != null) {
            this.EnableStagedGeneration = new Boolean(source.EnableStagedGeneration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "File.", this.File);
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamSimple(map, prefix + "PartSegmentationInfo", this.PartSegmentationInfo);
        this.setParamSimple(map, prefix + "EnableStagedGeneration", this.EnableStagedGeneration);

    }
}

