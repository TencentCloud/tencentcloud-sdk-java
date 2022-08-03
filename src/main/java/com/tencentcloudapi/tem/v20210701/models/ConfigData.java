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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConfigData extends AbstractModel{

    /**
    * 配置名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 关联的服务列表
    */
    @SerializedName("RelatedApplications")
    @Expose
    private TemService [] RelatedApplications;

    /**
    * 配置条目
    */
    @SerializedName("Data")
    @Expose
    private Pair [] Data;

    /**
     * Get 配置名称 
     * @return Name 配置名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 配置名称
     * @param Name 配置名称
     */
    public void setName(String Name) {
        this.Name = Name;
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
     * Get 关联的服务列表 
     * @return RelatedApplications 关联的服务列表
     */
    public TemService [] getRelatedApplications() {
        return this.RelatedApplications;
    }

    /**
     * Set 关联的服务列表
     * @param RelatedApplications 关联的服务列表
     */
    public void setRelatedApplications(TemService [] RelatedApplications) {
        this.RelatedApplications = RelatedApplications;
    }

    /**
     * Get 配置条目 
     * @return Data 配置条目
     */
    public Pair [] getData() {
        return this.Data;
    }

    /**
     * Set 配置条目
     * @param Data 配置条目
     */
    public void setData(Pair [] Data) {
        this.Data = Data;
    }

    public ConfigData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConfigData(ConfigData source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.RelatedApplications != null) {
            this.RelatedApplications = new TemService[source.RelatedApplications.length];
            for (int i = 0; i < source.RelatedApplications.length; i++) {
                this.RelatedApplications[i] = new TemService(source.RelatedApplications[i]);
            }
        }
        if (source.Data != null) {
            this.Data = new Pair[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new Pair(source.Data[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamArrayObj(map, prefix + "RelatedApplications.", this.RelatedApplications);
        this.setParamArrayObj(map, prefix + "Data.", this.Data);

    }
}

