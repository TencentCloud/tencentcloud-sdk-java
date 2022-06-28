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
package com.tencentcloudapi.tcbr.v20220217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OnlineVersionInfo extends AbstractModel{

    /**
    * 版本名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VersionName")
    @Expose
    private String VersionName;

    /**
    * 镜像url
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * 流量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FlowRatio")
    @Expose
    private String FlowRatio;

    /**
     * Get 版本名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VersionName 版本名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersionName() {
        return this.VersionName;
    }

    /**
     * Set 版本名
注意：此字段可能返回 null，表示取不到有效值。
     * @param VersionName 版本名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersionName(String VersionName) {
        this.VersionName = VersionName;
    }

    /**
     * Get 镜像url
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageUrl 镜像url
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set 镜像url
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageUrl 镜像url
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get 流量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FlowRatio 流量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFlowRatio() {
        return this.FlowRatio;
    }

    /**
     * Set 流量
注意：此字段可能返回 null，表示取不到有效值。
     * @param FlowRatio 流量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFlowRatio(String FlowRatio) {
        this.FlowRatio = FlowRatio;
    }

    public OnlineVersionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OnlineVersionInfo(OnlineVersionInfo source) {
        if (source.VersionName != null) {
            this.VersionName = new String(source.VersionName);
        }
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.FlowRatio != null) {
            this.FlowRatio = new String(source.FlowRatio);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VersionName", this.VersionName);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "FlowRatio", this.FlowRatio);

    }
}

