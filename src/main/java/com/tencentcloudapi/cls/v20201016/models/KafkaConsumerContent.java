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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KafkaConsumerContent extends AbstractModel{

    /**
    * 消费格式 0:全文；1:json
    */
    @SerializedName("Format")
    @Expose
    private Long Format;

    /**
    * 是否投递 TAG 信息
Format为0时，此字段不需要赋值
    */
    @SerializedName("EnableTag")
    @Expose
    private Boolean EnableTag;

    /**
    * 元数据信息列表, 可选值为：\_\_SOURCE\_\_、\_\_FILENAME\_\_
、\_\_TIMESTAMP\_\_、\_\_HOSTNAME\_\_、\_\_PKGID\_\_
Format为0时，此字段不需要赋值
    */
    @SerializedName("MetaFields")
    @Expose
    private String [] MetaFields;

    /**
    * tag数据处理方式：
1:不平铺（默认值）
2:平铺
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagTransaction")
    @Expose
    private Long TagTransaction;

    /**
    * 消费数据Json格式：
1：不转义（默认格式）
2：转义
    */
    @SerializedName("JsonType")
    @Expose
    private Long JsonType;

    /**
     * Get 消费格式 0:全文；1:json 
     * @return Format 消费格式 0:全文；1:json
     */
    public Long getFormat() {
        return this.Format;
    }

    /**
     * Set 消费格式 0:全文；1:json
     * @param Format 消费格式 0:全文；1:json
     */
    public void setFormat(Long Format) {
        this.Format = Format;
    }

    /**
     * Get 是否投递 TAG 信息
Format为0时，此字段不需要赋值 
     * @return EnableTag 是否投递 TAG 信息
Format为0时，此字段不需要赋值
     */
    public Boolean getEnableTag() {
        return this.EnableTag;
    }

    /**
     * Set 是否投递 TAG 信息
Format为0时，此字段不需要赋值
     * @param EnableTag 是否投递 TAG 信息
Format为0时，此字段不需要赋值
     */
    public void setEnableTag(Boolean EnableTag) {
        this.EnableTag = EnableTag;
    }

    /**
     * Get 元数据信息列表, 可选值为：\_\_SOURCE\_\_、\_\_FILENAME\_\_
、\_\_TIMESTAMP\_\_、\_\_HOSTNAME\_\_、\_\_PKGID\_\_
Format为0时，此字段不需要赋值 
     * @return MetaFields 元数据信息列表, 可选值为：\_\_SOURCE\_\_、\_\_FILENAME\_\_
、\_\_TIMESTAMP\_\_、\_\_HOSTNAME\_\_、\_\_PKGID\_\_
Format为0时，此字段不需要赋值
     */
    public String [] getMetaFields() {
        return this.MetaFields;
    }

    /**
     * Set 元数据信息列表, 可选值为：\_\_SOURCE\_\_、\_\_FILENAME\_\_
、\_\_TIMESTAMP\_\_、\_\_HOSTNAME\_\_、\_\_PKGID\_\_
Format为0时，此字段不需要赋值
     * @param MetaFields 元数据信息列表, 可选值为：\_\_SOURCE\_\_、\_\_FILENAME\_\_
、\_\_TIMESTAMP\_\_、\_\_HOSTNAME\_\_、\_\_PKGID\_\_
Format为0时，此字段不需要赋值
     */
    public void setMetaFields(String [] MetaFields) {
        this.MetaFields = MetaFields;
    }

    /**
     * Get tag数据处理方式：
1:不平铺（默认值）
2:平铺
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagTransaction tag数据处理方式：
1:不平铺（默认值）
2:平铺
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTagTransaction() {
        return this.TagTransaction;
    }

    /**
     * Set tag数据处理方式：
1:不平铺（默认值）
2:平铺
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagTransaction tag数据处理方式：
1:不平铺（默认值）
2:平铺
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagTransaction(Long TagTransaction) {
        this.TagTransaction = TagTransaction;
    }

    /**
     * Get 消费数据Json格式：
1：不转义（默认格式）
2：转义 
     * @return JsonType 消费数据Json格式：
1：不转义（默认格式）
2：转义
     */
    public Long getJsonType() {
        return this.JsonType;
    }

    /**
     * Set 消费数据Json格式：
1：不转义（默认格式）
2：转义
     * @param JsonType 消费数据Json格式：
1：不转义（默认格式）
2：转义
     */
    public void setJsonType(Long JsonType) {
        this.JsonType = JsonType;
    }

    public KafkaConsumerContent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KafkaConsumerContent(KafkaConsumerContent source) {
        if (source.Format != null) {
            this.Format = new Long(source.Format);
        }
        if (source.EnableTag != null) {
            this.EnableTag = new Boolean(source.EnableTag);
        }
        if (source.MetaFields != null) {
            this.MetaFields = new String[source.MetaFields.length];
            for (int i = 0; i < source.MetaFields.length; i++) {
                this.MetaFields[i] = new String(source.MetaFields[i]);
            }
        }
        if (source.TagTransaction != null) {
            this.TagTransaction = new Long(source.TagTransaction);
        }
        if (source.JsonType != null) {
            this.JsonType = new Long(source.JsonType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamSimple(map, prefix + "EnableTag", this.EnableTag);
        this.setParamArraySimple(map, prefix + "MetaFields.", this.MetaFields);
        this.setParamSimple(map, prefix + "TagTransaction", this.TagTransaction);
        this.setParamSimple(map, prefix + "JsonType", this.JsonType);

    }
}

