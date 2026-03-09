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
package com.tencentcloudapi.cetcd.v20220325.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EtcdAutoCompactionSettings extends AbstractModel {

    /**
    * 自动压缩模式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoCompactionMode")
    @Expose
    private String AutoCompactionMode;

    /**
    * 自动压缩保留时间/revison数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoCompactionRetention")
    @Expose
    private String AutoCompactionRetention;

    /**
     * Get 自动压缩模式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoCompactionMode 自动压缩模式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAutoCompactionMode() {
        return this.AutoCompactionMode;
    }

    /**
     * Set 自动压缩模式
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoCompactionMode 自动压缩模式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoCompactionMode(String AutoCompactionMode) {
        this.AutoCompactionMode = AutoCompactionMode;
    }

    /**
     * Get 自动压缩保留时间/revison数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoCompactionRetention 自动压缩保留时间/revison数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAutoCompactionRetention() {
        return this.AutoCompactionRetention;
    }

    /**
     * Set 自动压缩保留时间/revison数
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoCompactionRetention 自动压缩保留时间/revison数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoCompactionRetention(String AutoCompactionRetention) {
        this.AutoCompactionRetention = AutoCompactionRetention;
    }

    public EtcdAutoCompactionSettings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EtcdAutoCompactionSettings(EtcdAutoCompactionSettings source) {
        if (source.AutoCompactionMode != null) {
            this.AutoCompactionMode = new String(source.AutoCompactionMode);
        }
        if (source.AutoCompactionRetention != null) {
            this.AutoCompactionRetention = new String(source.AutoCompactionRetention);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoCompactionMode", this.AutoCompactionMode);
        this.setParamSimple(map, prefix + "AutoCompactionRetention", this.AutoCompactionRetention);

    }
}

