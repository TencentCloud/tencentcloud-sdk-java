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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EngineVersion extends AbstractModel{

    /**
    * 引擎版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 运行镜像
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * 是否支持int8量化
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsSupportIntEightQuantization")
    @Expose
    private Boolean IsSupportIntEightQuantization;

    /**
    * 框架版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FrameworkVersion")
    @Expose
    private String FrameworkVersion;

    /**
     * Get 引擎版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Version 引擎版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 引擎版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param Version 引擎版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 运行镜像
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Image 运行镜像
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set 运行镜像
注意：此字段可能返回 null，表示取不到有效值。
     * @param Image 运行镜像
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * Get 是否支持int8量化
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsSupportIntEightQuantization 是否支持int8量化
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsSupportIntEightQuantization() {
        return this.IsSupportIntEightQuantization;
    }

    /**
     * Set 是否支持int8量化
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsSupportIntEightQuantization 是否支持int8量化
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsSupportIntEightQuantization(Boolean IsSupportIntEightQuantization) {
        this.IsSupportIntEightQuantization = IsSupportIntEightQuantization;
    }

    /**
     * Get 框架版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FrameworkVersion 框架版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFrameworkVersion() {
        return this.FrameworkVersion;
    }

    /**
     * Set 框架版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param FrameworkVersion 框架版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFrameworkVersion(String FrameworkVersion) {
        this.FrameworkVersion = FrameworkVersion;
    }

    public EngineVersion() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EngineVersion(EngineVersion source) {
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.Image != null) {
            this.Image = new String(source.Image);
        }
        if (source.IsSupportIntEightQuantization != null) {
            this.IsSupportIntEightQuantization = new Boolean(source.IsSupportIntEightQuantization);
        }
        if (source.FrameworkVersion != null) {
            this.FrameworkVersion = new String(source.FrameworkVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Image", this.Image);
        this.setParamSimple(map, prefix + "IsSupportIntEightQuantization", this.IsSupportIntEightQuantization);
        this.setParamSimple(map, prefix + "FrameworkVersion", this.FrameworkVersion);

    }
}

