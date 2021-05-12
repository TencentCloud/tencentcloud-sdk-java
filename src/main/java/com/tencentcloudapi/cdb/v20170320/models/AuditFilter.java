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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuditFilter extends AbstractModel{

    /**
    * 过滤条件参数名称。目前支持：
SrcIp – 客户端 IP；
User – 数据库账户；
DB – 数据库名称；
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 过滤条件匹配类型。目前支持：
INC – 包含；
EXC – 不包含；
EQ – 等于；
NEQ – 不等于；
    */
    @SerializedName("Compare")
    @Expose
    private String Compare;

    /**
    * 过滤条件匹配值。
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get 过滤条件参数名称。目前支持：
SrcIp – 客户端 IP；
User – 数据库账户；
DB – 数据库名称； 
     * @return Type 过滤条件参数名称。目前支持：
SrcIp – 客户端 IP；
User – 数据库账户；
DB – 数据库名称；
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 过滤条件参数名称。目前支持：
SrcIp – 客户端 IP；
User – 数据库账户；
DB – 数据库名称；
     * @param Type 过滤条件参数名称。目前支持：
SrcIp – 客户端 IP；
User – 数据库账户；
DB – 数据库名称；
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 过滤条件匹配类型。目前支持：
INC – 包含；
EXC – 不包含；
EQ – 等于；
NEQ – 不等于； 
     * @return Compare 过滤条件匹配类型。目前支持：
INC – 包含；
EXC – 不包含；
EQ – 等于；
NEQ – 不等于；
     */
    public String getCompare() {
        return this.Compare;
    }

    /**
     * Set 过滤条件匹配类型。目前支持：
INC – 包含；
EXC – 不包含；
EQ – 等于；
NEQ – 不等于；
     * @param Compare 过滤条件匹配类型。目前支持：
INC – 包含；
EXC – 不包含；
EQ – 等于；
NEQ – 不等于；
     */
    public void setCompare(String Compare) {
        this.Compare = Compare;
    }

    /**
     * Get 过滤条件匹配值。 
     * @return Value 过滤条件匹配值。
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 过滤条件匹配值。
     * @param Value 过滤条件匹配值。
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public AuditFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuditFilter(AuditFilter source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Compare != null) {
            this.Compare = new String(source.Compare);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Compare", this.Compare);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

