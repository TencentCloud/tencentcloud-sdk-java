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

public class ConsumerContent extends AbstractModel {

    /**
    * <p>是否投递 TAG 信息。<br>当EnableTag为true时，表示投递TAG元信息。</p>
    */
    @SerializedName("EnableTag")
    @Expose
    private Boolean EnableTag;

    /**
    * <p>需要投递的元数据列表，目前仅支持：__SOURCE__，__FILENAME__，__TIMESTAMP__，__HOSTNAME__和__PKGID__</p>
    */
    @SerializedName("MetaFields")
    @Expose
    private String [] MetaFields;

    /**
    * <p>当EnableTag为true时，必须填写TagJsonNotTiled字段。<br>TagJsonNotTiled用于标识tag信息是否json平铺。</p><p>TagJsonNotTiled为true时不平铺，示例：<br>TAG信息：<code>{&quot;__TAG__&quot;:{&quot;fieldA&quot;:200,&quot;fieldB&quot;:&quot;text&quot;}}</code><br>不平铺：<code>{&quot;__TAG__&quot;:{&quot;fieldA&quot;:200,&quot;fieldB&quot;:&quot;text&quot;}}</code></p><p>TagJsonNotTiled为false时平铺，示例：<br>TAG信息：<code>{&quot;__TAG__&quot;:{&quot;fieldA&quot;:200,&quot;fieldB&quot;:&quot;text&quot;}}</code><br>平铺：<code>{&quot;__TAG__.fieldA&quot;:200,&quot;__TAG__.fieldB&quot;:&quot;text&quot;}</code></p>
    */
    @SerializedName("TagJsonNotTiled")
    @Expose
    private Boolean TagJsonNotTiled;

    /**
    * <p>投递时间戳精度，可选项 [1：秒；2：毫秒] ，默认是1。</p>
    */
    @SerializedName("TimestampAccuracy")
    @Expose
    private Long TimestampAccuracy;

    /**
    * <p>投递Json格式。</p><p>枚举值：</p><ul><li>0： 转义。示例：<br>日志原文：<code>{&quot;a&quot;:&quot;aa&quot;, &quot;b&quot;:{&quot;b1&quot;:&quot;b1b1&quot;, &quot;c1&quot;:&quot;c1c1&quot;}}</code><br>投递到Ckafka：<code>{&quot;a&quot;:&quot;aa&quot;,&quot;b&quot;:&quot;{\&quot;b1\&quot;:\&quot;b1b1\&quot;, \&quot;c1\&quot;:\&quot;c1c1\&quot;}&quot;}</code></li><li>1： 和原始日志一致，不转义。示例：<br>日志原文：<code>{&quot;a&quot;:&quot;aa&quot;, &quot;b&quot;:{&quot;b1&quot;:&quot;b1b1&quot;, &quot;c1&quot;:&quot;c1c1&quot;}}</code><br>投递到Ckafka：<code>{&quot;a&quot;:&quot;aa&quot;, &quot;b&quot;:{&quot;b1&quot;:&quot;b1b1&quot;, &quot;c1&quot;:&quot;c1c1&quot;}}</code></li></ul>
    */
    @SerializedName("JsonType")
    @Expose
    private Long JsonType;

    /**
     * Get <p>是否投递 TAG 信息。<br>当EnableTag为true时，表示投递TAG元信息。</p> 
     * @return EnableTag <p>是否投递 TAG 信息。<br>当EnableTag为true时，表示投递TAG元信息。</p>
     */
    public Boolean getEnableTag() {
        return this.EnableTag;
    }

    /**
     * Set <p>是否投递 TAG 信息。<br>当EnableTag为true时，表示投递TAG元信息。</p>
     * @param EnableTag <p>是否投递 TAG 信息。<br>当EnableTag为true时，表示投递TAG元信息。</p>
     */
    public void setEnableTag(Boolean EnableTag) {
        this.EnableTag = EnableTag;
    }

