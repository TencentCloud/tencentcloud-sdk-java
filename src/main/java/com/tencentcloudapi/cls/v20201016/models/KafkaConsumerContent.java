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

public class KafkaConsumerContent extends AbstractModel {

    /**
    * <p>消费数据格式。 0：原始内容；1：JSON。</p>
    */
    @SerializedName("Format")
    @Expose
    private Long Format;

    /**
    * <p>是否投递 TAG 信息<br>Format为0时，此字段不需要赋值</p>
    */
    @SerializedName("EnableTag")
    @Expose
    private Boolean EnableTag;

    /**
    * <p>元数据信息列表, 可选值为：__SOURCE__、__FILENAME__<br>、__TIMESTAMP__、__HOSTNAME__、__PKGID__<br>Format为0时，此字段不需要赋值</p>
    */
    @SerializedName("MetaFields")
    @Expose
    private String [] MetaFields;

    /**
    * <p>tag数据处理方式：1:不平铺（默认值）；2:平铺。</p><p>不平铺示例：<br>TAG信息：<code>{&quot;__TAG__&quot;:{&quot;fieldA&quot;:200,&quot;fieldB&quot;:&quot;text&quot;}}</code><br>不平铺：<code>{&quot;__TAG__&quot;:{&quot;fieldA&quot;:200,&quot;fieldB&quot;:&quot;text&quot;}}</code></p><p>平铺示例：<br>TAG信息：<code>{&quot;__TAG__&quot;:{&quot;fieldA&quot;:200,&quot;fieldB&quot;:&quot;text&quot;}}</code><br>平铺：<code>{&quot;__TAG__.fieldA&quot;:200,&quot;__TAG__.fieldB&quot;:&quot;text&quot;}</code></p>
    */
    @SerializedName("TagTransaction")
    @Expose
    private Long TagTransaction;

    /**
    * <p>消费数据Json格式：<br>1：不转义（默认格式）<br>2：转义</p><p>投递Json格式。<br>JsonType为1：和原始日志一致，不转义。示例：<br>日志原文：<code>{&quot;a&quot;:&quot;aa&quot;, &quot;b&quot;:{&quot;b1&quot;:&quot;b1b1&quot;, &quot;c1&quot;:&quot;c1c1&quot;}}</code><br>投递到Ckafka：<code>{&quot;a&quot;:&quot;aa&quot;, &quot;b&quot;:{&quot;b1&quot;:&quot;b1b1&quot;, &quot;c1&quot;:&quot;c1c1&quot;}}</code></p><p>JsonType为2：转义。示例：<br>日志原文：<code>{&quot;a&quot;:&quot;aa&quot;, &quot;b&quot;:{&quot;b1&quot;:&quot;b1b1&quot;, &quot;c1&quot;:&quot;c1c1&quot;}}</code><br>投递到Ckafka：<code>{&quot;a&quot;:&quot;aa&quot;,&quot;b&quot;:&quot;{\&quot;b1\&quot;:\&quot;b1b1\&quot;, \&quot;c1\&quot;:\&quot;c1c1\&quot;}&quot;}</code></p>
    */
    @SerializedName("JsonType")
    @Expose
    private Long JsonType;

    /**
    * <p>数值类型自动转换开关</p><p>枚举值：</p><ul><li>true： JSON 结构中第一层级的 value 中的数字字符串（如 &quot;123&quot; ）会被自动转换为数值类型（int / float）。</li><li>false： JSON 结构中第一层级的 value 中的数字字符串（如 &quot;123&quot; ）为字符串。</li></ul><p>默认值：false</p>
    */
    @SerializedName("AutoConvertNumber")
    @Expose
    private Boolean AutoConvertNumber;

    /**
     * Get <p>消费数据格式。 0：原始内容；1：JSON。</p> 
     * @return Format <p>消费数据格式。 0：原始内容；1：JSON。</p>
     */
    public Long getFormat() {
        return this.Format;
    }

    /**
     * Set <p>消费数据格式。 0：原始内容；1：JSON。</p>
     * @param Format <p>消费数据格式。 0：原始内容；1：JSON。</p>
     */
    public void setFormat(Long Format) {
        this.Format = Format;
    }

