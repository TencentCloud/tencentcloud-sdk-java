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
package com.tencentcloudapi.ioa.v20220601.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProfileFieldItem extends AbstractModel {

    /**
    * <p>键值id</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>排序key(只支持32位)</p>
    */
    @SerializedName("Key")
    @Expose
    private Long Key;

    /**
    * <p>名称</p>
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * <p>输入类型(只支持32位)</p>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>是否必选(只支持32位)</p>
    */
    @SerializedName("IsMust")
    @Expose
    private Long IsMust;

    /**
    * <p>是否显示(只支持32位)</p>
    */
    @SerializedName("IsShow")
    @Expose
    private Long IsShow;

    /**
    * <p>是否自定义(只支持32位)</p>
    */
    @SerializedName("IsCustom")
    @Expose
    private Long IsCustom;

    /**
    * <p>下一个选项key(只支持32位)</p>
    */
    @SerializedName("NextOptionKey")
    @Expose
    private Long NextOptionKey;

    /**
    * <p>选项数据</p>
    */
    @SerializedName("Options")
    @Expose
    private String Options;

    /**
    * <p>是否覆盖(只支持32位)</p>
    */
    @SerializedName("IsReplace")
    @Expose
    private Long IsReplace;

    /**
    * <p>是否可以修改分组</p>
    */
    @SerializedName("GroupEditable")
    @Expose
    private Boolean GroupEditable;

    /**
    * <p>是否有规则</p>
    */
    @SerializedName("HasRules")
    @Expose
    private Boolean HasRules;

    /**
    * <p>规则id</p>
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * <p>名称-英文</p>
    */
    @SerializedName("TitleEn")
    @Expose
    private String TitleEn;

    /**
    * <p>选项数据-英文</p>
    */
    @SerializedName("OptionsEn")
    @Expose
    private String OptionsEn;

    /**
    * <p>选项数据(包含中英文)</p>
    */
    @SerializedName("OptionsItem")
    @Expose
    private OptionsItem [] OptionsItem;

    /**
     * Get <p>键值id</p> 
     * @return Id <p>键值id</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>键值id</p>
     * @param Id <p>键值id</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>排序key(只支持32位)</p> 
     * @return Key <p>排序key(只支持32位)</p>
     */
    public Long getKey() {
        return this.Key;
    }

    /**
     * Set <p>排序key(只支持32位)</p>
     * @param Key <p>排序key(只支持32位)</p>
     */
    public void setKey(Long Key) {
        this.Key = Key;
    }

    /**
     * Get <p>名称</p> 
     * @return Title <p>名称</p>
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set <p>名称</p>
     * @param Title <p>名称</p>
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get <p>输入类型(只支持32位)</p> 
     * @return Type <p>输入类型(只支持32位)</p>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>输入类型(只支持32位)</p>
     * @param Type <p>输入类型(只支持32位)</p>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>是否必选(只支持32位)</p> 
     * @return IsMust <p>是否必选(只支持32位)</p>
     */
    public Long getIsMust() {
        return this.IsMust;
    }

    /**
     * Set <p>是否必选(只支持32位)</p>
     * @param IsMust <p>是否必选(只支持32位)</p>
     */
    public void setIsMust(Long IsMust) {
        this.IsMust = IsMust;
    }

    /**
     * Get <p>是否显示(只支持32位)</p> 
     * @return IsShow <p>是否显示(只支持32位)</p>
     */
    public Long getIsShow() {
        return this.IsShow;
    }

    /**
     * Set <p>是否显示(只支持32位)</p>
     * @param IsShow <p>是否显示(只支持32位)</p>
     */
    public void setIsShow(Long IsShow) {
        this.IsShow = IsShow;
    }

    /**
     * Get <p>是否自定义(只支持32位)</p> 
     * @return IsCustom <p>是否自定义(只支持32位)</p>
     */
    public Long getIsCustom() {
        return this.IsCustom;
    }

    /**
     * Set <p>是否自定义(只支持32位)</p>
     * @param IsCustom <p>是否自定义(只支持32位)</p>
     */
    public void setIsCustom(Long IsCustom) {
        this.IsCustom = IsCustom;
    }

    /**
     * Get <p>下一个选项key(只支持32位)</p> 
     * @return NextOptionKey <p>下一个选项key(只支持32位)</p>
     */
    public Long getNextOptionKey() {
        return this.NextOptionKey;
    }

    /**
     * Set <p>下一个选项key(只支持32位)</p>
     * @param NextOptionKey <p>下一个选项key(只支持32位)</p>
     */
    public void setNextOptionKey(Long NextOptionKey) {
        this.NextOptionKey = NextOptionKey;
    }

    /**
     * Get <p>选项数据</p> 
     * @return Options <p>选项数据</p>
     */
    public String getOptions() {
        return this.Options;
    }

    /**
     * Set <p>选项数据</p>
     * @param Options <p>选项数据</p>
     */
    public void setOptions(String Options) {
        this.Options = Options;
    }

    /**
     * Get <p>是否覆盖(只支持32位)</p> 
     * @return IsReplace <p>是否覆盖(只支持32位)</p>
     */
    public Long getIsReplace() {
        return this.IsReplace;
    }

    /**
     * Set <p>是否覆盖(只支持32位)</p>
     * @param IsReplace <p>是否覆盖(只支持32位)</p>
     */
    public void setIsReplace(Long IsReplace) {
        this.IsReplace = IsReplace;
    }

    /**
     * Get <p>是否可以修改分组</p> 
     * @return GroupEditable <p>是否可以修改分组</p>
     */
    public Boolean getGroupEditable() {
        return this.GroupEditable;
    }

    /**
     * Set <p>是否可以修改分组</p>
     * @param GroupEditable <p>是否可以修改分组</p>
     */
    public void setGroupEditable(Boolean GroupEditable) {
        this.GroupEditable = GroupEditable;
    }

    /**
     * Get <p>是否有规则</p> 
     * @return HasRules <p>是否有规则</p>
     */
    public Boolean getHasRules() {
        return this.HasRules;
    }

    /**
     * Set <p>是否有规则</p>
     * @param HasRules <p>是否有规则</p>
     */
    public void setHasRules(Boolean HasRules) {
        this.HasRules = HasRules;
    }

    /**
     * Get <p>规则id</p> 
     * @return RuleId <p>规则id</p>
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set <p>规则id</p>
     * @param RuleId <p>规则id</p>
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get <p>名称-英文</p> 
     * @return TitleEn <p>名称-英文</p>
     */
    public String getTitleEn() {
        return this.TitleEn;
    }

    /**
     * Set <p>名称-英文</p>
     * @param TitleEn <p>名称-英文</p>
     */
    public void setTitleEn(String TitleEn) {
        this.TitleEn = TitleEn;
    }

    /**
     * Get <p>选项数据-英文</p> 
     * @return OptionsEn <p>选项数据-英文</p>
     */
    public String getOptionsEn() {
        return this.OptionsEn;
    }

    /**
     * Set <p>选项数据-英文</p>
     * @param OptionsEn <p>选项数据-英文</p>
     */
    public void setOptionsEn(String OptionsEn) {
        this.OptionsEn = OptionsEn;
    }

    /**
     * Get <p>选项数据(包含中英文)</p> 
     * @return OptionsItem <p>选项数据(包含中英文)</p>
     */
    public OptionsItem [] getOptionsItem() {
        return this.OptionsItem;
    }

    /**
     * Set <p>选项数据(包含中英文)</p>
     * @param OptionsItem <p>选项数据(包含中英文)</p>
     */
    public void setOptionsItem(OptionsItem [] OptionsItem) {
        this.OptionsItem = OptionsItem;
    }

    public ProfileFieldItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProfileFieldItem(ProfileFieldItem source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Key != null) {
            this.Key = new Long(source.Key);
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.IsMust != null) {
            this.IsMust = new Long(source.IsMust);
        }
        if (source.IsShow != null) {
            this.IsShow = new Long(source.IsShow);
        }
        if (source.IsCustom != null) {
            this.IsCustom = new Long(source.IsCustom);
        }
        if (source.NextOptionKey != null) {
            this.NextOptionKey = new Long(source.NextOptionKey);
        }
        if (source.Options != null) {
            this.Options = new String(source.Options);
        }
        if (source.IsReplace != null) {
            this.IsReplace = new Long(source.IsReplace);
        }
        if (source.GroupEditable != null) {
            this.GroupEditable = new Boolean(source.GroupEditable);
        }
        if (source.HasRules != null) {
            this.HasRules = new Boolean(source.HasRules);
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.TitleEn != null) {
            this.TitleEn = new String(source.TitleEn);
        }
        if (source.OptionsEn != null) {
            this.OptionsEn = new String(source.OptionsEn);
        }
        if (source.OptionsItem != null) {
            this.OptionsItem = new OptionsItem[source.OptionsItem.length];
            for (int i = 0; i < source.OptionsItem.length; i++) {
                this.OptionsItem[i] = new OptionsItem(source.OptionsItem[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "IsMust", this.IsMust);
        this.setParamSimple(map, prefix + "IsShow", this.IsShow);
        this.setParamSimple(map, prefix + "IsCustom", this.IsCustom);
        this.setParamSimple(map, prefix + "NextOptionKey", this.NextOptionKey);
        this.setParamSimple(map, prefix + "Options", this.Options);
        this.setParamSimple(map, prefix + "IsReplace", this.IsReplace);
        this.setParamSimple(map, prefix + "GroupEditable", this.GroupEditable);
        this.setParamSimple(map, prefix + "HasRules", this.HasRules);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "TitleEn", this.TitleEn);
        this.setParamSimple(map, prefix + "OptionsEn", this.OptionsEn);
        this.setParamArrayObj(map, prefix + "OptionsItem.", this.OptionsItem);

    }
}

