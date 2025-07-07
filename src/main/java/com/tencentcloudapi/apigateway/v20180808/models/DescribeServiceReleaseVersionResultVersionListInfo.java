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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeServiceReleaseVersionResultVersionListInfo extends AbstractModel {

    /**
    * 版本号。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VersionName")
    @Expose
    private String VersionName;

    /**
    * 版本描述。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VersionDesc")
    @Expose
    private String VersionDesc;

    /**
     * Get 版本号。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VersionName 版本号。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersionName() {
        return this.VersionName;
    }

    /**
     * Set 版本号。
注意：此字段可能返回 null，表示取不到有效值。
     * @param VersionName 版本号。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersionName(String VersionName) {
        this.VersionName = VersionName;
    }

    /**
     * Get 版本描述。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VersionDesc 版本描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersionDesc() {
        return this.VersionDesc;
    }

    /**
     * Set 版本描述。
注意：此字段可能返回 null，表示取不到有效值。
     * @param VersionDesc 版本描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersionDesc(String VersionDesc) {
        this.VersionDesc = VersionDesc;
    }

    public DescribeServiceReleaseVersionResultVersionListInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeServiceReleaseVersionResultVersionListInfo(DescribeServiceReleaseVersionResultVersionListInfo source) {
        if (source.VersionName != null) {
            this.VersionName = new String(source.VersionName);
        }
        if (source.VersionDesc != null) {
            this.VersionDesc = new String(source.VersionDesc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VersionName", this.VersionName);
        this.setParamSimple(map, prefix + "VersionDesc", this.VersionDesc);

    }
}

