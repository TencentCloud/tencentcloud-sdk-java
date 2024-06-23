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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListReleaseQAPreviewRequest extends AbstractModel {

    /**
    * 应用ID
    */
    @SerializedName("BotBizId")
    @Expose
    private String BotBizId;

    /**
    * 页码
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 每页数量
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 查询内容
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * 发布单ID
    */
    @SerializedName("ReleaseBizId")
    @Expose
    private String ReleaseBizId;

    /**
    * 开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 状态(1新增2修改3删除)
    */
    @SerializedName("Actions")
    @Expose
    private Long [] Actions;

    /**
    * 发布状态(4发布成功5发布失败)
    */
    @SerializedName("ReleaseStatus")
    @Expose
    private Long [] ReleaseStatus;

    /**
     * Get 应用ID 
     * @return BotBizId 应用ID
     */
    public String getBotBizId() {
        return this.BotBizId;
    }

    /**
     * Set 应用ID
     * @param BotBizId 应用ID
     */
    public void setBotBizId(String BotBizId) {
        this.BotBizId = BotBizId;
    }

    /**
     * Get 页码 
     * @return PageNumber 页码
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 页码
     * @param PageNumber 页码
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 每页数量 
     * @return PageSize 每页数量
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页数量
     * @param PageSize 每页数量
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 查询内容 
     * @return Query 查询内容
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set 查询内容
     * @param Query 查询内容
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get 发布单ID 
     * @return ReleaseBizId 发布单ID
     */
    public String getReleaseBizId() {
        return this.ReleaseBizId;
    }

    /**
     * Set 发布单ID
     * @param ReleaseBizId 发布单ID
     */
    public void setReleaseBizId(String ReleaseBizId) {
        this.ReleaseBizId = ReleaseBizId;
    }

    /**
     * Get 开始时间 
     * @return StartTime 开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
     * @param StartTime 开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 状态(1新增2修改3删除) 
     * @return Actions 状态(1新增2修改3删除)
     */
    public Long [] getActions() {
        return this.Actions;
    }

    /**
     * Set 状态(1新增2修改3删除)
     * @param Actions 状态(1新增2修改3删除)
     */
    public void setActions(Long [] Actions) {
        this.Actions = Actions;
    }

    /**
     * Get 发布状态(4发布成功5发布失败) 
     * @return ReleaseStatus 发布状态(4发布成功5发布失败)
     */
    public Long [] getReleaseStatus() {
        return this.ReleaseStatus;
    }

    /**
     * Set 发布状态(4发布成功5发布失败)
     * @param ReleaseStatus 发布状态(4发布成功5发布失败)
     */
    public void setReleaseStatus(Long [] ReleaseStatus) {
        this.ReleaseStatus = ReleaseStatus;
    }

    public ListReleaseQAPreviewRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListReleaseQAPreviewRequest(ListReleaseQAPreviewRequest source) {
        if (source.BotBizId != null) {
            this.BotBizId = new String(source.BotBizId);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.ReleaseBizId != null) {
            this.ReleaseBizId = new String(source.ReleaseBizId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Actions != null) {
            this.Actions = new Long[source.Actions.length];
            for (int i = 0; i < source.Actions.length; i++) {
                this.Actions[i] = new Long(source.Actions[i]);
            }
        }
        if (source.ReleaseStatus != null) {
            this.ReleaseStatus = new Long[source.ReleaseStatus.length];
            for (int i = 0; i < source.ReleaseStatus.length; i++) {
                this.ReleaseStatus[i] = new Long(source.ReleaseStatus[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BotBizId", this.BotBizId);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamSimple(map, prefix + "ReleaseBizId", this.ReleaseBizId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "Actions.", this.Actions);
        this.setParamArraySimple(map, prefix + "ReleaseStatus.", this.ReleaseStatus);

    }
}