    /**
     * Get <p>是否投递 TAG 信息<br>Format为0时，此字段不需要赋值</p> 
     * @return EnableTag <p>是否投递 TAG 信息<br>Format为0时，此字段不需要赋值</p>
     */
    public Boolean getEnableTag() {
        return this.EnableTag;
    }

    /**
     * Set <p>是否投递 TAG 信息<br>Format为0时，此字段不需要赋值</p>
     * @param EnableTag <p>是否投递 TAG 信息<br>Format为0时，此字段不需要赋值</p>
     */
    public void setEnableTag(Boolean EnableTag) {
        this.EnableTag = EnableTag;
    }

    /**
     * Get <p>元数据信息列表, 可选值为：__SOURCE__、__FILENAME__<br>、__TIMESTAMP__、__HOSTNAME__、__PKGID__<br>Format为0时，此字段不需要赋值</p> 
     * @return MetaFields <p>元数据信息列表, 可选值为：__SOURCE__、__FILENAME__<br>、__TIMESTAMP__、__HOSTNAME__、__PKGID__<br>Format为0时，此字段不需要赋值</p>
     */
    public String [] getMetaFields() {
        return this.MetaFields;
    }

    /**
     * Set <p>元数据信息列表, 可选值为：__SOURCE__、__FILENAME__<br>、__TIMESTAMP__、__HOSTNAME__、__PKGID__<br>Format为0时，此字段不需要赋值</p>
     * @param MetaFields <p>元数据信息列表, 可选值为：__SOURCE__、__FILENAME__<br>、__TIMESTAMP__、__HOSTNAME__、__PKGID__<br>Format为0时，此字段不需要赋值</p>
     */
    public void setMetaFields(String [] MetaFields) {
        this.MetaFields = MetaFields;
    }

    /**
     * Get <p>tag数据处理方式：1:不平铺（默认值）；2:平铺。</p><p>不平铺示例：<br>TAG信息：<code>{&quot;__TAG__&quot;:{&quot;fieldA&quot;:200,&quot;fieldB&quot;:&quot;text&quot;}}</code><br>不平铺：<code>{&quot;__TAG__&quot;:{&quot;fieldA&quot;:200,&quot;fieldB&quot;:&quot;text&quot;}}</code></p><p>平铺示例：<br>TAG信息：<code>{&quot;__TAG__&quot;:{&quot;fieldA&quot;:200,&quot;fieldB&quot;:&quot;text&quot;}}</code><br>平铺：<code>{&quot;__TAG__.fieldA&quot;:200,&quot;__TAG__.fieldB&quot;:&quot;text&quot;}</code></p> 
     * @return TagTransaction <p>tag数据处理方式：1:不平铺（默认值）；2:平铺。</p><p>不平铺示例：<br>TAG信息：<code>{&quot;__TAG__&quot;:{&quot;fieldA&quot;:200,&quot;fieldB&quot;:&quot;text&quot;}}</code><br>不平铺：<code>{&quot;__TAG__&quot;:{&quot;fieldA&quot;:200,&quot;fieldB&quot;:&quot;text&quot;}}</code></p><p>平铺示例：<br>TAG信息：<code>{&quot;__TAG__&quot;:{&quot;fieldA&quot;:200,&quot;fieldB&quot;:&quot;text&quot;}}</code><br>平铺：<code>{&quot;__TAG__.fieldA&quot;:200,&quot;__TAG__.fieldB&quot;:&quot;text&quot;}</code></p>
     */
    public Long getTagTransaction() {
        return this.TagTransaction;
    }

