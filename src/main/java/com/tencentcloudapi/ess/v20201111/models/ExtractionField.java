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

public class ExtractionField extends AbstractModel {

    /**
    * 用于合同智能提取的字段名称。

注意: `长度不能超过30个字符`
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 指定合同智能提取的字段类型，目前仅支持`TEXT`、`DATE`、`NUMBER`、`OPTION`类型。

类型支持如下：
1、TEXT（文本）
2、DATE（日期）
3、NUMBER（数字）
4、OPTION（选项值）
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 用于描述字段信息。

注意：
1、描述字段不能超过100个字符
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 提取出合同中的字段信息。
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
    * 当字段类型`Type`为OPTION时为必输项，输入选项值
    */
    @SerializedName("ChoiceList")
    @Expose
    private String [] ChoiceList;

    /**
     * Get 用于合同智能提取的字段名称。

注意: `长度不能超过30个字符` 
     * @return Name 用于合同智能提取的字段名称。

注意: `长度不能超过30个字符`
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 用于合同智能提取的字段名称。

注意: `长度不能超过30个字符`
     * @param Name 用于合同智能提取的字段名称。

注意: `长度不能超过30个字符`
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 指定合同智能提取的字段类型，目前仅支持`TEXT`、`DATE`、`NUMBER`、`OPTION`类型。

类型支持如下：
1、TEXT（文本）
2、DATE（日期）
3、NUMBER（数字）
4、OPTION（选项值） 
     * @return Type 指定合同智能提取的字段类型，目前仅支持`TEXT`、`DATE`、`NUMBER`、`OPTION`类型。

类型支持如下：
1、TEXT（文本）
2、DATE（日期）
3、NUMBER（数字）
4、OPTION（选项值）
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 指定合同智能提取的字段类型，目前仅支持`TEXT`、`DATE`、`NUMBER`、`OPTION`类型。

类型支持如下：
1、TEXT（文本）
2、DATE（日期）
3、NUMBER（数字）
4、OPTION（选项值）
     * @param Type 指定合同智能提取的字段类型，目前仅支持`TEXT`、`DATE`、`NUMBER`、`OPTION`类型。

类型支持如下：
1、TEXT（文本）
2、DATE（日期）
3、NUMBER（数字）
4、OPTION（选项值）
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 用于描述字段信息。

注意：
1、描述字段不能超过100个字符 
     * @return Description 用于描述字段信息。

注意：
1、描述字段不能超过100个字符
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 用于描述字段信息。

注意：
1、描述字段不能超过100个字符
     * @param Description 用于描述字段信息。

注意：
1、描述字段不能超过100个字符
     */
    public void setDescription(String Description) {
        this.Description = Description;
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
     * Get 当字段类型`Type`为OPTION时为必输项，输入选项值 
     * @return ChoiceList 当字段类型`Type`为OPTION时为必输项，输入选项值
     */
    public String [] getChoiceList() {
        return this.ChoiceList;
    }

    /**
     * Set 当字段类型`Type`为OPTION时为必输项，输入选项值
     * @param ChoiceList 当字段类型`Type`为OPTION时为必输项，输入选项值
     */
    public void setChoiceList(String [] ChoiceList) {
        this.ChoiceList = ChoiceList;
    }

    public ExtractionField() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExtractionField(ExtractionField source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Values != null) {
            this.Values = new String[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new String(source.Values[i]);
            }
        }
        if (source.ChoiceList != null) {
            this.ChoiceList = new String[source.ChoiceList.length];
            for (int i = 0; i < source.ChoiceList.length; i++) {
                this.ChoiceList[i] = new String(source.ChoiceList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);
        this.setParamArraySimple(map, prefix + "ChoiceList.", this.ChoiceList);

    }
}

