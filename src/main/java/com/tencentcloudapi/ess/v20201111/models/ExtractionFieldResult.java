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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExtractionFieldResult extends AbstractModel {

    /**
    * 字段ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 用于合同智能提取的字段名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 合同智能提取的字段类型，目前仅支持TEXT、DATE、NUMBER、OPTION类型。

类型支持如下： 1、TEXT（文本） 2、DATE（日期） 3、NUMBER（数字） 4、OPTION（选项值）
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 提取出合同中的字段信息。
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
    * 是否需要语义提取，默认为false
    */
    @SerializedName("RequiresSemanticExtraction")
    @Expose
    private Boolean RequiresSemanticExtraction;

    /**
    * 提取出值在合同中的坐标位置信息
    */
    @SerializedName("Positions")
    @Expose
    private PositionInfo [] Positions;

    /**
     * Get 字段ID 
     * @return Id 字段ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 字段ID
     * @param Id 字段ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 用于合同智能提取的字段名称。 
     * @return Name 用于合同智能提取的字段名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 用于合同智能提取的字段名称。
     * @param Name 用于合同智能提取的字段名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 合同智能提取的字段类型，目前仅支持TEXT、DATE、NUMBER、OPTION类型。

类型支持如下： 1、TEXT（文本） 2、DATE（日期） 3、NUMBER（数字） 4、OPTION（选项值） 
     * @return Type 合同智能提取的字段类型，目前仅支持TEXT、DATE、NUMBER、OPTION类型。

类型支持如下： 1、TEXT（文本） 2、DATE（日期） 3、NUMBER（数字） 4、OPTION（选项值）
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 合同智能提取的字段类型，目前仅支持TEXT、DATE、NUMBER、OPTION类型。

类型支持如下： 1、TEXT（文本） 2、DATE（日期） 3、NUMBER（数字） 4、OPTION（选项值）
     * @param Type 合同智能提取的字段类型，目前仅支持TEXT、DATE、NUMBER、OPTION类型。

类型支持如下： 1、TEXT（文本） 2、DATE（日期） 3、NUMBER（数字） 4、OPTION（选项值）
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 提取出合同中的字段信息。 
     * @return Values 提取出合同中的字段信息。
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set 提取出合同中的字段信息。
     * @param Values 提取出合同中的字段信息。
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    /**
     * Get 是否需要语义提取，默认为false 
     * @return RequiresSemanticExtraction 是否需要语义提取，默认为false
     */
    public Boolean getRequiresSemanticExtraction() {
        return this.RequiresSemanticExtraction;
    }

    /**
     * Set 是否需要语义提取，默认为false
     * @param RequiresSemanticExtraction 是否需要语义提取，默认为false
     */
    public void setRequiresSemanticExtraction(Boolean RequiresSemanticExtraction) {
        this.RequiresSemanticExtraction = RequiresSemanticExtraction;
    }

    /**
     * Get 提取出值在合同中的坐标位置信息 
     * @return Positions 提取出值在合同中的坐标位置信息
     */
    public PositionInfo [] getPositions() {
        return this.Positions;
    }

    /**
     * Set 提取出值在合同中的坐标位置信息
     * @param Positions 提取出值在合同中的坐标位置信息
     */
    public void setPositions(PositionInfo [] Positions) {
        this.Positions = Positions;
    }

    public ExtractionFieldResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExtractionFieldResult(ExtractionFieldResult source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Values != null) {
            this.Values = new String[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new String(source.Values[i]);
            }
        }
        if (source.RequiresSemanticExtraction != null) {
            this.RequiresSemanticExtraction = new Boolean(source.RequiresSemanticExtraction);
        }
        if (source.Positions != null) {
            this.Positions = new PositionInfo[source.Positions.length];
            for (int i = 0; i < source.Positions.length; i++) {
                this.Positions[i] = new PositionInfo(source.Positions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);
        this.setParamSimple(map, prefix + "RequiresSemanticExtraction", this.RequiresSemanticExtraction);
        this.setParamArrayObj(map, prefix + "Positions.", this.Positions);

    }
}

