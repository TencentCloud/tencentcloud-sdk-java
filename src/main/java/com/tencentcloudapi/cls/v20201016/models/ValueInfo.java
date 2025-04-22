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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ValueInfo extends AbstractModel {

    /**
    * 字段类型，目前支持的类型有：long、text、double
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 字段的分词符，其中的每个字符代表一个分词符；
仅支持英文符号、\n\t\r及转义符\；
long及double类型字段需为空；
注意：\n\t\r本身已被转义，直接使用双引号包裹即可作为入参，无需再次转义。使用API Explorer进行调试时请使用JSON参数输入方式，以避免\n\t\r被重复转义
    */
    @SerializedName("Tokenizer")
    @Expose
    private String Tokenizer;

    /**
    * 字段是否开启分析功能
    */
    @SerializedName("SqlFlag")
    @Expose
    private Boolean SqlFlag;

    /**
    * 是否包含中文，long及double类型字段需为false
    */
    @SerializedName("ContainZH")
    @Expose
    private Boolean ContainZH;

    /**
    * 字段别名
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
     * Get 字段类型，目前支持的类型有：long、text、double 
     * @return Type 字段类型，目前支持的类型有：long、text、double
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 字段类型，目前支持的类型有：long、text、double
     * @param Type 字段类型，目前支持的类型有：long、text、double
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 字段的分词符，其中的每个字符代表一个分词符；
仅支持英文符号、\n\t\r及转义符\；
long及double类型字段需为空；
注意：\n\t\r本身已被转义，直接使用双引号包裹即可作为入参，无需再次转义。使用API Explorer进行调试时请使用JSON参数输入方式，以避免\n\t\r被重复转义 
     * @return Tokenizer 字段的分词符，其中的每个字符代表一个分词符；
仅支持英文符号、\n\t\r及转义符\；
long及double类型字段需为空；
注意：\n\t\r本身已被转义，直接使用双引号包裹即可作为入参，无需再次转义。使用API Explorer进行调试时请使用JSON参数输入方式，以避免\n\t\r被重复转义
     */
    public String getTokenizer() {
        return this.Tokenizer;
    }

    /**
     * Set 字段的分词符，其中的每个字符代表一个分词符；
仅支持英文符号、\n\t\r及转义符\；
long及double类型字段需为空；
注意：\n\t\r本身已被转义，直接使用双引号包裹即可作为入参，无需再次转义。使用API Explorer进行调试时请使用JSON参数输入方式，以避免\n\t\r被重复转义
     * @param Tokenizer 字段的分词符，其中的每个字符代表一个分词符；
仅支持英文符号、\n\t\r及转义符\；
long及double类型字段需为空；
注意：\n\t\r本身已被转义，直接使用双引号包裹即可作为入参，无需再次转义。使用API Explorer进行调试时请使用JSON参数输入方式，以避免\n\t\r被重复转义
     */
    public void setTokenizer(String Tokenizer) {
        this.Tokenizer = Tokenizer;
    }

    /**
     * Get 字段是否开启分析功能 
     * @return SqlFlag 字段是否开启分析功能
     */
    public Boolean getSqlFlag() {
        return this.SqlFlag;
    }

    /**
     * Set 字段是否开启分析功能
     * @param SqlFlag 字段是否开启分析功能
     */
    public void setSqlFlag(Boolean SqlFlag) {
        this.SqlFlag = SqlFlag;
    }

    /**
     * Get 是否包含中文，long及double类型字段需为false 
     * @return ContainZH 是否包含中文，long及double类型字段需为false
     */
    public Boolean getContainZH() {
        return this.ContainZH;
    }

    /**
     * Set 是否包含中文，long及double类型字段需为false
     * @param ContainZH 是否包含中文，long及double类型字段需为false
     */
    public void setContainZH(Boolean ContainZH) {
        this.ContainZH = ContainZH;
    }

    /**
     * Get 字段别名 
     * @return Alias 字段别名
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set 字段别名
     * @param Alias 字段别名
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    public ValueInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ValueInfo(ValueInfo source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Tokenizer != null) {
            this.Tokenizer = new String(source.Tokenizer);
        }
        if (source.SqlFlag != null) {
            this.SqlFlag = new Boolean(source.SqlFlag);
        }
        if (source.ContainZH != null) {
            this.ContainZH = new Boolean(source.ContainZH);
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Tokenizer", this.Tokenizer);
        this.setParamSimple(map, prefix + "SqlFlag", this.SqlFlag);
        this.setParamSimple(map, prefix + "ContainZH", this.ContainZH);
        this.setParamSimple(map, prefix + "Alias", this.Alias);

    }
}

