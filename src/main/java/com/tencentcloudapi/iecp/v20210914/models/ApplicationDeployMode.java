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
package com.tencentcloudapi.iecp.v20210914.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApplicationDeployMode extends AbstractModel{

    /**
    * 1:指定节点部署 2:单元部署
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 资源ID
    */
    @SerializedName("ResourceID")
    @Expose
    private Long ResourceID;

    /**
    * 资源名
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
     * Get 1:指定节点部署 2:单元部署
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 1:指定节点部署 2:单元部署
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 1:指定节点部署 2:单元部署
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 1:指定节点部署 2:单元部署
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 资源ID 
     * @return ResourceID 资源ID
     */
    public Long getResourceID() {
        return this.ResourceID;
    }

    /**
     * Set 资源ID
     * @param ResourceID 资源ID
     */
    public void setResourceID(Long ResourceID) {
        this.ResourceID = ResourceID;
    }

    /**
     * Get 资源名 
     * @return ResourceName 资源名
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set 资源名
     * @param ResourceName 资源名
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    public ApplicationDeployMode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplicationDeployMode(ApplicationDeployMode source) {
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.ResourceID != null) {
            this.ResourceID = new Long(source.ResourceID);
        }
        if (source.ResourceName != null) {
            this.ResourceName = new String(source.ResourceName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ResourceID", this.ResourceID);
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);

    }
}

