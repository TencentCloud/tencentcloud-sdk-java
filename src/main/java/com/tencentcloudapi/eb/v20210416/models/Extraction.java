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
package com.tencentcloudapi.eb.v20210416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Extraction extends AbstractModel{

    /**
    * JsonPath, 不指定则使用默认值$.
    */
    @SerializedName("ExtractionInputPath")
    @Expose
    private String ExtractionInputPath;

    /**
    * 取值: TEXT/JSON
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * 仅在Text需要传递
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TextParams")
    @Expose
    private TextParams TextParams;

    /**
     * Get JsonPath, 不指定则使用默认值$. 
     * @return ExtractionInputPath JsonPath, 不指定则使用默认值$.
     */
    public String getExtractionInputPath() {
        return this.ExtractionInputPath;
    }

    /**
     * Set JsonPath, 不指定则使用默认值$.
     * @param ExtractionInputPath JsonPath, 不指定则使用默认值$.
     */
    public void setExtractionInputPath(String ExtractionInputPath) {
        this.ExtractionInputPath = ExtractionInputPath;
    }

    /**
     * Get 取值: TEXT/JSON 
     * @return Format 取值: TEXT/JSON
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set 取值: TEXT/JSON
     * @param Format 取值: TEXT/JSON
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get 仅在Text需要传递
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TextParams 仅在Text需要传递
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TextParams getTextParams() {
        return this.TextParams;
    }

    /**
     * Set 仅在Text需要传递
注意：此字段可能返回 null，表示取不到有效值。
     * @param TextParams 仅在Text需要传递
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTextParams(TextParams TextParams) {
        this.TextParams = TextParams;
    }

    public Extraction() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Extraction(Extraction source) {
        if (source.ExtractionInputPath != null) {
            this.ExtractionInputPath = new String(source.ExtractionInputPath);
        }
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
        if (source.TextParams != null) {
            this.TextParams = new TextParams(source.TextParams);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExtractionInputPath", this.ExtractionInputPath);
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamObj(map, prefix + "TextParams.", this.TextParams);

    }
}