    /**
     * Get <p>需要投递的元数据列表，目前仅支持：__SOURCE__，__FILENAME__，__TIMESTAMP__，__HOSTNAME__和__PKGID__</p> 
     * @return MetaFields <p>需要投递的元数据列表，目前仅支持：__SOURCE__，__FILENAME__，__TIMESTAMP__，__HOSTNAME__和__PKGID__</p>
     */
    public String [] getMetaFields() {
        return this.MetaFields;
    }

    /**
     * Set <p>需要投递的元数据列表，目前仅支持：__SOURCE__，__FILENAME__，__TIMESTAMP__，__HOSTNAME__和__PKGID__</p>
     * @param MetaFields <p>需要投递的元数据列表，目前仅支持：__SOURCE__，__FILENAME__，__TIMESTAMP__，__HOSTNAME__和__PKGID__</p>
     */
    public void setMetaFields(String [] MetaFields) {
        this.MetaFields = MetaFields;
    }

    /**
     * Get <p>当EnableTag为true时，必须填写TagJsonNotTiled字段。<br>TagJsonNotTiled用于标识tag信息是否json平铺。</p><p>TagJsonNotTiled为true时不平铺，示例：<br>TAG信息：<code>{&quot;__TAG__&quot;:{&quot;fieldA&quot;:200,&quot;fieldB&quot;:&quot;text&quot;}}</code><br>不平铺：<code>{&quot;__TAG__&quot;:{&quot;fieldA&quot;:200,&quot;fieldB&quot;:&quot;text&quot;}}</code></p><p>TagJsonNotTiled为false时平铺，示例：<br>TAG信息：<code>{&quot;__TAG__&quot;:{&quot;fieldA&quot;:200,&quot;fieldB&quot;:&quot;text&quot;}}</code><br>平铺：<code>{&quot;__TAG__.fieldA&quot;:200,&quot;__TAG__.fieldB&quot;:&quot;text&quot;}</code></p> 
     * @return TagJsonNotTiled <p>当EnableTag为true时，必须填写TagJsonNotTiled字段。<br>TagJsonNotTiled用于标识tag信息是否json平铺。</p><p>TagJsonNotTiled为true时不平铺，示例：<br>TAG信息：<code>{&quot;__TAG__&quot;:{&quot;fieldA&quot;:200,&quot;fieldB&quot;:&quot;text&quot;}}</code><br>不平铺：<code>{&quot;__TAG__&quot;:{&quot;fieldA&quot;:200,&quot;fieldB&quot;:&quot;text&quot;}}</code></p><p>TagJsonNotTiled为false时平铺，示例：<br>TAG信息：<code>{&quot;__TAG__&quot;:{&quot;fieldA&quot;:200,&quot;fieldB&quot;:&quot;text&quot;}}</code><br>平铺：<code>{&quot;__TAG__.fieldA&quot;:200,&quot;__TAG__.fieldB&quot;:&quot;text&quot;}</code></p>
     */
    public Boolean getTagJsonNotTiled() {
        return this.TagJsonNotTiled;
    }

