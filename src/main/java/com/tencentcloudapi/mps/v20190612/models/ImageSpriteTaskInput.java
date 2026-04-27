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

public class ImageSpriteTaskInput extends AbstractModel {

    /**
    * <p>雪碧图模板 ID。</p>
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * <p>截取雪碧图后文件的目标存储，不填则继承上层的 OutputStorage 值。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutputStorage")
    @Expose
    private TaskOutputStorage OutputStorage;

    /**
    * <p>截取雪碧图后，雪碧图图片文件的输出路径，可以为相对路径或者绝对路径。<br>若需定义输出路径，路径需以<code>.{format}</code>结尾。变量名请参考 <a href="https://cloud.tencent.com/document/product/862/37039">文件名变量说明</a>。<br>相对路径示例：</p><li>文件名_{变量名}.{format}</li><li>文件名.{format}</li>绝对路径示例：<li>/自定义路径/文件名_{变量名}.{format}</li>如果不填，则默认为相对路径：<code>{inputName}_imageSprite_{definition}_{number}.{format}</code>。
    */
    @SerializedName("OutputObjectPath")
    @Expose
    private String OutputObjectPath;

    /**
    * <p>截取雪碧图后，Web VTT 文件的输出路径，只能为相对路径。如果不填，则默认为相对路径：<code>{inputName}_imageSprite_{definition}.{format}</code>。</p>
    */
    @SerializedName("WebVttObjectName")
    @Expose
    private String WebVttObjectName;

    /**
    * <p>截取雪碧图后输出路径中的<code>{number}</code>变量的规则。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ObjectNumberFormat")
    @Expose
    private NumberFormat ObjectNumberFormat;

    /**
    * <p>扩展参数。</p>
    */
    @SerializedName("ExtInfo")
    @Expose
    private String ExtInfo;

    /**
     * Get <p>雪碧图模板 ID。</p> 
     * @return Definition <p>雪碧图模板 ID。</p>
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set <p>雪碧图模板 ID。</p>
     * @param Definition <p>雪碧图模板 ID。</p>
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get <p>截取雪碧图后文件的目标存储，不填则继承上层的 OutputStorage 值。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutputStorage <p>截取雪碧图后文件的目标存储，不填则继承上层的 OutputStorage 值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskOutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * Set <p>截取雪碧图后文件的目标存储，不填则继承上层的 OutputStorage 值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutputStorage <p>截取雪碧图后文件的目标存储，不填则继承上层的 OutputStorage 值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutputStorage(TaskOutputStorage OutputStorage) {
        this.OutputStorage = OutputStorage;
    }

    /**
     * Get <p>截取雪碧图后，雪碧图图片文件的输出路径，可以为相对路径或者绝对路径。<br>若需定义输出路径，路径需以<code>.{format}</code>结尾。变量名请参考 <a href="https://cloud.tencent.com/document/product/862/37039">文件名变量说明</a>。<br>相对路径示例：</p><li>文件名_{变量名}.{format}</li><li>文件名.{format}</li>绝对路径示例：<li>/自定义路径/文件名_{变量名}.{format}</li>如果不填，则默认为相对路径：<code>{inputName}_imageSprite_{definition}_{number}.{format}</code>。 
     * @return OutputObjectPath <p>截取雪碧图后，雪碧图图片文件的输出路径，可以为相对路径或者绝对路径。<br>若需定义输出路径，路径需以<code>.{format}</code>结尾。变量名请参考 <a href="https://cloud.tencent.com/document/product/862/37039">文件名变量说明</a>。<br>相对路径示例：</p><li>文件名_{变量名}.{format}</li><li>文件名.{format}</li>绝对路径示例：<li>/自定义路径/文件名_{变量名}.{format}</li>如果不填，则默认为相对路径：<code>{inputName}_imageSprite_{definition}_{number}.{format}</code>。
     */
    public String getOutputObjectPath() {
        return this.OutputObjectPath;
    }

