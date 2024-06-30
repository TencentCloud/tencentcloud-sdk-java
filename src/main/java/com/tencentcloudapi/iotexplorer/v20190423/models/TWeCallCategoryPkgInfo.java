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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TWeCallCategoryPkgInfo extends AbstractModel {

    /**
    * 类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PkgType")
    @Expose
    private Long PkgType;

    /**
    * 总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("All")
    @Expose
    private Long All;

    /**
    * 已使用数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Used")
    @Expose
    private Long Used;

    /**
     * Get 类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PkgType 类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPkgType() {
        return this.PkgType;
    }

    /**
     * Set 类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param PkgType 类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPkgType(Long PkgType) {
        this.PkgType = PkgType;
    }

    /**
     * Get 总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return All 总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAll() {
        return this.All;
    }

    /**
     * Set 总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param All 总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAll(Long All) {
        this.All = All;
    }

    /**
     * Get 已使用数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Used 已使用数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUsed() {
        return this.Used;
    }

    /**
     * Set 已使用数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Used 已使用数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUsed(Long Used) {
        this.Used = Used;
    }

    public TWeCallCategoryPkgInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TWeCallCategoryPkgInfo(TWeCallCategoryPkgInfo source) {
        if (source.PkgType != null) {
            this.PkgType = new Long(source.PkgType);
        }
        if (source.All != null) {
            this.All = new Long(source.All);
        }
        if (source.Used != null) {
            this.Used = new Long(source.Used);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PkgType", this.PkgType);
        this.setParamSimple(map, prefix + "All", this.All);
        this.setParamSimple(map, prefix + "Used", this.Used);

    }
}