    /**
     * Set <p>当EnableTag为true时，必须填写TagJsonNotTiled字段。<br>TagJsonNotTiled用于标识tag信息是否json平铺。</p><p>TagJsonNotTiled为true时不平铺，示例：<br>TAG信息：<code>{&quot;__TAG__&quot;:{&quot;fieldA&quot;:200,&quot;fieldB&quot;:&quot;text&quot;}}</code><br>不平铺：<code>{&quot;__TAG__&quot;:{&quot;fieldA&quot;:200,&quot;fieldB&quot;:&quot;text&quot;}}</code></p><p>TagJsonNotTiled为false时平铺，示例：<br>TAG信息：<code>{&quot;__TAG__&quot;:{&quot;fieldA&quot;:200,&quot;fieldB&quot;:&quot;text&quot;}}</code><br>平铺：<code>{&quot;__TAG__.fieldA&quot;:200,&quot;__TAG__.fieldB&quot;:&quot;text&quot;}</code></p>
     * @param TagJsonNotTiled <p>当EnableTag为true时，必须填写TagJsonNotTiled字段。<br>TagJsonNotTiled用于标识tag信息是否json平铺。</p><p>TagJsonNotTiled为true时不平铺，示例：<br>TAG信息：<code>{&quot;__TAG__&quot;:{&quot;fieldA&quot;:200,&quot;fieldB&quot;:&quot;text&quot;}}</code><br>不平铺：<code>{&quot;__TAG__&quot;:{&quot;fieldA&quot;:200,&quot;fieldB&quot;:&quot;text&quot;}}</code></p><p>TagJsonNotTiled为false时平铺，示例：<br>TAG信息：<code>{&quot;__TAG__&quot;:{&quot;fieldA&quot;:200,&quot;fieldB&quot;:&quot;text&quot;}}</code><br>平铺：<code>{&quot;__TAG__.fieldA&quot;:200,&quot;__TAG__.fieldB&quot;:&quot;text&quot;}</code></p>
     */
    public void setTagJsonNotTiled(Boolean TagJsonNotTiled) {
        this.TagJsonNotTiled = TagJsonNotTiled;
    }

    /**
     * Get <p>投递时间戳精度，可选项 [1：秒；2：毫秒] ，默认是1。</p> 
     * @return TimestampAccuracy <p>投递时间戳精度，可选项 [1：秒；2：毫秒] ，默认是1。</p>
     */
    public Long getTimestampAccuracy() {
        return this.TimestampAccuracy;
    }

    /**
     * Set <p>投递时间戳精度，可选项 [1：秒；2：毫秒] ，默认是1。</p>
     * @param TimestampAccuracy <p>投递时间戳精度，可选项 [1：秒；2：毫秒] ，默认是1。</p>
     */
    public void setTimestampAccuracy(Long TimestampAccuracy) {
        this.TimestampAccuracy = TimestampAccuracy;
    }

    /**
     * Get <p>投递Json格式。</p><p>枚举值：</p><ul><li>0： 转义。示例：<br>日志原文：<code>{&quot;a&quot;:&quot;aa&quot;, &quot;b&quot;:{&quot;b1&quot;:&quot;b1b1&quot;, &quot;c1&quot;:&quot;c1c1&quot;}}</code><br>投递到Ckafka：<code>{&quot;a&quot;:&quot;aa&quot;,&quot;b&quot;:&quot;{\&quot;b1\&quot;:\&quot;b1b1\&quot;, \&quot;c1\&quot;:\&quot;c1c1\&quot;}&quot;}</code></li><li>1： 和原始日志一致，不转义。示例：<br>日志原文：<code>{&quot;a&quot;:&quot;aa&quot;, &quot;b&quot;:{&quot;b1&quot;:&quot;b1b1&quot;, &quot;c1&quot;:&quot;c1c1&quot;}}</code><br>投递到Ckafka：<code>{&quot;a&quot;:&quot;aa&quot;, &quot;b&quot;:{&quot;b1&quot;:&quot;b1b1&quot;, &quot;c1&quot;:&quot;c1c1&quot;}}</code></li></ul> 
     * @return JsonType <p>投递Json格式。</p><p>枚举值：</p><ul><li>0： 转义。示例：<br>日志原文：<code>{&quot;a&quot;:&quot;aa&quot;, &quot;b&quot;:{&quot;b1&quot;:&quot;b1b1&quot;, &quot;c1&quot;:&quot;c1c1&quot;}}</code><br>投递到Ckafka：<code>{&quot;a&quot;:&quot;aa&quot;,&quot;b&quot;:&quot;{\&quot;b1\&quot;:\&quot;b1b1\&quot;, \&quot;c1\&quot;:\&quot;c1c1\&quot;}&quot;}</code></li><li>1： 和原始日志一致，不转义。示例：<br>日志原文：<code>{&quot;a&quot;:&quot;aa&quot;, &quot;b&quot;:{&quot;b1&quot;:&quot;b1b1&quot;, &quot;c1&quot;:&quot;c1c1&quot;}}</code><br>投递到Ckafka：<code>{&quot;a&quot;:&quot;aa&quot;, &quot;b&quot;:{&quot;b1&quot;:&quot;b1b1&quot;, &quot;c1&quot;:&quot;c1c1&quot;}}</code></li></ul>
     */
    public Long getJsonType() {
        return this.JsonType;
    }

