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
package com.tencentcloudapi.ssa.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SocCheckItem extends AbstractModel{

    /**
    * 名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 唯一id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LevelId")
    @Expose
    private String LevelId;

    /**
    * 成功数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SuccessCount")
    @Expose
    private Long SuccessCount;

    /**
    * 失败数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailCount")
    @Expose
    private Long FailCount;

    /**
     * Get 名字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 唯一id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LevelId 唯一id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLevelId() {
        return this.LevelId;
    }

    /**
     * Set 唯一id
注意：此字段可能返回 null，表示取不到有效值。
     * @param LevelId 唯一id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLevelId(String LevelId) {
        this.LevelId = LevelId;
    }

    /**
     * Get 成功数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SuccessCount 成功数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSuccessCount() {
        return this.SuccessCount;
    }

    /**
     * Set 成功数
注意：此字段可能返回 null，表示取不到有效值。
     * @param SuccessCount 成功数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSuccessCount(Long SuccessCount) {
        this.SuccessCount = SuccessCount;
    }

    /**
     * Get 失败数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailCount 失败数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFailCount() {
        return this.FailCount;
    }

    /**
     * Set 失败数
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailCount 失败数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailCount(Long FailCount) {
        this.FailCount = FailCount;
    }

    public SocCheckItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SocCheckItem(SocCheckItem source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.LevelId != null) {
            this.LevelId = new String(source.LevelId);
        }
        if (source.SuccessCount != null) {
            this.SuccessCount = new Long(source.SuccessCount);
        }
        if (source.FailCount != null) {
            this.FailCount = new Long(source.FailCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "LevelId", this.LevelId);
        this.setParamSimple(map, prefix + "SuccessCount", this.SuccessCount);
        this.setParamSimple(map, prefix + "FailCount", this.FailCount);

    }
}

