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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DutyScheduleData extends AbstractModel {

    /**
    * 值班表Id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 值班表名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 创建人
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
     * Get 值班表Id 
     * @return Id 值班表Id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 值班表Id
     * @param Id 值班表Id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 值班表名称 
     * @return Name 值班表名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 值班表名称
     * @param Name 值班表名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 创建人 
     * @return Creator 创建人
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set 创建人
     * @param Creator 创建人
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    public DutyScheduleData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DutyScheduleData(DutyScheduleData source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Creator", this.Creator);

    }
}

