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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScreenVulInfo extends AbstractModel {

    /**
    * 漏洞事件id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 漏洞名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 漏洞id
    */
    @SerializedName("VulId")
    @Expose
    private Long VulId;

    /**
    * 最后检测时间
    */
    @SerializedName("LastTime")
    @Expose
    private String LastTime;

    /**
    * 漏洞等级 1:低 2:中 3:高 4:提示
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * 漏洞类型 1: web-cms漏洞, 2:应用漏洞, 4: Linux软件漏洞, 5: Windows系统漏洞
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Category")
    @Expose
    private Long Category;

    /**
    * 主机UUID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
     * Get 漏洞事件id 
     * @return Id 漏洞事件id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 漏洞事件id
     * @param Id 漏洞事件id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 漏洞名 
     * @return Name 漏洞名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 漏洞名
     * @param Name 漏洞名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 漏洞id 
     * @return VulId 漏洞id
     */
    public Long getVulId() {
        return this.VulId;
    }

    /**
     * Set 漏洞id
     * @param VulId 漏洞id
     */
    public void setVulId(Long VulId) {
        this.VulId = VulId;
    }

    /**
     * Get 最后检测时间 
     * @return LastTime 最后检测时间
     */
    public String getLastTime() {
        return this.LastTime;
    }

    /**
     * Set 最后检测时间
     * @param LastTime 最后检测时间
     */
    public void setLastTime(String LastTime) {
        this.LastTime = LastTime;
    }

    /**
     * Get 漏洞等级 1:低 2:中 3:高 4:提示 
     * @return Level 漏洞等级 1:低 2:中 3:高 4:提示
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 漏洞等级 1:低 2:中 3:高 4:提示
     * @param Level 漏洞等级 1:低 2:中 3:高 4:提示
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get 漏洞类型 1: web-cms漏洞, 2:应用漏洞, 4: Linux软件漏洞, 5: Windows系统漏洞
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Category 漏洞类型 1: web-cms漏洞, 2:应用漏洞, 4: Linux软件漏洞, 5: Windows系统漏洞
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCategory() {
        return this.Category;
    }

    /**
     * Set 漏洞类型 1: web-cms漏洞, 2:应用漏洞, 4: Linux软件漏洞, 5: Windows系统漏洞
注意：此字段可能返回 null，表示取不到有效值。
     * @param Category 漏洞类型 1: web-cms漏洞, 2:应用漏洞, 4: Linux软件漏洞, 5: Windows系统漏洞
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCategory(Long Category) {
        this.Category = Category;
    }

    /**
     * Get 主机UUID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Uuid 主机UUID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set 主机UUID
注意：此字段可能返回 null，表示取不到有效值。
     * @param Uuid 主机UUID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    public ScreenVulInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScreenVulInfo(ScreenVulInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.VulId != null) {
            this.VulId = new Long(source.VulId);
        }
        if (source.LastTime != null) {
            this.LastTime = new String(source.LastTime);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.Category != null) {
            this.Category = new Long(source.Category);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "VulId", this.VulId);
        this.setParamSimple(map, prefix + "LastTime", this.LastTime);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);

    }
}

