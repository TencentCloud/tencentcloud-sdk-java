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
package com.tencentcloudapi.ags.v20250920.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QuotaGroupOverview extends AbstractModel {

    /**
    * <p>配额组关联的标签键值</p>
    */
    @SerializedName("Tag")
    @Expose
    private Tag Tag;

    /**
    * <p>配额组名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>配额组各资源维度的配额上限</p>
    */
    @SerializedName("Quota")
    @Expose
    private QuotaResourceInfo Quota;

    /**
    * <p>配额组各资源维度的当前用量</p>
    */
    @SerializedName("Usage")
    @Expose
    private QuotaResourceInfo Usage;

    /**
    * <p>创建时间</p><p>参数格式：RFC3339 格式</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>最后更新时间</p><p>参数格式：RFC3339 格式</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get <p>配额组关联的标签键值</p> 
     * @return Tag <p>配额组关联的标签键值</p>
     */
    public Tag getTag() {
        return this.Tag;
    }

    /**
     * Set <p>配额组关联的标签键值</p>
     * @param Tag <p>配额组关联的标签键值</p>
     */
    public void setTag(Tag Tag) {
        this.Tag = Tag;
    }

    /**
     * Get <p>配额组名称</p> 
     * @return Name <p>配额组名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>配额组名称</p>
     * @param Name <p>配额组名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>配额组各资源维度的配额上限</p> 
     * @return Quota <p>配额组各资源维度的配额上限</p>
     */
    public QuotaResourceInfo getQuota() {
        return this.Quota;
    }

    /**
     * Set <p>配额组各资源维度的配额上限</p>
     * @param Quota <p>配额组各资源维度的配额上限</p>
     */
    public void setQuota(QuotaResourceInfo Quota) {
        this.Quota = Quota;
    }

    /**
     * Get <p>配额组各资源维度的当前用量</p> 
     * @return Usage <p>配额组各资源维度的当前用量</p>
     */
    public QuotaResourceInfo getUsage() {
        return this.Usage;
    }

    /**
     * Set <p>配额组各资源维度的当前用量</p>
     * @param Usage <p>配额组各资源维度的当前用量</p>
     */
    public void setUsage(QuotaResourceInfo Usage) {
        this.Usage = Usage;
    }

    /**
     * Get <p>创建时间</p><p>参数格式：RFC3339 格式</p> 
     * @return CreateTime <p>创建时间</p><p>参数格式：RFC3339 格式</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p><p>参数格式：RFC3339 格式</p>
     * @param CreateTime <p>创建时间</p><p>参数格式：RFC3339 格式</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>最后更新时间</p><p>参数格式：RFC3339 格式</p> 
     * @return UpdateTime <p>最后更新时间</p><p>参数格式：RFC3339 格式</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>最后更新时间</p><p>参数格式：RFC3339 格式</p>
     * @param UpdateTime <p>最后更新时间</p><p>参数格式：RFC3339 格式</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public QuotaGroupOverview() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QuotaGroupOverview(QuotaGroupOverview source) {
        if (source.Tag != null) {
            this.Tag = new Tag(source.Tag);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Quota != null) {
            this.Quota = new QuotaResourceInfo(source.Quota);
        }
        if (source.Usage != null) {
            this.Usage = new QuotaResourceInfo(source.Usage);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Tag.", this.Tag);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "Quota.", this.Quota);
        this.setParamObj(map, prefix + "Usage.", this.Usage);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

