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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClsParam extends AbstractModel{

    /**
    * 生产的信息是否为json格式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DecodeJson")
    @Expose
    private Boolean DecodeJson;

    /**
    * cls日志主题id
    */
    @SerializedName("Resource")
    @Expose
    private String Resource;

    /**
    * cls日志集id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogSet")
    @Expose
    private String LogSet;

    /**
    * 当DecodeJson为false时必填
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContentKey")
    @Expose
    private String ContentKey;

    /**
    * 指定消息中的某字段内容作为cls日志的时间。
字段内容格式需要是秒级时间戳
    */
    @SerializedName("TimeField")
    @Expose
    private String TimeField;

    /**
     * Get 生产的信息是否为json格式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DecodeJson 生产的信息是否为json格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getDecodeJson() {
        return this.DecodeJson;
    }

    /**
     * Set 生产的信息是否为json格式
注意：此字段可能返回 null，表示取不到有效值。
     * @param DecodeJson 生产的信息是否为json格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDecodeJson(Boolean DecodeJson) {
        this.DecodeJson = DecodeJson;
    }

    /**
     * Get cls日志主题id 
     * @return Resource cls日志主题id
     */
    public String getResource() {
        return this.Resource;
    }

    /**
     * Set cls日志主题id
     * @param Resource cls日志主题id
     */
    public void setResource(String Resource) {
        this.Resource = Resource;
    }

    /**
     * Get cls日志集id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogSet cls日志集id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLogSet() {
        return this.LogSet;
    }

    /**
     * Set cls日志集id
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogSet cls日志集id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogSet(String LogSet) {
        this.LogSet = LogSet;
    }

    /**
     * Get 当DecodeJson为false时必填
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContentKey 当DecodeJson为false时必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContentKey() {
        return this.ContentKey;
    }

    /**
     * Set 当DecodeJson为false时必填
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContentKey 当DecodeJson为false时必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContentKey(String ContentKey) {
        this.ContentKey = ContentKey;
    }

    /**
     * Get 指定消息中的某字段内容作为cls日志的时间。
字段内容格式需要是秒级时间戳 
     * @return TimeField 指定消息中的某字段内容作为cls日志的时间。
字段内容格式需要是秒级时间戳
     */
    public String getTimeField() {
        return this.TimeField;
    }

    /**
     * Set 指定消息中的某字段内容作为cls日志的时间。
字段内容格式需要是秒级时间戳
     * @param TimeField 指定消息中的某字段内容作为cls日志的时间。
字段内容格式需要是秒级时间戳
     */
    public void setTimeField(String TimeField) {
        this.TimeField = TimeField;
    }

    public ClsParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClsParam(ClsParam source) {
        if (source.DecodeJson != null) {
            this.DecodeJson = new Boolean(source.DecodeJson);
        }
        if (source.Resource != null) {
            this.Resource = new String(source.Resource);
        }
        if (source.LogSet != null) {
            this.LogSet = new String(source.LogSet);
        }
        if (source.ContentKey != null) {
            this.ContentKey = new String(source.ContentKey);
        }
        if (source.TimeField != null) {
            this.TimeField = new String(source.TimeField);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DecodeJson", this.DecodeJson);
        this.setParamSimple(map, prefix + "Resource", this.Resource);
        this.setParamSimple(map, prefix + "LogSet", this.LogSet);
        this.setParamSimple(map, prefix + "ContentKey", this.ContentKey);
        this.setParamSimple(map, prefix + "TimeField", this.TimeField);

    }
}

