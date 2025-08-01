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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class JsonInfo extends AbstractModel {

    /**
    * 启用标志
    */
    @SerializedName("EnableTag")
    @Expose
    private Boolean EnableTag;

    /**
    * 元数据信息列表, 可选值为 __SOURCE__、__FILENAME__、__TIMESTAMP__、__HOSTNAME__。

- __SOURCE__：日志采集的源 IP，示例：10.0.1.2
- __FILENAME__：日志采集的文件名，示例：/data/log/nginx/access.log
- __TIMESTAMP__：日志时间戳（毫秒级别 Unix 时间戳），按时间范围检索日志时，将自动使用该时间对日志进行检索，在控制台显示为“日志时间”，示例：1640005601188
- __HOSTNAME__：日志来源机器名称，需使用2.7.4及以上版本的 Loglistener 才会采集该字段，示例：localhost
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MetaFields")
    @Expose
    private String [] MetaFields;

    /**
    * 投递Json格式，0：字符串方式投递；1:以结构化方式投递
    */
    @SerializedName("JsonType")
    @Expose
    private Long JsonType;

    /**
     * Get 启用标志 
     * @return EnableTag 启用标志
     */
    public Boolean getEnableTag() {
        return this.EnableTag;
    }

    /**
     * Set 启用标志
     * @param EnableTag 启用标志
     */
    public void setEnableTag(Boolean EnableTag) {
        this.EnableTag = EnableTag;
    }

    /**
     * Get 元数据信息列表, 可选值为 __SOURCE__、__FILENAME__、__TIMESTAMP__、__HOSTNAME__。

- __SOURCE__：日志采集的源 IP，示例：10.0.1.2
- __FILENAME__：日志采集的文件名，示例：/data/log/nginx/access.log
- __TIMESTAMP__：日志时间戳（毫秒级别 Unix 时间戳），按时间范围检索日志时，将自动使用该时间对日志进行检索，在控制台显示为“日志时间”，示例：1640005601188
- __HOSTNAME__：日志来源机器名称，需使用2.7.4及以上版本的 Loglistener 才会采集该字段，示例：localhost
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MetaFields 元数据信息列表, 可选值为 __SOURCE__、__FILENAME__、__TIMESTAMP__、__HOSTNAME__。

- __SOURCE__：日志采集的源 IP，示例：10.0.1.2
- __FILENAME__：日志采集的文件名，示例：/data/log/nginx/access.log
- __TIMESTAMP__：日志时间戳（毫秒级别 Unix 时间戳），按时间范围检索日志时，将自动使用该时间对日志进行检索，在控制台显示为“日志时间”，示例：1640005601188
- __HOSTNAME__：日志来源机器名称，需使用2.7.4及以上版本的 Loglistener 才会采集该字段，示例：localhost
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getMetaFields() {
        return this.MetaFields;
    }

    /**
     * Set 元数据信息列表, 可选值为 __SOURCE__、__FILENAME__、__TIMESTAMP__、__HOSTNAME__。

- __SOURCE__：日志采集的源 IP，示例：10.0.1.2
- __FILENAME__：日志采集的文件名，示例：/data/log/nginx/access.log
- __TIMESTAMP__：日志时间戳（毫秒级别 Unix 时间戳），按时间范围检索日志时，将自动使用该时间对日志进行检索，在控制台显示为“日志时间”，示例：1640005601188
- __HOSTNAME__：日志来源机器名称，需使用2.7.4及以上版本的 Loglistener 才会采集该字段，示例：localhost
注意：此字段可能返回 null，表示取不到有效值。
     * @param MetaFields 元数据信息列表, 可选值为 __SOURCE__、__FILENAME__、__TIMESTAMP__、__HOSTNAME__。

- __SOURCE__：日志采集的源 IP，示例：10.0.1.2
- __FILENAME__：日志采集的文件名，示例：/data/log/nginx/access.log
- __TIMESTAMP__：日志时间戳（毫秒级别 Unix 时间戳），按时间范围检索日志时，将自动使用该时间对日志进行检索，在控制台显示为“日志时间”，示例：1640005601188
- __HOSTNAME__：日志来源机器名称，需使用2.7.4及以上版本的 Loglistener 才会采集该字段，示例：localhost
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetaFields(String [] MetaFields) {
        this.MetaFields = MetaFields;
    }

    /**
     * Get 投递Json格式，0：字符串方式投递；1:以结构化方式投递 
     * @return JsonType 投递Json格式，0：字符串方式投递；1:以结构化方式投递
     */
    public Long getJsonType() {
        return this.JsonType;
    }

    /**
     * Set 投递Json格式，0：字符串方式投递；1:以结构化方式投递
     * @param JsonType 投递Json格式，0：字符串方式投递；1:以结构化方式投递
     */
    public void setJsonType(Long JsonType) {
        this.JsonType = JsonType;
    }

    public JsonInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public JsonInfo(JsonInfo source) {
        if (source.EnableTag != null) {
            this.EnableTag = new Boolean(source.EnableTag);
        }
        if (source.MetaFields != null) {
            this.MetaFields = new String[source.MetaFields.length];
            for (int i = 0; i < source.MetaFields.length; i++) {
                this.MetaFields[i] = new String(source.MetaFields[i]);
            }
        }
        if (source.JsonType != null) {
            this.JsonType = new Long(source.JsonType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnableTag", this.EnableTag);
        this.setParamArraySimple(map, prefix + "MetaFields.", this.MetaFields);
        this.setParamSimple(map, prefix + "JsonType", this.JsonType);

    }
}

