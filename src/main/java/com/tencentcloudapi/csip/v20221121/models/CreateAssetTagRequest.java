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

public class CreateAssetTagRequest extends AbstractModel {

    /**
    * <p>标签键</p>
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * <p>标签值</p>
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>颜色</p>
    */
    @SerializedName("Color")
    @Expose
    private String Color;

    /**
    * <p>描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>打标策略</p>
    */
    @SerializedName("TaggingRule")
    @Expose
    private String TaggingRule;

    /**
    * <p>是否立即执行资产打标</p>
    */
    @SerializedName("ApplyNow")
    @Expose
    private Boolean ApplyNow;

    /**
     * Get <p>标签键</p> 
     * @return Key <p>标签键</p>
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set <p>标签键</p>
     * @param Key <p>标签键</p>
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get <p>标签值</p> 
     * @return Value <p>标签值</p>
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set <p>标签值</p>
     * @param Value <p>标签值</p>
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get <p>集团账号的成员id</p> 
     * @return MemberId <p>集团账号的成员id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>集团账号的成员id</p>
     * @param MemberId <p>集团账号的成员id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>颜色</p> 
     * @return Color <p>颜色</p>
     */
    public String getColor() {
        return this.Color;
    }

    /**
     * Set <p>颜色</p>
     * @param Color <p>颜色</p>
     */
    public void setColor(String Color) {
        this.Color = Color;
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
     * Get <p>打标策略</p> 
     * @return TaggingRule <p>打标策略</p>
     */
    public String getTaggingRule() {
        return this.TaggingRule;
    }

    /**
     * Set <p>打标策略</p>
     * @param TaggingRule <p>打标策略</p>
     */
    public void setTaggingRule(String TaggingRule) {
        this.TaggingRule = TaggingRule;
    }

    /**
     * Get <p>是否立即执行资产打标</p> 
     * @return ApplyNow <p>是否立即执行资产打标</p>
     */
    public Boolean getApplyNow() {
        return this.ApplyNow;
    }

    /**
     * Set <p>是否立即执行资产打标</p>
     * @param ApplyNow <p>是否立即执行资产打标</p>
     */
    public void setApplyNow(Boolean ApplyNow) {
        this.ApplyNow = ApplyNow;
    }

    public CreateAssetTagRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAssetTagRequest(CreateAssetTagRequest source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Color != null) {
            this.Color = new String(source.Color);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.TaggingRule != null) {
            this.TaggingRule = new String(source.TaggingRule);
        }
        if (source.ApplyNow != null) {
            this.ApplyNow = new Boolean(source.ApplyNow);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "Color", this.Color);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "TaggingRule", this.TaggingRule);
        this.setParamSimple(map, prefix + "ApplyNow", this.ApplyNow);

    }
}

