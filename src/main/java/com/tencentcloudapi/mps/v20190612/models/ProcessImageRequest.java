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

public class ProcessImageRequest extends AbstractModel {

    /**
    * 图片处理的文件输入信息。
    */
    @SerializedName("InputInfo")
    @Expose
    private MediaInputInfo InputInfo;

    /**
    * 图片处理输出文件的目标存储。不填则继承 InputInfo 中的存储位置。
    */
    @SerializedName("OutputStorage")
    @Expose
    private TaskOutputStorage OutputStorage;

    /**
    * 图片处理生成的文件输出的路径。如果不填表示与 InputInfo 中文件所在的目录一致。如果是目录，如`/image/201907/`，表示继承原文件名输出到该目录。
    */
    @SerializedName("OutputDir")
    @Expose
    private String OutputDir;

    /**
    * 输出路径，可以为相对路径或者绝对路径。
若需定义输出路径，路径需以`.{format}`结尾。变量名请参考 [文件名变量说明](https://cloud.tencent.com/document/product/862/37039)。
相对路径示例：
<li>文件名_{变量名}.{format}</li>
<li>文件名.{format}</li>
绝对路径示例：
<li>/自定义路径/文件名_{变量名}.{format}</li>
如果不填，则默认为相对路径：{inputName}.{format}。
    */
    @SerializedName("OutputPath")
    @Expose
    private String OutputPath;

    /**
    * 图片处理模板唯一标识。
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 资源ID，需要保证对应资源是开启状态。默认为帐号主资源ID。
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 图片处理参数。
    */
    @SerializedName("ImageTask")
    @Expose
    private ImageTaskInput ImageTask;

    /**
     * Get 图片处理的文件输入信息。 
     * @return InputInfo 图片处理的文件输入信息。
     */
    public MediaInputInfo getInputInfo() {
        return this.InputInfo;
    }

    /**
     * Set 图片处理的文件输入信息。
     * @param InputInfo 图片处理的文件输入信息。
     */
    public void setInputInfo(MediaInputInfo InputInfo) {
        this.InputInfo = InputInfo;
    }

    /**
     * Get 图片处理输出文件的目标存储。不填则继承 InputInfo 中的存储位置。 
     * @return OutputStorage 图片处理输出文件的目标存储。不填则继承 InputInfo 中的存储位置。
     */
    public TaskOutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * Set 图片处理输出文件的目标存储。不填则继承 InputInfo 中的存储位置。
     * @param OutputStorage 图片处理输出文件的目标存储。不填则继承 InputInfo 中的存储位置。
     */
    public void setOutputStorage(TaskOutputStorage OutputStorage) {
        this.OutputStorage = OutputStorage;
    }

    /**
     * Get 图片处理生成的文件输出的路径。如果不填表示与 InputInfo 中文件所在的目录一致。如果是目录，如`/image/201907/`，表示继承原文件名输出到该目录。 
     * @return OutputDir 图片处理生成的文件输出的路径。如果不填表示与 InputInfo 中文件所在的目录一致。如果是目录，如`/image/201907/`，表示继承原文件名输出到该目录。
     */
    public String getOutputDir() {
        return this.OutputDir;
    }

    /**
     * Set 图片处理生成的文件输出的路径。如果不填表示与 InputInfo 中文件所在的目录一致。如果是目录，如`/image/201907/`，表示继承原文件名输出到该目录。
     * @param OutputDir 图片处理生成的文件输出的路径。如果不填表示与 InputInfo 中文件所在的目录一致。如果是目录，如`/image/201907/`，表示继承原文件名输出到该目录。
     */
    public void setOutputDir(String OutputDir) {
        this.OutputDir = OutputDir;
    }

