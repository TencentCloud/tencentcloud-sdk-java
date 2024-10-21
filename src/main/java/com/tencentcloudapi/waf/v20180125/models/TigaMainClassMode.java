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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TigaMainClassMode extends AbstractModel {

    /**
    * MainclassID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TypeID")
    @Expose
    private String TypeID;

    /**
    * 防护模式，0表示观察，1表示拦截
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Mode")
    @Expose
    private Long Mode;

    /**
     * Get MainclassID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TypeID MainclassID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTypeID() {
        return this.TypeID;
    }

    /**
     * Set MainclassID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TypeID MainclassID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTypeID(String TypeID) {
        this.TypeID = TypeID;
    }

    /**
     * Get 防护模式，0表示观察，1表示拦截
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Mode 防护模式，0表示观察，1表示拦截
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMode() {
        return this.Mode;
    }

    /**
     * Set 防护模式，0表示观察，1表示拦截
注意：此字段可能返回 null，表示取不到有效值。
     * @param Mode 防护模式，0表示观察，1表示拦截
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMode(Long Mode) {
        this.Mode = Mode;
    }

    public TigaMainClassMode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TigaMainClassMode(TigaMainClassMode source) {
        if (source.TypeID != null) {
            this.TypeID = new String(source.TypeID);
        }
        if (source.Mode != null) {
            this.Mode = new Long(source.Mode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TypeID", this.TypeID);
        this.setParamSimple(map, prefix + "Mode", this.Mode);

    }
}

