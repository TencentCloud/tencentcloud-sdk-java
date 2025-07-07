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
package com.tencentcloudapi.asr.v20190614.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KeyWordLib extends AbstractModel {

    /**
    * 关键词表ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KeyWordLibId")
    @Expose
    private String KeyWordLibId;

    /**
    * 关键词表名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 关键词列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KeyWordList")
    @Expose
    private String [] KeyWordList;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 关键词表ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KeyWordLibId 关键词表ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKeyWordLibId() {
        return this.KeyWordLibId;
    }

    /**
     * Set 关键词表ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param KeyWordLibId 关键词表ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKeyWordLibId(String KeyWordLibId) {
        this.KeyWordLibId = KeyWordLibId;
    }

    /**
     * Get 关键词表名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 关键词表名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 关键词表名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 关键词表名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 关键词列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KeyWordList 关键词列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getKeyWordList() {
        return this.KeyWordList;
    }

    /**
     * Set 关键词列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param KeyWordList 关键词列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKeyWordList(String [] KeyWordList) {
        this.KeyWordList = KeyWordList;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public KeyWordLib() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KeyWordLib(KeyWordLib source) {
        if (source.KeyWordLibId != null) {
            this.KeyWordLibId = new String(source.KeyWordLibId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.KeyWordList != null) {
            this.KeyWordList = new String[source.KeyWordList.length];
            for (int i = 0; i < source.KeyWordList.length; i++) {
                this.KeyWordList[i] = new String(source.KeyWordList[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyWordLibId", this.KeyWordLibId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "KeyWordList.", this.KeyWordList);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

