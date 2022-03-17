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

public class ModifyEdgeUnitCloudApiRequest extends AbstractModel{

    /**
    * 边缘单元ID
    */
    @SerializedName("EdgeUnitId")
    @Expose
    private Long EdgeUnitId;

    /**
    * 边缘单元名称，64字符内
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 描述，200字符内
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 是否开启监控
    */
    @SerializedName("OpenCloudMonitor")
    @Expose
    private Boolean OpenCloudMonitor;

    /**
     * Get 边缘单元ID 
     * @return EdgeUnitId 边缘单元ID
     */
    public Long getEdgeUnitId() {
        return this.EdgeUnitId;
    }

    /**
     * Set 边缘单元ID
     * @param EdgeUnitId 边缘单元ID
     */
    public void setEdgeUnitId(Long EdgeUnitId) {
        this.EdgeUnitId = EdgeUnitId;
    }

    /**
     * Get 边缘单元名称，64字符内 
     * @return Name 边缘单元名称，64字符内
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 边缘单元名称，64字符内
     * @param Name 边缘单元名称，64字符内
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 描述，200字符内 
     * @return Description 描述，200字符内
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述，200字符内
     * @param Description 描述，200字符内
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 是否开启监控 
     * @return OpenCloudMonitor 是否开启监控
     */
    public Boolean getOpenCloudMonitor() {
        return this.OpenCloudMonitor;
    }

    /**
     * Set 是否开启监控
     * @param OpenCloudMonitor 是否开启监控
     */
    public void setOpenCloudMonitor(Boolean OpenCloudMonitor) {
        this.OpenCloudMonitor = OpenCloudMonitor;
    }

    public ModifyEdgeUnitCloudApiRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyEdgeUnitCloudApiRequest(ModifyEdgeUnitCloudApiRequest source) {
        if (source.EdgeUnitId != null) {
            this.EdgeUnitId = new Long(source.EdgeUnitId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.OpenCloudMonitor != null) {
            this.OpenCloudMonitor = new Boolean(source.OpenCloudMonitor);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EdgeUnitId", this.EdgeUnitId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "OpenCloudMonitor", this.OpenCloudMonitor);

    }
}

