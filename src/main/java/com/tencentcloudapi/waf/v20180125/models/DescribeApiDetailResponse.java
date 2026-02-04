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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeApiDetailResponse extends AbstractModel {

    /**
    * 请求样例，json字符串格式
    */
    @SerializedName("Log")
    @Expose
    private String Log;

    /**
    * 完整请求样例
    */
    @SerializedName("FullReqLog")
    @Expose
    private String FullReqLog;

    /**
    * 请求参数样例列表
    */
    @SerializedName("ParameterList")
    @Expose
    private ApiParameterType [] ParameterList;

    /**
    * 当前场景标签
    */
    @SerializedName("Scene")
    @Expose
    private String Scene;

    /**
    * 敏感字段
    */
    @SerializedName("SensitiveFields")
    @Expose
    private String [] SensitiveFields;

    /**
    * 7天内是否活跃
    */
    @SerializedName("IsActive")
    @Expose
    private Boolean IsActive;

    /**
    * 访问ip数
    */
    @SerializedName("IpCount")
    @Expose
    private Long IpCount;

    /**
    * 访问地域数量
    */
    @SerializedName("RegionCount")
    @Expose
    private Long RegionCount;

    /**
    * 关联事件数
    */
    @SerializedName("EventCount")
    @Expose
    private Long EventCount;

    /**
    * 涉敏数据条数
    */
    @SerializedName("SensitiveCount")
    @Expose
    private Long SensitiveCount;

    /**
    * 风险等级
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * 响应体
    */
    @SerializedName("RspLog")
    @Expose
    private String RspLog;

    /**
    * 昨日访问峰值QPS
    */
    @SerializedName("MaxQPS")
    @Expose
    private Long MaxQPS;

    /**
    * 历史样例
    */
    @SerializedName("ApiDetailSampleHistory")
    @Expose
    private ApiDetailSampleHistory [] ApiDetailSampleHistory;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 请求样例，json字符串格式 
     * @return Log 请求样例，json字符串格式
     */
    public String getLog() {
        return this.Log;
    }

    /**
     * Set 请求样例，json字符串格式
     * @param Log 请求样例，json字符串格式
     */
    public void setLog(String Log) {
        this.Log = Log;
    }

    /**
     * Get 完整请求样例 
     * @return FullReqLog 完整请求样例
     */
    public String getFullReqLog() {
        return this.FullReqLog;
    }

    /**
     * Set 完整请求样例
     * @param FullReqLog 完整请求样例
     */
    public void setFullReqLog(String FullReqLog) {
        this.FullReqLog = FullReqLog;
    }

    /**
     * Get 请求参数样例列表 
     * @return ParameterList 请求参数样例列表
     */
    public ApiParameterType [] getParameterList() {
        return this.ParameterList;
    }

    /**
     * Set 请求参数样例列表
     * @param ParameterList 请求参数样例列表
     */
    public void setParameterList(ApiParameterType [] ParameterList) {
        this.ParameterList = ParameterList;
    }

    /**
     * Get 当前场景标签 
     * @return Scene 当前场景标签
     */
    public String getScene() {
        return this.Scene;
    }

    /**
     * Set 当前场景标签
     * @param Scene 当前场景标签
     */
    public void setScene(String Scene) {
        this.Scene = Scene;
    }

    /**
     * Get 敏感字段 
     * @return SensitiveFields 敏感字段
     */
    public String [] getSensitiveFields() {
        return this.SensitiveFields;
    }

    /**
     * Set 敏感字段
     * @param SensitiveFields 敏感字段
     */
    public void setSensitiveFields(String [] SensitiveFields) {
        this.SensitiveFields = SensitiveFields;
    }

    /**
     * Get 7天内是否活跃 
     * @return IsActive 7天内是否活跃
     */
    public Boolean getIsActive() {
        return this.IsActive;
    }

    /**
     * Set 7天内是否活跃
     * @param IsActive 7天内是否活跃
     */
    public void setIsActive(Boolean IsActive) {
        this.IsActive = IsActive;
    }

    /**
     * Get 访问ip数 
     * @return IpCount 访问ip数
     */
    public Long getIpCount() {
        return this.IpCount;
    }

    /**
     * Set 访问ip数
     * @param IpCount 访问ip数
     */
    public void setIpCount(Long IpCount) {
        this.IpCount = IpCount;
    }

    /**
     * Get 访问地域数量 
     * @return RegionCount 访问地域数量
     */
    public Long getRegionCount() {
        return this.RegionCount;
    }

    /**
     * Set 访问地域数量
     * @param RegionCount 访问地域数量
     */
    public void setRegionCount(Long RegionCount) {
        this.RegionCount = RegionCount;
    }

    /**
     * Get 关联事件数 
     * @return EventCount 关联事件数
     */
    public Long getEventCount() {
        return this.EventCount;
    }

    /**
     * Set 关联事件数
     * @param EventCount 关联事件数
     */
    public void setEventCount(Long EventCount) {
        this.EventCount = EventCount;
    }

    /**
     * Get 涉敏数据条数 
     * @return SensitiveCount 涉敏数据条数
     */
    public Long getSensitiveCount() {
        return this.SensitiveCount;
    }

    /**
     * Set 涉敏数据条数
     * @param SensitiveCount 涉敏数据条数
     */
    public void setSensitiveCount(Long SensitiveCount) {
        this.SensitiveCount = SensitiveCount;
    }

    /**
     * Get 风险等级 
     * @return Level 风险等级
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 风险等级
     * @param Level 风险等级
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get 响应体 
     * @return RspLog 响应体
     */
    public String getRspLog() {
        return this.RspLog;
    }

    /**
     * Set 响应体
     * @param RspLog 响应体
     */
    public void setRspLog(String RspLog) {
        this.RspLog = RspLog;
    }

    /**
     * Get 昨日访问峰值QPS 
     * @return MaxQPS 昨日访问峰值QPS
     */
    public Long getMaxQPS() {
        return this.MaxQPS;
    }

    /**
     * Set 昨日访问峰值QPS
     * @param MaxQPS 昨日访问峰值QPS
     */
    public void setMaxQPS(Long MaxQPS) {
        this.MaxQPS = MaxQPS;
    }

    /**
     * Get 历史样例 
     * @return ApiDetailSampleHistory 历史样例
     */
    public ApiDetailSampleHistory [] getApiDetailSampleHistory() {
        return this.ApiDetailSampleHistory;
    }

    /**
     * Set 历史样例
     * @param ApiDetailSampleHistory 历史样例
     */
    public void setApiDetailSampleHistory(ApiDetailSampleHistory [] ApiDetailSampleHistory) {
        this.ApiDetailSampleHistory = ApiDetailSampleHistory;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeApiDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeApiDetailResponse(DescribeApiDetailResponse source) {
        if (source.Log != null) {
            this.Log = new String(source.Log);
        }
        if (source.FullReqLog != null) {
            this.FullReqLog = new String(source.FullReqLog);
        }
        if (source.ParameterList != null) {
            this.ParameterList = new ApiParameterType[source.ParameterList.length];
            for (int i = 0; i < source.ParameterList.length; i++) {
                this.ParameterList[i] = new ApiParameterType(source.ParameterList[i]);
            }
        }
        if (source.Scene != null) {
            this.Scene = new String(source.Scene);
        }
        if (source.SensitiveFields != null) {
            this.SensitiveFields = new String[source.SensitiveFields.length];
            for (int i = 0; i < source.SensitiveFields.length; i++) {
                this.SensitiveFields[i] = new String(source.SensitiveFields[i]);
            }
        }
        if (source.IsActive != null) {
            this.IsActive = new Boolean(source.IsActive);
        }
        if (source.IpCount != null) {
            this.IpCount = new Long(source.IpCount);
        }
        if (source.RegionCount != null) {
            this.RegionCount = new Long(source.RegionCount);
        }
        if (source.EventCount != null) {
            this.EventCount = new Long(source.EventCount);
        }
        if (source.SensitiveCount != null) {
            this.SensitiveCount = new Long(source.SensitiveCount);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.RspLog != null) {
            this.RspLog = new String(source.RspLog);
        }
        if (source.MaxQPS != null) {
            this.MaxQPS = new Long(source.MaxQPS);
        }
        if (source.ApiDetailSampleHistory != null) {
            this.ApiDetailSampleHistory = new ApiDetailSampleHistory[source.ApiDetailSampleHistory.length];
            for (int i = 0; i < source.ApiDetailSampleHistory.length; i++) {
                this.ApiDetailSampleHistory[i] = new ApiDetailSampleHistory(source.ApiDetailSampleHistory[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Log", this.Log);
        this.setParamSimple(map, prefix + "FullReqLog", this.FullReqLog);
        this.setParamArrayObj(map, prefix + "ParameterList.", this.ParameterList);
        this.setParamSimple(map, prefix + "Scene", this.Scene);
        this.setParamArraySimple(map, prefix + "SensitiveFields.", this.SensitiveFields);
        this.setParamSimple(map, prefix + "IsActive", this.IsActive);
        this.setParamSimple(map, prefix + "IpCount", this.IpCount);
        this.setParamSimple(map, prefix + "RegionCount", this.RegionCount);
        this.setParamSimple(map, prefix + "EventCount", this.EventCount);
        this.setParamSimple(map, prefix + "SensitiveCount", this.SensitiveCount);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "RspLog", this.RspLog);
        this.setParamSimple(map, prefix + "MaxQPS", this.MaxQPS);
        this.setParamArrayObj(map, prefix + "ApiDetailSampleHistory.", this.ApiDetailSampleHistory);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

