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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IDCardResult extends AbstractModel {

    /**
    * 正面结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Front")
    @Expose
    private IDCardInfoResult Front;

    /**
    * 反面结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Back")
    @Expose
    private IDCardInfoResult Back;

    /**
     * Get 正面结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Front 正面结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IDCardInfoResult getFront() {
        return this.Front;
    }

    /**
     * Set 正面结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param Front 正面结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFront(IDCardInfoResult Front) {
        this.Front = Front;
    }

    /**
     * Get 反面结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Back 反面结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IDCardInfoResult getBack() {
        return this.Back;
    }

    /**
     * Set 反面结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param Back 反面结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBack(IDCardInfoResult Back) {
        this.Back = Back;
    }

    public IDCardResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IDCardResult(IDCardResult source) {
        if (source.Front != null) {
            this.Front = new IDCardInfoResult(source.Front);
        }
        if (source.Back != null) {
            this.Back = new IDCardInfoResult(source.Back);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Front.", this.Front);
        this.setParamObj(map, prefix + "Back.", this.Back);

    }
}

