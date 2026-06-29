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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IntegrationConfiguration extends AbstractModel {

    /**
    * <p>名字</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>类型</p>
    */
    @SerializedName("Kind")
    @Expose
    private String Kind;

    /**
    * <p>内容</p>
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * <p>状态</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>实例类型</p>
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * <p>实例描述</p>
    */
    @SerializedName("InstanceDesc")
    @Expose
    private String InstanceDesc;

    /**
    * <p>dashboard 的 URL</p>
    */
    @SerializedName("GrafanaDashboardURL")
    @Expose
    private String GrafanaDashboardURL;

    /**
     * Get <p>名字</p> 
     * @return Name <p>名字</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>名字</p>
     * @param Name <p>名字</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>类型</p> 
     * @return Kind <p>类型</p>
     */
    public String getKind() {
        return this.Kind;
    }

    /**
     * Set <p>类型</p>
     * @param Kind <p>类型</p>
     */
    public void setKind(String Kind) {
        this.Kind = Kind;
    }

    /**
     * Get <p>内容</p> 
     * @return Content <p>内容</p>
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set <p>内容</p>
     * @param Content <p>内容</p>
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get <p>状态</p> 
     * @return Status <p>状态</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态</p>
     * @param Status <p>状态</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>实例类型</p> 
     * @return Category <p>实例类型</p>
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set <p>实例类型</p>
     * @param Category <p>实例类型</p>
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get <p>实例描述</p> 
     * @return InstanceDesc <p>实例描述</p>
     */
    public String getInstanceDesc() {
        return this.InstanceDesc;
    }

    /**
     * Set <p>实例描述</p>
     * @param InstanceDesc <p>实例描述</p>
     */
    public void setInstanceDesc(String InstanceDesc) {
        this.InstanceDesc = InstanceDesc;
    }

    /**
     * Get <p>dashboard 的 URL</p> 
     * @return GrafanaDashboardURL <p>dashboard 的 URL</p>
     */
    public String getGrafanaDashboardURL() {
        return this.GrafanaDashboardURL;
    }

    /**
     * Set <p>dashboard 的 URL</p>
     * @param GrafanaDashboardURL <p>dashboard 的 URL</p>
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

