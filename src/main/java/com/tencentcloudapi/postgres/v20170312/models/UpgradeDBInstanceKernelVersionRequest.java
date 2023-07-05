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

public class UpgradeDBInstanceKernelVersionRequest extends AbstractModel{

    /**
    * 实例ID。
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * 升级的目标内核版本号。可以通过接口[DescribeDBVersions](https://cloud.tencent.com/document/api/409/89018)的返回字段AvailableUpgradeTarget获取。

    */
    @SerializedName("TargetDBKernelVersion")
    @Expose
    private String TargetDBKernelVersion;

    /**
    * 指定实例升级内核版本号完成后的切换时间。可选值:
<li>0：立即切换
<li>1：指定时间切换
<li>2：维护时间窗口内切换
默认值：0 
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
    * 是否对本次升级实例内核版本号操作执行预检查。
<li>true：执行预检查操作，不升级内核版本号。检查项目包含请求参数、内核版本号兼容性、实例参数等。
<li>false：发送正常请求（默认值），通过检查后直接升级内核版本号。
默认值：false
    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

    /**
     * Get 实例ID。 
     * @return DBInstanceId 实例ID。
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set 实例ID。
     * @param DBInstanceId 实例ID。
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get 升级的目标内核版本号。可以通过接口[DescribeDBVersions](https://cloud.tencent.com/document/api/409/89018)的返回字段AvailableUpgradeTarget获取。
 
     * @return TargetDBKernelVersion 升级的目标内核版本号。可以通过接口[DescribeDBVersions](https://cloud.tencent.com/document/api/409/89018)的返回字段AvailableUpgradeTarget获取。

     */
    public String getTargetDBKernelVersion() {
        return this.TargetDBKernelVersion;
    }

    /**
     * Set 升级的目标内核版本号。可以通过接口[DescribeDBVersions](https://cloud.tencent.com/document/api/409/89018)的返回字段AvailableUpgradeTarget获取。

     * @param TargetDBKernelVersion 升级的目标内核版本号。可以通过接口[DescribeDBVersions](https://cloud.tencent.com/document/api/409/89018)的返回字段AvailableUpgradeTarget获取。

     */
    public void setTargetDBKernelVersion(String TargetDBKernelVersion) {
        this.TargetDBKernelVersion = TargetDBKernelVersion;
    }

    /**
     * Get 指定实例升级内核版本号完成后的切换时间。可选值:
<li>0：立即切换
<li>1：指定时间切换
<li>2：维护时间窗口内切换
默认值：0  
     * @return SwitchTag 指定实例升级内核版本号完成后的切换时间。可选值:
<li>0：立即切换
<li>1：指定时间切换
<li>2：维护时间窗口内切换
默认值：0 
     */
    public Long getSwitchTag() {
        return this.SwitchTag;
    }

    /**
     * Set 指定实例升级内核版本号完成后的切换时间。可选值:
<li>0：立即切换
<li>1：指定时间切换
<li>2：维护时间窗口内切换
默认值：0 
     * @param SwitchTag 指定实例升级内核版本号完成后的切换时间。可选值:
<li>0：立即切换
<li>1：指定时间切换
<li>2：维护时间窗口内切换
默认值：0 
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

    /**
     * Get 是否对本次升级实例内核版本号操作执行预检查。
<li>true：执行预检查操作，不升级内核版本号。检查项目包含请求参数、内核版本号兼容性、实例参数等。
<li>false：发送正常请求（默认值），通过检查后直接升级内核版本号。
默认值：false 
     * @return DryRun 是否对本次升级实例内核版本号操作执行预检查。
<li>true：执行预检查操作，不升级内核版本号。检查项目包含请求参数、内核版本号兼容性、实例参数等。
<li>false：发送正常请求（默认值），通过检查后直接升级内核版本号。
默认值：false
     */
    public Boolean getDryRun() {
        return this.DryRun;
    }

    /**
     * Set 是否对本次升级实例内核版本号操作执行预检查。
<li>true：执行预检查操作，不升级内核版本号。检查项目包含请求参数、内核版本号兼容性、实例参数等。
<li>false：发送正常请求（默认值），通过检查后直接升级内核版本号。
默认值：false
     * @param DryRun 是否对本次升级实例内核版本号操作执行预检查。
<li>true：执行预检查操作，不升级内核版本号。检查项目包含请求参数、内核版本号兼容性、实例参数等。
<li>false：发送正常请求（默认值），通过检查后直接升级内核版本号。
默认值：false
     */
    public void setDryRun(Boolean DryRun) {
        this.DryRun = DryRun;
    }

    public UpgradeDBInstanceKernelVersionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpgradeDBInstanceKernelVersionRequest(UpgradeDBInstanceKernelVersionRequest source) {
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.TargetDBKernelVersion != null) {
            this.TargetDBKernelVersion = new String(source.TargetDBKernelVersion);
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
        if (source.DryRun != null) {
            this.DryRun = new Boolean(source.DryRun);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "TargetDBKernelVersion", this.TargetDBKernelVersion);
        this.setParamSimple(map, prefix + "SwitchTag", this.SwitchTag);
        this.setParamSimple(map, prefix + "SwitchStartTime", this.SwitchStartTime);
        this.setParamSimple(map, prefix + "SwitchEndTime", this.SwitchEndTime);
        this.setParamSimple(map, prefix + "DryRun", this.DryRun);

    }
}

