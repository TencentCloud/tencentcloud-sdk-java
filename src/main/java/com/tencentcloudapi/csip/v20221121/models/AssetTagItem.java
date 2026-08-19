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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssetTagItem extends AbstractModel {

    /**
    * <p>标签ID</p>
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * <p>appid</p>
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
    * <p>标签键</p>
    */
    @SerializedName("TagKey")
    @Expose
    private String TagKey;

    /**
    * <p>标签值</p>
    */
    @SerializedName("TagValue")
    @Expose
    private String TagValue;

    /**
    * <p>描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>自动打标策略</p>
    */
    @SerializedName("TaggingRule")
    @Expose
    private String TaggingRule;

    /**
    * <p>标签颜色</p>
    */
    @SerializedName("Color")
    @Expose
    private String Color;

    /**
    * <p>标签绑定的资产数量</p>
    */
    @SerializedName("AssetCount")
    @Expose
    private Long AssetCount;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>更新时间</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get <p>标签ID</p> 
     * @return ID <p>标签ID</p>
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set <p>标签ID</p>
     * @param ID <p>标签ID</p>
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get <p>appid</p> 
     * @return AppID <p>appid</p>
     */
    public Long getAppID() {
        return this.AppID;
    }

    /**
     * Set <p>appid</p>
     * @param AppID <p>appid</p>
     */
    public void setAppID(Long AppID) {
        this.AppID = AppID;
    }

    /**
     * Get <p>标签键</p> 
     * @return TagKey <p>标签键</p>
     */
    public String getTagKey() {
        return this.TagKey;
    }

    /**
     * Set <p>标签键</p>
     * @param TagKey <p>标签键</p>
     */
    public void setTagKey(String TagKey) {
        this.TagKey = TagKey;
    }

    /**
     * Get <p>标签值</p> 
     * @return TagValue <p>标签值</p>
     */
    public String getTagValue() {
        return this.TagValue;
    }

    /**
     * Set <p>标签值</p>
     * @param TagValue <p>标签值</p>
     */
    public void setTagValue(String TagValue) {
        this.TagValue = TagValue;
    }

    /**
     * Get <p>描述</p> 
     * @return Description <p>描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述</p>
     * @param Description <p>描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>自动打标策略</p> 
     * @return TaggingRule <p>自动打标策略</p>
     */
    public String getTaggingRule() {
        return this.TaggingRule;
    }

    /**
     * Set <p>自动打标策略</p>
     * @param TaggingRule <p>自动打标策略</p>
     */
    public void setTaggingRule(String TaggingRule) {
        this.TaggingRule = TaggingRule;
    }

    /**
     * Get <p>标签颜色</p> 
     * @return Color <p>标签颜色</p>
     */
    public String getColor() {
        return this.Color;
    }

    /**
     * Set <p>标签颜色</p>
     * @param Color <p>标签颜色</p>
     */
    public void setColor(String Color) {
        this.Color = Color;
    }

    /**
     * Get <p>标签绑定的资产数量</p> 
     * @return AssetCount <p>标签绑定的资产数量</p>
     */
    public Long getAssetCount() {
        return this.AssetCount;
    }

    /**
     * Set <p>标签绑定的资产数量</p>
     * @param AssetCount <p>标签绑定的资产数量</p>
     */
    public void setAssetCount(Long AssetCount) {
        this.AssetCount = AssetCount;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreateTime <p>创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateTime <p>创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>更新时间</p> 
     * @return UpdateTime <p>更新时间</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间</p>
     * @param UpdateTime <p>更新时间</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public AssetTagItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetTagItem(AssetTagItem source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
        if (source.TagKey != null) {
            this.TagKey = new String(source.TagKey);
        }
        if (source.TagValue != null) {
            this.TagValue = new String(source.TagValue);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.TaggingRule != null) {
            this.TaggingRule = new String(source.TaggingRule);
        }
        if (source.Color != null) {
            this.Color = new String(source.Color);
        }
        if (source.AssetCount != null) {
            this.AssetCount = new Long(source.AssetCount);
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
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "TagKey", this.TagKey);
        this.setParamSimple(map, prefix + "TagValue", this.TagValue);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "TaggingRule", this.TaggingRule);
        this.setParamSimple(map, prefix + "Color", this.Color);
        this.setParamSimple(map, prefix + "AssetCount", this.AssetCount);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