    /**
     * Get 输出路径，可以为相对路径或者绝对路径。
若需定义输出路径，路径需以`.{format}`结尾。变量名请参考 [文件名变量说明](https://cloud.tencent.com/document/product/862/37039)。
相对路径示例：
<li>文件名_{变量名}.{format}</li>
<li>文件名.{format}</li>
绝对路径示例：
<li>/自定义路径/文件名_{变量名}.{format}</li>
如果不填，则默认为相对路径：{inputName}.{format}。 
     * @return OutputPath 输出路径，可以为相对路径或者绝对路径。
若需定义输出路径，路径需以`.{format}`结尾。变量名请参考 [文件名变量说明](https://cloud.tencent.com/document/product/862/37039)。
相对路径示例：
<li>文件名_{变量名}.{format}</li>
<li>文件名.{format}</li>
绝对路径示例：
<li>/自定义路径/文件名_{变量名}.{format}</li>
如果不填，则默认为相对路径：{inputName}.{format}。
     */
    public String getOutputPath() {
        return this.OutputPath;
    }

    /**
     * Set 输出路径，可以为相对路径或者绝对路径。
若需定义输出路径，路径需以`.{format}`结尾。变量名请参考 [文件名变量说明](https://cloud.tencent.com/document/product/862/37039)。
相对路径示例：
<li>文件名_{变量名}.{format}</li>
<li>文件名.{format}</li>
绝对路径示例：
<li>/自定义路径/文件名_{变量名}.{format}</li>
如果不填，则默认为相对路径：{inputName}.{format}。
     * @param OutputPath 输出路径，可以为相对路径或者绝对路径。
若需定义输出路径，路径需以`.{format}`结尾。变量名请参考 [文件名变量说明](https://cloud.tencent.com/document/product/862/37039)。
相对路径示例：
<li>文件名_{变量名}.{format}</li>
<li>文件名.{format}</li>
绝对路径示例：
<li>/自定义路径/文件名_{变量名}.{format}</li>
如果不填，则默认为相对路径：{inputName}.{format}。
     */
    public void setOutputPath(String OutputPath) {
        this.OutputPath = OutputPath;
    }

    /**
     * Get 图片处理模板唯一标识。 
     * @return Definition 图片处理模板唯一标识。
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set 图片处理模板唯一标识。
     * @param Definition 图片处理模板唯一标识。
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get 资源ID，需要保证对应资源是开启状态。默认为帐号主资源ID。 
     * @return ResourceId 资源ID，需要保证对应资源是开启状态。默认为帐号主资源ID。
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源ID，需要保证对应资源是开启状态。默认为帐号主资源ID。
     * @param ResourceId 资源ID，需要保证对应资源是开启状态。默认为帐号主资源ID。
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 图片处理参数。 
     * @return ImageTask 图片处理参数。
     */
    public ImageTaskInput getImageTask() {
        return this.ImageTask;
    }

    /**
     * Set 图片处理参数。
     * @param ImageTask 图片处理参数。
     */
    public void setImageTask(ImageTaskInput ImageTask) {
        this.ImageTask = ImageTask;
    }

    public ProcessImageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProcessImageRequest(ProcessImageRequest source) {
        if (source.InputInfo != null) {
            this.InputInfo = new MediaInputInfo(source.InputInfo);
        }
        if (source.OutputStorage != null) {
            this.OutputStorage = new TaskOutputStorage(source.OutputStorage);
        }
        if (source.OutputDir != null) {
            this.OutputDir = new String(source.OutputDir);
        }
        if (source.OutputPath != null) {
            this.OutputPath = new String(source.OutputPath);
        }
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.ImageTask != null) {
            this.ImageTask = new ImageTaskInput(source.ImageTask);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "InputInfo.", this.InputInfo);
        this.setParamObj(map, prefix + "OutputStorage.", this.OutputStorage);
        this.setParamSimple(map, prefix + "OutputDir", this.OutputDir);
        this.setParamSimple(map, prefix + "OutputPath", this.OutputPath);
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamObj(map, prefix + "ImageTask.", this.ImageTask);

    }
}

