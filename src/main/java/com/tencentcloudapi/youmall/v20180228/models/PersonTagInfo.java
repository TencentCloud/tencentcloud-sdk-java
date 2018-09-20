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
package com.tencentcloudapi.youmall.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PersonTagInfo  extends AbstractModel{

    /**
    * 顾客原类型
    */
    @SerializedName("OldType")
    @Expose
    private Integer OldType;

    /**
    * 顾客新类型
    */
    @SerializedName("NewType")
    @Expose
    private Integer NewType;

    /**
    * 顾客face id
    */
    @SerializedName("PersonId")
    @Expose
    private Integer PersonId;

    /**
     * 获取顾客原类型
     * @return OldType 顾客原类型
     */
    public Integer getOldType() {
        return this.OldType;
    }

    /**
     * 设置顾客原类型
     * @param OldType 顾客原类型
     */
    public void setOldType(Integer OldType) {
        this.OldType = OldType;
    }

    /**
     * 获取顾客新类型
     * @return NewType 顾客新类型
     */
    public Integer getNewType() {
        return this.NewType;
    }

    /**
     * 设置顾客新类型
     * @param NewType 顾客新类型
     */
    public void setNewType(Integer NewType) {
        this.NewType = NewType;
    }

    /**
     * 获取顾客face id
     * @return PersonId 顾客face id
     */
    public Integer getPersonId() {
        return this.PersonId;
    }

    /**
     * 设置顾客face id
     * @param PersonId 顾客face id
     */
    public void setPersonId(Integer PersonId) {
        this.PersonId = PersonId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OldType", this.OldType);
        this.setParamSimple(map, prefix + "NewType", this.NewType);
        this.setParamSimple(map, prefix + "PersonId", this.PersonId);

    }
}

