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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DiskHealthIssue extends AbstractModel {

    /**
    * <p>磁盘id</p>
    */
    @SerializedName("DiskId")
    @Expose
    private String DiskId;

    /**
    * <p>挂载的目录</p>
    */
    @SerializedName("MountDir")
    @Expose
    private String MountDir;

    /**
    * <p>设备路径</p>
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * <p>异常类型</p>
    */
    @SerializedName("CheckType")
    @Expose
    private Long CheckType;

    /**
    * <p>优先级</p>
    */
    @SerializedName("Severity")
    @Expose
    private Long Severity;

    /**
    * <p>状态</p>
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * <p>探测来源</p>
    */
    @SerializedName("DetectSource")
    @Expose
    private String DetectSource;

    /**
    * <p>第一次探测时间</p>
    */
    @SerializedName("FirstDetectTime")
    @Expose
    private String FirstDetectTime;

    /**
    * <p>最新探测时间</p>
    */
    @SerializedName("LastDetectTime")
    @Expose
    private String LastDetectTime;

    /**
    * <p>探测信息</p>
    */
    @SerializedName("DetectDetail")
    @Expose
    private String DetectDetail;

    /**
     * Get <p>磁盘id</p> 
     * @return DiskId <p>磁盘id</p>
     */
    public String getDiskId() {
        return this.DiskId;
    }

    /**
     * Set <p>磁盘id</p>
     * @param DiskId <p>磁盘id</p>
     */
    public void setDiskId(String DiskId) {
        this.DiskId = DiskId;
    }

    /**
     * Get <p>挂载的目录</p> 
     * @return MountDir <p>挂载的目录</p>
     */
    public String getMountDir() {
        return this.MountDir;
    }

    /**
     * Set <p>挂载的目录</p>
     * @param MountDir <p>挂载的目录</p>
     */
    public void setMountDir(String MountDir) {
        this.MountDir = MountDir;
    }

    /**
     * Get <p>设备路径</p> 
     * @return DeviceName <p>设备路径</p>
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set <p>设备路径</p>
     * @param DeviceName <p>设备路径</p>
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get <p>异常类型</p> 
     * @return CheckType <p>异常类型</p>
     */
    public Long getCheckType() {
        return this.CheckType;
    }

    /**
     * Set <p>异常类型</p>
     * @param CheckType <p>异常类型</p>
     */
    public void setCheckType(Long CheckType) {
        this.CheckType = CheckType;
    }

    /**
     * Get <p>优先级</p> 
     * @return Severity <p>优先级</p>
     */
    public Long getSeverity() {
        return this.Severity;
    }

    /**
     * Set <p>优先级</p>
     * @param Severity <p>优先级</p>
     */
    public void setSeverity(Long Severity) {
        this.Severity = Severity;
    }

    /**
     * Get <p>状态</p> 
     * @return State <p>状态</p>
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set <p>状态</p>
     * @param State <p>状态</p>
     */
    public void setState(Long State) {
        this.State = State;
    }

    /**
     * Get <p>探测来源</p> 
     * @return DetectSource <p>探测来源</p>
     */
    public String getDetectSource() {
        return this.DetectSource;
    }

    /**
     * Set <p>探测来源</p>
     * @param DetectSource <p>探测来源</p>
     */
    public void setDetectSource(String DetectSource) {
        this.DetectSource = DetectSource;
    }

    /**
     * Get <p>第一次探测时间</p> 
     * @return FirstDetectTime <p>第一次探测时间</p>
     */
    public String getFirstDetectTime() {
        return this.FirstDetectTime;
    }

    /**
     * Set <p>第一次探测时间</p>
     * @param FirstDetectTime <p>第一次探测时间</p>
     */
    public void setFirstDetectTime(String FirstDetectTime) {
        this.FirstDetectTime = FirstDetectTime;
    }

    /**
     * Get <p>最新探测时间</p> 
     * @return LastDetectTime <p>最新探测时间</p>
     */
    public String getLastDetectTime() {
        return this.LastDetectTime;
    }

    /**
     * Set <p>最新探测时间</p>
     * @param LastDetectTime <p>最新探测时间</p>
     */
    public void setLastDetectTime(String LastDetectTime) {
        this.LastDetectTime = LastDetectTime;
    }

    /**
     * Get <p>探测信息</p> 
     * @return DetectDetail <p>探测信息</p>
     */
    public String getDetectDetail() {
        return this.DetectDetail;
    }

    /**
     * Set <p>探测信息</p>
     * @param DetectDetail <p>探测信息</p>
     */
    public void setDetectDetail(String DetectDetail) {
        this.DetectDetail = DetectDetail;
    }

    public DiskHealthIssue() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DiskHealthIssue(DiskHealthIssue source) {
        if (source.DiskId != null) {
            this.DiskId = new String(source.DiskId);
        }
        if (source.MountDir != null) {
            this.MountDir = new String(source.MountDir);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.CheckType != null) {
            this.CheckType = new Long(source.CheckType);
        }
        if (source.Severity != null) {
            this.Severity = new Long(source.Severity);
        }
        if (source.State != null) {
            this.State = new Long(source.State);
        }
        if (source.DetectSource != null) {
            this.DetectSource = new String(source.DetectSource);
        }
        if (source.FirstDetectTime != null) {
            this.FirstDetectTime = new String(source.FirstDetectTime);
        }
        if (source.LastDetectTime != null) {
            this.LastDetectTime = new String(source.LastDetectTime);
        }
        if (source.DetectDetail != null) {
            this.DetectDetail = new String(source.DetectDetail);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiskId", this.DiskId);
        this.setParamSimple(map, prefix + "MountDir", this.MountDir);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "CheckType", this.CheckType);
        this.setParamSimple(map, prefix + "Severity", this.Severity);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "DetectSource", this.DetectSource);
        this.setParamSimple(map, prefix + "FirstDetectTime", this.FirstDetectTime);
        this.setParamSimple(map, prefix + "LastDetectTime", this.LastDetectTime);
        this.setParamSimple(map, prefix + "DetectDetail", this.DetectDetail);

    }
}

