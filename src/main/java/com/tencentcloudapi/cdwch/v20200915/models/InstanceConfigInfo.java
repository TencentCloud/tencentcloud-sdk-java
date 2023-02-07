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
package com.tencentcloudapi.cdwch.v20200915.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceConfigInfo extends AbstractModel{

    /**
    * 配置项名称
    */
    @SerializedName("ConfKey")
    @Expose
    private String ConfKey;

    /**
    * 配置项内容
    */
    @SerializedName("ConfValue")
    @Expose
    private String ConfValue;

    /**
    * 默认值
    */
    @SerializedName("DefaultValue")
    @Expose
    private String DefaultValue;

    /**
    * 是否需要重启
    */
    @SerializedName("NeedRestart")
    @Expose
    private Boolean NeedRestart;

    /**
    * 是否可编辑
    */
    @SerializedName("Editable")
    @Expose
    private Boolean Editable;

    /**
    * 配置项解释
    */
    @SerializedName("ConfDesc")
    @Expose
    private String ConfDesc;

    /**
    * 文件名称
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 规则名称类型
    */
    @SerializedName("ModifyRuleType")
    @Expose
    private String ModifyRuleType;

    /**
    * 规则名称内容
    */
    @SerializedName("ModifyRuleValue")
    @Expose
    private String ModifyRuleValue;

    /**
    * 修改人的uin
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 修改时间
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
     * Get 配置项名称 
     * @return ConfKey 配置项名称
     */
    public String getConfKey() {
        return this.ConfKey;
    }

    /**
     * Set 配置项名称
     * @param ConfKey 配置项名称
     */
    public void setConfKey(String ConfKey) {
        this.ConfKey = ConfKey;
    }

    /**
     * Get 配置项内容 
     * @return ConfValue 配置项内容
     */
    public String getConfValue() {
        return this.ConfValue;
    }

    /**
     * Set 配置项内容
     * @param ConfValue 配置项内容
     */
    public void setConfValue(String ConfValue) {
        this.ConfValue = ConfValue;
    }

    /**
     * Get 默认值 
     * @return DefaultValue 默认值
     */
    public String getDefaultValue() {
        return this.DefaultValue;
    }

    /**
     * Set 默认值
     * @param DefaultValue 默认值
     */
    public void setDefaultValue(String DefaultValue) {
        this.DefaultValue = DefaultValue;
    }

    /**
     * Get 是否需要重启 
     * @return NeedRestart 是否需要重启
     */
    public Boolean getNeedRestart() {
        return this.NeedRestart;
    }

    /**
     * Set 是否需要重启
     * @param NeedRestart 是否需要重启
     */
    public void setNeedRestart(Boolean NeedRestart) {
        this.NeedRestart = NeedRestart;
    }

    /**
     * Get 是否可编辑 
     * @return Editable 是否可编辑
     */
    public Boolean getEditable() {
        return this.Editable;
    }

    /**
     * Set 是否可编辑
     * @param Editable 是否可编辑
     */
    public void setEditable(Boolean Editable) {
        this.Editable = Editable;
    }

    /**
     * Get 配置项解释 
     * @return ConfDesc 配置项解释
     */
    public String getConfDesc() {
        return this.ConfDesc;
    }

    /**
     * Set 配置项解释
     * @param ConfDesc 配置项解释
     */
    public void setConfDesc(String ConfDesc) {
        this.ConfDesc = ConfDesc;
    }

    /**
     * Get 文件名称 
     * @return FileName 文件名称
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 文件名称
     * @param FileName 文件名称
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 规则名称类型 
     * @return ModifyRuleType 规则名称类型
     */
    public String getModifyRuleType() {
        return this.ModifyRuleType;
    }

    /**
     * Set 规则名称类型
     * @param ModifyRuleType 规则名称类型
     */
    public void setModifyRuleType(String ModifyRuleType) {
        this.ModifyRuleType = ModifyRuleType;
    }

    /**
     * Get 规则名称内容 
     * @return ModifyRuleValue 规则名称内容
     */
    public String getModifyRuleValue() {
        return this.ModifyRuleValue;
    }

    /**
     * Set 规则名称内容
     * @param ModifyRuleValue 规则名称内容
     */
    public void setModifyRuleValue(String ModifyRuleValue) {
        this.ModifyRuleValue = ModifyRuleValue;
    }

    /**
     * Get 修改人的uin 
     * @return Uin 修改人的uin
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 修改人的uin
     * @param Uin 修改人的uin
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 修改时间 
     * @return ModifyTime 修改时间
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 修改时间
     * @param ModifyTime 修改时间
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    public InstanceConfigInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceConfigInfo(InstanceConfigInfo source) {
        if (source.ConfKey != null) {
            this.ConfKey = new String(source.ConfKey);
        }
        if (source.ConfValue != null) {
            this.ConfValue = new String(source.ConfValue);
        }
        if (source.DefaultValue != null) {
            this.DefaultValue = new String(source.DefaultValue);
        }
        if (source.NeedRestart != null) {
            this.NeedRestart = new Boolean(source.NeedRestart);
        }
        if (source.Editable != null) {
            this.Editable = new Boolean(source.Editable);
        }
        if (source.ConfDesc != null) {
            this.ConfDesc = new String(source.ConfDesc);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.ModifyRuleType != null) {
            this.ModifyRuleType = new String(source.ModifyRuleType);
        }
        if (source.ModifyRuleValue != null) {
            this.ModifyRuleValue = new String(source.ModifyRuleValue);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConfKey", this.ConfKey);
        this.setParamSimple(map, prefix + "ConfValue", this.ConfValue);
        this.setParamSimple(map, prefix + "DefaultValue", this.DefaultValue);
        this.setParamSimple(map, prefix + "NeedRestart", this.NeedRestart);
        this.setParamSimple(map, prefix + "Editable", this.Editable);
        this.setParamSimple(map, prefix + "ConfDesc", this.ConfDesc);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "ModifyRuleType", this.ModifyRuleType);
        this.setParamSimple(map, prefix + "ModifyRuleValue", this.ModifyRuleValue);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);

    }
}

