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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EventPublisherDTO extends AbstractModel {

    /**
    * 关键字，一般为任务id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * REST_API、KAFKA
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreationTs")
    @Expose
    private String CreationTs;

    /**
    * 配置信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PropertiesList")
    @Expose
    private ParamInfoDs [] PropertiesList;

    /**
    * 描述信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 关键字，一般为任务id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Key 关键字，一般为任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 关键字，一般为任务id
注意：此字段可能返回 null，表示取不到有效值。
     * @param Key 关键字，一般为任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get REST_API、KAFKA
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type REST_API、KAFKA
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set REST_API、KAFKA
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type REST_API、KAFKA
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreationTs 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreationTs() {
        return this.CreationTs;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreationTs 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreationTs(String CreationTs) {
        this.CreationTs = CreationTs;
    }

    /**
     * Get 配置信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PropertiesList 配置信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ParamInfoDs [] getPropertiesList() {
        return this.PropertiesList;
    }

    /**
     * Set 配置信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param PropertiesList 配置信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPropertiesList(ParamInfoDs [] PropertiesList) {
        this.PropertiesList = PropertiesList;
    }

    /**
     * Get 描述信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public EventPublisherDTO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EventPublisherDTO(EventPublisherDTO source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.CreationTs != null) {
            this.CreationTs = new String(source.CreationTs);
        }
        if (source.PropertiesList != null) {
            this.PropertiesList = new ParamInfoDs[source.PropertiesList.length];
            for (int i = 0; i < source.PropertiesList.length; i++) {
                this.PropertiesList[i] = new ParamInfoDs(source.PropertiesList[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "CreationTs", this.CreationTs);
        this.setParamArrayObj(map, prefix + "PropertiesList.", this.PropertiesList);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

