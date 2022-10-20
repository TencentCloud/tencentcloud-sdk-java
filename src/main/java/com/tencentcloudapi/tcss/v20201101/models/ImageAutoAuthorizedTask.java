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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageAutoAuthorizedTask extends AbstractModel{

    /**
    * 任务id
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * 授权方式，AUTO:自动授权，MANUAL:手动授权
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 任务日期
    */
    @SerializedName("AuthorizedDate")
    @Expose
    private String AuthorizedDate;

    /**
    * 镜像来源，LOCAL:本地镜像，REGISTRY:仓库镜像
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 最近授权时间
    */
    @SerializedName("LastAuthorizedTime")
    @Expose
    private String LastAuthorizedTime;

    /**
    * 自动授权成功数
    */
    @SerializedName("SuccessCount")
    @Expose
    private Long SuccessCount;

    /**
    * 自动授权失败数
    */
    @SerializedName("FailCount")
    @Expose
    private Long FailCount;

    /**
    * 最近任务失败码，REACH_LIMIT:达到授权上限，LICENSE_INSUFFICIENT:授权数不足
    */
    @SerializedName("LatestFailCode")
    @Expose
    private String LatestFailCode;

    /**
     * Get 任务id 
     * @return TaskId 任务id
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务id
     * @param TaskId 任务id
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 授权方式，AUTO:自动授权，MANUAL:手动授权 
     * @return Type 授权方式，AUTO:自动授权，MANUAL:手动授权
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 授权方式，AUTO:自动授权，MANUAL:手动授权
     * @param Type 授权方式，AUTO:自动授权，MANUAL:手动授权
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 任务日期 
     * @return AuthorizedDate 任务日期
     */
    public String getAuthorizedDate() {
        return this.AuthorizedDate;
    }

    /**
     * Set 任务日期
     * @param AuthorizedDate 任务日期
     */
    public void setAuthorizedDate(String AuthorizedDate) {
        this.AuthorizedDate = AuthorizedDate;
    }

    /**
     * Get 镜像来源，LOCAL:本地镜像，REGISTRY:仓库镜像 
     * @return Source 镜像来源，LOCAL:本地镜像，REGISTRY:仓库镜像
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 镜像来源，LOCAL:本地镜像，REGISTRY:仓库镜像
     * @param Source 镜像来源，LOCAL:本地镜像，REGISTRY:仓库镜像
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 最近授权时间 
     * @return LastAuthorizedTime 最近授权时间
     */
    public String getLastAuthorizedTime() {
        return this.LastAuthorizedTime;
    }

    /**
     * Set 最近授权时间
     * @param LastAuthorizedTime 最近授权时间
     */
    public void setLastAuthorizedTime(String LastAuthorizedTime) {
        this.LastAuthorizedTime = LastAuthorizedTime;
    }

    /**
     * Get 自动授权成功数 
     * @return SuccessCount 自动授权成功数
     */
    public Long getSuccessCount() {
        return this.SuccessCount;
    }

    /**
     * Set 自动授权成功数
     * @param SuccessCount 自动授权成功数
     */
    public void setSuccessCount(Long SuccessCount) {
        this.SuccessCount = SuccessCount;
    }

    /**
     * Get 自动授权失败数 
     * @return FailCount 自动授权失败数
     */
    public Long getFailCount() {
        return this.FailCount;
    }

    /**
     * Set 自动授权失败数
     * @param FailCount 自动授权失败数
     */
    public void setFailCount(Long FailCount) {
        this.FailCount = FailCount;
    }

    /**
     * Get 最近任务失败码，REACH_LIMIT:达到授权上限，LICENSE_INSUFFICIENT:授权数不足 
     * @return LatestFailCode 最近任务失败码，REACH_LIMIT:达到授权上限，LICENSE_INSUFFICIENT:授权数不足
     */
    public String getLatestFailCode() {
        return this.LatestFailCode;
    }

    /**
     * Set 最近任务失败码，REACH_LIMIT:达到授权上限，LICENSE_INSUFFICIENT:授权数不足
     * @param LatestFailCode 最近任务失败码，REACH_LIMIT:达到授权上限，LICENSE_INSUFFICIENT:授权数不足
     */
    public void setLatestFailCode(String LatestFailCode) {
        this.LatestFailCode = LatestFailCode;
    }

    public ImageAutoAuthorizedTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageAutoAuthorizedTask(ImageAutoAuthorizedTask source) {
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.AuthorizedDate != null) {
            this.AuthorizedDate = new String(source.AuthorizedDate);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.LastAuthorizedTime != null) {
            this.LastAuthorizedTime = new String(source.LastAuthorizedTime);
        }
        if (source.SuccessCount != null) {
            this.SuccessCount = new Long(source.SuccessCount);
        }
        if (source.FailCount != null) {
            this.FailCount = new Long(source.FailCount);
        }
        if (source.LatestFailCode != null) {
            this.LatestFailCode = new String(source.LatestFailCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "AuthorizedDate", this.AuthorizedDate);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "LastAuthorizedTime", this.LastAuthorizedTime);
        this.setParamSimple(map, prefix + "SuccessCount", this.SuccessCount);
        this.setParamSimple(map, prefix + "FailCount", this.FailCount);
        this.setParamSimple(map, prefix + "LatestFailCode", this.LatestFailCode);

    }
}

