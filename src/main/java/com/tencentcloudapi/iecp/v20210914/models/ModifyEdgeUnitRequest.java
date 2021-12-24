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

public class ModifyEdgeUnitRequest extends AbstractModel{

    /**
    * 边缘集群ID
    */
    @SerializedName("EdgeUnitId")
    @Expose
    private Long EdgeUnitId;

    /**
    * 边缘集群名称，64字符以内
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 集群描述，200字符以内
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 边缘集群ID 
     * @return EdgeUnitId 边缘集群ID
     */
    public Long getEdgeUnitId() {
        return this.EdgeUnitId;
    }

    /**
     * Set 边缘集群ID
     * @param EdgeUnitId 边缘集群ID
     */
    public void setEdgeUnitId(Long EdgeUnitId) {
        this.EdgeUnitId = EdgeUnitId;
    }

    /**
     * Get 边缘集群名称，64字符以内 
     * @return Name 边缘集群名称，64字符以内
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 边缘集群名称，64字符以内
     * @param Name 边缘集群名称，64字符以内
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 集群描述，200字符以内 
     * @return Description 集群描述，200字符以内
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 集群描述，200字符以内
     * @param Description 集群描述，200字符以内
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public ModifyEdgeUnitRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyEdgeUnitRequest(ModifyEdgeUnitRequest source) {
        if (source.EdgeUnitId != null) {
            this.EdgeUnitId = new Long(source.EdgeUnitId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EdgeUnitId", this.EdgeUnitId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

