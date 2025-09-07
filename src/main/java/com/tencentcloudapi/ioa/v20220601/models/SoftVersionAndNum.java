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
package com.tencentcloudapi.ioa.v20220601.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SoftVersionAndNum extends AbstractModel {

    /**
    * 软件版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 安装数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Num")
    @Expose
    private Long Num;

    /**
     * Get 软件版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Version 软件版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 软件版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param Version 软件版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 安装数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Num 安装数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNum() {
        return this.Num;
    }

    /**
     * Set 安装数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Num 安装数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNum(Long Num) {
        this.Num = Num;
    }

    public SoftVersionAndNum() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SoftVersionAndNum(SoftVersionAndNum source) {
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.Num != null) {
            this.Num = new Long(source.Num);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Num", this.Num);

    }
}

