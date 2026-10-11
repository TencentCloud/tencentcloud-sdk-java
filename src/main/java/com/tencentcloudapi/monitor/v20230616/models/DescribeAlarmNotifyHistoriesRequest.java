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
    * <p>监控类型</p>
    */
    @SerializedName("MonitorType")
    @Expose
    private String MonitorType;

    /**
    * <p>起始时间点，unix秒级时间戳</p>
    */
    @SerializedName("QueryBaseTime")
    @Expose
    private Long QueryBaseTime;

    /**
    * <p>从 QueryBaseTime 开始，需要查询往前多久的时间，单位秒</p>
    */
    @SerializedName("QueryBeforeSeconds")
    @Expose
    private Long QueryBeforeSeconds;

    /**
    * <p>分页参数</p>
    */
    @SerializedName("PageParams")
    @Expose
    private PageByNoParams PageParams;

    /**
    * <p>当监控类型为 MT_QCE 时候需要填写，归属的命名空间</p>
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * <p>当监控类型为 MT_QCE 时候需要填写， 告警策略类型</p>
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * <p>查询某个策略的通知历史</p>
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

    /**
    * <p>详情页展示所需id</p>
    */
    @SerializedName("NotifyId")
    @Expose
    private String NotifyId;

    /**
     * Get <p>监控类型</p> 
     * @return MonitorType <p>监控类型</p>
     */
    public String getMonitorType() {
        return this.MonitorType;
    }

    /**
     * Set <p>监控类型</p>
     * @param MonitorType <p>监控类型</p>
     */
    public void setMonitorType(String MonitorType) {
        this.MonitorType = MonitorType;
    }

    /**
     * Get <p>起始时间点，unix秒级时间戳</p> 
     * @return QueryBaseTime <p>起始时间点，unix秒级时间戳</p>
     */
    public Long getQueryBaseTime() {
        return this.QueryBaseTime;
    }

    /**
     * Set <p>起始时间点，unix秒级时间戳</p>
     * @param QueryBaseTime <p>起始时间点，unix秒级时间戳</p>
     */
    public void setQueryBaseTime(Long QueryBaseTime) {
        this.QueryBaseTime = QueryBaseTime;
    }

    /**
     * Get <p>从 QueryBaseTime 开始，需要查询往前多久的时间，单位秒</p> 
     * @return QueryBeforeSeconds <p>从 QueryBaseTime 开始，需要查询往前多久的时间，单位秒</p>
     */
    public Long getQueryBeforeSeconds() {
        return this.QueryBeforeSeconds;
    }

    /**
     * Set <p>从 QueryBaseTime 开始，需要查询往前多久的时间，单位秒</p>
     * @param QueryBeforeSeconds <p>从 QueryBaseTime 开始，需要查询往前多久的时间，单位秒</p>
     */
    public void setQueryBeforeSeconds(Long QueryBeforeSeconds) {
        this.QueryBeforeSeconds = QueryBeforeSeconds;
    }

    /**
     * Get <p>分页参数</p> 
     * @return PageParams <p>分页参数</p>
     */
    public PageByNoParams getPageParams() {
        return this.PageParams;
    }

    /**
     * Set <p>分页参数</p>
     * @param PageParams <p>分页参数</p>
     */
    public void setPageParams(PageByNoParams PageParams) {
        this.PageParams = PageParams;
    }

    /**
     * Get <p>当监控类型为 MT_QCE 时候需要填写，归属的命名空间</p> 
     * @return Namespace <p>当监控类型为 MT_QCE 时候需要填写，归属的命名空间</p>
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set <p>当监控类型为 MT_QCE 时候需要填写，归属的命名空间</p>
     * @param Namespace <p>当监控类型为 MT_QCE 时候需要填写，归属的命名空间</p>
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get <p>当监控类型为 MT_QCE 时候需要填写， 告警策略类型</p> 
     * @return ModelName <p>当监控类型为 MT_QCE 时候需要填写， 告警策略类型</p>
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set <p>当监控类型为 MT_QCE 时候需要填写， 告警策略类型</p>
     * @param ModelName <p>当监控类型为 MT_QCE 时候需要填写， 告警策略类型</p>
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get <p>查询某个策略的通知历史</p> 
     * @return PolicyId <p>查询某个策略的通知历史</p>
     */
    public String getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set <p>查询某个策略的通知历史</p>
     * @param PolicyId <p>查询某个策略的通知历史</p>
     */
    public void setPolicyId(String PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get <p>详情页展示所需id</p> 
     * @return NotifyId <p>详情页展示所需id</p>
     */
    public String getNotifyId() {
        return this.NotifyId;
    }

    /**
     * Set <p>详情页展示所需id</p>
     * @param NotifyId <p>详情页展示所需id</p>
     */
    public void setNotifyId(String NotifyId) {
        this.NotifyId = NotifyId;
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
        if (source.NotifyId != null) {
            this.NotifyId = new String(source.NotifyId);
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
        this.setParamSimple(map, prefix + "NotifyId", this.NotifyId);

    }
}