    /**
     * Set <p>tag数据处理方式：1:不平铺（默认值）；2:平铺。</p><p>不平铺示例：<br>TAG信息：<code>{&quot;__TAG__&quot;:{&quot;fieldA&quot;:200,&quot;fieldB&quot;:&quot;text&quot;}}</code><br>不平铺：<code>{&quot;__TAG__&quot;:{&quot;fieldA&quot;:200,&quot;fieldB&quot;:&quot;text&quot;}}</code></p><p>平铺示例：<br>TAG信息：<code>{&quot;__TAG__&quot;:{&quot;fieldA&quot;:200,&quot;fieldB&quot;:&quot;text&quot;}}</code><br>平铺：<code>{&quot;__TAG__.fieldA&quot;:200,&quot;__TAG__.fieldB&quot;:&quot;text&quot;}</code></p>
     * @param TagTransaction <p>tag数据处理方式：1:不平铺（默认值）；2:平铺。</p><p>不平铺示例：<br>TAG信息：<code>{&quot;__TAG__&quot;:{&quot;fieldA&quot;:200,&quot;fieldB&quot;:&quot;text&quot;}}</code><br>不平铺：<code>{&quot;__TAG__&quot;:{&quot;fieldA&quot;:200,&quot;fieldB&quot;:&quot;text&quot;}}</code></p><p>平铺示例：<br>TAG信息：<code>{&quot;__TAG__&quot;:{&quot;fieldA&quot;:200,&quot;fieldB&quot;:&quot;text&quot;}}</code><br>平铺：<code>{&quot;__TAG__.fieldA&quot;:200,&quot;__TAG__.fieldB&quot;:&quot;text&quot;}</code></p>
     */
    public void setTagTransaction(Long TagTransaction) {
        this.TagTransaction = TagTransaction;
    }

    /**
     * Get <p>消费数据Json格式：<br>1：不转义（默认格式）<br>2：转义</p><p>投递Json格式。<br>JsonType为1：和原始日志一致，不转义。示例：<br>日志原文：<code>{&quot;a&quot;:&quot;aa&quot;, &quot;b&quot;:{&quot;b1&quot;:&quot;b1b1&quot;, &quot;c1&quot;:&quot;c1c1&quot;}}</code><br>投递到Ckafka：<code>{&quot;a&quot;:&quot;aa&quot;, &quot;b&quot;:{&quot;b1&quot;:&quot;b1b1&quot;, &quot;c1&quot;:&quot;c1c1&quot;}}</code></p><p>JsonType为2：转义。示例：<br>日志原文：<code>{&quot;a&quot;:&quot;aa&quot;, &quot;b&quot;:{&quot;b1&quot;:&quot;b1b1&quot;, &quot;c1&quot;:&quot;c1c1&quot;}}</code><br>投递到Ckafka：<code>{&quot;a&quot;:&quot;aa&quot;,&quot;b&quot;:&quot;{\&quot;b1\&quot;:\&quot;b1b1\&quot;, \&quot;c1\&quot;:\&quot;c1c1\&quot;}&quot;}</code></p> 
     * @return JsonType <p>消费数据Json格式：<br>1：不转义（默认格式）<br>2：转义</p><p>投递Json格式。<br>JsonType为1：和原始日志一致，不转义。示例：<br>日志原文：<code>{&quot;a&quot;:&quot;aa&quot;, &quot;b&quot;:{&quot;b1&quot;:&quot;b1b1&quot;, &quot;c1&quot;:&quot;c1c1&quot;}}</code><br>投递到Ckafka：<code>{&quot;a&quot;:&quot;aa&quot;, &quot;b&quot;:{&quot;b1&quot;:&quot;b1b1&quot;, &quot;c1&quot;:&quot;c1c1&quot;}}</code></p><p>JsonType为2：转义。示例：<br>日志原文：<code>{&quot;a&quot;:&quot;aa&quot;, &quot;b&quot;:{&quot;b1&quot;:&quot;b1b1&quot;, &quot;c1&quot;:&quot;c1c1&quot;}}</code><br>投递到Ckafka：<code>{&quot;a&quot;:&quot;aa&quot;,&quot;b&quot;:&quot;{\&quot;b1\&quot;:\&quot;b1b1\&quot;, \&quot;c1\&quot;:\&quot;c1c1\&quot;}&quot;}</code></p>
     */
    public Long getJsonType() {
        return this.JsonType;
    }

