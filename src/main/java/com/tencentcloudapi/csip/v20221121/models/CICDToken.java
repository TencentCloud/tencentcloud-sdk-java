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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CICDToken extends AbstractModel {

    /**
    * <p>ID</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>appid</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>CI/CD名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>用于接入的Token</p>
    */
    @SerializedName("Token")
    @Expose
    private String Token;

    /**
    * <p>扫描结果存储时长</p>
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * <p>已扫描文件</p>
    */
    @SerializedName("FileCnt")
    @Expose
    private Long FileCnt;

    /**
    * <p>最近扫描状态</p>
    */
    @SerializedName("LastScanStatus")
    @Expose
    private String LastScanStatus;

    /**
    * <p>最近扫描时间</p>
    */
    @SerializedName("LastScanTime")
    @Expose
    private String LastScanTime;

    /**
     * Get <p>ID</p> 
     * @return Id <p>ID</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>ID</p>
     * @param Id <p>ID</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>appid</p> 
     * @return AppId <p>appid</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>appid</p>
     * @param AppId <p>appid</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>CI/CD名称</p> 
     * @return Name <p>CI/CD名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>CI/CD名称</p>
     * @param Name <p>CI/CD名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>用于接入的Token</p> 
     * @return Token <p>用于接入的Token</p>
     */
    public String getToken() {
        return this.Token;
    }

    /**
     * Set <p>用于接入的Token</p>
     * @param Token <p>用于接入的Token</p>
     */
    public void setToken(String Token) {
        this.Token = Token;
    }

    /**
     * Get <p>扫描结果存储时长</p> 
     * @return Period <p>扫描结果存储时长</p>
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set <p>扫描结果存储时长</p>
     * @param Period <p>扫描结果存储时长</p>
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get <p>已扫描文件</p> 
     * @return FileCnt <p>已扫描文件</p>
     */
    public Long getFileCnt() {
        return this.FileCnt;
    }

    /**
     * Set <p>已扫描文件</p>
     * @param FileCnt <p>已扫描文件</p>
     */
    public void setFileCnt(Long FileCnt) {
        this.FileCnt = FileCnt;
    }

    /**
     * Get <p>最近扫描状态</p> 
     * @return LastScanStatus <p>最近扫描状态</p>
     */
    public String getLastScanStatus() {
        return this.LastScanStatus;
    }

    /**
     * Set <p>最近扫描状态</p>
     * @param LastScanStatus <p>最近扫描状态</p>
     */
    public void setLastScanStatus(String LastScanStatus) {
        this.LastScanStatus = LastScanStatus;
    }

    /**
     * Get <p>最近扫描时间</p> 
     * @return LastScanTime <p>最近扫描时间</p>
     */
    public String getLastScanTime() {
        return this.LastScanTime;
    }

    /**
     * Set <p>最近扫描时间</p>
     * @param LastScanTime <p>最近扫描时间</p>
     */
    public void setLastScanTime(String LastScanTime) {
        this.LastScanTime = LastScanTime;
    }

    public CICDToken() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CICDToken(CICDToken source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Token != null) {
            this.Token = new String(source.Token);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.FileCnt != null) {
            this.FileCnt = new Long(source.FileCnt);
        }
        if (source.LastScanStatus != null) {
            this.LastScanStatus = new String(source.LastScanStatus);
        }
        if (source.LastScanTime != null) {
            this.LastScanTime = new String(source.LastScanTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Token", this.Token);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "FileCnt", this.FileCnt);
        this.setParamSimple(map, prefix + "LastScanStatus", this.LastScanStatus);
        this.setParamSimple(map, prefix + "LastScanTime", this.LastScanTime);

    }
}

