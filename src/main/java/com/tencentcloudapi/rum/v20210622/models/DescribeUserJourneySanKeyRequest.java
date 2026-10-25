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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUserJourneySanKeyRequest extends AbstractModel {

    /**
    * <p>应用id</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>开始时间</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * <p>结束时间</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * <p>平台</p>
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * <p>过滤条件</p>
    */
    @SerializedName("Filters")
    @Expose
    private String Filters;

    /**
    * <p>每一步骤的数量</p>
    */
    @SerializedName("TopPagesPerStep")
    @Expose
    private Long TopPagesPerStep;

    /**
    * <p>每一个节点最小的会话数量</p>
    */
    @SerializedName("MinSessionThreshold")
    @Expose
    private Long MinSessionThreshold;

    /**
    * <p>开始页面</p>
    */
    @SerializedName("StartPage")
    @Expose
    private String StartPage;

    /**
    * <p>结束页面</p>
    */
    @SerializedName("EndPage")
    @Expose
    private String EndPage;

    /**
    * <p>是否有挣扎事件</p>
    */
    @SerializedName("HasStruggle")
    @Expose
    private Boolean HasStruggle;

    /**
     * Get <p>应用id</p> 
     * @return AppId <p>应用id</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>应用id</p>
     * @param AppId <p>应用id</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>开始时间</p> 
     * @return StartTime <p>开始时间</p>
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>开始时间</p>
     * @param StartTime <p>开始时间</p>
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>结束时间</p> 
     * @return EndTime <p>结束时间</p>
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间</p>
     * @param EndTime <p>结束时间</p>
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>平台</p> 
     * @return Platform <p>平台</p>
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set <p>平台</p>
     * @param Platform <p>平台</p>
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get <p>过滤条件</p> 
     * @return Filters <p>过滤条件</p>
     */
    public String getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤条件</p>
     * @param Filters <p>过滤条件</p>
     */
    public void setFilters(String Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>每一步骤的数量</p> 
     * @return TopPagesPerStep <p>每一步骤的数量</p>
     */
    public Long getTopPagesPerStep() {
        return this.TopPagesPerStep;
    }

    /**
     * Set <p>每一步骤的数量</p>
     * @param TopPagesPerStep <p>每一步骤的数量</p>
     */
    public void setTopPagesPerStep(Long TopPagesPerStep) {
        this.TopPagesPerStep = TopPagesPerStep;
    }

    /**
     * Get <p>每一个节点最小的会话数量</p> 
     * @return MinSessionThreshold <p>每一个节点最小的会话数量</p>
     */
    public Long getMinSessionThreshold() {
        return this.MinSessionThreshold;
    }

    /**
     * Set <p>每一个节点最小的会话数量</p>
     * @param MinSessionThreshold <p>每一个节点最小的会话数量</p>
     */
    public void setMinSessionThreshold(Long MinSessionThreshold) {
        this.MinSessionThreshold = MinSessionThreshold;
    }

    /**
     * Get <p>开始页面</p> 
     * @return StartPage <p>开始页面</p>
     */
    public String getStartPage() {
        return this.StartPage;
    }

    /**
     * Set <p>开始页面</p>
     * @param StartPage <p>开始页面</p>
     */
    public void setStartPage(String StartPage) {
        this.StartPage = StartPage;
    }

    /**
     * Get <p>结束页面</p> 
     * @return EndPage <p>结束页面</p>
     */
    public String getEndPage() {
        return this.EndPage;
    }

    /**
     * Set <p>结束页面</p>
     * @param EndPage <p>结束页面</p>
     */
    public void setEndPage(String EndPage) {
        this.EndPage = EndPage;
    }

    /**
     * Get <p>是否有挣扎事件</p> 
     * @return HasStruggle <p>是否有挣扎事件</p>
     */
    public Boolean getHasStruggle() {
        return this.HasStruggle;
    }

    /**
     * Set <p>是否有挣扎事件</p>
     * @param HasStruggle <p>是否有挣扎事件</p>
     */
    public void setHasStruggle(Boolean HasStruggle) {
        this.HasStruggle = HasStruggle;
    }

    public DescribeUserJourneySanKeyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUserJourneySanKeyRequest(DescribeUserJourneySanKeyRequest source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Platform != null) {
            this.Platform = new String(source.Platform);
        }
        if (source.Filters != null) {
            this.Filters = new String(source.Filters);
        }
        if (source.TopPagesPerStep != null) {
            this.TopPagesPerStep = new Long(source.TopPagesPerStep);
        }
        if (source.MinSessionThreshold != null) {
            this.MinSessionThreshold = new Long(source.MinSessionThreshold);
        }
        if (source.StartPage != null) {
            this.StartPage = new String(source.StartPage);
        }
        if (source.EndPage != null) {
            this.EndPage = new String(source.EndPage);
        }
        if (source.HasStruggle != null) {
            this.HasStruggle = new Boolean(source.HasStruggle);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "Filters", this.Filters);
        this.setParamSimple(map, prefix + "TopPagesPerStep", this.TopPagesPerStep);
        this.setParamSimple(map, prefix + "MinSessionThreshold", this.MinSessionThreshold);
        this.setParamSimple(map, prefix + "StartPage", this.StartPage);
        this.setParamSimple(map, prefix + "EndPage", this.EndPage);
        this.setParamSimple(map, prefix + "HasStruggle", this.HasStruggle);

    }
}

