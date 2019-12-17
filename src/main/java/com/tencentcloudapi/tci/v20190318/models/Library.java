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
package com.tencentcloudapi.tci.v20190318.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Library extends AbstractModel{

    /**
    * 人员库创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 人员库唯一标识符
    */
    @SerializedName("LibraryId")
    @Expose
    private String LibraryId;

    /**
    * 人员库名称
    */
    @SerializedName("LibraryName")
    @Expose
    private String LibraryName;

    /**
    * 人员库人员数量
    */
    @SerializedName("PersonCount")
    @Expose
    private Long PersonCount;

    /**
    * 人员库修改时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 人员库创建时间 
     * @return CreateTime 人员库创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 人员库创建时间
     * @param CreateTime 人员库创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 人员库唯一标识符 
     * @return LibraryId 人员库唯一标识符
     */
    public String getLibraryId() {
        return this.LibraryId;
    }

    /**
     * Set 人员库唯一标识符
     * @param LibraryId 人员库唯一标识符
     */
    public void setLibraryId(String LibraryId) {
        this.LibraryId = LibraryId;
    }

    /**
     * Get 人员库名称 
     * @return LibraryName 人员库名称
     */
    public String getLibraryName() {
        return this.LibraryName;
    }

    /**
     * Set 人员库名称
     * @param LibraryName 人员库名称
     */
    public void setLibraryName(String LibraryName) {
        this.LibraryName = LibraryName;
    }

    /**
     * Get 人员库人员数量 
     * @return PersonCount 人员库人员数量
     */
    public Long getPersonCount() {
        return this.PersonCount;
    }

    /**
     * Set 人员库人员数量
     * @param PersonCount 人员库人员数量
     */
    public void setPersonCount(Long PersonCount) {
        this.PersonCount = PersonCount;
    }

    /**
     * Get 人员库修改时间 
     * @return UpdateTime 人员库修改时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 人员库修改时间
     * @param UpdateTime 人员库修改时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "LibraryId", this.LibraryId);
        this.setParamSimple(map, prefix + "LibraryName", this.LibraryName);
        this.setParamSimple(map, prefix + "PersonCount", this.PersonCount);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

