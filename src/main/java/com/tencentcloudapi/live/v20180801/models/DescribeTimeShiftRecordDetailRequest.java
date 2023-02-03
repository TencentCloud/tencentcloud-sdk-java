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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTimeShiftRecordDetailRequest extends AbstractModel{

    /**
    * 推流域名。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 推流路径。
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * 流名称。
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

    /**
    * 查询范围起始时间，Unix 时间戳。
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 查询范围终止时间，Unix 时间戳。 
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 推流域名所属组，没有域名组或者域名组为空字符串可不填。
    */
    @SerializedName("DomainGroup")
    @Expose
    private String DomainGroup;

    /**
    * 转码模板ID，转码模板ID为0可不填。
    */
    @SerializedName("TransCodeId")
    @Expose
    private Long TransCodeId;

    /**
     * Get 推流域名。 
     * @return Domain 推流域名。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 推流域名。
     * @param Domain 推流域名。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 推流路径。 
     * @return AppName 推流路径。
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set 推流路径。
     * @param AppName 推流路径。
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get 流名称。 
     * @return StreamName 流名称。
     */
    public String getStreamName() {
        return this.StreamName;
    }

    /**
     * Set 流名称。
     * @param StreamName 流名称。
     */
    public void setStreamName(String StreamName) {
        this.StreamName = StreamName;
    }

    /**
     * Get 查询范围起始时间，Unix 时间戳。 
     * @return StartTime 查询范围起始时间，Unix 时间戳。
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 查询范围起始时间，Unix 时间戳。
     * @param StartTime 查询范围起始时间，Unix 时间戳。
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 查询范围终止时间，Unix 时间戳。  
     * @return EndTime 查询范围终止时间，Unix 时间戳。 
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 查询范围终止时间，Unix 时间戳。 
     * @param EndTime 查询范围终止时间，Unix 时间戳。 
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 推流域名所属组，没有域名组或者域名组为空字符串可不填。 
     * @return DomainGroup 推流域名所属组，没有域名组或者域名组为空字符串可不填。
     */
    public String getDomainGroup() {
        return this.DomainGroup;
    }

    /**
     * Set 推流域名所属组，没有域名组或者域名组为空字符串可不填。
     * @param DomainGroup 推流域名所属组，没有域名组或者域名组为空字符串可不填。
     */
    public void setDomainGroup(String DomainGroup) {
        this.DomainGroup = DomainGroup;
    }

    /**
     * Get 转码模板ID，转码模板ID为0可不填。 
     * @return TransCodeId 转码模板ID，转码模板ID为0可不填。
     */
    public Long getTransCodeId() {
        return this.TransCodeId;
    }

    /**
     * Set 转码模板ID，转码模板ID为0可不填。
     * @param TransCodeId 转码模板ID，转码模板ID为0可不填。
     */
    public void setTransCodeId(Long TransCodeId) {
        this.TransCodeId = TransCodeId;
    }

    public DescribeTimeShiftRecordDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTimeShiftRecordDetailRequest(DescribeTimeShiftRecordDetailRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.StreamName != null) {
            this.StreamName = new String(source.StreamName);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.DomainGroup != null) {
            this.DomainGroup = new String(source.DomainGroup);
        }
        if (source.TransCodeId != null) {
            this.TransCodeId = new Long(source.TransCodeId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "StreamName", this.StreamName);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "DomainGroup", this.DomainGroup);
        this.setParamSimple(map, prefix + "TransCodeId", this.TransCodeId);

    }
}

