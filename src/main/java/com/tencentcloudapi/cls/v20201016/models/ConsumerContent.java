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

public class ConsumerContent extends AbstractModel{

    /**
    * 是否投递 TAG 信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableTag")
    @Expose
    private Boolean EnableTag;

    /**
    * 需要投递的元数据列表，目前仅支持：\_\_SOURCE\_\_，\_\_FILENAME\_\_和\_\_TIMESTAMP\_\_
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MetaFields")
    @Expose
    private String [] MetaFields;

    /**
    * 当EnableTag为true时，必须填写TagJsonNotTiled字段，TagJsonNotTiled用于标识tag信息是否json平铺，TagJsonNotTiled为true时不平铺，false时平铺
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagJsonNotTiled")
    @Expose
    private Boolean TagJsonNotTiled;

    /**
    * 投递时间戳精度，可选项 [1:秒；2:毫秒] ，默认是秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimestampAccuracy")
    @Expose
    private Long TimestampAccuracy;

    /**
     * Get 是否投递 TAG 信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableTag 是否投递 TAG 信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEnableTag() {
        return this.EnableTag;
    }

    /**
     * Set 是否投递 TAG 信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableTag 是否投递 TAG 信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableTag(Boolean EnableTag) {
        this.EnableTag = EnableTag;
    }

    /**
     * Get 需要投递的元数据列表，目前仅支持：\_\_SOURCE\_\_，\_\_FILENAME\_\_和\_\_TIMESTAMP\_\_
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MetaFields 需要投递的元数据列表，目前仅支持：\_\_SOURCE\_\_，\_\_FILENAME\_\_和\_\_TIMESTAMP\_\_
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getMetaFields() {
        return this.MetaFields;
    }

    /**
     * Set 需要投递的元数据列表，目前仅支持：\_\_SOURCE\_\_，\_\_FILENAME\_\_和\_\_TIMESTAMP\_\_
注意：此字段可能返回 null，表示取不到有效值。
     * @param MetaFields 需要投递的元数据列表，目前仅支持：\_\_SOURCE\_\_，\_\_FILENAME\_\_和\_\_TIMESTAMP\_\_
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetaFields(String [] MetaFields) {
        this.MetaFields = MetaFields;
    }

    /**
     * Get 当EnableTag为true时，必须填写TagJsonNotTiled字段，TagJsonNotTiled用于标识tag信息是否json平铺，TagJsonNotTiled为true时不平铺，false时平铺
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagJsonNotTiled 当EnableTag为true时，必须填写TagJsonNotTiled字段，TagJsonNotTiled用于标识tag信息是否json平铺，TagJsonNotTiled为true时不平铺，false时平铺
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getTagJsonNotTiled() {
        return this.TagJsonNotTiled;
    }

    /**
     * Set 当EnableTag为true时，必须填写TagJsonNotTiled字段，TagJsonNotTiled用于标识tag信息是否json平铺，TagJsonNotTiled为true时不平铺，false时平铺
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagJsonNotTiled 当EnableTag为true时，必须填写TagJsonNotTiled字段，TagJsonNotTiled用于标识tag信息是否json平铺，TagJsonNotTiled为true时不平铺，false时平铺
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagJsonNotTiled(Boolean TagJsonNotTiled) {
        this.TagJsonNotTiled = TagJsonNotTiled;
    }

    /**
     * Get 投递时间戳精度，可选项 [1:秒；2:毫秒] ，默认是秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimestampAccuracy 投递时间戳精度，可选项 [1:秒；2:毫秒] ，默认是秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTimestampAccuracy() {
        return this.TimestampAccuracy;
    }

    /**
     * Set 投递时间戳精度，可选项 [1:秒；2:毫秒] ，默认是秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimestampAccuracy 投递时间戳精度，可选项 [1:秒；2:毫秒] ，默认是秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimestampAccuracy(Long TimestampAccuracy) {
        this.TimestampAccuracy = TimestampAccuracy;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnableTag", this.EnableTag);
        this.setParamArraySimple(map, prefix + "MetaFields.", this.MetaFields);
        this.setParamSimple(map, prefix + "TagJsonNotTiled", this.TagJsonNotTiled);
        this.setParamSimple(map, prefix + "TimestampAccuracy", this.TimestampAccuracy);

    }
}

