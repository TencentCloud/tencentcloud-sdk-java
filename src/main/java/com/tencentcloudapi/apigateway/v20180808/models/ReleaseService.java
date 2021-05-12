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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReleaseService extends AbstractModel{

    /**
    * 发布时的备注信息填写。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReleaseDesc")
    @Expose
    private String ReleaseDesc;

    /**
    * 发布的版本id。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReleaseVersion")
    @Expose
    private String ReleaseVersion;

    /**
     * Get 发布时的备注信息填写。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReleaseDesc 发布时的备注信息填写。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReleaseDesc() {
        return this.ReleaseDesc;
    }

    /**
     * Set 发布时的备注信息填写。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReleaseDesc 发布时的备注信息填写。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReleaseDesc(String ReleaseDesc) {
        this.ReleaseDesc = ReleaseDesc;
    }

    /**
     * Get 发布的版本id。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReleaseVersion 发布的版本id。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReleaseVersion() {
        return this.ReleaseVersion;
    }

    /**
     * Set 发布的版本id。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReleaseVersion 发布的版本id。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReleaseVersion(String ReleaseVersion) {
        this.ReleaseVersion = ReleaseVersion;
    }

    public ReleaseService() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReleaseService(ReleaseService source) {
        if (source.ReleaseDesc != null) {
            this.ReleaseDesc = new String(source.ReleaseDesc);
        }
        if (source.ReleaseVersion != null) {
            this.ReleaseVersion = new String(source.ReleaseVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReleaseDesc", this.ReleaseDesc);
        this.setParamSimple(map, prefix + "ReleaseVersion", this.ReleaseVersion);

    }
}