    /**
     * Set <p>消费数据Json格式：<br>1：不转义（默认格式）<br>2：转义</p><p>投递Json格式。<br>JsonType为1：和原始日志一致，不转义。示例：<br>日志原文：<code>{&quot;a&quot;:&quot;aa&quot;, &quot;b&quot;:{&quot;b1&quot;:&quot;b1b1&quot;, &quot;c1&quot;:&quot;c1c1&quot;}}</code><br>投递到Ckafka：<code>{&quot;a&quot;:&quot;aa&quot;, &quot;b&quot;:{&quot;b1&quot;:&quot;b1b1&quot;, &quot;c1&quot;:&quot;c1c1&quot;}}</code></p><p>JsonType为2：转义。示例：<br>日志原文：<code>{&quot;a&quot;:&quot;aa&quot;, &quot;b&quot;:{&quot;b1&quot;:&quot;b1b1&quot;, &quot;c1&quot;:&quot;c1c1&quot;}}</code><br>投递到Ckafka：<code>{&quot;a&quot;:&quot;aa&quot;,&quot;b&quot;:&quot;{\&quot;b1\&quot;:\&quot;b1b1\&quot;, \&quot;c1\&quot;:\&quot;c1c1\&quot;}&quot;}</code></p>
     * @param JsonType <p>消费数据Json格式：<br>1：不转义（默认格式）<br>2：转义</p><p>投递Json格式。<br>JsonType为1：和原始日志一致，不转义。示例：<br>日志原文：<code>{&quot;a&quot;:&quot;aa&quot;, &quot;b&quot;:{&quot;b1&quot;:&quot;b1b1&quot;, &quot;c1&quot;:&quot;c1c1&quot;}}</code><br>投递到Ckafka：<code>{&quot;a&quot;:&quot;aa&quot;, &quot;b&quot;:{&quot;b1&quot;:&quot;b1b1&quot;, &quot;c1&quot;:&quot;c1c1&quot;}}</code></p><p>JsonType为2：转义。示例：<br>日志原文：<code>{&quot;a&quot;:&quot;aa&quot;, &quot;b&quot;:{&quot;b1&quot;:&quot;b1b1&quot;, &quot;c1&quot;:&quot;c1c1&quot;}}</code><br>投递到Ckafka：<code>{&quot;a&quot;:&quot;aa&quot;,&quot;b&quot;:&quot;{\&quot;b1\&quot;:\&quot;b1b1\&quot;, \&quot;c1\&quot;:\&quot;c1c1\&quot;}&quot;}</code></p>
     */
    public void setJsonType(Long JsonType) {
        this.JsonType = JsonType;
    }

    /**
     * Get <p>数值类型自动转换开关</p><p>枚举值：</p><ul><li>true： JSON 结构中第一层级的 value 中的数字字符串（如 &quot;123&quot; ）会被自动转换为数值类型（int / float）。</li><li>false： JSON 结构中第一层级的 value 中的数字字符串（如 &quot;123&quot; ）为字符串。</li></ul><p>默认值：false</p> 
     * @return AutoConvertNumber <p>数值类型自动转换开关</p><p>枚举值：</p><ul><li>true： JSON 结构中第一层级的 value 中的数字字符串（如 &quot;123&quot; ）会被自动转换为数值类型（int / float）。</li><li>false： JSON 结构中第一层级的 value 中的数字字符串（如 &quot;123&quot; ）为字符串。</li></ul><p>默认值：false</p>
     */
    public Boolean getAutoConvertNumber() {
        return this.AutoConvertNumber;
    }

    /**
     * Set <p>数值类型自动转换开关</p><p>枚举值：</p><ul><li>true： JSON 结构中第一层级的 value 中的数字字符串（如 &quot;123&quot; ）会被自动转换为数值类型（int / float）。</li><li>false： JSON 结构中第一层级的 value 中的数字字符串（如 &quot;123&quot; ）为字符串。</li></ul><p>默认值：false</p>
     * @param AutoConvertNumber <p>数值类型自动转换开关</p><p>枚举值：</p><ul><li>true： JSON 结构中第一层级的 value 中的数字字符串（如 &quot;123&quot; ）会被自动转换为数值类型（int / float）。</li><li>false： JSON 结构中第一层级的 value 中的数字字符串（如 &quot;123&quot; ）为字符串。</li></ul><p>默认值：false</p>
     */
    public void setAutoConvertNumber(Boolean AutoConvertNumber) {
        this.AutoConvertNumber = AutoConvertNumber;
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
        if (source.AutoConvertNumber != null) {
            this.AutoConvertNumber = new Boolean(source.AutoConvertNumber);
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
        this.setParamSimple(map, prefix + "AutoConvertNumber", this.AutoConvertNumber);

    }
}

