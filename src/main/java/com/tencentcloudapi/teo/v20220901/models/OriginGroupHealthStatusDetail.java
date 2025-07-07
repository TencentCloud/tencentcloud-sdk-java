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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OriginGroupHealthStatusDetail extends AbstractModel {

    /**
    * 源站组 ID。
    */
    @SerializedName("OriginGroupId")
    @Expose
    private String OriginGroupId;

    /**
    * 根据所有探测区域的结果综合决策出来的源站组下各个源站的健康状态。超过一半的地域判定该源站不健康，则对应状态为不健康，否则为健康。
    */
    @SerializedName("OriginHealthStatus")
    @Expose
    private OriginHealthStatus [] OriginHealthStatus;

    /**
    * 各个健康检查区域下源站的健康状态。
    */
    @SerializedName("CheckRegionHealthStatus")
    @Expose
    private CheckRegionHealthStatus [] CheckRegionHealthStatus;

    /**
     * Get 源站组 ID。 
     * @return OriginGroupId 源站组 ID。
     */
    public String getOriginGroupId() {
        return this.OriginGroupId;
    }

    /**
     * Set 源站组 ID。
     * @param OriginGroupId 源站组 ID。
     */
    public void setOriginGroupId(String OriginGroupId) {
        this.OriginGroupId = OriginGroupId;
    }

    /**
     * Get 根据所有探测区域的结果综合决策出来的源站组下各个源站的健康状态。超过一半的地域判定该源站不健康，则对应状态为不健康，否则为健康。 
     * @return OriginHealthStatus 根据所有探测区域的结果综合决策出来的源站组下各个源站的健康状态。超过一半的地域判定该源站不健康，则对应状态为不健康，否则为健康。
     */
    public OriginHealthStatus [] getOriginHealthStatus() {
        return this.OriginHealthStatus;
    }

    /**
     * Set 根据所有探测区域的结果综合决策出来的源站组下各个源站的健康状态。超过一半的地域判定该源站不健康，则对应状态为不健康，否则为健康。
     * @param OriginHealthStatus 根据所有探测区域的结果综合决策出来的源站组下各个源站的健康状态。超过一半的地域判定该源站不健康，则对应状态为不健康，否则为健康。
     */
    public void setOriginHealthStatus(OriginHealthStatus [] OriginHealthStatus) {
        this.OriginHealthStatus = OriginHealthStatus;
    }

    /**
     * Get 各个健康检查区域下源站的健康状态。 
     * @return CheckRegionHealthStatus 各个健康检查区域下源站的健康状态。
     */
    public CheckRegionHealthStatus [] getCheckRegionHealthStatus() {
        return this.CheckRegionHealthStatus;
    }

    /**
     * Set 各个健康检查区域下源站的健康状态。
     * @param CheckRegionHealthStatus 各个健康检查区域下源站的健康状态。
     */
    public void setCheckRegionHealthStatus(CheckRegionHealthStatus [] CheckRegionHealthStatus) {
        this.CheckRegionHealthStatus = CheckRegionHealthStatus;
    }

    public OriginGroupHealthStatusDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OriginGroupHealthStatusDetail(OriginGroupHealthStatusDetail source) {
        if (source.OriginGroupId != null) {
            this.OriginGroupId = new String(source.OriginGroupId);
        }
        if (source.OriginHealthStatus != null) {
            this.OriginHealthStatus = new OriginHealthStatus[source.OriginHealthStatus.length];
            for (int i = 0; i < source.OriginHealthStatus.length; i++) {
                this.OriginHealthStatus[i] = new OriginHealthStatus(source.OriginHealthStatus[i]);
            }
        }
        if (source.CheckRegionHealthStatus != null) {
            this.CheckRegionHealthStatus = new CheckRegionHealthStatus[source.CheckRegionHealthStatus.length];
            for (int i = 0; i < source.CheckRegionHealthStatus.length; i++) {
                this.CheckRegionHealthStatus[i] = new CheckRegionHealthStatus(source.CheckRegionHealthStatus[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OriginGroupId", this.OriginGroupId);
        this.setParamArrayObj(map, prefix + "OriginHealthStatus.", this.OriginHealthStatus);
        this.setParamArrayObj(map, prefix + "CheckRegionHealthStatus.", this.CheckRegionHealthStatus);

    }
}

