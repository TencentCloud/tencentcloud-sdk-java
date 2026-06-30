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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRuleTemplatesRequest extends AbstractModel {

    /**
    * 模版类型：1-系统模版，2-用户自定义模版
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 源数据对象类型：1-常量，2-离线表级，3-离线字段级别
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
    * 执行引擎多选（位运算数组）：2-HIVE，4-SPARK，8-LIVY，16-DLC，64-TCHouse-P，128-DORIS，256-TCHouse-D，512-EMR-StarRocks，1024-TCHouse-X
    */
    @SerializedName("SourceEngineTypes")
    @Expose
    private Long [] SourceEngineTypes;

    /**
     * Get 模版类型：1-系统模版，2-用户自定义模版 
     * @return Type 模版类型：1-系统模版，2-用户自定义模版
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 模版类型：1-系统模版，2-用户自定义模版
     * @param Type 模版类型：1-系统模版，2-用户自定义模版
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 源数据对象类型：1-常量，2-离线表级，3-离线字段级别 
     * @return SourceObjectType 源数据对象类型：1-常量，2-离线表级，3-离线字段级别
     */
    public Long getSourceObjectType() {
        return this.SourceObjectType;
    }

    /**
     * Set 源数据对象类型：1-常量，2-离线表级，3-离线字段级别
     * @param SourceObjectType 源数据对象类型：1-常量，2-离线表级，3-离线字段级别
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
     * Get 执行引擎多选（位运算数组）：2-HIVE，4-SPARK，8-LIVY，16-DLC，64-TCHouse-P，128-DORIS，256-TCHouse-D，512-EMR-StarRocks，1024-TCHouse-X 
     * @return SourceEngineTypes 执行引擎多选（位运算数组）：2-HIVE，4-SPARK，8-LIVY，16-DLC，64-TCHouse-P，128-DORIS，256-TCHouse-D，512-EMR-StarRocks，1024-TCHouse-X
     */
    public Long [] getSourceEngineTypes() {
        return this.SourceEngineTypes;
    }

    /**
     * Set 执行引擎多选（位运算数组）：2-HIVE，4-SPARK，8-LIVY，16-DLC，64-TCHouse-P，128-DORIS，256-TCHouse-D，512-EMR-StarRocks，1024-TCHouse-X
     * @param SourceEngineTypes 执行引擎多选（位运算数组）：2-HIVE，4-SPARK，8-LIVY，16-DLC，64-TCHouse-P，128-DORIS，256-TCHouse-D，512-EMR-StarRocks，1024-TCHouse-X
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

