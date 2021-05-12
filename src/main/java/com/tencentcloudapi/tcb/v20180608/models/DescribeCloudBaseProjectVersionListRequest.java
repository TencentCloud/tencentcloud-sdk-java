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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCloudBaseProjectVersionListRequest extends AbstractModel{

    /**
    * 环境id
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 项目名称
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * 页大小
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 第几页,从0开始
    */
    @SerializedName("PageNum")
    @Expose
    private Long PageNum;

    /**
    * 起始时间 2021-03-27 12:00:00
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 终止时间 2021-03-27 12:00:00
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get 环境id 
     * @return EnvId 环境id
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 环境id
     * @param EnvId 环境id
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get 项目名称 
     * @return ProjectName 项目名称
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set 项目名称
     * @param ProjectName 项目名称
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get 页大小 
     * @return PageSize 页大小
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 页大小
     * @param PageSize 页大小
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 第几页,从0开始 
     * @return PageNum 第几页,从0开始
     */
    public Long getPageNum() {
        return this.PageNum;
    }

    /**
     * Set 第几页,从0开始
     * @param PageNum 第几页,从0开始
     */
    public void setPageNum(Long PageNum) {
        this.PageNum = PageNum;
    }

    /**
     * Get 起始时间 2021-03-27 12:00:00 
     * @return StartTime 起始时间 2021-03-27 12:00:00
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 起始时间 2021-03-27 12:00:00
     * @param StartTime 起始时间 2021-03-27 12:00:00
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 终止时间 2021-03-27 12:00:00 
     * @return EndTime 终止时间 2021-03-27 12:00:00
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 终止时间 2021-03-27 12:00:00
     * @param EndTime 终止时间 2021-03-27 12:00:00
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public DescribeCloudBaseProjectVersionListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCloudBaseProjectVersionListRequest(DescribeCloudBaseProjectVersionListRequest source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageNum != null) {
            this.PageNum = new Long(source.PageNum);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

