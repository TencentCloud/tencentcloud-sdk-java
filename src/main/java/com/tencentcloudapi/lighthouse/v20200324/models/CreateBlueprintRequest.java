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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateBlueprintRequest extends AbstractModel{

    /**
    * 镜像名称。最大长度60。
    */
    @SerializedName("BlueprintName")
    @Expose
    private String BlueprintName;

    /**
    * 镜像描述。最大长度60。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 需要制作镜像的实例ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get 镜像名称。最大长度60。 
     * @return BlueprintName 镜像名称。最大长度60。
     */
    public String getBlueprintName() {
        return this.BlueprintName;
    }

    /**
     * Set 镜像名称。最大长度60。
     * @param BlueprintName 镜像名称。最大长度60。
     */
    public void setBlueprintName(String BlueprintName) {
        this.BlueprintName = BlueprintName;
    }

    /**
     * Get 镜像描述。最大长度60。 
     * @return Description 镜像描述。最大长度60。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 镜像描述。最大长度60。
     * @param Description 镜像描述。最大长度60。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 需要制作镜像的实例ID。 
     * @return InstanceId 需要制作镜像的实例ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 需要制作镜像的实例ID。
     * @param InstanceId 需要制作镜像的实例ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    public CreateBlueprintRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBlueprintRequest(CreateBlueprintRequest source) {
        if (source.BlueprintName != null) {
            this.BlueprintName = new String(source.BlueprintName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BlueprintName", this.BlueprintName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

