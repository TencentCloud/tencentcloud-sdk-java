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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LocalizedTemplate extends AbstractModel {

    /**
    * <p>中文</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ZhCN")
    @Expose
    private String ZhCN;

    /**
    * <p>英文</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnUS")
    @Expose
    private String EnUS;

    /**
     * Get <p>中文</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ZhCN <p>中文</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getZhCN() {
        return this.ZhCN;
    }

    /**
     * Set <p>中文</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ZhCN <p>中文</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZhCN(String ZhCN) {
        this.ZhCN = ZhCN;
    }

    /**
     * Get <p>英文</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnUS <p>英文</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEnUS() {
        return this.EnUS;
    }

    /**
     * Set <p>英文</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnUS <p>英文</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnUS(String EnUS) {
        this.EnUS = EnUS;
    }

    public LocalizedTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LocalizedTemplate(LocalizedTemplate source) {
        if (source.ZhCN != null) {
            this.ZhCN = new String(source.ZhCN);
        }
        if (source.EnUS != null) {
            this.EnUS = new String(source.EnUS);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZhCN", this.ZhCN);
        this.setParamSimple(map, prefix + "EnUS", this.EnUS);

    }
}

