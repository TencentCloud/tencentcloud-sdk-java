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
package com.tencentcloudapi.gme.v20180711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAuditResultExternalRequest extends AbstractModel {

    /**
    * 应用 ID
    */
    @SerializedName("BizId")
    @Expose
    private Long BizId;

    /**
    * 页数  取值范围：>=1
    */
    @SerializedName("PageNo")
    @Expose
    private Long PageNo;

    /**
    * 每页大小
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 起始时间戳（秒）
    */
    @SerializedName("BeginTime")
    @Expose
    private Long BeginTime;

    /**
    * 截止时间戳（秒）
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 最小恶意分数
    */
    @SerializedName("MinRate")
    @Expose
    private Long MinRate;

    /**
    * 最大恶意分数
    */
    @SerializedName("MaxRate")
    @Expose
    private Long MaxRate;

    /**
    * UserID
    */
    @SerializedName("OpenId")
    @Expose
    private String OpenId;

    /**
    * 恶意分类
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * 房间 ID
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
     * Get 应用 ID 
     * @return BizId 应用 ID
     */
    public Long getBizId() {
        return this.BizId;
    }

    /**
     * Set 应用 ID
     * @param BizId 应用 ID
     */
    public void setBizId(Long BizId) {
        this.BizId = BizId;
    }

    /**
     * Get 页数  取值范围：>=1 
     * @return PageNo 页数  取值范围：>=1
     */
    public Long getPageNo() {
        return this.PageNo;
    }

    /**
     * Set 页数  取值范围：>=1
     * @param PageNo 页数  取值范围：>=1
     */
    public void setPageNo(Long PageNo) {
        this.PageNo = PageNo;
    }

    /**
     * Get 每页大小 
     * @return PageSize 每页大小
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页大小
     * @param PageSize 每页大小
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 起始时间戳（秒） 
     * @return BeginTime 起始时间戳（秒）
     */
    public Long getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set 起始时间戳（秒）
     * @param BeginTime 起始时间戳（秒）
     */
    public void setBeginTime(Long BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get 截止时间戳（秒） 
     * @return EndTime 截止时间戳（秒）
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 截止时间戳（秒）
     * @param EndTime 截止时间戳（秒）
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 最小恶意分数 
     * @return MinRate 最小恶意分数
     */
    public Long getMinRate() {
        return this.MinRate;
    }

    /**
     * Set 最小恶意分数
     * @param MinRate 最小恶意分数
     */
    public void setMinRate(Long MinRate) {
        this.MinRate = MinRate;
    }

    /**
     * Get 最大恶意分数 
     * @return MaxRate 最大恶意分数
     */
    public Long getMaxRate() {
        return this.MaxRate;
    }

    /**
     * Set 最大恶意分数
     * @param MaxRate 最大恶意分数
     */
    public void setMaxRate(Long MaxRate) {
        this.MaxRate = MaxRate;
    }

    /**
     * Get UserID 
     * @return OpenId UserID
     */
    public String getOpenId() {
        return this.OpenId;
    }

    /**
     * Set UserID
     * @param OpenId UserID
     */
    public void setOpenId(String OpenId) {
        this.OpenId = OpenId;
    }

    /**
     * Get 恶意分类 
     * @return Label 恶意分类
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set 恶意分类
     * @param Label 恶意分类
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get 房间 ID 
     * @return RoomId 房间 ID
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set 房间 ID
     * @param RoomId 房间 ID
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    public DescribeAuditResultExternalRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAuditResultExternalRequest(DescribeAuditResultExternalRequest source) {
        if (source.BizId != null) {
            this.BizId = new Long(source.BizId);
        }
        if (source.PageNo != null) {
            this.PageNo = new Long(source.PageNo);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new Long(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.MinRate != null) {
            this.MinRate = new Long(source.MinRate);
        }
        if (source.MaxRate != null) {
            this.MaxRate = new Long(source.MaxRate);
        }
        if (source.OpenId != null) {
            this.OpenId = new String(source.OpenId);
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.RoomId != null) {
            this.RoomId = new String(source.RoomId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BizId", this.BizId);
        this.setParamSimple(map, prefix + "PageNo", this.PageNo);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "MinRate", this.MinRate);
        this.setParamSimple(map, prefix + "MaxRate", this.MaxRate);
        this.setParamSimple(map, prefix + "OpenId", this.OpenId);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);

    }
}

