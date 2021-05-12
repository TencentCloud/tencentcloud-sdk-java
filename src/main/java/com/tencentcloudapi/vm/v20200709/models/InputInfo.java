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
package com.tencentcloudapi.vm.v20200709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InputInfo extends AbstractModel{

    /**
    * 传入的类型可选：URL，COS
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Url地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 桶信息。当输入当时COS时，该字段不为空
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BucketInfo")
    @Expose
    private String BucketInfo;

    /**
     * Get 传入的类型可选：URL，COS
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 传入的类型可选：URL，COS
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 传入的类型可选：URL，COS
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 传入的类型可选：URL，COS
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Url地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Url Url地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Url地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param Url Url地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 桶信息。当输入当时COS时，该字段不为空
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BucketInfo 桶信息。当输入当时COS时，该字段不为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBucketInfo() {
        return this.BucketInfo;
    }

    /**
     * Set 桶信息。当输入当时COS时，该字段不为空
注意：此字段可能返回 null，表示取不到有效值。
     * @param BucketInfo 桶信息。当输入当时COS时，该字段不为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBucketInfo(String BucketInfo) {
        this.BucketInfo = BucketInfo;
    }

    public InputInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InputInfo(InputInfo source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.BucketInfo != null) {
            this.BucketInfo = new String(source.BucketInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "BucketInfo", this.BucketInfo);

    }
}

