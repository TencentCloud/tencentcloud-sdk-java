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

public class AddOnParameter extends AbstractModel {

    /**
    * 附加图片输入。
    */
    @SerializedName("ImageSet")
    @Expose
    private AddOnImageInput [] ImageSet;

    /**
    * 图片处理输出配置。
    */
    @SerializedName("OutputConfig")
    @Expose
    private ImageProcessOutputConfig OutputConfig;

    /**
    * 图片处理附加 prompt，只针对某些场景可用。
    */
    @SerializedName("ExtPrompt")
    @Expose
    private ImageProcessPrompt [] ExtPrompt;

    /**
     * Get 附加图片输入。 
     * @return ImageSet 附加图片输入。
     */
    public AddOnImageInput [] getImageSet() {
        return this.ImageSet;
    }

    /**
     * Set 附加图片输入。
     * @param ImageSet 附加图片输入。
     */
    public void setImageSet(AddOnImageInput [] ImageSet) {
        this.ImageSet = ImageSet;
    }

    /**
     * Get 图片处理输出配置。 
     * @return OutputConfig 图片处理输出配置。
     */
    public ImageProcessOutputConfig getOutputConfig() {
        return this.OutputConfig;
    }

    /**
     * Set 图片处理输出配置。
     * @param OutputConfig 图片处理输出配置。
     */
    public void setOutputConfig(ImageProcessOutputConfig OutputConfig) {
        this.OutputConfig = OutputConfig;
    }

    /**
     * Get 图片处理附加 prompt，只针对某些场景可用。 
     * @return ExtPrompt 图片处理附加 prompt，只针对某些场景可用。
     */
    public ImageProcessPrompt [] getExtPrompt() {
        return this.ExtPrompt;
    }

    /**
     * Set 图片处理附加 prompt，只针对某些场景可用。
     * @param ExtPrompt 图片处理附加 prompt，只针对某些场景可用。
     */
    public void setExtPrompt(ImageProcessPrompt [] ExtPrompt) {
        this.ExtPrompt = ExtPrompt;
    }

    public AddOnParameter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddOnParameter(AddOnParameter source) {
        if (source.ImageSet != null) {
            this.ImageSet = new AddOnImageInput[source.ImageSet.length];
            for (int i = 0; i < source.ImageSet.length; i++) {
                this.ImageSet[i] = new AddOnImageInput(source.ImageSet[i]);
            }
        }
        if (source.OutputConfig != null) {
            this.OutputConfig = new ImageProcessOutputConfig(source.OutputConfig);
        }
        if (source.ExtPrompt != null) {
            this.ExtPrompt = new ImageProcessPrompt[source.ExtPrompt.length];
            for (int i = 0; i < source.ExtPrompt.length; i++) {
                this.ExtPrompt[i] = new ImageProcessPrompt(source.ExtPrompt[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ImageSet.", this.ImageSet);
        this.setParamObj(map, prefix + "OutputConfig.", this.OutputConfig);
        this.setParamArrayObj(map, prefix + "ExtPrompt.", this.ExtPrompt);

    }
}

