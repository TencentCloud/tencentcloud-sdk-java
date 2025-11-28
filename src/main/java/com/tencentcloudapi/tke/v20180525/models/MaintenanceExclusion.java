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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MaintenanceExclusion extends AbstractModel {

    /**
    * 维护排除项名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 维护排除项开始时间
    */
    @SerializedName("StartAt")
    @Expose
    private String StartAt;

    /**
    * 维护排除项结束时间
    */
    @SerializedName("EndAt")
    @Expose
    private String EndAt;

    /**
    * 维护排除项ID
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
     * Get 维护排除项名称 
     * @return Name 维护排除项名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 维护排除项名称
     * @param Name 维护排除项名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 维护排除项开始时间 
     * @return StartAt 维护排除项开始时间
     */
    public String getStartAt() {
        return this.StartAt;
    }

    /**
     * Set 维护排除项开始时间
     * @param StartAt 维护排除项开始时间
     */
    public void setStartAt(String StartAt) {
        this.StartAt = StartAt;
    }

    /**
     * Get 维护排除项结束时间 
     * @return EndAt 维护排除项结束时间
     */
    public String getEndAt() {
        return this.EndAt;
    }

    /**
     * Set 维护排除项结束时间
     * @param EndAt 维护排除项结束时间
     */
    public void setEndAt(String EndAt) {
        this.EndAt = EndAt;
    }

    /**
     * Get 维护排除项ID 
     * @return ID 维护排除项ID
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set 维护排除项ID
     * @param ID 维护排除项ID
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    public MaintenanceExclusion() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MaintenanceExclusion(MaintenanceExclusion source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.StartAt != null) {
            this.StartAt = new String(source.StartAt);
        }
        if (source.EndAt != null) {
            this.EndAt = new String(source.EndAt);
        }
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "StartAt", this.StartAt);
        this.setParamSimple(map, prefix + "EndAt", this.EndAt);
        this.setParamSimple(map, prefix + "ID", this.ID);

    }
}

