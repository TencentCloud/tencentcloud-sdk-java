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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyParameterTemplateRequest extends AbstractModel{

    /**
    * 参数模板ID，用于唯一确认参数模板，不可修改
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * 参数模板名称，长度为1～60个字符，仅支持数字,英文大小写字母、中文以及特殊字符_-./()（）[]+=：:@  注：若该字段为空    ，则保持原参数模板名称
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * 参数模板描述，长度为0～60个字符，仅支持数字,英文大小写字母、中文以及特殊字符_-./()（）[]+=：:@  注：若不传入该参数，则保持原参数模板描述
    */
    @SerializedName("TemplateDescription")
    @Expose
    private String TemplateDescription;

    /**
    * 需要修改或添加的参数集合，注：同一参数不能同时出现在修改添加集合和删除集合中
    */
    @SerializedName("ModifyParamEntrySet")
    @Expose
    private ParamEntry [] ModifyParamEntrySet;

    /**
    * 需要从模板中删除的参数集合，注：同一参数不能同时出现在修改添加集合和删除集合中
    */
    @SerializedName("DeleteParamSet")
    @Expose
    private String [] DeleteParamSet;

    /**
     * Get 参数模板ID，用于唯一确认参数模板，不可修改 
     * @return TemplateId 参数模板ID，用于唯一确认参数模板，不可修改
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 参数模板ID，用于唯一确认参数模板，不可修改
     * @param TemplateId 参数模板ID，用于唯一确认参数模板，不可修改
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 参数模板名称，长度为1～60个字符，仅支持数字,英文大小写字母、中文以及特殊字符_-./()（）[]+=：:@  注：若该字段为空    ，则保持原参数模板名称 
     * @return TemplateName 参数模板名称，长度为1～60个字符，仅支持数字,英文大小写字母、中文以及特殊字符_-./()（）[]+=：:@  注：若该字段为空    ，则保持原参数模板名称
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set 参数模板名称，长度为1～60个字符，仅支持数字,英文大小写字母、中文以及特殊字符_-./()（）[]+=：:@  注：若该字段为空    ，则保持原参数模板名称
     * @param TemplateName 参数模板名称，长度为1～60个字符，仅支持数字,英文大小写字母、中文以及特殊字符_-./()（）[]+=：:@  注：若该字段为空    ，则保持原参数模板名称
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get 参数模板描述，长度为0～60个字符，仅支持数字,英文大小写字母、中文以及特殊字符_-./()（）[]+=：:@  注：若不传入该参数，则保持原参数模板描述 
     * @return TemplateDescription 参数模板描述，长度为0～60个字符，仅支持数字,英文大小写字母、中文以及特殊字符_-./()（）[]+=：:@  注：若不传入该参数，则保持原参数模板描述
     */
    public String getTemplateDescription() {
        return this.TemplateDescription;
    }

    /**
     * Set 参数模板描述，长度为0～60个字符，仅支持数字,英文大小写字母、中文以及特殊字符_-./()（）[]+=：:@  注：若不传入该参数，则保持原参数模板描述
     * @param TemplateDescription 参数模板描述，长度为0～60个字符，仅支持数字,英文大小写字母、中文以及特殊字符_-./()（）[]+=：:@  注：若不传入该参数，则保持原参数模板描述
     */
    public void setTemplateDescription(String TemplateDescription) {
        this.TemplateDescription = TemplateDescription;
    }

    /**
     * Get 需要修改或添加的参数集合，注：同一参数不能同时出现在修改添加集合和删除集合中 
     * @return ModifyParamEntrySet 需要修改或添加的参数集合，注：同一参数不能同时出现在修改添加集合和删除集合中
     */
    public ParamEntry [] getModifyParamEntrySet() {
        return this.ModifyParamEntrySet;
    }

    /**
     * Set 需要修改或添加的参数集合，注：同一参数不能同时出现在修改添加集合和删除集合中
     * @param ModifyParamEntrySet 需要修改或添加的参数集合，注：同一参数不能同时出现在修改添加集合和删除集合中
     */
    public void setModifyParamEntrySet(ParamEntry [] ModifyParamEntrySet) {
        this.ModifyParamEntrySet = ModifyParamEntrySet;
    }

    /**
     * Get 需要从模板中删除的参数集合，注：同一参数不能同时出现在修改添加集合和删除集合中 
     * @return DeleteParamSet 需要从模板中删除的参数集合，注：同一参数不能同时出现在修改添加集合和删除集合中
     */
    public String [] getDeleteParamSet() {
        return this.DeleteParamSet;
    }

    /**
     * Set 需要从模板中删除的参数集合，注：同一参数不能同时出现在修改添加集合和删除集合中
     * @param DeleteParamSet 需要从模板中删除的参数集合，注：同一参数不能同时出现在修改添加集合和删除集合中
     */
    public void setDeleteParamSet(String [] DeleteParamSet) {
        this.DeleteParamSet = DeleteParamSet;
    }

    public ModifyParameterTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyParameterTemplateRequest(ModifyParameterTemplateRequest source) {
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.TemplateName != null) {
            this.TemplateName = new String(source.TemplateName);
        }
        if (source.TemplateDescription != null) {
            this.TemplateDescription = new String(source.TemplateDescription);
        }
        if (source.ModifyParamEntrySet != null) {
            this.ModifyParamEntrySet = new ParamEntry[source.ModifyParamEntrySet.length];
            for (int i = 0; i < source.ModifyParamEntrySet.length; i++) {
                this.ModifyParamEntrySet[i] = new ParamEntry(source.ModifyParamEntrySet[i]);
            }
        }
        if (source.DeleteParamSet != null) {
            this.DeleteParamSet = new String[source.DeleteParamSet.length];
            for (int i = 0; i < source.DeleteParamSet.length; i++) {
                this.DeleteParamSet[i] = new String(source.DeleteParamSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamSimple(map, prefix + "TemplateDescription", this.TemplateDescription);
        this.setParamArrayObj(map, prefix + "ModifyParamEntrySet.", this.ModifyParamEntrySet);
        this.setParamArraySimple(map, prefix + "DeleteParamSet.", this.DeleteParamSet);

    }
}

