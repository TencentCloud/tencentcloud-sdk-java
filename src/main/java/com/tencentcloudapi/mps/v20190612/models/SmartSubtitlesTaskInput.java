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

public class SmartSubtitlesTaskInput extends AbstractModel {

    /**
    * 智能字幕模板 ID 。	
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 用户扩展字段，一般场景不用填。
    */
    @SerializedName("UserExtPara")
    @Expose
    private String UserExtPara;

    /**
    * 智能字幕自定义参数，当 Definition 填 0 时有效。 该参数用于高度定制场景，建议您优先使用 Definition 指定智能字幕参数。	
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RawParameter")
    @Expose
    private RawSmartSubtitleParameter RawParameter;

    /**
    * 媒体处理输出文件的目标存储。不填则继承 InputInfo 中的存储位置。 
**注意**：当InputInfo.Type为URL时，该参数是必填项。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutputStorage")
    @Expose
    private TaskOutputStorage OutputStorage;

    /**
    * 生成字幕文件的输出路径，可以为相对路径或者绝对路径。
若需定义输出路径，路径需以`.{format}`结尾。变量名请参考 [文件名变量说明](https://cloud.tencent.com/document/product/862/37039)。

相对路径示例:
- 文件名_{变量名}.{format}
- 文件名.{format}

绝对路径示例：
- /自定义路径/文件名_{变量名}.{format}

如果不填，则默认为相对路径: `{inputName}_smartsubtitle_{definition}.{format}`。
    */
    @SerializedName("OutputObjectPath")
    @Expose
    private String OutputObjectPath;

    /**
     * Get 智能字幕模板 ID 。	 
     * @return Definition 智能字幕模板 ID 。	
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set 智能字幕模板 ID 。	
     * @param Definition 智能字幕模板 ID 。	
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get 用户扩展字段，一般场景不用填。 
     * @return UserExtPara 用户扩展字段，一般场景不用填。
     */
    public String getUserExtPara() {
        return this.UserExtPara;
    }

    /**
     * Set 用户扩展字段，一般场景不用填。
     * @param UserExtPara 用户扩展字段，一般场景不用填。
     */
    public void setUserExtPara(String UserExtPara) {
        this.UserExtPara = UserExtPara;
    }

    /**
     * Get 智能字幕自定义参数，当 Definition 填 0 时有效。 该参数用于高度定制场景，建议您优先使用 Definition 指定智能字幕参数。	
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RawParameter 智能字幕自定义参数，当 Definition 填 0 时有效。 该参数用于高度定制场景，建议您优先使用 Definition 指定智能字幕参数。	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RawSmartSubtitleParameter getRawParameter() {
        return this.RawParameter;
    }

    /**
     * Set 智能字幕自定义参数，当 Definition 填 0 时有效。 该参数用于高度定制场景，建议您优先使用 Definition 指定智能字幕参数。	
注意：此字段可能返回 null，表示取不到有效值。
     * @param RawParameter 智能字幕自定义参数，当 Definition 填 0 时有效。 该参数用于高度定制场景，建议您优先使用 Definition 指定智能字幕参数。	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRawParameter(RawSmartSubtitleParameter RawParameter) {
        this.RawParameter = RawParameter;
    }

    /**
     * Get 媒体处理输出文件的目标存储。不填则继承 InputInfo 中的存储位置。 
**注意**：当InputInfo.Type为URL时，该参数是必填项。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutputStorage 媒体处理输出文件的目标存储。不填则继承 InputInfo 中的存储位置。 
**注意**：当InputInfo.Type为URL时，该参数是必填项。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskOutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * Set 媒体处理输出文件的目标存储。不填则继承 InputInfo 中的存储位置。 
**注意**：当InputInfo.Type为URL时，该参数是必填项。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutputStorage 媒体处理输出文件的目标存储。不填则继承 InputInfo 中的存储位置。 
**注意**：当InputInfo.Type为URL时，该参数是必填项。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutputStorage(TaskOutputStorage OutputStorage) {
        this.OutputStorage = OutputStorage;
    }

    /**
     * Get 生成字幕文件的输出路径，可以为相对路径或者绝对路径。
若需定义输出路径，路径需以`.{format}`结尾。变量名请参考 [文件名变量说明](https://cloud.tencent.com/document/product/862/37039)。

相对路径示例:
- 文件名_{变量名}.{format}
- 文件名.{format}

绝对路径示例：
- /自定义路径/文件名_{变量名}.{format}

如果不填，则默认为相对路径: `{inputName}_smartsubtitle_{definition}.{format}`。 
     * @return OutputObjectPath 生成字幕文件的输出路径，可以为相对路径或者绝对路径。
若需定义输出路径，路径需以`.{format}`结尾。变量名请参考 [文件名变量说明](https://cloud.tencent.com/document/product/862/37039)。

相对路径示例:
- 文件名_{变量名}.{format}
- 文件名.{format}

绝对路径示例：
- /自定义路径/文件名_{变量名}.{format}

如果不填，则默认为相对路径: `{inputName}_smartsubtitle_{definition}.{format}`。
     */
    public String getOutputObjectPath() {
        return this.OutputObjectPath;
    }

    /**
     * Set 生成字幕文件的输出路径，可以为相对路径或者绝对路径。
若需定义输出路径，路径需以`.{format}`结尾。变量名请参考 [文件名变量说明](https://cloud.tencent.com/document/product/862/37039)。

相对路径示例:
- 文件名_{变量名}.{format}
- 文件名.{format}

绝对路径示例：
- /自定义路径/文件名_{变量名}.{format}

如果不填，则默认为相对路径: `{inputName}_smartsubtitle_{definition}.{format}`。
     * @param OutputObjectPath 生成字幕文件的输出路径，可以为相对路径或者绝对路径。
若需定义输出路径，路径需以`.{format}`结尾。变量名请参考 [文件名变量说明](https://cloud.tencent.com/document/product/862/37039)。

相对路径示例:
- 文件名_{变量名}.{format}
- 文件名.{format}

绝对路径示例：
- /自定义路径/文件名_{变量名}.{format}

如果不填，则默认为相对路径: `{inputName}_smartsubtitle_{definition}.{format}`。
     */
    public void setOutputObjectPath(String OutputObjectPath) {
        this.OutputObjectPath = OutputObjectPath;
    }

    public SmartSubtitlesTaskInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SmartSubtitlesTaskInput(SmartSubtitlesTaskInput source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.UserExtPara != null) {
            this.UserExtPara = new String(source.UserExtPara);
        }
        if (source.RawParameter != null) {
            this.RawParameter = new RawSmartSubtitleParameter(source.RawParameter);
        }
        if (source.OutputStorage != null) {
            this.OutputStorage = new TaskOutputStorage(source.OutputStorage);
        }
        if (source.OutputObjectPath != null) {
            this.OutputObjectPath = new String(source.OutputObjectPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "UserExtPara", this.UserExtPara);
        this.setParamObj(map, prefix + "RawParameter.", this.RawParameter);
        this.setParamObj(map, prefix + "OutputStorage.", this.OutputStorage);
        this.setParamSimple(map, prefix + "OutputObjectPath", this.OutputObjectPath);

    }
}

