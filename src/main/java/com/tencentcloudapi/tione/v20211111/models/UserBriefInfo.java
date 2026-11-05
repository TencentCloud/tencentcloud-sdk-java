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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserBriefInfo extends AbstractModel {

    /**
    * <p>子用户uin</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubUin")
    @Expose
    private String SubUin;

    /**
    * <p>子用户名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubUinName")
    @Expose
    private String SubUinName;

    /**
     * Get <p>子用户uin</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubUin <p>子用户uin</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubUin() {
        return this.SubUin;
    }

    /**
     * Set <p>子用户uin</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubUin <p>子用户uin</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubUin(String SubUin) {
        this.SubUin = SubUin;
    }

    /**
     * Get <p>子用户名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubUinName <p>子用户名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubUinName() {
        return this.SubUinName;
    }

    /**
     * Set <p>子用户名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubUinName <p>子用户名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubUinName(String SubUinName) {
        this.SubUinName = SubUinName;
    }

    public UserBriefInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserBriefInfo(UserBriefInfo source) {
        if (source.SubUin != null) {
            this.SubUin = new String(source.SubUin);
        }
        if (source.SubUinName != null) {
            this.SubUinName = new String(source.SubUinName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubUin", this.SubUin);
        this.setParamSimple(map, prefix + "SubUinName", this.SubUinName);

    }
}

