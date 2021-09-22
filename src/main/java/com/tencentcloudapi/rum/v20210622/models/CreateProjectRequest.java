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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateProjectRequest extends AbstractModel{

    /**
    * 创建的项目名(不为空且最长为 200)
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 业务系统 ID
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * 项目抽样率(大于等于 0)
    */
    @SerializedName("Rate")
    @Expose
    private String Rate;

    /**
    * 是否开启聚类
    */
    @SerializedName("EnableURLGroup")
    @Expose
    private Long EnableURLGroup;

    /**
    * 项目类型("web", "mp", "android", "ios", "node", "hippy", "weex", "viola", "rn")
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 项目对应仓库地址(可选，最长为 256)
    */
    @SerializedName("Repo")
    @Expose
    private String Repo;

    /**
    * 项目对应网页地址(可选，最长为 256)
    */
    @SerializedName("URL")
    @Expose
    private String URL;

    /**
    * 创建的项目描述(可选，最长为 1000)
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
     * Get 创建的项目名(不为空且最长为 200) 
     * @return Name 创建的项目名(不为空且最长为 200)
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 创建的项目名(不为空且最长为 200)
     * @param Name 创建的项目名(不为空且最长为 200)
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 业务系统 ID 
     * @return InstanceID 业务系统 ID
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set 业务系统 ID
     * @param InstanceID 业务系统 ID
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get 项目抽样率(大于等于 0) 
     * @return Rate 项目抽样率(大于等于 0)
     */
    public String getRate() {
        return this.Rate;
    }

    /**
     * Set 项目抽样率(大于等于 0)
     * @param Rate 项目抽样率(大于等于 0)
     */
    public void setRate(String Rate) {
        this.Rate = Rate;
    }

    /**
     * Get 是否开启聚类 
     * @return EnableURLGroup 是否开启聚类
     */
    public Long getEnableURLGroup() {
        return this.EnableURLGroup;
    }

    /**
     * Set 是否开启聚类
     * @param EnableURLGroup 是否开启聚类
     */
    public void setEnableURLGroup(Long EnableURLGroup) {
        this.EnableURLGroup = EnableURLGroup;
    }

    /**
     * Get 项目类型("web", "mp", "android", "ios", "node", "hippy", "weex", "viola", "rn") 
     * @return Type 项目类型("web", "mp", "android", "ios", "node", "hippy", "weex", "viola", "rn")
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 项目类型("web", "mp", "android", "ios", "node", "hippy", "weex", "viola", "rn")
     * @param Type 项目类型("web", "mp", "android", "ios", "node", "hippy", "weex", "viola", "rn")
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 项目对应仓库地址(可选，最长为 256) 
     * @return Repo 项目对应仓库地址(可选，最长为 256)
     */
    public String getRepo() {
        return this.Repo;
    }

    /**
     * Set 项目对应仓库地址(可选，最长为 256)
     * @param Repo 项目对应仓库地址(可选，最长为 256)
     */
    public void setRepo(String Repo) {
        this.Repo = Repo;
    }

    /**
     * Get 项目对应网页地址(可选，最长为 256) 
     * @return URL 项目对应网页地址(可选，最长为 256)
     */
    public String getURL() {
        return this.URL;
    }

    /**
     * Set 项目对应网页地址(可选，最长为 256)
     * @param URL 项目对应网页地址(可选，最长为 256)
     */
    public void setURL(String URL) {
        this.URL = URL;
    }

    /**
     * Get 创建的项目描述(可选，最长为 1000) 
     * @return Desc 创建的项目描述(可选，最长为 1000)
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set 创建的项目描述(可选，最长为 1000)
     * @param Desc 创建的项目描述(可选，最长为 1000)
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    public CreateProjectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateProjectRequest(CreateProjectRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.Rate != null) {
            this.Rate = new String(source.Rate);
        }
        if (source.EnableURLGroup != null) {
            this.EnableURLGroup = new Long(source.EnableURLGroup);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Repo != null) {
            this.Repo = new String(source.Repo);
        }
        if (source.URL != null) {
            this.URL = new String(source.URL);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "Rate", this.Rate);
        this.setParamSimple(map, prefix + "EnableURLGroup", this.EnableURLGroup);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Repo", this.Repo);
        this.setParamSimple(map, prefix + "URL", this.URL);
        this.setParamSimple(map, prefix + "Desc", this.Desc);

    }
}

