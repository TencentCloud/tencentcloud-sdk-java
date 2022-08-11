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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MonitorTypeInfo extends AbstractModel{

    /**
    * 监控类型ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 监控类型
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 排列顺序
    */
    @SerializedName("SortId")
    @Expose
    private Long SortId;

    /**
     * Get 监控类型ID 
     * @return Id 监控类型ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 监控类型ID
     * @param Id 监控类型ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 监控类型 
     * @return Name 监控类型
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 监控类型
     * @param Name 监控类型
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 排列顺序 
     * @return SortId 排列顺序
     */
    public Long getSortId() {
        return this.SortId;
    }

    /**
     * Set 排列顺序
     * @param SortId 排列顺序
     */
    public void setSortId(Long SortId) {
        this.SortId = SortId;
    }

    public MonitorTypeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MonitorTypeInfo(MonitorTypeInfo source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.SortId != null) {
            this.SortId = new Long(source.SortId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "SortId", this.SortId);

    }
}

