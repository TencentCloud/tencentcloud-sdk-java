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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReplayInstanceAuditLogRequest extends AbstractModel {

    /**
    * 源集群id
    */
    @SerializedName("SourceClusterId")
    @Expose
    private String SourceClusterId;

    /**
    * 源实例id
    */
    @SerializedName("SourceInstanceId")
    @Expose
    private String SourceInstanceId;

    /**
    * 目标集群id
目标集群必须为原始集群三天内克隆出的集群。
    */
    @SerializedName("TargetClusterId")
    @Expose
    private String TargetClusterId;

    /**
    * 目标实例id
    */
    @SerializedName("TargetInstanceId")
    @Expose
    private String TargetInstanceId;

    /**
    * 用户名.需要host为%的用户名
    */
    @SerializedName("TargetUserName")
    @Expose
    private String TargetUserName;

    /**
    * 密码
    */
    @SerializedName("TargetPassword")
    @Expose
    private String TargetPassword;

    /**
    * 开始时间。时间格式为：yyyy-DD-mm hh:mm:ss
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间。时间格式为：yyyy-DD-mm hh:mm:ss
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get 源集群id 
     * @return SourceClusterId 源集群id
     */
    public String getSourceClusterId() {
        return this.SourceClusterId;
    }

    /**
     * Set 源集群id
     * @param SourceClusterId 源集群id
     */
    public void setSourceClusterId(String SourceClusterId) {
        this.SourceClusterId = SourceClusterId;
    }

    /**
     * Get 源实例id 
     * @return SourceInstanceId 源实例id
     */
    public String getSourceInstanceId() {
        return this.SourceInstanceId;
    }

    /**
     * Set 源实例id
     * @param SourceInstanceId 源实例id
     */
    public void setSourceInstanceId(String SourceInstanceId) {
        this.SourceInstanceId = SourceInstanceId;
    }

    /**
     * Get 目标集群id
目标集群必须为原始集群三天内克隆出的集群。 
     * @return TargetClusterId 目标集群id
目标集群必须为原始集群三天内克隆出的集群。
     */
    public String getTargetClusterId() {
        return this.TargetClusterId;
    }

    /**
     * Set 目标集群id
目标集群必须为原始集群三天内克隆出的集群。
     * @param TargetClusterId 目标集群id
目标集群必须为原始集群三天内克隆出的集群。
     */
    public void setTargetClusterId(String TargetClusterId) {
        this.TargetClusterId = TargetClusterId;
    }

    /**
     * Get 目标实例id 
     * @return TargetInstanceId 目标实例id
     */
    public String getTargetInstanceId() {
        return this.TargetInstanceId;
    }

    /**
     * Set 目标实例id
     * @param TargetInstanceId 目标实例id
     */
    public void setTargetInstanceId(String TargetInstanceId) {
        this.TargetInstanceId = TargetInstanceId;
    }

    /**
     * Get 用户名.需要host为%的用户名 
     * @return TargetUserName 用户名.需要host为%的用户名
     */
    public String getTargetUserName() {
        return this.TargetUserName;
    }

    /**
     * Set 用户名.需要host为%的用户名
     * @param TargetUserName 用户名.需要host为%的用户名
     */
    public void setTargetUserName(String TargetUserName) {
        this.TargetUserName = TargetUserName;
    }

    /**
     * Get 密码 
     * @return TargetPassword 密码
     */
    public String getTargetPassword() {
        return this.TargetPassword;
    }

    /**
     * Set 密码
     * @param TargetPassword 密码
     */
    public void setTargetPassword(String TargetPassword) {
        this.TargetPassword = TargetPassword;
    }

    /**
     * Get 开始时间。时间格式为：yyyy-DD-mm hh:mm:ss 
     * @return StartTime 开始时间。时间格式为：yyyy-DD-mm hh:mm:ss
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间。时间格式为：yyyy-DD-mm hh:mm:ss
     * @param StartTime 开始时间。时间格式为：yyyy-DD-mm hh:mm:ss
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间。时间格式为：yyyy-DD-mm hh:mm:ss 
     * @return EndTime 结束时间。时间格式为：yyyy-DD-mm hh:mm:ss
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间。时间格式为：yyyy-DD-mm hh:mm:ss
     * @param EndTime 结束时间。时间格式为：yyyy-DD-mm hh:mm:ss
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public ReplayInstanceAuditLogRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReplayInstanceAuditLogRequest(ReplayInstanceAuditLogRequest source) {
        if (source.SourceClusterId != null) {
            this.SourceClusterId = new String(source.SourceClusterId);
        }
        if (source.SourceInstanceId != null) {
            this.SourceInstanceId = new String(source.SourceInstanceId);
        }
        if (source.TargetClusterId != null) {
            this.TargetClusterId = new String(source.TargetClusterId);
        }
        if (source.TargetInstanceId != null) {
            this.TargetInstanceId = new String(source.TargetInstanceId);
        }
        if (source.TargetUserName != null) {
            this.TargetUserName = new String(source.TargetUserName);
        }
        if (source.TargetPassword != null) {
            this.TargetPassword = new String(source.TargetPassword);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceClusterId", this.SourceClusterId);
        this.setParamSimple(map, prefix + "SourceInstanceId", this.SourceInstanceId);
        this.setParamSimple(map, prefix + "TargetClusterId", this.TargetClusterId);
        this.setParamSimple(map, prefix + "TargetInstanceId", this.TargetInstanceId);
        this.setParamSimple(map, prefix + "TargetUserName", this.TargetUserName);
        this.setParamSimple(map, prefix + "TargetPassword", this.TargetPassword);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

