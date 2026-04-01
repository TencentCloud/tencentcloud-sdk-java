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
package com.tencentcloudapi.cdwch.v20200915.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceConfigInfo extends AbstractModel {

    /**
    * <p>配置项名称</p>
    */
    @SerializedName("ConfKey")
    @Expose
    private String ConfKey;

    /**
    * <p>配置项内容</p>
    */
    @SerializedName("ConfValue")
    @Expose
    private String ConfValue;

    /**
    * <p>默认值</p>
    */
    @SerializedName("DefaultValue")
    @Expose
    private String DefaultValue;

    /**
    * <p>是否需要重启</p>
    */
    @SerializedName("NeedRestart")
    @Expose
    private Boolean NeedRestart;

    /**
    * <p>是否可编辑</p>
    */
    @SerializedName("Editable")
    @Expose
    private Boolean Editable;

    /**
    * <p>配置项解释</p>
    */
    @SerializedName("ConfDesc")
    @Expose
    private String ConfDesc;

    /**
    * <p>文件名称</p>
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * <p>规则名称类型</p>
    */
    @SerializedName("ModifyRuleType")
    @Expose
    private String ModifyRuleType;

    /**
    * <p>规则名称内容</p>
    */
    @SerializedName("ModifyRuleValue")
    @Expose
    private String ModifyRuleValue;

    /**
    * <p>修改人的uin</p>
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * <p>修改时间</p>
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * <p>取值范围</p>
    */
    @SerializedName("ValueRange")
    @Expose
    private String ValueRange;

    /**
    * <p>标记异常</p>
    */
    @SerializedName("AbnormalParam")
    @Expose
    private String AbnormalParam;

    /**
     * Get <p>配置项名称</p> 
     * @return ConfKey <p>配置项名称</p>
     */
    public String getConfKey() {
        return this.ConfKey;
    }

    /**
     * Set <p>配置项名称</p>
     * @param ConfKey <p>配置项名称</p>
     */
    public void setConfKey(String ConfKey) {
        this.ConfKey = ConfKey;
    }

    /**
     * Get <p>配置项内容</p> 
     * @return ConfValue <p>配置项内容</p>
     */
    public String getConfValue() {
        return this.ConfValue;
    }

    /**
     * Set <p>配置项内容</p>
     * @param ConfValue <p>配置项内容</p>
     */
    public void setConfValue(String ConfValue) {
        this.ConfValue = ConfValue;
    }

    /**
     * Get <p>默认值</p> 
     * @return DefaultValue <p>默认值</p>
     */
    public String getDefaultValue() {
        return this.DefaultValue;
    }

    /**
     * Set <p>默认值</p>
     * @param DefaultValue <p>默认值</p>
     */
    public void setDefaultValue(String DefaultValue) {
        this.DefaultValue = DefaultValue;
    }

    /**
     * Get <p>是否需要重启</p> 
     * @return NeedRestart <p>是否需要重启</p>
     */
    public Boolean getNeedRestart() {
        return this.NeedRestart;
    }

    /**
     * Set <p>是否需要重启</p>
     * @param NeedRestart <p>是否需要重启</p>
     */
    public void setNeedRestart(Boolean NeedRestart) {
        this.NeedRestart = NeedRestart;
    }

    /**
     * Get <p>是否可编辑</p> 
     * @return Editable <p>是否可编辑</p>
     */
    public Boolean getEditable() {
        return this.Editable;
    }

    /**
     * Set <p>是否可编辑</p>
     * @param Editable <p>是否可编辑</p>
     */
    public void setEditable(Boolean Editable) {
        this.Editable = Editable;
    }

    /**
     * Get <p>配置项解释</p> 
     * @return ConfDesc <p>配置项解释</p>
     */
    public String getConfDesc() {
        return this.ConfDesc;
    }

    /**
     * Set <p>配置项解释</p>
     * @param ConfDesc <p>配置项解释</p>
     */
    public void setConfDesc(String ConfDesc) {
        this.ConfDesc = ConfDesc;
    }

    /**
     * Get <p>文件名称</p> 
     * @return FileName <p>文件名称</p>
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set <p>文件名称</p>
     * @param FileName <p>文件名称</p>
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get <p>规则名称类型</p> 
     * @return ModifyRuleType <p>规则名称类型</p>
     */
    public String getModifyRuleType() {
        return this.ModifyRuleType;
    }

    /**
     * Set <p>规则名称类型</p>
     * @param ModifyRuleType <p>规则名称类型</p>
     */
    public void setModifyRuleType(String ModifyRuleType) {
        this.ModifyRuleType = ModifyRuleType;
    }

    /**
     * Get <p>规则名称内容</p> 
     * @return ModifyRuleValue <p>规则名称内容</p>
     */
    public String getModifyRuleValue() {
        return this.ModifyRuleValue;
    }

    /**
     * Set <p>规则名称内容</p>
     * @param ModifyRuleValue <p>规则名称内容</p>
     */
    public void setModifyRuleValue(String ModifyRuleValue) {
        this.ModifyRuleValue = ModifyRuleValue;
    }

    /**
     * Get <p>修改人的uin</p> 
     * @return Uin <p>修改人的uin</p>
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set <p>修改人的uin</p>
     * @param Uin <p>修改人的uin</p>
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get <p>修改时间</p> 
     * @return ModifyTime <p>修改时间</p>
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set <p>修改时间</p>
     * @param ModifyTime <p>修改时间</p>
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get <p>取值范围</p> 
     * @return ValueRange <p>取值范围</p>
     */
    public String getValueRange() {
        return this.ValueRange;
    }

    /**
     * Set <p>取值范围</p>
     * @param ValueRange <p>取值范围</p>
     */
    public void setValueRange(String ValueRange) {
        this.ValueRange = ValueRange;
    }

    /**
     * Get <p>标记异常</p> 
     * @return AbnormalParam <p>标记异常</p>
     */
    public String getAbnormalParam() {
        return this.AbnormalParam;
    }

    /**
     * Set <p>标记异常</p>
     * @param AbnormalParam <p>标记异常</p>
     */
    public void setAbnormalParam(String AbnormalParam) {
        this.AbnormalParam = AbnormalParam;
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
        if (source.ValueRange != null) {
            this.ValueRange = new String(source.ValueRange);
        }
        if (source.AbnormalParam != null) {
            this.AbnormalParam = new String(source.AbnormalParam);
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
        this.setParamSimple(map, prefix + "ValueRange", this.ValueRange);
        this.setParamSimple(map, prefix + "AbnormalParam", this.AbnormalParam);

    }
}