    /**
     * Set <p>截取雪碧图后，雪碧图图片文件的输出路径，可以为相对路径或者绝对路径。<br>若需定义输出路径，路径需以<code>.{format}</code>结尾。变量名请参考 <a href="https://cloud.tencent.com/document/product/862/37039">文件名变量说明</a>。<br>相对路径示例：</p><li>文件名_{变量名}.{format}</li><li>文件名.{format}</li>绝对路径示例：<li>/自定义路径/文件名_{变量名}.{format}</li>如果不填，则默认为相对路径：<code>{inputName}_imageSprite_{definition}_{number}.{format}</code>。
     * @param OutputObjectPath <p>截取雪碧图后，雪碧图图片文件的输出路径，可以为相对路径或者绝对路径。<br>若需定义输出路径，路径需以<code>.{format}</code>结尾。变量名请参考 <a href="https://cloud.tencent.com/document/product/862/37039">文件名变量说明</a>。<br>相对路径示例：</p><li>文件名_{变量名}.{format}</li><li>文件名.{format}</li>绝对路径示例：<li>/自定义路径/文件名_{变量名}.{format}</li>如果不填，则默认为相对路径：<code>{inputName}_imageSprite_{definition}_{number}.{format}</code>。
     */
    public void setOutputObjectPath(String OutputObjectPath) {
        this.OutputObjectPath = OutputObjectPath;
    }

    /**
     * Get <p>截取雪碧图后，Web VTT 文件的输出路径，只能为相对路径。如果不填，则默认为相对路径：<code>{inputName}_imageSprite_{definition}.{format}</code>。</p> 
     * @return WebVttObjectName <p>截取雪碧图后，Web VTT 文件的输出路径，只能为相对路径。如果不填，则默认为相对路径：<code>{inputName}_imageSprite_{definition}.{format}</code>。</p>
     */
    public String getWebVttObjectName() {
        return this.WebVttObjectName;
    }

    /**
     * Set <p>截取雪碧图后，Web VTT 文件的输出路径，只能为相对路径。如果不填，则默认为相对路径：<code>{inputName}_imageSprite_{definition}.{format}</code>。</p>
     * @param WebVttObjectName <p>截取雪碧图后，Web VTT 文件的输出路径，只能为相对路径。如果不填，则默认为相对路径：<code>{inputName}_imageSprite_{definition}.{format}</code>。</p>
     */
    public void setWebVttObjectName(String WebVttObjectName) {
        this.WebVttObjectName = WebVttObjectName;
    }

    /**
     * Get <p>截取雪碧图后输出路径中的<code>{number}</code>变量的规则。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ObjectNumberFormat <p>截取雪碧图后输出路径中的<code>{number}</code>变量的规则。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NumberFormat getObjectNumberFormat() {
        return this.ObjectNumberFormat;
    }

    /**
     * Set <p>截取雪碧图后输出路径中的<code>{number}</code>变量的规则。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ObjectNumberFormat <p>截取雪碧图后输出路径中的<code>{number}</code>变量的规则。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setObjectNumberFormat(NumberFormat ObjectNumberFormat) {
        this.ObjectNumberFormat = ObjectNumberFormat;
    }

    /**
     * Get <p>扩展参数。</p> 
     * @return ExtInfo <p>扩展参数。</p>
     */
    public String getExtInfo() {
        return this.ExtInfo;
    }

    /**
     * Set <p>扩展参数。</p>
     * @param ExtInfo <p>扩展参数。</p>
     */
    public void setExtInfo(String ExtInfo) {
        this.ExtInfo = ExtInfo;
    }

    public ImageSpriteTaskInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageSpriteTaskInput(ImageSpriteTaskInput source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.OutputStorage != null) {
            this.OutputStorage = new TaskOutputStorage(source.OutputStorage);
        }
        if (source.OutputObjectPath != null) {
            this.OutputObjectPath = new String(source.OutputObjectPath);
        }
        if (source.WebVttObjectName != null) {
            this.WebVttObjectName = new String(source.WebVttObjectName);
        }
        if (source.ObjectNumberFormat != null) {
            this.ObjectNumberFormat = new NumberFormat(source.ObjectNumberFormat);
        }
        if (source.ExtInfo != null) {
            this.ExtInfo = new String(source.ExtInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamObj(map, prefix + "OutputStorage.", this.OutputStorage);
        this.setParamSimple(map, prefix + "OutputObjectPath", this.OutputObjectPath);
        this.setParamSimple(map, prefix + "WebVttObjectName", this.WebVttObjectName);
        this.setParamObj(map, prefix + "ObjectNumberFormat.", this.ObjectNumberFormat);
        this.setParamSimple(map, prefix + "ExtInfo", this.ExtInfo);

    }
}

