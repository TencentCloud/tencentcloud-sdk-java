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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CustomVariable extends AbstractModel {

    /**
    * <p>变量名称。需填写完整前缀：user.zone.* 表示站点级自定义变量，user.rule.* 表示规则级自定义变量。前缀后的自定义部分仅支持大小写字母、数字和下划线。变量名称区分大小写，长度不能超过 50 个字符。变量创建成功后，名称不可修改。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>变量初始值。支持使用常量字符串、变量以及公式。长度不能超过 255 个字符。</p>
    */
    @SerializedName("InitialValue")
    @Expose
    private String InitialValue;

    /**
    * <p>变量描述。长度限制不超过 60 个字符。</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get <p>变量名称。需填写完整前缀：user.zone.* 表示站点级自定义变量，user.rule.* 表示规则级自定义变量。前缀后的自定义部分仅支持大小写字母、数字和下划线。变量名称区分大小写，长度不能超过 50 个字符。变量创建成功后，名称不可修改。</p> 
     * @return Name <p>变量名称。需填写完整前缀：user.zone.* 表示站点级自定义变量，user.rule.* 表示规则级自定义变量。前缀后的自定义部分仅支持大小写字母、数字和下划线。变量名称区分大小写，长度不能超过 50 个字符。变量创建成功后，名称不可修改。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>变量名称。需填写完整前缀：user.zone.* 表示站点级自定义变量，user.rule.* 表示规则级自定义变量。前缀后的自定义部分仅支持大小写字母、数字和下划线。变量名称区分大小写，长度不能超过 50 个字符。变量创建成功后，名称不可修改。</p>
     * @param Name <p>变量名称。需填写完整前缀：user.zone.* 表示站点级自定义变量，user.rule.* 表示规则级自定义变量。前缀后的自定义部分仅支持大小写字母、数字和下划线。变量名称区分大小写，长度不能超过 50 个字符。变量创建成功后，名称不可修改。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>变量初始值。支持使用常量字符串、变量以及公式。长度不能超过 255 个字符。</p> 
     * @return InitialValue <p>变量初始值。支持使用常量字符串、变量以及公式。长度不能超过 255 个字符。</p>
     */
    public String getInitialValue() {
        return this.InitialValue;
    }

    /**
     * Set <p>变量初始值。支持使用常量字符串、变量以及公式。长度不能超过 255 个字符。</p>
     * @param InitialValue <p>变量初始值。支持使用常量字符串、变量以及公式。长度不能超过 255 个字符。</p>
     */
    public void setInitialValue(String InitialValue) {
        this.InitialValue = InitialValue;
    }

    /**
     * Get <p>变量描述。长度限制不超过 60 个字符。</p> 
     * @return Description <p>变量描述。长度限制不超过 60 个字符。</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>变量描述。长度限制不超过 60 个字符。</p>
     * @param Description <p>变量描述。长度限制不超过 60 个字符。</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public CustomVariable() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomVariable(CustomVariable source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.InitialValue != null) {
            this.InitialValue = new String(source.InitialValue);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "InitialValue", this.InitialValue);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

