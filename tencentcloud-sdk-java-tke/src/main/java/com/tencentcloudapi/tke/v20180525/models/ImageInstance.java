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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageInstance extends AbstractModel{

    /**
    * 镜像别名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * 操作系统名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OsName")
    @Expose
    private String OsName;

    /**
    * 镜像ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * 容器的镜像版本，"DOCKER_CUSTOMIZE"(容器定制版),"GENERAL"(普通版本，默认值)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OsCustomizeType")
    @Expose
    private String OsCustomizeType;

    /**
     * Get 镜像别名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Alias 镜像别名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set 镜像别名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Alias 镜像别名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get 操作系统名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OsName 操作系统名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOsName() {
        return this.OsName;
    }

    /**
     * Set 操作系统名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param OsName 操作系统名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOsName(String OsName) {
        this.OsName = OsName;
    }

    /**
     * Get 镜像ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageId 镜像ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set 镜像ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageId 镜像ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get 容器的镜像版本，"DOCKER_CUSTOMIZE"(容器定制版),"GENERAL"(普通版本，默认值)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OsCustomizeType 容器的镜像版本，"DOCKER_CUSTOMIZE"(容器定制版),"GENERAL"(普通版本，默认值)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOsCustomizeType() {
        return this.OsCustomizeType;
    }

    /**
     * Set 容器的镜像版本，"DOCKER_CUSTOMIZE"(容器定制版),"GENERAL"(普通版本，默认值)
注意：此字段可能返回 null，表示取不到有效值。
     * @param OsCustomizeType 容器的镜像版本，"DOCKER_CUSTOMIZE"(容器定制版),"GENERAL"(普通版本，默认值)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOsCustomizeType(String OsCustomizeType) {
        this.OsCustomizeType = OsCustomizeType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "OsName", this.OsName);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "OsCustomizeType", this.OsCustomizeType);

    }
}

