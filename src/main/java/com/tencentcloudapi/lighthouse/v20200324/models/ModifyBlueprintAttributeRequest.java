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

public class ModifyBlueprintAttributeRequest extends AbstractModel{

    /**
    * 镜像 ID。可通过[DescribeBlueprints](https://cloud.tencent.com/document/product/1207/47689)接口返回值中的BlueprintId获取。
    */
    @SerializedName("BlueprintId")
    @Expose
    private String BlueprintId;

    /**
    * 设置新的镜像名称。最大长度60。
    */
    @SerializedName("BlueprintName")
    @Expose
    private String BlueprintName;

    /**
    * 设置新的镜像描述。最大长度60。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 镜像 ID。可通过[DescribeBlueprints](https://cloud.tencent.com/document/product/1207/47689)接口返回值中的BlueprintId获取。 
     * @return BlueprintId 镜像 ID。可通过[DescribeBlueprints](https://cloud.tencent.com/document/product/1207/47689)接口返回值中的BlueprintId获取。
     */
    public String getBlueprintId() {
        return this.BlueprintId;
    }

    /**
     * Set 镜像 ID。可通过[DescribeBlueprints](https://cloud.tencent.com/document/product/1207/47689)接口返回值中的BlueprintId获取。
     * @param BlueprintId 镜像 ID。可通过[DescribeBlueprints](https://cloud.tencent.com/document/product/1207/47689)接口返回值中的BlueprintId获取。
     */
    public void setBlueprintId(String BlueprintId) {
        this.BlueprintId = BlueprintId;
    }

    /**
     * Get 设置新的镜像名称。最大长度60。 
     * @return BlueprintName 设置新的镜像名称。最大长度60。
     */
    public String getBlueprintName() {
        return this.BlueprintName;
    }

    /**
     * Set 设置新的镜像名称。最大长度60。
     * @param BlueprintName 设置新的镜像名称。最大长度60。
     */
    public void setBlueprintName(String BlueprintName) {
        this.BlueprintName = BlueprintName;
    }

    /**
     * Get 设置新的镜像描述。最大长度60。 
     * @return Description 设置新的镜像描述。最大长度60。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 设置新的镜像描述。最大长度60。
     * @param Description 设置新的镜像描述。最大长度60。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public ModifyBlueprintAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBlueprintAttributeRequest(ModifyBlueprintAttributeRequest source) {
        if (source.BlueprintId != null) {
            this.BlueprintId = new String(source.BlueprintId);
        }
        if (source.BlueprintName != null) {
            this.BlueprintName = new String(source.BlueprintName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BlueprintId", this.BlueprintId);
        this.setParamSimple(map, prefix + "BlueprintName", this.BlueprintName);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