    /**
     * Set <p>投递Json格式。</p><p>枚举值：</p><ul><li>0： 转义。示例：<br>日志原文：<code>{&quot;a&quot;:&quot;aa&quot;, &quot;b&quot;:{&quot;b1&quot;:&quot;b1b1&quot;, &quot;c1&quot;:&quot;c1c1&quot;}}</code><br>投递到Ckafka：<code>{&quot;a&quot;:&quot;aa&quot;,&quot;b&quot;:&quot;{\&quot;b1\&quot;:\&quot;b1b1\&quot;, \&quot;c1\&quot;:\&quot;c1c1\&quot;}&quot;}</code></li><li>1： 和原始日志一致，不转义。示例：<br>日志原文：<code>{&quot;a&quot;:&quot;aa&quot;, &quot;b&quot;:{&quot;b1&quot;:&quot;b1b1&quot;, &quot;c1&quot;:&quot;c1c1&quot;}}</code><br>投递到Ckafka：<code>{&quot;a&quot;:&quot;aa&quot;, &quot;b&quot;:{&quot;b1&quot;:&quot;b1b1&quot;, &quot;c1&quot;:&quot;c1c1&quot;}}</code></li></ul>
     * @param JsonType <p>投递Json格式。</p><p>枚举值：</p><ul><li>0： 转义。示例：<br>日志原文：<code>{&quot;a&quot;:&quot;aa&quot;, &quot;b&quot;:{&quot;b1&quot;:&quot;b1b1&quot;, &quot;c1&quot;:&quot;c1c1&quot;}}</code><br>投递到Ckafka：<code>{&quot;a&quot;:&quot;aa&quot;,&quot;b&quot;:&quot;{\&quot;b1\&quot;:\&quot;b1b1\&quot;, \&quot;c1\&quot;:\&quot;c1c1\&quot;}&quot;}</code></li><li>1： 和原始日志一致，不转义。示例：<br>日志原文：<code>{&quot;a&quot;:&quot;aa&quot;, &quot;b&quot;:{&quot;b1&quot;:&quot;b1b1&quot;, &quot;c1&quot;:&quot;c1c1&quot;}}</code><br>投递到Ckafka：<code>{&quot;a&quot;:&quot;aa&quot;, &quot;b&quot;:{&quot;b1&quot;:&quot;b1b1&quot;, &quot;c1&quot;:&quot;c1c1&quot;}}</code></li></ul>
     */
    public void setJsonType(Long JsonType) {
        this.JsonType = JsonType;
    }

    public ConsumerContent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConsumerContent(ConsumerContent source) {
        if (source.EnableTag != null) {
            this.EnableTag = new Boolean(source.EnableTag);
        }
        if (source.MetaFields != null) {
            this.MetaFields = new String[source.MetaFields.length];
            for (int i = 0; i < source.MetaFields.length; i++) {
                this.MetaFields[i] = new String(source.MetaFields[i]);
            }
        }
        if (source.TagJsonNotTiled != null) {
            this.TagJsonNotTiled = new Boolean(source.TagJsonNotTiled);
        }
        if (source.TimestampAccuracy != null) {
            this.TimestampAccuracy = new Long(source.TimestampAccuracy);
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
        this.setParamSimple(map, prefix + "TagJsonNotTiled", this.TagJsonNotTiled);
        this.setParamSimple(map, prefix + "TimestampAccuracy", this.TimestampAccuracy);
        this.setParamSimple(map, prefix + "JsonType", this.JsonType);

    }
}

