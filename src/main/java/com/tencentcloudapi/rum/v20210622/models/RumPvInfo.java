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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RumPvInfo extends AbstractModel{

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * pv访问量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Pv")
    @Expose
    private String Pv;

    /**
    * 时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get 项目ID 
     * @return ProjectId 项目ID
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get pv访问量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Pv pv访问量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPv() {
        return this.Pv;
    }

    /**
     * Set pv访问量
注意：此字段可能返回 null，表示取不到有效值。
     * @param Pv pv访问量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPv(String Pv) {
        this.Pv = Pv;
    }

    /**
     * Get 时间 
     * @return CreateTime 时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 时间
     * @param CreateTime 时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public RumPvInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RumPvInfo(RumPvInfo source) {
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.Pv != null) {
            this.Pv = new String(source.Pv);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Pv", this.Pv);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

