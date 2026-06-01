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

public class DisplaySensitiveInfo extends AbstractModel {

    /**
    * <p>主键Id</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>类型</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>来源</p>
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * <p>值</p>
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * <p>公共字段</p>
    */
    @SerializedName("DisplayToolCommon")
    @Expose
    private DisplayToolCommon DisplayToolCommon;

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
     * Get <p>主键Id</p> 
     * @return Id <p>主键Id</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>主键Id</p>
     * @param Id <p>主键Id</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>类型</p> 
     * @return Type <p>类型</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>类型</p>
     * @param Type <p>类型</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>来源</p> 
     * @return Source <p>来源</p>
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set <p>来源</p>
     * @param Source <p>来源</p>
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get <p>值</p> 
     * @return Value <p>值</p>
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set <p>值</p>
     * @param Value <p>值</p>
     */
    public void setValue(String Value) {
        this.Value = Value;
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

    public DisplaySensitiveInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DisplaySensitiveInfo(DisplaySensitiveInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.DisplayToolCommon != null) {
            this.DisplayToolCommon = new DisplayToolCommon(source.DisplayToolCommon);
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
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamObj(map, prefix + "DisplayToolCommon.", this.DisplayToolCommon);
        this.setParamSimple(map, prefix + "IsCloudAsset", this.IsCloudAsset);
        this.setParamSimple(map, prefix + "CloudAssetStatus", this.CloudAssetStatus);
        this.setParamSimple(map, prefix + "AggregationCount", this.AggregationCount);

    }
}

