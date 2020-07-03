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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StorageBlock extends AbstractModel{

    /**
    * HDD本地存储类型，值为：LOCAL_PRO.
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * HDD本地存储的最小容量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MinSize")
    @Expose
    private Long MinSize;

    /**
    * HDD本地存储的最大容量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxSize")
    @Expose
    private Long MaxSize;

    /**
     * Get HDD本地存储类型，值为：LOCAL_PRO.
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type HDD本地存储类型，值为：LOCAL_PRO.
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set HDD本地存储类型，值为：LOCAL_PRO.
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type HDD本地存储类型，值为：LOCAL_PRO.
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get HDD本地存储的最小容量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MinSize HDD本地存储的最小容量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMinSize() {
        return this.MinSize;
    }

    /**
     * Set HDD本地存储的最小容量
注意：此字段可能返回 null，表示取不到有效值。
     * @param MinSize HDD本地存储的最小容量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMinSize(Long MinSize) {
        this.MinSize = MinSize;
    }

    /**
     * Get HDD本地存储的最大容量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxSize HDD本地存储的最大容量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxSize() {
        return this.MaxSize;
    }

    /**
     * Set HDD本地存储的最大容量
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxSize HDD本地存储的最大容量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxSize(Long MaxSize) {
        this.MaxSize = MaxSize;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "MinSize", this.MinSize);
        this.setParamSimple(map, prefix + "MaxSize", this.MaxSize);

    }
}

