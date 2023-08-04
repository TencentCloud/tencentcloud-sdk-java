/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SwitchDBInstancePrimaryRequest extends AbstractModel{

    /**
    * 实例ID
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * 是否强制切换。强制切换时只要备节点可访问，无论主备延迟多大都会发起切换。只有SwitchTag为0时，才可使用立即切换。
<li>默认：false
    */
    @SerializedName("Force")
    @Expose
    private Boolean Force;

    /**
    * 指定实例配置完成变更后的切换时间。
<li>0：立即切换 
<li>1：指定时间切换
<li>2：维护时间窗口内切换
<li>默认值：0 
    */
    @SerializedName("SwitchTag")
    @Expose
    private Long SwitchTag;

    /**
    * 切换开始时间，时间格式：HH:MM:SS，例如：01:00:00。当SwitchTag为0或2时，该参数失效。
    */
    @SerializedName("SwitchStartTime")
    @Expose
    private String SwitchStartTime;

    /**
    * 切换截止时间，时间格式：HH:MM:SS，例如：01:30:00。当SwitchTag为0或2时，该参数失效。SwitchStartTime和SwitchEndTime时间窗口不能小于30分钟。
    */
    @SerializedName("SwitchEndTime")
    @Expose
    private String SwitchEndTime;

    /**
     * Get 实例ID 
     * @return DBInstanceId 实例ID
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set 实例ID
     * @param DBInstanceId 实例ID
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get 是否强制切换。强制切换时只要备节点可访问，无论主备延迟多大都会发起切换。只有SwitchTag为0时，才可使用立即切换。
<li>默认：false 
     * @return Force 是否强制切换。强制切换时只要备节点可访问，无论主备延迟多大都会发起切换。只有SwitchTag为0时，才可使用立即切换。
<li>默认：false
     */
    public Boolean getForce() {
        return this.Force;
    }

    /**
     * Set 是否强制切换。强制切换时只要备节点可访问，无论主备延迟多大都会发起切换。只有SwitchTag为0时，才可使用立即切换。
<li>默认：false
     * @param Force 是否强制切换。强制切换时只要备节点可访问，无论主备延迟多大都会发起切换。只有SwitchTag为0时，才可使用立即切换。
<li>默认：false
     */
    public void setForce(Boolean Force) {
        this.Force = Force;
    }

    /**
     * Get 指定实例配置完成变更后的切换时间。
<li>0：立即切换 
<li>1：指定时间切换
<li>2：维护时间窗口内切换
<li>默认值：0  
     * @return SwitchTag 指定实例配置完成变更后的切换时间。
<li>0：立即切换 
<li>1：指定时间切换
<li>2：维护时间窗口内切换
<li>默认值：0 
     */
    public Long getSwitchTag() {
        return this.SwitchTag;
    }

    /**
     * Set 指定实例配置完成变更后的切换时间。
<li>0：立即切换 
<li>1：指定时间切换
<li>2：维护时间窗口内切换
<li>默认值：0 
     * @param SwitchTag 指定实例配置完成变更后的切换时间。
<li>0：立即切换 
<li>1：指定时间切换
<li>2：维护时间窗口内切换
<li>默认值：0 
     */
    public void setSwitchTag(Long SwitchTag) {
        this.SwitchTag = SwitchTag;
    }

    /**
     * Get 切换开始时间，时间格式：HH:MM:SS，例如：01:00:00。当SwitchTag为0或2时，该参数失效。 
     * @return SwitchStartTime 切换开始时间，时间格式：HH:MM:SS，例如：01:00:00。当SwitchTag为0或2时，该参数失效。
     */
    public String getSwitchStartTime() {
        return this.SwitchStartTime;
    }

    /**
     * Set 切换开始时间，时间格式：HH:MM:SS，例如：01:00:00。当SwitchTag为0或2时，该参数失效。
     * @param SwitchStartTime 切换开始时间，时间格式：HH:MM:SS，例如：01:00:00。当SwitchTag为0或2时，该参数失效。
     */
    public void setSwitchStartTime(String SwitchStartTime) {
        this.SwitchStartTime = SwitchStartTime;
    }

    /**
     * Get 切换截止时间，时间格式：HH:MM:SS，例如：01:30:00。当SwitchTag为0或2时，该参数失效。SwitchStartTime和SwitchEndTime时间窗口不能小于30分钟。 
     * @return SwitchEndTime 切换截止时间，时间格式：HH:MM:SS，例如：01:30:00。当SwitchTag为0或2时，该参数失效。SwitchStartTime和SwitchEndTime时间窗口不能小于30分钟。
     */
    public String getSwitchEndTime() {
        return this.SwitchEndTime;
    }

    /**
     * Set 切换截止时间，时间格式：HH:MM:SS，例如：01:30:00。当SwitchTag为0或2时，该参数失效。SwitchStartTime和SwitchEndTime时间窗口不能小于30分钟。
     * @param SwitchEndTime 切换截止时间，时间格式：HH:MM:SS，例如：01:30:00。当SwitchTag为0或2时，该参数失效。SwitchStartTime和SwitchEndTime时间窗口不能小于30分钟。
     */
    public void setSwitchEndTime(String SwitchEndTime) {
        this.SwitchEndTime = SwitchEndTime;
    }

    public SwitchDBInstancePrimaryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SwitchDBInstancePrimaryRequest(SwitchDBInstancePrimaryRequest source) {
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.Force != null) {
            this.Force = new Boolean(source.Force);
        }
        if (source.SwitchTag != null) {
            this.SwitchTag = new Long(source.SwitchTag);
        }
        if (source.SwitchStartTime != null) {
            this.SwitchStartTime = new String(source.SwitchStartTime);
        }
        if (source.SwitchEndTime != null) {
            this.SwitchEndTime = new String(source.SwitchEndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "Force", this.Force);
        this.setParamSimple(map, prefix + "SwitchTag", this.SwitchTag);
        this.setParamSimple(map, prefix + "SwitchStartTime", this.SwitchStartTime);
        this.setParamSimple(map, prefix + "SwitchEndTime", this.SwitchEndTime);

    }
}

