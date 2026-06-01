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
package com.tencentcloudapi.ctem.v20231128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DisplayManage extends AbstractModel {

    /**
    * <p>主键ID</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>公共字段</p>
    */
    @SerializedName("DisplayToolCommon")
    @Expose
    private DisplayToolCommon DisplayToolCommon;

    /**
    * <p>Url</p>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * <p>标题</p>
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * <p>Icon</p>
    */
    @SerializedName("Icon")
    @Expose
    private String Icon;

    /**
    * <p>缩略图</p>
    */
    @SerializedName("Screenshot")
    @Expose
    private String Screenshot;

    /**
    * <p>状态码</p>
    */
    @SerializedName("Code")
    @Expose
    private Long Code;

    /**
    * <p>后台Host</p>
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * <p>状态：not_converged:未收敛, converged:已收敛, ignore:已忽略</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>是否为云资产：0-非云资产 1-是云资产</p>
    */
    @SerializedName("IsCloudAsset")
    @Expose
    private Long IsCloudAsset;

    /**
    * <p>云资产是否下线：-1-已下线 0-正常</p>
    */
    @SerializedName("CloudAssetStatus")
    @Expose
    private Long CloudAssetStatus;

    /**
    * <p>聚合视角下该组真实子项总数；非聚合视角为 0</p>
    */
    @SerializedName("AggregationCount")
    @Expose
    private Long AggregationCount;

    /**
     * Get <p>主键ID</p> 
     * @return Id <p>主键ID</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>主键ID</p>
     * @param Id <p>主键ID</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>公共字段</p> 
     * @return DisplayToolCommon <p>公共字段</p>
     */
    public DisplayToolCommon getDisplayToolCommon() {
        return this.DisplayToolCommon;
    }

    /**
     * Set <p>公共字段</p>
     * @param DisplayToolCommon <p>公共字段</p>
     */
    public void setDisplayToolCommon(DisplayToolCommon DisplayToolCommon) {
        this.DisplayToolCommon = DisplayToolCommon;
    }

    /**
     * Get <p>Url</p> 
     * @return Url <p>Url</p>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>Url</p>
     * @param Url <p>Url</p>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get <p>标题</p> 
     * @return Title <p>标题</p>
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set <p>标题</p>
     * @param Title <p>标题</p>
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get <p>Icon</p> 
     * @return Icon <p>Icon</p>
     */
    public String getIcon() {
        return this.Icon;
    }

    /**
     * Set <p>Icon</p>
     * @param Icon <p>Icon</p>
     */
    public void setIcon(String Icon) {
        this.Icon = Icon;
    }

    /**
     * Get <p>缩略图</p> 
     * @return Screenshot <p>缩略图</p>
     */
    public String getScreenshot() {
        return this.Screenshot;
    }

    /**
     * Set <p>缩略图</p>
     * @param Screenshot <p>缩略图</p>
     */
    public void setScreenshot(String Screenshot) {
        this.Screenshot = Screenshot;
    }

    /**
     * Get <p>状态码</p> 
     * @return Code <p>状态码</p>
     */
    public Long getCode() {
        return this.Code;
    }

    /**
     * Set <p>状态码</p>
     * @param Code <p>状态码</p>
     */
    public void setCode(Long Code) {
        this.Code = Code;
    }

    /**
     * Get <p>后台Host</p> 
     * @return Host <p>后台Host</p>
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set <p>后台Host</p>
     * @param Host <p>后台Host</p>
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get <p>状态：not_converged:未收敛, converged:已收敛, ignore:已忽略</p> 
     * @return Status <p>状态：not_converged:未收敛, converged:已收敛, ignore:已忽略</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态：not_converged:未收敛, converged:已收敛, ignore:已忽略</p>
     * @param Status <p>状态：not_converged:未收敛, converged:已收敛, ignore:已忽略</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>是否为云资产：0-非云资产 1-是云资产</p> 
     * @return IsCloudAsset <p>是否为云资产：0-非云资产 1-是云资产</p>
     */
    public Long getIsCloudAsset() {
        return this.IsCloudAsset;
    }

    /**
     * Set <p>是否为云资产：0-非云资产 1-是云资产</p>
     * @param IsCloudAsset <p>是否为云资产：0-非云资产 1-是云资产</p>
     */
    public void setIsCloudAsset(Long IsCloudAsset) {
        this.IsCloudAsset = IsCloudAsset;
    }

    /**
     * Get <p>云资产是否下线：-1-已下线 0-正常</p> 
     * @return CloudAssetStatus <p>云资产是否下线：-1-已下线 0-正常</p>
     */
    public Long getCloudAssetStatus() {
        return this.CloudAssetStatus;
    }

    /**
     * Set <p>云资产是否下线：-1-已下线 0-正常</p>
     * @param CloudAssetStatus <p>云资产是否下线：-1-已下线 0-正常</p>
     */
    public void setCloudAssetStatus(Long CloudAssetStatus) {
        this.CloudAssetStatus = CloudAssetStatus;
    }

    /**
     * Get <p>聚合视角下该组真实子项总数；非聚合视角为 0</p> 
     * @return AggregationCount <p>聚合视角下该组真实子项总数；非聚合视角为 0</p>
     */
    public Long getAggregationCount() {
        return this.AggregationCount;
    }

    /**
     * Set <p>聚合视角下该组真实子项总数；非聚合视角为 0</p>
     * @param AggregationCount <p>聚合视角下该组真实子项总数；非聚合视角为 0</p>
     */
    public void setAggregationCount(Long AggregationCount) {
        this.AggregationCount = AggregationCount;
    }

    public DisplayManage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DisplayManage(DisplayManage source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.DisplayToolCommon != null) {
            this.DisplayToolCommon = new DisplayToolCommon(source.DisplayToolCommon);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Icon != null) {
            this.Icon = new String(source.Icon);
        }
        if (source.Screenshot != null) {
            this.Screenshot = new String(source.Screenshot);
        }
        if (source.Code != null) {
            this.Code = new Long(source.Code);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.IsCloudAsset != null) {
            this.IsCloudAsset = new Long(source.IsCloudAsset);
        }
        if (source.CloudAssetStatus != null) {
            this.CloudAssetStatus = new Long(source.CloudAssetStatus);
        }
        if (source.AggregationCount != null) {
            this.AggregationCount = new Long(source.AggregationCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamObj(map, prefix + "DisplayToolCommon.", this.DisplayToolCommon);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Icon", this.Icon);
        this.setParamSimple(map, prefix + "Screenshot", this.Screenshot);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "IsCloudAsset", this.IsCloudAsset);
        this.setParamSimple(map, prefix + "CloudAssetStatus", this.CloudAssetStatus);
        this.setParamSimple(map, prefix + "AggregationCount", this.AggregationCount);

    }
}

