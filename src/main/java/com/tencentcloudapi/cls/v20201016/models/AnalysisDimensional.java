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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AnalysisDimensional extends AbstractModel{

    /**
    * 分析名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 分析类型：query，field ，original
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 分析内容
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 配置
    */
    @SerializedName("ConfigInfo")
    @Expose
    private AlarmAnalysisConfig [] ConfigInfo;

    /**
     * Get 分析名称 
     * @return Name 分析名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 分析名称
     * @param Name 分析名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 分析类型：query，field ，original 
     * @return Type 分析类型：query，field ，original
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 分析类型：query，field ，original
     * @param Type 分析类型：query，field ，original
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 分析内容 
     * @return Content 分析内容
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 分析内容
     * @param Content 分析内容
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 配置 
     * @return ConfigInfo 配置
     */
    public AlarmAnalysisConfig [] getConfigInfo() {
        return this.ConfigInfo;
    }

    /**
     * Set 配置
     * @param ConfigInfo 配置
     */
    public void setConfigInfo(AlarmAnalysisConfig [] ConfigInfo) {
        this.ConfigInfo = ConfigInfo;
    }

    public AnalysisDimensional() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AnalysisDimensional(AnalysisDimensional source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.ConfigInfo != null) {
            this.ConfigInfo = new AlarmAnalysisConfig[source.ConfigInfo.length];
            for (int i = 0; i < source.ConfigInfo.length; i++) {
                this.ConfigInfo[i] = new AlarmAnalysisConfig(source.ConfigInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamArrayObj(map, prefix + "ConfigInfo.", this.ConfigInfo);

    }
}

