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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WorkflowTrigger extends AbstractModel{

    /**
    * 触发器的类型，目前仅支持 CosFileUpload。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 当 Type 为 CosFileUpload 时必填且有效，为 COS 触发规则。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CosFileUploadTrigger")
    @Expose
    private CosFileUploadTrigger CosFileUploadTrigger;

    /**
     * Get 触发器的类型，目前仅支持 CosFileUpload。 
     * @return Type 触发器的类型，目前仅支持 CosFileUpload。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 触发器的类型，目前仅支持 CosFileUpload。
     * @param Type 触发器的类型，目前仅支持 CosFileUpload。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 当 Type 为 CosFileUpload 时必填且有效，为 COS 触发规则。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CosFileUploadTrigger 当 Type 为 CosFileUpload 时必填且有效，为 COS 触发规则。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CosFileUploadTrigger getCosFileUploadTrigger() {
        return this.CosFileUploadTrigger;
    }

    /**
     * Set 当 Type 为 CosFileUpload 时必填且有效，为 COS 触发规则。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CosFileUploadTrigger 当 Type 为 CosFileUpload 时必填且有效，为 COS 触发规则。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCosFileUploadTrigger(CosFileUploadTrigger CosFileUploadTrigger) {
        this.CosFileUploadTrigger = CosFileUploadTrigger;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "CosFileUploadTrigger.", this.CosFileUploadTrigger);

    }
}

