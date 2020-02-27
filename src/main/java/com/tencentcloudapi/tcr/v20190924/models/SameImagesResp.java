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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SameImagesResp extends AbstractModel{

    /**
    * tag列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SameImages")
    @Expose
    private String [] SameImages;

    /**
     * Get tag列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SameImages tag列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSameImages() {
        return this.SameImages;
    }

    /**
     * Set tag列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param SameImages tag列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSameImages(String [] SameImages) {
        this.SameImages = SameImages;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "SameImages.", this.SameImages);

    }
}

