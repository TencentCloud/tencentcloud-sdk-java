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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateParamTemplateRequest extends AbstractModel{

    /**
    * 模板名称
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * mysql版本号
    */
    @SerializedName("EngineVersion")
    @Expose
    private String EngineVersion;

    /**
    * 模板描述
    */
    @SerializedName("TemplateDescription")
    @Expose
    private String TemplateDescription;

    /**
    * 可选参数，需要复制的模板ID
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
    * 数据库类型，可选值：NORMAL（默认值），SERVERLESS
    */
    @SerializedName("DbMode")
    @Expose
    private String DbMode;

    /**
    * 参数列表
    */
    @SerializedName("ParamList")
    @Expose
    private ParamItem [] ParamList;

    /**
     * Get 模板名称 
     * @return TemplateName 模板名称
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set 模板名称
     * @param TemplateName 模板名称
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get mysql版本号 
     * @return EngineVersion mysql版本号
     */
    public String getEngineVersion() {
        return this.EngineVersion;
    }

    /**
     * Set mysql版本号
     * @param EngineVersion mysql版本号
     */
    public void setEngineVersion(String EngineVersion) {
        this.EngineVersion = EngineVersion;
    }

    /**
     * Get 模板描述 
     * @return TemplateDescription 模板描述
     */
    public String getTemplateDescription() {
        return this.TemplateDescription;
    }

    /**
     * Set 模板描述
     * @param TemplateDescription 模板描述
     */
    public void setTemplateDescription(String TemplateDescription) {
        this.TemplateDescription = TemplateDescription;
    }

    /**
     * Get 可选参数，需要复制的模板ID 
     * @return TemplateId 可选参数，需要复制的模板ID
     */
    public Long getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 可选参数，需要复制的模板ID
     * @param TemplateId 可选参数，需要复制的模板ID
     */
    public void setTemplateId(Long TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 数据库类型，可选值：NORMAL（默认值），SERVERLESS 
     * @return DbMode 数据库类型，可选值：NORMAL（默认值），SERVERLESS
     */
    public String getDbMode() {
        return this.DbMode;
    }

    /**
     * Set 数据库类型，可选值：NORMAL（默认值），SERVERLESS
     * @param DbMode 数据库类型，可选值：NORMAL（默认值），SERVERLESS
     */
    public void setDbMode(String DbMode) {
        this.DbMode = DbMode;
    }

    /**
     * Get 参数列表 
     * @return ParamList 参数列表
     */
    public ParamItem [] getParamList() {
        return this.ParamList;
    }

    /**
     * Set 参数列表
     * @param ParamList 参数列表
     */
    public void setParamList(ParamItem [] ParamList) {
        this.ParamList = ParamList;
    }

    public CreateParamTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateParamTemplateRequest(CreateParamTemplateRequest source) {
        if (source.TemplateName != null) {
            this.TemplateName = new String(source.TemplateName);
        }
        if (source.EngineVersion != null) {
            this.EngineVersion = new String(source.EngineVersion);
        }
        if (source.TemplateDescription != null) {
            this.TemplateDescription = new String(source.TemplateDescription);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new Long(source.TemplateId);
        }
        if (source.DbMode != null) {
            this.DbMode = new String(source.DbMode);
        }
        if (source.ParamList != null) {
            this.ParamList = new ParamItem[source.ParamList.length];
            for (int i = 0; i < source.ParamList.length; i++) {
                this.ParamList[i] = new ParamItem(source.ParamList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamSimple(map, prefix + "EngineVersion", this.EngineVersion);
        this.setParamSimple(map, prefix + "TemplateDescription", this.TemplateDescription);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "DbMode", this.DbMode);
        this.setParamArrayObj(map, prefix + "ParamList.", this.ParamList);

    }
}

