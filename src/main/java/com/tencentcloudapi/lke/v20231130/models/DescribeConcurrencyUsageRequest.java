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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeConcurrencyUsageRequest extends AbstractModel {

    /**
    * 模型标识
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * 开始时间戳, 单位为秒(废弃)
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间戳, 单位为秒(废弃)
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 应用id列表
    */
    @SerializedName("AppBizIds")
    @Expose
    private String [] AppBizIds;

    /**
    * 空间id
    */
    @SerializedName("SpaceId")
    @Expose
    private String SpaceId;

    /**
    * 开始时间戳, 单位为秒
    */
    @SerializedName("StatStartTime")
    @Expose
    private Long StatStartTime;

    /**
    * 结束时间戳, 单位为秒
    */
    @SerializedName("StatEndTime")
    @Expose
    private Long StatEndTime;

    /**
     * Get 模型标识 
     * @return ModelName 模型标识
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set 模型标识
     * @param ModelName 模型标识
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get 开始时间戳, 单位为秒(废弃) 
     * @return StartTime 开始时间戳, 单位为秒(废弃)
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间戳, 单位为秒(废弃)
     * @param StartTime 开始时间戳, 单位为秒(废弃)
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间戳, 单位为秒(废弃) 
     * @return EndTime 结束时间戳, 单位为秒(废弃)
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间戳, 单位为秒(废弃)
     * @param EndTime 结束时间戳, 单位为秒(废弃)
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 应用id列表 
     * @return AppBizIds 应用id列表
     */
    public String [] getAppBizIds() {
        return this.AppBizIds;
    }

    /**
     * Set 应用id列表
     * @param AppBizIds 应用id列表
     */
    public void setAppBizIds(String [] AppBizIds) {
        this.AppBizIds = AppBizIds;
    }

    /**
     * Get 空间id 
     * @return SpaceId 空间id
     */
    public String getSpaceId() {
        return this.SpaceId;
    }

    /**
     * Set 空间id
     * @param SpaceId 空间id
     */
    public void setSpaceId(String SpaceId) {
        this.SpaceId = SpaceId;
    }

    /**
     * Get 开始时间戳, 单位为秒 
     * @return StatStartTime 开始时间戳, 单位为秒
     */
    public Long getStatStartTime() {
        return this.StatStartTime;
    }

    /**
     * Set 开始时间戳, 单位为秒
     * @param StatStartTime 开始时间戳, 单位为秒
     */
    public void setStatStartTime(Long StatStartTime) {
        this.StatStartTime = StatStartTime;
    }

    /**
     * Get 结束时间戳, 单位为秒 
     * @return StatEndTime 结束时间戳, 单位为秒
     */
    public Long getStatEndTime() {
        return this.StatEndTime;
    }

    /**
     * Set 结束时间戳, 单位为秒
     * @param StatEndTime 结束时间戳, 单位为秒
     */
    public void setStatEndTime(Long StatEndTime) {
        this.StatEndTime = StatEndTime;
    }

    public DescribeConcurrencyUsageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeConcurrencyUsageRequest(DescribeConcurrencyUsageRequest source) {
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.AppBizIds != null) {
            this.AppBizIds = new String[source.AppBizIds.length];
            for (int i = 0; i < source.AppBizIds.length; i++) {
                this.AppBizIds[i] = new String(source.AppBizIds[i]);
            }
        }
        if (source.SpaceId != null) {
            this.SpaceId = new String(source.SpaceId);
        }
        if (source.StatStartTime != null) {
            this.StatStartTime = new Long(source.StatStartTime);
        }
        if (source.StatEndTime != null) {
            this.StatEndTime = new Long(source.StatEndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "AppBizIds.", this.AppBizIds);
        this.setParamSimple(map, prefix + "SpaceId", this.SpaceId);
        this.setParamSimple(map, prefix + "StatStartTime", this.StatStartTime);
        this.setParamSimple(map, prefix + "StatEndTime", this.StatEndTime);

    }
}

