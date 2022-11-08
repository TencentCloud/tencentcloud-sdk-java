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

public class DescribeStandardRuleDetailInfoListRequest extends AbstractModel{

    /**
    * 空间、项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 标准分类11编码映射 12数据过滤 13字符串转换 14数据元定义 15正则表达 16术语词典
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
     * Get 空间、项目id 
     * @return ProjectId 空间、项目id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 空间、项目id
     * @param ProjectId 空间、项目id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 标准分类11编码映射 12数据过滤 13字符串转换 14数据元定义 15正则表达 16术语词典 
     * @return Type 标准分类11编码映射 12数据过滤 13字符串转换 14数据元定义 15正则表达 16术语词典
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 标准分类11编码映射 12数据过滤 13字符串转换 14数据元定义 15正则表达 16术语词典
     * @param Type 标准分类11编码映射 12数据过滤 13字符串转换 14数据元定义 15正则表达 16术语词典
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    public DescribeStandardRuleDetailInfoListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeStandardRuleDetailInfoListRequest(DescribeStandardRuleDetailInfoListRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

