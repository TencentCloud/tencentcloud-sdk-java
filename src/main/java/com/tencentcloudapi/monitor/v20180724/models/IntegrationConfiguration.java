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

public class IntegrationConfiguration extends AbstractModel{

    /**
    * 名字
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 类型
    */
    @SerializedName("Kind")
    @Expose
    private String Kind;

    /**
    * 内容
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 实例类型
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * 实例描述
    */
    @SerializedName("InstanceDesc")
    @Expose
    private String InstanceDesc;

    /**
    * dashboard 的 URL
    */
    @SerializedName("GrafanaDashboardURL")
    @Expose
    private String GrafanaDashboardURL;

    /**
     * Get 名字 
     * @return Name 名字
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名字
     * @param Name 名字
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 类型 
     * @return Kind 类型
     */
    public String getKind() {
        return this.Kind;
    }

    /**
     * Set 类型
     * @param Kind 类型
     */
    public void setKind(String Kind) {
        this.Kind = Kind;
    }

    /**
     * Get 内容 
     * @return Content 内容
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 内容
     * @param Content 内容
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 状态 
     * @return Status 状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
     * @param Status 状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 实例类型 
     * @return Category 实例类型
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set 实例类型
     * @param Category 实例类型
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get 实例描述 
     * @return InstanceDesc 实例描述
     */
    public String getInstanceDesc() {
        return this.InstanceDesc;
    }

    /**
     * Set 实例描述
     * @param InstanceDesc 实例描述
     */
    public void setInstanceDesc(String InstanceDesc) {
        this.InstanceDesc = InstanceDesc;
    }

    /**
     * Get dashboard 的 URL 
     * @return GrafanaDashboardURL dashboard 的 URL
     */
    public String getGrafanaDashboardURL() {
        return this.GrafanaDashboardURL;
    }

    /**
     * Set dashboard 的 URL
     * @param GrafanaDashboardURL dashboard 的 URL
     */
    public void setGrafanaDashboardURL(String GrafanaDashboardURL) {
        this.GrafanaDashboardURL = GrafanaDashboardURL;
    }

    public IntegrationConfiguration() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IntegrationConfiguration(IntegrationConfiguration source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Kind != null) {
            this.Kind = new String(source.Kind);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.InstanceDesc != null) {
            this.InstanceDesc = new String(source.InstanceDesc);
        }
        if (source.GrafanaDashboardURL != null) {
            this.GrafanaDashboardURL = new String(source.GrafanaDashboardURL);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Kind", this.Kind);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "InstanceDesc", this.InstanceDesc);
        this.setParamSimple(map, prefix + "GrafanaDashboardURL", this.GrafanaDashboardURL);

    }
}

