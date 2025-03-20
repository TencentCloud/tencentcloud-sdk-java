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

public class AlarmAnalysisConfig extends AbstractModel {

    /**
    * 键。支持以下key：
SyntaxRule：语法规则，value支持 0：Lucene语法；1： CQL语法。
QueryIndex：执行语句序号。value支持  -1：自定义； 1：执行语句1； 2：执行语句2。
CustomQuery：检索语句。 QueryIndex为-1时有效且必填，value示例： "* | select count(*) as count"。
Fields：字段。value支持 __SOURCE__；__FILENAME__；__HOSTNAME__；__TIMESTAMP__；__INDEX_STATUS__；__PKG_LOGID__；__TOPIC__。
Format：显示形式。value支持 1：每条日志一行；2：每条日志每个字段一行。
Limit：最大日志条数。 value示例： 5。
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 值。
键对应值如下：
SyntaxRule：语法规则，value支持 0：Lucene语法；1： CQL语法。
QueryIndex：执行语句序号。value支持  -1：自定义； 1：执行语句1； 2：执行语句2。
CustomQuery：检索语句。 QueryIndex为-1时有效且必填，value示例： "* | select count(*) as count"。
Fields：字段。value支持 __SOURCE__；__FILENAME__；__HOSTNAME__；__TIMESTAMP__；__INDEX_STATUS__；__PKG_LOGID__；__TOPIC__。
Format：显示形式。value支持 1：每条日志一行；2：每条日志每个字段一行。
Limit：最大日志条数。 value示例： 5。
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get 键。支持以下key：
SyntaxRule：语法规则，value支持 0：Lucene语法；1： CQL语法。
QueryIndex：执行语句序号。value支持  -1：自定义； 1：执行语句1； 2：执行语句2。
CustomQuery：检索语句。 QueryIndex为-1时有效且必填，value示例： "* | select count(*) as count"。
Fields：字段。value支持 __SOURCE__；__FILENAME__；__HOSTNAME__；__TIMESTAMP__；__INDEX_STATUS__；__PKG_LOGID__；__TOPIC__。
Format：显示形式。value支持 1：每条日志一行；2：每条日志每个字段一行。
Limit：最大日志条数。 value示例： 5。 
     * @return Key 键。支持以下key：
SyntaxRule：语法规则，value支持 0：Lucene语法；1： CQL语法。
QueryIndex：执行语句序号。value支持  -1：自定义； 1：执行语句1； 2：执行语句2。
CustomQuery：检索语句。 QueryIndex为-1时有效且必填，value示例： "* | select count(*) as count"。
Fields：字段。value支持 __SOURCE__；__FILENAME__；__HOSTNAME__；__TIMESTAMP__；__INDEX_STATUS__；__PKG_LOGID__；__TOPIC__。
Format：显示形式。value支持 1：每条日志一行；2：每条日志每个字段一行。
Limit：最大日志条数。 value示例： 5。
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 键。支持以下key：
SyntaxRule：语法规则，value支持 0：Lucene语法；1： CQL语法。
QueryIndex：执行语句序号。value支持  -1：自定义； 1：执行语句1； 2：执行语句2。
CustomQuery：检索语句。 QueryIndex为-1时有效且必填，value示例： "* | select count(*) as count"。
Fields：字段。value支持 __SOURCE__；__FILENAME__；__HOSTNAME__；__TIMESTAMP__；__INDEX_STATUS__；__PKG_LOGID__；__TOPIC__。
Format：显示形式。value支持 1：每条日志一行；2：每条日志每个字段一行。
Limit：最大日志条数。 value示例： 5。
     * @param Key 键。支持以下key：
SyntaxRule：语法规则，value支持 0：Lucene语法；1： CQL语法。
QueryIndex：执行语句序号。value支持  -1：自定义； 1：执行语句1； 2：执行语句2。
CustomQuery：检索语句。 QueryIndex为-1时有效且必填，value示例： "* | select count(*) as count"。
Fields：字段。value支持 __SOURCE__；__FILENAME__；__HOSTNAME__；__TIMESTAMP__；__INDEX_STATUS__；__PKG_LOGID__；__TOPIC__。
Format：显示形式。value支持 1：每条日志一行；2：每条日志每个字段一行。
Limit：最大日志条数。 value示例： 5。
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 值。
键对应值如下：
SyntaxRule：语法规则，value支持 0：Lucene语法；1： CQL语法。
QueryIndex：执行语句序号。value支持  -1：自定义； 1：执行语句1； 2：执行语句2。
CustomQuery：检索语句。 QueryIndex为-1时有效且必填，value示例： "* | select count(*) as count"。
Fields：字段。value支持 __SOURCE__；__FILENAME__；__HOSTNAME__；__TIMESTAMP__；__INDEX_STATUS__；__PKG_LOGID__；__TOPIC__。
Format：显示形式。value支持 1：每条日志一行；2：每条日志每个字段一行。
Limit：最大日志条数。 value示例： 5。 
     * @return Value 值。
键对应值如下：
SyntaxRule：语法规则，value支持 0：Lucene语法；1： CQL语法。
QueryIndex：执行语句序号。value支持  -1：自定义； 1：执行语句1； 2：执行语句2。
CustomQuery：检索语句。 QueryIndex为-1时有效且必填，value示例： "* | select count(*) as count"。
Fields：字段。value支持 __SOURCE__；__FILENAME__；__HOSTNAME__；__TIMESTAMP__；__INDEX_STATUS__；__PKG_LOGID__；__TOPIC__。
Format：显示形式。value支持 1：每条日志一行；2：每条日志每个字段一行。
Limit：最大日志条数。 value示例： 5。
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 值。
键对应值如下：
SyntaxRule：语法规则，value支持 0：Lucene语法；1： CQL语法。
QueryIndex：执行语句序号。value支持  -1：自定义； 1：执行语句1； 2：执行语句2。
CustomQuery：检索语句。 QueryIndex为-1时有效且必填，value示例： "* | select count(*) as count"。
Fields：字段。value支持 __SOURCE__；__FILENAME__；__HOSTNAME__；__TIMESTAMP__；__INDEX_STATUS__；__PKG_LOGID__；__TOPIC__。
Format：显示形式。value支持 1：每条日志一行；2：每条日志每个字段一行。
Limit：最大日志条数。 value示例： 5。
     * @param Value 值。
键对应值如下：
SyntaxRule：语法规则，value支持 0：Lucene语法；1： CQL语法。
QueryIndex：执行语句序号。value支持  -1：自定义； 1：执行语句1； 2：执行语句2。
CustomQuery：检索语句。 QueryIndex为-1时有效且必填，value示例： "* | select count(*) as count"。
Fields：字段。value支持 __SOURCE__；__FILENAME__；__HOSTNAME__；__TIMESTAMP__；__INDEX_STATUS__；__PKG_LOGID__；__TOPIC__。
Format：显示形式。value支持 1：每条日志一行；2：每条日志每个字段一行。
Limit：最大日志条数。 value示例： 5。
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public AlarmAnalysisConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlarmAnalysisConfig(AlarmAnalysisConfig source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

