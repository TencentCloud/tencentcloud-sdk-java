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

public class ApplicationBasicInfo extends AbstractModel{

    /**
    * 名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 管理URL地址
    */
    @SerializedName("ManageUrl")
    @Expose
    private String ManageUrl;

    /**
    * 描述信息
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 是否允许可视化修改
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AllowVisualModify")
    @Expose
    private Boolean AllowVisualModify;

    /**
     * Get 名称 
     * @return Name 名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称
     * @param Name 名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 管理URL地址 
     * @return ManageUrl 管理URL地址
     */
    public String getManageUrl() {
        return this.ManageUrl;
    }

    /**
     * Set 管理URL地址
     * @param ManageUrl 管理URL地址
     */
    public void setManageUrl(String ManageUrl) {
        this.ManageUrl = ManageUrl;
    }

    /**
     * Get 描述信息 
     * @return Description 描述信息
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述信息
     * @param Description 描述信息
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 是否允许可视化修改
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AllowVisualModify 是否允许可视化修改
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getAllowVisualModify() {
        return this.AllowVisualModify;
    }

    /**
     * Set 是否允许可视化修改
注意：此字段可能返回 null，表示取不到有效值。
     * @param AllowVisualModify 是否允许可视化修改
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAllowVisualModify(Boolean AllowVisualModify) {
        this.AllowVisualModify = AllowVisualModify;
    }

    public ApplicationBasicInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplicationBasicInfo(ApplicationBasicInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ManageUrl != null) {
            this.ManageUrl = new String(source.ManageUrl);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.AllowVisualModify != null) {
            this.AllowVisualModify = new Boolean(source.AllowVisualModify);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ManageUrl", this.ManageUrl);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "AllowVisualModify", this.AllowVisualModify);

    }
}

