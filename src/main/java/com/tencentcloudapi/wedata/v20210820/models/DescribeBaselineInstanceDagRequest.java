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

public class DescribeBaselineInstanceDagRequest extends AbstractModel{

    /**
    * 基线实例id
    */
    @SerializedName("BaselineInstanceId")
    @Expose
    private Long BaselineInstanceId;

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 要展开的上游实例id，格式为 taskIdA_curRunDate1,taskIdB_curRunDate2
    */
    @SerializedName("UpstreamInstanceIds")
    @Expose
    private String UpstreamInstanceIds;

    /**
    * 向上展开层级
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
     * Get 基线实例id 
     * @return BaselineInstanceId 基线实例id
     */
    public Long getBaselineInstanceId() {
        return this.BaselineInstanceId;
    }

    /**
     * Set 基线实例id
     * @param BaselineInstanceId 基线实例id
     */
    public void setBaselineInstanceId(Long BaselineInstanceId) {
        this.BaselineInstanceId = BaselineInstanceId;
    }

    /**
     * Get 项目id 
     * @return ProjectId 项目id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id
     * @param ProjectId 项目id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 要展开的上游实例id，格式为 taskIdA_curRunDate1,taskIdB_curRunDate2 
     * @return UpstreamInstanceIds 要展开的上游实例id，格式为 taskIdA_curRunDate1,taskIdB_curRunDate2
     */
    public String getUpstreamInstanceIds() {
        return this.UpstreamInstanceIds;
    }

    /**
     * Set 要展开的上游实例id，格式为 taskIdA_curRunDate1,taskIdB_curRunDate2
     * @param UpstreamInstanceIds 要展开的上游实例id，格式为 taskIdA_curRunDate1,taskIdB_curRunDate2
     */
    public void setUpstreamInstanceIds(String UpstreamInstanceIds) {
        this.UpstreamInstanceIds = UpstreamInstanceIds;
    }

    /**
     * Get 向上展开层级 
     * @return Level 向上展开层级
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 向上展开层级
     * @param Level 向上展开层级
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    public DescribeBaselineInstanceDagRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBaselineInstanceDagRequest(DescribeBaselineInstanceDagRequest source) {
        if (source.BaselineInstanceId != null) {
            this.BaselineInstanceId = new Long(source.BaselineInstanceId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.UpstreamInstanceIds != null) {
            this.UpstreamInstanceIds = new String(source.UpstreamInstanceIds);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BaselineInstanceId", this.BaselineInstanceId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "UpstreamInstanceIds", this.UpstreamInstanceIds);
        this.setParamSimple(map, prefix + "Level", this.Level);

    }
}

