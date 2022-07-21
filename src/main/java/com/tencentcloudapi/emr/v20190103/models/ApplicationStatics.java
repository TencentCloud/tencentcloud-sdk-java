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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApplicationStatics extends AbstractModel{

    /**
    * 队列名
    */
    @SerializedName("Queue")
    @Expose
    private String Queue;

    /**
    * 用户名
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * 作业类型
    */
    @SerializedName("ApplicationType")
    @Expose
    private String ApplicationType;

    /**
    * SumMemorySeconds含义
    */
    @SerializedName("SumMemorySeconds")
    @Expose
    private Long SumMemorySeconds;

    /**
    * SumVCoreSeconds含义
    */
    @SerializedName("SumVCoreSeconds")
    @Expose
    private Long SumVCoreSeconds;

    /**
    * SumHDFSBytesWritten（带单位）
    */
    @SerializedName("SumHDFSBytesWritten")
    @Expose
    private String SumHDFSBytesWritten;

    /**
    * SumHDFSBytesRead（待单位）
    */
    @SerializedName("SumHDFSBytesRead")
    @Expose
    private String SumHDFSBytesRead;

    /**
    * 作业数
    */
    @SerializedName("CountApps")
    @Expose
    private Long CountApps;

    /**
     * Get 队列名 
     * @return Queue 队列名
     */
    public String getQueue() {
        return this.Queue;
    }

    /**
     * Set 队列名
     * @param Queue 队列名
     */
    public void setQueue(String Queue) {
        this.Queue = Queue;
    }

    /**
     * Get 用户名 
     * @return User 用户名
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set 用户名
     * @param User 用户名
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get 作业类型 
     * @return ApplicationType 作业类型
     */
    public String getApplicationType() {
        return this.ApplicationType;
    }

    /**
     * Set 作业类型
     * @param ApplicationType 作业类型
     */
    public void setApplicationType(String ApplicationType) {
        this.ApplicationType = ApplicationType;
    }

    /**
     * Get SumMemorySeconds含义 
     * @return SumMemorySeconds SumMemorySeconds含义
     */
    public Long getSumMemorySeconds() {
        return this.SumMemorySeconds;
    }

    /**
     * Set SumMemorySeconds含义
     * @param SumMemorySeconds SumMemorySeconds含义
     */
    public void setSumMemorySeconds(Long SumMemorySeconds) {
        this.SumMemorySeconds = SumMemorySeconds;
    }

    /**
     * Get SumVCoreSeconds含义 
     * @return SumVCoreSeconds SumVCoreSeconds含义
     */
    public Long getSumVCoreSeconds() {
        return this.SumVCoreSeconds;
    }

    /**
     * Set SumVCoreSeconds含义
     * @param SumVCoreSeconds SumVCoreSeconds含义
     */
    public void setSumVCoreSeconds(Long SumVCoreSeconds) {
        this.SumVCoreSeconds = SumVCoreSeconds;
    }

    /**
     * Get SumHDFSBytesWritten（带单位） 
     * @return SumHDFSBytesWritten SumHDFSBytesWritten（带单位）
     */
    public String getSumHDFSBytesWritten() {
        return this.SumHDFSBytesWritten;
    }

    /**
     * Set SumHDFSBytesWritten（带单位）
     * @param SumHDFSBytesWritten SumHDFSBytesWritten（带单位）
     */
    public void setSumHDFSBytesWritten(String SumHDFSBytesWritten) {
        this.SumHDFSBytesWritten = SumHDFSBytesWritten;
    }

    /**
     * Get SumHDFSBytesRead（待单位） 
     * @return SumHDFSBytesRead SumHDFSBytesRead（待单位）
     */
    public String getSumHDFSBytesRead() {
        return this.SumHDFSBytesRead;
    }

    /**
     * Set SumHDFSBytesRead（待单位）
     * @param SumHDFSBytesRead SumHDFSBytesRead（待单位）
     */
    public void setSumHDFSBytesRead(String SumHDFSBytesRead) {
        this.SumHDFSBytesRead = SumHDFSBytesRead;
    }

    /**
     * Get 作业数 
     * @return CountApps 作业数
     */
    public Long getCountApps() {
        return this.CountApps;
    }

    /**
     * Set 作业数
     * @param CountApps 作业数
     */
    public void setCountApps(Long CountApps) {
        this.CountApps = CountApps;
    }

    public ApplicationStatics() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplicationStatics(ApplicationStatics source) {
        if (source.Queue != null) {
            this.Queue = new String(source.Queue);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.ApplicationType != null) {
            this.ApplicationType = new String(source.ApplicationType);
        }
        if (source.SumMemorySeconds != null) {
            this.SumMemorySeconds = new Long(source.SumMemorySeconds);
        }
        if (source.SumVCoreSeconds != null) {
            this.SumVCoreSeconds = new Long(source.SumVCoreSeconds);
        }
        if (source.SumHDFSBytesWritten != null) {
            this.SumHDFSBytesWritten = new String(source.SumHDFSBytesWritten);
        }
        if (source.SumHDFSBytesRead != null) {
            this.SumHDFSBytesRead = new String(source.SumHDFSBytesRead);
        }
        if (source.CountApps != null) {
            this.CountApps = new Long(source.CountApps);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Queue", this.Queue);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "ApplicationType", this.ApplicationType);
        this.setParamSimple(map, prefix + "SumMemorySeconds", this.SumMemorySeconds);
        this.setParamSimple(map, prefix + "SumVCoreSeconds", this.SumVCoreSeconds);
        this.setParamSimple(map, prefix + "SumHDFSBytesWritten", this.SumHDFSBytesWritten);
        this.setParamSimple(map, prefix + "SumHDFSBytesRead", this.SumHDFSBytesRead);
        this.setParamSimple(map, prefix + "CountApps", this.CountApps);

    }
}

