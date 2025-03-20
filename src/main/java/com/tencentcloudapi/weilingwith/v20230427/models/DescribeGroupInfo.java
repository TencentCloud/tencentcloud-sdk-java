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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeGroupInfo extends AbstractModel {

    /**
    * 分组
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 设备分组名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 分组描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 分组父级ID
    */
    @SerializedName("ParentId")
    @Expose
    private Long ParentId;

    /**
     * Get 分组 
     * @return Id 分组
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 分组
     * @param Id 分组
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 设备分组名称 
     * @return Name 设备分组名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 设备分组名称
     * @param Name 设备分组名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 分组描述 
     * @return Description 分组描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 分组描述
     * @param Description 分组描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 分组父级ID 
     * @return ParentId 分组父级ID
     */
    public Long getParentId() {
        return this.ParentId;
    }

    /**
     * Set 分组父级ID
     * @param ParentId 分组父级ID
     */
    public void setParentId(Long ParentId) {
        this.ParentId = ParentId;
    }

    public DescribeGroupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGroupInfo(DescribeGroupInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ParentId != null) {
            this.ParentId = new Long(source.ParentId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ParentId", this.ParentId);

    }
}

