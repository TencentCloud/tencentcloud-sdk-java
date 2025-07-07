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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BaselineDetail extends AbstractModel {

    /**
    * 基线描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 危害等级
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * package名
    */
    @SerializedName("PackageName")
    @Expose
    private String PackageName;

    /**
    * 父级id
    */
    @SerializedName("ParentId")
    @Expose
    private Long ParentId;

    /**
    * 基线名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get 基线描述 
     * @return Description 基线描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 基线描述
     * @param Description 基线描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 危害等级 
     * @return Level 危害等级
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 危害等级
     * @param Level 危害等级
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get package名 
     * @return PackageName package名
     */
    public String getPackageName() {
        return this.PackageName;
    }

    /**
     * Set package名
     * @param PackageName package名
     */
    public void setPackageName(String PackageName) {
        this.PackageName = PackageName;
    }

    /**
     * Get 父级id 
     * @return ParentId 父级id
     */
    public Long getParentId() {
        return this.ParentId;
    }

    /**
     * Set 父级id
     * @param ParentId 父级id
     */
    public void setParentId(Long ParentId) {
        this.ParentId = ParentId;
    }

    /**
     * Get 基线名 
     * @return Name 基线名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 基线名
     * @param Name 基线名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public BaselineDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineDetail(BaselineDetail source) {
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.PackageName != null) {
            this.PackageName = new String(source.PackageName);
        }
        if (source.ParentId != null) {
            this.ParentId = new Long(source.ParentId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "PackageName", this.PackageName);
        this.setParamSimple(map, prefix + "ParentId", this.ParentId);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

