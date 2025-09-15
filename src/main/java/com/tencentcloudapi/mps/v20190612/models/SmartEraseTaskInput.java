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

public class SmartEraseTaskInput extends AbstractModel {

    /**
    * 智能擦除模板id。
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 智能擦除自定义参数，当 Definition 填 0 时有效。 该参数用于高度定制场景，建议您优先使用 Definition 指定智能擦除参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RawParameter")
    @Expose
    private RawSmartEraseParameter RawParameter;

    /**
    * 文件的目标存储，不填则继承上层的 OutputStorage 值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutputStorage")
    @Expose
    private TaskOutputStorage OutputStorage;

    /**
    * 文件的输出路径，可以为相对路径或者绝对路径。
若需定义输出路径，路径需以`.{format}`结尾。变量名请参考 [文件名变量说明](https://cloud.tencent.com/document/product/862/37039)。
相对路径示例：
<li>文件名_{变量名}.{format}</li>
<li>文件名.{format}</li>
绝对路径示例：
<li>/自定义路径/文件名_{变量名}.{format}</li>

**注意**：目前不支持`BatchProcessMedia`接口。
    */
    @SerializedName("OutputObjectPath")
    @Expose
    private String OutputObjectPath;

    /**
     * Get 智能擦除模板id。 
     * @return Definition 智能擦除模板id。
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set 智能擦除模板id。
     * @param Definition 智能擦除模板id。
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get 智能擦除自定义参数，当 Definition 填 0 时有效。 该参数用于高度定制场景，建议您优先使用 Definition 指定智能擦除参数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RawParameter 智能擦除自定义参数，当 Definition 填 0 时有效。 该参数用于高度定制场景，建议您优先使用 Definition 指定智能擦除参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RawSmartEraseParameter getRawParameter() {
        return this.RawParameter;
    }

    /**
     * Set 智能擦除自定义参数，当 Definition 填 0 时有效。 该参数用于高度定制场景，建议您优先使用 Definition 指定智能擦除参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RawParameter 智能擦除自定义参数，当 Definition 填 0 时有效。 该参数用于高度定制场景，建议您优先使用 Definition 指定智能擦除参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRawParameter(RawSmartEraseParameter RawParameter) {
        this.RawParameter = RawParameter;
    }

    /**
     * Get 文件的目标存储，不填则继承上层的 OutputStorage 值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutputStorage 文件的目标存储，不填则继承上层的 OutputStorage 值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskOutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * Set 文件的目标存储，不填则继承上层的 OutputStorage 值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutputStorage 文件的目标存储，不填则继承上层的 OutputStorage 值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutputStorage(TaskOutputStorage OutputStorage) {
        this.OutputStorage = OutputStorage;
    }

    /**
     * Get 文件的输出路径，可以为相对路径或者绝对路径。
若需定义输出路径，路径需以`.{format}`结尾。变量名请参考 [文件名变量说明](https://cloud.tencent.com/document/product/862/37039)。
相对路径示例：
<li>文件名_{变量名}.{format}</li>
<li>文件名.{format}</li>
绝对路径示例：
<li>/自定义路径/文件名_{变量名}.{format}</li>

**注意**：目前不支持`BatchProcessMedia`接口。 
     * @return OutputObjectPath 文件的输出路径，可以为相对路径或者绝对路径。
若需定义输出路径，路径需以`.{format}`结尾。变量名请参考 [文件名变量说明](https://cloud.tencent.com/document/product/862/37039)。
相对路径示例：
<li>文件名_{变量名}.{format}</li>
<li>文件名.{format}</li>
绝对路径示例：
<li>/自定义路径/文件名_{变量名}.{format}</li>

**注意**：目前不支持`BatchProcessMedia`接口。
     */
    public String getOutputObjectPath() {
        return this.OutputObjectPath;
    }

    /**
     * Set 文件的输出路径，可以为相对路径或者绝对路径。
若需定义输出路径，路径需以`.{format}`结尾。变量名请参考 [文件名变量说明](https://cloud.tencent.com/document/product/862/37039)。
相对路径示例：
<li>文件名_{变量名}.{format}</li>
<li>文件名.{format}</li>
绝对路径示例：
<li>/自定义路径/文件名_{变量名}.{format}</li>

**注意**：目前不支持`BatchProcessMedia`接口。
     * @param OutputObjectPath 文件的输出路径，可以为相对路径或者绝对路径。
若需定义输出路径，路径需以`.{format}`结尾。变量名请参考 [文件名变量说明](https://cloud.tencent.com/document/product/862/37039)。
相对路径示例：
<li>文件名_{变量名}.{format}</li>
<li>文件名.{format}</li>
绝对路径示例：
<li>/自定义路径/文件名_{变量名}.{format}</li>

**注意**：目前不支持`BatchProcessMedia`接口。
     */
    public void setOutputObjectPath(String OutputObjectPath) {
        this.OutputObjectPath = OutputObjectPath;
    }

    public SmartEraseTaskInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SmartEraseTaskInput(SmartEraseTaskInput source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.RawParameter != null) {
            this.RawParameter = new RawSmartEraseParameter(source.RawParameter);
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
        this.setParamObj(map, prefix + "RawParameter.", this.RawParameter);
        this.setParamObj(map, prefix + "OutputStorage.", this.OutputStorage);
        this.setParamSimple(map, prefix + "OutputObjectPath", this.OutputObjectPath);

    }
}

