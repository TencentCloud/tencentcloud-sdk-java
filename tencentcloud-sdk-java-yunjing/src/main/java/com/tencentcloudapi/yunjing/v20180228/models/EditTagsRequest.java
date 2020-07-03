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
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EditTagsRequest extends AbstractModel{

    /**
    * 标签名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 标签ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * CVM主机ID
    */
    @SerializedName("Quuids")
    @Expose
    private String [] Quuids;

    /**
     * Get 标签名 
     * @return Name 标签名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 标签名
     * @param Name 标签名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 标签ID 
     * @return Id 标签ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 标签ID
     * @param Id 标签ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get CVM主机ID 
     * @return Quuids CVM主机ID
     */
    public String [] getQuuids() {
        return this.Quuids;
    }

    /**
     * Set CVM主机ID
     * @param Quuids CVM主机ID
     */
    public void setQuuids(String [] Quuids) {
        this.Quuids = Quuids;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamArraySimple(map, prefix + "Quuids.", this.Quuids);

    }
}

