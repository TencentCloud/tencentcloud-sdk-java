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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRuleTemplatesRequest extends AbstractModel{

    /**
    * 模版类型 1.系统模版 2.自定义模版
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 1.常量 2.离线表级 2.离线字段级
    */
    @SerializedName("SourceObjectType")
    @Expose
    private Long SourceObjectType;

    /**
    * 项目Id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 源端对应的引擎类型
    */
    @SerializedName("SourceEngineTypes")
    @Expose
    private Long [] SourceEngineTypes;

    /**
     * Get 模版类型 1.系统模版 2.自定义模版 
     * @return Type 模版类型 1.系统模版 2.自定义模版
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 模版类型 1.系统模版 2.自定义模版
     * @param Type 模版类型 1.系统模版 2.自定义模版
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 1.常量 2.离线表级 2.离线字段级 
     * @return SourceObjectType 1.常量 2.离线表级 2.离线字段级
     */
    public Long getSourceObjectType() {
        return this.SourceObjectType;
    }

    /**
     * Set 1.常量 2.离线表级 2.离线字段级
     * @param SourceObjectType 1.常量 2.离线表级 2.离线字段级
     */
    public void setSourceObjectType(Long SourceObjectType) {
        this.SourceObjectType = SourceObjectType;
    }

    /**
     * Get 项目Id 
     * @return ProjectId 项目Id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目Id
     * @param ProjectId 项目Id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 源端对应的引擎类型 
     * @return SourceEngineTypes 源端对应的引擎类型
     */
    public Long [] getSourceEngineTypes() {
        return this.SourceEngineTypes;
    }

    /**
     * Set 源端对应的引擎类型
     * @param SourceEngineTypes 源端对应的引擎类型
     */
    public void setSourceEngineTypes(Long [] SourceEngineTypes) {
        this.SourceEngineTypes = SourceEngineTypes;
    }

    public DescribeRuleTemplatesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRuleTemplatesRequest(DescribeRuleTemplatesRequest source) {
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.SourceObjectType != null) {
            this.SourceObjectType = new Long(source.SourceObjectType);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.SourceEngineTypes != null) {
            this.SourceEngineTypes = new Long[source.SourceEngineTypes.length];
            for (int i = 0; i < source.SourceEngineTypes.length; i++) {
                this.SourceEngineTypes[i] = new Long(source.SourceEngineTypes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "SourceObjectType", this.SourceObjectType);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArraySimple(map, prefix + "SourceEngineTypes.", this.SourceEngineTypes);

    }
}

