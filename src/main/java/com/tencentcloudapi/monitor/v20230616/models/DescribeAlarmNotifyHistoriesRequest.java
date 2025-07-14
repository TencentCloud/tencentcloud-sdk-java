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
package com.tencentcloudapi.monitor.v20230616.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAlarmNotifyHistoriesRequest extends AbstractModel {

    /**
    * 监控类型
    */
    @SerializedName("MonitorType")
    @Expose
    private String MonitorType;

    /**
    * 起始时间点，unix秒级时间戳
    */
    @SerializedName("QueryBaseTime")
    @Expose
    private Long QueryBaseTime;

    /**
    * 从 QueryBaseTime 开始，需要查询往前多久的时间，单位秒
    */
    @SerializedName("QueryBeforeSeconds")
    @Expose
    private Long QueryBeforeSeconds;

    /**
    * 分页参数
    */
    @SerializedName("PageParams")
    @Expose
    private PageByNoParams PageParams;

    /**
    * 当监控类型为 MT_QCE 时候需要填写，归属的命名空间
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 当监控类型为 MT_QCE 时候需要填写， 告警策略类型
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * 查询某个策略的通知历史
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

    /**
     * Get 监控类型 
     * @return MonitorType 监控类型
     */
    public String getMonitorType() {
        return this.MonitorType;
    }

    /**
     * Set 监控类型
     * @param MonitorType 监控类型
     */
    public void setMonitorType(String MonitorType) {
        this.MonitorType = MonitorType;
    }

    /**
     * Get 起始时间点，unix秒级时间戳 
     * @return QueryBaseTime 起始时间点，unix秒级时间戳
     */
    public Long getQueryBaseTime() {
        return this.QueryBaseTime;
    }

    /**
     * Set 起始时间点，unix秒级时间戳
     * @param QueryBaseTime 起始时间点，unix秒级时间戳
     */
    public void setQueryBaseTime(Long QueryBaseTime) {
        this.QueryBaseTime = QueryBaseTime;
    }

    /**
     * Get 从 QueryBaseTime 开始，需要查询往前多久的时间，单位秒 
     * @return QueryBeforeSeconds 从 QueryBaseTime 开始，需要查询往前多久的时间，单位秒
     */
    public Long getQueryBeforeSeconds() {
        return this.QueryBeforeSeconds;
    }

    /**
     * Set 从 QueryBaseTime 开始，需要查询往前多久的时间，单位秒
     * @param QueryBeforeSeconds 从 QueryBaseTime 开始，需要查询往前多久的时间，单位秒
     */
    public void setQueryBeforeSeconds(Long QueryBeforeSeconds) {
        this.QueryBeforeSeconds = QueryBeforeSeconds;
    }

    /**
     * Get 分页参数 
     * @return PageParams 分页参数
     */
    public PageByNoParams getPageParams() {
        return this.PageParams;
    }

    /**
     * Set 分页参数
     * @param PageParams 分页参数
     */
    public void setPageParams(PageByNoParams PageParams) {
        this.PageParams = PageParams;
    }

    /**
     * Get 当监控类型为 MT_QCE 时候需要填写，归属的命名空间 
     * @return Namespace 当监控类型为 MT_QCE 时候需要填写，归属的命名空间
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 当监控类型为 MT_QCE 时候需要填写，归属的命名空间
     * @param Namespace 当监控类型为 MT_QCE 时候需要填写，归属的命名空间
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 当监控类型为 MT_QCE 时候需要填写， 告警策略类型 
     * @return ModelName 当监控类型为 MT_QCE 时候需要填写， 告警策略类型
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set 当监控类型为 MT_QCE 时候需要填写， 告警策略类型
     * @param ModelName 当监控类型为 MT_QCE 时候需要填写， 告警策略类型
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get 查询某个策略的通知历史 
     * @return PolicyId 查询某个策略的通知历史
     */
    public String getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set 查询某个策略的通知历史
     * @param PolicyId 查询某个策略的通知历史
     */
    public void setPolicyId(String PolicyId) {
        this.PolicyId = PolicyId;
    }

    public DescribeAlarmNotifyHistoriesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAlarmNotifyHistoriesRequest(DescribeAlarmNotifyHistoriesRequest source) {
        if (source.MonitorType != null) {
            this.MonitorType = new String(source.MonitorType);
        }
        if (source.QueryBaseTime != null) {
            this.QueryBaseTime = new Long(source.QueryBaseTime);
        }
        if (source.QueryBeforeSeconds != null) {
            this.QueryBeforeSeconds = new Long(source.QueryBeforeSeconds);
        }
        if (source.PageParams != null) {
            this.PageParams = new PageByNoParams(source.PageParams);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.PolicyId != null) {
            this.PolicyId = new String(source.PolicyId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MonitorType", this.MonitorType);
        this.setParamSimple(map, prefix + "QueryBaseTime", this.QueryBaseTime);
        this.setParamSimple(map, prefix + "QueryBeforeSeconds", this.QueryBeforeSeconds);
        this.setParamObj(map, prefix + "PageParams.", this.PageParams);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);

    }
}

