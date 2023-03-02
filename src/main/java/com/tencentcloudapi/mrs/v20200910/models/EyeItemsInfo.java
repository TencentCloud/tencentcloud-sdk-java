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
package com.tencentcloudapi.mrs.v20200910.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EyeItemsInfo extends AbstractModel{

    /**
    * 眼科报告
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EyeItems")
    @Expose
    private EyeItem EyeItems;

    /**
    * 版本号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
     * Get 眼科报告
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EyeItems 眼科报告
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EyeItem getEyeItems() {
        return this.EyeItems;
    }

    /**
     * Set 眼科报告
注意：此字段可能返回 null，表示取不到有效值。
     * @param EyeItems 眼科报告
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEyeItems(EyeItem EyeItems) {
        this.EyeItems = EyeItems;
    }

    /**
     * Get 版本号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Version 版本号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 版本号
注意：此字段可能返回 null，表示取不到有效值。
     * @param Version 版本号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    public EyeItemsInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EyeItemsInfo(EyeItemsInfo source) {
        if (source.EyeItems != null) {
            this.EyeItems = new EyeItem(source.EyeItems);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "EyeItems.", this.EyeItems);
        this.setParamSimple(map, prefix + "Version", this.Version);

    }
}

