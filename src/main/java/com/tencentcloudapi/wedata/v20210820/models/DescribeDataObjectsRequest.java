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

public class DescribeDataObjectsRequest extends AbstractModel{

    /**
    * 数据来源ID
    */
    @SerializedName("DatasourceId")
    @Expose
    private String DatasourceId;

    /**
    * 数据表ID
    */
    @SerializedName("TableId")
    @Expose
    private String TableId;

    /**
    * 质量规则组ID
    */
    @SerializedName("RuleGroupId")
    @Expose
    private Long RuleGroupId;

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
     * Get 数据来源ID 
     * @return DatasourceId 数据来源ID
     */
    public String getDatasourceId() {
        return this.DatasourceId;
    }

    /**
     * Set 数据来源ID
     * @param DatasourceId 数据来源ID
     */
    public void setDatasourceId(String DatasourceId) {
        this.DatasourceId = DatasourceId;
    }

    /**
     * Get 数据表ID 
     * @return TableId 数据表ID
     */
    public String getTableId() {
        return this.TableId;
    }

    /**
     * Set 数据表ID
     * @param TableId 数据表ID
     */
    public void setTableId(String TableId) {
        this.TableId = TableId;
    }

    /**
     * Get 质量规则组ID 
     * @return RuleGroupId 质量规则组ID
     */
    public Long getRuleGroupId() {
        return this.RuleGroupId;
    }

    /**
     * Set 质量规则组ID
     * @param RuleGroupId 质量规则组ID
     */
    public void setRuleGroupId(Long RuleGroupId) {
        this.RuleGroupId = RuleGroupId;
    }

    /**
     * Get 项目ID 
     * @return ProjectId 项目ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    public DescribeDataObjectsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDataObjectsRequest(DescribeDataObjectsRequest source) {
        if (source.DatasourceId != null) {
            this.DatasourceId = new String(source.DatasourceId);
        }
        if (source.TableId != null) {
            this.TableId = new String(source.TableId);
        }
        if (source.RuleGroupId != null) {
            this.RuleGroupId = new Long(source.RuleGroupId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);
        this.setParamSimple(map, prefix + "TableId", this.TableId);
        this.setParamSimple(map, prefix + "RuleGroupId", this.RuleGroupId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);

    }
}

